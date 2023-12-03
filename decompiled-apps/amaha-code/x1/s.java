package x1;

import androidx.lifecycle.LiveData;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: RoomTrackingLiveData.kt */
/* loaded from: classes.dex */
public final class s<T> extends LiveData<T> {

    /* renamed from: l  reason: collision with root package name */
    public final n f37559l;

    /* renamed from: m  reason: collision with root package name */
    public final androidx.appcompat.widget.l f37560m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f37561n;

    /* renamed from: o  reason: collision with root package name */
    public final Callable<T> f37562o;

    /* renamed from: p  reason: collision with root package name */
    public final r f37563p;

    /* renamed from: q  reason: collision with root package name */
    public final AtomicBoolean f37564q;
    public final AtomicBoolean r;

    /* renamed from: s  reason: collision with root package name */
    public final AtomicBoolean f37565s;

    /* renamed from: t  reason: collision with root package name */
    public final q f37566t;

    /* renamed from: u  reason: collision with root package name */
    public final q f37567u;

    public s(n database, androidx.appcompat.widget.l lVar, v2.v vVar, String[] strArr) {
        kotlin.jvm.internal.i.g(database, "database");
        this.f37559l = database;
        this.f37560m = lVar;
        this.f37561n = true;
        this.f37562o = vVar;
        this.f37563p = new r(strArr, this);
        this.f37564q = new AtomicBoolean(true);
        this.r = new AtomicBoolean(false);
        this.f37565s = new AtomicBoolean(false);
        this.f37566t = new q(this, 0);
        this.f37567u = new q(this, 1);
    }

    @Override // androidx.lifecycle.LiveData
    public final void g() {
        Executor executor;
        androidx.appcompat.widget.l lVar = this.f37560m;
        lVar.getClass();
        ((Set) lVar.f1472w).add(this);
        boolean z10 = this.f37561n;
        n nVar = this.f37559l;
        if (z10) {
            executor = nVar.f37517c;
            if (executor == null) {
                kotlin.jvm.internal.i.q("internalTransactionExecutor");
                throw null;
            }
        } else {
            executor = nVar.f37516b;
            if (executor == null) {
                kotlin.jvm.internal.i.q("internalQueryExecutor");
                throw null;
            }
        }
        executor.execute(this.f37566t);
    }

    @Override // androidx.lifecycle.LiveData
    public final void h() {
        androidx.appcompat.widget.l lVar = this.f37560m;
        lVar.getClass();
        ((Set) lVar.f1472w).remove(this);
    }
}
