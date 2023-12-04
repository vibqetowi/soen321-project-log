package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
/* loaded from: classes7.dex */
public interface DocumentationRuleOrBuilder extends MessageOrBuilder {
    String getDeprecationDescription();

    ByteString getDeprecationDescriptionBytes();

    String getDescription();

    ByteString getDescriptionBytes();

    String getSelector();

    ByteString getSelectorBytes();
}
