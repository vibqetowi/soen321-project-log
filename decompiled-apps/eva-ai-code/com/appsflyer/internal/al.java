package com.appsflyer.internal;

import com.appsflyer.AFLogger;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class al {
    private final a valueOf = new a() { // from class: com.appsflyer.internal.al.4
        @Override // com.appsflyer.internal.al.a
        public final Class<?> values(String str) throws ClassNotFoundException {
            return Class.forName(str);
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface a {
        Class<?> values(String str) throws ClassNotFoundException;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String AFInAppEventType() {
        b[] values;
        for (b bVar : b.values()) {
            if (valueOf(bVar.onConversionDataSuccess)) {
                return bVar.onInstallConversionDataLoadedNative;
            }
        }
        return b.DEFAULT.onInstallConversionDataLoadedNative;
    }

    private boolean valueOf(String str) {
        try {
            this.valueOf.values(str);
            StringBuilder sb = new StringBuilder("Class: ");
            sb.append(str);
            sb.append(" is found.");
            AFLogger.AFKeystoreWrapper(sb.toString());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        } catch (Throwable th) {
            AFLogger.valueOf(th.getMessage(), th);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public enum b {
        ADOBE_AIR("android_adobe_air", "com.appsflyer.adobeair.AppsFlyerExtension"),
        ADOBE_MOBILE_SDK("android_adobe_mobile", "com.appsflyer.adobeextension.AppsFlyerAdobeExtension"),
        COCOS2DX("android_cocos2dx", "org.cocos2dx.lib.Cocos2dxActivity"),
        CORDOVA("android_cordova", "com.appsflyer.cordova.plugin.AppsFlyerPlugin"),
        DEFAULT("android_native", "android_native"),
        FLUTTER("android_flutter", "com.appsflyer.appsflyersdk.AppsflyerSdkPlugin"),
        M_PARTICLE("android_mparticle", "com.mparticle.kits.AppsFlyerKit"),
        NATIVE_SCRIPT("android_native_script", "com.tns.NativeScriptActivity"),
        REACT_NATIVE("android_reactNative", "com.appsflyer.reactnative.RNAppsFlyerModule"),
        SEGMENT("android_segment", "com.segment.analytics.android.integrations.appsflyer.AppsflyerIntegration"),
        UNITY("android_unity", "com.appsflyer.unity.AppsFlyerAndroidWrapper"),
        UNREAL_ENGINE("android_unreal", "com.epicgames.ue4.GameActivity"),
        XAMARIN("android_xamarin", "mono.android.Runtime"),
        CAPACITOR("android_capacitor", "capacitor.plugin.appsflyer.sdk.AppsFlyerPlugin");
        
        private final String onConversionDataSuccess;
        private final String onInstallConversionDataLoadedNative;

        b(String str, String str2) {
            this.onInstallConversionDataLoadedNative = str;
            this.onConversionDataSuccess = str2;
        }
    }
}
