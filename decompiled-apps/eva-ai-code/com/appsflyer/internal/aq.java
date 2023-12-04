package com.appsflyer.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.ServerProtocol;
import com.google.firebase.sessions.settings.RemoteSettings;
import io.sentry.protocol.App;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class aq extends an {
    a AFKeystoreWrapper;
    private String AFLogger$LogLevel;
    private String init;
    boolean values;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface a {
        void AFKeystoreWrapper(String str);

        void valueOf(Map<String, String> map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public aq(Uri uri, ac acVar, Context context) {
        super(acVar, context, "GET");
        String[] strArr;
        this.values = false;
        if (TextUtils.isEmpty(uri.getHost()) || TextUtils.isEmpty(uri.getPath())) {
            return;
        }
        String[] strArr2 = {"onelink.me", "onelnk.com", "app.aflink.com"};
        boolean z = false;
        for (int i = 0; i < 3; i++) {
            if (uri.getHost().contains(strArr2[i])) {
                z = true;
            }
        }
        if (f.AFLogger$LogLevel != null) {
            StringBuilder sb = new StringBuilder("Validate if link ");
            sb.append(uri);
            sb.append(" belongs to custom domains: ");
            sb.append(Arrays.asList(f.AFLogger$LogLevel));
            AFLogger.AFKeystoreWrapper(sb.toString());
            for (String str : f.AFLogger$LogLevel) {
                if (uri.getHost().contains(str) && !TextUtils.isEmpty(str)) {
                    AFLogger.AFInAppEventParameterName("Link matches custom domain: ".concat(String.valueOf(str)));
                    this.values = true;
                    z = true;
                }
            }
        }
        String[] split = uri.getPath().split(RemoteSettings.FORWARD_SLASH_STRING);
        if (z && split.length == 3) {
            this.AFInAppEventParameterName = split[1];
            this.AFLogger$LogLevel = split[2];
            this.init = uri.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean AFInAppEventType() {
        return (TextUtils.isEmpty(this.AFInAppEventParameterName) || TextUtils.isEmpty(this.AFLogger$LogLevel) || this.AFInAppEventParameterName.equals(App.TYPE)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.appsflyer.internal.an
    protected final void AFInAppEventParameterName(HttpsURLConnection httpsURLConnection) {
        httpsURLConnection.setRequestProperty("Af-UUID", this.AppsFlyer2dXConversionCallback);
        String valueOf = String.valueOf(this.AFVersionDeclaration.get("build_number"));
        httpsURLConnection.setRequestProperty("Af-Meta-Sdk-Ver", valueOf);
        httpsURLConnection.setRequestProperty("Af-Meta-Counter", String.valueOf(this.AFVersionDeclaration.get("counter")));
        httpsURLConnection.setRequestProperty("Af-Meta-Model", String.valueOf(this.AFVersionDeclaration.get(DeviceRequestsHelper.DEVICE_INFO_MODEL)));
        httpsURLConnection.setRequestProperty("Af-Meta-Platform", String.valueOf(this.AFVersionDeclaration.get("platformextension")));
        httpsURLConnection.setRequestProperty("Af-Meta-System-Version", String.valueOf(this.AFVersionDeclaration.get(ServerProtocol.DIALOG_PARAM_SDK_VERSION)));
        AFKeystoreWrapper(httpsURLConnection, this.valueOf, this.AppsFlyer2dXConversionCallback, this.AFInAppEventParameterName, this.AFLogger$LogLevel, valueOf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.appsflyer.internal.an
    protected final String values() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(AFInAppEventType, AppsFlyerLib.getInstance().getHostPrefix(), ac.AFInAppEventParameterName().getHostName()));
        sb.append(RemoteSettings.FORWARD_SLASH_STRING);
        sb.append(this.AFInAppEventParameterName);
        sb.append("?id=");
        sb.append(this.AFLogger$LogLevel);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.appsflyer.internal.an
    protected final void valueOf(String str) {
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
            this.AFKeystoreWrapper.valueOf(hashMap);
        } catch (JSONException e) {
            this.AFKeystoreWrapper.AFKeystoreWrapper("Can't parse OneLink data");
            AFLogger.valueOf("Error while parsing to json ".concat(String.valueOf(str)), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.appsflyer.internal.an
    protected final void valueOf() {
        String str = this.init;
        if (str == null) {
            str = "Can't get OneLink data";
        }
        this.AFKeystoreWrapper.AFKeystoreWrapper(str);
    }
}
