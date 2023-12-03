package vr;

import tr.c;
import vr.p;
/* compiled from: ClientCallImpl.java */
/* loaded from: classes2.dex */
public final class q extends y {

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ tr.i0 f35843v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ tr.c0 f35844w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ p.b f35845x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(p.b bVar, tr.i0 i0Var, tr.c0 c0Var) {
        super(p.this.f);
        this.f35845x = bVar;
        this.f35843v = i0Var;
        this.f35844w = c0Var;
    }

    @Override // vr.y
    public final void a() {
        p.b bVar = this.f35845x;
        p pVar = p.this;
        p pVar2 = p.this;
        fs.c cVar = pVar.f35811b;
        fs.b.b();
        fs.b.f15847a.getClass();
        try {
            b();
        } finally {
            fs.c cVar2 = pVar2.f35811b;
            fs.b.d();
        }
    }

    public final void b() {
        tr.i0 i0Var = this.f35843v;
        tr.c0 c0Var = this.f35844w;
        tr.i0 i0Var2 = this.f35845x.f35831b;
        if (i0Var2 != null) {
            c0Var = new tr.c0();
            i0Var = i0Var2;
        }
        p.this.f35819k = true;
        try {
            p.b bVar = this.f35845x;
            p pVar = p.this;
            c.a<RespT> aVar = bVar.f35830a;
            pVar.getClass();
            aVar.a(c0Var, i0Var);
            p.this.g();
            m mVar = p.this.f35814e;
            if (i0Var.e()) {
                mVar.f35764c.add(1L);
            } else {
                mVar.f35765d.add(1L);
            }
        } catch (Throwable th2) {
            p.this.g();
            m mVar2 = p.this.f35814e;
            if (i0Var.e()) {
                mVar2.f35764c.add(1L);
            } else {
                mVar2.f35765d.add(1L);
            }
            throw th2;
        }
    }
}
