package com.google.crypto.tink.signature;

import com.google.crypto.tink.proto.EcdsaParams;
import com.google.crypto.tink.proto.EcdsaSignatureEncoding;
import com.google.crypto.tink.proto.EllipticCurveType;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.RsaSsaPkcs1Params;
import com.google.crypto.tink.proto.RsaSsaPssParams;
import com.google.crypto.tink.subtle.EllipticCurves;
import com.google.crypto.tink.subtle.Enums;
import java.security.GeneralSecurityException;
/* loaded from: classes7.dex */
final class SigUtil {
    static final String INVALID_PARAMS = "Invalid ECDSA parameters";

    SigUtil() {
    }

    public static void validateEcdsaParams(EcdsaParams params) throws GeneralSecurityException {
        EcdsaSignatureEncoding encoding = params.getEncoding();
        HashType hashType = params.getHashType();
        EllipticCurveType curve = params.getCurve();
        int i = AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EcdsaSignatureEncoding[encoding.ordinal()];
        if (i != 1 && i != 2) {
            throw new GeneralSecurityException("unsupported signature encoding");
        }
        int i2 = AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EllipticCurveType[curve.ordinal()];
        if (i2 == 1) {
            if (hashType != HashType.SHA256) {
                throw new GeneralSecurityException(INVALID_PARAMS);
            }
        } else if (i2 == 2) {
            if (hashType != HashType.SHA384 && hashType != HashType.SHA512) {
                throw new GeneralSecurityException(INVALID_PARAMS);
            }
        } else if (i2 == 3) {
            if (hashType != HashType.SHA512) {
                throw new GeneralSecurityException(INVALID_PARAMS);
            }
        } else {
            throw new GeneralSecurityException(INVALID_PARAMS);
        }
    }

    public static void validateRsaSsaPkcs1Params(RsaSsaPkcs1Params params) throws GeneralSecurityException {
        toHashType(params.getHashType());
    }

    public static void validateRsaSsaPssParams(RsaSsaPssParams params) throws GeneralSecurityException {
        toHashType(params.getSigHash());
        if (params.getSigHash() != params.getMgf1Hash()) {
            throw new GeneralSecurityException("MGF1 hash is different from signature hash");
        }
        if (params.getSaltLength() < 0) {
            throw new GeneralSecurityException("salt length is negative");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.crypto.tink.signature.SigUtil$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$EcdsaSignatureEncoding;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$EllipticCurveType;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$HashType;

        static {
            int[] iArr = new int[HashType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$HashType = iArr;
            try {
                iArr[HashType.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[HashType.SHA384.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[HashType.SHA512.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[EllipticCurveType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$EllipticCurveType = iArr2;
            try {
                iArr2[EllipticCurveType.NIST_P256.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$EllipticCurveType[EllipticCurveType.NIST_P384.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$EllipticCurveType[EllipticCurveType.NIST_P521.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[EcdsaSignatureEncoding.values().length];
            $SwitchMap$com$google$crypto$tink$proto$EcdsaSignatureEncoding = iArr3;
            try {
                iArr3[EcdsaSignatureEncoding.DER.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$EcdsaSignatureEncoding[EcdsaSignatureEncoding.IEEE_P1363.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static Enums.HashType toHashType(HashType hash) throws GeneralSecurityException {
        int i = AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType[hash.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return Enums.HashType.SHA512;
                }
                throw new GeneralSecurityException("unsupported hash type: " + hash.name());
            }
            return Enums.HashType.SHA384;
        }
        return Enums.HashType.SHA256;
    }

    public static EllipticCurves.CurveType toCurveType(EllipticCurveType type) throws GeneralSecurityException {
        int i = AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EllipticCurveType[type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return EllipticCurves.CurveType.NIST_P521;
                }
                throw new GeneralSecurityException("unknown curve type: " + type.name());
            }
            return EllipticCurves.CurveType.NIST_P384;
        }
        return EllipticCurves.CurveType.NIST_P256;
    }

    public static EllipticCurves.EcdsaEncoding toEcdsaEncoding(EcdsaSignatureEncoding encoding) throws GeneralSecurityException {
        int i = AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EcdsaSignatureEncoding[encoding.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return EllipticCurves.EcdsaEncoding.IEEE_P1363;
            }
            throw new GeneralSecurityException("unknown ECDSA encoding: " + encoding.name());
        }
        return EllipticCurves.EcdsaEncoding.DER;
    }
}
