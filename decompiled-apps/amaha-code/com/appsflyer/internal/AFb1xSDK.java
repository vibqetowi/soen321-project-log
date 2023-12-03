package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.media.AudioTrack;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import androidx.emoji2.text.g;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AFKeystoreWrapper;
import com.appsflyer.AFLogger;
import com.appsflyer.AFVersionDeclaration;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.R;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.attribution.RequestError;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFa1aSDK;
import com.appsflyer.internal.AFa1iSDK;
import com.appsflyer.internal.AFa1oSDK;
import com.appsflyer.internal.AFa1xSDK;
import com.appsflyer.internal.AFb1xSDK;
import com.appsflyer.internal.AFc1mSDK;
import com.appsflyer.internal.AFd1wSDK;
import com.appsflyer.internal.AFe1hSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.SessionManager;
import h5.p;
import j$.util.DesugarTimeZone;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.HttpURLConnection;
import java.net.NetworkInterface;
import java.net.URI;
import java.security.KeyStoreException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s9.e;
import v.h;
/* loaded from: classes.dex */
public final class AFb1xSDK extends AppsFlyerLib {
    public static final String AFInAppEventParameterName;
    public static volatile AppsFlyerConversionListener AFInAppEventType = null;
    static final String AFKeystoreWrapper;
    private static AFb1xSDK AFLogger$LogLevel = null;
    private static String AFVersionDeclaration = null;
    private static char[] AppsFlyerConversionListener = null;
    private static long AppsFlyerInAppPurchaseValidatorListener = 0;
    private static String afDebugLog = null;
    private static String afErrorLog = null;
    private static final String afInfoLog;
    private static String afWarnLog = null;
    private static String getLevel = null;
    private static String init = null;
    private static int onValidateInApp = 1;
    private static int onValidateInAppFailure;
    static AppsFlyerInAppPurchaseValidatorListener valueOf;
    public static final String values;
    public AFa1fSDK AFLogger;
    private final AFc1xSDK AppsFlyerLib;
    String afRDLog;
    private AFb1eSDK onAppOpenAttribution;
    private Map<Long, String> onAppOpenAttributionNative;
    private String onAttributionFailure;
    private boolean onConversionDataFail;
    private Map<String, Object> onDeepLinking;
    private String onInstallConversionDataLoadedNative;
    private SharedPreferences onResponse;
    private Application onResponseErrorNative;
    private boolean onResponseNative;
    private long onAttributionFailureNative = -1;
    private long AppsFlyer2dXConversionCallback = -1;
    private long onInstallConversionFailureNative = TimeUnit.SECONDS.toMillis(5);
    private final AFb1vSDK onDeepLinkingNative = new AFb1vSDK();
    private boolean onConversionDataSuccess = false;
    private boolean onResponseError = false;

    /* renamed from: com.appsflyer.internal.AFb1xSDK$5  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass5 implements Runnable {
        public AnonymousClass5() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void AFInAppEventParameterName() {
            try {
                AFe1vSDK aFe1vSDK = new AFe1vSDK();
                Application AFKeystoreWrapper = AFb1xSDK.AFKeystoreWrapper(AFb1xSDK.this);
                if (AFKeystoreWrapper != null) {
                    aFe1vSDK.valueOf = (Application) AFKeystoreWrapper.getApplicationContext();
                }
                AFb1xSDK aFb1xSDK = AFb1xSDK.this;
                if (AFb1xSDK.AFInAppEventParameterName(aFb1xSDK, aFe1vSDK, AFb1xSDK.valueOf(AFb1xSDK.AFKeystoreWrapper(aFb1xSDK)))) {
                    AFb1xSDK.AFKeystoreWrapper(AFb1xSDK.this, aFe1vSDK);
                }
            } catch (Throwable th2) {
                AFLogger.afErrorLog(th2.getMessage(), th2);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            AFb1xSDK.valueOf(AFb1xSDK.valueOf(AFb1xSDK.this).valueOf(), new Runnable() { // from class: com.appsflyer.internal.b
                @Override // java.lang.Runnable
                public final void run() {
                    AFb1xSDK.AnonymousClass5.this.AFInAppEventParameterName();
                }
            }, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: com.appsflyer.internal.AFb1xSDK$7  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass7 {
        static final /* synthetic */ int[] AFKeystoreWrapper;

