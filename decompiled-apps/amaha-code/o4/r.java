package o4;

import com.bumptech.glide.Registry;
import e5.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import o4.n;
/* compiled from: MultiModelLoaderFactory.java */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: e  reason: collision with root package name */
    public static final c f27094e = new c();
    public static final a f = new a();

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f27095a;

    /* renamed from: b  reason: collision with root package name */
    public final c f27096b;

    /* renamed from: c  reason: collision with root package name */
    public final HashSet f27097c;

    /* renamed from: d  reason: collision with root package name */
    public final s0.d<List<Throwable>> f27098d;

    /* compiled from: MultiModelLoaderFactory.java */
    /* loaded from: classes.dex */
    public static class a implements n<Object, Object> {
        @Override // o4.n
        public final boolean a(Object obj) {
            return false;
        }

        @Override // o4.n
        public final n.a<Object> b(Object obj, int i6, int i10, h4.g gVar) {
            return null;
        }
    }

    /* compiled from: MultiModelLoaderFactory.java */
    /* loaded from: classes.dex */
    public static class b<Model, Data> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<Model> f27099a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<Data> f27100b;

        /* renamed from: c  reason: collision with root package name */
        public final o<? extends Model, ? extends Data> f27101c;

        public b(Class<Model> cls, Class<Data> cls2, o<? extends Model, ? extends Data> oVar) {
            this.f27099a = cls;
            this.f27100b = cls2;
            this.f27101c = oVar;
        }
    }

    /* compiled from: MultiModelLoaderFactory.java */
    /* loaded from: classes.dex */
    public static class c {
    }

    public r(a.c cVar) {
        c cVar2 = f27094e;
        this.f27095a = new ArrayList();
        this.f27097c = new HashSet();
        this.f27098d = cVar;
        this.f27096b = cVar2;
    }

    public final synchronized <Model, Data> void a(Class<Model> cls, Class<Data> cls2, o<? extends Model, ? extends Data> oVar) {
        b bVar = new b(cls, cls2, oVar);
        ArrayList arrayList = this.f27095a;
        arrayList.add(arrayList.size(), bVar);
    }

    public final synchronized ArrayList b(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f27095a.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (!this.f27097c.contains(bVar) && bVar.f27099a.isAssignableFrom(cls)) {
                    this.f27097c.add(bVar);
                    n b10 = bVar.f27101c.b(this);
                    kc.f.p(b10);
                    arrayList.add(b10);
                    this.f27097c.remove(bVar);
                }
            }
        } catch (Throwable th2) {
            this.f27097c.clear();
            throw th2;
        }
        return arrayList;
    }

    public final synchronized <Model, Data> n<Model, Data> c(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f27095a.iterator();
            boolean z10 = false;
            while (true) {
                boolean z11 = true;
                if (!it.hasNext()) {
                    break;
                }
                b<?, ?> bVar = (b) it.next();
                if (this.f27097c.contains(bVar)) {
                    z10 = true;
                } else {
                    if (!bVar.f27099a.isAssignableFrom(cls) || !bVar.f27100b.isAssignableFrom(cls2)) {
                        z11 = false;
                    }
                    if (z11) {
                        this.f27097c.add(bVar);
                        arrayList.add(d(bVar));
                        this.f27097c.remove(bVar);
                    }
                }
            }
            if (arrayList.size() > 1) {
                c cVar = this.f27096b;
                s0.d<List<Throwable>> dVar = this.f27098d;
                cVar.getClass();
                return new q(arrayList, dVar);
            } else if (arrayList.size() == 1) {
                return (n) arrayList.get(0);
            } else if (z10) {
                return f;
            } else {
                throw new Registry.NoModelLoaderAvailableException((Class<?>) cls, (Class<?>) cls2);
            }
        } catch (Throwable th2) {
            this.f27097c.clear();
            throw th2;
        }
    }

    public final <Model, Data> n<Model, Data> d(b<?, ?> bVar) {
        n<Model, Data> nVar = (n<Model, Data>) bVar.f27101c.b(this);
        kc.f.p(nVar);
        return nVar;
    }

    public final synchronized ArrayList e(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f27095a.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (!arrayList.contains(bVar.f27100b) && bVar.f27099a.isAssignableFrom(cls)) {
                arrayList.add(bVar.f27100b);
            }
        }
        return arrayList;
    }
}
