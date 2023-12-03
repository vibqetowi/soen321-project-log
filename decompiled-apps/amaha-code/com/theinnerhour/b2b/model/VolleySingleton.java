package com.theinnerhour.b2b.model;

import com.android.volley.toolbox.n;
import com.theinnerhour.b2b.MyApplication;
import e4.j;
import e4.k;
/* loaded from: classes2.dex */
public class VolleySingleton {
    private static VolleySingleton ourInstance = new VolleySingleton();
    private k requestQueue;

    private VolleySingleton() {
    }

    public static synchronized VolleySingleton getInstance() {
        VolleySingleton volleySingleton;
        synchronized (VolleySingleton.class) {
            volleySingleton = ourInstance;
        }
        return volleySingleton;
    }

    private void initVolley() {
        this.requestQueue = n.a(MyApplication.V.a());
    }

    public <T> void add(j<T> jVar) {
        if (this.requestQueue == null) {
            initVolley();
        }
        k kVar = this.requestQueue;
        kVar.getClass();
        jVar.setRequestQueue(kVar);
        synchronized (kVar.f13779b) {
            kVar.f13779b.add(jVar);
        }
        jVar.setSequence(kVar.f13778a.incrementAndGet());
        jVar.addMarker("add-to-queue");
        kVar.a(jVar, 0);
        if (!jVar.shouldCache()) {
            kVar.f13781d.add(jVar);
        } else {
            kVar.f13780c.add(jVar);
        }
    }
}
