package com.ifriend.registration.presentation.bridges.google;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.Fragment;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
import com.ifriend.common_utils.Logger;
import com.ifriend.registration.domain.useCase.google.GoogleAccountData;
import com.ifriend.registration.presentation.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
/* compiled from: GoogleAuthorizationAdapter.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0016\u0017\u0018\u0019B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0006\u0010\u0011\u001a\u00020\u0007J\u0006\u0010\u0012\u001a\u00020\u0007J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ifriend/registration/presentation/bridges/google/GoogleAuthorizationAdapter;", "", "fragment", "Landroidx/fragment/app/Fragment;", "onAuthCallback", "Lkotlin/Function1;", "Lcom/ifriend/registration/domain/useCase/google/GoogleAccountData;", "", "logger", "Lcom/ifriend/common_utils/Logger;", "(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;Lcom/ifriend/common_utils/Logger;)V", "googleAuthLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "activityResultCallback", "result", "Landroidx/activity/result/ActivityResult;", "auth", "init", "onAuth", "account", "Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;", "GoogleAuthException", "GoogleAuthInvalidDataException", "GoogleAuthResultException", "GoogleAuthorizationStateException", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GoogleAuthorizationAdapter {
    public static final int $stable = 8;
    private final Fragment fragment;
    private ActivityResultLauncher<Intent> googleAuthLauncher;
    private final Logger logger;
    private final Function1<GoogleAccountData, Unit> onAuthCallback;

    /* JADX WARN: Multi-variable type inference failed */
    public GoogleAuthorizationAdapter(Fragment fragment, Function1<? super GoogleAccountData, Unit> onAuthCallback, Logger logger) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(onAuthCallback, "onAuthCallback");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.fragment = fragment;
        this.onAuthCallback = onAuthCallback;
        this.logger = logger;
    }

    public final void init() {
        this.googleAuthLauncher = this.fragment.registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new GoogleAuthorizationAdapter$init$1(this));
    }

    public final void auth() {
        Context context = this.fragment.getContext();
        if (context == null) {
            this.logger.logException(new GoogleAuthorizationStateException("Google authorization failed. Fragment context is null"));
            return;
        }
        ActivityResultLauncher<Intent> activityResultLauncher = this.googleAuthLauncher;
        if (activityResultLauncher == null) {
            this.logger.logException(new GoogleAuthorizationStateException("Google authorization failed. Google auth launcher is null"));
            throw new IllegalStateException("Call init in Fragment.onCreate method first");
        }
        this.logger.log("GoogleAuthorizationAdapter.auth: start authorization...");
        String string = context.getString(R.string.server_client_id);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        GoogleSignInOptions build = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestIdToken(string).requestEmail().requestProfile().build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        GoogleSignInClient client = GoogleSignIn.getClient(context, build);
        Intrinsics.checkNotNullExpressionValue(client, "getClient(...)");
        Intent signInIntent = client.getSignInIntent();
        Intrinsics.checkNotNullExpressionValue(signInIntent, "getSignInIntent(...)");
        activityResultLauncher.launch(signInIntent);
        this.logger.log("GoogleAuthorizationAdapter.auth: ActivityResultLauncher launched with SignIn Intent");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void activityResultCallback(ActivityResult activityResult) {
        try {
            Task<GoogleSignInAccount> signedInAccountFromIntent = GoogleSignIn.getSignedInAccountFromIntent(activityResult.getData());
            Intrinsics.checkNotNullExpressionValue(signedInAccountFromIntent, "getSignedInAccountFromIntent(...)");
            GoogleSignInAccount result = signedInAccountFromIntent.getResult(ApiException.class);
            if (result == null) {
                throw new GoogleAuthResultException("Google authorization failed. Account is null");
            }
            onAuth(result);
        } catch (Exception e) {
            Logger logger = this.logger;
            String message = e.getMessage();
            Logger.DefaultImpls.warn$default(logger, "Google authorization failed. Sign in exception raised " + message, null, 2, null);
            this.logger.logException(e);
        }
    }

    private final void onAuth(GoogleSignInAccount googleSignInAccount) {
        List split$default;
        String displayName = googleSignInAccount.getDisplayName();
        String str = (displayName == null || (split$default = StringsKt.split$default((CharSequence) displayName, new String[]{" "}, false, 0, 6, (Object) null)) == null) ? null : (String) CollectionsKt.firstOrNull((List<? extends Object>) split$default);
        String email = googleSignInAccount.getEmail();
        if (email == null) {
            throw new GoogleAuthInvalidDataException("No email");
        }
        String idToken = googleSignInAccount.getIdToken();
        if (idToken == null) {
            throw new GoogleAuthInvalidDataException("No token");
        }
        this.onAuthCallback.invoke(new GoogleAccountData(str, email, idToken));
    }

    /* compiled from: GoogleAuthorizationAdapter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/ifriend/registration/presentation/bridges/google/GoogleAuthorizationAdapter$GoogleAuthException;", "Ljava/lang/Exception;", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "(Ljava/lang/String;)V", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static class GoogleAuthException extends Exception {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GoogleAuthException(String message) {
            super(message);
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    /* compiled from: GoogleAuthorizationAdapter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/ifriend/registration/presentation/bridges/google/GoogleAuthorizationAdapter$GoogleAuthorizationStateException;", "Lcom/ifriend/registration/presentation/bridges/google/GoogleAuthorizationAdapter$GoogleAuthException;", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "(Ljava/lang/String;)V", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class GoogleAuthorizationStateException extends GoogleAuthException {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GoogleAuthorizationStateException(String message) {
            super(message);
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    /* compiled from: GoogleAuthorizationAdapter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/ifriend/registration/presentation/bridges/google/GoogleAuthorizationAdapter$GoogleAuthResultException;", "Lcom/ifriend/registration/presentation/bridges/google/GoogleAuthorizationAdapter$GoogleAuthException;", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "(Ljava/lang/String;)V", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class GoogleAuthResultException extends GoogleAuthException {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GoogleAuthResultException(String message) {
            super(message);
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    /* compiled from: GoogleAuthorizationAdapter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/ifriend/registration/presentation/bridges/google/GoogleAuthorizationAdapter$GoogleAuthInvalidDataException;", "Lcom/ifriend/registration/presentation/bridges/google/GoogleAuthorizationAdapter$GoogleAuthException;", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "(Ljava/lang/String;)V", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class GoogleAuthInvalidDataException extends GoogleAuthException {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GoogleAuthInvalidDataException(String message) {
            super(message);
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }
}
