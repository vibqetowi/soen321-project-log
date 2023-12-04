package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;
/* loaded from: classes7.dex */
public interface HkdfPrfParamsOrBuilder extends MessageLiteOrBuilder {
    HashType getHash();

    int getHashValue();

    ByteString getSalt();
}
