package z3;

import java.util.concurrent.ArrayBlockingQueue;
/* compiled from: EventBridge.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final e f39144a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f39145b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayBlockingQueue<a> f39146c = new ArrayBlockingQueue<>(512);

    public b(e eVar) {
        this.f39144a = eVar;
    }

    public final void a(a aVar) {
        synchronized (this.f39145b) {
            this.f39146c.offer(aVar);
        }
    }
}
