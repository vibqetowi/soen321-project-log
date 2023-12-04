package com.ifriend.app.di.modules.data;

import com.ifriend.domain.data.TagsProvider;
import com.ifriend.domain.toggle.FeatureToggle;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class SharedTogglesModule_ProvideNeuronsFeatureToggleFactory implements Factory<FeatureToggle> {
    private final Provider<CoroutineScope> coroutineScopeProvider;
    private final SharedTogglesModule module;
    private final Provider<TagsProvider> tagsProvider;

    public SharedTogglesModule_ProvideNeuronsFeatureToggleFactory(SharedTogglesModule sharedTogglesModule, Provider<TagsProvider> provider, Provider<CoroutineScope> provider2) {
        this.module = sharedTogglesModule;
        this.tagsProvider = provider;
        this.coroutineScopeProvider = provider2;
    }

    @Override // javax.inject.Provider
    public FeatureToggle get() {
        return provideNeuronsFeatureToggle(this.module, this.tagsProvider.get(), this.coroutineScopeProvider.get());
    }

    public static SharedTogglesModule_ProvideNeuronsFeatureToggleFactory create(SharedTogglesModule sharedTogglesModule, Provider<TagsProvider> provider, Provider<CoroutineScope> provider2) {
        return new SharedTogglesModule_ProvideNeuronsFeatureToggleFactory(sharedTogglesModule, provider, provider2);
    }

    public static FeatureToggle provideNeuronsFeatureToggle(SharedTogglesModule sharedTogglesModule, TagsProvider tagsProvider, CoroutineScope coroutineScope) {
        return (FeatureToggle) Preconditions.checkNotNullFromProvides(sharedTogglesModule.provideNeuronsFeatureToggle(tagsProvider, coroutineScope));
    }
}
