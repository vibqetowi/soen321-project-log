package com.google.crypto.tink.aead;

import com.google.crypto.tink.KeyTypeManager;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.proto.AesCtrKey;
import com.google.crypto.tink.proto.AesCtrKeyFormat;
import com.google.crypto.tink.proto.AesCtrParams;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.subtle.AesCtrJceCipher;
import com.google.crypto.tink.subtle.IndCpaCipher;
import com.google.crypto.tink.subtle.Random;
import com.google.crypto.tink.subtle.Validators;
import java.security.GeneralSecurityException;
/* loaded from: classes7.dex */
public class AesCtrKeyManager extends KeyTypeManager<AesCtrKey> {
    private static final int MIN_IV_SIZE_IN_BYTES = 12;

    @Override // com.google.crypto.tink.KeyTypeManager
    public String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public int getVersion() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AesCtrKeyManager() {
        super(AesCtrKey.class, new KeyTypeManager.PrimitiveFactory<IndCpaCipher, AesCtrKey>(IndCpaCipher.class) { // from class: com.google.crypto.tink.aead.AesCtrKeyManager.1
            @Override // com.google.crypto.tink.KeyTypeManager.PrimitiveFactory
            public IndCpaCipher getPrimitive(AesCtrKey key) throws GeneralSecurityException {
                return new AesCtrJceCipher(key.getKeyValue().toByteArray(), key.getParams().getIvSize());
            }
        });
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public KeyData.KeyMaterialType keyMaterialType() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public void validateKey(AesCtrKey key) throws GeneralSecurityException {
        Validators.validateVersion(key.getVersion(), getVersion());
        Validators.validateAesKeySize(key.getKeyValue().size());
        validateParams(key.getParams());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.KeyTypeManager
    public AesCtrKey parseKey(ByteString byteString) throws InvalidProtocolBufferException {
        return AesCtrKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public KeyTypeManager.KeyFactory<?, AesCtrKey> keyFactory() {
        return new KeyTypeManager.KeyFactory<AesCtrKeyFormat, AesCtrKey>(AesCtrKeyFormat.class) { // from class: com.google.crypto.tink.aead.AesCtrKeyManager.2
            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public void validateKeyFormat(AesCtrKeyFormat format) throws GeneralSecurityException {
                Validators.validateAesKeySize(format.getKeySize());
                AesCtrKeyManager.this.validateParams(format.getParams());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public AesCtrKeyFormat parseKeyFormat(ByteString byteString) throws InvalidProtocolBufferException {
                return AesCtrKeyFormat.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public AesCtrKey createKey(AesCtrKeyFormat format) throws GeneralSecurityException {
                return AesCtrKey.newBuilder().setParams(format.getParams()).setKeyValue(ByteString.copyFrom(Random.randBytes(format.getKeySize()))).setVersion(AesCtrKeyManager.this.getVersion()).build();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void validateParams(AesCtrParams params) throws GeneralSecurityException {
        if (params.getIvSize() < 12 || params.getIvSize() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    public static void register(boolean newKeyAllowed) throws GeneralSecurityException {
        Registry.registerKeyManager(new AesCtrKeyManager(), newKeyAllowed);
    }
}
