package io.grpc.netty.shaded.io.netty.buffer;

import io.grpc.netty.shaded.io.netty.util.ByteProcessor;
import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
import io.grpc.netty.shaded.io.netty.util.internal.StringUtil;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class WrappedByteBuf extends ByteBuf {
    protected final ByteBuf buf;

    /* JADX INFO: Access modifiers changed from: protected */
    public WrappedByteBuf(ByteBuf byteBuf) {
        this.buf = (ByteBuf) ObjectUtil.checkNotNull(byteBuf, "buf");
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public final boolean hasMemoryAddress() {
        return this.buf.hasMemoryAddress();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public boolean isContiguous() {
        return this.buf.isContiguous();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public final long memoryAddress() {
        return this.buf.memoryAddress();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public final int capacity() {
        return this.buf.capacity();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf capacity(int i) {
        this.buf.capacity(i);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public final int maxCapacity() {
        return this.buf.maxCapacity();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public final ByteBufAllocator alloc() {
        return this.buf.alloc();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public final ByteOrder order() {
        return this.buf.order();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf order(ByteOrder byteOrder) {
        return this.buf.order(byteOrder);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public final ByteBuf unwrap() {
        return this.buf;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf asReadOnly() {
        return this.buf.asReadOnly();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public boolean isReadOnly() {
        return this.buf.isReadOnly();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public final boolean isDirect() {
        return this.buf.isDirect();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public final int readerIndex() {
        return this.buf.readerIndex();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public final ByteBuf readerIndex(int i) {
        this.buf.readerIndex(i);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public final int writerIndex() {
        return this.buf.writerIndex();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public final ByteBuf writerIndex(int i) {
        this.buf.writerIndex(i);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf setIndex(int i, int i2) {
        this.buf.setIndex(i, i2);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public final int readableBytes() {
        return this.buf.readableBytes();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public final int writableBytes() {
        return this.buf.writableBytes();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public final int maxWritableBytes() {
        return this.buf.maxWritableBytes();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public int maxFastWritableBytes() {
        return this.buf.maxFastWritableBytes();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public final boolean isReadable() {
        return this.buf.isReadable();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public final boolean isWritable() {
        return this.buf.isWritable();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public final ByteBuf clear() {
        this.buf.clear();
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public final ByteBuf markReaderIndex() {
        this.buf.markReaderIndex();
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public final ByteBuf resetReaderIndex() {
        this.buf.resetReaderIndex();
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public final ByteBuf markWriterIndex() {
        this.buf.markWriterIndex();
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public final ByteBuf resetWriterIndex() {
        this.buf.resetWriterIndex();
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf discardReadBytes() {
        this.buf.discardReadBytes();
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf discardSomeReadBytes() {
        this.buf.discardSomeReadBytes();
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf ensureWritable(int i) {
        this.buf.ensureWritable(i);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public int ensureWritable(int i, boolean z) {
        return this.buf.ensureWritable(i, z);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public boolean getBoolean(int i) {
        return this.buf.getBoolean(i);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public byte getByte(int i) {
        return this.buf.getByte(i);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public short getUnsignedByte(int i) {
        return this.buf.getUnsignedByte(i);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public short getShort(int i) {
        return this.buf.getShort(i);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public short getShortLE(int i) {
        return this.buf.getShortLE(i);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public int getUnsignedShort(int i) {
        return this.buf.getUnsignedShort(i);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public int getUnsignedShortLE(int i) {
        return this.buf.getUnsignedShortLE(i);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public int getMedium(int i) {
        return this.buf.getMedium(i);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public int getMediumLE(int i) {
        return this.buf.getMediumLE(i);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public int getUnsignedMedium(int i) {
        return this.buf.getUnsignedMedium(i);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public int getUnsignedMediumLE(int i) {
        return this.buf.getUnsignedMediumLE(i);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public int getInt(int i) {
        return this.buf.getInt(i);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public int getIntLE(int i) {
        return this.buf.getIntLE(i);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public long getUnsignedInt(int i) {
        return this.buf.getUnsignedInt(i);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public long getUnsignedIntLE(int i) {
        return this.buf.getUnsignedIntLE(i);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public long getLong(int i) {
        return this.buf.getLong(i);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public long getLongLE(int i) {
        return this.buf.getLongLE(i);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public char getChar(int i) {
        return this.buf.getChar(i);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public float getFloat(int i) {
        return this.buf.getFloat(i);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public double getDouble(int i) {
        return this.buf.getDouble(i);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf getBytes(int i, ByteBuf byteBuf) {
        this.buf.getBytes(i, byteBuf);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf getBytes(int i, ByteBuf byteBuf, int i2) {
        this.buf.getBytes(i, byteBuf, i2);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf getBytes(int i, ByteBuf byteBuf, int i2, int i3) {
        this.buf.getBytes(i, byteBuf, i2, i3);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf getBytes(int i, byte[] bArr) {
        this.buf.getBytes(i, bArr);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf getBytes(int i, byte[] bArr, int i2, int i3) {
        this.buf.getBytes(i, bArr, i2, i3);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf getBytes(int i, ByteBuffer byteBuffer) {
        this.buf.getBytes(i, byteBuffer);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf getBytes(int i, OutputStream outputStream, int i2) throws IOException {
        this.buf.getBytes(i, outputStream, i2);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public int getBytes(int i, GatheringByteChannel gatheringByteChannel, int i2) throws IOException {
        return this.buf.getBytes(i, gatheringByteChannel, i2);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public int getBytes(int i, FileChannel fileChannel, long j, int i2) throws IOException {
        return this.buf.getBytes(i, fileChannel, j, i2);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public CharSequence getCharSequence(int i, int i2, Charset charset) {
        return this.buf.getCharSequence(i, i2, charset);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf setBoolean(int i, boolean z) {
        this.buf.setBoolean(i, z);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf setByte(int i, int i2) {
        this.buf.setByte(i, i2);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf setShort(int i, int i2) {
        this.buf.setShort(i, i2);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf setShortLE(int i, int i2) {
        this.buf.setShortLE(i, i2);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf setMedium(int i, int i2) {
        this.buf.setMedium(i, i2);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf setMediumLE(int i, int i2) {
        this.buf.setMediumLE(i, i2);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf setInt(int i, int i2) {
        this.buf.setInt(i, i2);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf setIntLE(int i, int i2) {
        this.buf.setIntLE(i, i2);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf setLong(int i, long j) {
        this.buf.setLong(i, j);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf setLongLE(int i, long j) {
        this.buf.setLongLE(i, j);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf setChar(int i, int i2) {
        this.buf.setChar(i, i2);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf setFloat(int i, float f) {
        this.buf.setFloat(i, f);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf setDouble(int i, double d) {
        this.buf.setDouble(i, d);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf setBytes(int i, ByteBuf byteBuf) {
        this.buf.setBytes(i, byteBuf);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf setBytes(int i, ByteBuf byteBuf, int i2) {
        this.buf.setBytes(i, byteBuf, i2);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf setBytes(int i, ByteBuf byteBuf, int i2, int i3) {
        this.buf.setBytes(i, byteBuf, i2, i3);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf setBytes(int i, byte[] bArr) {
        this.buf.setBytes(i, bArr);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf setBytes(int i, byte[] bArr, int i2, int i3) {
        this.buf.setBytes(i, bArr, i2, i3);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf setBytes(int i, ByteBuffer byteBuffer) {
        this.buf.setBytes(i, byteBuffer);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public int setBytes(int i, InputStream inputStream, int i2) throws IOException {
        return this.buf.setBytes(i, inputStream, i2);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public int setBytes(int i, ScatteringByteChannel scatteringByteChannel, int i2) throws IOException {
        return this.buf.setBytes(i, scatteringByteChannel, i2);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public int setBytes(int i, FileChannel fileChannel, long j, int i2) throws IOException {
        return this.buf.setBytes(i, fileChannel, j, i2);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf setZero(int i, int i2) {
        this.buf.setZero(i, i2);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public int setCharSequence(int i, CharSequence charSequence, Charset charset) {
        return this.buf.setCharSequence(i, charSequence, charset);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public boolean readBoolean() {
        return this.buf.readBoolean();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public byte readByte() {
        return this.buf.readByte();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public short readUnsignedByte() {
        return this.buf.readUnsignedByte();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public short readShort() {
        return this.buf.readShort();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public short readShortLE() {
        return this.buf.readShortLE();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public int readUnsignedShort() {
        return this.buf.readUnsignedShort();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public int readUnsignedShortLE() {
        return this.buf.readUnsignedShortLE();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public int readMedium() {
        return this.buf.readMedium();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public int readMediumLE() {
        return this.buf.readMediumLE();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public int readUnsignedMedium() {
        return this.buf.readUnsignedMedium();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public int readUnsignedMediumLE() {
        return this.buf.readUnsignedMediumLE();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public int readInt() {
        return this.buf.readInt();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public int readIntLE() {
        return this.buf.readIntLE();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public long readUnsignedInt() {
        return this.buf.readUnsignedInt();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public long readUnsignedIntLE() {
        return this.buf.readUnsignedIntLE();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public long readLong() {
        return this.buf.readLong();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public long readLongLE() {
        return this.buf.readLongLE();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public char readChar() {
        return this.buf.readChar();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public float readFloat() {
        return this.buf.readFloat();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public double readDouble() {
        return this.buf.readDouble();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf readBytes(int i) {
        return this.buf.readBytes(i);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf readSlice(int i) {
        return this.buf.readSlice(i);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf readRetainedSlice(int i) {
        return this.buf.readRetainedSlice(i);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf readBytes(ByteBuf byteBuf) {
        this.buf.readBytes(byteBuf);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf readBytes(ByteBuf byteBuf, int i) {
        this.buf.readBytes(byteBuf, i);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf readBytes(ByteBuf byteBuf, int i, int i2) {
        this.buf.readBytes(byteBuf, i, i2);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf readBytes(byte[] bArr) {
        this.buf.readBytes(bArr);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf readBytes(byte[] bArr, int i, int i2) {
        this.buf.readBytes(bArr, i, i2);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf readBytes(ByteBuffer byteBuffer) {
        this.buf.readBytes(byteBuffer);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf readBytes(OutputStream outputStream, int i) throws IOException {
        this.buf.readBytes(outputStream, i);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public int readBytes(GatheringByteChannel gatheringByteChannel, int i) throws IOException {
        return this.buf.readBytes(gatheringByteChannel, i);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public int readBytes(FileChannel fileChannel, long j, int i) throws IOException {
        return this.buf.readBytes(fileChannel, j, i);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public CharSequence readCharSequence(int i, Charset charset) {
        return this.buf.readCharSequence(i, charset);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf skipBytes(int i) {
        this.buf.skipBytes(i);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf writeBoolean(boolean z) {
        this.buf.writeBoolean(z);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf writeByte(int i) {
        this.buf.writeByte(i);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf writeShort(int i) {
        this.buf.writeShort(i);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf writeShortLE(int i) {
        this.buf.writeShortLE(i);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf writeMedium(int i) {
        this.buf.writeMedium(i);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf writeMediumLE(int i) {
        this.buf.writeMediumLE(i);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf writeInt(int i) {
        this.buf.writeInt(i);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf writeIntLE(int i) {
        this.buf.writeIntLE(i);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf writeLong(long j) {
        this.buf.writeLong(j);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf writeLongLE(long j) {
        this.buf.writeLongLE(j);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf writeChar(int i) {
        this.buf.writeChar(i);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf writeFloat(float f) {
        this.buf.writeFloat(f);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf writeDouble(double d) {
        this.buf.writeDouble(d);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf writeBytes(ByteBuf byteBuf) {
        this.buf.writeBytes(byteBuf);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf writeBytes(ByteBuf byteBuf, int i) {
        this.buf.writeBytes(byteBuf, i);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf writeBytes(ByteBuf byteBuf, int i, int i2) {
        this.buf.writeBytes(byteBuf, i, i2);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf writeBytes(byte[] bArr) {
        this.buf.writeBytes(bArr);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf writeBytes(byte[] bArr, int i, int i2) {
        this.buf.writeBytes(bArr, i, i2);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf writeBytes(ByteBuffer byteBuffer) {
        this.buf.writeBytes(byteBuffer);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public int writeBytes(InputStream inputStream, int i) throws IOException {
        return this.buf.writeBytes(inputStream, i);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public int writeBytes(ScatteringByteChannel scatteringByteChannel, int i) throws IOException {
        return this.buf.writeBytes(scatteringByteChannel, i);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public int writeBytes(FileChannel fileChannel, long j, int i) throws IOException {
        return this.buf.writeBytes(fileChannel, j, i);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf writeZero(int i) {
        this.buf.writeZero(i);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public int writeCharSequence(CharSequence charSequence, Charset charset) {
        return this.buf.writeCharSequence(charSequence, charset);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public int indexOf(int i, int i2, byte b) {
        return this.buf.indexOf(i, i2, b);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public int bytesBefore(byte b) {
        return this.buf.bytesBefore(b);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public int bytesBefore(int i, byte b) {
        return this.buf.bytesBefore(i, b);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public int bytesBefore(int i, int i2, byte b) {
        return this.buf.bytesBefore(i, i2, b);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public int forEachByte(ByteProcessor byteProcessor) {
        return this.buf.forEachByte(byteProcessor);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public int forEachByte(int i, int i2, ByteProcessor byteProcessor) {
        return this.buf.forEachByte(i, i2, byteProcessor);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public int forEachByteDesc(ByteProcessor byteProcessor) {
        return this.buf.forEachByteDesc(byteProcessor);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public int forEachByteDesc(int i, int i2, ByteProcessor byteProcessor) {
        return this.buf.forEachByteDesc(i, i2, byteProcessor);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf copy() {
        return this.buf.copy();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf copy(int i, int i2) {
        return this.buf.copy(i, i2);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf slice() {
        return this.buf.slice();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf retainedSlice() {
        return this.buf.retainedSlice();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf slice(int i, int i2) {
        return this.buf.slice(i, i2);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf retainedSlice(int i, int i2) {
        return this.buf.retainedSlice(i, i2);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf duplicate() {
        return this.buf.duplicate();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuf retainedDuplicate() {
        return this.buf.retainedDuplicate();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public int nioBufferCount() {
        return this.buf.nioBufferCount();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuffer nioBuffer() {
        return this.buf.nioBuffer();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuffer nioBuffer(int i, int i2) {
        return this.buf.nioBuffer(i, i2);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuffer[] nioBuffers() {
        return this.buf.nioBuffers();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuffer[] nioBuffers(int i, int i2) {
        return this.buf.nioBuffers(i, i2);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public ByteBuffer internalNioBuffer(int i, int i2) {
        return this.buf.internalNioBuffer(i, i2);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public boolean hasArray() {
        return this.buf.hasArray();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public byte[] array() {
        return this.buf.array();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public int arrayOffset() {
        return this.buf.arrayOffset();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public String toString(Charset charset) {
        return this.buf.toString(charset);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public String toString(int i, int i2, Charset charset) {
        return this.buf.toString(i, i2, charset);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public int hashCode() {
        return this.buf.hashCode();
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public boolean equals(Object obj) {
        return this.buf.equals(obj);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf, java.lang.Comparable
    public int compareTo(ByteBuf byteBuf) {
        return this.buf.compareTo(byteBuf);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public String toString() {
        return StringUtil.simpleClassName(this) + '(' + this.buf.toString() + ')';
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf, io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    public ByteBuf retain(int i) {
        this.buf.retain(i);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf, io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    public ByteBuf retain() {
        this.buf.retain();
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf, io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    public ByteBuf touch() {
        this.buf.touch();
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf, io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    public ByteBuf touch(Object obj) {
        this.buf.touch(obj);
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public final boolean isReadable(int i) {
        return this.buf.isReadable(i);
    }

    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public final boolean isWritable(int i) {
        return this.buf.isWritable(i);
    }

    @Override // io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    public final int refCnt() {
        return this.buf.refCnt();
    }

    @Override // io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    public boolean release() {
        return this.buf.release();
    }

    @Override // io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    public boolean release(int i) {
        return this.buf.release(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // io.grpc.netty.shaded.io.netty.buffer.ByteBuf
    public final boolean isAccessible() {
        return this.buf.isAccessible();
    }
}
