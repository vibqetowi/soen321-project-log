package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AppsFlyerProperties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public final class bf implements bg {
    private av AFInAppEventParameterName;
    private bh AFInAppEventType;
    private ab AFLogger$LogLevel;
    private by AFVersionDeclaration;
    private cl AppsFlyer2dXConversionCallback;
    private aa getLevel;
    private ai init;
    private de onAppOpenAttributionNative;
    private ca onInstallConversionDataLoadedNative;
    private l onInstallConversionFailureNative;
    private ExecutorService valueOf;
    private final int values = (int) TimeUnit.SECONDS.toMillis(30);
    public final be AFKeystoreWrapper = new be();

    @Override // com.appsflyer.internal.bg
    public final bd valueOf() {
        return new bd(onAppOpenAttributionNative(), AFInAppEventType(), AppsFlyerProperties.getInstance());
    }

    private synchronized ab onAppOpenAttributionNative() {
        if (this.AFLogger$LogLevel == null) {
            this.AFLogger$LogLevel = new ab(new bm(this.values), onDeepLinkingNative());
        }
        return this.AFLogger$LogLevel;
    }

    private synchronized ExecutorService onDeepLinkingNative() {
        if (this.valueOf == null) {
            this.valueOf = Executors.newCachedThreadPool();
        }
        return this.valueOf;
    }

    @Override // com.appsflyer.internal.bg
    public final synchronized aa AFInAppEventType() {
        if (this.getLevel == null) {
            Context context = this.AFKeystoreWrapper.values;
            if (context != null) {
                this.getLevel = new aa(context);
            } else {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
        }
        return this.getLevel;
    }

    @Override // com.appsflyer.internal.bg
    public final bv AFInAppEventParameterName() {
        Context context = this.AFKeystoreWrapper.values;
        if (context != null) {
            return new bc(ac.AFInAppEventType(context));
        }
        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
    }

    private synchronized bh onInstallConversionDataLoadedNative() {
        if (this.AFInAppEventType == null) {
            this.AFInAppEventType = new bh();
        }
        return this.AFInAppEventType;
    }

    @Override // com.appsflyer.internal.bg
    public final synchronized av AFKeystoreWrapper() {
        if (this.AFInAppEventParameterName == null) {
            bh onInstallConversionDataLoadedNative = onInstallConversionDataLoadedNative();
            Context context = this.AFKeystoreWrapper.values;
            if (context != null) {
                this.AFInAppEventParameterName = new av(onInstallConversionDataLoadedNative, new bb(context), AFInAppEventParameterName(), onDeepLinkingNative(), new bd(onAppOpenAttributionNative(), AFInAppEventType(), AppsFlyerProperties.getInstance()));
            } else {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
        }
        return this.AFInAppEventParameterName;
    }

    @Override // com.appsflyer.internal.bg
    public final synchronized by values() {
        if (this.AFVersionDeclaration == null) {
            bx bxVar = new bx(AFInAppEventParameterName());
            this.AFVersionDeclaration = new by(new bw(), AFInAppEventType(), init(), bxVar, new bd(onAppOpenAttributionNative(), AFInAppEventType(), AppsFlyerProperties.getInstance()), new cb(AFInAppEventType(), bxVar), Executors.newSingleThreadExecutor(), onInstallConversionFailureNative());
        }
        return this.AFVersionDeclaration;
    }

    @Override // com.appsflyer.internal.bg
    public final synchronized cl getLevel() {
        if (this.AppsFlyer2dXConversionCallback == null) {
            this.AppsFlyer2dXConversionCallback = new cl(AFInAppEventParameterName());
        }
        return this.AppsFlyer2dXConversionCallback;
    }

    private synchronized ai onInstallConversionFailureNative() {
        if (this.init == null) {
            new ThreadPoolExecutor(0, 4, 180L, TimeUnit.SECONDS, new LinkedBlockingQueue());
            this.init = new ai((byte) 0);
        }
        return this.init;
    }

    @Override // com.appsflyer.internal.bg
    public final synchronized ak AppsFlyer2dXConversionCallback() {
        return ak.AFInAppEventType();
    }

    @Override // com.appsflyer.internal.bg
    public final synchronized de AFLogger$LogLevel() {
        if (this.onAppOpenAttributionNative == null) {
            this.onAppOpenAttributionNative = new de();
        }
        return this.onAppOpenAttributionNative;
    }

    @Override // com.appsflyer.internal.bg
    public final synchronized ca init() {
        if (this.onInstallConversionDataLoadedNative == null) {
            this.onInstallConversionDataLoadedNative = new ca(onAttributionFailureNative());
        }
        return this.onInstallConversionDataLoadedNative;
    }

    private synchronized be onAttributionFailureNative() {
        return this.AFKeystoreWrapper;
    }

    @Override // com.appsflyer.internal.bg
    public final synchronized l AFVersionDeclaration() {
        if (this.onInstallConversionFailureNative == null) {
            this.onInstallConversionFailureNative = new l(onAttributionFailureNative());
        }
        return this.onInstallConversionFailureNative;
    }
}
