package com.google.firebase.perf;

import androidx.annotation.Keep;
import cf.a;
import com.google.android.gms.internal.p000firebaseauthapi.qd;
import com.google.firebase.components.ComponentRegistrar;
import hd.b;
import hd.c;
import hd.j;
import hd.o;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import nf.f;
import sc.e;
import sc.g;
import se.d;
import ze.b;
@Keep
/* loaded from: classes.dex */
public class FirebasePerfRegistrar implements ComponentRegistrar {
    private static final String EARLY_LIBRARY_NAME = "fire-perf-early";
    private static final String LIBRARY_NAME = "fire-perf";

    public static /* synthetic */ b lambda$getComponents$0(o oVar, c cVar) {
        return new b((e) cVar.a(e.class), (g) cVar.b(g.class).get(), (Executor) cVar.e(oVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [sr.a] */
    public static ze.c providesFirebasePerformance(c cVar) {
        cVar.a(b.class);
        a aVar = new a((e) cVar.a(e.class), (d) cVar.a(d.class), cVar.b(f.class), cVar.b(a7.g.class));
        qd qdVar = new qd(new cf.b(aVar, 1), new cf.b(aVar, 3), new cf.b(aVar, 2), new cf.b(aVar, 6), new cf.b(aVar, 4), new cf.b(aVar, 0), new cf.b(aVar, 5), 2);
        Object obj = sr.a.f31927w;
        if (!(qdVar instanceof sr.a)) {
            qdVar = new sr.a(qdVar);
        }
        return (ze.c) qdVar.get();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<hd.b<?>> getComponents() {
        o oVar = new o(yc.d.class, Executor.class);
        b.a a10 = hd.b.a(ze.c.class);
        a10.f17403a = LIBRARY_NAME;
        a10.a(j.c(e.class));
        a10.a(new j(1, 1, f.class));
        a10.a(j.c(d.class));
        a10.a(new j(1, 1, a7.g.class));
        a10.a(j.c(ze.b.class));
        a10.f = new com.google.firebase.messaging.j(11);
        b.a a11 = hd.b.a(ze.b.class);
        a11.f17403a = EARLY_LIBRARY_NAME;
        a11.a(j.c(e.class));
        a11.a(j.b(g.class));
        a11.a(new j(oVar, 1, 0));
        a11.c(2);
        a11.f = new pe.c(oVar, 1);
        return Arrays.asList(a10.b(), a11.b(), mf.e.a(LIBRARY_NAME, "20.3.1"));
    }
}
