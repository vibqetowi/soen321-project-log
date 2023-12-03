package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.j1;
import com.google.firebase.components.ComponentRegistrar;
import ee.d;
import hd.b;
import hd.c;
import hd.j;
import java.util.Arrays;
import java.util.List;
import sc.e;
import v9.o;
import wc.a;
/* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.0 */
@Keep
/* loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    public static a lambda$getComponents$0(c cVar) {
        e eVar = (e) cVar.a(e.class);
        Context context = (Context) cVar.a(Context.class);
        d dVar = (d) cVar.a(d.class);
        o.h(eVar);
        o.h(context);
        o.h(dVar);
        o.h(context.getApplicationContext());
        if (wc.c.f36679c == null) {
            synchronized (wc.c.class) {
                if (wc.c.f36679c == null) {
                    Bundle bundle = new Bundle(1);
                    eVar.b();
                    if ("[DEFAULT]".equals(eVar.f31433b)) {
                        dVar.b(wc.d.f36682u, wc.e.f36683a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", eVar.k());
                    }
                    wc.c.f36679c = new wc.c(j1.d(context, bundle).f8439d);
                }
            }
        }
        return wc.c.f36679c;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<b<?>> getComponents() {
        b.a a10 = b.a(a.class);
        a10.a(j.c(e.class));
        a10.a(j.c(Context.class));
        a10.a(j.c(d.class));
        a10.f = uf.c.f34053v;
        a10.c(2);
        return Arrays.asList(a10.b(), mf.e.a("fire-analytics", "21.2.0"));
    }
}
