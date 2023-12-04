package com.ifriend.app;

import com.ifriend.analytics.AnalyticsEngine;
import com.ifriend.app.appsflyer.AppsflyerDeepLinksManager;
import com.ifriend.data.toggle.AvatarInPushToggle;
import com.ifriend.data.toggle.AvatarInRetentionPushToggle;
import com.ifriend.domain.infrastucture.InternetConnection;
import com.ifriend.domain.socket.notifications.AppNotifier;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class App_MembersInjector implements MembersInjector<App> {
    private final Provider<AnalyticsEngine> analyticsEngineProvider;
    private final Provider<AppNotifier> appNotifierProvider;
    private final Provider<AppsflyerDeepLinksManager> appsflyerDeepLinksManagerProvider;
    private final Provider<AvatarInPushToggle> avatarInPushToggleProvider;
    private final Provider<AvatarInRetentionPushToggle> avatarInRetentionPushToggleProvider;
    private final Provider<InternetConnection> internetConnectionProvider;

    public App_MembersInjector(Provider<AppNotifier> provider, Provider<AvatarInRetentionPushToggle> provider2, Provider<AvatarInPushToggle> provider3, Provider<AnalyticsEngine> provider4, Provider<InternetConnection> provider5, Provider<AppsflyerDeepLinksManager> provider6) {
        this.appNotifierProvider = provider;
        this.avatarInRetentionPushToggleProvider = provider2;
        this.avatarInPushToggleProvider = provider3;
        this.analyticsEngineProvider = provider4;
        this.internetConnectionProvider = provider5;
        this.appsflyerDeepLinksManagerProvider = provider6;
    }

    public static MembersInjector<App> create(Provider<AppNotifier> provider, Provider<AvatarInRetentionPushToggle> provider2, Provider<AvatarInPushToggle> provider3, Provider<AnalyticsEngine> provider4, Provider<InternetConnection> provider5, Provider<AppsflyerDeepLinksManager> provider6) {
        return new App_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(App app) {
        injectAppNotifier(app, this.appNotifierProvider.get());
        injectAvatarInRetentionPushToggle(app, this.avatarInRetentionPushToggleProvider.get());
        injectAvatarInPushToggle(app, this.avatarInPushToggleProvider.get());
        injectAnalyticsEngine(app, this.analyticsEngineProvider.get());
        injectInternetConnection(app, this.internetConnectionProvider.get());
        injectAppsflyerDeepLinksManager(app, this.appsflyerDeepLinksManagerProvider.get());
    }

    public static void injectAppNotifier(App app, AppNotifier appNotifier) {
        app.appNotifier = appNotifier;
    }

    public static void injectAvatarInRetentionPushToggle(App app, AvatarInRetentionPushToggle avatarInRetentionPushToggle) {
        app.avatarInRetentionPushToggle = avatarInRetentionPushToggle;
    }

    public static void injectAvatarInPushToggle(App app, AvatarInPushToggle avatarInPushToggle) {
        app.avatarInPushToggle = avatarInPushToggle;
    }

    public static void injectAnalyticsEngine(App app, AnalyticsEngine analyticsEngine) {
        app.analyticsEngine = analyticsEngine;
    }

    public static void injectInternetConnection(App app, InternetConnection internetConnection) {
        app.internetConnection = internetConnection;
    }

    public static void injectAppsflyerDeepLinksManager(App app, AppsflyerDeepLinksManager appsflyerDeepLinksManager) {
        app.appsflyerDeepLinksManager = appsflyerDeepLinksManager;
    }
}
