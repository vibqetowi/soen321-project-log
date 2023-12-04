package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;
/* loaded from: classes7.dex */
public interface HkdfPrfKeyFormatOrBuilder extends MessageLiteOrBuilder {
    int getKeySize();

    HkdfPrfParams getParams();

    int getVersion();

    boolean hasParams();
}
