package com.google.api;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
/* loaded from: classes7.dex */
public final class MonitoringProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001bgoogle/api/monitoring.proto\u0012\ngoogle.api\"ì\u0001\n\nMonitoring\u0012K\n\u0015producer_destinations\u0018\u0001 \u0003(\u000b2,.google.api.Monitoring.MonitoringDestination\u0012K\n\u0015consumer_destinations\u0018\u0002 \u0003(\u000b2,.google.api.Monitoring.MonitoringDestination\u001aD\n\u0015MonitoringDestination\u0012\u001a\n\u0012monitored_resource\u0018\u0001 \u0001(\t\u0012\u000f\n\u0007metrics\u0018\u0002 \u0003(\tBq\n\u000ecom.google.apiB\u000fMonitoringProtoP\u0001ZEgoogle.golang.org/genproto/googleapis/api/serviceconfig;serviceconfig¢\u0002\u0004GAPIb\u0006proto3"}, new Descriptors.FileDescriptor[0]);
    static final Descriptors.Descriptor internal_static_google_api_Monitoring_MonitoringDestination_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_api_Monitoring_MonitoringDestination_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_api_Monitoring_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_api_Monitoring_fieldAccessorTable;

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private MonitoringProto() {
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_google_api_Monitoring_descriptor = descriptor2;
        internal_static_google_api_Monitoring_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"ProducerDestinations", "ConsumerDestinations"});
        Descriptors.Descriptor descriptor3 = descriptor2.getNestedTypes().get(0);
        internal_static_google_api_Monitoring_MonitoringDestination_descriptor = descriptor3;
        internal_static_google_api_Monitoring_MonitoringDestination_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"MonitoredResource", "Metrics"});
    }
}
