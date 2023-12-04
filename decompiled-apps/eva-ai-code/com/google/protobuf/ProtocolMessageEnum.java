package com.google.protobuf;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
/* loaded from: classes6.dex */
public interface ProtocolMessageEnum extends Internal.EnumLite {
    Descriptors.EnumDescriptor getDescriptorForType();

    @Override // com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
    int getNumber();

    Descriptors.EnumValueDescriptor getValueDescriptor();
}
