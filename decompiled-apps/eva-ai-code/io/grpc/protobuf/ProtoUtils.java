package io.grpc.protobuf;

import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.Message;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.lite.ProtoLiteUtils;
/* loaded from: classes4.dex */
public final class ProtoUtils {
    public static void setExtensionRegistry(ExtensionRegistry extensionRegistry) {
        ProtoLiteUtils.setExtensionRegistry(extensionRegistry);
    }

    public static <T extends Message> MethodDescriptor.Marshaller<T> marshaller(T t) {
        return ProtoLiteUtils.marshaller(t);
    }

    public static <T extends Message> Metadata.Key<T> keyForProto(T t) {
        return Metadata.Key.of(t.getDescriptorForType().getFullName() + Metadata.BINARY_HEADER_SUFFIX, metadataMarshaller(t));
    }

    public static <T extends Message> Metadata.BinaryMarshaller<T> metadataMarshaller(T t) {
        return ProtoLiteUtils.metadataMarshaller(t);
    }

    private ProtoUtils() {
    }
}
