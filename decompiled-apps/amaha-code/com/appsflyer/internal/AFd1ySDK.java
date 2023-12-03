package com.appsflyer.internal;

import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.share.LinkGenerator;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
/* loaded from: classes.dex */
public final class AFd1ySDK extends AFc1aSDK<String> {
    private final UUID AFLogger$LogLevel;
    private final LinkGenerator.AFa1ySDK AFVersionDeclaration;
    private final AFb1aSDK afRDLog;
    private final String afWarnLog;
    private final String getLevel;
    private final Map<String, String> init;

    public AFd1ySDK(AFc1zSDK aFc1zSDK, UUID uuid, String str, Map<String, String> map, String str2, LinkGenerator.AFa1ySDK aFa1ySDK) {
        super(AFc1kSDK.ONELINK, new AFc1kSDK[]{AFc1kSDK.RC_CDN}, aFc1zSDK, uuid.toString());
        this.afRDLog = aFc1zSDK.AFInAppEventParameterName();
        this.AFLogger$LogLevel = uuid;
        this.getLevel = str;
        this.init = new HashMap(map);
        this.AFVersionDeclaration = aFa1ySDK;
        this.afWarnLog = str2;
    }

    private String afWarnLog() {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_DOMAIN);
        String packageName = this.afRDLog.AFKeystoreWrapper.values.getPackageName();
        LinkGenerator addParameters = new LinkGenerator("af_app_invites").setBaseURL(this.getLevel, string, packageName).addParameter("af_siteid", packageName).addParameters(this.init);
        AFb1xSDK.AFKeystoreWrapper();
        String AFInAppEventType = AFb1xSDK.AFInAppEventType();
        if (AFInAppEventType != null) {
            addParameters.setReferrerCustomerId(AFInAppEventType);
        }
        return addParameters.generateLink();
    }

    @Override // com.appsflyer.internal.AFc1aSDK, com.appsflyer.internal.AFc1lSDK
    public final void AFInAppEventParameterName() {
        ResponseNetwork responseNetwork;
        super.AFInAppEventParameterName();
        LinkGenerator.AFa1ySDK aFa1ySDK = this.AFVersionDeclaration;
        if (aFa1ySDK != null) {
            if (this.valueOf == AFc1jSDK.SUCCESS && (responseNetwork = this.afDebugLog) != null) {
                aFa1ySDK.onResponse((String) responseNetwork.getBody());
                return;
            }
            Throwable afErrorLog = afErrorLog();
            if (afErrorLog instanceof ParsingException) {
                if (((ParsingException) afErrorLog).getRawResponse().isSuccessful()) {
                    aFa1ySDK.onResponseError("Can't parse one link data");
                    return;
                } else {
                    aFa1ySDK.onResponse(afWarnLog());
                    return;
                }
            }
            aFa1ySDK.onResponse(afWarnLog());
        }
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final AFc1wSDK<String> AFInAppEventType(String str) {
        return ((AFc1aSDK) this).afErrorLog.AFKeystoreWrapper(this.getLevel, this.init, this.afWarnLog, this.AFLogger$LogLevel, str);
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final AppsFlyerRequestListener afDebugLog() {
        return null;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final boolean afRDLog() {
        return false;
    }

    @Override // com.appsflyer.internal.AFc1aSDK, com.appsflyer.internal.AFc1lSDK
    public final long values() {
        return 3000L;
    }
}
