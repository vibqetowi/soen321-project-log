package com.ifriend.chat.new_chat.list;

import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.chat.new_chat.list.imageLoader.ImageLoader;
import com.ifriend.chat.new_chat.list.player.AudioMessageChatAnalytics;
import com.ifriend.chat.new_chat.list.player.AudioPlayer;
import com.ifriend.chat.new_chat.list.viewModel.factory.ChatViewModelFactory;
import com.ifriend.common_utils.Logger;
import com.ifriend.domain.infrastucture.InternetConnection;
import com.ifriend.internal_notifications.register.InternalNotificationHandlersRegister;
import com.ifriend.ui.base.BaseFragment_MembersInjector;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatListFragment_MembersInjector implements MembersInjector<ChatListFragment> {
    private final Provider<AudioMessageChatAnalytics> audioAnalyticsProvider;
    private final Provider<AudioPlayer> audioPlayerProvider;
    private final Provider<ImageLoader> imageLoaderProvider;
    private final Provider<InternalNotificationHandlersRegister> internalNotificationHandlersRegisterProvider;
    private final Provider<InternetConnection> internetConnectionProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<RouterProvider> routerProvider;
    private final Provider<ChatViewModelFactory> viewModelFactoryProvider;

    public ChatListFragment_MembersInjector(Provider<InternetConnection> provider, Provider<InternalNotificationHandlersRegister> provider2, Provider<Logger> provider3, Provider<RouterProvider> provider4, Provider<AudioPlayer> provider5, Provider<AudioMessageChatAnalytics> provider6, Provider<ImageLoader> provider7, Provider<ChatViewModelFactory> provider8) {
        this.internetConnectionProvider = provider;
        this.internalNotificationHandlersRegisterProvider = provider2;
        this.loggerProvider = provider3;
        this.routerProvider = provider4;
        this.audioPlayerProvider = provider5;
        this.audioAnalyticsProvider = provider6;
        this.imageLoaderProvider = provider7;
        this.viewModelFactoryProvider = provider8;
    }

    public static MembersInjector<ChatListFragment> create(Provider<InternetConnection> provider, Provider<InternalNotificationHandlersRegister> provider2, Provider<Logger> provider3, Provider<RouterProvider> provider4, Provider<AudioPlayer> provider5, Provider<AudioMessageChatAnalytics> provider6, Provider<ImageLoader> provider7, Provider<ChatViewModelFactory> provider8) {
        return new ChatListFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ChatListFragment chatListFragment) {
        BaseFragment_MembersInjector.injectInternetConnection(chatListFragment, this.internetConnectionProvider.get());
        BaseFragment_MembersInjector.injectInternalNotificationHandlersRegister(chatListFragment, this.internalNotificationHandlersRegisterProvider.get());
        BaseFragment_MembersInjector.injectLogger(chatListFragment, this.loggerProvider.get());
        BaseFragment_MembersInjector.injectRouterProvider(chatListFragment, this.routerProvider.get());
        injectAudioPlayer(chatListFragment, this.audioPlayerProvider.get());
        injectAudioAnalytics(chatListFragment, this.audioAnalyticsProvider.get());
        injectImageLoader(chatListFragment, this.imageLoaderProvider.get());
        injectViewModelFactory(chatListFragment, this.viewModelFactoryProvider.get());
    }

    public static void injectAudioPlayer(ChatListFragment chatListFragment, AudioPlayer audioPlayer) {
        chatListFragment.audioPlayer = audioPlayer;
    }

    public static void injectAudioAnalytics(ChatListFragment chatListFragment, AudioMessageChatAnalytics audioMessageChatAnalytics) {
        chatListFragment.audioAnalytics = audioMessageChatAnalytics;
    }

    public static void injectImageLoader(ChatListFragment chatListFragment, ImageLoader imageLoader) {
        chatListFragment.imageLoader = imageLoader;
    }

    public static void injectViewModelFactory(ChatListFragment chatListFragment, ChatViewModelFactory chatViewModelFactory) {
        chatListFragment.viewModelFactory = chatViewModelFactory;
    }
}
