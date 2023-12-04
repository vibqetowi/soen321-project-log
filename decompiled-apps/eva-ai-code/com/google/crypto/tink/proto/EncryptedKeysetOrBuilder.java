package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;
/* loaded from: classes7.dex */
public interface EncryptedKeysetOrBuilder extends MessageLiteOrBuilder {
    ByteString getEncryptedKeyset();

    KeysetInfo getKeysetInfo();

    boolean hasKeysetInfo();
}
