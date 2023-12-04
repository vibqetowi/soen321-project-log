package com.google.type;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
/* loaded from: classes6.dex */
public interface MoneyOrBuilder extends MessageOrBuilder {
    String getCurrencyCode();

    ByteString getCurrencyCodeBytes();

    int getNanos();

    long getUnits();
}
