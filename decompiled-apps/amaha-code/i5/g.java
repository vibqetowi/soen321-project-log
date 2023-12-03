package i5;
/* compiled from: AppEventStore.kt */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f19857a = 0;

    static {
        new g();
    }

    public static final synchronized void a(a aVar, q qVar) {
        synchronized (g.class) {
            if (b6.a.b(g.class)) {
                return;
            }
            int i6 = q5.d.f29148a;
            p a10 = e.a();
            a10.a(aVar, qVar.d());
            e.b(a10);
        }
    }

    public static final synchronized void b(w.d eventsToPersist) {
        synchronized (g.class) {
            if (b6.a.b(g.class)) {
                return;
            }
            kotlin.jvm.internal.i.g(eventsToPersist, "eventsToPersist");
            int i6 = q5.d.f29148a;
            p a10 = e.a();
            for (a aVar : eventsToPersist.f()) {
                q b10 = eventsToPersist.b(aVar);
                if (b10 != null) {
                    a10.a(aVar, b10.d());
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            }
            e.b(a10);
        }
    }
}
