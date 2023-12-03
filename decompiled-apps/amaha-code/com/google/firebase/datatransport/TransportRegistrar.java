package com.google.firebase.datatransport;

import a7.g;
import android.content.Context;
import androidx.annotation.Keep;
import b7.a;
import com.google.firebase.components.ComponentRegistrar;
import d7.w;
import hd.b;
import hd.c;
import hd.j;
import java.util.Arrays;
import java.util.List;
import mf.e;
@Keep
/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public static /* synthetic */ g lambda$getComponents$0(c cVar) {
        w.b((Context) cVar.a(Context.class));
        return w.a().c(a.f);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b<?>> getComponents() {
        b.a a10 = b.a(g.class);
        a10.f17403a = LIBRARY_NAME;
        a10.a(j.c(Context.class));
        a10.f = new com.google.firebase.messaging.j(6);
        return Arrays.asList(a10.b(), e.a(LIBRARY_NAME, "18.1.7"));
    }
}
