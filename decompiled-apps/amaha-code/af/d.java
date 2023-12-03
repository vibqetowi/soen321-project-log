package af;

import android.app.Activity;
import android.util.SparseIntArray;
import androidx.fragment.app.Fragment;
import f0.l;
import java.util.HashMap;
import java.util.Map;
import kf.e;
/* compiled from: FrameMetricsRecorder.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: e  reason: collision with root package name */
    public static final df.a f540e = df.a.d();

    /* renamed from: a  reason: collision with root package name */
    public final Activity f541a;

    /* renamed from: b  reason: collision with root package name */
    public final l f542b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<Fragment, ef.c> f543c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f544d;

    public d() {
        throw null;
    }

    public d(Activity activity) {
        l lVar = new l();
        HashMap hashMap = new HashMap();
        this.f544d = false;
        this.f541a = activity;
        this.f542b = lVar;
        this.f543c = hashMap;
    }

    public final e<ef.c> a() {
        int i6;
        int i10;
        boolean z10 = this.f544d;
        df.a aVar = f540e;
        if (!z10) {
            aVar.a("No recording has been started.");
            return new e<>();
        }
        SparseIntArray[] b10 = this.f542b.f14636a.b();
        if (b10 == null) {
            aVar.a("FrameMetricsAggregator.mMetrics is uninitialized.");
            return new e<>();
        }
        int i11 = 0;
        SparseIntArray sparseIntArray = b10[0];
        if (sparseIntArray == null) {
            aVar.a("FrameMetricsAggregator.mMetrics[TOTAL_INDEX] is uninitialized.");
            return new e<>();
        }
        if (sparseIntArray != null) {
            int i12 = 0;
            i6 = 0;
            i10 = 0;
            while (i11 < sparseIntArray.size()) {
                int keyAt = sparseIntArray.keyAt(i11);
                int valueAt = sparseIntArray.valueAt(i11);
                i12 += valueAt;
                if (keyAt > 700) {
                    i10 += valueAt;
                }
                if (keyAt > 16) {
                    i6 += valueAt;
                }
                i11++;
            }
            i11 = i12;
        } else {
            i6 = 0;
            i10 = 0;
        }
        return new e<>(new ef.c(i11, i6, i10));
    }
}
