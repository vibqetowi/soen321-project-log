package io.grpc.netty.shaded.io.netty.handler.codec.serialization;

import io.grpc.netty.shaded.io.netty.buffer.ByteBuf;
import io.grpc.netty.shaded.io.netty.buffer.ByteBufOutputStream;
import io.grpc.netty.shaded.io.netty.channel.ChannelHandler;
import io.grpc.netty.shaded.io.netty.channel.ChannelHandlerContext;
import io.grpc.netty.shaded.io.netty.handler.codec.MessageToByteEncoder;
import java.io.Serializable;
@ChannelHandler.Sharable
/* loaded from: classes4.dex */
public class ObjectEncoder extends MessageToByteEncoder<Serializable> {
    private static final byte[] LENGTH_PLACEHOLDER = new byte[4];

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.handler.codec.MessageToByteEncoder
    public void encode(ChannelHandlerContext channelHandlerContext, Serializable serializable, ByteBuf byteBuf) throws Exception {
        int writerIndex = byteBuf.writerIndex();
        ByteBufOutputStream byteBufOutputStream = new ByteBufOutputStream(byteBuf);
        CompactObjectOutputStream compactObjectOutputStream = null;
        try {
            byteBufOutputStream.write(LENGTH_PLACEHOLDER);
            CompactObjectOutputStream compactObjectOutputStream2 = new CompactObjectOutputStream(byteBufOutputStream);
            try {
                compactObjectOutputStream2.writeObject(serializable);
                compactObjectOutputStream2.flush();
                compactObjectOutputStream2.close();
                byteBuf.setInt(writerIndex, (byteBuf.writerIndex() - writerIndex) - 4);
            } catch (Throwable th) {
                th = th;
                compactObjectOutputStream = compactObjectOutputStream2;
                if (compactObjectOutputStream != null) {
                    compactObjectOutputStream.close();
                } else {
                    byteBufOutputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
