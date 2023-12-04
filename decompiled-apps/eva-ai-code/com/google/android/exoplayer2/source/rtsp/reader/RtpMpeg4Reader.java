package com.google.android.exoplayer2.source.rtsp.reader;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.rtsp.RtpPacket;
import com.google.android.exoplayer2.source.rtsp.RtpPayloadFormat;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.common.primitives.Bytes;
/* loaded from: classes2.dex */
final class RtpMpeg4Reader implements RtpPayloadReader {
    private static final int I_VOP = 0;
    private static final long MEDIA_CLOCK_FREQUENCY = 90000;
    private static final String TAG = "RtpMpeg4Reader";
    private int bufferFlags;
    private final RtpPayloadFormat payloadFormat;
    private long startTimeOffsetUs;
    private TrackOutput trackOutput;
    private long firstReceivedTimestamp = C.TIME_UNSET;
    private int previousSequenceNumber = -1;
    private int sampleLength = 0;

    @Override // com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader
    public void onReceivingFirstPacket(long j, int i) {
    }

    public RtpMpeg4Reader(RtpPayloadFormat rtpPayloadFormat) {
        this.payloadFormat = rtpPayloadFormat;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader
    public void createTracks(ExtractorOutput extractorOutput, int i) {
        TrackOutput track = extractorOutput.track(i, 2);
        this.trackOutput = track;
        ((TrackOutput) Util.castNonNull(track)).format(this.payloadFormat.format);
    }

    @Override // com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader
    public void consume(ParsableByteArray parsableByteArray, long j, int i, boolean z) {
        int nextSequenceNumber;
        Assertions.checkStateNotNull(this.trackOutput);
        int i2 = this.previousSequenceNumber;
        if (i2 != -1 && i != (nextSequenceNumber = RtpPacket.getNextSequenceNumber(i2))) {
            Log.w(TAG, Util.formatInvariant("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(nextSequenceNumber), Integer.valueOf(i)));
        }
        int bytesLeft = parsableByteArray.bytesLeft();
        this.trackOutput.sampleData(parsableByteArray, bytesLeft);
        if (this.sampleLength == 0) {
            this.bufferFlags = getBufferFlagsFromVop(parsableByteArray);
        }
        this.sampleLength += bytesLeft;
        if (z) {
            if (this.firstReceivedTimestamp == C.TIME_UNSET) {
                this.firstReceivedTimestamp = j;
            }
            this.trackOutput.sampleMetadata(toSampleUs(this.startTimeOffsetUs, j, this.firstReceivedTimestamp), this.bufferFlags, this.sampleLength, 0, null);
            this.sampleLength = 0;
        }
        this.previousSequenceNumber = i;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader
    public void seek(long j, long j2) {
        this.firstReceivedTimestamp = j;
        this.startTimeOffsetUs = j2;
        this.sampleLength = 0;
    }

    private static int getBufferFlagsFromVop(ParsableByteArray parsableByteArray) {
        int indexOf = Bytes.indexOf(parsableByteArray.getData(), new byte[]{0, 0, 1, -74});
        if (indexOf != -1) {
            parsableByteArray.setPosition(indexOf + 4);
            return (parsableByteArray.peekUnsignedByte() >> 6) == 0 ? 1 : 0;
        }
        return 0;
    }

    private static long toSampleUs(long j, long j2, long j3) {
        return j + Util.scaleLargeTimestamp(j2 - j3, 1000000L, MEDIA_CLOCK_FREQUENCY);
    }
}
