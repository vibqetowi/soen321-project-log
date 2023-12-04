package com.google.crypto.tink.subtle;

import com.google.crypto.tink.PublicKeyVerify;
import com.google.crypto.tink.subtle.Enums;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;
/* loaded from: classes7.dex */
public final class RsaSsaPssVerifyJce implements PublicKeyVerify {
    private final Enums.HashType mgf1Hash;
    private final RSAPublicKey publicKey;
    private final int saltLength;
    private final Enums.HashType sigHash;

    public RsaSsaPssVerifyJce(final RSAPublicKey pubKey, Enums.HashType sigHash, Enums.HashType mgf1Hash, int saltLength) throws GeneralSecurityException {
        Validators.validateSignatureHash(sigHash);
        Validators.validateRsaModulusSize(pubKey.getModulus().bitLength());
        Validators.validateRsaPublicExponent(pubKey.getPublicExponent());
        this.publicKey = pubKey;
        this.sigHash = sigHash;
        this.mgf1Hash = mgf1Hash;
        this.saltLength = saltLength;
    }

    @Override // com.google.crypto.tink.PublicKeyVerify
    public void verify(final byte[] signature, final byte[] data) throws GeneralSecurityException {
        BigInteger publicExponent = this.publicKey.getPublicExponent();
        BigInteger modulus = this.publicKey.getModulus();
        int bitLength = (modulus.bitLength() + 7) / 8;
        int bitLength2 = ((modulus.bitLength() - 1) + 7) / 8;
        if (bitLength != signature.length) {
            throw new GeneralSecurityException("invalid signature's length");
        }
        BigInteger bytes2Integer = SubtleUtil.bytes2Integer(signature);
        if (bytes2Integer.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("signature out of range");
        }
        emsaPssVerify(data, SubtleUtil.integer2Bytes(bytes2Integer.modPow(publicExponent, modulus), bitLength2), modulus.bitLength() - 1);
    }

    private void emsaPssVerify(byte[] m, byte[] em, int emBits) throws GeneralSecurityException {
        int i;
        Validators.validateSignatureHash(this.sigHash);
        MessageDigest engineFactory = EngineFactory.MESSAGE_DIGEST.getInstance(SubtleUtil.toDigestAlgo(this.sigHash));
        byte[] digest = engineFactory.digest(m);
        int digestLength = engineFactory.getDigestLength();
        int length = em.length;
        if (length < this.saltLength + digestLength + 2) {
            throw new GeneralSecurityException("inconsistent");
        }
        if (em[em.length - 1] != -68) {
            throw new GeneralSecurityException("inconsistent");
        }
        int i2 = (length - digestLength) - 1;
        byte[] copyOf = Arrays.copyOf(em, i2);
        byte[] copyOfRange = Arrays.copyOfRange(em, copyOf.length, copyOf.length + digestLength);
        int i3 = 0;
        while (true) {
            int i4 = i2;
            MessageDigest messageDigest = engineFactory;
            byte[] bArr = digest;
            long j = (length * 8) - emBits;
            if (i3 < j) {
                if (((copyOf[i3 / 8] >> (7 - (i3 % 8))) & 1) != 0) {
                    throw new GeneralSecurityException("inconsistent");
                }
                i3++;
                i2 = i4;
                engineFactory = messageDigest;
                digest = bArr;
            } else {
                byte[] mgf1 = SubtleUtil.mgf1(copyOfRange, i4, this.mgf1Hash);
                int length2 = mgf1.length;
                byte[] bArr2 = new byte[length2];
                for (int i5 = 0; i5 < length2; i5++) {
                    bArr2[i5] = (byte) (mgf1[i5] ^ copyOf[i5]);
                }
                for (int i6 = 0; i6 <= j; i6++) {
                    int i7 = i6 / 8;
                    bArr2[i7] = (byte) ((~(1 << (7 - (i6 % 8)))) & bArr2[i7]);
                }
                int i8 = 0;
                while (true) {
                    int i9 = this.saltLength;
                    if (i8 < (i - i9) - 2) {
                        if (bArr2[i8] != 0) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        i8++;
                    } else if (bArr2[(i - i9) - 2] != 1) {
                        throw new GeneralSecurityException("inconsistent");
                    } else {
                        byte[] copyOfRange2 = Arrays.copyOfRange(bArr2, length2 - i9, length2);
                        int i10 = digestLength + 8;
                        byte[] bArr3 = new byte[this.saltLength + i10];
                        System.arraycopy(bArr, 0, bArr3, 8, bArr.length);
                        System.arraycopy(copyOfRange2, 0, bArr3, i10, copyOfRange2.length);
                        if (!Bytes.equal(messageDigest.digest(bArr3), copyOfRange)) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        return;
                    }
                }
            }
        }
    }
}
