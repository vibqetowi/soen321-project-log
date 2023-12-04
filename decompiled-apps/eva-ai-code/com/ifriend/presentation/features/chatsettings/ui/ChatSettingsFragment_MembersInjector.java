package com.ifriend.presentation.features.chatsettings.ui;

import coil.ImageLoader;
import com.ifriend.base.di.AppImageLoader;
import com.ifriend.presentation.features.chatsettings.viewmodel.ChatSettingsViewModelFactory;
import com.ifriend.presentation.navigation.AppFlowCoordinator;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatSettingsFragment_MembersInjector implements MembersInjector<ChatSettingsFragment> {
    private final Provider<AppFlowCoordinator> flowCoordinatorProvider;
    private final Provider<ImageLoader> imageLoaderProvider;
    private final Provider<ChatSettingsViewModelFactory.Factory> viewModelFactoryProvider;

    public ChatSettingsFragment_MembersInjector(Provider<ChatSettingsViewModelFactory.Factory> provider, Provider<ImageLoader> provider2, Provider<AppFlowCoordinator> provider3) {
        this.viewModelFactoryProvider = provider;
        this.imageLoaderProvider = provider2;
        this.flowCoordinatorProvider = provider3;
    }

    public static MembersInjector<ChatSettingsFragment> create(Provider<ChatSettingsViewModelFactory.Factory> provider, Provider<ImageLoader> provider2, Provider<AppFlowCoordinator> provider3) {
        return new ChatSettingsFragment_MembersInjector(provider, provider2, provider3);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ChatSettingsFragment chatSettingsFragment) {
        injectViewModelFactory(chatSettingsFragment, this.viewModelFactoryProvider.get());
        injectImageLoader(chatSettingsFragment, this.imageLoaderProvider.get());
        injectFlowCoordinator(chatSettingsFragment, this.flowCoordinatorProvider.get());
    }

    public static void injectViewModelFactory(ChatSettingsFragment chatSettingsFragment, ChatSettingsViewModelFactory.Factory factory) {
        chatSettingsFragment.viewModelFactory = factory;
    }

    @AppImageLoader
    public static void injectImageLoader(ChatSettingsFragment chatSettingsFragment, ImageLoader imageLoader) {
        chatSettingsFragment.imageLoader = imageLoader;
    }

    public static void injectFlowCoordinator(ChatSettingsFragment chatSettingsFragment, AppFlowCoordinator appFlowCoordinator) {
        chatSettingsFragment.flowCoordinator = appFlowCoordinator;
    }
}
