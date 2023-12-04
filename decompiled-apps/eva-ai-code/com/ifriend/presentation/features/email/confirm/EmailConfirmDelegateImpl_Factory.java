package com.ifriend.presentation.features.email.confirm;

import com.ifriend.data.toggle.ConfirmEmailFeatureToggle;
import com.ifriend.domain.data.TagsProvider;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.useCases.AppConfigUseCase;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class EmailConfirmDelegateImpl_Factory implements Factory<EmailConfirmDelegateImpl> {
    private final Provider<AppConfigUseCase> appConfigUseCaseProvider;
    private final Provider<ConfirmEmailFeatureToggle> confirmEmailFeatureToggleProvider;
    private final Provider<TagsProvider> tagsProvider;
    private final Provider<UserRepository> userRepositoryProvider;

    public EmailConfirmDelegateImpl_Factory(Provider<ConfirmEmailFeatureToggle> provider, Provider<AppConfigUseCase> provider2, Provider<UserRepository> provider3, Provider<TagsProvider> provider4) {
        this.confirmEmailFeatureToggleProvider = provider;
        this.appConfigUseCaseProvider = provider2;
        this.userRepositoryProvider = provider3;
        this.tagsProvider = provider4;
    }

    @Override // javax.inject.Provider
    public EmailConfirmDelegateImpl get() {
        return newInstance(this.confirmEmailFeatureToggleProvider.get(), this.appConfigUseCaseProvider.get(), this.userRepositoryProvider.get(), this.tagsProvider.get());
    }

    public static EmailConfirmDelegateImpl_Factory create(Provider<ConfirmEmailFeatureToggle> provider, Provider<AppConfigUseCase> provider2, Provider<UserRepository> provider3, Provider<TagsProvider> provider4) {
        return new EmailConfirmDelegateImpl_Factory(provider, provider2, provider3, provider4);
    }

    public static EmailConfirmDelegateImpl newInstance(ConfirmEmailFeatureToggle confirmEmailFeatureToggle, AppConfigUseCase appConfigUseCase, UserRepository userRepository, TagsProvider tagsProvider) {
        return new EmailConfirmDelegateImpl(confirmEmailFeatureToggle, appConfigUseCase, userRepository, tagsProvider);
    }
}
