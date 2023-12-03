package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import hd.b;
import hd.c;
import hd.j;
import hd.o;
import id.h;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import pe.f;
import sc.e;
import se.d;
import yc.a;
import yc.b;
@Keep
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    public static d lambda$getComponents$0(c cVar) {
        return new se.c((e) cVar.a(e.class), cVar.b(f.class), (ExecutorService) cVar.e(new o(a.class, ExecutorService.class)), new h((Executor) cVar.e(new o(b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<hd.b<?>> getComponents() {
        b.a a10 = hd.b.a(d.class);
        a10.f17403a = LIBRARY_NAME;
        a10.a(j.c(e.class));
        a10.a(j.b(f.class));
        a10.a(new j(new o(a.class, ExecutorService.class), 1, 0));
        a10.a(new j(new o(yc.b.class, Executor.class), 1, 0));
        a10.f = new com.google.firebase.messaging.j(9);
        hc.d dVar = new hc.d();
        b.a a11 = hd.b.a(pe.e.class);
        a11.f17407e = 1;
        a11.f = new hd.a(0, dVar);
        return Arrays.asList(a10.b(), a11.b(), mf.e.a(LIBRARY_NAME, "17.1.3"));
    }
}
