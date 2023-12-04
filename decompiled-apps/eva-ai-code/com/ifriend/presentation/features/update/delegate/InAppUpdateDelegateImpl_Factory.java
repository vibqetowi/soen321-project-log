package com.ifriend.presentation.features.update.delegate;

import com.google.android.play.core.appupdate.AppUpdateManager;
import com.ifriend.domain.logic.updates.UpdatePromptInteractor;
import com.ifriend.presentation.features.update.analytics.InAppUpdateAnalytics;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class InAppUpdateDelegateImpl_Factory implements Factory<InAppUpdateDelegateImpl> {
    private final Provider<AppUpdateManager> appUpdateManagerProvider;
    private final Provider<InAppUpdateAnalytics> inAppUpdateAnalyticsProvider;
    private final Provider<UpdatePromptInteractor> updatePromptInteractorProvider;

    public InAppUpdateDelegateImpl_Factory(Provider<AppUpdateManager> provider, Provider<UpdatePromptInteractor> provider2, Provider<InAppUpdateAnalytics> provider3) {
        this.appUpdateManagerProvider = provider;
        this.updatePromptInteractorProvider = provider2;
        this.inAppUpdateAnalyticsProvider = provider3;
    }

    @Override // javax.inject.Provider
    public InAppUpdateDelegateImpl get() {
        return newInstance(this.appUpdateManagerProvider.get(), this.updatePromptInteractorProvider.get(), this.inAppUpdateAnalyticsProvider.get());
    }

    public static InAppUpdateDelegateImpl_Factory create(Provider<AppUpdateManager> provider, Provider<UpdatePromptInteractor> provider2, Provider<InAppUpdateAnalytics> provider3) {
        return new InAppUpdateDelegateImpl_Factory(provider, provider2, provider3);
    }

    public static InAppUpdateDelegateImpl newInstance(AppUpdateManager appUpdateManager, UpdatePromptInteractor updatePromptInteractor, InAppUpdateAnalytics inAppUpdateAnalytics) {
        return new InAppUpdateDelegateImpl(appUpdateManager, updatePromptInteractor, inAppUpdateAnalytics);
    }
}
