package io.grpc.netty.shaded.io.netty.buffer.search;

import io.grpc.netty.shaded.io.netty.util.internal.PlatformDependent;
/* loaded from: classes4.dex */
public class BitapSearchProcessorFactory extends AbstractSearchProcessorFactory {
    private final long[] bitMasks = new long[256];
    private final long successBit;

    /* loaded from: classes4.dex */
    public static class Processor implements SearchProcessor {
        private final long[] bitMasks;
        private long currentMask;
        private final long successBit;

        Processor(long[] jArr, long j) {
            this.bitMasks = jArr;
            this.successBit = j;
        }

        @Override // io.grpc.netty.shaded.io.netty.util.ByteProcessor
        public boolean process(byte b) {
            long j = ((this.currentMask << 1) | 1) & PlatformDependent.getLong(this.bitMasks, b & 255);
            this.currentMask = j;
            return (j & this.successBit) == 0;
        }

        @Override // io.grpc.netty.shaded.io.netty.buffer.search.SearchProcessor
        public void reset() {
            this.currentMask = 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BitapSearchProcessorFactory(byte[] bArr) {
        if (bArr.length > 64) {
            throw new IllegalArgumentException("Maximum supported search pattern length is 64, got " + bArr.length);
        }
        long j = 1;
        for (byte b : bArr) {
            long[] jArr = this.bitMasks;
            int i = b & 255;
            jArr[i] = jArr[i] | j;
            j <<= 1;
        }
        this.successBit = 1 << (bArr.length - 1);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.search.SearchProcessorFactory
    public Processor newSearchProcessor() {
        return new Processor(this.bitMasks, this.successBit);
    }
}
