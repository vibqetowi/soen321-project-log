package com.appsflyer.internal;

import com.appsflyer.AFLogger;
/* loaded from: classes.dex */
public final class AFb1vSDK {
    private final AFa1vSDK AFInAppEventParameterName = new AFa1vSDK() { // from class: com.appsflyer.internal.AFb1vSDK.4
        @Override // com.appsflyer.internal.AFb1vSDK.AFa1vSDK
        public final Class<?> valueOf(String str) {
            return Class.forName(str);
        }
    };

    /* loaded from: classes.dex */
    public interface AFa1vSDK {
        Class<?> valueOf(String str);
    }

    /* loaded from: classes.dex */
    public enum AFa1ySDK {
        ADOBE_AIR("android_adobe_air", "com.appsflyer.adobeair.AppsFlyerExtension"),
        ADOBE_MOBILE_SDK("android_adobe_mobile", "com.appsflyer.adobeextension.AppsFlyerAdobeExtension"),
        COCOS2DX("android_cocos2dx", "org.cocos2dx.lib.Cocos2dxActivity"),
        CORDOVA("android_cordova", "com.appsflyer.cordova.plugin.AppsFlyerPlugin"),
        DEFAULT("android_native", "android_native"),
        FLUTTER("android_flutter", "com.appsflyer.appsflyersdk.AppsflyerSdkPlugin"),
        M_PARTICLE("android_mparticle", "com.mparticle.kits.AppsFlyerKit"),
        NATIVE_SCRIPT("android_native_script", "com.tns.NativeScriptActivity"),
        EXPO("android_expo", "expo.modules.devmenu.react.DevMenuAwareReactActivity"),
        REACT_NATIVE("android_reactNative", "com.appsflyer.reactnative.RNAppsFlyerModule"),
        UNITY("android_unity", "com.appsflyer.unity.AppsFlyerAndroidWrapper"),
        UNREAL_ENGINE("android_unreal", "com.epicgames.ue4.GameActivity"),
        XAMARIN("android_xamarin", "mono.android.Runtime"),
        CAPACITOR("android_capacitor", "capacitor.plugin.appsflyer.sdk.AppsFlyerPlugin");
        
        private final String AFLogger$LogLevel;
        private final String onInstallConversionDataLoadedNative;

        AFa1ySDK(String str, String str2) {
            this.AFLogger$LogLevel = str;
            this.onInstallConversionDataLoadedNative = str2;
        }
    }

    public final String valueOf() {
        AFa1ySDK[] values;
        for (AFa1ySDK aFa1ySDK : AFa1ySDK.values()) {
            if (valueOf(aFa1ySDK.onInstallConversionDataLoadedNative)) {
                return aFa1ySDK.AFLogger$LogLevel;
            }
        }
        return AFa1ySDK.DEFAULT.AFLogger$LogLevel;
    }

    private boolean valueOf(String str) {
        try {
            this.AFInAppEventParameterName.valueOf(str);
            StringBuilder sb2 = new StringBuilder("Class: ");
            sb2.append(str);
            sb2.append(" is found.");
            AFLogger.afRDLog(sb2.toString());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        } catch (Throwable th2) {
            AFLogger.afErrorLog(th2.getMessage(), th2);
            return false;
        }
    }
}
