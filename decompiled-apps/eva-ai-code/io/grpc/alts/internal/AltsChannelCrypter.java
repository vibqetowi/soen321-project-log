package io.grpc.alts.internal;

import com.google.common.base.Preconditions;
import com.google.common.base.Verify;
import io.grpc.netty.shaded.io.netty.buffer.ByteBuf;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.List;
/* loaded from: classes4.dex */
final class AltsChannelCrypter implements ChannelCrypterNetty {
    private static final int COUNTER_LENGTH = 12;
    private static final int COUNTER_OVERFLOW_LENGTH = 8;
    private static final int KEY_LENGTH = AesGcmHkdfAeadCrypter.getKeyLength();
    private static final int TAG_LENGTH = 16;
    private final AeadCrypter aeadCrypter;
    private final byte[] inCounter;
    private final byte[] oldCounter = new byte[12];
    private final byte[] outCounter;

    static int getCounterLength() {
        return 12;
    }

    @Override // io.grpc.alts.internal.ChannelCrypterNetty
    public void destroy() {
    }

    @Override // io.grpc.alts.internal.ChannelCrypterNetty
    public int getSuffixLength() {
        return 16;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AltsChannelCrypter(byte[] bArr, boolean z) {
        byte[] bArr2 = new byte[12];
        this.outCounter = bArr2;
        byte[] bArr3 = new byte[12];
        this.inCounter = bArr3;
        Preconditions.checkArgument(bArr.length == KEY_LENGTH);
        bArr2 = z ? bArr3 : bArr2;
        bArr2[bArr2.length - 1] = Byte.MIN_VALUE;
        this.aeadCrypter = new AesGcmHkdfAeadCrypter(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getKeyLength() {
        return KEY_LENGTH;
    }

    @Override // io.grpc.alts.internal.ChannelCrypterNetty
    public void encrypt(ByteBuf byteBuf, List<ByteBuf> list) throws GeneralSecurityException {
        Preconditions.checkArgument(byteBuf.nioBufferCount() == 1);
        ByteBuf slice = byteBuf.slice(byteBuf.writerIndex(), byteBuf.writableBytes());
        slice.writerIndex(0);
        for (ByteBuf byteBuf2 : list) {
            slice.writeBytes(byteBuf2);
        }
        Verify.verify(byteBuf.writableBytes() == slice.readableBytes() + 16);
        ByteBuffer internalNioBuffer = byteBuf.internalNioBuffer(byteBuf.writerIndex(), byteBuf.writableBytes());
        ByteBuffer duplicate = internalNioBuffer.duplicate();
        duplicate.limit(internalNioBuffer.limit() - 16);
        byte[] incrementOutCounter = incrementOutCounter();
        int position = internalNioBuffer.position();
        this.aeadCrypter.encrypt(internalNioBuffer, duplicate, incrementOutCounter);
        byteBuf.writerIndex(byteBuf.writerIndex() + (internalNioBuffer.position() - position));
        Verify.verify(!byteBuf.isWritable());
    }

    @Override // io.grpc.alts.internal.ChannelCrypterNetty
    public void decrypt(ByteBuf byteBuf, ByteBuf byteBuf2, List<ByteBuf> list) throws GeneralSecurityException {
        ByteBuf slice = byteBuf.slice(byteBuf.writerIndex(), byteBuf.writableBytes());
        slice.writerIndex(0);
        for (ByteBuf byteBuf3 : list) {
            slice.writeBytes(byteBuf3);
        }
        slice.writeBytes(byteBuf2);
        decrypt(byteBuf, slice);
    }

    @Override // io.grpc.alts.internal.ChannelCrypterNetty
    public void decrypt(ByteBuf byteBuf, ByteBuf byteBuf2) throws GeneralSecurityException {
        int readableBytes = byteBuf2.readableBytes();
        Preconditions.checkArgument(readableBytes == byteBuf.writableBytes());
        Preconditions.checkArgument(byteBuf.nioBufferCount() == 1);
        ByteBuffer internalNioBuffer = byteBuf.internalNioBuffer(byteBuf.writerIndex(), byteBuf.writableBytes());
        Preconditions.checkArgument(byteBuf2.nioBufferCount() == 1);
        ByteBuffer nioBuffer = byteBuf2.nioBuffer(byteBuf2.readerIndex(), readableBytes);
        byte[] incrementInCounter = incrementInCounter();
        int position = internalNioBuffer.position();
        this.aeadCrypter.decrypt(internalNioBuffer, nioBuffer, incrementInCounter);
        byteBuf.writerIndex(byteBuf.writerIndex() + (internalNioBuffer.position() - position));
        byteBuf2.readerIndex(byteBuf.readerIndex() + readableBytes);
        Verify.verify(byteBuf.writableBytes() == 16);
    }

    static void incrementCounter(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        int i = 0;
        while (i < 8) {
            byte b = (byte) (bArr[i] + 1);
            bArr[i] = b;
            if (b != 0) {
                break;
            }
            i++;
        }
        if (i != 8) {
            return;
        }
        System.arraycopy(bArr2, 0, bArr, 0, bArr.length);
        throw new GeneralSecurityException("Counter has overflowed.");
    }

    private byte[] incrementInCounter() throws GeneralSecurityException {
        incrementCounter(this.inCounter, this.oldCounter);
        return this.oldCounter;
    }

    private byte[] incrementOutCounter() throws GeneralSecurityException {
        incrementCounter(this.outCounter, this.oldCounter);
        return this.oldCounter;
    }

    void incrementInCounterForTesting(int i) throws GeneralSecurityException {
        for (int i2 = 0; i2 < i; i2++) {
            incrementInCounter();
        }
    }

    void incrementOutCounterForTesting(int i) throws GeneralSecurityException {
        for (int i2 = 0; i2 < i; i2++) {
            incrementOutCounter();
        }
    }
}
