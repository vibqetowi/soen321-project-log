package com.google.android.exoplayer2.extractor.mp4;

import android.util.Pair;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.Ac3Util;
import com.google.android.exoplayer2.audio.Ac4Util;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.ExtractorUtil;
import com.google.android.exoplayer2.extractor.GaplessInfoHolder;
import com.google.android.exoplayer2.extractor.mp4.Atom;
import com.google.android.exoplayer2.extractor.mp4.FixedSampleSizeRechunker;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.CodecSpecificDataUtil;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.AvcConfig;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.android.exoplayer2.video.DolbyVisionConfig;
import com.google.android.exoplayer2.video.HevcConfig;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import com.ifriend.internal_notifications.notification.HandlingStrategy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class AtomParsers {
    private static final int MAX_GAPLESS_TRIM_SIZE_SAMPLES = 4;
    private static final String TAG = "AtomParsers";
    private static final int TYPE_clcp = 1668047728;
    private static final int TYPE_mdta = 1835299937;
    private static final int TYPE_meta = 1835365473;
    private static final int TYPE_nclc = 1852009571;
    private static final int TYPE_nclx = 1852009592;
    private static final int TYPE_sbtl = 1935832172;
    private static final int TYPE_soun = 1936684398;
    private static final int TYPE_subt = 1937072756;
    private static final int TYPE_text = 1952807028;
    private static final int TYPE_vide = 1986618469;
    private static final byte[] opusMagic = Util.getUtf8Bytes("OpusHead");

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public interface SampleSizeBox {
        int getFixedSampleSize();

        int getSampleCount();

        int readNextSampleSize();
    }

    private static int getTrackTypeForHdlr(int i) {
        if (i == TYPE_soun) {
            return 1;
        }
        if (i == TYPE_vide) {
            return 2;
        }
        if (i == TYPE_text || i == TYPE_sbtl || i == TYPE_subt || i == TYPE_clcp) {
            return 3;
        }
        return i == 1835365473 ? 5 : -1;
    }

    public static List<TrackSampleTable> parseTraks(Atom.ContainerAtom containerAtom, GaplessInfoHolder gaplessInfoHolder, long j, DrmInitData drmInitData, boolean z, boolean z2, Function<Track, Track> function) throws ParserException {
        Track apply;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < containerAtom.containerChildren.size(); i++) {
            Atom.ContainerAtom containerAtom2 = containerAtom.containerChildren.get(i);
            if (containerAtom2.type == 1953653099 && (apply = function.apply(parseTrak(containerAtom2, (Atom.LeafAtom) Assertions.checkNotNull(containerAtom.getLeafAtomOfType(Atom.TYPE_mvhd)), j, drmInitData, z, z2))) != null) {
                arrayList.add(parseStbl(apply, (Atom.ContainerAtom) Assertions.checkNotNull(((Atom.ContainerAtom) Assertions.checkNotNull(((Atom.ContainerAtom) Assertions.checkNotNull(containerAtom2.getContainerAtomOfType(Atom.TYPE_mdia))).getContainerAtomOfType(Atom.TYPE_minf))).getContainerAtomOfType(Atom.TYPE_stbl)), gaplessInfoHolder));
            }
        }
        return arrayList;
    }

    public static Pair<Metadata, Metadata> parseUdta(Atom.LeafAtom leafAtom) {
        ParsableByteArray parsableByteArray = leafAtom.data;
        parsableByteArray.setPosition(8);
        Metadata metadata = null;
        Metadata metadata2 = null;
        while (parsableByteArray.bytesLeft() >= 8) {
            int position = parsableByteArray.getPosition();
            int readInt = parsableByteArray.readInt();
            int readInt2 = parsableByteArray.readInt();
            if (readInt2 == 1835365473) {
                parsableByteArray.setPosition(position);
                metadata = parseUdtaMeta(parsableByteArray, position + readInt);
            } else if (readInt2 == 1936553057) {
                parsableByteArray.setPosition(position);
                metadata2 = parseSmta(parsableByteArray, position + readInt);
            }
            parsableByteArray.setPosition(position + readInt);
        }
        return Pair.create(metadata, metadata2);
    }

    public static Metadata parseMdtaFromMeta(Atom.ContainerAtom containerAtom) {
        Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(Atom.TYPE_hdlr);
        Atom.LeafAtom leafAtomOfType2 = containerAtom.getLeafAtomOfType(Atom.TYPE_keys);
        Atom.LeafAtom leafAtomOfType3 = containerAtom.getLeafAtomOfType(Atom.TYPE_ilst);
        if (leafAtomOfType == null || leafAtomOfType2 == null || leafAtomOfType3 == null || parseHdlr(leafAtomOfType.data) != TYPE_mdta) {
            return null;
        }
        ParsableByteArray parsableByteArray = leafAtomOfType2.data;
        parsableByteArray.setPosition(12);
        int readInt = parsableByteArray.readInt();
        String[] strArr = new String[readInt];
        for (int i = 0; i < readInt; i++) {
            int readInt2 = parsableByteArray.readInt();
            parsableByteArray.skipBytes(4);
            strArr[i] = parsableByteArray.readString(readInt2 - 8);
        }
        ParsableByteArray parsableByteArray2 = leafAtomOfType3.data;
        parsableByteArray2.setPosition(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray2.bytesLeft() > 8) {
            int position = parsableByteArray2.getPosition();
            int readInt3 = parsableByteArray2.readInt();
            int readInt4 = parsableByteArray2.readInt() - 1;
            if (readInt4 >= 0 && readInt4 < readInt) {
                MdtaMetadataEntry parseMdtaMetadataEntryFromIlst = MetadataUtil.parseMdtaMetadataEntryFromIlst(parsableByteArray2, position + readInt3, strArr[readInt4]);
                if (parseMdtaMetadataEntryFromIlst != null) {
                    arrayList.add(parseMdtaMetadataEntryFromIlst);
                }
            } else {
                Log.w(TAG, "Skipped metadata with unknown key index: " + readInt4);
            }
            parsableByteArray2.setPosition(position + readInt3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static void maybeSkipRemainingMetaAtomHeaderBytes(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        parsableByteArray.skipBytes(4);
        if (parsableByteArray.readInt() != 1751411826) {
            position += 4;
        }
        parsableByteArray.setPosition(position);
    }

    private static Track parseTrak(Atom.ContainerAtom containerAtom, Atom.LeafAtom leafAtom, long j, DrmInitData drmInitData, boolean z, boolean z2) throws ParserException {
        Atom.LeafAtom leafAtom2;
        long j2;
        long[] jArr;
        long[] jArr2;
        Atom.ContainerAtom containerAtomOfType;
        Pair<long[], long[]> parseEdts;
        Atom.ContainerAtom containerAtom2 = (Atom.ContainerAtom) Assertions.checkNotNull(containerAtom.getContainerAtomOfType(Atom.TYPE_mdia));
        int trackTypeForHdlr = getTrackTypeForHdlr(parseHdlr(((Atom.LeafAtom) Assertions.checkNotNull(containerAtom2.getLeafAtomOfType(Atom.TYPE_hdlr))).data));
        if (trackTypeForHdlr == -1) {
            return null;
        }
        TkhdData parseTkhd = parseTkhd(((Atom.LeafAtom) Assertions.checkNotNull(containerAtom.getLeafAtomOfType(Atom.TYPE_tkhd))).data);
        long j3 = C.TIME_UNSET;
        if (j == C.TIME_UNSET) {
            leafAtom2 = leafAtom;
            j2 = parseTkhd.duration;
        } else {
            leafAtom2 = leafAtom;
            j2 = j;
        }
        long parseMvhd = parseMvhd(leafAtom2.data);
        if (j2 != C.TIME_UNSET) {
            j3 = Util.scaleLargeTimestamp(j2, 1000000L, parseMvhd);
        }
        long j4 = j3;
        Pair<Long, String> parseMdhd = parseMdhd(((Atom.LeafAtom) Assertions.checkNotNull(containerAtom2.getLeafAtomOfType(Atom.TYPE_mdhd))).data);
        StsdData parseStsd = parseStsd(((Atom.LeafAtom) Assertions.checkNotNull(((Atom.ContainerAtom) Assertions.checkNotNull(((Atom.ContainerAtom) Assertions.checkNotNull(containerAtom2.getContainerAtomOfType(Atom.TYPE_minf))).getContainerAtomOfType(Atom.TYPE_stbl))).getLeafAtomOfType(Atom.TYPE_stsd))).data, parseTkhd.id, parseTkhd.rotationDegrees, (String) parseMdhd.second, drmInitData, z2);
        if (z || (containerAtomOfType = containerAtom.getContainerAtomOfType(Atom.TYPE_edts)) == null || (parseEdts = parseEdts(containerAtomOfType)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            jArr2 = (long[]) parseEdts.second;
            jArr = (long[]) parseEdts.first;
        }
        if (parseStsd.format == null) {
            return null;
        }
        return new Track(parseTkhd.id, trackTypeForHdlr, ((Long) parseMdhd.first).longValue(), parseMvhd, j4, parseStsd.format, parseStsd.requiredSampleTransformation, parseStsd.trackEncryptionBoxes, parseStsd.nalUnitLengthFieldLength, jArr, jArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x046a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static TrackSampleTable parseStbl(Track track, Atom.ContainerAtom containerAtom, GaplessInfoHolder gaplessInfoHolder) throws ParserException {
        SampleSizeBox stz2SampleSizeBox;
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z2;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z3;
        int i9;
        Track track2;
        int i10;
        long[] jArr;
        int[] iArr;
        int i11;
        long j;
        long[] jArr2;
        int[] iArr2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        long[] jArr3;
        long[] jArr4;
        boolean z4;
        int i19;
        int i20;
        Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(Atom.TYPE_stsz);
        if (leafAtomOfType != null) {
            stz2SampleSizeBox = new StszSampleSizeBox(leafAtomOfType, track.format);
        } else {
            Atom.LeafAtom leafAtomOfType2 = containerAtom.getLeafAtomOfType(Atom.TYPE_stz2);
            if (leafAtomOfType2 == null) {
                throw ParserException.createForMalformedContainer("Track has no sample table size information", null);
            }
            stz2SampleSizeBox = new Stz2SampleSizeBox(leafAtomOfType2);
        }
        int sampleCount = stz2SampleSizeBox.getSampleCount();
        if (sampleCount == 0) {
            return new TrackSampleTable(track, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        Atom.LeafAtom leafAtomOfType3 = containerAtom.getLeafAtomOfType(Atom.TYPE_stco);
        if (leafAtomOfType3 == null) {
            leafAtomOfType3 = (Atom.LeafAtom) Assertions.checkNotNull(containerAtom.getLeafAtomOfType(Atom.TYPE_co64));
            z = true;
        } else {
            z = false;
        }
        ParsableByteArray parsableByteArray = leafAtomOfType3.data;
        ParsableByteArray parsableByteArray2 = ((Atom.LeafAtom) Assertions.checkNotNull(containerAtom.getLeafAtomOfType(Atom.TYPE_stsc))).data;
        ParsableByteArray parsableByteArray3 = ((Atom.LeafAtom) Assertions.checkNotNull(containerAtom.getLeafAtomOfType(Atom.TYPE_stts))).data;
        Atom.LeafAtom leafAtomOfType4 = containerAtom.getLeafAtomOfType(Atom.TYPE_stss);
        ParsableByteArray parsableByteArray4 = leafAtomOfType4 != null ? leafAtomOfType4.data : null;
        Atom.LeafAtom leafAtomOfType5 = containerAtom.getLeafAtomOfType(Atom.TYPE_ctts);
        ParsableByteArray parsableByteArray5 = leafAtomOfType5 != null ? leafAtomOfType5.data : null;
        ChunkIterator chunkIterator = new ChunkIterator(parsableByteArray2, parsableByteArray, z);
        parsableByteArray3.setPosition(12);
        int readUnsignedIntToInt = parsableByteArray3.readUnsignedIntToInt() - 1;
        int readUnsignedIntToInt2 = parsableByteArray3.readUnsignedIntToInt();
        int readUnsignedIntToInt3 = parsableByteArray3.readUnsignedIntToInt();
        if (parsableByteArray5 != null) {
            parsableByteArray5.setPosition(12);
            i = parsableByteArray5.readUnsignedIntToInt();
        } else {
            i = 0;
        }
        if (parsableByteArray4 != null) {
            parsableByteArray4.setPosition(12);
            i3 = parsableByteArray4.readUnsignedIntToInt();
            if (i3 > 0) {
                i2 = parsableByteArray4.readUnsignedIntToInt() - 1;
            } else {
                i2 = -1;
                parsableByteArray4 = null;
            }
        } else {
            i2 = -1;
            i3 = 0;
        }
        int fixedSampleSize = stz2SampleSizeBox.getFixedSampleSize();
        String str = track.format.sampleMimeType;
        if (fixedSampleSize == -1 || !((MimeTypes.AUDIO_RAW.equals(str) || MimeTypes.AUDIO_MLAW.equals(str) || MimeTypes.AUDIO_ALAW.equals(str)) && readUnsignedIntToInt == 0 && i == 0 && i3 == 0)) {
            i4 = i3;
            z2 = false;
        } else {
            i4 = i3;
            z2 = true;
        }
        if (z2) {
            long[] jArr5 = new long[chunkIterator.length];
            int[] iArr3 = new int[chunkIterator.length];
            while (chunkIterator.moveNext()) {
                jArr5[chunkIterator.index] = chunkIterator.offset;
                iArr3[chunkIterator.index] = chunkIterator.numSamples;
            }
            FixedSampleSizeRechunker.Results rechunk = FixedSampleSizeRechunker.rechunk(fixedSampleSize, jArr5, iArr3, readUnsignedIntToInt3);
            long[] jArr6 = rechunk.offsets;
            int[] iArr4 = rechunk.sizes;
            int i21 = rechunk.maximumSize;
            long[] jArr7 = rechunk.timestamps;
            int[] iArr5 = rechunk.flags;
            long j2 = rechunk.duration;
            track2 = track;
            i10 = sampleCount;
            jArr = jArr6;
            iArr = iArr4;
            i11 = i21;
            iArr2 = iArr5;
            j = j2;
            jArr2 = jArr7;
        } else {
            long[] jArr8 = new long[sampleCount];
            int[] iArr6 = new int[sampleCount];
            long[] jArr9 = new long[sampleCount];
            int[] iArr7 = new int[sampleCount];
            int i22 = i2;
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            int i26 = 0;
            int i27 = 0;
            long j3 = 0;
            long j4 = 0;
            int i28 = i;
            int i29 = readUnsignedIntToInt3;
            int i30 = readUnsignedIntToInt2;
            int i31 = readUnsignedIntToInt;
            int i32 = i4;
            while (true) {
                i5 = i31;
                if (i23 >= sampleCount) {
                    i6 = i30;
                    i7 = i25;
                    i8 = i26;
                    break;
                }
                long j5 = j4;
                int i33 = i25;
                boolean z5 = true;
                while (i33 == 0) {
                    z5 = chunkIterator.moveNext();
                    if (!z5) {
                        break;
                    }
                    int i34 = i30;
                    long j6 = chunkIterator.offset;
                    i33 = chunkIterator.numSamples;
                    j5 = j6;
                    i30 = i34;
                    i29 = i29;
                    sampleCount = sampleCount;
                }
                int i35 = sampleCount;
                i6 = i30;
                int i36 = i29;
                if (!z5) {
                    Log.w(TAG, "Unexpected end of chunk data");
                    jArr8 = Arrays.copyOf(jArr8, i23);
                    iArr6 = Arrays.copyOf(iArr6, i23);
                    jArr9 = Arrays.copyOf(jArr9, i23);
                    iArr7 = Arrays.copyOf(iArr7, i23);
                    sampleCount = i23;
                    i8 = i26;
                    i7 = i33;
                    break;
                }
                if (parsableByteArray5 != null) {
                    while (i27 == 0 && i28 > 0) {
                        i27 = parsableByteArray5.readUnsignedIntToInt();
                        i26 = parsableByteArray5.readInt();
                        i28--;
                    }
                    i27--;
                }
                int i37 = i26;
                jArr8[i23] = j5;
                int readNextSampleSize = stz2SampleSizeBox.readNextSampleSize();
                iArr6[i23] = readNextSampleSize;
                if (readNextSampleSize > i24) {
                    i24 = readNextSampleSize;
                }
                jArr9[i23] = j3 + i37;
                iArr7[i23] = parsableByteArray4 == null ? 1 : 0;
                if (i23 == i22) {
                    iArr7[i23] = 1;
                    i32--;
                    if (i32 > 0) {
                        i22 = ((ParsableByteArray) Assertions.checkNotNull(parsableByteArray4)).readUnsignedIntToInt() - 1;
                    }
                }
                int i38 = i22;
                j3 += i36;
                int i39 = i6 - 1;
                if (i39 != 0 || i5 <= 0) {
                    i12 = i36;
                    i13 = i5;
                } else {
                    i39 = parsableByteArray3.readUnsignedIntToInt();
                    i12 = parsableByteArray3.readInt();
                    i13 = i5 - 1;
                }
                int i40 = i39;
                int i41 = i33 - 1;
                i23++;
                j4 = j5 + iArr6[i23];
                i22 = i38;
                i29 = i12;
                i25 = i41;
                sampleCount = i35;
                i26 = i37;
                i31 = i13;
                i30 = i40;
            }
            long j7 = j3 + i8;
            if (parsableByteArray5 != null) {
                while (i28 > 0) {
                    if (parsableByteArray5.readUnsignedIntToInt() != 0) {
                        z3 = false;
                        break;
                    }
                    parsableByteArray5.readInt();
                    i28--;
                }
            }
            z3 = true;
            if (i32 == 0 && i6 == 0 && i7 == 0 && i5 == 0) {
                i9 = i27;
                if (i9 == 0 && z3) {
                    track2 = track;
                    i10 = sampleCount;
                    jArr = jArr8;
                    iArr = iArr6;
                    i11 = i24;
                    j = j7;
                    jArr2 = jArr9;
                    iArr2 = iArr7;
                }
            } else {
                i9 = i27;
            }
            StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
            track2 = track;
            sb.append(track2.id);
            sb.append(": remainingSynchronizationSamples ");
            sb.append(i32);
            sb.append(", remainingSamplesAtTimestampDelta ");
            sb.append(i6);
            sb.append(", remainingSamplesInChunk ");
            sb.append(i7);
            sb.append(", remainingTimestampDeltaChanges ");
            sb.append(i5);
            sb.append(", remainingSamplesAtTimestampOffset ");
            sb.append(i9);
            sb.append(!z3 ? ", ctts invalid" : "");
            Log.w(TAG, sb.toString());
            i10 = sampleCount;
            jArr = jArr8;
            iArr = iArr6;
            i11 = i24;
            j = j7;
            jArr2 = jArr9;
            iArr2 = iArr7;
        }
        long scaleLargeTimestamp = Util.scaleLargeTimestamp(j, 1000000L, track2.timescale);
        if (track2.editListDurations == null) {
            Util.scaleLargeTimestampsInPlace(jArr2, 1000000L, track2.timescale);
            return new TrackSampleTable(track, jArr, iArr, i11, jArr2, iArr2, scaleLargeTimestamp);
        }
        if (track2.editListDurations.length == 1 && track2.type == 1 && jArr2.length >= 2) {
            long j8 = ((long[]) Assertions.checkNotNull(track2.editListMediaTimes))[0];
            long scaleLargeTimestamp2 = j8 + Util.scaleLargeTimestamp(track2.editListDurations[0], track2.timescale, track2.movieTimescale);
            i14 = i10;
            if (canApplyEditWithGaplessInfo(jArr2, j, j8, scaleLargeTimestamp2)) {
                long scaleLargeTimestamp3 = Util.scaleLargeTimestamp(j8 - jArr2[0], track2.format.sampleRate, track2.timescale);
                i15 = i11;
                long scaleLargeTimestamp4 = Util.scaleLargeTimestamp(j - scaleLargeTimestamp2, track2.format.sampleRate, track2.timescale);
                if ((scaleLargeTimestamp3 != 0 || scaleLargeTimestamp4 != 0) && scaleLargeTimestamp3 <= 2147483647L && scaleLargeTimestamp4 <= 2147483647L) {
                    gaplessInfoHolder.encoderDelay = (int) scaleLargeTimestamp3;
                    gaplessInfoHolder.encoderPadding = (int) scaleLargeTimestamp4;
                    Util.scaleLargeTimestampsInPlace(jArr2, 1000000L, track2.timescale);
                    return new TrackSampleTable(track, jArr, iArr, i15, jArr2, iArr2, Util.scaleLargeTimestamp(track2.editListDurations[0], 1000000L, track2.movieTimescale));
                }
                if (track2.editListDurations.length != 1 && track2.editListDurations[0] == 0) {
                    long j9 = ((long[]) Assertions.checkNotNull(track2.editListMediaTimes))[0];
                    for (int i42 = 0; i42 < jArr2.length; i42++) {
                        jArr2[i42] = Util.scaleLargeTimestamp(jArr2[i42] - j9, 1000000L, track2.timescale);
                    }
                    return new TrackSampleTable(track, jArr, iArr, i15, jArr2, iArr2, Util.scaleLargeTimestamp(j - j9, 1000000L, track2.timescale));
                }
                boolean z6 = track2.type != 1;
                int[] iArr8 = new int[track2.editListDurations.length];
                int[] iArr9 = new int[track2.editListDurations.length];
                long[] jArr10 = (long[]) Assertions.checkNotNull(track2.editListMediaTimes);
                i16 = 0;
                boolean z7 = false;
                int i43 = 0;
                int i44 = 0;
                while (i16 < track2.editListDurations.length) {
                    long[] jArr11 = jArr;
                    int[] iArr10 = iArr;
                    long j10 = jArr10[i16];
                    if (j10 != -1) {
                        int i45 = i44;
                        jArr4 = jArr11;
                        boolean z8 = z7;
                        int i46 = i43;
                        long scaleLargeTimestamp5 = Util.scaleLargeTimestamp(track2.editListDurations[i16], track2.timescale, track2.movieTimescale);
                        iArr8[i16] = Util.binarySearchFloor(jArr2, j10, true, true);
                        iArr9[i16] = Util.binarySearchCeil(jArr2, j10 + scaleLargeTimestamp5, z6, false);
                        while (true) {
                            i20 = iArr8[i16];
                            i19 = iArr9[i16];
                            if (i20 >= i19 || (iArr2[i20] & 1) != 0) {
                                break;
                            }
                            iArr8[i16] = i20 + 1;
                        }
                        i43 = i46 + (i19 - i20);
                        z4 = z8 | (i45 != i20);
                    } else {
                        jArr4 = jArr11;
                        z4 = z7;
                        i19 = i44;
                    }
                    i16++;
                    z7 = z4;
                    i44 = i19;
                    iArr = iArr10;
                    jArr = jArr4;
                }
                long[] jArr12 = jArr;
                int[] iArr11 = iArr;
                boolean z9 = z7;
                i17 = 0;
                boolean z10 = z9 | (i43 != i14);
                long[] jArr13 = !z10 ? new long[i43] : jArr12;
                int[] iArr12 = !z10 ? new int[i43] : iArr11;
                int i47 = !z10 ? 0 : i15;
                int[] iArr13 = !z10 ? new int[i43] : iArr2;
                long[] jArr14 = new long[i43];
                int i48 = i47;
                int i49 = 0;
                long j11 = 0;
                while (i17 < track2.editListDurations.length) {
                    long j12 = track2.editListMediaTimes[i17];
                    int i50 = iArr8[i17];
                    int[] iArr14 = iArr8;
                    int i51 = iArr9[i17];
                    int[] iArr15 = iArr9;
                    if (z10) {
                        int i52 = i51 - i50;
                        i18 = i17;
                        jArr3 = jArr12;
                        System.arraycopy(jArr3, i50, jArr13, i49, i52);
                        System.arraycopy(iArr11, i50, iArr12, i49, i52);
                        System.arraycopy(iArr2, i50, iArr13, i49, i52);
                    } else {
                        i18 = i17;
                        jArr3 = jArr12;
                    }
                    int i53 = i48;
                    while (i50 < i51) {
                        int i54 = i51;
                        int i55 = i53;
                        long[] jArr15 = jArr2;
                        int[] iArr16 = iArr2;
                        int[] iArr17 = iArr13;
                        long j13 = j11;
                        jArr14[i49] = Util.scaleLargeTimestamp(j11, 1000000L, track2.movieTimescale) + Util.scaleLargeTimestamp(Math.max(0L, jArr2[i50] - j12), 1000000L, track2.timescale);
                        if (z10) {
                            i53 = i55;
                            if (iArr12[i49] > i53) {
                                i53 = iArr11[i50];
                            }
                        } else {
                            i53 = i55;
                        }
                        i49++;
                        i50++;
                        i51 = i54;
                        j11 = j13;
                        jArr2 = jArr15;
                        iArr2 = iArr16;
                        iArr13 = iArr17;
                    }
                    i48 = i53;
                    jArr12 = jArr3;
                    j11 += track2.editListDurations[i18];
                    jArr2 = jArr2;
                    iArr2 = iArr2;
                    iArr9 = iArr15;
                    iArr13 = iArr13;
                    i17 = i18 + 1;
                    iArr8 = iArr14;
                }
                return new TrackSampleTable(track, jArr13, iArr12, i48, jArr14, iArr13, Util.scaleLargeTimestamp(j11, 1000000L, track2.movieTimescale));
            }
        } else {
            i14 = i10;
        }
        i15 = i11;
        if (track2.editListDurations.length != 1) {
        }
        if (track2.type != 1) {
        }
        int[] iArr82 = new int[track2.editListDurations.length];
        int[] iArr92 = new int[track2.editListDurations.length];
        long[] jArr102 = (long[]) Assertions.checkNotNull(track2.editListMediaTimes);
        i16 = 0;
        boolean z72 = false;
        int i432 = 0;
        int i442 = 0;
        while (i16 < track2.editListDurations.length) {
        }
        long[] jArr122 = jArr;
        int[] iArr112 = iArr;
        boolean z92 = z72;
        i17 = 0;
        boolean z102 = z92 | (i432 != i14);
        if (!z102) {
        }
        if (!z102) {
        }
        if (!z102) {
        }
        if (!z102) {
        }
        long[] jArr142 = new long[i432];
        int i482 = i47;
        int i492 = 0;
        long j112 = 0;
        while (i17 < track2.editListDurations.length) {
        }
        return new TrackSampleTable(track, jArr13, iArr12, i482, jArr142, iArr13, Util.scaleLargeTimestamp(j112, 1000000L, track2.movieTimescale));
    }

    private static Metadata parseUdtaMeta(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.skipBytes(8);
        maybeSkipRemainingMetaAtomHeaderBytes(parsableByteArray);
        while (parsableByteArray.getPosition() < i) {
            int position = parsableByteArray.getPosition();
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1768715124) {
                parsableByteArray.setPosition(position);
                return parseIlst(parsableByteArray, position + readInt);
            }
            parsableByteArray.setPosition(position + readInt);
        }
        return null;
    }

    private static Metadata parseIlst(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.skipBytes(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray.getPosition() < i) {
            Metadata.Entry parseIlstElement = MetadataUtil.parseIlstElement(parsableByteArray);
            if (parseIlstElement != null) {
                arrayList.add(parseIlstElement);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    private static Metadata parseSmta(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.skipBytes(12);
        while (parsableByteArray.getPosition() < i) {
            int position = parsableByteArray.getPosition();
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1935766900) {
                if (readInt < 14) {
                    return null;
                }
                parsableByteArray.skipBytes(5);
                int readUnsignedByte = parsableByteArray.readUnsignedByte();
                if (readUnsignedByte == 12 || readUnsignedByte == 13) {
                    float f = readUnsignedByte == 12 ? 240.0f : 120.0f;
                    parsableByteArray.skipBytes(1);
                    return new Metadata(new SmtaMetadataEntry(f, parsableByteArray.readUnsignedByte()));
                }
                return null;
            }
            parsableByteArray.setPosition(position + readInt);
        }
        return null;
    }

    private static long parseMvhd(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        parsableByteArray.skipBytes(Atom.parseFullAtomVersion(parsableByteArray.readInt()) != 0 ? 16 : 8);
        return parsableByteArray.readUnsignedInt();
    }

    private static TkhdData parseTkhd(ParsableByteArray parsableByteArray) {
        boolean z;
        parsableByteArray.setPosition(8);
        int parseFullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(parseFullAtomVersion == 0 ? 8 : 16);
        int readInt = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int position = parsableByteArray.getPosition();
        int i = parseFullAtomVersion == 0 ? 4 : 8;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= i) {
                z = true;
                break;
            } else if (parsableByteArray.getData()[position + i3] != -1) {
                z = false;
                break;
            } else {
                i3++;
            }
        }
        long j = C.TIME_UNSET;
        if (z) {
            parsableByteArray.skipBytes(i);
        } else {
            long readUnsignedInt = parseFullAtomVersion == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
            if (readUnsignedInt != 0) {
                j = readUnsignedInt;
            }
        }
        parsableByteArray.skipBytes(16);
        int readInt2 = parsableByteArray.readInt();
        int readInt3 = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int readInt4 = parsableByteArray.readInt();
        int readInt5 = parsableByteArray.readInt();
        if (readInt2 == 0 && readInt3 == 65536 && readInt4 == -65536 && readInt5 == 0) {
            i2 = 90;
        } else if (readInt2 == 0 && readInt3 == -65536 && readInt4 == 65536 && readInt5 == 0) {
            i2 = 270;
        } else if (readInt2 == -65536 && readInt3 == 0 && readInt4 == 0 && readInt5 == -65536) {
            i2 = 180;
        }
        return new TkhdData(readInt, j, i2);
    }

    private static int parseHdlr(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(16);
        return parsableByteArray.readInt();
    }

    private static Pair<Long, String> parseMdhd(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        int parseFullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(parseFullAtomVersion == 0 ? 8 : 16);
        long readUnsignedInt = parsableByteArray.readUnsignedInt();
        parsableByteArray.skipBytes(parseFullAtomVersion == 0 ? 4 : 8);
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        return Pair.create(Long.valueOf(readUnsignedInt), "" + ((char) (((readUnsignedShort >> 10) & 31) + 96)) + ((char) (((readUnsignedShort >> 5) & 31) + 96)) + ((char) ((readUnsignedShort & 31) + 96)));
    }

    private static StsdData parseStsd(ParsableByteArray parsableByteArray, int i, int i2, String str, DrmInitData drmInitData, boolean z) throws ParserException {
        int i3;
        parsableByteArray.setPosition(12);
        int readInt = parsableByteArray.readInt();
        StsdData stsdData = new StsdData(readInt);
        for (int i4 = 0; i4 < readInt; i4++) {
            int position = parsableByteArray.getPosition();
            int readInt2 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(readInt2 > 0, "childAtomSize must be positive");
            int readInt3 = parsableByteArray.readInt();
            if (readInt3 == 1635148593 || readInt3 == 1635148595 || readInt3 == 1701733238 || readInt3 == 1831958048 || readInt3 == 1836070006 || readInt3 == 1752589105 || readInt3 == 1751479857 || readInt3 == 1932670515 || readInt3 == 1211250227 || readInt3 == 1987063864 || readInt3 == 1987063865 || readInt3 == 1635135537 || readInt3 == 1685479798 || readInt3 == 1685479729 || readInt3 == 1685481573 || readInt3 == 1685481521) {
                i3 = position;
                parseVideoSampleEntry(parsableByteArray, readInt3, i3, readInt2, i, i2, drmInitData, stsdData, i4);
            } else if (readInt3 == 1836069985 || readInt3 == 1701733217 || readInt3 == 1633889587 || readInt3 == 1700998451 || readInt3 == 1633889588 || readInt3 == 1835823201 || readInt3 == 1685353315 || readInt3 == 1685353317 || readInt3 == 1685353320 || readInt3 == 1685353324 || readInt3 == 1685353336 || readInt3 == 1935764850 || readInt3 == 1935767394 || readInt3 == 1819304813 || readInt3 == 1936684916 || readInt3 == 1953984371 || readInt3 == 778924082 || readInt3 == 778924083 || readInt3 == 1835557169 || readInt3 == 1835560241 || readInt3 == 1634492771 || readInt3 == 1634492791 || readInt3 == 1970037111 || readInt3 == 1332770163 || readInt3 == 1716281667) {
                i3 = position;
                parseAudioSampleEntry(parsableByteArray, readInt3, position, readInt2, i, str, z, drmInitData, stsdData, i4);
            } else {
                if (readInt3 == 1414810956 || readInt3 == 1954034535 || readInt3 == 2004251764 || readInt3 == 1937010800 || readInt3 == 1664495672) {
                    parseTextSampleEntry(parsableByteArray, readInt3, position, readInt2, i, str, stsdData);
                } else if (readInt3 == 1835365492) {
                    parseMetaDataSampleEntry(parsableByteArray, readInt3, position, i, stsdData);
                } else if (readInt3 == 1667329389) {
                    stsdData.format = new Format.Builder().setId(i).setSampleMimeType(MimeTypes.APPLICATION_CAMERA_MOTION).build();
                }
                i3 = position;
            }
            parsableByteArray.setPosition(i3 + readInt2);
        }
        return stsdData;
    }

    private static void parseTextSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, int i4, String str, StsdData stsdData) {
        parsableByteArray.setPosition(i2 + 8 + 8);
        String str2 = MimeTypes.APPLICATION_TTML;
        ImmutableList immutableList = null;
        long j = Long.MAX_VALUE;
        if (i != 1414810956) {
            if (i == 1954034535) {
                int i5 = (i3 - 8) - 8;
                byte[] bArr = new byte[i5];
                parsableByteArray.readBytes(bArr, 0, i5);
                immutableList = ImmutableList.of(bArr);
                str2 = MimeTypes.APPLICATION_TX3G;
            } else if (i == 2004251764) {
                str2 = MimeTypes.APPLICATION_MP4VTT;
            } else if (i == 1937010800) {
                j = 0;
            } else if (i == 1664495672) {
                stsdData.requiredSampleTransformation = 1;
                str2 = MimeTypes.APPLICATION_MP4CEA608;
            } else {
                throw new IllegalStateException();
            }
        }
        stsdData.format = new Format.Builder().setId(i4).setSampleMimeType(str2).setLanguage(str).setSubsampleOffsetUs(j).setInitializationData(immutableList).build();
    }

    private static void parseVideoSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, int i4, int i5, DrmInitData drmInitData, StsdData stsdData, int i6) throws ParserException {
        DrmInitData drmInitData2;
        int i7;
        int i8;
        byte[] bArr;
        float f;
        List<byte[]> list;
        String str;
        int i9 = i2;
        int i10 = i3;
        DrmInitData drmInitData3 = drmInitData;
        StsdData stsdData2 = stsdData;
        parsableByteArray.setPosition(i9 + 8 + 8);
        parsableByteArray.skipBytes(16);
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        int readUnsignedShort2 = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(50);
        int position = parsableByteArray.getPosition();
        int i11 = i;
        if (i11 == 1701733238) {
            Pair<Integer, TrackEncryptionBox> parseSampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray, i9, i10);
            if (parseSampleEntryEncryptionData != null) {
                i11 = ((Integer) parseSampleEntryEncryptionData.first).intValue();
                drmInitData3 = drmInitData3 == null ? null : drmInitData3.copyWithSchemeType(((TrackEncryptionBox) parseSampleEntryEncryptionData.second).schemeType);
                stsdData2.trackEncryptionBoxes[i6] = (TrackEncryptionBox) parseSampleEntryEncryptionData.second;
            }
            parsableByteArray.setPosition(position);
        }
        String str2 = MimeTypes.VIDEO_H263;
        String str3 = i11 == 1831958048 ? MimeTypes.VIDEO_MPEG : i11 == 1211250227 ? MimeTypes.VIDEO_H263 : null;
        float f2 = 1.0f;
        byte[] bArr2 = null;
        String str4 = null;
        List<byte[]> list2 = null;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        ByteBuffer byteBuffer = null;
        EsdsData esdsData = null;
        boolean z = false;
        while (true) {
            if (position - i9 >= i10) {
                drmInitData2 = drmInitData3;
                break;
            }
            parsableByteArray.setPosition(position);
            int position2 = parsableByteArray.getPosition();
            String str5 = str2;
            int readInt = parsableByteArray.readInt();
            if (readInt == 0) {
                drmInitData2 = drmInitData3;
                if (parsableByteArray.getPosition() - i9 == i10) {
                    break;
                }
            } else {
                drmInitData2 = drmInitData3;
            }
            ExtractorUtil.checkContainerInput(readInt > 0, "childAtomSize must be positive");
            int readInt2 = parsableByteArray.readInt();
            if (readInt2 == 1635148611) {
                ExtractorUtil.checkContainerInput(str3 == null, null);
                parsableByteArray.setPosition(position2 + 8);
                AvcConfig parse = AvcConfig.parse(parsableByteArray);
                list2 = parse.initializationData;
                stsdData2.nalUnitLengthFieldLength = parse.nalUnitLengthFieldLength;
                if (!z) {
                    f2 = parse.pixelWidthHeightRatio;
                }
                str4 = parse.codecs;
                str = MimeTypes.VIDEO_H264;
            } else if (readInt2 == 1752589123) {
                ExtractorUtil.checkContainerInput(str3 == null, null);
                parsableByteArray.setPosition(position2 + 8);
                HevcConfig parse2 = HevcConfig.parse(parsableByteArray);
                list2 = parse2.initializationData;
                stsdData2.nalUnitLengthFieldLength = parse2.nalUnitLengthFieldLength;
                if (!z) {
                    f2 = parse2.pixelWidthHeightRatio;
                }
                str4 = parse2.codecs;
                str = MimeTypes.VIDEO_H265;
            } else {
                if (readInt2 == 1685480259 || readInt2 == 1685485123) {
                    i7 = readUnsignedShort2;
                    i8 = i11;
                    bArr = bArr2;
                    f = f2;
                    list = list2;
                    DolbyVisionConfig parse3 = DolbyVisionConfig.parse(parsableByteArray);
                    if (parse3 != null) {
                        str4 = parse3.codecs;
                        str3 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                } else if (readInt2 == 1987076931) {
                    ExtractorUtil.checkContainerInput(str3 == null, null);
                    str = i11 == 1987063864 ? MimeTypes.VIDEO_VP8 : MimeTypes.VIDEO_VP9;
                } else if (readInt2 == 1635135811) {
                    ExtractorUtil.checkContainerInput(str3 == null, null);
                    str = MimeTypes.VIDEO_AV1;
                } else if (readInt2 == 1668050025) {
                    if (byteBuffer == null) {
                        byteBuffer = allocateHdrStaticInfo();
                    }
                    ByteBuffer byteBuffer2 = byteBuffer;
                    byteBuffer2.position(21);
                    byteBuffer2.putShort(parsableByteArray.readShort());
                    byteBuffer2.putShort(parsableByteArray.readShort());
                    byteBuffer = byteBuffer2;
                    i7 = readUnsignedShort2;
                    i8 = i11;
                    position += readInt;
                    i9 = i2;
                    i10 = i3;
                    stsdData2 = stsdData;
                    str2 = str5;
                    drmInitData3 = drmInitData2;
                    i11 = i8;
                    readUnsignedShort2 = i7;
                } else if (readInt2 == 1835295606) {
                    if (byteBuffer == null) {
                        byteBuffer = allocateHdrStaticInfo();
                    }
                    ByteBuffer byteBuffer3 = byteBuffer;
                    short readShort = parsableByteArray.readShort();
                    short readShort2 = parsableByteArray.readShort();
                    short readShort3 = parsableByteArray.readShort();
                    i8 = i11;
                    short readShort4 = parsableByteArray.readShort();
                    short readShort5 = parsableByteArray.readShort();
                    List<byte[]> list3 = list2;
                    short readShort6 = parsableByteArray.readShort();
                    byte[] bArr3 = bArr2;
                    short readShort7 = parsableByteArray.readShort();
                    float f3 = f2;
                    short readShort8 = parsableByteArray.readShort();
                    long readUnsignedInt = parsableByteArray.readUnsignedInt();
                    long readUnsignedInt2 = parsableByteArray.readUnsignedInt();
                    i7 = readUnsignedShort2;
                    byteBuffer3.position(1);
                    byteBuffer3.putShort(readShort5);
                    byteBuffer3.putShort(readShort6);
                    byteBuffer3.putShort(readShort);
                    byteBuffer3.putShort(readShort2);
                    byteBuffer3.putShort(readShort3);
                    byteBuffer3.putShort(readShort4);
                    byteBuffer3.putShort(readShort7);
                    byteBuffer3.putShort(readShort8);
                    byteBuffer3.putShort((short) (readUnsignedInt / HandlingStrategy.DEFAULT_TTL));
                    byteBuffer3.putShort((short) (readUnsignedInt2 / HandlingStrategy.DEFAULT_TTL));
                    byteBuffer = byteBuffer3;
                    list2 = list3;
                    bArr2 = bArr3;
                    f2 = f3;
                    position += readInt;
                    i9 = i2;
                    i10 = i3;
                    stsdData2 = stsdData;
                    str2 = str5;
                    drmInitData3 = drmInitData2;
                    i11 = i8;
                    readUnsignedShort2 = i7;
                } else {
                    i7 = readUnsignedShort2;
                    i8 = i11;
                    bArr = bArr2;
                    f = f2;
                    list = list2;
                    if (readInt2 == 1681012275) {
                        ExtractorUtil.checkContainerInput(str3 == null, null);
                        str3 = str5;
                    } else if (readInt2 == 1702061171) {
                        ExtractorUtil.checkContainerInput(str3 == null, null);
                        esdsData = parseEsdsFromParent(parsableByteArray, position2);
                        String str6 = esdsData.mimeType;
                        byte[] bArr4 = esdsData.initializationData;
                        list2 = bArr4 != null ? ImmutableList.of(bArr4) : list;
                        str3 = str6;
                        bArr2 = bArr;
                        f2 = f;
                        position += readInt;
                        i9 = i2;
                        i10 = i3;
                        stsdData2 = stsdData;
                        str2 = str5;
                        drmInitData3 = drmInitData2;
                        i11 = i8;
                        readUnsignedShort2 = i7;
                    } else if (readInt2 == 1885434736) {
                        f2 = parsePaspFromParent(parsableByteArray, position2);
                        list2 = list;
                        bArr2 = bArr;
                        z = true;
                        position += readInt;
                        i9 = i2;
                        i10 = i3;
                        stsdData2 = stsdData;
                        str2 = str5;
                        drmInitData3 = drmInitData2;
                        i11 = i8;
                        readUnsignedShort2 = i7;
                    } else if (readInt2 == 1937126244) {
                        bArr2 = parseProjFromParent(parsableByteArray, position2, readInt);
                        list2 = list;
                        f2 = f;
                        position += readInt;
                        i9 = i2;
                        i10 = i3;
                        stsdData2 = stsdData;
                        str2 = str5;
                        drmInitData3 = drmInitData2;
                        i11 = i8;
                        readUnsignedShort2 = i7;
                    } else if (readInt2 == 1936995172) {
                        int readUnsignedByte = parsableByteArray.readUnsignedByte();
                        parsableByteArray.skipBytes(3);
                        if (readUnsignedByte == 0) {
                            int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                            if (readUnsignedByte2 == 0) {
                                i12 = 0;
                            } else if (readUnsignedByte2 == 1) {
                                i12 = 1;
                            } else if (readUnsignedByte2 == 2) {
                                i12 = 2;
                            } else if (readUnsignedByte2 == 3) {
                                i12 = 3;
                            }
                        }
                    } else if (readInt2 == 1668246642) {
                        int readInt3 = parsableByteArray.readInt();
                        if (readInt3 == TYPE_nclx || readInt3 == TYPE_nclc) {
                            int readUnsignedShort3 = parsableByteArray.readUnsignedShort();
                            int readUnsignedShort4 = parsableByteArray.readUnsignedShort();
                            parsableByteArray.skipBytes(2);
                            boolean z2 = readInt == 19 && (parsableByteArray.readUnsignedByte() & 128) != 0;
                            i13 = ColorInfo.isoColorPrimariesToColorSpace(readUnsignedShort3);
                            i14 = z2 ? 1 : 2;
                            i15 = ColorInfo.isoTransferCharacteristicsToColorTransfer(readUnsignedShort4);
                        } else {
                            Log.w(TAG, "Unsupported color type: " + Atom.getAtomTypeString(readInt3));
                        }
                    }
                }
                list2 = list;
                bArr2 = bArr;
                f2 = f;
                position += readInt;
                i9 = i2;
                i10 = i3;
                stsdData2 = stsdData;
                str2 = str5;
                drmInitData3 = drmInitData2;
                i11 = i8;
                readUnsignedShort2 = i7;
            }
            str3 = str;
            i7 = readUnsignedShort2;
            i8 = i11;
            position += readInt;
            i9 = i2;
            i10 = i3;
            stsdData2 = stsdData;
            str2 = str5;
            drmInitData3 = drmInitData2;
            i11 = i8;
            readUnsignedShort2 = i7;
        }
        int i16 = readUnsignedShort2;
        byte[] bArr5 = bArr2;
        float f4 = f2;
        List<byte[]> list4 = list2;
        if (str3 == null) {
            return;
        }
        Format.Builder drmInitData4 = new Format.Builder().setId(i4).setSampleMimeType(str3).setCodecs(str4).setWidth(readUnsignedShort).setHeight(i16).setPixelWidthHeightRatio(f4).setRotationDegrees(i5).setProjectionData(bArr5).setStereoMode(i12).setInitializationData(list4).setDrmInitData(drmInitData2);
        int i17 = i13;
        int i18 = i14;
        int i19 = i15;
        if (i17 != -1 || i18 != -1 || i19 != -1 || byteBuffer != null) {
            drmInitData4.setColorInfo(new ColorInfo(i17, i18, i19, byteBuffer != null ? byteBuffer.array() : null));
        }
        if (esdsData != null) {
            drmInitData4.setAverageBitrate(Ints.saturatedCast(esdsData.bitrate)).setPeakBitrate(Ints.saturatedCast(esdsData.peakBitrate));
        }
        stsdData.format = drmInitData4.build();
    }

    private static ByteBuffer allocateHdrStaticInfo() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static void parseMetaDataSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, StsdData stsdData) {
        parsableByteArray.setPosition(i2 + 8 + 8);
        if (i == 1835365492) {
            parsableByteArray.readNullTerminatedString();
            String readNullTerminatedString = parsableByteArray.readNullTerminatedString();
            if (readNullTerminatedString != null) {
                stsdData.format = new Format.Builder().setId(i3).setSampleMimeType(readNullTerminatedString).build();
            }
        }
    }

    private static Pair<long[], long[]> parseEdts(Atom.ContainerAtom containerAtom) {
        Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(Atom.TYPE_elst);
        if (leafAtomOfType == null) {
            return null;
        }
        ParsableByteArray parsableByteArray = leafAtomOfType.data;
        parsableByteArray.setPosition(8);
        int parseFullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        long[] jArr = new long[readUnsignedIntToInt];
        long[] jArr2 = new long[readUnsignedIntToInt];
        for (int i = 0; i < readUnsignedIntToInt; i++) {
            jArr[i] = parseFullAtomVersion == 1 ? parsableByteArray.readUnsignedLongToLong() : parsableByteArray.readUnsignedInt();
            jArr2[i] = parseFullAtomVersion == 1 ? parsableByteArray.readLong() : parsableByteArray.readInt();
            if (parsableByteArray.readShort() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            parsableByteArray.skipBytes(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static float parsePaspFromParent(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.setPosition(i + 8);
        return parsableByteArray.readUnsignedIntToInt() / parsableByteArray.readUnsignedIntToInt();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void parseAudioSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, int i4, String str, boolean z, DrmInitData drmInitData, StsdData stsdData, int i5) throws ParserException {
        int i6;
        int readUnsignedFixedPoint1616;
        int readInt;
        int i7;
        String str2;
        String str3;
        int i8;
        boolean z2;
        int i9 = i2;
        int i10 = i3;
        DrmInitData drmInitData2 = drmInitData;
        parsableByteArray.setPosition(i9 + 8 + 8);
        if (z) {
            i6 = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(6);
        } else {
            parsableByteArray.skipBytes(8);
            i6 = 0;
        }
        if (i6 == 0 || i6 == 1) {
            int readUnsignedShort = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(6);
            readUnsignedFixedPoint1616 = parsableByteArray.readUnsignedFixedPoint1616();
            parsableByteArray.setPosition(parsableByteArray.getPosition() - 4);
            readInt = parsableByteArray.readInt();
            if (i6 == 1) {
                parsableByteArray.skipBytes(16);
            }
            i7 = readUnsignedShort;
        } else if (i6 != 2) {
            return;
        } else {
            parsableByteArray.skipBytes(16);
            readUnsignedFixedPoint1616 = (int) Math.round(parsableByteArray.readDouble());
            i7 = parsableByteArray.readUnsignedIntToInt();
            parsableByteArray.skipBytes(20);
            readInt = 0;
        }
        int position = parsableByteArray.getPosition();
        int i11 = i;
        if (i11 == 1701733217) {
            Pair<Integer, TrackEncryptionBox> parseSampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray, i9, i10);
            if (parseSampleEntryEncryptionData != null) {
                i11 = ((Integer) parseSampleEntryEncryptionData.first).intValue();
                drmInitData2 = drmInitData2 == null ? null : drmInitData2.copyWithSchemeType(((TrackEncryptionBox) parseSampleEntryEncryptionData.second).schemeType);
                stsdData.trackEncryptionBoxes[i5] = (TrackEncryptionBox) parseSampleEntryEncryptionData.second;
            }
            parsableByteArray.setPosition(position);
        }
        if (i11 == 1633889587) {
            str2 = MimeTypes.AUDIO_AC3;
        } else if (i11 == 1700998451) {
            str2 = MimeTypes.AUDIO_E_AC3;
        } else if (i11 == 1633889588) {
            str2 = MimeTypes.AUDIO_AC4;
        } else if (i11 == 1685353315) {
            str2 = MimeTypes.AUDIO_DTS;
        } else if (i11 == 1685353320 || i11 == 1685353324) {
            str2 = MimeTypes.AUDIO_DTS_HD;
        } else if (i11 == 1685353317) {
            str2 = MimeTypes.AUDIO_DTS_EXPRESS;
        } else if (i11 == 1685353336) {
            str2 = MimeTypes.AUDIO_DTS_X;
        } else if (i11 == 1935764850) {
            str2 = MimeTypes.AUDIO_AMR_NB;
        } else if (i11 != 1935767394) {
            str3 = MimeTypes.AUDIO_RAW;
            if (i11 == 1819304813 || i11 == 1936684916) {
                i8 = 2;
            } else if (i11 == 1953984371) {
                i8 = 268435456;
            } else if (i11 == 778924082 || i11 == 778924083) {
                str2 = MimeTypes.AUDIO_MPEG;
            } else if (i11 == 1835557169) {
                str2 = MimeTypes.AUDIO_MPEGH_MHA1;
            } else if (i11 == 1835560241) {
                str2 = MimeTypes.AUDIO_MPEGH_MHM1;
            } else if (i11 == 1634492771) {
                str2 = MimeTypes.AUDIO_ALAC;
            } else if (i11 == 1634492791) {
                str2 = MimeTypes.AUDIO_ALAW;
            } else if (i11 == 1970037111) {
                str2 = MimeTypes.AUDIO_MLAW;
            } else if (i11 == 1332770163) {
                str2 = MimeTypes.AUDIO_OPUS;
            } else if (i11 == 1716281667) {
                str2 = MimeTypes.AUDIO_FLAC;
            } else if (i11 == 1835823201) {
                str2 = MimeTypes.AUDIO_TRUEHD;
            } else {
                i8 = -1;
                str3 = null;
            }
            String str4 = str3;
            EsdsData esdsData = null;
            String str5 = null;
            List<byte[]> list = null;
            while (position - i9 < i10) {
                parsableByteArray.setPosition(position);
                int readInt2 = parsableByteArray.readInt();
                ExtractorUtil.checkContainerInput(readInt2 > 0, "childAtomSize must be positive");
                int readInt3 = parsableByteArray.readInt();
                if (readInt3 == 1835557187) {
                    int i12 = readInt2 - 13;
                    byte[] bArr = new byte[i12];
                    parsableByteArray.setPosition(position + 13);
                    parsableByteArray.readBytes(bArr, 0, i12);
                    list = ImmutableList.of(bArr);
                } else {
                    if (readInt3 == 1702061171 || (z && readInt3 == 2002876005)) {
                        int findBoxPosition = readInt3 == 1702061171 ? position : findBoxPosition(parsableByteArray, Atom.TYPE_esds, position, readInt2);
                        if (findBoxPosition != -1) {
                            esdsData = parseEsdsFromParent(parsableByteArray, findBoxPosition);
                            str4 = esdsData.mimeType;
                            byte[] bArr2 = esdsData.initializationData;
                            if (bArr2 != null) {
                                if (MimeTypes.AUDIO_AAC.equals(str4)) {
                                    AacUtil.Config parseAudioSpecificConfig = AacUtil.parseAudioSpecificConfig(bArr2);
                                    readUnsignedFixedPoint1616 = parseAudioSpecificConfig.sampleRateHz;
                                    i7 = parseAudioSpecificConfig.channelCount;
                                    str5 = parseAudioSpecificConfig.codecs;
                                }
                                list = ImmutableList.of(bArr2);
                            }
                        }
                    } else {
                        if (readInt3 == 1684103987) {
                            parsableByteArray.setPosition(position + 8);
                            stsdData.format = Ac3Util.parseAc3AnnexFFormat(parsableByteArray, Integer.toString(i4), str, drmInitData2);
                        } else if (readInt3 == 1684366131) {
                            parsableByteArray.setPosition(position + 8);
                            stsdData.format = Ac3Util.parseEAc3AnnexFFormat(parsableByteArray, Integer.toString(i4), str, drmInitData2);
                        } else if (readInt3 == 1684103988) {
                            parsableByteArray.setPosition(position + 8);
                            stsdData.format = Ac4Util.parseAc4AnnexEFormat(parsableByteArray, Integer.toString(i4), str, drmInitData2);
                        } else if (readInt3 == 1684892784) {
                            if (readInt <= 0) {
                                throw ParserException.createForMalformedContainer("Invalid sample rate for Dolby TrueHD MLP stream: " + readInt, null);
                            }
                            readUnsignedFixedPoint1616 = readInt;
                            i7 = 2;
                        } else if (readInt3 == 1684305011) {
                            stsdData.format = new Format.Builder().setId(i4).setSampleMimeType(str4).setChannelCount(i7).setSampleRate(readUnsignedFixedPoint1616).setDrmInitData(drmInitData2).setLanguage(str).build();
                        } else if (readInt3 == 1682927731) {
                            int i13 = readInt2 - 8;
                            byte[] bArr3 = opusMagic;
                            byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length + i13);
                            parsableByteArray.setPosition(position + 8);
                            parsableByteArray.readBytes(copyOf, bArr3.length, i13);
                            list = OpusUtil.buildInitializationData(copyOf);
                        } else if (readInt3 == 1684425825) {
                            int i14 = readInt2 - 12;
                            byte[] bArr4 = new byte[i14 + 4];
                            bArr4[0] = 102;
                            bArr4[1] = 76;
                            bArr4[2] = 97;
                            bArr4[3] = 67;
                            parsableByteArray.setPosition(position + 12);
                            parsableByteArray.readBytes(bArr4, 4, i14);
                            list = ImmutableList.of(bArr4);
                        } else if (readInt3 == 1634492771) {
                            int i15 = readInt2 - 12;
                            byte[] bArr5 = new byte[i15];
                            parsableByteArray.setPosition(position + 12);
                            parsableByteArray.readBytes(bArr5, 0, i15);
                            Pair<Integer, Integer> parseAlacAudioSpecificConfig = CodecSpecificDataUtil.parseAlacAudioSpecificConfig(bArr5);
                            int intValue = ((Integer) parseAlacAudioSpecificConfig.first).intValue();
                            int intValue2 = ((Integer) parseAlacAudioSpecificConfig.second).intValue();
                            list = ImmutableList.of(bArr5);
                            readUnsignedFixedPoint1616 = intValue;
                            i7 = intValue2;
                        } else {
                            z2 = false;
                        }
                        z2 = false;
                    }
                    position += readInt2;
                    i9 = i2;
                    i10 = i3;
                }
                position += readInt2;
                i9 = i2;
                i10 = i3;
            }
            if (stsdData.format == null || str4 == null) {
            }
            Format.Builder language = new Format.Builder().setId(i4).setSampleMimeType(str4).setCodecs(str5).setChannelCount(i7).setSampleRate(readUnsignedFixedPoint1616).setPcmEncoding(i8).setInitializationData(list).setDrmInitData(drmInitData2).setLanguage(str);
            if (esdsData != null) {
                language.setAverageBitrate(Ints.saturatedCast(esdsData.bitrate)).setPeakBitrate(Ints.saturatedCast(esdsData.peakBitrate));
            }
            stsdData.format = language.build();
            return;
        } else {
            str2 = MimeTypes.AUDIO_AMR_WB;
        }
        str3 = str2;
        i8 = -1;
        String str42 = str3;
        EsdsData esdsData2 = null;
        String str52 = null;
        List<byte[]> list2 = null;
        while (position - i9 < i10) {
        }
        if (stsdData.format == null) {
        }
    }

    private static int findBoxPosition(ParsableByteArray parsableByteArray, int i, int i2, int i3) throws ParserException {
        int position = parsableByteArray.getPosition();
        ExtractorUtil.checkContainerInput(position >= i2, null);
        while (position - i2 < i3) {
            parsableByteArray.setPosition(position);
            int readInt = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(readInt > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == i) {
                return position;
            }
            position += readInt;
        }
        return -1;
    }

    private static EsdsData parseEsdsFromParent(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.setPosition(i + 8 + 4);
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        parsableByteArray.skipBytes(2);
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        if ((readUnsignedByte & 128) != 0) {
            parsableByteArray.skipBytes(2);
        }
        if ((readUnsignedByte & 64) != 0) {
            parsableByteArray.skipBytes(parsableByteArray.readUnsignedByte());
        }
        if ((readUnsignedByte & 32) != 0) {
            parsableByteArray.skipBytes(2);
        }
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        String mimeTypeFromMp4ObjectType = MimeTypes.getMimeTypeFromMp4ObjectType(parsableByteArray.readUnsignedByte());
        if (MimeTypes.AUDIO_MPEG.equals(mimeTypeFromMp4ObjectType) || MimeTypes.AUDIO_DTS.equals(mimeTypeFromMp4ObjectType) || MimeTypes.AUDIO_DTS_HD.equals(mimeTypeFromMp4ObjectType)) {
            return new EsdsData(mimeTypeFromMp4ObjectType, null, -1L, -1L);
        }
        parsableByteArray.skipBytes(4);
        long readUnsignedInt = parsableByteArray.readUnsignedInt();
        long readUnsignedInt2 = parsableByteArray.readUnsignedInt();
        parsableByteArray.skipBytes(1);
        int parseExpandableClassSize = parseExpandableClassSize(parsableByteArray);
        byte[] bArr = new byte[parseExpandableClassSize];
        parsableByteArray.readBytes(bArr, 0, parseExpandableClassSize);
        return new EsdsData(mimeTypeFromMp4ObjectType, bArr, readUnsignedInt2 > 0 ? readUnsignedInt2 : -1L, readUnsignedInt > 0 ? readUnsignedInt : -1L);
    }

    private static Pair<Integer, TrackEncryptionBox> parseSampleEntryEncryptionData(ParsableByteArray parsableByteArray, int i, int i2) throws ParserException {
        Pair<Integer, TrackEncryptionBox> parseCommonEncryptionSinfFromParent;
        int position = parsableByteArray.getPosition();
        while (position - i < i2) {
            parsableByteArray.setPosition(position);
            int readInt = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(readInt > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == 1936289382 && (parseCommonEncryptionSinfFromParent = parseCommonEncryptionSinfFromParent(parsableByteArray, position, readInt)) != null) {
                return parseCommonEncryptionSinfFromParent;
            }
            position += readInt;
        }
        return null;
    }

    static Pair<Integer, TrackEncryptionBox> parseCommonEncryptionSinfFromParent(ParsableByteArray parsableByteArray, int i, int i2) throws ParserException {
        int i3 = i + 8;
        int i4 = -1;
        int i5 = 0;
        String str = null;
        Integer num = null;
        while (i3 - i < i2) {
            parsableByteArray.setPosition(i3);
            int readInt = parsableByteArray.readInt();
            int readInt2 = parsableByteArray.readInt();
            if (readInt2 == 1718775137) {
                num = Integer.valueOf(parsableByteArray.readInt());
            } else if (readInt2 == 1935894637) {
                parsableByteArray.skipBytes(4);
                str = parsableByteArray.readString(4);
            } else if (readInt2 == 1935894633) {
                i4 = i3;
                i5 = readInt;
            }
            i3 += readInt;
        }
        if (C.CENC_TYPE_cenc.equals(str) || C.CENC_TYPE_cbc1.equals(str) || C.CENC_TYPE_cens.equals(str) || C.CENC_TYPE_cbcs.equals(str)) {
            ExtractorUtil.checkContainerInput(num != null, "frma atom is mandatory");
            ExtractorUtil.checkContainerInput(i4 != -1, "schi atom is mandatory");
            TrackEncryptionBox parseSchiFromParent = parseSchiFromParent(parsableByteArray, i4, i5, str);
            ExtractorUtil.checkContainerInput(parseSchiFromParent != null, "tenc atom is mandatory");
            return Pair.create(num, (TrackEncryptionBox) Util.castNonNull(parseSchiFromParent));
        }
        return null;
    }

    private static TrackEncryptionBox parseSchiFromParent(ParsableByteArray parsableByteArray, int i, int i2, String str) {
        int i3;
        int i4;
        int i5 = i + 8;
        while (true) {
            byte[] bArr = null;
            if (i5 - i >= i2) {
                return null;
            }
            parsableByteArray.setPosition(i5);
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1952804451) {
                int parseFullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
                parsableByteArray.skipBytes(1);
                if (parseFullAtomVersion == 0) {
                    parsableByteArray.skipBytes(1);
                    i4 = 0;
                    i3 = 0;
                } else {
                    int readUnsignedByte = parsableByteArray.readUnsignedByte();
                    i3 = readUnsignedByte & 15;
                    i4 = (readUnsignedByte & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                }
                boolean z = parsableByteArray.readUnsignedByte() == 1;
                int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                byte[] bArr2 = new byte[16];
                parsableByteArray.readBytes(bArr2, 0, 16);
                if (z && readUnsignedByte2 == 0) {
                    int readUnsignedByte3 = parsableByteArray.readUnsignedByte();
                    bArr = new byte[readUnsignedByte3];
                    parsableByteArray.readBytes(bArr, 0, readUnsignedByte3);
                }
                return new TrackEncryptionBox(z, str, readUnsignedByte2, bArr2, i4, i3, bArr);
            }
            i5 += readInt;
        }
    }

    private static byte[] parseProjFromParent(ParsableByteArray parsableByteArray, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            parsableByteArray.setPosition(i3);
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1886547818) {
                return Arrays.copyOfRange(parsableByteArray.getData(), i3, readInt + i3);
            }
            i3 += readInt;
        }
        return null;
    }

    private static int parseExpandableClassSize(ParsableByteArray parsableByteArray) {
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int i = readUnsignedByte & 127;
        while ((readUnsignedByte & 128) == 128) {
            readUnsignedByte = parsableByteArray.readUnsignedByte();
            i = (i << 7) | (readUnsignedByte & 127);
        }
        return i;
    }

    private static boolean canApplyEditWithGaplessInfo(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        return jArr[0] <= j2 && j2 < jArr[Util.constrainValue(4, 0, length)] && jArr[Util.constrainValue(jArr.length - 4, 0, length)] < j3 && j3 <= j;
    }

    private AtomParsers() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class ChunkIterator {
        private final ParsableByteArray chunkOffsets;
        private final boolean chunkOffsetsAreLongs;
        public int index;
        public final int length;
        private int nextSamplesPerChunkChangeIndex;
        public int numSamples;
        public long offset;
        private int remainingSamplesPerChunkChanges;
        private final ParsableByteArray stsc;

        public ChunkIterator(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, boolean z) throws ParserException {
            this.stsc = parsableByteArray;
            this.chunkOffsets = parsableByteArray2;
            this.chunkOffsetsAreLongs = z;
            parsableByteArray2.setPosition(12);
            this.length = parsableByteArray2.readUnsignedIntToInt();
            parsableByteArray.setPosition(12);
            this.remainingSamplesPerChunkChanges = parsableByteArray.readUnsignedIntToInt();
            ExtractorUtil.checkContainerInput(parsableByteArray.readInt() == 1, "first_chunk must be 1");
            this.index = -1;
        }

        public boolean moveNext() {
            long readUnsignedInt;
            int i = this.index + 1;
            this.index = i;
            if (i == this.length) {
                return false;
            }
            if (this.chunkOffsetsAreLongs) {
                readUnsignedInt = this.chunkOffsets.readUnsignedLongToLong();
            } else {
                readUnsignedInt = this.chunkOffsets.readUnsignedInt();
            }
            this.offset = readUnsignedInt;
            if (this.index == this.nextSamplesPerChunkChangeIndex) {
                this.numSamples = this.stsc.readUnsignedIntToInt();
                this.stsc.skipBytes(4);
                int i2 = this.remainingSamplesPerChunkChanges - 1;
                this.remainingSamplesPerChunkChanges = i2;
                this.nextSamplesPerChunkChangeIndex = i2 > 0 ? this.stsc.readUnsignedIntToInt() - 1 : -1;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class TkhdData {
        private final long duration;
        private final int id;
        private final int rotationDegrees;

        public TkhdData(int i, long j, int i2) {
            this.id = i;
            this.duration = j;
            this.rotationDegrees = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class StsdData {
        public static final int STSD_HEADER_SIZE = 8;
        public Format format;
        public int nalUnitLengthFieldLength;
        public int requiredSampleTransformation = 0;
        public final TrackEncryptionBox[] trackEncryptionBoxes;

        public StsdData(int i) {
            this.trackEncryptionBoxes = new TrackEncryptionBox[i];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class EsdsData {
        private final long bitrate;
        private final byte[] initializationData;
        private final String mimeType;
        private final long peakBitrate;

        public EsdsData(String str, byte[] bArr, long j, long j2) {
            this.mimeType = str;
            this.initializationData = bArr;
            this.bitrate = j;
            this.peakBitrate = j2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class StszSampleSizeBox implements SampleSizeBox {
        private final ParsableByteArray data;
        private final int fixedSampleSize;
        private final int sampleCount;

        public StszSampleSizeBox(Atom.LeafAtom leafAtom, Format format) {
            ParsableByteArray parsableByteArray = leafAtom.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            if (MimeTypes.AUDIO_RAW.equals(format.sampleMimeType)) {
                int pcmFrameSize = Util.getPcmFrameSize(format.pcmEncoding, format.channelCount);
                if (readUnsignedIntToInt == 0 || readUnsignedIntToInt % pcmFrameSize != 0) {
                    Log.w(AtomParsers.TAG, "Audio sample size mismatch. stsd sample size: " + pcmFrameSize + ", stsz sample size: " + readUnsignedIntToInt);
                    readUnsignedIntToInt = pcmFrameSize;
                }
            }
            this.fixedSampleSize = readUnsignedIntToInt == 0 ? -1 : readUnsignedIntToInt;
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int getFixedSampleSize() {
            return this.fixedSampleSize;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int readNextSampleSize() {
            int i = this.fixedSampleSize;
            return i == -1 ? this.data.readUnsignedIntToInt() : i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stz2SampleSizeBox implements SampleSizeBox {
        private int currentByte;
        private final ParsableByteArray data;
        private final int fieldSize;
        private final int sampleCount;
        private int sampleIndex;

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int getFixedSampleSize() {
            return -1;
        }

        public Stz2SampleSizeBox(Atom.LeafAtom leafAtom) {
            ParsableByteArray parsableByteArray = leafAtom.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            this.fieldSize = parsableByteArray.readUnsignedIntToInt() & 255;
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int readNextSampleSize() {
            int i = this.fieldSize;
            if (i == 8) {
                return this.data.readUnsignedByte();
            }
            if (i == 16) {
                return this.data.readUnsignedShort();
            }
            int i2 = this.sampleIndex;
            this.sampleIndex = i2 + 1;
            if (i2 % 2 == 0) {
                int readUnsignedByte = this.data.readUnsignedByte();
                this.currentByte = readUnsignedByte;
                return (readUnsignedByte & PsExtractor.VIDEO_STREAM_MASK) >> 4;
            }
            return this.currentByte & 15;
        }
    }
}
