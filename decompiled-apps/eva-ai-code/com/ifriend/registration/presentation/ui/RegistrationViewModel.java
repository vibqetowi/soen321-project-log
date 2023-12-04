package com.ifriend.registration.presentation.ui;

import androidx.activity.result.ActivityResult;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.core.utils.CoroutinesKt;
import com.ifriend.domain.data.config.AppConfigRepository;
import com.ifriend.presentation.features.update.delegate.InAppUpdateDelegate;
import com.ifriend.presentation.features.update.delegate.InAppUpdateDelegateImpl;
import com.ifriend.presentation.features.update.model.InAppUpdateEvent;
import com.ifriend.presentation.features.update.model.InAppUpdateState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: RegistrationViewModel.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0016\u001a\u00020\u0017H\u0096\u0001J\t\u0010\u0018\u001a\u00020\u0017H\u0096\u0001J\t\u0010\u0019\u001a\u00020\u0017H\u0096\u0001J\u0013\u0010\u001a\u001a\u00020\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u0010H\u0096\u0001J\u0011\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001eH\u0096\u0001J\b\u0010\u001f\u001a\u00020\u0017H\u0002J\b\u0010 \u001a\u00020\u0017H\u0014J\u0006\u0010!\u001a\u00020\u0017J\u0006\u0010\"\u001a\u00020\u0017J\u0006\u0010#\u001a\u00020\u0017J\u000e\u0010$\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010%\u001a\u00020\u0017J\t\u0010&\u001a\u00020\u0017H\u0096\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006'"}, d2 = {"Lcom/ifriend/registration/presentation/ui/RegistrationViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/ifriend/presentation/features/update/delegate/InAppUpdateDelegate;", "appConfigRepository", "Lcom/ifriend/domain/data/config/AppConfigRepository;", "dispatchers", "Lcom/ifriend/core/tools/api/DispatcherProvider;", "appUpdatesDelegate", "Lcom/ifriend/presentation/features/update/delegate/InAppUpdateDelegateImpl;", "(Lcom/ifriend/domain/data/config/AppConfigRepository;Lcom/ifriend/core/tools/api/DispatcherProvider;Lcom/ifriend/presentation/features/update/delegate/InAppUpdateDelegateImpl;)V", "inAppUpdateState", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/ifriend/presentation/features/update/model/InAppUpdateState;", "getInAppUpdateState", "()Lkotlinx/coroutines/flow/StateFlow;", "isConfigLoaded", "", "startUpdateEvents", "Lkotlinx/coroutines/flow/Flow;", "Lcom/ifriend/presentation/features/update/model/InAppUpdateEvent;", "getStartUpdateEvents", "()Lkotlinx/coroutines/flow/Flow;", "checkForAppUpdates", "", "clearInAppUpdateDelegate", "completeUpdate", "dismissUpdatePopup", "fromUser", "handleStartUpdateResult", "result", "Landroidx/activity/result/ActivityResult;", "loadAndCheckUpdates", "onCleared", "onResume", "onUpdateClick", "onUpdatePopupDismiss", "onUpdatePromptResult", "onUpdateSnackbarClick", "showUpdatePrompt", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RegistrationViewModel extends ViewModel implements InAppUpdateDelegate {
    public static final int $stable = 8;
    private final /* synthetic */ InAppUpdateDelegateImpl $$delegate_0;
    private final AppConfigRepository appConfigRepository;
    private final DispatcherProvider dispatchers;
    private boolean isConfigLoaded;

    @Override // com.ifriend.presentation.features.update.delegate.InAppUpdateDelegate
    public void checkForAppUpdates() {
        this.$$delegate_0.checkForAppUpdates();
    }

    @Override // com.ifriend.presentation.features.update.delegate.InAppUpdateDelegate
    public void clearInAppUpdateDelegate() {
        this.$$delegate_0.clearInAppUpdateDelegate();
    }

    @Override // com.ifriend.presentation.features.update.delegate.InAppUpdateDelegate
    public void completeUpdate() {
        this.$$delegate_0.completeUpdate();
    }

    @Override // com.ifriend.presentation.features.update.delegate.InAppUpdateDelegate
    public void dismissUpdatePopup(boolean z) {
        this.$$delegate_0.dismissUpdatePopup(z);
    }

    @Override // com.ifriend.presentation.features.update.delegate.InAppUpdateDelegate
    public StateFlow<InAppUpdateState> getInAppUpdateState() {
        return this.$$delegate_0.getInAppUpdateState();
    }

    @Override // com.ifriend.presentation.features.update.delegate.InAppUpdateDelegate
    public Flow<InAppUpdateEvent> getStartUpdateEvents() {
        return this.$$delegate_0.getStartUpdateEvents();
    }

    @Override // com.ifriend.presentation.features.update.delegate.InAppUpdateDelegate
    public void handleStartUpdateResult(ActivityResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.$$delegate_0.handleStartUpdateResult(result);
    }

    @Override // com.ifriend.presentation.features.update.delegate.InAppUpdateDelegate
    public void showUpdatePrompt() {
        this.$$delegate_0.showUpdatePrompt();
    }

    public RegistrationViewModel(AppConfigRepository appConfigRepository, DispatcherProvider dispatchers, InAppUpdateDelegateImpl appUpdatesDelegate) {
        Intrinsics.checkNotNullParameter(appConfigRepository, "appConfigRepository");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(appUpdatesDelegate, "appUpdatesDelegate");
        this.appConfigRepository = appConfigRepository;
        this.dispatchers = dispatchers;
        this.$$delegate_0 = appUpdatesDelegate;
    }

    public final void onUpdateClick() {
        showUpdatePrompt();
    }

    public final void onUpdatePopupDismiss() {
        InAppUpdateDelegate.DefaultImpls.dismissUpdatePopup$default(this, false, 1, null);
    }

    public final void onUpdatePromptResult(ActivityResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        handleStartUpdateResult(result);
    }

    public final void onUpdateSnackbarClick() {
        completeUpdate();
    }

    public final void onResume() {
        if (this.isConfigLoaded) {
            checkForAppUpdates();
        } else {
            loadAndCheckUpdates();
        }
    }

    private final void loadAndCheckUpdates() {
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, this.dispatchers.background(), new RegistrationViewModel$loadAndCheckUpdates$1(this, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        clearInAppUpdateDelegate();
    }
}
