package com.google.android.gms.auth.api.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.OptionalPendingResultImpl;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import java.util.HashSet;
/* compiled from: com.google.android.gms:play-services-auth@@20.4.1 */
/* loaded from: classes2.dex */
public final class zbm {
    private static final Logger zba = new Logger("GoogleSignInCommon", new String[0]);

    public static Intent zba(Context context, GoogleSignInOptions googleSignInOptions) {
        zba.d("getFallbackSignInIntent()", new Object[0]);
        Intent zbc = zbc(context, googleSignInOptions);
        zbc.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
        return zbc;
    }

    public static Intent zbb(Context context, GoogleSignInOptions googleSignInOptions) {
        zba.d("getNoImplementationSignInIntent()", new Object[0]);
        Intent zbc = zbc(context, googleSignInOptions);
        zbc.setAction("com.google.android.gms.auth.NO_IMPL");
        return zbc;
    }

    public static Intent zbc(Context context, GoogleSignInOptions googleSignInOptions) {
        zba.d("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    public static GoogleSignInResult zbd(Intent intent) {
        if (intent == null) {
            return new GoogleSignInResult(null, Status.RESULT_INTERNAL_ERROR);
        }
        Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
        if (googleSignInAccount == null) {
            if (status == null) {
                status = Status.RESULT_INTERNAL_ERROR;
            }
            return new GoogleSignInResult(null, status);
        }
        return new GoogleSignInResult(googleSignInAccount, Status.RESULT_SUCCESS);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static OptionalPendingResult zbe(GoogleApiClient googleApiClient, Context context, GoogleSignInOptions googleSignInOptions, boolean z) {
        GoogleSignInAccount zba2;
        GoogleSignInResult googleSignInResult;
        Logger logger = zba;
        logger.d("silentSignIn()", new Object[0]);
        logger.d("getEligibleSavedSignInResult()", new Object[0]);
        Preconditions.checkNotNull(googleSignInOptions);
        GoogleSignInOptions zbb = zbn.zbc(context).zbb();
        if (zbb != null) {
            Account account = zbb.getAccount();
            Account account2 = googleSignInOptions.getAccount();
            if (account != null ? account.equals(account2) : account2 == null) {
                if (!googleSignInOptions.isServerAuthCodeRequested() && ((!googleSignInOptions.isIdTokenRequested() || (zbb.isIdTokenRequested() && Objects.equal(googleSignInOptions.getServerClientId(), zbb.getServerClientId()))) && new HashSet(zbb.getScopes()).containsAll(new HashSet(googleSignInOptions.getScopes())) && (zba2 = zbn.zbc(context).zba()) != null && !zba2.isExpired())) {
                    googleSignInResult = new GoogleSignInResult(zba2, Status.RESULT_SUCCESS);
                    if (googleSignInResult == null) {
                        logger.d("Eligible saved sign in result found", new Object[0]);
                        return PendingResults.immediatePendingResult(googleSignInResult, googleApiClient);
                    } else if (!z) {
                        logger.d("trySilentSignIn()", new Object[0]);
                        return new OptionalPendingResultImpl(googleApiClient.enqueue(new zbg(googleApiClient, context, googleSignInOptions)));
                    } else {
                        return PendingResults.immediatePendingResult(new GoogleSignInResult(null, new Status(4)), googleApiClient);
                    }
                }
            }
        }
        googleSignInResult = null;
        if (googleSignInResult == null) {
        }
    }

    public static PendingResult zbf(GoogleApiClient googleApiClient, Context context, boolean z) {
        zba.d("Revoking access", new Object[0]);
        String savedRefreshToken = Storage.getInstance(context).getSavedRefreshToken();
        zbh(context);
        if (z) {
            return zbb.zba(savedRefreshToken);
        }
        return googleApiClient.execute(new zbk(googleApiClient));
    }

    public static PendingResult zbg(GoogleApiClient googleApiClient, Context context, boolean z) {
        zba.d("Signing out", new Object[0]);
        zbh(context);
        if (z) {
            return PendingResults.immediatePendingResult(Status.RESULT_SUCCESS, googleApiClient);
        }
        return googleApiClient.execute(new zbi(googleApiClient));
    }

    private static void zbh(Context context) {
        zbn.zbc(context).zbd();
        for (GoogleApiClient googleApiClient : GoogleApiClient.getAllClients()) {
            googleApiClient.maybeSignOut();
        }
        GoogleApiManager.reportSignOut();
    }
}
