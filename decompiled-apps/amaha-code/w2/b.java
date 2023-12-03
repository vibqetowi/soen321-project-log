package w2;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;
import n2.a0;
/* compiled from: CancelWorkRunnable.java */
/* loaded from: classes.dex */
public final class b extends d {

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ a0 f36284v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ UUID f36285w;

    public b(a0 a0Var, UUID uuid) {
        this.f36284v = a0Var;
        this.f36285w = uuid;
    }

    @Override // w2.d
    public final void b() {
        a0 a0Var = this.f36284v;
        WorkDatabase workDatabase = a0Var.f25794c;
        workDatabase.c();
        try {
            d.a(a0Var, this.f36285w.toString());
            workDatabase.n();
            workDatabase.j();
            n2.s.a(a0Var.f25793b, a0Var.f25794c, a0Var.f25796e);
        } catch (Throwable th2) {
            workDatabase.j();
            throw th2;
        }
    }
}
