package com.google.api;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
/* loaded from: classes7.dex */
public final class BillingProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0018google/api/billing.proto\u0012\ngoogle.api\u001a\u0017google/api/metric.proto\"\u0093\u0001\n\u0007Billing\u0012E\n\u0015consumer_destinations\u0018\b \u0003(\u000b2&.google.api.Billing.BillingDestination\u001aA\n\u0012BillingDestination\u0012\u001a\n\u0012monitored_resource\u0018\u0001 \u0001(\t\u0012\u000f\n\u0007metrics\u0018\u0002 \u0003(\tBn\n\u000ecom.google.apiB\fBillingProtoP\u0001ZEgoogle.golang.org/genproto/googleapis/api/serviceconfig;serviceconfig¢\u0002\u0004GAPIb\u0006proto3"}, new Descriptors.FileDescriptor[]{MetricProto.getDescriptor()});
    static final Descriptors.Descriptor internal_static_google_api_Billing_BillingDestination_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_api_Billing_BillingDestination_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_api_Billing_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_api_Billing_fieldAccessorTable;

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private BillingProto() {
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_google_api_Billing_descriptor = descriptor2;
        internal_static_google_api_Billing_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"ConsumerDestinations"});
        Descriptors.Descriptor descriptor3 = descriptor2.getNestedTypes().get(0);
        internal_static_google_api_Billing_BillingDestination_descriptor = descriptor3;
        internal_static_google_api_Billing_BillingDestination_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"MonitoredResource", "Metrics"});
        MetricProto.getDescriptor();
    }
}
