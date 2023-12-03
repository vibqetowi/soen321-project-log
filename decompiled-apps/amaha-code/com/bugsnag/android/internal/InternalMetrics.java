package com.bugsnag.android.internal;

import java.util.Map;
import kotlin.Metadata;
/* compiled from: InternalMetrics.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H&J\u001c\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H&J\u001c\u0010\n\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0002H&J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0003H&J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0003H&J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH&J\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bH&¨\u0006\u0014"}, d2 = {"Lcom/bugsnag/android/internal/InternalMetrics;", "", "", "", "toJsonableMap", "differences", "Lhs/k;", "setConfigDifferences", "", "newCallbackCounts", "setCallbackCounts", "callback", "notifyAddCallback", "notifyRemoveCallback", "stringsTrimmed", "charsRemoved", "setMetadataTrimMetrics", "breadcrumbsRemoved", "bytesRemoved", "setBreadcrumbTrimMetrics", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public interface InternalMetrics {
    void notifyAddCallback(String str);

    void notifyRemoveCallback(String str);

    void setBreadcrumbTrimMetrics(int i6, int i10);

    void setCallbackCounts(Map<String, Integer> map);

    void setConfigDifferences(Map<String, ? extends Object> map);

    void setMetadataTrimMetrics(int i6, int i10);

    Map<String, Object> toJsonableMap();
}
