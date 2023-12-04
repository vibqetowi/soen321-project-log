package androidx.biometric;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.biometric.BiometricPrompt;
import androidx.core.hardware.fingerprint.FingerprintManagerCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class BiometricFragment extends Fragment {
    static final int CANCELED_FROM_CLIENT = 3;
    static final int CANCELED_FROM_INTERNAL = 0;
    static final int CANCELED_FROM_NEGATIVE_BUTTON = 2;
    static final int CANCELED_FROM_USER = 1;
    private static final int DISMISS_INSTANTLY_DELAY_MS = 500;
    private static final String FINGERPRINT_DIALOG_FRAGMENT_TAG = "androidx.biometric.FingerprintDialogFragment";
    private static final int HIDE_DIALOG_DELAY_MS = 2000;
    private static final int REQUEST_CONFIRM_CREDENTIAL = 1;
    private static final int SHOW_PROMPT_DELAY_MS = 600;
    private static final String TAG = "BiometricFragment";
    Handler mHandler = new Handler(Looper.getMainLooper());
    BiometricViewModel mViewModel;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class PromptExecutor implements Executor {
        private final Handler mPromptHandler = new Handler(Looper.getMainLooper());

        PromptExecutor() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.mPromptHandler.post(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class ShowPromptForAuthenticationRunnable implements Runnable {
        private final WeakReference<BiometricFragment> mFragmentRef;

        ShowPromptForAuthenticationRunnable(BiometricFragment biometricFragment) {
            this.mFragmentRef = new WeakReference<>(biometricFragment);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.mFragmentRef.get() != null) {
                this.mFragmentRef.get().showPromptForAuthentication();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class StopDelayingPromptRunnable implements Runnable {
        private final WeakReference<BiometricViewModel> mViewModelRef;

        StopDelayingPromptRunnable(BiometricViewModel biometricViewModel) {
            this.mViewModelRef = new WeakReference<>(biometricViewModel);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.mViewModelRef.get() != null) {
                this.mViewModelRef.get().setDelayingPrompt(false);
            }
        }
    }

    /* loaded from: classes.dex */
    private static class StopIgnoringCancelRunnable implements Runnable {
        private final WeakReference<BiometricViewModel> mViewModelRef;

        StopIgnoringCancelRunnable(BiometricViewModel biometricViewModel) {
            this.mViewModelRef = new WeakReference<>(biometricViewModel);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.mViewModelRef.get() != null) {
                this.mViewModelRef.get().setIgnoringCancel(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static BiometricFragment newInstance() {
        return new BiometricFragment();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        connectViewModel();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (Build.VERSION.SDK_INT == 29 && AuthenticatorUtils.isDeviceCredentialAllowed(this.mViewModel.getAllowedAuthenticators())) {
            this.mViewModel.setIgnoringCancel(true);
            this.mHandler.postDelayed(new StopIgnoringCancelRunnable(this.mViewModel), 250L);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        if (Build.VERSION.SDK_INT >= 29 || this.mViewModel.isConfirmingDeviceCredential() || isChangingConfigurations()) {
            return;
        }
        cancelAuthentication(0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            this.mViewModel.setConfirmingDeviceCredential(false);
            handleConfirmCredentialResult(i2);
        }
    }

    private void connectViewModel() {
        if (getActivity() == null) {
            return;
        }
        BiometricViewModel biometricViewModel = (BiometricViewModel) new ViewModelProvider(getActivity()).get(BiometricViewModel.class);
        this.mViewModel = biometricViewModel;
        biometricViewModel.getAuthenticationResult().observe(this, new Observer<BiometricPrompt.AuthenticationResult>() { // from class: androidx.biometric.BiometricFragment.1
            @Override // androidx.lifecycle.Observer
            public void onChanged(BiometricPrompt.AuthenticationResult authenticationResult) {
                if (authenticationResult != null) {
                    BiometricFragment.this.onAuthenticationSucceeded(authenticationResult);
                    BiometricFragment.this.mViewModel.setAuthenticationResult(null);
                }
            }
        });
        this.mViewModel.getAuthenticationError().observe(this, new Observer<BiometricErrorData>() { // from class: androidx.biometric.BiometricFragment.2
            @Override // androidx.lifecycle.Observer
            public void onChanged(BiometricErrorData biometricErrorData) {
                if (biometricErrorData != null) {
                    BiometricFragment.this.onAuthenticationError(biometricErrorData.getErrorCode(), biometricErrorData.getErrorMessage());
                    BiometricFragment.this.mViewModel.setAuthenticationError(null);
                }
            }
        });
        this.mViewModel.getAuthenticationHelpMessage().observe(this, new Observer<CharSequence>() { // from class: androidx.biometric.BiometricFragment.3
            @Override // androidx.lifecycle.Observer
            public void onChanged(CharSequence charSequence) {
                if (charSequence != null) {
                    BiometricFragment.this.onAuthenticationHelp(charSequence);
                    BiometricFragment.this.mViewModel.setAuthenticationError(null);
                }
            }
        });
        this.mViewModel.isAuthenticationFailurePending().observe(this, new Observer<Boolean>() { // from class: androidx.biometric.BiometricFragment.4
            @Override // androidx.lifecycle.Observer
            public void onChanged(Boolean bool) {
                if (bool.booleanValue()) {
                    BiometricFragment.this.onAuthenticationFailed();
                    BiometricFragment.this.mViewModel.setAuthenticationFailurePending(false);
                }
            }
        });
        this.mViewModel.isNegativeButtonPressPending().observe(this, new Observer<Boolean>() { // from class: androidx.biometric.BiometricFragment.5
            @Override // androidx.lifecycle.Observer
            public void onChanged(Boolean bool) {
                if (bool.booleanValue()) {
                    if (BiometricFragment.this.isManagingDeviceCredentialButton()) {
                        BiometricFragment.this.onDeviceCredentialButtonPressed();
                    } else {
                        BiometricFragment.this.onCancelButtonPressed();
                    }
                    BiometricFragment.this.mViewModel.setNegativeButtonPressPending(false);
                }
            }
        });
        this.mViewModel.isFingerprintDialogCancelPending().observe(this, new Observer<Boolean>() { // from class: androidx.biometric.BiometricFragment.6
            @Override // androidx.lifecycle.Observer
            public void onChanged(Boolean bool) {
                if (bool.booleanValue()) {
                    BiometricFragment.this.cancelAuthentication(1);
                    BiometricFragment.this.dismiss();
                    BiometricFragment.this.mViewModel.setFingerprintDialogCancelPending(false);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void authenticate(BiometricPrompt.PromptInfo promptInfo, BiometricPrompt.CryptoObject cryptoObject) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            Log.e(TAG, "Not launching prompt. Client activity was null.");
            return;
        }
        this.mViewModel.setPromptInfo(promptInfo);
        int consolidatedAuthenticators = AuthenticatorUtils.getConsolidatedAuthenticators(promptInfo, cryptoObject);
        if (Build.VERSION.SDK_INT < 30 && consolidatedAuthenticators == 15 && cryptoObject == null) {
            this.mViewModel.setCryptoObject(CryptoObjectUtils.createFakeCryptoObject());
        } else {
            this.mViewModel.setCryptoObject(cryptoObject);
        }
        if (isManagingDeviceCredentialButton()) {
            this.mViewModel.setNegativeButtonTextOverride(getString(R.string.confirm_device_credential_password));
        } else {
            this.mViewModel.setNegativeButtonTextOverride(null);
        }
        if (isManagingDeviceCredentialButton() && BiometricManager.from(activity).canAuthenticate(255) != 0) {
            this.mViewModel.setAwaitingResult(true);
            launchConfirmCredentialActivity();
        } else if (this.mViewModel.isDelayingPrompt()) {
            this.mHandler.postDelayed(new ShowPromptForAuthenticationRunnable(this), 600L);
        } else {
            showPromptForAuthentication();
        }
    }

    void showPromptForAuthentication() {
        if (this.mViewModel.isPromptShowing()) {
            return;
        }
        if (getContext() == null) {
            Log.w(TAG, "Not showing biometric prompt. Context is null.");
            return;
        }
        this.mViewModel.setPromptShowing(true);
        this.mViewModel.setAwaitingResult(true);
        if (isUsingFingerprintDialog()) {
            showFingerprintDialogForAuthentication();
        } else {
            showBiometricPromptForAuthentication();
        }
    }

    private void showFingerprintDialogForAuthentication() {
        Context applicationContext = requireContext().getApplicationContext();
        FingerprintManagerCompat from = FingerprintManagerCompat.from(applicationContext);
        int checkForFingerprintPreAuthenticationErrors = checkForFingerprintPreAuthenticationErrors(from);
        if (checkForFingerprintPreAuthenticationErrors != 0) {
            sendErrorAndDismiss(checkForFingerprintPreAuthenticationErrors, ErrorUtils.getFingerprintErrorString(applicationContext, checkForFingerprintPreAuthenticationErrors));
        } else if (isAdded()) {
            this.mViewModel.setFingerprintDialogDismissedInstantly(true);
            if (!DeviceUtils.shouldHideFingerprintDialog(applicationContext, Build.MODEL)) {
                this.mHandler.postDelayed(new Runnable() { // from class: androidx.biometric.BiometricFragment.7
                    @Override // java.lang.Runnable
                    public void run() {
                        BiometricFragment.this.mViewModel.setFingerprintDialogDismissedInstantly(false);
                    }
                }, 500L);
                FingerprintDialogFragment.newInstance().show(getParentFragmentManager(), FINGERPRINT_DIALOG_FRAGMENT_TAG);
            }
            this.mViewModel.setCanceledFrom(0);
            authenticateWithFingerprint(from, applicationContext);
        }
    }

    private void showBiometricPromptForAuthentication() {
        BiometricPrompt.Builder createPromptBuilder = Api28Impl.createPromptBuilder(requireContext().getApplicationContext());
        CharSequence title = this.mViewModel.getTitle();
        CharSequence subtitle = this.mViewModel.getSubtitle();
        CharSequence description = this.mViewModel.getDescription();
        if (title != null) {
            Api28Impl.setTitle(createPromptBuilder, title);
        }
        if (subtitle != null) {
            Api28Impl.setSubtitle(createPromptBuilder, subtitle);
        }
        if (description != null) {
            Api28Impl.setDescription(createPromptBuilder, description);
        }
        CharSequence negativeButtonText = this.mViewModel.getNegativeButtonText();
        if (!TextUtils.isEmpty(negativeButtonText)) {
            Api28Impl.setNegativeButton(createPromptBuilder, negativeButtonText, this.mViewModel.getClientExecutor(), this.mViewModel.getNegativeButtonListener());
        }
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.setConfirmationRequired(createPromptBuilder, this.mViewModel.isConfirmationRequired());
        }
        int allowedAuthenticators = this.mViewModel.getAllowedAuthenticators();
        if (Build.VERSION.SDK_INT >= 30) {
            Api30Impl.setAllowedAuthenticators(createPromptBuilder, allowedAuthenticators);
        } else if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.setDeviceCredentialAllowed(createPromptBuilder, AuthenticatorUtils.isDeviceCredentialAllowed(allowedAuthenticators));
        }
        authenticateWithBiometricPrompt(Api28Impl.buildPrompt(createPromptBuilder), getContext());
    }

    void authenticateWithFingerprint(FingerprintManagerCompat fingerprintManagerCompat, Context context) {
        try {
            fingerprintManagerCompat.authenticate(CryptoObjectUtils.wrapForFingerprintManager(this.mViewModel.getCryptoObject()), 0, this.mViewModel.getCancellationSignalProvider().getFingerprintCancellationSignal(), this.mViewModel.getAuthenticationCallbackProvider().getFingerprintCallback(), null);
        } catch (NullPointerException e) {
            Log.e(TAG, "Got NPE while authenticating with fingerprint.", e);
            sendErrorAndDismiss(1, ErrorUtils.getFingerprintErrorString(context, 1));
        }
    }

    void authenticateWithBiometricPrompt(android.hardware.biometrics.BiometricPrompt biometricPrompt, Context context) {
        BiometricPrompt.CryptoObject wrapForBiometricPrompt = CryptoObjectUtils.wrapForBiometricPrompt(this.mViewModel.getCryptoObject());
        CancellationSignal biometricCancellationSignal = this.mViewModel.getCancellationSignalProvider().getBiometricCancellationSignal();
        PromptExecutor promptExecutor = new PromptExecutor();
        android.hardware.biometrics.BiometricPrompt$AuthenticationCallback biometricCallback = this.mViewModel.getAuthenticationCallbackProvider().getBiometricCallback();
        try {
            if (wrapForBiometricPrompt == null) {
                Api28Impl.authenticate(biometricPrompt, biometricCancellationSignal, promptExecutor, biometricCallback);
            } else {
                Api28Impl.authenticate(biometricPrompt, wrapForBiometricPrompt, biometricCancellationSignal, promptExecutor, biometricCallback);
            }
        } catch (NullPointerException e) {
            Log.e(TAG, "Got NPE while authenticating with biometric prompt.", e);
            sendErrorAndDismiss(1, context != null ? context.getString(R.string.default_error_msg) : "");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void cancelAuthentication(int i) {
        if (i == 3 || !this.mViewModel.isIgnoringCancel()) {
            if (isUsingFingerprintDialog()) {
                this.mViewModel.setCanceledFrom(i);
                if (i == 1) {
                    sendErrorToClient(10, ErrorUtils.getFingerprintErrorString(getContext(), 10));
                }
            }
            this.mViewModel.getCancellationSignalProvider().cancel();
        }
    }

    void dismiss() {
        this.mViewModel.setPromptShowing(false);
        dismissFingerprintDialog();
        if (!this.mViewModel.isConfirmingDeviceCredential() && isAdded()) {
            getParentFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
        }
        Context context = getContext();
        if (context == null || !DeviceUtils.shouldDelayShowingPrompt(context, Build.MODEL)) {
            return;
        }
        this.mViewModel.setDelayingPrompt(true);
        this.mHandler.postDelayed(new StopDelayingPromptRunnable(this.mViewModel), 600L);
    }

    private void dismissFingerprintDialog() {
        this.mViewModel.setPromptShowing(false);
        if (isAdded()) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            FingerprintDialogFragment fingerprintDialogFragment = (FingerprintDialogFragment) parentFragmentManager.findFragmentByTag(FINGERPRINT_DIALOG_FRAGMENT_TAG);
            if (fingerprintDialogFragment != null) {
                if (fingerprintDialogFragment.isAdded()) {
                    fingerprintDialogFragment.dismissAllowingStateLoss();
                } else {
                    parentFragmentManager.beginTransaction().remove(fingerprintDialogFragment).commitAllowingStateLoss();
                }
            }
        }
    }

    void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        sendSuccessAndDismiss(authenticationResult);
    }

    void onAuthenticationError(final int i, final CharSequence charSequence) {
        if (!ErrorUtils.isKnownError(i)) {
            i = 8;
        }
        Context context = getContext();
        if (Build.VERSION.SDK_INT < 29 && ErrorUtils.isLockoutError(i) && context != null && KeyguardUtils.isDeviceSecuredWithCredential(context) && AuthenticatorUtils.isDeviceCredentialAllowed(this.mViewModel.getAllowedAuthenticators())) {
            launchConfirmCredentialActivity();
        } else if (!isUsingFingerprintDialog()) {
            if (charSequence == null) {
                charSequence = getString(R.string.default_error_msg) + " " + i;
            }
            sendErrorAndDismiss(i, charSequence);
        } else {
            if (charSequence == null) {
                charSequence = ErrorUtils.getFingerprintErrorString(getContext(), i);
            }
            if (i == 5) {
                int canceledFrom = this.mViewModel.getCanceledFrom();
                if (canceledFrom == 0 || canceledFrom == 3) {
                    sendErrorToClient(i, charSequence);
                }
                dismiss();
                return;
            }
            if (this.mViewModel.isFingerprintDialogDismissedInstantly()) {
                sendErrorAndDismiss(i, charSequence);
            } else {
                showFingerprintErrorMessage(charSequence);
                this.mHandler.postDelayed(new Runnable() { // from class: androidx.biometric.BiometricFragment.8
                    @Override // java.lang.Runnable
                    public void run() {
                        BiometricFragment.this.sendErrorAndDismiss(i, charSequence);
                    }
                }, getDismissDialogDelay());
            }
            this.mViewModel.setFingerprintDialogDismissedInstantly(true);
        }
    }

    void onAuthenticationHelp(CharSequence charSequence) {
        if (isUsingFingerprintDialog()) {
            showFingerprintErrorMessage(charSequence);
        }
    }

    void onAuthenticationFailed() {
        if (isUsingFingerprintDialog()) {
            showFingerprintErrorMessage(getString(R.string.fingerprint_not_recognized));
        }
        sendFailureToClient();
    }

    void onDeviceCredentialButtonPressed() {
        launchConfirmCredentialActivity();
    }

    void onCancelButtonPressed() {
        CharSequence negativeButtonText = this.mViewModel.getNegativeButtonText();
        if (negativeButtonText == null) {
            negativeButtonText = getString(R.string.default_error_msg);
        }
        sendErrorAndDismiss(13, negativeButtonText);
        cancelAuthentication(2);
    }

    private void launchConfirmCredentialActivity() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            Log.e(TAG, "Failed to check device credential. Client FragmentActivity not found.");
            return;
        }
        KeyguardManager keyguardManager = KeyguardUtils.getKeyguardManager(activity);
        if (keyguardManager == null) {
            sendErrorAndDismiss(12, getString(R.string.generic_error_no_keyguard));
            return;
        }
        CharSequence title = this.mViewModel.getTitle();
        CharSequence subtitle = this.mViewModel.getSubtitle();
        CharSequence description = this.mViewModel.getDescription();
        if (subtitle == null) {
            subtitle = description;
        }
        Intent createConfirmDeviceCredentialIntent = Api21Impl.createConfirmDeviceCredentialIntent(keyguardManager, title, subtitle);
        if (createConfirmDeviceCredentialIntent == null) {
            sendErrorAndDismiss(14, getString(R.string.generic_error_no_device_credential));
            return;
        }
        this.mViewModel.setConfirmingDeviceCredential(true);
        if (isUsingFingerprintDialog()) {
            dismissFingerprintDialog();
        }
        createConfirmDeviceCredentialIntent.setFlags(134742016);
        startActivityForResult(createConfirmDeviceCredentialIntent, 1);
    }

    private void handleConfirmCredentialResult(int i) {
        if (i == -1) {
            sendSuccessAndDismiss(new BiometricPrompt.AuthenticationResult(null, 1));
        } else {
            sendErrorAndDismiss(10, getString(R.string.generic_error_user_canceled));
        }
    }

    private void showFingerprintErrorMessage(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = getString(R.string.default_error_msg);
        }
        this.mViewModel.setFingerprintDialogState(2);
        this.mViewModel.setFingerprintDialogHelpMessage(charSequence);
    }

    private void sendSuccessAndDismiss(BiometricPrompt.AuthenticationResult authenticationResult) {
        sendSuccessToClient(authenticationResult);
        dismiss();
    }

    void sendErrorAndDismiss(int i, CharSequence charSequence) {
        sendErrorToClient(i, charSequence);
        dismiss();
    }

    private void sendSuccessToClient(final BiometricPrompt.AuthenticationResult authenticationResult) {
        if (!this.mViewModel.isAwaitingResult()) {
            Log.w(TAG, "Success not sent to client. Client is not awaiting a result.");
            return;
        }
        this.mViewModel.setAwaitingResult(false);
        this.mViewModel.getClientExecutor().execute(new Runnable() { // from class: androidx.biometric.BiometricFragment.9
            @Override // java.lang.Runnable
            public void run() {
                BiometricFragment.this.mViewModel.getClientCallback().onAuthenticationSucceeded(authenticationResult);
            }
        });
    }

    private void sendErrorToClient(final int i, final CharSequence charSequence) {
        if (this.mViewModel.isConfirmingDeviceCredential()) {
            Log.v(TAG, "Error not sent to client. User is confirming their device credential.");
        } else if (!this.mViewModel.isAwaitingResult()) {
            Log.w(TAG, "Error not sent to client. Client is not awaiting a result.");
        } else {
            this.mViewModel.setAwaitingResult(false);
            this.mViewModel.getClientExecutor().execute(new Runnable() { // from class: androidx.biometric.BiometricFragment.10
                @Override // java.lang.Runnable
                public void run() {
                    BiometricFragment.this.mViewModel.getClientCallback().onAuthenticationError(i, charSequence);
                }
            });
        }
    }

    private void sendFailureToClient() {
        if (!this.mViewModel.isAwaitingResult()) {
            Log.w(TAG, "Failure not sent to client. Client is not awaiting a result.");
        } else {
            this.mViewModel.getClientExecutor().execute(new Runnable() { // from class: androidx.biometric.BiometricFragment.11
                @Override // java.lang.Runnable
                public void run() {
                    BiometricFragment.this.mViewModel.getClientCallback().onAuthenticationFailed();
                }
            });
        }
    }

    private static int checkForFingerprintPreAuthenticationErrors(FingerprintManagerCompat fingerprintManagerCompat) {
        if (fingerprintManagerCompat.isHardwareDetected()) {
            return !fingerprintManagerCompat.hasEnrolledFingerprints() ? 11 : 0;
        }
        return 12;
    }

    boolean isManagingDeviceCredentialButton() {
        return Build.VERSION.SDK_INT <= 28 && AuthenticatorUtils.isDeviceCredentialAllowed(this.mViewModel.getAllowedAuthenticators());
    }

    private boolean isUsingFingerprintDialog() {
        return Build.VERSION.SDK_INT < 28 || isFingerprintDialogNeededForCrypto() || isFingerprintDialogNeededForErrorHandling();
    }

    private boolean isFingerprintDialogNeededForCrypto() {
        FragmentActivity activity = getActivity();
        return (activity == null || this.mViewModel.getCryptoObject() == null || !DeviceUtils.shouldUseFingerprintForCrypto(activity, Build.MANUFACTURER, Build.MODEL)) ? false : true;
    }

    private boolean isFingerprintDialogNeededForErrorHandling() {
        return Build.VERSION.SDK_INT == 28 && !PackageUtils.hasSystemFeatureFingerprint(getContext());
    }

    private boolean isChangingConfigurations() {
        FragmentActivity activity = getActivity();
        return activity != null && activity.isChangingConfigurations();
    }

    private int getDismissDialogDelay() {
        Context context = getContext();
        return (context == null || !DeviceUtils.shouldHideFingerprintDialog(context, Build.MODEL)) ? 2000 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class Api30Impl {
        private Api30Impl() {
        }

        static void setAllowedAuthenticators(BiometricPrompt.Builder builder, int i) {
            builder.setAllowedAuthenticators(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class Api29Impl {
        private Api29Impl() {
        }

        static void setConfirmationRequired(BiometricPrompt.Builder builder, boolean z) {
            builder.setConfirmationRequired(z);
        }

        static void setDeviceCredentialAllowed(BiometricPrompt.Builder builder, boolean z) {
            builder.setDeviceCredentialAllowed(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class Api28Impl {
        private Api28Impl() {
        }

        static BiometricPrompt.Builder createPromptBuilder(Context context) {
            return new BiometricPrompt.Builder(context);
        }

        static void setTitle(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }

        static void setSubtitle(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        static void setDescription(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        static void setNegativeButton(BiometricPrompt.Builder builder, CharSequence charSequence, Executor executor, DialogInterface.OnClickListener onClickListener) {
            builder.setNegativeButton(charSequence, executor, onClickListener);
        }

        static android.hardware.biometrics.BiometricPrompt buildPrompt(BiometricPrompt.Builder builder) {
            return builder.build();
        }

        static void authenticate(android.hardware.biometrics.BiometricPrompt biometricPrompt, CancellationSignal cancellationSignal, Executor executor, android.hardware.biometrics.BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback) {
            biometricPrompt.authenticate(cancellationSignal, executor, biometricPrompt$AuthenticationCallback);
        }

        static void authenticate(android.hardware.biometrics.BiometricPrompt biometricPrompt, BiometricPrompt.CryptoObject cryptoObject, CancellationSignal cancellationSignal, Executor executor, android.hardware.biometrics.BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback) {
            biometricPrompt.authenticate(cryptoObject, cancellationSignal, executor, biometricPrompt$AuthenticationCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class Api21Impl {
        private Api21Impl() {
        }

        static Intent createConfirmDeviceCredentialIntent(KeyguardManager keyguardManager, CharSequence charSequence, CharSequence charSequence2) {
            return keyguardManager.createConfirmDeviceCredentialIntent(charSequence, charSequence2);
        }
    }
}
