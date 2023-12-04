package com.google.api;

import com.google.api.BackendRule;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
/* loaded from: classes7.dex */
public interface BackendRuleOrBuilder extends MessageOrBuilder {
    String getAddress();

    ByteString getAddressBytes();

    BackendRule.AuthenticationCase getAuthenticationCase();

    double getDeadline();

    boolean getDisableAuth();

    String getJwtAudience();

    ByteString getJwtAudienceBytes();

    double getMinDeadline();

    double getOperationDeadline();

    BackendRule.PathTranslation getPathTranslation();

    int getPathTranslationValue();

    String getProtocol();

    ByteString getProtocolBytes();

    String getSelector();

    ByteString getSelectorBytes();
}
