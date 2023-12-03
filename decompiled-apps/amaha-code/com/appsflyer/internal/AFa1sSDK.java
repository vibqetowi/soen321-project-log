package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.internal.AFc1mSDK;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class AFa1sSDK {
    static final List<String> AFInAppEventType = new ArrayList();
    public static Intent AFKeystoreWrapper;
    private static AFa1sSDK afInfoLog;
    public static String[] valueOf;
    public DeepLinkListener AFInAppEventParameterName;
    public List<List<String>> afErrorLog = new ArrayList();
    public Map<String, String> afRDLog;
    public String values;

    public static AFa1sSDK AFInAppEventParameterName() {
        if (afInfoLog == null) {
            afInfoLog = new AFa1sSDK();
        }
        return afInfoLog;
    }

    private Uri AFInAppEventType(Object obj, Iterator<String> it) {
        while (obj != JSONObject.NULL) {
            if (!it.hasNext()) {
                Uri parse = Uri.parse(obj.toString());
                if (parse == null || parse.getScheme() == null || parse.getHost() == null) {
                    return null;
                }
                return parse;
            }
            try {
                obj = new JSONObject(obj.toString()).get(it.next());
            } catch (JSONException unused) {
                return null;
            }
        }
        return null;
    }

    public static Uri valueOf(Intent intent) {
        if (intent != null && "android.intent.action.VIEW".equals(intent.getAction())) {
            return intent.getData();
        }
        return null;
    }

    public static void values(Context context, Map<String, Object> map, Uri uri) {
        AFd1xSDK aFd1xSDK = new AFd1xSDK(context, map, uri, AFInAppEventType);
        AFb1xSDK.AFKeystoreWrapper().AFKeystoreWrapper(context);
        AFc1mSDK afErrorLog = AFb1xSDK.AFKeystoreWrapper().values().afErrorLog();
        afErrorLog.AFInAppEventParameterName.execute(new AFc1mSDK.AnonymousClass3(aFd1xSDK));
        AFKeystoreWrapper = null;
    }

    public final void AFKeystoreWrapper(Map<String, Object> map, Intent intent, Context context) {
        AFb1xSDK.AFKeystoreWrapper().AFKeystoreWrapper(context);
        AFc1zSDK values = AFb1xSDK.AFKeystoreWrapper().values();
        AFd1qSDK afRDLog = values.afRDLog();
        if (!AFKeystoreWrapper(intent, context, map) && this.AFInAppEventParameterName != null && values.AFInAppEventParameterName().values.valueOf("appsFlyerCount") == 0 && !afRDLog.AFInAppEventParameterName("ddl_sent")) {
            AFb1pSDK aFb1pSDK = new AFb1pSDK(context, values);
            AFc1mSDK afErrorLog = values.afErrorLog();
            afErrorLog.AFInAppEventParameterName.execute(new AFc1mSDK.AnonymousClass3(new AFd1tSDK(aFb1pSDK)));
        }
        afRDLog.AFKeystoreWrapper("ddl_sent", true);
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0076 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean AFKeystoreWrapper(Intent intent, Context context, Map<String, Object> map) {
        String string;
        Uri AFInAppEventType2;
        Uri uri = null;
        Uri data = (intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData();
        Intent intent2 = AFKeystoreWrapper;
        Uri data2 = (intent2 == null || !"android.intent.action.VIEW".equals(intent2.getAction())) ? null : intent2.getData();
        if (intent == null) {
            AFLogger.afDebugLog("Could not extract deeplink from null intent");
        } else {
            Bundle extras = intent.getExtras();
            List<List<String>> list = this.afErrorLog;
            if (list != null && !list.isEmpty() && extras != null) {
                Iterator<List<String>> it = this.afErrorLog.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    List<String> next = it.next();
                    if (next != null) {
                        Iterator<String> it2 = next.iterator();
                        if (it2.hasNext() && (string = extras.getString(it2.next())) != null) {
                            AFInAppEventType2 = AFInAppEventType(string, it2);
                            continue;
                            if (AFInAppEventType2 != null) {
                                StringBuilder sb2 = new StringBuilder("Found deeplink in push payload at ");
                                sb2.append(next.toString());
                                AFLogger.afDebugLog(sb2.toString());
                                AFb1xSDK.AFInAppEventParameterName(map).put("payloadKey", this.afErrorLog);
                                uri = AFInAppEventType2;
                                break;
                            }
                        }
                    }
                    AFInAppEventType2 = null;
                    continue;
                    if (AFInAppEventType2 != null) {
                    }
                }
            }
        }
        if (data != null) {
            if (!intent.hasExtra("af_consumed")) {
                intent.putExtra("af_consumed", System.currentTimeMillis());
                values(context, map, data);
                return true;
            }
            StringBuilder sb3 = new StringBuilder("skipping re-use of previously consumed deep link: ");
            sb3.append(data.toString());
            sb3.append(" w/af_consumed");
            AFLogger.afInfoLog(sb3.toString());
            return false;
        } else if (data2 != null) {
            if (!AFKeystoreWrapper.hasExtra("af_consumed")) {
                AFKeystoreWrapper.putExtra("af_consumed", System.currentTimeMillis());
                values(context, map, data2);
                return true;
            }
            StringBuilder sb4 = new StringBuilder("skipping re-use of previously consumed trampoline deep link: ");
            sb4.append(data2.toString());
            sb4.append(" w/af_consumed");
            AFLogger.afInfoLog(sb4.toString());
            return false;
        } else if (uri != null) {
            if (!intent.hasExtra("af_consumed")) {
                intent.putExtra("af_consumed", System.currentTimeMillis());
                values(context, map, uri);
                return true;
            }
            StringBuilder sb5 = new StringBuilder("skipping re-use of previously consumed deep link from push: ");
            sb5.append(uri.toString());
            sb5.append(" w/af_consumed");
            AFLogger.afInfoLog(sb5.toString());
            return false;
        } else {
            AFLogger.afDebugLog("No deep link detected");
            return false;
        }
    }
}
