package com.google.type;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
/* loaded from: classes6.dex */
public final class LatLngProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0018google/type/latlng.proto\u0012\u000bgoogle.type\"-\n\u0006LatLng\u0012\u0010\n\blatitude\u0018\u0001 \u0001(\u0001\u0012\u0011\n\tlongitude\u0018\u0002 \u0001(\u0001Bc\n\u000fcom.google.typeB\u000bLatLngProtoP\u0001Z8google.golang.org/genproto/googleapis/type/latlng;latlngø\u0001\u0001¢\u0002\u0003GTPb\u0006proto3"}, new Descriptors.FileDescriptor[0]);
    static final Descriptors.Descriptor internal_static_google_type_LatLng_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_type_LatLng_fieldAccessorTable;

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private LatLngProto() {
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_google_type_LatLng_descriptor = descriptor2;
        internal_static_google_type_LatLng_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Latitude", "Longitude"});
    }
}
