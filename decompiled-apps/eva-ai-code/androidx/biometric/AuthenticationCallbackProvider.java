package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import androidx.biometric.BiometricPrompt;
import androidx.core.hardware.fingerprint.FingerprintManagerCompat;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class AuthenticationCallbackProvider {
    private android.hardware.biometrics.BiometricPrompt$AuthenticationCallback mBiometricCallback;
    private FingerprintManagerCompat.AuthenticationCallback mFingerprintCallback;
    final Listener mListener;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class Listener {
        void onError(int i, CharSequence charSequence) {
        }

        void onFailure() {
        }

        void onHelp(CharSequence charSequence) {
        }

        void onSuccess(BiometricPrompt.AuthenticationResult authenticationResult) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AuthenticationCallbackProvider(Listener listener) {
        this.mListener = listener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public android.hardware.biometrics.BiometricPrompt$AuthenticationCallback getBiometricCallback() {
        if (this.mBiometricCallback == null) {
            this.mBiometricCallback = Api28Impl.createCallback(this.mListener);
        }
        return this.mBiometricCallback;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FingerprintManagerCompat.AuthenticationCallback getFingerprintCallback() {
        if (this.mFingerprintCallback == null) {
            this.mFingerprintCallback = new FingerprintManagerCompat.AuthenticationCallback() { // from class: androidx.biometric.AuthenticationCallbackProvider.1
                @Override // androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback
                public void onAuthenticationError(int i, CharSequence charSequence) {
                    AuthenticationCallbackProvider.this.mListener.onError(i, charSequence);
                }

                @Override // androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback
                public void onAuthenticationHelp(int i, CharSequence charSequence) {
                    AuthenticationCallbackProvider.this.mListener.onHelp(charSequence);
                }

                @Override // androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback
                public void onAuthenticationSucceeded(FingerprintManagerCompat.AuthenticationResult authenticationResult) {
                    AuthenticationCallbackProvider.this.mListener.onSuccess(new BiometricPrompt.AuthenticationResult(authenticationResult != null ? CryptoObjectUtils.unwrapFromFingerprintManager(authenticationResult.getCryptoObject()) : null, 2));
                }

                @Override // androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback
                public void onAuthenticationFailed() {
                    AuthenticationCallbackProvider.this.mListener.onFailure();
                }
            };
        }
        return this.mFingerprintCallback;
    }

    /* loaded from: classes.dex */
    private static class Api30Impl {
        private Api30Impl() {
        }

        static int getAuthenticationType(BiometricPrompt.AuthenticationResult authenticationResult) {
            return authenticationResult.getAuthenticationType();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class Api28Impl {
        private Api28Impl() {
        }

        static android.hardware.biometrics.BiometricPrompt$AuthenticationCallback createCallback(final Listener listener) {
            return new android.hardware.biometrics.BiometricPrompt$AuthenticationCallback() { // from class: androidx.biometric.AuthenticationCallbackProvider.Api28Impl.1
                public void onAuthenticationHelp(int i, CharSequence charSequence) {
                }

                public void onAuthenticationError(int i, CharSequence charSequence) {
                    Listener.this.onError(i, charSequence);
                }

                public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
                    BiometricPrompt.CryptoObject unwrapFromBiometricPrompt = authenticationResult != null ? CryptoObjectUtils.unwrapFromBiometricPrompt(authenticationResult.getCryptoObject()) : null;
                    int i = -1;
                    if (Build.VERSION.SDK_INT >= 30) {
                        if (authenticationResult != null) {
                            i = Api30Impl.getAuthenticationType(authenticationResult);
                        }
                    } else if (Build.VERSION.SDK_INT != 29) {
                        i = 2;
                    }
                    Listener.this.onSuccess(new BiometricPrompt.AuthenticationResult(unwrapFromBiometricPrompt, i));
                }

                public void onAuthenticationFailed() {
                    Listener.this.onFailure();
                }
            };
        }
    }
}
