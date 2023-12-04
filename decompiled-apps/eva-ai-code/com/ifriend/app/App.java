package com.ifriend.app;

import android.app.Application;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import coil.ImageLoader;
import com.google.firebase.FirebaseApp;
import com.ifriend.analytics.AnalyticsEngine;
import com.ifriend.app.appsflyer.AppsFlyerInitDelegate;
import com.ifriend.app.appsflyer.AppsFlyerInitDelegateImpl;
import com.ifriend.app.appsflyer.AppsflyerDeepLinksManager;
import com.ifriend.app.di.AppComponent;
import com.ifriend.base.app.BaseApp;
import com.ifriend.base.app.BaseComponentHolder;
import com.ifriend.data.toggle.AvatarInPushToggle;
import com.ifriend.data.toggle.AvatarInRetentionPushToggle;
import com.ifriend.domain.infrastucture.InternetConnection;
import com.ifriend.domain.socket.notifications.AppNotifier;
import com.jakewharton.threetenabp.AndroidThreeTen;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;
/* compiled from: App.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0012\u00104\u001a\u000205H\u0096\u0001R\u00020\u0000¢\u0006\u0002\u00106J\b\u00107\u001a\u000205H\u0016J\u0010\u00108\u001a\u0002052\u0006\u00109\u001a\u00020:H\u0016J\u0010\u0010;\u001a\u0002052\u0006\u00109\u001a\u00020:H\u0016J\b\u0010<\u001a\u000205H\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010#\u001a\u00020$8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001b\u0010)\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u0010\u001a\u0004\b+\u0010,R\u001e\u0010.\u001a\u00020/8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u0006="}, d2 = {"Lcom/ifriend/app/App;", "Lcom/ifriend/base/app/BaseApp;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lcom/ifriend/app/appsflyer/AppsFlyerInitDelegate;", "()V", "analyticsEngine", "Lcom/ifriend/analytics/AnalyticsEngine;", "getAnalyticsEngine", "()Lcom/ifriend/analytics/AnalyticsEngine;", "setAnalyticsEngine", "(Lcom/ifriend/analytics/AnalyticsEngine;)V", "appComponent", "Lcom/ifriend/app/di/AppComponent;", "getAppComponent", "()Lcom/ifriend/app/di/AppComponent;", "appComponent$delegate", "Lkotlin/Lazy;", "appNotifier", "Lcom/ifriend/domain/socket/notifications/AppNotifier;", "getAppNotifier", "()Lcom/ifriend/domain/socket/notifications/AppNotifier;", "setAppNotifier", "(Lcom/ifriend/domain/socket/notifications/AppNotifier;)V", "appsflyerDeepLinksManager", "Lcom/ifriend/app/appsflyer/AppsflyerDeepLinksManager;", "getAppsflyerDeepLinksManager", "()Lcom/ifriend/app/appsflyer/AppsflyerDeepLinksManager;", "setAppsflyerDeepLinksManager", "(Lcom/ifriend/app/appsflyer/AppsflyerDeepLinksManager;)V", "avatarInPushToggle", "Lcom/ifriend/data/toggle/AvatarInPushToggle;", "getAvatarInPushToggle", "()Lcom/ifriend/data/toggle/AvatarInPushToggle;", "setAvatarInPushToggle", "(Lcom/ifriend/data/toggle/AvatarInPushToggle;)V", "avatarInRetentionPushToggle", "Lcom/ifriend/data/toggle/AvatarInRetentionPushToggle;", "getAvatarInRetentionPushToggle", "()Lcom/ifriend/data/toggle/AvatarInRetentionPushToggle;", "setAvatarInRetentionPushToggle", "(Lcom/ifriend/data/toggle/AvatarInRetentionPushToggle;)V", "imageLoader", "Lcoil/ImageLoader;", "getImageLoader", "()Lcoil/ImageLoader;", "imageLoader$delegate", "internetConnection", "Lcom/ifriend/domain/infrastucture/InternetConnection;", "getInternetConnection", "()Lcom/ifriend/domain/infrastucture/InternetConnection;", "setInternetConnection", "(Lcom/ifriend/domain/infrastucture/InternetConnection;)V", "initAppsFlyer", "", "(Lcom/ifriend/app/App;)V", "onCreate", "onStart", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onStop", "startListenTagChanges", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class App extends BaseApp implements DefaultLifecycleObserver, AppsFlyerInitDelegate {
    @Inject
    public AnalyticsEngine analyticsEngine;
    @Inject
    public AppNotifier appNotifier;
    @Inject
    public AppsflyerDeepLinksManager appsflyerDeepLinksManager;
    @Inject
    public AvatarInPushToggle avatarInPushToggle;
    @Inject
    public AvatarInRetentionPushToggle avatarInRetentionPushToggle;
    @Inject
    public InternetConnection internetConnection;
    private final /* synthetic */ AppsFlyerInitDelegateImpl $$delegate_0 = new AppsFlyerInitDelegateImpl();
    private final Lazy imageLoader$delegate = LazyKt.lazy(new App$imageLoader$2(this));
    private final Lazy appComponent$delegate = LazyKt.lazy(new App$appComponent$2(this));

    @Override // com.ifriend.app.appsflyer.AppsFlyerInitDelegate
    public void initAppsFlyer(App context_receiver_0) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        this.$$delegate_0.initAppsFlyer(context_receiver_0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    public final AppNotifier getAppNotifier() {
        AppNotifier appNotifier = this.appNotifier;
        if (appNotifier != null) {
            return appNotifier;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appNotifier");
        return null;
    }

    public final void setAppNotifier(AppNotifier appNotifier) {
        Intrinsics.checkNotNullParameter(appNotifier, "<set-?>");
        this.appNotifier = appNotifier;
    }

    public final AvatarInRetentionPushToggle getAvatarInRetentionPushToggle() {
        AvatarInRetentionPushToggle avatarInRetentionPushToggle = this.avatarInRetentionPushToggle;
        if (avatarInRetentionPushToggle != null) {
            return avatarInRetentionPushToggle;
        }
        Intrinsics.throwUninitializedPropertyAccessException("avatarInRetentionPushToggle");
        return null;
    }

    public final void setAvatarInRetentionPushToggle(AvatarInRetentionPushToggle avatarInRetentionPushToggle) {
        Intrinsics.checkNotNullParameter(avatarInRetentionPushToggle, "<set-?>");
        this.avatarInRetentionPushToggle = avatarInRetentionPushToggle;
    }

    public final AvatarInPushToggle getAvatarInPushToggle() {
        AvatarInPushToggle avatarInPushToggle = this.avatarInPushToggle;
        if (avatarInPushToggle != null) {
            return avatarInPushToggle;
        }
        Intrinsics.throwUninitializedPropertyAccessException("avatarInPushToggle");
        return null;
    }

    public final void setAvatarInPushToggle(AvatarInPushToggle avatarInPushToggle) {
        Intrinsics.checkNotNullParameter(avatarInPushToggle, "<set-?>");
        this.avatarInPushToggle = avatarInPushToggle;
    }

    public final AnalyticsEngine getAnalyticsEngine() {
        AnalyticsEngine analyticsEngine = this.analyticsEngine;
        if (analyticsEngine != null) {
            return analyticsEngine;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analyticsEngine");
        return null;
    }

    public final void setAnalyticsEngine(AnalyticsEngine analyticsEngine) {
        Intrinsics.checkNotNullParameter(analyticsEngine, "<set-?>");
        this.analyticsEngine = analyticsEngine;
    }

    public final InternetConnection getInternetConnection() {
        InternetConnection internetConnection = this.internetConnection;
        if (internetConnection != null) {
            return internetConnection;
        }
        Intrinsics.throwUninitializedPropertyAccessException("internetConnection");
        return null;
    }

    public final void setInternetConnection(InternetConnection internetConnection) {
        Intrinsics.checkNotNullParameter(internetConnection, "<set-?>");
        this.internetConnection = internetConnection;
    }

    public final AppsflyerDeepLinksManager getAppsflyerDeepLinksManager() {
        AppsflyerDeepLinksManager appsflyerDeepLinksManager = this.appsflyerDeepLinksManager;
        if (appsflyerDeepLinksManager != null) {
            return appsflyerDeepLinksManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appsflyerDeepLinksManager");
        return null;
    }

    public final void setAppsflyerDeepLinksManager(AppsflyerDeepLinksManager appsflyerDeepLinksManager) {
        Intrinsics.checkNotNullParameter(appsflyerDeepLinksManager, "<set-?>");
        this.appsflyerDeepLinksManager = appsflyerDeepLinksManager;
    }

    private final ImageLoader getImageLoader() {
        return (ImageLoader) this.imageLoader$delegate.getValue();
    }

    public final AppComponent getAppComponent() {
        return (AppComponent) this.appComponent$delegate.getValue();
    }

    @Override // android.app.Application
    public void onCreate() {
        BaseComponentHolder.INSTANCE.setComponent(getAppComponent());
        super.onCreate();
        getAppComponent().inject(this);
        AnalyticsEngine.Companion.setInstance(getAnalyticsEngine());
        FirebaseApp.initializeApp(this);
        AndroidThreeTen.init((Application) this);
        initAppsFlyer(this);
        startListenTagChanges();
        ProcessLifecycleOwner.Companion.get().getLifecycle().addObserver(this);
        Boolean isLogging = BuildConfig.isLogging;
        Intrinsics.checkNotNullExpressionValue(isLogging, "isLogging");
        if (isLogging.booleanValue()) {
            Timber.Forest.plant(new Timber.DebugTree());
        }
    }

    private final void startListenTagChanges() {
        getAppComponent().getPremiumIconDisabler().launch();
        getAppNotifier().launch();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        getInternetConnection().startMonitorConnectivity();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        getInternetConnection().stopMonitorConnectivity();
    }
}
