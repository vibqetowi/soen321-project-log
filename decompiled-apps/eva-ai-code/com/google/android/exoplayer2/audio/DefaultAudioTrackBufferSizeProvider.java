package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.android.exoplayer2.util.Util;
import com.google.common.primitives.Ints;
/* loaded from: classes2.dex */
public class DefaultAudioTrackBufferSizeProvider implements DefaultAudioSink.AudioTrackBufferSizeProvider {
    private static final int AC3_BUFFER_MULTIPLICATION_FACTOR = 2;
    private static final int MAX_PCM_BUFFER_DURATION_US = 750000;
    private static final int MIN_PCM_BUFFER_DURATION_US = 250000;
    private static final int OFFLOAD_BUFFER_DURATION_US = 50000000;
    private static final int PASSTHROUGH_BUFFER_DURATION_US = 250000;
    private static final int PCM_BUFFER_MULTIPLICATION_FACTOR = 4;
    public final int ac3BufferMultiplicationFactor;
    protected final int maxPcmBufferDurationUs;
    protected final int minPcmBufferDurationUs;
    protected final int offloadBufferDurationUs;
    protected final int passthroughBufferDurationUs;
    protected final int pcmBufferMultiplicationFactor;

    /* loaded from: classes2.dex */
    public static class Builder {
        private int minPcmBufferDurationUs = 250000;
        private int maxPcmBufferDurationUs = DefaultAudioTrackBufferSizeProvider.MAX_PCM_BUFFER_DURATION_US;
        private int pcmBufferMultiplicationFactor = 4;
        private int passthroughBufferDurationUs = 250000;
        private int offloadBufferDurationUs = DefaultAudioTrackBufferSizeProvider.OFFLOAD_BUFFER_DURATION_US;
        private int ac3BufferMultiplicationFactor = 2;

        public Builder setMinPcmBufferDurationUs(int i) {
            this.minPcmBufferDurationUs = i;
            return this;
        }

        public Builder setMaxPcmBufferDurationUs(int i) {
            this.maxPcmBufferDurationUs = i;
            return this;
        }

        public Builder setPcmBufferMultiplicationFactor(int i) {
            this.pcmBufferMultiplicationFactor = i;
            return this;
        }

        public Builder setPassthroughBufferDurationUs(int i) {
            this.passthroughBufferDurationUs = i;
            return this;
        }

        public Builder setOffloadBufferDurationUs(int i) {
            this.offloadBufferDurationUs = i;
            return this;
        }

        public Builder setAc3BufferMultiplicationFactor(int i) {
            this.ac3BufferMultiplicationFactor = i;
            return this;
        }

        public DefaultAudioTrackBufferSizeProvider build() {
            return new DefaultAudioTrackBufferSizeProvider(this);
        }
    }

    protected DefaultAudioTrackBufferSizeProvider(Builder builder) {
        this.minPcmBufferDurationUs = builder.minPcmBufferDurationUs;
        this.maxPcmBufferDurationUs = builder.maxPcmBufferDurationUs;
        this.pcmBufferMultiplicationFactor = builder.pcmBufferMultiplicationFactor;
        this.passthroughBufferDurationUs = builder.passthroughBufferDurationUs;
        this.offloadBufferDurationUs = builder.offloadBufferDurationUs;
        this.ac3BufferMultiplicationFactor = builder.ac3BufferMultiplicationFactor;
    }

    @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.AudioTrackBufferSizeProvider
    public int getBufferSizeInBytes(int i, int i2, int i3, int i4, int i5, double d) {
        return (((Math.max(i, (int) (get1xBufferSizeInBytes(i, i2, i3, i4, i5) * d)) + i4) - 1) / i4) * i4;
    }

    protected int get1xBufferSizeInBytes(int i, int i2, int i3, int i4, int i5) {
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    return getPassthroughBufferSizeInBytes(i2);
                }
                throw new IllegalArgumentException();
            }
            return getOffloadBufferSizeInBytes(i2);
        }
        return getPcmBufferSizeInBytes(i, i5, i4);
    }

    protected int getPcmBufferSizeInBytes(int i, int i2, int i3) {
        return Util.constrainValue(i * this.pcmBufferMultiplicationFactor, durationUsToBytes(this.minPcmBufferDurationUs, i2, i3), durationUsToBytes(this.maxPcmBufferDurationUs, i2, i3));
    }

    protected int getPassthroughBufferSizeInBytes(int i) {
        int i2 = this.passthroughBufferDurationUs;
        if (i == 5) {
            i2 *= this.ac3BufferMultiplicationFactor;
        }
        return Ints.checkedCast((i2 * getMaximumEncodedRateBytesPerSecond(i)) / 1000000);
    }

    protected int getOffloadBufferSizeInBytes(int i) {
        return Ints.checkedCast((this.offloadBufferDurationUs * getMaximumEncodedRateBytesPerSecond(i)) / 1000000);
    }

    protected static int durationUsToBytes(int i, int i2, int i3) {
        return Ints.checkedCast(((i * i2) * i3) / 1000000);
    }

    protected static int getMaximumEncodedRateBytesPerSecond(int i) {
        switch (i) {
            case 5:
                return Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND;
            case 6:
            case 18:
                return Ac3Util.E_AC3_MAX_RATE_BYTES_PER_SECOND;
            case 7:
                return DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND;
            case 8:
                return DtsUtil.DTS_HD_MAX_RATE_BYTES_PER_SECOND;
            case 9:
                return MpegAudioUtil.MAX_RATE_BYTES_PER_SECOND;
            case 10:
                return 100000;
            case 11:
                return AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND;
            case 12:
                return AacUtil.AAC_HE_V2_MAX_RATE_BYTES_PER_SECOND;
            case 13:
            default:
                throw new IllegalArgumentException();
            case 14:
                return Ac3Util.TRUEHD_MAX_RATE_BYTES_PER_SECOND;
            case 15:
                return 8000;
            case 16:
                return AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND;
            case 17:
                return Ac4Util.MAX_RATE_BYTES_PER_SECOND;
        }
    }
}
