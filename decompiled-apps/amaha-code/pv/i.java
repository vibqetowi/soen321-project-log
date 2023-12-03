package pv;

import hs.k;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import lv.g0;
import pv.d;
/* compiled from: RealConnectionPool.kt */
/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final int f29080a;

    /* renamed from: b  reason: collision with root package name */
    public final long f29081b;

    /* renamed from: c  reason: collision with root package name */
    public final ov.c f29082c;

    /* renamed from: d  reason: collision with root package name */
    public final h f29083d;

    /* renamed from: e  reason: collision with root package name */
    public final ConcurrentLinkedQueue<e> f29084e;

    public i(ov.d taskRunner, TimeUnit timeUnit) {
        kotlin.jvm.internal.i.g(taskRunner, "taskRunner");
        kotlin.jvm.internal.i.g(timeUnit, "timeUnit");
        this.f29080a = 5;
        this.f29081b = timeUnit.toNanos(5L);
        this.f29082c = taskRunner.f();
        this.f29083d = new h(this, kotlin.jvm.internal.i.n(" ConnectionPool", mv.b.f25760g));
        this.f29084e = new ConcurrentLinkedQueue<>();
    }

    public final boolean a(lv.a address, d call, List<g0> list, boolean z10) {
        kotlin.jvm.internal.i.g(address, "address");
        kotlin.jvm.internal.i.g(call, "call");
        Iterator<e> it = this.f29084e.iterator();
        while (true) {
            boolean z11 = false;
            if (!it.hasNext()) {
                return false;
            }
            e connection = it.next();
            kotlin.jvm.internal.i.f(connection, "connection");
            synchronized (connection) {
                if (z10) {
                    if (connection.f29063g != null) {
                        z11 = true;
                    }
                    if (!z11) {
                        k kVar = k.f19476a;
                    }
                }
                if (connection.i(address, list)) {
                    call.b(connection);
                    return true;
                }
                k kVar2 = k.f19476a;
            }
        }
    }

    public final int b(e eVar, long j10) {
        byte[] bArr = mv.b.f25755a;
        ArrayList arrayList = eVar.f29072p;
        int i6 = 0;
        while (i6 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i6);
            if (reference.get() != null) {
                i6++;
            } else {
                uv.h hVar = uv.h.f34614a;
                uv.h.f34614a.k(((d.b) reference).f29057a, "A connection to " + eVar.f29059b.f24612a.f24535i + " was leaked. Did you forget to close a response body?");
                arrayList.remove(i6);
                eVar.f29066j = true;
                if (arrayList.isEmpty()) {
                    eVar.f29073q = j10 - this.f29081b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
