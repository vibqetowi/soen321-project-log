package io.grpc.netty.shaded.io.netty.handler.codec.socks;

import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
/* loaded from: classes4.dex */
public abstract class SocksRequest extends SocksMessage {
    private final SocksRequestType requestType;

    /* JADX INFO: Access modifiers changed from: protected */
    public SocksRequest(SocksRequestType socksRequestType) {
        super(SocksMessageType.REQUEST);
        this.requestType = (SocksRequestType) ObjectUtil.checkNotNull(socksRequestType, "requestType");
    }

    public SocksRequestType requestType() {
        return this.requestType;
    }
}
