package androidx.biometric;

import android.os.Build;
import androidx.biometric.BiometricPrompt;
/* loaded from: classes.dex */
class AuthenticatorUtils {
    private static final int BIOMETRIC_CLASS_MASK = 32767;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isDeviceCredentialAllowed(int i) {
        return (i & 32768) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isSomeBiometricAllowed(int i) {
        return (i & BIOMETRIC_CLASS_MASK) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isWeakBiometricAllowed(int i) {
        return (i & 255) == 255;
    }

    private AuthenticatorUtils() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String convertToString(int i) {
        return i != 15 ? i != 255 ? i != 32768 ? i != 32783 ? i != 33023 ? String.valueOf(i) : "BIOMETRIC_WEAK | DEVICE_CREDENTIAL" : "BIOMETRIC_STRONG | DEVICE_CREDENTIAL" : "DEVICE_CREDENTIAL" : "BIOMETRIC_WEAK" : "BIOMETRIC_STRONG";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getConsolidatedAuthenticators(BiometricPrompt.PromptInfo promptInfo, BiometricPrompt.CryptoObject cryptoObject) {
        if (promptInfo.getAllowedAuthenticators() != 0) {
            return promptInfo.getAllowedAuthenticators();
        }
        int i = cryptoObject != null ? 15 : 255;
        return promptInfo.isDeviceCredentialAllowed() ? 32768 | i : i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isSupportedCombination(int i) {
        if (i == 15 || i == 255) {
            return true;
        }
        return i != 32768 ? i != 32783 ? i == 33023 || i == 0 : Build.VERSION.SDK_INT < 28 || Build.VERSION.SDK_INT > 29 : Build.VERSION.SDK_INT >= 30;
    }
}
