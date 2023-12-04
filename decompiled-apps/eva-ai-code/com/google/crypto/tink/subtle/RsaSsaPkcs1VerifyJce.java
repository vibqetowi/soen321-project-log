package com.google.crypto.tink.subtle;

import com.google.crypto.tink.PublicKeyVerify;
import com.google.crypto.tink.subtle.Enums;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
/* loaded from: classes7.dex */
public final class RsaSsaPkcs1VerifyJce implements PublicKeyVerify {
    private static final String ASN_PREFIX_SHA256 = "3031300d060960864801650304020105000420";
    private static final String ASN_PREFIX_SHA512 = "3051300d060960864801650304020305000440";
    private final Enums.HashType hash;
    private final RSAPublicKey publicKey;

    public RsaSsaPkcs1VerifyJce(final RSAPublicKey pubKey, Enums.HashType hash) throws GeneralSecurityException {
        Validators.validateSignatureHash(hash);
        Validators.validateRsaModulusSize(pubKey.getModulus().bitLength());
        Validators.validateRsaPublicExponent(pubKey.getPublicExponent());
        this.publicKey = pubKey;
        this.hash = hash;
    }

    @Override // com.google.crypto.tink.PublicKeyVerify
    public void verify(final byte[] signature, final byte[] data) throws GeneralSecurityException {
        BigInteger publicExponent = this.publicKey.getPublicExponent();
        BigInteger modulus = this.publicKey.getModulus();
        int bitLength = (modulus.bitLength() + 7) / 8;
        if (bitLength != signature.length) {
            throw new GeneralSecurityException("invalid signature's length");
        }
        BigInteger bytes2Integer = SubtleUtil.bytes2Integer(signature);
        if (bytes2Integer.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("signature out of range");
        }
        if (!Bytes.equal(SubtleUtil.integer2Bytes(bytes2Integer.modPow(publicExponent, modulus), bitLength), emsaPkcs1(data, bitLength, this.hash))) {
            throw new GeneralSecurityException("invalid signature");
        }
    }

    private byte[] emsaPkcs1(byte[] m, int emLen, Enums.HashType hash) throws GeneralSecurityException {
        int length;
        Validators.validateSignatureHash(hash);
        MessageDigest engineFactory = EngineFactory.MESSAGE_DIGEST.getInstance(SubtleUtil.toDigestAlgo(this.hash));
        engineFactory.update(m);
        byte[] digest = engineFactory.digest();
        byte[] asnPrefix = toAsnPrefix(hash);
        if (emLen < asnPrefix.length + digest.length + 11) {
            throw new GeneralSecurityException("intended encoded message length too short");
        }
        byte[] bArr = new byte[emLen];
        bArr[0] = 0;
        bArr[1] = 1;
        int i = 2;
        int i2 = 0;
        while (i2 < (emLen - length) - 3) {
            bArr[i] = -1;
            i2++;
            i++;
        }
        int i3 = i + 1;
        bArr[i] = 0;
        System.arraycopy(asnPrefix, 0, bArr, i3, asnPrefix.length);
        System.arraycopy(digest, 0, bArr, i3 + asnPrefix.length, digest.length);
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.crypto.tink.subtle.RsaSsaPkcs1VerifyJce$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType;

        static {
            int[] iArr = new int[Enums.HashType.values().length];
            $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType = iArr;
            try {
                iArr[Enums.HashType.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType[Enums.HashType.SHA512.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private byte[] toAsnPrefix(Enums.HashType hash) throws GeneralSecurityException {
        int i = AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType[hash.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return Hex.decode(ASN_PREFIX_SHA512);
            }
            throw new GeneralSecurityException("Unsupported hash " + hash);
        }
        return Hex.decode(ASN_PREFIX_SHA256);
    }
}
