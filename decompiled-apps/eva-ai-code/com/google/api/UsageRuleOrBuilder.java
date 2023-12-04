package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
/* loaded from: classes7.dex */
public interface UsageRuleOrBuilder extends MessageOrBuilder {
    boolean getAllowUnregisteredCalls();

    String getSelector();

    ByteString getSelectorBytes();

    boolean getSkipServiceControl();
}
