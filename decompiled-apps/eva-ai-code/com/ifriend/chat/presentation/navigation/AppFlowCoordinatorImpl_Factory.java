package com.ifriend.chat.presentation.navigation;

import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.chat.api.ChatScreenFactory;
import com.ifriend.chat.domain.navigation.GenerateBotAvatarScreenFactory;
import com.ifriend.chat.presentation.ui.diary.fragments.DiaryScreenFactory;
import com.ifriend.internal_notifications.handler.InternalNotificationHandler;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AppFlowCoordinatorImpl_Factory implements Factory<AppFlowCoordinatorImpl> {
    private final Provider<ChatScreenFactory> chatScreenFactoryProvider;
    private final Provider<DiaryScreenFactory> diaryScreenFactoryProvider;
    private final Provider<GenerateBotAvatarScreenFactory> generateBotAvatarScreenFactoryProvider;
    private final Provider<InternalNotificationHandler> internalNotificationHandlerProvider;
    private final Provider<RouterProvider> routerProvider;

    public AppFlowCoordinatorImpl_Factory(Provider<RouterProvider> provider, Provider<ChatScreenFactory> provider2, Provider<InternalNotificationHandler> provider3, Provider<GenerateBotAvatarScreenFactory> provider4, Provider<DiaryScreenFactory> provider5) {
        this.routerProvider = provider;
        this.chatScreenFactoryProvider = provider2;
        this.internalNotificationHandlerProvider = provider3;
        this.generateBotAvatarScreenFactoryProvider = provider4;
        this.diaryScreenFactoryProvider = provider5;
    }

    @Override // javax.inject.Provider
    public AppFlowCoordinatorImpl get() {
        return newInstance(this.routerProvider.get(), this.chatScreenFactoryProvider.get(), this.internalNotificationHandlerProvider.get(), this.generateBotAvatarScreenFactoryProvider.get(), this.diaryScreenFactoryProvider.get());
    }

    public static AppFlowCoordinatorImpl_Factory create(Provider<RouterProvider> provider, Provider<ChatScreenFactory> provider2, Provider<InternalNotificationHandler> provider3, Provider<GenerateBotAvatarScreenFactory> provider4, Provider<DiaryScreenFactory> provider5) {
        return new AppFlowCoordinatorImpl_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static AppFlowCoordinatorImpl newInstance(RouterProvider routerProvider, ChatScreenFactory chatScreenFactory, InternalNotificationHandler internalNotificationHandler, GenerateBotAvatarScreenFactory generateBotAvatarScreenFactory, DiaryScreenFactory diaryScreenFactory) {
        return new AppFlowCoordinatorImpl(routerProvider, chatScreenFactory, internalNotificationHandler, generateBotAvatarScreenFactory, diaryScreenFactory);
    }
}
