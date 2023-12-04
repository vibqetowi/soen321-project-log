package com.google.crypto.tink.hybrid;

import com.google.crypto.tink.Registry;
import com.google.crypto.tink.proto.EcPointFormat;
import com.google.crypto.tink.proto.EciesAeadHkdfParams;
import com.google.crypto.tink.proto.EllipticCurveType;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.subtle.EllipticCurves;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class HybridUtil {
    HybridUtil() {
    }

    public static void validate(EciesAeadHkdfParams params) throws GeneralSecurityException {
        EllipticCurves.getCurveSpec(toCurveType(params.getKemParams().getCurveType()));
        toHmacAlgo(params.getKemParams().getHkdfHashType());
        if (params.getEcPointFormat() == EcPointFormat.UNKNOWN_FORMAT) {
            throw new GeneralSecurityException("unknown EC point format");
        }
        Registry.newKeyData(params.getDemParams().getAeadDem());
    }

    public static String toHmacAlgo(HashType hash) throws NoSuchAlgorithmException {
        int i = AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType[hash.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return "HmacSha512";
                }
                throw new NoSuchAlgorithmException("hash unsupported for HMAC: " + hash);
            }
            return "HmacSha256";
        }
        return "HmacSha1";
    }

    public static EllipticCurves.CurveType toCurveType(EllipticCurveType type) throws GeneralSecurityException {
        int i = AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EllipticCurveType[type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return EllipticCurves.CurveType.NIST_P521;
                }
                throw new GeneralSecurityException("unknown curve type: " + type);
            }
            return EllipticCurves.CurveType.NIST_P384;
        }
        return EllipticCurves.CurveType.NIST_P256;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.crypto.tink.hybrid.HybridUtil$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$EcPointFormat;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$EllipticCurveType;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$HashType;

        static {
            int[] iArr = new int[EcPointFormat.values().length];
            $SwitchMap$com$google$crypto$tink$proto$EcPointFormat = iArr;
            try {
                iArr[EcPointFormat.UNCOMPRESSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$EcPointFormat[EcPointFormat.DO_NOT_USE_CRUNCHY_UNCOMPRESSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$EcPointFormat[EcPointFormat.COMPRESSED.ordinal()] = 3;
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
            int[] iArr3 = new int[HashType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$HashType = iArr3;
            try {
                iArr3[HashType.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[HashType.SHA256.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[HashType.SHA512.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public static EllipticCurves.PointFormatType toPointFormatType(EcPointFormat format) throws GeneralSecurityException {
        int i = AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EcPointFormat[format.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return EllipticCurves.PointFormatType.COMPRESSED;
                }
                throw new GeneralSecurityException("unknown point format: " + format);
            }
            return EllipticCurves.PointFormatType.DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
        }
        return EllipticCurves.PointFormatType.UNCOMPRESSED;
    }
}
