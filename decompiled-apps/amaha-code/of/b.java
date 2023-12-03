package of;

import j$.util.Objects;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import w5.u;
import ya.g;
import ya.h;
import ya.k;
import ya.v;
/* compiled from: ConfigCacheClient.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: d  reason: collision with root package name */
    public static final HashMap f27437d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public static final oe.f f27438e = new oe.f(7);

    /* renamed from: a  reason: collision with root package name */
    public final Executor f27439a;

    /* renamed from: b  reason: collision with root package name */
    public final e f27440b;

    /* renamed from: c  reason: collision with root package name */
    public v f27441c = null;

    /* compiled from: ConfigCacheClient.java */
    /* loaded from: classes.dex */
    public static class a<TResult> implements ya.f<TResult>, ya.e, ya.c {

        /* renamed from: a  reason: collision with root package name */
        public final CountDownLatch f27442a = new CountDownLatch(1);

        @Override // ya.c
        public final void b() {
            this.f27442a.countDown();
        }

        @Override // ya.e
        public final void onFailure(Exception exc) {
            this.f27442a.countDown();
        }

        @Override // ya.f
        public final void onSuccess(TResult tresult) {
            this.f27442a.countDown();
        }
    }

    public b(Executor executor, e eVar) {
        this.f27439a = executor;
        this.f27440b = eVar;
    }

    public static Object a(h hVar, TimeUnit timeUnit) {
        a aVar = new a();
        Executor executor = f27438e;
        hVar.addOnSuccessListener(executor, aVar);
        hVar.addOnFailureListener(executor, aVar);
        hVar.addOnCanceledListener(executor, aVar);
        if (aVar.f27442a.await(5L, timeUnit)) {
            if (hVar.isSuccessful()) {
                return hVar.getResult();
            }
            throw new ExecutionException(hVar.getException());
        }
        throw new TimeoutException("Task await timed out.");
    }

    public static synchronized b c(Executor executor, e eVar) {
        b bVar;
        synchronized (b.class) {
            String str = eVar.f27455b;
            HashMap hashMap = f27437d;
            if (!hashMap.containsKey(str)) {
                hashMap.put(str, new b(executor, eVar));
            }
            bVar = (b) hashMap.get(str);
        }
        return bVar;
    }

    public final synchronized h<c> b() {
        v vVar = this.f27441c;
        if (vVar == null || (vVar.isComplete() && !this.f27441c.isSuccessful())) {
            Executor executor = this.f27439a;
            e eVar = this.f27440b;
            Objects.requireNonNull(eVar);
            this.f27441c = k.c(executor, new w2.f(6, eVar));
        }
        return this.f27441c;
    }

    public final h<c> d(final c cVar) {
        u uVar = new u(this, 7, cVar);
        Executor executor = this.f27439a;
        return k.c(executor, uVar).onSuccessTask(executor, new g() { // from class: of.a

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ boolean f27435v = true;

            @Override // ya.g
            public final h h(Object obj) {
                b bVar = b.this;
                boolean z10 = this.f27435v;
                c cVar2 = cVar;
                Void r42 = (Void) obj;
                if (z10) {
                    synchronized (bVar) {
                        bVar.f27441c = k.e(cVar2);
                    }
                } else {
                    bVar.getClass();
                }
                return k.e(cVar2);
            }
        });
    }
}
