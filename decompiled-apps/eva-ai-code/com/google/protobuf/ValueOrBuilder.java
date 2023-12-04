package com.google.protobuf;

import com.google.protobuf.Value;
/* loaded from: classes6.dex */
public interface ValueOrBuilder extends MessageOrBuilder {
    boolean getBoolValue();

    Value.KindCase getKindCase();

    ListValue getListValue();

    ListValueOrBuilder getListValueOrBuilder();

    NullValue getNullValue();

    int getNullValueValue();

    double getNumberValue();

    String getStringValue();

    ByteString getStringValueBytes();

    Struct getStructValue();

    StructOrBuilder getStructValueOrBuilder();

    boolean hasBoolValue();

    boolean hasListValue();

    boolean hasNullValue();

    boolean hasNumberValue();

    boolean hasStringValue();

    boolean hasStructValue();
}
