package com.ifriend.data.authorization.confirmEmail;

import com.ifriend.domain.data.AuthDataStorage;
import com.ifriend.domain.data.authorization.confirmEmail.ConfirmEmailRepository;
import com.ifriend.domain.models.ConfirmEmailData;
import com.ifriend.domain.models.profile.user.AuthData;
import com.ifriend.domain.models.profile.user.UserToken;
import com.ifriend.domain.socket.notifications.ConfirmationEmailSentNotification;
import com.ifriend.domain.socket.notifications.EmailNotChangedNotification;
import com.ifriend.internal_notifications.handler.InternalNotificationHandler;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;
/* compiled from: ConfirmEmailRepositoryImpl.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/ifriend/data/authorization/confirmEmail/ConfirmEmailRepositoryImpl;", "Lcom/ifriend/domain/data/authorization/confirmEmail/ConfirmEmailRepository;", "confirmEmailApi", "Lcom/ifriend/data/authorization/confirmEmail/ConfirmEmailApi;", "authDataStorage", "Lcom/ifriend/domain/data/AuthDataStorage;", "internalNotificationHandler", "Lcom/ifriend/internal_notifications/handler/InternalNotificationHandler;", "(Lcom/ifriend/data/authorization/confirmEmail/ConfirmEmailApi;Lcom/ifriend/domain/data/AuthDataStorage;Lcom/ifriend/internal_notifications/handler/InternalNotificationHandler;)V", "confirm", "", "confirmEmailData", "Lcom/ifriend/domain/models/ConfirmEmailData;", "(Lcom/ifriend/domain/models/ConfirmEmailData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendEmail", "email", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showEmailSentNotificationIfRequired", "isSuccessful", "", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ConfirmEmailRepositoryImpl implements ConfirmEmailRepository {
    private final AuthDataStorage authDataStorage;
    private final ConfirmEmailApi confirmEmailApi;
    private final InternalNotificationHandler internalNotificationHandler;

    public ConfirmEmailRepositoryImpl(ConfirmEmailApi confirmEmailApi, AuthDataStorage authDataStorage, InternalNotificationHandler internalNotificationHandler) {
        Intrinsics.checkNotNullParameter(confirmEmailApi, "confirmEmailApi");
        Intrinsics.checkNotNullParameter(authDataStorage, "authDataStorage");
        Intrinsics.checkNotNullParameter(internalNotificationHandler, "internalNotificationHandler");
        this.confirmEmailApi = confirmEmailApi;
        this.authDataStorage = authDataStorage;
        this.internalNotificationHandler = internalNotificationHandler;
    }

    @Override // com.ifriend.domain.data.authorization.confirmEmail.ConfirmEmailRepository
    public Object confirm(ConfirmEmailData confirmEmailData, Continuation<? super Unit> continuation) {
        Object confirmEmail = this.confirmEmailApi.confirmEmail(new UserToken(confirmEmailData.getAuth()).formatted(), confirmEmailData.getToken(), continuation);
        return confirmEmail == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? confirmEmail : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0143 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015a  */
    @Override // com.ifriend.domain.data.authorization.confirmEmail.ConfirmEmailRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendEmail(String str, Continuation<? super Unit> continuation) {
        ConfirmEmailRepositoryImpl$sendEmail$1 confirmEmailRepositoryImpl$sendEmail$1;
        int i;
        String str2;
        ConfirmEmailRepositoryImpl confirmEmailRepositoryImpl;
        AuthData authData;
        String str3;
        ConfirmEmailRepositoryImpl confirmEmailRepositoryImpl2;
        AuthData authData2;
        String str4;
        String str5;
        AuthData authData3;
        ConfirmEmailRepositoryImpl confirmEmailRepositoryImpl3;
        String str6;
        String str7;
        ConfirmEmailRepositoryImpl confirmEmailRepositoryImpl4;
        Response response;
        ConfirmEmailRepositoryImpl confirmEmailRepositoryImpl5;
        if (continuation instanceof ConfirmEmailRepositoryImpl$sendEmail$1) {
            confirmEmailRepositoryImpl$sendEmail$1 = (ConfirmEmailRepositoryImpl$sendEmail$1) continuation;
            if ((confirmEmailRepositoryImpl$sendEmail$1.label & Integer.MIN_VALUE) != 0) {
                confirmEmailRepositoryImpl$sendEmail$1.label -= Integer.MIN_VALUE;
                Object obj = confirmEmailRepositoryImpl$sendEmail$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = confirmEmailRepositoryImpl$sendEmail$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    AuthDataStorage authDataStorage = this.authDataStorage;
                    confirmEmailRepositoryImpl$sendEmail$1.L$0 = this;
                    str2 = str;
                    confirmEmailRepositoryImpl$sendEmail$1.L$1 = str2;
                    confirmEmailRepositoryImpl$sendEmail$1.label = 1;
                    obj = authDataStorage.lastAuthData(confirmEmailRepositoryImpl$sendEmail$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    confirmEmailRepositoryImpl = this;
                } else if (i != 1) {
                    if (i == 2) {
                        authData3 = (AuthData) confirmEmailRepositoryImpl$sendEmail$1.L$1;
                        confirmEmailRepositoryImpl3 = (ConfirmEmailRepositoryImpl) confirmEmailRepositoryImpl$sendEmail$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        confirmEmailRepositoryImpl3.showEmailSentNotificationIfRequired(((Response) obj).isSuccessful(), authData3.getEmail());
                        return Unit.INSTANCE;
                    } else if (i == 3) {
                        str5 = (String) confirmEmailRepositoryImpl$sendEmail$1.L$4;
                        str3 = (String) confirmEmailRepositoryImpl$sendEmail$1.L$3;
                        str4 = (String) confirmEmailRepositoryImpl$sendEmail$1.L$1;
                        confirmEmailRepositoryImpl2 = (ConfirmEmailRepositoryImpl) confirmEmailRepositoryImpl$sendEmail$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        authData2 = (AuthData) confirmEmailRepositoryImpl$sendEmail$1.L$2;
                        ConfirmEmailApi confirmEmailApi = confirmEmailRepositoryImpl2.confirmEmailApi;
                        SendConfirmEmailRequest sendConfirmEmailRequest = new SendConfirmEmailRequest(str4);
                        confirmEmailRepositoryImpl$sendEmail$1.L$0 = confirmEmailRepositoryImpl2;
                        confirmEmailRepositoryImpl$sendEmail$1.L$1 = str4;
                        confirmEmailRepositoryImpl$sendEmail$1.L$2 = authData2;
                        confirmEmailRepositoryImpl$sendEmail$1.L$3 = str5;
                        confirmEmailRepositoryImpl$sendEmail$1.L$4 = null;
                        confirmEmailRepositoryImpl$sendEmail$1.label = 4;
                        obj = confirmEmailApi.sendConfirmEmail(str3, sendConfirmEmailRequest, confirmEmailRepositoryImpl$sendEmail$1);
                        if (obj != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str6 = str5;
                        str7 = str4;
                        confirmEmailRepositoryImpl4 = confirmEmailRepositoryImpl2;
                        AuthData authData4 = authData2;
                        response = (Response) obj;
                        confirmEmailRepositoryImpl4.showEmailSentNotificationIfRequired(response.isSuccessful(), str7);
                        if (!response.isSuccessful()) {
                        }
                        return Unit.INSTANCE;
                    } else if (i != 4) {
                        if (i == 5) {
                            Object obj2 = confirmEmailRepositoryImpl$sendEmail$1.L$1;
                            confirmEmailRepositoryImpl5 = (ConfirmEmailRepositoryImpl) confirmEmailRepositoryImpl$sendEmail$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            confirmEmailRepositoryImpl5.internalNotificationHandler.handle(EmailNotChangedNotification.INSTANCE);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        authData2 = (AuthData) confirmEmailRepositoryImpl$sendEmail$1.L$2;
                        str7 = (String) confirmEmailRepositoryImpl$sendEmail$1.L$1;
                        confirmEmailRepositoryImpl4 = (ConfirmEmailRepositoryImpl) confirmEmailRepositoryImpl$sendEmail$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        str6 = (String) confirmEmailRepositoryImpl$sendEmail$1.L$3;
                        AuthData authData42 = authData2;
                        response = (Response) obj;
                        confirmEmailRepositoryImpl4.showEmailSentNotificationIfRequired(response.isSuccessful(), str7);
                        if (!response.isSuccessful()) {
                            AuthDataStorage authDataStorage2 = confirmEmailRepositoryImpl4.authDataStorage;
                            AuthData copy$default = AuthData.copy$default(authData42, null, null, null, null, str6, 15, null);
                            confirmEmailRepositoryImpl$sendEmail$1.L$0 = confirmEmailRepositoryImpl4;
                            confirmEmailRepositoryImpl$sendEmail$1.L$1 = obj;
                            confirmEmailRepositoryImpl$sendEmail$1.L$2 = null;
                            confirmEmailRepositoryImpl$sendEmail$1.L$3 = null;
                            confirmEmailRepositoryImpl$sendEmail$1.label = 5;
                            if (authDataStorage2.set(copy$default, confirmEmailRepositoryImpl$sendEmail$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            confirmEmailRepositoryImpl5 = confirmEmailRepositoryImpl4;
                            confirmEmailRepositoryImpl5.internalNotificationHandler.handle(EmailNotChangedNotification.INSTANCE);
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    str2 = (String) confirmEmailRepositoryImpl$sendEmail$1.L$1;
                    confirmEmailRepositoryImpl = (ConfirmEmailRepositoryImpl) confirmEmailRepositoryImpl$sendEmail$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                authData = (AuthData) obj;
                if (authData != null) {
                    return Unit.INSTANCE;
                }
                String formatted = authData.getToken().formatted();
                String value = authData.getUserId().getValue();
                if (Intrinsics.areEqual(str2, "")) {
                    ConfirmEmailApi confirmEmailApi2 = confirmEmailRepositoryImpl.confirmEmailApi;
                    ResendConfirmEmailRequest resendConfirmEmailRequest = new ResendConfirmEmailRequest("email-confirmation");
                    confirmEmailRepositoryImpl$sendEmail$1.L$0 = confirmEmailRepositoryImpl;
                    confirmEmailRepositoryImpl$sendEmail$1.L$1 = authData;
                    confirmEmailRepositoryImpl$sendEmail$1.label = 2;
                    Object resendConfirmEmail = confirmEmailApi2.resendConfirmEmail(formatted, value, resendConfirmEmailRequest, confirmEmailRepositoryImpl$sendEmail$1);
                    if (resendConfirmEmail == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    authData3 = authData;
                    obj = resendConfirmEmail;
                    confirmEmailRepositoryImpl3 = confirmEmailRepositoryImpl;
                    confirmEmailRepositoryImpl3.showEmailSentNotificationIfRequired(((Response) obj).isSuccessful(), authData3.getEmail());
                    return Unit.INSTANCE;
                }
                String email = authData.getEmail();
                AuthDataStorage authDataStorage3 = confirmEmailRepositoryImpl.authDataStorage;
                AuthData copy$default2 = AuthData.copy$default(authData, null, null, null, null, str2, 15, null);
                confirmEmailRepositoryImpl$sendEmail$1.L$0 = confirmEmailRepositoryImpl;
                confirmEmailRepositoryImpl$sendEmail$1.L$1 = str2;
                confirmEmailRepositoryImpl$sendEmail$1.L$2 = authData;
                confirmEmailRepositoryImpl$sendEmail$1.L$3 = formatted;
                confirmEmailRepositoryImpl$sendEmail$1.L$4 = email;
                confirmEmailRepositoryImpl$sendEmail$1.label = 3;
                if (authDataStorage3.set(copy$default2, confirmEmailRepositoryImpl$sendEmail$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str3 = formatted;
                confirmEmailRepositoryImpl2 = confirmEmailRepositoryImpl;
                authData2 = authData;
                str4 = str2;
                str5 = email;
                ConfirmEmailApi confirmEmailApi3 = confirmEmailRepositoryImpl2.confirmEmailApi;
                SendConfirmEmailRequest sendConfirmEmailRequest2 = new SendConfirmEmailRequest(str4);
                confirmEmailRepositoryImpl$sendEmail$1.L$0 = confirmEmailRepositoryImpl2;
                confirmEmailRepositoryImpl$sendEmail$1.L$1 = str4;
                confirmEmailRepositoryImpl$sendEmail$1.L$2 = authData2;
                confirmEmailRepositoryImpl$sendEmail$1.L$3 = str5;
                confirmEmailRepositoryImpl$sendEmail$1.L$4 = null;
                confirmEmailRepositoryImpl$sendEmail$1.label = 4;
                obj = confirmEmailApi3.sendConfirmEmail(str3, sendConfirmEmailRequest2, confirmEmailRepositoryImpl$sendEmail$1);
                if (obj != coroutine_suspended) {
                }
            }
        }
        confirmEmailRepositoryImpl$sendEmail$1 = new ConfirmEmailRepositoryImpl$sendEmail$1(this, continuation);
        Object obj3 = confirmEmailRepositoryImpl$sendEmail$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = confirmEmailRepositoryImpl$sendEmail$1.label;
        if (i != 0) {
        }
        authData = (AuthData) obj3;
        if (authData != null) {
        }
    }

    private final void showEmailSentNotificationIfRequired(boolean z, String str) {
        if (z) {
            this.internalNotificationHandler.handle(new ConfirmationEmailSentNotification(str));
        }
    }
}
