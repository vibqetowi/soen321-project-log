package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;
/* loaded from: classes7.dex */
public interface AesCtrHmacStreamingKeyFormatOrBuilder extends MessageLiteOrBuilder {
    int getKeySize();

    AesCtrHmacStreamingParams getParams();

    int getVersion();

    boolean hasParams();
}
