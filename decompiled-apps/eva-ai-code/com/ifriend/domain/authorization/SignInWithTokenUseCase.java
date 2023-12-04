package com.ifriend.domain.authorization;

import com.ifriend.domain.logic.onboarding.UpdateOnboardingUseCase;
import com.ifriend.domain.models.authorization.TokenLoginResponse;
import com.ifriend.domain.models.profile.user.UserToken;
import com.ifriend.domain.services.initialData.InitialDataLoader;
import com.ifriend.domain.storage.token.UserTokenStorage;
import com.ifriend.domain.storage.token.UserTokenStorageKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: SignInWithTokenUseCase.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ'\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/ifriend/domain/authorization/SignInWithTokenUseCase;", "", "userTokenStorage", "Lcom/ifriend/domain/storage/token/UserTokenStorage;", "authorizer", "Lcom/ifriend/domain/authorization/Authorizer;", "initialDataLoader", "Lcom/ifriend/domain/services/initialData/InitialDataLoader;", "updateOnboardingUseCase", "Lcom/ifriend/domain/logic/onboarding/UpdateOnboardingUseCase;", "(Lcom/ifriend/domain/storage/token/UserTokenStorage;Lcom/ifriend/domain/authorization/Authorizer;Lcom/ifriend/domain/services/initialData/InitialDataLoader;Lcom/ifriend/domain/logic/onboarding/UpdateOnboardingUseCase;)V", "signIn", "Lcom/ifriend/domain/models/authorization/TokenLoginResponse;", "authToken", "", "isUpdateOnboarding", "", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SignInWithTokenUseCase {
    private final Authorizer authorizer;
    private final InitialDataLoader initialDataLoader;
    private final UpdateOnboardingUseCase updateOnboardingUseCase;
    private final UserTokenStorage userTokenStorage;

    public SignInWithTokenUseCase(UserTokenStorage userTokenStorage, Authorizer authorizer, InitialDataLoader initialDataLoader, UpdateOnboardingUseCase updateOnboardingUseCase) {
        Intrinsics.checkNotNullParameter(userTokenStorage, "userTokenStorage");
        Intrinsics.checkNotNullParameter(authorizer, "authorizer");
        Intrinsics.checkNotNullParameter(initialDataLoader, "initialDataLoader");
        Intrinsics.checkNotNullParameter(updateOnboardingUseCase, "updateOnboardingUseCase");
        this.userTokenStorage = userTokenStorage;
        this.authorizer = authorizer;
        this.initialDataLoader = initialDataLoader;
        this.updateOnboardingUseCase = updateOnboardingUseCase;
    }

    public static /* synthetic */ Object signIn$default(SignInWithTokenUseCase signInWithTokenUseCase, String str, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return signInWithTokenUseCase.signIn(str, z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d A[Catch: Exception -> 0x0135, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0135, blocks: (B:12:0x002d, B:75:0x012c, B:15:0x0036, B:62:0x00fd, B:64:0x0103, B:67:0x0107, B:18:0x004b, B:55:0x00de, B:58:0x00e8, B:68:0x0115, B:21:0x0056, B:45:0x00bc, B:47:0x00c2, B:49:0x00c5, B:51:0x00c9, B:70:0x011a, B:72:0x011e, B:77:0x012f, B:78:0x0134, B:24:0x0061, B:38:0x009d, B:40:0x00a5, B:42:0x00a8, B:27:0x006b, B:35:0x008b, B:31:0x0074), top: B:81:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5 A[Catch: Exception -> 0x0135, TryCatch #0 {Exception -> 0x0135, blocks: (B:12:0x002d, B:75:0x012c, B:15:0x0036, B:62:0x00fd, B:64:0x0103, B:67:0x0107, B:18:0x004b, B:55:0x00de, B:58:0x00e8, B:68:0x0115, B:21:0x0056, B:45:0x00bc, B:47:0x00c2, B:49:0x00c5, B:51:0x00c9, B:70:0x011a, B:72:0x011e, B:77:0x012f, B:78:0x0134, B:24:0x0061, B:38:0x009d, B:40:0x00a5, B:42:0x00a8, B:27:0x006b, B:35:0x008b, B:31:0x0074), top: B:81:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a8 A[Catch: Exception -> 0x0135, TryCatch #0 {Exception -> 0x0135, blocks: (B:12:0x002d, B:75:0x012c, B:15:0x0036, B:62:0x00fd, B:64:0x0103, B:67:0x0107, B:18:0x004b, B:55:0x00de, B:58:0x00e8, B:68:0x0115, B:21:0x0056, B:45:0x00bc, B:47:0x00c2, B:49:0x00c5, B:51:0x00c9, B:70:0x011a, B:72:0x011e, B:77:0x012f, B:78:0x0134, B:24:0x0061, B:38:0x009d, B:40:0x00a5, B:42:0x00a8, B:27:0x006b, B:35:0x008b, B:31:0x0074), top: B:81:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c2 A[Catch: Exception -> 0x0135, TryCatch #0 {Exception -> 0x0135, blocks: (B:12:0x002d, B:75:0x012c, B:15:0x0036, B:62:0x00fd, B:64:0x0103, B:67:0x0107, B:18:0x004b, B:55:0x00de, B:58:0x00e8, B:68:0x0115, B:21:0x0056, B:45:0x00bc, B:47:0x00c2, B:49:0x00c5, B:51:0x00c9, B:70:0x011a, B:72:0x011e, B:77:0x012f, B:78:0x0134, B:24:0x0061, B:38:0x009d, B:40:0x00a5, B:42:0x00a8, B:27:0x006b, B:35:0x008b, B:31:0x0074), top: B:81:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c5 A[Catch: Exception -> 0x0135, TryCatch #0 {Exception -> 0x0135, blocks: (B:12:0x002d, B:75:0x012c, B:15:0x0036, B:62:0x00fd, B:64:0x0103, B:67:0x0107, B:18:0x004b, B:55:0x00de, B:58:0x00e8, B:68:0x0115, B:21:0x0056, B:45:0x00bc, B:47:0x00c2, B:49:0x00c5, B:51:0x00c9, B:70:0x011a, B:72:0x011e, B:77:0x012f, B:78:0x0134, B:24:0x0061, B:38:0x009d, B:40:0x00a5, B:42:0x00a8, B:27:0x006b, B:35:0x008b, B:31:0x0074), top: B:81:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0103 A[Catch: Exception -> 0x0135, TryCatch #0 {Exception -> 0x0135, blocks: (B:12:0x002d, B:75:0x012c, B:15:0x0036, B:62:0x00fd, B:64:0x0103, B:67:0x0107, B:18:0x004b, B:55:0x00de, B:58:0x00e8, B:68:0x0115, B:21:0x0056, B:45:0x00bc, B:47:0x00c2, B:49:0x00c5, B:51:0x00c9, B:70:0x011a, B:72:0x011e, B:77:0x012f, B:78:0x0134, B:24:0x0061, B:38:0x009d, B:40:0x00a5, B:42:0x00a8, B:27:0x006b, B:35:0x008b, B:31:0x0074), top: B:81:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0115 A[Catch: Exception -> 0x0135, TryCatch #0 {Exception -> 0x0135, blocks: (B:12:0x002d, B:75:0x012c, B:15:0x0036, B:62:0x00fd, B:64:0x0103, B:67:0x0107, B:18:0x004b, B:55:0x00de, B:58:0x00e8, B:68:0x0115, B:21:0x0056, B:45:0x00bc, B:47:0x00c2, B:49:0x00c5, B:51:0x00c9, B:70:0x011a, B:72:0x011e, B:77:0x012f, B:78:0x0134, B:24:0x0061, B:38:0x009d, B:40:0x00a5, B:42:0x00a8, B:27:0x006b, B:35:0x008b, B:31:0x0074), top: B:81:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object signIn(String str, boolean z, Continuation<? super TokenLoginResponse> continuation) {
        SignInWithTokenUseCase$signIn$1 signInWithTokenUseCase$signIn$1;
        boolean z2;
        SignInWithTokenUseCase signInWithTokenUseCase;
        UserToken userToken;
        SignInWithTokenUseCase signInWithTokenUseCase2;
        TokenLoginResponse tokenLoginResponse;
        TokenLoginResponse tokenLoginResponse2;
        Object obj;
        TokenLoginResponse tokenLoginResponse3;
        try {
            if (continuation instanceof SignInWithTokenUseCase$signIn$1) {
                signInWithTokenUseCase$signIn$1 = (SignInWithTokenUseCase$signIn$1) continuation;
                if ((signInWithTokenUseCase$signIn$1.label & Integer.MIN_VALUE) != 0) {
                    signInWithTokenUseCase$signIn$1.label -= Integer.MIN_VALUE;
                    Object obj2 = signInWithTokenUseCase$signIn$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch (signInWithTokenUseCase$signIn$1.label) {
                        case 0:
                            ResultKt.throwOnFailure(obj2);
                            if (str != null) {
                                UserTokenStorage userTokenStorage = this.userTokenStorage;
                                UserToken userToken2 = new UserToken(str);
                                signInWithTokenUseCase$signIn$1.L$0 = this;
                                signInWithTokenUseCase$signIn$1.Z$0 = z;
                                signInWithTokenUseCase$signIn$1.label = 1;
                                if (userTokenStorage.set(userToken2, signInWithTokenUseCase$signIn$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            z2 = z;
                            signInWithTokenUseCase = this;
                            signInWithTokenUseCase$signIn$1.L$0 = signInWithTokenUseCase;
                            signInWithTokenUseCase$signIn$1.Z$0 = z2;
                            signInWithTokenUseCase$signIn$1.label = 2;
                            obj2 = UserTokenStorageKt.current(signInWithTokenUseCase.userTokenStorage, signInWithTokenUseCase$signIn$1);
                            if (obj2 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            userToken = (UserToken) obj2;
                            if (userToken.isNotValid()) {
                                return TokenLoginResponse.TokenIsNotValid.INSTANCE;
                            }
                            Authorizer authorizer = signInWithTokenUseCase.authorizer;
                            String value = userToken.getValue();
                            signInWithTokenUseCase$signIn$1.L$0 = signInWithTokenUseCase;
                            signInWithTokenUseCase$signIn$1.Z$0 = z2;
                            signInWithTokenUseCase$signIn$1.label = 3;
                            obj2 = authorizer.auth(value, signInWithTokenUseCase$signIn$1);
                            if (obj2 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            signInWithTokenUseCase2 = signInWithTokenUseCase;
                            tokenLoginResponse = (TokenLoginResponse) obj2;
                            if (!(tokenLoginResponse instanceof TokenLoginResponse.Failure)) {
                                return TokenLoginResponse.Failure.INSTANCE;
                            }
                            if (tokenLoginResponse instanceof TokenLoginResponse.Success) {
                                InitialDataLoader initialDataLoader = signInWithTokenUseCase2.initialDataLoader;
                                signInWithTokenUseCase$signIn$1.L$0 = signInWithTokenUseCase2;
                                signInWithTokenUseCase$signIn$1.L$1 = tokenLoginResponse;
                                signInWithTokenUseCase$signIn$1.Z$0 = z2;
                                signInWithTokenUseCase$signIn$1.label = 4;
                                Object load = initialDataLoader.load(signInWithTokenUseCase$signIn$1);
                                if (load == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                obj2 = load;
                                tokenLoginResponse2 = tokenLoginResponse;
                                if (!((Boolean) obj2).booleanValue()) {
                                    if (z2) {
                                        UpdateOnboardingUseCase updateOnboardingUseCase = signInWithTokenUseCase2.updateOnboardingUseCase;
                                        Unit unit = Unit.INSTANCE;
                                        signInWithTokenUseCase$signIn$1.L$0 = tokenLoginResponse2;
                                        signInWithTokenUseCase$signIn$1.L$1 = null;
                                        signInWithTokenUseCase$signIn$1.label = 5;
                                        Object mo6875invokegIAlus = updateOnboardingUseCase.mo6875invokegIAlus(unit, (Continuation<? super Result<? extends Unit>>) signInWithTokenUseCase$signIn$1);
                                        if (mo6875invokegIAlus == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        TokenLoginResponse tokenLoginResponse4 = tokenLoginResponse2;
                                        obj = mo6875invokegIAlus;
                                        tokenLoginResponse3 = tokenLoginResponse4;
                                        if (!Result.m7277isFailureimpl(obj)) {
                                            return TokenLoginResponse.Failure.INSTANCE;
                                        }
                                        tokenLoginResponse2 = tokenLoginResponse3;
                                    }
                                    return new TokenLoginResponse.Success(((TokenLoginResponse.Success) tokenLoginResponse2).getBody());
                                }
                                return TokenLoginResponse.Failure.INSTANCE;
                            } else if (tokenLoginResponse instanceof TokenLoginResponse.TokenIsNotValid) {
                                UserTokenStorage userTokenStorage2 = signInWithTokenUseCase2.userTokenStorage;
                                signInWithTokenUseCase$signIn$1.L$0 = null;
                                signInWithTokenUseCase$signIn$1.label = 6;
                                if (userTokenStorage2.clear(signInWithTokenUseCase$signIn$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                return TokenLoginResponse.TokenIsNotValid.INSTANCE;
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        case 1:
                            z2 = signInWithTokenUseCase$signIn$1.Z$0;
                            signInWithTokenUseCase = (SignInWithTokenUseCase) signInWithTokenUseCase$signIn$1.L$0;
                            ResultKt.throwOnFailure(obj2);
                            signInWithTokenUseCase$signIn$1.L$0 = signInWithTokenUseCase;
                            signInWithTokenUseCase$signIn$1.Z$0 = z2;
                            signInWithTokenUseCase$signIn$1.label = 2;
                            obj2 = UserTokenStorageKt.current(signInWithTokenUseCase.userTokenStorage, signInWithTokenUseCase$signIn$1);
                            if (obj2 == coroutine_suspended) {
                            }
                            userToken = (UserToken) obj2;
                            if (userToken.isNotValid()) {
                            }
                            break;
                        case 2:
                            z2 = signInWithTokenUseCase$signIn$1.Z$0;
                            signInWithTokenUseCase = (SignInWithTokenUseCase) signInWithTokenUseCase$signIn$1.L$0;
                            ResultKt.throwOnFailure(obj2);
                            userToken = (UserToken) obj2;
                            if (userToken.isNotValid()) {
                            }
                            break;
                        case 3:
                            z2 = signInWithTokenUseCase$signIn$1.Z$0;
                            signInWithTokenUseCase = (SignInWithTokenUseCase) signInWithTokenUseCase$signIn$1.L$0;
                            ResultKt.throwOnFailure(obj2);
                            signInWithTokenUseCase2 = signInWithTokenUseCase;
                            tokenLoginResponse = (TokenLoginResponse) obj2;
                            if (!(tokenLoginResponse instanceof TokenLoginResponse.Failure)) {
                            }
                            break;
                        case 4:
                            z2 = signInWithTokenUseCase$signIn$1.Z$0;
                            tokenLoginResponse2 = (TokenLoginResponse) signInWithTokenUseCase$signIn$1.L$1;
                            signInWithTokenUseCase2 = (SignInWithTokenUseCase) signInWithTokenUseCase$signIn$1.L$0;
                            ResultKt.throwOnFailure(obj2);
                            if (!((Boolean) obj2).booleanValue()) {
                            }
                            break;
                        case 5:
                            tokenLoginResponse3 = (TokenLoginResponse) signInWithTokenUseCase$signIn$1.L$0;
                            ResultKt.throwOnFailure(obj2);
                            obj = ((Result) obj2).m7280unboximpl();
                            if (!Result.m7277isFailureimpl(obj)) {
                            }
                            break;
                        case 6:
                            ResultKt.throwOnFailure(obj2);
                            return TokenLoginResponse.TokenIsNotValid.INSTANCE;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            switch (signInWithTokenUseCase$signIn$1.label) {
            }
        } catch (Exception unused) {
            return TokenLoginResponse.Failure.INSTANCE;
        }
        signInWithTokenUseCase$signIn$1 = new SignInWithTokenUseCase$signIn$1(this, continuation);
        Object obj22 = signInWithTokenUseCase$signIn$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
    }
}
