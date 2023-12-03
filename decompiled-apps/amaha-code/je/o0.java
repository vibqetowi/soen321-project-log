package je;

import je.p;
/* compiled from: SQLiteLruReferenceDelegate.java */
/* loaded from: classes.dex */
public final class o0 implements b0, m {

    /* renamed from: u  reason: collision with root package name */
    public final s0 f21886u;

    /* renamed from: v  reason: collision with root package name */
    public u7.s f21887v;

    /* renamed from: w  reason: collision with root package name */
    public long f21888w = -1;

    /* renamed from: x  reason: collision with root package name */
    public final p f21889x;

    /* renamed from: y  reason: collision with root package name */
    public nd.z f21890y;

    public o0(s0 s0Var, p.b bVar) {
        this.f21886u = s0Var;
        this.f21889x = new p(this, bVar);
    }

    public final void a(ke.i iVar) {
        this.f21886u.F("INSERT OR REPLACE INTO target_documents (target_id, path, sequence_number) VALUES (0, ?, ?)", ca.a.R(iVar.f23275u), Long.valueOf(d()));
    }

    @Override // je.b0
    public final void b() {
        boolean z10;
        if (this.f21888w != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        ca.a.u0(z10, "Committing a transaction without having started one", new Object[0]);
        this.f21888w = -1L;
    }

    @Override // je.b0
    public final void c() {
        boolean z10;
        if (this.f21888w == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        ca.a.u0(z10, "Starting a transaction without committing the previous one", new Object[0]);
        u7.s sVar = this.f21887v;
        long j10 = sVar.f33905a + 1;
        sVar.f33905a = j10;
        this.f21888w = j10;
    }

    @Override // je.b0
    public final long d() {
        boolean z10;
        if (this.f21888w != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        ca.a.u0(z10, "Attempting to get a sequence number outside of a transaction", new Object[0]);
        return this.f21888w;
    }

    @Override // je.b0
    public final void e(ke.i iVar) {
        a(iVar);
    }

    @Override // je.b0
    public final void f(ke.i iVar) {
        a(iVar);
    }

    @Override // je.b0
    public final void g(ke.i iVar) {
        a(iVar);
    }

    @Override // je.b0
    public final void h(nd.z zVar) {
        this.f21890y = zVar;
    }

    @Override // je.b0
    public final void i(ke.i iVar) {
        a(iVar);
    }

    @Override // je.b0
    public final void j(b1 b1Var) {
        this.f21886u.f21923d.g(new b1(b1Var.f21796a, b1Var.f21797b, d(), b1Var.f21799d, b1Var.f21800e, b1Var.f, b1Var.f21801g));
    }
}
