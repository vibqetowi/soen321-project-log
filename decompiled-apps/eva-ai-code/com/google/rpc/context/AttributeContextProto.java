package com.google.rpc.context;

import com.google.protobuf.AnyProto;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.StructProto;
import com.google.protobuf.TimestampProto;
import io.grpc.netty.shaded.io.netty.handler.codec.http.cookie.CookieHeaderNames;
import org.apache.http.HttpHeaders;
/* loaded from: classes6.dex */
public final class AttributeContextProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n*google/rpc/context/attribute_context.proto\u0012\u0012google.rpc.context\u001a\u0019google/protobuf/any.proto\u001a\u001cgoogle/protobuf/struct.proto\u001a\u001fgoogle/protobuf/timestamp.proto\"ð\f\n\u0010AttributeContext\u00129\n\u0006origin\u0018\u0007 \u0001(\u000b2).google.rpc.context.AttributeContext.Peer\u00129\n\u0006source\u0018\u0001 \u0001(\u000b2).google.rpc.context.AttributeContext.Peer\u0012>\n\u000bdestination\u0018\u0002 \u0001(\u000b2).google.rpc.context.AttributeContext.Peer\u0012=\n\u0007request\u0018\u0003 \u0001(\u000b2,.google.rpc.context.AttributeContext.Request\u0012?\n\bresponse\u0018\u0004 \u0001(\u000b2-.google.rpc.context.AttributeContext.Response\u0012?\n\bresource\u0018\u0005 \u0001(\u000b2-.google.rpc.context.AttributeContext.Resource\u00125\n\u0003api\u0018\u0006 \u0001(\u000b2(.google.rpc.context.AttributeContext.Api\u0012(\n\nextensions\u0018\b \u0003(\u000b2\u0014.google.protobuf.Any\u001a¾\u0001\n\u0004Peer\u0012\n\n\u0002ip\u0018\u0001 \u0001(\t\u0012\f\n\u0004port\u0018\u0002 \u0001(\u0003\u0012E\n\u0006labels\u0018\u0006 \u0003(\u000b25.google.rpc.context.AttributeContext.Peer.LabelsEntry\u0012\u0011\n\tprincipal\u0018\u0007 \u0001(\t\u0012\u0013\n\u000bregion_code\u0018\b \u0001(\t\u001a-\n\u000bLabelsEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\t:\u00028\u0001\u001aL\n\u0003Api\u0012\u000f\n\u0007service\u0018\u0001 \u0001(\t\u0012\u0011\n\toperation\u0018\u0002 \u0001(\t\u0012\u0010\n\bprotocol\u0018\u0003 \u0001(\t\u0012\u000f\n\u0007version\u0018\u0004 \u0001(\t\u001a\u007f\n\u0004Auth\u0012\u0011\n\tprincipal\u0018\u0001 \u0001(\t\u0012\u0011\n\taudiences\u0018\u0002 \u0003(\t\u0012\u0011\n\tpresenter\u0018\u0003 \u0001(\t\u0012'\n\u0006claims\u0018\u0004 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012\u0015\n\raccess_levels\u0018\u0005 \u0003(\t\u001aï\u0002\n\u0007Request\u0012\n\n\u0002id\u0018\u0001 \u0001(\t\u0012\u000e\n\u0006method\u0018\u0002 \u0001(\t\u0012J\n\u0007headers\u0018\u0003 \u0003(\u000b29.google.rpc.context.AttributeContext.Request.HeadersEntry\u0012\f\n\u0004path\u0018\u0004 \u0001(\t\u0012\f\n\u0004host\u0018\u0005 \u0001(\t\u0012\u000e\n\u0006scheme\u0018\u0006 \u0001(\t\u0012\r\n\u0005query\u0018\u0007 \u0001(\t\u0012(\n\u0004time\u0018\t \u0001(\u000b2\u001a.google.protobuf.Timestamp\u0012\f\n\u0004size\u0018\n \u0001(\u0003\u0012\u0010\n\bprotocol\u0018\u000b \u0001(\t\u0012\u000e\n\u0006reason\u0018\f \u0001(\t\u00127\n\u0004auth\u0018\r \u0001(\u000b2).google.rpc.context.AttributeContext.Auth\u001a.\n\fHeadersEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\t:\u00028\u0001\u001aÍ\u0001\n\bResponse\u0012\f\n\u0004code\u0018\u0001 \u0001(\u0003\u0012\f\n\u0004size\u0018\u0002 \u0001(\u0003\u0012K\n\u0007headers\u0018\u0003 \u0003(\u000b2:.google.rpc.context.AttributeContext.Response.HeadersEntry\u0012(\n\u0004time\u0018\u0004 \u0001(\u000b2\u001a.google.protobuf.Timestamp\u001a.\n\fHeadersEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\t:\u00028\u0001\u001a±\u0001\n\bResource\u0012\u000f\n\u0007service\u0018\u0001 \u0001(\t\u0012\f\n\u0004name\u0018\u0002 \u0001(\t\u0012\f\n\u0004type\u0018\u0003 \u0001(\t\u0012I\n\u0006labels\u0018\u0004 \u0003(\u000b29.google.rpc.context.AttributeContext.Resource.LabelsEntry\u001a-\n\u000bLabelsEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\t:\u00028\u0001B\u008b\u0001\n\u0016com.google.rpc.contextB\u0015AttributeContextProtoP\u0001ZUgoogle.golang.org/genproto/googleapis/rpc/context/attribute_context;attribute_contextø\u0001\u0001b\u0006proto3"}, new Descriptors.FileDescriptor[]{AnyProto.getDescriptor(), StructProto.getDescriptor(), TimestampProto.getDescriptor()});
    static final Descriptors.Descriptor internal_static_google_rpc_context_AttributeContext_Api_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_rpc_context_AttributeContext_Api_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_rpc_context_AttributeContext_Auth_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_rpc_context_AttributeContext_Auth_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_rpc_context_AttributeContext_Peer_LabelsEntry_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_rpc_context_AttributeContext_Peer_LabelsEntry_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_rpc_context_AttributeContext_Peer_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_rpc_context_AttributeContext_Peer_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_rpc_context_AttributeContext_Request_HeadersEntry_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_rpc_context_AttributeContext_Request_HeadersEntry_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_rpc_context_AttributeContext_Request_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_rpc_context_AttributeContext_Request_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_rpc_context_AttributeContext_Resource_LabelsEntry_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_rpc_context_AttributeContext_Resource_LabelsEntry_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_rpc_context_AttributeContext_Resource_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_rpc_context_AttributeContext_Resource_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_rpc_context_AttributeContext_Response_HeadersEntry_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_rpc_context_AttributeContext_Response_HeadersEntry_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_rpc_context_AttributeContext_Response_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_rpc_context_AttributeContext_Response_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_rpc_context_AttributeContext_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_rpc_context_AttributeContext_fieldAccessorTable;

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private AttributeContextProto() {
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_google_rpc_context_AttributeContext_descriptor = descriptor2;
        internal_static_google_rpc_context_AttributeContext_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Origin", "Source", HttpHeaders.DESTINATION, "Request", "Response", "Resource", "Api", "Extensions"});
        Descriptors.Descriptor descriptor3 = descriptor2.getNestedTypes().get(0);
        internal_static_google_rpc_context_AttributeContext_Peer_descriptor = descriptor3;
        internal_static_google_rpc_context_AttributeContext_Peer_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Ip", "Port", "Labels", "Principal", "RegionCode"});
        Descriptors.Descriptor descriptor4 = descriptor3.getNestedTypes().get(0);
        internal_static_google_rpc_context_AttributeContext_Peer_LabelsEntry_descriptor = descriptor4;
        internal_static_google_rpc_context_AttributeContext_Peer_LabelsEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Key", "Value"});
        Descriptors.Descriptor descriptor5 = descriptor2.getNestedTypes().get(1);
        internal_static_google_rpc_context_AttributeContext_Api_descriptor = descriptor5;
        internal_static_google_rpc_context_AttributeContext_Api_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Service", "Operation", "Protocol", "Version"});
        Descriptors.Descriptor descriptor6 = descriptor2.getNestedTypes().get(2);
        internal_static_google_rpc_context_AttributeContext_Auth_descriptor = descriptor6;
        internal_static_google_rpc_context_AttributeContext_Auth_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Principal", "Audiences", "Presenter", "Claims", "AccessLevels"});
        Descriptors.Descriptor descriptor7 = descriptor2.getNestedTypes().get(3);
        internal_static_google_rpc_context_AttributeContext_Request_descriptor = descriptor7;
        internal_static_google_rpc_context_AttributeContext_Request_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"Id", "Method", "Headers", CookieHeaderNames.PATH, "Host", "Scheme", "Query", "Time", "Size", "Protocol", "Reason", "Auth"});
        Descriptors.Descriptor descriptor8 = descriptor7.getNestedTypes().get(0);
        internal_static_google_rpc_context_AttributeContext_Request_HeadersEntry_descriptor = descriptor8;
        internal_static_google_rpc_context_AttributeContext_Request_HeadersEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Key", "Value"});
        Descriptors.Descriptor descriptor9 = descriptor2.getNestedTypes().get(4);
        internal_static_google_rpc_context_AttributeContext_Response_descriptor = descriptor9;
        internal_static_google_rpc_context_AttributeContext_Response_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"Code", "Size", "Headers", "Time"});
        Descriptors.Descriptor descriptor10 = descriptor9.getNestedTypes().get(0);
        internal_static_google_rpc_context_AttributeContext_Response_HeadersEntry_descriptor = descriptor10;
        internal_static_google_rpc_context_AttributeContext_Response_HeadersEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"Key", "Value"});
        Descriptors.Descriptor descriptor11 = descriptor2.getNestedTypes().get(5);
        internal_static_google_rpc_context_AttributeContext_Resource_descriptor = descriptor11;
        internal_static_google_rpc_context_AttributeContext_Resource_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"Service", "Name", "Type", "Labels"});
        Descriptors.Descriptor descriptor12 = descriptor11.getNestedTypes().get(0);
        internal_static_google_rpc_context_AttributeContext_Resource_LabelsEntry_descriptor = descriptor12;
        internal_static_google_rpc_context_AttributeContext_Resource_LabelsEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"Key", "Value"});
        AnyProto.getDescriptor();
        StructProto.getDescriptor();
        TimestampProto.getDescriptor();
    }
}
