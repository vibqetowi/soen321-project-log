package com.ifriend.domain.logic.chat.intro;

import com.ifriend.domain.data.chat.ChatIntroRepository;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class GetChatIntroSlidesUseCase_Factory implements Factory<GetChatIntroSlidesUseCase> {
    private final Provider<ChatIntroRepository> chatIntroRepositoryProvider;

    public GetChatIntroSlidesUseCase_Factory(Provider<ChatIntroRepository> provider) {
        this.chatIntroRepositoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public GetChatIntroSlidesUseCase get() {
        return newInstance(this.chatIntroRepositoryProvider.get());
    }

    public static GetChatIntroSlidesUseCase_Factory create(Provider<ChatIntroRepository> provider) {
        return new GetChatIntroSlidesUseCase_Factory(provider);
    }

    public static GetChatIntroSlidesUseCase newInstance(ChatIntroRepository chatIntroRepository) {
        return new GetChatIntroSlidesUseCase(chatIntroRepository);
    }
}
