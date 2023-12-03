package com.bugsnag.android.internal;

import com.bugsnag.android.NdkPluginCaller;
import hs.f;
import is.e0;
import is.k;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
import sp.b;
/* compiled from: InternalMetricsImpl.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0010%\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\b\u0002\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\"\u0010#J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0014\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bH\u0002J\u0014\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bH\u0016J\u001c\u0010\r\u001a\u00020\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bH\u0016J\u001c\u0010\u000f\u001a\u00020\u00062\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\bH\u0016J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0016J\u0018\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0016R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001d¨\u0006$"}, d2 = {"Lcom/bugsnag/android/internal/InternalMetricsImpl;", "Lcom/bugsnag/android/internal/InternalMetrics;", "", "callback", "", "delta", "Lhs/k;", "modifyCallback", "", "", "allCallbacks", "toJsonableMap", "differences", "setConfigDifferences", "newCallbackCounts", "setCallbackCounts", "notifyAddCallback", "notifyRemoveCallback", "stringsTrimmed", "charsRemoved", "setMetadataTrimMetrics", "breadcrumbsRemoved", "bytesRemoved", "setBreadcrumbTrimMetrics", "", "configDifferences", "Ljava/util/Map;", "callbackCounts", "metadataStringsTrimmedCount", "I", "metadataCharsTruncatedCount", "breadcrumbsRemovedCount", "breadcrumbBytesRemovedCount", "source", "<init>", "(Ljava/util/Map;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class InternalMetricsImpl implements InternalMetrics {
    private int breadcrumbBytesRemovedCount;
    private int breadcrumbsRemovedCount;
    private final Map<String, Integer> callbackCounts;
    private final Map<String, Object> configDifferences;
    private int metadataCharsTruncatedCount;
    private int metadataStringsTrimmedCount;

    public InternalMetricsImpl() {
        this(null, 1, null);
    }

    private final Map<String, Object> allCallbacks() {
        Integer num;
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.callbackCounts);
        NdkPluginCaller ndkPluginCaller = NdkPluginCaller.INSTANCE;
        Map<String, Integer> currentCallbackSetCounts = ndkPluginCaller.getCurrentCallbackSetCounts();
        if (currentCallbackSetCounts != null && (num = currentCallbackSetCounts.get("ndkOnError")) != null) {
            hashMap.put("ndkOnError", num);
        }
        Map<String, Boolean> currentNativeApiCallUsage = ndkPluginCaller.getCurrentNativeApiCallUsage();
        if (currentNativeApiCallUsage != null) {
            hashMap.putAll(currentNativeApiCallUsage);
        }
        return hashMap;
    }

    private final void modifyCallback(String str, int i6) {
        int i10;
        Integer num = this.callbackCounts.get(str);
        int i11 = 0;
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = 0;
        }
        int i12 = i10 + i6;
        Map<String, Integer> map = this.callbackCounts;
        if (i12 >= 0) {
            i11 = i12;
        }
        map.put(str, Integer.valueOf(i11));
    }

    @Override // com.bugsnag.android.internal.InternalMetrics
    public void notifyAddCallback(String callback) {
        i.h(callback, "callback");
        modifyCallback(callback, 1);
        NdkPluginCaller.INSTANCE.notifyAddCallback(callback);
    }

    @Override // com.bugsnag.android.internal.InternalMetrics
    public void notifyRemoveCallback(String callback) {
        i.h(callback, "callback");
        modifyCallback(callback, -1);
        NdkPluginCaller.INSTANCE.notifyRemoveCallback(callback);
    }

    @Override // com.bugsnag.android.internal.InternalMetrics
    public void setBreadcrumbTrimMetrics(int i6, int i10) {
        this.breadcrumbsRemovedCount = i6;
        this.breadcrumbBytesRemovedCount = i10;
    }

    @Override // com.bugsnag.android.internal.InternalMetrics
    public void setCallbackCounts(Map<String, Integer> newCallbackCounts) {
        i.h(newCallbackCounts, "newCallbackCounts");
        this.callbackCounts.clear();
        this.callbackCounts.putAll(newCallbackCounts);
        NdkPluginCaller.INSTANCE.initCallbackCounts(newCallbackCounts);
    }

    @Override // com.bugsnag.android.internal.InternalMetrics
    public void setConfigDifferences(Map<String, ? extends Object> differences) {
        i.h(differences, "differences");
        this.configDifferences.clear();
        this.configDifferences.putAll(differences);
        NdkPluginCaller.INSTANCE.setStaticData(b.Q(new f("usage", b.Q(new f("config", this.configDifferences)))));
    }

    @Override // com.bugsnag.android.internal.InternalMetrics
    public void setMetadataTrimMetrics(int i6, int i10) {
        this.metadataStringsTrimmedCount = i6;
        this.metadataCharsTruncatedCount = i10;
    }

    @Override // com.bugsnag.android.internal.InternalMetrics
    public Map<String, Object> toJsonableMap() {
        f fVar;
        f fVar2;
        f fVar3;
        f fVar4;
        f fVar5;
        f fVar6;
        Map<String, Object> allCallbacks = allCallbacks();
        f[] fVarArr = new f[4];
        int i6 = this.metadataStringsTrimmedCount;
        f fVar7 = null;
        if (i6 > 0) {
            fVar = new f("stringsTruncated", Integer.valueOf(i6));
        } else {
            fVar = null;
        }
        fVarArr[0] = fVar;
        int i10 = this.metadataCharsTruncatedCount;
        if (i10 > 0) {
            fVar2 = new f("stringCharsTruncated", Integer.valueOf(i10));
        } else {
            fVar2 = null;
        }
        fVarArr[1] = fVar2;
        int i11 = this.breadcrumbsRemovedCount;
        if (i11 > 0) {
            fVar3 = new f("breadcrumbsRemoved", Integer.valueOf(i11));
        } else {
            fVar3 = null;
        }
        fVarArr[2] = fVar3;
        int i12 = this.breadcrumbBytesRemovedCount;
        if (i12 > 0) {
            fVar4 = new f("breadcrumbBytesRemoved", Integer.valueOf(i12));
        } else {
            fVar4 = null;
        }
        fVarArr[3] = fVar4;
        Map w02 = e0.w0(k.R1(fVarArr));
        f[] fVarArr2 = new f[3];
        if (!this.configDifferences.isEmpty()) {
            fVar5 = new f("config", this.configDifferences);
        } else {
            fVar5 = null;
        }
        fVarArr2[0] = fVar5;
        if (!allCallbacks.isEmpty()) {
            fVar6 = new f("callbacks", allCallbacks);
        } else {
            fVar6 = null;
        }
        fVarArr2[1] = fVar6;
        if (!w02.isEmpty()) {
            fVar7 = new f("system", w02);
        }
        fVarArr2[2] = fVar7;
        return e0.w0(k.R1(fVarArr2));
    }

    public InternalMetricsImpl(Map<String, ? extends Object> map) {
        if (map != null) {
            Map<String, Object> c10 = c0.c(map.get("config"));
            this.configDifferences = c10 == null ? new HashMap<>() : c10;
            Map<String, Integer> c11 = c0.c(map.get("callbacks"));
            this.callbackCounts = c11 == null ? new HashMap<>() : c11;
            Map c12 = c0.c(map.get("system"));
            if (c12 != null) {
                Number number = (Number) c12.get("stringsTruncated");
                this.metadataStringsTrimmedCount = number != null ? number.intValue() : 0;
                Number number2 = (Number) c12.get("stringCharsTruncated");
                this.metadataCharsTruncatedCount = number2 != null ? number2.intValue() : 0;
                Number number3 = (Number) c12.get("breadcrumbsRemovedCount");
                this.breadcrumbsRemovedCount = number3 != null ? number3.intValue() : 0;
                Number number4 = (Number) c12.get("breadcrumbBytesRemoved");
                this.breadcrumbBytesRemovedCount = number4 != null ? number4.intValue() : 0;
                return;
            }
            return;
        }
        this.configDifferences = new HashMap();
        this.callbackCounts = new HashMap();
    }

    public /* synthetic */ InternalMetricsImpl(Map map, int i6, d dVar) {
        this((i6 & 1) != 0 ? null : map);
    }
}
