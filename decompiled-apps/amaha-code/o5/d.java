package o5;

import android.content.Context;
import g.v;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import o5.e;
/* compiled from: InAppPurchaseAutoLogger.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f27127a = new d();

    public static final void b(Context context) {
        AtomicBoolean atomicBoolean;
        e a10;
        if (b6.a.b(d.class)) {
            return;
        }
        try {
            if (j.a("com.android.billingclient.api.Purchase") == null) {
                return;
            }
            synchronized (e.f27128s) {
                AtomicBoolean atomicBoolean2 = null;
                if (b6.a.b(e.class)) {
                    atomicBoolean = null;
                } else {
                    atomicBoolean = e.f27129t;
                }
                if (atomicBoolean.get()) {
                    a10 = e.a();
                } else {
                    e.b.a(context);
                    if (!b6.a.b(e.class)) {
                        atomicBoolean2 = e.f27129t;
                    }
                    atomicBoolean2.set(true);
                    a10 = e.a();
                }
            }
            if (a10 != null && e.b.c().get()) {
                if (g.d()) {
                    i5.b bVar = new i5.b(7);
                    if (!b6.a.b(a10)) {
                        a10.c(new v(a10, 23, bVar));
                        return;
                    }
                    return;
                }
                a10.b(new i5.b(8));
            }
        } catch (Throwable th2) {
            b6.a.a(d.class, th2);
        }
    }

    public final void a() {
        ConcurrentHashMap concurrentHashMap;
        if (b6.a.b(this)) {
            return;
        }
        try {
            g gVar = g.f27159a;
            e.b bVar = e.f27128s;
            ConcurrentHashMap b10 = e.b.b();
            if (!b6.a.b(e.class)) {
                concurrentHashMap = e.f27133x;
            } else {
                concurrentHashMap = null;
            }
            g.e(b10, concurrentHashMap);
            e.b.b().clear();
        } catch (Throwable th2) {
            b6.a.a(this, th2);
        }
    }
}
