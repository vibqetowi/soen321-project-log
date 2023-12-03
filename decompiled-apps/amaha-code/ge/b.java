package ge;

import am.w;
import com.google.firebase.FirebaseApiNotAvailableException;
import d9.p;
import hd.n;
import kc.f;
import oe.g;
import oe.j;
import ya.h;
import ya.k;
/* compiled from: FirebaseAppCheckTokenProvider.java */
/* loaded from: classes.dex */
public final class b extends com.android.volley.toolbox.a {

    /* renamed from: v  reason: collision with root package name */
    public j<String> f16457v;

    /* renamed from: w  reason: collision with root package name */
    public cd.b f16458w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f16459x;

    /* renamed from: y  reason: collision with root package name */
    public final a f16460y = new cd.a() { // from class: ge.a
        @Override // cd.a
        public final void onAppCheckTokenChanged(zc.c cVar) {
            b bVar = b.this;
            synchronized (bVar) {
                if (((ad.c) cVar).f482b != null) {
                    f.A(2, "FirebaseAppCheckTokenProvider", "Error getting App Check token; using placeholder token instead. Error: " + ((ad.c) cVar).f482b, new Object[0]);
                }
                j<String> jVar = bVar.f16457v;
                if (jVar != null) {
                    jVar.b(((ad.c) cVar).f481a);
                }
            }
        }
    };

    /* JADX WARN: Type inference failed for: r0v0, types: [ge.a] */
    public b(re.a<cd.b> aVar) {
        ((n) aVar).a(new w(1, this));
    }

    @Override // com.android.volley.toolbox.a
    public final synchronized h<String> j() {
        cd.b bVar = this.f16458w;
        if (bVar == null) {
            return k.d(new FirebaseApiNotAvailableException("AppCheck is not available"));
        }
        h<zc.c> b10 = bVar.b(this.f16459x);
        this.f16459x = false;
        return b10.continueWithTask(g.f27421b, new p(21));
    }

    @Override // com.android.volley.toolbox.a
    public final synchronized void l() {
        this.f16459x = true;
    }

    @Override // com.android.volley.toolbox.a
    public final synchronized void q(j<String> jVar) {
        this.f16457v = jVar;
    }
}
