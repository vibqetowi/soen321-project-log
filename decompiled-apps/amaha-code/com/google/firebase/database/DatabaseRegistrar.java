package com.google.firebase.database;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import gd.b;
import hd.b;
import hd.c;
import hd.j;
import java.util.Arrays;
import java.util.List;
import sc.e;
@Keep
/* loaded from: classes.dex */
public class DatabaseRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rtdb";

    public static /* synthetic */ FirebaseDatabaseComponent lambda$getComponents$0(c cVar) {
        return new FirebaseDatabaseComponent((e) cVar.a(e.class), cVar.g(b.class), cVar.g(cd.b.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<hd.b<?>> getComponents() {
        b.a a10 = hd.b.a(FirebaseDatabaseComponent.class);
        a10.f17403a = LIBRARY_NAME;
        a10.a(j.c(e.class));
        a10.a(j.a(gd.b.class));
        a10.a(j.a(cd.b.class));
        a10.f = new com.google.firebase.messaging.j(5);
        return Arrays.asList(a10.b(), mf.e.a(LIBRARY_NAME, "20.1.0"));
    }
}
