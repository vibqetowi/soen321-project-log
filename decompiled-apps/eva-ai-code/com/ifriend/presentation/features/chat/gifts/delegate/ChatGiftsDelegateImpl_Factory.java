package com.ifriend.presentation.features.chat.gifts.delegate;

import com.ifriend.data.toggle.ChatGiftsStoreToggle;
import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.logic.chat.gifts.ChatGiftsUseCase;
import com.ifriend.domain.logic.chat.permissions.CheckChatPermissionsUseCase;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.features.chat.gifts.analytics.ChatGiftAnalytics;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatGiftsDelegateImpl_Factory implements Factory<ChatGiftsDelegateImpl> {
    private final Provider<AppEventsEmitter> appEventsEmitterProvider;
    private final Provider<BotRepository> botRepositoryProvider;
    private final Provider<ChatGiftAnalytics> chatGiftAnalyticsProvider;
    private final Provider<ChatGiftsMapper> chatGiftsMapperProvider;
    private final Provider<ChatGiftsStoreToggle> chatGiftsStoreToggleProvider;
    private final Provider<ChatGiftsUseCase> chatGiftsUseCaseProvider;
    private final Provider<CheckChatPermissionsUseCase> checkChatPermissionsUseCaseProvider;

    public ChatGiftsDelegateImpl_Factory(Provider<ChatGiftsStoreToggle> provider, Provider<ChatGiftsUseCase> provider2, Provider<ChatGiftsMapper> provider3, Provider<ChatGiftAnalytics> provider4, Provider<AppEventsEmitter> provider5, Provider<CheckChatPermissionsUseCase> provider6, Provider<BotRepository> provider7) {
        this.chatGiftsStoreToggleProvider = provider;
        this.chatGiftsUseCaseProvider = provider2;
        this.chatGiftsMapperProvider = provider3;
        this.chatGiftAnalyticsProvider = provider4;
        this.appEventsEmitterProvider = provider5;
        this.checkChatPermissionsUseCaseProvider = provider6;
        this.botRepositoryProvider = provider7;
    }

    @Override // javax.inject.Provider
    public ChatGiftsDelegateImpl get() {
        return newInstance(this.chatGiftsStoreToggleProvider.get(), this.chatGiftsUseCaseProvider.get(), this.chatGiftsMapperProvider.get(), this.chatGiftAnalyticsProvider.get(), this.appEventsEmitterProvider.get(), this.checkChatPermissionsUseCaseProvider.get(), this.botRepositoryProvider.get());
    }

    public static ChatGiftsDelegateImpl_Factory create(Provider<ChatGiftsStoreToggle> provider, Provider<ChatGiftsUseCase> provider2, Provider<ChatGiftsMapper> provider3, Provider<ChatGiftAnalytics> provider4, Provider<AppEventsEmitter> provider5, Provider<CheckChatPermissionsUseCase> provider6, Provider<BotRepository> provider7) {
        return new ChatGiftsDelegateImpl_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static ChatGiftsDelegateImpl newInstance(ChatGiftsStoreToggle chatGiftsStoreToggle, ChatGiftsUseCase chatGiftsUseCase, ChatGiftsMapper chatGiftsMapper, ChatGiftAnalytics chatGiftAnalytics, AppEventsEmitter appEventsEmitter, CheckChatPermissionsUseCase checkChatPermissionsUseCase, BotRepository botRepository) {
        return new ChatGiftsDelegateImpl(chatGiftsStoreToggle, chatGiftsUseCase, chatGiftsMapper, chatGiftAnalytics, appEventsEmitter, checkChatPermissionsUseCase, botRepository);
    }
}
