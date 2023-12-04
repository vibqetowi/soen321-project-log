package io.grpc.alts.internal;

import com.google.protobuf.MessageOrBuilder;
import io.grpc.alts.internal.RpcProtocolVersions;
/* loaded from: classes4.dex */
public interface RpcProtocolVersionsOrBuilder extends MessageOrBuilder {
    RpcProtocolVersions.Version getMaxRpcVersion();

    RpcProtocolVersions.VersionOrBuilder getMaxRpcVersionOrBuilder();

    RpcProtocolVersions.Version getMinRpcVersion();

    RpcProtocolVersions.VersionOrBuilder getMinRpcVersionOrBuilder();

    boolean hasMaxRpcVersion();

    boolean hasMinRpcVersion();
}
