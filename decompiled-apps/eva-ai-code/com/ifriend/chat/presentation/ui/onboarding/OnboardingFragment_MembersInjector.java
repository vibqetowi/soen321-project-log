package com.ifriend.chat.presentation.ui.onboarding;

import coil.ImageLoader;
import com.ifriend.base.di.AppImageLoader;
import com.ifriend.presentation.features.onboarding.flow.viewmodel.OnboardingFlowViewModelFactory;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class OnboardingFragment_MembersInjector implements MembersInjector<OnboardingFragment> {
    private final Provider<OnboardingFlowViewModelFactory> factoryProvider;
    private final Provider<ImageLoader> imageLoaderProvider;

    public OnboardingFragment_MembersInjector(Provider<OnboardingFlowViewModelFactory> provider, Provider<ImageLoader> provider2) {
        this.factoryProvider = provider;
        this.imageLoaderProvider = provider2;
    }

    public static MembersInjector<OnboardingFragment> create(Provider<OnboardingFlowViewModelFactory> provider, Provider<ImageLoader> provider2) {
        return new OnboardingFragment_MembersInjector(provider, provider2);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(OnboardingFragment onboardingFragment) {
        injectFactory(onboardingFragment, this.factoryProvider.get());
        injectImageLoader(onboardingFragment, this.imageLoaderProvider.get());
    }

    public static void injectFactory(OnboardingFragment onboardingFragment, OnboardingFlowViewModelFactory onboardingFlowViewModelFactory) {
        onboardingFragment.factory = onboardingFlowViewModelFactory;
    }

    @AppImageLoader
    public static void injectImageLoader(OnboardingFragment onboardingFragment, ImageLoader imageLoader) {
        onboardingFragment.imageLoader = imageLoader;
    }
}
