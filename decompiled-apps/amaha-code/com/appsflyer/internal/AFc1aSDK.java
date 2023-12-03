package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.attribution.RequestError;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.io.IOException;
/* loaded from: classes.dex */
public abstract class AFc1aSDK<Result> extends AFc1lSDK<AFc1nSDK<Result>> {
    public final AFd1gSDK AFLogger;
    private String AFLogger$LogLevel;
    public AFc1nSDK<Result> afDebugLog;
    protected final AFc1uSDK afErrorLog;
    protected final AFb1qSDK afInfoLog;
    private AFa1pSDK afRDLog;

    private AFc1aSDK(AFc1kSDK aFc1kSDK, AFc1kSDK[] aFc1kSDKArr, AFc1uSDK aFc1uSDK, AFd1gSDK aFd1gSDK, AFb1qSDK aFb1qSDK, AFa1pSDK aFa1pSDK, String str) {
        super(aFc1kSDK, aFc1kSDKArr, str);
        this.afErrorLog = aFc1uSDK;
        this.AFLogger = aFd1gSDK;
        this.afInfoLog = aFb1qSDK;
        this.afRDLog = aFa1pSDK;
    }

    @Override // com.appsflyer.internal.AFc1lSDK
    public final void AFInAppEventParameterName(Throwable th2) {
        AFLogger.afErrorLog("Error while sending request to server: ".concat(String.valueOf(th2)), th2, true);
        AppsFlyerRequestListener afDebugLog = afDebugLog();
        if (afDebugLog != null) {
            String message = th2.getMessage();
            int i6 = RequestError.NETWORK_FAILURE;
            if (message == null) {
                message = "";
            }
            afDebugLog.onError(i6, message);
        }
    }

    @Override // com.appsflyer.internal.AFc1lSDK
    public AFc1jSDK AFInAppEventType() {
        if (a_() && this.AFLogger.values()) {
            AppsFlyerRequestListener afDebugLog = afDebugLog();
            if (afDebugLog != null) {
                afDebugLog.onError(RequestError.STOP_TRACKING, AFb1cSDK.AFKeystoreWrapper);
            }
            throw new AFc1dSDK();
        }
        String str = this.AFLogger.values;
        if (str != null && !str.trim().isEmpty()) {
            AFc1wSDK<Result> AFInAppEventType = AFInAppEventType(str);
            if (afRDLog()) {
                AFInAppEventType(AFInAppEventType.valueOf);
            }
            AFc1nSDK<Result> AFInAppEventType2 = AFInAppEventType.AFInAppEventType();
            this.afDebugLog = AFInAppEventType2;
            this.afInfoLog.AFKeystoreWrapper(AFInAppEventType.valueOf.AFInAppEventType, AFInAppEventType2.getStatusCode(), AFInAppEventType2.getBody().toString());
            AppsFlyerRequestListener afDebugLog2 = afDebugLog();
            if (afDebugLog2 != null) {
                if (AFInAppEventType2.isSuccessful()) {
                    afDebugLog2.onSuccess();
                } else {
                    int i6 = RequestError.RESPONSE_CODE_FAILURE;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(AFb1cSDK.values);
                    sb2.append(" ");
                    sb2.append(AFInAppEventType2.getStatusCode());
                    afDebugLog2.onError(i6, sb2.toString());
                }
            }
            if (AFInAppEventType2.isSuccessful()) {
                return AFc1jSDK.SUCCESS;
            }
            return AFc1jSDK.FAILURE;
        }
        AppsFlyerRequestListener afDebugLog3 = afDebugLog();
        if (afDebugLog3 != null) {
            afDebugLog3.onError(RequestError.NO_DEV_KEY, AFb1cSDK.AFInAppEventType);
        }
        throw new AFc1gSDK();
    }

    public abstract AFc1wSDK<Result> AFInAppEventType(String str);

    @Override // com.appsflyer.internal.AFc1lSDK
    public boolean AFKeystoreWrapper() {
        if (afErrorLog() instanceof AFc1dSDK) {
            return false;
        }
        if (this.valueOf == AFc1jSDK.TIMEOUT) {
            return true;
        }
        Throwable afErrorLog = afErrorLog();
        if (!(afErrorLog instanceof IOException) || (afErrorLog instanceof ParsingException)) {
            return false;
        }
        return true;
    }

    public boolean a_() {
        return true;
    }

    public abstract AppsFlyerRequestListener afDebugLog();

    public abstract boolean afRDLog();

    @Override // com.appsflyer.internal.AFc1lSDK
    public final void valueOf() {
        String str;
        super.valueOf();
        if (afRDLog() && (str = this.AFLogger.values) != null && !str.trim().isEmpty()) {
            AFInAppEventType(AFInAppEventType(str).valueOf);
        }
    }

    @Override // com.appsflyer.internal.AFc1lSDK
    public long values() {
        return 60000L;
    }

    @Override // com.appsflyer.internal.AFc1lSDK
    public void AFInAppEventParameterName() {
        String str;
        if (this.valueOf == AFc1jSDK.SUCCESS) {
            String str2 = this.AFLogger$LogLevel;
            if (str2 != null) {
                this.afRDLog.AFInAppEventParameterName(str2);
            }
        } else if (AFKeystoreWrapper() || (str = this.AFLogger$LogLevel) == null) {
        } else {
            this.afRDLog.AFInAppEventParameterName(str);
        }
    }

    public AFc1aSDK(AFc1kSDK aFc1kSDK, AFc1kSDK[] aFc1kSDKArr, AFc1zSDK aFc1zSDK, String str) {
        this(aFc1kSDK, aFc1kSDKArr, aFc1zSDK.AFInAppEventType(), aFc1zSDK.AFVersionDeclaration(), aFc1zSDK.afWarnLog(), aFc1zSDK.getLevel(), str);
    }

    public AFc1aSDK(AFc1kSDK aFc1kSDK, AFc1kSDK[] aFc1kSDKArr, AFc1zSDK aFc1zSDK, String str, String str2) {
        this(aFc1kSDK, aFc1kSDKArr, aFc1zSDK.AFInAppEventType(), aFc1zSDK.AFVersionDeclaration(), aFc1zSDK.afWarnLog(), aFc1zSDK.getLevel(), str);
        this.AFLogger$LogLevel = str2;
    }

    private void AFInAppEventType(AFb1wSDK aFb1wSDK) {
        String str = this.AFLogger$LogLevel;
        this.AFLogger$LogLevel = this.afRDLog.AFInAppEventParameterName(new AFa1dSDK(aFb1wSDK.AFInAppEventType, aFb1wSDK.valueOf(), "6.9.1", this.AFInAppEventParameterName));
        if (str != null) {
            this.afRDLog.AFInAppEventParameterName(str);
        }
    }
}
