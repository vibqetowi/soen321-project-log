package com.bugsnag.android.internal;

import kotlin.Metadata;
import pl.a;
/* compiled from: InternalMetrics.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/bugsnag/android/internal/TrimMetrics;", "", "itemsTrimmed", "", "dataTrimmed", "(II)V", "getDataTrimmed", "()I", "getItemsTrimmed", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class TrimMetrics {
    private final int dataTrimmed;
    private final int itemsTrimmed;

    public TrimMetrics(int i6, int i10) {
        this.itemsTrimmed = i6;
        this.dataTrimmed = i10;
    }

    public static /* synthetic */ TrimMetrics copy$default(TrimMetrics trimMetrics, int i6, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i6 = trimMetrics.itemsTrimmed;
        }
        if ((i11 & 2) != 0) {
            i10 = trimMetrics.dataTrimmed;
        }
        return trimMetrics.copy(i6, i10);
    }

    public final int component1() {
        return this.itemsTrimmed;
    }

    public final int component2() {
        return this.dataTrimmed;
    }

    public final TrimMetrics copy(int i6, int i10) {
        return new TrimMetrics(i6, i10);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TrimMetrics) {
                TrimMetrics trimMetrics = (TrimMetrics) obj;
                if (this.itemsTrimmed != trimMetrics.itemsTrimmed || this.dataTrimmed != trimMetrics.dataTrimmed) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int getDataTrimmed() {
        return this.dataTrimmed;
    }

    public final int getItemsTrimmed() {
        return this.itemsTrimmed;
    }

    public int hashCode() {
        return (this.itemsTrimmed * 31) + this.dataTrimmed;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("TrimMetrics(itemsTrimmed=");
        sb2.append(this.itemsTrimmed);
        sb2.append(", dataTrimmed=");
        return a.g(sb2, this.dataTrimmed, ")");
    }
}
