package com.google.firebase.auth;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import gd.j0;
import hc.d;
import hd.b;
import hd.c;
import hd.j;
import java.util.Arrays;
import java.util.List;
import pe.f;
import sc.e;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
@Keep
/* loaded from: classes.dex */
public class FirebaseAuthRegistrar implements ComponentRegistrar {
    public static /* synthetic */ FirebaseAuth lambda$getComponents$0(c cVar) {
        return new j0((e) cVar.a(e.class), cVar.b(f.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<hd.b<?>> getComponents() {
        b.a aVar = new b.a(FirebaseAuth.class, new Class[]{gd.b.class});
        aVar.a(j.c(e.class));
        aVar.a(new j(1, 1, f.class));
        aVar.f = kc.f.f23214b0;
        aVar.c(2);
        d dVar = new d();
        b.a a10 = hd.b.a(pe.e.class);
        a10.f17407e = 1;
        a10.f = new hd.a(0, dVar);
        return Arrays.asList(aVar.b(), a10.b(), mf.e.a("fire-auth", "21.1.0"));
    }
}
