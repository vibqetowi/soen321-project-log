package io.grpc.alts.internal;

import javax.annotation.Nullable;
/* loaded from: classes4.dex */
public class AltsHandshakerOptions {
    @Nullable
    private final RpcProtocolVersions rpcProtocolVersions;

    public AltsHandshakerOptions(RpcProtocolVersions rpcProtocolVersions) {
        this.rpcProtocolVersions = rpcProtocolVersions;
    }

    public RpcProtocolVersions getRpcProtocolVersions() {
        return this.rpcProtocolVersions;
    }
}