        static {
            int[] iArr = new int[AppsFlyerProperties.EmailsCryptType.values().length];
            AFKeystoreWrapper = iArr;
            try {
                iArr[AppsFlyerProperties.EmailsCryptType.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AFKeystoreWrapper[AppsFlyerProperties.EmailsCryptType.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public class AFa1vSDK implements AFc1iSDK {
        private AFa1vSDK() {
        }

        @Override // com.appsflyer.internal.AFc1iSDK
        public final void AFInAppEventType(AFc1lSDK<?> aFc1lSDK) {
            if (aFc1lSDK instanceof AFd1sSDK) {
                AFb1xSDK.this.values().afInfoLog().AFInAppEventType(((AFd1uSDK) aFc1lSDK).afRDLog.afInfoLog);
            }
        }

        @Override // com.appsflyer.internal.AFc1iSDK
        public final void valueOf(AFc1lSDK<?> aFc1lSDK) {
        }

        public /* synthetic */ AFa1vSDK(AFb1xSDK aFb1xSDK, byte b10) {
            this();
        }

        @Override // com.appsflyer.internal.AFc1iSDK
        public final void valueOf(AFc1lSDK<?> aFc1lSDK, AFc1jSDK aFc1jSDK) {
            JSONObject AFInAppEventType;
            AFb1rSDK AFInAppEventParameterName;
            if (aFc1lSDK instanceof AFd1uSDK) {
                AFd1uSDK aFd1uSDK = (AFd1uSDK) aFc1lSDK;
                boolean z10 = aFc1lSDK instanceof AFd1sSDK;
                if (z10) {
                    AFd1sSDK aFd1sSDK = (AFd1sSDK) aFc1lSDK;
                    boolean z11 = true;
                    if (aFd1sSDK.valueOf != AFc1jSDK.SUCCESS && aFd1sSDK.values != 1) {
                        z11 = false;
                    }
                    if (z11) {
                        Context context = AFb1xSDK.valueOf(AFb1xSDK.this).values.values;
                        if (context != null) {
                            AFd1aSDK aFd1aSDK = new AFd1aSDK(aFd1sSDK, new AFc1ySDK(AFb1xSDK.valueOf(context)));
                            AFc1mSDK afErrorLog = AFb1xSDK.valueOf(AFb1xSDK.this).afErrorLog();
                            afErrorLog.AFInAppEventParameterName.execute(new AFc1mSDK.AnonymousClass3(aFd1aSDK));
                        } else {
                            throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                        }
                    }
                }
                if (aFc1jSDK == AFc1jSDK.SUCCESS) {
                    AFb1xSDK aFb1xSDK = AFb1xSDK.this;
                    aFb1xSDK.AFInAppEventParameterName(AFb1xSDK.AFKeystoreWrapper(aFb1xSDK)).valueOf("sentSuccessfully", "true");
                    if (!(aFc1lSDK instanceof AFd1rSDK) && (AFInAppEventParameterName = new AFd1iSDK(AFb1xSDK.AFKeystoreWrapper(AFb1xSDK.this)).AFInAppEventParameterName()) != null && AFInAppEventParameterName.valueOf()) {
                        String str = AFInAppEventParameterName.values;
                        AFLogger.afDebugLog("Resending Uninstall token to AF servers: ".concat(String.valueOf(str)));
                        AFd1iSDK.valueOf(str);
                    }
                    ResponseNetwork responseNetwork = aFd1uSDK.afDebugLog;
                    if (responseNetwork != null && (AFInAppEventType = AFb1nSDK.AFInAppEventType((String) responseNetwork.getBody())) != null) {
                        AFb1xSDK.values(AFb1xSDK.this, AFInAppEventType.optBoolean("send_background", false));
                    }
                    if (z10) {
                        AFb1xSDK.AFInAppEventParameterName(AFb1xSDK.this, System.currentTimeMillis());
                    }
                }
            } else if (!(aFc1lSDK instanceof AFd1aSDK) || aFc1jSDK == AFc1jSDK.SUCCESS) {
            } else {
                AFd1fSDK aFd1fSDK = new AFd1fSDK(AFb1xSDK.valueOf(AFb1xSDK.this));
                AFc1mSDK afErrorLog2 = AFb1xSDK.valueOf(AFb1xSDK.this).afErrorLog();
                afErrorLog2.AFInAppEventParameterName.execute(new AFc1mSDK.AnonymousClass3(aFd1fSDK));
            }
        }
    }

    /* loaded from: classes.dex */
    public class AFa1wSDK implements Runnable {
        private final AFa1tSDK values;

        public /* synthetic */ AFa1wSDK(AFb1xSDK aFb1xSDK, AFa1tSDK aFa1tSDK, byte b10) {
            this(aFa1tSDK);
        }

        @Override // java.lang.Runnable
        public final void run() {
            AFd1sSDK aFd1sSDK;
            if (this.values.valueOf()) {
                AFd1sSDK aFd1sSDK2 = new AFd1sSDK(this.values, AFb1xSDK.this.values());
                aFd1sSDK2.getLevel = AFb1xSDK.AFInAppEventType(AFb1xSDK.this);
                aFd1sSDK = aFd1sSDK2;
            } else {
                aFd1sSDK = new AFd1uSDK(this.values, AFb1xSDK.this.values());
            }
            AFc1mSDK afErrorLog = AFb1xSDK.this.values().afErrorLog();
            afErrorLog.AFInAppEventParameterName.execute(new AFc1mSDK.AnonymousClass3(aFd1sSDK));
        }

        private AFa1wSDK(AFa1tSDK aFa1tSDK) {
            this.values = aFa1tSDK;
        }
    }

    /* loaded from: classes.dex */
    public class AFa1xSDK implements Runnable {
        private final AFa1tSDK AFInAppEventType;

        public /* synthetic */ AFa1xSDK(AFb1xSDK aFb1xSDK, AFa1tSDK aFa1tSDK, byte b10) {
            this(aFa1tSDK);
        }

        @Override // java.lang.Runnable
        public final void run() {
            AFb1xSDK.AFKeystoreWrapper(AFb1xSDK.this, this.AFInAppEventType);
        }

        private AFa1xSDK(AFa1tSDK aFa1tSDK) {
            this.AFInAppEventType = aFa1tSDK;
        }
    }

    static {
        char c10;
        valueOf();
        AFKeystoreWrapper = "219";
        String substring = "6.9.1".substring(0, "6.9.1".lastIndexOf(AFInAppEventParameterName((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 33, (char) ((Process.getThreadPriority(0) + 20) >> 6), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1).intern()));
        values = substring;
        afDebugLog = "https://%sstats.%s/stats";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(substring);
        sb2.append("/androidevent?buildnumber=6.9.1&app_id=");
        AFInAppEventParameterName = sb2.toString();
        afErrorLog = "https://%sadrevenue.%s/api/v2/generic/v6.9.1/android?app_id=";
        StringBuilder sb3 = new StringBuilder();
        sb3.append(substring);
        sb3.append("/androidevent?app_id=");
        String obj = sb3.toString();
        afInfoLog = obj;
        StringBuilder sb4 = new StringBuilder("https://%sconversions.%s/api/v");
        sb4.append(obj);
        init = sb4.toString();
        StringBuilder sb5 = new StringBuilder("https://%slaunches.%s/api/v");
        sb5.append(obj);
        getLevel = sb5.toString();
        StringBuilder sb6 = new StringBuilder("https://%sinapps.%s/api/v");
        sb6.append(obj);
        afWarnLog = sb6.toString();
        StringBuilder sb7 = new StringBuilder("https://%sattr.%s/api/v");
        sb7.append(obj);
        AFVersionDeclaration = sb7.toString();
        valueOf = null;
        AFInAppEventType = null;
        AFLogger$LogLevel = new AFb1xSDK();
        int i6 = onValidateInApp + 69;
        onValidateInAppFailure = i6 % 128;
        if (i6 % 2 != 0) {
            c10 = '\n';
        } else {
            c10 = 0;
        }
        if (c10 != 0) {
            int i10 = 54 / 0;
        }
    }

    public AFb1xSDK() {
        Executors.newSingleThreadExecutor();
        AFVersionDeclaration.init();
        AFc1xSDK aFc1xSDK = new AFc1xSDK();
        this.AppsFlyerLib = aFc1xSDK;
        AFc1mSDK afErrorLog2 = aFc1xSDK.afErrorLog();
        afErrorLog2.AFInAppEventType.add(new AFa1vSDK(this, (byte) 0));
    }

    public static /* synthetic */ long AFInAppEventParameterName(AFb1xSDK aFb1xSDK, long j10) {
        int i6 = onValidateInAppFailure;
        int i10 = i6 + 45;
        onValidateInApp = i10 % 128;
        int i11 = i10 % 2;
        aFb1xSDK.AppsFlyer2dXConversionCallback = j10;
        int i12 = i6 + 89;
        onValidateInApp = i12 % 128;
        int i13 = i12 % 2;
        return j10;
    }

    public static /* synthetic */ Map AFInAppEventType(AFb1xSDK aFb1xSDK) {
        int i6 = onValidateInApp + 19;
        int i10 = i6 % 128;
        onValidateInAppFailure = i10;
        boolean z10 = i6 % 2 != 0;
        Map<String, Object> map = aFb1xSDK.onDeepLinking;
        if (z10) {
            throw null;
        }
        int i11 = i10 + 99;
        onValidateInApp = i11 % 128;
        int i12 = i11 % 2;
        return map;
    }

    public static /* synthetic */ Application AFKeystoreWrapper(AFb1xSDK aFb1xSDK) {
        int i6 = onValidateInAppFailure;
        int i10 = i6 + 91;
        onValidateInApp = i10 % 128;
        int i11 = i10 % 2;
        Application application = aFb1xSDK.onResponseErrorNative;
        int i12 = i6 + 85;
        onValidateInApp = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
        return application;
    }

    private boolean AFLogger() {
        int i6 = onValidateInAppFailure + 37;
        onValidateInApp = i6 % 128;
        int i10 = i6 % 2;
        Map<String, Object> map = this.onDeepLinking;
        if ((map != null ? (char) 3 : (char) 19) != 19) {
            if (!(map.isEmpty())) {
                int i11 = onValidateInApp + 1;
                onValidateInAppFailure = i11 % 128;
                if ((i11 % 2 != 0 ? 'M' : '0') != 'M') {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
        if (r1 != 22) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
        if (r1 != '>') goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
        r0 = afRDLog(valueOf(r4, "AF_PRE_INSTALL_PATH"));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String AFLogger$LogLevel(Context context) {
        File afRDLog;
        char c10;
        char c11;
        int i6 = onValidateInApp + R.styleable.AppCompatTheme_switchStyle;
        onValidateInAppFailure = i6 % 128;
        if (i6 % 2 != 0) {
            afRDLog = afRDLog(values("ro.appsflyer.preinstall.path"));
            int i10 = 45 / 0;
            if (AFKeystoreWrapper(afRDLog)) {
                c11 = 'A';
            } else {
                c11 = 22;
            }
        } else {
            afRDLog = afRDLog(values("ro.appsflyer.preinstall.path"));
            if (AFKeystoreWrapper(afRDLog)) {
                c10 = 11;
            } else {
                c10 = '>';
            }
        }
        if (AFKeystoreWrapper(afRDLog)) {
            afRDLog = afRDLog("/data/local/tmp/pre_install.appsflyer");
        }
        if (AFKeystoreWrapper(afRDLog)) {
            afRDLog = afRDLog("/etc/pre_install.appsflyer");
        }
        if (AFKeystoreWrapper(afRDLog)) {
            int i11 = onValidateInApp + R.styleable.AppCompatTheme_windowFixedHeightMinor;
            onValidateInAppFailure = i11 % 128;
            int i12 = i11 % 2;
            return null;
        }
        return AFInAppEventParameterName(afRDLog, context.getPackageName());
    }

    private String AFVersionDeclaration(Context context) {
        char c10;
        String str;
        boolean z10;
        char c11;
        int i6 = onValidateInAppFailure + 43;
        onValidateInApp = i6 % 128;
        if (i6 % 2 == 0) {
            c10 = 'Y';
        } else {
            c10 = 14;
        }
        if (c10 == 14) {
            SharedPreferences valueOf2 = valueOf(context);
            String valueOf3 = valueOf("preInstallName");
            if (valueOf3 != null) {
                return valueOf3;
            }
            if (valueOf2.contains("preInstallName")) {
                int i10 = onValidateInAppFailure + 17;
                onValidateInApp = i10 % 128;
                int i11 = i10 % 2;
                str = valueOf2.getString("preInstallName", null);
            } else {
                if (afDebugLog(context)) {
                    valueOf3 = AFLogger$LogLevel(context);
                    if (valueOf3 != null) {
                        int i12 = onValidateInApp + 61;
                        onValidateInAppFailure = i12 % 128;
                        if (i12 % 2 != 0) {
                            throw null;
                        }
                    } else {
                        valueOf3 = valueOf(context, "AF_PRE_INSTALL_NAME");
                    }
                }
                if (valueOf3 != null) {
                    AFInAppEventParameterName(context).valueOf("preInstallName", valueOf3);
                }
                str = valueOf3;
            }
            if (str != null) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                int i13 = onValidateInAppFailure + R.styleable.AppCompatTheme_windowActionBar;
                onValidateInApp = i13 % 128;
                if (i13 % 2 == 0) {
                    c11 = 31;
                } else {
                    c11 = 27;
                }
                if (c11 == 27) {
                    AFInAppEventParameterName("preInstallName", str);
                } else {
                    AFInAppEventParameterName("preInstallName", str);
                    throw null;
                }
            }
            return str;
        }
        valueOf(context);
        valueOf("preInstallName");
        throw null;
    }

    private static boolean afDebugLog(Context context) {
        int i6 = onValidateInAppFailure + 69;
        onValidateInApp = i6 % 128;
        int i10 = i6 % 2;
        if (!(valueOf(context).contains("appsFlyerCount"))) {
            int i11 = onValidateInAppFailure + R.styleable.AppCompatTheme_textColorSearchUrl;
            onValidateInApp = i11 % 128;
            int i12 = i11 % 2;
            return true;
        }
        return false;
    }

    private static void afErrorLog(Context context) {
        int i6;
        if (AFb1wSDK.AFKeystoreWrapper()) {
            AFLogger.afRDLog("OPPO device found");
            i6 = 23;
        } else {
            i6 = 18;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= i6 && !AFInAppEventType(AppsFlyerProperties.DISABLE_KEYSTORE, true)) {
            StringBuilder sb2 = new StringBuilder("OS SDK is=");
            sb2.append(i10);
            sb2.append("; use KeyStore");
            AFLogger.afRDLog(sb2.toString());
            AFKeystoreWrapper aFKeystoreWrapper = new AFKeystoreWrapper(context);
            if (!aFKeystoreWrapper.valueOf()) {
                aFKeystoreWrapper.values = AFb1uSDK.values(new WeakReference(context));
                aFKeystoreWrapper.AFInAppEventParameterName = 0;
                aFKeystoreWrapper.AFInAppEventParameterName(aFKeystoreWrapper.AFInAppEventParameterName());
            } else {
                String AFInAppEventParameterName2 = aFKeystoreWrapper.AFInAppEventParameterName();
                synchronized (aFKeystoreWrapper.AFKeystoreWrapper) {
                    aFKeystoreWrapper.AFInAppEventParameterName++;
                    AFLogger.afInfoLog("Deleting key with alias: ".concat(String.valueOf(AFInAppEventParameterName2)));
                    try {
                        synchronized (aFKeystoreWrapper.AFKeystoreWrapper) {
                            aFKeystoreWrapper.valueOf.deleteEntry(AFInAppEventParameterName2);
                        }
                    } catch (KeyStoreException e10) {
                        StringBuilder sb3 = new StringBuilder("Exception ");
                        sb3.append(e10.getMessage());
                        sb3.append(" occurred");
                        AFLogger.afErrorLog(sb3.toString(), e10);
                    }
                }
                aFKeystoreWrapper.AFInAppEventParameterName(aFKeystoreWrapper.AFInAppEventParameterName());
            }
            AFInAppEventParameterName("KSAppsFlyerId", aFKeystoreWrapper.AFInAppEventType());
            AFInAppEventParameterName("KSAppsFlyerRICounter", String.valueOf(aFKeystoreWrapper.values()));
            return;
        }
        StringBuilder sb4 = new StringBuilder("OS SDK is=");
        sb4.append(i10);
        sb4.append("; no KeyStore usage");
        AFLogger.afRDLog(sb4.toString());
    }

    private void afInfoLog(Context context) {
        this.onDeepLinking = new HashMap();
        final long currentTimeMillis = System.currentTimeMillis();
        final AFa1oSDK.AFa1zSDK aFa1zSDK = new AFa1oSDK.AFa1zSDK() { // from class: com.appsflyer.internal.AFb1xSDK.3
            @Override // com.appsflyer.internal.AFa1oSDK.AFa1zSDK
            public final void AFKeystoreWrapper(String str, String str2, String str3) {
                if (str != null) {
                    AFLogger.afInfoLog("Facebook Deferred AppLink data received: ".concat(str));
                    AFb1xSDK.AFInAppEventType(AFb1xSDK.this).put(Constants.API_COURSE_LINK, str);
                    if (str2 != null) {
                        AFb1xSDK.AFInAppEventType(AFb1xSDK.this).put("target_url", str2);
                    }
                    if (str3 != null) {
                        HashMap hashMap = new HashMap();
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("promo_code", str3);
                        hashMap.put("deeplink_context", hashMap2);
                        AFb1xSDK.AFInAppEventType(AFb1xSDK.this).put("extras", hashMap);
                    }
                } else {
                    AFb1xSDK.AFInAppEventType(AFb1xSDK.this).put(Constants.API_COURSE_LINK, "");
                }
                AFb1xSDK.AFInAppEventType(AFb1xSDK.this).put("ttr", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
            }

            @Override // com.appsflyer.internal.AFa1oSDK.AFa1zSDK
            public final void values(String str) {
                AFb1xSDK.AFInAppEventType(AFb1xSDK.this).put("error", str);
            }
        };
        try {
            p pVar = p.f17269a;
            p.class.getMethod("sdkInitialize", Context.class).invoke(null, context);
            final Class<?> cls = Class.forName("com.facebook.applinks.AppLinkData");
            Class<?> cls2 = Class.forName("com.facebook.applinks.AppLinkData$CompletionHandler");
            Method method = cls.getMethod("fetchDeferredAppLinkData", Context.class, String.class, cls2);
            Object newProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: com.appsflyer.internal.AFa1oSDK.5
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method2, Object[] objArr) {
                    String str;
                    String str2;
                    String str3;
                    Bundle bundle;
                    if (method2.getName().equals("onDeferredAppLinkDataFetched")) {
                        Object obj2 = objArr[0];
                        if (obj2 != null) {
                            Bundle bundle2 = (Bundle) Bundle.class.cast(cls.getMethod("getArgumentBundle", new Class[0]).invoke(cls.cast(obj2), new Object[0]));
                            if (bundle2 != null) {
                                str2 = bundle2.getString("com.facebook.platform.APPLINK_NATIVE_URL");
                                str3 = bundle2.getString("target_url");
                                Bundle bundle3 = bundle2.getBundle("extras");
                                if (bundle3 != null && (bundle = bundle3.getBundle("deeplink_context")) != null) {
                                    str = bundle.getString("promo_code");
                                } else {
                                    str = null;
                                }
                            } else {
                                str = null;
                                str2 = null;
                                str3 = null;
                            }
                            AFa1zSDK aFa1zSDK2 = aFa1zSDK;
                            if (aFa1zSDK2 != null) {
                                aFa1zSDK2.AFKeystoreWrapper(str2, str3, str);
                            }
                        } else {
                            AFa1zSDK aFa1zSDK3 = aFa1zSDK;
                            if (aFa1zSDK3 != null) {
                                aFa1zSDK3.AFKeystoreWrapper(null, null, null);
                            }
                        }
                        return null;
                    }
                    AFa1zSDK aFa1zSDK4 = aFa1zSDK;
                    if (aFa1zSDK4 != null) {
                        aFa1zSDK4.values("onDeferredAppLinkDataFetched invocation failed");
                    }
                    return null;
                }
            });
            String string = context.getString(context.getResources().getIdentifier("facebook_app_id", "string", context.getPackageName()));
            if ((TextUtils.isEmpty(string) ? (char) 15 : '+') != 15) {
                method.invoke(null, context, string, newProxyInstance);
                return;
            }
            int i6 = onValidateInAppFailure + 73;
            onValidateInApp = i6 % 128;
            if (i6 % 2 != 0) {
                aFa1zSDK.values("Facebook app id not defined in resources");
                return;
            }
            aFa1zSDK.values("Facebook app id not defined in resources");
            int i10 = 12 / 0;
        } catch (ClassNotFoundException e10) {
            aFa1zSDK.values(e10.toString());
        } catch (IllegalAccessException e11) {
            aFa1zSDK.values(e11.toString());
        } catch (NoSuchMethodException e12) {
            aFa1zSDK.values(e12.toString());
        } catch (InvocationTargetException e13) {
            aFa1zSDK.values(e13.toString());
        }
    }

    private static void afRDLog(Context context) {
        try {
            if ((context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.flags & 32768) != 0) {
                int i6 = onValidateInAppFailure + 79;
                onValidateInApp = i6 % 128;
                if (!(i6 % 2 == 0)) {
                    if (!(context.getResources().getIdentifier("appsflyer_backup_rules", "xml", context.getPackageName()) != 0)) {
                        AFLogger.AFInAppEventParameterName("'allowBackup' is set to true; appsflyer_backup_rules.xml not detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules");
                    } else {
                        AFLogger.afInfoLog("appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
                        return;
                    }
                } else {
                    context.getResources().getIdentifier("appsflyer_backup_rules", "xml", context.getPackageName());
                    throw null;
                }
            }
            int i10 = onValidateInAppFailure + 55;
            onValidateInApp = i10 % 128;
            int i11 = i10 % 2;
        } catch (Exception e10) {
            AFLogger.afRDLog("checkBackupRules Exception: ".concat(String.valueOf(e10)));
        }
    }

    private String afWarnLog(Context context) {
        char c10;
        boolean z10;
        int i6 = onValidateInAppFailure + 11;
        onValidateInApp = i6 % 128;
        int i10 = i6 % 2;
        SharedPreferences valueOf2 = valueOf(context);
        if (valueOf2.contains("INSTALL_STORE")) {
            c10 = 'I';
        } else {
            c10 = 'b';
        }
        String str = null;
        if (c10 != 'I') {
            if (afDebugLog(context)) {
                str = getLevel(context);
                int i11 = onValidateInApp + R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle;
                onValidateInAppFailure = i11 % 128;
                int i12 = i11 % 2;
            }
            AFInAppEventParameterName(context).valueOf("INSTALL_STORE", str);
            return str;
        }
        int i13 = onValidateInApp + 53;
        onValidateInAppFailure = i13 % 128;
        if (i13 % 2 != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return valueOf2.getString("INSTALL_STORE", null);
        }
        valueOf2.getString("INSTALL_STORE", null);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (r2 != 'A') goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
        if (r0 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
        r5 = com.appsflyer.internal.AFb1xSDK.onValidateInAppFailure + 7;
        com.appsflyer.internal.AFb1xSDK.onValidateInApp = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
        if ((r5 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
        return valueOf(r5, "AF_STORE");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String getLevel(Context context) {
        boolean z10;
        String string;
        char c10;
        int i6 = onValidateInApp + 67;
        onValidateInAppFailure = i6 % 128;
        if (i6 % 2 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            string = AppsFlyerProperties.getInstance().getString("api_store_value");
            if (string != null) {
                c10 = 'R';
            } else {
                c10 = 'A';
            }
        } else {
            string = AppsFlyerProperties.getInstance().getString("api_store_value");
            int i10 = 69 / 0;
        }
    }

    private static boolean onAppOpenAttributionNative(Context context) {
        boolean z10;
        char c10;
        char c11;
        if (context != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                    for (Network network : connectivityManager.getAllNetworks()) {
                        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                        if (networkCapabilities.hasTransport(4)) {
                            int i6 = onValidateInApp + 13;
                            onValidateInAppFailure = i6 % 128;
                            if (i6 % 2 != 0) {
                                if (!networkCapabilities.hasCapability(25)) {
                                    c10 = 1;
                                } else {
                                    c10 = '3';
                                }
                                if (c10 == 1) {
                                    int i10 = onValidateInApp + 91;
                                    onValidateInAppFailure = i10 % 128;
                                    int i11 = i10 % 2;
                                    return true;
                                }
                            } else if (!networkCapabilities.hasCapability(15)) {
                                int i102 = onValidateInApp + 91;
                                onValidateInAppFailure = i102 % 128;
                                int i112 = i102 % 2;
                                return true;
                            }
                        }
                    }
                    return false;
                } catch (Exception e10) {
                    AFLogger.afErrorLog("Failed collecting ivc data", e10);
                }
            } else {
                ArrayList arrayList = new ArrayList();
                try {
                    Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            c11 = 4;
                        } else {
                            c11 = 31;
                        }
                        if (c11 != 31) {
                            int i12 = onValidateInApp + 1;
                            onValidateInAppFailure = i12 % 128;
                            if (i12 % 2 == 0) {
                                NetworkInterface networkInterface = (NetworkInterface) it.next();
                                if (networkInterface.isUp()) {
                                    int i13 = onValidateInApp + 21;
                                    onValidateInAppFailure = i13 % 128;
                                    if (i13 % 2 != 0) {
                                        arrayList.add(networkInterface.getName());
                                        int i14 = 23 / 0;
                                    } else {
                                        arrayList.add(networkInterface.getName());
                                    }
                                }
                            } else {
                                ((NetworkInterface) it.next()).isUp();
                                throw null;
                            }
                        } else {
                            return arrayList.contains("tun0");
                        }
                    }
                } catch (Exception e11) {
                    AFLogger.afErrorLog("Failed collecting ivc data", e11);
                }
            }
        }
        return false;
    }

    private static float onInstallConversionFailureNative(Context context) {
        float f;
        int intExtra;
        int intExtra2;
        boolean z10;
        boolean z11;
        try {
            Intent registerReceiver = context.getApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            intExtra = registerReceiver.getIntExtra("level", -1);
            intExtra2 = registerReceiver.getIntExtra("scale", -1);
            z10 = false;
            if (intExtra != -1) {
                z11 = true;
            } else {
                z11 = false;
            }
        } catch (Throwable th2) {
            AFLogger.afErrorLog(th2.getMessage(), th2);
            f = 1.0f;
        }
        if (z11) {
            if (intExtra2 == -1) {
                z10 = true;
            }
            if (!z10) {
                f = (intExtra / intExtra2) * 100.0f;
                int i6 = onValidateInApp + 65;
                onValidateInAppFailure = i6 % 128;
                int i10 = i6 % 2;
                int i11 = onValidateInAppFailure + 67;
                onValidateInApp = i11 % 128;
                int i12 = i11 % 2;
                return f;
            }
            return 50.0f;
        }
        return 50.0f;
    }

    public static void valueOf() {
        AppsFlyerConversionListener = new char[]{17933, 19499, 21105, 22651, 28289, 29860, 31439, 248, 5904, 7460, 9035, 10615, '1', 6827, 4250, 3818, 1220, 12841, 'f', 2632, 5168, 7696, 10480, 13033, 15527, 18066, 20838, 23370, 25890, 28463, 31213, 33753, 36267, '.'};
        AppsFlyerInAppPurchaseValidatorListener = -5412040934617052639L;
    }

    public static /* synthetic */ boolean values(AFb1xSDK aFb1xSDK, boolean z10) {
        int i6 = onValidateInApp + 65;
        int i10 = i6 % 128;
        onValidateInAppFailure = i10;
        int i11 = i6 % 2;
        aFb1xSDK.onConversionDataSuccess = z10;
        int i12 = i10 + 11;
        onValidateInApp = i12 % 128;
        int i13 = i12 % 2;
        return z10;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void addPushNotificationDeepLinkPath(String... strArr) {
        boolean z10;
        List<String> asList = Arrays.asList(strArr);
        List<List<String>> list = AFa1sSDK.AFInAppEventParameterName().afErrorLog;
        boolean z11 = true;
        if (!list.contains(asList)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int i6 = onValidateInApp + 87;
            onValidateInAppFailure = i6 % 128;
            if (i6 % 2 == 0) {
                z11 = false;
            }
            list.add(asList);
            if (!z11) {
                int i10 = onValidateInApp + 41;
                onValidateInAppFailure = i10 % 128;
                int i11 = i10 % 2;
                return;
            }
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void anonymizeUser(boolean z10) {
        char c10;
        int i6 = onValidateInAppFailure + 7;
        onValidateInApp = i6 % 128;
        int i10 = i6 % 2;
        AFb1qSDK.AFInAppEventParameterName().AFInAppEventType("anonymizeUser", String.valueOf(z10));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, z10);
        int i11 = onValidateInAppFailure + R.styleable.AppCompatTheme_textAppearanceListItem;
        onValidateInApp = i11 % 128;
        if (i11 % 2 == 0) {
            c10 = '\f';
        } else {
            c10 = '=';
        }
        if (c10 == '=') {
            return;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void appendParametersToDeepLinkingURL(String str, Map<String, String> map) {
        char c10;
        boolean z10;
        int i6 = onValidateInApp + 87;
        onValidateInAppFailure = i6 % 128;
        if (i6 % 2 != 0) {
            c10 = 'B';
        } else {
            c10 = 'L';
        }
        if (c10 == 'L') {
            AFa1sSDK AFInAppEventParameterName2 = AFa1sSDK.AFInAppEventParameterName();
            AFInAppEventParameterName2.values = str;
            AFInAppEventParameterName2.afRDLog = map;
            int i10 = onValidateInAppFailure + R.styleable.AppCompatTheme_toolbarStyle;
            onValidateInApp = i10 % 128;
            if (i10 % 2 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return;
            }
            throw null;
        }
        AFa1sSDK AFInAppEventParameterName3 = AFa1sSDK.AFInAppEventParameterName();
        AFInAppEventParameterName3.values = str;
        AFInAppEventParameterName3.afRDLog = map;
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableFacebookDeferredApplinks(boolean z10) {
        boolean z11;
        int i6 = onValidateInApp + 51;
        int i10 = i6 % 128;
        onValidateInAppFailure = i10;
        int i11 = i6 % 2;
        this.onResponseError = z10;
        int i12 = i10 + 57;
        onValidateInApp = i12 % 128;
        if (i12 % 2 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            return;
        }
        int i13 = 96 / 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
        if (r6 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
        r6 = com.appsflyer.internal.AFb1xSDK.onValidateInAppFailure + 51;
        com.appsflyer.internal.AFb1xSDK.onValidateInApp = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
        if ((r6 % 2) != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r2 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
        r6 = 59 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0043, code lost:
        r0 = r5.AppsFlyerLib;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
        if (r6 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0047, code lost:
        r0 = r0.values;
        r1 = com.appsflyer.internal.AFb1xSDK.onValidateInAppFailure + 3;
        com.appsflyer.internal.AFb1xSDK.onValidateInApp = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
        if ((r1 % 2) != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0055, code lost:
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0058, code lost:
        if (r1 == true) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
        r0.values = r6.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0062, code lost:
        r6 = 52 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0066, code lost:
        r0.values = r6.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007f, code lost:
        return com.appsflyer.internal.AFb1uSDK.values(new java.lang.ref.WeakReference(r5.AppsFlyerLib.AFInAppEventParameterName().AFKeystoreWrapper.values));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r0 != true) goto L24;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String getAppsFlyerUID(Context context) {
        boolean z10;
        int i6 = onValidateInAppFailure + 31;
        onValidateInApp = i6 % 128;
        boolean z11 = true;
        if (i6 % 2 == 0) {
            AFb1qSDK.AFInAppEventParameterName().AFInAppEventType("getAppsFlyerUID", new String[0]);
            if (context == null) {
                z10 = false;
            } else {
                z10 = true;
            }
        } else {
            AFb1qSDK.AFInAppEventParameterName().AFInAppEventType("getAppsFlyerUID", new String[0]);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAttributionId(Context context) {
        try {
            String values2 = new AFb1ySDK(context, values()).values();
            int i6 = onValidateInApp + 79;
            onValidateInAppFailure = i6 % 128;
            int i10 = i6 % 2;
            return values2;
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Could not collect facebook attribution id. ", th2);
            return null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostName() {
        char c10;
        char c11;
        int i6 = onValidateInApp + 83;
        onValidateInAppFailure = i6 % 128;
        int i10 = i6 % 2;
        String valueOf2 = valueOf("custom_host");
        if (valueOf2 != null) {
            c10 = 31;
        } else {
            c10 = 28;
        }
        if (c10 != 31) {
            return "appsflyer.com";
        }
        int i11 = onValidateInAppFailure + R.styleable.AppCompatTheme_tooltipFrameBackground;
        onValidateInApp = i11 % 128;
        if (i11 % 2 == 0) {
            c11 = ')';
        } else {
            c11 = 30;
        }
        if (c11 == 30) {
            return valueOf2;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostPrefix() {
        char c10;
        int i6 = onValidateInApp + R.styleable.AppCompatTheme_textAppearanceListItemSmall;
        onValidateInAppFailure = i6 % 128;
        int i10 = i6 % 2;
        String valueOf2 = valueOf("custom_host_prefix");
        if (valueOf2 != null) {
            c10 = '\r';
        } else {
            c10 = '<';
        }
        if (c10 != '\r') {
            int i11 = onValidateInAppFailure + 57;
            onValidateInApp = i11 % 128;
            int i12 = i11 % 2;
            return "";
        }
        int i13 = onValidateInAppFailure + 63;
        int i14 = i13 % 128;
        onValidateInApp = i14;
        int i15 = i13 % 2;
        int i16 = i14 + 85;
        onValidateInAppFailure = i16 % 128;
        int i17 = i16 % 2;
        return valueOf2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getOutOfStore(Context context) {
        char c10;
        int i6 = onValidateInApp + 37;
        onValidateInAppFailure = i6 % 128;
        if (i6 % 2 == 0) {
            String string = AppsFlyerProperties.getInstance().getString("api_store_value");
            if (string != null) {
                c10 = 'D';
            } else {
                c10 = '\'';
            }
            boolean z10 = true;
            if (c10 != '\'') {
                int i10 = onValidateInAppFailure + 27;
                onValidateInApp = i10 % 128;
                if (i10 % 2 == 0) {
                    z10 = false;
                }
                if (z10) {
                    return string;
                }
                int i11 = 62 / 0;
                return string;
            }
            String valueOf2 = valueOf(context, "AF_STORE");
            if (valueOf2 != null) {
                z10 = false;
            }
            if (z10) {
                AFLogger.afInfoLog("No out-of-store value set");
                return null;
            }
            int i12 = onValidateInAppFailure + 65;
            onValidateInApp = i12 % 128;
            int i13 = i12 % 2;
            return valueOf2;
        }
        AppsFlyerProperties.getInstance().getString("api_store_value");
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getSdkVersion() {
        boolean z10;
        AFc1zSDK values2;
        int i6 = onValidateInAppFailure + 65;
        onValidateInApp = i6 % 128;
        if (i6 % 2 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            values2 = values();
            values2.afWarnLog().AFInAppEventType("getSdkVersion", new String[0]);
        } else {
            values2 = values();
            values2.afWarnLog().AFInAppEventType("getSdkVersion", new String[0]);
        }
        values2.AFInAppEventParameterName();
        String AFKeystoreWrapper2 = AFb1aSDK.AFKeystoreWrapper();
        int i10 = onValidateInAppFailure + 31;
        onValidateInApp = i10 % 128;
        int i11 = i10 % 2;
        return AFKeystoreWrapper2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0019, code lost:
        if (r9.onResponseNative != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001b, code lost:
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
        r9.onResponseNative = true;
        r9.AppsFlyerLib.AFVersionDeclaration().values = r10;
        com.appsflyer.internal.AFb1rSDK.AFInAppEventType(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
        if (r12 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        r9.onResponseErrorNative = (android.app.Application) r12.getApplicationContext();
        r9.AppsFlyerLib.values.values = r12.getApplicationContext();
        values().afInfoLog().AFInAppEventParameterName = java.lang.System.currentTimeMillis();
        values().afDebugLog().AFInAppEventType((com.appsflyer.internal.AFd1qSDK) null);
        r12 = values().init();
        r3 = new com.appsflyer.internal.AFe1fSDK(new com.appsflyer.internal.AFb1xSDK.AnonymousClass5(r9));
        r4 = new com.appsflyer.internal.AFb1xSDK.AnonymousClass1(r9);
        r12.AFInAppEventType(r3);
        r12.AFInAppEventType(new com.appsflyer.internal.AFe1aSDK(r4));
        r12.AFInAppEventType(new com.appsflyer.internal.AFe1gSDK(r4, values()));
        r12.AFInAppEventType(new com.appsflyer.internal.AFe1dSDK(r4, values()));
        r3 = r9.onResponseErrorNative;
        r5 = values();
        r3 = r3.getPackageManager().queryIntentContentProviders(new android.content.Intent("com.appsflyer.referrer.INSTALL_PROVIDER"), 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a7, code lost:
        if (r3 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ad, code lost:
        if (r3.isEmpty() == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b0, code lost:
        r6 = new java.util.ArrayList();
        r3 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00bd, code lost:
        if (r3.hasNext() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bf, code lost:
        r7 = r3.next().providerInfo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c7, code lost:
        if (r7 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c9, code lost:
        r6.add(new com.appsflyer.internal.AFe1jSDK(r7, r4, r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d2, code lost:
        com.appsflyer.AFLogger.afWarnLog("[Preinstall]: com.appsflyer.referrer.INSTALL_PROVIDER Action is set for non ContentProvider component");
        r7 = com.appsflyer.internal.AFb1xSDK.onValidateInAppFailure + 35;
        com.appsflyer.internal.AFb1xSDK.onValidateInApp = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e5, code lost:
        if (r6.isEmpty() != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e7, code lost:
        r12.valueOf.addAll(r6);
        r3 = new java.lang.StringBuilder("[Preinstall]: Detected ");
        r3.append(r6.size());
        r3.append(" valid preinstall provider(s)");
        com.appsflyer.AFLogger.afDebugLog(r3.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0106, code lost:
        r12 = r12.AFInAppEventType();
        r3 = r12.length;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x010c, code lost:
        if (r4 >= r3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x010e, code lost:
        r12[r4].valueOf(r9.onResponseErrorNative);
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0118, code lost:
        r9.AppsFlyerLib.AFVersionDeclaration().valueOf();
        com.appsflyer.internal.AFb1dSDK.AFInAppEventType = r9.onResponseErrorNative;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0126, code lost:
        com.appsflyer.AFLogger.afWarnLog("context is null, Google Install Referrer will be not initialized");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x012b, code lost:
        r12 = com.appsflyer.internal.AFb1qSDK.AFInAppEventParameterName();
        r3 = new java.lang.String[2];
        r3[0] = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0133, code lost:
        if (r11 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0135, code lost:
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0137, code lost:
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0138, code lost:
        if (r10 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x013a, code lost:
        r10 = "null";
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x013d, code lost:
        r10 = "conversionDataListener";
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x013f, code lost:
        r3[1] = r10;
        r12.AFInAppEventType("init", r3);
        com.appsflyer.AFLogger.AFKeystoreWrapper(java.lang.String.format("Initializing AppsFlyer SDK: (v%s.%s)", "6.9.1", com.appsflyer.internal.AFb1xSDK.AFKeystoreWrapper));
        com.appsflyer.internal.AFb1xSDK.AFInAppEventType = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x015b, code lost:
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r9.onResponseNative != false) goto L45;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AppsFlyerLib init(String str, AppsFlyerConversionListener appsFlyerConversionListener, Context context) {
        int i6 = onValidateInAppFailure + R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle;
        onValidateInApp = i6 % 128;
        if (i6 % 2 == 0) {
            int i10 = 79 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final boolean isPreInstalledApp(Context context) {
        char c10;
        try {
            if ((context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 1) != 0) {
                c10 = 'M';
            } else {
                c10 = '+';
            }
        } catch (PackageManager.NameNotFoundException e10) {
            AFLogger.afErrorLog("Could not check if app is pre installed", e10);
        }
        if (c10 != '+') {
            int i6 = onValidateInApp + R.styleable.AppCompatTheme_switchStyle;
            onValidateInAppFailure = i6 % 128;
            if (i6 % 2 != 0) {
                return false;
            }
            return true;
        }
        int i10 = onValidateInApp + 31;
        onValidateInAppFailure = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final boolean isStopped() {
        char c10;
        int i6 = onValidateInApp + 61;
        onValidateInAppFailure = i6 % 128;
        if (i6 % 2 != 0) {
            c10 = 28;
        } else {
            c10 = 23;
        }
        if (c10 == 23) {
            return this.AppsFlyerLib.AFVersionDeclaration().values();
        }
        this.AppsFlyerLib.AFVersionDeclaration().values();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map) {
        int i6 = onValidateInAppFailure + 25;
        onValidateInApp = i6 % 128;
        char c10 = i6 % 2 == 0 ? 'N' : 'V';
        logEvent(context, str, map, null);
        if (c10 == 'N') {
            int i10 = 14 / 0;
        }
        int i11 = onValidateInApp + 19;
        onValidateInAppFailure = i11 % 128;
        if ((i11 % 2 != 0 ? '_' : (char) 19) != '_') {
            return;
        }
        int i12 = 7 / 0;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logLocation(Context context, double d10, double d11) {
        char c10;
        AFb1qSDK.AFInAppEventParameterName().AFInAppEventType("logLocation", String.valueOf(d10), String.valueOf(d11));
        HashMap hashMap = new HashMap();
        hashMap.put(AFInAppEventParameterName.LONGTITUDE, Double.toString(d11));
        hashMap.put(AFInAppEventParameterName.LATITUDE, Double.toString(d10));
        values(context, AFInAppEventType.LOCATION_COORDINATES, hashMap);
        int i6 = onValidateInApp + 43;
        onValidateInAppFailure = i6 % 128;
        if (i6 % 2 != 0) {
            c10 = '&';
        } else {
            c10 = '?';
        }
        if (c10 != '?') {
            int i10 = 0 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logSession(Context context) {
        int i6 = onValidateInAppFailure + 11;
        onValidateInApp = i6 % 128;
        int i10 = i6 % 2;
        AFb1qSDK.AFInAppEventParameterName().AFInAppEventType("logSession", new String[0]);
        AFb1qSDK.AFInAppEventParameterName().afInfoLog();
        AFInAppEventParameterName(context, AFd1dSDK.logSession);
        values(context, null, null);
        int i11 = onValidateInAppFailure + R.styleable.AppCompatTheme_windowActionBar;
        onValidateInApp = i11 % 128;
        int i12 = i11 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void onPause(Context context) {
        boolean z10;
        AFa1aSDK.AFa1xSDK aFa1xSDK = AFa1aSDK.AFKeystoreWrapper;
        if (aFa1xSDK != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            int i6 = onValidateInAppFailure + 91;
            onValidateInApp = i6 % 128;
            int i10 = i6 % 2;
            aFa1xSDK.AFKeystoreWrapper(context);
            int i11 = onValidateInAppFailure + 83;
            onValidateInApp = i11 % 128;
            int i12 = i11 % 2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
        if (r2 != 'X') goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0029, code lost:
        r1 = r1 + 11;
        com.appsflyer.internal.AFb1xSDK.onValidateInAppFailure = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r6.toString().isEmpty() == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
        if (r5 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
        r6 = new java.lang.StringBuilder("Context is \"");
        r6.append(r5);
        r6.append("\"");
        com.appsflyer.internal.AFb1hSDK.AFInAppEventParameterName(r6.toString(), com.appsflyer.deeplink.DeepLinkResult.Error.NETWORK);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
        com.appsflyer.internal.AFa1sSDK.AFInAppEventParameterName();
        com.appsflyer.internal.AFa1sSDK.values(r5, new java.util.HashMap(), android.net.Uri.parse(r6.toString()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
        if (r6 != null) goto L10;
     */
    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void performOnAppAttribution(Context context, URI uri) {
        char c10;
        char c11;
        int i6 = onValidateInAppFailure + 39;
        int i10 = i6 % 128;
        onValidateInApp = i10;
        if (i6 % 2 == 0) {
            c10 = '-';
        } else {
            c10 = 'D';
        }
        if (c10 == '-') {
            int i11 = 17 / 0;
            if (uri != null) {
                c11 = 'b';
            } else {
                c11 = 'X';
            }
        }
        StringBuilder sb2 = new StringBuilder("Link is \"");
        sb2.append(uri);
        sb2.append("\"");
        AFb1hSDK.AFInAppEventParameterName(sb2.toString(), DeepLinkResult.Error.NETWORK);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void performOnDeepLinking(Intent intent, Context context) {
        char c10;
        char c11;
        if (intent == null) {
            AFb1hSDK.AFInAppEventParameterName("performOnDeepLinking was called with null intent", DeepLinkResult.Error.DEVELOPER_ERROR);
            return;
        }
        if (context == null) {
            c10 = '^';
        } else {
            c10 = 6;
        }
        boolean z10 = false;
        if (c10 != 6) {
            int i6 = onValidateInApp + 13;
            onValidateInAppFailure = i6 % 128;
            if (i6 % 2 != 0) {
                AFb1hSDK.AFInAppEventParameterName("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
                int i10 = 26 / 0;
            } else {
                AFb1hSDK.AFInAppEventParameterName("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
            }
            int i11 = onValidateInApp + R.styleable.AppCompatTheme_windowMinWidthMinor;
            onValidateInAppFailure = i11 % 128;
            if (i11 % 2 != 0) {
                c11 = 19;
            } else {
                c11 = 26;
            }
            if (c11 != 19) {
                return;
            }
            int i12 = 10 / 0;
            return;
        }
        Context applicationContext = context.getApplicationContext();
        AFc1xSDK aFc1xSDK = this.AppsFlyerLib;
        if (applicationContext == null) {
            z10 = true;
        }
        if (!z10) {
            AFb1bSDK aFb1bSDK = aFc1xSDK.values;
            if (applicationContext != null) {
                int i13 = onValidateInApp + R.styleable.AppCompatTheme_windowActionModeOverlay;
                onValidateInAppFailure = i13 % 128;
                if (i13 % 2 == 0) {
                    aFb1bSDK.values = applicationContext.getApplicationContext();
                } else {
                    aFb1bSDK.values = applicationContext.getApplicationContext();
                    throw null;
                }
            }
        }
        this.AppsFlyerLib.values().execute(new g(2, this, applicationContext, intent));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        boolean z10;
        int i6 = onValidateInApp + 39;
        onValidateInAppFailure = i6 % 128;
        if (i6 % 2 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            AFb1qSDK.AFInAppEventParameterName().AFInAppEventType("registerConversionListener", new String[0]);
        } else {
            AFb1qSDK.AFInAppEventParameterName().AFInAppEventType("registerConversionListener", new String[1]);
        }
        AFInAppEventType(appsFlyerConversionListener);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerValidatorListener(Context context, AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener) {
        boolean z10;
        boolean z11 = false;
        AFb1qSDK.AFInAppEventParameterName().AFInAppEventType("registerValidatorListener", new String[0]);
        AFLogger.afDebugLog("registerValidatorListener called");
        boolean z12 = true;
        if (appsFlyerInAppPurchaseValidatorListener == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            valueOf = appsFlyerInAppPurchaseValidatorListener;
            int i6 = onValidateInAppFailure + 43;
            onValidateInApp = i6 % 128;
            if (i6 % 2 != 0) {
                z12 = false;
            }
            if (z12) {
                int i10 = 93 / 0;
                return;
            }
            return;
        }
        int i11 = onValidateInApp + 83;
        onValidateInAppFailure = i11 % 128;
        if (i11 % 2 != 0) {
            z11 = true;
        }
        AFLogger.afDebugLog("registerValidatorListener null listener");
        if (!z11) {
            return;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        if (r5 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
        if (r8 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
        r2 = r2.values;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
        if (r8 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
        if (r5 == true) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
        r5 = com.appsflyer.internal.AFb1xSDK.onValidateInApp + 33;
        com.appsflyer.internal.AFb1xSDK.onValidateInAppFailure = r5 % 128;
        r5 = r5 % 2;
        r2.values = r8.getApplicationContext();
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void sendAdRevenue(Context context, Map<String, Object> map) {
        char c10;
        AFb1aSDK AFInAppEventParameterName2;
        AFc1xSDK aFc1xSDK;
        boolean z10;
        int i6 = onValidateInAppFailure + 49;
        onValidateInApp = i6 % 128;
        if (i6 % 2 == 0) {
            c10 = 'J';
        } else {
            c10 = 29;
        }
        if (c10 != 'J') {
            AFInAppEventParameterName2 = this.AppsFlyerLib.AFInAppEventParameterName();
            aFc1xSDK = this.AppsFlyerLib;
            if (context != null) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            AFInAppEventParameterName2 = this.AppsFlyerLib.AFInAppEventParameterName();
            aFc1xSDK = this.AppsFlyerLib;
            int i10 = 45 / 0;
        }
        AFe1xSDK aFe1xSDK = new AFe1xSDK();
        if (context != null) {
            aFe1xSDK.valueOf = (Application) context.getApplicationContext();
            int i11 = onValidateInAppFailure + 57;
            onValidateInApp = i11 % 128;
            int i12 = i11 % 2;
        }
        StringBuilder c11 = h.c(String.format(afErrorLog, AppsFlyerLib.getInstance().getHostPrefix(), AFKeystoreWrapper().getHostName()));
        c11.append(AFInAppEventParameterName2.AFKeystoreWrapper.values.getPackageName());
        String obj = c11.toString();
        int valueOf2 = AFInAppEventParameterName2.values.valueOf("appsFlyerAdRevenueCount");
        Map<String, Object> values2 = values(aFe1xSDK);
        values2.put("ad_network", map);
        values2.put("adrevenue_counter", Integer.valueOf(valueOf2));
        new AFa1wSDK(this, aFe1xSDK.AFKeystoreWrapper(obj).AFInAppEventType(values2).AFInAppEventType(AFInAppEventParameterName2.values.valueOf("appsFlyerCount")), (byte) 0).run();
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendInAppPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        boolean z10;
        AFc1xSDK aFc1xSDK = this.AppsFlyerLib;
        Context applicationContext = context.getApplicationContext();
        boolean z11 = false;
        if (applicationContext != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int i6 = onValidateInAppFailure + 35;
            int i10 = i6 % 128;
            onValidateInApp = i10;
            int i11 = i6 % 2;
            AFb1bSDK aFb1bSDK = aFc1xSDK.values;
            if (applicationContext == null) {
                z11 = true;
            }
            if (!z11) {
                int i12 = i10 + R.styleable.AppCompatTheme_windowActionModeOverlay;
                onValidateInAppFailure = i12 % 128;
                int i13 = i12 % 2;
                aFb1bSDK.values = applicationContext.getApplicationContext();
                int i14 = onValidateInAppFailure + 35;
                onValidateInApp = i14 % 128;
                int i15 = i14 % 2;
            }
        }
        PurchaseHandler AFLogger = values().AFLogger();
        if (AFLogger.AFInAppEventType(map, purchaseValidationCallback, "purchases")) {
            AFc1cSDK aFc1cSDK = new AFc1cSDK(map, purchaseValidationCallback, AFLogger.AFInAppEventType);
            AFc1mSDK aFc1mSDK = AFLogger.AFKeystoreWrapper;
            aFc1mSDK.AFInAppEventParameterName.execute(new AFc1mSDK.AnonymousClass3(aFc1cSDK));
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        boolean z10;
        char c10;
        int i6 = onValidateInApp + R.styleable.AppCompatTheme_windowFixedWidthMinor;
        onValidateInAppFailure = i6 % 128;
        int i10 = i6 % 2;
        AFc1xSDK aFc1xSDK = this.AppsFlyerLib;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            AFb1bSDK aFb1bSDK = aFc1xSDK.values;
            if (applicationContext != null) {
                c10 = 'I';
            } else {
                c10 = '!';
            }
            if (c10 != '!') {
                int i11 = onValidateInApp + 59;
                onValidateInAppFailure = i11 % 128;
                int i12 = i11 % 2;
                aFb1bSDK.values = applicationContext.getApplicationContext();
                int i13 = onValidateInAppFailure + 99;
                onValidateInApp = i13 % 128;
                int i14 = i13 % 2;
            }
        }
        PurchaseHandler AFLogger = values().AFLogger();
        if (AFLogger.AFInAppEventType(map, purchaseValidationCallback, "subscriptions")) {
            AFc1eSDK aFc1eSDK = new AFc1eSDK(map, purchaseValidationCallback, AFLogger.AFInAppEventType);
            AFc1mSDK aFc1mSDK = AFLogger.AFKeystoreWrapper;
            aFc1mSDK.AFInAppEventParameterName.execute(new AFc1mSDK.AnonymousClass3(aFc1eSDK));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
        if (r17 != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0026, code lost:
        if (r17 != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
        if (r17.getIntent() == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
        r2 = com.appsflyer.internal.AFb1qSDK.AFInAppEventParameterName();
        r8 = new java.lang.StringBuilder("activity_intent_");
        r8.append(r17.getIntent().toString());
        r2.AFInAppEventType("sendPushNotificationData", r17.getLocalClassName(), r8.toString());
        r2 = com.appsflyer.internal.AFb1xSDK.onValidateInApp + 81;
        com.appsflyer.internal.AFb1xSDK.onValidateInAppFailure = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
        if (r17 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
        com.appsflyer.internal.AFb1qSDK.AFInAppEventParameterName().AFInAppEventType("sendPushNotificationData", r17.getLocalClassName(), "activity_intent_null");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
        com.appsflyer.internal.AFb1qSDK.AFInAppEventParameterName().AFInAppEventType("sendPushNotificationData", "activity_null");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0082, code lost:
        r2 = valueOf(r17);
        r16.onInstallConversionDataLoadedNative = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0088, code lost:
        if (r2 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008a, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008d, code lost:
        if (r2 == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0091, code lost:
        r2 = com.appsflyer.internal.AFb1xSDK.onValidateInApp + com.appsflyer.R.styleable.AppCompatTheme_textColorSearchUrl;
        com.appsflyer.internal.AFb1xSDK.onValidateInAppFailure = r2 % 128;
        r2 = r2 % 2;
        r4 = java.lang.System.currentTimeMillis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a2, code lost:
        if (r16.onAppOpenAttributionNative != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a4, code lost:
        com.appsflyer.AFLogger.afInfoLog("pushes: initializing pushes history..");
        r16.onAppOpenAttributionNative = new j$.util.concurrent.ConcurrentHashMap();
        r0 = com.appsflyer.internal.AFb1xSDK.onValidateInApp + 51;
        com.appsflyer.internal.AFb1xSDK.onValidateInAppFailure = r0 % 128;
        r0 = r0 % 2;
        r11 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bc, code lost:
        r9 = com.appsflyer.AppsFlyerProperties.getInstance().getLong("pushPayloadMaxAging", 1800000);
        r2 = r16.onAppOpenAttributionNative.keySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d3, code lost:
        r11 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d8, code lost:
        if (r2.hasNext() == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00da, code lost:
        r13 = r2.next();
        r14 = new org.json.JSONObject(r16.onInstallConversionDataLoadedNative);
        r15 = new org.json.JSONObject(r16.onAppOpenAttributionNative.get(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0100, code lost:
        if (r14.opt("pid").equals(r15.opt("pid")) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0102, code lost:
        r6 = com.appsflyer.internal.AFb1xSDK.onValidateInApp + 65;
        com.appsflyer.internal.AFb1xSDK.onValidateInAppFailure = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x010d, code lost:
        if ((r6 % 2) != 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x011b, code lost:
        if (r14.opt("c").equals(r15.opt("c")) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x011d, code lost:
        r0 = new java.lang.StringBuilder("PushNotificationMeasurement: A previous payload with same PID and campaign was already acknowledged! (old: ");
        r0.append(r15);
        r0.append(", new: ");
        r0.append(r14);
        r0.append(")");
        com.appsflyer.AFLogger.afInfoLog(r0.toString());
        r16.onInstallConversionDataLoadedNative = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x013c, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x013d, code lost:
        r14.opt("c").equals(r15.opt("c"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0149, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0154, code lost:
        if ((r4 - r13.longValue()) <= r9) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0156, code lost:
        r6 = ']';
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0159, code lost:
        r6 = 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x015b, code lost:
        if (r6 == 20) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x015d, code lost:
        r6 = com.appsflyer.internal.AFb1xSDK.onValidateInAppFailure + com.appsflyer.R.styleable.AppCompatTheme_windowFixedWidthMinor;
        com.appsflyer.internal.AFb1xSDK.onValidateInApp = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0166, code lost:
        if ((r6 % 2) == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0168, code lost:
        r16.onAppOpenAttributionNative.remove(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x016e, code lost:
        r16.onAppOpenAttributionNative.remove(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0174, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x017b, code lost:
        if (r13.longValue() > r11) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x017d, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x017f, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0181, code lost:
        if (r6 == true) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0183, code lost:
        r11 = r13.longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x018b, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x018d, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x018e, code lost:
        r11 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018f, code lost:
        com.appsflyer.AFLogger.afErrorLog("Error while handling push notification measurement: ".concat(r0.getClass().getSimpleName()), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01b0, code lost:
        if (r16.onAppOpenAttributionNative.size() == com.appsflyer.AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", 2)) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01b2, code lost:
        r0 = new java.lang.StringBuilder("pushes: removing oldest overflowing push (oldest push:");
        r0.append(r11);
        r0.append(")");
        com.appsflyer.AFLogger.afInfoLog(r0.toString());
        r16.onAppOpenAttributionNative.remove(java.lang.Long.valueOf(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01cf, code lost:
        r16.onAppOpenAttributionNative.put(java.lang.Long.valueOf(r4), r16.onInstallConversionDataLoadedNative);
        start(r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01dd, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:?, code lost:
        return;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void sendPushNotificationData(Activity activity) {
        char c10;
        int i6 = onValidateInAppFailure + R.styleable.AppCompatTheme_switchStyle;
        onValidateInApp = i6 % 128;
        if (i6 % 2 == 0) {
            c10 = '\r';
        } else {
            c10 = 'J';
        }
        if (c10 != 'J') {
            int i10 = 94 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAdditionalData(Map<String, Object> map) {
        boolean z10;
        int i6 = onValidateInApp + R.styleable.AppCompatTheme_textAppearanceListItem;
        onValidateInAppFailure = i6 % 128;
        if (i6 % 2 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int i10 = 67 / 0;
            if (map == null) {
                return;
            }
        } else if (map == null) {
            return;
        }
        AFb1qSDK.AFInAppEventParameterName().AFInAppEventType("setAdditionalData", map.toString());
        AppsFlyerProperties.getInstance().setCustomData(new JSONObject(map).toString());
        int i11 = onValidateInAppFailure + 57;
        onValidateInApp = i11 % 128;
        int i12 = i11 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAndroidIdData(String str) {
        boolean z10;
        char c10;
        int i6 = onValidateInApp + 39;
        onValidateInAppFailure = i6 % 128;
        if (i6 % 2 != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            AFb1qSDK.AFInAppEventParameterName().AFInAppEventType("setAndroidIdData", str);
        } else {
            AFb1qSDK.AFInAppEventParameterName().AFInAppEventType("setAndroidIdData", str);
        }
        this.afRDLog = str;
        int i10 = onValidateInApp + 61;
        onValidateInAppFailure = i10 % 128;
        if (i10 % 2 != 0) {
            c10 = '8';
        } else {
            c10 = 'G';
        }
        if (c10 != '8') {
            return;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppId(String str) {
        boolean z10;
        int i6 = onValidateInApp + R.styleable.AppCompatTheme_textAppearanceListItem;
        onValidateInAppFailure = i6 % 128;
        if (i6 % 2 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            AFb1qSDK.AFInAppEventParameterName().AFInAppEventType("setAppId", str);
        } else {
            AFb1qSDK AFInAppEventParameterName2 = AFb1qSDK.AFInAppEventParameterName();
            String[] strArr = new String[0];
            strArr[0] = str;
            AFInAppEventParameterName2.AFInAppEventType("setAppId", strArr);
        }
        AFInAppEventParameterName(AppsFlyerProperties.APP_ID, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
        if (r0 != true) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
        if (r8.equals(com.appsflyer.AppsFlyerProperties.getInstance().getString(com.appsflyer.AppsFlyerProperties.ONELINK_ID)) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005b, code lost:
        r0 = 'B';
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
        r0 = 23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
        if (r0 == 23) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
        com.appsflyer.AppsFlyerProperties.getInstance().remove(com.appsflyer.AppsFlyerProperties.ONELINK_DOMAIN);
        com.appsflyer.AppsFlyerProperties.getInstance().remove("onelinkVersion");
        com.appsflyer.AppsFlyerProperties.getInstance().remove(com.appsflyer.AppsFlyerProperties.ONELINK_SCHEME);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002a, code lost:
        if (r8 != null) goto L18;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setAppInviteOneLink(String str) {
        boolean z10;
        int i6 = onValidateInAppFailure + 91;
        onValidateInApp = i6 % 128;
        boolean z11 = false;
        if (i6 % 2 == 0) {
            AFb1qSDK AFInAppEventParameterName2 = AFb1qSDK.AFInAppEventParameterName();
            String[] strArr = new String[0];
            strArr[0] = str;
            AFInAppEventParameterName2.AFInAppEventType("setAppInviteOneLink", strArr);
            AFLogger.afInfoLog("setAppInviteOneLink = ".concat(String.valueOf(str)));
        } else {
            AFb1qSDK.AFInAppEventParameterName().AFInAppEventType("setAppInviteOneLink", str);
            AFLogger.afInfoLog("setAppInviteOneLink = ".concat(String.valueOf(str)));
            if (str != null) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        AFInAppEventParameterName(AppsFlyerProperties.ONELINK_ID, str);
        int i10 = onValidateInApp + R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle;
        onValidateInAppFailure = i10 % 128;
        if (i10 % 2 == 0) {
            z11 = true;
        }
        if (z11) {
            return;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectAndroidID(boolean z10) {
        boolean z11;
        int i6 = onValidateInApp + R.styleable.AppCompatTheme_windowFixedHeightMinor;
        onValidateInAppFailure = i6 % 128;
        if (i6 % 2 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            AFb1qSDK AFInAppEventParameterName2 = AFb1qSDK.AFInAppEventParameterName();
            String[] strArr = new String[1];
            strArr[1] = String.valueOf(z10);
            AFInAppEventParameterName2.AFInAppEventType("setCollectAndroidID", strArr);
        } else {
            AFb1qSDK.AFInAppEventParameterName().AFInAppEventType("setCollectAndroidID", String.valueOf(z10));
        }
        AFInAppEventParameterName(AppsFlyerProperties.COLLECT_ANDROID_ID, Boolean.toString(z10));
        AFInAppEventParameterName(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, Boolean.toString(z10));
        int i10 = onValidateInAppFailure + 77;
        onValidateInApp = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectIMEI(boolean z10) {
        int i6 = onValidateInAppFailure + 11;
        onValidateInApp = i6 % 128;
        int i10 = i6 % 2;
        AFb1qSDK.AFInAppEventParameterName().AFInAppEventType("setCollectIMEI", String.valueOf(z10));
        AFInAppEventParameterName(AppsFlyerProperties.COLLECT_IMEI, Boolean.toString(z10));
        AFInAppEventParameterName(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, Boolean.toString(z10));
        int i11 = onValidateInAppFailure + 65;
        onValidateInApp = i11 % 128;
        int i12 = i11 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setCollectOaid(boolean z10) {
        boolean z11;
        int i6 = onValidateInApp + 27;
        onValidateInAppFailure = i6 % 128;
        if (i6 % 2 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            AFb1qSDK.AFInAppEventParameterName().AFInAppEventType("setCollectOaid", String.valueOf(z10));
        } else {
            AFb1qSDK AFInAppEventParameterName2 = AFb1qSDK.AFInAppEventParameterName();
            String[] strArr = new String[0];
            strArr[0] = String.valueOf(z10);
            AFInAppEventParameterName2.AFInAppEventType("setCollectOaid", strArr);
        }
        AFInAppEventParameterName(AppsFlyerProperties.COLLECT_OAID, Boolean.toString(z10));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCurrencyCode(String str) {
        boolean z10;
        int i6 = onValidateInApp + 25;
        onValidateInAppFailure = i6 % 128;
        int i10 = i6 % 2;
        AFb1qSDK.AFInAppEventParameterName().AFInAppEventType("setCurrencyCode", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.CURRENCY_CODE, str);
        int i11 = onValidateInApp + 37;
        onValidateInAppFailure = i11 % 128;
        if (i11 % 2 != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            int i12 = 57 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerIdAndLogSession(String str, Context context) {
        boolean z10;
        int i6 = onValidateInApp;
        int i10 = i6 + 95;
        onValidateInAppFailure = i10 % 128;
        int i11 = i10 % 2;
        boolean z11 = false;
        if (context != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            int i12 = i6 + 59;
            onValidateInAppFailure = i12 % 128;
            if (i12 % 2 == 0) {
                if (AFInAppEventParameterName()) {
                    setCustomerUserId(str);
                    StringBuilder sb2 = new StringBuilder("CustomerUserId set: ");
                    sb2.append(str);
                    sb2.append(" - Initializing AppsFlyer Tacking");
                    AFLogger.afInfoLog(sb2.toString(), true);
                    String referrer = AppsFlyerProperties.getInstance().getReferrer(context);
                    AFInAppEventParameterName(context, AFd1dSDK.setCustomerIdAndLogSession);
                    String str2 = this.AppsFlyerLib.AFVersionDeclaration().values;
                    if (referrer == null) {
                        int i13 = onValidateInApp + R.styleable.AppCompatTheme_windowActionBar;
                        onValidateInAppFailure = i13 % 128;
                        int i14 = i13 % 2;
                        referrer = "";
                    }
                    String str3 = referrer;
                    if (context instanceof Activity) {
                        z11 = true;
                    }
                    if (z11) {
                        int i15 = onValidateInApp + 61;
                        onValidateInAppFailure = i15 % 128;
                        int i16 = i15 % 2;
                        ((Activity) context).getIntent();
                    }
                    values(context, null, null, str3, null);
                    return;
                }
                setCustomerUserId(str);
                AFLogger.afInfoLog("waitForCustomerUserId is false; setting CustomerUserID: ".concat(String.valueOf(str)), true);
                return;
            }
            AFInAppEventParameterName();
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerUserId(String str) {
        char c10;
        int i6 = onValidateInApp + 77;
        onValidateInAppFailure = i6 % 128;
        if (i6 % 2 != 0) {
            c10 = '\'';
        } else {
            c10 = '3';
        }
        if (c10 != '3') {
            AFb1qSDK AFInAppEventParameterName2 = AFb1qSDK.AFInAppEventParameterName();
            String[] strArr = new String[0];
            strArr[0] = str;
            AFInAppEventParameterName2.AFInAppEventType("setCustomerUserId", strArr);
        } else {
            AFb1qSDK.AFInAppEventParameterName().AFInAppEventType("setCustomerUserId", str);
        }
        AFLogger.afInfoLog("setCustomerUserId = ".concat(String.valueOf(str)));
        AFInAppEventParameterName(AppsFlyerProperties.APP_USER_ID, str);
        values(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDebugLog(boolean z10) {
        char c10;
        char c11;
        AFLogger.LogLevel logLevel;
        int i6 = onValidateInAppFailure;
        int i10 = i6 + 97;
        onValidateInApp = i10 % 128;
        int i11 = i10 % 2;
        if (z10) {
            c10 = 20;
        } else {
            c10 = 'U';
        }
        if (c10 != 20) {
            logLevel = AFLogger.LogLevel.NONE;
            int i12 = onValidateInApp + 25;
            onValidateInAppFailure = i12 % 128;
            int i13 = i12 % 2;
        } else {
            int i14 = i6 + 83;
            onValidateInApp = i14 % 128;
            if (i14 % 2 == 0) {
                c11 = '7';
            } else {
                c11 = 'T';
            }
            if (c11 != '7') {
                logLevel = AFLogger.LogLevel.DEBUG;
            } else {
                AFLogger.LogLevel logLevel2 = AFLogger.LogLevel.NONE;
                throw null;
            }
        }
        setLogLevel(logLevel);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
        if (r5 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
        if (r5 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
        r5 = com.appsflyer.internal.AFb1xSDK.onValidateInApp + 61;
        com.appsflyer.internal.AFb1xSDK.onValidateInAppFailure = r5 % 128;
        r5 = r5 % 2;
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
        r5 = false;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setDisableAdvertisingIdentifiers(boolean z10) {
        boolean z11;
        boolean z12;
        int i6 = onValidateInAppFailure + 9;
        onValidateInApp = i6 % 128;
        boolean z13 = true;
        if (i6 % 2 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            AFLogger.afDebugLog("setDisableAdvertisingIdentifiers: ".concat(String.valueOf(z10)));
            int i10 = 64 / 0;
        } else {
            AFLogger.afDebugLog("setDisableAdvertisingIdentifiers: ".concat(String.valueOf(z10)));
        }
        AFb1zSDK.AFKeystoreWrapper = Boolean.valueOf(z12);
        AppsFlyerProperties.getInstance().remove("advertiserIdEnabled");
        AppsFlyerProperties.getInstance().remove("advertiserId");
        int i11 = onValidateInAppFailure + 67;
        onValidateInApp = i11 % 128;
        if (i11 % 2 == 0) {
            z13 = false;
        }
        if (z13) {
            return;
        }
        int i12 = 48 / 0;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableNetworkData(boolean z10) {
        char c10;
        int i6 = onValidateInAppFailure + 37;
        onValidateInApp = i6 % 128;
        if (i6 % 2 == 0) {
            c10 = '^';
        } else {
            c10 = 'N';
        }
        if (c10 == 'N') {
            AFLogger.afDebugLog("setDisableNetworkData: ".concat(String.valueOf(z10)));
            values(AppsFlyerProperties.DISABLE_NETWORK_DATA, z10);
            return;
        }
        AFLogger.afDebugLog("setDisableNetworkData: ".concat(String.valueOf(z10)));
        values(AppsFlyerProperties.DISABLE_NETWORK_DATA, z10);
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setExtension(String str) {
        int i6 = onValidateInAppFailure + R.styleable.AppCompatTheme_tooltipFrameBackground;
        onValidateInApp = i6 % 128;
        int i10 = i6 % 2;
        boolean z10 = true;
        AFb1qSDK.AFInAppEventParameterName().AFInAppEventType("setExtension", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EXTENSION, str);
        int i11 = onValidateInApp + 49;
        onValidateInAppFailure = i11 % 128;
        if (i11 % 2 != 0) {
            z10 = false;
        }
        if (z10) {
            return;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setHost(String str, String str2) {
        char c10;
        int i6 = onValidateInAppFailure + 53;
        onValidateInApp = i6 % 128;
        if (i6 % 2 != 0) {
            if (str != null) {
                AFInAppEventParameterName("custom_host_prefix", str);
            }
            if (str2 != null) {
                int i10 = onValidateInApp + 47;
                onValidateInAppFailure = i10 % 128;
                int i11 = i10 % 2;
                if (!str2.isEmpty()) {
                    c10 = '<';
                } else {
                    c10 = 'Z';
                }
                if (c10 == '<') {
                    AFInAppEventParameterName("custom_host", str2);
                    int i12 = onValidateInAppFailure + 93;
                    onValidateInApp = i12 % 128;
                    if (i12 % 2 != 0) {
                        return;
                    }
                    throw null;
                }
            }
            AFLogger.afWarnLog("hostName cannot be null or empty");
            return;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setImeiData(String str) {
        int i6 = onValidateInApp + 43;
        onValidateInAppFailure = i6 % 128;
        int i10 = i6 % 2;
        boolean z10 = false;
        AFb1qSDK.AFInAppEventParameterName().AFInAppEventType("setImeiData", str);
        this.AppsFlyerLib.AFVersionDeclaration().AFInAppEventType = str;
        int i11 = onValidateInApp + 51;
        onValidateInAppFailure = i11 % 128;
        if (i11 % 2 == 0) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setIsUpdate(boolean z10) {
        int i6 = onValidateInApp + 79;
        onValidateInAppFailure = i6 % 128;
        int i10 = i6 % 2;
        AFb1qSDK.AFInAppEventParameterName().AFInAppEventType("setIsUpdate", String.valueOf(z10));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.IS_UPDATE, z10);
        int i11 = onValidateInApp + 49;
        onValidateInAppFailure = i11 % 128;
        int i12 = i11 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setLogLevel(AFLogger.LogLevel logLevel) {
        boolean z10;
        char c10;
        boolean z11;
        int i6 = onValidateInApp + 99;
        onValidateInAppFailure = i6 % 128;
        int i10 = i6 % 2;
        if (logLevel.getLevel() > AFLogger.LogLevel.NONE.getLevel()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            int i11 = onValidateInAppFailure + 9;
            onValidateInApp = i11 % 128;
            if (i11 % 2 == 0) {
                c10 = 3;
            } else {
                c10 = '\f';
            }
            if (c10 != 3) {
                z11 = true;
                this.AppsFlyerLib.afWarnLog().AFInAppEventType("log", String.valueOf(z11));
                AppsFlyerProperties.getInstance().set("logLevel", logLevel.getLevel());
                int i12 = onValidateInApp + 49;
                onValidateInAppFailure = i12 % 128;
                int i13 = i12 % 2;
            }
        }
        z11 = false;
        this.AppsFlyerLib.afWarnLog().AFInAppEventType("log", String.valueOf(z11));
        AppsFlyerProperties.getInstance().set("logLevel", logLevel.getLevel());
        int i122 = onValidateInApp + 49;
        onValidateInAppFailure = i122 % 128;
        int i132 = i122 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setMinTimeBetweenSessions(int i6) {
        char c10;
        int i10 = onValidateInApp + 55;
        onValidateInAppFailure = i10 % 128;
        int i11 = i10 % 2;
        this.onInstallConversionFailureNative = TimeUnit.SECONDS.toMillis(i6);
        int i12 = onValidateInApp + 93;
        onValidateInAppFailure = i12 % 128;
        if (i12 % 2 != 0) {
            c10 = '>';
        } else {
            c10 = '3';
        }
        if (c10 != '>') {
            return;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOaidData(String str) {
        char c10;
        int i6 = onValidateInAppFailure + 95;
        onValidateInApp = i6 % 128;
        boolean z10 = false;
        if (i6 % 2 == 0) {
            c10 = 0;
        } else {
            c10 = 11;
        }
        if (c10 != 11) {
            AFb1qSDK AFInAppEventParameterName2 = AFb1qSDK.AFInAppEventParameterName();
            String[] strArr = new String[1];
            strArr[1] = str;
            AFInAppEventParameterName2.AFInAppEventType("setOaidData", strArr);
        } else {
            AFb1qSDK.AFInAppEventParameterName().AFInAppEventType("setOaidData", str);
        }
        AFb1zSDK.valueOf = str;
        int i10 = onValidateInApp + 97;
        onValidateInAppFailure = i10 % 128;
        if (i10 % 2 == 0) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOneLinkCustomDomain(String... strArr) {
        int i6 = onValidateInApp + 89;
        onValidateInAppFailure = i6 % 128;
        int i10 = i6 % 2;
        AFLogger.afDebugLog(String.format("setOneLinkCustomDomain %s", Arrays.toString(strArr)));
        AFa1sSDK.valueOf = strArr;
        int i11 = onValidateInAppFailure + 1;
        onValidateInApp = i11 % 128;
        int i12 = i11 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOutOfStore(String str) {
        char c10;
        char c11;
        int i6 = onValidateInApp + 57;
        onValidateInAppFailure = i6 % 128;
        if (i6 % 2 != 0) {
            c10 = '?';
        } else {
            c10 = '\t';
        }
        if (c10 == '\t') {
            if (str != null) {
                c11 = 15;
            } else {
                c11 = '^';
            }
            if (c11 != 15) {
                AFLogger.AFInAppEventParameterName("Cannot set setOutOfStore with null");
                int i10 = onValidateInAppFailure + 45;
                onValidateInApp = i10 % 128;
                int i11 = i10 % 2;
                return;
            }
            String lowerCase = str.toLowerCase();
            AppsFlyerProperties.getInstance().set("api_store_value", lowerCase);
            AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf(lowerCase)), true);
            return;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPartnerData(String str, Map<String, Object> map) {
        boolean z10;
        char c10;
        String concat;
        if (this.onAppOpenAttribution == null) {
            this.onAppOpenAttribution = new AFb1eSDK();
        }
        AFb1eSDK aFb1eSDK = this.onAppOpenAttribution;
        if (str != null) {
            int i6 = onValidateInAppFailure + 69;
            onValidateInApp = i6 % 128;
            int i10 = i6 % 2;
            if (str.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                if (map != null) {
                    c10 = 31;
                } else {
                    c10 = 'A';
                }
                if (c10 != 31 || map.isEmpty()) {
                    if (aFb1eSDK.AFInAppEventParameterName.remove(str) == null) {
                        concat = "Partner data is missing or `null`";
                    } else {
                        concat = "Cleared partner data for ".concat(str);
                    }
                    AFLogger.afWarnLog(concat);
                    return;
                }
                StringBuilder sb2 = new StringBuilder("Setting partner data for ");
                sb2.append(str);
                sb2.append(": ");
                sb2.append(map);
                AFLogger.afDebugLog(sb2.toString());
                int length = new JSONObject(map).toString().length();
                if (length > 1000) {
                    AFLogger.afWarnLog("Partner data 1000 characters limit exceeded");
                    HashMap hashMap = new HashMap();
                    hashMap.put("error", "limit exceeded: ".concat(String.valueOf(length)));
                    aFb1eSDK.valueOf.put(str, hashMap);
                    int i11 = onValidateInApp + 85;
                    onValidateInAppFailure = i11 % 128;
                    int i12 = i11 % 2;
                    return;
                }
                aFb1eSDK.AFInAppEventParameterName.put(str, map);
                aFb1eSDK.valueOf.remove(str);
                int i13 = onValidateInAppFailure + 79;
                onValidateInApp = i13 % 128;
                if (i13 % 2 != 0) {
                    return;
                }
                throw null;
            }
        }
        AFLogger.afWarnLog("Partner ID is missing or `null`");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPhoneNumber(String str) {
        char c10;
        int i6 = onValidateInAppFailure + R.styleable.AppCompatTheme_switchStyle;
        onValidateInApp = i6 % 128;
        int i10 = i6 % 2;
        this.onAttributionFailure = AFb1tSDK.values(str);
        int i11 = onValidateInAppFailure + 71;
        onValidateInApp = i11 % 128;
        if (i11 % 2 == 0) {
            c10 = 'V';
        } else {
            c10 = '\"';
        }
        if (c10 != 'V') {
            return;
        }
        int i12 = 62 / 0;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPreinstallAttribution(String str, String str2, String str3) {
        boolean z10;
        char c10;
        char c11;
        AFLogger.afDebugLog("setPreinstallAttribution API called");
        JSONObject jSONObject = new JSONObject();
        if (str != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            int i6 = onValidateInApp + 5;
            onValidateInAppFailure = i6 % 128;
            int i10 = i6 % 2;
            try {
                jSONObject.put("pid", str);
                int i11 = onValidateInApp + 39;
                onValidateInAppFailure = i11 % 128;
                int i12 = i11 % 2;
            } catch (JSONException e10) {
                AFLogger.afErrorLog(e10.getMessage(), e10);
            }
        }
        if (str2 != null) {
            c10 = 26;
        } else {
            c10 = ';';
        }
        if (c10 == 26) {
            jSONObject.put("c", str2);
        }
        if (str3 != null) {
            c11 = ']';
        } else {
            c11 = '8';
        }
        if (c11 == ']') {
            int i13 = onValidateInApp + 29;
            onValidateInAppFailure = i13 % 128;
            int i14 = i13 % 2;
            jSONObject.put("af_siteid", str3);
        }
        if (jSONObject.has("pid")) {
            AFInAppEventParameterName("preInstallName", jSONObject.toString());
        } else {
            AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setResolveDeepLinkURLs(String... strArr) {
        char c10;
        String format;
        int i6 = onValidateInAppFailure + 29;
        onValidateInApp = i6 % 128;
        if (i6 % 2 == 0) {
            c10 = '#';
        } else {
            c10 = 18;
        }
        if (c10 != 18) {
            Object[] objArr = new Object[1];
            objArr[1] = Arrays.toString(strArr);
            format = String.format("setResolveDeepLinkURLs %s", objArr);
        } else {
            format = String.format("setResolveDeepLinkURLs %s", Arrays.toString(strArr));
        }
        AFLogger.afDebugLog(format);
        List<String> list = AFa1sSDK.AFInAppEventType;
        list.clear();
        list.addAll(Arrays.asList(strArr));
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilter(String... strArr) {
        char c10;
        int i6 = onValidateInApp + 35;
        onValidateInAppFailure = i6 % 128;
        int i10 = i6 % 2;
        setSharingFilterForPartners(strArr);
        int i11 = onValidateInAppFailure + 65;
        onValidateInApp = i11 % 128;
        if (i11 % 2 == 0) {
            c10 = 20;
        } else {
            c10 = '1';
        }
        if (c10 != 20) {
            return;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilterForAllPartners() {
        boolean z10;
        int i6 = onValidateInApp + 77;
        onValidateInAppFailure = i6 % 128;
        int i10 = i6 % 2;
        setSharingFilterForPartners("all");
        int i11 = onValidateInAppFailure + 81;
        onValidateInApp = i11 % 128;
        if (i11 % 2 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setSharingFilterForPartners(String... strArr) {
        boolean z10;
        this.AFLogger = new AFa1fSDK(strArr);
        int i6 = onValidateInApp + 23;
        onValidateInAppFailure = i6 % 128;
        if (i6 % 2 != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(String... strArr) {
        int i6 = onValidateInAppFailure + 37;
        onValidateInApp = i6 % 128;
        int i10 = i6 % 2;
        AFb1qSDK.AFInAppEventParameterName().AFInAppEventType("setUserEmails", strArr);
        setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
        int i11 = onValidateInApp + 13;
        onValidateInAppFailure = i11 % 128;
        int i12 = i11 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context) {
        int i6 = onValidateInAppFailure + 87;
        onValidateInApp = i6 % 128;
        char c10 = i6 % 2 == 0 ? '$' : (char) 3;
        start(context, null);
        if (c10 != '$') {
            return;
        }
        int i10 = 6 / 0;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void stop(boolean z10, Context context) {
        char c10;
        boolean z11;
        boolean z12;
        AFc1xSDK aFc1xSDK = this.AppsFlyerLib;
        int i6 = 0;
        if (context != null) {
            AFb1bSDK aFb1bSDK = aFc1xSDK.values;
            int i10 = onValidateInAppFailure + 89;
            onValidateInApp = i10 % 128;
            if (i10 % 2 == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z12) {
                aFb1bSDK.values = context.getApplicationContext();
            } else {
                aFb1bSDK.values = context.getApplicationContext();
                throw null;
            }
        }
        this.AppsFlyerLib.AFVersionDeclaration().AFInAppEventParameterName = z10;
        try {
            File file = new File(this.AppsFlyerLib.getLevel().values.values.getFilesDir(), "AFRequestCache");
            if (!file.exists()) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!z11) {
                file.mkdir();
            } else {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    int length = listFiles.length;
                    int i11 = onValidateInAppFailure + 41;
                    onValidateInApp = i11 % 128;
                    int i12 = i11 % 2;
                    while (i6 < length) {
                        File file2 = listFiles[i6];
                        StringBuilder sb2 = new StringBuilder("CACHE: Found cached request");
                        sb2.append(file2.getName());
                        AFLogger.afInfoLog(sb2.toString());
                        StringBuilder sb3 = new StringBuilder("CACHE: Deleting ");
                        sb3.append(file2.getName());
                        sb3.append(" from cache");
                        AFLogger.afInfoLog(sb3.toString());
                        file2.delete();
                        i6++;
                        int i13 = onValidateInApp + 49;
                        onValidateInAppFailure = i13 % 128;
                        int i14 = i13 % 2;
                    }
                }
            }
        } catch (Exception e10) {
            AFLogger.afErrorLog("CACHE: Could not cache request", e10);
        }
        if (z10) {
            c10 = '@';
        } else {
            c10 = 'U';
        }
        if (c10 == '@') {
            AFInAppEventParameterName(context).AFKeystoreWrapper("is_stop_tracking_used", true);
            int i15 = onValidateInAppFailure + R.styleable.AppCompatTheme_windowFixedHeightMinor;
            onValidateInApp = i15 % 128;
            int i16 = i15 % 2;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(DeepLinkListener deepLinkListener) {
        int i6 = onValidateInApp + 91;
        onValidateInAppFailure = i6 % 128;
        if (i6 % 2 == 0) {
            subscribeForDeepLink(deepLinkListener, TimeUnit.SECONDS.toMillis(3L));
        } else {
            subscribeForDeepLink(deepLinkListener, TimeUnit.SECONDS.toMillis(3L));
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void unregisterConversionListener() {
        int i6 = onValidateInApp + 69;
        onValidateInAppFailure = i6 % 128;
        int i10 = i6 % 2;
        AFb1qSDK.AFInAppEventParameterName().AFInAppEventType("unregisterConversionListener", new String[0]);
        AFInAppEventType = null;
        int i11 = onValidateInAppFailure + 3;
        onValidateInApp = i11 % 128;
        int i12 = i11 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void updateServerUninstallToken(Context context, String str) {
        boolean z10;
        AFc1xSDK aFc1xSDK = this.AppsFlyerLib;
        if (context != null) {
            aFc1xSDK.values.values = context.getApplicationContext();
        }
        AFd1iSDK aFd1iSDK = new AFd1iSDK(context);
        if (str != null && !str.trim().isEmpty()) {
            AFLogger.afInfoLog("[register] Firebase Refreshed Token = ".concat(str));
            AFb1rSDK AFInAppEventParameterName2 = aFd1iSDK.AFInAppEventParameterName();
            if (AFInAppEventParameterName2 == null || !str.equals(AFInAppEventParameterName2.values)) {
                long currentTimeMillis = System.currentTimeMillis();
                if (AFInAppEventParameterName2 != null && currentTimeMillis - AFInAppEventParameterName2.AFInAppEventParameterName <= TimeUnit.SECONDS.toMillis(2L)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                AFb1rSDK aFb1rSDK = new AFb1rSDK(str, currentTimeMillis, !z10);
                aFd1iSDK.values.valueOf("afUninstallToken", aFb1rSDK.values);
                aFd1iSDK.values.AFInAppEventParameterName("afUninstallToken_received_time", aFb1rSDK.AFInAppEventParameterName);
                aFd1iSDK.values.AFKeystoreWrapper("afUninstallToken_queued", aFb1rSDK.valueOf());
                if (z10) {
                    AFd1iSDK.valueOf(str);
                    return;
                }
                return;
            }
            return;
        }
        AFLogger.afWarnLog("[register] Firebase Token is either empty or null and was not registered.");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        String obj;
        AFb1qSDK AFInAppEventParameterName2 = AFb1qSDK.AFInAppEventParameterName();
        String[] strArr = new String[6];
        strArr[0] = str;
        strArr[1] = str2;
        strArr[2] = str3;
        strArr[3] = str4;
        strArr[4] = str5;
        if (map == null) {
            obj = "";
        } else {
            obj = map.toString();
        }
        strArr[5] = obj;
        AFInAppEventParameterName2.AFInAppEventType("validateAndTrackInAppPurchase", strArr);
        if (!isStopped()) {
            StringBuilder sb2 = new StringBuilder("Validate in app called with parameters: ");
            sb2.append(str3);
            sb2.append(" ");
            sb2.append(str4);
            sb2.append(" ");
            sb2.append(str5);
            AFLogger.afInfoLog(sb2.toString());
        }
        if (str != null && str4 != null && str2 != null && str5 != null && str3 != null) {
            Context applicationContext = context.getApplicationContext();
            String str6 = this.AppsFlyerLib.AFVersionDeclaration().values;
            if (context instanceof Activity) {
                ((Activity) context).getIntent();
            }
            new Thread(new AFa1eSDK(applicationContext, str6, str, str2, str3, str4, str5, map)).start();
            return;
        }
        AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = valueOf;
        if (appsFlyerInAppPurchaseValidatorListener != null) {
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void waitForCustomerUserId(boolean z10) {
        char c10;
        String concat;
        boolean z11;
        int i6 = onValidateInApp + 39;
        onValidateInAppFailure = i6 % 128;
        if (i6 % 2 != 0) {
            c10 = '%';
        } else {
            c10 = 19;
        }
        if (c10 != 19) {
            concat = "initAfterCustomerUserID: ".concat(String.valueOf(z10));
            z11 = false;
        } else {
            concat = "initAfterCustomerUserID: ".concat(String.valueOf(z10));
            z11 = true;
        }
        AFLogger.afInfoLog(concat, z11);
        values(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, z10);
    }

    public static /* synthetic */ void AFInAppEventParameterName(AFb1xSDK aFb1xSDK) {
        int i6 = onValidateInAppFailure + R.styleable.AppCompatTheme_switchStyle;
        onValidateInApp = i6 % 128;
        int i10 = i6 % 2;
        aFb1xSDK.afDebugLog();
        int i11 = onValidateInAppFailure + 39;
        onValidateInApp = i11 % 128;
        int i12 = i11 % 2;
    }

    private static boolean AFInAppEventType(String str, boolean z10) {
        int i6 = onValidateInApp + 25;
        onValidateInAppFailure = i6 % 128;
        int i10 = i6 % 2;
        boolean z11 = AppsFlyerProperties.getInstance().getBoolean(str, z10);
        int i11 = onValidateInAppFailure + 55;
        onValidateInApp = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        return z11;
    }

    public static /* synthetic */ void AFKeystoreWrapper(AFb1xSDK aFb1xSDK, AFa1tSDK aFa1tSDK) {
        int i6 = onValidateInAppFailure + R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu;
        onValidateInApp = i6 % 128;
        int i10 = i6 % 2;
        aFb1xSDK.AFKeystoreWrapper(aFa1tSDK);
        int i11 = onValidateInAppFailure + 39;
        onValidateInApp = i11 % 128;
        int i12 = i11 % 2;
    }

    private static boolean AFLogger(Context context) {
        boolean z10;
        if ((!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) ? (char) 21 : 'b') != 'b') {
            int i6 = onValidateInApp + 23;
            onValidateInAppFailure = i6 % 128;
            if ((i6 % 2 != 0 ? '\t' : (char) 30) == '\t' ? !AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false) : !AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
                z10 = false;
                if (z10 && values(context)) {
                    int i10 = onValidateInApp + 63;
                    onValidateInAppFailure = i10 % 128;
                    if (i10 % 2 != 0) {
                        throw null;
                    }
                    return false;
                }
                return true;
            }
        }
        z10 = true;
        if (z10) {
        }
        return true;
    }

    public static /* synthetic */ AFc1xSDK valueOf(AFb1xSDK aFb1xSDK) {
        int i6 = onValidateInApp + 59;
        onValidateInAppFailure = i6 % 128;
        char c10 = i6 % 2 != 0 ? '8' : '<';
        AFc1xSDK aFc1xSDK = aFb1xSDK.AppsFlyerLib;
        if (c10 == '<') {
            return aFc1xSDK;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map, AppsFlyerRequestListener appsFlyerRequestListener) {
        HashMap hashMap = map == null ? null : new HashMap(map);
        AFc1xSDK aFc1xSDK = this.AppsFlyerLib;
        if (context != null) {
            aFc1xSDK.values.values = context.getApplicationContext();
        }
        AFe1sSDK aFe1sSDK = new AFe1sSDK();
        if (context != null) {
            aFe1sSDK.valueOf = (Application) context.getApplicationContext();
        }
        aFe1sSDK.AFLogger = str;
        aFe1sSDK.AFInAppEventType = appsFlyerRequestListener;
        if (hashMap != null && hashMap.containsKey(AFInAppEventParameterName.TOUCH_OBJ)) {
            HashMap hashMap2 = new HashMap();
            Object obj = hashMap.get(AFInAppEventParameterName.TOUCH_OBJ);
            if (obj instanceof MotionEvent) {
                MotionEvent motionEvent = (MotionEvent) obj;
                HashMap hashMap3 = new HashMap();
                hashMap3.put("x", Float.valueOf(motionEvent.getX()));
                hashMap3.put("y", Float.valueOf(motionEvent.getY()));
                hashMap2.put("loc", hashMap3);
                hashMap2.put("pf", Float.valueOf(motionEvent.getPressure()));
                hashMap2.put("rad", Float.valueOf(motionEvent.getTouchMajor() / 2.0f));
            } else {
                hashMap2.put("error", "Parsing failed due to invalid input in 'af_touch_obj'.");
                AFLogger.AFInAppEventParameterName("Parsing failed due to invalid input in 'af_touch_obj'.");
            }
            Map<String, ?> singletonMap = Collections.singletonMap("tch_data", hashMap2);
            hashMap.remove(AFInAppEventParameterName.TOUCH_OBJ);
            aFe1sSDK.AFInAppEventType(singletonMap);
        }
        aFe1sSDK.AFKeystoreWrapper = hashMap;
        AFb1qSDK afWarnLog2 = values().afWarnLog();
        String[] strArr = new String[2];
        strArr[0] = str;
        Map map2 = aFe1sSDK.AFKeystoreWrapper;
        if (map2 == null) {
            map2 = new HashMap();
        }
        strArr[1] = new JSONObject(map2).toString();
        afWarnLog2.AFInAppEventType("logEvent", strArr);
        if (str == null) {
            AFInAppEventParameterName(context, AFd1dSDK.logEvent);
        }
        AFInAppEventType(aFe1sSDK, context instanceof Activity ? (Activity) context : null);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context, String str) {
        int i6 = onValidateInApp + R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle;
        onValidateInAppFailure = i6 % 128;
        int i10 = i6 % 2;
        start(context, str, null);
        int i11 = onValidateInAppFailure + 91;
        onValidateInApp = i11 % 128;
        int i12 = i11 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(DeepLinkListener deepLinkListener, long j10) {
        int i6 = onValidateInAppFailure + 57;
        onValidateInApp = i6 % 128;
        if ((i6 % 2 == 0 ? (char) 23 : 'P') == 'P') {
            AFa1sSDK.AFInAppEventParameterName().AFInAppEventParameterName = deepLinkListener;
            AFb1pSDK.init = j10;
            return;
        }
        AFa1sSDK.AFInAppEventParameterName().AFInAppEventParameterName = deepLinkListener;
        AFb1pSDK.init = j10;
        throw null;
    }

    public final AFc1zSDK values() {
        int i6 = onValidateInAppFailure + R.styleable.AppCompatTheme_textAppearanceListItem;
        int i10 = i6 % 128;
        onValidateInApp = i10;
        int i11 = i6 % 2;
        AFc1xSDK aFc1xSDK = this.AppsFlyerLib;
        int i12 = i10 + R.styleable.AppCompatTheme_textAppearanceListItem;
        onValidateInAppFailure = i12 % 128;
        if (!(i12 % 2 != 0)) {
            return aFc1xSDK;
        }
        int i13 = 70 / 0;
        return aFc1xSDK;
    }

    public static /* synthetic */ boolean AFInAppEventParameterName(AFb1xSDK aFb1xSDK, AFa1tSDK aFa1tSDK, SharedPreferences sharedPreferences) {
        int i6 = onValidateInAppFailure + 13;
        onValidateInApp = i6 % 128;
        int i10 = i6 % 2;
        boolean AFInAppEventType2 = aFb1xSDK.AFInAppEventType(aFa1tSDK, sharedPreferences);
        int i11 = onValidateInApp + 69;
        onValidateInAppFailure = i11 % 128;
        if (!(i11 % 2 != 0)) {
            return AFInAppEventType2;
        }
        throw null;
    }

    public static String AFInAppEventType() {
        int i6 = onValidateInApp + 1;
        onValidateInAppFailure = i6 % 128;
        int i10 = i6 % 2;
        String valueOf2 = valueOf(AppsFlyerProperties.APP_USER_ID);
        int i11 = onValidateInApp + 89;
        onValidateInAppFailure = i11 % 128;
        int i12 = i11 % 2;
        return valueOf2;
    }

    public static /* synthetic */ void valueOf(ScheduledExecutorService scheduledExecutorService, Runnable runnable, TimeUnit timeUnit) {
        int i6 = onValidateInApp + R.styleable.AppCompatTheme_windowMinWidthMinor;
        onValidateInAppFailure = i6 % 128;
        int i10 = i6 % 2;
        AFKeystoreWrapper(scheduledExecutorService, runnable, 0L, timeUnit);
        int i11 = onValidateInAppFailure + 93;
        onValidateInApp = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void values(Context context, Intent intent) {
        AFc1xSDK aFc1xSDK = this.AppsFlyerLib;
        if (context != null) {
            aFc1xSDK.values.values = context.getApplicationContext();
        }
        AFa1sSDK.AFInAppEventParameterName();
        Context context2 = this.AppsFlyerLib.values.values;
        if (context2 != null) {
            AFc1ySDK aFc1ySDK = new AFc1ySDK(valueOf(context2));
            Uri valueOf2 = AFa1sSDK.valueOf(intent);
            boolean z10 = (valueOf2 == null || valueOf2.toString().isEmpty()) ? false : true;
            if (aFc1ySDK.AFInAppEventParameterName("ddl_sent") && !z10) {
                AFb1hSDK.AFInAppEventParameterName("No direct deep link", null);
                return;
            } else {
                AFa1sSDK.AFInAppEventParameterName().AFKeystoreWrapper(new HashMap(), intent, context);
                return;
            }
        }
        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
    }

    public final void AFKeystoreWrapper(Context context) {
        AFc1xSDK aFc1xSDK = this.AppsFlyerLib;
        if (context != null) {
            int i6 = onValidateInAppFailure + 93;
            onValidateInApp = i6 % 128;
            int i10 = i6 % 2;
            AFb1bSDK aFb1bSDK = aFc1xSDK.values;
            if ((context != null ? '<' : 'U') != '<') {
                return;
            }
            aFb1bSDK.values = context.getApplicationContext();
            int i11 = onValidateInApp + 59;
            onValidateInAppFailure = i11 % 128;
            int i12 = i11 % 2;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context, String str, final AppsFlyerRequestListener appsFlyerRequestListener) {
        if (AFa1aSDK.AFKeystoreWrapper != null) {
            return;
        }
        if (!this.onResponseNative) {
            AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! The API call 'start()' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
            if ((str == null ? '\"' : '#') != '#') {
                if (appsFlyerRequestListener != null) {
                    appsFlyerRequestListener.onError(RequestError.NO_DEV_KEY, AFb1cSDK.AFInAppEventType);
                }
                int i6 = onValidateInApp + 9;
                onValidateInAppFailure = i6 % 128;
                int i10 = i6 % 2;
                return;
            }
        }
        AFc1xSDK aFc1xSDK = this.AppsFlyerLib;
        if (context != null) {
            int i11 = onValidateInApp + 41;
            onValidateInAppFailure = i11 % 128;
            if (i11 % 2 == 0) {
                AFb1bSDK aFb1bSDK = aFc1xSDK.values;
                if (context != null) {
                    aFb1bSDK.values = context.getApplicationContext();
                }
            } else {
                AFb1bSDK aFb1bSDK2 = aFc1xSDK.values;
                throw null;
            }
        }
        final AFd1bSDK afInfoLog2 = values().afInfoLog();
        afInfoLog2.values(AFa1pSDK.values(context));
        this.onResponseErrorNative = (Application) context.getApplicationContext();
        AFb1qSDK.AFInAppEventParameterName().AFInAppEventType("start", str);
        String str2 = AFKeystoreWrapper;
        AFLogger.afInfoLog(String.format("Starting AppsFlyer: (v%s.%s)", "6.9.1", str2));
        StringBuilder sb2 = new StringBuilder("Build Number: ");
        sb2.append(str2);
        AFLogger.afInfoLog(sb2.toString());
        AppsFlyerProperties.getInstance().loadProperties(this.onResponseErrorNative.getApplicationContext());
        if (!TextUtils.isEmpty(str)) {
            this.AppsFlyerLib.AFVersionDeclaration().values = str;
            AFb1rSDK.AFInAppEventType(str);
            int i12 = onValidateInAppFailure + R.styleable.AppCompatTheme_windowActionBar;
            onValidateInApp = i12 % 128;
            int i13 = i12 % 2;
        } else if (TextUtils.isEmpty(this.AppsFlyerLib.AFVersionDeclaration().values)) {
            AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
            if (appsFlyerRequestListener != null) {
                appsFlyerRequestListener.onError(RequestError.NO_DEV_KEY, AFb1cSDK.AFInAppEventType);
            }
            int i14 = onValidateInApp + 81;
            onValidateInAppFailure = i14 % 128;
            if (i14 % 2 != 0) {
                int i15 = 82 / 0;
                return;
            }
            return;
        }
        values().afDebugLog().AFInAppEventType((AFd1qSDK) null);
        afDebugLog();
        afRDLog(this.onResponseErrorNative.getBaseContext());
        if (this.onResponseError) {
            afInfoLog(this.onResponseErrorNative.getApplicationContext());
        }
        AFa1aSDK.AFKeystoreWrapper(context, new AFa1aSDK.AFa1xSDK() { // from class: com.appsflyer.internal.AFb1xSDK.4
            @Override // com.appsflyer.internal.AFa1aSDK.AFa1xSDK
            public final void AFKeystoreWrapper(Activity activity) {
                afInfoLog2.valueOf();
                AFb1xSDK.this.values().afDebugLog().AFInAppEventType((AFd1qSDK) null);
                AFb1xSDK.AFInAppEventParameterName(AFb1xSDK.this);
                int AFKeystoreWrapper2 = AFb1xSDK.AFKeystoreWrapper(AFb1xSDK.valueOf((Context) activity), false);
                AFLogger.afInfoLog("onBecameForeground");
                if (AFKeystoreWrapper2 < 2) {
                    AFa1cSDK valueOf2 = AFa1cSDK.valueOf(activity);
                    valueOf2.AFInAppEventType.post(valueOf2.afErrorLog);
                    valueOf2.AFInAppEventType.post(valueOf2.AFInAppEventParameterName);
                }
                AFe1pSDK aFe1pSDK = new AFe1pSDK();
                AFa1sSDK.AFInAppEventParameterName().AFKeystoreWrapper(aFe1pSDK.AFInAppEventParameterName(), activity.getIntent(), activity.getApplication());
                AFb1xSDK aFb1xSDK = AFb1xSDK.this;
                aFe1pSDK.valueOf = (Application) activity.getApplicationContext();
                aFe1pSDK.AFInAppEventType = appsFlyerRequestListener;
                aFb1xSDK.AFInAppEventType(aFe1pSDK, activity);
            }

            @Override // com.appsflyer.internal.AFa1aSDK.AFa1xSDK
            public final void AFKeystoreWrapper(Context context2) {
                AFLogger.afInfoLog("onBecameBackground");
                AFd1bSDK aFd1bSDK = afInfoLog2;
                long currentTimeMillis = System.currentTimeMillis();
                long j10 = aFd1bSDK.afRDLog;
                if (j10 != 0) {
                    long j11 = currentTimeMillis - j10;
                    if (j11 > 0 && j11 < 1000) {
                        j11 = 1000;
                    }
                    long seconds = TimeUnit.MILLISECONDS.toSeconds(j11);
                    aFd1bSDK.AFLogger$LogLevel = seconds;
                    aFd1bSDK.AFInAppEventType.AFInAppEventParameterName("prev_session_dur", seconds);
                } else {
                    AFLogger.afInfoLog("Metrics: fg ts is missing");
                }
                AFLogger.afInfoLog("callStatsBackground background call");
                AFb1xSDK.this.AFInAppEventType(new WeakReference<>(context2));
                AFb1qSDK AFInAppEventParameterName2 = AFb1qSDK.AFInAppEventParameterName();
                if (AFInAppEventParameterName2.afErrorLog()) {
                    AFInAppEventParameterName2.AFKeystoreWrapper();
                    if (context2 != null && !AppsFlyerLib.getInstance().isStopped()) {
                        AFInAppEventParameterName2.valueOf(context2.getPackageName(), context2.getPackageManager(), AFb1xSDK.valueOf(AFb1xSDK.this));
                    }
                    AFInAppEventParameterName2.valueOf();
                } else {
                    AFLogger.afDebugLog("RD status is OFF");
                }
                AFa1cSDK.valueOf(context2).AFKeystoreWrapper();
            }
        }, this.AppsFlyerLib.AFKeystoreWrapper());
    }

    private void afDebugLog() {
        int i6 = onValidateInAppFailure + 49;
        onValidateInApp = i6 % 128;
        if ((i6 % 2 == 0 ? 'O' : (char) 6) != 'O') {
            if (!AFc1bSDK.afRDLog()) {
                AFc1zSDK values2 = values();
                AFc1mSDK afErrorLog2 = values2.afErrorLog();
                afErrorLog2.AFInAppEventParameterName.execute(new AFc1mSDK.AnonymousClass3(new AFc1bSDK(values2)));
                return;
            }
            int i10 = onValidateInAppFailure + R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle;
            onValidateInApp = i10 % 128;
            if (i10 % 2 != 0) {
                return;
            }
            throw null;
        }
        AFc1bSDK.afRDLog();
        throw null;
    }

    private static String valueOf(String str) {
        int i6 = onValidateInAppFailure + 67;
        onValidateInApp = i6 % 128;
        if (i6 % 2 == 0) {
            int i10 = 75 / 0;
            return AppsFlyerProperties.getInstance().getString(str);
        }
        return AppsFlyerProperties.getInstance().getString(str);
    }

    public final void AFInAppEventParameterName(Context context, Intent intent) {
        if (intent.getStringExtra("appsflyer_preinstall") != null) {
            int i6 = onValidateInApp + 69;
            onValidateInAppFailure = i6 % 128;
            int i10 = i6 % 2;
            AFInAppEventParameterName(intent.getStringExtra("appsflyer_preinstall"));
        }
        AFLogger.afInfoLog("****** onReceive called *******");
        AppsFlyerProperties.getInstance();
        String stringExtra = intent.getStringExtra("referrer");
        AFLogger.afInfoLog("Play store referrer: ".concat(String.valueOf(stringExtra)));
        if (stringExtra != null) {
            AFInAppEventParameterName(context).valueOf("referrer", stringExtra);
            AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
            appsFlyerProperties.set("AF_REFERRER", stringExtra);
            appsFlyerProperties.valueOf = stringExtra;
            if (AppsFlyerProperties.getInstance().values()) {
                int i11 = onValidateInApp + 97;
                onValidateInAppFailure = i11 % 128;
                if (i11 % 2 == 0) {
                    AFLogger.afInfoLog("onReceive: isLaunchCalled");
                    AFInAppEventParameterName(context, AFd1dSDK.onReceive);
                    AFKeystoreWrapper(context, stringExtra);
                } else {
                    AFLogger.afInfoLog("onReceive: isLaunchCalled");
                    AFInAppEventParameterName(context, AFd1dSDK.onReceive);
                    AFKeystoreWrapper(context, stringExtra);
                    throw null;
                }
            }
        }
        int i12 = onValidateInAppFailure + 49;
        onValidateInApp = i12 % 128;
        if ((i12 % 2 == 0 ? '>' : '6') != '>') {
            return;
        }
        int i13 = 55 / 0;
    }

    public final void AFInAppEventType(WeakReference<Context> weakReference) {
        if (weakReference.get() == null) {
            return;
        }
        AFLogger.afInfoLog("app went to background");
        SharedPreferences valueOf2 = valueOf(weakReference.get());
        AppsFlyerProperties.getInstance().saveProperties(valueOf2);
        long j10 = values().afInfoLog().AFLogger$LogLevel;
        HashMap hashMap = new HashMap();
        String str = this.AppsFlyerLib.AFVersionDeclaration().values;
        if (str != null) {
            String valueOf3 = valueOf("KSAppsFlyerId");
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
                int i6 = onValidateInApp + 37;
                onValidateInAppFailure = i6 % 128;
                int i10 = i6 % 2;
                hashMap.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
            }
            AFa1uSDK valueOf4 = AFb1zSDK.valueOf(weakReference.get().getContentResolver());
            if (!(valueOf4 == null)) {
                hashMap.put("amazon_aid", valueOf4.AFInAppEventParameterName);
                hashMap.put("amazon_aid_limit", String.valueOf(valueOf4.values));
            }
            String string = AppsFlyerProperties.getInstance().getString("advertiserId");
            if (string != null) {
                hashMap.put("advertiserId", string);
            }
            hashMap.put("app_id", weakReference.get().getPackageName());
            hashMap.put("devkey", str);
            hashMap.put(SessionManager.KEY_UID, AFb1uSDK.values(weakReference));
            hashMap.put("time_in_app", String.valueOf(j10));
            hashMap.put("statType", "user_closed_app");
            hashMap.put("platform", "Android");
            hashMap.put("launch_counter", Integer.toString(AFKeystoreWrapper(valueOf2, false)));
            hashMap.put(AppsFlyerProperties.CHANNEL, AFInAppEventType(weakReference.get()));
            if (valueOf3 != null) {
                int i11 = onValidateInAppFailure + 41;
                onValidateInApp = i11 % 128;
                int i12 = i11 % 2;
            } else {
                valueOf3 = "";
            }
            hashMap.put("originalAppsflyerId", valueOf3);
            if (!this.onConversionDataSuccess) {
                AFLogger.afDebugLog("Stats call is disabled, ignore ...");
                return;
            }
            AFe1tSDK aFe1tSDK = new AFe1tSDK();
            ((AFe1wSDK) aFe1tSDK).afWarnLog = isStopped();
            AFd1uSDK aFd1uSDK = new AFd1uSDK((AFe1tSDK) aFe1tSDK.AFInAppEventType(hashMap).AFKeystoreWrapper(String.format(afDebugLog, AppsFlyerLib.getInstance().getHostPrefix(), AFKeystoreWrapper().getHostName())), this.AppsFlyerLib);
            AFc1mSDK afErrorLog2 = this.AppsFlyerLib.afErrorLog();
            afErrorLog2.AFInAppEventParameterName.execute(new AFc1mSDK.AnonymousClass3(aFd1uSDK));
            int i13 = onValidateInApp + 53;
            onValidateInAppFailure = i13 % 128;
            if (!(i13 % 2 != 0)) {
                return;
            }
            int i14 = 71 / 0;
            return;
        }
        AFLogger.afWarnLog("[callStats] AppsFlyer's SDK cannot send any event without providing DevKey.");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(AppsFlyerProperties.EmailsCryptType emailsCryptType, String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length + 1);
        arrayList.add(emailsCryptType.toString());
        arrayList.addAll(Arrays.asList(strArr));
        AFb1qSDK.AFInAppEventParameterName().AFInAppEventType("setUserEmails", (String[]) arrayList.toArray(new String[strArr.length + 1]));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EMAIL_CRYPT_TYPE, emailsCryptType.getValue());
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        int length = strArr.length;
        String str = null;
        int i6 = 0;
        while (true) {
            if ((i6 < length ? (char) 16 : '&') != '&') {
                int i10 = onValidateInApp + R.styleable.AppCompatTheme_tooltipFrameBackground;
                onValidateInAppFailure = i10 % 128;
                int i11 = i10 % 2;
                String str2 = strArr[i6];
                if (AnonymousClass7.AFKeystoreWrapper[emailsCryptType.ordinal()] != 2) {
                    arrayList2.add(AFb1tSDK.values(str2));
                    int i12 = onValidateInAppFailure + 95;
                    onValidateInApp = i12 % 128;
                    int i13 = i12 % 2;
                    str = "sha256_el_arr";
                } else {
                    arrayList2.add(str2);
                    int i14 = onValidateInAppFailure + 41;
                    onValidateInApp = i14 % 128;
                    int i15 = i14 % 2;
                    str = "plain_el_arr";
                }
                i6++;
            } else {
                hashMap.put(str, arrayList2);
                AppsFlyerProperties.getInstance().setUserEmails(new JSONObject(hashMap).toString());
                return;
            }
        }
    }

    public static String valueOf(SimpleDateFormat simpleDateFormat, long j10) {
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        String format = simpleDateFormat.format(new Date(j10));
        int i6 = onValidateInAppFailure + 75;
        onValidateInApp = i6 % 128;
        if ((i6 % 2 == 0 ? '/' : 'I') == 'I') {
            return format;
        }
        throw null;
    }

    public static AFb1xSDK AFKeystoreWrapper() {
        int i6 = onValidateInAppFailure;
        int i10 = i6 + 75;
        onValidateInApp = i10 % 128;
        int i11 = i10 % 2;
        AFb1xSDK aFb1xSDK = AFLogger$LogLevel;
        int i12 = i6 + R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle;
        onValidateInApp = i12 % 128;
        if ((i12 % 2 == 0 ? (char) 15 : 'C') != 'C') {
            int i13 = 10 / 0;
            return aFb1xSDK;
        }
        return aFb1xSDK;
    }

    private static String valueOf(Activity activity) {
        int i6 = onValidateInAppFailure + 45;
        int i10 = i6 % 128;
        onValidateInApp = i10;
        String str = null;
        if (i6 % 2 == 0) {
            throw null;
        }
        if (activity != null) {
            int i11 = i10 + 91;
            onValidateInAppFailure = i11 % 128;
            if ((i11 % 2 != 0 ? (char) 15 : '-') == '-') {
                Intent intent = activity.getIntent();
                if ((intent != null ? 'O' : 'Z') != 'Z') {
                    try {
                        Bundle extras = intent.getExtras();
                        if ((extras != null ? '&' : (char) 25) != 25 && (str = extras.getString("af")) != null) {
                            int i12 = onValidateInApp + 35;
                            onValidateInAppFailure = i12 % 128;
                            if (i12 % 2 != 0) {
                                AFLogger.afInfoLog("Push Notification received af payload = ".concat(str));
                                extras.remove("af");
                                activity.setIntent(intent.putExtras(extras));
                                int i13 = 79 / 0;
                            } else {
                                AFLogger.afInfoLog("Push Notification received af payload = ".concat(str));
                                extras.remove("af");
                                activity.setIntent(intent.putExtras(extras));
                            }
                        }
                    } catch (Throwable th2) {
                        AFLogger.afErrorLog(th2.getMessage(), th2);
                    }
                }
            } else {
                activity.getIntent();
                throw null;
            }
        }
        return str;
    }

    private void AFKeystoreWrapper(Context context, String str) {
        AFe1uSDK aFe1uSDK = new AFe1uSDK();
        if (context != null) {
            int i6 = onValidateInApp + 75;
            onValidateInAppFailure = i6 % 128;
            int i10 = i6 % 2;
            aFe1uSDK.valueOf = (Application) context.getApplicationContext();
            int i11 = onValidateInAppFailure + 67;
            onValidateInApp = i11 % 128;
            int i12 = i11 % 2;
        }
        aFe1uSDK.afRDLog = str;
        if ((str != null ? '\\' : '\"') != '\\') {
            return;
        }
        int i13 = onValidateInAppFailure + 97;
        onValidateInApp = i13 % 128;
        int i14 = i13 % 2;
        if ((str.length() <= 5) || !AFInAppEventType(aFe1uSDK, valueOf(context))) {
            return;
        }
        AFKeystoreWrapper(this.AppsFlyerLib.valueOf(), new AFa1xSDK(this, aFe1uSDK, (byte) 0), 5L, TimeUnit.MILLISECONDS);
    }

    private static String afRDLog() {
        int i6 = onValidateInApp + 77;
        onValidateInAppFailure = i6 % 128;
        if (!(i6 % 2 == 0)) {
            valueOf(AppsFlyerProperties.APP_ID);
            throw null;
        }
        String valueOf2 = valueOf(AppsFlyerProperties.APP_ID);
        int i10 = onValidateInAppFailure + 59;
        onValidateInApp = i10 % 128;
        if ((i10 % 2 == 0 ? 'M' : 'V') != 'M') {
            return valueOf2;
        }
        int i11 = 87 / 0;
        return valueOf2;
    }

    private static File afRDLog(String str) {
        int i6 = onValidateInAppFailure + 37;
        onValidateInApp = i6 % 128;
        int i10 = i6 % 2;
        if ((str != null ? (char) 18 : 'K') != 18) {
            return null;
        }
        try {
            if (str.trim().length() > 0) {
                File file = new File(str.trim());
                int i11 = onValidateInApp + 59;
                onValidateInAppFailure = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 57 / 0;
                    return file;
                }
                return file;
            }
            return null;
        } catch (Throwable th2) {
            AFLogger.afErrorLog(th2.getMessage(), th2);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00db A[Catch: JSONException -> 0x0117, TRY_ENTER, TryCatch #1 {JSONException -> 0x0117, blocks: (B:24:0x006f, B:25:0x007b, B:31:0x0087, B:36:0x00a5, B:47:0x00db, B:50:0x00f4, B:39:0x00b8), top: B:76:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f4 A[Catch: JSONException -> 0x0117, TRY_LEAVE, TryCatch #1 {JSONException -> 0x0117, blocks: (B:24:0x006f, B:25:0x007b, B:31:0x0087, B:36:0x00a5, B:47:0x00db, B:50:0x00f4, B:39:0x00b8), top: B:76:0x006f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void values(JSONObject jSONObject) {
        String str;
        int i6;
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            try {
                JSONArray jSONArray = new JSONArray((String) jSONObject.get(keys.next()));
                int i10 = 0;
                while (i10 < jSONArray.length()) {
                    int i11 = onValidateInAppFailure + R.styleable.AppCompatTheme_textColorSearchUrl;
                    onValidateInApp = i11 % 128;
                    if (i11 % 2 != 0) {
                        arrayList.add(Long.valueOf(jSONArray.getLong(i10)));
                        i10++;
                    } else {
                        arrayList.add(Long.valueOf(jSONArray.getLong(i10)));
                        i10 += 84;
                    }
                }
            } catch (JSONException unused) {
            }
        }
        Collections.sort(arrayList);
        Iterator<String> keys2 = jSONObject.keys();
        loop2: while (true) {
            str = null;
            while (keys2.hasNext() && str == null) {
                String next = keys2.next();
                try {
                    JSONArray jSONArray2 = new JSONArray((String) jSONObject.get(next));
                    int i12 = 0;
                    while (true) {
                        if (!(i12 < jSONArray2.length())) {
                            break;
                        } else if (jSONArray2.getLong(i12) != ((Long) arrayList.get(0)).longValue()) {
                            int i13 = onValidateInApp + 41;
                            onValidateInAppFailure = i13 % 128;
                            if (i13 % 2 != 0) {
                                if (jSONArray2.getLong(i12) != ((Long) arrayList.get(1)).longValue()) {
                                    i6 = onValidateInApp + R.styleable.AppCompatTheme_windowFixedWidthMinor;
                                    onValidateInAppFailure = i6 % 128;
                                    if (i6 % 2 == 0) {
                                        if (!(jSONArray2.getLong(i12) != ((Long) arrayList.get(arrayList.size() - 1)).longValue())) {
                                            break;
                                        }
                                        i12++;
                                        str = next;
                                    } else if (jSONArray2.getLong(i12) == ((Long) arrayList.get(arrayList.size() + 1)).longValue()) {
                                        break;
                                    } else {
                                        i12++;
                                        str = next;
                                    }
                                }
                            } else {
                                if (jSONArray2.getLong(i12) == ((Long) arrayList.get(1)).longValue()) {
                                    break;
                                }
                                i6 = onValidateInApp + R.styleable.AppCompatTheme_windowFixedWidthMinor;
                                onValidateInAppFailure = i6 % 128;
                                if (i6 % 2 == 0) {
                                }
                            }
                        }
                    }
                } catch (JSONException unused2) {
                }
            }
        }
        if ((str != null ? '4' : (char) 30) != '4') {
            return;
        }
        int i14 = onValidateInApp + R.styleable.AppCompatTheme_tooltipFrameBackground;
        onValidateInAppFailure = i14 % 128;
        if (i14 % 2 != 0) {
            jSONObject.remove(str);
            int i15 = 65 / 0;
            return;
        }
        jSONObject.remove(str);
    }

    private void AFKeystoreWrapper(AFa1tSDK aFa1tSDK) {
        String format;
        int i6;
        AFe1hSDK aFe1hSDK;
        int i10 = onValidateInApp + R.styleable.AppCompatTheme_windowActionModeOverlay;
        onValidateInAppFailure = i10 % 128;
        int i11 = i10 % 2;
        Application application = aFa1tSDK.valueOf;
        if (application == null) {
            AFLogger.afDebugLog("sendWithEvent - got null context. skipping event/launch.");
            return;
        }
        SharedPreferences valueOf2 = valueOf(application);
        AppsFlyerProperties.getInstance().saveProperties(valueOf2);
        if (!this.AppsFlyerLib.AFVersionDeclaration().values()) {
            AFLogger.afInfoLog("sendWithEvent from activity: ".concat(application.getClass().getName()));
        }
        boolean valueOf3 = aFa1tSDK.valueOf();
        boolean z10 = aFa1tSDK instanceof AFe1uSDK;
        boolean z11 = aFa1tSDK instanceof AFe1vSDK;
        Map<String, ?> values2 = values(aFa1tSDK);
        String str = (String) values2.get("appsflyerKey");
        boolean z12 = false;
        if ((str == null) || str.length() == 0) {
            AFLogger.afDebugLog("Not sending data yet, waiting for dev key");
            AppsFlyerRequestListener appsFlyerRequestListener = aFa1tSDK.AFInAppEventType;
            if (appsFlyerRequestListener != null) {
                appsFlyerRequestListener.onError(RequestError.NO_DEV_KEY, AFb1cSDK.AFInAppEventType);
                return;
            }
            return;
        }
        if (!isStopped()) {
            AFLogger.afInfoLog("AppsFlyerLib.sendWithEvent");
        }
        int AFKeystoreWrapper2 = AFKeystoreWrapper(valueOf2, false);
        if (z11 || z10) {
            format = String.format(AFVersionDeclaration, AppsFlyerLib.getInstance().getHostPrefix(), AFKeystoreWrapper().getHostName());
        } else if (valueOf3) {
            int i12 = onValidateInAppFailure + 35;
            onValidateInApp = i12 % 128;
            if (i12 % 2 != 0 ? AFKeystoreWrapper2 < 2 : AFKeystoreWrapper2 < 3) {
                format = String.format(init, AppsFlyerLib.getInstance().getHostPrefix(), AFKeystoreWrapper().getHostName());
            } else {
                format = String.format(getLevel, AppsFlyerLib.getInstance().getHostPrefix(), AFKeystoreWrapper().getHostName());
            }
        } else {
            format = String.format(afWarnLog, AppsFlyerLib.getInstance().getHostPrefix(), AFKeystoreWrapper().getHostName());
        }
        StringBuilder c10 = h.c(format);
        c10.append(application.getPackageName());
        String obj = c10.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append("&buildnumber=6.9.1");
        String obj2 = sb2.toString();
        String AFInAppEventType2 = AFInAppEventType(application);
        if (AFInAppEventType2 != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(obj2);
            sb3.append("&channel=");
            sb3.append(AFInAppEventType2);
            obj2 = sb3.toString();
            int i13 = onValidateInApp + 23;
            onValidateInAppFailure = i13 % 128;
            int i14 = i13 % 2;
        }
        AFKeystoreWrapper(values2);
        AFa1wSDK aFa1wSDK = new AFa1wSDK(this, aFa1tSDK.AFKeystoreWrapper(obj2).AFInAppEventType(values2).AFInAppEventType(AFKeystoreWrapper2), (byte) 0);
        if (valueOf3) {
            AFe1hSDK[] afInfoLog2 = afInfoLog();
            int length = afInfoLog2.length;
            boolean z13 = false;
            while (i6 < length) {
                int i15 = onValidateInApp + 5;
                onValidateInAppFailure = i15 % 128;
                if (i15 % 2 != 0) {
                    aFe1hSDK = afInfoLog2[i6];
                    int i16 = 67 / 0;
                    i6 = aFe1hSDK.afRDLog != AFe1hSDK.AFa1zSDK.STARTED ? i6 + 1 : 0;
                    StringBuilder sb4 = new StringBuilder("Failed to get ");
                    sb4.append(aFe1hSDK.AFKeystoreWrapper);
                    sb4.append(" referrer, wait ...");
                    AFLogger.afDebugLog(sb4.toString());
                    z13 = true;
                } else {
                    aFe1hSDK = afInfoLog2[i6];
                    if (aFe1hSDK.afRDLog != AFe1hSDK.AFa1zSDK.STARTED) {
                    }
                    StringBuilder sb42 = new StringBuilder("Failed to get ");
                    sb42.append(aFe1hSDK.AFKeystoreWrapper);
                    sb42.append(" referrer, wait ...");
                    AFLogger.afDebugLog(sb42.toString());
                    z13 = true;
                }
            }
            if (!this.onResponseError || AFLogger()) {
                z12 = z13;
            } else {
                int i17 = onValidateInApp + R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle;
                onValidateInAppFailure = i17 % 128;
                int i18 = i17 % 2;
                AFLogger.afDebugLog("fetching Facebook deferred AppLink data, wait ...");
                z12 = true;
            }
            if (this.AppsFlyerLib.AFVersionDeclaration().AFKeystoreWrapper()) {
                z12 = true;
            }
        }
        AFKeystoreWrapper(this.AppsFlyerLib.valueOf(), aFa1wSDK, z12 ? 500L : 0L, TimeUnit.MILLISECONDS);
    }

    private AFe1hSDK[] afInfoLog() {
        int i6 = onValidateInApp + 55;
        onValidateInAppFailure = i6 % 128;
        int i10 = i6 % 2;
        AFe1hSDK[] AFInAppEventType2 = values().init().AFInAppEventType();
        int i11 = onValidateInAppFailure + 71;
        onValidateInApp = i11 % 128;
        int i12 = i11 % 2;
        return AFInAppEventType2;
    }

    public final void AFInAppEventParameterName(Context context, String str) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONObject jSONObject;
        AFLogger.afDebugLog("received a new (extra) referrer: ".concat(String.valueOf(str)));
        try {
            long currentTimeMillis = System.currentTimeMillis();
            String string = valueOf(context).getString("extraReferrers", null);
            if (string == null) {
                jSONObject = new JSONObject();
                jSONArray2 = new JSONArray();
            } else {
                JSONObject jSONObject2 = new JSONObject(string);
                if (jSONObject2.has(str)) {
                    jSONArray = new JSONArray((String) jSONObject2.get(str));
                } else {
                    jSONArray = new JSONArray();
                }
                jSONArray2 = jSONArray;
                jSONObject = jSONObject2;
            }
            if ((((long) jSONArray2.length()) < 5 ? 'R' : (char) 18) == 'R') {
                int i6 = onValidateInAppFailure + 81;
                onValidateInApp = i6 % 128;
                int i10 = i6 % 2;
                jSONArray2.put(currentTimeMillis);
            }
            if ((((long) jSONObject.length()) >= 4 ? (char) 26 : '(') == 26) {
                values(jSONObject);
            }
            jSONObject.put(str, jSONArray2.toString());
            AFInAppEventParameterName(context).valueOf("extraReferrers", jSONObject.toString());
            int i11 = onValidateInAppFailure + 23;
            onValidateInApp = i11 % 128;
            int i12 = i11 % 2;
        } catch (JSONException unused) {
        } catch (Throwable th2) {
            StringBuilder sb2 = new StringBuilder("Couldn't save referrer - ");
            sb2.append(str);
            sb2.append(": ");
            AFLogger.afErrorLog(sb2.toString(), th2);
        }
    }

    private boolean afErrorLog() {
        String format;
        if (this.onAttributionFailureNative > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.onAttributionFailureNative;
            Locale locale = Locale.US;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", locale);
            String valueOf2 = valueOf(simpleDateFormat, this.onAttributionFailureNative);
            String valueOf3 = valueOf(simpleDateFormat, this.AppsFlyer2dXConversionCallback);
            if (currentTimeMillis < this.onInstallConversionFailureNative) {
                int i6 = onValidateInApp + 3;
                onValidateInAppFailure = i6 % 128;
                if (i6 % 2 == 0) {
                    if (!isStopped()) {
                        int i10 = onValidateInApp + 97;
                        onValidateInAppFailure = i10 % 128;
                        if (i10 % 2 == 0) {
                            format = String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", valueOf2, valueOf3, Long.valueOf(currentTimeMillis), Long.valueOf(this.onInstallConversionFailureNative));
                        } else {
                            Object[] objArr = new Object[2];
                            objArr[0] = valueOf2;
                            objArr[1] = valueOf3;
                            objArr[2] = Long.valueOf(currentTimeMillis);
                            objArr[2] = Long.valueOf(this.onInstallConversionFailureNative);
                            format = String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", objArr);
                        }
                        AFLogger.afInfoLog(format);
                        return true;
                    }
                } else {
                    isStopped();
                    throw null;
                }
            }
            if (!(isStopped())) {
                int i11 = onValidateInAppFailure + 15;
                onValidateInApp = i11 % 128;
                int i12 = i11 % 2;
                AFLogger.afInfoLog(String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", valueOf2, valueOf3, Long.valueOf(currentTimeMillis)));
            }
        } else if (!isStopped()) {
            AFLogger.afInfoLog("Sending first launch for this session!");
        }
        return false;
    }

    public static synchronized SharedPreferences valueOf(Context context) {
        AFb1xSDK AFKeystoreWrapper2;
        SharedPreferences sharedPreferences;
        synchronized (AFb1xSDK.class) {
            int i6 = onValidateInApp + R.styleable.AppCompatTheme_tooltipFrameBackground;
            onValidateInAppFailure = i6 % 128;
            if (i6 % 2 == 0) {
                if ((AFKeystoreWrapper().onResponse == null ? 'V' : '\'') != '\'') {
                    int i10 = onValidateInApp + 91;
                    onValidateInAppFailure = i10 % 128;
                    if (i10 % 2 != 0) {
                        AFKeystoreWrapper2 = AFKeystoreWrapper();
                        sharedPreferences = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
                    } else {
                        AFKeystoreWrapper2 = AFKeystoreWrapper();
                        sharedPreferences = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
                    }
                    AFKeystoreWrapper2.onResponse = sharedPreferences;
                }
                SharedPreferences sharedPreferences2 = AFKeystoreWrapper().onResponse;
                int i11 = onValidateInAppFailure + 93;
                onValidateInApp = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 71 / 0;
                    return sharedPreferences2;
                }
                return sharedPreferences2;
            }
            SharedPreferences sharedPreferences3 = AFKeystoreWrapper().onResponse;
            throw null;
        }
    }

    private static int valueOf(SharedPreferences sharedPreferences, boolean z10) {
        int i6 = onValidateInAppFailure + 93;
        onValidateInApp = i6 % 128;
        boolean z11 = i6 % 2 != 0;
        int AFKeystoreWrapper2 = AFKeystoreWrapper(sharedPreferences, "appsFlyerInAppEventCount", z10);
        if (!z11) {
            int i10 = 18 / 0;
        }
        int i11 = onValidateInApp + 41;
        onValidateInAppFailure = i11 % 128;
        if ((i11 % 2 != 0 ? 'Q' : 'M') == 'M') {
            return AFKeystoreWrapper2;
        }
        throw null;
    }

    @Deprecated
    public static String valueOf(HttpURLConnection httpURLConnection) {
        String obj;
        BufferedReader bufferedReader;
        InputStreamReader inputStreamReader;
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = false;
        try {
            try {
                InputStream errorStream = httpURLConnection.getErrorStream();
                if (errorStream == null) {
                    errorStream = httpURLConnection.getInputStream();
                }
                InputStreamReader inputStreamReader2 = new InputStreamReader(errorStream);
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader2);
                    boolean z11 = false;
                    while (true) {
                        try {
                            String readLine = bufferedReader2.readLine();
                            if (readLine == null) {
                                break;
                            }
                            sb2.append(!z11 ? "" : '\n');
                            sb2.append(readLine);
                            z11 = true;
                        } catch (Throwable th2) {
                            bufferedReader = bufferedReader2;
                            th = th2;
                            inputStreamReader = inputStreamReader2;
                            try {
                                StringBuilder sb3 = new StringBuilder("Could not read connection response from: ");
                                sb3.append(httpURLConnection.getURL().toString());
                                AFLogger.afErrorLog(sb3.toString(), th);
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                }
                                if (inputStreamReader == null) {
                                    z10 = true;
                                }
                                if (!z10) {
                                    inputStreamReader.close();
                                }
                                obj = sb2.toString();
                                new JSONObject(obj);
                                return obj;
                            } catch (Throwable th3) {
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (Throwable th4) {
                                        AFLogger.afErrorLog(th4);
                                        throw th3;
                                    }
                                }
                                if (inputStreamReader != null) {
                                    int i6 = onValidateInAppFailure + 67;
                                    onValidateInApp = i6 % 128;
                                    if (i6 % 2 == 0) {
                                        inputStreamReader.close();
                                        throw null;
                                    }
                                    inputStreamReader.close();
                                }
                                throw th3;
                            }
                        }
                    }
                    bufferedReader2.close();
                    inputStreamReader2.close();
                    int i10 = onValidateInApp + R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle;
                    onValidateInAppFailure = i10 % 128;
                    int i11 = i10 % 2;
                } catch (Throwable th5) {
                    th = th5;
                    inputStreamReader = inputStreamReader2;
                    bufferedReader = null;
                }
            } catch (Throwable th6) {
                th = th6;
                bufferedReader = null;
                inputStreamReader = null;
            }
        } catch (Throwable th7) {
            AFLogger.afErrorLog(th7);
        }
        obj = sb2.toString();
        try {
            new JSONObject(obj);
            return obj;
        } catch (JSONException unused) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("string_response", obj);
                return jSONObject.toString();
            } catch (JSONException unused2) {
                return new JSONObject().toString();
            }
        }
    }

    private static void values(String str, boolean z10) {
        int i6 = onValidateInApp + 77;
        onValidateInAppFailure = i6 % 128;
        if ((i6 % 2 != 0 ? (char) 29 : 'L') != 29) {
            AppsFlyerProperties.getInstance().set(str, z10);
            return;
        }
        AppsFlyerProperties.getInstance().set(str, z10);
        int i10 = 51 / 0;
    }

    private static void AFInAppEventParameterName(String str, String str2) {
        int i6 = onValidateInApp + 69;
        onValidateInAppFailure = i6 % 128;
        if ((i6 % 2 != 0 ? 'Z' : 'E') != 'E') {
            AppsFlyerProperties.getInstance().set(str, str2);
            throw null;
        }
        AppsFlyerProperties.getInstance().set(str, str2);
        int i10 = onValidateInApp + 65;
        onValidateInAppFailure = i10 % 128;
        if ((i10 % 2 != 0 ? 'B' : '4') == '4') {
            return;
        }
        throw null;
    }

    private void values(Context context, String str, Map<String, Object> map) {
        Activity activity;
        AFe1sSDK aFe1sSDK = new AFe1sSDK();
        Activity activity2 = null;
        if (!(context == null)) {
            int i6 = onValidateInApp + 47;
            onValidateInAppFailure = i6 % 128;
            if (!(i6 % 2 != 0)) {
                aFe1sSDK.valueOf = (Application) context.getApplicationContext();
            } else {
                aFe1sSDK.valueOf = (Application) context.getApplicationContext();
                throw null;
            }
        }
        aFe1sSDK.AFLogger = str;
        aFe1sSDK.AFKeystoreWrapper = map;
        if (context instanceof Activity) {
            int i10 = onValidateInApp + 25;
            onValidateInAppFailure = i10 % 128;
            if ((i10 % 2 != 0 ? '\'' : '(') != '\'') {
                activity = (Activity) context;
            } else {
                activity = (Activity) context;
                int i11 = 99 / 0;
            }
            activity2 = activity;
        }
        AFInAppEventType(aFe1sSDK, activity2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
        if ((!AFInAppEventType(com.appsflyer.AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) != true) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
        if ((!AFInAppEventType(com.appsflyer.AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, true)) != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
        r0 = com.appsflyer.internal.AFb1xSDK.onValidateInAppFailure + com.appsflyer.R.styleable.AppCompatTheme_toolbarStyle;
        com.appsflyer.internal.AFb1xSDK.onValidateInApp = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
        if (AFInAppEventType() != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
        r0 = com.appsflyer.internal.AFb1xSDK.onValidateInAppFailure + com.appsflyer.R.styleable.AppCompatTheme_windowMinWidthMinor;
        com.appsflyer.internal.AFb1xSDK.onValidateInApp = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean AFInAppEventParameterName() {
        int i6 = onValidateInAppFailure + R.styleable.AppCompatTheme_windowMinWidthMinor;
        onValidateInApp = i6 % 128;
        if ((i6 % 2 == 0 ? '-' : '4') != '-') {
        }
        return false;
    }

    private void AFInAppEventParameterName(Context context, AFd1dSDK aFd1dSDK) {
        int i6 = onValidateInApp;
        int i10 = i6 + 57;
        onValidateInAppFailure = i10 % 128;
        if (!(i10 % 2 != 0)) {
            AFc1xSDK aFc1xSDK = this.AppsFlyerLib;
            if (context != null) {
                AFb1bSDK aFb1bSDK = aFc1xSDK.values;
                if (context != null) {
                    int i11 = i6 + 61;
                    onValidateInAppFailure = i11 % 128;
                    boolean z10 = i11 % 2 == 0;
                    aFb1bSDK.values = context.getApplicationContext();
                    if (!z10) {
                        int i12 = 91 / 0;
                    }
                }
            }
            AFd1bSDK afInfoLog2 = values().afInfoLog();
            AFe1zSDK values2 = AFa1pSDK.values(context);
            if ((afInfoLog2.AFKeystoreWrapper() ? (char) 23 : 'W') != 'W') {
                int i13 = onValidateInAppFailure + R.styleable.AppCompatTheme_windowFixedWidthMinor;
                onValidateInApp = i13 % 128;
                int i14 = i13 % 2;
                afInfoLog2.values.put("api_name", aFd1dSDK.toString());
                afInfoLog2.values(values2);
            }
            afInfoLog2.valueOf();
            return;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AFInAppEventType(AFa1tSDK aFa1tSDK, Activity activity) {
        String str;
        Uri AFInAppEventType2;
        int i6 = onValidateInApp + 83;
        onValidateInAppFailure = i6 % 128;
        if (i6 % 2 == 0) {
            Application application = aFa1tSDK.valueOf;
            if (activity != null) {
                if ((activity.getIntent() != null ? '\f' : '/') != '/' && (AFInAppEventType2 = AFb1lSDK.AFInAppEventType(activity)) != null) {
                    str = AFInAppEventType2.toString();
                    if (this.AppsFlyerLib.AFVersionDeclaration().values == null) {
                        AFLogger.afWarnLog("[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
                        AppsFlyerRequestListener appsFlyerRequestListener = aFa1tSDK.AFInAppEventType;
                        if (appsFlyerRequestListener != null) {
                            int i10 = onValidateInApp + 1;
                            onValidateInAppFailure = i10 % 128;
                            if (i10 % 2 == 0) {
                                appsFlyerRequestListener.onError(RequestError.NO_DEV_KEY, AFb1cSDK.AFInAppEventType);
                                int i11 = onValidateInAppFailure + R.styleable.AppCompatTheme_windowActionModeOverlay;
                                onValidateInApp = i11 % 128;
                                int i12 = i11 % 2;
                                return;
                            }
                            appsFlyerRequestListener.onError(RequestError.NO_DEV_KEY, AFb1cSDK.AFInAppEventType);
                            throw null;
                        }
                        return;
                    }
                    String referrer = AppsFlyerProperties.getInstance().getReferrer(application);
                    aFa1tSDK.afRDLog = referrer != null ? referrer : "";
                    aFa1tSDK.AFInAppEventParameterName = str;
                    AFInAppEventType(aFa1tSDK);
                    return;
                }
            }
            str = "";
            if (this.AppsFlyerLib.AFVersionDeclaration().values == null) {
            }
        } else {
            Application application2 = aFa1tSDK.valueOf;
            throw null;
        }
    }

    private long init(Context context) {
        long j10 = valueOf(context).getLong("AppsFlyerTimePassedSincePrevLaunch", 0L);
        long currentTimeMillis = System.currentTimeMillis();
        AFInAppEventParameterName(context).AFInAppEventParameterName("AppsFlyerTimePassedSincePrevLaunch", currentTimeMillis);
        if (!(j10 > 0)) {
            int i6 = onValidateInApp + 5;
            onValidateInAppFailure = i6 % 128;
            int i10 = i6 % 2;
            return -1L;
        }
        int i11 = onValidateInAppFailure;
        int i12 = i11 + 57;
        onValidateInApp = i12 % 128;
        long j11 = (!(i12 % 2 == 0) ? currentTimeMillis - j10 : currentTimeMillis * j10) / 1000;
        int i13 = i11 + 47;
        onValidateInApp = i13 % 128;
        int i14 = i13 % 2;
        return j11;
    }

    private void values(Context context, String str, Map<String, Object> map, String str2, String str3) {
        AFa1tSDK aFe1pSDK;
        int i6;
        int i10 = onValidateInAppFailure + 17;
        onValidateInApp = i10 % 128;
        if (i10 % 2 != 0) {
            if (str != null && !str.trim().isEmpty()) {
                aFe1pSDK = new AFe1sSDK();
                i6 = onValidateInApp + 23;
            } else {
                aFe1pSDK = new AFe1pSDK();
                i6 = onValidateInApp + 95;
            }
            onValidateInAppFailure = i6 % 128;
            int i11 = i6 % 2;
            if (context != null) {
                aFe1pSDK.valueOf = (Application) context.getApplicationContext();
            }
            aFe1pSDK.AFLogger = str;
            aFe1pSDK.AFKeystoreWrapper = map;
            aFe1pSDK.afRDLog = str2;
            aFe1pSDK.AFInAppEventParameterName = str3;
            AFInAppEventType(aFe1pSDK);
            return;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
        if ((r5.containsKey("meta") ? false : true) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
        r0 = new java.util.HashMap();
        r5.put("meta", r0);
        r5 = com.appsflyer.internal.AFb1xSDK.onValidateInApp + 27;
        com.appsflyer.internal.AFb1xSDK.onValidateInAppFailure = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
        return (java.util.Map) r5.get("meta");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
        if ((r5.containsKey("meta")) != true) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Map<String, Object> AFInAppEventParameterName(Map<String, Object> map) {
        int i6 = onValidateInApp + 17;
        onValidateInAppFailure = i6 % 128;
        if (i6 % 2 != 0) {
            int i10 = 55 / 0;
        }
    }

    private static void valueOf(Context context, Map<String, Object> map) {
        AFa1xSDK.AFa1zSDK AFInAppEventType2 = AFa1xSDK.AFa1ySDK.valueOf.AFInAppEventType(context);
        map.put("btl", Float.toString(AFInAppEventType2.AFKeystoreWrapper));
        String str = AFInAppEventType2.values;
        if ((str != null ? '@' : '>') == '@') {
            int i6 = onValidateInAppFailure + 99;
            onValidateInApp = i6 % 128;
            int i10 = i6 % 2;
            map.put("btch", str);
        }
        int i11 = onValidateInAppFailure + R.styleable.AppCompatTheme_windowFixedWidthMinor;
        onValidateInApp = i11 % 128;
        if ((i11 % 2 == 0 ? 'C' : (char) 29) != 'C') {
            return;
        }
        int i12 = 72 / 0;
    }

    private static boolean AFInAppEventParameterName(SharedPreferences sharedPreferences) {
        int i6 = onValidateInApp + 67;
        onValidateInAppFailure = i6 % 128;
        int i10 = i6 % 2;
        boolean parseBoolean = Boolean.parseBoolean(sharedPreferences.getString("sentSuccessfully", null));
        int i11 = onValidateInApp + R.styleable.AppCompatTheme_textAppearanceListItemSmall;
        onValidateInAppFailure = i11 % 128;
        if (!(i11 % 2 != 0)) {
            return parseBoolean;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
        if (r2 == null) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
        r3 = com.appsflyer.internal.AFb1xSDK.onValidateInApp + 53;
        com.appsflyer.internal.AFb1xSDK.onValidateInAppFailure = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
        if ((r3 % 2) == 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
        r7.put("operator", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
        if (r3 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
        r2 = 72 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
        if (r0 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
        if (r0 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
        r2 = r6.AFInAppEventParameterName;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void values(Context context, Map<String, ? super String> map) {
        boolean AFInAppEventType2;
        AFa1iSDK.AFa1ySDK values2;
        int i6 = onValidateInAppFailure + 95;
        onValidateInApp = i6 % 128;
        if (i6 % 2 == 0) {
            AFInAppEventType2 = AFInAppEventType(AppsFlyerProperties.DISABLE_NETWORK_DATA, false);
            AFa1iSDK aFa1iSDK = AFa1iSDK.AFa1vSDK.AFInAppEventType;
            values2 = AFa1iSDK.values(context);
            map.put("network", values2.values);
        } else {
            AFInAppEventType2 = AFInAppEventType(AppsFlyerProperties.DISABLE_NETWORK_DATA, false);
            AFa1iSDK aFa1iSDK2 = AFa1iSDK.AFa1vSDK.AFInAppEventType;
            values2 = AFa1iSDK.values(context);
            map.put("network", values2.values);
        }
        if (AFInAppEventType2) {
            return;
        }
        String str = values2.AFInAppEventType;
        if (str != null) {
            int i10 = onValidateInAppFailure + 95;
            onValidateInApp = i10 % 128;
            if ((i10 % 2 == 0 ? 'N' : '+') != 'N') {
                map.put("carrier", str);
            } else {
                map.put("carrier", str);
                throw null;
            }
        }
    }

    private static void AFInAppEventParameterName(String str) {
        try {
            if ((new JSONObject(str).has("pid") ? '^' : 'c') != 'c') {
                int i6 = onValidateInApp + 95;
                onValidateInAppFailure = i6 % 128;
                if ((i6 % 2 != 0 ? (char) 26 : '?') == '?') {
                    AFInAppEventParameterName("preInstallName", str);
                    int i10 = onValidateInAppFailure + 51;
                    onValidateInApp = i10 % 128;
                    int i11 = i10 % 2;
                    return;
                }
                AFInAppEventParameterName("preInstallName", str);
                throw null;
            }
            AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
            int i12 = onValidateInApp + R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle;
            onValidateInAppFailure = i12 % 128;
            int i13 = i12 % 2;
        } catch (JSONException e10) {
            AFLogger.afErrorLog("Error parsing JSON for preinstall", e10);
        }
    }

    private static void valueOf(Map<String, Object> map, AFd1bSDK aFd1bSDK) {
        HashMap hashMap = new HashMap(aFd1bSDK.AFKeystoreWrapper);
        aFd1bSDK.AFKeystoreWrapper.clear();
        aFd1bSDK.AFInAppEventType.values("gcd");
        if ((!hashMap.isEmpty() ? 'Q' : '5') != 'Q') {
            return;
        }
        int i6 = onValidateInApp + 7;
        onValidateInAppFailure = i6 % 128;
        if ((i6 % 2 != 0 ? (char) 6 : 'A') != 6) {
            AFInAppEventParameterName(map).put("gcd", hashMap);
            int i10 = onValidateInAppFailure + 79;
            onValidateInApp = i10 % 128;
            int i11 = i10 % 2;
            return;
        }
        AFInAppEventParameterName(map).put("gcd", hashMap);
        throw null;
    }

    private static void AFInAppEventType(AppsFlyerConversionListener appsFlyerConversionListener) {
        int i6 = onValidateInAppFailure;
        int i10 = i6 + 81;
        onValidateInApp = i10 % 128;
        int i11 = i10 % 2;
        if (appsFlyerConversionListener != null) {
            AFInAppEventType = appsFlyerConversionListener;
            return;
        }
        int i12 = i6 + 7;
        onValidateInApp = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean AFInAppEventType(AFa1tSDK aFa1tSDK, SharedPreferences sharedPreferences) {
        boolean z10;
        boolean z11;
        int AFKeystoreWrapper2 = AFKeystoreWrapper(sharedPreferences, false);
        if ((AFKeystoreWrapper2 == 1 ? (char) 26 : 'B') == 26) {
            int i6 = onValidateInAppFailure + 15;
            int i10 = i6 % 128;
            onValidateInApp = i10;
            int i11 = i6 % 2;
            if (!(aFa1tSDK instanceof AFe1vSDK)) {
                int i12 = i10 + 33;
                onValidateInAppFailure = i12 % 128;
                int i13 = i12 % 2;
                z10 = true;
                if (!sharedPreferences.getBoolean(AppsFlyerProperties.NEW_REFERRER_SENT, false)) {
                    if ((AFKeystoreWrapper2 == 1 ? (char) 17 : ':') != ':') {
                        z11 = true;
                        if (!z11) {
                            if (!z10) {
                                int i14 = onValidateInApp + 97;
                                onValidateInAppFailure = i14 % 128;
                                if ((i14 % 2 != 0 ? 'L' : '8') != 'L') {
                                    return false;
                                }
                                throw null;
                            }
                        }
                        int i15 = onValidateInAppFailure + 73;
                        onValidateInApp = i15 % 128;
                        int i16 = i15 % 2;
                        return true;
                    }
                }
                z11 = false;
                if (!z11) {
                }
                int i152 = onValidateInAppFailure + 73;
                onValidateInApp = i152 % 128;
                int i162 = i152 % 2;
                return true;
            }
        }
        z10 = false;
        if (!sharedPreferences.getBoolean(AppsFlyerProperties.NEW_REFERRER_SENT, false)) {
        }
        z11 = false;
        if (!z11) {
        }
        int i1522 = onValidateInAppFailure + 73;
        onValidateInApp = i1522 % 128;
        int i1622 = i1522 % 2;
        return true;
    }

    private static void AFInAppEventType(Context context, Map<String, Object> map) {
        String str;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if ((windowManager != null ? 'M' : '0') == 'M') {
            int i6 = onValidateInApp + 99;
            onValidateInAppFailure = i6 % 128;
            int i10 = i6 % 2;
            int rotation = windowManager.getDefaultDisplay().getRotation();
            if (rotation != 0) {
                str = rotation != 1 ? rotation != 2 ? rotation != 3 ? "" : "lr" : "pr" : "l";
            } else {
                int i11 = onValidateInAppFailure + 13;
                onValidateInApp = i11 % 128;
                int i12 = i11 % 2;
                str = "p";
            }
            map.put("sc_o", str);
        }
        int i13 = onValidateInAppFailure + 19;
        onValidateInApp = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 31 / 0;
        }
    }

    private static String AFInAppEventParameterName(File file, String str) {
        FileReader fileReader;
        Properties properties;
        try {
            try {
                try {
                    properties = new Properties();
                    fileReader = new FileReader(file);
                } catch (Throwable th2) {
                    if (fileReader != null) {
                        try {
                            fileReader.close();
                        } catch (Throwable th3) {
                            AFLogger.afErrorLog(th3.getMessage(), th3);
                            throw th2;
                        }
                    }
                    int i6 = onValidateInApp + 55;
                    onValidateInAppFailure = i6 % 128;
                    int i10 = i6 % 2;
                    throw th2;
                }
            } catch (FileNotFoundException unused) {
                fileReader = null;
            } catch (Throwable th4) {
                th = th4;
                fileReader = null;
            }
        } catch (Throwable th5) {
            AFLogger.afErrorLog(th5.getMessage(), th5);
        }
        try {
            properties.load(fileReader);
            AFLogger.afInfoLog("Found PreInstall property!");
            String property = properties.getProperty(str);
            try {
                fileReader.close();
            } catch (Throwable th6) {
                AFLogger.afErrorLog(th6.getMessage(), th6);
            }
            return property;
        } catch (FileNotFoundException unused2) {
            StringBuilder sb2 = new StringBuilder("PreInstall file wasn't found: ");
            sb2.append(file.getAbsolutePath());
            AFLogger.afDebugLog(sb2.toString());
            if (fileReader != null) {
                fileReader.close();
            }
            int i11 = onValidateInApp + 33;
            onValidateInAppFailure = i11 % 128;
            int i12 = i11 % 2;
            return null;
        } catch (Throwable th7) {
            th = th7;
            AFLogger.afErrorLog(th.getMessage(), th);
            if (fileReader != null) {
                fileReader.close();
            }
            return null;
        }
    }

    private String valueOf(Context context, String str) {
        if (context == null) {
            int i6 = onValidateInApp + 81;
            onValidateInAppFailure = i6 % 128;
            if (i6 % 2 == 0) {
                return null;
            }
            throw null;
        }
        AFb1bSDK aFb1bSDK = this.AppsFlyerLib.values;
        int i10 = onValidateInApp + 67;
        onValidateInAppFailure = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        aFb1bSDK.values = context.getApplicationContext();
        if (!z10) {
            return values().AFInAppEventParameterName().values(str);
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
        if ((r0 == null) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
        if (r0 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
        r4.put("onelink_id", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
        if (r1 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
        r0 = com.appsflyer.internal.AFb1xSDK.onValidateInApp + 39;
        com.appsflyer.internal.AFb1xSDK.onValidateInAppFailure = r0 % 128;
        r0 = r0 % 2;
        r4.put("onelink_ver", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
        r4 = com.appsflyer.internal.AFb1xSDK.onValidateInAppFailure + 11;
        com.appsflyer.internal.AFb1xSDK.onValidateInApp = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void AFInAppEventType(Map<String, Object> map) {
        String string;
        String string2;
        int i6 = onValidateInApp + 67;
        onValidateInAppFailure = i6 % 128;
        if ((i6 % 2 != 0 ? '2' : 'F') != 'F') {
            string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID);
            string2 = AppsFlyerProperties.getInstance().getString("onelinkVersion");
            int i10 = 99 / 0;
        } else {
            string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID);
            string2 = AppsFlyerProperties.getInstance().getString("onelinkVersion");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
        if (com.appsflyer.AppsFlyerProperties.getInstance().getBoolean(com.appsflyer.AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
        if ((com.appsflyer.AppsFlyerProperties.getInstance().getBoolean(com.appsflyer.AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false) ? '%' : 'Y') != 'Y') goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
        r0 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void AFKeystoreWrapper(Map<String, Object> map) {
        boolean z10;
        if ((!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) ? 'P' : '(') == 'P') {
            int i6 = onValidateInAppFailure + 93;
            onValidateInApp = i6 % 128;
            if (i6 % 2 == 0) {
            }
            if (z10) {
                if ((map.get("advertiserId") != null ? (char) 28 : (char) 17) != 28) {
                    return;
                }
                try {
                    if (AFb1oSDK.valueOf(this.afRDLog)) {
                        if ((map.remove("android_id") != null ? 'E' : 'K') == 'E') {
                            AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
                        }
                    }
                    if (AFb1oSDK.valueOf(this.AppsFlyerLib.AFVersionDeclaration().AFInAppEventType)) {
                        int i10 = onValidateInApp + R.styleable.AppCompatTheme_textAppearanceListItemSmall;
                        onValidateInAppFailure = i10 % 128;
                        if (i10 % 2 != 0) {
                            int i11 = 70 / 0;
                            if (map.remove("imei") == null) {
                                return;
                            }
                        } else if (map.remove("imei") == null) {
                            return;
                        }
                        AFLogger.afInfoLog("validateGaidAndIMEI :: removing: imei");
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    AFLogger.afErrorLog("failed to remove IMEI or AndroidID key from params; ", e10);
                    return;
                }
            }
            return;
        }
        z10 = true;
        if (z10) {
        }
    }

    private AFd1wSDK.AFa1ySDK values(final Map<String, String> map) {
        AFd1wSDK.AFa1ySDK aFa1ySDK = new AFd1wSDK.AFa1ySDK() { // from class: com.appsflyer.internal.AFb1xSDK.2
            @Override // com.appsflyer.internal.AFd1wSDK.AFa1ySDK
            public final void valueOf(Map<String, String> map2) {
                for (String str : map2.keySet()) {
                    map.put(str, map2.get(str));
                }
                AFb1hSDK.values(map);
            }

            @Override // com.appsflyer.internal.AFd1wSDK.AFa1ySDK
            public final void valueOf(String str) {
                AFb1hSDK.AFInAppEventParameterName(str, DeepLinkResult.Error.NETWORK);
            }
        };
        int i6 = onValidateInAppFailure + 25;
        onValidateInApp = i6 % 128;
        int i10 = i6 % 2;
        return aFa1ySDK;
    }

    public static boolean values(Context context) {
        int i6 = onValidateInAppFailure + 95;
        onValidateInApp = i6 % 128;
        try {
        } catch (Throwable th2) {
            AFLogger.afErrorLog("WARNING:  Google play services is unavailable. ", th2);
        }
        if (i6 % 2 != 0) {
            if ((e.f31337d.c(context) == 0 ? (char) 15 : (char) 6) != 6) {
                int i10 = onValidateInApp + 17;
                onValidateInAppFailure = i10 % 128;
                int i11 = i10 % 2;
                return true;
            }
            try {
                context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
                int i12 = onValidateInApp + R.styleable.AppCompatTheme_textAppearanceListItem;
                onValidateInAppFailure = i12 % 128;
                if (!(i12 % 2 != 0)) {
                    return true;
                }
                throw null;
            } catch (PackageManager.NameNotFoundException e10) {
                AFLogger.afErrorLog("WARNING:  Google Play Services is unavailable. ", e10);
                return false;
            }
        }
        e.f31337d.c(context);
        throw null;
    }

    public final void AFInAppEventType(Context context, Map<String, Object> map, Uri uri) {
        int i6 = onValidateInAppFailure + 85;
        onValidateInApp = i6 % 128;
        int i10 = i6 % 2;
        AFc1xSDK aFc1xSDK = this.AppsFlyerLib;
        if (context != null) {
            aFc1xSDK.values.values = context.getApplicationContext();
        }
        if (!map.containsKey("af_deeplink")) {
            String AFKeystoreWrapper2 = AFKeystoreWrapper(uri.toString());
            AFa1sSDK AFInAppEventParameterName2 = AFa1sSDK.AFInAppEventParameterName();
            String str = AFInAppEventParameterName2.values;
            if ((str != null ? ' ' : '?') != '?') {
                int i11 = onValidateInApp + R.styleable.AppCompatTheme_windowActionModeOverlay;
                onValidateInAppFailure = i11 % 128;
                int i12 = i11 % 2;
                if (AFInAppEventParameterName2.afRDLog != null && AFKeystoreWrapper2.contains(str)) {
                    Uri.Builder buildUpon = Uri.parse(AFKeystoreWrapper2).buildUpon();
                    Uri.Builder buildUpon2 = Uri.EMPTY.buildUpon();
                    Iterator<Map.Entry<String, String>> it = AFInAppEventParameterName2.afRDLog.entrySet().iterator();
                    int i13 = onValidateInAppFailure + 13;
                    onValidateInApp = i13 % 128;
                    int i14 = i13 % 2;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        int i15 = onValidateInAppFailure + 71;
                        onValidateInApp = i15 % 128;
                        int i16 = i15 % 2;
                        Map.Entry<String, String> next = it.next();
                        buildUpon.appendQueryParameter(next.getKey(), next.getValue());
                        buildUpon2.appendQueryParameter(next.getKey(), next.getValue());
                    }
                    AFKeystoreWrapper2 = buildUpon.build().toString();
                    map.put("appended_query_params", buildUpon2.build().getEncodedQuery());
                }
            }
            map.put("af_deeplink", AFKeystoreWrapper2);
        }
        HashMap hashMap = new HashMap();
        hashMap.put(Constants.API_COURSE_LINK, uri.toString());
        AFd1wSDK aFd1wSDK = new AFd1wSDK(values(), UUID.randomUUID(), uri);
        if ((aFd1wSDK.AFLogger$LogLevel() ? 'Z' : '6') != '6') {
            int i17 = onValidateInAppFailure + 81;
            onValidateInApp = i17 % 128;
            if (i17 % 2 == 0) {
                map.put("isBrandedDomain", Boolean.TRUE);
                int i18 = 25 / 0;
            } else {
                map.put("isBrandedDomain", Boolean.TRUE);
            }
        }
        AFb1wSDK.valueOf(context, hashMap, uri);
        if (aFd1wSDK.afWarnLog()) {
            aFd1wSDK.afRDLog = values(hashMap);
            AFc1mSDK afErrorLog2 = this.AppsFlyerLib.afErrorLog();
            afErrorLog2.AFInAppEventParameterName.execute(new AFc1mSDK.AnonymousClass3(aFd1wSDK));
            return;
        }
        AFb1hSDK.values(hashMap);
    }

    public static String AFInAppEventParameterName(AFd1qSDK aFd1qSDK, String str) {
        int i6 = onValidateInApp + 5;
        onValidateInAppFailure = i6 % 128;
        if (i6 % 2 == 0) {
            String AFInAppEventType2 = aFd1qSDK.AFInAppEventType("CACHED_CHANNEL", (String) null);
            if (!(AFInAppEventType2 != null)) {
                aFd1qSDK.valueOf("CACHED_CHANNEL", str);
                int i10 = onValidateInApp + R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu;
                onValidateInAppFailure = i10 % 128;
                int i11 = i10 % 2;
                return str;
            }
            return AFInAppEventType2;
        }
        aFd1qSDK.AFInAppEventType("CACHED_CHANNEL", (String) null);
        throw null;
    }

    private static String values(String str) {
        Object invoke;
        int i6 = onValidateInApp + 15;
        onValidateInAppFailure = i6 % 128;
        try {
            if ((i6 % 2 != 0 ? ';' : '.') != '.') {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                Class<?>[] clsArr = new Class[0];
                clsArr[1] = String.class;
                invoke = cls.getMethod("get", clsArr).invoke(null, str);
            } else {
                invoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            }
            return (String) invoke;
        } catch (Throwable th2) {
            AFLogger.afErrorLog(th2.getMessage(), th2);
            return null;
        }
    }

    private static void AFKeystoreWrapper(Context context, boolean z10, Map<String, Object> map, int i6) {
        HashMap hashMap = new HashMap();
        hashMap.put("cpu_abi", values("ro.product.cpu.abi"));
        hashMap.put("cpu_abi2", values("ro.product.cpu.abi2"));
        hashMap.put("arch", values("os.arch"));
        hashMap.put("build_display_id", values("ro.build.display.id"));
        if (z10) {
            valueOf(context, hashMap);
            if ((i6 <= 2 ? 'b' : (char) 16) != 16) {
                int i10 = onValidateInApp + R.styleable.AppCompatTheme_windowFixedHeightMinor;
                onValidateInAppFailure = i10 % 128;
                if (i10 % 2 != 0) {
                    hashMap.putAll(AFa1cSDK.valueOf(context).valueOf());
                    int i11 = 27 / 0;
                } else {
                    hashMap.putAll(AFa1cSDK.valueOf(context).valueOf());
                }
            }
        }
        hashMap.put("dim", AFa1dSDK.AFKeystoreWrapper(context));
        map.put("deviceData", hashMap);
        int i12 = onValidateInApp + 15;
        onValidateInAppFailure = i12 % 128;
        if ((i12 % 2 != 0 ? '\"' : '2') == '2') {
            return;
        }
        throw null;
    }

    private String AFInAppEventParameterName(SimpleDateFormat simpleDateFormat, Context context) {
        String str;
        int i6 = onValidateInApp + 13;
        onValidateInAppFailure = i6 % 128;
        int i10 = i6 % 2;
        String string = valueOf(context).getString("appsFlyerFirstInstall", null);
        if (!(string != null)) {
            int i11 = onValidateInAppFailure + 57;
            onValidateInApp = i11 % 128;
            int i12 = i11 % 2;
            if (afDebugLog(context)) {
                AFLogger.afDebugLog("AppsFlyer: first launch detected");
                str = simpleDateFormat.format(new Date());
            } else {
                str = "";
            }
            string = str;
            AFInAppEventParameterName(context).valueOf("appsFlyerFirstInstall", string);
        }
        AFLogger.afInfoLog("AppsFlyer: first launch date: ".concat(String.valueOf(string)));
        return string;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:230:0x058d
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final java.util.Map<java.lang.String, java.lang.Object> values(com.appsflyer.internal.AFa1tSDK r34) {
        /*
            Method dump skipped, instructions count: 1994
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1xSDK.values(com.appsflyer.internal.AFa1tSDK):java.util.Map");
    }

    public final AFd1qSDK AFInAppEventParameterName(Context context) {
        AFc1xSDK aFc1xSDK = this.AppsFlyerLib;
        if (context != null) {
            aFc1xSDK.values.values = context.getApplicationContext();
        }
        Context context2 = this.AppsFlyerLib.values.values;
        if (context2 != null) {
            return new AFc1ySDK(valueOf(context2));
        }
        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
    }

    private static String AFKeystoreWrapper(String str) {
        int i6;
        if ((str == null ? '\b' : '(') != '(') {
            return null;
        }
        if (str.matches("fb\\d*?://authorize.*")) {
            int i10 = onValidateInAppFailure + 91;
            onValidateInApp = i10 % 128;
            int i11 = i10 % 2;
            if (!(!str.contains("access_token"))) {
                String AFInAppEventType2 = AFInAppEventType(str);
                if (AFInAppEventType2.length() != 0) {
                    ArrayList arrayList = new ArrayList();
                    if (AFInAppEventType2.contains("&")) {
                        arrayList = new ArrayList(Arrays.asList(AFInAppEventType2.split("&")));
                        i6 = onValidateInAppFailure + 25;
                        onValidateInApp = i6 % 128;
                    } else {
                        arrayList.add(AFInAppEventType2);
                        i6 = onValidateInApp + 23;
                        onValidateInAppFailure = i6 % 128;
                    }
                    int i12 = i6 % 2;
                    StringBuilder sb2 = new StringBuilder();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str2 = (String) it.next();
                        if ((str2.contains("access_token") ? (char) 27 : 'R') != 27) {
                            if (sb2.length() != 0) {
                                sb2.append("&");
                            } else if (!str2.startsWith("?")) {
                                sb2.append("?");
                            }
                            sb2.append(str2);
                        } else {
                            it.remove();
                        }
                    }
                    return str.replace(AFInAppEventType2, sb2.toString());
                }
                int i13 = onValidateInAppFailure + 27;
                onValidateInApp = i13 % 128;
                int i14 = i13 % 2;
            }
        }
        return str;
    }

    private static String AFInAppEventParameterName(int i6, char c10, int i10) {
        String str;
        synchronized (AFf1vSDK.AFInAppEventParameterName) {
            char[] cArr = new char[i10];
            AFf1vSDK.AFInAppEventType = 0;
            while (true) {
                int i11 = AFf1vSDK.AFInAppEventType;
                if (i11 < i10) {
                    cArr[i11] = (char) ((AppsFlyerConversionListener[i6 + i11] ^ (i11 * AppsFlyerInAppPurchaseValidatorListener)) ^ c10);
                    AFf1vSDK.AFInAppEventType = i11 + 1;
                } else {
                    str = new String(cArr);
                }
            }
        }
        return str;
    }

    private static String AFInAppEventType(String str) {
        int i6 = onValidateInApp + 51;
        onValidateInAppFailure = i6 % 128;
        int i10 = i6 % 2;
        int indexOf = str.indexOf(63);
        if (indexOf == -1) {
            int i11 = onValidateInAppFailure + 79;
            onValidateInApp = i11 % 128;
            int i12 = i11 % 2;
            return "";
        }
        String substring = str.substring(indexOf);
        int i13 = onValidateInApp + 31;
        onValidateInAppFailure = i13 % 128;
        if ((i13 % 2 != 0 ? 'D' : '&') != 'D') {
            return substring;
        }
        throw null;
    }

    @Deprecated
    public final String AFInAppEventType(Context context) {
        AFc1xSDK aFc1xSDK = this.AppsFlyerLib;
        if (context != null) {
            int i6 = onValidateInAppFailure + 71;
            onValidateInApp = i6 % 128;
            int i10 = i6 % 2;
            aFc1xSDK.values.values = context.getApplicationContext();
            int i11 = onValidateInAppFailure + 3;
            onValidateInApp = i11 % 128;
            int i12 = i11 % 2;
        }
        return this.AppsFlyerLib.AFInAppEventParameterName().AFInAppEventType();
    }

    private void AFInAppEventType(AFa1tSDK aFa1tSDK) {
        boolean z10 = aFa1tSDK.AFLogger == null;
        if (!AFInAppEventParameterName()) {
            if ((z10 ? 'V' : (char) 4) == 'V') {
                if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.LAUNCH_PROTECT_ENABLED, true)) {
                    if (!(!afErrorLog())) {
                        int i6 = onValidateInAppFailure + R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle;
                        onValidateInApp = i6 % 128;
                        int i10 = i6 % 2;
                        AppsFlyerRequestListener appsFlyerRequestListener = aFa1tSDK.AFInAppEventType;
                        if (appsFlyerRequestListener == null) {
                            return;
                        }
                        appsFlyerRequestListener.onError(RequestError.EVENT_TIMEOUT, AFb1cSDK.AFInAppEventParameterName);
                        return;
                    }
                } else {
                    AFLogger.afInfoLog("Allowing multiple launches within a 5 second time window.");
                }
                this.onAttributionFailureNative = System.currentTimeMillis();
            }
            AFKeystoreWrapper(this.AppsFlyerLib.valueOf(), new AFa1xSDK(this, aFa1tSDK, (byte) 0), 0L, TimeUnit.MILLISECONDS);
            return;
        }
        int i11 = onValidateInApp + 95;
        onValidateInAppFailure = i11 % 128;
        int i12 = i11 % 2;
        AFLogger.afInfoLog("CustomerUserId not set, reporting is disabled", true);
    }

    private static void AFKeystoreWrapper(Context context, Map<String, Object> map, String str) {
        int i6 = onValidateInApp + 33;
        onValidateInAppFailure = i6 % 128;
        int i10 = i6 % 2;
        SharedPreferences valueOf2 = valueOf(context);
        SharedPreferences.Editor edit = valueOf2.edit();
        try {
            String string = valueOf2.getString("prev_event_name", null);
            if (string != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("prev_event_timestamp", valueOf2.getLong("prev_event_timestamp", -1L));
                jSONObject.put("prev_event_name", string);
                map.put("prev_event", jSONObject);
                int i11 = onValidateInAppFailure + 17;
                onValidateInApp = i11 % 128;
                int i12 = i11 % 2;
            }
            edit.putString("prev_event_name", str).putLong("prev_event_timestamp", System.currentTimeMillis()).apply();
        } catch (Exception e10) {
            AFLogger.afErrorLog("Error while processing previous event.", e10);
        }
    }

    private void AFKeystoreWrapper(Context context, Map<String, Object> map) {
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        if (appsFlyerProperties.getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            map.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
            return;
        }
        Context context2 = this.AppsFlyerLib.values.values;
        if (context2 != null) {
            AFc1ySDK aFc1ySDK = new AFc1ySDK(valueOf(context2));
            String AFInAppEventParameterName2 = this.AppsFlyerLib.AFVersionDeclaration().AFInAppEventParameterName(aFc1ySDK);
            if (!AFb1oSDK.valueOf(AFInAppEventParameterName2)) {
                map.put("imei", AFInAppEventParameterName2);
            }
            boolean z10 = appsFlyerProperties.getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID, false);
            String str = null;
            String AFInAppEventType2 = aFc1ySDK.AFInAppEventType("androidIdCached", (String) null);
            if (z10 && AFb1oSDK.valueOf(this.afRDLog)) {
                if (AFLogger(context)) {
                    try {
                        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
                        if (string != null) {
                            str = string;
                        } else if (AFInAppEventType2 != null) {
                            AFLogger.afDebugLog("use cached AndroidId: ".concat(AFInAppEventType2));
                            str = AFInAppEventType2;
                        }
                    } catch (Exception e10) {
                        if (AFInAppEventType2 != null) {
                            AFLogger.afDebugLog("use cached AndroidId: ".concat(AFInAppEventType2));
                            str = AFInAppEventType2;
                        }
                        AFLogger.afErrorLog(e10.getMessage(), e10);
                    }
                }
            } else {
                String str2 = this.afRDLog;
                if (str2 != null) {
                    str = str2;
                }
            }
            if (str != null) {
                aFc1ySDK.valueOf("androidIdCached", str);
                map.put("android_id", str);
            } else {
                AFLogger.afInfoLog("Android ID was not collected.");
            }
            AFa1uSDK values2 = AFb1zSDK.values(context);
            if (values2 != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("isManual", values2.AFInAppEventType);
                hashMap.put("val", values2.AFInAppEventParameterName);
                Boolean bool = values2.values;
                if (bool != null) {
                    hashMap.put("isLat", bool);
                }
                map.put("oaid", hashMap);
                return;
            }
            return;
        }
        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
    }

    private static boolean AFKeystoreWrapper(File file) {
        int i6 = onValidateInApp + R.styleable.AppCompatTheme_switchStyle;
        onValidateInAppFailure = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        } else if (file != null) {
            if ((!file.exists() ? 'I' : 'G') != 'G') {
                return true;
            }
            int i10 = onValidateInAppFailure + 99;
            onValidateInApp = i10 % 128;
            int i11 = i10 % 2;
            return false;
        } else {
            return true;
        }
    }

    public static int AFKeystoreWrapper(SharedPreferences sharedPreferences, boolean z10) {
        int i6 = onValidateInApp + 11;
        onValidateInAppFailure = i6 % 128;
        if ((i6 % 2 != 0 ? (char) 31 : ';') != 31) {
            return AFKeystoreWrapper(sharedPreferences, "appsFlyerCount", z10);
        }
        AFKeystoreWrapper(sharedPreferences, "appsFlyerCount", z10);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (r5 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
        r0 = r0 + 1;
        r3.edit().putInt(r4, r0).apply();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
        if ((r5) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int AFKeystoreWrapper(SharedPreferences sharedPreferences, String str, boolean z10) {
        int i6;
        int i10 = onValidateInAppFailure + 95;
        onValidateInApp = i10 % 128;
        if (i10 % 2 == 0) {
            i6 = sharedPreferences.getInt(str, 1);
        } else {
            i6 = sharedPreferences.getInt(str, 0);
        }
        if (AFb1qSDK.AFInAppEventParameterName().afErrorLog()) {
            int i11 = onValidateInAppFailure + 37;
            onValidateInApp = i11 % 128;
            if ((i11 % 2 == 0 ? '\r' : 'S') != '\r') {
                AFb1qSDK.AFInAppEventParameterName().AFKeystoreWrapper(String.valueOf(i6));
            } else {
                AFb1qSDK.AFInAppEventParameterName().AFKeystoreWrapper(String.valueOf(i6));
                int i12 = 87 / 0;
            }
        }
        return i6;
    }

    private static void AFKeystoreWrapper(ScheduledExecutorService scheduledExecutorService, Runnable runnable, long j10, TimeUnit timeUnit) {
        int i6 = onValidateInAppFailure + 97;
        onValidateInApp = i6 % 128;
        try {
            try {
                if ((i6 % 2 == 0 ? (char) 5 : ']') != 5) {
                    scheduledExecutorService.schedule(runnable, j10, timeUnit);
                    int i10 = onValidateInApp + R.styleable.AppCompatTheme_textAppearanceListItem;
                    onValidateInAppFailure = i10 % 128;
                    if ((i10 % 2 != 0 ? '!' : '=') != '=') {
                        int i11 = 31 / 0;
                        return;
                    }
                    return;
                }
                scheduledExecutorService.schedule(runnable, j10, timeUnit);
                throw null;
            } catch (RejectedExecutionException e10) {
                AFLogger.afErrorLog("scheduleJob failed with RejectedExecutionException Exception", e10);
            }
        } catch (Throwable th2) {
            AFLogger.afErrorLog("scheduleJob failed with Exception", th2);
        }
    }
}
