package com.ifriend.presentation.features.profile.menu.delegate;

import com.ifriend.common_utils.Logger;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.user.UserBalanceRepository;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.domain.toggle.FeatureToggle;
import com.ifriend.presentation.features.email.confirm.EmailConfirmDelegateImpl;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ProfileMenuDelegateImpl_Factory implements Factory<ProfileMenuDelegateImpl> {
    private final Provider<ChatsInfoInteractor> chatInfoUseCaseProvider;
    private final Provider<EmailConfirmDelegateImpl> emailConfirmDelegateProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<FeatureToggle> neuronsToggleProvider;
    private final Provider<UserBalanceRepository> userBalanceRepositoryProvider;
    private final Provider<UserRepository> userRepositoryProvider;

    public ProfileMenuDelegateImpl_Factory(Provider<FeatureToggle> provider, Provider<UserBalanceRepository> provider2, Provider<Logger> provider3, Provider<UserRepository> provider4, Provider<ChatsInfoInteractor> provider5, Provider<EmailConfirmDelegateImpl> provider6) {
        this.neuronsToggleProvider = provider;
        this.userBalanceRepositoryProvider = provider2;
        this.loggerProvider = provider3;
        this.userRepositoryProvider = provider4;
        this.chatInfoUseCaseProvider = provider5;
        this.emailConfirmDelegateProvider = provider6;
    }

    @Override // javax.inject.Provider
    public ProfileMenuDelegateImpl get() {
        return newInstance(this.neuronsToggleProvider.get(), this.userBalanceRepositoryProvider.get(), this.loggerProvider.get(), this.userRepositoryProvider.get(), this.chatInfoUseCaseProvider.get(), this.emailConfirmDelegateProvider.get());
    }

    public static ProfileMenuDelegateImpl_Factory create(Provider<FeatureToggle> provider, Provider<UserBalanceRepository> provider2, Provider<Logger> provider3, Provider<UserRepository> provider4, Provider<ChatsInfoInteractor> provider5, Provider<EmailConfirmDelegateImpl> provider6) {
        return new ProfileMenuDelegateImpl_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static ProfileMenuDelegateImpl newInstance(FeatureToggle featureToggle, UserBalanceRepository userBalanceRepository, Logger logger, UserRepository userRepository, ChatsInfoInteractor chatsInfoInteractor, EmailConfirmDelegateImpl emailConfirmDelegateImpl) {
        return new ProfileMenuDelegateImpl(featureToggle, userBalanceRepository, logger, userRepository, chatsInfoInteractor, emailConfirmDelegateImpl);
    }
}
