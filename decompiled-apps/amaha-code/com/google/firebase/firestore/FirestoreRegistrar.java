package com.google.firebase.firestore;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import fe.l;
import hd.b;
import hd.j;
import java.util.Arrays;
import java.util.List;
import mf.f;
import ne.h;
import pe.g;
import sc.e;
@Keep
/* loaded from: classes.dex */
public class FirestoreRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fst";

    public static /* synthetic */ l lambda$getComponents$0(hd.c cVar) {
        return new l((Context) cVar.a(Context.class), (e) cVar.a(e.class), cVar.g(gd.b.class), cVar.g(cd.b.class), new h(cVar.b(f.class), cVar.b(g.class), (sc.f) cVar.a(sc.f.class)));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<hd.b<?>> getComponents() {
        b.a a10 = hd.b.a(l.class);
        a10.f17403a = LIBRARY_NAME;
        a10.a(j.c(e.class));
        a10.a(j.c(Context.class));
        a10.a(j.b(g.class));
        a10.a(j.b(f.class));
        a10.a(j.a(gd.b.class));
        a10.a(j.a(cd.b.class));
        a10.a(new j(0, 0, sc.f.class));
        a10.f = new com.google.firebase.messaging.j(8);
        return Arrays.asList(a10.b(), mf.e.a(LIBRARY_NAME, "24.4.4"));
    }
}
