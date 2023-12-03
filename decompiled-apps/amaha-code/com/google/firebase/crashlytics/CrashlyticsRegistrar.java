package com.google.firebase.crashlytics;

import com.google.firebase.components.ComponentRegistrar;
import hd.b;
import hd.j;
import java.util.Arrays;
import java.util.List;
import jd.e;
import kd.a;
import se.d;
/* loaded from: classes.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<b<?>> getComponents() {
        b.a a10 = b.a(e.class);
        a10.f17403a = "fire-cls";
        a10.a(j.c(sc.e.class));
        a10.a(j.c(d.class));
        a10.a(j.a(a.class));
        a10.a(j.a(wc.a.class));
        a10.f = new hd.a(2, this);
        a10.c(2);
        return Arrays.asList(a10.b(), mf.e.a("fire-cls", "18.3.5"));
    }
}
