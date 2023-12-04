package io.grpc.alts.internal;

import java.util.Map;
/* loaded from: classes4.dex */
public final class AltsAuthContext {
    final AltsContext context;

    public AltsAuthContext(HandshakerResult handshakerResult) {
        this.context = AltsContext.newBuilder().setApplicationProtocol(handshakerResult.getApplicationProtocol()).setRecordProtocol(handshakerResult.getRecordProtocol()).setSecurityLevel(SecurityLevel.INTEGRITY_AND_PRIVACY).setPeerServiceAccount(handshakerResult.getPeerIdentity().getServiceAccount()).setLocalServiceAccount(handshakerResult.getLocalIdentity().getServiceAccount()).setPeerRpcVersions(handshakerResult.getPeerRpcVersions()).putAllPeerAttributes(handshakerResult.getPeerIdentity().getAttributesMap()).build();
    }

    public static AltsAuthContext getDefaultInstance() {
        return new AltsAuthContext(HandshakerResult.newBuilder().build());
    }

    public String getApplicationProtocol() {
        return this.context.getApplicationProtocol();
    }

    public String getRecordProtocol() {
        return this.context.getRecordProtocol();
    }

    public SecurityLevel getSecurityLevel() {
        return this.context.getSecurityLevel();
    }

    public String getPeerServiceAccount() {
        return this.context.getPeerServiceAccount();
    }

    public String getLocalServiceAccount() {
        return this.context.getLocalServiceAccount();
    }

    public RpcProtocolVersions getPeerRpcVersions() {
        return this.context.getPeerRpcVersions();
    }

    public Map<String, String> getPeerAttributes() {
        return this.context.getPeerAttributesMap();
    }
}
