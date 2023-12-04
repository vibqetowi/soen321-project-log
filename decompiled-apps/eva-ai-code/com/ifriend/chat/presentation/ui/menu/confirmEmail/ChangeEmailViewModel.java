package com.ifriend.chat.presentation.ui.menu.confirmEmail;

import androidx.lifecycle.ViewModelKt;
import com.ifriend.analytics.usecase.confirmEmail.AnalyticsEmailChangedUseCase;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.authorization.confirmEmail.SendConfirmationEmailUseCase;
import com.ifriend.ui.base.mvvm.BaseViewModel;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
/* compiled from: ChangeEmailViewModel.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ifriend/chat/presentation/ui/menu/confirmEmail/ChangeEmailViewModel;", "Lcom/ifriend/ui/base/mvvm/BaseViewModel;", "Lcom/ifriend/chat/presentation/ui/menu/confirmEmail/ChangeEmailState;", "sendConfirmationEmailUseCase", "Lcom/ifriend/domain/data/authorization/confirmEmail/SendConfirmationEmailUseCase;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "analyticsEmailChangedUseCase", "Lcom/ifriend/analytics/usecase/confirmEmail/AnalyticsEmailChangedUseCase;", "coroutineDispatchers", "Lcom/ifriend/domain/CoroutineDispatchers;", "(Lcom/ifriend/domain/data/authorization/confirmEmail/SendConfirmationEmailUseCase;Lkotlinx/coroutines/CoroutineScope;Lcom/ifriend/analytics/usecase/confirmEmail/AnalyticsEmailChangedUseCase;Lcom/ifriend/domain/CoroutineDispatchers;)V", "validateEmailJob", "Lkotlinx/coroutines/Job;", "changeEmail", "", "setEmail", "email", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChangeEmailViewModel extends BaseViewModel<ChangeEmailState> {
    public static final int $stable = 8;
    private final AnalyticsEmailChangedUseCase analyticsEmailChangedUseCase;
    private final CoroutineScope coroutineScope;
    private final SendConfirmationEmailUseCase sendConfirmationEmailUseCase;
    private Job validateEmailJob;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public ChangeEmailViewModel(SendConfirmationEmailUseCase sendConfirmationEmailUseCase, CoroutineScope coroutineScope, AnalyticsEmailChangedUseCase analyticsEmailChangedUseCase, CoroutineDispatchers coroutineDispatchers) {
        super(coroutineDispatchers, ChangeEmailState.Companion.getEmpty());
        Intrinsics.checkNotNullParameter(sendConfirmationEmailUseCase, "sendConfirmationEmailUseCase");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(analyticsEmailChangedUseCase, "analyticsEmailChangedUseCase");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        this.sendConfirmationEmailUseCase = sendConfirmationEmailUseCase;
        this.coroutineScope = coroutineScope;
        this.analyticsEmailChangedUseCase = analyticsEmailChangedUseCase;
    }

    public final void setEmail(String email) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(email, "email");
        changeState(new ChangeEmailViewModel$setEmail$1(this, email));
        Job job = this.validateEmailJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ChangeEmailViewModel$setEmail$2(this, email, null), 3, null);
        this.validateEmailJob = launch$default;
    }

    public final void changeEmail() {
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new ChangeEmailViewModel$changeEmail$1(this, null), 3, null);
    }
}
