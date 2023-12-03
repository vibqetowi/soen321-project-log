package hd;

import com.google.firebase.messaging.q;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: EventBus.java */
/* loaded from: classes.dex */
public final class k implements ee.d, ee.c {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f17426a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public ArrayDeque f17427b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    public final Executor f17428c;

    public k(Executor executor) {
        this.f17428c = executor;
    }

    @Override // ee.d
    public final void a(q qVar) {
        b(this.f17428c, qVar);
    }

    @Override // ee.d
    public final synchronized void b(Executor executor, ee.b bVar) {
        executor.getClass();
        if (!this.f17426a.containsKey(sc.b.class)) {
            this.f17426a.put(sc.b.class, new ConcurrentHashMap());
        }
        ((ConcurrentHashMap) this.f17426a.get(sc.b.class)).put(bVar, executor);
    }

    public final synchronized Set<Map.Entry<ee.b<Object>, Executor>> c(ee.a<?> aVar) {
        Set<Map.Entry<ee.b<Object>, Executor>> entrySet;
        HashMap hashMap = this.f17426a;
        aVar.getClass();
        Map map = (Map) hashMap.get(null);
        if (map == null) {
            entrySet = Collections.emptySet();
        } else {
            entrySet = map.entrySet();
        }
        return entrySet;
    }

    public final void d(ee.a<?> aVar) {
        aVar.getClass();
        synchronized (this) {
            ArrayDeque arrayDeque = this.f17427b;
            if (arrayDeque != null) {
                arrayDeque.add(aVar);
                return;
            }
            for (Map.Entry<ee.b<Object>, Executor> entry : c(aVar)) {
                entry.getValue().execute(new q7.f(entry, 14, aVar));
            }
        }
    }
}
