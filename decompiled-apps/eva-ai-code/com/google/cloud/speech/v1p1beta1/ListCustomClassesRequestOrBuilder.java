package com.google.cloud.speech.v1p1beta1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
/* loaded from: classes7.dex */
public interface ListCustomClassesRequestOrBuilder extends MessageOrBuilder {
    int getPageSize();

    String getPageToken();

    ByteString getPageTokenBytes();

    String getParent();

    ByteString getParentBytes();
}
