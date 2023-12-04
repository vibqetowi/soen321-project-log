package io.grpc.netty.shaded.io.netty.handler.codec.socks;

import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
/* loaded from: classes4.dex */
public abstract class SocksResponse extends SocksMessage {
    private final SocksResponseType responseType;

    /* JADX INFO: Access modifiers changed from: protected */
    public SocksResponse(SocksResponseType socksResponseType) {
        super(SocksMessageType.RESPONSE);
        this.responseType = (SocksResponseType) ObjectUtil.checkNotNull(socksResponseType, "responseType");
    }

    public SocksResponseType responseType() {
        return this.responseType;
    }
}
