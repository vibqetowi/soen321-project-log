package com.google.crypto.tink.signature;

import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.KeyTypeManager;
import com.google.crypto.tink.PrivateKeyTypeManager;
import com.google.crypto.tink.PublicKeySign;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.RsaSsaPssKeyFormat;
import com.google.crypto.tink.proto.RsaSsaPssParams;
import com.google.crypto.tink.proto.RsaSsaPssPrivateKey;
import com.google.crypto.tink.proto.RsaSsaPssPublicKey;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.subtle.EngineFactory;
import com.google.crypto.tink.subtle.RsaSsaPssSignJce;
import com.google.crypto.tink.subtle.RsaSsaPssVerifyJce;
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
public final class RsaSsaPssSignKeyManager extends PrivateKeyTypeManager<RsaSsaPssPrivateKey, RsaSsaPssPublicKey> {
    private static final byte[] TEST_MESSAGE = "Tink and Wycheproof.".getBytes(Charset.forName("UTF-8"));

    @Override // com.google.crypto.tink.KeyTypeManager
    public String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey";
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public int getVersion() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RsaSsaPssSignKeyManager() {
        super(RsaSsaPssPrivateKey.class, RsaSsaPssPublicKey.class, new KeyTypeManager.PrimitiveFactory<PublicKeySign, RsaSsaPssPrivateKey>(PublicKeySign.class) { // from class: com.google.crypto.tink.signature.RsaSsaPssSignKeyManager.1
            @Override // com.google.crypto.tink.KeyTypeManager.PrimitiveFactory
            public PublicKeySign getPrimitive(RsaSsaPssPrivateKey keyProto) throws GeneralSecurityException {
                KeyFactory engineFactory = EngineFactory.KEY_FACTORY.getInstance(CipherStorageKeystoreRsaEcb.ALGORITHM_RSA);
                RsaSsaPssParams params = keyProto.getPublicKey().getParams();
                RsaSsaPssSignJce rsaSsaPssSignJce = new RsaSsaPssSignJce((RSAPrivateCrtKey) engineFactory.generatePrivate(new RSAPrivateCrtKeySpec(new BigInteger(1, keyProto.getPublicKey().getN().toByteArray()), new BigInteger(1, keyProto.getPublicKey().getE().toByteArray()), new BigInteger(1, keyProto.getD().toByteArray()), new BigInteger(1, keyProto.getP().toByteArray()), new BigInteger(1, keyProto.getQ().toByteArray()), new BigInteger(1, keyProto.getDp().toByteArray()), new BigInteger(1, keyProto.getDq().toByteArray()), new BigInteger(1, keyProto.getCrt().toByteArray()))), SigUtil.toHashType(params.getSigHash()), SigUtil.toHashType(params.getMgf1Hash()), params.getSaltLength());
                try {
                    new RsaSsaPssVerifyJce((RSAPublicKey) engineFactory.generatePublic(new RSAPublicKeySpec(new BigInteger(1, keyProto.getPublicKey().getN().toByteArray()), new BigInteger(1, keyProto.getPublicKey().getE().toByteArray()))), SigUtil.toHashType(params.getSigHash()), SigUtil.toHashType(params.getMgf1Hash()), params.getSaltLength()).verify(rsaSsaPssSignJce.sign(RsaSsaPssSignKeyManager.TEST_MESSAGE), RsaSsaPssSignKeyManager.TEST_MESSAGE);
                    return rsaSsaPssSignJce;
                } catch (GeneralSecurityException e) {
                    throw new RuntimeException("Security bug: signing with private key followed by verifying with public key failed" + e);
                }
            }
        });
    }

