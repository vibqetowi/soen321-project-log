package ne;

import ne.b;
import tr.c;
import tr.i0;
/* compiled from: FirestoreChannel.java */
/* loaded from: classes.dex */
public final class k extends c.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f26238a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ tr.c[] f26239b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ n f26240c;

    public k(n nVar, r rVar, tr.c[] cVarArr) {
        this.f26240c = nVar;
        this.f26238a = rVar;
        this.f26239b = cVarArr;
    }

    @Override // tr.c.a
    public final void a(tr.c0 c0Var, i0 i0Var) {
        try {
            b.c cVar = (b.c) this.f26238a;
            cVar.getClass();
            cVar.f26176a.a(new q7.f(cVar, 25, i0Var));
        } catch (Throwable th2) {
            this.f26240c.f26248a.c(th2);
        }
    }

    @Override // tr.c.a
    public final void b(tr.c0 c0Var) {
        try {
            b.c cVar = (b.c) this.f26238a;
            cVar.getClass();
            cVar.f26176a.a(new q7.f(cVar, 27, c0Var));
        } catch (Throwable th2) {
            this.f26240c.f26248a.c(th2);
        }
    }

    @Override // tr.c.a
    public final void c(Object obj) {
        try {
            b.c cVar = (b.c) this.f26238a;
            cVar.getClass();
            cVar.f26176a.a(new q7.f(cVar, 26, obj));
            this.f26239b[0].c(1);
        } catch (Throwable th2) {
            this.f26240c.f26248a.c(th2);
        }
    }

    @Override // tr.c.a
    public final void d() {
    }
}
