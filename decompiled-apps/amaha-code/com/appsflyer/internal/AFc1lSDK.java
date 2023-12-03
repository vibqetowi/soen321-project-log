package com.appsflyer.internal;

import android.net.TrafficStats;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import v.g;
/* loaded from: classes.dex */
public abstract class AFc1lSDK<Result> implements Comparable<AFc1lSDK<?>>, Callable<AFc1jSDK> {
    private static final AtomicInteger afDebugLog = new AtomicInteger();
    public final AFc1kSDK AFInAppEventParameterName;
    public final Set<AFc1kSDK> AFInAppEventType;
    public final Set<AFc1kSDK> AFKeystoreWrapper;
    private final String AFLogger;
    private boolean afErrorLog;
    private Throwable afInfoLog;
    private final int afRDLog;
    public AFc1jSDK valueOf;
    public volatile int values;

    public AFc1lSDK(AFc1kSDK aFc1kSDK, AFc1kSDK[] aFc1kSDKArr, String str) {
        HashSet hashSet = new HashSet();
        this.AFInAppEventType = hashSet;
        this.AFKeystoreWrapper = new HashSet();
        int incrementAndGet = afDebugLog.incrementAndGet();
        this.afRDLog = incrementAndGet;
        this.afErrorLog = false;
        this.values = 0;
        this.AFInAppEventParameterName = aFc1kSDK;
        Collections.addAll(hashSet, aFc1kSDKArr);
        if (str != null) {
            this.AFLogger = str;
        } else {
            this.AFLogger = String.valueOf(incrementAndGet);
        }
    }

    public void AFInAppEventParameterName() {
    }

    public abstract AFc1jSDK AFInAppEventType();

    public abstract boolean AFKeystoreWrapper();

    public final boolean AFLogger() {
        return this.afErrorLog;
    }

    public final Throwable afErrorLog() {
        return this.afInfoLog;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: afInfoLog */
    public final AFc1jSDK call() {
        TrafficStats.setThreadStatsTag("AppsFlyer".hashCode());
        this.valueOf = null;
        this.afInfoLog = null;
        this.values++;
        try {
            AFc1jSDK AFInAppEventType = AFInAppEventType();
            this.valueOf = AFInAppEventType;
            return AFInAppEventType;
        } finally {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFc1lSDK aFc1lSDK = (AFc1lSDK) obj;
        if (this.AFInAppEventParameterName != aFc1lSDK.AFInAppEventParameterName) {
            return false;
        }
        return this.AFLogger.equals(aFc1lSDK.AFLogger);
    }

    public final int hashCode() {
        return this.AFLogger.hashCode() + (this.AFInAppEventParameterName.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.AFInAppEventParameterName);
        sb2.append("-");
        sb2.append(this.AFLogger);
        String obj = sb2.toString();
        if (!String.valueOf(this.afRDLog).equals(this.AFLogger)) {
            StringBuilder d10 = g.d(obj, "-");
            d10.append(this.afRDLog);
            return d10.toString();
        }
        return obj;
    }

    public void valueOf() {
        this.afErrorLog = true;
    }

    public abstract long values();

    public void AFInAppEventParameterName(Throwable th2) {
    }

    @Override // java.lang.Comparable
    /* renamed from: AFInAppEventParameterName */
    public final int compareTo(AFc1lSDK<?> aFc1lSDK) {
        int i6 = this.AFInAppEventParameterName.onAppOpenAttributionNative - aFc1lSDK.AFInAppEventParameterName.onAppOpenAttributionNative;
        if (i6 == 0) {
            if (this.AFLogger.equals(aFc1lSDK.AFLogger)) {
                return 0;
            }
            return this.afRDLog - aFc1lSDK.afRDLog;
        }
        return i6;
    }
}
