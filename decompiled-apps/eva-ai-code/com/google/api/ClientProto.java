package com.google.api;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import java.util.List;
/* loaded from: classes7.dex */
public final class ClientProto {
    public static final int DEFAULT_HOST_FIELD_NUMBER = 1049;
    public static final int METHOD_SIGNATURE_FIELD_NUMBER = 1051;
    public static final int OAUTH_SCOPES_FIELD_NUMBER = 1050;
    public static final GeneratedMessage.GeneratedExtension<DescriptorProtos.ServiceOptions, String> defaultHost;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<DescriptorProtos.MethodOptions, List<String>> methodSignature;
    public static final GeneratedMessage.GeneratedExtension<DescriptorProtos.ServiceOptions, String> oauthScopes;

    private ClientProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(methodSignature);
        extensionRegistryLite.add(defaultHost);
        extensionRegistryLite.add(oauthScopes);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    static {
        GeneratedMessage.GeneratedExtension<DescriptorProtos.MethodOptions, List<String>> newFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(String.class, null);
        methodSignature = newFileScopedGeneratedExtension;
        GeneratedMessage.GeneratedExtension<DescriptorProtos.ServiceOptions, String> newFileScopedGeneratedExtension2 = GeneratedMessage.newFileScopedGeneratedExtension(String.class, null);
        defaultHost = newFileScopedGeneratedExtension2;
        GeneratedMessage.GeneratedExtension<DescriptorProtos.ServiceOptions, String> newFileScopedGeneratedExtension3 = GeneratedMessage.newFileScopedGeneratedExtension(String.class, null);
        oauthScopes = newFileScopedGeneratedExtension3;
        Descriptors.FileDescriptor internalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0017google/api/client.proto\u0012\ngoogle.api\u001a google/protobuf/descriptor.proto:9\n\u0010method_signature\u0012\u001e.google.protobuf.MethodOptions\u0018\u009b\b \u0003(\t:6\n\fdefault_host\u0012\u001f.google.protobuf.ServiceOptions\u0018\u0099\b \u0001(\t:6\n\foauth_scopes\u0012\u001f.google.protobuf.ServiceOptions\u0018\u009a\b \u0001(\tBi\n\u000ecom.google.apiB\u000bClientProtoP\u0001ZAgoogle.golang.org/genproto/googleapis/api/annotations;annotations¢\u0002\u0004GAPIb\u0006proto3"}, new Descriptors.FileDescriptor[]{DescriptorProtos.getDescriptor()});
        descriptor = internalBuildGeneratedFileFrom;
        newFileScopedGeneratedExtension.internalInit(internalBuildGeneratedFileFrom.getExtensions().get(0));
        newFileScopedGeneratedExtension2.internalInit(descriptor.getExtensions().get(1));
        newFileScopedGeneratedExtension3.internalInit(descriptor.getExtensions().get(2));
        DescriptorProtos.getDescriptor();
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }
}
