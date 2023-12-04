package com.ifriend.chat.presentation.di;

import com.ifriend.chat.domain.navigation.GenerateBotAvatarScreenFactory;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
/* loaded from: classes6.dex */
public final class GenerateAvatarModule_Companion_ProvideGenerateBotAvatarRouteFactoryFactory implements Factory<GenerateBotAvatarScreenFactory> {
    @Override // javax.inject.Provider
    public GenerateBotAvatarScreenFactory get() {
        return provideGenerateBotAvatarRouteFactory();
    }

    public static GenerateAvatarModule_Companion_ProvideGenerateBotAvatarRouteFactoryFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static GenerateBotAvatarScreenFactory provideGenerateBotAvatarRouteFactory() {
        return (GenerateBotAvatarScreenFactory) Preconditions.checkNotNullFromProvides(GenerateAvatarModule.Companion.provideGenerateBotAvatarRouteFactory());
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final GenerateAvatarModule_Companion_ProvideGenerateBotAvatarRouteFactoryFactory INSTANCE = new GenerateAvatarModule_Companion_ProvideGenerateBotAvatarRouteFactoryFactory();

        private InstanceHolder() {
        }
    }
}
