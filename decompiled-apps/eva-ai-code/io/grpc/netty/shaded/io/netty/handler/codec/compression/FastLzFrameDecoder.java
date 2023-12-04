package io.grpc.netty.shaded.io.netty.handler.codec.compression;

import com.google.common.base.Ascii;
import io.grpc.netty.shaded.io.netty.buffer.ByteBuf;
import io.grpc.netty.shaded.io.netty.channel.ChannelHandlerContext;
import io.grpc.netty.shaded.io.netty.handler.codec.ByteToMessageDecoder;
import io.grpc.netty.shaded.io.netty.util.internal.EmptyArrays;
import java.util.List;
import java.util.zip.Adler32;
import java.util.zip.Checksum;
/* loaded from: classes4.dex */
public class FastLzFrameDecoder extends ByteToMessageDecoder {
    private final Checksum checksum;
    private int chunkLength;
    private int currentChecksum;
    private State currentState;
    private boolean hasChecksum;
    private boolean isCompressed;
    private int originalLength;

    /* loaded from: classes4.dex */
    private enum State {
        INIT_BLOCK,
        INIT_BLOCK_PARAMS,
        DECOMPRESS_DATA,
        CORRUPTED
    }

    public FastLzFrameDecoder() {
        this(false);
    }

    public FastLzFrameDecoder(boolean z) {
        this(z ? new Adler32() : null);
    }

    public FastLzFrameDecoder(Checksum checksum) {
        this.currentState = State.INIT_BLOCK;
        this.checksum = checksum;
    }

    /* renamed from: io.grpc.netty.shaded.io.netty.handler.codec.compression.FastLzFrameDecoder$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$compression$FastLzFrameDecoder$State;

        static {
            int[] iArr = new int[State.values().length];
            $SwitchMap$io$netty$handler$codec$compression$FastLzFrameDecoder$State = iArr;
            try {
                iArr[State.INIT_BLOCK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$compression$FastLzFrameDecoder$State[State.INIT_BLOCK_PARAMS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$compression$FastLzFrameDecoder$State[State.DECOMPRESS_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$compression$FastLzFrameDecoder$State[State.CORRUPTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0095 A[Catch: Exception -> 0x015b, TryCatch #2 {Exception -> 0x015b, blocks: (B:3:0x0004, B:9:0x001b, B:10:0x0024, B:11:0x0029, B:44:0x008b, B:47:0x0095, B:49:0x009d, B:50:0x00b6, B:26:0x0056, B:30:0x0061, B:34:0x0068, B:38:0x006f, B:40:0x0075, B:42:0x0081, B:43:0x0085, B:12:0x002a, B:15:0x0032, B:17:0x003b, B:21:0x0046, B:25:0x0050, B:80:0x0153, B:81:0x015a, B:52:0x00bc, B:54:0x00c0, B:56:0x00c6, B:58:0x00d6, B:64:0x0101, B:67:0x0109, B:70:0x0119, B:71:0x0134, B:73:0x0137, B:74:0x0144, B:61:0x00e3, B:62:0x00fc, B:57:0x00d0, B:63:0x00fd), top: B:85:0x0004 }] */
    @Override // io.grpc.netty.shaded.io.netty.handler.codec.ByteToMessageDecoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        int i;
        int i2;
        ByteBuf byteBuf2;
        byte[] bArr;
        int i3;
        byte[] bArr2;
        int i4;
        try {
            int i5 = AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$FastLzFrameDecoder$State[this.currentState.ordinal()];
            int i6 = 4;
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        if (i5 == 4) {
                            byteBuf.skipBytes(byteBuf.readableBytes());
                            return;
                        }
                        throw new IllegalStateException();
                    }
                    i = this.chunkLength;
                    if (byteBuf.readableBytes() >= i) {
                        return;
                    }
                    int readerIndex = byteBuf.readerIndex();
                    int i7 = this.originalLength;
                    if (i7 != 0) {
                        ByteBuf heapBuffer = channelHandlerContext.alloc().heapBuffer(i7, i7);
                        byteBuf2 = heapBuffer;
                        bArr = heapBuffer.array();
                        i2 = heapBuffer.arrayOffset() + heapBuffer.writerIndex();
                    } else {
                        i2 = 0;
                        byteBuf2 = null;
                        bArr = EmptyArrays.EMPTY_BYTES;
                    }
                    if (this.isCompressed) {
                        if (byteBuf.hasArray()) {
                            bArr2 = byteBuf.array();
                            i4 = byteBuf.arrayOffset() + readerIndex;
                        } else {
                            bArr2 = new byte[i];
                            byteBuf.getBytes(readerIndex, bArr2);
                            i4 = 0;
                        }
                        int i8 = i2;
                        int decompress = FastLz.decompress(bArr2, i4, i, bArr, i2, i7);
                        if (i7 != decompress) {
                            throw new DecompressionException(String.format("stream corrupted: originalLength(%d) and actual length(%d) mismatch", Integer.valueOf(i7), Integer.valueOf(decompress)));
                        }
                        i3 = i8;
                    } else {
                        i3 = i2;
                        byteBuf.getBytes(readerIndex, bArr, i3, i);
                    }
                    Checksum checksum = this.checksum;
                    if (this.hasChecksum && checksum != null) {
                        checksum.reset();
                        checksum.update(bArr, i3, i7);
                        int value = (int) checksum.getValue();
                        if (value != this.currentChecksum) {
                            throw new DecompressionException(String.format("stream corrupted: mismatching checksum: %d (expected: %d)", Integer.valueOf(value), Integer.valueOf(this.currentChecksum)));
                        }
                    }
                    if (byteBuf2 != null) {
                        byteBuf2.writerIndex(byteBuf2.writerIndex() + i7);
                        list.add(byteBuf2);
                    }
                    byteBuf.skipBytes(i);
                    this.currentState = State.INIT_BLOCK;
                    return;
                }
            } else if (byteBuf.readableBytes() < 4) {
                return;
            } else {
                if (byteBuf.readUnsignedMedium() != 4607066) {
                    throw new DecompressionException("unexpected block identifier");
                }
                byte readByte = byteBuf.readByte();
                this.isCompressed = (readByte & 1) == 1;
                this.hasChecksum = (readByte & Ascii.DLE) == 16;
                this.currentState = State.INIT_BLOCK_PARAMS;
            }
            int readableBytes = byteBuf.readableBytes();
            int i9 = (this.isCompressed ? 2 : 0) + 2;
            boolean z = this.hasChecksum;
            if (!z) {
                i6 = 0;
            }
            if (readableBytes < i9 + i6) {
                return;
            }
            this.currentChecksum = z ? byteBuf.readInt() : 0;
            int readUnsignedShort = byteBuf.readUnsignedShort();
            this.chunkLength = readUnsignedShort;
            if (this.isCompressed) {
                readUnsignedShort = byteBuf.readUnsignedShort();
            }
            this.originalLength = readUnsignedShort;
            this.currentState = State.DECOMPRESS_DATA;
            i = this.chunkLength;
            if (byteBuf.readableBytes() >= i) {
            }
        } catch (Exception e) {
            this.currentState = State.CORRUPTED;
            throw e;
        }
    }
}
