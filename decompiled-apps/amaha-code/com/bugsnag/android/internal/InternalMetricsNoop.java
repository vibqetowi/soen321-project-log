package com.bugsnag.android.internal;

import is.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: InternalMetricsNoop.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016J\u001c\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016J\u001c\u0010\u000b\u001a\u00020\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0003H\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0003H\u0016J\u0018\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016J\u0018\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0016¨\u0006\u0017"}, d2 = {"Lcom/bugsnag/android/internal/InternalMetricsNoop;", "Lcom/bugsnag/android/internal/InternalMetrics;", "", "", "", "toJsonableMap", "differences", "Lhs/k;", "setConfigDifferences", "", "newCallbackCounts", "setCallbackCounts", "callback", "notifyAddCallback", "notifyRemoveCallback", "stringsTrimmed", "charsRemoved", "setMetadataTrimMetrics", "breadcrumbsRemoved", "bytesRemoved", "setBreadcrumbTrimMetrics", "<init>", "()V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class InternalMetricsNoop implements InternalMetrics {
    @Override // com.bugsnag.android.internal.InternalMetrics
    public void notifyAddCallback(String callback) {
        i.h(callback, "callback");
    }

    @Override // com.bugsnag.android.internal.InternalMetrics
    public void notifyRemoveCallback(String callback) {
        i.h(callback, "callback");
    }

    @Override // com.bugsnag.android.internal.InternalMetrics
    public void setCallbackCounts(Map<String, Integer> newCallbackCounts) {
        i.h(newCallbackCounts, "newCallbackCounts");
    }

    @Override // com.bugsnag.android.internal.InternalMetrics
    public void setConfigDifferences(Map<String, ? extends Object> differences) {
        i.h(differences, "differences");
    }

    @Override // com.bugsnag.android.internal.InternalMetrics
    public Map<String, Object> toJsonableMap() {
        return x.f20677u;
    }

    @Override // com.bugsnag.android.internal.InternalMetrics
    public void setBreadcrumbTrimMetrics(int i6, int i10) {
    }

    @Override // com.bugsnag.android.internal.InternalMetrics
    public void setMetadataTrimMetrics(int i6, int i10) {
    }
}
