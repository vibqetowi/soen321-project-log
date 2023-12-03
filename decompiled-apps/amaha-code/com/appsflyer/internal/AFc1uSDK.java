package com.appsflyer.internal;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.R;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.SessionManager;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class AFc1uSDK {
    private static String AFInAppEventParameterName = null;
    private static String AFInAppEventType = null;
    private static String AFKeystoreWrapper = null;
    private static int AFLogger$LogLevel = 1;
    private static int afDebugLog;
    private static int afRDLog;
    private static String valueOf;
    private static String values;
    private final AppsFlyerProperties AFLogger;
    private final AFb1zSDK afErrorLog;
    private final AFb1aSDK afInfoLog;

    static {
        boolean z10;
        AFInAppEventParameterName();
        AFInAppEventParameterName = "https://%smonitorsdk.%s/remote-debug?app_id=";
        AFInAppEventType = "https://cdn-settings.%s/android/v1/%s/settings";
        valueOf = "https://cdn-testsettings.%s/android/v1/%s/settings";
        AFKeystoreWrapper = "https://%sgcdsdk.%s/install_data/v4.0/";
        values = "https://%sonelink.%s/shortlink-sdk/v2";
        int i6 = afDebugLog + 59;
        AFLogger$LogLevel = i6 % 128;
        if (i6 % 2 == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return;
        }
        int i10 = 31 / 0;
    }

    public AFc1uSDK(AFb1zSDK aFb1zSDK, AFb1aSDK aFb1aSDK, AppsFlyerProperties appsFlyerProperties) {
        this.afErrorLog = aFb1zSDK;
        this.afInfoLog = aFb1aSDK;
        this.AFLogger = appsFlyerProperties;
    }

    public static void AFInAppEventParameterName() {
        afRDLog = 194;
    }

    public final AFc1wSDK<String> AFInAppEventType(String str) {
        AFb1wSDK aFb1wSDK = new AFb1wSDK(str, null, "GET", Collections.emptyMap(), false);
        aFb1wSDK.afDebugLog = Constants.TIMEOUT_MS;
        aFb1wSDK.AFKeystoreWrapper = false;
        AFc1wSDK<String> AFInAppEventParameterName2 = AFInAppEventParameterName(aFb1wSDK, new AFc1oSDK());
        int i6 = AFLogger$LogLevel + 33;
        afDebugLog = i6 % 128;
        int i10 = i6 % 2;
        return AFInAppEventParameterName2;
    }

    public final AFc1wSDK<String> AFKeystoreWrapper(AFa1tSDK aFa1tSDK, String str) {
        try {
            AFc1wSDK<String> AFInAppEventParameterName2 = AFInAppEventParameterName(new AFb1wSDK(aFa1tSDK.afErrorLog, (byte[]) ((Class) AFa1vSDK.values(62 - KeyEvent.normalizeMetaState(0), (char) Color.argb(0, 0, 0, 0), KeyEvent.normalizeMetaState(0) + 31)).getMethod("AFKeystoreWrapper", AFa1tSDK.class, String.class).invoke(null, aFa1tSDK, str), "POST", Collections.emptyMap(), aFa1tSDK.AFKeystoreWrapper()), new AFc1oSDK());
            int i6 = AFLogger$LogLevel + R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu;
            afDebugLog = i6 % 128;
            int i10 = i6 % 2;
            return AFInAppEventParameterName2;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public final AFc1wSDK<String> valueOf(Map<String, Object> map, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format("https://%sars.%s/api/v2/android/validate_subscription?app_id=", AppsFlyerLib.getInstance().getHostPrefix(), AFb1xSDK.AFKeystoreWrapper().getHostName()));
        sb2.append(this.afInfoLog.AFKeystoreWrapper.values.getPackageName());
        try {
            AFc1wSDK<String> AFInAppEventParameterName2 = AFInAppEventParameterName(new AFb1wSDK(sb2.toString(), (byte[]) ((Class) AFa1vSDK.values(TextUtils.getOffsetBefore("", 0) + 62, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), 31 - View.MeasureSpec.makeMeasureSpec(0, 0))).getMethod("AFKeystoreWrapper", Map.class, String.class).invoke(null, map, str), "POST", Collections.emptyMap(), true), new AFc1oSDK());
            int i6 = afDebugLog + 71;
            AFLogger$LogLevel = i6 % 128;
            if ((i6 % 2 == 0 ? (char) 21 : 'V') != 21) {
                return AFInAppEventParameterName2;
            }
            int i10 = 94 / 0;
            return AFInAppEventParameterName2;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public final AFc1wSDK<AFb1sSDK> values(boolean z10, String str, int i6) {
        AFb1wSDK aFb1wSDK = new AFb1wSDK(AFInAppEventParameterName(z10, str), "GET");
        aFb1wSDK.afDebugLog = 1500;
        AFc1wSDK<AFb1sSDK> AFInAppEventParameterName2 = AFInAppEventParameterName(aFb1wSDK, new AFc1rSDK());
        int i10 = afDebugLog + 69;
        AFLogger$LogLevel = i10 % 128;
        int i11 = i10 % 2;
        return AFInAppEventParameterName2;
    }

    public final AFc1wSDK<String> AFInAppEventParameterName(Map<String, Object> map, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format("https://%sviap.%s/api/v1/android/validate_purchase?app_id=", AppsFlyerLib.getInstance().getHostPrefix(), AFb1xSDK.AFKeystoreWrapper().getHostName()));
        sb2.append(this.afInfoLog.AFKeystoreWrapper.values.getPackageName());
        try {
            AFc1wSDK<String> AFInAppEventParameterName2 = AFInAppEventParameterName(new AFb1wSDK(sb2.toString(), (byte[]) ((Class) AFa1vSDK.values(61 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getWindowTouchSlop() >> 8) + 31)).getMethod("AFKeystoreWrapper", Map.class, String.class).invoke(null, map, str), "POST", Collections.emptyMap(), true), new AFc1oSDK());
            int i6 = AFLogger$LogLevel + 67;
            afDebugLog = i6 % 128;
            if ((i6 % 2 != 0 ? '?' : '!') != '?') {
                return AFInAppEventParameterName2;
            }
            throw null;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public final AFc1wSDK<String> AFKeystoreWrapper(String str, Map<String, String> map, String str2, UUID uuid, String str3) {
        String obj = uuid.toString();
        HashMap hashMap = new HashMap();
        hashMap.put("ttl", "-1");
        hashMap.put(SessionManager.KEY_UUID, obj);
        hashMap.put("data", map);
        hashMap.put("meta", AFKeystoreWrapper());
        if ((str2 != null ? 'X' : '4') == 'X') {
            int i6 = afDebugLog + R.styleable.AppCompatTheme_textColorSearchUrl;
            AFLogger$LogLevel = i6 % 128;
            char c10 = i6 % 2 == 0 ? 'E' : '*';
            hashMap.put("brand_domain", str2);
            if (c10 == 'E') {
                throw null;
            }
        }
        String jSONObject = AFa1pSDK.values(hashMap).toString();
        HashMap hashMap2 = new HashMap();
        hashMap2.put(AFInAppEventParameterName(12 - TextUtils.indexOf("", "", 0, 0), 290 - (ViewConfiguration.getKeyRepeatDelay() >> 16), true, View.getDefaultSize(0, 0) + 5, "\t\ufff3ￍ\u0006￡\u0005\u0012\u0015\u0014\u0001\u000e\u0007").intern(), AFKeystoreWrapper(str3, obj, "POST", jSONObject));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format(values, AppsFlyerLib.getInstance().getHostPrefix(), AFb1xSDK.AFKeystoreWrapper().getHostName()));
        sb2.append("/");
        sb2.append(str);
        return AFInAppEventParameterName(new AFb1wSDK(sb2.toString(), jSONObject.getBytes(Charset.forName("UTF-8")), "POST", hashMap2, false), new AFc1oSDK(), true);
    }

    public final AFc1wSDK<Map<String, Object>> valueOf(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format(AFKeystoreWrapper, AppsFlyerLib.getInstance().getHostPrefix(), AFb1xSDK.AFKeystoreWrapper().getHostName()));
        sb2.append(this.afInfoLog.AFKeystoreWrapper.values.getPackageName());
        sb2.append(str);
        sb2.append("?devkey=");
        sb2.append(str2);
        sb2.append("&device_id=");
        sb2.append(AFb1uSDK.values(new WeakReference(this.afInfoLog.AFKeystoreWrapper.values)));
        String obj = sb2.toString();
        HashMap hashMap = new HashMap();
        hashMap.put("Connection", "close");
        AFb1wSDK aFb1wSDK = new AFb1wSDK(obj, null, "GET", hashMap, false);
        aFb1wSDK.afDebugLog = Constants.TIMEOUT_MS;
        AFc1wSDK<Map<String, Object>> AFInAppEventParameterName2 = AFInAppEventParameterName(aFb1wSDK, new AFc1vSDK());
        int i6 = afDebugLog + 63;
        AFLogger$LogLevel = i6 % 128;
        if ((i6 % 2 == 0 ? '2' : '\n') != '2') {
            return AFInAppEventParameterName2;
        }
        int i10 = 29 / 0;
        return AFInAppEventParameterName2;
    }

    public final AFc1wSDK<String> AFInAppEventParameterName(Map<String, Object> map) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format(AFInAppEventParameterName, AppsFlyerLib.getInstance().getHostPrefix(), AFb1xSDK.AFKeystoreWrapper().getHostName()));
        sb2.append(this.afInfoLog.AFKeystoreWrapper.values.getPackageName());
        AFc1wSDK<String> AFInAppEventParameterName2 = AFInAppEventParameterName(new AFb1wSDK(sb2.toString(), new JSONObject(map).toString().getBytes(), "POST", Collections.emptyMap(), false), new AFc1oSDK());
        int i6 = AFLogger$LogLevel + R.styleable.AppCompatTheme_windowActionModeOverlay;
        afDebugLog = i6 % 128;
        if ((i6 % 2 != 0 ? '5' : '[') != '5') {
            return AFInAppEventParameterName2;
        }
        throw null;
    }

    public final AFc1wSDK<Map<String, String>> AFInAppEventParameterName(String str, String str2, UUID uuid, String str3) {
        String obj = uuid.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format(values, AppsFlyerLib.getInstance().getHostPrefix(), AFb1xSDK.AFKeystoreWrapper().getHostName()));
        sb2.append("/");
        sb2.append(str);
        sb2.append("?id=");
        sb2.append(str2);
        String obj2 = sb2.toString();
        Map<String, Object> AFKeystoreWrapper2 = AFKeystoreWrapper();
        String valueOf2 = String.valueOf(AFKeystoreWrapper2.get("build_number"));
        HashMap hashMap = new HashMap();
        hashMap.put("Af-UUID", uuid.toString());
        hashMap.put("Af-Meta-Sdk-Ver", valueOf2);
        hashMap.put("Af-Meta-Counter", String.valueOf(AFKeystoreWrapper2.get("counter")));
        hashMap.put("Af-Meta-Model", String.valueOf(AFKeystoreWrapper2.get("model")));
        hashMap.put("Af-Meta-Platform", String.valueOf(AFKeystoreWrapper2.get("platformextension")));
        hashMap.put("Af-Meta-System-Version", String.valueOf(AFKeystoreWrapper2.get("sdk")));
        hashMap.put(AFInAppEventParameterName(12 - (ViewConfiguration.getEdgeSlop() >> 16), View.combineMeasuredStates(0, 0) + 290, true, 5 - ((Process.getThreadPriority(0) + 20) >> 6), "\t\ufff3ￍ\u0006￡\u0005\u0012\u0015\u0014\u0001\u000e\u0007").intern(), AFKeystoreWrapper(str3, obj, "GET", obj, str, str2, valueOf2));
        AFc1wSDK<Map<String, String>> AFInAppEventParameterName2 = AFInAppEventParameterName(new AFb1wSDK(obj2, null, "GET", hashMap, false), new AFc1qSDK());
        int i6 = AFLogger$LogLevel + 49;
        afDebugLog = i6 % 128;
        if ((i6 % 2 != 0 ? 'A' : ' ') != ' ') {
            int i10 = 37 / 0;
            return AFInAppEventParameterName2;
        }
        return AFInAppEventParameterName2;
    }

    private Map<String, Object> AFKeystoreWrapper() {
        HashMap hashMap = new HashMap();
        hashMap.put("build_number", "6.9.1");
        hashMap.put("counter", Integer.valueOf(this.afInfoLog.values.valueOf("appsFlyerCount")));
        hashMap.put("model", Build.MODEL);
        hashMap.put(AFInAppEventParameterName((ViewConfiguration.getScrollDefaultDelay() >> 16) + 5, 297 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), false, 2 - View.getDefaultSize(0, 0), "\u0007�\ufffb\u000b\ufffa").intern(), Build.BRAND);
        hashMap.put("sdk", Integer.toString(Build.VERSION.SDK_INT));
        Context context = this.afInfoLog.AFKeystoreWrapper.values;
        hashMap.put("app_version_name", AFb1wSDK.AFInAppEventParameterName(context, context.getPackageName()));
        hashMap.put("app_id", this.afInfoLog.AFKeystoreWrapper.values.getPackageName());
        hashMap.put("platformextension", new AFb1vSDK().valueOf());
        int i6 = afDebugLog + 29;
        AFLogger$LogLevel = i6 % 128;
        int i10 = i6 % 2;
        return hashMap;
    }

    public final AFc1wSDK<String> valueOf(AFe1ySDK aFe1ySDK) {
        AFc1wSDK<String> AFInAppEventParameterName2 = AFInAppEventParameterName(new AFb1wSDK(aFe1ySDK.afErrorLog, aFe1ySDK.AFInAppEventType(), "POST", Collections.emptyMap(), true), new AFc1oSDK());
        int i6 = afDebugLog + R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle;
        AFLogger$LogLevel = i6 % 128;
        if (!(i6 % 2 == 0)) {
            return AFInAppEventParameterName2;
        }
        throw null;
    }

    private boolean valueOf() {
        int i6 = AFLogger$LogLevel + 5;
        afDebugLog = i6 % 128;
        int i10 = i6 % 2;
        if ((!this.AFLogger.getBoolean(AppsFlyerProperties.HTTP_CACHE, true) ? 'B' : '&') != 'B') {
            return false;
        }
        int i11 = AFLogger$LogLevel + 83;
        afDebugLog = i11 % 128;
        if (i11 % 2 == 0) {
            return true;
        }
        throw null;
    }

    private <T> AFc1wSDK<T> AFInAppEventParameterName(AFb1wSDK aFb1wSDK, AFc1pSDK<T> aFc1pSDK) {
        int i6 = AFLogger$LogLevel + 73;
        afDebugLog = i6 % 128;
        int i10 = i6 % 2;
        AFc1wSDK<T> AFInAppEventParameterName2 = AFInAppEventParameterName(aFb1wSDK, aFc1pSDK, valueOf());
        int i11 = AFLogger$LogLevel + R.styleable.AppCompatTheme_textColorSearchUrl;
        afDebugLog = i11 % 128;
        int i12 = i11 % 2;
        return AFInAppEventParameterName2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
        if ("appsflyer.com".equals(r0) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
        if ((!"appsflyer.com".equals(r0)) != true) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String AFInAppEventParameterName(boolean z10, String str) {
        String hostName;
        boolean z11;
        String str2;
        int i6 = AFLogger$LogLevel + 57;
        afDebugLog = i6 % 128;
        if (i6 % 2 != 0) {
            hostName = AppsFlyerLib.getInstance().getHostName();
            int i10 = 49 / 0;
        } else {
            hostName = AppsFlyerLib.getInstance().getHostName();
        }
        if (z10) {
            int i11 = afDebugLog + 91;
            AFLogger$LogLevel = i11 % 128;
            if (i11 % 2 != 0) {
                str2 = valueOf;
            } else {
                throw null;
            }
        } else {
            str2 = AFInAppEventType;
        }
        Object[] objArr = new Object[2];
        if ((z11 ? 'F' : (char) 0) != 'F') {
            hostName = "appsflyersdk.com";
        }
        objArr[0] = hostName;
        objArr[1] = str;
        return String.format(str2, objArr);
    }

    private static String AFKeystoreWrapper(String str, String str2, String... strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        arrayList.add(1, "v2");
        String AFInAppEventType2 = AFb1tSDK.AFInAppEventType((String[]) arrayList.toArray(new String[0]));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        sb2.append("v2");
        String AFInAppEventType3 = AFb1tSDK.AFInAppEventType(AFInAppEventType2, sb2.toString());
        int i6 = AFLogger$LogLevel + 53;
        afDebugLog = i6 % 128;
        if (!(i6 % 2 == 0)) {
            int i10 = 1 / 0;
            return AFInAppEventType3;
        }
        return AFInAppEventType3;
    }

    private <T> AFc1wSDK<T> AFInAppEventParameterName(AFb1wSDK aFb1wSDK, AFc1pSDK<T> aFc1pSDK, boolean z10) {
        aFb1wSDK.AFInAppEventParameterName = z10;
        AFc1wSDK<T> aFc1wSDK = new AFc1wSDK<>(aFb1wSDK, this.afErrorLog.AFInAppEventType, aFc1pSDK);
        int i6 = afDebugLog + 81;
        AFLogger$LogLevel = i6 % 128;
        int i10 = i6 % 2;
        return aFc1wSDK;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r10 = r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String AFInAppEventParameterName(int i6, int i10, boolean z10, int i11, String str) {
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
                cArr3[i13] = (char) (cArr3[i13] - afRDLog);
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
}
