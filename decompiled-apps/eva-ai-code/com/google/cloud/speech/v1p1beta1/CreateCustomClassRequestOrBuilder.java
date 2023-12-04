package com.google.cloud.speech.v1p1beta1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
/* loaded from: classes7.dex */
public interface CreateCustomClassRequestOrBuilder extends MessageOrBuilder {
    CustomClass getCustomClass();

    String getCustomClassId();

    ByteString getCustomClassIdBytes();

    CustomClassOrBuilder getCustomClassOrBuilder();

    String getParent();

    ByteString getParentBytes();

    boolean hasCustomClass();
}
