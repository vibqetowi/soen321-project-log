package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.ImageFormat;
import android.location.Location;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.widget.ExpandableListView;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.autofill.HintConstants;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AFKeystoreWrapper;
import com.appsflyer.AFLogger;
import com.appsflyer.AFVersionDeclaration;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.attribution.RequestError;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.a;
import com.appsflyer.internal.ah;
import com.appsflyer.internal.an;
import com.appsflyer.internal.aq;
import com.appsflyer.internal.d;
import com.appsflyer.internal.dd;
import com.appsflyer.internal.l;
import com.appsflyer.internal.u;
import com.appsflyer.internal.v;
import com.facebook.appevents.UserDataStore;
import com.facebook.bolts.AppLinks;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.ServerProtocol;
import com.facebook.share.internal.ShareConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.google.firebase.sessions.settings.RemoteSettings;
import io.grpc.netty.shaded.io.netty.handler.codec.http.HttpHeaders;
import io.grpc.netty.shaded.io.netty.handler.codec.rtsp.RtspHeaders;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
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
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.codec.language.Soundex;
import org.apache.commons.lang3.ClassUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class ac extends AppsFlyerLib {
    static AppsFlyerInAppPurchaseValidatorListener AFInAppEventParameterName = null;
    public static final String AFInAppEventType;
    public static AppsFlyerConversionListener AFKeystoreWrapper = null;
    private static String AFLogger$LogLevel = null;
    private static long enableLocationCollection = 0;
    private static String onAppOpenAttributionNative = null;
    private static String onAttributionFailureNative = null;
    private static ac onConversionDataFail = null;
    private static String onDeepLinkingNative = null;
    private static final String onInstallConversionDataLoadedNative;
    private static String onInstallConversionFailureNative = null;
    private static String onResponseErrorNative = null;
    private static int setCustomerIdAndLogSession = 1;
    static final String valueOf;
    public static final String values;
    private static int waitForCustomerUserId;
    long AFVersionDeclaration;
    String AppsFlyer2dXConversionCallback;
    private boolean AppsFlyerInAppPurchaseValidatorListener;
    private boolean AppsFlyerLib;
    public y getLevel;
    private SharedPreferences getSdkVersion;
    String init;
    private String onDeepLinking;
    private String onPause;
    private Map<Long, String> onResponse;
    private dc setAndroidIdData;
    private final bf setCustomerUserId;
    private az setImeiData;
    private Application stop;
    private Map<String, Object> updateServerUninstallToken;
    private long onAppOpenAttribution = -1;
    private long onResponseNative = -1;
    private long onConversionDataSuccess = TimeUnit.SECONDS.toMillis(5);
    private boolean onResponseError = false;
    @Deprecated
    private ScheduledExecutorService onAttributionFailure = null;
    private boolean AppsFlyerConversionListener = false;
    private final al onValidateInAppFailure = new al();
    private boolean onValidateInApp = false;
    private boolean getInstance = false;
    private boolean setDebugLog = false;
    private final Executor setOaidData = Executors.newSingleThreadExecutor();

    static void AFVersionDeclaration() {
        enableLocationCollection = -8666534478441341805L;
    }

    static /* synthetic */ Application AFInAppEventParameterName(ac acVar) {
        int i = setCustomerIdAndLogSession + 39;
        int i2 = i % 128;
        waitForCustomerUserId = i2;
        int i3 = i % 2;
        Application application = acVar.stop;
        int i4 = i2 + 27;
        setCustomerIdAndLogSession = i4 % 128;
        if (!(i4 % 2 != 0)) {
            int i5 = 86 / 0;
        }
        return application;
    }

    static /* synthetic */ ScheduledExecutorService AFInAppEventParameterName(ac acVar, ScheduledExecutorService scheduledExecutorService) {
        int i = setCustomerIdAndLogSession + 117;
        int i2 = i % 128;
        waitForCustomerUserId = i2;
        int i3 = i % 2;
        acVar.onAttributionFailure = scheduledExecutorService;
        int i4 = i2 + 77;
        setCustomerIdAndLogSession = i4 % 128;
        int i5 = i4 % 2;
        return scheduledExecutorService;
    }

    static /* synthetic */ void AFInAppEventParameterName(ac acVar, i iVar) {
        int i = waitForCustomerUserId + 93;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        acVar.valueOf(iVar);
        int i3 = setCustomerIdAndLogSession + 99;
        waitForCustomerUserId = i3 % 128;
        if (!(i3 % 2 == 0)) {
            throw null;
        }
    }

    static /* synthetic */ boolean AFInAppEventParameterName(ac acVar, i iVar, SharedPreferences sharedPreferences) {
        int i = waitForCustomerUserId + 67;
        setCustomerIdAndLogSession = i % 128;
        if (!(i % 2 == 0)) {
            return acVar.valueOf(iVar, sharedPreferences);
        }
        acVar.valueOf(iVar, sharedPreferences);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    static /* synthetic */ void AFInAppEventType(ac acVar, i iVar) throws IOException {
        int i = setCustomerIdAndLogSession + 35;
        waitForCustomerUserId = i % 128;
        boolean z = i % 2 != 0;
        acVar.AFInAppEventParameterName(iVar);
        if (z) {
            throw null;
        }
    }

    static /* synthetic */ boolean AFInAppEventType(ac acVar) {
        int i = waitForCustomerUserId + 65;
        setCustomerIdAndLogSession = i % 128;
        boolean z = i % 2 != 0;
        boolean z2 = acVar.onResponseError;
        if (z) {
            return z2;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    static /* synthetic */ Map AFKeystoreWrapper(ac acVar) {
        int i = waitForCustomerUserId + 113;
        int i2 = i % 128;
        setCustomerIdAndLogSession = i2;
        int i3 = i % 2;
        Map<String, Object> map = acVar.updateServerUninstallToken;
        int i4 = i2 + 87;
        waitForCustomerUserId = i4 % 128;
        if (i4 % 2 == 0) {
            return map;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    static /* synthetic */ ScheduledExecutorService getLevel(ac acVar) {
        int i = waitForCustomerUserId;
        int i2 = i + 47;
        setCustomerIdAndLogSession = i2 % 128;
        int i3 = i2 % 2;
        ScheduledExecutorService scheduledExecutorService = acVar.onAttributionFailure;
        int i4 = i + 69;
        setCustomerIdAndLogSession = i4 % 128;
        int i5 = i4 % 2;
        return scheduledExecutorService;
    }

    static /* synthetic */ dc valueOf(ac acVar) {
        int i = setCustomerIdAndLogSession + 13;
        int i2 = i % 128;
        waitForCustomerUserId = i2;
        int i3 = i % 2;
        dc dcVar = acVar.setAndroidIdData;
        int i4 = i2 + 121;
        setCustomerIdAndLogSession = i4 % 128;
        if ((i4 % 2 == 0 ? '(' : (char) 31) != '(') {
            return dcVar;
        }
        int i5 = 28 / 0;
        return dcVar;
    }

    static /* synthetic */ bf values(ac acVar) {
        int i = setCustomerIdAndLogSession;
        int i2 = i + 103;
        waitForCustomerUserId = i2 % 128;
        int i3 = i2 % 2;
        bf bfVar = acVar.setCustomerUserId;
        int i4 = i + 45;
        waitForCustomerUserId = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        return bfVar;
    }

    static /* synthetic */ boolean values(ac acVar, boolean z) {
        int i = setCustomerIdAndLogSession + 29;
        waitForCustomerUserId = i % 128;
        boolean z2 = i % 2 != 0;
        acVar.onResponseError = z;
        if (!z2) {
            return z;
        }
        throw null;
    }

    static {
        AFVersionDeclaration();
        valueOf = "170";
        String substring = "6.5.4".substring(0, "6.5.4".lastIndexOf(values("Ჽ", View.MeasureSpec.makeMeasureSpec(0, 0) + 28643).intern()));
        AFInAppEventType = substring;
        AFLogger$LogLevel = "https://%sstats.%s/stats";
        StringBuilder sb = new StringBuilder();
        sb.append(substring);
        sb.append("/androidevent?buildnumber=6.5.4&app_id=");
        values = sb.toString();
        StringBuilder sb2 = new StringBuilder("https://%sadrevenue.%s/api/v");
        sb2.append(substring);
        sb2.append("/android?buildnumber=6.5.4&app_id=");
        onInstallConversionFailureNative = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(substring);
        sb3.append("/androidevent?app_id=");
        String obj = sb3.toString();
        onInstallConversionDataLoadedNative = obj;
        StringBuilder sb4 = new StringBuilder("https://%sconversions.%s/api/v");
        sb4.append(obj);
        onDeepLinkingNative = sb4.toString();
        StringBuilder sb5 = new StringBuilder("https://%slaunches.%s/api/v");
        sb5.append(obj);
        onAppOpenAttributionNative = sb5.toString();
        StringBuilder sb6 = new StringBuilder("https://%sinapps.%s/api/v");
        sb6.append(obj);
        onAttributionFailureNative = sb6.toString();
        StringBuilder sb7 = new StringBuilder("https://%sattr.%s/api/v");
        sb7.append(obj);
        onResponseErrorNative = sb7.toString();
        AFInAppEventParameterName = null;
        AFKeystoreWrapper = null;
        onConversionDataFail = new ac();
        int i = setCustomerIdAndLogSession + 29;
        waitForCustomerUserId = i % 128;
        int i2 = i % 2;
    }

    public final bg values() {
        int i = setCustomerIdAndLogSession;
        int i2 = i + 11;
        waitForCustomerUserId = i2 % 128;
        int i3 = i2 % 2;
        bf bfVar = this.setCustomerUserId;
        int i4 = i + 15;
        waitForCustomerUserId = i4 % 128;
        int i5 = i4 % 2;
        return bfVar;
    }

    public ac() {
        AFVersionDeclaration.init();
        this.setCustomerUserId = new bf();
    }

    public static ac AFInAppEventParameterName() {
        int i = setCustomerIdAndLogSession + 103;
        int i2 = i % 128;
        waitForCustomerUserId = i2;
        int i3 = i % 2;
        ac acVar = onConversionDataFail;
        int i4 = i2 + 47;
        setCustomerIdAndLogSession = i4 % 128;
        int i5 = i4 % 2;
        return acVar;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void performOnAppAttribution(Context context, URI uri) {
        if ((uri != null ? '?' : Soundex.SILENT_MARKER) == '?') {
            int i = setCustomerIdAndLogSession + 49;
            waitForCustomerUserId = i % 128;
            Object obj = null;
            if (i % 2 != 0) {
                uri.toString().isEmpty();
                super.hashCode();
                throw null;
            } else if (!uri.toString().isEmpty()) {
                if (context == null) {
                    StringBuilder sb = new StringBuilder("Context is \"");
                    sb.append(context);
                    sb.append("\"");
                    ao.AFInAppEventType(sb.toString(), DeepLinkResult.Error.NETWORK);
                    return;
                }
                f.valueOf().AFInAppEventType(context, new HashMap(), Uri.parse(uri.toString()));
                int i2 = waitForCustomerUserId + 121;
                setCustomerIdAndLogSession = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
                return;
            }
        }
        StringBuilder sb2 = new StringBuilder("Link is \"");
        sb2.append(uri);
        sb2.append("\"");
        ao.AFInAppEventType(sb2.toString(), DeepLinkResult.Error.NETWORK);
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilter(String... strArr) {
        int i = waitForCustomerUserId + 1;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        setSharingFilterForPartners(strArr);
        int i3 = waitForCustomerUserId + 47;
        setCustomerIdAndLogSession = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilterForAllPartners() {
        int i = setCustomerIdAndLogSession + 107;
        waitForCustomerUserId = i % 128;
        if (!(i % 2 != 0 ? true : true)) {
            setSharingFilterForPartners(TtmlNode.COMBINE_ALL);
        } else {
            String[] strArr = new String[0];
            strArr[0] = TtmlNode.COMBINE_ALL;
            setSharingFilterForPartners(strArr);
        }
        int i2 = waitForCustomerUserId + 5;
        setCustomerIdAndLogSession = i2 % 128;
        if (!(i2 % 2 != 0)) {
            int i3 = 32 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setSharingFilterForPartners(String... strArr) {
        this.getLevel = new y(strArr);
        int i = setCustomerIdAndLogSession + 3;
        waitForCustomerUserId = i % 128;
        int i2 = i % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void appendParametersToDeepLinkingURL(String str, Map<String, String> map) {
        int i = waitForCustomerUserId + 75;
        setCustomerIdAndLogSession = i % 128;
        if (i % 2 == 0) {
            f valueOf2 = f.valueOf();
            valueOf2.AFVersionDeclaration = str;
            valueOf2.getLevel = map;
            int i2 = 9 / 0;
            return;
        }
        f valueOf3 = f.valueOf();
        valueOf3.AFVersionDeclaration = str;
        valueOf3.getLevel = map;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(DeepLinkListener deepLinkListener) {
        int i = waitForCustomerUserId + 61;
        setCustomerIdAndLogSession = i % 128;
        if (!(i % 2 != 0)) {
            subscribeForDeepLink(deepLinkListener, TimeUnit.SECONDS.toMillis(3L));
            int i2 = 88 / 0;
        } else {
            subscribeForDeepLink(deepLinkListener, TimeUnit.SECONDS.toMillis(3L));
        }
        int i3 = waitForCustomerUserId + 91;
        setCustomerIdAndLogSession = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(DeepLinkListener deepLinkListener, long j) {
        int i = setCustomerIdAndLogSession + 17;
        waitForCustomerUserId = i % 128;
        Object obj = null;
        if (!(i % 2 != 0)) {
            f.valueOf().values = deepLinkListener;
            ar.onInstallConversionDataLoadedNative = j;
            int i2 = setCustomerIdAndLogSession + 21;
            waitForCustomerUserId = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            return;
        }
        f.valueOf().values = deepLinkListener;
        ar.onInstallConversionDataLoadedNative = j;
        super.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void addPushNotificationDeepLinkPath(String... strArr) {
        int i = waitForCustomerUserId + 57;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        List<String> asList = Arrays.asList(strArr);
        List<List<String>> list = f.valueOf().init;
        if ((!list.contains(asList) ? (char) 20 : (char) 28) == 20) {
            list.add(asList);
        }
        int i3 = waitForCustomerUserId + 111;
        setCustomerIdAndLogSession = i3 % 128;
        if (!(i3 % 2 != 0)) {
            int i4 = 53 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPartnerData(String str, Map<String, Object> map) {
        String str2;
        if (this.setImeiData == null) {
            this.setImeiData = new az();
        }
        az azVar = this.setImeiData;
        if (str != null) {
            if (!str.isEmpty()) {
                if ((map != null ? 'I' : 'J') == 'J' || map.isEmpty()) {
                    if (!(azVar.values.remove(str) == null ? true : false)) {
                        str2 = "Cleared partner data for ".concat(String.valueOf(str));
                        int i = setCustomerIdAndLogSession + 35;
                        waitForCustomerUserId = i % 128;
                        int i2 = i % 2;
                    } else {
                        int i3 = setCustomerIdAndLogSession + 5;
                        waitForCustomerUserId = i3 % 128;
                        int i4 = i3 % 2;
                        str2 = "Partner data is missing or `null`";
                    }
                    AFLogger.AppsFlyer2dXConversionCallback(str2);
                    return;
                }
                StringBuilder sb = new StringBuilder("Setting partner data for ");
                sb.append(str);
                sb.append(": ");
                sb.append(map);
                AFLogger.AFInAppEventParameterName(sb.toString());
                int length = new JSONObject((Map<?, ?>) map).toString().length();
                if (length > 1000) {
                    AFLogger.AppsFlyer2dXConversionCallback("Partner data 1000 characters limit exceeded");
                    HashMap hashMap = new HashMap();
                    hashMap.put("error", "limit exceeded: ".concat(String.valueOf(length)));
                    azVar.valueOf.put(str, hashMap);
                    return;
                }
                azVar.values.put(str, map);
                azVar.valueOf.remove(str);
                return;
            }
        }
        AFLogger.AppsFlyer2dXConversionCallback("Partner ID is missing or `null`");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableAdvertisingIdentifiers(boolean z) {
        boolean z2;
        AFLogger.AFInAppEventParameterName("setDisableAdvertisingIdentifiers: ".concat(String.valueOf(z)));
        if ((!z ? 'Q' : (char) 6) != 'Q') {
            int i = setCustomerIdAndLogSession + 101;
            waitForCustomerUserId = i % 128;
            int i2 = i % 2;
            z2 = false;
        } else {
            int i3 = setCustomerIdAndLogSession + 103;
            waitForCustomerUserId = i3 % 128;
            int i4 = i3 % 2;
            z2 = true;
        }
        ab.AFInAppEventType = Boolean.valueOf(z2);
        AppsFlyerProperties.getInstance().remove("advertiserIdEnabled");
        AppsFlyerProperties.getInstance().remove("advertiserId");
    }

    public final void AFKeystoreWrapper(Context context, Intent intent) {
        if ((intent.getStringExtra("appsflyer_preinstall") != null ? '5' : 'D') != 'D') {
            AFInAppEventType(intent.getStringExtra("appsflyer_preinstall"));
        }
        AFLogger.values("****** onReceive called *******");
        AppsFlyerProperties.getInstance();
        String stringExtra = intent.getStringExtra("referrer");
        AFLogger.values("Play store referrer: ".concat(String.valueOf(stringExtra)));
        Object obj = null;
        if (stringExtra != null) {
            valueOf(context, "referrer", stringExtra);
            AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
            appsFlyerProperties.set("AF_REFERRER", stringExtra);
            appsFlyerProperties.valueOf = stringExtra;
            if (AppsFlyerProperties.getInstance().values()) {
                int i = waitForCustomerUserId + 79;
                setCustomerIdAndLogSession = i % 128;
                if (i % 2 != 0) {
                    AFLogger.values("onReceive: isLaunchCalled");
                    AFInAppEventParameterName(context, ch.onReceive);
                    AFInAppEventType(context, stringExtra);
                } else {
                    AFLogger.values("onReceive: isLaunchCalled");
                    AFInAppEventParameterName(context, ch.onReceive);
                    AFInAppEventType(context, stringExtra);
                    super.hashCode();
                    throw null;
                }
            }
        }
        int i2 = setCustomerIdAndLogSession + 9;
        waitForCustomerUserId = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00df A[LOOP:4: B:18:0x0063->B:46:0x00df, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void valueOf(JSONObject jSONObject) {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject.keys();
        while (true) {
            if (!keys.hasNext()) {
                break;
            }
            try {
                JSONArray jSONArray = new JSONArray((String) jSONObject.get(keys.next()));
                while (r3 < jSONArray.length()) {
                    arrayList.add(Long.valueOf(jSONArray.getLong(r3)));
                    r3++;
                }
            } catch (JSONException unused) {
            }
        }
        Collections.sort(arrayList);
        Iterator<String> keys2 = jSONObject.keys();
        int i = setCustomerIdAndLogSession + 117;
        waitForCustomerUserId = i % 128;
        int i2 = i % 2;
        loop2: while (true) {
            str = null;
            while (keys2.hasNext() && str == null) {
                String next = keys2.next();
                try {
                    JSONArray jSONArray2 = new JSONArray((String) jSONObject.get(next));
                    int i3 = 0;
                    while (i3 < jSONArray2.length()) {
                        if (jSONArray2.getLong(i3) != ((Long) arrayList.get(0)).longValue()) {
                            int i4 = setCustomerIdAndLogSession + 39;
                            waitForCustomerUserId = i4 % 128;
                            if (!(i4 % 2 != 0)) {
                                if (!(jSONArray2.getLong(i3) != ((Long) arrayList.get(1)).longValue())) {
                                    break;
                                }
                                if ((jSONArray2.getLong(i3) != ((Long) arrayList.get(arrayList.size() - 1)).longValue() ? (char) 15 : '(') == '(') {
                                    break;
                                }
                                i3++;
                                str = next;
                            } else {
                                if ((jSONArray2.getLong(i3) != ((Long) arrayList.get(1)).longValue() ? (char) 14 : (char) 30) == 30) {
                                    break;
                                }
                                if ((jSONArray2.getLong(i3) != ((Long) arrayList.get(arrayList.size() - 1)).longValue() ? (char) 15 : '(') == '(') {
                                }
                            }
                        }
                    }
                    continue;
                } catch (JSONException unused2) {
                }
            }
        }
        if ((str != null ? 1 : 0) != 1) {
            return;
        }
        jSONObject.remove(str);
    }

    public final void valueOf(Context context, String str) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONObject jSONObject;
        AFLogger.AFInAppEventParameterName("received a new (extra) referrer: ".concat(String.valueOf(str)));
        try {
            long currentTimeMillis = System.currentTimeMillis();
            String string = AFInAppEventType(context).getString("extraReferrers", null);
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
            if (jSONArray2.length() < 5) {
                jSONArray2.put(currentTimeMillis);
            }
            if (!(((long) jSONObject.length()) < 4)) {
                int i = waitForCustomerUserId + 61;
                setCustomerIdAndLogSession = i % 128;
                if ((i % 2 == 0 ? 'U' : '`') != 'U') {
                    valueOf(jSONObject);
                } else {
                    valueOf(jSONObject);
                    throw null;
                }
            }
            jSONObject.put(str, jSONArray2.toString());
            valueOf(context, "extraReferrers", jSONObject.toString());
            int i2 = waitForCustomerUserId + 105;
            setCustomerIdAndLogSession = i2 % 128;
            if ((i2 % 2 == 0 ? (char) 24 : '\n') != '\n') {
                int i3 = 47 / 0;
            }
        } catch (JSONException unused) {
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Couldn't save referrer - ");
            sb.append(str);
            sb.append(": ");
            AFLogger.valueOf(sb.toString(), th);
        }
    }

    private static void AFInAppEventType(SharedPreferences.Editor editor) {
        int i = setCustomerIdAndLogSession + 123;
        waitForCustomerUserId = i % 128;
        char c = i % 2 != 0 ? '*' : 'C';
        editor.apply();
        if (c != 'C') {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i2 = setCustomerIdAndLogSession + 31;
        waitForCustomerUserId = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 17 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void stop(boolean z, Context context) {
        this.getInstance = z;
        try {
            File file = new File(values().AFVersionDeclaration().AFKeystoreWrapper.values.getFilesDir(), "AFRequestCache");
            int i = 0;
            if (!(file.exists())) {
                int i2 = waitForCustomerUserId + 7;
                setCustomerIdAndLogSession = i2 % 128;
                if ((i2 % 2 == 0 ? '!' : 'N') != 'N') {
                    file.mkdir();
                    int i3 = 36 / 0;
                } else {
                    file.mkdir();
                }
            } else {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    int length = listFiles.length;
                    while (i < length) {
                        File file2 = listFiles[i];
                        StringBuilder sb = new StringBuilder("CACHE: Found cached request");
                        sb.append(file2.getName());
                        AFLogger.values(sb.toString());
                        StringBuilder sb2 = new StringBuilder("CACHE: Deleting ");
                        sb2.append(file2.getName());
                        sb2.append(" from cache");
                        AFLogger.values(sb2.toString());
                        file2.delete();
                        i++;
                        int i4 = waitForCustomerUserId + 23;
                        setCustomerIdAndLogSession = i4 % 128;
                        int i5 = i4 % 2;
                    }
                }
            }
        } catch (Exception e2) {
            AFLogger.valueOf("CACHE: Could not cache request", e2);
        }
        if (this.getInstance) {
            int i6 = waitForCustomerUserId + 21;
            setCustomerIdAndLogSession = i6 % 128;
            int i7 = i6 % 2;
            values(context, "is_stop_tracking_used");
            int i8 = waitForCustomerUserId + 69;
            setCustomerIdAndLogSession = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getSdkVersion() {
        ak.AFInAppEventType().AFKeystoreWrapper("getSdkVersion", new String[0]);
        StringBuilder sb = new StringBuilder("version: 6.5.4 (build ");
        sb.append(valueOf);
        sb.append(")");
        String obj = sb.toString();
        int i = waitForCustomerUserId + 9;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        return obj;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void onPause(Context context) {
        int i = setCustomerIdAndLogSession + 65;
        waitForCustomerUserId = i % 128;
        int i2 = i % 2;
        if ((ah.AFInAppEventParameterName != null ? '?' : '2') != '?') {
            return;
        }
        int i3 = setCustomerIdAndLogSession + AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY;
        waitForCustomerUserId = i3 % 128;
        if (i3 % 2 == 0) {
            ah.AFInAppEventParameterName.valueOf(context);
            return;
        }
        ah.AFInAppEventParameterName.valueOf(context);
        int i4 = 13 / 0;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void updateServerUninstallToken(Context context, String str) {
        new cd(context).AFInAppEventParameterName(str);
        int i = setCustomerIdAndLogSession + 27;
        waitForCustomerUserId = i % 128;
        if ((i % 2 != 0 ? ')' : '\b') == '\b') {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDebugLog(boolean z) {
        int i = waitForCustomerUserId + 105;
        setCustomerIdAndLogSession = i % 128;
        if ((i % 2 == 0 ? '?' : Typography.less) == '?') {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        setLogLevel(z ? AFLogger.LogLevel.DEBUG : AFLogger.LogLevel.NONE);
        int i2 = waitForCustomerUserId + 31;
        setCustomerIdAndLogSession = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setImeiData(String str) {
        int i = setCustomerIdAndLogSession + 107;
        waitForCustomerUserId = i % 128;
        int i2 = i % 2;
        ak.AFInAppEventType().AFKeystoreWrapper("setImeiData", str);
        this.AppsFlyer2dXConversionCallback = str;
        int i3 = setCustomerIdAndLogSession + 39;
        waitForCustomerUserId = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOaidData(String str) {
        int i = waitForCustomerUserId + 11;
        setCustomerIdAndLogSession = i % 128;
        if ((i % 2 == 0 ? 'Q' : ']') != ']') {
            ak AFInAppEventType2 = ak.AFInAppEventType();
            String[] strArr = new String[1];
            strArr[1] = str;
            AFInAppEventType2.AFKeystoreWrapper("setOaidData", strArr);
        } else {
            ak.AFInAppEventType().AFKeystoreWrapper("setOaidData", str);
        }
        ab.AFInAppEventParameterName = str;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAndroidIdData(String str) {
        int i = setCustomerIdAndLogSession + 107;
        waitForCustomerUserId = i % 128;
        if ((i % 2 != 0 ? AbstractJsonLexerKt.BEGIN_LIST : ':') != ':') {
            ak AFInAppEventType2 = ak.AFInAppEventType();
            String[] strArr = new String[1];
            strArr[1] = str;
            AFInAppEventType2.AFKeystoreWrapper("setAndroidIdData", strArr);
        } else {
            ak.AFInAppEventType().AFKeystoreWrapper("setAndroidIdData", str);
        }
        this.init = str;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final AppsFlyerLib enableLocationCollection(boolean z) {
        int i = waitForCustomerUserId + 19;
        setCustomerIdAndLogSession = i % 128;
        if (!(i % 2 != 0)) {
            this.AppsFlyerConversionListener = z;
            int i2 = 73 / 0;
        } else {
            this.AppsFlyerConversionListener = z;
        }
        return this;
    }

    public static void valueOf(Context context, String str, String str2) {
        int i = waitForCustomerUserId + 65;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        SharedPreferences.Editor edit = AFInAppEventType(context).edit();
        edit.putString(str, str2);
        AFInAppEventType(edit);
        int i3 = waitForCustomerUserId + 125;
        setCustomerIdAndLogSession = i3 % 128;
        if (!(i3 % 2 != 0)) {
            throw null;
        }
    }

    public static void values(Context context, String str) {
        SharedPreferences.Editor edit;
        int i = setCustomerIdAndLogSession + 7;
        waitForCustomerUserId = i % 128;
        if (!(i % 2 == 0)) {
            edit = AFInAppEventType(context).edit();
            edit.putBoolean(str, false);
        } else {
            edit = AFInAppEventType(context).edit();
            edit.putBoolean(str, true);
        }
        AFInAppEventType(edit);
        int i2 = setCustomerIdAndLogSession + 93;
        waitForCustomerUserId = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void valueOf(Context context, String str, int i) {
        int i2 = setCustomerIdAndLogSession + 45;
        waitForCustomerUserId = i2 % 128;
        if ((i2 % 2 != 0 ? (char) 25 : (char) 5) != 25) {
            SharedPreferences.Editor edit = AFInAppEventType(context).edit();
            edit.putInt(str, i);
            AFInAppEventType(edit);
            return;
        }
        SharedPreferences.Editor edit2 = AFInAppEventType(context).edit();
        edit2.putInt(str, i);
        AFInAppEventType(edit2);
        int i3 = 41 / 0;
    }

    public final void AFInAppEventType(Context context, String str, long j) {
        int i = setCustomerIdAndLogSession + 97;
        waitForCustomerUserId = i % 128;
        int i2 = i % 2;
        AFInAppEventParameterName(AFInAppEventType(context), str, j);
        int i3 = setCustomerIdAndLogSession + 75;
        waitForCustomerUserId = i3 % 128;
        int i4 = i3 % 2;
    }

    private static void AFInAppEventParameterName(SharedPreferences sharedPreferences, String str, long j) {
        int i = setCustomerIdAndLogSession + 121;
        waitForCustomerUserId = i % 128;
        int i2 = i % 2;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putLong(str, j);
        AFInAppEventType(edit);
        int i3 = setCustomerIdAndLogSession + 45;
        waitForCustomerUserId = i3 % 128;
        int i4 = i3 % 2;
    }

    private static void values(String str, String str2) {
        int i = waitForCustomerUserId + 35;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        AppsFlyerProperties.getInstance().set(str, str2);
        int i3 = waitForCustomerUserId + 15;
        setCustomerIdAndLogSession = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    private static void values(String str, boolean z) {
        int i = setCustomerIdAndLogSession + 3;
        waitForCustomerUserId = i % 128;
        if (i % 2 == 0) {
            AppsFlyerProperties.getInstance().set(str, z);
        } else {
            AppsFlyerProperties.getInstance().set(str, z);
            throw null;
        }
    }

    private static String AFInAppEventParameterName(String str) {
        String string;
        int i = waitForCustomerUserId + 61;
        setCustomerIdAndLogSession = i % 128;
        if ((i % 2 == 0 ? ';' : '`') != ';') {
            string = AppsFlyerProperties.getInstance().getString(str);
        } else {
            string = AppsFlyerProperties.getInstance().getString(str);
            int i2 = 31 / 0;
        }
        int i3 = setCustomerIdAndLogSession + 43;
        waitForCustomerUserId = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    private static boolean AFKeystoreWrapper(String str, boolean z) {
        int i = setCustomerIdAndLogSession + 11;
        waitForCustomerUserId = i % 128;
        int i2 = i % 2;
        boolean z2 = AppsFlyerProperties.getInstance().getBoolean(str, z);
        int i3 = waitForCustomerUserId + 39;
        setCustomerIdAndLogSession = i3 % 128;
        int i4 = i3 % 2;
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
        if ((AFKeystoreWrapper(com.appsflyer.AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false) ? 'H' : '-') != '-') goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
        if (AFInAppEventType() != null) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
        r0 = com.appsflyer.internal.ac.setCustomerIdAndLogSession;
        r2 = r0 + 11;
        com.appsflyer.internal.ac.waitForCustomerUserId = r2 % 128;
        r2 = r2 % 2;
        r0 = r0 + 63;
        com.appsflyer.internal.ac.waitForCustomerUserId = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
        if ((r0 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
        r4 = 30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
        if (r4 == 30) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (AFKeystoreWrapper(com.appsflyer.AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, true) != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean AFKeystoreWrapper() {
        int i = setCustomerIdAndLogSession + 101;
        waitForCustomerUserId = i % 128;
        int i2 = i % 2;
        char c = Soundex.SILENT_MARKER;
        if (i2 != 0) {
        }
        return false;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void waitForCustomerUserId(boolean z) {
        int i = setCustomerIdAndLogSession + 1;
        waitForCustomerUserId = i % 128;
        int i2 = i % 2;
        AFLogger.values("initAfterCustomerUserID: ".concat(String.valueOf(z)), true);
        values(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, z);
        int i3 = setCustomerIdAndLogSession + 119;
        waitForCustomerUserId = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerIdAndLogSession(String str, Context context) {
        if (context != null) {
            int i = waitForCustomerUserId + 95;
            setCustomerIdAndLogSession = i % 128;
            if (!(i % 2 != 0)) {
                AFKeystoreWrapper();
                throw null;
            } else if (!AFKeystoreWrapper()) {
                setCustomerUserId(str);
                AFLogger.values("waitForCustomerUserId is false; setting CustomerUserID: ".concat(String.valueOf(str)), true);
            } else {
                setCustomerUserId(str);
                StringBuilder sb = new StringBuilder("CustomerUserId set: ");
                sb.append(str);
                sb.append(" - Initializing AppsFlyer Tacking");
                AFLogger.values(sb.toString(), true);
                String referrer = AppsFlyerProperties.getInstance().getReferrer(context);
                AFInAppEventParameterName(context, ch.setCustomerIdAndLogSession);
                String devKey = AppsFlyerProperties.getInstance().getDevKey();
                if (referrer == null) {
                    int i2 = waitForCustomerUserId + 23;
                    setCustomerIdAndLogSession = i2 % 128;
                    int i3 = i2 % 2;
                    referrer = "";
                } else {
                    int i4 = waitForCustomerUserId + 79;
                    setCustomerIdAndLogSession = i4 % 128;
                    int i5 = i4 % 2;
                }
                String str2 = referrer;
                if ((context instanceof Activity ? ')' : (char) 5) != 5) {
                    int i6 = waitForCustomerUserId + 5;
                    setCustomerIdAndLogSession = i6 % 128;
                    int i7 = i6 % 2;
                    ((Activity) context).getIntent();
                }
                AFInAppEventParameterName(context, devKey, null, null, str2, null);
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getOutOfStore(Context context) {
        String string = AppsFlyerProperties.getInstance().getString("api_store_value");
        if (string == null) {
            String AFKeystoreWrapper2 = AFKeystoreWrapper(context, "AF_STORE");
            if (!(AFKeystoreWrapper2 != null)) {
                AFLogger.values("No out-of-store value set");
                return null;
            }
            int i = setCustomerIdAndLogSession + 121;
            int i2 = i % 128;
            waitForCustomerUserId = i2;
            int i3 = i % 2;
            int i4 = i2 + 27;
            setCustomerIdAndLogSession = i4 % 128;
            int i5 = i4 % 2;
            return AFKeystoreWrapper2;
        }
        int i6 = setCustomerIdAndLogSession + 49;
        waitForCustomerUserId = i6 % 128;
        if ((i6 % 2 != 0 ? Soundex.SILENT_MARKER : '5') != '5') {
            int i7 = 46 / 0;
        }
        return string;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOutOfStore(String str) {
        if (str == null) {
            AFLogger.valueOf("Cannot set setOutOfStore with null");
            return;
        }
        int i = waitForCustomerUserId + 71;
        setCustomerIdAndLogSession = i % 128;
        if (i % 2 == 0) {
        }
        String lowerCase = str.toLowerCase();
        AppsFlyerProperties.getInstance().set("api_store_value", lowerCase);
        AFLogger.values("Store API set with value: ".concat(String.valueOf(lowerCase)), true);
        int i2 = setCustomerIdAndLogSession + 103;
        waitForCustomerUserId = i2 % 128;
        if ((i2 % 2 != 0 ? ClassUtils.PACKAGE_SEPARATOR_CHAR : 'L') != 'L') {
            int i3 = 60 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
        if ((r6 != null ? 'A' : ']') != ']') goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
        if (r6 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
        if (r6.equals(com.appsflyer.AppsFlyerProperties.getInstance().getString(com.appsflyer.AppsFlyerProperties.ONELINK_ID)) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
        r0 = '7';
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
        r0 = '?';
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
        if (r0 == '7') goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
        com.appsflyer.AppsFlyerProperties.getInstance().remove(com.appsflyer.AppsFlyerProperties.ONELINK_DOMAIN);
        com.appsflyer.AppsFlyerProperties.getInstance().remove("onelinkVersion");
        com.appsflyer.AppsFlyerProperties.getInstance().remove(com.appsflyer.AppsFlyerProperties.ONELINK_SCHEME);
        r0 = com.appsflyer.internal.ac.setCustomerIdAndLogSession + 79;
        com.appsflyer.internal.ac.waitForCustomerUserId = r0 % 128;
        r0 = r0 % 2;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setAppInviteOneLink(String str) {
        int i = setCustomerIdAndLogSession + 45;
        waitForCustomerUserId = i % 128;
        if ((i % 2 != 0 ? '>' : 'K') != '>') {
            ak.AFInAppEventType().AFKeystoreWrapper("setAppInviteOneLink", str);
            AFLogger.values("setAppInviteOneLink = ".concat(String.valueOf(str)));
        } else {
            ak.AFInAppEventType().AFKeystoreWrapper("setAppInviteOneLink", str);
            AFLogger.values("setAppInviteOneLink = ".concat(String.valueOf(str)));
        }
        values(AppsFlyerProperties.ONELINK_ID, str);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAdditionalData(Map<String, Object> map) {
        int i = setCustomerIdAndLogSession + 31;
        waitForCustomerUserId = i % 128;
        int i2 = i % 2;
        if (map != null) {
            ak.AFInAppEventType().AFKeystoreWrapper("setAdditionalData", map.toString());
            AppsFlyerProperties.getInstance().setCustomData(new JSONObject((Map<?, ?>) map).toString());
            int i3 = setCustomerIdAndLogSession + 3;
            waitForCustomerUserId = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
        if (r17.getIntent() != null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
        r4 = com.appsflyer.internal.ak.AFInAppEventType();
        r6 = r17.getLocalClassName();
        r7 = new java.lang.StringBuilder("activity_intent_");
        r7.append(r17.getIntent().toString());
        r4.AFKeystoreWrapper("sendPushNotificationData", r6, r7.toString());
        r3 = com.appsflyer.internal.ac.waitForCustomerUserId + 39;
        com.appsflyer.internal.ac.setCustomerIdAndLogSession = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
        if (r17.getIntent() != null) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void sendPushNotificationData(Activity activity) {
        String AFInAppEventParameterName2;
        long j;
        int i = setCustomerIdAndLogSession + 81;
        int i2 = i % 128;
        waitForCustomerUserId = i2;
        int i3 = i % 2;
        if (activity != null) {
            int i4 = i2 + 43;
            setCustomerIdAndLogSession = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 41 / 0;
            }
            AFInAppEventParameterName2 = AFInAppEventParameterName(activity);
            this.onDeepLinking = AFInAppEventParameterName2;
            if (AFInAppEventParameterName2 == null) {
                long currentTimeMillis = System.currentTimeMillis();
                if (this.onResponse == null) {
                    AFLogger.values("pushes: initializing pushes history..");
                    this.onResponse = new ConcurrentHashMap();
                    j = currentTimeMillis;
                } else {
                    try {
                        long j2 = AppsFlyerProperties.getInstance().getLong("pushPayloadMaxAging", 1800000L);
                        j = currentTimeMillis;
                        for (Long l : this.onResponse.keySet()) {
                            try {
                                JSONObject jSONObject = new JSONObject(this.onDeepLinking);
                                JSONObject jSONObject2 = new JSONObject(this.onResponse.get(l));
                                if (jSONObject.opt("pid").equals(jSONObject2.opt("pid")) && jSONObject.opt("c").equals(jSONObject2.opt("c"))) {
                                    StringBuilder sb = new StringBuilder("PushNotificationMeasurement: A previous payload with same PID and campaign was already acknowledged! (old: ");
                                    sb.append(jSONObject2);
                                    sb.append(", new: ");
                                    sb.append(jSONObject);
                                    sb.append(")");
                                    AFLogger.values(sb.toString());
                                    this.onDeepLinking = null;
                                    return;
                                }
                                if (currentTimeMillis - l.longValue() > j2) {
                                    int i6 = setCustomerIdAndLogSession + 41;
                                    waitForCustomerUserId = i6 % 128;
                                    if ((i6 % 2 != 0 ? '\"' : '#') != '#') {
                                        this.onResponse.remove(l);
                                        int i7 = 19 / 0;
                                    } else {
                                        this.onResponse.remove(l);
                                    }
                                }
                                if (l.longValue() <= j) {
                                    int i8 = waitForCustomerUserId + 121;
                                    setCustomerIdAndLogSession = i8 % 128;
                                    if ((i8 % 2 == 0 ? (char) 11 : '7') == '7') {
                                        j = l.longValue();
                                    } else {
                                        long longValue = l.longValue();
                                        try {
                                            throw null;
                                        } catch (Throwable th) {
                                            th = th;
                                            j = longValue;
                                            StringBuilder sb2 = new StringBuilder("Error while handling push notification measurement: ");
                                            sb2.append(th.getClass().getSimpleName());
                                            AFLogger.valueOf(sb2.toString(), th);
                                            if (this.onResponse.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", 2)) {
                                            }
                                            this.onResponse.put(Long.valueOf(currentTimeMillis), this.onDeepLinking);
                                            start(activity);
                                            return;
                                        }
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        j = currentTimeMillis;
                    }
                }
                if (this.onResponse.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", 2)) {
                    StringBuilder sb3 = new StringBuilder("pushes: removing oldest overflowing push (oldest push:");
                    sb3.append(j);
                    sb3.append(")");
                    AFLogger.values(sb3.toString());
                    this.onResponse.remove(Long.valueOf(j));
                }
                this.onResponse.put(Long.valueOf(currentTimeMillis), this.onDeepLinking);
                start(activity);
                return;
            }
            return;
        }
        if (activity != null) {
            int i9 = setCustomerIdAndLogSession + 7;
            waitForCustomerUserId = i9 % 128;
            if (i9 % 2 != 0) {
                ak.AFInAppEventType().AFKeystoreWrapper("sendPushNotificationData", "activity_intent_null", activity.getLocalClassName());
            } else {
                ak.AFInAppEventType().AFKeystoreWrapper("sendPushNotificationData", activity.getLocalClassName(), "activity_intent_null");
            }
        } else {
            ak.AFInAppEventType().AFKeystoreWrapper("sendPushNotificationData", "activity_null");
        }
        AFInAppEventParameterName2 = AFInAppEventParameterName(activity);
        this.onDeepLinking = AFInAppEventParameterName2;
        if (AFInAppEventParameterName2 == null) {
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(String... strArr) {
        int i = setCustomerIdAndLogSession + 35;
        waitForCustomerUserId = i % 128;
        if ((i % 2 != 0 ? 'B' : '[') != '[') {
            ak.AFInAppEventType().AFKeystoreWrapper("setUserEmails", strArr);
            setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
            int i2 = 55 / 0;
        } else {
            ak.AFInAppEventType().AFKeystoreWrapper("setUserEmails", strArr);
            setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
        }
        int i3 = setCustomerIdAndLogSession + 77;
        waitForCustomerUserId = i3 % 128;
        if ((i3 % 2 != 0 ? (char) 1 : '2') != 1) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(AppsFlyerProperties.EmailsCryptType emailsCryptType, String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length + 1);
        arrayList.add(emailsCryptType.toString());
        arrayList.addAll(Arrays.asList(strArr));
        ak.AFInAppEventType().AFKeystoreWrapper("setUserEmails", (String[]) arrayList.toArray(new String[strArr.length + 1]));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EMAIL_CRYPT_TYPE, emailsCryptType.getValue());
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        int length = strArr.length;
        String str = null;
        int i = 0;
        while (true) {
            if (!(i >= length)) {
                int i2 = setCustomerIdAndLogSession + 57;
                waitForCustomerUserId = i2 % 128;
                int i3 = i2 % 2;
                String str2 = strArr[i];
                if (AnonymousClass9.values[emailsCryptType.ordinal()] != 2) {
                    arrayList2.add(ag.AFInAppEventParameterName(str2));
                    str = "sha256_el_arr";
                } else {
                    arrayList2.add(str2);
                    str = "plain_el_arr";
                }
                i++;
                int i4 = waitForCustomerUserId + 85;
                setCustomerIdAndLogSession = i4 % 128;
                int i5 = i4 % 2;
            } else {
                hashMap.put(str, arrayList2);
                AppsFlyerProperties.getInstance().setUserEmails(new JSONObject((Map<?, ?>) hashMap).toString());
                return;
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectAndroidID(boolean z) {
        int i = waitForCustomerUserId + 67;
        setCustomerIdAndLogSession = i % 128;
        if (i % 2 != 0) {
            ak.AFInAppEventType().AFKeystoreWrapper("setCollectAndroidID", String.valueOf(z));
        } else {
            ak AFInAppEventType2 = ak.AFInAppEventType();
            String[] strArr = new String[1];
            strArr[1] = String.valueOf(z);
            AFInAppEventType2.AFKeystoreWrapper("setCollectAndroidID", strArr);
        }
        values(AppsFlyerProperties.COLLECT_ANDROID_ID, Boolean.toString(z));
        values(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, Boolean.toString(z));
        int i2 = setCustomerIdAndLogSession + 11;
        waitForCustomerUserId = i2 % 128;
        if (!(i2 % 2 == 0)) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectIMEI(boolean z) {
        int i = setCustomerIdAndLogSession + AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY;
        waitForCustomerUserId = i % 128;
        int i2 = i % 2;
        ak.AFInAppEventType().AFKeystoreWrapper("setCollectIMEI", String.valueOf(z));
        values(AppsFlyerProperties.COLLECT_IMEI, Boolean.toString(z));
        values(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, Boolean.toString(z));
        int i3 = setCustomerIdAndLogSession + 91;
        waitForCustomerUserId = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setCollectOaid(boolean z) {
        int i = waitForCustomerUserId + 65;
        setCustomerIdAndLogSession = i % 128;
        if ((i % 2 == 0 ? '$' : '9') != '9') {
            ak.AFInAppEventType().AFKeystoreWrapper("setCollectOaid", String.valueOf(z));
        } else {
            ak.AFInAppEventType().AFKeystoreWrapper("setCollectOaid", String.valueOf(z));
        }
        values(AppsFlyerProperties.COLLECT_OAID, Boolean.toString(z));
        int i2 = setCustomerIdAndLogSession + 21;
        waitForCustomerUserId = i2 % 128;
        if ((i2 % 2 != 0 ? '=' : 'I') != 'I') {
            int i3 = 91 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setResolveDeepLinkURLs(String... strArr) {
        int i = waitForCustomerUserId + 55;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        AFLogger.AFInAppEventParameterName(String.format("setResolveDeepLinkURLs %s", Arrays.toString(strArr)));
        f.AFKeystoreWrapper = strArr;
        int i3 = waitForCustomerUserId + 33;
        setCustomerIdAndLogSession = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOneLinkCustomDomain(String... strArr) {
        int i = waitForCustomerUserId + 5;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        AFLogger.AFInAppEventParameterName(String.format("setOneLinkCustomDomain %s", Arrays.toString(strArr)));
        f.AFLogger$LogLevel = strArr;
        int i3 = setCustomerIdAndLogSession + 89;
        waitForCustomerUserId = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final AppsFlyerLib init(String str, AppsFlyerConversionListener appsFlyerConversionListener, Context context) {
        int i = setCustomerIdAndLogSession + 13;
        waitForCustomerUserId = i % 128;
        int i2 = i % 2;
        if ((this.AppsFlyerInAppPurchaseValidatorListener ? ClassUtils.PACKAGE_SEPARATOR_CHAR : 'a') != 'a') {
            return this;
        }
        this.AppsFlyerInAppPurchaseValidatorListener = true;
        AppsFlyerProperties.getInstance().setDevKey(str);
        ai.AFInAppEventType(str);
        Object obj = null;
        if (context != null) {
            int i3 = waitForCustomerUserId + 113;
            setCustomerIdAndLogSession = i3 % 128;
            int i4 = i3 % 2;
            this.stop = (Application) context.getApplicationContext();
            bf bfVar = this.setCustomerUserId;
            if (context != null) {
                be beVar = bfVar.AFKeystoreWrapper;
                if (context != null) {
                    beVar.values = context.getApplicationContext();
                    int i5 = setCustomerIdAndLogSession + 87;
                    waitForCustomerUserId = i5 % 128;
                    int i6 = i5 % 2;
                }
            }
            values().getLevel().AFInAppEventType = System.currentTimeMillis();
            values().values().values(null);
            de AFLogger$LogLevel2 = values().AFLogger$LogLevel();
            final cx cxVar = new cx(new Runnable() { // from class: com.appsflyer.internal.ac.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (k.values == null) {
                        k.values = new k();
                    }
                    ac.valueOf(k.values.AFKeystoreWrapper(), new Runnable() { // from class: com.appsflyer.internal.ac.1.5
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                ci ciVar = new ci();
                                Application AFInAppEventParameterName2 = ac.AFInAppEventParameterName(ac.this);
                                if (AFInAppEventParameterName2 != null) {
                                    ciVar.AFKeystoreWrapper = (Application) AFInAppEventParameterName2.getApplicationContext();
                                }
                                if (ac.AFInAppEventParameterName(ac.this, ciVar, ac.AFInAppEventType(ac.AFInAppEventParameterName(ac.this)))) {
                                    ac.AFInAppEventParameterName(ac.this, ciVar);
                                }
                            } catch (Throwable th) {
                                AFLogger.valueOf(th.getMessage(), th);
                            }
                        }
                    }, 0L, TimeUnit.MILLISECONDS);
                }
            });
            Runnable runnable = new Runnable() { // from class: com.appsflyer.internal.ac.2
                @Override // java.lang.Runnable
                public final void run() {
                    SharedPreferences AFInAppEventType2 = ac.AFInAppEventType(ac.AFInAppEventParameterName(ac.this));
                    int valueOf2 = ac.this.valueOf(AFInAppEventType2, false);
                    boolean z = AFInAppEventType2.getBoolean(AppsFlyerProperties.NEW_REFERRER_SENT, false);
                    boolean z2 = cxVar.AFInAppEventParameterName == dd.d.NOT_STARTED;
                    if (valueOf2 == 1) {
                        if (z2 || z) {
                            ac acVar = ac.this;
                            ci ciVar = new ci();
                            Application AFInAppEventParameterName2 = ac.AFInAppEventParameterName(ac.this);
                            if (AFInAppEventParameterName2 != null) {
                                ciVar.AFKeystoreWrapper = (Application) AFInAppEventParameterName2.getApplicationContext();
                            }
                            ac.AFInAppEventParameterName(acVar, ciVar);
                        }
                    }
                }
            };
            AFLogger$LogLevel2.AFKeystoreWrapper(cxVar);
            AFLogger$LogLevel2.AFKeystoreWrapper(new cy(runnable));
            AFLogger$LogLevel2.AFKeystoreWrapper(new df(runnable));
            dd[] AFInAppEventType2 = AFLogger$LogLevel2.AFInAppEventType();
            int length = AFInAppEventType2.length;
            int i7 = 0;
            while (true) {
                if (!(i7 < length ? true : true)) {
                    break;
                }
                int i8 = setCustomerIdAndLogSession + 19;
                waitForCustomerUserId = i8 % 128;
                if (!(i8 % 2 == 0)) {
                    AFInAppEventType2[i7].AFInAppEventParameterName(this.stop);
                    i7 += 46;
                } else {
                    AFInAppEventType2[i7].AFInAppEventParameterName(this.stop);
                    i7++;
                }
            }
            this.setCustomerUserId.init().values();
            ay.AFInAppEventParameterName = this.stop;
            if ((valueOf(AFInAppEventType(context), false) == 0 ? (char) 14 : '\t') != '\t' && Build.VERSION.SDK_INT >= 29) {
                dc dcVar = new dc(context);
                this.setAndroidIdData = dcVar;
                new Thread(dcVar.AFInAppEventParameterName).start();
            }
        } else {
            AFLogger.AppsFlyer2dXConversionCallback("context is null, Google Install Referrer will be not initialized");
        }
        ak AFInAppEventType3 = ak.AFInAppEventType();
        String[] strArr = new String[2];
        strArr[0] = str;
        strArr[1] = !(appsFlyerConversionListener != null) ? AbstractJsonLexerKt.NULL : "conversionDataListener";
        AFInAppEventType3.AFKeystoreWrapper("init", strArr);
        AFLogger.AFInAppEventType(String.format("Initializing AppsFlyer SDK: (v%s.%s)", "6.5.4", valueOf));
        AFKeystoreWrapper = appsFlyerConversionListener;
        int i9 = waitForCustomerUserId + 7;
        setCustomerIdAndLogSession = i9 % 128;
        if (i9 % 2 != 0) {
            return this;
        }
        super.hashCode();
        throw null;
    }

    private void valueOf(Context context) {
        this.updateServerUninstallToken = new HashMap();
        final long currentTimeMillis = System.currentTimeMillis();
        final l.d dVar = new l.d() { // from class: com.appsflyer.internal.ac.3
            @Override // com.appsflyer.internal.l.d
            public final void valueOf(String str, String str2, String str3) {
                if (str != null) {
                    AFLogger.values("Facebook Deferred AppLink data received: ".concat(String.valueOf(str)));
                    ac.AFKeystoreWrapper(ac.this).put("link", str);
                    if (str2 != null) {
                        ac.AFKeystoreWrapper(ac.this).put("target_url", str2);
                    }
                    if (str3 != null) {
                        HashMap hashMap = new HashMap();
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put(ShareConstants.PROMO_CODE, str3);
                        hashMap.put(ShareConstants.DEEPLINK_CONTEXT, hashMap2);
                        ac.AFKeystoreWrapper(ac.this).put(AppLinks.KEY_NAME_EXTRAS, hashMap);
                    }
                } else {
                    ac.AFKeystoreWrapper(ac.this).put("link", "");
                }
                ac.AFKeystoreWrapper(ac.this).put("ttr", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
            }

            @Override // com.appsflyer.internal.l.d
            public final void values(String str) {
                ac.AFKeystoreWrapper(ac.this).put("error", str);
            }
        };
        try {
            Class.forName("com.facebook.FacebookSdk").getMethod("sdkInitialize", Context.class).invoke(null, context);
            final Class<?> cls = Class.forName("com.facebook.applinks.AppLinkData");
            Class<?> cls2 = Class.forName("com.facebook.applinks.AppLinkData$CompletionHandler");
            Method method = cls.getMethod("fetchDeferredAppLinkData", Context.class, String.class, cls2);
            Object newProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: com.appsflyer.internal.l.5
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method2, Object[] objArr) throws Throwable {
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
                                Bundle bundle3 = bundle2.getBundle(AppLinks.KEY_NAME_EXTRAS);
                                str = (bundle3 == null || (bundle = bundle3.getBundle(ShareConstants.DEEPLINK_CONTEXT)) == null) ? null : bundle.getString(ShareConstants.PROMO_CODE);
                            } else {
                                str = null;
                                str2 = null;
                                str3 = null;
                            }
                            d dVar2 = dVar;
                            if (dVar2 != null) {
                                dVar2.valueOf(str2, str3, str);
                            }
                        } else {
                            d dVar3 = dVar;
                            if (dVar3 != null) {
                                dVar3.valueOf(null, null, null);
                            }
                        }
                        return null;
                    }
                    d dVar4 = dVar;
                    if (dVar4 != null) {
                        dVar4.values("onDeferredAppLinkDataFetched invocation failed");
                    }
                    return null;
                }
            });
            String string = context.getString(context.getResources().getIdentifier("facebook_app_id", TypedValues.Custom.S_STRING, context.getPackageName()));
            if ((TextUtils.isEmpty(string) ? (char) 11 : (char) 6) != 11) {
                method.invoke(null, context, string, newProxyInstance);
                return;
            }
            int i = setCustomerIdAndLogSession + 119;
            waitForCustomerUserId = i % 128;
            int i2 = i % 2;
            dVar.values("Facebook app id not defined in resources");
            int i3 = setCustomerIdAndLogSession + 87;
            waitForCustomerUserId = i3 % 128;
            int i4 = i3 % 2;
        } catch (ClassNotFoundException e2) {
            dVar.values(e2.toString());
        } catch (IllegalAccessException e3) {
            dVar.values(e3.toString());
        } catch (NoSuchMethodException e4) {
            dVar.values(e4.toString());
        } catch (InvocationTargetException e5) {
            dVar.values(e5.toString());
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableFacebookDeferredApplinks(boolean z) {
        int i = setCustomerIdAndLogSession;
        int i2 = i + 85;
        waitForCustomerUserId = i2 % 128;
        int i3 = i2 % 2;
        this.setDebugLog = z;
        int i4 = i + 111;
        waitForCustomerUserId = i4 % 128;
        if ((i4 % 2 != 0 ? (char) 6 : '@') != 6) {
            return;
        }
        int i5 = 73 / 0;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context) {
        int i = waitForCustomerUserId + 117;
        setCustomerIdAndLogSession = i % 128;
        char c = i % 2 == 0 ? 'P' : (char) 4;
        Object obj = null;
        start(context, null);
        if (c == 'P') {
            super.hashCode();
            throw null;
        }
        int i2 = setCustomerIdAndLogSession + 35;
        waitForCustomerUserId = i2 % 128;
        if ((i2 % 2 != 0 ? 'N' : (char) 23) == 23) {
            return;
        }
        super.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context, String str) {
        int i = waitForCustomerUserId + 75;
        setCustomerIdAndLogSession = i % 128;
        boolean z = i % 2 != 0;
        start(context, str, null);
        if (!z) {
            int i2 = 95 / 0;
        }
        int i3 = setCustomerIdAndLogSession + 79;
        waitForCustomerUserId = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context, final String str, final AppsFlyerRequestListener appsFlyerRequestListener) {
        if (ah.AFInAppEventParameterName != null) {
            return;
        }
        if (!this.AppsFlyerInAppPurchaseValidatorListener) {
            AFLogger.AppsFlyer2dXConversionCallback("ERROR: AppsFlyer SDK is not initialized! The API call 'start()' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
            if (str == null) {
                if (appsFlyerRequestListener != null) {
                    appsFlyerRequestListener.onError(RequestError.NO_DEV_KEY, ba.AFInAppEventParameterName);
                    return;
                }
                return;
            }
        }
        bf bfVar = this.setCustomerUserId;
        if (context != null) {
            be beVar = bfVar.AFKeystoreWrapper;
            if (context != null) {
                int i = waitForCustomerUserId + 125;
                setCustomerIdAndLogSession = i % 128;
                int i2 = i % 2;
                beVar.values = context.getApplicationContext();
            }
        }
        final cl level = values().getLevel();
        level.valueOf(n.AFInAppEventParameterName(context));
        this.stop = (Application) context.getApplicationContext();
        ak.AFInAppEventType().AFKeystoreWrapper(TtmlNode.START, str);
        String str2 = valueOf;
        AFLogger.values(String.format("Starting AppsFlyer: (v%s.%s)", "6.5.4", str2));
        StringBuilder sb = new StringBuilder("Build Number: ");
        sb.append(str2);
        AFLogger.values(sb.toString());
        AppsFlyerProperties.getInstance().loadProperties(this.stop.getApplicationContext());
        Object obj = null;
        if (!TextUtils.isEmpty(str)) {
            AppsFlyerProperties.getInstance().setDevKey(str);
            ai.AFInAppEventType(str);
        } else if (TextUtils.isEmpty(AppsFlyerProperties.getInstance().getDevKey())) {
            int i3 = setCustomerIdAndLogSession + 33;
            waitForCustomerUserId = i3 % 128;
            int i4 = i3 % 2;
            AFLogger.AppsFlyer2dXConversionCallback("ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
            if (!(appsFlyerRequestListener != null)) {
                return;
            }
            int i5 = waitForCustomerUserId + 35;
            setCustomerIdAndLogSession = i5 % 128;
            if (i5 % 2 != 0) {
                appsFlyerRequestListener.onError(RequestError.NO_DEV_KEY, ba.AFInAppEventParameterName);
                return;
            }
            appsFlyerRequestListener.onError(RequestError.NO_DEV_KEY, ba.AFInAppEventParameterName);
            super.hashCode();
            throw null;
        }
        values().values().values(null);
        AppsFlyer2dXConversionCallback(this.stop.getBaseContext());
        if (this.setDebugLog) {
            valueOf(this.stop.getApplicationContext());
        }
        ah.AFKeystoreWrapper(context, new ah.e() { // from class: com.appsflyer.internal.ac.5
            @Override // com.appsflyer.internal.ah.e
            public final void valueOf(Activity activity) {
                level.AFKeystoreWrapper();
                ac.this.values().values().values(null);
                int valueOf2 = ac.this.valueOf(ac.AFInAppEventType(activity), false);
                AFLogger.values("onBecameForeground");
                if (valueOf2 < 2) {
                    w AFKeystoreWrapper2 = w.AFKeystoreWrapper(activity);
                    AFKeystoreWrapper2.AFKeystoreWrapper.post(AFKeystoreWrapper2.getLevel);
                    AFKeystoreWrapper2.AFKeystoreWrapper.post(AFKeystoreWrapper2.AFInAppEventParameterName);
                }
                cp cpVar = new cp();
                f.valueOf().valueOf(cpVar.values(), level, activity.getIntent(), ac.this.values().AFInAppEventParameterName(), activity.getApplication());
                ac acVar = ac.this;
                if (activity != null) {
                    cpVar.AFKeystoreWrapper = (Application) activity.getApplicationContext();
                }
                cpVar.AFVersionDeclaration = str;
                cpVar.AFInAppEventParameterName = appsFlyerRequestListener;
                acVar.AFKeystoreWrapper(cpVar, activity);
            }

            @Override // com.appsflyer.internal.ah.e
            public final void valueOf(Context context2) {
                AFLogger.values("onBecameBackground");
                cl clVar = level;
                long currentTimeMillis = System.currentTimeMillis();
                if (clVar.AppsFlyer2dXConversionCallback != 0) {
                    long j = currentTimeMillis - clVar.AppsFlyer2dXConversionCallback;
                    if (j > 0 && j < 1000) {
                        j = 1000;
                    }
                    clVar.onDeepLinkingNative = TimeUnit.MILLISECONDS.toSeconds(j);
                    clVar.valueOf.AFKeystoreWrapper("prev_session_dur", clVar.onDeepLinkingNative);
                } else {
                    AFLogger.values("Metrics: fg ts is missing");
                }
                AFLogger.values("callStatsBackground background call");
                ac.this.AFInAppEventParameterName(new WeakReference<>(context2));
                ak AFInAppEventType2 = ak.AFInAppEventType();
                if (AFInAppEventType2.AFVersionDeclaration()) {
                    AFInAppEventType2.AFInAppEventParameterName();
                    if (context2 != null && !AppsFlyerLib.getInstance().isStopped()) {
                        AFInAppEventType2.AFInAppEventType(context2.getPackageName(), context2.getPackageManager());
                    }
                    AFInAppEventType2.values();
                } else {
                    AFLogger.AFInAppEventParameterName("RD status is OFF");
                }
                if (k.values == null) {
                    k.values = new k();
                }
                k kVar = k.values;
                try {
                    k.valueOf(kVar.AFKeystoreWrapper);
                    if (kVar.AFInAppEventParameterName instanceof ThreadPoolExecutor) {
                        k.valueOf((ThreadPoolExecutor) kVar.AFInAppEventParameterName);
                    }
                } catch (Throwable th) {
                    AFLogger.valueOf("failed to stop Executors", th);
                }
                w AFKeystoreWrapper2 = w.AFKeystoreWrapper(context2);
                AFKeystoreWrapper2.AFKeystoreWrapper.post(AFKeystoreWrapper2.getLevel);
            }
        }, this.setOaidData);
        int i6 = waitForCustomerUserId + 115;
        setCustomerIdAndLogSession = i6 % 128;
        if ((i6 % 2 == 0 ? 'F' : (char) 22) != 'F') {
            return;
        }
        int i7 = 6 / 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
        if ((r5.getPackageManager().getPackageInfo(r5.getPackageName(), 0).applicationInfo.flags & 32768) != 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void AppsFlyer2dXConversionCallback(Context context) {
        int i = waitForCustomerUserId + 79;
        setCustomerIdAndLogSession = i % 128;
        try {
            if (i % 2 == 0) {
                if (((context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.flags & 32768) != 0 ? 'K' : 'b') != 'b') {
                    if (context.getResources().getIdentifier("appsflyer_backup_rules", "xml", context.getPackageName()) != 0) {
                        AFLogger.values("appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
                        return;
                    }
                    AFLogger.valueOf("'allowBackup' is set to true; appsflyer_backup_rules.xml not detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules");
                }
                int i2 = waitForCustomerUserId + 13;
                setCustomerIdAndLogSession = i2 % 128;
                if (!(i2 % 2 != 0)) {
                    throw null;
                }
            }
        } catch (Exception e2) {
            AFLogger.AFKeystoreWrapper("checkBackupRules Exception: ".concat(String.valueOf(e2)));
        }
    }

    private static void getLevel(Context context) {
        int i;
        if (z.valueOf()) {
            AFLogger.AFKeystoreWrapper("OPPO device found");
            i = 23;
        } else {
            i = 18;
        }
        if (Build.VERSION.SDK_INT >= i && !AFKeystoreWrapper(AppsFlyerProperties.DISABLE_KEYSTORE, true)) {
            StringBuilder sb = new StringBuilder("OS SDK is=");
            sb.append(Build.VERSION.SDK_INT);
            sb.append("; use KeyStore");
            AFLogger.AFKeystoreWrapper(sb.toString());
            AFKeystoreWrapper aFKeystoreWrapper = new AFKeystoreWrapper(context);
            if (!aFKeystoreWrapper.AFKeystoreWrapper()) {
                aFKeystoreWrapper.values = af.valueOf(new WeakReference(context));
                aFKeystoreWrapper.AFInAppEventType = 0;
                aFKeystoreWrapper.AFKeystoreWrapper(aFKeystoreWrapper.valueOf());
            } else {
                String valueOf2 = aFKeystoreWrapper.valueOf();
                synchronized (aFKeystoreWrapper.AFInAppEventParameterName) {
                    aFKeystoreWrapper.AFInAppEventType++;
                    AFLogger.values("Deleting key with alias: ".concat(String.valueOf(valueOf2)));
                    try {
                        synchronized (aFKeystoreWrapper.AFInAppEventParameterName) {
                            aFKeystoreWrapper.valueOf.deleteEntry(valueOf2);
                        }
                    } catch (KeyStoreException e2) {
                        StringBuilder sb2 = new StringBuilder("Exception ");
                        sb2.append(e2.getMessage());
                        sb2.append(" occurred");
                        AFLogger.valueOf(sb2.toString(), e2);
                    }
                }
                aFKeystoreWrapper.AFKeystoreWrapper(aFKeystoreWrapper.valueOf());
            }
            values("KSAppsFlyerId", aFKeystoreWrapper.values());
            values("KSAppsFlyerRICounter", String.valueOf(aFKeystoreWrapper.AFInAppEventType()));
            return;
        }
        StringBuilder sb3 = new StringBuilder("OS SDK is=");
        sb3.append(Build.VERSION.SDK_INT);
        sb3.append("; no KeyStore usage");
        AFLogger.AFKeystoreWrapper(sb3.toString());
    }

    public static String AFInAppEventType() {
        int i = waitForCustomerUserId + 15;
        setCustomerIdAndLogSession = i % 128;
        if ((i % 2 == 0 ? (char) 21 : '6') != '6') {
            int i2 = 55 / 0;
            return AFInAppEventParameterName(AppsFlyerProperties.APP_USER_ID);
        }
        return AFInAppEventParameterName(AppsFlyerProperties.APP_USER_ID);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerUserId(String str) {
        int i = waitForCustomerUserId + 51;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        ak.AFInAppEventType().AFKeystoreWrapper("setCustomerUserId", str);
        AFLogger.values("setCustomerUserId = ".concat(String.valueOf(str)));
        values(AppsFlyerProperties.APP_USER_ID, str);
        values(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false);
        int i3 = setCustomerIdAndLogSession + 77;
        waitForCustomerUserId = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPhoneNumber(String str) {
        int i = waitForCustomerUserId + 107;
        setCustomerIdAndLogSession = i % 128;
        boolean z = i % 2 == 0;
        this.onPause = ag.AFInAppEventParameterName(str);
        if (z) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i2 = waitForCustomerUserId + 107;
        setCustomerIdAndLogSession = i2 % 128;
        int i3 = i2 % 2;
    }

    private static String init() {
        int i = waitForCustomerUserId + 71;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        String AFInAppEventParameterName2 = AFInAppEventParameterName(AppsFlyerProperties.APP_ID);
        int i3 = setCustomerIdAndLogSession + 107;
        waitForCustomerUserId = i3 % 128;
        if ((i3 % 2 != 0 ? 'A' : 'W') == 'W') {
            return AFInAppEventParameterName2;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppId(String str) {
        int i = waitForCustomerUserId + 49;
        setCustomerIdAndLogSession = i % 128;
        if ((i % 2 == 0 ? (char) 29 : 'A') != 'A') {
            ak.AFInAppEventType().AFKeystoreWrapper("setAppId", str);
        } else {
            ak.AFInAppEventType().AFKeystoreWrapper("setAppId", str);
        }
        values(AppsFlyerProperties.APP_ID, str);
        int i2 = setCustomerIdAndLogSession + 31;
        waitForCustomerUserId = i2 % 128;
        if ((i2 % 2 != 0 ? '`' : '@') != '@') {
            int i3 = 82 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setExtension(String str) {
        int i = waitForCustomerUserId + 87;
        setCustomerIdAndLogSession = i % 128;
        if (!(i % 2 != 0)) {
            ak.AFInAppEventType().AFKeystoreWrapper("setExtension", str);
        } else {
            ak.AFInAppEventType().AFKeystoreWrapper("setExtension", str);
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EXTENSION, str);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setIsUpdate(boolean z) {
        int i = setCustomerIdAndLogSession + 77;
        waitForCustomerUserId = i % 128;
        int i2 = i % 2;
        ak.AFInAppEventType().AFKeystoreWrapper("setIsUpdate", String.valueOf(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.IS_UPDATE, z);
        int i3 = setCustomerIdAndLogSession + 3;
        waitForCustomerUserId = i3 % 128;
        if ((i3 % 2 != 0 ? (char) 23 : (char) 11) != 23) {
            return;
        }
        int i4 = 85 / 0;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCurrencyCode(String str) {
        int i = setCustomerIdAndLogSession + 29;
        waitForCustomerUserId = i % 128;
        int i2 = i % 2;
        ak.AFInAppEventType().AFKeystoreWrapper("setCurrencyCode", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.CURRENCY_CODE, str);
        int i3 = setCustomerIdAndLogSession + 35;
        waitForCustomerUserId = i3 % 128;
        if ((i3 % 2 != 0 ? 'S' : (char) 17) != 17) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logLocation(Context context, double d2, double d3) {
        ak.AFInAppEventType().AFKeystoreWrapper("logLocation", String.valueOf(d2), String.valueOf(d3));
        HashMap hashMap = new HashMap();
        hashMap.put(AFInAppEventParameterName.LONGTITUDE, Double.toString(d3));
        hashMap.put(AFInAppEventParameterName.LATITUDE, Double.toString(d2));
        AFInAppEventParameterName(context, AFInAppEventType.LOCATION_COORDINATES, hashMap);
        int i = setCustomerIdAndLogSession + 65;
        waitForCustomerUserId = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    final void AFInAppEventParameterName(WeakReference<Context> weakReference) {
        if (weakReference.get() == null) {
            return;
        }
        AFLogger.values("app went to background");
        SharedPreferences AFInAppEventType2 = AFInAppEventType(weakReference.get());
        AppsFlyerProperties.getInstance().saveProperties(AFInAppEventType2);
        long j = values().getLevel().onDeepLinkingNative;
        HashMap hashMap = new HashMap();
        String devKey = AppsFlyerProperties.getInstance().getDevKey();
        if (devKey == null) {
            AFLogger.AppsFlyer2dXConversionCallback("[callStats] AppsFlyer's SDK cannot send any event without providing DevKey.");
            return;
        }
        String AFInAppEventParameterName2 = AFInAppEventParameterName("KSAppsFlyerId");
        if ((AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false) ? 'Y' : '2') == 'Y') {
            hashMap.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
        }
        g AFInAppEventType3 = ab.AFInAppEventType(weakReference.get().getContentResolver());
        if ((AFInAppEventType3 != null ? '_' : Soundex.SILENT_MARKER) == '_') {
            int i = setCustomerIdAndLogSession + 5;
            waitForCustomerUserId = i % 128;
            int i2 = i % 2;
            hashMap.put("amazon_aid", AFInAppEventType3.values);
            hashMap.put("amazon_aid_limit", String.valueOf(AFInAppEventType3.AFKeystoreWrapper));
            int i3 = setCustomerIdAndLogSession + 51;
            waitForCustomerUserId = i3 % 128;
            int i4 = i3 % 2;
        }
        String string = AppsFlyerProperties.getInstance().getString("advertiserId");
        if (!(string == null)) {
            int i5 = waitForCustomerUserId + 41;
            setCustomerIdAndLogSession = i5 % 128;
            if (i5 % 2 == 0) {
                hashMap.put("advertiserId", string);
                Object obj = null;
                super.hashCode();
                throw null;
            }
            hashMap.put("advertiserId", string);
            int i6 = setCustomerIdAndLogSession + 1;
            waitForCustomerUserId = i6 % 128;
            int i7 = i6 % 2;
        }
        hashMap.put("app_id", weakReference.get().getPackageName());
        hashMap.put("devkey", devKey);
        hashMap.put("uid", af.valueOf(weakReference));
        hashMap.put("time_in_app", String.valueOf(j));
        hashMap.put("statType", "user_closed_app");
        hashMap.put("platform", "Android");
        hashMap.put("launch_counter", Integer.toString(valueOf(AFInAppEventType2, false)));
        hashMap.put(AppsFlyerProperties.CHANNEL, AFInAppEventParameterName(weakReference.get()));
        if ((AFInAppEventParameterName2 != null ? 'A' : (char) 31) == 31) {
            AFInAppEventParameterName2 = "";
        }
        hashMap.put("originalAppsflyerId", AFInAppEventParameterName2);
        if (!this.onValidateInApp) {
            AFLogger.AFInAppEventParameterName("Stats call is disabled, ignore ...");
            return;
        }
        try {
            AFLogger.AFInAppEventParameterName("Running callStats task");
            cv cvVar = new cv();
            cvVar.onConversionDataSuccess = isStopped();
            new Thread(new an.c((cm) cvVar.AFInAppEventParameterName(hashMap).AFInAppEventType(String.format(AFLogger$LogLevel, AppsFlyerLib.getInstance().getHostPrefix(), AFInAppEventParameterName().getHostName())))).start();
        } catch (Throwable th) {
            AFLogger.valueOf("Could not send callStats request", th);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logSession(Context context) {
        int i = waitForCustomerUserId + 51;
        setCustomerIdAndLogSession = i % 128;
        if (!(i % 2 != 0)) {
            ak.AFInAppEventType().AFKeystoreWrapper("logSession", new String[1]);
        } else {
            ak.AFInAppEventType().AFKeystoreWrapper("logSession", new String[0]);
        }
        ak.AFInAppEventType().getLevel();
        AFInAppEventParameterName(context, ch.logSession);
        AFInAppEventParameterName(context, (String) null, (Map<String, Object>) null);
    }

    private void AFInAppEventParameterName(Context context, ch chVar) {
        int i = setCustomerIdAndLogSession + 95;
        int i2 = i % 128;
        waitForCustomerUserId = i2;
        int i3 = i % 2;
        bf bfVar = this.setCustomerUserId;
        if (context != null) {
            int i4 = i2 + 19;
            setCustomerIdAndLogSession = i4 % 128;
            int i5 = i4 % 2;
            be beVar = bfVar.AFKeystoreWrapper;
            if (context != null) {
                beVar.values = context.getApplicationContext();
            }
        }
        cl level = values().getLevel();
        cj AFInAppEventParameterName2 = n.AFInAppEventParameterName(context);
        if ((level.AFInAppEventType() ? '8' : 'A') != 'A') {
            level.AFInAppEventParameterName.put("api_name", chVar.toString());
            level.valueOf(AFInAppEventParameterName2);
            int i6 = waitForCustomerUserId + 123;
            setCustomerIdAndLogSession = i6 % 128;
            int i7 = i6 % 2;
        }
        level.AFKeystoreWrapper();
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map) {
        int i = setCustomerIdAndLogSession + 69;
        waitForCustomerUserId = i % 128;
        boolean z = i % 2 != 0;
        logEvent(context, str, map, null);
        if (z) {
            int i2 = 16 / 0;
        }
        int i3 = setCustomerIdAndLogSession + 61;
        waitForCustomerUserId = i3 % 128;
        if ((i3 % 2 != 0 ? 'U' : (char) 26) == 'U') {
            throw null;
        }
    }

    private void AFInAppEventParameterName(Context context, String str, Map<String, Object> map) {
        co coVar = new co();
        Activity activity = null;
        if (context != null) {
            int i = waitForCustomerUserId + 119;
            setCustomerIdAndLogSession = i % 128;
            if (i % 2 == 0) {
                coVar.AFKeystoreWrapper = (Application) context.getApplicationContext();
                super.hashCode();
                throw null;
            }
            coVar.AFKeystoreWrapper = (Application) context.getApplicationContext();
        }
        coVar.getLevel = str;
        coVar.values = map;
        if (!(context instanceof Activity)) {
            int i2 = waitForCustomerUserId + 35;
            setCustomerIdAndLogSession = i2 % 128;
            int i3 = i2 % 2;
        } else {
            int i4 = setCustomerIdAndLogSession + 73;
            waitForCustomerUserId = i4 % 128;
            if (i4 % 2 != 0) {
                Activity activity2 = (Activity) context;
                super.hashCode();
                throw null;
            }
            activity = (Activity) context;
        }
        AFKeystoreWrapper(coVar, activity);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void anonymizeUser(boolean z) {
        int i = setCustomerIdAndLogSession + 117;
        waitForCustomerUserId = i % 128;
        if (i % 2 != 0) {
            ak AFInAppEventType2 = ak.AFInAppEventType();
            String[] strArr = new String[1];
            strArr[1] = String.valueOf(z);
            AFInAppEventType2.AFKeystoreWrapper("anonymizeUser", strArr);
        } else {
            ak.AFInAppEventType().AFKeystoreWrapper("anonymizeUser", String.valueOf(z));
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, z);
        int i2 = waitForCustomerUserId + 75;
        setCustomerIdAndLogSession = i2 % 128;
        if (!(i2 % 2 != 0)) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        int i = setCustomerIdAndLogSession + 39;
        waitForCustomerUserId = i % 128;
        if ((i % 2 != 0 ? (char) 26 : (char) 17) != 26) {
            ak.AFInAppEventType().AFKeystoreWrapper("registerConversionListener", new String[0]);
        } else {
            ak.AFInAppEventType().AFKeystoreWrapper("registerConversionListener", new String[0]);
        }
        values(appsFlyerConversionListener);
        int i2 = waitForCustomerUserId + 73;
        setCustomerIdAndLogSession = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void values(AppsFlyerConversionListener appsFlyerConversionListener) {
        int i = setCustomerIdAndLogSession;
        int i2 = i + 61;
        waitForCustomerUserId = i2 % 128;
        Object obj = null;
        if (!(i2 % 2 == 0)) {
            throw null;
        }
        if (appsFlyerConversionListener == null) {
            int i3 = i + 91;
            waitForCustomerUserId = i3 % 128;
            if ((i3 % 2 != 0 ? '1' : '-') == '-') {
                return;
            }
            super.hashCode();
            throw null;
        }
        AFKeystoreWrapper = appsFlyerConversionListener;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void unregisterConversionListener() {
        int i = setCustomerIdAndLogSession + 105;
        waitForCustomerUserId = i % 128;
        int i2 = i % 2;
        ak.AFInAppEventType().AFKeystoreWrapper("unregisterConversionListener", new String[0]);
        AFKeystoreWrapper = null;
        int i3 = waitForCustomerUserId + 111;
        setCustomerIdAndLogSession = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerValidatorListener(Context context, AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener) {
        int i = waitForCustomerUserId + 97;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        ak.AFInAppEventType().AFKeystoreWrapper("registerValidatorListener", new String[0]);
        AFLogger.AFInAppEventParameterName("registerValidatorListener called");
        if ((appsFlyerInAppPurchaseValidatorListener == null ? (char) 7 : '\n') == 7) {
            int i3 = waitForCustomerUserId + 67;
            setCustomerIdAndLogSession = i3 % 128;
            char c = i3 % 2 == 0 ? 'O' : 'D';
            AFLogger.AFInAppEventParameterName("registerValidatorListener null listener");
            if (c != 'O') {
                return;
            }
            int i4 = 69 / 0;
            return;
        }
        AFInAppEventParameterName = appsFlyerInAppPurchaseValidatorListener;
    }

    public static String valueOf(SimpleDateFormat simpleDateFormat, long j) {
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String format = simpleDateFormat.format(new Date(j));
        int i = setCustomerIdAndLogSession + 19;
        waitForCustomerUserId = i % 128;
        int i2 = i % 2;
        return format;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void AFInAppEventParameterName(Context context, String str, String str2, Map<String, Object> map, String str3, String str4) {
        i cpVar;
        int i = setCustomerIdAndLogSession;
        int i2 = i + 105;
        waitForCustomerUserId = i2 % 128;
        int i3 = i2 % 2;
        if (str2 != null) {
            int i4 = i + 57;
            waitForCustomerUserId = i4 % 128;
            int i5 = i4 % 2;
            if (!str2.trim().isEmpty()) {
                cpVar = new co();
                if ((context == null ? '\t' : '_') != '_') {
                    cpVar.AFKeystoreWrapper = (Application) context.getApplicationContext();
                }
                cpVar.getLevel = str2;
                cpVar.AFVersionDeclaration = str;
                cpVar.values = map;
                cpVar.AppsFlyer2dXConversionCallback = str3;
                cpVar.valueOf = str4;
                values(cpVar);
            }
        }
        cpVar = new cp();
        if ((context == null ? '\t' : '_') != '_') {
        }
        cpVar.getLevel = str2;
        cpVar.AFVersionDeclaration = str;
        cpVar.values = map;
        cpVar.AppsFlyer2dXConversionCallback = str3;
        cpVar.valueOf = str4;
        values(cpVar);
    }

    private boolean getLevel() {
        String format;
        if (this.onAppOpenAttribution > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.onAppOpenAttribution;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", Locale.US);
            String valueOf2 = valueOf(simpleDateFormat, this.onAppOpenAttribution);
            String valueOf3 = valueOf(simpleDateFormat, this.onResponseNative);
            if (currentTimeMillis < this.onConversionDataSuccess) {
                int i = setCustomerIdAndLogSession + 115;
                waitForCustomerUserId = i % 128;
                int i2 = i % 2;
                if (!(isStopped())) {
                    AFLogger.values(String.format(Locale.US, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", valueOf2, valueOf3, Long.valueOf(currentTimeMillis), Long.valueOf(this.onConversionDataSuccess)));
                    return true;
                }
            }
            if (!isStopped()) {
                int i3 = setCustomerIdAndLogSession + 21;
                waitForCustomerUserId = i3 % 128;
                if ((i3 % 2 != 0 ? 'U' : 'S') != 'S') {
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[2];
                    objArr[1] = valueOf2;
                    objArr[0] = valueOf3;
                    objArr[5] = Long.valueOf(currentTimeMillis);
                    format = String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", objArr);
                } else {
                    format = String.format(Locale.US, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", valueOf2, valueOf3, Long.valueOf(currentTimeMillis));
                }
                AFLogger.values(format);
            }
        } else {
            if ((!isStopped() ? (char) 24 : '.') != '.') {
                int i4 = waitForCustomerUserId + 125;
                setCustomerIdAndLogSession = i4 % 128;
                if (i4 % 2 == 0) {
                    AFLogger.values("Sending first launch for this session!");
                    throw null;
                }
                AFLogger.values("Sending first launch for this session!");
            }
        }
        return false;
    }

    private void AFInAppEventType(Context context, String str) {
        cq cqVar = new cq();
        if (context != null) {
            int i = waitForCustomerUserId + AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY;
            setCustomerIdAndLogSession = i % 128;
            int i2 = i % 2;
            cqVar.AFKeystoreWrapper = (Application) context.getApplicationContext();
        }
        cqVar.AppsFlyer2dXConversionCallback = str;
        if ((str != null) && str.length() > 5) {
            int i3 = waitForCustomerUserId + 23;
            setCustomerIdAndLogSession = i3 % 128;
            int i4 = i3 % 2;
            if (valueOf(cqVar, AFInAppEventType(context))) {
                if (k.values == null) {
                    k.values = new k();
                }
                valueOf(k.values.AFKeystoreWrapper(), new b(this, cqVar, (byte) 0), 5L, TimeUnit.MILLISECONDS);
                int i5 = waitForCustomerUserId + 63;
                setCustomerIdAndLogSession = i5 % 128;
                int i6 = i5 % 2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean valueOf(i iVar, SharedPreferences sharedPreferences) {
        boolean z;
        boolean z2;
        int i;
        int valueOf2 = valueOf(sharedPreferences, false);
        if (!(valueOf2 == 1) || (iVar instanceof ci)) {
            z = false;
        } else {
            int i2 = setCustomerIdAndLogSession + 17;
            waitForCustomerUserId = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        }
        if (!sharedPreferences.getBoolean(AppsFlyerProperties.NEW_REFERRER_SENT, false)) {
            if ((valueOf2 == 1 ? '`' : '*') != '*') {
                int i4 = setCustomerIdAndLogSession + 115;
                waitForCustomerUserId = i4 % 128;
                int i5 = i4 % 2;
                z2 = true;
                Object obj = null;
                if (!(!z2)) {
                    int i6 = waitForCustomerUserId + 15;
                    setCustomerIdAndLogSession = i6 % 128;
                    if (i6 % 2 == 0) {
                        throw null;
                    }
                    if ((z ? 'R' : 'W') == 'W') {
                        return false;
                    }
                }
                i = waitForCustomerUserId + 45;
                setCustomerIdAndLogSession = i % 128;
                if (i % 2 == 0) {
                    return true;
                }
                super.hashCode();
                throw null;
            }
        }
        z2 = false;
        Object obj2 = null;
        if (!(!z2)) {
        }
        i = waitForCustomerUserId + 45;
        setCustomerIdAndLogSession = i % 128;
        if (i % 2 == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
        if ((com.appsflyer.AppsFlyerProperties.getInstance().getBoolean(com.appsflyer.AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) != true) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        if (com.appsflyer.AppsFlyerProperties.getInstance().getBoolean(com.appsflyer.AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (com.appsflyer.AppsFlyerProperties.getInstance().getBoolean(com.appsflyer.AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) == false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void AFInAppEventParameterName(Map<String, Object> map) {
        boolean z;
        int i = waitForCustomerUserId + 79;
        setCustomerIdAndLogSession = i % 128;
        if (i % 2 == 0) {
        }
        if (z) {
            return;
        }
        int i2 = waitForCustomerUserId + 85;
        setCustomerIdAndLogSession = i2 % 128;
        int i3 = i2 % 2;
        if (map.get("advertiserId") != null) {
            try {
                if ((TextUtils.isEmpty(this.init) ? (char) 21 : Typography.amp) == 21) {
                    int i4 = setCustomerIdAndLogSession + 21;
                    waitForCustomerUserId = i4 % 128;
                    int i5 = i4 % 2;
                    if (map.remove("android_id") != null) {
                        AFLogger.values("validateGaidAndIMEI :: removing: android_id");
                    }
                }
                if (TextUtils.isEmpty(this.AppsFlyer2dXConversionCallback)) {
                    int i6 = waitForCustomerUserId + 29;
                    setCustomerIdAndLogSession = i6 % 128;
                    if ((i6 % 2 == 0 ? 'B' : 'O') != 'B') {
                        if (map.remove("imei") == null) {
                            return;
                        }
                        AFLogger.values("validateGaidAndIMEI :: removing: imei");
                        return;
                    }
                    map.remove("imei");
                    Object obj = null;
                    super.hashCode();
                    throw null;
                }
            } catch (Exception e2) {
                AFLogger.valueOf("failed to remove IMEI or AndroidID key from params; ", e2);
            }
        }
    }

    private boolean AFLogger$LogLevel() {
        int i = setCustomerIdAndLogSession + 25;
        waitForCustomerUserId = i % 128;
        int i2 = i % 2;
        Map<String, Object> map = this.updateServerUninstallToken;
        if ((map != null ? '9' : 'X') != 'X') {
            if (!(map.isEmpty())) {
                int i3 = setCustomerIdAndLogSession + 1;
                waitForCustomerUserId = i3 % 128;
                int i4 = i3 % 2;
                return true;
            }
        }
        int i5 = waitForCustomerUserId + 85;
        setCustomerIdAndLogSession = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    private void valueOf(Map<String, Object> map) {
        int i = setCustomerIdAndLogSession + 85;
        waitForCustomerUserId = i % 128;
        Object obj = null;
        if (i % 2 == 0) {
            ap AFKeystoreWrapper2 = values().values().AFKeystoreWrapper();
            if ((AFKeystoreWrapper2 != null ? 'F' : (char) 16) == 'F') {
                map.put("rc", AFKeystoreWrapper2.AFKeystoreWrapper());
            }
            int i2 = waitForCustomerUserId + 79;
            setCustomerIdAndLogSession = i2 % 128;
            if (i2 % 2 == 0) {
                super.hashCode();
                throw null;
            }
            return;
        }
        values().values().AFKeystoreWrapper();
        throw null;
    }

    public static Map<String, Object> AFInAppEventType(Map<String, Object> map) {
        int i = waitForCustomerUserId + 23;
        setCustomerIdAndLogSession = i % 128;
        if ((i % 2 == 0 ? 'H' : '+') != '+') {
            map.containsKey("meta");
            throw null;
        }
        if ((map.containsKey("meta") ? (char) 25 : AbstractJsonLexerKt.END_LIST) == 25) {
            Map<String, Object> map2 = (Map) map.get("meta");
            int i2 = waitForCustomerUserId + 29;
            setCustomerIdAndLogSession = i2 % 128;
            int i3 = i2 % 2;
            return map2;
        }
        HashMap hashMap = new HashMap();
        map.put("meta", hashMap);
        return hashMap;
    }

    public static boolean AFInAppEventType(SharedPreferences sharedPreferences) {
        int i = waitForCustomerUserId + 89;
        setCustomerIdAndLogSession = i % 128;
        boolean z = i % 2 != 0;
        Object obj = null;
        String string = sharedPreferences.getString("sentSuccessfully", null);
        if (!z) {
            Boolean.parseBoolean(string);
            super.hashCode();
            throw null;
        }
        boolean parseBoolean = Boolean.parseBoolean(string);
        int i2 = waitForCustomerUserId + 3;
        setCustomerIdAndLogSession = i2 % 128;
        if (!(i2 % 2 != 0)) {
            int i3 = 42 / 0;
        }
        return parseBoolean;
    }

    private static void values(Context context, Map<String, Object> map) {
        int i = waitForCustomerUserId + 71;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (!(windowManager == null)) {
            int i3 = waitForCustomerUserId + 63;
            setCustomerIdAndLogSession = i3 % 128;
            int i4 = i3 % 2;
            int rotation = windowManager.getDefaultDisplay().getRotation();
            map.put("sc_o", rotation != 0 ? rotation != 1 ? rotation != 2 ? rotation != 3 ? "" : "lr" : "pr" : "l" : TtmlNode.TAG_P);
        }
    }

    private void AFInAppEventParameterName(Context context, boolean z, Map<String, Object> map, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("cpu_abi", values("ro.product.cpu.abi"));
        hashMap.put("cpu_abi2", values("ro.product.cpu.abi2"));
        hashMap.put("arch", values("os.arch"));
        hashMap.put("build_display_id", values("ro.build.display.id"));
        if (!(!z)) {
            int i2 = waitForCustomerUserId + 79;
            setCustomerIdAndLogSession = i2 % 128;
            Object obj = null;
            if ((i2 % 2 == 0 ? '4' : '7') != '4') {
                if (this.AppsFlyerConversionListener) {
                    Map<String, Object> AFLogger$LogLevel2 = AFLogger$LogLevel(context);
                    if ((!AFLogger$LogLevel2.isEmpty() ? '2' : Typography.amp) == '2') {
                        int i3 = setCustomerIdAndLogSession + 45;
                        waitForCustomerUserId = i3 % 128;
                        if (i3 % 2 != 0) {
                            hashMap.put("loc", AFLogger$LogLevel2);
                            super.hashCode();
                            throw null;
                        }
                        hashMap.put("loc", AFLogger$LogLevel2);
                    }
                }
                AFKeystoreWrapper(context, hashMap);
                if (i <= 2) {
                    hashMap.putAll(w.AFKeystoreWrapper(context).AFKeystoreWrapper());
                }
            } else {
                throw null;
            }
        }
        hashMap.put("dim", y.AFInAppEventType(context));
        map.put("deviceData", hashMap);
    }

    public static void AFInAppEventType(Context context, Map<String, ? super String> map) {
        int i = waitForCustomerUserId + 15;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        u uVar = u.d.valueOf;
        u.a AFInAppEventType2 = u.AFInAppEventType(context);
        map.put("network", AFInAppEventType2.AFKeystoreWrapper);
        if (AFInAppEventType2.values != null) {
            int i3 = waitForCustomerUserId + 103;
            setCustomerIdAndLogSession = i3 % 128;
            if ((i3 % 2 == 0 ? '*' : (char) 24) != 24) {
                map.put("operator", AFInAppEventType2.values);
                int i4 = 66 / 0;
            } else {
                map.put("operator", AFInAppEventType2.values);
            }
        }
        if ((AFInAppEventType2.AFInAppEventType != null ? (char) 14 : (char) 20) != 14) {
            return;
        }
        int i5 = setCustomerIdAndLogSession + 1;
        waitForCustomerUserId = i5 % 128;
        if (!(i5 % 2 == 0)) {
            map.put("carrier", AFInAppEventType2.AFInAppEventType);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        map.put("carrier", AFInAppEventType2.AFInAppEventType);
        int i6 = waitForCustomerUserId + 43;
        setCustomerIdAndLogSession = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
        if ((r0 != null) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
        r4.put("onelink_id", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
        if (r0 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void values(Map<String, Object> map) {
        String string;
        String string2;
        int i = setCustomerIdAndLogSession + 121;
        waitForCustomerUserId = i % 128;
        if (i % 2 != 0) {
            string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID);
            string2 = AppsFlyerProperties.getInstance().getString("onelinkVersion");
            int i2 = 68 / 0;
        } else {
            string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID);
            string2 = AppsFlyerProperties.getInstance().getString("onelinkVersion");
        }
        if ((string2 != null ? (char) 15 : 'E') != 15) {
            return;
        }
        int i3 = waitForCustomerUserId + 53;
        setCustomerIdAndLogSession = i3 % 128;
        int i4 = i3 % 2;
        map.put("onelink_ver", string2);
    }

    private static String AFInAppEventParameterName(Activity activity) {
        String str = null;
        if (activity != null) {
            int i = setCustomerIdAndLogSession + 119;
            waitForCustomerUserId = i % 128;
            int i2 = i % 2;
            Intent intent = activity.getIntent();
            if (intent != null) {
                try {
                    Bundle extras = intent.getExtras();
                    if ((extras != null ? (char) 24 : '`') != '`') {
                        str = extras.getString("af");
                        if ((str != null ? (char) 28 : '@') == 28) {
                            int i3 = setCustomerIdAndLogSession + 119;
                            waitForCustomerUserId = i3 % 128;
                            int i4 = i3 % 2;
                            AFLogger.values("Push Notification received af payload = ".concat(String.valueOf(str)));
                            extras.remove("af");
                            activity.setIntent(intent.putExtras(extras));
                        }
                    }
                } catch (Throwable th) {
                    AFLogger.valueOf(th.getMessage(), th);
                }
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void AFInAppEventType(Context context, Map<String, Object> map, Uri uri) {
        if (!map.containsKey("af_deeplink")) {
            String valueOf2 = valueOf(uri.toString());
            f valueOf3 = f.valueOf();
            if (valueOf3.AFVersionDeclaration != null && valueOf3.getLevel != null) {
                int i = setCustomerIdAndLogSession + 25;
                waitForCustomerUserId = i % 128;
                int i2 = i % 2;
                if (valueOf2.contains(valueOf3.AFVersionDeclaration)) {
                    Uri.Builder buildUpon = Uri.parse(valueOf2).buildUpon();
                    Uri.Builder buildUpon2 = Uri.EMPTY.buildUpon();
                    Iterator<Map.Entry<String, String>> it = valueOf3.getLevel.entrySet().iterator();
                    while (true) {
                        if (!(it.hasNext())) {
                            break;
                        }
                        int i3 = setCustomerIdAndLogSession + 3;
                        waitForCustomerUserId = i3 % 128;
                        int i4 = i3 % 2;
                        Map.Entry<String, String> next = it.next();
                        buildUpon.appendQueryParameter(next.getKey(), next.getValue());
                        buildUpon2.appendQueryParameter(next.getKey(), next.getValue());
                    }
                    valueOf2 = buildUpon.build().toString();
                    map.put("appended_query_params", buildUpon2.build().getEncodedQuery());
                }
            }
            map.put("af_deeplink", valueOf2);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("link", uri.toString());
        aq aqVar = new aq(uri, this, context);
        if ((aqVar.values ? (char) 14 : 'S') != 'S') {
            int i5 = waitForCustomerUserId + 21;
            setCustomerIdAndLogSession = i5 % 128;
            if (!(i5 % 2 != 0)) {
                map.put("isBrandedDomain", Boolean.TRUE);
                int i6 = 4 / 0;
            } else {
                map.put("isBrandedDomain", Boolean.TRUE);
            }
        }
        z.AFInAppEventType(context, hashMap, uri);
        if (!aqVar.AFInAppEventType()) {
            ao.AFInAppEventType(hashMap);
            return;
        }
        int i7 = setCustomerIdAndLogSession + 1;
        waitForCustomerUserId = i7 % 128;
        if (i7 % 2 != 0) {
            aqVar.AFKeystoreWrapper = AFKeystoreWrapper(hashMap);
            k kVar = k.values;
            Object obj = null;
            super.hashCode();
            throw null;
        }
        aqVar.AFKeystoreWrapper = AFKeystoreWrapper(hashMap);
        if (k.values == null) {
            k.values = new k();
        }
        k.values.AFInAppEventType().execute(aqVar);
        int i8 = waitForCustomerUserId + 97;
        setCustomerIdAndLogSession = i8 % 128;
        int i9 = i8 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
        if ((r10.contains("access_token") ? 22 : 18) != 22) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
        if (r10.contains("access_token") != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
        r1 = AFKeystoreWrapper(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
        if (r1.length() != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
        r0 = com.appsflyer.internal.ac.setCustomerIdAndLogSession + 95;
        com.appsflyer.internal.ac.waitForCustomerUserId = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
        r3 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
        if (r1.contains("&") == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
        r3 = new java.util.ArrayList(java.util.Arrays.asList(r1.split("&")));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
        r3.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
        r5 = new java.lang.StringBuilder();
        r3 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
        if (r3.hasNext() == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
        r6 = com.appsflyer.internal.ac.setCustomerIdAndLogSession + 3;
        com.appsflyer.internal.ac.waitForCustomerUserId = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0091, code lost:
        if ((r6 % 2) == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0093, code lost:
        r6 = '/';
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0096, code lost:
        r6 = '#';
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0097, code lost:
        if (r6 != '#') goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0099, code lost:
        r6 = (java.lang.String) r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a3, code lost:
        if (r6.contains("access_token") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a5, code lost:
        r3.remove();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ad, code lost:
        if (r5.length() == 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00af, code lost:
        r5.append("&");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bb, code lost:
        if (r6.startsWith("?") != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bd, code lost:
        r8 = 'a';
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bf, code lost:
        r8 = kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c1, code lost:
        if (r8 == 'a') goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c4, code lost:
        r5.append("?");
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c7, code lost:
        r5.append(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00cb, code lost:
        ((java.lang.String) r3.next()).contains("access_token");
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d4, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00dd, code lost:
        return r10.replace(r1, r5.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String valueOf(String str) {
        if (str != null) {
            if (str.matches("fb\\d*?://authorize.*")) {
                int i = waitForCustomerUserId + 51;
                setCustomerIdAndLogSession = i % 128;
                if (i % 2 == 0) {
                    int i2 = 1 / 0;
                }
            }
            int i3 = setCustomerIdAndLogSession + 111;
            waitForCustomerUserId = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 28 / 0;
            }
            return str;
        }
        int i5 = setCustomerIdAndLogSession + 9;
        waitForCustomerUserId = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 76 / 0;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
        if ((r0 == -1 ? 25 : 'L') != 25) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
        if ((r0 == -1) != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
        r3 = com.appsflyer.internal.ac.waitForCustomerUserId + 19;
        com.appsflyer.internal.ac.setCustomerIdAndLogSession = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
        if ((r3 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
        return "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0043, code lost:
        r3 = r3.substring(r0);
        r0 = com.appsflyer.internal.ac.waitForCustomerUserId + 59;
        com.appsflyer.internal.ac.setCustomerIdAndLogSession = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String AFKeystoreWrapper(String str) {
        int indexOf;
        int i = waitForCustomerUserId + 101;
        setCustomerIdAndLogSession = i % 128;
        if ((i % 2 == 0 ? (char) 4 : '\'') != '\'') {
            indexOf = str.indexOf(31);
        } else {
            indexOf = str.indexOf(63);
        }
    }

    private aq.a AFKeystoreWrapper(final Map<String, String> map) {
        aq.a aVar = new aq.a() { // from class: com.appsflyer.internal.ac.6
            @Override // com.appsflyer.internal.aq.a
            public final void valueOf(Map<String, String> map2) {
                for (String str : map2.keySet()) {
                    map.put(str, map2.get(str));
                }
                ao.AFInAppEventType(map);
            }

            @Override // com.appsflyer.internal.aq.a
            public final void AFKeystoreWrapper(String str) {
                ao.AFInAppEventType(str, DeepLinkResult.Error.NETWORK);
            }
        };
        int i = setCustomerIdAndLogSession + 31;
        waitForCustomerUserId = i % 128;
        if ((i % 2 != 0 ? 'C' : (char) 31) == 31) {
            return aVar;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    private static void valueOf(Context context, Map<String, Object> map, String str) {
        int i = waitForCustomerUserId + 61;
        setCustomerIdAndLogSession = i % 128;
        try {
            if ((i % 2 == 0 ? '0' : (char) 19) == 19) {
                SharedPreferences AFInAppEventType2 = AFInAppEventType(context);
                SharedPreferences.Editor edit = AFInAppEventType2.edit();
                String string = AFInAppEventType2.getString("prev_event_name", null);
                if (string != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("prev_event_timestamp", AFInAppEventType2.getLong("prev_event_timestamp", -1L));
                    jSONObject.put("prev_event_name", string);
                    map.put("prev_event", jSONObject);
                }
                edit.putString("prev_event_name", str);
                edit.putLong("prev_event_timestamp", System.currentTimeMillis());
                AFInAppEventType(edit);
                int i2 = setCustomerIdAndLogSession + 113;
                waitForCustomerUserId = i2 % 128;
                if (i2 % 2 == 0) {
                    return;
                }
                int i3 = 88 / 0;
                return;
            }
            SharedPreferences AFInAppEventType3 = AFInAppEventType(context);
            AFInAppEventType3.edit();
            AFInAppEventType3.getString("prev_event_name", null);
            throw null;
        } catch (Exception e2) {
            AFLogger.valueOf("Error while processing previous event.", e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
        if (r0 == 0) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v7, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean init(Context context) {
        Context context2;
        int i = setCustomerIdAndLogSession + 53;
        waitForCustomerUserId = i % 128;
        try {
        } catch (Throwable th) {
            AFLogger.valueOf("WARNING:  Google play services is unavailable. ", th);
            context2 = context;
        }
        if ((i % 2 != 0 ? 'M' : 'W') != 'W') {
            int i2 = 16 / 0;
            if (!(GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0)) {
                context2 = context;
                try {
                    context2.getPackageManager().getPackageInfo("com.google.android.gms", 0);
                    return true;
                } catch (PackageManager.NameNotFoundException e2) {
                    AFLogger.valueOf("WARNING:  Google Play Services is unavailable. ", e2);
                    return false;
                }
            }
        } else {
            int isGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);
            context2 = context;
        }
        int i3 = waitForCustomerUserId + 39;
        setCustomerIdAndLogSession = i3 % 128;
        context = i3 % 2;
        if (context != 0) {
            return true;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void valueOf(Context context, Map<String, Object> map) {
        String str;
        boolean z;
        String str2;
        g AFInAppEventType2;
        String str3;
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        if (appsFlyerProperties.getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            map.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            return;
        }
        SharedPreferences AFInAppEventType3 = AFInAppEventType(context);
        boolean z2 = appsFlyerProperties.getBoolean(AppsFlyerProperties.COLLECT_IMEI, false);
        String str4 = null;
        String string = AFInAppEventType3.getString("imeiCached", null);
        if (z2) {
            if (TextUtils.isEmpty(this.AppsFlyer2dXConversionCallback)) {
                int i = setCustomerIdAndLogSession + 55;
                waitForCustomerUserId = i % 128;
                if (i % 2 != 0) {
                    AFVersionDeclaration(context);
                    throw null;
                }
                if (AFVersionDeclaration(context)) {
                    try {
                        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
                        str3 = (String) telephonyManager.getClass().getMethod("getDeviceId", new Class[0]).invoke(telephonyManager, new Object[0]);
                    } catch (InvocationTargetException e2) {
                        if (string != null) {
                            AFLogger.AFInAppEventParameterName("use cached IMEI: ".concat(String.valueOf(string)));
                        } else {
                            string = null;
                        }
                        StringBuilder sb = new StringBuilder("WARNING: Can't collect IMEI because of missing permissions: ");
                        sb.append(e2.getMessage());
                        AFLogger.valueOf(sb.toString(), e2);
                    } catch (Exception e3) {
                        if (string != null) {
                            AFLogger.AFInAppEventParameterName("use cached IMEI: ".concat(String.valueOf(string)));
                        } else {
                            string = null;
                        }
                        StringBuilder sb2 = new StringBuilder("WARNING: Can't collect IMEI: other reason: ");
                        sb2.append(e3.getMessage());
                        AFLogger.valueOf(sb2.toString(), e3);
                    }
                    if (str3 != null) {
                        int i2 = setCustomerIdAndLogSession + 53;
                        waitForCustomerUserId = i2 % 128;
                        int i3 = i2 % 2;
                        str = str3;
                        if (!TextUtils.isEmpty(str)) {
                            int i4 = setCustomerIdAndLogSession + 15;
                            waitForCustomerUserId = i4 % 128;
                            if (i4 % 2 == 0) {
                                valueOf(context, "imeiCached", str);
                                map.put("imei", str);
                            } else {
                                valueOf(context, "imeiCached", str);
                                map.put("imei", str);
                                int i5 = 65 / 0;
                            }
                        } else {
                            AFLogger.values("IMEI was not collected.");
                        }
                        z = appsFlyerProperties.getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID, false);
                        String string2 = AFInAppEventType3.getString("androidIdCached", null);
                        if (z || !TextUtils.isEmpty(this.init)) {
                            str2 = this.init;
                            if ((str2 != null ? 'Y' : ';') != ';') {
                                str4 = str2;
                            }
                        } else if (AFVersionDeclaration(context)) {
                            try {
                                String string3 = Settings.Secure.getString(context.getContentResolver(), "android_id");
                                if (!(string3 == null)) {
                                    int i6 = waitForCustomerUserId + 49;
                                    setCustomerIdAndLogSession = i6 % 128;
                                    int i7 = i6 % 2;
                                    str4 = string3;
                                } else if (string2 != null) {
                                    AFLogger.AFInAppEventParameterName("use cached AndroidId: ".concat(String.valueOf(string2)));
                                    str4 = string2;
                                }
                            } catch (Exception e4) {
                                if (string2 != null) {
                                    AFLogger.AFInAppEventParameterName("use cached AndroidId: ".concat(String.valueOf(string2)));
                                    str4 = string2;
                                }
                                AFLogger.valueOf(e4.getMessage(), e4);
                            }
                        }
                        if (!(str4 != null)) {
                            AFLogger.values("Android ID was not collected.");
                        } else {
                            valueOf(context, "androidIdCached", str4);
                            map.put("android_id", str4);
                        }
                        AFInAppEventType2 = ab.AFInAppEventType(context);
                        if (AFInAppEventType2 != null) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("isManual", AFInAppEventType2.AFInAppEventParameterName);
                            hashMap.put("val", AFInAppEventType2.values);
                            Boolean bool = AFInAppEventType2.AFKeystoreWrapper;
                            if (bool != null) {
                                hashMap.put("isLat", bool);
                            }
                            map.put("oaid", hashMap);
                            return;
                        }
                        return;
                    }
                    if (!(string != null)) {
                        string = null;
                    } else {
                        AFLogger.AFInAppEventParameterName("use cached IMEI: ".concat(String.valueOf(string)));
                    }
                    int i8 = waitForCustomerUserId + 79;
                    setCustomerIdAndLogSession = i8 % 128;
                    int i9 = i8 % 2;
                    str = string;
                    if (!TextUtils.isEmpty(str)) {
                    }
                    z = appsFlyerProperties.getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID, false);
                    String string22 = AFInAppEventType3.getString("androidIdCached", null);
                    if (z) {
                    }
                    str2 = this.init;
                    if ((str2 != null ? 'Y' : ';') != ';') {
                    }
                    if (!(str4 != null)) {
                    }
                    AFInAppEventType2 = ab.AFInAppEventType(context);
                    if (AFInAppEventType2 != null) {
                    }
                }
                str = null;
                if (!TextUtils.isEmpty(str)) {
                }
                z = appsFlyerProperties.getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID, false);
                String string222 = AFInAppEventType3.getString("androidIdCached", null);
                if (z) {
                }
                str2 = this.init;
                if ((str2 != null ? 'Y' : ';') != ';') {
                }
                if (!(str4 != null)) {
                }
                AFInAppEventType2 = ab.AFInAppEventType(context);
                if (AFInAppEventType2 != null) {
                }
            }
        }
        str = this.AppsFlyer2dXConversionCallback;
        if (str != null) {
            int i10 = setCustomerIdAndLogSession + 87;
            waitForCustomerUserId = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 81 / 0;
            }
            if (!TextUtils.isEmpty(str)) {
            }
            z = appsFlyerProperties.getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID, false);
            String string2222 = AFInAppEventType3.getString("androidIdCached", null);
            if (z) {
            }
            str2 = this.init;
            if ((str2 != null ? 'Y' : ';') != ';') {
            }
            if (!(str4 != null)) {
            }
            AFInAppEventType2 = ab.AFInAppEventType(context);
            if (AFInAppEventType2 != null) {
            }
        }
        str = null;
        if (!TextUtils.isEmpty(str)) {
        }
        z = appsFlyerProperties.getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID, false);
        String string22222 = AFInAppEventType3.getString("androidIdCached", null);
        if (z) {
        }
        str2 = this.init;
        if ((str2 != null ? 'Y' : ';') != ';') {
        }
        if (!(str4 != null)) {
        }
        AFInAppEventType2 = ab.AFInAppEventType(context);
        if (AFInAppEventType2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean AFVersionDeclaration(Context context) {
        boolean z;
        if ((!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) ? 'Q' : '<') != '<') {
            int i = waitForCustomerUserId + 41;
            setCustomerIdAndLogSession = i % 128;
            if (i % 2 != 0 ? !AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false) : !AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, true)) {
                z = false;
                return ((z ? '\t' : (char) 31) == 31 && init(context)) ? false : true;
            }
        }
        int i2 = setCustomerIdAndLogSession + 5;
        waitForCustomerUserId = i2 % 128;
        int i3 = i2 % 2;
        z = true;
        if ((z ? '\t' : (char) 31) == 31) {
        }
    }

    public static boolean AFKeystoreWrapper(Context context) {
        if ((!AFInAppEventType(context).contains("appsFlyerCount") ? '>' : '/') != '>') {
            int i = setCustomerIdAndLogSession + 73;
            waitForCustomerUserId = i % 128;
            int i2 = i % 2;
            return false;
        }
        int i3 = setCustomerIdAndLogSession + 13;
        waitForCustomerUserId = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }

    private String onInstallConversionDataLoadedNative(Context context) {
        int i = setCustomerIdAndLogSession + 85;
        waitForCustomerUserId = i % 128;
        int i2 = i % 2;
        SharedPreferences AFInAppEventType2 = AFInAppEventType(context);
        String str = null;
        if ((AFInAppEventType2.contains("INSTALL_STORE") ? '_' : (char) 22) == '_') {
            String string = AFInAppEventType2.getString("INSTALL_STORE", null);
            int i3 = waitForCustomerUserId + 5;
            setCustomerIdAndLogSession = i3 % 128;
            int i4 = i3 % 2;
            return string;
        }
        if (AFKeystoreWrapper(context)) {
            str = onDeepLinkingNative(context);
        } else {
            int i5 = waitForCustomerUserId + 93;
            setCustomerIdAndLogSession = i5 % 128;
            int i6 = i5 % 2;
        }
        valueOf(context, "INSTALL_STORE", str);
        return str;
    }

    private String onDeepLinkingNative(Context context) {
        String string = AppsFlyerProperties.getInstance().getString("api_store_value");
        if (string != null) {
            int i = waitForCustomerUserId + 35;
            int i2 = i % 128;
            setCustomerIdAndLogSession = i2;
            if (i % 2 == 0) {
                throw null;
            }
            int i3 = i2 + 91;
            waitForCustomerUserId = i3 % 128;
            if ((i3 % 2 != 0 ? '>' : (char) 25) != '>') {
                return string;
            }
            throw null;
        }
        String AFKeystoreWrapper2 = AFKeystoreWrapper(context, "AF_STORE");
        int i4 = waitForCustomerUserId + 121;
        setCustomerIdAndLogSession = i4 % 128;
        int i5 = i4 % 2;
        return AFKeystoreWrapper2;
    }

    private static String values(String str) {
        Object invoke;
        int i = waitForCustomerUserId + 93;
        setCustomerIdAndLogSession = i % 128;
        String str2 = null;
        try {
            if (i % 2 == 0) {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                Class<?>[] clsArr = new Class[1];
                clsArr[1] = String.class;
                Method method = cls.getMethod("get", clsArr);
                Object[] objArr = new Object[0];
                objArr[1] = str;
                invoke = method.invoke(null, objArr);
            } else {
                invoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            }
            str2 = (String) invoke;
        } catch (Throwable th) {
            AFLogger.valueOf(th.getMessage(), th);
        }
        int i2 = waitForCustomerUserId + 35;
        setCustomerIdAndLogSession = i2 % 128;
        int i3 = i2 % 2;
        return str2;
    }

    private String AFKeystoreWrapper(Context context, String str) {
        int i = waitForCustomerUserId;
        int i2 = i + 115;
        int i3 = i2 % 128;
        setCustomerIdAndLogSession = i3;
        int i4 = i2 % 2;
        if (!(context != null)) {
            int i5 = i3 + 91;
            int i6 = i5 % 128;
            waitForCustomerUserId = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 7;
            setCustomerIdAndLogSession = i8 % 128;
            if ((i8 % 2 == 0 ? (char) 4 : (char) 27) == 27) {
                return null;
            }
            throw null;
        }
        bf bfVar = this.setCustomerUserId;
        if (context != null) {
            int i9 = i + 29;
            setCustomerIdAndLogSession = i9 % 128;
            int i10 = i9 % 2;
            be beVar = bfVar.AFKeystoreWrapper;
            if (context != null) {
                beVar.values = context.getApplicationContext();
            }
        }
        return values().AFInAppEventType().AFInAppEventParameterName(str);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPreinstallAttribution(String str, String str2, String str3) {
        AFLogger.AFInAppEventParameterName("setPreinstallAttribution API called");
        JSONObject jSONObject = new JSONObject();
        try {
            if ((str != null ? (char) 3 : 'B') != 'B') {
                int i = setCustomerIdAndLogSession + 23;
                waitForCustomerUserId = i % 128;
                if ((i % 2 != 0 ? (char) 7 : 'E') == 7) {
                    jSONObject.put("pid", str);
                    throw null;
                }
                jSONObject.put("pid", str);
            }
            if (str2 != null) {
                int i2 = waitForCustomerUserId + 73;
                setCustomerIdAndLogSession = i2 % 128;
                if (i2 % 2 == 0) {
                    jSONObject.put("c", str2);
                    throw null;
                }
                jSONObject.put("c", str2);
            }
            if (str3 != null) {
                int i3 = setCustomerIdAndLogSession + 71;
                waitForCustomerUserId = i3 % 128;
                if (i3 % 2 != 0) {
                    jSONObject.put("af_siteid", str3);
                    throw null;
                }
                jSONObject.put("af_siteid", str3);
            }
        } catch (JSONException e2) {
            AFLogger.valueOf(e2.getMessage(), e2);
        }
        if (jSONObject.has("pid")) {
            int i4 = setCustomerIdAndLogSession + 25;
            waitForCustomerUserId = i4 % 128;
            int i5 = i4 % 2;
            values("preInstallName", jSONObject.toString());
            return;
        }
        AFLogger.AppsFlyer2dXConversionCallback("Cannot set preinstall attribution data without a media source");
    }

    private static void AFInAppEventType(String str) {
        try {
            if ((new JSONObject(str).has("pid") ? 'I' : 'A') != 'I') {
                AFLogger.AppsFlyer2dXConversionCallback("Cannot set preinstall attribution data without a media source");
                int i = setCustomerIdAndLogSession + 87;
                waitForCustomerUserId = i % 128;
                int i2 = i % 2;
                return;
            }
            int i3 = waitForCustomerUserId + 103;
            setCustomerIdAndLogSession = i3 % 128;
            if ((i3 % 2 == 0 ? 'X' : Typography.amp) != 'X') {
                values("preInstallName", str);
                int i4 = waitForCustomerUserId + 55;
                setCustomerIdAndLogSession = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            values("preInstallName", str);
            Object obj = null;
            super.hashCode();
            throw null;
        } catch (JSONException e2) {
            AFLogger.valueOf("Error parsing JSON for preinstall", e2);
        }
    }

    private String onInstallConversionFailureNative(Context context) {
        int i = waitForCustomerUserId + 17;
        setCustomerIdAndLogSession = i % 128;
        Object obj = null;
        if (i % 2 != 0) {
            File AFLogger$LogLevel2 = AFLogger$LogLevel(values("ro.appsflyer.preinstall.path"));
            if (AFInAppEventType(AFLogger$LogLevel2)) {
                AFLogger$LogLevel2 = AFLogger$LogLevel(AFKeystoreWrapper(context, "AF_PRE_INSTALL_PATH"));
            }
            if (!(!AFInAppEventType(AFLogger$LogLevel2))) {
                int i2 = setCustomerIdAndLogSession + 51;
                waitForCustomerUserId = i2 % 128;
                if ((i2 % 2 != 0 ? 'D' : '1') == '1') {
                    AFLogger$LogLevel2 = AFLogger$LogLevel("/data/local/tmp/pre_install.appsflyer");
                } else {
                    AFLogger$LogLevel("/data/local/tmp/pre_install.appsflyer");
                    super.hashCode();
                    throw null;
                }
            }
            if (AFInAppEventType(AFLogger$LogLevel2)) {
                AFLogger$LogLevel2 = AFLogger$LogLevel("/etc/pre_install.appsflyer");
            }
            if ((AFInAppEventType(AFLogger$LogLevel2) ? (char) 24 : 'Q') != 'Q') {
                int i3 = waitForCustomerUserId + 47;
                setCustomerIdAndLogSession = i3 % 128;
                if (i3 % 2 != 0) {
                    return null;
                }
                super.hashCode();
                throw null;
            }
            return values(AFLogger$LogLevel2, context.getPackageName());
        }
        AFInAppEventType(AFLogger$LogLevel(values("ro.appsflyer.preinstall.path")));
        super.hashCode();
        throw null;
    }

    private static String values(File file, String str) {
        FileReader fileReader;
        Properties properties;
        try {
            try {
                try {
                    properties = new Properties();
                    fileReader = new FileReader(file);
                } catch (Throwable th) {
                    if (fileReader != null) {
                        try {
                            fileReader.close();
                        } catch (Throwable th2) {
                            AFLogger.valueOf(th2.getMessage(), th2);
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused) {
                fileReader = null;
            } catch (Throwable th3) {
                th = th3;
                fileReader = null;
            }
        } catch (Throwable th4) {
            AFLogger.valueOf(th4.getMessage(), th4);
        }
        try {
            properties.load(fileReader);
            AFLogger.values("Found PreInstall property!");
            String property = properties.getProperty(str);
            try {
                fileReader.close();
                int i = waitForCustomerUserId + 95;
                setCustomerIdAndLogSession = i % 128;
                int i2 = i % 2;
            } catch (Throwable th5) {
                AFLogger.valueOf(th5.getMessage(), th5);
            }
            int i3 = setCustomerIdAndLogSession + 61;
            waitForCustomerUserId = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 89 / 0;
            }
            return property;
        } catch (FileNotFoundException unused2) {
            StringBuilder sb = new StringBuilder("PreInstall file wasn't found: ");
            sb.append(file.getAbsolutePath());
            AFLogger.AFInAppEventParameterName(sb.toString());
            if (fileReader != null) {
                fileReader.close();
                int i5 = waitForCustomerUserId + 113;
                setCustomerIdAndLogSession = i5 % 128;
                int i6 = i5 % 2;
            }
            return null;
        } catch (Throwable th6) {
            th = th6;
            AFLogger.valueOf(th.getMessage(), th);
            if (fileReader != null) {
                fileReader.close();
            }
            return null;
        }
    }

    private static boolean AFInAppEventType(File file) {
        int i = waitForCustomerUserId + 73;
        setCustomerIdAndLogSession = i % 128;
        if (i % 2 != 0) {
            if (file == null || !file.exists()) {
                return true;
            }
            int i2 = setCustomerIdAndLogSession + 53;
            waitForCustomerUserId = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 49 / 0;
            }
            return false;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0023, code lost:
        if ((r4 != null) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static File AFLogger$LogLevel(String str) {
        int i = setCustomerIdAndLogSession + 115;
        waitForCustomerUserId = i % 128;
        if (i % 2 != 0) {
            try {
                int i2 = 93 / 0;
                if ((str != null ? '/' : 'O') != 'O') {
                    if (str.trim().length() > 0) {
                        File file = new File(str.trim());
                        int i3 = setCustomerIdAndLogSession + 37;
                        waitForCustomerUserId = i3 % 128;
                        if (!(i3 % 2 != 0)) {
                            return file;
                        }
                        int i4 = 40 / 0;
                        return file;
                    }
                }
                int i5 = setCustomerIdAndLogSession + 5;
                waitForCustomerUserId = i5 % 128;
                int i6 = i5 % 2;
            } catch (Throwable th) {
                AFLogger.valueOf(th.getMessage(), th);
            }
            int i7 = setCustomerIdAndLogSession + 105;
            waitForCustomerUserId = i7 % 128;
            int i8 = i7 % 2;
            return null;
        }
        AFLogger.valueOf(th.getMessage(), th);
        int i72 = setCustomerIdAndLogSession + 105;
        waitForCustomerUserId = i72 % 128;
        int i82 = i72 % 2;
        return null;
    }

    private String onAttributionFailureNative(Context context) {
        SharedPreferences AFInAppEventType2 = AFInAppEventType(context);
        String AFInAppEventParameterName2 = AFInAppEventParameterName("preInstallName");
        if (AFInAppEventParameterName2 == null) {
            if ((AFInAppEventType2.contains("preInstallName") ? (char) 20 : 'B') == 20) {
                AFInAppEventParameterName2 = AFInAppEventType2.getString("preInstallName", null);
            } else {
                if (AFKeystoreWrapper(context)) {
                    AFInAppEventParameterName2 = onInstallConversionFailureNative(context);
                    if ((AFInAppEventParameterName2 != null ? (char) 7 : 'Z') != 7) {
                        AFInAppEventParameterName2 = AFKeystoreWrapper(context, "AF_PRE_INSTALL_NAME");
                        int i = waitForCustomerUserId + 57;
                        setCustomerIdAndLogSession = i % 128;
                        int i2 = i % 2;
                    }
                }
                if (AFInAppEventParameterName2 != null) {
                    int i3 = waitForCustomerUserId + 3;
                    setCustomerIdAndLogSession = i3 % 128;
                    char c = i3 % 2 == 0 ? '7' : ClassUtils.PACKAGE_SEPARATOR_CHAR;
                    valueOf(context, "preInstallName", AFInAppEventParameterName2);
                    if (c == '7') {
                        throw null;
                    }
                }
            }
            if (AFInAppEventParameterName2 != null) {
                values("preInstallName", AFInAppEventParameterName2);
            }
            return AFInAppEventParameterName2;
        }
        int i4 = setCustomerIdAndLogSession + 65;
        waitForCustomerUserId = i4 % 128;
        int i5 = i4 % 2;
        return AFInAppEventParameterName2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
        if ((!r6.onResponseError) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
        if ((java.lang.System.currentTimeMillis() - r6.AFVersionDeclaration) >= 15000) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0037, code lost:
        if (r6.onAttributionFailure == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0039, code lost:
        r7 = com.appsflyer.internal.ac.setCustomerIdAndLogSession + 61;
        com.appsflyer.internal.ac.waitForCustomerUserId = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
        if ((r7 % 2) == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
        if (r2 == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
        r7 = null;
        super.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004d, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0050, code lost:
        if (com.appsflyer.internal.k.values != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0052, code lost:
        com.appsflyer.internal.k.values = new com.appsflyer.internal.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0059, code lost:
        r6.onAttributionFailure = com.appsflyer.internal.k.values.AFKeystoreWrapper();
        valueOf(r6.onAttributionFailure, new com.appsflyer.internal.ac.e(r6, r7), 1, java.util.concurrent.TimeUnit.SECONDS);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
        if (r6.onResponseError == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void onAppOpenAttributionNative(Context context) {
        int i = setCustomerIdAndLogSession + 81;
        waitForCustomerUserId = i % 128;
        boolean z = true;
        if ((i % 2 != 0 ? 'W' : '\r') == 'W') {
            int i2 = 67 / 0;
        }
        int i3 = waitForCustomerUserId + 55;
        setCustomerIdAndLogSession = i3 % 128;
        if (!(i3 % 2 != 0)) {
            int i4 = 94 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
        if (r0.equals("") != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
        if ((r0.equals("") ? 'M' : 5) != 'M') goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
        r4 = com.appsflyer.internal.ac.waitForCustomerUserId + 113;
        com.appsflyer.internal.ac.setCustomerIdAndLogSession = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String AFInAppEventParameterName(Context context) {
        int i = waitForCustomerUserId + 83;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.CHANNEL);
        if (string == null) {
            string = AFKeystoreWrapper(context, "CHANNEL");
        }
        if ((string != null ? 'V' : ')') == 'V') {
            int i3 = waitForCustomerUserId + 107;
            setCustomerIdAndLogSession = i3 % 128;
            if ((i3 % 2 == 0 ? '/' : '8') == '/') {
                int i4 = 26 / 0;
            }
        }
        return string;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final boolean isPreInstalledApp(Context context) {
        try {
            if (((context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 1) != 0 ? '[' : '\\') == '[') {
                int i = setCustomerIdAndLogSession + 97;
                waitForCustomerUserId = i % 128;
                return (i % 2 != 0 ? 'P' : '1') != 'P';
            }
        } catch (PackageManager.NameNotFoundException e2) {
            AFLogger.valueOf("Could not check if app is pre installed", e2);
        }
        int i2 = waitForCustomerUserId + AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY;
        setCustomerIdAndLogSession = i2 % 128;
        int i3 = i2 % 2;
        return false;
    }

    public final String AFInAppEventParameterName(Context context, String str) {
        SharedPreferences AFInAppEventType2 = AFInAppEventType(context);
        if (!(AFInAppEventType2.contains("CACHED_CHANNEL"))) {
            valueOf(context, "CACHED_CHANNEL", str);
            return str;
        }
        int i = waitForCustomerUserId + 101;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        String string = AFInAppEventType2.getString("CACHED_CHANNEL", null);
        int i3 = waitForCustomerUserId + 15;
        setCustomerIdAndLogSession = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    private String AFInAppEventType(SimpleDateFormat simpleDateFormat, Context context) {
        String str;
        String string = AFInAppEventType(context).getString("appsFlyerFirstInstall", null);
        if ((string == null ? ')' : (char) 18) != 18) {
            if (AFKeystoreWrapper(context)) {
                AFLogger.AFInAppEventParameterName("AppsFlyer: first launch detected");
                str = simpleDateFormat.format(new Date());
                int i = setCustomerIdAndLogSession + 25;
                waitForCustomerUserId = i % 128;
                int i2 = i % 2;
            } else {
                str = "";
            }
            string = str;
            valueOf(context, "appsFlyerFirstInstall", string);
            int i3 = waitForCustomerUserId + 113;
            setCustomerIdAndLogSession = i3 % 128;
            int i4 = i3 % 2;
        }
        AFLogger.values("AppsFlyer: first launch date: ".concat(String.valueOf(string)));
        return string;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAttributionId(Context context) {
        try {
            String AFInAppEventParameterName2 = new ae(context).AFInAppEventParameterName();
            int i = waitForCustomerUserId + 19;
            setCustomerIdAndLogSession = i % 128;
            int i2 = i % 2;
            return AFInAppEventParameterName2;
        } catch (Throwable th) {
            AFLogger.valueOf("Could not collect facebook attribution id. ", th);
            return null;
        }
    }

    public static synchronized SharedPreferences AFInAppEventType(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (ac.class) {
            int i = setCustomerIdAndLogSession + 79;
            waitForCustomerUserId = i % 128;
            int i2 = i % 2;
            if (AFInAppEventParameterName().getSdkVersion == null) {
                int i3 = waitForCustomerUserId + 25;
                setCustomerIdAndLogSession = i3 % 128;
                int i4 = i3 % 2;
                AFInAppEventParameterName().getSdkVersion = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
                int i5 = setCustomerIdAndLogSession + 7;
                waitForCustomerUserId = i5 % 128;
                int i6 = i5 % 2;
            }
            sharedPreferences = AFInAppEventParameterName().getSdkVersion;
        }
        return sharedPreferences;
    }

    public final bv values(Context context) {
        bf bfVar = this.setCustomerUserId;
        if (context != null) {
            be beVar = bfVar.AFKeystoreWrapper;
            if (context != null) {
                beVar.values = context.getApplicationContext();
            }
        }
        Context context2 = this.setCustomerUserId.AFKeystoreWrapper.values;
        if (context2 != null) {
            return new bc(AFInAppEventType(context2));
        }
        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
    }

    public final int valueOf(SharedPreferences sharedPreferences, boolean z) {
        int i = waitForCustomerUserId + 3;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        int valueOf2 = valueOf(sharedPreferences, "appsFlyerCount", z);
        int i3 = waitForCustomerUserId + 119;
        setCustomerIdAndLogSession = i3 % 128;
        if ((i3 % 2 == 0 ? 'A' : '2') != '2') {
            int i4 = 84 / 0;
        }
        return valueOf2;
    }

    private int AFKeystoreWrapper(SharedPreferences sharedPreferences, boolean z) {
        int i = setCustomerIdAndLogSession + 117;
        waitForCustomerUserId = i % 128;
        int i2 = i % 2;
        int valueOf2 = valueOf(sharedPreferences, "appsFlyerInAppEventCount", z);
        int i3 = setCustomerIdAndLogSession + 5;
        waitForCustomerUserId = i3 % 128;
        int i4 = i3 % 2;
        return valueOf2;
    }

    private int valueOf(SharedPreferences sharedPreferences) {
        int i = setCustomerIdAndLogSession + 3;
        waitForCustomerUserId = i % 128;
        int valueOf2 = (i % 2 != 0 ? '6' : (char) 11) != 11 ? valueOf(sharedPreferences, "appsFlyerAdRevenueCount", false) : valueOf(sharedPreferences, "appsFlyerAdRevenueCount", true);
        int i2 = setCustomerIdAndLogSession + 117;
        waitForCustomerUserId = i2 % 128;
        if (i2 % 2 == 0) {
            return valueOf2;
        }
        int i3 = 85 / 0;
        return valueOf2;
    }

    private static int valueOf(SharedPreferences sharedPreferences, String str, boolean z) {
        int i = waitForCustomerUserId + 87;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        int i3 = sharedPreferences.getInt(str, 0);
        if (z) {
            i3++;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt(str, i3);
            AFInAppEventType(edit);
            int i4 = setCustomerIdAndLogSession + 43;
            waitForCustomerUserId = i4 % 128;
            int i5 = i4 % 2;
        }
        if (ak.AFInAppEventType().AFVersionDeclaration()) {
            ak.AFInAppEventType().values(String.valueOf(i3));
        }
        return i3;
    }

    private long onAppOpenAttribution(Context context) {
        int i = setCustomerIdAndLogSession + 51;
        waitForCustomerUserId = i % 128;
        int i2 = i % 2;
        long j = AFInAppEventType(context).getLong("AppsFlyerTimePassedSincePrevLaunch", 0L);
        long currentTimeMillis = System.currentTimeMillis();
        AFInAppEventType(context, "AppsFlyerTimePassedSincePrevLaunch", currentTimeMillis);
        if ((j > 0 ? (char) 24 : (char) 0) != 0) {
            long j2 = currentTimeMillis - j;
            int i3 = waitForCustomerUserId + 33;
            setCustomerIdAndLogSession = i3 % 128;
            return (i3 % 2 == 0 ? '%' : (char) 31) != '%' ? j2 / 1000 : j2 - 1000;
        }
        return -1L;
    }

    private void AFInAppEventParameterName(i iVar) throws IOException {
        String encodeToString;
        StringBuilder sb = new StringBuilder("url: ");
        sb.append(iVar.onDeepLinkingNative);
        AFLogger.values(sb.toString());
        if (iVar.init != null) {
            encodeToString = Base64.encodeToString(iVar.AFInAppEventParameterName(), 2);
            AFLogger.values("cached data: ".concat(String.valueOf(encodeToString)));
        } else {
            encodeToString = new JSONObject((Map<?, ?>) iVar.values()).toString();
            String replaceAll = encodeToString.replaceAll("\\p{C}", "*Non-printing character*");
            if (replaceAll.equals(encodeToString) ? false : true) {
                int i = waitForCustomerUserId + 65;
                setCustomerIdAndLogSession = i % 128;
                int i2 = i % 2;
                AFLogger.AppsFlyer2dXConversionCallback("Payload contains non-printing characters");
                encodeToString = replaceAll;
            }
            ai.AFKeystoreWrapper("data: ".concat(String.valueOf(encodeToString)));
            int i3 = setCustomerIdAndLogSession + 47;
            waitForCustomerUserId = i3 % 128;
            int i4 = i3 % 2;
        }
        ak.AFInAppEventType().AFInAppEventType(iVar.onDeepLinkingNative, encodeToString);
        try {
            init(iVar);
        } catch (IOException e2) {
            AFLogger.valueOf("Exception in sendRequestToServer. ", e2);
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.USE_HTTP_FALLBACK, false)) {
                init(iVar.AFInAppEventType(iVar.onDeepLinkingNative.replace("https:", "http:")));
                return;
            }
            StringBuilder sb2 = new StringBuilder("failed to send request to server. ");
            sb2.append(e2.getLocalizedMessage());
            AFLogger.values(sb2.toString());
            throw e2;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        ak AFInAppEventType2 = ak.AFInAppEventType();
        String[] strArr = new String[6];
        strArr[0] = str;
        strArr[1] = str2;
        strArr[2] = str3;
        strArr[3] = str4;
        strArr[4] = str5;
        strArr[5] = map == null ? "" : map.toString();
        AFInAppEventType2.AFKeystoreWrapper("validateAndTrackInAppPurchase", strArr);
        if (!isStopped()) {
            StringBuilder sb = new StringBuilder("Validate in app called with parameters: ");
            sb.append(str3);
            sb.append(" ");
            sb.append(str4);
            sb.append(" ");
            sb.append(str5);
            AFLogger.values(sb.toString());
        }
        if (str == null || str4 == null || str2 == null || str5 == null || str3 == null) {
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = AFInAppEventParameterName;
            if (appsFlyerInAppPurchaseValidatorListener != null) {
                appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
                return;
            }
            return;
        }
        Context applicationContext = context.getApplicationContext();
        String devKey = AppsFlyerProperties.getInstance().getDevKey();
        if (context instanceof Activity) {
            ((Activity) context).getIntent();
        }
        new Thread(new ad(applicationContext, devKey, str, str2, str3, str4, str5, map)).start();
    }

    public static void valueOf(ScheduledExecutorService scheduledExecutorService, Runnable runnable, long j, TimeUnit timeUnit) {
        if (scheduledExecutorService != null) {
            try {
                if (!scheduledExecutorService.isShutdown()) {
                    int i = setCustomerIdAndLogSession + 87;
                    waitForCustomerUserId = i % 128;
                    int i2 = i % 2;
                    if (!(scheduledExecutorService.isTerminated())) {
                        int i3 = setCustomerIdAndLogSession + 25;
                        waitForCustomerUserId = i3 % 128;
                        int i4 = i3 % 2;
                        scheduledExecutorService.schedule(runnable, j, timeUnit);
                        return;
                    }
                }
            } catch (RejectedExecutionException e2) {
                AFLogger.valueOf("scheduleJob failed with RejectedExecutionException Exception", e2);
                return;
            } catch (Throwable th) {
                AFLogger.valueOf("scheduleJob failed with Exception", th);
                return;
            }
        }
        AFLogger.AppsFlyer2dXConversionCallback("scheduler is null, shut downed or terminated");
        int i5 = setCustomerIdAndLogSession + 45;
        waitForCustomerUserId = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final boolean isStopped() {
        int i = waitForCustomerUserId + 59;
        int i2 = i % 128;
        setCustomerIdAndLogSession = i2;
        int i3 = i % 2;
        boolean z = this.getInstance;
        int i4 = i2 + 123;
        waitForCustomerUserId = i4 % 128;
        if ((i4 % 2 != 0 ? 'D' : '0') == '0') {
            return z;
        }
        throw null;
    }

    public static String AFInAppEventParameterName(HttpURLConnection httpURLConnection) {
        String obj;
        InputStreamReader inputStreamReader;
        char c;
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            try {
                InputStream errorStream = httpURLConnection.getErrorStream();
                if (errorStream == null) {
                    errorStream = httpURLConnection.getInputStream();
                }
                inputStreamReader = new InputStreamReader(errorStream);
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader);
                    boolean z = false;
                    while (true) {
                        try {
                            String readLine = bufferedReader2.readLine();
                            if (readLine == null) {
                                break;
                            }
                            int i = waitForCustomerUserId;
                            int i2 = i + 27;
                            setCustomerIdAndLogSession = i2 % 128;
                            int i3 = i2 % 2;
                            if (z) {
                                int i4 = i + 115;
                                setCustomerIdAndLogSession = i4 % 128;
                                int i5 = i4 % 2;
                                c = '\n';
                            } else {
                                c = "";
                            }
                            sb.append(c);
                            sb.append(readLine);
                            z = true;
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader = bufferedReader2;
                            try {
                                StringBuilder sb2 = new StringBuilder("Could not read connection response from: ");
                                sb2.append(httpURLConnection.getURL().toString());
                                AFLogger.valueOf(sb2.toString(), th);
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                }
                                if (!(inputStreamReader == null)) {
                                    inputStreamReader.close();
                                    int i6 = setCustomerIdAndLogSession + 23;
                                    waitForCustomerUserId = i6 % 128;
                                    int i7 = i6 % 2;
                                }
                                obj = sb.toString();
                                new JSONObject(obj);
                                return obj;
                            } catch (Throwable th2) {
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (Throwable th3) {
                                        AFLogger.values(th3);
                                        throw th2;
                                    }
                                }
                                if (inputStreamReader == null) {
                                    r2 = false;
                                }
                                if (r2) {
                                    inputStreamReader.close();
                                }
                                int i8 = setCustomerIdAndLogSession + 111;
                                waitForCustomerUserId = i8 % 128;
                                int i9 = i8 % 2;
                                throw th2;
                            }
                        }
                    }
                    bufferedReader2.close();
                    inputStreamReader.close();
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th = th5;
                inputStreamReader = null;
            }
        } catch (Throwable th6) {
            AFLogger.values(th6);
        }
        obj = sb.toString();
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

    private static float onResponseNative(Context context) {
        float f;
        int intExtra;
        int intExtra2;
        try {
            Intent registerReceiver = context.getApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            intExtra = registerReceiver.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1);
            intExtra2 = registerReceiver.getIntExtra("scale", -1);
        } catch (Throwable th) {
            AFLogger.valueOf(th.getMessage(), th);
            f = 1.0f;
        }
        if (intExtra == -1) {
            return 50.0f;
        }
        int i = waitForCustomerUserId + 83;
        int i2 = i % 128;
        setCustomerIdAndLogSession = i2;
        int i3 = i % 2;
        if (intExtra2 != -1) {
            f = (intExtra / intExtra2) * 100.0f;
            int i4 = i2 + 93;
            waitForCustomerUserId = i4 % 128;
            int i5 = i4 % 2;
            int i6 = setCustomerIdAndLogSession + 117;
            waitForCustomerUserId = i6 % 128;
            int i7 = i6 % 2;
            return f;
        }
        return 50.0f;
    }

    private static boolean onConversionDataSuccess(Context context) {
        if (context != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                Network[] allNetworks = connectivityManager.getAllNetworks();
                int length = allNetworks.length;
                int i = 0;
                while (true) {
                    if (!(i >= length)) {
                        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(allNetworks[i]);
                        if ((networkCapabilities.hasTransport(4) ? '\n' : 'Q') != 'Q') {
                            int i2 = waitForCustomerUserId + 19;
                            setCustomerIdAndLogSession = i2 % 128;
                            int i3 = i2 % 2;
                            if ((!networkCapabilities.hasCapability(15) ? (char) 14 : ':') != ':') {
                                int i4 = waitForCustomerUserId + 87;
                                setCustomerIdAndLogSession = i4 % 128;
                                if (i4 % 2 != 0) {
                                    return true;
                                }
                                Object obj = null;
                                super.hashCode();
                                throw null;
                            }
                        }
                        i++;
                    } else {
                        int i5 = waitForCustomerUserId + 59;
                        setCustomerIdAndLogSession = i5 % 128;
                        int i6 = i5 % 2;
                        return false;
                    }
                }
            } catch (Exception e2) {
                AFLogger.valueOf("Failed collecting ivc data", e2);
            }
        }
        return false;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setHost(String str, String str2) {
        int i = setCustomerIdAndLogSession + 43;
        waitForCustomerUserId = i % 128;
        int i2 = i % 2;
        if ((str != null ? 'W' : '0') == 'W') {
            values("custom_host_prefix", str);
        }
        if (!(str2 == null)) {
            int i3 = setCustomerIdAndLogSession + 3;
            waitForCustomerUserId = i3 % 128;
            int i4 = i3 % 2;
            if (!str2.isEmpty()) {
                values("custom_host", str2);
                return;
            }
        }
        AFLogger.AppsFlyer2dXConversionCallback("hostName cannot be null or empty");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostName() {
        int i = waitForCustomerUserId + 93;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        String AFInAppEventParameterName2 = AFInAppEventParameterName("custom_host");
        if (!(AFInAppEventParameterName2 != null)) {
            return "appsflyer.com";
        }
        int i3 = waitForCustomerUserId + 3;
        int i4 = i3 % 128;
        setCustomerIdAndLogSession = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 41;
        waitForCustomerUserId = i6 % 128;
        if ((i6 % 2 != 0 ? 'Y' : '4') != 'Y') {
            return AFInAppEventParameterName2;
        }
        int i7 = 76 / 0;
        return AFInAppEventParameterName2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostPrefix() {
        int i = waitForCustomerUserId + 95;
        setCustomerIdAndLogSession = i % 128;
        if (i % 2 != 0) {
            String AFInAppEventParameterName2 = AFInAppEventParameterName("custom_host_prefix");
            if ((AFInAppEventParameterName2 != null ? (char) 1 : (char) 26) != 1) {
                return "";
            }
            int i2 = setCustomerIdAndLogSession + 119;
            waitForCustomerUserId = i2 % 128;
            int i3 = i2 % 2;
            return AFInAppEventParameterName2;
        }
        AFInAppEventParameterName("custom_host_prefix");
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setMinTimeBetweenSessions(int i) {
        int i2 = setCustomerIdAndLogSession + 19;
        waitForCustomerUserId = i2 % 128;
        if (!(i2 % 2 == 0)) {
            this.onConversionDataSuccess = TimeUnit.SECONDS.toMillis(i);
            int i3 = 88 / 0;
        } else {
            this.onConversionDataSuccess = TimeUnit.SECONDS.toMillis(i);
        }
        int i4 = setCustomerIdAndLogSession + 83;
        waitForCustomerUserId = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final dd[] valueOf() {
        int i = setCustomerIdAndLogSession + 45;
        waitForCustomerUserId = i % 128;
        if ((i % 2 != 0 ? (char) 26 : '2') == 26) {
            values().AFLogger$LogLevel().AFInAppEventType();
            throw null;
        }
        dd[] AFInAppEventType2 = values().AFLogger$LogLevel().AFInAppEventType();
        int i2 = waitForCustomerUserId + 27;
        setCustomerIdAndLogSession = i2 % 128;
        int i3 = i2 % 2;
        return AFInAppEventType2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements Runnable {
        private final i values;

        /* synthetic */ b(ac acVar, i iVar, byte b) {
            this(iVar);
        }

        private b(i iVar) {
            this.values = iVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ac.AFInAppEventParameterName(ac.this, this.values);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class d implements Runnable {
        private final i AFInAppEventType;

        /* synthetic */ d(ac acVar, i iVar, byte b) {
            this(iVar);
        }

        private d(i iVar) {
            this.AFInAppEventType = iVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IOException iOException;
            String str;
            dd[] valueOf;
            boolean valueOf2 = this.AFInAppEventType.valueOf();
            if (!ac.this.isStopped()) {
                Map<String, Object> values = this.AFInAppEventType.values();
                String str2 = this.AFInAppEventType.onDeepLinkingNative;
                int i = this.AFInAppEventType.onInstallConversionFailureNative;
                Application application = this.AFInAppEventType.AFKeystoreWrapper;
                byte[] bArr = new byte[0];
                if (valueOf2 && i <= 2) {
                    ArrayList arrayList = new ArrayList();
                    for (dd ddVar : ac.this.valueOf()) {
                        boolean z = ddVar instanceof cx;
                        int i2 = AnonymousClass9.AFKeystoreWrapper[ddVar.AFInAppEventParameterName.ordinal()];
                        if (i2 == 1) {
                            if (z) {
                                values.put("rfr", ((cx) ddVar).valueOf);
                                ac.AFInAppEventType(application).edit().putBoolean(AppsFlyerProperties.NEW_REFERRER_SENT, true).apply();
                            }
                            arrayList.add(ddVar.AFInAppEventType);
                        } else if (i2 == 2 && i == 2 && !z) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("source", ddVar.AFKeystoreWrapper);
                            hashMap.put("response", "TIMEOUT");
                            hashMap.putAll(new da());
                            arrayList.add(hashMap);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        values.put("referrers", arrayList);
                    }
                    if (ac.AFKeystoreWrapper(ac.this) != null) {
                        values.put("fb_ddl", ac.AFKeystoreWrapper(ac.this));
                    }
                    if (ac.valueOf(ac.this) != null) {
                        if (ac.valueOf(ac.this).AFKeystoreWrapper()) {
                            List<String> values2 = ac.valueOf(ac.this).values();
                            if (values2 != null && !values2.isEmpty()) {
                                values.put("preload_id", values2);
                            }
                        } else {
                            values.put("preload_id", Collections.singletonList(RtspHeaders.Values.TIMEOUT));
                        }
                    }
                }
                if (!(this.AFInAppEventType instanceof ck)) {
                    ca init = ac.values(ac.this).init();
                    values.putAll(new d.C0081d(values, init.AFInAppEventType.values));
                    values.putAll(init.AFInAppEventParameterName());
                }
                try {
                    try {
                        if (this.AFInAppEventType instanceof ck) {
                            str = (String) values.get("af_key");
                        } else {
                            str = (String) values.get("appsflyerKey");
                        }
                        this.AFInAppEventType.AFVersionDeclaration = str;
                        synchronized (values) {
                            try {
                                byte[] bArr2 = (byte[]) ((Class) com.appsflyer.internal.e.AFInAppEventParameterName((ViewConfiguration.getDoubleTapTimeout() >> 16) + 24, KeyEvent.getDeadChar(0, 0) + 48, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 14196))).getMethod("AFInAppEventType", i.class, String.class).invoke(null, this.AFInAppEventType, str);
                                try {
                                    try {
                                        ac acVar = ac.this;
                                        i iVar = this.AFInAppEventType;
                                        iVar.AFLogger$LogLevel = bArr2;
                                        ac.AFInAppEventType(acVar, iVar);
                                        return;
                                    } catch (IOException e) {
                                        iOException = e;
                                        bArr = bArr2;
                                        AFLogger.valueOf("Exception while sending request to server. ", iOException);
                                        if (bArr != null && application != null && !str2.contains("&isCachedRequest=true&timeincache=")) {
                                            ac.this.values().AFVersionDeclaration().AFInAppEventParameterName(new n(str2, bArr, "6.5.4"));
                                            AFLogger.valueOf(iOException.getMessage(), iOException);
                                        }
                                        AppsFlyerRequestListener appsFlyerRequestListener = this.AFInAppEventType.AFInAppEventParameterName;
                                        if (appsFlyerRequestListener != null) {
                                            appsFlyerRequestListener.onError(RequestError.NETWORK_FAILURE, iOException.getMessage());
                                        }
                                        ac acVar2 = ac.this;
                                        i iVar2 = this.AFInAppEventType;
                                        cg.AFInAppEventType(acVar2, iVar2, iVar2.AFVersionDeclaration, application, ac.AFInAppEventType(application), null, iOException);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    bArr = bArr2;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        throw th;
                    } catch (IOException e2) {
                        iOException = e2;
                    }
                } catch (Throwable th3) {
                    AFLogger.AFInAppEventParameterName(th3.getMessage(), th3);
                    AppsFlyerRequestListener appsFlyerRequestListener2 = this.AFInAppEventType.AFInAppEventParameterName;
                    if (appsFlyerRequestListener2 != null) {
                        appsFlyerRequestListener2.onError(RequestError.NETWORK_FAILURE, th3.getMessage());
                    }
                }
            } else {
                AppsFlyerRequestListener appsFlyerRequestListener3 = this.AFInAppEventType.AFInAppEventParameterName;
                if (appsFlyerRequestListener3 != null) {
                    appsFlyerRequestListener3.onError(RequestError.STOP_TRACKING, ba.values);
                }
            }
        }
    }

    /* renamed from: com.appsflyer.internal.ac$9  reason: invalid class name */
    /* loaded from: classes2.dex */
    static /* synthetic */ class AnonymousClass9 {
        static final /* synthetic */ int[] AFKeystoreWrapper;
        static final /* synthetic */ int[] values;

        static {
            int[] iArr = new int[dd.d.values().length];
            AFKeystoreWrapper = iArr;
            try {
                iArr[dd.d.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AFKeystoreWrapper[dd.d.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[AppsFlyerProperties.EmailsCryptType.values().length];
            values = iArr2;
            try {
                iArr2[AppsFlyerProperties.EmailsCryptType.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                values[AppsFlyerProperties.EmailsCryptType.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class e implements Runnable {
        private final Application AFKeystoreWrapper;

        public e(Context context) {
            this.AFKeystoreWrapper = (Application) context.getApplicationContext();
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ac.AFInAppEventType(ac.this)) {
                return;
            }
            ac.this.AFVersionDeclaration = System.currentTimeMillis();
            ac.values(ac.this, true);
            try {
                try {
                    String devKey = AppsFlyerProperties.getInstance().getDevKey();
                    for (n nVar : ac.this.values().AFVersionDeclaration().AFInAppEventType()) {
                        StringBuilder sb = new StringBuilder("resending request: ");
                        sb.append(nVar.valueOf);
                        AFLogger.values(sb.toString());
                        try {
                            long currentTimeMillis = System.currentTimeMillis();
                            long parseLong = Long.parseLong(nVar.AFInAppEventParameterName, 10);
                            ac acVar = ac.this;
                            cn cnVar = new cn();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(nVar.valueOf);
                            sb2.append("&isCachedRequest=true&timeincache=");
                            sb2.append((currentTimeMillis - parseLong) / 1000);
                            i AFInAppEventType = cnVar.AFInAppEventType(sb2.toString());
                            AFInAppEventType.AFLogger$LogLevel = nVar.AFInAppEventParameterName();
                            AFInAppEventType.AFVersionDeclaration = devKey;
                            Application application = this.AFKeystoreWrapper;
                            if (application != null) {
                                AFInAppEventType.AFKeystoreWrapper = (Application) application.getApplicationContext();
                            }
                            AFInAppEventType.init = nVar.AFInAppEventParameterName;
                            ac.AFInAppEventType(acVar, AFInAppEventType);
                        } catch (Exception e) {
                            AFLogger.valueOf("Failed to resend cached request", e);
                        }
                    }
                } catch (Exception e2) {
                    AFLogger.valueOf("failed to check cache. ", e2);
                }
                ac.values(ac.this, false);
                ac.getLevel(ac.this).shutdown();
                ac.AFInAppEventParameterName(ac.this, (ScheduledExecutorService) null);
            } catch (Throwable th) {
                ac.values(ac.this, false);
                throw th;
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void performOnDeepLinking(final Intent intent, Context context) {
        int i = setCustomerIdAndLogSession;
        int i2 = i + 33;
        waitForCustomerUserId = i2 % 128;
        int i3 = i2 % 2;
        if (intent == null) {
            int i4 = i + 65;
            waitForCustomerUserId = i4 % 128;
            int i5 = i4 % 2;
            ao.AFInAppEventType("performOnDeepLinking was called with null intent", DeepLinkResult.Error.DEVELOPER_ERROR);
        } else if (context == null) {
            int i6 = i + 95;
            waitForCustomerUserId = i6 % 128;
            int i7 = i6 % 2;
            ao.AFInAppEventType("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
        } else {
            final Context applicationContext = context.getApplicationContext();
            bf bfVar = this.setCustomerUserId;
            if ((applicationContext != null ? (char) 3 : 'J') != 'J') {
                int i8 = waitForCustomerUserId + 113;
                setCustomerIdAndLogSession = i8 % 128;
                int i9 = i8 % 2;
                be beVar = bfVar.AFKeystoreWrapper;
                if (!(applicationContext == null)) {
                    int i10 = setCustomerIdAndLogSession + 67;
                    waitForCustomerUserId = i10 % 128;
                    if (i10 % 2 != 0) {
                        beVar.values = applicationContext.getApplicationContext();
                        int i11 = 59 / 0;
                    } else {
                        beVar.values = applicationContext.getApplicationContext();
                    }
                    int i12 = waitForCustomerUserId + 5;
                    setCustomerIdAndLogSession = i12 % 128;
                    int i13 = i12 % 2;
                }
            }
            final cl level = values().getLevel();
            this.setOaidData.execute(new Runnable() { // from class: com.appsflyer.internal.ac.4
                @Override // java.lang.Runnable
                public final void run() {
                    f.valueOf();
                    Intent intent2 = intent;
                    Context context2 = applicationContext;
                    cl clVar = level;
                    Context context3 = ac.values(ac.this).AFKeystoreWrapper.values;
                    if (context3 != null) {
                        bc bcVar = new bc(ac.AFInAppEventType(context3));
                        Uri AFKeystoreWrapper2 = f.AFKeystoreWrapper(intent2);
                        boolean z = (AFKeystoreWrapper2 == null || AFKeystoreWrapper2.toString().isEmpty()) ? false : true;
                        if (ac.AFInAppEventType(context2).getBoolean("ddl_sent", false) && !z) {
                            ao.AFInAppEventType("No direct deep link", null);
                            return;
                        } else {
                            f.valueOf().valueOf(new HashMap(), clVar, intent2, bcVar, context2);
                            return;
                        }
                    }
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
            });
            int i14 = waitForCustomerUserId + 1;
            setCustomerIdAndLogSession = i14 % 128;
            int i15 = i14 % 2;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map, AppsFlyerRequestListener appsFlyerRequestListener) {
        HashMap hashMap = map == null ? null : new HashMap(map);
        bf bfVar = this.setCustomerUserId;
        if (context != null) {
            be beVar = bfVar.AFKeystoreWrapper;
            if (context != null) {
                beVar.values = context.getApplicationContext();
            }
        }
        co coVar = new co();
        if (context != null) {
            coVar.AFKeystoreWrapper = (Application) context.getApplicationContext();
        }
        coVar.getLevel = str;
        coVar.AFInAppEventParameterName = appsFlyerRequestListener;
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
                AFLogger.valueOf("Parsing failed due to invalid input in 'af_touch_obj'.");
            }
            Map<String, ?> singletonMap = Collections.singletonMap("tch_data", hashMap2);
            hashMap.remove(AFInAppEventParameterName.TOUCH_OBJ);
            coVar.AFInAppEventParameterName(singletonMap);
        }
        coVar.values = hashMap;
        ak AppsFlyer2dXConversionCallback = values().AppsFlyer2dXConversionCallback();
        String[] strArr = new String[2];
        strArr[0] = str;
        strArr[1] = new JSONObject((Map<?, ?>) (coVar.values == null ? new HashMap() : coVar.values)).toString();
        AppsFlyer2dXConversionCallback.AFKeystoreWrapper("logEvent", strArr);
        if (str != null) {
            w.AFKeystoreWrapper(context).AFInAppEventType();
        } else {
            AFInAppEventParameterName(context, ch.logEvent);
        }
        AFKeystoreWrapper(coVar, context instanceof Activity ? (Activity) context : null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r6 != null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
        r1 = r1 + 65;
        com.appsflyer.internal.ac.waitForCustomerUserId = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
        if ((r1 % 2) == 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        if (r2 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
        r0 = r0.AFKeystoreWrapper;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
        if (r6 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
        r2 = '+';
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
        r2 = 22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
        if (r2 == '+') goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:
        r0.values = r6.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
        r6 = r0.AFKeystoreWrapper;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
        r0 = new com.appsflyer.internal.ck();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004b, code lost:
        if (r6 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004d, code lost:
        r1 = com.appsflyer.internal.ac.setCustomerIdAndLogSession + 29;
        com.appsflyer.internal.ac.waitForCustomerUserId = r1 % 128;
        r1 = r1 % 2;
        r0.AFKeystoreWrapper = (android.app.Application) r6.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
        r0.values = r7;
        AFKeystoreWrapper(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0064, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
        if ((r6 != null ? '`' : 'R') != '`') goto L20;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void sendAdRevenue(Context context, Map<String, Object> map) {
        bf bfVar;
        int i = waitForCustomerUserId + 35;
        int i2 = i % 128;
        setCustomerIdAndLogSession = i2;
        boolean z = false;
        if (i % 2 == 0) {
            bfVar = this.setCustomerUserId;
            int i3 = 18 / 0;
        } else {
            bfVar = this.setCustomerUserId;
        }
    }

    private void AFKeystoreWrapper(i iVar) {
        Application application = iVar.AFKeystoreWrapper;
        String format = String.format(onInstallConversionFailureNative, AppsFlyerLib.getInstance().getHostPrefix(), AFInAppEventParameterName().getHostName());
        StringBuilder sb = new StringBuilder();
        sb.append(format);
        sb.append(application.getPackageName());
        String obj = sb.toString();
        SharedPreferences AFInAppEventType2 = AFInAppEventType(application);
        int valueOf2 = valueOf(AFInAppEventType2, false);
        int valueOf3 = valueOf(AFInAppEventType2);
        HashMap hashMap = new HashMap();
        hashMap.put("ad_network", iVar.values);
        hashMap.put("adrevenue_counter", Integer.valueOf(valueOf3));
        String devKey = AppsFlyerProperties.getInstance().getDevKey();
        hashMap.put("af_key", devKey);
        hashMap.put("launch_counter", Integer.valueOf(valueOf2));
        hashMap.put(values("ᳲ洀Ｆ䤸\udb2e┷띈œ鍏ᵯ潬磻", 29172 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern(), Long.toString(new Date().getTime()));
        hashMap.put("uid", af.valueOf(new WeakReference(application)));
        String string = AppsFlyerProperties.getInstance().getString("advertiserId");
        String string2 = AppsFlyerProperties.getInstance().getString("advertiserIdEnabled");
        if (!(string2 == null)) {
            int i = waitForCustomerUserId + 115;
            setCustomerIdAndLogSession = i % 128;
            int i2 = i % 2;
            hashMap.put("advertiserIdEnabled", string2);
        }
        if (string != null) {
            hashMap.put("advertiserId", string);
        }
        valueOf(application, hashMap);
        hashMap.put("device", Build.DEVICE);
        values(application, hashMap);
        try {
            PackageInfo packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
            hashMap.put("app_version_code", Integer.toString(packageInfo.versionCode));
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            hashMap.put("install_date", valueOf(simpleDateFormat, packageInfo.firstInstallTime));
            String string3 = AFInAppEventType2.getString("appsFlyerFirstInstall", null);
            if (!(string3 != null)) {
                int i3 = setCustomerIdAndLogSession + 119;
                waitForCustomerUserId = i3 % 128;
                int i4 = i3 % 2;
                string3 = AFInAppEventType(simpleDateFormat, application);
            }
            hashMap.put("first_launch_date", string3);
        } catch (Throwable th) {
            AFLogger.valueOf("AdRevenue - Exception while collecting app version data ", th);
        }
        i valueOf4 = iVar.AFInAppEventType(obj).AFInAppEventParameterName(hashMap).valueOf(valueOf2);
        valueOf4.AFVersionDeclaration = devKey;
        d dVar = new d(this, valueOf4, (byte) 0);
        if (k.values == null) {
            k.values = new k();
        }
        valueOf(k.values.AFKeystoreWrapper(), dVar, 1L, TimeUnit.MILLISECONDS);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void AFKeystoreWrapper(i iVar, Activity activity) {
        String str;
        Uri AFKeystoreWrapper2;
        Application application = iVar.AFKeystoreWrapper;
        String str2 = "";
        if (activity != null) {
            int i = waitForCustomerUserId + 35;
            setCustomerIdAndLogSession = i % 128;
            int i2 = i % 2;
            if (!(activity.getIntent() == null) && (AFKeystoreWrapper2 = ap.AFKeystoreWrapper(activity)) != null) {
                int i3 = setCustomerIdAndLogSession + 117;
                waitForCustomerUserId = i3 % 128;
                int i4 = i3 % 2;
                str = AFKeystoreWrapper2.toString();
                if (!(AppsFlyerProperties.getInstance().getDevKey() == null)) {
                    AFLogger.AppsFlyer2dXConversionCallback("[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
                    AppsFlyerRequestListener appsFlyerRequestListener = iVar.AFInAppEventParameterName;
                    if (appsFlyerRequestListener != null) {
                        appsFlyerRequestListener.onError(RequestError.NO_DEV_KEY, ba.AFInAppEventParameterName);
                    }
                    int i5 = setCustomerIdAndLogSession + 97;
                    waitForCustomerUserId = i5 % 128;
                    int i6 = i5 % 2;
                    return;
                }
                String referrer = AppsFlyerProperties.getInstance().getReferrer(application);
                if ((referrer == null ? '.' : AbstractJsonLexerKt.COLON) != '.') {
                    int i7 = waitForCustomerUserId + 97;
                    setCustomerIdAndLogSession = i7 % 128;
                    int i8 = i7 % 2;
                    str2 = referrer;
                }
                iVar.AppsFlyer2dXConversionCallback = str2;
                iVar.valueOf = str;
                values(iVar);
                return;
            }
        }
        str = "";
        if (!(AppsFlyerProperties.getInstance().getDevKey() == null)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0037, code lost:
        if (com.appsflyer.AppsFlyerProperties.getInstance().getBoolean(com.appsflyer.AppsFlyerProperties.LAUNCH_PROTECT_ENABLED, true) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0046, code lost:
        if ((com.appsflyer.AppsFlyerProperties.getInstance().getBoolean(com.appsflyer.AppsFlyerProperties.LAUNCH_PROTECT_ENABLED, true)) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
        if (getLevel() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004e, code lost:
        r0 = com.appsflyer.internal.ac.setCustomerIdAndLogSession + 79;
        com.appsflyer.internal.ac.waitForCustomerUserId = r0 % 128;
        r0 = r0 % 2;
        r6 = r6.AFInAppEventParameterName;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
        if (r6 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005e, code lost:
        r1 = ')';
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0060, code lost:
        r1 = 22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
        if (r1 == ')') goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0065, code lost:
        r6.onError(com.appsflyer.attribution.RequestError.EVENT_TIMEOUT, com.appsflyer.internal.ba.valueOf);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006c, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006d, code lost:
        com.appsflyer.AFLogger.values("Allowing multiple launches within a 5 second time window.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void values(i iVar) {
        boolean z = iVar.getLevel == null;
        if (AFKeystoreWrapper()) {
            AFLogger.values("CustomerUserId not set, reporting is disabled", true);
            return;
        }
        if (z) {
            int i = setCustomerIdAndLogSession + 43;
            waitForCustomerUserId = i % 128;
            if (!(i % 2 == 0)) {
            }
            this.onAppOpenAttribution = System.currentTimeMillis();
            int i2 = waitForCustomerUserId + 101;
            setCustomerIdAndLogSession = i2 % 128;
            int i3 = i2 % 2;
        }
        if (k.values == null) {
            k.values = new k();
        }
        valueOf(k.values.AFKeystoreWrapper(), new b(this, iVar, (byte) 0), 0L, TimeUnit.MILLISECONDS);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void valueOf(i iVar) {
        String format;
        String AFInAppEventParameterName2;
        boolean z;
        ScheduledExecutorService scheduledExecutorService;
        long j;
        dd[] valueOf2;
        Application application = iVar.AFKeystoreWrapper;
        if (application == null) {
            AFLogger.AFInAppEventParameterName("sendWithEvent - got null context. skipping event/launch.");
            return;
        }
        SharedPreferences AFInAppEventType2 = AFInAppEventType(application);
        AppsFlyerProperties.getInstance().saveProperties(AFInAppEventType2);
        if (!isStopped()) {
            StringBuilder sb = new StringBuilder("sendWithEvent from activity: ");
            sb.append(application.getClass().getName());
            AFLogger.values(sb.toString());
        }
        boolean valueOf3 = iVar.valueOf();
        boolean z2 = iVar instanceof cq;
        boolean z3 = iVar instanceof ci;
        Map<String, ?> AFInAppEventType3 = AFInAppEventType(iVar);
        String str = (String) AFInAppEventType3.get("appsflyerKey");
        if (str == null || str.length() == 0) {
            AFLogger.AFInAppEventParameterName("Not sending data yet, waiting for dev key");
            AppsFlyerRequestListener appsFlyerRequestListener = iVar.AFInAppEventParameterName;
            if (appsFlyerRequestListener != null) {
                int i = setCustomerIdAndLogSession + 81;
                waitForCustomerUserId = i % 128;
                int i2 = i % 2;
                appsFlyerRequestListener.onError(RequestError.NO_DEV_KEY, ba.AFInAppEventParameterName);
                return;
            }
            return;
        }
        if (!isStopped()) {
            AFLogger.values("AppsFlyerLib.sendWithEvent");
        }
        int valueOf4 = valueOf(AFInAppEventType2, false);
        if (!z3) {
            int i3 = waitForCustomerUserId + 123;
            setCustomerIdAndLogSession = i3 % 128;
            if ((i3 % 2 == 0 ? '^' : '-') != '-') {
                throw null;
            }
            if (!z2) {
                format = valueOf3 ? valueOf4 < 2 ? String.format(onDeepLinkingNative, AppsFlyerLib.getInstance().getHostPrefix(), AFInAppEventParameterName().getHostName()) : String.format(onAppOpenAttributionNative, AppsFlyerLib.getInstance().getHostPrefix(), AFInAppEventParameterName().getHostName()) : String.format(onAttributionFailureNative, AppsFlyerLib.getInstance().getHostPrefix(), AFInAppEventParameterName().getHostName());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(format);
                sb2.append(application.getPackageName());
                String obj = sb2.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(obj);
                sb3.append("&buildnumber=6.5.4");
                String obj2 = sb3.toString();
                AFInAppEventParameterName2 = AFInAppEventParameterName(application);
                if (AFInAppEventParameterName2 != null) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(obj2);
                    sb4.append("&channel=");
                    sb4.append(AFInAppEventParameterName2);
                    obj2 = sb4.toString();
                }
                AFInAppEventParameterName(AFInAppEventType3);
                d dVar = new d(this, iVar.AFInAppEventType(obj2).AFInAppEventParameterName(AFInAppEventType3).valueOf(valueOf4), (byte) 0);
                if (valueOf3) {
                    z = false;
                } else {
                    z = false;
                    for (dd ddVar : valueOf()) {
                        if (ddVar.AFInAppEventParameterName == dd.d.STARTED) {
                            StringBuilder sb5 = new StringBuilder("Failed to get ");
                            sb5.append(ddVar.AFKeystoreWrapper);
                            sb5.append(" referrer, wait ...");
                            AFLogger.AFInAppEventParameterName(sb5.toString());
                            z = true;
                        }
                    }
                    if (this.setDebugLog && !AFLogger$LogLevel()) {
                        AFLogger.AFInAppEventParameterName("fetching Facebook deferred AppLink data, wait ...");
                        z = true;
                    }
                    if (this.setCustomerUserId.init().AFInAppEventType()) {
                        int i4 = setCustomerIdAndLogSession + 21;
                        waitForCustomerUserId = i4 % 128;
                        int i5 = i4 % 2;
                        z = true;
                    }
                }
                if (f.AFInAppEventParameterName ? false : true) {
                    AFLogger.AFKeystoreWrapper("ESP deeplink: execute launch on SerialExecutor");
                    if (k.values == null) {
                        k.values = new k();
                        int i6 = setCustomerIdAndLogSession + 77;
                        waitForCustomerUserId = i6 % 128;
                        int i7 = i6 % 2;
                    }
                    k kVar = k.values;
                    if (kVar.valueOf == null) {
                        int i8 = waitForCustomerUserId + 75;
                        setCustomerIdAndLogSession = i8 % 128;
                        int i9 = i8 % 2;
                        kVar.valueOf = Executors.newSingleThreadScheduledExecutor(kVar.AFInAppEventType);
                    }
                    scheduledExecutorService = kVar.valueOf;
                } else {
                    if (k.values == null) {
                        k.values = new k();
                    }
                    scheduledExecutorService = k.values.AFKeystoreWrapper();
                }
                if (z) {
                    j = 0;
                } else {
                    int i10 = setCustomerIdAndLogSession + 99;
                    waitForCustomerUserId = i10 % 128;
                    int i11 = i10 % 2;
                    j = 500;
                }
                valueOf(scheduledExecutorService, dVar, j, TimeUnit.MILLISECONDS);
            }
        }
        format = String.format(onResponseErrorNative, AppsFlyerLib.getInstance().getHostPrefix(), AFInAppEventParameterName().getHostName());
        StringBuilder sb22 = new StringBuilder();
        sb22.append(format);
        sb22.append(application.getPackageName());
        String obj3 = sb22.toString();
        StringBuilder sb32 = new StringBuilder();
        sb32.append(obj3);
        sb32.append("&buildnumber=6.5.4");
        String obj22 = sb32.toString();
        AFInAppEventParameterName2 = AFInAppEventParameterName(application);
        if (AFInAppEventParameterName2 != null) {
        }
        AFInAppEventParameterName(AFInAppEventType3);
        d dVar2 = new d(this, iVar.AFInAppEventType(obj22).AFInAppEventParameterName(AFInAppEventType3).valueOf(valueOf4), (byte) 0);
        if (valueOf3) {
        }
        if (f.AFInAppEventParameterName ? false : true) {
        }
        if (z) {
        }
        valueOf(scheduledExecutorService, dVar2, j, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0578 A[Catch: all -> 0x07e0, TryCatch #16 {all -> 0x07e0, blocks: (B:15:0x00ae, B:17:0x00b4, B:21:0x00c1, B:23:0x00d1, B:24:0x00d9, B:26:0x00ec, B:31:0x0104, B:33:0x0120, B:34:0x0125, B:36:0x012d, B:37:0x0132, B:39:0x013a, B:44:0x0147, B:46:0x01ba, B:48:0x01c0, B:50:0x01c6, B:51:0x01d3, B:53:0x01e0, B:55:0x01e7, B:56:0x01ef, B:58:0x01f5, B:59:0x01fc, B:61:0x0214, B:62:0x0219, B:65:0x0221, B:66:0x0224, B:68:0x022b, B:69:0x022e, B:71:0x0238, B:73:0x023e, B:74:0x0241, B:76:0x0249, B:77:0x0252, B:82:0x0269, B:84:0x0274, B:87:0x027e, B:88:0x0283, B:90:0x028b, B:92:0x029f, B:95:0x02af, B:97:0x02b9, B:98:0x02c3, B:100:0x02cb, B:101:0x02d0, B:103:0x02de, B:108:0x02eb, B:110:0x02f1, B:112:0x02f7, B:113:0x02fa, B:115:0x0304, B:119:0x030e, B:120:0x0313, B:122:0x0319, B:123:0x0322, B:125:0x0328, B:126:0x0331, B:128:0x0337, B:131:0x0344, B:133:0x034a, B:139:0x0361, B:141:0x0367, B:142:0x036c, B:144:0x0375, B:149:0x0391, B:150:0x039d, B:152:0x03a3, B:153:0x03ac, B:155:0x03b4, B:157:0x03bb, B:158:0x03d1, B:159:0x03d6, B:161:0x03de, B:162:0x03e3, B:172:0x0419, B:173:0x041e, B:174:0x0421, B:176:0x042c, B:181:0x044a, B:185:0x045a, B:186:0x045f, B:190:0x046f, B:191:0x0474, B:195:0x0484, B:196:0x0489, B:197:0x04a0, B:223:0x055b, B:225:0x0578, B:227:0x0582, B:229:0x0586, B:231:0x058e, B:232:0x0594, B:233:0x05aa, B:235:0x05b6, B:238:0x05cb, B:240:0x05dd, B:239:0x05d8, B:245:0x05f8, B:247:0x05fe, B:251:0x060c, B:252:0x0613, B:254:0x061d, B:255:0x062f, B:259:0x0650, B:261:0x065d, B:280:0x06c8, B:282:0x06ce, B:284:0x06d5, B:288:0x06e0, B:290:0x071b, B:291:0x0729, B:293:0x07c9, B:295:0x07cd, B:267:0x066e, B:269:0x067d, B:270:0x0680, B:271:0x0686, B:273:0x0697, B:274:0x06a1, B:276:0x06b5, B:277:0x06b8, B:279:0x06c5, B:244:0x05e3, B:222:0x0556, B:201:0x04bb, B:180:0x0435, B:170:0x0411, B:145:0x037c, B:147:0x0385, B:134:0x034e, B:136:0x0358, B:138:0x035e, B:296:0x07d4, B:107:0x02e6, B:81:0x025b, B:91:0x029c, B:43:0x0142, B:30:0x00ff, B:22:0x00cc, B:164:0x03f9), top: B:330:0x00ae }] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0582 A[Catch: all -> 0x07e0, TryCatch #16 {all -> 0x07e0, blocks: (B:15:0x00ae, B:17:0x00b4, B:21:0x00c1, B:23:0x00d1, B:24:0x00d9, B:26:0x00ec, B:31:0x0104, B:33:0x0120, B:34:0x0125, B:36:0x012d, B:37:0x0132, B:39:0x013a, B:44:0x0147, B:46:0x01ba, B:48:0x01c0, B:50:0x01c6, B:51:0x01d3, B:53:0x01e0, B:55:0x01e7, B:56:0x01ef, B:58:0x01f5, B:59:0x01fc, B:61:0x0214, B:62:0x0219, B:65:0x0221, B:66:0x0224, B:68:0x022b, B:69:0x022e, B:71:0x0238, B:73:0x023e, B:74:0x0241, B:76:0x0249, B:77:0x0252, B:82:0x0269, B:84:0x0274, B:87:0x027e, B:88:0x0283, B:90:0x028b, B:92:0x029f, B:95:0x02af, B:97:0x02b9, B:98:0x02c3, B:100:0x02cb, B:101:0x02d0, B:103:0x02de, B:108:0x02eb, B:110:0x02f1, B:112:0x02f7, B:113:0x02fa, B:115:0x0304, B:119:0x030e, B:120:0x0313, B:122:0x0319, B:123:0x0322, B:125:0x0328, B:126:0x0331, B:128:0x0337, B:131:0x0344, B:133:0x034a, B:139:0x0361, B:141:0x0367, B:142:0x036c, B:144:0x0375, B:149:0x0391, B:150:0x039d, B:152:0x03a3, B:153:0x03ac, B:155:0x03b4, B:157:0x03bb, B:158:0x03d1, B:159:0x03d6, B:161:0x03de, B:162:0x03e3, B:172:0x0419, B:173:0x041e, B:174:0x0421, B:176:0x042c, B:181:0x044a, B:185:0x045a, B:186:0x045f, B:190:0x046f, B:191:0x0474, B:195:0x0484, B:196:0x0489, B:197:0x04a0, B:223:0x055b, B:225:0x0578, B:227:0x0582, B:229:0x0586, B:231:0x058e, B:232:0x0594, B:233:0x05aa, B:235:0x05b6, B:238:0x05cb, B:240:0x05dd, B:239:0x05d8, B:245:0x05f8, B:247:0x05fe, B:251:0x060c, B:252:0x0613, B:254:0x061d, B:255:0x062f, B:259:0x0650, B:261:0x065d, B:280:0x06c8, B:282:0x06ce, B:284:0x06d5, B:288:0x06e0, B:290:0x071b, B:291:0x0729, B:293:0x07c9, B:295:0x07cd, B:267:0x066e, B:269:0x067d, B:270:0x0680, B:271:0x0686, B:273:0x0697, B:274:0x06a1, B:276:0x06b5, B:277:0x06b8, B:279:0x06c5, B:244:0x05e3, B:222:0x0556, B:201:0x04bb, B:180:0x0435, B:170:0x0411, B:145:0x037c, B:147:0x0385, B:134:0x034e, B:136:0x0358, B:138:0x035e, B:296:0x07d4, B:107:0x02e6, B:81:0x025b, B:91:0x029c, B:43:0x0142, B:30:0x00ff, B:22:0x00cc, B:164:0x03f9), top: B:330:0x00ae }] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x05fe A[Catch: all -> 0x07e0, TryCatch #16 {all -> 0x07e0, blocks: (B:15:0x00ae, B:17:0x00b4, B:21:0x00c1, B:23:0x00d1, B:24:0x00d9, B:26:0x00ec, B:31:0x0104, B:33:0x0120, B:34:0x0125, B:36:0x012d, B:37:0x0132, B:39:0x013a, B:44:0x0147, B:46:0x01ba, B:48:0x01c0, B:50:0x01c6, B:51:0x01d3, B:53:0x01e0, B:55:0x01e7, B:56:0x01ef, B:58:0x01f5, B:59:0x01fc, B:61:0x0214, B:62:0x0219, B:65:0x0221, B:66:0x0224, B:68:0x022b, B:69:0x022e, B:71:0x0238, B:73:0x023e, B:74:0x0241, B:76:0x0249, B:77:0x0252, B:82:0x0269, B:84:0x0274, B:87:0x027e, B:88:0x0283, B:90:0x028b, B:92:0x029f, B:95:0x02af, B:97:0x02b9, B:98:0x02c3, B:100:0x02cb, B:101:0x02d0, B:103:0x02de, B:108:0x02eb, B:110:0x02f1, B:112:0x02f7, B:113:0x02fa, B:115:0x0304, B:119:0x030e, B:120:0x0313, B:122:0x0319, B:123:0x0322, B:125:0x0328, B:126:0x0331, B:128:0x0337, B:131:0x0344, B:133:0x034a, B:139:0x0361, B:141:0x0367, B:142:0x036c, B:144:0x0375, B:149:0x0391, B:150:0x039d, B:152:0x03a3, B:153:0x03ac, B:155:0x03b4, B:157:0x03bb, B:158:0x03d1, B:159:0x03d6, B:161:0x03de, B:162:0x03e3, B:172:0x0419, B:173:0x041e, B:174:0x0421, B:176:0x042c, B:181:0x044a, B:185:0x045a, B:186:0x045f, B:190:0x046f, B:191:0x0474, B:195:0x0484, B:196:0x0489, B:197:0x04a0, B:223:0x055b, B:225:0x0578, B:227:0x0582, B:229:0x0586, B:231:0x058e, B:232:0x0594, B:233:0x05aa, B:235:0x05b6, B:238:0x05cb, B:240:0x05dd, B:239:0x05d8, B:245:0x05f8, B:247:0x05fe, B:251:0x060c, B:252:0x0613, B:254:0x061d, B:255:0x062f, B:259:0x0650, B:261:0x065d, B:280:0x06c8, B:282:0x06ce, B:284:0x06d5, B:288:0x06e0, B:290:0x071b, B:291:0x0729, B:293:0x07c9, B:295:0x07cd, B:267:0x066e, B:269:0x067d, B:270:0x0680, B:271:0x0686, B:273:0x0697, B:274:0x06a1, B:276:0x06b5, B:277:0x06b8, B:279:0x06c5, B:244:0x05e3, B:222:0x0556, B:201:0x04bb, B:180:0x0435, B:170:0x0411, B:145:0x037c, B:147:0x0385, B:134:0x034e, B:136:0x0358, B:138:0x035e, B:296:0x07d4, B:107:0x02e6, B:81:0x025b, B:91:0x029c, B:43:0x0142, B:30:0x00ff, B:22:0x00cc, B:164:0x03f9), top: B:330:0x00ae }] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x061d A[Catch: all -> 0x07e0, TryCatch #16 {all -> 0x07e0, blocks: (B:15:0x00ae, B:17:0x00b4, B:21:0x00c1, B:23:0x00d1, B:24:0x00d9, B:26:0x00ec, B:31:0x0104, B:33:0x0120, B:34:0x0125, B:36:0x012d, B:37:0x0132, B:39:0x013a, B:44:0x0147, B:46:0x01ba, B:48:0x01c0, B:50:0x01c6, B:51:0x01d3, B:53:0x01e0, B:55:0x01e7, B:56:0x01ef, B:58:0x01f5, B:59:0x01fc, B:61:0x0214, B:62:0x0219, B:65:0x0221, B:66:0x0224, B:68:0x022b, B:69:0x022e, B:71:0x0238, B:73:0x023e, B:74:0x0241, B:76:0x0249, B:77:0x0252, B:82:0x0269, B:84:0x0274, B:87:0x027e, B:88:0x0283, B:90:0x028b, B:92:0x029f, B:95:0x02af, B:97:0x02b9, B:98:0x02c3, B:100:0x02cb, B:101:0x02d0, B:103:0x02de, B:108:0x02eb, B:110:0x02f1, B:112:0x02f7, B:113:0x02fa, B:115:0x0304, B:119:0x030e, B:120:0x0313, B:122:0x0319, B:123:0x0322, B:125:0x0328, B:126:0x0331, B:128:0x0337, B:131:0x0344, B:133:0x034a, B:139:0x0361, B:141:0x0367, B:142:0x036c, B:144:0x0375, B:149:0x0391, B:150:0x039d, B:152:0x03a3, B:153:0x03ac, B:155:0x03b4, B:157:0x03bb, B:158:0x03d1, B:159:0x03d6, B:161:0x03de, B:162:0x03e3, B:172:0x0419, B:173:0x041e, B:174:0x0421, B:176:0x042c, B:181:0x044a, B:185:0x045a, B:186:0x045f, B:190:0x046f, B:191:0x0474, B:195:0x0484, B:196:0x0489, B:197:0x04a0, B:223:0x055b, B:225:0x0578, B:227:0x0582, B:229:0x0586, B:231:0x058e, B:232:0x0594, B:233:0x05aa, B:235:0x05b6, B:238:0x05cb, B:240:0x05dd, B:239:0x05d8, B:245:0x05f8, B:247:0x05fe, B:251:0x060c, B:252:0x0613, B:254:0x061d, B:255:0x062f, B:259:0x0650, B:261:0x065d, B:280:0x06c8, B:282:0x06ce, B:284:0x06d5, B:288:0x06e0, B:290:0x071b, B:291:0x0729, B:293:0x07c9, B:295:0x07cd, B:267:0x066e, B:269:0x067d, B:270:0x0680, B:271:0x0686, B:273:0x0697, B:274:0x06a1, B:276:0x06b5, B:277:0x06b8, B:279:0x06c5, B:244:0x05e3, B:222:0x0556, B:201:0x04bb, B:180:0x0435, B:170:0x0411, B:145:0x037c, B:147:0x0385, B:134:0x034e, B:136:0x0358, B:138:0x035e, B:296:0x07d4, B:107:0x02e6, B:81:0x025b, B:91:0x029c, B:43:0x0142, B:30:0x00ff, B:22:0x00cc, B:164:0x03f9), top: B:330:0x00ae }] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x065d A[Catch: all -> 0x07e0, TRY_LEAVE, TryCatch #16 {all -> 0x07e0, blocks: (B:15:0x00ae, B:17:0x00b4, B:21:0x00c1, B:23:0x00d1, B:24:0x00d9, B:26:0x00ec, B:31:0x0104, B:33:0x0120, B:34:0x0125, B:36:0x012d, B:37:0x0132, B:39:0x013a, B:44:0x0147, B:46:0x01ba, B:48:0x01c0, B:50:0x01c6, B:51:0x01d3, B:53:0x01e0, B:55:0x01e7, B:56:0x01ef, B:58:0x01f5, B:59:0x01fc, B:61:0x0214, B:62:0x0219, B:65:0x0221, B:66:0x0224, B:68:0x022b, B:69:0x022e, B:71:0x0238, B:73:0x023e, B:74:0x0241, B:76:0x0249, B:77:0x0252, B:82:0x0269, B:84:0x0274, B:87:0x027e, B:88:0x0283, B:90:0x028b, B:92:0x029f, B:95:0x02af, B:97:0x02b9, B:98:0x02c3, B:100:0x02cb, B:101:0x02d0, B:103:0x02de, B:108:0x02eb, B:110:0x02f1, B:112:0x02f7, B:113:0x02fa, B:115:0x0304, B:119:0x030e, B:120:0x0313, B:122:0x0319, B:123:0x0322, B:125:0x0328, B:126:0x0331, B:128:0x0337, B:131:0x0344, B:133:0x034a, B:139:0x0361, B:141:0x0367, B:142:0x036c, B:144:0x0375, B:149:0x0391, B:150:0x039d, B:152:0x03a3, B:153:0x03ac, B:155:0x03b4, B:157:0x03bb, B:158:0x03d1, B:159:0x03d6, B:161:0x03de, B:162:0x03e3, B:172:0x0419, B:173:0x041e, B:174:0x0421, B:176:0x042c, B:181:0x044a, B:185:0x045a, B:186:0x045f, B:190:0x046f, B:191:0x0474, B:195:0x0484, B:196:0x0489, B:197:0x04a0, B:223:0x055b, B:225:0x0578, B:227:0x0582, B:229:0x0586, B:231:0x058e, B:232:0x0594, B:233:0x05aa, B:235:0x05b6, B:238:0x05cb, B:240:0x05dd, B:239:0x05d8, B:245:0x05f8, B:247:0x05fe, B:251:0x060c, B:252:0x0613, B:254:0x061d, B:255:0x062f, B:259:0x0650, B:261:0x065d, B:280:0x06c8, B:282:0x06ce, B:284:0x06d5, B:288:0x06e0, B:290:0x071b, B:291:0x0729, B:293:0x07c9, B:295:0x07cd, B:267:0x066e, B:269:0x067d, B:270:0x0680, B:271:0x0686, B:273:0x0697, B:274:0x06a1, B:276:0x06b5, B:277:0x06b8, B:279:0x06c5, B:244:0x05e3, B:222:0x0556, B:201:0x04bb, B:180:0x0435, B:170:0x0411, B:145:0x037c, B:147:0x0385, B:134:0x034e, B:136:0x0358, B:138:0x035e, B:296:0x07d4, B:107:0x02e6, B:81:0x025b, B:91:0x029c, B:43:0x0142, B:30:0x00ff, B:22:0x00cc, B:164:0x03f9), top: B:330:0x00ae }] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x06dd  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x06df  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x071b A[Catch: all -> 0x07e0, TryCatch #16 {all -> 0x07e0, blocks: (B:15:0x00ae, B:17:0x00b4, B:21:0x00c1, B:23:0x00d1, B:24:0x00d9, B:26:0x00ec, B:31:0x0104, B:33:0x0120, B:34:0x0125, B:36:0x012d, B:37:0x0132, B:39:0x013a, B:44:0x0147, B:46:0x01ba, B:48:0x01c0, B:50:0x01c6, B:51:0x01d3, B:53:0x01e0, B:55:0x01e7, B:56:0x01ef, B:58:0x01f5, B:59:0x01fc, B:61:0x0214, B:62:0x0219, B:65:0x0221, B:66:0x0224, B:68:0x022b, B:69:0x022e, B:71:0x0238, B:73:0x023e, B:74:0x0241, B:76:0x0249, B:77:0x0252, B:82:0x0269, B:84:0x0274, B:87:0x027e, B:88:0x0283, B:90:0x028b, B:92:0x029f, B:95:0x02af, B:97:0x02b9, B:98:0x02c3, B:100:0x02cb, B:101:0x02d0, B:103:0x02de, B:108:0x02eb, B:110:0x02f1, B:112:0x02f7, B:113:0x02fa, B:115:0x0304, B:119:0x030e, B:120:0x0313, B:122:0x0319, B:123:0x0322, B:125:0x0328, B:126:0x0331, B:128:0x0337, B:131:0x0344, B:133:0x034a, B:139:0x0361, B:141:0x0367, B:142:0x036c, B:144:0x0375, B:149:0x0391, B:150:0x039d, B:152:0x03a3, B:153:0x03ac, B:155:0x03b4, B:157:0x03bb, B:158:0x03d1, B:159:0x03d6, B:161:0x03de, B:162:0x03e3, B:172:0x0419, B:173:0x041e, B:174:0x0421, B:176:0x042c, B:181:0x044a, B:185:0x045a, B:186:0x045f, B:190:0x046f, B:191:0x0474, B:195:0x0484, B:196:0x0489, B:197:0x04a0, B:223:0x055b, B:225:0x0578, B:227:0x0582, B:229:0x0586, B:231:0x058e, B:232:0x0594, B:233:0x05aa, B:235:0x05b6, B:238:0x05cb, B:240:0x05dd, B:239:0x05d8, B:245:0x05f8, B:247:0x05fe, B:251:0x060c, B:252:0x0613, B:254:0x061d, B:255:0x062f, B:259:0x0650, B:261:0x065d, B:280:0x06c8, B:282:0x06ce, B:284:0x06d5, B:288:0x06e0, B:290:0x071b, B:291:0x0729, B:293:0x07c9, B:295:0x07cd, B:267:0x066e, B:269:0x067d, B:270:0x0680, B:271:0x0686, B:273:0x0697, B:274:0x06a1, B:276:0x06b5, B:277:0x06b8, B:279:0x06c5, B:244:0x05e3, B:222:0x0556, B:201:0x04bb, B:180:0x0435, B:170:0x0411, B:145:0x037c, B:147:0x0385, B:134:0x034e, B:136:0x0358, B:138:0x035e, B:296:0x07d4, B:107:0x02e6, B:81:0x025b, B:91:0x029c, B:43:0x0142, B:30:0x00ff, B:22:0x00cc, B:164:0x03f9), top: B:330:0x00ae }] */
    /* JADX WARN: Removed duplicated region for block: B:328:0x05b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map<String, Object> AFInAppEventType(i iVar) {
        String str;
        String str2;
        String str3;
        AppsFlyerProperties appsFlyerProperties;
        ax axVar;
        cl clVar;
        g AFInAppEventType2;
        boolean z;
        StatFs statFs;
        y yVar;
        Object obj;
        Context context = iVar.AFKeystoreWrapper;
        String str4 = iVar.AFVersionDeclaration;
        String str5 = iVar.getLevel;
        Object jSONObject = new JSONObject((Map<?, ?>) (iVar.values == null ? new HashMap() : iVar.values)).toString();
        String str6 = iVar.AppsFlyer2dXConversionCallback;
        SharedPreferences AFInAppEventType3 = AFInAppEventType(context);
        boolean valueOf2 = iVar.valueOf();
        Object obj2 = iVar.valueOf;
        Map<String, Object> map = iVar.AFInAppEventType;
        ab.AFKeystoreWrapper(context, map);
        Boolean bool = ab.AFInAppEventType;
        if (bool == null || bool.booleanValue()) {
            str = "Exception while collecting facebook's attribution ID. ";
            str2 = AppsFlyerProperties.APP_ID;
        } else {
            Map<String, Object> AFInAppEventType4 = AFInAppEventType(map);
            str = "Exception while collecting facebook's attribution ID. ";
            Boolean valueOf3 = Boolean.valueOf(!bool.booleanValue());
            str2 = AppsFlyerProperties.APP_ID;
            AFInAppEventType4.put("ad_ids_disabled", valueOf3);
        }
        long time = new Date().getTime();
        map.put(values("ᳲ洀Ｆ䤸\udb2e┷띈œ鍏ᵯ潬磻", 29173 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern(), Long.toString(time));
        Object AFKeystoreWrapper2 = com.appsflyer.internal.d.AFKeystoreWrapper(context, time);
        if (AFKeystoreWrapper2 != null) {
            map.put("cksm_v1", AFKeystoreWrapper2);
        }
        try {
            if (!isStopped()) {
                StringBuilder sb = new StringBuilder("******* sendTrackingWithEvent: ");
                sb.append(valueOf2 ? "Launch" : str5);
                AFLogger.values(sb.toString());
            } else {
                AFLogger.values("Reporting has been stopped");
            }
            l AFVersionDeclaration = values().AFVersionDeclaration();
            try {
                if (!new File(AFVersionDeclaration.AFKeystoreWrapper.values.getFilesDir(), "AFRequestCache").exists()) {
                    new File(AFVersionDeclaration.AFKeystoreWrapper.values.getFilesDir(), "AFRequestCache").mkdir();
                }
            } catch (Exception e2) {
                AFLogger.valueOf("CACHE: Could not create cache directory", e2);
            }
            try {
                List asList = Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions);
                if (!asList.contains("android.permission.INTERNET")) {
                    AFLogger.AppsFlyer2dXConversionCallback("Permission android.permission.INTERNET is missing in the AndroidManifest.xml");
                }
                if (!asList.contains("android.permission.ACCESS_NETWORK_STATE")) {
                    AFLogger.AppsFlyer2dXConversionCallback("Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml");
                }
                if (!asList.contains("android.permission.ACCESS_WIFI_STATE")) {
                    AFLogger.AppsFlyer2dXConversionCallback("Permission android.permission.ACCESS_WIFI_STATE is missing in the AndroidManifest.xml");
                }
            } catch (Exception e3) {
                AFLogger.valueOf("Exception while validation permissions. ", e3);
            }
            map.put("af_events_api", values("Ტ", 41800 - ImageFormat.getBitsPerPixel(0)).intern());
            map.put(values("ᳱ쪼끈鿪䖃", 54878 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), Build.BRAND);
            map.put("device", Build.DEVICE);
            map.put("product", Build.PRODUCT);
            map.put(ServerProtocol.DIALOG_PARAM_SDK_VERSION, Integer.toString(Build.VERSION.SDK_INT));
            map.put(DeviceRequestsHelper.DEVICE_INFO_MODEL, Build.MODEL);
            map.put("deviceType", Build.TYPE);
            values(context, map);
            AppsFlyerProperties appsFlyerProperties2 = AppsFlyerProperties.getInstance();
            ax axVar2 = new ax(context);
            cl level = values().getLevel();
            if (valueOf2) {
                if (AFKeystoreWrapper(context)) {
                    if (!appsFlyerProperties2.isOtherSdkStringDisabled()) {
                        map.put("batteryLevel", String.valueOf(onResponseNative(context)));
                    }
                    getLevel(context);
                    UiModeManager uiModeManager = (UiModeManager) context.getSystemService(UiModeManager.class);
                    if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
                        map.put("tv", Boolean.TRUE);
                    }
                    if (cf.values(context)) {
                        map.put("inst_app", Boolean.TRUE);
                    }
                }
                map.put("timepassedsincelastlaunch", Long.toString(onAppOpenAttribution(context)));
                values(map);
                AFInAppEventType(map, level);
                Object obj3 = this.onPause;
                if (obj3 != null) {
                    map.put(HintConstants.AUTOFILL_HINT_PHONE, obj3);
                }
                if (!TextUtils.isEmpty(str6)) {
                    map.put("referrer", str6);
                }
                Object string = AFInAppEventType3.getString("extraReferrers", null);
                if (string != null) {
                    map.put("extraReferrers", string);
                }
                String referrer = appsFlyerProperties2.getReferrer(context);
                if (!TextUtils.isEmpty(referrer) && map.get("referrer") == null) {
                    map.put("referrer", referrer);
                }
                long j = level.onDeepLinkingNative;
                if (j != 0) {
                    map.put("prev_session_dur", Long.valueOf(j));
                }
                map.put("exception_number", Long.valueOf(ay.AFInAppEventParameterName == null ? -1L : AFInAppEventType(ay.AFInAppEventParameterName).getLong("exception_number", 0L)));
                az azVar = this.setImeiData;
                if (azVar != null) {
                    if (!azVar.values.isEmpty()) {
                        map.put("partner_data", azVar.values);
                    }
                    if (!azVar.valueOf.isEmpty()) {
                        AFInAppEventType(map).put("partner_data", azVar.valueOf);
                        azVar.valueOf = new HashMap();
                    }
                }
            } else {
                valueOf(context, map, str5);
            }
            Object AFInAppEventParameterName2 = AFInAppEventParameterName("KSAppsFlyerId");
            String AFInAppEventParameterName3 = AFInAppEventParameterName("KSAppsFlyerRICounter");
            if (AFInAppEventParameterName2 != null && AFInAppEventParameterName3 != null && Integer.valueOf(AFInAppEventParameterName3).intValue() > 0) {
                map.put("reinstallCounter", AFInAppEventParameterName3);
                map.put("originalAppsflyerId", AFInAppEventParameterName2);
            }
            Object AFInAppEventParameterName4 = AFInAppEventParameterName(AppsFlyerProperties.ADDITIONAL_CUSTOM_DATA);
            if (AFInAppEventParameterName4 != null) {
                map.put("customData", AFInAppEventParameterName4);
            }
            try {
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName != null) {
                    map.put("installer_package", installerPackageName);
                }
            } catch (Exception e4) {
                AFLogger.valueOf("Exception while getting the app's installer package. ", e4);
            }
            String string2 = appsFlyerProperties2.getString(AppsFlyerProperties.EXTENSION);
            if (string2 != null && string2.length() > 0) {
                map.put(AppsFlyerProperties.EXTENSION, string2);
            }
            String AFInAppEventParameterName5 = AFInAppEventParameterName(context);
            String AFInAppEventParameterName6 = AFInAppEventParameterName(context, AFInAppEventParameterName5);
            if ((AFInAppEventParameterName6 != null && !AFInAppEventParameterName6.equals(AFInAppEventParameterName5)) || (AFInAppEventParameterName6 == null && AFInAppEventParameterName5 != null)) {
                map.put("af_latestchannel", AFInAppEventParameterName5);
            }
            String onInstallConversionDataLoadedNative2 = onInstallConversionDataLoadedNative(context);
            if (onInstallConversionDataLoadedNative2 != null) {
                map.put("af_installstore", onInstallConversionDataLoadedNative2.toLowerCase());
            }
            String onAttributionFailureNative2 = onAttributionFailureNative(context);
            if (onAttributionFailureNative2 != null) {
                map.put("af_preinstall_name", onAttributionFailureNative2.toLowerCase());
            }
            String onDeepLinkingNative2 = onDeepLinkingNative(context);
            if (onDeepLinkingNative2 != null) {
                map.put("af_currentstore", onDeepLinkingNative2.toLowerCase());
            }
            if (str4 != null && str4.length() > 0) {
                map.put("appsflyerKey", str4);
            } else {
                String devKey = AppsFlyerProperties.getInstance().getDevKey();
                if (devKey != null && devKey.length() > 0) {
                    map.put("appsflyerKey", devKey);
                } else {
                    AFLogger.values("AppsFlyer dev key is missing!!! Please use  AppsFlyerLib.getInstance().setAppsFlyerKey(...) to set it. ");
                    AFLogger.values("AppsFlyer will not track this event.");
                    return null;
                }
            }
            Object AFInAppEventType5 = AFInAppEventType();
            if (AFInAppEventType5 != null) {
                map.put("appUserId", AFInAppEventType5);
            }
            Object string3 = appsFlyerProperties2.getString(AppsFlyerProperties.USER_EMAILS);
            if (string3 != null) {
                map.put("user_emails", string3);
            } else {
                String AFInAppEventParameterName7 = AFInAppEventParameterName(AppsFlyerProperties.USER_EMAIL);
                if (AFInAppEventParameterName7 != null) {
                    map.put("sha1_el", ag.valueOf(AFInAppEventParameterName7));
                }
            }
            if (str5 != null) {
                map.put("eventName", str5);
                map.put("eventValue", jSONObject);
            }
            if (init() != null) {
                map.put(str2, AFInAppEventParameterName(str2));
            }
            String AFInAppEventParameterName8 = AFInAppEventParameterName(AppsFlyerProperties.CURRENCY_CODE);
            if (AFInAppEventParameterName8 != null) {
                if (AFInAppEventParameterName8.length() != 3) {
                    StringBuilder sb2 = new StringBuilder("WARNING: currency code should be 3 characters!!! '");
                    sb2.append(AFInAppEventParameterName8);
                    sb2.append("' is not a legal value.");
                    AFLogger.AppsFlyer2dXConversionCallback(sb2.toString());
                }
                map.put(FirebaseAnalytics.Param.CURRENCY, AFInAppEventParameterName8);
            }
            Object AFInAppEventParameterName9 = AFInAppEventParameterName(AppsFlyerProperties.IS_UPDATE);
            if (AFInAppEventParameterName9 != null) {
                map.put("isUpdate", AFInAppEventParameterName9);
            }
            map.put("af_preinstalled", Boolean.toString(isPreInstalledApp(context)));
            if (appsFlyerProperties2.getBoolean(AppsFlyerProperties.COLLECT_FACEBOOK_ATTR_ID, true)) {
                try {
                    context.getPackageManager().getApplicationInfo("com.facebook.katana", 0);
                    str3 = getAttributionId(context);
                } catch (PackageManager.NameNotFoundException unused) {
                    AFLogger.AppsFlyer2dXConversionCallback(str);
                    str3 = null;
                }
                if (str3 != null) {
                    map.put("fb", str3);
                }
            }
            valueOf(context, map);
            try {
                Object valueOf4 = af.valueOf(new WeakReference(context));
                if (valueOf4 != null) {
                    map.put("uid", valueOf4);
                }
            } catch (Exception e5) {
                StringBuilder sb3 = new StringBuilder("ERROR: could not get uid ");
                sb3.append(e5.getMessage());
                AFLogger.valueOf(sb3.toString(), e5);
            }
            try {
                map.put("lang", Locale.getDefault().getDisplayLanguage());
            } catch (Exception e6) {
                AFLogger.valueOf("Exception while collecting display language name. ", e6);
            }
            try {
                map.put("lang_code", Locale.getDefault().getLanguage());
            } catch (Exception e7) {
                AFLogger.valueOf("Exception while collecting display language code. ", e7);
            }
            try {
                map.put(UserDataStore.COUNTRY, Locale.getDefault().getCountry());
            } catch (Exception e8) {
                AFLogger.valueOf("Exception while collecting country name. ", e8);
            }
            map.put("platformextension", this.onValidateInAppFailure.AFInAppEventType());
            AFInAppEventType(context, map);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            try {
                map.put("installDate", valueOf(simpleDateFormat, context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime));
            } catch (Exception e9) {
                AFLogger.valueOf("Exception while collecting install date. ", e9);
            }
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                if (packageInfo.versionCode > AFInAppEventType3.getInt("versionCode", 0)) {
                    valueOf(context, "versionCode", packageInfo.versionCode);
                }
                map.put("app_version_code", Integer.toString(packageInfo.versionCode));
                map.put("app_version_name", packageInfo.versionName);
                long j2 = packageInfo.firstInstallTime;
                clVar = level;
                try {
                    long j3 = packageInfo.lastUpdateTime;
                    axVar = axVar2;
                    try {
                        appsFlyerProperties = appsFlyerProperties2;
                        try {
                            map.put("date1", new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US).format(new Date(j2)));
                            map.put("date2", new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US).format(new Date(j3)));
                            map.put(values("ᳵ넹䝧ᖩ꯫砐\u0e60\udcb3狥ܫ핥殶㧖츀鱜", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 44482).intern(), AFInAppEventType(simpleDateFormat, context));
                        } catch (Throwable th) {
                            th = th;
                            AFLogger.valueOf("Exception while collecting app version data ", th);
                            this.AppsFlyerLib = cd.AFKeystoreWrapper(context);
                            StringBuilder sb4 = new StringBuilder("didConfigureTokenRefreshService=");
                            sb4.append(this.AppsFlyerLib);
                            AFLogger.AFInAppEventParameterName(sb4.toString());
                            if (!this.AppsFlyerLib) {
                            }
                            if (valueOf2) {
                            }
                            if (!valueOf2) {
                            }
                            if (AFInAppEventParameterName("advertiserId") == null) {
                            }
                            AFInAppEventType2 = ab.AFInAppEventType(context.getContentResolver());
                            if (AFInAppEventType2 != null) {
                            }
                            map.put("registeredUninstall", Boolean.valueOf(cd.AFInAppEventType(AFInAppEventType3)));
                            int valueOf5 = valueOf(AFInAppEventType3, valueOf2);
                            map.put("counter", Integer.toString(valueOf5));
                            map.put("iaecounter", Integer.toString(AFKeystoreWrapper(AFInAppEventType3, str5 == null)));
                            if (valueOf2) {
                            }
                            map.put("isFirstCall", Boolean.toString(AFInAppEventType(AFInAppEventType3) ? z : false));
                            AFInAppEventParameterName(context, valueOf2, map, valueOf5);
                            new ag();
                            map.put("af_v", ag.values(map));
                            new ag();
                            map.put("af_v2", ag.AFInAppEventParameterName(map));
                            map.put("ivc", Boolean.valueOf(onConversionDataSuccess(context)));
                            if (AFInAppEventType3.contains("is_stop_tracking_used")) {
                            }
                            HashMap hashMap = new HashMap();
                            hashMap.put("mcc", Integer.valueOf(context.getResources().getConfiguration().mcc));
                            hashMap.put("mnc", Integer.valueOf(context.getResources().getConfiguration().mnc));
                            map.put("cell", hashMap);
                            ax axVar3 = axVar;
                            map.put("sig", z.AFInAppEventParameterName(axVar3.valueOf.getPackageManager(), axVar3.valueOf.getPackageName()));
                            map.put("last_boot_time", Long.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
                            long blockSizeLong = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getBlockSizeLong();
                            double pow = Math.pow(2.0d, 20.0d);
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append((long) ((statFs.getAvailableBlocksLong() * blockSizeLong) / pow));
                            sb5.append(RemoteSettings.FORWARD_SLASH_STRING);
                            sb5.append((long) ((statFs.getBlockCountLong() * blockSizeLong) / pow));
                            map.put("disk", sb5.toString());
                            yVar = this.getLevel;
                            if (yVar != null) {
                                map.put("sharing_filter", obj);
                            }
                            return map;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        appsFlyerProperties = appsFlyerProperties2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    appsFlyerProperties = appsFlyerProperties2;
                    axVar = axVar2;
                }
            } catch (Throwable th4) {
                th = th4;
                appsFlyerProperties = appsFlyerProperties2;
                axVar = axVar2;
                clVar = level;
            }
            this.AppsFlyerLib = cd.AFKeystoreWrapper(context);
            StringBuilder sb42 = new StringBuilder("didConfigureTokenRefreshService=");
            sb42.append(this.AppsFlyerLib);
            AFLogger.AFInAppEventParameterName(sb42.toString());
            if (!this.AppsFlyerLib) {
                map.put("tokenRefreshConfigured", Boolean.FALSE);
            }
            if (valueOf2) {
                if (this.onDeepLinking != null) {
                    if (map.get("af_deeplink") != null) {
                        AFLogger.AFInAppEventParameterName("Skip 'af' payload as deeplink was found by path");
                    } else {
                        JSONObject jSONObject2 = new JSONObject(this.onDeepLinking);
                        jSONObject2.put("isPush", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
                        map.put("af_deeplink", jSONObject2.toString());
                    }
                }
                this.onDeepLinking = null;
                map.put("open_referrer", obj2);
            }
            if (!valueOf2) {
                try {
                    w AFKeystoreWrapper3 = w.AFKeystoreWrapper(context);
                    Map<? extends String, ? extends Object> concurrentHashMap = new ConcurrentHashMap<>();
                    List<Map<String, Object>> AFInAppEventParameterName10 = AFKeystoreWrapper3.AFInAppEventParameterName();
                    if (!AFInAppEventParameterName10.isEmpty()) {
                        concurrentHashMap.put("sensors", new h().values(AFInAppEventParameterName10));
                    } else {
                        concurrentHashMap.put("sensors", "na");
                    }
                    map.putAll(concurrentHashMap);
                } catch (Exception e10) {
                    StringBuilder sb6 = new StringBuilder("Unexpected exception from AFSensorManager: ");
                    sb6.append(e10.getMessage());
                    AFLogger.AFKeystoreWrapper(sb6.toString());
                }
            }
            if (AFInAppEventParameterName("advertiserId") == null) {
                ab.AFKeystoreWrapper(context, map);
                map.put("GAID_retry", String.valueOf(AFInAppEventParameterName("advertiserId") != null));
            }
            AFInAppEventType2 = ab.AFInAppEventType(context.getContentResolver());
            if (AFInAppEventType2 != null) {
                map.put("amazon_aid", AFInAppEventType2.values);
                map.put("amazon_aid_limit", String.valueOf(AFInAppEventType2.AFKeystoreWrapper));
            }
            map.put("registeredUninstall", Boolean.valueOf(cd.AFInAppEventType(AFInAppEventType3)));
            int valueOf52 = valueOf(AFInAppEventType3, valueOf2);
            map.put("counter", Integer.toString(valueOf52));
            map.put("iaecounter", Integer.toString(AFKeystoreWrapper(AFInAppEventType3, str5 == null)));
            if (valueOf2) {
                z = true;
            } else {
                Map<String, Object> AFInAppEventType6 = AFInAppEventType(map);
                valueOf(AFInAppEventType6);
                if (valueOf52 != 1) {
                    if (valueOf52 == 2) {
                        cl clVar2 = clVar;
                        HashMap hashMap2 = new HashMap(clVar2.AFInAppEventParameterName);
                        if (!hashMap2.isEmpty()) {
                            AFInAppEventType6.put("first_launch", hashMap2);
                        }
                        clVar2.valueOf.AFInAppEventType("first_launch");
                    }
                    z = true;
                } else {
                    z = true;
                    cl clVar3 = clVar;
                    appsFlyerProperties.AFInAppEventParameterName = true;
                    if (AFKeystoreWrapper(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
                        map.put("wait_cid", Boolean.toString(true));
                    }
                    HashMap hashMap3 = new HashMap(clVar3.AFKeystoreWrapper);
                    clVar3.valueOf.AFInAppEventType("ddl");
                    if (!hashMap3.isEmpty()) {
                        AFInAppEventType6.put("ddl", hashMap3);
                    }
                    HashMap hashMap4 = new HashMap(clVar3.AFInAppEventParameterName);
                    if (!hashMap4.isEmpty()) {
                        AFInAppEventType6.put("first_launch", hashMap4);
                    }
                }
                if (AFInAppEventType6.isEmpty()) {
                    map.remove("meta");
                }
            }
            map.put("isFirstCall", Boolean.toString(AFInAppEventType(AFInAppEventType3) ? z : false));
            AFInAppEventParameterName(context, valueOf2, map, valueOf52);
            new ag();
            map.put("af_v", ag.values(map));
            new ag();
            map.put("af_v2", ag.AFInAppEventParameterName(map));
            map.put("ivc", Boolean.valueOf(onConversionDataSuccess(context)));
            if (AFInAppEventType3.contains("is_stop_tracking_used")) {
                map.put("istu", String.valueOf(AFInAppEventType3.getBoolean("is_stop_tracking_used", false)));
            }
            HashMap hashMap5 = new HashMap();
            hashMap5.put("mcc", Integer.valueOf(context.getResources().getConfiguration().mcc));
            hashMap5.put("mnc", Integer.valueOf(context.getResources().getConfiguration().mnc));
            map.put("cell", hashMap5);
            ax axVar32 = axVar;
            map.put("sig", z.AFInAppEventParameterName(axVar32.valueOf.getPackageManager(), axVar32.valueOf.getPackageName()));
            map.put("last_boot_time", Long.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
            long blockSizeLong2 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getBlockSizeLong();
            double pow2 = Math.pow(2.0d, 20.0d);
            StringBuilder sb52 = new StringBuilder();
            sb52.append((long) ((statFs.getAvailableBlocksLong() * blockSizeLong2) / pow2));
            sb52.append(RemoteSettings.FORWARD_SLASH_STRING);
            sb52.append((long) ((statFs.getBlockCountLong() * blockSizeLong2) / pow2));
            map.put("disk", sb52.toString());
            yVar = this.getLevel;
            if (yVar != null && (obj = yVar.AFInAppEventParameterName) != null) {
                map.put("sharing_filter", obj);
            }
        } catch (Throwable th5) {
            AFLogger.AFInAppEventParameterName(th5.getLocalizedMessage(), th5);
        }
        return map;
    }

    private static void AFKeystoreWrapper(Context context, Map<String, Object> map) {
        a.d values2 = a.C0079a.valueOf.values(context);
        map.put("btl", Float.toString(values2.AFInAppEventType));
        Object obj = null;
        if (!(values2.AFKeystoreWrapper == null)) {
            int i = setCustomerIdAndLogSession + 9;
            waitForCustomerUserId = i % 128;
            if ((i % 2 != 0 ? 'Y' : '+') == '+') {
                map.put("btch", values2.AFKeystoreWrapper);
            } else {
                map.put("btch", values2.AFKeystoreWrapper);
                super.hashCode();
                throw null;
            }
        }
        int i2 = waitForCustomerUserId + AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY;
        setCustomerIdAndLogSession = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static Map<String, Object> AFLogger$LogLevel(Context context) {
        Location valueOf2 = v.b.AFKeystoreWrapper.valueOf(context);
        HashMap hashMap = new HashMap(3);
        if ((valueOf2 != null ? 'b' : '?') == 'b') {
            int i = waitForCustomerUserId + 83;
            setCustomerIdAndLogSession = i % 128;
            int i2 = i % 2;
            hashMap.put("lat", String.valueOf(valueOf2.getLatitude()));
            hashMap.put("lon", String.valueOf(valueOf2.getLongitude()));
            hashMap.put("ts", String.valueOf(valueOf2.getTime()));
            int i3 = setCustomerIdAndLogSession + 9;
            waitForCustomerUserId = i3 % 128;
            int i4 = i3 % 2;
        }
        return hashMap;
    }

    private static void AFInAppEventType(Map<String, Object> map, cl clVar) {
        HashMap hashMap = new HashMap(clVar.values);
        clVar.values.clear();
        clVar.valueOf.AFInAppEventType("gcd");
        if (!hashMap.isEmpty()) {
            int i = setCustomerIdAndLogSession + 43;
            waitForCustomerUserId = i % 128;
            if (i % 2 == 0) {
                AFInAppEventType(map).put("gcd", hashMap);
            } else {
                AFInAppEventType(map).put("gcd", hashMap);
                Object obj = null;
                super.hashCode();
                throw null;
            }
        }
        int i2 = waitForCustomerUserId + 9;
        setCustomerIdAndLogSession = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
        if ((r6 == null) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
        if (r6 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
        r6 = com.appsflyer.internal.ac.waitForCustomerUserId + 3;
        com.appsflyer.internal.ac.setCustomerIdAndLogSession = r6 % 128;
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
        if ((r6 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
        super.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
        return com.appsflyer.internal.af.valueOf(new java.lang.ref.WeakReference(new com.appsflyer.internal.aa(r6).AFInAppEventParameterName));
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String getAppsFlyerUID(Context context) {
        int i = setCustomerIdAndLogSession + 25;
        waitForCustomerUserId = i % 128;
        if (i % 2 == 0) {
            ak.AFInAppEventType().AFKeystoreWrapper("getAppsFlyerUID", new String[0]);
        } else {
            ak.AFInAppEventType().AFKeystoreWrapper("getAppsFlyerUID", new String[0]);
        }
    }

    private void init(i iVar) throws IOException {
        URL url = new URL(iVar.onDeepLinkingNative);
        byte[] AFInAppEventParameterName2 = iVar.AFInAppEventParameterName();
        String str = iVar.AFVersionDeclaration;
        String str2 = iVar.init;
        boolean valueOf2 = iVar.valueOf();
        Application application = iVar.AFKeystoreWrapper;
        AppsFlyerRequestListener appsFlyerRequestListener = iVar.AFInAppEventParameterName;
        cl level = values().getLevel();
        if ((valueOf2 ? (char) 3 : 'B') != 'B') {
            level.valueOf(iVar.onInstallConversionFailureNative);
        }
        HttpURLConnection httpURLConnection = null;
        DataOutputStream dataOutputStream = null;
        try {
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
            try {
                httpURLConnection2.setRequestMethod("POST");
                httpURLConnection2.setRequestProperty("Content-Length", String.valueOf(AFInAppEventParameterName2.length));
                httpURLConnection2.setRequestProperty("Content-Type", (iVar.AFInAppEventType() ? null : 1) != null ? HttpHeaders.Values.APPLICATION_JSON : "application/octet-stream");
                httpURLConnection2.setConnectTimeout(10000);
                httpURLConnection2.setDoOutput(true);
                if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.HTTP_CACHE, true)) {
                    httpURLConnection2.setUseCaches(false);
                }
                try {
                    DataOutputStream dataOutputStream2 = new DataOutputStream(httpURLConnection2.getOutputStream());
                    try {
                        dataOutputStream2.write(AFInAppEventParameterName2);
                        dataOutputStream2.close();
                        int i = setCustomerIdAndLogSession + 97;
                        waitForCustomerUserId = i % 128;
                        if (i % 2 != 0) {
                            httpURLConnection2.getResponseCode();
                            throw null;
                        }
                        int responseCode = httpURLConnection2.getResponseCode();
                        if (valueOf2) {
                            level.AFInAppEventType(iVar.onInstallConversionFailureNative);
                        }
                        String AFInAppEventParameterName3 = AFInAppEventParameterName(httpURLConnection2);
                        ak.AFInAppEventType().values(url.toString(), responseCode, AFInAppEventParameterName3);
                        AFLogger.values("response code: ".concat(String.valueOf(responseCode)));
                        SharedPreferences AFInAppEventType2 = AFInAppEventType(application);
                        if ((responseCode == 200 ? null : 1) == null) {
                            if (application != null && valueOf2) {
                                this.onResponseNative = System.currentTimeMillis();
                                values().AFKeystoreWrapper();
                                int i2 = setCustomerIdAndLogSession + 17;
                                waitForCustomerUserId = i2 % 128;
                                int i3 = i2 % 2;
                            }
                            if ((appsFlyerRequestListener != null ? 1 : null) != null) {
                                int i4 = waitForCustomerUserId + 1;
                                setCustomerIdAndLogSession = i4 % 128;
                                int i5 = i4 % 2;
                                appsFlyerRequestListener.onSuccess();
                                int i6 = setCustomerIdAndLogSession + 37;
                                waitForCustomerUserId = i6 % 128;
                                int i7 = i6 % 2;
                            }
                            if (str2 != null) {
                                values().AFVersionDeclaration().valueOf(str2);
                            } else {
                                valueOf(application, "sentSuccessfully", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
                                onAppOpenAttributionNative(application);
                            }
                            new cd(application).AFKeystoreWrapper();
                            this.onValidateInApp = as.AFInAppEventParameterName(AFInAppEventParameterName3).optBoolean("send_background", false);
                        } else if (appsFlyerRequestListener != null) {
                            int i8 = RequestError.RESPONSE_CODE_FAILURE;
                            StringBuilder sb = new StringBuilder();
                            sb.append(ba.AFInAppEventType);
                            sb.append(" ");
                            sb.append(responseCode);
                            appsFlyerRequestListener.onError(i8, sb.toString());
                            int i9 = waitForCustomerUserId + 53;
                            setCustomerIdAndLogSession = i9 % 128;
                            int i10 = i9 % 2;
                        }
                        cg.AFInAppEventType(this, iVar, str, application, AFInAppEventType2, Integer.valueOf(responseCode), null);
                        if (!(httpURLConnection2 == null)) {
                            httpURLConnection2.disconnect();
                        }
                    } catch (Throwable th) {
                        th = th;
                        dataOutputStream = dataOutputStream2;
                        if (dataOutputStream != null) {
                            dataOutputStream.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection = httpURLConnection2;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setLogLevel(AFLogger.LogLevel logLevel) {
        boolean z;
        int i = waitForCustomerUserId + 23;
        setCustomerIdAndLogSession = i % 128;
        if ((i % 2 == 0 ? '#' : '=') == '=') {
            if ((logLevel.getLevel() > AFLogger.LogLevel.NONE.getLevel() ? ';' : '_') != '_') {
                int i2 = setCustomerIdAndLogSession + 29;
                waitForCustomerUserId = i2 % 128;
                int i3 = i2 % 2;
                z = true;
            } else {
                z = false;
            }
            ak.AFInAppEventType().AFKeystoreWrapper("log", String.valueOf(z));
            AppsFlyerProperties.getInstance().set("logLevel", logLevel.getLevel());
            return;
        }
        logLevel.getLevel();
        AFLogger.LogLevel.NONE.getLevel();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r6 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String values(String str, int i) {
        char[] cArr;
        String str2;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (dn.valueOf) {
            dn.AFInAppEventType = i;
            char[] cArr3 = new char[cArr2.length];
            dn.values = 0;
            while (dn.values < cArr2.length) {
                cArr3[dn.values] = (char) ((cArr2[dn.values] ^ (dn.values * dn.AFInAppEventType)) ^ enableLocationCollection);
                dn.values++;
            }
            str2 = new String(cArr3);
        }
        return str2;
    }
}
