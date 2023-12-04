package com.google.android.exoplayer2.extractor.ts;

import android.util.Pair;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.ts.TsPayloadReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Collections;
/* loaded from: classes2.dex */
public final class H262Reader implements ElementaryStreamReader {
    private static final double[] FRAME_RATE_VALUES = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private static final int START_EXTENSION = 181;
    private static final int START_GROUP = 184;
    private static final int START_PICTURE = 0;
    private static final int START_SEQUENCE_HEADER = 179;
    private static final int START_USER_DATA = 178;
    private final CsdBuffer csdBuffer;
    private String formatId;
    private long frameDurationUs;
    private boolean hasOutputFormat;
    private TrackOutput output;
    private long pesTimeUs;
    private final boolean[] prefixFlags;
    private boolean sampleHasPicture;
    private boolean sampleIsKeyframe;
    private long samplePosition;
    private long sampleTimeUs;
    private boolean startedFirstSample;
    private long totalBytesWritten;
    private final NalUnitTargetBuffer userData;
    private final ParsableByteArray userDataParsable;
    private final UserDataReader userDataReader;

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void packetFinished() {
    }

    public H262Reader() {
        this(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public H262Reader(UserDataReader userDataReader) {
        this.userDataReader = userDataReader;
        this.prefixFlags = new boolean[4];
        this.csdBuffer = new CsdBuffer(128);
        if (userDataReader != null) {
            this.userData = new NalUnitTargetBuffer(START_USER_DATA, 128);
            this.userDataParsable = new ParsableByteArray();
        } else {
            this.userData = null;
            this.userDataParsable = null;
        }
        this.pesTimeUs = C.TIME_UNSET;
        this.sampleTimeUs = C.TIME_UNSET;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void seek() {
        NalUnitUtil.clearPrefixFlags(this.prefixFlags);
        this.csdBuffer.reset();
        NalUnitTargetBuffer nalUnitTargetBuffer = this.userData;
        if (nalUnitTargetBuffer != null) {
            nalUnitTargetBuffer.reset();
        }
        this.totalBytesWritten = 0L;
        this.startedFirstSample = false;
        this.pesTimeUs = C.TIME_UNSET;
        this.sampleTimeUs = C.TIME_UNSET;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.formatId = trackIdGenerator.getFormatId();
        this.output = extractorOutput.track(trackIdGenerator.getTrackId(), 2);
        UserDataReader userDataReader = this.userDataReader;
        if (userDataReader != null) {
            userDataReader.createTracks(extractorOutput, trackIdGenerator);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void packetStarted(long j, int i) {
        this.pesTimeUs = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0144  */
    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void consume(ParsableByteArray parsableByteArray) {
        int i;
        long j;
        boolean z;
        int i2;
        Assertions.checkStateNotNull(this.output);
        int position = parsableByteArray.getPosition();
        int limit = parsableByteArray.limit();
        byte[] data = parsableByteArray.getData();
        this.totalBytesWritten += parsableByteArray.bytesLeft();
        this.output.sampleData(parsableByteArray, parsableByteArray.bytesLeft());
        while (true) {
            int findNalUnit = NalUnitUtil.findNalUnit(data, position, limit, this.prefixFlags);
            if (findNalUnit == limit) {
                break;
            }
            int i3 = findNalUnit + 3;
            int i4 = parsableByteArray.getData()[i3] & 255;
            int i5 = findNalUnit - position;
            if (!this.hasOutputFormat) {
                if (i5 > 0) {
                    this.csdBuffer.onData(data, position, findNalUnit);
                }
                if (this.csdBuffer.onStartCode(i4, i5 < 0 ? -i5 : 0)) {
                    Pair<Format, Long> parseCsdBuffer = parseCsdBuffer(this.csdBuffer, (String) Assertions.checkNotNull(this.formatId));
                    this.output.format((Format) parseCsdBuffer.first);
                    this.frameDurationUs = ((Long) parseCsdBuffer.second).longValue();
                    this.hasOutputFormat = true;
                }
            }
            NalUnitTargetBuffer nalUnitTargetBuffer = this.userData;
            if (nalUnitTargetBuffer != null) {
                if (i5 > 0) {
                    nalUnitTargetBuffer.appendToNalUnit(data, position, findNalUnit);
                    i2 = 0;
                } else {
                    i2 = -i5;
                }
                if (this.userData.endNalUnit(i2)) {
                    ((ParsableByteArray) Util.castNonNull(this.userDataParsable)).reset(this.userData.nalData, NalUnitUtil.unescapeStream(this.userData.nalData, this.userData.nalLength));
                    ((UserDataReader) Util.castNonNull(this.userDataReader)).consume(this.sampleTimeUs, this.userDataParsable);
                }
                if (i4 == START_USER_DATA && parsableByteArray.getData()[findNalUnit + 2] == 1) {
                    this.userData.startNalUnit(i4);
                }
            }
            if (i4 == 0 || i4 == START_SEQUENCE_HEADER) {
                int i6 = limit - findNalUnit;
                if (this.sampleHasPicture && this.hasOutputFormat) {
                    long j2 = this.sampleTimeUs;
                    if (j2 != C.TIME_UNSET) {
                        i = i4;
                        this.output.sampleMetadata(j2, this.sampleIsKeyframe ? 1 : 0, ((int) (this.totalBytesWritten - this.samplePosition)) - i6, i6, null);
                        if (this.startedFirstSample || this.sampleHasPicture) {
                            this.samplePosition = this.totalBytesWritten - i6;
                            j = this.pesTimeUs;
                            if (j == C.TIME_UNSET) {
                                long j3 = this.sampleTimeUs;
                                j = j3 != C.TIME_UNSET ? j3 + this.frameDurationUs : -9223372036854775807L;
                            }
                            this.sampleTimeUs = j;
                            this.sampleIsKeyframe = false;
                            this.pesTimeUs = C.TIME_UNSET;
                            z = true;
                            this.startedFirstSample = true;
                        } else {
                            z = true;
                        }
                        this.sampleHasPicture = i == 0 ? z : false;
                    }
                }
                i = i4;
                if (this.startedFirstSample) {
                }
                this.samplePosition = this.totalBytesWritten - i6;
                j = this.pesTimeUs;
                if (j == C.TIME_UNSET) {
                }
                this.sampleTimeUs = j;
                this.sampleIsKeyframe = false;
                this.pesTimeUs = C.TIME_UNSET;
                z = true;
                this.startedFirstSample = true;
                this.sampleHasPicture = i == 0 ? z : false;
            } else if (i4 == START_GROUP) {
                this.sampleIsKeyframe = true;
            }
            position = i3;
        }
        if (!this.hasOutputFormat) {
            this.csdBuffer.onData(data, position, limit);
        }
        NalUnitTargetBuffer nalUnitTargetBuffer2 = this.userData;
        if (nalUnitTargetBuffer2 != null) {
            nalUnitTargetBuffer2.appendToNalUnit(data, position, limit);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Pair<Format, Long> parseCsdBuffer(CsdBuffer csdBuffer, String str) {
        float f;
        int i;
        float f2;
        int i2;
        long j;
        int i3;
        byte[] copyOf = Arrays.copyOf(csdBuffer.data, csdBuffer.length);
        int i4 = copyOf[5] & 255;
        int i5 = ((copyOf[4] & 255) << 4) | (i4 >> 4);
        int i6 = ((i4 & 15) << 8) | (copyOf[6] & 255);
        int i7 = (copyOf[7] & 240) >> 4;
        if (i7 == 2) {
            f = i6 * 4;
            i = i5 * 3;
        } else if (i7 == 3) {
            f = i6 * 16;
            i = i5 * 9;
        } else if (i7 != 4) {
            f2 = 1.0f;
            Format build = new Format.Builder().setId(str).setSampleMimeType(MimeTypes.VIDEO_MPEG2).setWidth(i5).setHeight(i6).setPixelWidthHeightRatio(f2).setInitializationData(Collections.singletonList(copyOf)).build();
            i2 = (copyOf[7] & Ascii.SI) - 1;
            if (i2 >= 0) {
                double[] dArr = FRAME_RATE_VALUES;
                if (i2 < dArr.length) {
                    double d = dArr[i2];
                    byte b = copyOf[csdBuffer.sequenceExtensionPosition + 9];
                    int i8 = (b & 96) >> 5;
                    if (i8 != (b & Ascii.US)) {
                        d *= (i8 + 1.0d) / (i3 + 1);
                    }
                    j = (long) (1000000.0d / d);
                    return Pair.create(build, Long.valueOf(j));
                }
            }
            j = 0;
            return Pair.create(build, Long.valueOf(j));
        } else {
            f = i6 * 121;
            i = i5 * 100;
        }
        f2 = f / i;
        Format build2 = new Format.Builder().setId(str).setSampleMimeType(MimeTypes.VIDEO_MPEG2).setWidth(i5).setHeight(i6).setPixelWidthHeightRatio(f2).setInitializationData(Collections.singletonList(copyOf)).build();
        i2 = (copyOf[7] & Ascii.SI) - 1;
        if (i2 >= 0) {
        }
        j = 0;
        return Pair.create(build2, Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class CsdBuffer {
        private static final byte[] START_CODE = {0, 0, 1};
        public byte[] data;
        private boolean isFilling;
        public int length;
        public int sequenceExtensionPosition;

        public CsdBuffer(int i) {
            this.data = new byte[i];
        }

        public void reset() {
            this.isFilling = false;
            this.length = 0;
            this.sequenceExtensionPosition = 0;
        }

        public boolean onStartCode(int i, int i2) {
            if (this.isFilling) {
                int i3 = this.length - i2;
                this.length = i3;
                if (this.sequenceExtensionPosition == 0 && i == H262Reader.START_EXTENSION) {
                    this.sequenceExtensionPosition = i3;
                } else {
                    this.isFilling = false;
                    return true;
                }
            } else if (i == H262Reader.START_SEQUENCE_HEADER) {
                this.isFilling = true;
            }
            byte[] bArr = START_CODE;
            onData(bArr, 0, bArr.length);
            return false;
        }

        public void onData(byte[] bArr, int i, int i2) {
            if (this.isFilling) {
                int i3 = i2 - i;
                byte[] bArr2 = this.data;
                int length = bArr2.length;
                int i4 = this.length;
                if (length < i4 + i3) {
                    this.data = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.data, this.length, i3);
                this.length += i3;
            }
        }
    }
}
