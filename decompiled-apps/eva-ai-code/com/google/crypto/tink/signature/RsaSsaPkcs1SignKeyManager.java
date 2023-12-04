package com.google.crypto.tink.signature;

import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.KeyTypeManager;
import com.google.crypto.tink.PrivateKeyTypeManager;
import com.google.crypto.tink.PublicKeySign;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.RsaSsaPkcs1KeyFormat;
import com.google.crypto.tink.proto.RsaSsaPkcs1Params;
import com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKey;
import com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.subtle.EngineFactory;
import com.google.crypto.tink.subtle.RsaSsaPkcs1SignJce;
import com.google.crypto.tink.subtle.RsaSsaPkcs1VerifyJce;
import com.google.crypto.tink.subtle.Validators;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAKeyGenParameterSpec;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPublicKeySpec;
/* loaded from: classes7.dex */
public final class RsaSsaPkcs1SignKeyManager extends PrivateKeyTypeManager<RsaSsaPkcs1PrivateKey, RsaSsaPkcs1PublicKey> {
    private static final byte[] TEST_MESSAGE = "Tink and Wycheproof.".getBytes(Charset.forName("UTF-8"));

    @Override // com.google.crypto.tink.KeyTypeManager
    public String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey";
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public int getVersion() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RsaSsaPkcs1SignKeyManager() {
        super(RsaSsaPkcs1PrivateKey.class, RsaSsaPkcs1PublicKey.class, new KeyTypeManager.PrimitiveFactory<PublicKeySign, RsaSsaPkcs1PrivateKey>(PublicKeySign.class) { // from class: com.google.crypto.tink.signature.RsaSsaPkcs1SignKeyManager.1
            @Override // com.google.crypto.tink.KeyTypeManager.PrimitiveFactory
            public PublicKeySign getPrimitive(RsaSsaPkcs1PrivateKey keyProto) throws GeneralSecurityException {
                KeyFactory engineFactory = EngineFactory.KEY_FACTORY.getInstance(CipherStorageKeystoreRsaEcb.ALGORITHM_RSA);
                RsaSsaPkcs1SignJce rsaSsaPkcs1SignJce = new RsaSsaPkcs1SignJce((RSAPrivateCrtKey) engineFactory.generatePrivate(new RSAPrivateCrtKeySpec(new BigInteger(1, keyProto.getPublicKey().getN().toByteArray()), new BigInteger(1, keyProto.getPublicKey().getE().toByteArray()), new BigInteger(1, keyProto.getD().toByteArray()), new BigInteger(1, keyProto.getP().toByteArray()), new BigInteger(1, keyProto.getQ().toByteArray()), new BigInteger(1, keyProto.getDp().toByteArray()), new BigInteger(1, keyProto.getDq().toByteArray()), new BigInteger(1, keyProto.getCrt().toByteArray()))), SigUtil.toHashType(keyProto.getPublicKey().getParams().getHashType()));
                try {
                    new RsaSsaPkcs1VerifyJce((RSAPublicKey) engineFactory.generatePublic(new RSAPublicKeySpec(new BigInteger(1, keyProto.getPublicKey().getN().toByteArray()), new BigInteger(1, keyProto.getPublicKey().getE().toByteArray()))), SigUtil.toHashType(keyProto.getPublicKey().getParams().getHashType())).verify(rsaSsaPkcs1SignJce.sign(RsaSsaPkcs1SignKeyManager.TEST_MESSAGE), RsaSsaPkcs1SignKeyManager.TEST_MESSAGE);
                    return rsaSsaPkcs1SignJce;
                } catch (GeneralSecurityException e) {
                    throw new RuntimeException("Security bug: signing with private key followed by verifying with public key failed" + e);
                }
            }
        });
    }

