package com.google.crypto.tink.signature;

import com.google.crypto.tink.KeyTypeManager;
import com.google.crypto.tink.PublicKeyVerify;
import com.google.crypto.tink.proto.Ed25519PublicKey;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.subtle.Ed25519Verify;
import com.google.crypto.tink.subtle.Validators;
import java.security.GeneralSecurityException;
/* loaded from: classes7.dex */
class Ed25519PublicKeyManager extends KeyTypeManager<Ed25519PublicKey> {
    @Override // com.google.crypto.tink.KeyTypeManager
    public String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.Ed25519PublicKey";
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public int getVersion() {
        return 0;
    }

    public Ed25519PublicKeyManager() {
        super(Ed25519PublicKey.class, new KeyTypeManager.PrimitiveFactory<PublicKeyVerify, Ed25519PublicKey>(PublicKeyVerify.class) { // from class: com.google.crypto.tink.signature.Ed25519PublicKeyManager.1
            @Override // com.google.crypto.tink.KeyTypeManager.PrimitiveFactory
            public PublicKeyVerify getPrimitive(Ed25519PublicKey keyProto) {
                return new Ed25519Verify(keyProto.getKeyValue().toByteArray());
            }
        });
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public KeyData.KeyMaterialType keyMaterialType() {
        return KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.KeyTypeManager
    public Ed25519PublicKey parseKey(ByteString byteString) throws InvalidProtocolBufferException {
        return Ed25519PublicKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public void validateKey(Ed25519PublicKey keyProto) throws GeneralSecurityException {
        Validators.validateVersion(keyProto.getVersion(), getVersion());
        if (keyProto.getKeyValue().size() != 32) {
            throw new GeneralSecurityException("invalid Ed25519 public key: incorrect key length");
        }
    }
}
