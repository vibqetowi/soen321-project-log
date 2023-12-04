package io.grpc.alts.internal;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
/* loaded from: classes4.dex */
public final class AltsContextProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001agrpc/gcp/altscontext.proto\u0012\bgrpc.gcp\u001a(grpc/gcp/transport_security_common.proto\"ç\u0002\n\u000bAltsContext\u0012\u001c\n\u0014application_protocol\u0018\u0001 \u0001(\t\u0012\u0017\n\u000frecord_protocol\u0018\u0002 \u0001(\t\u0012/\n\u000esecurity_level\u0018\u0003 \u0001(\u000e2\u0017.grpc.gcp.SecurityLevel\u0012\u001c\n\u0014peer_service_account\u0018\u0004 \u0001(\t\u0012\u001d\n\u0015local_service_account\u0018\u0005 \u0001(\t\u00128\n\u0011peer_rpc_versions\u0018\u0006 \u0001(\u000b2\u001d.grpc.gcp.RpcProtocolVersions\u0012B\n\u000fpeer_attributes\u0018\u0007 \u0003(\u000b2).grpc.gcp.AltsContext.PeerAttributesEntry\u001a5\n\u0013PeerAttributesEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\t:\u00028\u0001Bl\n\u0015io.grpc.alts.internalB\u0010AltsContextProtoP\u0001Z?google.golang.org/grpc/credentials/alts/internal/proto/grpc_gcpb\u0006proto3"}, new Descriptors.FileDescriptor[]{TransportSecurityCommonProto.getDescriptor()});
    static final Descriptors.Descriptor internal_static_grpc_gcp_AltsContext_PeerAttributesEntry_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_grpc_gcp_AltsContext_PeerAttributesEntry_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_grpc_gcp_AltsContext_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_grpc_gcp_AltsContext_fieldAccessorTable;

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private AltsContextProto() {
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_grpc_gcp_AltsContext_descriptor = descriptor2;
        internal_static_grpc_gcp_AltsContext_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"ApplicationProtocol", "RecordProtocol", "SecurityLevel", "PeerServiceAccount", "LocalServiceAccount", "PeerRpcVersions", "PeerAttributes"});
        Descriptors.Descriptor descriptor3 = descriptor2.getNestedTypes().get(0);
        internal_static_grpc_gcp_AltsContext_PeerAttributesEntry_descriptor = descriptor3;
        internal_static_grpc_gcp_AltsContext_PeerAttributesEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Key", "Value"});
        TransportSecurityCommonProto.getDescriptor();
    }
}
