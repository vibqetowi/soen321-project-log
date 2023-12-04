package io.grpc.netty.shaded.io.netty.handler.codec.protobuf;

import com.google.common.base.Ascii;
import io.grpc.netty.shaded.io.netty.buffer.ByteBuf;
import io.grpc.netty.shaded.io.netty.channel.ChannelHandlerContext;
import io.grpc.netty.shaded.io.netty.handler.codec.ByteToMessageDecoder;
import io.grpc.netty.shaded.io.netty.handler.codec.CorruptedFrameException;
import java.util.List;
/* loaded from: classes4.dex */
public class ProtobufVarint32FrameDecoder extends ByteToMessageDecoder {
    @Override // io.grpc.netty.shaded.io.netty.handler.codec.ByteToMessageDecoder
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        byteBuf.markReaderIndex();
        int readerIndex = byteBuf.readerIndex();
        int readRawVarint32 = readRawVarint32(byteBuf);
        if (readerIndex == byteBuf.readerIndex()) {
            return;
        }
        if (readRawVarint32 < 0) {
            throw new CorruptedFrameException("negative length: " + readRawVarint32);
        } else if (byteBuf.readableBytes() < readRawVarint32) {
            byteBuf.resetReaderIndex();
        } else {
            list.add(byteBuf.readRetainedSlice(readRawVarint32));
        }
    }

    private static int readRawVarint32(ByteBuf byteBuf) {
        int i;
        if (byteBuf.isReadable()) {
            byteBuf.markReaderIndex();
            byte readByte = byteBuf.readByte();
            if (readByte >= 0) {
                return readByte;
            }
            int i2 = readByte & Byte.MAX_VALUE;
            if (!byteBuf.isReadable()) {
                byteBuf.resetReaderIndex();
                return 0;
            }
            byte readByte2 = byteBuf.readByte();
            if (readByte2 >= 0) {
                i = readByte2 << 7;
            } else {
                i2 |= (readByte2 & Byte.MAX_VALUE) << 7;
                if (!byteBuf.isReadable()) {
                    byteBuf.resetReaderIndex();
                    return 0;
                }
                byte readByte3 = byteBuf.readByte();
                if (readByte3 >= 0) {
                    i = readByte3 << Ascii.SO;
                } else {
                    i2 |= (readByte3 & Byte.MAX_VALUE) << 14;
                    if (!byteBuf.isReadable()) {
                        byteBuf.resetReaderIndex();
                        return 0;
                    }
                    byte readByte4 = byteBuf.readByte();
                    if (readByte4 < 0) {
                        int i3 = i2 | ((readByte4 & Byte.MAX_VALUE) << 21);
                        if (!byteBuf.isReadable()) {
                            byteBuf.resetReaderIndex();
                            return 0;
                        }
                        byte readByte5 = byteBuf.readByte();
                        int i4 = i3 | (readByte5 << Ascii.FS);
                        if (readByte5 >= 0) {
                            return i4;
                        }
                        throw new CorruptedFrameException("malformed varint.");
                    }
                    i = readByte4 << Ascii.NAK;
                }
            }
            return i | i2;
        }
        return 0;
    }
}
