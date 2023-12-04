package com.ifriend.app.appsflyer;

import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.facebook.login.LoginLogger;
import com.ifriend.app.App;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
/* compiled from: AppsFlyerInitDelegate.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\u0011\u0010\n\u001a\u00020\u000bH\u0016R\u00020\f¢\u0006\u0002\u0010\rR#\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/ifriend/app/appsflyer/AppsFlyerInitDelegateImpl;", "Lcom/ifriend/app/appsflyer/AppsFlyerInitDelegate;", "()V", "appsFlyer", "Lcom/appsflyer/AppsFlyerLib;", "kotlin.jvm.PlatformType", "getAppsFlyer", "()Lcom/appsflyer/AppsFlyerLib;", "appsFlyer$delegate", "Lkotlin/Lazy;", "initAppsFlyer", "", "Lcom/ifriend/app/App;", "(Lcom/ifriend/app/App;)V", "Companion", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppsFlyerInitDelegateImpl implements AppsFlyerInitDelegate {
    @Deprecated
    public static final String AF_DEV_KEY = "cu6EjpAwPbbjVcbt8c2FBW";
    private static final Companion Companion = new Companion(null);
    private final Lazy appsFlyer$delegate = LazyKt.lazy(AppsFlyerInitDelegateImpl$appsFlyer$2.INSTANCE);

    /* compiled from: AppsFlyerInitDelegate.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ifriend/app/appsflyer/AppsFlyerInitDelegateImpl$Companion;", "", "()V", "AF_DEV_KEY", "", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppsFlyerLib getAppsFlyer() {
        return (AppsFlyerLib) this.appsFlyer$delegate.getValue();
    }

    @Override // com.ifriend.app.appsflyer.AppsFlyerInitDelegate
    public void initAppsFlyer(final App context_receiver_0) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        AppsFlyerConversionListener appsFlyerConversionListener = new AppsFlyerConversionListener() { // from class: com.ifriend.app.appsflyer.AppsFlyerInitDelegateImpl$initAppsFlyer$conversionDataListener$1
            @Override // com.appsflyer.AppsFlyerConversionListener
            public void onConversionDataSuccess(Map<String, Object> map) {
                AppsFlyerLib appsFlyer;
                if (map != null) {
                    AppsFlyerInitDelegateImpl appsFlyerInitDelegateImpl = AppsFlyerInitDelegateImpl.this;
                    App app = context_receiver_0;
                    Map<String, Object> mapOf = MapsKt.mapOf(new Pair("status", "success"), new Pair("type", "onInstallConversionDataLoaded"), new Pair("data", new JSONObject((Map<?, ?>) MapsKt.toMap(map))));
                    appsFlyer = appsFlyerInitDelegateImpl.getAppsFlyer();
                    appsFlyer.logEvent(app.getApplicationContext(), "onInstallConversionDataLoaded", mapOf);
                }
            }

            @Override // com.appsflyer.AppsFlyerConversionListener
            public void onConversionDataFail(String str) {
                AppsFlyerLib appsFlyer;
                if (str != null) {
                    AppsFlyerInitDelegateImpl appsFlyerInitDelegateImpl = AppsFlyerInitDelegateImpl.this;
                    App app = context_receiver_0;
                    Map<String, Object> mapOf = MapsKt.mapOf(new Pair("status", LoginLogger.EVENT_EXTRAS_FAILURE), new Pair("type", "onInstallConversionFailure"), new Pair("data", str));
                    appsFlyer = appsFlyerInitDelegateImpl.getAppsFlyer();
                    appsFlyer.logEvent(app.getApplicationContext(), "onInstallConversionDataLoaded", mapOf);
                }
            }

            @Override // com.appsflyer.AppsFlyerConversionListener
            public void onAppOpenAttribution(Map<String, String> map) {
                AppsFlyerLib appsFlyer;
                if (map != null) {
                    AppsFlyerInitDelegateImpl appsFlyerInitDelegateImpl = AppsFlyerInitDelegateImpl.this;
                    App app = context_receiver_0;
                    Map<String, Object> mapOf = MapsKt.mapOf(new Pair("status", "success"), new Pair("type", "onAppOpenAttribution"), new Pair("data", new JSONObject((Map<?, ?>) MapsKt.toMap(map))));
                    appsFlyer = appsFlyerInitDelegateImpl.getAppsFlyer();
                    appsFlyer.logEvent(app.getApplicationContext(), "onAppOpenAttribution", mapOf);
                }
            }

            @Override // com.appsflyer.AppsFlyerConversionListener
            public void onAttributionFailure(String str) {
                AppsFlyerLib appsFlyer;
                if (str != null) {
                    AppsFlyerInitDelegateImpl appsFlyerInitDelegateImpl = AppsFlyerInitDelegateImpl.this;
                    App app = context_receiver_0;
                    Map<String, Object> mapOf = MapsKt.mapOf(new Pair("status", LoginLogger.EVENT_EXTRAS_FAILURE), new Pair("type", "onAttributionFailure"), new Pair("data", str));
                    appsFlyer = appsFlyerInitDelegateImpl.getAppsFlyer();
                    appsFlyer.logEvent(app.getApplicationContext(), "onInstallConversionDataLoaded", mapOf);
                }
            }
        };
        AppsFlyerLib appsFlyer = getAppsFlyer();
        appsFlyer.init(AF_DEV_KEY, appsFlyerConversionListener, context_receiver_0.getApplicationContext());
        appsFlyer.start(context_receiver_0.getApplicationContext());
        final AppsflyerDeepLinksManager appsflyerDeepLinksManager = context_receiver_0.getAppsflyerDeepLinksManager();
        appsFlyer.subscribeForDeepLink(new DeepLinkListener() { // from class: com.ifriend.app.appsflyer.AppsFlyerInitDelegateImpl$$ExternalSyntheticLambda0
            @Override // com.appsflyer.deeplink.DeepLinkListener
            public final void onDeepLinking(DeepLinkResult deepLinkResult) {
                AppsflyerDeepLinksManager.this.handleDeepLink(deepLinkResult);
            }
        });
    }
}
