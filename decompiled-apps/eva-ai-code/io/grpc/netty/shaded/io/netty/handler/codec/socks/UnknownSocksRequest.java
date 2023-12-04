package io.grpc.netty.shaded.io.netty.handler.codec.socks;

import io.grpc.netty.shaded.io.netty.buffer.ByteBuf;
/* loaded from: classes4.dex */
public final class UnknownSocksRequest extends SocksRequest {
    @Override // io.grpc.netty.shaded.io.netty.handler.codec.socks.SocksMessage
    public void encodeAsByteBuf(ByteBuf byteBuf) {
    }

    public UnknownSocksRequest() {
        super(SocksRequestType.UNKNOWN);
    }
}
