package com.ifriend.registration.domain.useCase.google;

import com.ifriend.common_utils.Logger;
import com.ifriend.domain.authorization.Authorizer;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.logic.onboarding.UpdateOnboardingUseCase;
import com.ifriend.domain.models.authorization.AuthResult;
import com.ifriend.domain.models.authorization.EmailLoginResponse;
import com.ifriend.domain.services.initialData.InitialDataLoader;
import com.ifriend.registration.domain.useCase.password.PasswordGenerator;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AuthWithGoogleUseCase.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0015B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/ifriend/registration/domain/useCase/google/AuthWithGoogleUseCase;", "", "authorizer", "Lcom/ifriend/domain/authorization/Authorizer;", "userRepository", "Lcom/ifriend/domain/data/UserRepository;", "initialDataLoader", "Lcom/ifriend/domain/services/initialData/InitialDataLoader;", "passwordGenerator", "Lcom/ifriend/registration/domain/useCase/password/PasswordGenerator;", "logger", "Lcom/ifriend/common_utils/Logger;", "updateOnboardingUseCase", "Lcom/ifriend/domain/logic/onboarding/UpdateOnboardingUseCase;", "(Lcom/ifriend/domain/authorization/Authorizer;Lcom/ifriend/domain/data/UserRepository;Lcom/ifriend/domain/services/initialData/InitialDataLoader;Lcom/ifriend/registration/domain/useCase/password/PasswordGenerator;Lcom/ifriend/common_utils/Logger;Lcom/ifriend/domain/logic/onboarding/UpdateOnboardingUseCase;)V", "auth", "Lcom/ifriend/domain/models/authorization/EmailLoginResponse;", "Lcom/ifriend/domain/models/authorization/AuthResult;", "accountData", "Lcom/ifriend/registration/domain/useCase/google/GoogleAccountData;", "(Lcom/ifriend/registration/domain/useCase/google/GoogleAccountData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GoogleAuthInitialDataLoadingFailedException", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AuthWithGoogleUseCase {
    private final Authorizer authorizer;
    private final InitialDataLoader initialDataLoader;
    private final Logger logger;
    private final PasswordGenerator passwordGenerator;
    private final UpdateOnboardingUseCase updateOnboardingUseCase;
    private final UserRepository userRepository;

    /* compiled from: AuthWithGoogleUseCase.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ifriend/registration/domain/useCase/google/AuthWithGoogleUseCase$GoogleAuthInitialDataLoadingFailedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class GoogleAuthInitialDataLoadingFailedException extends Exception {
    }

    public AuthWithGoogleUseCase(Authorizer authorizer, UserRepository userRepository, InitialDataLoader initialDataLoader, PasswordGenerator passwordGenerator, Logger logger, UpdateOnboardingUseCase updateOnboardingUseCase) {
        Intrinsics.checkNotNullParameter(authorizer, "authorizer");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(initialDataLoader, "initialDataLoader");
        Intrinsics.checkNotNullParameter(passwordGenerator, "passwordGenerator");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(updateOnboardingUseCase, "updateOnboardingUseCase");
        this.authorizer = authorizer;
        this.userRepository = userRepository;
        this.initialDataLoader = initialDataLoader;
        this.passwordGenerator = passwordGenerator;
        this.logger = logger;
        this.updateOnboardingUseCase = updateOnboardingUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object auth(GoogleAccountData googleAccountData, Continuation<? super EmailLoginResponse<AuthResult>> continuation) {
        AuthWithGoogleUseCase$auth$1 authWithGoogleUseCase$auth$1;
        int i;
        AuthWithGoogleUseCase authWithGoogleUseCase;
        EmailLoginResponse emailLoginResponse;
        EmailLoginResponse emailLoginResponse2;
        Object load;
        EmailLoginResponse emailLoginResponse3;
        Object mo6875invokegIAlus;
        if (continuation instanceof AuthWithGoogleUseCase$auth$1) {
            authWithGoogleUseCase$auth$1 = (AuthWithGoogleUseCase$auth$1) continuation;
            if ((authWithGoogleUseCase$auth$1.label & Integer.MIN_VALUE) != 0) {
                authWithGoogleUseCase$auth$1.label -= Integer.MIN_VALUE;
                Object obj = authWithGoogleUseCase$auth$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = authWithGoogleUseCase$auth$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    String email = googleAccountData.getEmail();
                    String generate = this.passwordGenerator.generate();
                    authWithGoogleUseCase$auth$1.L$0 = this;
                    authWithGoogleUseCase$auth$1.L$1 = googleAccountData;
                    authWithGoogleUseCase$auth$1.label = 1;
                    obj = this.authorizer.auth("Google token=\"" + googleAccountData.getToken() + "\"", email, generate, authWithGoogleUseCase$auth$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    authWithGoogleUseCase = this;
                } else if (i == 1) {
                    googleAccountData = (GoogleAccountData) authWithGoogleUseCase$auth$1.L$1;
                    authWithGoogleUseCase = (AuthWithGoogleUseCase) authWithGoogleUseCase$auth$1.L$0;
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    emailLoginResponse2 = (EmailLoginResponse) authWithGoogleUseCase$auth$1.L$1;
                    authWithGoogleUseCase = (AuthWithGoogleUseCase) authWithGoogleUseCase$auth$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    emailLoginResponse = emailLoginResponse2;
                    InitialDataLoader initialDataLoader = authWithGoogleUseCase.initialDataLoader;
                    authWithGoogleUseCase$auth$1.L$0 = authWithGoogleUseCase;
                    authWithGoogleUseCase$auth$1.L$1 = emailLoginResponse;
                    authWithGoogleUseCase$auth$1.label = 3;
                    load = initialDataLoader.load(authWithGoogleUseCase$auth$1);
                    if (load != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    EmailLoginResponse emailLoginResponse4 = emailLoginResponse;
                    obj = load;
                    emailLoginResponse3 = emailLoginResponse4;
                    if (((Boolean) obj).booleanValue()) {
                    }
                } else if (i != 3) {
                    if (i == 4) {
                        emailLoginResponse3 = (EmailLoginResponse) authWithGoogleUseCase$auth$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        mo6875invokegIAlus = ((Result) obj).m7280unboximpl();
                        return !Result.m7277isFailureimpl(mo6875invokegIAlus) ? new EmailLoginResponse.Failure("Google auth failed. Update onboarding") : emailLoginResponse3;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    emailLoginResponse3 = (EmailLoginResponse) authWithGoogleUseCase$auth$1.L$1;
                    authWithGoogleUseCase = (AuthWithGoogleUseCase) authWithGoogleUseCase$auth$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    if (((Boolean) obj).booleanValue()) {
                        authWithGoogleUseCase.logger.logException(new GoogleAuthInitialDataLoadingFailedException());
                        return new EmailLoginResponse.Failure("Google auth failed. Initial data not load");
                    }
                    UpdateOnboardingUseCase updateOnboardingUseCase = authWithGoogleUseCase.updateOnboardingUseCase;
                    Unit unit = Unit.INSTANCE;
                    authWithGoogleUseCase$auth$1.L$0 = emailLoginResponse3;
                    authWithGoogleUseCase$auth$1.L$1 = null;
                    authWithGoogleUseCase$auth$1.label = 4;
                    mo6875invokegIAlus = updateOnboardingUseCase.mo6875invokegIAlus(unit, (Continuation<? super Result<? extends Unit>>) authWithGoogleUseCase$auth$1);
                    if (mo6875invokegIAlus == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (!Result.m7277isFailureimpl(mo6875invokegIAlus)) {
                    }
                }
                emailLoginResponse = (EmailLoginResponse) obj;
                if (emailLoginResponse instanceof EmailLoginResponse.Success) {
                    return emailLoginResponse;
                }
                if (googleAccountData.getName() != null) {
                    UserRepository userRepository = authWithGoogleUseCase.userRepository;
                    String name = googleAccountData.getName();
                    authWithGoogleUseCase$auth$1.L$0 = authWithGoogleUseCase;
                    authWithGoogleUseCase$auth$1.L$1 = emailLoginResponse;
                    authWithGoogleUseCase$auth$1.label = 2;
                    if (userRepository.setName(name, authWithGoogleUseCase$auth$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    emailLoginResponse2 = emailLoginResponse;
                    emailLoginResponse = emailLoginResponse2;
                }
                InitialDataLoader initialDataLoader2 = authWithGoogleUseCase.initialDataLoader;
                authWithGoogleUseCase$auth$1.L$0 = authWithGoogleUseCase;
                authWithGoogleUseCase$auth$1.L$1 = emailLoginResponse;
                authWithGoogleUseCase$auth$1.label = 3;
                load = initialDataLoader2.load(authWithGoogleUseCase$auth$1);
                if (load != coroutine_suspended) {
                }
            }
        }
        authWithGoogleUseCase$auth$1 = new AuthWithGoogleUseCase$auth$1(this, continuation);
        Object obj2 = authWithGoogleUseCase$auth$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = authWithGoogleUseCase$auth$1.label;
        if (i != 0) {
        }
        emailLoginResponse = (EmailLoginResponse) obj2;
        if (emailLoginResponse instanceof EmailLoginResponse.Success) {
        }
    }
}
