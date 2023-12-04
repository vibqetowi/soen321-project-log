package io.grpc.netty.shaded.io.netty.handler.codec.socks;

import io.grpc.netty.shaded.io.netty.buffer.ByteBuf;
import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
import java.util.Collections;
import java.util.List;
/* loaded from: classes4.dex */
public final class SocksInitRequest extends SocksRequest {
    private final List<SocksAuthScheme> authSchemes;

    public SocksInitRequest(List<SocksAuthScheme> list) {
        super(SocksRequestType.INIT);
        this.authSchemes = (List) ObjectUtil.checkNotNull(list, "authSchemes");
    }

    public List<SocksAuthScheme> authSchemes() {
        return Collections.unmodifiableList(this.authSchemes);
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.socks.SocksMessage
    public void encodeAsByteBuf(ByteBuf byteBuf) {
        byteBuf.writeByte(protocolVersion().byteValue());
        byteBuf.writeByte(this.authSchemes.size());
        for (SocksAuthScheme socksAuthScheme : this.authSchemes) {
            byteBuf.writeByte(socksAuthScheme.byteValue());
        }
    }
}
