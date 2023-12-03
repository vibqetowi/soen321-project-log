package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import hd.b;
import hd.c;
import hd.j;
import hd.p;
import java.util.Arrays;
import java.util.List;
import mf.e;
import uc.a;
@Keep
/* loaded from: classes.dex */
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    public static /* synthetic */ a a(p pVar) {
        return lambda$getComponents$0(pVar);
    }

    public static /* synthetic */ a lambda$getComponents$0(c cVar) {
        return new a((Context) cVar.a(Context.class), cVar.b(wc.a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b<?>> getComponents() {
        b.a a10 = b.a(a.class);
        a10.f17403a = LIBRARY_NAME;
        a10.a(j.c(Context.class));
        a10.a(j.b(wc.a.class));
        a10.f = new com.google.firebase.messaging.j(0);
        return Arrays.asList(a10.b(), e.a(LIBRARY_NAME, "21.1.0"));
    }
}
