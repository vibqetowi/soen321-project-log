package n2;

import androidx.work.s;
/* compiled from: OperationImpl.java */
/* loaded from: classes.dex */
public final class m implements androidx.work.s {

    /* renamed from: c  reason: collision with root package name */
    public final androidx.lifecycle.w<s.a> f25829c = new androidx.lifecycle.w<>();

    /* renamed from: d  reason: collision with root package name */
    public final x2.c<s.a.c> f25830d = new x2.c<>();

    public m() {
        a(androidx.work.s.f3337b);
    }

    public final void a(s.a aVar) {
        this.f25829c.i(aVar);
        boolean z10 = aVar instanceof s.a.c;
        x2.c<s.a.c> cVar = this.f25830d;
        if (z10) {
            cVar.i((s.a.c) aVar);
        } else if (aVar instanceof s.a.C0044a) {
            cVar.j(((s.a.C0044a) aVar).f3338a);
        }
    }
}
