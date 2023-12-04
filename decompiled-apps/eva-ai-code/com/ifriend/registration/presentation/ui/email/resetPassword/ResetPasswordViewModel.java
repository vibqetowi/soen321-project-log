package com.ifriend.registration.presentation.ui.email.resetPassword;

import androidx.lifecycle.ViewModelKt;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.ResetPasswordRepository;
import com.ifriend.domain.validation.ValidationKt;
import com.ifriend.internal_notifications.handler.InternalNotificationHandler;
import com.ifriend.ui.base.mvvm.BaseViewModel;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
/* compiled from: ResetPasswordViewModel.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0006\u0010\u0012\u001a\u00020\rR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ifriend/registration/presentation/ui/email/resetPassword/ResetPasswordViewModel;", "Lcom/ifriend/ui/base/mvvm/BaseViewModel;", "Lcom/ifriend/registration/presentation/ui/email/resetPassword/ResetPasswordState;", "resetPasswordRepository", "Lcom/ifriend/domain/data/ResetPasswordRepository;", "internalNotificationHandler", "Lcom/ifriend/internal_notifications/handler/InternalNotificationHandler;", "dispatchers", "Lcom/ifriend/domain/CoroutineDispatchers;", "(Lcom/ifriend/domain/data/ResetPasswordRepository;Lcom/ifriend/internal_notifications/handler/InternalNotificationHandler;Lcom/ifriend/domain/CoroutineDispatchers;)V", "checkEmailJob", "Lkotlinx/coroutines/Job;", "changeEmail", "", "email", "", "checkIsEmailValid", "", ResetPasswordFragmentKt.RESET_EMAIL_KEY, "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ResetPasswordViewModel extends BaseViewModel<ResetPasswordState> {
    public static final int $stable = 8;
    private Job checkEmailJob;
    private final InternalNotificationHandler internalNotificationHandler;
    private final ResetPasswordRepository resetPasswordRepository;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public ResetPasswordViewModel(ResetPasswordRepository resetPasswordRepository, InternalNotificationHandler internalNotificationHandler, CoroutineDispatchers dispatchers) {
        super(dispatchers, ResetPasswordState.Companion.empty());
        Intrinsics.checkNotNullParameter(resetPasswordRepository, "resetPasswordRepository");
        Intrinsics.checkNotNullParameter(internalNotificationHandler, "internalNotificationHandler");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.resetPasswordRepository = resetPasswordRepository;
        this.internalNotificationHandler = internalNotificationHandler;
    }

    public final void changeEmail(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        changeState(new ResetPasswordViewModel$changeEmail$1(this, email));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean checkIsEmailValid(String str) {
        return ValidationKt.isValidEmail(str);
    }

    public final void resetEmail() {
        Job launch$default;
        changeState(ResetPasswordViewModel$resetEmail$1.INSTANCE);
        Job job = this.checkEmailJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ResetPasswordViewModel$resetEmail$2(this, null), 3, null);
        this.checkEmailJob = launch$default;
    }
}
