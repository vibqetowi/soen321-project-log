package com.ifriend.data.authorization;

import com.ifriend.common_utils.Logger;
import com.ifriend.domain.authorization.Authorizer;
import com.ifriend.domain.data.AuthDataStorage;
import com.ifriend.domain.data.install.AppInstallStorage;
import com.ifriend.domain.models.Response;
import com.ifriend.domain.models.authorization.AuthResult;
import com.ifriend.domain.models.authorization.EmailLoginResponse;
import com.ifriend.domain.models.authorization.TokenLoginResponse;
import com.ifriend.domain.models.profile.user.AuthData;
import com.ifriend.domain.models.profile.user.ClientId;
import com.ifriend.domain.models.profile.user.DbId;
import com.ifriend.domain.models.profile.user.UserId;
import com.ifriend.domain.models.profile.user.UserToken;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
/* compiled from: AuthorizerImpl.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ/\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J1\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0019J\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J)\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J/\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u000e\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0 2\u0006\u0010\u0012\u001a\u00020\u000eH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010!J'\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010#J\u001e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lcom/ifriend/data/authorization/AuthorizerImpl;", "Lcom/ifriend/domain/authorization/Authorizer;", "registrationProcess", "Lcom/ifriend/data/authorization/RegistrationApiDelegate;", "authDataStorage", "Lcom/ifriend/domain/data/AuthDataStorage;", "appInstallStorage", "Lcom/ifriend/domain/data/install/AppInstallStorage;", "logger", "Lcom/ifriend/common_utils/Logger;", "(Lcom/ifriend/data/authorization/RegistrationApiDelegate;Lcom/ifriend/domain/data/AuthDataStorage;Lcom/ifriend/domain/data/install/AppInstallStorage;Lcom/ifriend/common_utils/Logger;)V", "auth", "Lcom/ifriend/domain/models/authorization/TokenLoginResponse;", "token", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ifriend/domain/models/authorization/EmailLoginResponse;", "Lcom/ifriend/domain/models/authorization/AuthResult;", "email", "password", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleAuthJson", "json", "isSignedUp", "", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "parseJson", "saveAuthData", "", "userId", "signIn", "signInResponse", "Lcom/ifriend/domain/models/authorization/EmailLoginResponse$Success;", "(Lcom/ifriend/domain/models/authorization/EmailLoginResponse$Success;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signUp", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryParseJson", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AuthorizerImpl implements Authorizer {
    private final AppInstallStorage appInstallStorage;
    private final AuthDataStorage authDataStorage;
    private final Logger logger;
    private final RegistrationApiDelegate registrationProcess;

    public AuthorizerImpl(RegistrationApiDelegate registrationProcess, AuthDataStorage authDataStorage, AppInstallStorage appInstallStorage, Logger logger) {
        Intrinsics.checkNotNullParameter(registrationProcess, "registrationProcess");
        Intrinsics.checkNotNullParameter(authDataStorage, "authDataStorage");
        Intrinsics.checkNotNullParameter(appInstallStorage, "appInstallStorage");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.registrationProcess = registrationProcess;
        this.authDataStorage = authDataStorage;
        this.appInstallStorage = appInstallStorage;
        this.logger = logger;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // com.ifriend.domain.authorization.Authorizer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object auth(String str, Continuation<? super TokenLoginResponse> continuation) {
        AuthorizerImpl$auth$1 authorizerImpl$auth$1;
        int i;
        AuthorizerImpl authorizerImpl;
        TokenLoginResponse tokenLoginResponse;
        TokenLoginResponse tokenLoginResponse2;
        if (continuation instanceof AuthorizerImpl$auth$1) {
            authorizerImpl$auth$1 = (AuthorizerImpl$auth$1) continuation;
            if ((authorizerImpl$auth$1.label & Integer.MIN_VALUE) != 0) {
                authorizerImpl$auth$1.label -= Integer.MIN_VALUE;
                Object obj = authorizerImpl$auth$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = authorizerImpl$auth$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    RegistrationApiDelegate registrationApiDelegate = this.registrationProcess;
                    authorizerImpl$auth$1.L$0 = this;
                    authorizerImpl$auth$1.L$1 = str;
                    authorizerImpl$auth$1.label = 1;
                    obj = registrationApiDelegate.signInWithToken(str, authorizerImpl$auth$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    authorizerImpl = this;
                } else if (i != 1) {
                    if (i == 2) {
                        tokenLoginResponse2 = (TokenLoginResponse) authorizerImpl$auth$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        return tokenLoginResponse2;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    str = (String) authorizerImpl$auth$1.L$1;
                    authorizerImpl = (AuthorizerImpl) authorizerImpl$auth$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                tokenLoginResponse = (TokenLoginResponse) obj;
                if (tokenLoginResponse instanceof TokenLoginResponse.Success) {
                    return tokenLoginResponse;
                }
                TokenLoginResponse.Success success = (TokenLoginResponse.Success) tokenLoginResponse;
                String id = success.getBody().getId();
                String email = success.getBody().getEmail();
                authorizerImpl$auth$1.L$0 = tokenLoginResponse;
                authorizerImpl$auth$1.L$1 = null;
                authorizerImpl$auth$1.label = 2;
                if (authorizerImpl.saveAuthData(id, str, email, authorizerImpl$auth$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                tokenLoginResponse2 = tokenLoginResponse;
                return tokenLoginResponse2;
            }
        }
        authorizerImpl$auth$1 = new AuthorizerImpl$auth$1(this, continuation);
        Object obj2 = authorizerImpl$auth$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = authorizerImpl$auth$1.label;
        if (i != 0) {
        }
        tokenLoginResponse = (TokenLoginResponse) obj2;
        if (tokenLoginResponse instanceof TokenLoginResponse.Success) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    @Override // com.ifriend.domain.authorization.Authorizer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object auth(String str, String str2, String str3, Continuation<? super EmailLoginResponse<AuthResult>> continuation) {
        AuthorizerImpl$auth$2 authorizerImpl$auth$2;
        int i;
        AuthorizerImpl authorizerImpl;
        EmailLoginResponse emailLoginResponse;
        if (continuation instanceof AuthorizerImpl$auth$2) {
            authorizerImpl$auth$2 = (AuthorizerImpl$auth$2) continuation;
            if ((authorizerImpl$auth$2.label & Integer.MIN_VALUE) != 0) {
                authorizerImpl$auth$2.label -= Integer.MIN_VALUE;
                Object obj = authorizerImpl$auth$2.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = authorizerImpl$auth$2.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    RegistrationApiDelegate registrationApiDelegate = this.registrationProcess;
                    authorizerImpl$auth$2.L$0 = this;
                    authorizerImpl$auth$2.L$1 = str2;
                    authorizerImpl$auth$2.L$2 = str3;
                    authorizerImpl$auth$2.label = 1;
                    obj = registrationApiDelegate.signIn(str, authorizerImpl$auth$2);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    authorizerImpl = this;
                } else if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                    } else if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ResultKt.throwOnFailure(obj);
                    }
                } else {
                    str3 = (String) authorizerImpl$auth$2.L$2;
                    str2 = (String) authorizerImpl$auth$2.L$1;
                    authorizerImpl = (AuthorizerImpl) authorizerImpl$auth$2.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                emailLoginResponse = (EmailLoginResponse) obj;
                if (!(emailLoginResponse instanceof EmailLoginResponse.Success)) {
                    authorizerImpl$auth$2.L$0 = null;
                    authorizerImpl$auth$2.L$1 = null;
                    authorizerImpl$auth$2.L$2 = null;
                    authorizerImpl$auth$2.label = 2;
                    obj = authorizerImpl.signIn((EmailLoginResponse.Success) emailLoginResponse, str2, authorizerImpl$auth$2);
                    return obj == coroutine_suspended ? coroutine_suspended : obj;
                } else if (emailLoginResponse instanceof EmailLoginResponse.EmailNotRegistered) {
                    authorizerImpl$auth$2.L$0 = null;
                    authorizerImpl$auth$2.L$1 = null;
                    authorizerImpl$auth$2.L$2 = null;
                    authorizerImpl$auth$2.label = 3;
                    obj = authorizerImpl.signUp(str2, str3, authorizerImpl$auth$2);
                    return obj == coroutine_suspended ? coroutine_suspended : obj;
                } else {
                    return new EmailLoginResponse.Failure("Something went wrong");
                }
            }
        }
        authorizerImpl$auth$2 = new AuthorizerImpl$auth$2(this, continuation);
        Object obj2 = authorizerImpl$auth$2.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = authorizerImpl$auth$2.label;
        if (i != 0) {
        }
        emailLoginResponse = (EmailLoginResponse) obj2;
        if (!(emailLoginResponse instanceof EmailLoginResponse.Success)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object signUp(String str, String str2, Continuation<? super EmailLoginResponse<AuthResult>> continuation) {
        AuthorizerImpl$signUp$1 authorizerImpl$signUp$1;
        int i;
        AuthorizerImpl authorizerImpl;
        EmailLoginResponse emailLoginResponse;
        if (continuation instanceof AuthorizerImpl$signUp$1) {
            authorizerImpl$signUp$1 = (AuthorizerImpl$signUp$1) continuation;
            if ((authorizerImpl$signUp$1.label & Integer.MIN_VALUE) != 0) {
                authorizerImpl$signUp$1.label -= Integer.MIN_VALUE;
                Object obj = authorizerImpl$signUp$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = authorizerImpl$signUp$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    RegistrationApiDelegate registrationApiDelegate = this.registrationProcess;
                    authorizerImpl$signUp$1.L$0 = this;
                    authorizerImpl$signUp$1.L$1 = str;
                    authorizerImpl$signUp$1.label = 1;
                    obj = registrationApiDelegate.signUp(str, str2, authorizerImpl$signUp$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    authorizerImpl = this;
                } else if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                } else {
                    str = (String) authorizerImpl$signUp$1.L$1;
                    authorizerImpl = (AuthorizerImpl) authorizerImpl$signUp$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                emailLoginResponse = (EmailLoginResponse) obj;
                if (!(emailLoginResponse instanceof EmailLoginResponse.PasswordIsWrong)) {
                    return new EmailLoginResponse.Failure("Password is wrong");
                }
                if (!(emailLoginResponse instanceof EmailLoginResponse.Success)) {
                    return new EmailLoginResponse.Failure("Sign up is not succeed");
                }
                authorizerImpl$signUp$1.L$0 = null;
                authorizerImpl$signUp$1.L$1 = null;
                authorizerImpl$signUp$1.label = 2;
                obj = authorizerImpl.handleAuthJson((String) ((EmailLoginResponse.Success) emailLoginResponse).getData(), str, true, authorizerImpl$signUp$1);
                return obj == coroutine_suspended ? coroutine_suspended : obj;
            }
        }
        authorizerImpl$signUp$1 = new AuthorizerImpl$signUp$1(this, continuation);
        Object obj2 = authorizerImpl$signUp$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = authorizerImpl$signUp$1.label;
        if (i != 0) {
        }
        emailLoginResponse = (EmailLoginResponse) obj2;
        if (!(emailLoginResponse instanceof EmailLoginResponse.PasswordIsWrong)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object signIn(EmailLoginResponse.Success<String> success, String str, Continuation<? super EmailLoginResponse<AuthResult>> continuation) {
        return handleAuthJson(success.getData(), str, false, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleAuthJson(String str, String str2, boolean z, Continuation<? super EmailLoginResponse<AuthResult>> continuation) {
        AuthorizerImpl$handleAuthJson$1 authorizerImpl$handleAuthJson$1;
        int i;
        if (continuation instanceof AuthorizerImpl$handleAuthJson$1) {
            authorizerImpl$handleAuthJson$1 = (AuthorizerImpl$handleAuthJson$1) continuation;
            if ((authorizerImpl$handleAuthJson$1.label & Integer.MIN_VALUE) != 0) {
                authorizerImpl$handleAuthJson$1.label -= Integer.MIN_VALUE;
                Object obj = authorizerImpl$handleAuthJson$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = authorizerImpl$handleAuthJson$1.label;
                if (i == 0) {
                    if (i == 1) {
                        EmailLoginResponse emailLoginResponse = (EmailLoginResponse) authorizerImpl$handleAuthJson$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        return emailLoginResponse;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                String str3 = str;
                if (str3 == null || str3.length() == 0) {
                    return new EmailLoginResponse.Failure("Empty json");
                }
                EmailLoginResponse<AuthResult> tryParseJson = tryParseJson(str, z);
                if (tryParseJson instanceof EmailLoginResponse.Success) {
                    EmailLoginResponse.Success success = (EmailLoginResponse.Success) tryParseJson;
                    String userId = ((AuthResult) success.getData()).getUserId();
                    String token = ((AuthResult) success.getData()).getToken();
                    authorizerImpl$handleAuthJson$1.L$0 = tryParseJson;
                    authorizerImpl$handleAuthJson$1.label = 1;
                    return saveAuthData(userId, token, str2, authorizerImpl$handleAuthJson$1) == coroutine_suspended ? coroutine_suspended : tryParseJson;
                }
                return tryParseJson;
            }
        }
        authorizerImpl$handleAuthJson$1 = new AuthorizerImpl$handleAuthJson$1(this, continuation);
        Object obj2 = authorizerImpl$handleAuthJson$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = authorizerImpl$handleAuthJson$1.label;
        if (i == 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object saveAuthData(String str, String str2, String str3, Continuation<? super Unit> continuation) {
        AuthorizerImpl$saveAuthData$1 authorizerImpl$saveAuthData$1;
        int i;
        AuthorizerImpl authorizerImpl;
        String str4;
        UserToken userToken;
        Response response;
        AuthorizerImpl authorizerImpl2;
        if (continuation instanceof AuthorizerImpl$saveAuthData$1) {
            authorizerImpl$saveAuthData$1 = (AuthorizerImpl$saveAuthData$1) continuation;
            if ((authorizerImpl$saveAuthData$1.label & Integer.MIN_VALUE) != 0) {
                authorizerImpl$saveAuthData$1.label -= Integer.MIN_VALUE;
                Object obj = authorizerImpl$saveAuthData$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = authorizerImpl$saveAuthData$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    this.logger.setUserId(str);
                    UserToken userToken2 = new UserToken(str2);
                    RegistrationApiDelegate registrationApiDelegate = this.registrationProcess;
                    String formatted = userToken2.formatted();
                    authorizerImpl$saveAuthData$1.L$0 = this;
                    authorizerImpl$saveAuthData$1.L$1 = str;
                    authorizerImpl$saveAuthData$1.L$2 = str3;
                    authorizerImpl$saveAuthData$1.L$3 = userToken2;
                    authorizerImpl$saveAuthData$1.label = 1;
                    Object configs = registrationApiDelegate.getConfigs(formatted, authorizerImpl$saveAuthData$1);
                    if (configs == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    authorizerImpl = this;
                    str4 = str3;
                    userToken = userToken2;
                    obj = configs;
                } else if (i != 1) {
                    if (i == 2) {
                        authorizerImpl2 = (AuthorizerImpl) authorizerImpl$saveAuthData$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        authorizerImpl2.appInstallStorage.saveUserHasBeenAuthorized();
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    String str5 = (String) authorizerImpl$saveAuthData$1.L$2;
                    authorizerImpl = (AuthorizerImpl) authorizerImpl$saveAuthData$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    userToken = (UserToken) authorizerImpl$saveAuthData$1.L$3;
                    str = (String) authorizerImpl$saveAuthData$1.L$1;
                    str4 = str5;
                }
                response = (Response) obj;
                if (response instanceof Response.Success) {
                    Response.Success success = (Response.Success) response;
                    AuthData authData = new AuthData(new UserId(str), new ClientId(((Configs) success.getData()).getClientId()), userToken, new DbId(((Configs) success.getData()).getDbId()), str4);
                    AuthDataStorage authDataStorage = authorizerImpl.authDataStorage;
                    authorizerImpl$saveAuthData$1.L$0 = authorizerImpl;
                    authorizerImpl$saveAuthData$1.L$1 = null;
                    authorizerImpl$saveAuthData$1.L$2 = null;
                    authorizerImpl$saveAuthData$1.L$3 = null;
                    authorizerImpl$saveAuthData$1.label = 2;
                    if (authDataStorage.set(authData, authorizerImpl$saveAuthData$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    authorizerImpl2 = authorizerImpl;
                    authorizerImpl2.appInstallStorage.saveUserHasBeenAuthorized();
                }
                return Unit.INSTANCE;
            }
        }
        authorizerImpl$saveAuthData$1 = new AuthorizerImpl$saveAuthData$1(this, continuation);
        Object obj2 = authorizerImpl$saveAuthData$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = authorizerImpl$saveAuthData$1.label;
        if (i != 0) {
        }
        response = (Response) obj2;
        if (response instanceof Response.Success) {
        }
        return Unit.INSTANCE;
    }

    private final EmailLoginResponse<AuthResult> tryParseJson(String str, boolean z) {
        try {
            return parseJson(str, z);
        } catch (Exception unused) {
            return new EmailLoginResponse.Failure("Error while parsing response");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
        if ((r1 != null ? r1 instanceof java.lang.String : true) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        if ((r7 != null ? r7 instanceof java.lang.String : true) != false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final EmailLoginResponse<AuthResult> parseJson(String str, boolean z) {
        Object obj;
        Object obj2;
        JSONObject jSONObject = new JSONObject(str);
        Boolean bool = null;
        if (jSONObject.has("id")) {
            obj = jSONObject.get("id");
        }
        obj = null;
        String str2 = (String) obj;
        if (str2 == null) {
            return new EmailLoginResponse.Failure("No user id in response");
        }
        if (jSONObject.has("x-token")) {
            obj2 = jSONObject.get("x-token");
        }
        obj2 = null;
        String str3 = (String) obj2;
        if (str3 == null) {
            return new EmailLoginResponse.Failure("No token in response");
        }
        if (jSONObject.has("userCreated")) {
            Object obj3 = jSONObject.get("userCreated");
            if (obj3 != null ? obj3 instanceof Boolean : true) {
                bool = obj3;
            }
        }
        Boolean bool2 = bool;
        if (bool2 == null) {
            return new EmailLoginResponse.Failure("Unknown auth method");
        }
        return new EmailLoginResponse.Success(new AuthResult(str3, str2, bool2.booleanValue(), z));
    }
}
