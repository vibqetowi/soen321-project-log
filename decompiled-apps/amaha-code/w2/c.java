package w2;

import androidx.work.impl.WorkDatabase;
import n2.a0;
/* compiled from: CancelWorkRunnable.java */
/* loaded from: classes.dex */
public final class c extends d {

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ a0 f36286v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f36287w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ boolean f36288x = false;

    public c(a0 a0Var, String str) {
        this.f36286v = a0Var;
        this.f36287w = str;
    }

    @Override // w2.d
    public final void b() {
        a0 a0Var = this.f36286v;
        WorkDatabase workDatabase = a0Var.f25794c;
        workDatabase.c();
        try {
            for (String str : workDatabase.u().n(this.f36287w)) {
                d.a(a0Var, str);
            }
            workDatabase.n();
            workDatabase.j();
            if (this.f36288x) {
                n2.s.a(a0Var.f25793b, a0Var.f25794c, a0Var.f25796e);
            }
        } catch (Throwable th2) {
            workDatabase.j();
            throw th2;
        }
    }
}