    @Override // com.google.crypto.tink.PrivateKeyTypeManager
    public RsaSsaPssPublicKey getPublicKey(RsaSsaPssPrivateKey privKeyProto) throws GeneralSecurityException {
        return privKeyProto.getPublicKey();
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public KeyData.KeyMaterialType keyMaterialType() {
        return KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE;
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public RsaSsaPssPrivateKey parseKey(ByteString byteString) throws InvalidProtocolBufferException {
        return RsaSsaPssPrivateKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public void validateKey(RsaSsaPssPrivateKey keyProto) throws GeneralSecurityException {
        Validators.validateVersion(keyProto.getVersion(), getVersion());
        Validators.validateRsaModulusSize(new BigInteger(1, keyProto.getPublicKey().getN().toByteArray()).bitLength());
        Validators.validateRsaPublicExponent(new BigInteger(1, keyProto.getPublicKey().getE().toByteArray()));
        SigUtil.validateRsaSsaPssParams(keyProto.getPublicKey().getParams());
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public KeyTypeManager.KeyFactory<RsaSsaPssKeyFormat, RsaSsaPssPrivateKey> keyFactory() {
        return new KeyTypeManager.KeyFactory<RsaSsaPssKeyFormat, RsaSsaPssPrivateKey>(RsaSsaPssKeyFormat.class) { // from class: com.google.crypto.tink.signature.RsaSsaPssSignKeyManager.2
            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public void validateKeyFormat(RsaSsaPssKeyFormat format) throws GeneralSecurityException {
                SigUtil.validateRsaSsaPssParams(format.getParams());
                Validators.validateRsaModulusSize(format.getModulusSizeInBits());
                Validators.validateRsaPublicExponent(new BigInteger(1, format.getPublicExponent().toByteArray()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public RsaSsaPssKeyFormat parseKeyFormat(ByteString byteString) throws InvalidProtocolBufferException {
                return RsaSsaPssKeyFormat.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public RsaSsaPssPrivateKey createKey(RsaSsaPssKeyFormat format) throws GeneralSecurityException {
                RsaSsaPssParams params = format.getParams();
                Validators.validateRsaModulusSize(format.getModulusSizeInBits());
                Validators.validateSignatureHash(SigUtil.toHashType(params.getSigHash()));
                KeyPairGenerator engineFactory = EngineFactory.KEY_PAIR_GENERATOR.getInstance(CipherStorageKeystoreRsaEcb.ALGORITHM_RSA);
                engineFactory.initialize(new RSAKeyGenParameterSpec(format.getModulusSizeInBits(), new BigInteger(1, format.getPublicExponent().toByteArray())));
                KeyPair generateKeyPair = engineFactory.generateKeyPair();
                RSAPublicKey rSAPublicKey = (RSAPublicKey) generateKeyPair.getPublic();
                RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) generateKeyPair.getPrivate();
                return RsaSsaPssPrivateKey.newBuilder().setVersion(RsaSsaPssSignKeyManager.this.getVersion()).setPublicKey(RsaSsaPssPublicKey.newBuilder().setVersion(RsaSsaPssSignKeyManager.this.getVersion()).setParams(params).setE(ByteString.copyFrom(rSAPublicKey.getPublicExponent().toByteArray())).setN(ByteString.copyFrom(rSAPublicKey.getModulus().toByteArray())).build()).setD(ByteString.copyFrom(rSAPrivateCrtKey.getPrivateExponent().toByteArray())).setP(ByteString.copyFrom(rSAPrivateCrtKey.getPrimeP().toByteArray())).setQ(ByteString.copyFrom(rSAPrivateCrtKey.getPrimeQ().toByteArray())).setDp(ByteString.copyFrom(rSAPrivateCrtKey.getPrimeExponentP().toByteArray())).setDq(ByteString.copyFrom(rSAPrivateCrtKey.getPrimeExponentQ().toByteArray())).setCrt(ByteString.copyFrom(rSAPrivateCrtKey.getCrtCoefficient().toByteArray())).build();
            }
        };
    }

    public static void registerPair(boolean newKeyAllowed) throws GeneralSecurityException {
        Registry.registerAsymmetricKeyManagers(new RsaSsaPssSignKeyManager(), new RsaSsaPssVerifyKeyManager(), newKeyAllowed);
    }

    public static final KeyTemplate rsa3072PssSha256F4Template() {
        return createKeyTemplate(HashType.SHA256, HashType.SHA256, 32, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, RSAKeyGenParameterSpec.F4, KeyTemplate.OutputPrefixType.TINK);
    }

    public static final KeyTemplate rawRsa3072PssSha256F4Template() {
        return createKeyTemplate(HashType.SHA256, HashType.SHA256, 32, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, RSAKeyGenParameterSpec.F4, KeyTemplate.OutputPrefixType.RAW);
    }

    public static final KeyTemplate rsa4096PssSha512F4Template() {
        return createKeyTemplate(HashType.SHA512, HashType.SHA512, 64, 4096, RSAKeyGenParameterSpec.F4, KeyTemplate.OutputPrefixType.TINK);
    }

    public static final KeyTemplate rawRsa4096PssSha512F4Template() {
        return createKeyTemplate(HashType.SHA512, HashType.SHA512, 64, 4096, RSAKeyGenParameterSpec.F4, KeyTemplate.OutputPrefixType.RAW);
    }

    private static KeyTemplate createKeyTemplate(HashType sigHash, HashType mgf1Hash, int saltLength, int modulusSize, BigInteger publicExponent, KeyTemplate.OutputPrefixType prefixType) {
        return KeyTemplate.create(new RsaSsaPssSignKeyManager().getKeyType(), RsaSsaPssKeyFormat.newBuilder().setParams(RsaSsaPssParams.newBuilder().setSigHash(sigHash).setMgf1Hash(mgf1Hash).setSaltLength(saltLength).build()).setModulusSizeInBits(modulusSize).setPublicExponent(ByteString.copyFrom(publicExponent.toByteArray())).build().toByteArray(), prefixType);
    }
}
