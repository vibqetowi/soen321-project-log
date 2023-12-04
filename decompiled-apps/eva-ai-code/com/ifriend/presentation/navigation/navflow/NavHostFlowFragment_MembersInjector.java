package com.ifriend.presentation.navigation.navflow;

import coil.ImageLoader;
import com.ifriend.base.di.AppImageLoader;
import com.ifriend.presentation.navigation.AppFlowCoordinator;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class NavHostFlowFragment_MembersInjector implements MembersInjector<NavHostFlowFragment> {
    private final Provider<AppFlowCoordinator> flowCoordinatorProvider;
    private final Provider<ImageLoader> imageLoaderProvider;

    public NavHostFlowFragment_MembersInjector(Provider<AppFlowCoordinator> provider, Provider<ImageLoader> provider2) {
        this.flowCoordinatorProvider = provider;
        this.imageLoaderProvider = provider2;
    }

    public static MembersInjector<NavHostFlowFragment> create(Provider<AppFlowCoordinator> provider, Provider<ImageLoader> provider2) {
        return new NavHostFlowFragment_MembersInjector(provider, provider2);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(NavHostFlowFragment navHostFlowFragment) {
        injectFlowCoordinator(navHostFlowFragment, this.flowCoordinatorProvider.get());
        injectImageLoader(navHostFlowFragment, this.imageLoaderProvider.get());
    }

    public static void injectFlowCoordinator(NavHostFlowFragment navHostFlowFragment, AppFlowCoordinator appFlowCoordinator) {
        navHostFlowFragment.flowCoordinator = appFlowCoordinator;
    }

    @AppImageLoader
    public static void injectImageLoader(NavHostFlowFragment navHostFlowFragment, ImageLoader imageLoader) {
        navHostFlowFragment.imageLoader = imageLoader;
    }
}
