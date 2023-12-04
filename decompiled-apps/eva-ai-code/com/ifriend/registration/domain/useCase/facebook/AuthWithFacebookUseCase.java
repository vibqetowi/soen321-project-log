package com.ifriend.registration.domain.useCase.facebook;

import com.ifriend.domain.authorization.Authorizer;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.logic.onboarding.UpdateOnboardingUseCase;
import com.ifriend.domain.models.authorization.AuthResult;
import com.ifriend.domain.models.authorization.EmailLoginResponse;
import com.ifriend.domain.models.profile.Birthday;
import com.ifriend.domain.models.profile.Gender;
import com.ifriend.domain.services.initialData.InitialDataLoader;
import com.ifriend.registration.domain.useCase.password.PasswordGenerator;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AuthWithFacebookUseCase.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ'\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/ifriend/registration/domain/useCase/facebook/AuthWithFacebookUseCase;", "", "authorizer", "Lcom/ifriend/domain/authorization/Authorizer;", "userRepository", "Lcom/ifriend/domain/data/UserRepository;", "initialDataLoader", "Lcom/ifriend/domain/services/initialData/InitialDataLoader;", "passwordGenerator", "Lcom/ifriend/registration/domain/useCase/password/PasswordGenerator;", "updateOnboardingUseCase", "Lcom/ifriend/domain/logic/onboarding/UpdateOnboardingUseCase;", "(Lcom/ifriend/domain/authorization/Authorizer;Lcom/ifriend/domain/data/UserRepository;Lcom/ifriend/domain/services/initialData/InitialDataLoader;Lcom/ifriend/registration/domain/useCase/password/PasswordGenerator;Lcom/ifriend/domain/logic/onboarding/UpdateOnboardingUseCase;)V", "auth", "Lcom/ifriend/domain/models/authorization/EmailLoginResponse;", "Lcom/ifriend/domain/models/authorization/AuthResult;", "facebookAccessToken", "", "userInfo", "Lcom/ifriend/registration/domain/useCase/facebook/FacebookAccountData;", "(Ljava/lang/String;Lcom/ifriend/registration/domain/useCase/facebook/FacebookAccountData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AuthWithFacebookUseCase {
    private final Authorizer authorizer;
    private final InitialDataLoader initialDataLoader;
    private final PasswordGenerator passwordGenerator;
    private final UpdateOnboardingUseCase updateOnboardingUseCase;
    private final UserRepository userRepository;

    public AuthWithFacebookUseCase(Authorizer authorizer, UserRepository userRepository, InitialDataLoader initialDataLoader, PasswordGenerator passwordGenerator, UpdateOnboardingUseCase updateOnboardingUseCase) {
        Intrinsics.checkNotNullParameter(authorizer, "authorizer");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(initialDataLoader, "initialDataLoader");
        Intrinsics.checkNotNullParameter(passwordGenerator, "passwordGenerator");
        Intrinsics.checkNotNullParameter(updateOnboardingUseCase, "updateOnboardingUseCase");
        this.authorizer = authorizer;
        this.userRepository = userRepository;
        this.initialDataLoader = initialDataLoader;
        this.passwordGenerator = passwordGenerator;
        this.updateOnboardingUseCase = updateOnboardingUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object auth(String str, FacebookAccountData facebookAccountData, Continuation<? super EmailLoginResponse<AuthResult>> continuation) {
        AuthWithFacebookUseCase$auth$1 authWithFacebookUseCase$auth$1;
        AuthWithFacebookUseCase authWithFacebookUseCase;
        EmailLoginResponse emailLoginResponse;
        AuthWithFacebookUseCase authWithFacebookUseCase2;
        EmailLoginResponse emailLoginResponse2;
        AuthWithFacebookUseCase authWithFacebookUseCase3;
        Object mo6875invokegIAlus;
        if (continuation instanceof AuthWithFacebookUseCase$auth$1) {
            authWithFacebookUseCase$auth$1 = (AuthWithFacebookUseCase$auth$1) continuation;
            if ((authWithFacebookUseCase$auth$1.label & Integer.MIN_VALUE) != 0) {
                authWithFacebookUseCase$auth$1.label -= Integer.MIN_VALUE;
                Object obj = authWithFacebookUseCase$auth$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (authWithFacebookUseCase$auth$1.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        String email = facebookAccountData.getEmail();
                        String generate = this.passwordGenerator.generate();
                        authWithFacebookUseCase$auth$1.L$0 = this;
                        authWithFacebookUseCase$auth$1.L$1 = facebookAccountData;
                        authWithFacebookUseCase$auth$1.label = 1;
                        obj = this.authorizer.auth("Facebook token=\"" + str + "\"", email, generate, authWithFacebookUseCase$auth$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        authWithFacebookUseCase = this;
                        emailLoginResponse = (EmailLoginResponse) obj;
                        if (emailLoginResponse instanceof EmailLoginResponse.Success) {
                            return emailLoginResponse;
                        }
                        InitialDataLoader initialDataLoader = authWithFacebookUseCase.initialDataLoader;
                        authWithFacebookUseCase$auth$1.L$0 = authWithFacebookUseCase;
                        authWithFacebookUseCase$auth$1.L$1 = facebookAccountData;
                        authWithFacebookUseCase$auth$1.L$2 = emailLoginResponse;
                        authWithFacebookUseCase$auth$1.label = 2;
                        Object load = initialDataLoader.load(authWithFacebookUseCase$auth$1);
                        if (load == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        authWithFacebookUseCase2 = authWithFacebookUseCase;
                        emailLoginResponse2 = emailLoginResponse;
                        obj = load;
                        if (((Boolean) obj).booleanValue()) {
                            return new EmailLoginResponse.Failure("Facebook auth failed. Initial data not load");
                        }
                        if (facebookAccountData.getName() != null) {
                            UserRepository userRepository = authWithFacebookUseCase2.userRepository;
                            String name = facebookAccountData.getName();
                            authWithFacebookUseCase$auth$1.L$0 = authWithFacebookUseCase2;
                            authWithFacebookUseCase$auth$1.L$1 = facebookAccountData;
                            authWithFacebookUseCase$auth$1.L$2 = emailLoginResponse2;
                            authWithFacebookUseCase$auth$1.label = 3;
                            if (userRepository.setName(name, authWithFacebookUseCase$auth$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        if (facebookAccountData.getGender() != null) {
                            UserRepository userRepository2 = authWithFacebookUseCase2.userRepository;
                            Gender gender = facebookAccountData.getGender();
                            authWithFacebookUseCase$auth$1.L$0 = authWithFacebookUseCase2;
                            authWithFacebookUseCase$auth$1.L$1 = facebookAccountData;
                            authWithFacebookUseCase$auth$1.L$2 = emailLoginResponse2;
                            authWithFacebookUseCase$auth$1.label = 4;
                            if (userRepository2.setGender(gender, authWithFacebookUseCase$auth$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        if (facebookAccountData.getBirthday() != null) {
                            UserRepository userRepository3 = authWithFacebookUseCase2.userRepository;
                            Birthday birthday = facebookAccountData.getBirthday();
                            authWithFacebookUseCase$auth$1.L$0 = authWithFacebookUseCase2;
                            authWithFacebookUseCase$auth$1.L$1 = emailLoginResponse2;
                            authWithFacebookUseCase$auth$1.L$2 = null;
                            authWithFacebookUseCase$auth$1.label = 5;
                            if (userRepository3.setBirthday(birthday, authWithFacebookUseCase$auth$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            authWithFacebookUseCase3 = authWithFacebookUseCase2;
                            authWithFacebookUseCase2 = authWithFacebookUseCase3;
                        }
                        UpdateOnboardingUseCase updateOnboardingUseCase = authWithFacebookUseCase2.updateOnboardingUseCase;
                        Unit unit = Unit.INSTANCE;
                        authWithFacebookUseCase$auth$1.L$0 = emailLoginResponse2;
                        authWithFacebookUseCase$auth$1.L$1 = null;
                        authWithFacebookUseCase$auth$1.L$2 = null;
                        authWithFacebookUseCase$auth$1.label = 6;
                        mo6875invokegIAlus = updateOnboardingUseCase.mo6875invokegIAlus(unit, (Continuation<? super Result<? extends Unit>>) authWithFacebookUseCase$auth$1);
                        if (mo6875invokegIAlus == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Result.m7277isFailureimpl(mo6875invokegIAlus) ? new EmailLoginResponse.Failure("Facebook auth failed. Update onboarding") : emailLoginResponse2;
                    case 1:
                        facebookAccountData = (FacebookAccountData) authWithFacebookUseCase$auth$1.L$1;
                        authWithFacebookUseCase = (AuthWithFacebookUseCase) authWithFacebookUseCase$auth$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        emailLoginResponse = (EmailLoginResponse) obj;
                        if (emailLoginResponse instanceof EmailLoginResponse.Success) {
                        }
                        break;
                    case 2:
                        emailLoginResponse2 = (EmailLoginResponse) authWithFacebookUseCase$auth$1.L$2;
                        facebookAccountData = (FacebookAccountData) authWithFacebookUseCase$auth$1.L$1;
                        authWithFacebookUseCase2 = (AuthWithFacebookUseCase) authWithFacebookUseCase$auth$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                        break;
                    case 3:
                        emailLoginResponse2 = (EmailLoginResponse) authWithFacebookUseCase$auth$1.L$2;
                        facebookAccountData = (FacebookAccountData) authWithFacebookUseCase$auth$1.L$1;
                        authWithFacebookUseCase2 = (AuthWithFacebookUseCase) authWithFacebookUseCase$auth$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        if (facebookAccountData.getGender() != null) {
                        }
                        if (facebookAccountData.getBirthday() != null) {
                        }
                        UpdateOnboardingUseCase updateOnboardingUseCase2 = authWithFacebookUseCase2.updateOnboardingUseCase;
                        Unit unit2 = Unit.INSTANCE;
                        authWithFacebookUseCase$auth$1.L$0 = emailLoginResponse2;
                        authWithFacebookUseCase$auth$1.L$1 = null;
                        authWithFacebookUseCase$auth$1.L$2 = null;
                        authWithFacebookUseCase$auth$1.label = 6;
                        mo6875invokegIAlus = updateOnboardingUseCase2.mo6875invokegIAlus(unit2, (Continuation<? super Result<? extends Unit>>) authWithFacebookUseCase$auth$1);
                        if (mo6875invokegIAlus == coroutine_suspended) {
                        }
                        if (Result.m7277isFailureimpl(mo6875invokegIAlus)) {
                        }
                        break;
                    case 4:
                        emailLoginResponse2 = (EmailLoginResponse) authWithFacebookUseCase$auth$1.L$2;
                        facebookAccountData = (FacebookAccountData) authWithFacebookUseCase$auth$1.L$1;
                        authWithFacebookUseCase2 = (AuthWithFacebookUseCase) authWithFacebookUseCase$auth$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        if (facebookAccountData.getBirthday() != null) {
                        }
                        UpdateOnboardingUseCase updateOnboardingUseCase22 = authWithFacebookUseCase2.updateOnboardingUseCase;
                        Unit unit22 = Unit.INSTANCE;
                        authWithFacebookUseCase$auth$1.L$0 = emailLoginResponse2;
                        authWithFacebookUseCase$auth$1.L$1 = null;
                        authWithFacebookUseCase$auth$1.L$2 = null;
                        authWithFacebookUseCase$auth$1.label = 6;
                        mo6875invokegIAlus = updateOnboardingUseCase22.mo6875invokegIAlus(unit22, (Continuation<? super Result<? extends Unit>>) authWithFacebookUseCase$auth$1);
                        if (mo6875invokegIAlus == coroutine_suspended) {
                        }
                        if (Result.m7277isFailureimpl(mo6875invokegIAlus)) {
                        }
                        break;
                    case 5:
                        emailLoginResponse2 = (EmailLoginResponse) authWithFacebookUseCase$auth$1.L$1;
                        authWithFacebookUseCase3 = (AuthWithFacebookUseCase) authWithFacebookUseCase$auth$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        authWithFacebookUseCase2 = authWithFacebookUseCase3;
                        UpdateOnboardingUseCase updateOnboardingUseCase222 = authWithFacebookUseCase2.updateOnboardingUseCase;
                        Unit unit222 = Unit.INSTANCE;
                        authWithFacebookUseCase$auth$1.L$0 = emailLoginResponse2;
                        authWithFacebookUseCase$auth$1.L$1 = null;
                        authWithFacebookUseCase$auth$1.L$2 = null;
                        authWithFacebookUseCase$auth$1.label = 6;
                        mo6875invokegIAlus = updateOnboardingUseCase222.mo6875invokegIAlus(unit222, (Continuation<? super Result<? extends Unit>>) authWithFacebookUseCase$auth$1);
                        if (mo6875invokegIAlus == coroutine_suspended) {
                        }
                        if (Result.m7277isFailureimpl(mo6875invokegIAlus)) {
                        }
                        break;
                    case 6:
                        emailLoginResponse2 = (EmailLoginResponse) authWithFacebookUseCase$auth$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        mo6875invokegIAlus = ((Result) obj).m7280unboximpl();
                        if (Result.m7277isFailureimpl(mo6875invokegIAlus)) {
                        }
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        authWithFacebookUseCase$auth$1 = new AuthWithFacebookUseCase$auth$1(this, continuation);
        Object obj2 = authWithFacebookUseCase$auth$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (authWithFacebookUseCase$auth$1.label) {
        }
    }
}
