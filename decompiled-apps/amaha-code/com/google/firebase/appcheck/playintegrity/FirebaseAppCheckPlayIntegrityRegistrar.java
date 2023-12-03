package com.google.firebase.appcheck.playintegrity;

import com.google.firebase.components.ComponentRegistrar;
import dd.a;
import hd.b;
import hd.j;
import hd.o;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import sc.e;
import yc.c;
/* loaded from: classes.dex */
public class FirebaseAppCheckPlayIntegrityRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<b<?>> getComponents() {
        o oVar = new o(c.class, Executor.class);
        o oVar2 = new o(yc.b.class, Executor.class);
        b.a a10 = b.a(ed.c.class);
        a10.f17403a = "fire-app-check-play-integrity";
        a10.a(j.c(e.class));
        a10.a(new j(oVar, 1, 0));
        a10.a(new j(oVar2, 1, 0));
        a10.f = new a(oVar, 0, oVar2);
        return Arrays.asList(a10.b(), mf.e.a("fire-app-check-play-integrity", "16.1.2"));
    }
}
