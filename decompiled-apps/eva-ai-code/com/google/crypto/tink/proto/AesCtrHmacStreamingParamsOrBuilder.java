package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;
/* loaded from: classes7.dex */
public interface AesCtrHmacStreamingParamsOrBuilder extends MessageLiteOrBuilder {
    int getCiphertextSegmentSize();

    int getDerivedKeySize();

    HashType getHkdfHashType();

    int getHkdfHashTypeValue();

    HmacParams getHmacParams();

    boolean hasHmacParams();
}
