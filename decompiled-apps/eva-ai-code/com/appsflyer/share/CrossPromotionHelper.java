package com.appsflyer.share;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.ac;
import com.appsflyer.internal.db;
import com.appsflyer.internal.dg;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import io.sentry.protocol.App;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class CrossPromotionHelper {
    private static String AFInAppEventParameterName = "https://%simpression.%s";

    public static void logAndOpenStore(Context context, String str, String str2) {
        logAndOpenStore(context, str, str2, null);
    }

    public static void logAndOpenStore(Context context, String str, String str2, Map<String, String> map) {
        LinkGenerator valueOf = valueOf(context, str, str2, map, String.format(db.AFInAppEventParameterName, AppsFlyerLib.getInstance().getHostPrefix(), ac.AFInAppEventParameterName().getHostName()));
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.values("CustomerUserId not set, track And Open Store is disabled", true);
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("af_campaign", str2);
        AppsFlyerLib.getInstance().logEvent(context, "af_cross_promotion", map);
        new Thread(new d(valueOf.generateLink(), new dg(), context, AppsFlyerLib.getInstance().isStopped())).start();
    }

    public static void logCrossPromoteImpression(Context context, String str, String str2) {
        logCrossPromoteImpression(context, str, str2, null);
    }

    public static void logCrossPromoteImpression(Context context, String str, String str2, Map<String, String> map) {
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.values("CustomerUserId not set, Promote Impression is disabled", true);
        } else {
            new Thread(new d(valueOf(context, str, str2, map, String.format(AFInAppEventParameterName, AppsFlyerLib.getInstance().getHostPrefix(), ac.AFInAppEventParameterName().getHostName())).generateLink(), null, null, AppsFlyerLib.getInstance().isStopped())).start();
        }
    }

    private static LinkGenerator valueOf(Context context, String str, String str2, Map<String, String> map, String str3) {
        LinkGenerator linkGenerator = new LinkGenerator("af_cross_promotion");
        linkGenerator.AFInAppEventType = str3;
        linkGenerator.AFKeystoreWrapper = str;
        linkGenerator.addParameter("af_siteid", context.getPackageName());
        if (str2 != null) {
            linkGenerator.setCampaign(str2);
        }
        if (map != null) {
            linkGenerator.addParameters(map);
        }
        String string = AppsFlyerProperties.getInstance().getString("advertiserId");
        if (string != null) {
            linkGenerator.addParameter("advertising_id", string);
        }
        return linkGenerator;
    }

    public static void setUrl(Map<String, String> map) {
        char c;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            String key = entry.getKey();
            int hashCode = key.hashCode();
            if (hashCode != 96801) {
                if (hashCode == 120623625 && key.equals("impression")) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (key.equals(App.TYPE)) {
                    c = 0;
                }
                c = 65535;
            }
            if (c == 0) {
                db.AFInAppEventParameterName = value;
            } else if (c == 1) {
                AFInAppEventParameterName = value;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class d implements Runnable {
        private final dg AFInAppEventParameterName;
        private final String AFKeystoreWrapper;
        private final WeakReference<Context> valueOf;
        private final boolean values;

        d(String str, dg dgVar, Context context, boolean z) {
            this.AFKeystoreWrapper = str;
            this.AFInAppEventParameterName = dgVar;
            this.valueOf = new WeakReference<>(context);
            this.values = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            HttpURLConnection httpURLConnection;
            Throwable th;
            if (this.values) {
                return;
            }
            try {
                httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(this.AFKeystoreWrapper).openConnection()));
                try {
                    httpURLConnection.setConnectTimeout(10000);
                    httpURLConnection.setInstanceFollowRedirects(false);
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == 200) {
                        StringBuilder sb = new StringBuilder("Cross promotion impressions success: ");
                        sb.append(this.AFKeystoreWrapper);
                        AFLogger.values(sb.toString(), false);
                    } else if (responseCode == 301 || responseCode == 302) {
                        StringBuilder sb2 = new StringBuilder("Cross promotion redirection success: ");
                        sb2.append(this.AFKeystoreWrapper);
                        AFLogger.values(sb2.toString(), false);
                        if (this.AFInAppEventParameterName != null && this.valueOf.get() != null) {
                            this.AFInAppEventParameterName.values = httpURLConnection.getHeaderField("Location");
                            dg dgVar = this.AFInAppEventParameterName;
                            Context context = this.valueOf.get();
                            if (dgVar.values != null) {
                                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(dgVar.values)).setFlags(268435456));
                            }
                        }
                    } else {
                        StringBuilder sb3 = new StringBuilder("call to ");
                        sb3.append(this.AFKeystoreWrapper);
                        sb3.append(" failed: ");
                        sb3.append(responseCode);
                        AFLogger.values(sb3.toString());
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        AFLogger.AFInAppEventParameterName(th.getMessage(), th);
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                    } finally {
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                    }
                }
            } catch (Throwable th3) {
                httpURLConnection = null;
                th = th3;
            }
        }
    }
}
