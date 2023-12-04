package com.ifriend.chat.presentation.di.onboarding;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ifriend.chat.presentation.ui.infoOnboarding.InfoOnboardingViewModel;
import com.ifriend.chat.presentation.ui.infoOnboarding.analytics.InfoOnboardingAnalytics;
import com.ifriend.chat.presentation.ui.infoOnboarding.analytics.InfoOnboardingAnalyticsImpl;
import com.ifriend.ui.base.di.ViewModelFactory;
import com.ifriend.ui.base.di.ViewModelKey;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import kotlin.Metadata;
/* compiled from: InfoOnboardingModule.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH'¨\u0006\u000e"}, d2 = {"Lcom/ifriend/chat/presentation/di/onboarding/InfoOnboardingModule;", "", "bindAnalytics", "Lcom/ifriend/chat/presentation/ui/infoOnboarding/analytics/InfoOnboardingAnalytics;", "analytics", "Lcom/ifriend/chat/presentation/ui/infoOnboarding/analytics/InfoOnboardingAnalyticsImpl;", "bindViewModel", "Landroidx/lifecycle/ViewModel;", "viewModel", "Lcom/ifriend/chat/presentation/ui/infoOnboarding/InfoOnboardingViewModel;", "bindViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Lcom/ifriend/ui/base/di/ViewModelFactory;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public interface InfoOnboardingModule {
    @Binds
    InfoOnboardingAnalytics bindAnalytics(InfoOnboardingAnalyticsImpl infoOnboardingAnalyticsImpl);

    @ViewModelKey(InfoOnboardingViewModel.class)
    @Binds
    @IntoMap
    ViewModel bindViewModel(InfoOnboardingViewModel infoOnboardingViewModel);

    @Binds
    ViewModelProvider.Factory bindViewModelFactory(ViewModelFactory viewModelFactory);
}
