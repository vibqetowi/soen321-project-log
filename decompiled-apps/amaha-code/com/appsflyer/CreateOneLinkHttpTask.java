package com.appsflyer;

import com.appsflyer.internal.AFb1aSDK;
import com.appsflyer.internal.AFb1mSDK;
import com.appsflyer.internal.AFc1iSDK;
import com.appsflyer.internal.AFc1jSDK;
import com.appsflyer.internal.AFc1lSDK;
import com.appsflyer.internal.AFc1mSDK;
import com.appsflyer.internal.AFc1uSDK;
import com.appsflyer.internal.AFd1gSDK;
import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFd1lSDK;
import com.appsflyer.internal.AFd1mSDK;
import com.appsflyer.internal.AFd1nSDK;
import com.appsflyer.internal.AFd1oSDK;
import com.appsflyer.internal.AFd1qSDK;
@Deprecated
/* loaded from: classes.dex */
public final class CreateOneLinkHttpTask implements AFc1iSDK {
    private final AFd1nSDK AFInAppEventParameterName;
    private final AFd1gSDK AFInAppEventType;
    private final AFb1aSDK AFKeystoreWrapper;
    private final AFc1mSDK AFLogger;
    private final AFc1uSDK afDebugLog;
    private final AFd1kSDK afInfoLog;
    private AFb1mSDK afRDLog;
    private final Object valueOf;
    private final AFd1lSDK values;

    @Deprecated
    /* loaded from: classes.dex */
    public interface ResponseListener {
        void onResponse(String str);

        void onResponseError(String str);
    }

    public CreateOneLinkHttpTask() {
    }

    public CreateOneLinkHttpTask(AFd1nSDK aFd1nSDK, AFb1aSDK aFb1aSDK, AFd1gSDK aFd1gSDK, AFd1lSDK aFd1lSDK, AFc1uSDK aFc1uSDK, AFd1kSDK aFd1kSDK, AFc1mSDK aFc1mSDK) {
        this.valueOf = new Object();
        this.AFInAppEventParameterName = aFd1nSDK;
        this.AFKeystoreWrapper = aFb1aSDK;
        this.AFInAppEventType = aFd1gSDK;
        this.values = aFd1lSDK;
        this.afDebugLog = aFc1uSDK;
        this.afInfoLog = aFd1kSDK;
        this.AFLogger = aFc1mSDK;
        aFc1mSDK.AFInAppEventType.add(this);
    }

    @Override // com.appsflyer.internal.AFc1iSDK
    public final void AFInAppEventType(AFc1lSDK<?> aFc1lSDK) {
    }

    public final AFb1mSDK AFKeystoreWrapper() {
        AFb1mSDK aFb1mSDK;
        synchronized (this.valueOf) {
            aFb1mSDK = this.afRDLog;
            this.afRDLog = null;
        }
        return aFb1mSDK;
    }

    @Override // com.appsflyer.internal.AFc1iSDK
    public final void valueOf(AFc1lSDK<?> aFc1lSDK, AFc1jSDK aFc1jSDK) {
        if (aFc1lSDK instanceof AFd1oSDK) {
            AFd1oSDK aFd1oSDK = (AFd1oSDK) aFc1lSDK;
            AFd1mSDK aFd1mSDK = aFd1oSDK.afErrorLog;
            if (aFd1mSDK == null) {
                AFLogger.afWarnLog("CFG: update RC returned null result, something went wrong!");
                aFd1mSDK = AFd1mSDK.FAILURE;
            }
            if (aFd1mSDK != AFd1mSDK.USE_CACHED) {
                AFb1mSDK aFb1mSDK = aFd1oSDK.AFLogger;
                synchronized (this.valueOf) {
                    this.afRDLog = aFb1mSDK;
                }
            }
            synchronized (this.valueOf) {
            }
        }
    }

    public final void AFInAppEventType(AFd1qSDK aFd1qSDK) {
        AFd1oSDK aFd1oSDK = new AFd1oSDK(this.AFInAppEventParameterName, this.AFKeystoreWrapper, this.AFInAppEventType, this.values, this.afDebugLog, this.afInfoLog, "v1", aFd1qSDK);
        AFc1mSDK aFc1mSDK = this.AFLogger;
        aFc1mSDK.AFInAppEventParameterName.execute(new AFc1mSDK.AnonymousClass3(aFd1oSDK));
    }

    @Override // com.appsflyer.internal.AFc1iSDK
    public final void valueOf(AFc1lSDK<?> aFc1lSDK) {
        if (aFc1lSDK instanceof AFd1oSDK) {
            synchronized (this.valueOf) {
                this.afRDLog = null;
            }
            AFd1mSDK aFd1mSDK = AFd1mSDK.SUCCESS;
            synchronized (this.valueOf) {
            }
        }
    }
}
