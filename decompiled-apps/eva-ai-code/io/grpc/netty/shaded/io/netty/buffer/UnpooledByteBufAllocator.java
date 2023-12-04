package io.grpc.netty.shaded.io.netty.buffer;

import io.grpc.netty.shaded.io.netty.util.internal.LongCounter;
import io.grpc.netty.shaded.io.netty.util.internal.PlatformDependent;
import io.grpc.netty.shaded.io.netty.util.internal.StringUtil;
import java.nio.ByteBuffer;
/* loaded from: classes4.dex */
public final class UnpooledByteBufAllocator extends AbstractByteBufAllocator implements ByteBufAllocatorMetricProvider {
    public static final UnpooledByteBufAllocator DEFAULT = new UnpooledByteBufAllocator(PlatformDependent.directBufferPreferred());
    private final boolean disableLeakDetector;
    private final UnpooledByteBufAllocatorMetric metric;
    private final boolean noCleaner;

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBufAllocator
    public boolean isDirectBufferPooled() {
        return false;
    }

    public UnpooledByteBufAllocator(boolean z) {
        this(z, false);
    }

    public UnpooledByteBufAllocator(boolean z, boolean z2) {
        this(z, z2, PlatformDependent.useDirectBufferNoCleaner());
    }

    public UnpooledByteBufAllocator(boolean z, boolean z2, boolean z3) {
        super(z);
        this.metric = new UnpooledByteBufAllocatorMetric();
        this.disableLeakDetector = z2;
        this.noCleaner = z3 && PlatformDependent.hasUnsafe() && PlatformDependent.hasDirectBufferNoCleanerConstructor();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.AbstractByteBufAllocator
    protected ByteBuf newHeapBuffer(int i, int i2) {
        return PlatformDependent.hasUnsafe() ? new InstrumentedUnpooledUnsafeHeapByteBuf(this, i, i2) : new InstrumentedUnpooledHeapByteBuf(this, i, i2);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.AbstractByteBufAllocator
    protected ByteBuf newDirectBuffer(int i, int i2) {
        ByteBuf instrumentedUnpooledDirectByteBuf;
        if (PlatformDependent.hasUnsafe()) {
            instrumentedUnpooledDirectByteBuf = this.noCleaner ? new InstrumentedUnpooledUnsafeNoCleanerDirectByteBuf(this, i, i2) : new InstrumentedUnpooledUnsafeDirectByteBuf(this, i, i2);
        } else {
            instrumentedUnpooledDirectByteBuf = new InstrumentedUnpooledDirectByteBuf(this, i, i2);
        }
        return this.disableLeakDetector ? instrumentedUnpooledDirectByteBuf : toLeakAwareBuffer(instrumentedUnpooledDirectByteBuf);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.AbstractByteBufAllocator, io.grpc.netty.shaded.io.netty.buffer.ByteBufAllocator
    public CompositeByteBuf compositeHeapBuffer(int i) {
        CompositeByteBuf compositeByteBuf = new CompositeByteBuf(this, false, i);
        return this.disableLeakDetector ? compositeByteBuf : toLeakAwareBuffer(compositeByteBuf);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.AbstractByteBufAllocator, io.grpc.netty.shaded.io.netty.buffer.ByteBufAllocator
    public CompositeByteBuf compositeDirectBuffer(int i) {
        CompositeByteBuf compositeByteBuf = new CompositeByteBuf(this, true, i);
        return this.disableLeakDetector ? compositeByteBuf : toLeakAwareBuffer(compositeByteBuf);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBufAllocatorMetricProvider
    public ByteBufAllocatorMetric metric() {
        return this.metric;
    }

    void incrementDirect(int i) {
        this.metric.directCounter.add(i);
    }

    void decrementDirect(int i) {
        this.metric.directCounter.add(-i);
    }

    void incrementHeap(int i) {
        this.metric.heapCounter.add(i);
    }

    void decrementHeap(int i) {
        this.metric.heapCounter.add(-i);
    }

    /* loaded from: classes4.dex */
    private static final class InstrumentedUnpooledUnsafeHeapByteBuf extends UnpooledUnsafeHeapByteBuf {
        InstrumentedUnpooledUnsafeHeapByteBuf(UnpooledByteBufAllocator unpooledByteBufAllocator, int i, int i2) {
            super(unpooledByteBufAllocator, i, i2);
        }

        @Override // io.grpc.netty.shaded.io.netty.buffer.UnpooledUnsafeHeapByteBuf, io.grpc.netty.shaded.io.netty.buffer.UnpooledHeapByteBuf
        protected byte[] allocateArray(int i) {
            byte[] allocateArray = super.allocateArray(i);
            ((UnpooledByteBufAllocator) alloc()).incrementHeap(allocateArray.length);
            return allocateArray;
        }

        @Override // io.grpc.netty.shaded.io.netty.buffer.UnpooledHeapByteBuf
        protected void freeArray(byte[] bArr) {
            int length = bArr.length;
            super.freeArray(bArr);
            ((UnpooledByteBufAllocator) alloc()).decrementHeap(length);
        }
    }

    /* loaded from: classes4.dex */
    private static final class InstrumentedUnpooledHeapByteBuf extends UnpooledHeapByteBuf {
        InstrumentedUnpooledHeapByteBuf(UnpooledByteBufAllocator unpooledByteBufAllocator, int i, int i2) {
            super(unpooledByteBufAllocator, i, i2);
        }

        @Override // io.grpc.netty.shaded.io.netty.buffer.UnpooledHeapByteBuf
        protected byte[] allocateArray(int i) {
            byte[] allocateArray = super.allocateArray(i);
            ((UnpooledByteBufAllocator) alloc()).incrementHeap(allocateArray.length);
            return allocateArray;
        }

        @Override // io.grpc.netty.shaded.io.netty.buffer.UnpooledHeapByteBuf
        protected void freeArray(byte[] bArr) {
            int length = bArr.length;
            super.freeArray(bArr);
            ((UnpooledByteBufAllocator) alloc()).decrementHeap(length);
        }
    }

    /* loaded from: classes4.dex */
    private static final class InstrumentedUnpooledUnsafeNoCleanerDirectByteBuf extends UnpooledUnsafeNoCleanerDirectByteBuf {
        InstrumentedUnpooledUnsafeNoCleanerDirectByteBuf(UnpooledByteBufAllocator unpooledByteBufAllocator, int i, int i2) {
            super(unpooledByteBufAllocator, i, i2);
        }

        @Override // io.grpc.netty.shaded.io.netty.buffer.UnpooledUnsafeNoCleanerDirectByteBuf, io.grpc.netty.shaded.io.netty.buffer.UnpooledDirectByteBuf
        protected ByteBuffer allocateDirect(int i) {
            ByteBuffer allocateDirect = super.allocateDirect(i);
            ((UnpooledByteBufAllocator) alloc()).incrementDirect(allocateDirect.capacity());
            return allocateDirect;
        }

        @Override // io.grpc.netty.shaded.io.netty.buffer.UnpooledUnsafeNoCleanerDirectByteBuf
        ByteBuffer reallocateDirect(ByteBuffer byteBuffer, int i) {
            int capacity = byteBuffer.capacity();
            ByteBuffer reallocateDirect = super.reallocateDirect(byteBuffer, i);
            ((UnpooledByteBufAllocator) alloc()).incrementDirect(reallocateDirect.capacity() - capacity);
            return reallocateDirect;
        }

        @Override // io.grpc.netty.shaded.io.netty.buffer.UnpooledUnsafeNoCleanerDirectByteBuf, io.grpc.netty.shaded.io.netty.buffer.UnpooledDirectByteBuf
        protected void freeDirect(ByteBuffer byteBuffer) {
            int capacity = byteBuffer.capacity();
            super.freeDirect(byteBuffer);
            ((UnpooledByteBufAllocator) alloc()).decrementDirect(capacity);
        }
    }

    /* loaded from: classes4.dex */
    private static final class InstrumentedUnpooledUnsafeDirectByteBuf extends UnpooledUnsafeDirectByteBuf {
        InstrumentedUnpooledUnsafeDirectByteBuf(UnpooledByteBufAllocator unpooledByteBufAllocator, int i, int i2) {
            super(unpooledByteBufAllocator, i, i2);
        }

        @Override // io.grpc.netty.shaded.io.netty.buffer.UnpooledDirectByteBuf
        protected ByteBuffer allocateDirect(int i) {
            ByteBuffer allocateDirect = super.allocateDirect(i);
            ((UnpooledByteBufAllocator) alloc()).incrementDirect(allocateDirect.capacity());
            return allocateDirect;
        }

        @Override // io.grpc.netty.shaded.io.netty.buffer.UnpooledDirectByteBuf
        protected void freeDirect(ByteBuffer byteBuffer) {
            int capacity = byteBuffer.capacity();
            super.freeDirect(byteBuffer);
            ((UnpooledByteBufAllocator) alloc()).decrementDirect(capacity);
        }
    }

    /* loaded from: classes4.dex */
    private static final class InstrumentedUnpooledDirectByteBuf extends UnpooledDirectByteBuf {
        InstrumentedUnpooledDirectByteBuf(UnpooledByteBufAllocator unpooledByteBufAllocator, int i, int i2) {
            super(unpooledByteBufAllocator, i, i2);
        }

        @Override // io.grpc.netty.shaded.io.netty.buffer.UnpooledDirectByteBuf
        protected ByteBuffer allocateDirect(int i) {
            ByteBuffer allocateDirect = super.allocateDirect(i);
            ((UnpooledByteBufAllocator) alloc()).incrementDirect(allocateDirect.capacity());
            return allocateDirect;
        }

        @Override // io.grpc.netty.shaded.io.netty.buffer.UnpooledDirectByteBuf
        protected void freeDirect(ByteBuffer byteBuffer) {
            int capacity = byteBuffer.capacity();
            super.freeDirect(byteBuffer);
            ((UnpooledByteBufAllocator) alloc()).decrementDirect(capacity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class UnpooledByteBufAllocatorMetric implements ByteBufAllocatorMetric {
        final LongCounter directCounter;
        final LongCounter heapCounter;

        private UnpooledByteBufAllocatorMetric() {
            this.directCounter = PlatformDependent.newLongCounter();
            this.heapCounter = PlatformDependent.newLongCounter();
        }

        @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBufAllocatorMetric
        public long usedHeapMemory() {
            return this.heapCounter.value();
        }

        @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBufAllocatorMetric
        public long usedDirectMemory() {
            return this.directCounter.value();
        }

        public String toString() {
            return StringUtil.simpleClassName(this) + "(usedHeapMemory: " + usedHeapMemory() + "; usedDirectMemory: " + usedDirectMemory() + ')';
        }
    }
}
