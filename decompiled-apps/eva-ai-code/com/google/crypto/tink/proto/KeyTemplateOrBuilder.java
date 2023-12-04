package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;
/* loaded from: classes7.dex */
public interface KeyTemplateOrBuilder extends MessageLiteOrBuilder {
    OutputPrefixType getOutputPrefixType();

    int getOutputPrefixTypeValue();

    String getTypeUrl();

    ByteString getTypeUrlBytes();

    ByteString getValue();
}
