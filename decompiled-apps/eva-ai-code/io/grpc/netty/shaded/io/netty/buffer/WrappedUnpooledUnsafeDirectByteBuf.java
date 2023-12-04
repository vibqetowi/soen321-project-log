package io.grpc.netty.shaded.io.netty.buffer;

import io.grpc.netty.shaded.io.netty.util.internal.PlatformDependent;
import java.nio.ByteBuffer;
/* loaded from: classes4.dex */
final class WrappedUnpooledUnsafeDirectByteBuf extends UnpooledUnsafeDirectByteBuf {
    /* JADX INFO: Access modifiers changed from: package-private */
    public WrappedUnpooledUnsafeDirectByteBuf(ByteBufAllocator byteBufAllocator, long j, int i, boolean z) {
        super(byteBufAllocator, PlatformDependent.directBuffer(j, i), i, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.buffer.UnpooledDirectByteBuf
    public void freeDirect(ByteBuffer byteBuffer) {
        PlatformDependent.freeMemory(this.memoryAddress);
    }
}
