package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;
/* loaded from: classes7.dex */
public interface EcdsaPrivateKeyOrBuilder extends MessageLiteOrBuilder {
    ByteString getKeyValue();

    EcdsaPublicKey getPublicKey();

    int getVersion();

    boolean hasPublicKey();
}
