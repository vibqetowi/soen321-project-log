package k9;

import com.google.android.gms.common.api.Status;
import k9.e;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class e0 extends p9.f {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f0 f23116b;

    public e0(f0 f0Var) {
        this.f23116b = f0Var;
    }

    @Override // p9.g
    public final void D(int i6) {
        f0.d(this.f23116b, i6);
    }

    @Override // p9.g
    public final void F1(long j10) {
        f0.e(this.f23116b, j10, 0);
    }

    @Override // p9.g
    public final void J(p9.c cVar) {
        f0.c(this.f23116b).post(new androidx.work.n(this, 6, cVar));
    }

    @Override // p9.g
    public final void O1(d dVar, String str, String str2, boolean z10) {
        f0 f0Var = this.f23116b;
        f0Var.f23127t = dVar;
        f0Var.f23128u = str;
        p9.u uVar = new p9.u(new Status(0, null), dVar, str, str2, z10);
        synchronized (f0Var.r) {
            ya.i<e.a> iVar = f0Var.f23123o;
            if (iVar != null) {
                iVar.b(uVar);
            }
            f0Var.f23123o = null;
        }
    }

    @Override // p9.g
    public final void S(String str, byte[] bArr) {
        f0.G.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override // p9.g
    public final void a(String str, String str2) {
        f0.G.b("Receive (type=text, ns=%s) %s", str, str2);
        f0.c(this.f23116b).post(new d0(0, this, str, str2));
    }

    @Override // p9.g
    public final void j(int i6) {
        this.f23116b.i(i6);
    }

    @Override // p9.g
    public final void k(int i6) {
        f0.c(this.f23116b).post(new c0(this, i6, 2));
    }

    @Override // p9.g
    public final void k1(long j10, int i6) {
        f0.e(this.f23116b, j10, i6);
    }

    @Override // p9.g
    public final void l0(int i6) {
        f0.c(this.f23116b).post(new c0(this, i6, 0));
    }

    @Override // p9.g
    public final void p0() {
        f0.G.b("Deprecated callback: \"onStatusReceived\"", new Object[0]);
    }

    @Override // p9.g
    public final void u(int i6) {
        f0.c(this.f23116b).post(new c0(this, i6, 1));
    }

    @Override // p9.g
    public final void w1(p9.a0 a0Var) {
        f0.c(this.f23116b).post(new androidx.work.n(this, 5, a0Var));
    }

    @Override // p9.g
    public final void x(int i6) {
        f0 f0Var = this.f23116b;
        f0.d(f0Var, i6);
        if (f0Var.D != null) {
            f0.c(f0Var).post(new c0(this, i6, 3));
        }
    }

    @Override // p9.g
    public final void y1(int i6) {
        f0.d(this.f23116b, i6);
    }
}
