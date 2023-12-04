package com.ifriend.registration.domain.applicationState;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.ifriend.analytics.usecase.appOpen.AnalyticsAppOpenUseCase;
import com.ifriend.analytics.usecase.appOpen.AnalyticsFirstAppOpenUseCase;
import com.ifriend.domain.data.Preferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ApplicationState.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ifriend/registration/domain/applicationState/ApplicationState;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "analyticsAppOpenUseCase", "Lcom/ifriend/analytics/usecase/appOpen/AnalyticsAppOpenUseCase;", "analyticsFirstAppOpenUseCase", "Lcom/ifriend/analytics/usecase/appOpen/AnalyticsFirstAppOpenUseCase;", "preferences", "Lcom/ifriend/domain/data/Preferences;", "(Lcom/ifriend/analytics/usecase/appOpen/AnalyticsAppOpenUseCase;Lcom/ifriend/analytics/usecase/appOpen/AnalyticsFirstAppOpenUseCase;Lcom/ifriend/domain/data/Preferences;)V", "init", "", "onStart", "owner", "Landroidx/lifecycle/LifecycleOwner;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ApplicationState implements DefaultLifecycleObserver {
    private final AnalyticsAppOpenUseCase analyticsAppOpenUseCase;
    private final AnalyticsFirstAppOpenUseCase analyticsFirstAppOpenUseCase;
    private final Preferences preferences;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    public ApplicationState(AnalyticsAppOpenUseCase analyticsAppOpenUseCase, AnalyticsFirstAppOpenUseCase analyticsFirstAppOpenUseCase, Preferences preferences) {
        Intrinsics.checkNotNullParameter(analyticsAppOpenUseCase, "analyticsAppOpenUseCase");
        Intrinsics.checkNotNullParameter(analyticsFirstAppOpenUseCase, "analyticsFirstAppOpenUseCase");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.analyticsAppOpenUseCase = analyticsAppOpenUseCase;
        this.analyticsFirstAppOpenUseCase = analyticsFirstAppOpenUseCase;
        this.preferences = preferences;
    }

    public final void init() {
        ProcessLifecycleOwner.Companion.get().getLifecycle().addObserver(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.analyticsAppOpenUseCase.handle();
        if (Preferences.DefaultImpls.getBooleanWithKey$default(this.preferences, "should_track_app_first_open", false, 2, null)) {
            this.analyticsFirstAppOpenUseCase.handle();
            this.preferences.saveBooleanWithKey("should_track_app_first_open", false);
        }
        Intrinsics.checkNotNullParameter(owner, "owner");
    }
}
