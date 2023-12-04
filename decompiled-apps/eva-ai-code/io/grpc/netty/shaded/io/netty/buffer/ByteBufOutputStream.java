package io.grpc.netty.shaded.io.netty.buffer;

import io.grpc.netty.shaded.io.netty.util.CharsetUtil;
import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
/* loaded from: classes4.dex */
public class ByteBufOutputStream extends OutputStream implements DataOutput {
    private final ByteBuf buffer;
    private final int startIndex;
    private DataOutputStream utf8out;

    public ByteBufOutputStream(ByteBuf byteBuf) {
        this.buffer = (ByteBuf) ObjectUtil.checkNotNull(byteBuf, "buffer");
        this.startIndex = byteBuf.writerIndex();
    }

    public int writtenBytes() {
        return this.buffer.writerIndex() - this.startIndex;
    }

    @Override // java.io.OutputStream, java.io.DataOutput
    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return;
        }
        this.buffer.writeBytes(bArr, i, i2);
    }

    @Override // java.io.OutputStream, java.io.DataOutput
    public void write(byte[] bArr) throws IOException {
        this.buffer.writeBytes(bArr);
    }

    @Override // java.io.OutputStream, java.io.DataOutput
    public void write(int i) throws IOException {
        this.buffer.writeByte(i);
    }

    @Override // java.io.DataOutput
    public void writeBoolean(boolean z) throws IOException {
        this.buffer.writeBoolean(z);
    }

    @Override // java.io.DataOutput
    public void writeByte(int i) throws IOException {
        this.buffer.writeByte(i);
    }

    @Override // java.io.DataOutput
    public void writeBytes(String str) throws IOException {
        this.buffer.writeCharSequence(str, CharsetUtil.US_ASCII);
    }

    @Override // java.io.DataOutput
    public void writeChar(int i) throws IOException {
        this.buffer.writeChar(i);
    }

    @Override // java.io.DataOutput
    public void writeChars(String str) throws IOException {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            this.buffer.writeChar(str.charAt(i));
        }
    }

    @Override // java.io.DataOutput
    public void writeDouble(double d) throws IOException {
        this.buffer.writeDouble(d);
    }

    @Override // java.io.DataOutput
    public void writeFloat(float f) throws IOException {
        this.buffer.writeFloat(f);
    }

    @Override // java.io.DataOutput
    public void writeInt(int i) throws IOException {
        this.buffer.writeInt(i);
    }

    @Override // java.io.DataOutput
    public void writeLong(long j) throws IOException {
        this.buffer.writeLong(j);
    }

    @Override // java.io.DataOutput
    public void writeShort(int i) throws IOException {
        this.buffer.writeShort((short) i);
    }

    @Override // java.io.DataOutput
    public void writeUTF(String str) throws IOException {
        DataOutputStream dataOutputStream = this.utf8out;
        if (dataOutputStream == null) {
            dataOutputStream = new DataOutputStream(this);
            this.utf8out = dataOutputStream;
        }
        dataOutputStream.writeUTF(str);
    }

    public ByteBuf buffer() {
        return this.buffer;
    }
}
