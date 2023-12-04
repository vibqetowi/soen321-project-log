package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;
/* loaded from: classes7.dex */
public interface AesEaxKeyFormatOrBuilder extends MessageLiteOrBuilder {
    int getKeySize();

    AesEaxParams getParams();

    boolean hasParams();
}
