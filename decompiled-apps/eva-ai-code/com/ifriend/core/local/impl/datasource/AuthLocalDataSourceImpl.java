package com.ifriend.core.local.impl.datasource;

import android.content.SharedPreferences;
import com.ifriend.core.local.api.AuthLocalDataSource;
import com.ifriend.core.local.impl.qualifier.UserPreferenceQualifier;
import com.ifriend.keychain.KeychainAdapter;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AuthLocalDataSourceImpl.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u0013\u0010\n\u001a\u0004\u0018\u00010\bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u0013\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u0013\u0010\f\u001a\u0004\u0018\u00010\bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/ifriend/core/local/impl/datasource/AuthLocalDataSourceImpl;", "Lcom/ifriend/core/local/api/AuthLocalDataSource;", "keychainAdapter", "Lcom/ifriend/keychain/KeychainAdapter;", "preferences", "Landroid/content/SharedPreferences;", "(Lcom/ifriend/keychain/KeychainAdapter;Landroid/content/SharedPreferences;)V", "getFormattedUserToken", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserEmail", "getUserId", "getUserToken", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AuthLocalDataSourceImpl implements AuthLocalDataSource {
    private final KeychainAdapter keychainAdapter;
    private final SharedPreferences preferences;

    @Inject
    public AuthLocalDataSourceImpl(KeychainAdapter keychainAdapter, @UserPreferenceQualifier SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(keychainAdapter, "keychainAdapter");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.keychainAdapter = keychainAdapter;
        this.preferences = preferences;
    }

    @Override // com.ifriend.core.local.api.AuthLocalDataSource
    public Object getUserToken(Continuation<? super String> continuation) {
        return this.keychainAdapter.getPassword(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056 A[ORIG_RETURN, RETURN] */
    @Override // com.ifriend.core.local.api.AuthLocalDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getFormattedUserToken(Continuation<? super String> continuation) {
        AuthLocalDataSourceImpl$getFormattedUserToken$1 authLocalDataSourceImpl$getFormattedUserToken$1;
        int i;
        String str;
        if (continuation instanceof AuthLocalDataSourceImpl$getFormattedUserToken$1) {
            authLocalDataSourceImpl$getFormattedUserToken$1 = (AuthLocalDataSourceImpl$getFormattedUserToken$1) continuation;
            if ((authLocalDataSourceImpl$getFormattedUserToken$1.label & Integer.MIN_VALUE) != 0) {
                authLocalDataSourceImpl$getFormattedUserToken$1.label -= Integer.MIN_VALUE;
                Object obj = authLocalDataSourceImpl$getFormattedUserToken$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = authLocalDataSourceImpl$getFormattedUserToken$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    authLocalDataSourceImpl$getFormattedUserToken$1.label = 1;
                    obj = getUserToken(authLocalDataSourceImpl$getFormattedUserToken$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                str = (String) obj;
                if (str == null) {
                    return "Token token=\"" + str + "\"";
                }
                return null;
            }
        }
        authLocalDataSourceImpl$getFormattedUserToken$1 = new AuthLocalDataSourceImpl$getFormattedUserToken$1(this, continuation);
        Object obj2 = authLocalDataSourceImpl$getFormattedUserToken$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = authLocalDataSourceImpl$getFormattedUserToken$1.label;
        if (i != 0) {
        }
        str = (String) obj2;
        if (str == null) {
        }
    }

    @Override // com.ifriend.core.local.api.AuthLocalDataSource
    public Object getUserId(Continuation<? super String> continuation) {
        return this.preferences.getString("user_id", null);
    }

    @Override // com.ifriend.core.local.api.AuthLocalDataSource
    public Object getUserEmail(Continuation<? super String> continuation) {
        return this.preferences.getString("email", null);
    }
}
