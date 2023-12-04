package com.ifriend.chat.presentation.ui.internalNotifications;

import android.content.res.Resources;
import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.chat.domain.navigation.GenerateBotAvatarScreenFactory;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class NotificationToSnackbarMapper_Factory implements Factory<NotificationToSnackbarMapper> {
    private final Provider<GenerateBotAvatarScreenFactory> generateBotAvatarScreenFactoryProvider;
    private final Provider<Resources> resourcesProvider;
    private final Provider<RouterProvider> routerProvider;

    public NotificationToSnackbarMapper_Factory(Provider<Resources> provider, Provider<RouterProvider> provider2, Provider<GenerateBotAvatarScreenFactory> provider3) {
        this.resourcesProvider = provider;
        this.routerProvider = provider2;
        this.generateBotAvatarScreenFactoryProvider = provider3;
    }

    @Override // javax.inject.Provider
    public NotificationToSnackbarMapper get() {
        return newInstance(this.resourcesProvider.get(), this.routerProvider.get(), this.generateBotAvatarScreenFactoryProvider.get());
    }

    public static NotificationToSnackbarMapper_Factory create(Provider<Resources> provider, Provider<RouterProvider> provider2, Provider<GenerateBotAvatarScreenFactory> provider3) {
        return new NotificationToSnackbarMapper_Factory(provider, provider2, provider3);
    }

    public static NotificationToSnackbarMapper newInstance(Resources resources, RouterProvider routerProvider, GenerateBotAvatarScreenFactory generateBotAvatarScreenFactory) {
        return new NotificationToSnackbarMapper(resources, routerProvider, generateBotAvatarScreenFactory);
    }
}
