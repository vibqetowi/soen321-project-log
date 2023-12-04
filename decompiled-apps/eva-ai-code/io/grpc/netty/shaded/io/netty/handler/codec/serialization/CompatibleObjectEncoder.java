package io.grpc.netty.shaded.io.netty.handler.codec.serialization;

import io.grpc.netty.shaded.io.netty.buffer.ByteBuf;
import io.grpc.netty.shaded.io.netty.buffer.ByteBufOutputStream;
import io.grpc.netty.shaded.io.netty.channel.ChannelHandlerContext;
import io.grpc.netty.shaded.io.netty.handler.codec.MessageToByteEncoder;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
/* loaded from: classes4.dex */
public class CompatibleObjectEncoder extends MessageToByteEncoder<Serializable> {
    private final int resetInterval;
    private int writtenObjects;

    public CompatibleObjectEncoder() {
        this(16);
    }

    public CompatibleObjectEncoder(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("resetInterval: " + i);
        }
        this.resetInterval = i;
    }

    protected ObjectOutputStream newObjectOutputStream(OutputStream outputStream) throws Exception {
        return new ObjectOutputStream(outputStream);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.handler.codec.MessageToByteEncoder
    public void encode(ChannelHandlerContext channelHandlerContext, Serializable serializable, ByteBuf byteBuf) throws Exception {
        ObjectOutputStream newObjectOutputStream = newObjectOutputStream(new ByteBufOutputStream(byteBuf));
        try {
            int i = this.resetInterval;
            if (i != 0) {
                int i2 = this.writtenObjects + 1;
                this.writtenObjects = i2;
                if (i2 % i == 0) {
                    newObjectOutputStream.reset();
                }
            }
            newObjectOutputStream.writeObject(serializable);
            newObjectOutputStream.flush();
        } finally {
            newObjectOutputStream.close();
        }
    }
}
