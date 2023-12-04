package com.ifriend.chat.presentation.ui.menu.confirmEmail;

import com.ifriend.analytics.usecase.confirmEmail.AnalyticsCheckMyInboxClickedUseCase;
import com.ifriend.presentation.navigation.AppFlowCoordinator;
import com.ifriend.ui.base.di.ViewModelFactory;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ConfirmEmailFragment_MembersInjector implements MembersInjector<ConfirmEmailFragment> {
    private final Provider<AnalyticsCheckMyInboxClickedUseCase> analyticsCheckMyInboxClickedUseCaseProvider;
    private final Provider<AppFlowCoordinator> appFlowCoordinatorProvider;
    private final Provider<ViewModelFactory> viewModelFactoryProvider;

    public ConfirmEmailFragment_MembersInjector(Provider<AnalyticsCheckMyInboxClickedUseCase> provider, Provider<ViewModelFactory> provider2, Provider<AppFlowCoordinator> provider3) {
        this.analyticsCheckMyInboxClickedUseCaseProvider = provider;
        this.viewModelFactoryProvider = provider2;
        this.appFlowCoordinatorProvider = provider3;
    }

    public static MembersInjector<ConfirmEmailFragment> create(Provider<AnalyticsCheckMyInboxClickedUseCase> provider, Provider<ViewModelFactory> provider2, Provider<AppFlowCoordinator> provider3) {
        return new ConfirmEmailFragment_MembersInjector(provider, provider2, provider3);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ConfirmEmailFragment confirmEmailFragment) {
        injectAnalyticsCheckMyInboxClickedUseCase(confirmEmailFragment, this.analyticsCheckMyInboxClickedUseCaseProvider.get());
        injectViewModelFactory(confirmEmailFragment, this.viewModelFactoryProvider.get());
        injectAppFlowCoordinator(confirmEmailFragment, this.appFlowCoordinatorProvider.get());
    }

    public static void injectAnalyticsCheckMyInboxClickedUseCase(ConfirmEmailFragment confirmEmailFragment, AnalyticsCheckMyInboxClickedUseCase analyticsCheckMyInboxClickedUseCase) {
        confirmEmailFragment.analyticsCheckMyInboxClickedUseCase = analyticsCheckMyInboxClickedUseCase;
    }

    public static void injectViewModelFactory(ConfirmEmailFragment confirmEmailFragment, ViewModelFactory viewModelFactory) {
        confirmEmailFragment.viewModelFactory = viewModelFactory;
    }

    public static void injectAppFlowCoordinator(ConfirmEmailFragment confirmEmailFragment, AppFlowCoordinator appFlowCoordinator) {
        confirmEmailFragment.appFlowCoordinator = appFlowCoordinator;
    }
}
