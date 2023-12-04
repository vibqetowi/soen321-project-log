package io.grpc.alts.internal;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
/* loaded from: classes4.dex */
public interface HandshakerResultOrBuilder extends MessageOrBuilder {
    String getApplicationProtocol();

    ByteString getApplicationProtocolBytes();

    boolean getKeepChannelOpen();

    ByteString getKeyData();

    Identity getLocalIdentity();

    IdentityOrBuilder getLocalIdentityOrBuilder();

    int getMaxFrameSize();

    Identity getPeerIdentity();

    IdentityOrBuilder getPeerIdentityOrBuilder();

    RpcProtocolVersions getPeerRpcVersions();

    RpcProtocolVersionsOrBuilder getPeerRpcVersionsOrBuilder();

    String getRecordProtocol();

    ByteString getRecordProtocolBytes();

    boolean hasLocalIdentity();

    boolean hasPeerIdentity();

    boolean hasPeerRpcVersions();
}
