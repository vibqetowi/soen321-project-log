package io.grpc.protobuf;

import com.google.protobuf.Descriptors;
import javax.annotation.CheckReturnValue;
/* loaded from: classes4.dex */
public interface ProtoMethodDescriptorSupplier extends ProtoServiceDescriptorSupplier {
    @CheckReturnValue
    Descriptors.MethodDescriptor getMethodDescriptor();
}
