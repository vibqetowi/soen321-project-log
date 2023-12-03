package com.google.firebase.dynamiclinks.internal;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import hd.b;
import hd.c;
import hd.j;
import java.util.Arrays;
import java.util.List;
import wd.a;
import xd.e;
@Keep
/* loaded from: classes.dex */
public final class FirebaseDynamicLinkRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-dl";

    public static /* synthetic */ a lambda$getComponents$0(c cVar) {
        return new e((sc.e) cVar.a(sc.e.class), cVar.b(wc.a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<b<?>> getComponents() {
        b.a a10 = b.a(a.class);
        a10.f17403a = LIBRARY_NAME;
        a10.a(j.c(sc.e.class));
        a10.a(j.b(wc.a.class));
        a10.f = new com.google.firebase.messaging.j(7);
        return Arrays.asList(a10.b(), mf.e.a(LIBRARY_NAME, "21.1.0"));
    }
}
