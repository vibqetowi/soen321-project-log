package io.grpc.alts.internal;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
/* loaded from: classes4.dex */
public final class HandshakerProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0019grpc/gcp/handshaker.proto\u0012\bgrpc.gcp\u001a(grpc/gcp/transport_security_common.proto\"Y\n\bEndpoint\u0012\u0012\n\nip_address\u0018\u0001 \u0001(\t\u0012\f\n\u0004port\u0018\u0002 \u0001(\u0005\u0012+\n\bprotocol\u0018\u0003 \u0001(\u000e2\u0019.grpc.gcp.NetworkProtocol\"¶\u0001\n\bIdentity\u0012\u0019\n\u000fservice_account\u0018\u0001 \u0001(\tH\u0000\u0012\u0012\n\bhostname\u0018\u0002 \u0001(\tH\u0000\u00126\n\nattributes\u0018\u0003 \u0003(\u000b2\".grpc.gcp.Identity.AttributesEntry\u001a1\n\u000fAttributesEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\t:\u00028\u0001B\u0010\n\u000eidentity_oneof\"ª\u0003\n\u0017StartClientHandshakeReq\u0012@\n\u001bhandshake_security_protocol\u0018\u0001 \u0001(\u000e2\u001b.grpc.gcp.HandshakeProtocol\u0012\u001d\n\u0015application_protocols\u0018\u0002 \u0003(\t\u0012\u0018\n\u0010record_protocols\u0018\u0003 \u0003(\t\u0012-\n\u0011target_identities\u0018\u0004 \u0003(\u000b2\u0012.grpc.gcp.Identity\u0012*\n\u000elocal_identity\u0018\u0005 \u0001(\u000b2\u0012.grpc.gcp.Identity\u0012*\n\u000elocal_endpoint\u0018\u0006 \u0001(\u000b2\u0012.grpc.gcp.Endpoint\u0012+\n\u000fremote_endpoint\u0018\u0007 \u0001(\u000b2\u0012.grpc.gcp.Endpoint\u0012\u0013\n\u000btarget_name\u0018\b \u0001(\t\u00123\n\frpc_versions\u0018\t \u0001(\u000b2\u001d.grpc.gcp.RpcProtocolVersions\u0012\u0016\n\u000emax_frame_size\u0018\n \u0001(\r\"c\n\u0019ServerHandshakeParameters\u0012\u0018\n\u0010record_protocols\u0018\u0001 \u0003(\t\u0012,\n\u0010local_identities\u0018\u0002 \u0003(\u000b2\u0012.grpc.gcp.Identity\"«\u0003\n\u0017StartServerHandshakeReq\u0012\u001d\n\u0015application_protocols\u0018\u0001 \u0003(\t\u0012X\n\u0014handshake_parameters\u0018\u0002 \u0003(\u000b2:.grpc.gcp.StartServerHandshakeReq.HandshakeParametersEntry\u0012\u0010\n\bin_bytes\u0018\u0003 \u0001(\f\u0012*\n\u000elocal_endpoint\u0018\u0004 \u0001(\u000b2\u0012.grpc.gcp.Endpoint\u0012+\n\u000fremote_endpoint\u0018\u0005 \u0001(\u000b2\u0012.grpc.gcp.Endpoint\u00123\n\frpc_versions\u0018\u0006 \u0001(\u000b2\u001d.grpc.gcp.RpcProtocolVersions\u0012\u0016\n\u000emax_frame_size\u0018\u0007 \u0001(\r\u001a_\n\u0018HandshakeParametersEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\u0005\u00122\n\u0005value\u0018\u0002 \u0001(\u000b2#.grpc.gcp.ServerHandshakeParameters:\u00028\u0001\"+\n\u0017NextHandshakeMessageReq\u0012\u0010\n\bin_bytes\u0018\u0001 \u0001(\f\"Å\u0001\n\rHandshakerReq\u00129\n\fclient_start\u0018\u0001 \u0001(\u000b2!.grpc.gcp.StartClientHandshakeReqH\u0000\u00129\n\fserver_start\u0018\u0002 \u0001(\u000b2!.grpc.gcp.StartServerHandshakeReqH\u0000\u00121\n\u0004next\u0018\u0003 \u0001(\u000b2!.grpc.gcp.NextHandshakeMessageReqH\u0000B\u000b\n\treq_oneof\"\u009f\u0002\n\u0010HandshakerResult\u0012\u001c\n\u0014application_protocol\u0018\u0001 \u0001(\t\u0012\u0017\n\u000frecord_protocol\u0018\u0002 \u0001(\t\u0012\u0010\n\bkey_data\u0018\u0003 \u0001(\f\u0012)\n\rpeer_identity\u0018\u0004 \u0001(\u000b2\u0012.grpc.gcp.Identity\u0012*\n\u000elocal_identity\u0018\u0005 \u0001(\u000b2\u0012.grpc.gcp.Identity\u0012\u0019\n\u0011keep_channel_open\u0018\u0006 \u0001(\b\u00128\n\u0011peer_rpc_versions\u0018\u0007 \u0001(\u000b2\u001d.grpc.gcp.RpcProtocolVersions\u0012\u0016\n\u000emax_frame_size\u0018\b \u0001(\r\"1\n\u0010HandshakerStatus\u0012\f\n\u0004code\u0018\u0001 \u0001(\r\u0012\u000f\n\u0007details\u0018\u0002 \u0001(\t\"\u0094\u0001\n\u000eHandshakerResp\u0012\u0012\n\nout_frames\u0018\u0001 \u0001(\f\u0012\u0016\n\u000ebytes_consumed\u0018\u0002 \u0001(\r\u0012*\n\u0006result\u0018\u0003 \u0001(\u000b2\u001a.grpc.gcp.HandshakerResult\u0012*\n\u0006status\u0018\u0004 \u0001(\u000b2\u001a.grpc.gcp.HandshakerStatus*J\n\u0011HandshakeProtocol\u0012\"\n\u001eHANDSHAKE_PROTOCOL_UNSPECIFIED\u0010\u0000\u0012\u0007\n\u0003TLS\u0010\u0001\u0012\b\n\u0004ALTS\u0010\u0002*E\n\u000fNetworkProtocol\u0012 \n\u001cNETWORK_PROTOCOL_UNSPECIFIED\u0010\u0000\u0012\u0007\n\u0003TCP\u0010\u0001\u0012\u0007\n\u0003UDP\u0010\u00022[\n\u0011HandshakerService\u0012F\n\u000bDoHandshake\u0012\u0017.grpc.gcp.HandshakerReq\u001a\u0018.grpc.gcp.HandshakerResp\"\u0000(\u00010\u0001Bk\n\u0015io.grpc.alts.internalB\u000fHandshakerProtoP\u0001Z?google.golang.org/grpc/credentials/alts/internal/proto/grpc_gcpb\u0006proto3"}, new Descriptors.FileDescriptor[]{TransportSecurityCommonProto.getDescriptor()});
    static final Descriptors.Descriptor internal_static_grpc_gcp_Endpoint_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_grpc_gcp_Endpoint_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_grpc_gcp_HandshakerReq_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_grpc_gcp_HandshakerReq_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_grpc_gcp_HandshakerResp_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_grpc_gcp_HandshakerResp_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_grpc_gcp_HandshakerResult_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_grpc_gcp_HandshakerResult_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_grpc_gcp_HandshakerStatus_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_grpc_gcp_HandshakerStatus_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_grpc_gcp_Identity_AttributesEntry_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_grpc_gcp_Identity_AttributesEntry_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_grpc_gcp_Identity_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_grpc_gcp_Identity_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_grpc_gcp_NextHandshakeMessageReq_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_grpc_gcp_NextHandshakeMessageReq_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_grpc_gcp_ServerHandshakeParameters_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_grpc_gcp_ServerHandshakeParameters_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_grpc_gcp_StartClientHandshakeReq_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_grpc_gcp_StartClientHandshakeReq_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_grpc_gcp_StartServerHandshakeReq_HandshakeParametersEntry_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_grpc_gcp_StartServerHandshakeReq_HandshakeParametersEntry_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_grpc_gcp_StartServerHandshakeReq_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_grpc_gcp_StartServerHandshakeReq_fieldAccessorTable;

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private HandshakerProto() {
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_grpc_gcp_Endpoint_descriptor = descriptor2;
        internal_static_grpc_gcp_Endpoint_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"IpAddress", "Port", "Protocol"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_grpc_gcp_Identity_descriptor = descriptor3;
        internal_static_grpc_gcp_Identity_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"ServiceAccount", "Hostname", "Attributes", "IdentityOneof"});
        Descriptors.Descriptor descriptor4 = descriptor3.getNestedTypes().get(0);
        internal_static_grpc_gcp_Identity_AttributesEntry_descriptor = descriptor4;
        internal_static_grpc_gcp_Identity_AttributesEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Key", "Value"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(2);
        internal_static_grpc_gcp_StartClientHandshakeReq_descriptor = descriptor5;
        internal_static_grpc_gcp_StartClientHandshakeReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"HandshakeSecurityProtocol", "ApplicationProtocols", "RecordProtocols", "TargetIdentities", "LocalIdentity", "LocalEndpoint", "RemoteEndpoint", "TargetName", "RpcVersions", "MaxFrameSize"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(3);
        internal_static_grpc_gcp_ServerHandshakeParameters_descriptor = descriptor6;
        internal_static_grpc_gcp_ServerHandshakeParameters_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"RecordProtocols", "LocalIdentities"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(4);
        internal_static_grpc_gcp_StartServerHandshakeReq_descriptor = descriptor7;
        internal_static_grpc_gcp_StartServerHandshakeReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"ApplicationProtocols", "HandshakeParameters", "InBytes", "LocalEndpoint", "RemoteEndpoint", "RpcVersions", "MaxFrameSize"});
        Descriptors.Descriptor descriptor8 = descriptor7.getNestedTypes().get(0);
        internal_static_grpc_gcp_StartServerHandshakeReq_HandshakeParametersEntry_descriptor = descriptor8;
        internal_static_grpc_gcp_StartServerHandshakeReq_HandshakeParametersEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Key", "Value"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(5);
        internal_static_grpc_gcp_NextHandshakeMessageReq_descriptor = descriptor9;
        internal_static_grpc_gcp_NextHandshakeMessageReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"InBytes"});
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(6);
        internal_static_grpc_gcp_HandshakerReq_descriptor = descriptor10;
        internal_static_grpc_gcp_HandshakerReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"ClientStart", "ServerStart", "Next", "ReqOneof"});
        Descriptors.Descriptor descriptor11 = getDescriptor().getMessageTypes().get(7);
        internal_static_grpc_gcp_HandshakerResult_descriptor = descriptor11;
        internal_static_grpc_gcp_HandshakerResult_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"ApplicationProtocol", "RecordProtocol", "KeyData", "PeerIdentity", "LocalIdentity", "KeepChannelOpen", "PeerRpcVersions", "MaxFrameSize"});
        Descriptors.Descriptor descriptor12 = getDescriptor().getMessageTypes().get(8);
        internal_static_grpc_gcp_HandshakerStatus_descriptor = descriptor12;
        internal_static_grpc_gcp_HandshakerStatus_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"Code", "Details"});
        Descriptors.Descriptor descriptor13 = getDescriptor().getMessageTypes().get(9);
        internal_static_grpc_gcp_HandshakerResp_descriptor = descriptor13;
        internal_static_grpc_gcp_HandshakerResp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"OutFrames", "BytesConsumed", "Result", "Status"});
        TransportSecurityCommonProto.getDescriptor();
    }
}
