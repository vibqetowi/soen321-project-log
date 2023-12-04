package com.ifriend.app.di;

import com.ifriend.app.PremiumIconDisabler;
import com.ifriend.domain.useCases.user.get.GetUserUseCase;
import com.ifriend.icon_switcher.PremiumAppIconManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class AppModule_ProvidePremiumIconDisablerFactory implements Factory<PremiumIconDisabler> {
    private final Provider<CoroutineScope> coroutineScopeProvider;
    private final Provider<GetUserUseCase> getUserUseCaseProvider;
    private final AppModule module;
    private final Provider<PremiumAppIconManager> premiumAppIconManagerProvider;

    public AppModule_ProvidePremiumIconDisablerFactory(AppModule appModule, Provider<GetUserUseCase> provider, Provider<PremiumAppIconManager> provider2, Provider<CoroutineScope> provider3) {
        this.module = appModule;
        this.getUserUseCaseProvider = provider;
        this.premiumAppIconManagerProvider = provider2;
        this.coroutineScopeProvider = provider3;
    }

    @Override // javax.inject.Provider
    public PremiumIconDisabler get() {
        return providePremiumIconDisabler(this.module, this.getUserUseCaseProvider.get(), this.premiumAppIconManagerProvider.get(), this.coroutineScopeProvider.get());
    }

    public static AppModule_ProvidePremiumIconDisablerFactory create(AppModule appModule, Provider<GetUserUseCase> provider, Provider<PremiumAppIconManager> provider2, Provider<CoroutineScope> provider3) {
        return new AppModule_ProvidePremiumIconDisablerFactory(appModule, provider, provider2, provider3);
    }

    public static PremiumIconDisabler providePremiumIconDisabler(AppModule appModule, GetUserUseCase getUserUseCase, PremiumAppIconManager premiumAppIconManager, CoroutineScope coroutineScope) {
        return (PremiumIconDisabler) Preconditions.checkNotNullFromProvides(appModule.providePremiumIconDisabler(getUserUseCase, premiumAppIconManager, coroutineScope));
    }
}
