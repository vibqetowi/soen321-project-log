package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.io.IOException;
import java.io.InterruptedIOException;
/* loaded from: classes.dex */
public final class AFd1oSDK extends AFc1lSDK<AFd1mSDK> {
    public AFb1mSDK AFLogger;
    private final AFd1gSDK AFLogger$LogLevel;
    private final AFd1lSDK AFVersionDeclaration;
    public final AFd1qSDK afDebugLog;
    public AFd1mSDK afErrorLog;
    private final AFd1nSDK afInfoLog;
    private final AFb1aSDK afRDLog;
    private final AFc1uSDK afWarnLog;
    private final String getLevel;
    private final AFd1kSDK init;

    public AFd1oSDK(AFd1nSDK aFd1nSDK, AFb1aSDK aFb1aSDK, AFd1gSDK aFd1gSDK, AFd1lSDK aFd1lSDK, AFc1uSDK aFc1uSDK, AFd1kSDK aFd1kSDK, String str, AFd1qSDK aFd1qSDK) {
        super(AFc1kSDK.RC_CDN, new AFc1kSDK[0], "UpdateRemoteConfiguration");
        this.afErrorLog = null;
        this.afInfoLog = aFd1nSDK;
        this.afRDLog = aFb1aSDK;
        this.AFLogger$LogLevel = aFd1gSDK;
        this.AFVersionDeclaration = aFd1lSDK;
        this.afWarnLog = aFc1uSDK;
        this.init = aFd1kSDK;
        this.getLevel = str;
        this.afDebugLog = aFd1qSDK;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private AFd1mSDK afRDLog() {
        String str;
        AFc1nSDK<String> aFc1nSDK;
        long currentTimeMillis = System.currentTimeMillis();
        String str2 = this.getLevel;
        String str3 = this.AFLogger$LogLevel.values;
        if (str3 != null && str3.trim().length() != 0) {
            if (str2 == null) {
                AFLogger.afWarnLog("CFG: Can't create CDN token, domain or version is not provided.");
            } else {
                str = AFb1tSDK.AFInAppEventType(AFb1tSDK.AFInAppEventType("appsflyersdk.com", str2, this.afRDLog.AFKeystoreWrapper.values.getPackageName()), str3);
                if (str != null) {
                    AFLogger.afRDLog("CFG: can't create CDN token, skipping fetch config");
                    return AFd1mSDK.FAILURE;
                }
                try {
                    if (this.init.valueOf()) {
                        AFLogger.afInfoLog("CFG: Cached config is expired, updating...");
                        AFc1nSDK<AFb1sSDK> AFInAppEventType = this.afWarnLog.values(this.init.values(), str, 1500).AFInAppEventType();
                        if (AFInAppEventType.isSuccessful()) {
                            AFb1sSDK body = AFInAppEventType.getBody();
                            String AFInAppEventType2 = AFInAppEventType.AFInAppEventType("x-amz-meta-af-auth-v1");
                            String AFInAppEventType3 = AFInAppEventType.AFInAppEventType("CF-Cache-Status");
                            String str4 = this.AFLogger$LogLevel.values;
                            if (str4 != null && str4.trim().length() != 0) {
                                AFb1nSDK values = this.afInfoLog.values(body, AFInAppEventType2, str, str4);
                                if (values.AFInAppEventParameterName()) {
                                    long AFKeystoreWrapper = this.init.AFKeystoreWrapper();
                                    StringBuilder sb2 = new StringBuilder("CFG: using max-age fallback: ");
                                    sb2.append(AFKeystoreWrapper);
                                    sb2.append(" seconds");
                                    AFLogger.afRDLog(sb2.toString());
                                    long currentTimeMillis2 = System.currentTimeMillis();
                                    AFd1lSDK aFd1lSDK = this.AFVersionDeclaration;
                                    aFd1lSDK.AFInAppEventParameterName.valueOf("af_remote_config", Base64.encodeToString(body.AFInAppEventParameterName.getBytes(AFd1lSDK.AFInAppEventType), 2));
                                    aFd1lSDK.AFInAppEventParameterName.AFInAppEventParameterName("af_rc_timestamp", currentTimeMillis2);
                                    aFd1lSDK.AFInAppEventParameterName.AFInAppEventParameterName("af_rc_max_age", AFKeystoreWrapper);
                                    aFd1lSDK.AFKeystoreWrapper = body;
                                    aFd1lSDK.values = currentTimeMillis2;
                                    aFd1lSDK.valueOf = AFKeystoreWrapper;
                                    StringBuilder sb3 = new StringBuilder("CFG: Config successfully updated, timeToLive: ");
                                    sb3.append(AFKeystoreWrapper);
                                    sb3.append(" seconds");
                                    AFLogger.afDebugLog(sb3.toString());
                                    AFInAppEventType(str, currentTimeMillis, values.AFInAppEventType, AFInAppEventType3, AFInAppEventType);
                                    return AFd1mSDK.SUCCESS;
                                }
                                AFInAppEventType(str, currentTimeMillis, values.AFInAppEventType, AFInAppEventType3, AFInAppEventType);
                                AFLogger.afWarnLog("CFG: fetched config is not valid (MITM?) refuse to use it.");
                                return AFd1mSDK.FAILURE;
                            }
                            AFLogger.afWarnLog("CFG: Dev key is not set, SDK is not started.");
                            return AFd1mSDK.FAILURE;
                        }
                        AFInAppEventType(str, currentTimeMillis, null, null, AFInAppEventType);
                        StringBuilder sb4 = new StringBuilder("CFG: failed to fetch remote config from CDN with status code: ");
                        sb4.append(AFInAppEventType.getStatusCode());
                        AFLogger.afWarnLog(sb4.toString());
                        return AFd1mSDK.FAILURE;
                    }
                    AFLogger.afDebugLog("CFG: active config is valid, skipping fetch");
                    return AFd1mSDK.USE_CACHED;
                } catch (IOException e10) {
                    StringBuilder sb5 = new StringBuilder("CFG: failed to fetch remote config: ");
                    sb5.append(e10.getMessage());
                    AFLogger.afErrorLog(sb5.toString(), e10);
                    if (e10 instanceof ParsingException) {
                        aFc1nSDK = ((ParsingException) e10).getRawResponse();
                    } else {
                        aFc1nSDK = null;
                    }
                    AFKeystoreWrapper(str, currentTimeMillis, aFc1nSDK, null, null, null, e10);
                    if (!(e10.getCause() instanceof InterruptedIOException)) {
                        return AFd1mSDK.FAILURE;
                    }
                    throw ((InterruptedIOException) e10.getCause());
                } catch (Throwable th2) {
                    StringBuilder sb6 = new StringBuilder("CFG: failed to update remote config: ");
                    sb6.append(th2.getMessage());
                    AFLogger.afErrorLog(sb6.toString(), th2);
                    AFKeystoreWrapper(str, currentTimeMillis, null, null, null, null, th2);
                    if (!(th2.getCause() instanceof InterruptedException)) {
                        return AFd1mSDK.FAILURE;
                    }
                    throw ((InterruptedException) th2.getCause());
                }
            }
        } else {
            AFLogger.afWarnLog("CFG: Dev key is not set, SDK is not started.");
        }
        str = null;
        if (str != null) {
        }
    }

    @Override // com.appsflyer.internal.AFc1lSDK
    public final AFc1jSDK AFInAppEventType() {
        try {
            AFd1mSDK afRDLog = afRDLog();
            this.afErrorLog = afRDLog;
            if (afRDLog == AFd1mSDK.FAILURE) {
                return AFc1jSDK.FAILURE;
            }
            return AFc1jSDK.SUCCESS;
        } catch (InterruptedIOException | InterruptedException unused) {
            this.afErrorLog = AFd1mSDK.FAILURE;
            return AFc1jSDK.TIMEOUT;
        }
    }

    @Override // com.appsflyer.internal.AFc1lSDK
    public final boolean AFKeystoreWrapper() {
        return false;
    }

    @Override // com.appsflyer.internal.AFc1lSDK
    public final long values() {
        return 1500L;
    }

    private void AFKeystoreWrapper(String str, long j10, AFc1nSDK<?> aFc1nSDK, AFb1sSDK aFb1sSDK, AFe1lSDK aFe1lSDK, String str2, Throwable th2) {
        long j11;
        int i6;
        Throwable th3;
        long j12;
        if (aFc1nSDK != null) {
            j11 = aFc1nSDK.AFInAppEventParameterName.AFKeystoreWrapper;
            i6 = aFc1nSDK.getStatusCode();
        } else {
            j11 = 0;
            i6 = 0;
        }
        if (th2 instanceof HttpException) {
            th3 = th2.getCause();
            j12 = ((HttpException) th2).getMetrics().AFKeystoreWrapper;
        } else {
            th3 = th2;
            j12 = j11;
        }
        this.AFLogger = new AFb1mSDK(aFb1sSDK != null ? aFb1sSDK.AFInAppEventType : null, str, j12, System.currentTimeMillis() - j10, i6, aFe1lSDK, str2, th3);
    }

    private void AFInAppEventType(String str, long j10, AFe1lSDK aFe1lSDK, String str2, AFc1nSDK<AFb1sSDK> aFc1nSDK) {
        AFKeystoreWrapper(str, j10, aFc1nSDK, aFc1nSDK != null ? aFc1nSDK.getBody() : null, aFe1lSDK, str2 != null ? str2 : null, null);
    }
}
