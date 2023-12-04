package io.grpc.protobuf;

import com.google.protobuf.Descriptors;
/* loaded from: classes4.dex */
public interface ProtoServiceDescriptorSupplier extends ProtoFileDescriptorSupplier {
    Descriptors.ServiceDescriptor getServiceDescriptor();
}
