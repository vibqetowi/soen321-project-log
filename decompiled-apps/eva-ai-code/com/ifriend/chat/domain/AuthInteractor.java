package com.ifriend.chat.domain;

import com.ifriend.domain.authorization.SignInWithTokenUseCase;
import com.ifriend.domain.data.AuthDataProvider;
import com.ifriend.domain.models.authorization.TokenLoginResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AuthInteractor.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/ifriend/chat/domain/AuthInteractor;", "", "signInWithTokenUseCase", "Lcom/ifriend/domain/authorization/SignInWithTokenUseCase;", "authDataProvider", "Lcom/ifriend/domain/data/AuthDataProvider;", "(Lcom/ifriend/domain/authorization/SignInWithTokenUseCase;Lcom/ifriend/domain/data/AuthDataProvider;)V", "loginIfNecessary", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AuthInteractor {
    private final AuthDataProvider authDataProvider;
    private final SignInWithTokenUseCase signInWithTokenUseCase;

    public AuthInteractor(SignInWithTokenUseCase signInWithTokenUseCase, AuthDataProvider authDataProvider) {
        Intrinsics.checkNotNullParameter(signInWithTokenUseCase, "signInWithTokenUseCase");
        Intrinsics.checkNotNullParameter(authDataProvider, "authDataProvider");
        this.signInWithTokenUseCase = signInWithTokenUseCase;
        this.authDataProvider = authDataProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loginIfNecessary(Continuation<? super Boolean> continuation) {
        AuthInteractor$loginIfNecessary$1 authInteractor$loginIfNecessary$1;
        int i;
        if (continuation instanceof AuthInteractor$loginIfNecessary$1) {
            authInteractor$loginIfNecessary$1 = (AuthInteractor$loginIfNecessary$1) continuation;
            if ((authInteractor$loginIfNecessary$1.label & Integer.MIN_VALUE) != 0) {
                authInteractor$loginIfNecessary$1.label -= Integer.MIN_VALUE;
                AuthInteractor$loginIfNecessary$1 authInteractor$loginIfNecessary$12 = authInteractor$loginIfNecessary$1;
                Object obj = authInteractor$loginIfNecessary$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = authInteractor$loginIfNecessary$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.authDataProvider.sessionAuthData().getValue() != null) {
                        return Boxing.boxBoolean(true);
                    }
                    SignInWithTokenUseCase signInWithTokenUseCase = this.signInWithTokenUseCase;
                    authInteractor$loginIfNecessary$12.label = 1;
                    obj = SignInWithTokenUseCase.signIn$default(signInWithTokenUseCase, null, false, authInteractor$loginIfNecessary$12, 1, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxBoolean(((TokenLoginResponse) obj) instanceof TokenLoginResponse.Success);
            }
        }
        authInteractor$loginIfNecessary$1 = new AuthInteractor$loginIfNecessary$1(this, continuation);
        AuthInteractor$loginIfNecessary$1 authInteractor$loginIfNecessary$122 = authInteractor$loginIfNecessary$1;
        Object obj2 = authInteractor$loginIfNecessary$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = authInteractor$loginIfNecessary$122.label;
        if (i != 0) {
        }
        return Boxing.boxBoolean(((TokenLoginResponse) obj2) instanceof TokenLoginResponse.Success);
    }
}
