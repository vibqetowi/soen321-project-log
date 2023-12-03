package t0;

import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: MenuHostHelper.java */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f32331a;

    /* renamed from: b  reason: collision with root package name */
    public final CopyOnWriteArrayList<n> f32332b = new CopyOnWriteArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f32333c = new HashMap();

    /* compiled from: MenuHostHelper.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final androidx.lifecycle.j f32334a;

        /* renamed from: b  reason: collision with root package name */
        public androidx.lifecycle.n f32335b;

        public a(androidx.lifecycle.j jVar, androidx.lifecycle.n nVar) {
            this.f32334a = jVar;
            this.f32335b = nVar;
            jVar.a(nVar);
        }
    }

    public l(Runnable runnable) {
        this.f32331a = runnable;
    }

    public final void a(n nVar) {
        this.f32332b.remove(nVar);
        a aVar = (a) this.f32333c.remove(nVar);
        if (aVar != null) {
            aVar.f32334a.c(aVar.f32335b);
            aVar.f32335b = null;
        }
        this.f32331a.run();
    }
}
