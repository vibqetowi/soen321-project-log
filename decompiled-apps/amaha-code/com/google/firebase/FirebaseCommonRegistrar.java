package com.google.firebase;

import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import d9.p;
import hd.b;
import hd.j;
import hd.o;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import mf.d;
import mf.f;
import pe.c;
import pe.g;
import sc.e;
import yc.a;
/* loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<b<?>> getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        b.a a10 = b.a(f.class);
        a10.a(new j(2, 0, d.class));
        a10.f = new com.google.firebase.messaging.j(12);
        arrayList.add(a10.b());
        o oVar = new o(a.class, Executor.class);
        b.a aVar = new b.a(pe.d.class, new Class[]{pe.f.class, g.class});
        aVar.a(j.c(Context.class));
        aVar.a(j.c(e.class));
        aVar.a(new j(2, 0, pe.e.class));
        aVar.a(new j(1, 1, f.class));
        aVar.a(new j(oVar, 1, 0));
        aVar.f = new c(oVar, 0);
        arrayList.add(aVar.b());
        arrayList.add(mf.e.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(mf.e.a("fire-core", "20.3.1"));
        arrayList.add(mf.e.a("device-name", a(Build.PRODUCT)));
        arrayList.add(mf.e.a("device-model", a(Build.DEVICE)));
        arrayList.add(mf.e.a("device-brand", a(Build.BRAND)));
        arrayList.add(mf.e.b("android-target-sdk", new p(2)));
        arrayList.add(mf.e.b("android-min-sdk", new p(3)));
        arrayList.add(mf.e.b("android-platform", new p(4)));
        arrayList.add(mf.e.b("android-installer", new p(5)));
        try {
            str = hs.c.f19459y.toString();
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(mf.e.a("kotlin", str));
        }
        return arrayList;
    }
}
