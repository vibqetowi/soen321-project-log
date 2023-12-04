package com.google.api;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.GeneratedMessageV3;
import java.util.List;
/* loaded from: classes7.dex */
public final class ResourceProto {
    public static final int RESOURCE_DEFINITION_FIELD_NUMBER = 1053;
    public static final int RESOURCE_FIELD_NUMBER = 1053;
    public static final int RESOURCE_REFERENCE_FIELD_NUMBER = 1055;
    private static Descriptors.FileDescriptor descriptor;
    static final Descriptors.Descriptor internal_static_google_api_ResourceDescriptor_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_api_ResourceDescriptor_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_api_ResourceReference_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_api_ResourceReference_fieldAccessorTable;
    public static final GeneratedMessage.GeneratedExtension<DescriptorProtos.MessageOptions, ResourceDescriptor> resource;
    public static final GeneratedMessage.GeneratedExtension<DescriptorProtos.FileOptions, List<ResourceDescriptor>> resourceDefinition;
    public static final GeneratedMessage.GeneratedExtension<DescriptorProtos.FieldOptions, ResourceReference> resourceReference;

    private ResourceProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(resourceReference);
        extensionRegistryLite.add(resourceDefinition);
        extensionRegistryLite.add(resource);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    static {
        GeneratedMessage.GeneratedExtension<DescriptorProtos.FieldOptions, ResourceReference> newFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(ResourceReference.class, ResourceReference.getDefaultInstance());
        resourceReference = newFileScopedGeneratedExtension;
        GeneratedMessage.GeneratedExtension<DescriptorProtos.FileOptions, List<ResourceDescriptor>> newFileScopedGeneratedExtension2 = GeneratedMessage.newFileScopedGeneratedExtension(ResourceDescriptor.class, ResourceDescriptor.getDefaultInstance());
        resourceDefinition = newFileScopedGeneratedExtension2;
        GeneratedMessage.GeneratedExtension<DescriptorProtos.MessageOptions, ResourceDescriptor> newFileScopedGeneratedExtension3 = GeneratedMessage.newFileScopedGeneratedExtension(ResourceDescriptor.class, ResourceDescriptor.getDefaultInstance());
        resource = newFileScopedGeneratedExtension3;
        descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0019google/api/resource.proto\u0012\ngoogle.api\u001a google/protobuf/descriptor.proto\"î\u0002\n\u0012ResourceDescriptor\u0012\f\n\u0004type\u0018\u0001 \u0001(\t\u0012\u000f\n\u0007pattern\u0018\u0002 \u0003(\t\u0012\u0012\n\nname_field\u0018\u0003 \u0001(\t\u00127\n\u0007history\u0018\u0004 \u0001(\u000e2&.google.api.ResourceDescriptor.History\u0012\u000e\n\u0006plural\u0018\u0005 \u0001(\t\u0012\u0010\n\bsingular\u0018\u0006 \u0001(\t\u00123\n\u0005style\u0018\n \u0003(\u000e2$.google.api.ResourceDescriptor.Style\"[\n\u0007History\u0012\u0017\n\u0013HISTORY_UNSPECIFIED\u0010\u0000\u0012\u001d\n\u0019ORIGINALLY_SINGLE_PATTERN\u0010\u0001\u0012\u0018\n\u0014FUTURE_MULTI_PATTERN\u0010\u0002\"8\n\u0005Style\u0012\u0015\n\u0011STYLE_UNSPECIFIED\u0010\u0000\u0012\u0018\n\u0014DECLARATIVE_FRIENDLY\u0010\u0001\"5\n\u0011ResourceReference\u0012\f\n\u0004type\u0018\u0001 \u0001(\t\u0012\u0012\n\nchild_type\u0018\u0002 \u0001(\t:Y\n\u0012resource_reference\u0012\u001d.google.protobuf.FieldOptions\u0018\u009f\b \u0001(\u000b2\u001d.google.api.ResourceReference:Z\n\u0013resource_definition\u0012\u001c.google.protobuf.FileOptions\u0018\u009d\b \u0003(\u000b2\u001e.google.api.ResourceDescriptor:R\n\bresource\u0012\u001f.google.protobuf.MessageOptions\u0018\u009d\b \u0001(\u000b2\u001e.google.api.ResourceDescriptorBn\n\u000ecom.google.apiB\rResourceProtoP\u0001ZAgoogle.golang.org/genproto/googleapis/api/annotations;annotationsø\u0001\u0001¢\u0002\u0004GAPIb\u0006proto3"}, new Descriptors.FileDescriptor[]{DescriptorProtos.getDescriptor()});
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_google_api_ResourceDescriptor_descriptor = descriptor2;
        internal_static_google_api_ResourceDescriptor_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Type", "Pattern", "NameField", "History", "Plural", "Singular", "Style"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_google_api_ResourceReference_descriptor = descriptor3;
        internal_static_google_api_ResourceReference_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Type", "ChildType"});
        newFileScopedGeneratedExtension.internalInit(descriptor.getExtensions().get(0));
        newFileScopedGeneratedExtension2.internalInit(descriptor.getExtensions().get(1));
        newFileScopedGeneratedExtension3.internalInit(descriptor.getExtensions().get(2));
        DescriptorProtos.getDescriptor();
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }
}
