package he;

import android.content.Context;
import je.z0;
/* compiled from: ComponentProvider.java */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public androidx.work.k f17482a;

    /* renamed from: b  reason: collision with root package name */
    public je.k f17483b;

    /* renamed from: c  reason: collision with root package name */
    public c0 f17484c;

    /* renamed from: d  reason: collision with root package name */
    public ne.x f17485d;

    /* renamed from: e  reason: collision with root package name */
    public j f17486e;
    public ne.e f;

    /* renamed from: g  reason: collision with root package name */
    public je.e f17487g;

    /* renamed from: h  reason: collision with root package name */
    public z0 f17488h;

    /* compiled from: ComponentProvider.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Context f17489a;

        /* renamed from: b  reason: collision with root package name */
        public final oe.a f17490b;

        /* renamed from: c  reason: collision with root package name */
        public final e9.c f17491c;

        /* renamed from: d  reason: collision with root package name */
        public final com.google.firebase.firestore.c f17492d;

        public a(Context context, oe.a aVar, e9.c cVar, ne.g gVar, ge.e eVar, com.google.firebase.firestore.c cVar2) {
            this.f17489a = context;
            this.f17490b = aVar;
            this.f17491c = cVar;
            this.f17492d = cVar2;
        }
    }

    public final je.k a() {
        je.k kVar = this.f17483b;
        ca.a.v0(kVar, "localStore not initialized yet", new Object[0]);
        return kVar;
    }

    public final c0 b() {
        c0 c0Var = this.f17484c;
        ca.a.v0(c0Var, "syncEngine not initialized yet", new Object[0]);
        return c0Var;
    }
}
