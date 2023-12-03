package com.android.volley.toolbox;

import com.theinnerhour.b2b.MyApplication;
/* compiled from: Volley.java */
/* loaded from: classes.dex */
public final class n {
    public static e4.k a(MyApplication myApplication) {
        e4.h[] hVarArr;
        e4.k kVar = new e4.k(new d(new m(myApplication.getApplicationContext())), new b(new g()));
        e4.c cVar = kVar.f13785i;
        if (cVar != null) {
            cVar.b();
        }
        for (e4.h hVar : kVar.f13784h) {
            if (hVar != null) {
                hVar.f13767y = true;
                hVar.interrupt();
            }
        }
        e4.c cVar2 = new e4.c(kVar.f13780c, kVar.f13781d, kVar.f13782e, kVar.f13783g);
        kVar.f13785i = cVar2;
        cVar2.start();
        for (int i6 = 0; i6 < kVar.f13784h.length; i6++) {
            e4.h hVar2 = new e4.h(kVar.f13781d, kVar.f, kVar.f13782e, kVar.f13783g);
            kVar.f13784h[i6] = hVar2;
            hVar2.start();
        }
        return kVar;
    }
}
