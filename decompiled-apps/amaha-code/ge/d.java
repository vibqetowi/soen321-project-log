package ge;

import am.w;
import com.google.firebase.FirebaseApiNotAvailableException;
import hd.n;
import oe.g;
import oe.j;
import ya.h;
import ya.k;
import ya.v;
/* compiled from: FirebaseAuthCredentialsProvider.java */
/* loaded from: classes.dex */
public final class d extends com.android.volley.toolbox.a {

    /* renamed from: v  reason: collision with root package name */
    public final c f16462v = new gd.a() { // from class: ge.c
        @Override // gd.a
        public final void a(we.b bVar) {
            d.this.K();
        }
    };

    /* renamed from: w  reason: collision with root package name */
    public gd.b f16463w;

    /* renamed from: x  reason: collision with root package name */
    public j<e> f16464x;

    /* renamed from: y  reason: collision with root package name */
    public int f16465y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f16466z;

    /* JADX WARN: Type inference failed for: r0v0, types: [ge.c] */
    public d(re.a<gd.b> aVar) {
        ((n) aVar).a(new w(2, this));
    }

    public final synchronized e J() {
        String a10;
        e eVar;
        gd.b bVar = this.f16463w;
        if (bVar == null) {
            a10 = null;
        } else {
            a10 = bVar.a();
        }
        if (a10 != null) {
            eVar = new e(a10);
        } else {
            eVar = e.f16467b;
        }
        return eVar;
    }

    public final synchronized void K() {
        this.f16465y++;
        j<e> jVar = this.f16464x;
        if (jVar != null) {
            jVar.b(J());
        }
    }

    @Override // com.android.volley.toolbox.a
    public final synchronized h<String> j() {
        gd.b bVar = this.f16463w;
        if (bVar == null) {
            return k.d(new FirebaseApiNotAvailableException("auth is not available"));
        }
        v c10 = bVar.c(this.f16466z);
        this.f16466z = false;
        return c10.continueWithTask(g.f27421b, new o7.k(this.f16465y, this));
    }

    @Override // com.android.volley.toolbox.a
    public final synchronized void l() {
        this.f16466z = true;
    }

    @Override // com.android.volley.toolbox.a
    public final synchronized void q(j<e> jVar) {
        this.f16464x = jVar;
        jVar.b(J());
    }
}
