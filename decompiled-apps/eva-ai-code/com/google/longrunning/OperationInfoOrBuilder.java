package com.google.longrunning;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
/* loaded from: classes6.dex */
public interface OperationInfoOrBuilder extends MessageOrBuilder {
    String getMetadataType();

    ByteString getMetadataTypeBytes();

    String getResponseType();

    ByteString getResponseTypeBytes();
}
