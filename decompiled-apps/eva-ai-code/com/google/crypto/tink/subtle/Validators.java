package com.google.crypto.tink.subtle;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.crypto.tink.subtle.Enums;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Locale;
import java.util.regex.Pattern;
/* loaded from: classes7.dex */
public final class Validators {
    private static final int MIN_RSA_MODULUS_SIZE = 2048;
    private static final String TYPE_URL_PREFIX = "type.googleapis.com/";
    private static final String URI_UNRESERVED_CHARS = "([0-9a-zA-Z\\-\\.\\_~])+";
    private static final Pattern GCP_KMS_CRYPTO_KEY_PATTERN = Pattern.compile(String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s$", URI_UNRESERVED_CHARS, URI_UNRESERVED_CHARS, URI_UNRESERVED_CHARS, URI_UNRESERVED_CHARS), 2);
    private static final Pattern GCP_KMS_CRYPTO_KEY_VERSION_PATTERN = Pattern.compile(String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s/cryptoKeyVersions/%s$", URI_UNRESERVED_CHARS, URI_UNRESERVED_CHARS, URI_UNRESERVED_CHARS, URI_UNRESERVED_CHARS, URI_UNRESERVED_CHARS), 2);

    private Validators() {
    }

    public static void validateTypeUrl(String typeUrl) throws GeneralSecurityException {
        if (!typeUrl.startsWith(TYPE_URL_PREFIX)) {
            throw new GeneralSecurityException(String.format("Error: type URL %s is invalid; it must start with %s.\n", typeUrl, TYPE_URL_PREFIX));
        }
        if (typeUrl.length() == 20) {
            throw new GeneralSecurityException(String.format("Error: type URL %s is invalid; it has no message name.\n", typeUrl));
        }
    }

    public static void validateAesKeySize(int sizeInBytes) throws InvalidAlgorithmParameterException {
        if (sizeInBytes != 16 && sizeInBytes != 32) {
            throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(sizeInBytes * 8)));
        }
    }

    public static void validateVersion(int candidate, int maxExpected) throws GeneralSecurityException {
        if (candidate < 0 || candidate > maxExpected) {
            throw new GeneralSecurityException(String.format("key has version %d; only keys with version in range [0..%d] are supported", Integer.valueOf(candidate), Integer.valueOf(maxExpected)));
        }
    }

    /* renamed from: com.google.crypto.tink.subtle.Validators$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType;

        static {
            int[] iArr = new int[Enums.HashType.values().length];
            $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType = iArr;
            try {
                iArr[Enums.HashType.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType[Enums.HashType.SHA384.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType[Enums.HashType.SHA512.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static void validateSignatureHash(Enums.HashType hash) throws GeneralSecurityException {
        int i = AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType[hash.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return;
        }
        throw new GeneralSecurityException("Unsupported hash: " + hash.name());
    }

    public static void validateRsaModulusSize(int modulusSize) throws GeneralSecurityException {
        if (modulusSize < 2048) {
            throw new GeneralSecurityException(String.format("Modulus size is %d; only modulus size >= 2048-bit is supported", Integer.valueOf(modulusSize)));
        }
    }

    public static void validateRsaPublicExponent(BigInteger publicExponent) throws GeneralSecurityException {
        if (!publicExponent.testBit(0)) {
            throw new GeneralSecurityException("Public exponent must be odd.");
        }
        if (publicExponent.compareTo(BigInteger.valueOf(PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH)) <= 0) {
            throw new GeneralSecurityException("Public exponent must be greater than 65536.");
        }
    }

    public static void validateNotExists(File f) throws IOException {
        if (f.exists()) {
            throw new IOException(String.format("%s exists, please choose another file\n", f));
        }
    }

    public static void validateExists(File f) throws IOException {
        if (!f.exists()) {
            throw new IOException(String.format("Error: %s doesn't exist, please choose another file\n", f));
        }
    }

    public static String validateKmsKeyUriAndRemovePrefix(String expectedPrefix, String kmsKeyUri) {
        if (!kmsKeyUri.toLowerCase(Locale.US).startsWith(expectedPrefix)) {
            throw new IllegalArgumentException(String.format("key URI must start with %s", expectedPrefix));
        }
        return kmsKeyUri.substring(expectedPrefix.length());
    }

    public static void validateCryptoKeyUri(String kmsKeyUri) throws GeneralSecurityException {
        if (GCP_KMS_CRYPTO_KEY_PATTERN.matcher(kmsKeyUri).matches()) {
            return;
        }
        if (GCP_KMS_CRYPTO_KEY_VERSION_PATTERN.matcher(kmsKeyUri).matches()) {
            throw new GeneralSecurityException("Invalid Google Cloud KMS Key URI. The URI must point to a CryptoKey, not a CryptoKeyVersion");
        }
        throw new GeneralSecurityException("Invalid Google Cloud KMS Key URI. The URI must point to a CryptoKey in the format projects/*/locations/*/keyRings/*/cryptoKeys/*. See https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings.cryptoKeys#CryptoKey");
    }
}
