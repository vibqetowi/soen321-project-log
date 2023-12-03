package com.google.firebase.appcheck;

import com.google.firebase.components.ComponentRegistrar;
import hd.b;
import hd.j;
import hd.o;
import hd.p;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import pe.f;
import sc.e;
import yc.a;
import yc.c;
import yc.d;
/* loaded from: classes.dex */
public class FirebaseAppCheckRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<b<?>> getComponents() {
        final o oVar = new o(d.class, Executor.class);
        final o oVar2 = new o(c.class, Executor.class);
        final o oVar3 = new o(a.class, Executor.class);
        final o oVar4 = new o(yc.b.class, ScheduledExecutorService.class);
        b.a aVar = new b.a(zc.d.class, new Class[]{cd.b.class});
        aVar.f17403a = "fire-app-check";
        aVar.a(j.c(e.class));
        aVar.a(new j(oVar, 1, 0));
        aVar.a(new j(oVar2, 1, 0));
        aVar.a(new j(oVar3, 1, 0));
        aVar.a(new j(oVar4, 1, 0));
        aVar.a(j.b(f.class));
        aVar.f = new hd.e() { // from class: zc.e
            @Override // hd.e
            public final Object e(p pVar) {
                return new ad.d((sc.e) pVar.a(sc.e.class), pVar.b(f.class), (Executor) pVar.e(o.this), (Executor) pVar.e(oVar2), (Executor) pVar.e(oVar3), (ScheduledExecutorService) pVar.e(oVar4));
            }
        };
        aVar.c(1);
        hc.d dVar = new hc.d();
        b.a a10 = b.a(pe.e.class);
        a10.f17407e = 1;
        a10.f = new hd.a(0, dVar);
        return Arrays.asList(aVar.b(), a10.b(), mf.e.a("fire-app-check", "16.1.2"));
    }
}
