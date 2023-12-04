package com.ifriend.app.di;

import android.content.Context;
import com.ifriend.analytics.di.AnalyticUseCasesModule;
import com.ifriend.analytics.di.AnalyticsModule;
import com.ifriend.analytics.impl.di.CoreAnalyticsModule;
import com.ifriend.app.AppFirebaseMessagingService;
import com.ifriend.app.PremiumIconDisabler;
import com.ifriend.app.di.features.appActivity.AppActivityModule;
import com.ifriend.app.di.features.chat.ChatApiModule;
import com.ifriend.app.di.features.long_term_notifications.LongTermNotificationModule;
import com.ifriend.app.di.features.popup.PopupModule;
import com.ifriend.app.di.modules.AudioRecordingModule;
import com.ifriend.app.di.modules.BaseAppModule;
import com.ifriend.app.di.modules.ConnectivityModule;
import com.ifriend.app.di.modules.CoreAuthModule;
import com.ifriend.app.di.modules.GoogleServicesModule;
import com.ifriend.app.di.modules.InternalNotificationsModule;
import com.ifriend.app.di.modules.LogsModule;
import com.ifriend.app.di.modules.MessagesModule;
import com.ifriend.app.di.modules.NavigationModule;
import com.ifriend.app.di.modules.RateUsModule;
import com.ifriend.app.di.modules.ValidationModule;
import com.ifriend.app.di.modules.billing.BillingModule;
import com.ifriend.app.di.modules.data.DataModule;
import com.ifriend.app.di.modules.data.DataToolsModule;
import com.ifriend.app.di.modules.data.PreferencesModule;
import com.ifriend.app.di.modules.data.TokenModule;
import com.ifriend.app.di.modules.platform.PlatformToolsModule;
import com.ifriend.app.di.modules.platform.ToolsModule;
import com.ifriend.app.di.modules.usecases.DiaryModule;
import com.ifriend.app.di.modules.usecases.LevelsModule;
import com.ifriend.app.di.modules.usecases.UseCasesModule;
import com.ifriend.app.ui.splash.SplashActivity;
import com.ifriend.base.di.BaseComponent;
import com.ifriend.icon_switcher.di.PremiumIconManagerModule;
import dagger.BindsInstance;
import dagger.Component;
import io.sentry.protocol.App;
import javax.inject.Singleton;
import kotlin.Metadata;
/* compiled from: AppComponent.kt */
@Component(modules = {AppModule.class, AppViewModelModule.class, PremiumIconManagerModule.class, AnalyticUseCasesModule.class, BaseAppModule.class, UseCasesModule.class, CoreAuthModule.class, MessagesModule.class, TokenModule.class, LogsModule.class, PreferencesModule.class, RateUsModule.class, ConnectivityModule.class, ValidationModule.class, AudioRecordingModule.class, NavigationModule.class, InternalNotificationsModule.class, PopupModule.class, LongTermNotificationModule.class, AnalyticsModule.class, ChatApiModule.class, AppActivityModule.class, DiaryModule.class, LevelsModule.class, DataModule.class, DataToolsModule.class, PlatformToolsModule.class, ToolsModule.class, CoreAnalyticsModule.class, GoogleServicesModule.class, BillingModule.class})
@Singleton
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\fJ\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\r"}, d2 = {"Lcom/ifriend/app/di/AppComponent;", "Lcom/ifriend/base/di/BaseComponent;", "getPremiumIconDisabler", "Lcom/ifriend/app/PremiumIconDisabler;", "inject", "", App.TYPE, "Lcom/ifriend/app/App;", "appFirebaseMessagingService", "Lcom/ifriend/app/AppFirebaseMessagingService;", "splashActivity", "Lcom/ifriend/app/ui/splash/SplashActivity;", "Builder", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AppComponent extends BaseComponent {

    /* compiled from: AppComponent.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00002\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ifriend/app/di/AppComponent$Builder;", "", "build", "Lcom/ifriend/app/di/AppComponent;", "context", "Landroid/content/Context;", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Component.Builder
    /* loaded from: classes6.dex */
    public interface Builder {
        AppComponent build();

        Builder context(@BindsInstance Context context);
    }

    PremiumIconDisabler getPremiumIconDisabler();

    void inject(com.ifriend.app.App app);

    void inject(AppFirebaseMessagingService appFirebaseMessagingService);

    void inject(SplashActivity splashActivity);
}
