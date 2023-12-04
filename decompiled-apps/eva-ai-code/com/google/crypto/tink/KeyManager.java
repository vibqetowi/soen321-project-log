package com.google.crypto.tink;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import java.security.GeneralSecurityException;
/* loaded from: classes7.dex */
public interface KeyManager<P> {
    boolean doesSupport(String typeUrl);

    String getKeyType();

    P getPrimitive(ByteString serializedKey) throws GeneralSecurityException;

    P getPrimitive(MessageLite key) throws GeneralSecurityException;

    Class<P> getPrimitiveClass();

    int getVersion();

    MessageLite newKey(ByteString serializedKeyFormat) throws GeneralSecurityException;

    MessageLite newKey(MessageLite keyFormat) throws GeneralSecurityException;

    KeyData newKeyData(ByteString serializedKeyFormat) throws GeneralSecurityException;
}
