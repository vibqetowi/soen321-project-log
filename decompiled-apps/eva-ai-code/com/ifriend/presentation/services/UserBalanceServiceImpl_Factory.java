package com.ifriend.presentation.services;

import com.ifriend.analytics.api.logic.AnalyticsInteractor;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.user.UserBalanceRepository;
import com.ifriend.domain.socket.MessagesSource;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class UserBalanceServiceImpl_Factory implements Factory<UserBalanceServiceImpl> {
    private final Provider<AnalyticsInteractor> analyticsInteractorProvider;
    private final Provider<CoroutineScope> coroutineScopeProvider;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<MessagesSource> messagesSourceProvider;
    private final Provider<UserBalanceRepository> userBalanceRepositoryProvider;
    private final Provider<UserRepository> userRepositoryProvider;

    public UserBalanceServiceImpl_Factory(Provider<CoroutineScope> provider, Provider<MessagesSource> provider2, Provider<DispatcherProvider> provider3, Provider<AnalyticsInteractor> provider4, Provider<UserRepository> provider5, Provider<UserBalanceRepository> provider6) {
        this.coroutineScopeProvider = provider;
        this.messagesSourceProvider = provider2;
        this.dispatcherProvider = provider3;
        this.analyticsInteractorProvider = provider4;
        this.userRepositoryProvider = provider5;
        this.userBalanceRepositoryProvider = provider6;
    }

    @Override // javax.inject.Provider
    public UserBalanceServiceImpl get() {
        return newInstance(this.coroutineScopeProvider.get(), this.messagesSourceProvider.get(), this.dispatcherProvider.get(), this.analyticsInteractorProvider.get(), this.userRepositoryProvider.get(), this.userBalanceRepositoryProvider.get());
    }

    public static UserBalanceServiceImpl_Factory create(Provider<CoroutineScope> provider, Provider<MessagesSource> provider2, Provider<DispatcherProvider> provider3, Provider<AnalyticsInteractor> provider4, Provider<UserRepository> provider5, Provider<UserBalanceRepository> provider6) {
        return new UserBalanceServiceImpl_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static UserBalanceServiceImpl newInstance(CoroutineScope coroutineScope, MessagesSource messagesSource, DispatcherProvider dispatcherProvider, AnalyticsInteractor analyticsInteractor, UserRepository userRepository, UserBalanceRepository userBalanceRepository) {
        return new UserBalanceServiceImpl(coroutineScope, messagesSource, dispatcherProvider, analyticsInteractor, userRepository, userBalanceRepository);
    }
}
