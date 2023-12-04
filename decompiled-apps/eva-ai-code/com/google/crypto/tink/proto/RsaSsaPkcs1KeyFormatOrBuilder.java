package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;
/* loaded from: classes7.dex */
public interface RsaSsaPkcs1KeyFormatOrBuilder extends MessageLiteOrBuilder {
    int getModulusSizeInBits();

    RsaSsaPkcs1Params getParams();

    ByteString getPublicExponent();

    boolean hasParams();
}
