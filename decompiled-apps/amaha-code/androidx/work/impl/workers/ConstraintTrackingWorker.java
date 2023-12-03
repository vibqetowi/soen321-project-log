package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.p;
import androidx.work.q;
import hs.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import r2.c;
import rc.b;
import v2.s;
import z2.a;
/* compiled from: ConstraintTrackingWorker.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "Landroidx/work/p;", "Lr2/c;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class ConstraintTrackingWorker extends p implements c {

    /* renamed from: u  reason: collision with root package name */
    public final WorkerParameters f3318u;

    /* renamed from: v  reason: collision with root package name */
    public final Object f3319v;

    /* renamed from: w  reason: collision with root package name */
    public volatile boolean f3320w;

    /* renamed from: x  reason: collision with root package name */
    public final x2.c<p.a> f3321x;

    /* renamed from: y  reason: collision with root package name */
    public p f3322y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context appContext, WorkerParameters workerParameters) {
        super(appContext, workerParameters);
        i.g(appContext, "appContext");
        i.g(workerParameters, "workerParameters");
        this.f3318u = workerParameters;
        this.f3319v = new Object();
        this.f3321x = new x2.c<>();
    }

    @Override // r2.c
    public final void e(ArrayList workSpecs) {
        i.g(workSpecs, "workSpecs");
        q d10 = q.d();
        String str = a.f39137a;
        d10.a(str, "Constraints changed for " + workSpecs);
        synchronized (this.f3319v) {
            this.f3320w = true;
            k kVar = k.f19476a;
        }
    }

    @Override // androidx.work.p
    public final void onStopped() {
        super.onStopped();
        p pVar = this.f3322y;
        if (pVar != null && !pVar.isStopped()) {
            pVar.stop();
        }
    }

    @Override // androidx.work.p
    public final b<p.a> startWork() {
        getBackgroundExecutor().execute(new androidx.activity.b(7, this));
        x2.c<p.a> future = this.f3321x;
        i.f(future, "future");
        return future;
    }

    @Override // r2.c
    public final void f(List<s> list) {
    }
}
