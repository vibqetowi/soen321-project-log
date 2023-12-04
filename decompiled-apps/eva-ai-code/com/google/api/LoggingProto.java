package com.google.api;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
/* loaded from: classes7.dex */
public final class LoggingProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0018google/api/logging.proto\u0012\ngoogle.api\"×\u0001\n\u0007Logging\u0012E\n\u0015producer_destinations\u0018\u0001 \u0003(\u000b2&.google.api.Logging.LoggingDestination\u0012E\n\u0015consumer_destinations\u0018\u0002 \u0003(\u000b2&.google.api.Logging.LoggingDestination\u001a>\n\u0012LoggingDestination\u0012\u001a\n\u0012monitored_resource\u0018\u0003 \u0001(\t\u0012\f\n\u0004logs\u0018\u0001 \u0003(\tBn\n\u000ecom.google.apiB\fLoggingProtoP\u0001ZEgoogle.golang.org/genproto/googleapis/api/serviceconfig;serviceconfig¢\u0002\u0004GAPIb\u0006proto3"}, new Descriptors.FileDescriptor[0]);
    static final Descriptors.Descriptor internal_static_google_api_Logging_LoggingDestination_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_api_Logging_LoggingDestination_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_api_Logging_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_api_Logging_fieldAccessorTable;

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private LoggingProto() {
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_google_api_Logging_descriptor = descriptor2;
        internal_static_google_api_Logging_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"ProducerDestinations", "ConsumerDestinations"});
        Descriptors.Descriptor descriptor3 = descriptor2.getNestedTypes().get(0);
        internal_static_google_api_Logging_LoggingDestination_descriptor = descriptor3;
        internal_static_google_api_Logging_LoggingDestination_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"MonitoredResource", "Logs"});
    }
}
