package io.grpc.netty.shaded.io.netty.buffer;

import io.grpc.netty.shaded.io.netty.util.ByteProcessor;
import io.grpc.netty.shaded.io.netty.util.internal.ObjectPool;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class PooledDuplicatedByteBuf extends AbstractPooledDerivedByteBuf {
    private static final ObjectPool<PooledDuplicatedByteBuf> RECYCLER = ObjectPool.newPool(new ObjectPool.ObjectCreator<PooledDuplicatedByteBuf>() { // from class: io.grpc.netty.shaded.io.netty.buffer.PooledDuplicatedByteBuf.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.grpc.netty.shaded.io.netty.util.internal.ObjectPool.ObjectCreator
        public PooledDuplicatedByteBuf newObject(ObjectPool.Handle<PooledDuplicatedByteBuf> handle) {
            return new PooledDuplicatedByteBuf(handle);
        }
    });

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PooledDuplicatedByteBuf newInstance(AbstractByteBuf abstractByteBuf, ByteBuf byteBuf, int i, int i2) {
        PooledDuplicatedByteBuf pooledDuplicatedByteBuf = RECYCLER.get();
        pooledDuplicatedByteBuf.init(abstractByteBuf, byteBuf, i, i2, abstractByteBuf.maxCapacity());
        pooledDuplicatedByteBuf.markReaderIndex();
        pooledDuplicatedByteBuf.markWriterIndex();
        return pooledDuplicatedByteBuf;
    }

    private PooledDuplicatedByteBuf(ObjectPool.Handle<PooledDuplicatedByteBuf> handle) {
        super(handle);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public int capacity() {
        return unwrap().capacity();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf capacity(int i) {
        unwrap().capacity(i);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public int arrayOffset() {
        return unwrap().arrayOffset();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public long memoryAddress() {
        return unwrap().memoryAddress();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuffer nioBuffer(int i, int i2) {
        return unwrap().nioBuffer(i, i2);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuffer[] nioBuffers(int i, int i2) {
        return unwrap().nioBuffers(i, i2);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf copy(int i, int i2) {
        return unwrap().copy(i, i2);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.AbstractByteBuf, io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf retainedSlice(int i, int i2) {
        return PooledSlicedByteBuf.newInstance(unwrap(), this, i, i2);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.AbstractByteBuf, io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf duplicate() {
        return duplicate0().setIndex(readerIndex(), writerIndex());
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.AbstractByteBuf, io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf retainedDuplicate() {
        return newInstance(unwrap(), this, readerIndex(), writerIndex());
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.AbstractByteBuf, io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public byte getByte(int i) {
        return unwrap().getByte(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.buffer.AbstractByteBuf
    public byte _getByte(int i) {
        return unwrap()._getByte(i);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.AbstractByteBuf, io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public short getShort(int i) {
        return unwrap().getShort(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.buffer.AbstractByteBuf
    public short _getShort(int i) {
        return unwrap()._getShort(i);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.AbstractByteBuf, io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public short getShortLE(int i) {
        return unwrap().getShortLE(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.buffer.AbstractByteBuf
    public short _getShortLE(int i) {
        return unwrap()._getShortLE(i);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.AbstractByteBuf, io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public int getUnsignedMedium(int i) {
        return unwrap().getUnsignedMedium(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.buffer.AbstractByteBuf
    public int _getUnsignedMedium(int i) {
        return unwrap()._getUnsignedMedium(i);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.AbstractByteBuf, io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public int getUnsignedMediumLE(int i) {
        return unwrap().getUnsignedMediumLE(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.buffer.AbstractByteBuf
    public int _getUnsignedMediumLE(int i) {
        return unwrap()._getUnsignedMediumLE(i);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.AbstractByteBuf, io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public int getInt(int i) {
        return unwrap().getInt(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.buffer.AbstractByteBuf
    public int _getInt(int i) {
        return unwrap()._getInt(i);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.AbstractByteBuf, io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public int getIntLE(int i) {
        return unwrap().getIntLE(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.buffer.AbstractByteBuf
    public int _getIntLE(int i) {
        return unwrap()._getIntLE(i);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.AbstractByteBuf, io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public long getLong(int i) {
        return unwrap().getLong(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.buffer.AbstractByteBuf
    public long _getLong(int i) {
        return unwrap()._getLong(i);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.AbstractByteBuf, io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public long getLongLE(int i) {
        return unwrap().getLongLE(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.buffer.AbstractByteBuf
    public long _getLongLE(int i) {
        return unwrap()._getLongLE(i);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf getBytes(int i, ByteBuf byteBuf, int i2, int i3) {
        unwrap().getBytes(i, byteBuf, i2, i3);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf getBytes(int i, byte[] bArr, int i2, int i3) {
        unwrap().getBytes(i, bArr, i2, i3);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf getBytes(int i, ByteBuffer byteBuffer) {
        unwrap().getBytes(i, byteBuffer);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.AbstractByteBuf, io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf setByte(int i, int i2) {
        unwrap().setByte(i, i2);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.buffer.AbstractByteBuf
    public void _setByte(int i, int i2) {
        unwrap()._setByte(i, i2);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.AbstractByteBuf, io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf setShort(int i, int i2) {
        unwrap().setShort(i, i2);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.buffer.AbstractByteBuf
    public void _setShort(int i, int i2) {
        unwrap()._setShort(i, i2);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.AbstractByteBuf, io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf setShortLE(int i, int i2) {
        unwrap().setShortLE(i, i2);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.buffer.AbstractByteBuf
    public void _setShortLE(int i, int i2) {
        unwrap()._setShortLE(i, i2);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.AbstractByteBuf, io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf setMedium(int i, int i2) {
        unwrap().setMedium(i, i2);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.buffer.AbstractByteBuf
    public void _setMedium(int i, int i2) {
        unwrap()._setMedium(i, i2);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.AbstractByteBuf, io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf setMediumLE(int i, int i2) {
        unwrap().setMediumLE(i, i2);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.buffer.AbstractByteBuf
    public void _setMediumLE(int i, int i2) {
        unwrap()._setMediumLE(i, i2);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.AbstractByteBuf, io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf setInt(int i, int i2) {
        unwrap().setInt(i, i2);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.buffer.AbstractByteBuf
    public void _setInt(int i, int i2) {
        unwrap()._setInt(i, i2);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.AbstractByteBuf, io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf setIntLE(int i, int i2) {
        unwrap().setIntLE(i, i2);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.buffer.AbstractByteBuf
    public void _setIntLE(int i, int i2) {
        unwrap()._setIntLE(i, i2);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.AbstractByteBuf, io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf setLong(int i, long j) {
        unwrap().setLong(i, j);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.buffer.AbstractByteBuf
    public void _setLong(int i, long j) {
        unwrap()._setLong(i, j);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.AbstractByteBuf, io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf setLongLE(int i, long j) {
        unwrap().setLongLE(i, j);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.buffer.AbstractByteBuf
    public void _setLongLE(int i, long j) {
        unwrap().setLongLE(i, j);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf setBytes(int i, byte[] bArr, int i2, int i3) {
        unwrap().setBytes(i, bArr, i2, i3);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf setBytes(int i, ByteBuf byteBuf, int i2, int i3) {
        unwrap().setBytes(i, byteBuf, i2, i3);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf setBytes(int i, ByteBuffer byteBuffer) {
        unwrap().setBytes(i, byteBuffer);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf getBytes(int i, OutputStream outputStream, int i2) throws IOException {
        unwrap().getBytes(i, outputStream, i2);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public int getBytes(int i, GatheringByteChannel gatheringByteChannel, int i2) throws IOException {
        return unwrap().getBytes(i, gatheringByteChannel, i2);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public int getBytes(int i, FileChannel fileChannel, long j, int i2) throws IOException {
        return unwrap().getBytes(i, fileChannel, j, i2);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public int setBytes(int i, InputStream inputStream, int i2) throws IOException {
        return unwrap().setBytes(i, inputStream, i2);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public int setBytes(int i, ScatteringByteChannel scatteringByteChannel, int i2) throws IOException {
        return unwrap().setBytes(i, scatteringByteChannel, i2);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public int setBytes(int i, FileChannel fileChannel, long j, int i2) throws IOException {
        return unwrap().setBytes(i, fileChannel, j, i2);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.AbstractByteBuf, io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public int forEachByte(int i, int i2, ByteProcessor byteProcessor) {
        return unwrap().forEachByte(i, i2, byteProcessor);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.AbstractByteBuf, io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public int forEachByteDesc(int i, int i2, ByteProcessor byteProcessor) {
        return unwrap().forEachByteDesc(i, i2, byteProcessor);
    }
}
