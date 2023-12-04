package io.grpc.netty.shaded.io.netty.channel.unix;

import io.grpc.netty.shaded.io.netty.buffer.ByteBuf;
import io.grpc.netty.shaded.io.netty.buffer.ByteBufAllocator;
import io.grpc.netty.shaded.io.netty.buffer.CompositeByteBuf;
/* loaded from: classes4.dex */
public final class PreferredDirectByteBufAllocator implements ByteBufAllocator {
    private ByteBufAllocator allocator;

    public void updateAllocator(ByteBufAllocator byteBufAllocator) {
        this.allocator = byteBufAllocator;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBufAllocator
    public ByteBuf buffer() {
        return this.allocator.directBuffer();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBufAllocator
    public ByteBuf buffer(int i) {
        return this.allocator.directBuffer(i);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBufAllocator
    public ByteBuf buffer(int i, int i2) {
        return this.allocator.directBuffer(i, i2);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBufAllocator
    public ByteBuf ioBuffer() {
        return this.allocator.directBuffer();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBufAllocator
    public ByteBuf ioBuffer(int i) {
        return this.allocator.directBuffer(i);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBufAllocator
    public ByteBuf ioBuffer(int i, int i2) {
        return this.allocator.directBuffer(i, i2);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBufAllocator
    public ByteBuf heapBuffer() {
        return this.allocator.heapBuffer();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBufAllocator
    public ByteBuf heapBuffer(int i) {
        return this.allocator.heapBuffer(i);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBufAllocator
    public ByteBuf heapBuffer(int i, int i2) {
        return this.allocator.heapBuffer(i, i2);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBufAllocator
    public ByteBuf directBuffer() {
        return this.allocator.directBuffer();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBufAllocator
    public ByteBuf directBuffer(int i) {
        return this.allocator.directBuffer(i);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBufAllocator
    public ByteBuf directBuffer(int i, int i2) {
        return this.allocator.directBuffer(i, i2);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBufAllocator
    public CompositeByteBuf compositeBuffer() {
        return this.allocator.compositeDirectBuffer();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBufAllocator
    public CompositeByteBuf compositeBuffer(int i) {
        return this.allocator.compositeDirectBuffer(i);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBufAllocator
    public CompositeByteBuf compositeHeapBuffer() {
        return this.allocator.compositeHeapBuffer();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBufAllocator
    public CompositeByteBuf compositeHeapBuffer(int i) {
        return this.allocator.compositeHeapBuffer(i);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBufAllocator
    public CompositeByteBuf compositeDirectBuffer() {
        return this.allocator.compositeDirectBuffer();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBufAllocator
    public CompositeByteBuf compositeDirectBuffer(int i) {
        return this.allocator.compositeDirectBuffer(i);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBufAllocator
    public boolean isDirectBufferPooled() {
        return this.allocator.isDirectBufferPooled();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBufAllocator
    public int calculateNewCapacity(int i, int i2) {
        return this.allocator.calculateNewCapacity(i, i2);
    }
}
