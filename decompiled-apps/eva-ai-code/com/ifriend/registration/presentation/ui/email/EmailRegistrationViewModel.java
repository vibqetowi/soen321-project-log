package com.ifriend.registration.presentation.ui.email;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ifriend.common_utils.Logger;
import com.ifriend.domain.models.authorization.EmailLoginResponse;
import com.ifriend.domain.validation.ValidateCredentialsUseCase;
import com.ifriend.registration.domain.useCase.email.SignUpEmailUseCase;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
/* compiled from: EmailRegistrationViewModel.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u001c\u001a\u00020\u0010H\u0002J\u0011\u0010\u001d\u001a\u00020\u0015H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001eR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0017R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\rR\u001d\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lcom/ifriend/registration/presentation/ui/email/EmailRegistrationViewModel;", "Landroidx/lifecycle/ViewModel;", "validateCredentialsUseCase", "Lcom/ifriend/domain/validation/ValidateCredentialsUseCase;", "signUpEmailUseCase", "Lcom/ifriend/registration/domain/useCase/email/SignUpEmailUseCase;", "logger", "Lcom/ifriend/common_utils/Logger;", "(Lcom/ifriend/domain/validation/ValidateCredentialsUseCase;Lcom/ifriend/registration/domain/useCase/email/SignUpEmailUseCase;Lcom/ifriend/common_utils/Logger;)V", "email", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "getEmail", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "emailChangedWatcher", "Lkotlin/Function1;", "", "getEmailChangedWatcher", "()Lkotlin/jvm/functions/Function1;", "isValid", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "()Landroidx/lifecycle/MutableLiveData;", "password", "getPassword", "passwordChangedWatcher", "getPasswordChangedWatcher", "checkIsValid", "signUp", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EmailRegistrationViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<String> email;
    private final Function1<String, Unit> emailChangedWatcher;
    private final MutableLiveData<Boolean> isValid;
    private final Logger logger;
    private final MutableStateFlow<String> password;
    private final Function1<String, Unit> passwordChangedWatcher;
    private final SignUpEmailUseCase signUpEmailUseCase;
    private final ValidateCredentialsUseCase validateCredentialsUseCase;

    @Inject
    public EmailRegistrationViewModel(ValidateCredentialsUseCase validateCredentialsUseCase, SignUpEmailUseCase signUpEmailUseCase, Logger logger) {
        Intrinsics.checkNotNullParameter(validateCredentialsUseCase, "validateCredentialsUseCase");
        Intrinsics.checkNotNullParameter(signUpEmailUseCase, "signUpEmailUseCase");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.validateCredentialsUseCase = validateCredentialsUseCase;
        this.signUpEmailUseCase = signUpEmailUseCase;
        this.logger = logger;
        this.email = StateFlowKt.MutableStateFlow("");
        this.password = StateFlowKt.MutableStateFlow("");
        this.isValid = new MutableLiveData<>(false);
        this.passwordChangedWatcher = new EmailRegistrationViewModel$passwordChangedWatcher$1(this);
        this.emailChangedWatcher = new EmailRegistrationViewModel$emailChangedWatcher$1(this);
    }

    public final MutableStateFlow<String> getEmail() {
        return this.email;
    }

    public final MutableStateFlow<String> getPassword() {
        return this.password;
    }

    public final MutableLiveData<Boolean> isValid() {
        return this.isValid;
    }

    public final Function1<String, Unit> getPasswordChangedWatcher() {
        return this.passwordChangedWatcher;
    }

    public final Function1<String, Unit> getEmailChangedWatcher() {
        return this.emailChangedWatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkIsValid() {
        this.isValid.setValue(Boolean.valueOf(this.validateCredentialsUseCase.invoke(this.email.getValue(), this.password.getValue())));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object signUp(Continuation<? super Boolean> continuation) {
        EmailRegistrationViewModel$signUp$1 emailRegistrationViewModel$signUp$1;
        int i;
        EmailRegistrationViewModel emailRegistrationViewModel;
        EmailLoginResponse emailLoginResponse;
        if (continuation instanceof EmailRegistrationViewModel$signUp$1) {
            emailRegistrationViewModel$signUp$1 = (EmailRegistrationViewModel$signUp$1) continuation;
            if ((emailRegistrationViewModel$signUp$1.label & Integer.MIN_VALUE) != 0) {
                emailRegistrationViewModel$signUp$1.label -= Integer.MIN_VALUE;
                Object obj = emailRegistrationViewModel$signUp$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = emailRegistrationViewModel$signUp$1.label;
                boolean z = true;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    emailRegistrationViewModel$signUp$1.L$0 = this;
                    emailRegistrationViewModel$signUp$1.label = 1;
                    obj = this.signUpEmailUseCase.signUp(this.email.getValue(), this.password.getValue(), emailRegistrationViewModel$signUp$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    emailRegistrationViewModel = this;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    emailRegistrationViewModel = (EmailRegistrationViewModel) emailRegistrationViewModel$signUp$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                emailLoginResponse = (EmailLoginResponse) obj;
                if (!(emailLoginResponse instanceof EmailLoginResponse.Success)) {
                    z = false;
                    if (emailLoginResponse instanceof EmailLoginResponse.Failure) {
                        Logger.DefaultImpls.warn$default(emailRegistrationViewModel.logger, "SignUp failed. " + ((EmailLoginResponse.Failure) emailLoginResponse).getMessage(), null, 2, null);
                    } else if (emailLoginResponse instanceof EmailLoginResponse.EmailInvalid) {
                        Logger.DefaultImpls.warn$default(emailRegistrationViewModel.logger, "SignUp failed. EmailInvalid", null, 2, null);
                    } else if (emailLoginResponse instanceof EmailLoginResponse.EmailNotRegistered) {
                        Logger.DefaultImpls.warn$default(emailRegistrationViewModel.logger, "SignUp failed. EmailNotRegistered", null, 2, null);
                    } else if (!(emailLoginResponse instanceof EmailLoginResponse.PasswordIsWrong)) {
                        throw new NoWhenBranchMatchedException();
                    } else {
                        Logger.DefaultImpls.warn$default(emailRegistrationViewModel.logger, "SignUp failed. PasswordIsWrong", null, 2, null);
                    }
                }
                return Boxing.boxBoolean(z);
            }
        }
        emailRegistrationViewModel$signUp$1 = new EmailRegistrationViewModel$signUp$1(this, continuation);
        Object obj2 = emailRegistrationViewModel$signUp$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = emailRegistrationViewModel$signUp$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        emailLoginResponse = (EmailLoginResponse) obj2;
        if (!(emailLoginResponse instanceof EmailLoginResponse.Success)) {
        }
        return Boxing.boxBoolean(z2);
    }
}
