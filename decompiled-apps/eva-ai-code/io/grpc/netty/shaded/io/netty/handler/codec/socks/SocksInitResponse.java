package io.grpc.netty.shaded.io.netty.handler.codec.socks;

import io.grpc.netty.shaded.io.netty.buffer.ByteBuf;
import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
/* loaded from: classes4.dex */
public final class SocksInitResponse extends SocksResponse {
    private final SocksAuthScheme authScheme;

    public SocksInitResponse(SocksAuthScheme socksAuthScheme) {
        super(SocksResponseType.INIT);
        this.authScheme = (SocksAuthScheme) ObjectUtil.checkNotNull(socksAuthScheme, "authScheme");
    }

    public SocksAuthScheme authScheme() {
        return this.authScheme;
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.socks.SocksMessage
    public void encodeAsByteBuf(ByteBuf byteBuf) {
        byteBuf.writeByte(protocolVersion().byteValue());
        byteBuf.writeByte(this.authScheme.byteValue());
    }
}
