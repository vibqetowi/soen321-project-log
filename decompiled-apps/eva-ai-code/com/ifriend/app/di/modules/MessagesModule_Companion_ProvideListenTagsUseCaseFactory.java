package com.ifriend.app.di.modules;

import com.ifriend.domain.data.AuthDataProvider;
import com.ifriend.domain.data.TagsStorage;
import com.ifriend.domain.socket.MessagesSource;
import com.ifriend.domain.useCases.socket.ListenTagsUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class MessagesModule_Companion_ProvideListenTagsUseCaseFactory implements Factory<ListenTagsUseCase> {
    private final Provider<AuthDataProvider> authDataProvider;
    private final Provider<MessagesSource> messagesSourceProvider;
    private final Provider<TagsStorage> tagsStorageProvider;

    public MessagesModule_Companion_ProvideListenTagsUseCaseFactory(Provider<MessagesSource> provider, Provider<TagsStorage> provider2, Provider<AuthDataProvider> provider3) {
        this.messagesSourceProvider = provider;
        this.tagsStorageProvider = provider2;
        this.authDataProvider = provider3;
    }

    @Override // javax.inject.Provider
    public ListenTagsUseCase get() {
        return provideListenTagsUseCase(this.messagesSourceProvider.get(), this.tagsStorageProvider.get(), this.authDataProvider.get());
    }

    public static MessagesModule_Companion_ProvideListenTagsUseCaseFactory create(Provider<MessagesSource> provider, Provider<TagsStorage> provider2, Provider<AuthDataProvider> provider3) {
        return new MessagesModule_Companion_ProvideListenTagsUseCaseFactory(provider, provider2, provider3);
    }

    public static ListenTagsUseCase provideListenTagsUseCase(MessagesSource messagesSource, TagsStorage tagsStorage, AuthDataProvider authDataProvider) {
        return (ListenTagsUseCase) Preconditions.checkNotNullFromProvides(MessagesModule.Companion.provideListenTagsUseCase(messagesSource, tagsStorage, authDataProvider));
    }
}
