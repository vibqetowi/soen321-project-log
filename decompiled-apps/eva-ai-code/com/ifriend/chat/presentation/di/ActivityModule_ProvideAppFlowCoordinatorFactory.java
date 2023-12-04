package com.ifriend.chat.presentation.di;

import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.chat.api.ChatScreenFactory;
import com.ifriend.chat.domain.navigation.GenerateBotAvatarScreenFactory;
import com.ifriend.chat.presentation.ui.diary.fragments.DiaryScreenFactory;
import com.ifriend.internal_notifications.handler.InternalNotificationHandler;
import com.ifriend.presentation.navigation.AppFlowCoordinator;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ActivityModule_ProvideAppFlowCoordinatorFactory implements Factory<AppFlowCoordinator> {
    private final Provider<ChatScreenFactory> chatScreenFactoryProvider;
    private final Provider<DiaryScreenFactory> diaryScreenFactoryProvider;
    private final Provider<GenerateBotAvatarScreenFactory> generateBotAvatarScreenFactoryProvider;
    private final Provider<InternalNotificationHandler> internalNotificationHandlerProvider;
    private final ActivityModule module;
    private final Provider<RouterProvider> routerProvider;

    public ActivityModule_ProvideAppFlowCoordinatorFactory(ActivityModule activityModule, Provider<RouterProvider> provider, Provider<ChatScreenFactory> provider2, Provider<InternalNotificationHandler> provider3, Provider<GenerateBotAvatarScreenFactory> provider4, Provider<DiaryScreenFactory> provider5) {
        this.module = activityModule;
        this.routerProvider = provider;
        this.chatScreenFactoryProvider = provider2;
        this.internalNotificationHandlerProvider = provider3;
        this.generateBotAvatarScreenFactoryProvider = provider4;
        this.diaryScreenFactoryProvider = provider5;
    }

    @Override // javax.inject.Provider
    public AppFlowCoordinator get() {
        return provideAppFlowCoordinator(this.module, this.routerProvider.get(), this.chatScreenFactoryProvider.get(), this.internalNotificationHandlerProvider.get(), this.generateBotAvatarScreenFactoryProvider.get(), this.diaryScreenFactoryProvider.get());
    }

    public static ActivityModule_ProvideAppFlowCoordinatorFactory create(ActivityModule activityModule, Provider<RouterProvider> provider, Provider<ChatScreenFactory> provider2, Provider<InternalNotificationHandler> provider3, Provider<GenerateBotAvatarScreenFactory> provider4, Provider<DiaryScreenFactory> provider5) {
        return new ActivityModule_ProvideAppFlowCoordinatorFactory(activityModule, provider, provider2, provider3, provider4, provider5);
    }

    public static AppFlowCoordinator provideAppFlowCoordinator(ActivityModule activityModule, RouterProvider routerProvider, ChatScreenFactory chatScreenFactory, InternalNotificationHandler internalNotificationHandler, GenerateBotAvatarScreenFactory generateBotAvatarScreenFactory, DiaryScreenFactory diaryScreenFactory) {
        return (AppFlowCoordinator) Preconditions.checkNotNullFromProvides(activityModule.provideAppFlowCoordinator(routerProvider, chatScreenFactory, internalNotificationHandler, generateBotAvatarScreenFactory, diaryScreenFactory));
    }
}
