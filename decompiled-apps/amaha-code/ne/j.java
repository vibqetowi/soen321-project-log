package ne;

import java.util.BitSet;
import java.util.concurrent.Executor;
import tr.a;
import tr.c0;
/* compiled from: FirestoreCallCredentials.java */
/* loaded from: classes.dex */
public final class j extends tr.a {

    /* renamed from: c  reason: collision with root package name */
    public static final c0.b f26234c;

    /* renamed from: d  reason: collision with root package name */
    public static final c0.b f26235d;

    /* renamed from: a  reason: collision with root package name */
    public final com.android.volley.toolbox.a f26236a;

    /* renamed from: b  reason: collision with root package name */
    public final com.android.volley.toolbox.a f26237b;

    static {
        c0.a aVar = tr.c0.f33440d;
        BitSet bitSet = c0.d.f33445d;
        f26234c = new c0.b("Authorization", aVar);
        f26235d = new c0.b("x-firebase-appcheck", aVar);
    }

    public j(com.android.volley.toolbox.a aVar, com.android.volley.toolbox.a aVar2) {
        this.f26236a = aVar;
        this.f26237b = aVar2;
    }

    @Override // tr.a
    public final void a(a.b bVar, Executor executor, a.AbstractC0558a abstractC0558a) {
        ya.h j10 = this.f26236a.j();
        ya.h j11 = this.f26237b.j();
        ya.k.g(j10, j11).addOnCompleteListener(oe.g.f27421b, new i(j10, abstractC0558a, j11));
    }
}
