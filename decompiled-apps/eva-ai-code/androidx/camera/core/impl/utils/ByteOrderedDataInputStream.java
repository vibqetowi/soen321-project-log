package androidx.camera.core.impl.utils;

import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
/* loaded from: classes.dex */
final class ByteOrderedDataInputStream extends InputStream implements DataInput {
    private ByteOrder mByteOrder;
    private final DataInputStream mDataInputStream;
    final int mLength;
    int mPosition;
    private static final ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
    private static final ByteOrder BIG_ENDIAN = ByteOrder.BIG_ENDIAN;

    ByteOrderedDataInputStream(InputStream inputStream) throws IOException {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    ByteOrderedDataInputStream(InputStream inputStream, ByteOrder byteOrder) throws IOException {
        this.mByteOrder = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.mDataInputStream = dataInputStream;
        int available = dataInputStream.available();
        this.mLength = available;
        this.mPosition = 0;
        dataInputStream.mark(available);
        this.mByteOrder = byteOrder;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ByteOrderedDataInputStream(byte[] bArr) throws IOException {
        this(new ByteArrayInputStream(bArr));
    }

    public void setByteOrder(ByteOrder byteOrder) {
        this.mByteOrder = byteOrder;
    }

    public void seek(long j) throws IOException {
        int i = this.mPosition;
        if (i > j) {
            this.mPosition = 0;
            this.mDataInputStream.reset();
            this.mDataInputStream.mark(this.mLength);
        } else {
            j -= i;
        }
        int i2 = (int) j;
        if (skipBytes(i2) != i2) {
            throw new IOException("Couldn't seek up to the byteCount");
        }
    }

    public int peek() {
        return this.mPosition;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.mDataInputStream.available();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        this.mPosition++;
        return this.mDataInputStream.read();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.mDataInputStream.read(bArr, i, i2);
        this.mPosition += read;
        return read;
    }

    @Override // java.io.DataInput
    public int readUnsignedByte() throws IOException {
        this.mPosition++;
        return this.mDataInputStream.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public String readLine() {
        throw new UnsupportedOperationException("readLine() not implemented.");
    }

    @Override // java.io.DataInput
    public boolean readBoolean() throws IOException {
        this.mPosition++;
        return this.mDataInputStream.readBoolean();
    }

    @Override // java.io.DataInput
    public char readChar() throws IOException {
        this.mPosition += 2;
        return this.mDataInputStream.readChar();
    }

    @Override // java.io.DataInput
    public String readUTF() throws IOException {
        this.mPosition += 2;
        return this.mDataInputStream.readUTF();
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.mPosition + i2;
        this.mPosition = i3;
        if (i3 > this.mLength) {
            throw new EOFException();
        }
        if (this.mDataInputStream.read(bArr, i, i2) != i2) {
            throw new IOException("Couldn't read up to the length of buffer");
        }
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr) throws IOException {
        int length = this.mPosition + bArr.length;
        this.mPosition = length;
        if (length > this.mLength) {
            throw new EOFException();
        }
        if (this.mDataInputStream.read(bArr, 0, bArr.length) != bArr.length) {
            throw new IOException("Couldn't read up to the length of buffer");
        }
    }

    @Override // java.io.DataInput
    public byte readByte() throws IOException {
        int i = this.mPosition + 1;
        this.mPosition = i;
        if (i > this.mLength) {
            throw new EOFException();
        }
        int read = this.mDataInputStream.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public short readShort() throws IOException {
        int i = this.mPosition + 2;
        this.mPosition = i;
        if (i > this.mLength) {
            throw new EOFException();
        }
        int read = this.mDataInputStream.read();
        int read2 = this.mDataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.mByteOrder;
        if (byteOrder == LITTLE_ENDIAN) {
            return (short) ((read2 << 8) + read);
        }
        if (byteOrder == BIG_ENDIAN) {
            return (short) ((read << 8) + read2);
        }
        throw new IOException("Invalid byte order: " + this.mByteOrder);
    }

    @Override // java.io.DataInput
    public int readInt() throws IOException {
        int i = this.mPosition + 4;
        this.mPosition = i;
        if (i > this.mLength) {
            throw new EOFException();
        }
        int read = this.mDataInputStream.read();
        int read2 = this.mDataInputStream.read();
        int read3 = this.mDataInputStream.read();
        int read4 = this.mDataInputStream.read();
        if ((read | read2 | read3 | read4) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.mByteOrder;
        if (byteOrder == LITTLE_ENDIAN) {
            return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == BIG_ENDIAN) {
            return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
        }
        throw new IOException("Invalid byte order: " + this.mByteOrder);
    }

    @Override // java.io.DataInput
    public int skipBytes(int i) throws IOException {
        int min = Math.min(i, this.mLength - this.mPosition);
        int i2 = 0;
        while (i2 < min) {
            i2 += this.mDataInputStream.skipBytes(min - i2);
        }
        this.mPosition += i2;
        return i2;
    }

    @Override // java.io.DataInput
    public int readUnsignedShort() throws IOException {
        int i = this.mPosition + 2;
        this.mPosition = i;
        if (i > this.mLength) {
            throw new EOFException();
        }
        int read = this.mDataInputStream.read();
        int read2 = this.mDataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.mByteOrder;
        if (byteOrder == LITTLE_ENDIAN) {
            return (read2 << 8) + read;
        }
        if (byteOrder == BIG_ENDIAN) {
            return (read << 8) + read2;
        }
        throw new IOException("Invalid byte order: " + this.mByteOrder);
    }

    public long readUnsignedInt() throws IOException {
        return readInt() & 4294967295L;
    }

    @Override // java.io.DataInput
    public long readLong() throws IOException {
        int i = this.mPosition + 8;
        this.mPosition = i;
        if (i > this.mLength) {
            throw new EOFException();
        }
        int read = this.mDataInputStream.read();
        int read2 = this.mDataInputStream.read();
        int read3 = this.mDataInputStream.read();
        int read4 = this.mDataInputStream.read();
        int read5 = this.mDataInputStream.read();
        int read6 = this.mDataInputStream.read();
        int read7 = this.mDataInputStream.read();
        int read8 = this.mDataInputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.mByteOrder;
        if (byteOrder == LITTLE_ENDIAN) {
            return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == BIG_ENDIAN) {
            return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
        }
        throw new IOException("Invalid byte order: " + this.mByteOrder);
    }

    @Override // java.io.DataInput
    public float readFloat() throws IOException {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public double readDouble() throws IOException {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        synchronized (this.mDataInputStream) {
            this.mDataInputStream.mark(i);
        }
    }

    public int getLength() {
        return this.mLength;
    }
}
