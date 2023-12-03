package k4;

import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k4.j;
import o4.n;
import y4.a;
/* compiled from: DecodeHelper.java */
/* loaded from: classes.dex */
public final class i<Transcode> {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f22843a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f22844b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public com.bumptech.glide.c f22845c;

    /* renamed from: d  reason: collision with root package name */
    public Object f22846d;

    /* renamed from: e  reason: collision with root package name */
    public int f22847e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public Class<?> f22848g;

    /* renamed from: h  reason: collision with root package name */
    public j.d f22849h;

    /* renamed from: i  reason: collision with root package name */
    public h4.g f22850i;

    /* renamed from: j  reason: collision with root package name */
    public Map<Class<?>, h4.k<?>> f22851j;

    /* renamed from: k  reason: collision with root package name */
    public Class<Transcode> f22852k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f22853l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f22854m;

    /* renamed from: n  reason: collision with root package name */
    public h4.e f22855n;

    /* renamed from: o  reason: collision with root package name */
    public com.bumptech.glide.d f22856o;

    /* renamed from: p  reason: collision with root package name */
    public l f22857p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f22858q;
    public boolean r;

    public final ArrayList a() {
        boolean z10 = this.f22854m;
        ArrayList arrayList = this.f22844b;
        if (!z10) {
            this.f22854m = true;
            arrayList.clear();
            ArrayList b10 = b();
            int size = b10.size();
            for (int i6 = 0; i6 < size; i6++) {
                n.a aVar = (n.a) b10.get(i6);
                if (!arrayList.contains(aVar.f27079a)) {
                    arrayList.add(aVar.f27079a);
                }
                int i10 = 0;
                while (true) {
                    List<h4.e> list = aVar.f27080b;
                    if (i10 < list.size()) {
                        if (!arrayList.contains(list.get(i10))) {
                            arrayList.add(list.get(i10));
                        }
                        i10++;
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean z10 = this.f22853l;
        ArrayList arrayList = this.f22843a;
        if (!z10) {
            this.f22853l = true;
            arrayList.clear();
            List g5 = this.f22845c.f5941b.g(this.f22846d);
            int size = g5.size();
            for (int i6 = 0; i6 < size; i6++) {
                n.a b10 = ((o4.n) g5.get(i6)).b(this.f22846d, this.f22847e, this.f, this.f22850i);
                if (b10 != null) {
                    arrayList.add(b10);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <Data> t<Data, ?, Transcode> c(Class<Data> cls) {
        t<Data, ?, Transcode> tVar;
        Registry registry = this.f22845c.f5941b;
        Class<?> cls2 = this.f22848g;
        Class cls3 = this.f22852k;
        y4.b bVar = registry.f5937i;
        t<Data, ?, Transcode> tVar2 = null;
        d5.i andSet = bVar.f38247b.getAndSet(null);
        if (andSet == null) {
            andSet = new d5.i();
        }
        andSet.f12198a = cls;
        andSet.f12199b = cls2;
        andSet.f12200c = cls3;
        synchronized (bVar.f38246a) {
            tVar = (t<Data, ?, Transcode>) bVar.f38246a.getOrDefault(andSet, null);
        }
        bVar.f38247b.set(andSet);
        registry.f5937i.getClass();
        if (y4.b.f38245c.equals(tVar)) {
            return null;
        }
        if (tVar == null) {
            ArrayList e10 = registry.e(cls, cls2, cls3);
            if (!e10.isEmpty()) {
                tVar2 = new t<>(cls, cls2, cls3, e10, registry.f5938j);
            }
            registry.f5937i.a(cls, cls2, cls3, tVar2);
            return tVar2;
        }
        return tVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
        r1 = (h4.d<X>) r3.f38244b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <X> h4.d<X> d(X x10) {
        h4.d<X> dVar;
        y4.a aVar = this.f22845c.f5941b.f5931b;
        Class<?> cls = x10.getClass();
        synchronized (aVar) {
            Iterator it = aVar.f38242a.iterator();
            while (true) {
                if (it.hasNext()) {
                    a.C0648a c0648a = (a.C0648a) it.next();
                    if (c0648a.f38243a.isAssignableFrom(cls)) {
                        break;
                    }
                } else {
                    dVar = null;
                    break;
                }
            }
        }
        if (dVar != null) {
            return dVar;
        }
        throw new Registry.NoSourceEncoderAvailableException(x10.getClass());
    }

    public final <Z> h4.k<Z> e(Class<Z> cls) {
        h4.k<Z> kVar = (h4.k<Z>) this.f22851j.get(cls);
        if (kVar == null) {
            Iterator<Map.Entry<Class<?>, h4.k<?>>> it = this.f22851j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Class<?>, h4.k<?>> next = it.next();
                if (next.getKey().isAssignableFrom(cls)) {
                    kVar = (h4.k<Z>) next.getValue();
                    break;
                }
            }
        }
        if (kVar == null) {
            if (this.f22851j.isEmpty() && this.f22858q) {
                throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
            }
            return q4.a.f29129b;
        }
        return kVar;
    }
}
