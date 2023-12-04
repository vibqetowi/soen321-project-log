package com.ifriend.domain.data.authorization.confirmEmail;

import com.ifriend.domain.data.TagsProvider;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.config.AppConfigRepository;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class SendConfirmationEmailUseCase_Factory implements Factory<SendConfirmationEmailUseCase> {
    private final Provider<AppConfigRepository> appConfigRepositoryProvider;
    private final Provider<ConfirmEmailRepository> confirmEmailRepositoryProvider;
    private final Provider<TagsProvider> tagsProvider;
    private final Provider<UserRepository> userRepositoryProvider;

    public SendConfirmationEmailUseCase_Factory(Provider<ConfirmEmailRepository> provider, Provider<TagsProvider> provider2, Provider<AppConfigRepository> provider3, Provider<UserRepository> provider4) {
        this.confirmEmailRepositoryProvider = provider;
        this.tagsProvider = provider2;
        this.appConfigRepositoryProvider = provider3;
        this.userRepositoryProvider = provider4;
    }

    @Override // javax.inject.Provider
    public SendConfirmationEmailUseCase get() {
        return newInstance(this.confirmEmailRepositoryProvider.get(), this.tagsProvider.get(), this.appConfigRepositoryProvider.get(), this.userRepositoryProvider.get());
    }

    public static SendConfirmationEmailUseCase_Factory create(Provider<ConfirmEmailRepository> provider, Provider<TagsProvider> provider2, Provider<AppConfigRepository> provider3, Provider<UserRepository> provider4) {
        return new SendConfirmationEmailUseCase_Factory(provider, provider2, provider3, provider4);
    }

    public static SendConfirmationEmailUseCase newInstance(ConfirmEmailRepository confirmEmailRepository, TagsProvider tagsProvider, AppConfigRepository appConfigRepository, UserRepository userRepository) {
        return new SendConfirmationEmailUseCase(confirmEmailRepository, tagsProvider, appConfigRepository, userRepository);
    }
}