    @Override // com.google.crypto.tink.PrivateKeyTypeManager
    public RsaSsaPkcs1PublicKey getPublicKey(RsaSsaPkcs1PrivateKey privKeyProto) throws GeneralSecurityException {
        return privKeyProto.getPublicKey();
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public KeyData.KeyMaterialType keyMaterialType() {
        return KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE;
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public RsaSsaPkcs1PrivateKey parseKey(ByteString byteString) throws InvalidProtocolBufferException {
        return RsaSsaPkcs1PrivateKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public void validateKey(RsaSsaPkcs1PrivateKey privKey) throws GeneralSecurityException {
        Validators.validateVersion(privKey.getVersion(), getVersion());
        Validators.validateRsaModulusSize(new BigInteger(1, privKey.getPublicKey().getN().toByteArray()).bitLength());
        Validators.validateRsaPublicExponent(new BigInteger(1, privKey.getPublicKey().getE().toByteArray()));
        SigUtil.validateRsaSsaPkcs1Params(privKey.getPublicKey().getParams());
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public KeyTypeManager.KeyFactory<RsaSsaPkcs1KeyFormat, RsaSsaPkcs1PrivateKey> keyFactory() {
        return new KeyTypeManager.KeyFactory<RsaSsaPkcs1KeyFormat, RsaSsaPkcs1PrivateKey>(RsaSsaPkcs1KeyFormat.class) { // from class: com.google.crypto.tink.signature.RsaSsaPkcs1SignKeyManager.2
            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public void validateKeyFormat(RsaSsaPkcs1KeyFormat keyFormat) throws GeneralSecurityException {
                SigUtil.validateRsaSsaPkcs1Params(keyFormat.getParams());
                Validators.validateRsaModulusSize(keyFormat.getModulusSizeInBits());
                Validators.validateRsaPublicExponent(new BigInteger(1, keyFormat.getPublicExponent().toByteArray()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public RsaSsaPkcs1KeyFormat parseKeyFormat(ByteString byteString) throws InvalidProtocolBufferException {
                return RsaSsaPkcs1KeyFormat.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public RsaSsaPkcs1PrivateKey createKey(RsaSsaPkcs1KeyFormat format) throws GeneralSecurityException {
                RsaSsaPkcs1Params params = format.getParams();
                KeyPairGenerator engineFactory = EngineFactory.KEY_PAIR_GENERATOR.getInstance(CipherStorageKeystoreRsaEcb.ALGORITHM_RSA);
                engineFactory.initialize(new RSAKeyGenParameterSpec(format.getModulusSizeInBits(), new BigInteger(1, format.getPublicExponent().toByteArray())));
                KeyPair generateKeyPair = engineFactory.generateKeyPair();
                RSAPublicKey rSAPublicKey = (RSAPublicKey) generateKeyPair.getPublic();
                RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) generateKeyPair.getPrivate();
                return RsaSsaPkcs1PrivateKey.newBuilder().setVersion(RsaSsaPkcs1SignKeyManager.this.getVersion()).setPublicKey(RsaSsaPkcs1PublicKey.newBuilder().setVersion(RsaSsaPkcs1SignKeyManager.this.getVersion()).setParams(params).setE(ByteString.copyFrom(rSAPublicKey.getPublicExponent().toByteArray())).setN(ByteString.copyFrom(rSAPublicKey.getModulus().toByteArray())).build()).setD(ByteString.copyFrom(rSAPrivateCrtKey.getPrivateExponent().toByteArray())).setP(ByteString.copyFrom(rSAPrivateCrtKey.getPrimeP().toByteArray())).setQ(ByteString.copyFrom(rSAPrivateCrtKey.getPrimeQ().toByteArray())).setDp(ByteString.copyFrom(rSAPrivateCrtKey.getPrimeExponentP().toByteArray())).setDq(ByteString.copyFrom(rSAPrivateCrtKey.getPrimeExponentQ().toByteArray())).setCrt(ByteString.copyFrom(rSAPrivateCrtKey.getCrtCoefficient().toByteArray())).build();
            }
        };
    }

    public static void registerPair(boolean newKeyAllowed) throws GeneralSecurityException {
        Registry.registerAsymmetricKeyManagers(new RsaSsaPkcs1SignKeyManager(), new RsaSsaPkcs1VerifyKeyManager(), newKeyAllowed);
    }

    public static final KeyTemplate rsa3072SsaPkcs1Sha256F4Template() {
        return createKeyTemplate(HashType.SHA256, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, RSAKeyGenParameterSpec.F4, KeyTemplate.OutputPrefixType.TINK);
    }

    public static final KeyTemplate rawRsa3072SsaPkcs1Sha256F4Template() {
        return createKeyTemplate(HashType.SHA256, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, RSAKeyGenParameterSpec.F4, KeyTemplate.OutputPrefixType.RAW);
    }

    public static final KeyTemplate rsa4096SsaPkcs1Sha512F4Template() {
        return createKeyTemplate(HashType.SHA512, 4096, RSAKeyGenParameterSpec.F4, KeyTemplate.OutputPrefixType.TINK);
    }

    public static final KeyTemplate rawRsa4096SsaPkcs1Sha512F4Template() {
        return createKeyTemplate(HashType.SHA512, 4096, RSAKeyGenParameterSpec.F4, KeyTemplate.OutputPrefixType.RAW);
    }

    private static KeyTemplate createKeyTemplate(HashType hashType, int modulusSize, BigInteger publicExponent, KeyTemplate.OutputPrefixType prefixType) {
        return KeyTemplate.create(new RsaSsaPkcs1SignKeyManager().getKeyType(), RsaSsaPkcs1KeyFormat.newBuilder().setParams(RsaSsaPkcs1Params.newBuilder().setHashType(hashType).build()).setModulusSizeInBits(modulusSize).setPublicExponent(ByteString.copyFrom(publicExponent.toByteArray())).build().toByteArray(), prefixType);
    }
}
