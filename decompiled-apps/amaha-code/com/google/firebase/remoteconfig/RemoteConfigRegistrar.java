package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import hd.b;
import hd.c;
import hd.j;
import hd.o;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import nf.f;
import sc.e;
import se.d;
import tc.b;
import uc.a;
@Keep
/* loaded from: classes.dex */
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    public static f lambda$getComponents$0(o oVar, c cVar) {
        b bVar;
        Context context = (Context) cVar.a(Context.class);
        Executor executor = (Executor) cVar.e(oVar);
        e eVar = (e) cVar.a(e.class);
        d dVar = (d) cVar.a(d.class);
        a aVar = (a) cVar.a(a.class);
        synchronized (aVar) {
            if (!aVar.f33998a.containsKey("frc")) {
                aVar.f33998a.put("frc", new b(aVar.f33999b));
            }
            bVar = (b) aVar.f33998a.get("frc");
        }
        return new f(context, executor, eVar, dVar, bVar, cVar.b(wc.a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<hd.b<?>> getComponents() {
        o oVar = new o(yc.b.class, Executor.class);
        b.a a10 = hd.b.a(f.class);
        a10.f17403a = LIBRARY_NAME;
        a10.a(j.c(Context.class));
        a10.a(new j(oVar, 1, 0));
        a10.a(j.c(e.class));
        a10.a(j.c(d.class));
        a10.a(j.c(a.class));
        a10.a(j.b(wc.a.class));
        a10.f = new pe.c(oVar, 2);
        a10.c(2);
        return Arrays.asList(a10.b(), mf.e.a(LIBRARY_NAME, "21.2.1"));
    }
}
