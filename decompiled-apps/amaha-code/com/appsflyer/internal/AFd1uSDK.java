package com.appsflyer.internal;

import android.graphics.Color;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.AFa1ySDK;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class AFd1uSDK extends AFc1aSDK<String> {
    private static final AFc1kSDK[] afWarnLog = {AFc1kSDK.DLSDK, AFc1kSDK.ONELINK, AFc1kSDK.MONITORSDK, AFc1kSDK.REGISTER};
    protected final AFd1qSDK AFVersionDeclaration;
    public final AFa1tSDK afRDLog;

    public AFd1uSDK(AFa1tSDK aFa1tSDK, AFc1zSDK aFc1zSDK) {
        this(aFa1tSDK, aFc1zSDK, null);
    }

    public void AFInAppEventParameterName(AFa1tSDK aFa1tSDK) {
        boolean z10;
        if (aFa1tSDK.afDebugLog()) {
            aFa1tSDK.AFInAppEventType(new AFa1ySDK.C0126AFa1ySDK(aFa1tSDK.AFInAppEventParameterName(), ((AFc1aSDK) this).AFLogger.valueOf.values));
        }
        if (aFa1tSDK.afErrorLog()) {
            aFa1tSDK.AFInAppEventType(((AFc1aSDK) this).AFLogger.AFInAppEventType());
        }
        Set<AFc1kSDK> set = this.AFInAppEventType;
        if (!set.contains(AFc1kSDK.LAUNCH) && !set.contains(AFc1kSDK.CONVERSION)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (AFLogger() && z10) {
            aFa1tSDK.AFInAppEventType(this.AFVersionDeclaration.valueOf("appsFlyerCount"));
        }
        try {
            if (aFa1tSDK.AFInAppEventParameterName().containsKey("appsflyerKey") && aFa1tSDK.afDebugLog()) {
                new AFb1tSDK();
                aFa1tSDK.AFKeystoreWrapper("af_v", AFb1tSDK.valueOf(aFa1tSDK.AFInAppEventParameterName()));
                new AFb1tSDK();
                aFa1tSDK.AFKeystoreWrapper("af_v2", AFb1tSDK.AFKeystoreWrapper(aFa1tSDK.AFInAppEventParameterName()));
            }
        } catch (Throwable th2) {
            AFLogger.afErrorLog("QUEUE: failed to update the event, is missing DevKey? Error: ".concat(String.valueOf(th2)), th2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b5  */
    @Override // com.appsflyer.internal.AFc1aSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AFc1wSDK<String> AFInAppEventType(String str) {
        String str2;
        String str3;
        AFInAppEventParameterName(this.afRDLog);
        AFa1tSDK aFa1tSDK = this.afRDLog;
        String str4 = aFa1tSDK.afErrorLog;
        Map<String, Object> AFInAppEventParameterName = aFa1tSDK.AFInAppEventParameterName();
        String str5 = "";
        String str6 = null;
        try {
            str2 = new JSONObject(AFInAppEventParameterName).toString();
        } catch (NullPointerException e10) {
            e = e10;
            str2 = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
        } catch (NullPointerException e11) {
            e = e11;
            AFLogger.afErrorLog("JSONObject return null String object. Trying to create AFJsonObject.", e, true);
            try {
                String str7 = (String) ((Class) AFa1vSDK.values(Color.green(0) + 62, (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (ViewConfiguration.getTapTimeout() >> 16) + 31)).getMethod("AFInAppEventType", Map.class).invoke(null, AFInAppEventParameterName);
                try {
                } catch (NullPointerException e12) {
                    e = e12;
                    str2 = str7;
                    AFLogger.afErrorLog("AFJsonObject return null String object.", e, true);
                    str3 = "";
                    if (str2 != null) {
                    }
                    if (!str3.equals(str5)) {
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this);
                    sb2.append(": preparing data: ");
                    sb2.append(str3);
                    AFb1rSDK.valueOf(sb2.toString());
                    ((AFc1aSDK) this).afInfoLog.valueOf(str4, str3);
                    return ((AFc1aSDK) this).afErrorLog.AFKeystoreWrapper(this.afRDLog, str);
                } catch (Throwable th3) {
                    th = th3;
                    str2 = str7;
                    AFLogger.afErrorLog("Unexpected error", th, true);
                    str3 = "";
                    if (str2 != null) {
                    }
                    if (!str3.equals(str5)) {
                    }
                    StringBuilder sb22 = new StringBuilder();
                    sb22.append(this);
                    sb22.append(": preparing data: ");
                    sb22.append(str3);
                    AFb1rSDK.valueOf(sb22.toString());
                    ((AFc1aSDK) this).afInfoLog.valueOf(str4, str3);
                    return ((AFc1aSDK) this).afErrorLog.AFKeystoreWrapper(this.afRDLog, str);
                }
                if (str7 != null) {
                    str3 = str7.replaceAll("\\p{C}", "*Non-printing character*");
                    str2 = str7;
                    if (str2 != null) {
                    }
                    if (!str3.equals(str5)) {
                    }
                    StringBuilder sb222 = new StringBuilder();
                    sb222.append(this);
                    sb222.append(": preparing data: ");
                    sb222.append(str3);
                    AFb1rSDK.valueOf(sb222.toString());
                    ((AFc1aSDK) this).afInfoLog.valueOf(str4, str3);
                    return ((AFc1aSDK) this).afErrorLog.AFKeystoreWrapper(this.afRDLog, str);
                }
                throw new NullPointerException("JSON toString of eventParams map returns null");
            } catch (Throwable th4) {
                try {
                    Throwable cause = th4.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th4;
                } catch (NullPointerException e13) {
                    e = e13;
                    AFLogger.afErrorLog("AFJsonObject return null String object.", e, true);
                    str3 = "";
                    if (str2 != null) {
                    }
                    if (!str3.equals(str5)) {
                    }
                    StringBuilder sb2222 = new StringBuilder();
                    sb2222.append(this);
                    sb2222.append(": preparing data: ");
                    sb2222.append(str3);
                    AFb1rSDK.valueOf(sb2222.toString());
                    ((AFc1aSDK) this).afInfoLog.valueOf(str4, str3);
                    return ((AFc1aSDK) this).afErrorLog.AFKeystoreWrapper(this.afRDLog, str);
                } catch (Throwable th5) {
                    th = th5;
                    AFLogger.afErrorLog("Unexpected error", th, true);
                    str3 = "";
                    if (str2 != null) {
                    }
                    if (!str3.equals(str5)) {
                    }
                    StringBuilder sb22222 = new StringBuilder();
                    sb22222.append(this);
                    sb22222.append(": preparing data: ");
                    sb22222.append(str3);
                    AFb1rSDK.valueOf(sb22222.toString());
                    ((AFc1aSDK) this).afInfoLog.valueOf(str4, str3);
                    return ((AFc1aSDK) this).afErrorLog.AFKeystoreWrapper(this.afRDLog, str);
                }
            }
        } catch (Throwable th6) {
            th = th6;
            str6 = str2;
            AFLogger.afErrorLog("Unexpected error", th, true);
            str3 = "";
            str2 = str6;
            if (str2 != null) {
            }
            if (!str3.equals(str5)) {
            }
            StringBuilder sb222222 = new StringBuilder();
            sb222222.append(this);
            sb222222.append(": preparing data: ");
            sb222222.append(str3);
            AFb1rSDK.valueOf(sb222222.toString());
            ((AFc1aSDK) this).afInfoLog.valueOf(str4, str3);
            return ((AFc1aSDK) this).afErrorLog.AFKeystoreWrapper(this.afRDLog, str);
        }
        if (str2 != null) {
            str3 = str2.replaceAll("\\p{C}", "*Non-printing character*");
            if (str2 != null) {
                str5 = str2;
            }
            if (!str3.equals(str5)) {
                AFLogger.afWarnLog("Payload contains non-printing characters");
            } else {
                str3 = str5;
            }
            StringBuilder sb2222222 = new StringBuilder();
            sb2222222.append(this);
            sb2222222.append(": preparing data: ");
            sb2222222.append(str3);
            AFb1rSDK.valueOf(sb2222222.toString());
            ((AFc1aSDK) this).afInfoLog.valueOf(str4, str3);
            return ((AFc1aSDK) this).afErrorLog.AFKeystoreWrapper(this.afRDLog, str);
        }
        throw new NullPointerException("JSON toString of eventParams map returns null");
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final AppsFlyerRequestListener afDebugLog() {
        return this.afRDLog.AFInAppEventType;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public boolean afRDLog() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFd1uSDK(AFa1tSDK aFa1tSDK, AFc1zSDK aFc1zSDK, String str) {
        super(aFa1tSDK.values(), new AFc1kSDK[]{AFc1kSDK.RC_CDN}, aFc1zSDK, str);
        this.afRDLog = aFa1tSDK;
        this.AFVersionDeclaration = aFc1zSDK.afRDLog();
        for (AFc1kSDK aFc1kSDK : afWarnLog) {
            if (this.AFInAppEventParameterName == aFc1kSDK) {
                return;
            }
        }
        int i6 = this.afRDLog.afInfoLog;
        AFc1kSDK aFc1kSDK2 = this.AFInAppEventParameterName;
        if (i6 <= 0) {
            AFc1kSDK aFc1kSDK3 = AFc1kSDK.CONVERSION;
            if (aFc1kSDK2 != aFc1kSDK3) {
                this.AFInAppEventType.add(aFc1kSDK3);
                return;
            }
            return;
        }
        this.AFKeystoreWrapper.add(AFc1kSDK.CONVERSION);
    }
}
