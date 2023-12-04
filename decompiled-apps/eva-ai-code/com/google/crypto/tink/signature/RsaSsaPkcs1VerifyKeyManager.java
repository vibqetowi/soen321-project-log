package com.google.crypto.tink.signature;

import com.google.crypto.tink.KeyTypeManager;
import com.google.crypto.tink.PublicKeyVerify;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.subtle.EngineFactory;
import com.google.crypto.tink.subtle.RsaSsaPkcs1VerifyJce;
import com.google.crypto.tink.subtle.Validators;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class RsaSsaPkcs1VerifyKeyManager extends KeyTypeManager<RsaSsaPkcs1PublicKey> {
    @Override // com.google.crypto.tink.KeyTypeManager
    public String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey";
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public int getVersion() {
        return 0;
    }

    public RsaSsaPkcs1VerifyKeyManager() {
        super(RsaSsaPkcs1PublicKey.class, new KeyTypeManager.PrimitiveFactory<PublicKeyVerify, RsaSsaPkcs1PublicKey>(PublicKeyVerify.class) { // from class: com.google.crypto.tink.signature.RsaSsaPkcs1VerifyKeyManager.1
            @Override // com.google.crypto.tink.KeyTypeManager.PrimitiveFactory
            public PublicKeyVerify getPrimitive(RsaSsaPkcs1PublicKey keyProto) throws GeneralSecurityException {
                return new RsaSsaPkcs1VerifyJce((RSAPublicKey) EngineFactory.KEY_FACTORY.getInstance(CipherStorageKeystoreRsaEcb.ALGORITHM_RSA).generatePublic(new RSAPublicKeySpec(new BigInteger(1, keyProto.getN().toByteArray()), new BigInteger(1, keyProto.getE().toByteArray()))), SigUtil.toHashType(keyProto.getParams().getHashType()));
            }
        });
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public KeyData.KeyMaterialType keyMaterialType() {
        return KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.KeyTypeManager
    public RsaSsaPkcs1PublicKey parseKey(ByteString byteString) throws InvalidProtocolBufferException {
        return RsaSsaPkcs1PublicKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public void validateKey(RsaSsaPkcs1PublicKey pubKey) throws GeneralSecurityException {
        Validators.validateVersion(pubKey.getVersion(), getVersion());
        Validators.validateRsaModulusSize(new BigInteger(1, pubKey.getN().toByteArray()).bitLength());
        Validators.validateRsaPublicExponent(new BigInteger(1, pubKey.getE().toByteArray()));
        SigUtil.validateRsaSsaPkcs1Params(pubKey.getParams());
    }
}
