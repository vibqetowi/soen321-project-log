package com.ifriend.registration.domain.useCase.email;

import com.facebook.internal.security.CertificateUtil;
import com.ifriend.analytics.usecase.auth.AnalyticsSetUserIdUseCase;
import com.ifriend.analytics.usecase.auth.UserAuthorizedAnalyticsSender;
import com.ifriend.common_utils.encoder.Base64Encoder;
import com.ifriend.domain.authorization.Authorizer;
import com.ifriend.domain.logic.onboarding.UpdateOnboardingUseCase;
import com.ifriend.domain.models.authorization.AuthResult;
import com.ifriend.domain.models.authorization.EmailLoginResponse;
import com.ifriend.domain.services.initialData.InitialDataLoader;
import com.ifriend.domain.validation.EmailValidator;
import com.ifriend.domain.validation.EmailValidatorKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: SignUpEmailUseCase.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ'\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0015R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/ifriend/registration/domain/useCase/email/SignUpEmailUseCase;", "", "authorizer", "Lcom/ifriend/domain/authorization/Authorizer;", "userAuthorizedAnalyticsSender", "Lcom/ifriend/analytics/usecase/auth/UserAuthorizedAnalyticsSender;", "analyticsSetUserIdUseCase", "Lcom/ifriend/analytics/usecase/auth/AnalyticsSetUserIdUseCase;", "initialDataLoader", "Lcom/ifriend/domain/services/initialData/InitialDataLoader;", "emailValidator", "Lcom/ifriend/domain/validation/EmailValidator;", "updateOnboardingUseCase", "Lcom/ifriend/domain/logic/onboarding/UpdateOnboardingUseCase;", "(Lcom/ifriend/domain/authorization/Authorizer;Lcom/ifriend/analytics/usecase/auth/UserAuthorizedAnalyticsSender;Lcom/ifriend/analytics/usecase/auth/AnalyticsSetUserIdUseCase;Lcom/ifriend/domain/services/initialData/InitialDataLoader;Lcom/ifriend/domain/validation/EmailValidator;Lcom/ifriend/domain/logic/onboarding/UpdateOnboardingUseCase;)V", "signUp", "Lcom/ifriend/domain/models/authorization/EmailLoginResponse;", "Lcom/ifriend/domain/models/authorization/AuthResult;", "email", "", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SignUpEmailUseCase {
    private final AnalyticsSetUserIdUseCase analyticsSetUserIdUseCase;
    private final Authorizer authorizer;
    private final EmailValidator emailValidator;
    private final InitialDataLoader initialDataLoader;
    private final UpdateOnboardingUseCase updateOnboardingUseCase;
    private final UserAuthorizedAnalyticsSender userAuthorizedAnalyticsSender;

    public SignUpEmailUseCase(Authorizer authorizer, UserAuthorizedAnalyticsSender userAuthorizedAnalyticsSender, AnalyticsSetUserIdUseCase analyticsSetUserIdUseCase, InitialDataLoader initialDataLoader, EmailValidator emailValidator, UpdateOnboardingUseCase updateOnboardingUseCase) {
        Intrinsics.checkNotNullParameter(authorizer, "authorizer");
        Intrinsics.checkNotNullParameter(userAuthorizedAnalyticsSender, "userAuthorizedAnalyticsSender");
        Intrinsics.checkNotNullParameter(analyticsSetUserIdUseCase, "analyticsSetUserIdUseCase");
        Intrinsics.checkNotNullParameter(initialDataLoader, "initialDataLoader");
        Intrinsics.checkNotNullParameter(emailValidator, "emailValidator");
        Intrinsics.checkNotNullParameter(updateOnboardingUseCase, "updateOnboardingUseCase");
        this.authorizer = authorizer;
        this.userAuthorizedAnalyticsSender = userAuthorizedAnalyticsSender;
        this.analyticsSetUserIdUseCase = analyticsSetUserIdUseCase;
        this.initialDataLoader = initialDataLoader;
        this.emailValidator = emailValidator;
        this.updateOnboardingUseCase = updateOnboardingUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object signUp(String str, String str2, Continuation<? super EmailLoginResponse<AuthResult>> continuation) {
        SignUpEmailUseCase$signUp$1 signUpEmailUseCase$signUp$1;
        Object obj;
        int i;
        SignUpEmailUseCase signUpEmailUseCase;
        String str3;
        String str4;
        SignUpEmailUseCase signUpEmailUseCase2;
        EmailLoginResponse emailLoginResponse;
        EmailLoginResponse emailLoginResponse2;
        Object mo6875invokegIAlus;
        if (continuation instanceof SignUpEmailUseCase$signUp$1) {
            signUpEmailUseCase$signUp$1 = (SignUpEmailUseCase$signUp$1) continuation;
            if ((signUpEmailUseCase$signUp$1.label & Integer.MIN_VALUE) != 0) {
                signUpEmailUseCase$signUp$1.label -= Integer.MIN_VALUE;
                obj = signUpEmailUseCase$signUp$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = signUpEmailUseCase$signUp$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    String encode = Base64Encoder.INSTANCE.encode(str + CertificateUtil.DELIMITER + str2);
                    StringBuilder sb = new StringBuilder("Basic ");
                    sb.append(encode);
                    String sb2 = sb.toString();
                    EmailValidator emailValidator = this.emailValidator;
                    signUpEmailUseCase$signUp$1.L$0 = this;
                    signUpEmailUseCase$signUp$1.L$1 = str;
                    signUpEmailUseCase$signUp$1.L$2 = str2;
                    signUpEmailUseCase$signUp$1.L$3 = sb2;
                    signUpEmailUseCase$signUp$1.label = 1;
                    Object isNotValid = EmailValidatorKt.isNotValid(emailValidator, str, signUpEmailUseCase$signUp$1);
                    if (isNotValid == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    signUpEmailUseCase = this;
                    str3 = str;
                    str4 = sb2;
                    obj = isNotValid;
                } else if (i == 1) {
                    str4 = (String) signUpEmailUseCase$signUp$1.L$3;
                    str2 = (String) signUpEmailUseCase$signUp$1.L$2;
                    str3 = (String) signUpEmailUseCase$signUp$1.L$1;
                    signUpEmailUseCase = (SignUpEmailUseCase) signUpEmailUseCase$signUp$1.L$0;
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    signUpEmailUseCase2 = (SignUpEmailUseCase) signUpEmailUseCase$signUp$1.L$0;
                    emailLoginResponse = (EmailLoginResponse) obj;
                    if (emailLoginResponse instanceof EmailLoginResponse.Success) {
                        return emailLoginResponse;
                    }
                    EmailLoginResponse.Success success = (EmailLoginResponse.Success) emailLoginResponse;
                    signUpEmailUseCase2.analyticsSetUserIdUseCase.setUserId(((AuthResult) success.getData()).getUserId());
                    signUpEmailUseCase2.userAuthorizedAnalyticsSender.send(((AuthResult) success.getData()).getUserCreated(), UserAuthorizedAnalyticsSender.Method.EMAIL);
                    InitialDataLoader initialDataLoader = signUpEmailUseCase2.initialDataLoader;
                    signUpEmailUseCase$signUp$1.L$0 = signUpEmailUseCase2;
                    signUpEmailUseCase$signUp$1.L$1 = emailLoginResponse;
                    signUpEmailUseCase$signUp$1.label = 3;
                    Object load = initialDataLoader.load(signUpEmailUseCase$signUp$1);
                    if (load == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = load;
                    emailLoginResponse2 = emailLoginResponse;
                    if (((Boolean) obj).booleanValue()) {
                    }
                } else if (i != 3) {
                    if (i == 4) {
                        emailLoginResponse2 = (EmailLoginResponse) signUpEmailUseCase$signUp$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        mo6875invokegIAlus = ((Result) obj).m7280unboximpl();
                        return !Result.m7277isFailureimpl(mo6875invokegIAlus) ? new EmailLoginResponse.Failure("Email signUp. Update onboarding") : emailLoginResponse2;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    emailLoginResponse2 = (EmailLoginResponse) signUpEmailUseCase$signUp$1.L$1;
                    signUpEmailUseCase2 = (SignUpEmailUseCase) signUpEmailUseCase$signUp$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    if (((Boolean) obj).booleanValue()) {
                        return new EmailLoginResponse.Failure("Email signUp failed. Initial data not load");
                    }
                    UpdateOnboardingUseCase updateOnboardingUseCase = signUpEmailUseCase2.updateOnboardingUseCase;
                    Unit unit = Unit.INSTANCE;
                    signUpEmailUseCase$signUp$1.L$0 = emailLoginResponse2;
                    signUpEmailUseCase$signUp$1.L$1 = null;
                    signUpEmailUseCase$signUp$1.label = 4;
                    mo6875invokegIAlus = updateOnboardingUseCase.mo6875invokegIAlus(unit, (Continuation<? super Result<? extends Unit>>) signUpEmailUseCase$signUp$1);
                    if (mo6875invokegIAlus == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (!Result.m7277isFailureimpl(mo6875invokegIAlus)) {
                    }
                }
                if (!((Boolean) obj).booleanValue()) {
                    return new EmailLoginResponse.EmailInvalid();
                }
                Authorizer authorizer = signUpEmailUseCase.authorizer;
                signUpEmailUseCase$signUp$1.L$0 = signUpEmailUseCase;
                signUpEmailUseCase$signUp$1.L$1 = null;
                signUpEmailUseCase$signUp$1.L$2 = null;
                signUpEmailUseCase$signUp$1.L$3 = null;
                signUpEmailUseCase$signUp$1.label = 2;
                obj = authorizer.auth(str4, str3, str2, signUpEmailUseCase$signUp$1);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                signUpEmailUseCase2 = signUpEmailUseCase;
                emailLoginResponse = (EmailLoginResponse) obj;
                if (emailLoginResponse instanceof EmailLoginResponse.Success) {
                }
            }
        }
        signUpEmailUseCase$signUp$1 = new SignUpEmailUseCase$signUp$1(this, continuation);
        obj = signUpEmailUseCase$signUp$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = signUpEmailUseCase$signUp$1.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }
}
