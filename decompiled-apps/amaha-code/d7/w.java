package d7;

import android.content.Context;
import d7.j;
import java.util.Collections;
import java.util.Set;
/* compiled from: TransportRuntime.java */
/* loaded from: classes.dex */
public final class w implements v {

    /* renamed from: e  reason: collision with root package name */
    public static volatile k f12267e;

    /* renamed from: a  reason: collision with root package name */
    public final m7.a f12268a;

    /* renamed from: b  reason: collision with root package name */
    public final m7.a f12269b;

    /* renamed from: c  reason: collision with root package name */
    public final i7.c f12270c;

    /* renamed from: d  reason: collision with root package name */
    public final j7.j f12271d;

    public w(m7.a aVar, m7.a aVar2, i7.c cVar, j7.j jVar, j7.l lVar) {
        this.f12268a = aVar;
        this.f12269b = aVar2;
        this.f12270c = cVar;
        this.f12271d = jVar;
        lVar.getClass();
        lVar.f21738a.execute(new androidx.activity.b(17, lVar));
    }

    public static w a() {
        k kVar = f12267e;
        if (kVar != null) {
            return kVar.f12252z.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f12267e == null) {
            synchronized (w.class) {
                if (f12267e == null) {
                    context.getClass();
                    f12267e = new k(context);
                }
            }
        }
    }

    public final t c(b7.a aVar) {
        Set singleton;
        if (aVar instanceof l) {
            aVar.getClass();
            singleton = Collections.unmodifiableSet(b7.a.f3949d);
        } else {
            singleton = Collections.singleton(new a7.b("proto"));
        }
        j.a a10 = s.a();
        aVar.getClass();
        a10.b("cct");
        a10.f12245b = aVar.b();
        return new t(singleton, a10.a(), this);
    }
}
