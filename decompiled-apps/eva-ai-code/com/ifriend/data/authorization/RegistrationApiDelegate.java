package com.ifriend.data.authorization;

import com.ifriend.common_utils.Logger;
import com.ifriend.data.networking.api.RegistrationApi;
import com.ifriend.data.networking.responses.ConfigurationFriendResponse;
import com.ifriend.data.networking.responses.ConfigurationResponse;
import com.ifriend.data.networking.responses.EmailRegistrationRequest;
import com.ifriend.data.networking.responses.EmailRegistrationResponse;
import com.ifriend.data.socket.common.SocketMessageKeys;
import com.ifriend.domain.models.Response;
import com.ifriend.domain.models.authorization.EmailLoginResponse;
import com.ifriend.domain.models.authorization.SignInResponse;
import com.ifriend.domain.models.authorization.TokenLoginResponse;
import java.net.SocketTimeoutException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.json.JSONObject;
import retrofit2.Response;
/* compiled from: RegistrationApiDelegate.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\fJ!\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\fJ)\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u000e2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/ifriend/data/authorization/RegistrationApiDelegate;", "", "registrationApi", "Lcom/ifriend/data/networking/api/RegistrationApi;", "logger", "Lcom/ifriend/common_utils/Logger;", "(Lcom/ifriend/data/networking/api/RegistrationApi;Lcom/ifriend/common_utils/Logger;)V", "getConfigs", "Lcom/ifriend/domain/models/Response;", "Lcom/ifriend/data/authorization/Configs;", "accessToken", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signIn", "Lcom/ifriend/domain/models/authorization/EmailLoginResponse;", "authHeader", "signInWithToken", "Lcom/ifriend/domain/models/authorization/TokenLoginResponse;", "token", "signUp", "email", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "RegistrationWithEmailAndPass400Exception", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RegistrationApiDelegate {
    private final Logger logger;
    private final RegistrationApi registrationApi;

    public RegistrationApiDelegate(RegistrationApi registrationApi, Logger logger) {
        Intrinsics.checkNotNullParameter(registrationApi, "registrationApi");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.registrationApi = registrationApi;
        this.logger = logger;
    }

    /* compiled from: RegistrationApiDelegate.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/ifriend/data/authorization/RegistrationApiDelegate$RegistrationWithEmailAndPass400Exception;", "Ljava/lang/Exception;", "email", "", "password", "(Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getPassword", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class RegistrationWithEmailAndPass400Exception extends Exception {
        private final String email;
        private final String password;

        public final String getEmail() {
            return this.email;
        }

        public final String getPassword() {
            return this.password;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public RegistrationWithEmailAndPass400Exception(String email, String password) {
            super("Registration with email (" + email + ") and password with length " + r0 + " failed with 400");
            Intrinsics.checkNotNullParameter(email, "email");
            Intrinsics.checkNotNullParameter(password, "password");
            int length = password.length();
            this.email = email;
            this.password = password;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0103 A[Catch: Exception -> 0x011c, SocketTimeoutException -> 0x0124, TryCatch #2 {SocketTimeoutException -> 0x0124, Exception -> 0x011c, blocks: (B:12:0x003b, B:21:0x0061, B:25:0x0070, B:27:0x0078, B:28:0x0084, B:30:0x008c, B:32:0x0092, B:34:0x009b, B:36:0x00a7, B:37:0x00af, B:39:0x00b6, B:40:0x00d7, B:41:0x00e9, B:43:0x0103, B:44:0x0107, B:17:0x004a), top: B:50:0x002a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object signUp(String str, String str2, Continuation<? super EmailLoginResponse<String>> continuation) {
        RegistrationApiDelegate$signUp$1 registrationApiDelegate$signUp$1;
        int i;
        RegistrationApiDelegate registrationApiDelegate;
        Response response;
        int code;
        try {
            if (continuation instanceof RegistrationApiDelegate$signUp$1) {
                registrationApiDelegate$signUp$1 = (RegistrationApiDelegate$signUp$1) continuation;
                if ((registrationApiDelegate$signUp$1.label & Integer.MIN_VALUE) != 0) {
                    registrationApiDelegate$signUp$1.label -= Integer.MIN_VALUE;
                    Object obj = registrationApiDelegate$signUp$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = registrationApiDelegate$signUp$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        RegistrationApi registrationApi = this.registrationApi;
                        EmailRegistrationRequest emailRegistrationRequest = new EmailRegistrationRequest(str, str2);
                        registrationApiDelegate$signUp$1.L$0 = this;
                        registrationApiDelegate$signUp$1.L$1 = str;
                        registrationApiDelegate$signUp$1.L$2 = str2;
                        registrationApiDelegate$signUp$1.label = 1;
                        obj = registrationApi.emailRegistration(emailRegistrationRequest, registrationApiDelegate$signUp$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        registrationApiDelegate = this;
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        str2 = (String) registrationApiDelegate$signUp$1.L$2;
                        str = (String) registrationApiDelegate$signUp$1.L$1;
                        registrationApiDelegate = (RegistrationApiDelegate) registrationApiDelegate$signUp$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    response = (Response) obj;
                    code = response.code();
                    if (code != 200 || code == 201) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("x-token", response.headers().get("x-token"));
                        EmailRegistrationResponse emailRegistrationResponse = (EmailRegistrationResponse) response.body();
                        jSONObject.put("id", emailRegistrationResponse != null ? emailRegistrationResponse.getId() : null);
                        jSONObject.put("userCreated", true);
                        return new EmailLoginResponse.Success(jSONObject.toString());
                    }
                    if (response.code() == 400) {
                        registrationApiDelegate.logger.logException(new RegistrationWithEmailAndPass400Exception(str, str2));
                    }
                    ResponseBody errorBody = response.errorBody();
                    JSONObject jSONObject2 = new JSONObject(errorBody != null ? errorBody.string() : null);
                    if (jSONObject2.has("desc") && Intrinsics.areEqual(jSONObject2.getString("desc"), "already supplied")) {
                        return new EmailLoginResponse.PasswordIsWrong();
                    }
                    if (jSONObject2.has(SocketMessageKeys.DETAILS_KEY)) {
                        String string = jSONObject2.getString(SocketMessageKeys.DETAILS_KEY);
                        Logger.DefaultImpls.error$default(registrationApiDelegate.logger, "RegistrationApiDelegate: " + string, null, 2, null);
                        Intrinsics.checkNotNull(string);
                        return new EmailLoginResponse.Failure(string);
                    }
                    Logger.DefaultImpls.error$default(registrationApiDelegate.logger, "RegistrationApiDelegate: Сan not get error details from response.", null, 2, null);
                    return new EmailLoginResponse.Failure("Сan not get error details from response.");
                }
            }
            if (i != 0) {
            }
            response = (Response) obj;
            code = response.code();
            if (code != 200) {
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("x-token", response.headers().get("x-token"));
            EmailRegistrationResponse emailRegistrationResponse2 = (EmailRegistrationResponse) response.body();
            jSONObject3.put("id", emailRegistrationResponse2 != null ? emailRegistrationResponse2.getId() : null);
            jSONObject3.put("userCreated", true);
            return new EmailLoginResponse.Success(jSONObject3.toString());
        } catch (SocketTimeoutException unused) {
            return new EmailLoginResponse.Failure("Timeout Exception");
        } catch (Exception unused2) {
            return new EmailLoginResponse.Failure("Exception");
        }
        registrationApiDelegate$signUp$1 = new RegistrationApiDelegate$signUp$1(this, continuation);
        Object obj2 = registrationApiDelegate$signUp$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = registrationApiDelegate$signUp$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c A[Catch: Exception -> 0x00a8, SocketTimeoutException -> 0x00b0, TryCatch #2 {SocketTimeoutException -> 0x00b0, Exception -> 0x00a8, blocks: (B:11:0x0028, B:19:0x0042, B:21:0x004c, B:22:0x0054, B:24:0x005c, B:26:0x0076, B:28:0x007c, B:29:0x0092, B:31:0x009a, B:34:0x00a2, B:16:0x0037), top: B:40:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054 A[Catch: Exception -> 0x00a8, SocketTimeoutException -> 0x00b0, TryCatch #2 {SocketTimeoutException -> 0x00b0, Exception -> 0x00a8, blocks: (B:11:0x0028, B:19:0x0042, B:21:0x004c, B:22:0x0054, B:24:0x005c, B:26:0x0076, B:28:0x007c, B:29:0x0092, B:31:0x009a, B:34:0x00a2, B:16:0x0037), top: B:40:0x0024 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object signIn(String str, Continuation<? super EmailLoginResponse<String>> continuation) {
        RegistrationApiDelegate$signIn$1 registrationApiDelegate$signIn$1;
        int i;
        Response response;
        try {
            if (continuation instanceof RegistrationApiDelegate$signIn$1) {
                registrationApiDelegate$signIn$1 = (RegistrationApiDelegate$signIn$1) continuation;
                if ((registrationApiDelegate$signIn$1.label & Integer.MIN_VALUE) != 0) {
                    registrationApiDelegate$signIn$1.label -= Integer.MIN_VALUE;
                    Object obj = registrationApiDelegate$signIn$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = registrationApiDelegate$signIn$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        RegistrationApi registrationApi = this.registrationApi;
                        registrationApiDelegate$signIn$1.label = 1;
                        obj = registrationApi.signIn(str, registrationApiDelegate$signIn$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ResultKt.throwOnFailure(obj);
                    }
                    response = (Response) obj;
                    if (response.code() != 401) {
                        return new EmailLoginResponse.EmailNotRegistered();
                    }
                    if (response.code() == 200) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("x-token", response.headers().get("x-token"));
                        SignInResponse signInResponse = (SignInResponse) response.body();
                        jSONObject.put("id", signInResponse != null ? signInResponse.getId() : null);
                        jSONObject.put("userCreated", false);
                        return new EmailLoginResponse.Success(jSONObject.toString());
                    }
                    ResponseBody errorBody = response.errorBody();
                    return new EmailLoginResponse.Failure((errorBody == null || (r7 = errorBody.string()) == null) ? "Сan not get error details from response." : "Сan not get error details from response.");
                }
            }
            if (i != 0) {
            }
            response = (Response) obj;
            if (response.code() != 401) {
            }
        } catch (SocketTimeoutException unused) {
            return new EmailLoginResponse.Failure("Timeout Exception");
        } catch (Exception unused2) {
            return new EmailLoginResponse.Failure("Exception");
        }
        registrationApiDelegate$signIn$1 = new RegistrationApiDelegate$signIn$1(this, continuation);
        Object obj2 = registrationApiDelegate$signIn$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = registrationApiDelegate$signIn$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077 A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:12:0x002c, B:23:0x005c, B:25:0x0066, B:28:0x006f, B:30:0x0077, B:32:0x007a, B:33:0x0082), top: B:39:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:12:0x002c, B:23:0x005c, B:25:0x0066, B:28:0x006f, B:30:0x0077, B:32:0x007a, B:33:0x0082), top: B:39:0x002c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object signInWithToken(String str, Continuation<? super TokenLoginResponse> continuation) {
        RegistrationApiDelegate$signInWithToken$1 registrationApiDelegate$signInWithToken$1;
        int i;
        RegistrationApiDelegate registrationApiDelegate;
        Response response;
        if (continuation instanceof RegistrationApiDelegate$signInWithToken$1) {
            registrationApiDelegate$signInWithToken$1 = (RegistrationApiDelegate$signInWithToken$1) continuation;
            if ((registrationApiDelegate$signInWithToken$1.label & Integer.MIN_VALUE) != 0) {
                registrationApiDelegate$signInWithToken$1.label -= Integer.MIN_VALUE;
                Object obj = registrationApiDelegate$signInWithToken$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = registrationApiDelegate$signInWithToken$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        registrationApiDelegate$signInWithToken$1.L$0 = this;
                        registrationApiDelegate$signInWithToken$1.label = 1;
                        obj = this.registrationApi.signIn("Token token=\"" + str + "\"", registrationApiDelegate$signInWithToken$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Exception e) {
                        e = e;
                        registrationApiDelegate = this;
                        e.printStackTrace();
                        registrationApiDelegate.logger.logException(e);
                        return TokenLoginResponse.Failure.INSTANCE;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    registrationApiDelegate = (RegistrationApiDelegate) registrationApiDelegate$signInWithToken$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Exception e2) {
                        e = e2;
                        e.printStackTrace();
                        registrationApiDelegate.logger.logException(e);
                        return TokenLoginResponse.Failure.INSTANCE;
                    }
                }
                response = (Response) obj;
                if (response.code() != 401 && response.code() != 403) {
                    SignInResponse signInResponse = (SignInResponse) response.body();
                    return signInResponse != null ? TokenLoginResponse.Failure.INSTANCE : new TokenLoginResponse.Success(signInResponse);
                }
                return TokenLoginResponse.TokenIsNotValid.INSTANCE;
            }
        }
        registrationApiDelegate$signInWithToken$1 = new RegistrationApiDelegate$signInWithToken$1(this, continuation);
        Object obj2 = registrationApiDelegate$signInWithToken$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = registrationApiDelegate$signInWithToken$1.label;
        if (i != 0) {
        }
        response = (Response) obj2;
        if (response.code() != 401) {
            SignInResponse signInResponse2 = (SignInResponse) response.body();
            if (signInResponse2 != null) {
            }
        }
        return TokenLoginResponse.TokenIsNotValid.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a A[Catch: Exception -> 0x0093, SocketTimeoutException -> 0x009e, TryCatch #2 {SocketTimeoutException -> 0x009e, Exception -> 0x0093, blocks: (B:11:0x0026, B:19:0x0040, B:21:0x004a, B:23:0x0053, B:25:0x0059, B:27:0x005f, B:29:0x0065, B:31:0x006b, B:32:0x006f, B:33:0x007c, B:35:0x0084, B:38:0x008c, B:16:0x0035), top: B:43:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c A[Catch: Exception -> 0x0093, SocketTimeoutException -> 0x009e, TryCatch #2 {SocketTimeoutException -> 0x009e, Exception -> 0x0093, blocks: (B:11:0x0026, B:19:0x0040, B:21:0x004a, B:23:0x0053, B:25:0x0059, B:27:0x005f, B:29:0x0065, B:31:0x006b, B:32:0x006f, B:33:0x007c, B:35:0x0084, B:38:0x008c, B:16:0x0035), top: B:43:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getConfigs(String str, Continuation<? super com.ifriend.domain.models.Response<Configs>> continuation) {
        RegistrationApiDelegate$getConfigs$1 registrationApiDelegate$getConfigs$1;
        int i;
        Response response;
        try {
            if (continuation instanceof RegistrationApiDelegate$getConfigs$1) {
                registrationApiDelegate$getConfigs$1 = (RegistrationApiDelegate$getConfigs$1) continuation;
                if ((registrationApiDelegate$getConfigs$1.label & Integer.MIN_VALUE) != 0) {
                    registrationApiDelegate$getConfigs$1.label -= Integer.MIN_VALUE;
                    Object obj = registrationApiDelegate$getConfigs$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = registrationApiDelegate$getConfigs$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        RegistrationApi registrationApi = this.registrationApi;
                        registrationApiDelegate$getConfigs$1.label = 1;
                        obj = registrationApi.getConfiguration(str, registrationApiDelegate$getConfigs$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ResultKt.throwOnFailure(obj);
                    }
                    response = (Response) obj;
                    if (response.code() != 200) {
                        ConfigurationResponse configurationResponse = (ConfigurationResponse) response.body();
                        ConfigurationFriendResponse friend = configurationResponse != null ? configurationResponse.getFriend() : null;
                        return new Response.Success(new Configs(String.valueOf(friend != null ? friend.getDbId() : null), String.valueOf(friend != null ? friend.getClientId() : null)));
                    }
                    ResponseBody errorBody = response.errorBody();
                    return new Response.Failure((errorBody == null || (r6 = errorBody.string()) == null) ? "Сan not get error details from response." : "Сan not get error details from response.");
                }
            }
            if (i != 0) {
            }
            response = (retrofit2.Response) obj;
            if (response.code() != 200) {
            }
        } catch (SocketTimeoutException unused) {
            return new Response.Failure("Timeout Exception");
        } catch (Exception unused2) {
            return new Response.Failure("Exception");
        }
        registrationApiDelegate$getConfigs$1 = new RegistrationApiDelegate$getConfigs$1(this, continuation);
        Object obj2 = registrationApiDelegate$getConfigs$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = registrationApiDelegate$getConfigs$1.label;
    }
}
