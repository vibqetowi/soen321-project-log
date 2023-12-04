package com.ifriend.presentation.features.chatstore.ui;

import coil.ImageLoader;
import com.ifriend.base.di.AppImageLoader;
import com.ifriend.presentation.features.chatstore.viewmodel.ChatsStoreViewModelFactory;
import com.ifriend.presentation.navigation.AppFlowCoordinator;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatsStoreFragment_MembersInjector implements MembersInjector<ChatsStoreFragment> {
    private final Provider<AppFlowCoordinator> flowCoordinatorProvider;
    private final Provider<ImageLoader> imageLoaderProvider;
    private final Provider<ChatsStoreViewModelFactory.Factory> viewModelFactoryProvider;

    public ChatsStoreFragment_MembersInjector(Provider<ImageLoader> provider, Provider<AppFlowCoordinator> provider2, Provider<ChatsStoreViewModelFactory.Factory> provider3) {
        this.imageLoaderProvider = provider;
        this.flowCoordinatorProvider = provider2;
        this.viewModelFactoryProvider = provider3;
    }

    public static MembersInjector<ChatsStoreFragment> create(Provider<ImageLoader> provider, Provider<AppFlowCoordinator> provider2, Provider<ChatsStoreViewModelFactory.Factory> provider3) {
        return new ChatsStoreFragment_MembersInjector(provider, provider2, provider3);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ChatsStoreFragment chatsStoreFragment) {
        injectImageLoader(chatsStoreFragment, this.imageLoaderProvider.get());
        injectFlowCoordinator(chatsStoreFragment, this.flowCoordinatorProvider.get());
        injectViewModelFactory(chatsStoreFragment, this.viewModelFactoryProvider.get());
    }

    @AppImageLoader
    public static void injectImageLoader(ChatsStoreFragment chatsStoreFragment, ImageLoader imageLoader) {
        chatsStoreFragment.imageLoader = imageLoader;
    }

    public static void injectFlowCoordinator(ChatsStoreFragment chatsStoreFragment, AppFlowCoordinator appFlowCoordinator) {
        chatsStoreFragment.flowCoordinator = appFlowCoordinator;
    }

    public static void injectViewModelFactory(ChatsStoreFragment chatsStoreFragment, ChatsStoreViewModelFactory.Factory factory) {
        chatsStoreFragment.viewModelFactory = factory;
    }
}
