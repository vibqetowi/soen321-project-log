package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.R;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.theinnerhour.b2b.utils.SessionManager;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Locale;
/* loaded from: classes.dex */
public final class AFd1rSDK extends AFd1uSDK {
    private static int AFLogger$LogLevel = 0;
    private static int getLevel = 54;
    private static int onInstallConversionFailureNative = 1;
    private final AFb1bSDK afWarnLog;
    private final String init;

    public AFd1rSDK(String str, AFc1zSDK aFc1zSDK) {
        super(new AFd1eSDK(aFc1zSDK.AFLogger$LogLevel().values), aFc1zSDK, str);
        this.afWarnLog = aFc1zSDK.AFLogger$LogLevel();
        this.init = str;
    }

    private void afWarnLog() {
        int i6 = AFLogger$LogLevel + R.styleable.AppCompatTheme_windowActionModeOverlay;
        onInstallConversionFailureNative = i6 % 128;
        int i10 = i6 % 2;
        this.AFVersionDeclaration.AFKeystoreWrapper("sentRegisterRequestToAF", true);
        AFLogger.afDebugLog("[register] Successfully registered for Uninstall Tracking");
        int i11 = AFLogger$LogLevel + 33;
        onInstallConversionFailureNative = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r10 = r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String values(int i6, int i10, boolean z10, int i11, String str) {
        char[] cArr;
        String str2;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (AFf1qSDK.AFInAppEventType) {
            char[] cArr3 = new char[i6];
            AFf1qSDK.AFKeystoreWrapper = 0;
            while (true) {
                int i12 = AFf1qSDK.AFKeystoreWrapper;
                if (i12 >= i6) {
                    break;
                }
                AFf1qSDK.values = cArr2[i12];
                cArr3[AFf1qSDK.AFKeystoreWrapper] = (char) (AFf1qSDK.values + i10);
                int i13 = AFf1qSDK.AFKeystoreWrapper;
                cArr3[i13] = (char) (cArr3[i13] - getLevel);
                AFf1qSDK.AFKeystoreWrapper = i13 + 1;
            }
            if (i11 > 0) {
                AFf1qSDK.valueOf = i11;
                char[] cArr4 = new char[i6];
                System.arraycopy(cArr3, 0, cArr4, 0, i6);
                int i14 = AFf1qSDK.valueOf;
                System.arraycopy(cArr4, 0, cArr3, i6 - i14, i14);
                int i15 = AFf1qSDK.valueOf;
                System.arraycopy(cArr4, i15, cArr3, 0, i6 - i15);
            }
            if (z10) {
                char[] cArr5 = new char[i6];
                AFf1qSDK.AFKeystoreWrapper = 0;
                while (true) {
                    int i16 = AFf1qSDK.AFKeystoreWrapper;
                    if (i16 >= i6) {
                        break;
                    }
                    cArr5[i16] = cArr3[(i6 - i16) - 1];
                    AFf1qSDK.AFKeystoreWrapper = i16 + 1;
                }
                cArr3 = cArr5;
            }
            str2 = new String(cArr3);
        }
        return str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
        if ((r0 != null) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
        r3 = com.appsflyer.internal.AFd1rSDK.AFLogger$LogLevel + 41;
        com.appsflyer.internal.AFd1rSDK.onInstallConversionFailureNative = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
        if (r0.isSuccessful() == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
        if (r0 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
        afWarnLog();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r0 != null) goto L21;
     */
    @Override // com.appsflyer.internal.AFc1aSDK, com.appsflyer.internal.AFc1lSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AFInAppEventParameterName() {
        ResponseNetwork responseNetwork;
        int i6 = onInstallConversionFailureNative + 27;
        AFLogger$LogLevel = i6 % 128;
        if (i6 % 2 != 0) {
            super.AFInAppEventParameterName();
            responseNetwork = this.afDebugLog;
            int i10 = 74 / 0;
        } else {
            super.AFInAppEventParameterName();
            responseNetwork = this.afDebugLog;
        }
        int i11 = AFLogger$LogLevel + R.styleable.AppCompatTheme_windowFixedWidthMinor;
        onInstallConversionFailureNative = i11 % 128;
        if (!(i11 % 2 == 0)) {
            return;
        }
        int i12 = 69 / 0;
    }

    @Override // com.appsflyer.internal.AFd1uSDK, com.appsflyer.internal.AFc1aSDK
    public final boolean afRDLog() {
        int i6 = AFLogger$LogLevel;
        int i10 = i6 + 17;
        onInstallConversionFailureNative = i10 % 128;
        int i11 = i10 % 2;
        int i12 = i6 + 63;
        onInstallConversionFailureNative = i12 % 128;
        int i13 = i12 % 2;
        return false;
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final void AFInAppEventParameterName(AFa1tSDK aFa1tSDK) {
        int i6 = onInstallConversionFailureNative + 3;
        AFLogger$LogLevel = i6 % 128;
        int i10 = i6 % 2;
        super.AFInAppEventParameterName(aFa1tSDK);
        Context context = this.afWarnLog.values;
        AFb1xSDK AFKeystoreWrapper = AFb1xSDK.AFKeystoreWrapper();
        if (context != null) {
            if (!AFKeystoreWrapper.AFInAppEventParameterName()) {
                PackageManager packageManager = context.getPackageManager();
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
                    aFa1tSDK.AFKeystoreWrapper("app_version_code", Integer.toString(packageInfo.versionCode));
                    aFa1tSDK.AFKeystoreWrapper("app_version_name", packageInfo.versionName);
                    aFa1tSDK.AFKeystoreWrapper("app_name", packageManager.getApplicationLabel(packageInfo.applicationInfo).toString());
                    aFa1tSDK.AFKeystoreWrapper("installDate", AFb1xSDK.valueOf(new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US), packageInfo.firstInstallTime));
                } catch (Throwable th2) {
                    AFLogger.afErrorLog("Exception while collecting application version info.", th2);
                }
                AFb1xSDK.values(context, aFa1tSDK.AFInAppEventParameterName());
                String AFInAppEventType = AFb1xSDK.AFInAppEventType();
                if (!(AFInAppEventType == null)) {
                    aFa1tSDK.AFKeystoreWrapper("appUserId", AFInAppEventType);
                }
                try {
                    aFa1tSDK.AFKeystoreWrapper("model", Build.MODEL);
                    aFa1tSDK.AFKeystoreWrapper(values(5 - (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 157, false, 1 - (ViewConfiguration.getJumpTapTimeout() >> 16), "�\ufffb\u000b\ufffa\u0007").intern(), Build.BRAND);
                } catch (Throwable th3) {
                    AFLogger.afErrorLog("Exception while collecting device brand and model.", th3);
                }
                if ((AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false) ? '\b' : '!') != '!') {
                    aFa1tSDK.AFKeystoreWrapper(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
                    int i11 = onInstallConversionFailureNative + 63;
                    AFLogger$LogLevel = i11 % 128;
                    int i12 = i11 % 2;
                }
                AFa1uSDK valueOf = AFb1zSDK.valueOf(context.getContentResolver());
                if (valueOf != null) {
                    aFa1tSDK.AFKeystoreWrapper("amazon_aid", valueOf.AFInAppEventParameterName);
                    aFa1tSDK.AFKeystoreWrapper("amazon_aid_limit", String.valueOf(valueOf.values));
                }
                String string = AppsFlyerProperties.getInstance().getString("advertiserId");
                if (string != null) {
                    int i13 = AFLogger$LogLevel + R.styleable.AppCompatTheme_windowActionBar;
                    onInstallConversionFailureNative = i13 % 128;
                    int i14 = i13 % 2;
                    aFa1tSDK.AFKeystoreWrapper("advertiserId", string);
                }
                aFa1tSDK.AFKeystoreWrapper("devkey", ((AFc1aSDK) this).AFLogger.values);
                aFa1tSDK.AFKeystoreWrapper(SessionManager.KEY_UID, AFb1uSDK.values(new WeakReference(context)));
                aFa1tSDK.AFKeystoreWrapper("af_gcm_token", this.init);
                aFa1tSDK.AFKeystoreWrapper("launch_counter", Integer.toString(this.AFVersionDeclaration.valueOf("appsFlyerCount")));
                aFa1tSDK.AFKeystoreWrapper("sdk", Integer.toString(Build.VERSION.SDK_INT));
                String AFInAppEventType2 = AFKeystoreWrapper.AFInAppEventType(context);
                if (AFInAppEventType2 != null) {
                    int i15 = AFLogger$LogLevel + 19;
                    onInstallConversionFailureNative = i15 % 128;
                    char c10 = i15 % 2 != 0 ? '`' : '\b';
                    aFa1tSDK.AFKeystoreWrapper(AppsFlyerProperties.CHANNEL, AFInAppEventType2);
                    if (c10 == '`') {
                        return;
                    }
                    throw null;
                }
                return;
            }
            AFLogger.afInfoLog("CustomerUserId not set, Tracking is disabled", true);
            throw new IllegalStateException("CustomerUserId not set, register is not sent");
        }
        throw new IllegalStateException("Context is not provided, can't send register request");
    }
}
