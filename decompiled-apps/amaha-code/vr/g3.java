package vr;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: StatsTraceContext.java */
/* loaded from: classes2.dex */
public final class g3 {

    /* renamed from: a  reason: collision with root package name */
    public final com.android.volley.toolbox.a[] f35635a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicBoolean f35636b = new AtomicBoolean(false);

    static {
        new g3(new com.android.volley.toolbox.a[0]);
    }

    public g3(com.android.volley.toolbox.a[] aVarArr) {
        this.f35635a = aVarArr;
    }

    public final void a() {
        for (com.android.volley.toolbox.a aVar : this.f35635a) {
            aVar.getClass();
        }
    }
}
