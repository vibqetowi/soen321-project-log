package com.ifriend.presentation.features.app.delegates;

import com.ifriend.chat.domain.AuthInteractor;
import com.ifriend.chat.domain.chat.ShouldReloadMessagesUseCase;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.user.UserProfileRepository;
import com.ifriend.domain.logic.logout.LogoutUseCase;
import com.ifriend.domain.useCases.user.get.GetUserUseCase;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AppReloadDataDelegateImpl_Factory implements Factory<AppReloadDataDelegateImpl> {
    private final Provider<AppEventsEmitter> appEventsEmitterProvider;
    private final Provider<AuthInteractor> authInteractorProvider;
    private final Provider<GetUserUseCase> getUserUseCaseProvider;
    private final Provider<LogoutUseCase> logOutUseCaseProvider;
    private final Provider<ShouldReloadMessagesUseCase> shouldReloadMessagesUseCaseProvider;
    private final Provider<UserProfileRepository> userProfileRepositoryProvider;
    private final Provider<UserRepository> userRepositoryProvider;

    public AppReloadDataDelegateImpl_Factory(Provider<AuthInteractor> provider, Provider<LogoutUseCase> provider2, Provider<ShouldReloadMessagesUseCase> provider3, Provider<UserRepository> provider4, Provider<UserProfileRepository> provider5, Provider<GetUserUseCase> provider6, Provider<AppEventsEmitter> provider7) {
        this.authInteractorProvider = provider;
        this.logOutUseCaseProvider = provider2;
        this.shouldReloadMessagesUseCaseProvider = provider3;
        this.userRepositoryProvider = provider4;
        this.userProfileRepositoryProvider = provider5;
        this.getUserUseCaseProvider = provider6;
        this.appEventsEmitterProvider = provider7;
    }

    @Override // javax.inject.Provider
    public AppReloadDataDelegateImpl get() {
        return newInstance(this.authInteractorProvider.get(), this.logOutUseCaseProvider.get(), this.shouldReloadMessagesUseCaseProvider.get(), this.userRepositoryProvider.get(), this.userProfileRepositoryProvider.get(), this.getUserUseCaseProvider.get(), this.appEventsEmitterProvider.get());
    }

    public static AppReloadDataDelegateImpl_Factory create(Provider<AuthInteractor> provider, Provider<LogoutUseCase> provider2, Provider<ShouldReloadMessagesUseCase> provider3, Provider<UserRepository> provider4, Provider<UserProfileRepository> provider5, Provider<GetUserUseCase> provider6, Provider<AppEventsEmitter> provider7) {
        return new AppReloadDataDelegateImpl_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static AppReloadDataDelegateImpl newInstance(AuthInteractor authInteractor, LogoutUseCase logoutUseCase, ShouldReloadMessagesUseCase shouldReloadMessagesUseCase, UserRepository userRepository, UserProfileRepository userProfileRepository, GetUserUseCase getUserUseCase, AppEventsEmitter appEventsEmitter) {
        return new AppReloadDataDelegateImpl(authInteractor, logoutUseCase, shouldReloadMessagesUseCase, userRepository, userProfileRepository, getUserUseCase, appEventsEmitter);
    }
}
