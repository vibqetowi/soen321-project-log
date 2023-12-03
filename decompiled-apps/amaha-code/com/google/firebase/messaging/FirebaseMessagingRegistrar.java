package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import hd.b;
import java.util.Arrays;
import java.util.List;
@Keep
/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(hd.c cVar) {
        return new FirebaseMessaging((sc.e) cVar.a(sc.e.class), (qe.a) cVar.a(qe.a.class), cVar.b(mf.f.class), cVar.b(pe.g.class), (se.d) cVar.a(se.d.class), (a7.g) cVar.a(a7.g.class), (ee.d) cVar.a(ee.d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<hd.b<?>> getComponents() {
        b.a a10 = hd.b.a(FirebaseMessaging.class);
        a10.f17403a = LIBRARY_NAME;
        a10.a(hd.j.c(sc.e.class));
        a10.a(new hd.j(0, 0, qe.a.class));
        a10.a(hd.j.b(mf.f.class));
        a10.a(hd.j.b(pe.g.class));
        a10.a(new hd.j(0, 0, a7.g.class));
        a10.a(hd.j.c(se.d.class));
        a10.a(hd.j.c(ee.d.class));
        a10.f = new j(10);
        a10.c(1);
        return Arrays.asList(a10.b(), mf.e.a(LIBRARY_NAME, "23.1.2"));
    }
}
