package com.appsflyer.internal;

import android.net.TrafficStats;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes2.dex */
public abstract class bn<Result> implements Comparable<bn<?>>, Callable<bo> {
    private static final AtomicInteger valueOf = new AtomicInteger();
    private final Set<bt> AFInAppEventParameterName;
    private final int AFInAppEventType;
    private final String AFKeystoreWrapper;
    private final bt values;

    protected abstract bo values() throws Exception;

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(bn<?> bnVar) {
        bn<?> bnVar2 = bnVar;
        int i = this.values.valueOf - bnVar2.values.valueOf;
        return i == 0 ? this.AFInAppEventType - bnVar2.AFInAppEventType : i;
    }

    public bn(bt btVar, bt[] btVarArr, String str) {
        HashSet hashSet = new HashSet();
        this.AFInAppEventParameterName = hashSet;
        new HashSet();
        this.AFInAppEventType = valueOf.incrementAndGet();
        this.values = btVar;
        Collections.addAll(hashSet, btVarArr);
        this.AFKeystoreWrapper = str;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: AFInAppEventParameterName */
    public final bo call() throws Exception {
        TrafficStats.setThreadStatsTag("AppsFlyer".hashCode());
        try {
            return values();
        } catch (Throwable th) {
            bo boVar = bo.FAILURE;
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bn bnVar = (bn) obj;
        if (this.values != bnVar.values) {
            return false;
        }
        return this.AFKeystoreWrapper.equals(bnVar.AFKeystoreWrapper);
    }

    public final int hashCode() {
        return (this.values.hashCode() * 31) + this.AFKeystoreWrapper.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.values);
        sb.append("-");
        sb.append(this.AFKeystoreWrapper);
        String obj = sb.toString();
        if (String.valueOf(this.AFInAppEventType).equals(this.AFKeystoreWrapper)) {
            return obj;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append("-");
        sb2.append(this.AFInAppEventType);
        return sb2.toString();
    }
}
