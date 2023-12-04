package io.grpc.netty.shaded.io.netty.handler.codec.socksx.v5;

import io.grpc.netty.shaded.io.netty.buffer.ByteBuf;
import io.grpc.netty.shaded.io.netty.buffer.ByteBufUtil;
import io.grpc.netty.shaded.io.netty.channel.ChannelHandler;
import io.grpc.netty.shaded.io.netty.channel.ChannelHandlerContext;
import io.grpc.netty.shaded.io.netty.handler.codec.EncoderException;
import io.grpc.netty.shaded.io.netty.handler.codec.MessageToByteEncoder;
import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
import io.grpc.netty.shaded.io.netty.util.internal.StringUtil;
import java.util.List;
import java.util.RandomAccess;
@ChannelHandler.Sharable
/* loaded from: classes4.dex */
public class Socks5ClientEncoder extends MessageToByteEncoder<Socks5Message> {
    public static final Socks5ClientEncoder DEFAULT = new Socks5ClientEncoder();
    private final Socks5AddressEncoder addressEncoder;

    protected Socks5ClientEncoder() {
        this(Socks5AddressEncoder.DEFAULT);
    }

    public Socks5ClientEncoder(Socks5AddressEncoder socks5AddressEncoder) {
        this.addressEncoder = (Socks5AddressEncoder) ObjectUtil.checkNotNull(socks5AddressEncoder, "addressEncoder");
    }

    protected final Socks5AddressEncoder addressEncoder() {
        return this.addressEncoder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.handler.codec.MessageToByteEncoder
    public void encode(ChannelHandlerContext channelHandlerContext, Socks5Message socks5Message, ByteBuf byteBuf) throws Exception {
        if (socks5Message instanceof Socks5InitialRequest) {
            encodeAuthMethodRequest((Socks5InitialRequest) socks5Message, byteBuf);
        } else if (socks5Message instanceof Socks5PasswordAuthRequest) {
            encodePasswordAuthRequest((Socks5PasswordAuthRequest) socks5Message, byteBuf);
        } else if (socks5Message instanceof Socks5CommandRequest) {
            encodeCommandRequest((Socks5CommandRequest) socks5Message, byteBuf);
        } else {
            throw new EncoderException("unsupported message type: " + StringUtil.simpleClassName(socks5Message));
        }
    }

    private static void encodeAuthMethodRequest(Socks5InitialRequest socks5InitialRequest, ByteBuf byteBuf) {
        byteBuf.writeByte(socks5InitialRequest.version().byteValue());
        List<Socks5AuthMethod> authMethods = socks5InitialRequest.authMethods();
        int size = authMethods.size();
        byteBuf.writeByte(size);
        if (!(authMethods instanceof RandomAccess)) {
            for (Socks5AuthMethod socks5AuthMethod : authMethods) {
                byteBuf.writeByte(socks5AuthMethod.byteValue());
            }
            return;
        }
        for (int i = 0; i < size; i++) {
            byteBuf.writeByte(authMethods.get(i).byteValue());
        }
    }

    private static void encodePasswordAuthRequest(Socks5PasswordAuthRequest socks5PasswordAuthRequest, ByteBuf byteBuf) {
        byteBuf.writeByte(1);
        String username = socks5PasswordAuthRequest.username();
        byteBuf.writeByte(username.length());
        ByteBufUtil.writeAscii(byteBuf, username);
        String password = socks5PasswordAuthRequest.password();
        byteBuf.writeByte(password.length());
        ByteBufUtil.writeAscii(byteBuf, password);
    }

    private void encodeCommandRequest(Socks5CommandRequest socks5CommandRequest, ByteBuf byteBuf) throws Exception {
        byteBuf.writeByte(socks5CommandRequest.version().byteValue());
        byteBuf.writeByte(socks5CommandRequest.type().byteValue());
        byteBuf.writeByte(0);
        Socks5AddressType dstAddrType = socks5CommandRequest.dstAddrType();
        byteBuf.writeByte(dstAddrType.byteValue());
        this.addressEncoder.encodeAddress(dstAddrType, socks5CommandRequest.dstAddr(), byteBuf);
        byteBuf.writeShort(socks5CommandRequest.dstPort());
    }
}
