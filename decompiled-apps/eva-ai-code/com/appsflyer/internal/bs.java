package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes2.dex */
public final class bs extends bn<bu> {
    private final bw AFInAppEventParameterName;
    private final aa AFInAppEventType;
    public bu AFKeystoreWrapper;
    private final bd AFLogger$LogLevel;
    private final String AFVersionDeclaration;
    private final cb getLevel;
    public ap valueOf;
    private final bx values;

    public bs(bw bwVar, aa aaVar, ca caVar, bx bxVar, bd bdVar, cb cbVar, String str) {
        super(bt.RC_CDN, new bt[0], "UpdateRemoteConfiguration");
        this.AFKeystoreWrapper = null;
        this.AFInAppEventParameterName = bwVar;
        this.AFInAppEventType = aaVar;
        this.values = bxVar;
        this.AFLogger$LogLevel = bdVar;
        this.getLevel = cbVar;
        this.AFVersionDeclaration = str;
    }

    @Override // com.appsflyer.internal.bn
    public final bo values() throws Exception {
        try {
            bu AFKeystoreWrapper = AFKeystoreWrapper();
            this.AFKeystoreWrapper = AFKeystoreWrapper;
            if (AFKeystoreWrapper == bu.FAILURE) {
                return bo.FAILURE;
            }
            return bo.SUCCESS;
        } catch (InterruptedIOException | InterruptedException unused) {
            this.AFKeystoreWrapper = bu.FAILURE;
            return bo.TIMEOUT;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private bu AFKeystoreWrapper() throws InterruptedException, InterruptedIOException {
        String str;
        List<String> list;
        String str2;
        long currentTimeMillis = System.currentTimeMillis();
        String str3 = this.AFVersionDeclaration;
        String devKey = AppsFlyerProperties.getInstance().getDevKey();
        if (devKey == null || devKey.trim().length() == 0) {
            AFLogger.AppsFlyer2dXConversionCallback("CFG: Dev key is not set, SDK is not started.");
        } else if (str3 == null) {
            AFLogger.AppsFlyer2dXConversionCallback("CFG: Can't create CDN token, domain or version is not provided.");
        } else {
            str = ag.valueOf(ag.AFInAppEventParameterName("appsflyersdk.com", str3, this.AFInAppEventType.AFInAppEventParameterName.getPackageName()), devKey);
            if (str != null) {
                AFLogger.AFKeystoreWrapper("CFG: can't create CDN token, skipping fetch config");
                return bu.FAILURE;
            }
            try {
                if (this.getLevel.AFInAppEventParameterName()) {
                    AFLogger.values("CFG: Cached config is expired, updating...");
                    boolean AFInAppEventType = this.getLevel.AFInAppEventType();
                    bd bdVar = this.AFLogger$LogLevel;
                    z zVar = new z(String.format(AFInAppEventType ? bd.AFKeystoreWrapper : bd.values, str), "GET");
                    zVar.valueOf = 500;
                    bp bpVar = new bp();
                    zVar.AFInAppEventParameterName = bdVar.AFInAppEventType();
                    ab abVar = bdVar.AFInAppEventType;
                    br<?> AFKeystoreWrapper = new bl(zVar, abVar.AFKeystoreWrapper, abVar.valueOf, bpVar).AFKeystoreWrapper();
                    if (AFKeystoreWrapper.values()) {
                        ao aoVar = (ao) AFKeystoreWrapper.valueOf;
                        Iterator<String> it = AFKeystoreWrapper.AFInAppEventParameterName.keySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                list = null;
                                break;
                            }
                            String next = it.next();
                            if (next != null && next.equalsIgnoreCase("x-amz-meta-af-auth-v1")) {
                                list = AFKeystoreWrapper.AFInAppEventParameterName.get(next);
                                break;
                            }
                        }
                        if (list == null || list.isEmpty()) {
                            str2 = null;
                        } else {
                            Iterator<String> it2 = list.iterator();
                            StringBuilder sb = new StringBuilder(it2.next());
                            while (it2.hasNext()) {
                                sb.append(", ");
                                sb.append(it2.next());
                            }
                            str2 = sb.toString();
                        }
                        String devKey2 = AppsFlyerProperties.getInstance().getDevKey();
                        if (devKey2 != null && devKey2.trim().length() != 0) {
                            ay AFKeystoreWrapper2 = this.AFInAppEventParameterName.AFKeystoreWrapper(aoVar, str2, str, devKey2);
                            if (AFKeystoreWrapper2.AFInAppEventParameterName()) {
                                long valueOf = this.getLevel.valueOf();
                                StringBuilder sb2 = new StringBuilder("CFG: using max-age fallback: ");
                                sb2.append(valueOf);
                                sb2.append(" seconds");
                                AFLogger.AFKeystoreWrapper(sb2.toString());
                                long currentTimeMillis2 = System.currentTimeMillis();
                                bx bxVar = this.values;
                                bxVar.AFKeystoreWrapper.AFInAppEventParameterName("af_remote_config", Base64.encodeToString(aoVar.AFInAppEventParameterName.getBytes(bx.AFInAppEventParameterName), 2));
                                bxVar.AFKeystoreWrapper.AFKeystoreWrapper("af_rc_timestamp", currentTimeMillis2);
                                bxVar.AFKeystoreWrapper.AFKeystoreWrapper("af_rc_max_age", valueOf);
                                bxVar.values = aoVar;
                                bxVar.AFInAppEventType = currentTimeMillis2;
                                bxVar.valueOf = valueOf;
                                StringBuilder sb3 = new StringBuilder("CFG: Config successfully updated, timeToLive: ");
                                sb3.append(valueOf);
                                sb3.append(" seconds");
                                AFLogger.AFInAppEventParameterName(sb3.toString());
                                AFInAppEventType(str, currentTimeMillis, AFKeystoreWrapper, (ao) AFKeystoreWrapper.valueOf, AFKeystoreWrapper2.AFInAppEventType, null);
                                return bu.SUCCESS;
                            }
                            AFInAppEventType(str, currentTimeMillis, AFKeystoreWrapper, (ao) AFKeystoreWrapper.valueOf, AFKeystoreWrapper2.AFInAppEventType, null);
                            AFLogger.AppsFlyer2dXConversionCallback("CFG: fetched config is not valid (MITM?) refuse to use it.");
                            return bu.FAILURE;
                        }
                        AFLogger.AppsFlyer2dXConversionCallback("CFG: Dev key is not set, SDK is not started.");
                        return bu.FAILURE;
                    }
                    AFInAppEventType(str, currentTimeMillis, AFKeystoreWrapper, (ao) AFKeystoreWrapper.valueOf, null, null);
                    StringBuilder sb4 = new StringBuilder("CFG: failed to fetch remote config from CDN with status code: ");
                    sb4.append(AFKeystoreWrapper.values);
                    AFLogger.AppsFlyer2dXConversionCallback(sb4.toString());
                    return bu.FAILURE;
                }
                AFLogger.AFInAppEventParameterName("CFG: active config is valid, skipping fetch");
                return bu.USE_CACHED;
            } catch (IOException e) {
                StringBuilder sb5 = new StringBuilder("CFG: failed to fetch remote config: ");
                sb5.append(e.getMessage());
                AFLogger.valueOf(sb5.toString(), e);
                AFInAppEventType(str, currentTimeMillis, e instanceof ParsingException ? ((ParsingException) e).getRawResponse() : null, null, null, e);
                if (e.getCause() instanceof InterruptedIOException) {
                    throw ((InterruptedIOException) e.getCause());
                }
                return bu.FAILURE;
            } catch (Throwable th) {
                StringBuilder sb6 = new StringBuilder("CFG: failed to update remote config: ");
                sb6.append(th.getMessage());
                AFLogger.valueOf(sb6.toString(), th);
                AFInAppEventType(str, currentTimeMillis, null, null, null, th);
                if (th.getCause() instanceof InterruptedException) {
                    throw ((InterruptedException) th.getCause());
                }
                return bu.FAILURE;
            }
        }
        str = null;
        if (str != null) {
        }
    }

    private void AFInAppEventType(String str, long j, br<?> brVar, ao aoVar, cw cwVar, Throwable th) {
        long j2;
        int i;
        Throwable th2;
        long j3;
        if (brVar != null) {
            j2 = brVar.AFInAppEventType.AFKeystoreWrapper;
            i = brVar.values;
        } else {
            j2 = 0;
            i = 0;
        }
        int i2 = i;
        if (th instanceof HttpException) {
            th2 = th.getCause();
            j3 = ((HttpException) th).getMetrics().AFKeystoreWrapper;
        } else {
            th2 = th;
            j3 = j2;
        }
        this.valueOf = new ap(aoVar != null ? aoVar.valueOf : null, str, j3, System.currentTimeMillis() - j, i2, cwVar, th2);
    }
}
