package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;
/* loaded from: classes7.dex */
public interface EciesHkdfKemParamsOrBuilder extends MessageLiteOrBuilder {
    EllipticCurveType getCurveType();

    int getCurveTypeValue();

    HashType getHkdfHashType();

    int getHkdfHashTypeValue();

    ByteString getHkdfSalt();
}
