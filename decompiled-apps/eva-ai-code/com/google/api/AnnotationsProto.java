package com.google.api;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
/* loaded from: classes7.dex */
public final class AnnotationsProto {
    public static final int HTTP_FIELD_NUMBER = 72295728;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<DescriptorProtos.MethodOptions, HttpRule> http;

    private AnnotationsProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(http);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    static {
        GeneratedMessage.GeneratedExtension<DescriptorProtos.MethodOptions, HttpRule> newFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(HttpRule.class, HttpRule.getDefaultInstance());
        http = newFileScopedGeneratedExtension;
        Descriptors.FileDescriptor internalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001cgoogle/api/annotations.proto\u0012\ngoogle.api\u001a\u0015google/api/http.proto\u001a google/protobuf/descriptor.proto:E\n\u0004http\u0012\u001e.google.protobuf.MethodOptions\u0018°Ê¼\" \u0001(\u000b2\u0014.google.api.HttpRuleBn\n\u000ecom.google.apiB\u0010AnnotationsProtoP\u0001ZAgoogle.golang.org/genproto/googleapis/api/annotations;annotations¢\u0002\u0004GAPIb\u0006proto3"}, new Descriptors.FileDescriptor[]{HttpProto.getDescriptor(), DescriptorProtos.getDescriptor()});
        descriptor = internalBuildGeneratedFileFrom;
        newFileScopedGeneratedExtension.internalInit(internalBuildGeneratedFileFrom.getExtensions().get(0));
        HttpProto.getDescriptor();
        DescriptorProtos.getDescriptor();
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }
}
