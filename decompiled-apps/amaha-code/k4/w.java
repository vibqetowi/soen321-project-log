package k4;

import com.bumptech.glide.Registry;
import i4.d;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import k4.h;
import k4.m;
import o4.n;
/* compiled from: ResourceCacheGenerator.java */
/* loaded from: classes.dex */
public final class w implements h, d.a<Object> {
    public int A;
    public volatile n.a<?> B;
    public File C;
    public x D;

    /* renamed from: u  reason: collision with root package name */
    public final h.a f22941u;

    /* renamed from: v  reason: collision with root package name */
    public final i<?> f22942v;

    /* renamed from: w  reason: collision with root package name */
    public int f22943w;

    /* renamed from: x  reason: collision with root package name */
    public int f22944x = -1;

    /* renamed from: y  reason: collision with root package name */
    public h4.e f22945y;

    /* renamed from: z  reason: collision with root package name */
    public List<o4.n<File, ?>> f22946z;

    public w(i<?> iVar, h.a aVar) {
        this.f22942v = iVar;
        this.f22941u = aVar;
    }

    @Override // k4.h
    public final boolean a() {
        List list;
        boolean z10;
        boolean z11;
        boolean z12;
        ArrayList a10 = this.f22942v.a();
        if (a10.isEmpty()) {
            return false;
        }
        i<?> iVar = this.f22942v;
        Registry registry = iVar.f22845c.f5941b;
        Class<?> cls = iVar.f22846d.getClass();
        Class<?> cls2 = iVar.f22848g;
        Class<?> cls3 = iVar.f22852k;
        androidx.appcompat.widget.l lVar = registry.f5936h;
        d5.i iVar2 = (d5.i) ((AtomicReference) lVar.f1471v).getAndSet(null);
        if (iVar2 == null) {
            iVar2 = new d5.i(cls, cls2, cls3);
        } else {
            iVar2.f12198a = cls;
            iVar2.f12199b = cls2;
            iVar2.f12200c = cls3;
        }
        synchronized (((t.b) lVar.f1472w)) {
            list = (List) ((t.b) lVar.f1472w).getOrDefault(iVar2, null);
        }
        ((AtomicReference) lVar.f1471v).set(iVar2);
        ArrayList arrayList = list;
        if (list == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = registry.f5930a.a(cls).iterator();
            while (it.hasNext()) {
                Iterator it2 = registry.f5932c.b((Class) it.next(), cls2).iterator();
                while (it2.hasNext()) {
                    Class cls4 = (Class) it2.next();
                    if (!registry.f.b(cls4, cls3).isEmpty() && !arrayList2.contains(cls4)) {
                        arrayList2.add(cls4);
                    }
                }
            }
            registry.f5936h.s(cls, cls2, cls3, Collections.unmodifiableList(arrayList2));
            arrayList = arrayList2;
        }
        if (arrayList.isEmpty()) {
            if (File.class.equals(this.f22942v.f22852k)) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + this.f22942v.f22846d.getClass() + " to " + this.f22942v.f22852k);
        }
        while (true) {
            List<o4.n<File, ?>> list2 = this.f22946z;
            if (list2 != null) {
                if (this.A < list2.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    this.B = null;
                    boolean z13 = false;
                    while (!z13) {
                        if (this.A < this.f22946z.size()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z11) {
                            break;
                        }
                        List<o4.n<File, ?>> list3 = this.f22946z;
                        int i6 = this.A;
                        this.A = i6 + 1;
                        File file = this.C;
                        i<?> iVar3 = this.f22942v;
                        this.B = list3.get(i6).b(file, iVar3.f22847e, iVar3.f, iVar3.f22850i);
                        if (this.B != null) {
                            if (this.f22942v.c(this.B.f27081c.a()) != null) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                this.B.f27081c.c(this.f22942v.f22856o, this);
                                z13 = true;
                            }
                        }
                    }
                    return z13;
                }
            }
            int i10 = this.f22944x + 1;
            this.f22944x = i10;
            if (i10 >= arrayList.size()) {
                int i11 = this.f22943w + 1;
                this.f22943w = i11;
                if (i11 >= a10.size()) {
                    return false;
                }
                this.f22944x = 0;
            }
            h4.e eVar = (h4.e) a10.get(this.f22943w);
            Class cls5 = (Class) arrayList.get(this.f22944x);
            h4.k<Z> e10 = this.f22942v.e(cls5);
            i<?> iVar4 = this.f22942v;
            this.D = new x(iVar4.f22845c.f5940a, eVar, iVar4.f22855n, iVar4.f22847e, iVar4.f, e10, cls5, iVar4.f22850i);
            File c10 = ((m.c) iVar4.f22849h).a().c(this.D);
            this.C = c10;
            if (c10 != null) {
                this.f22945y = eVar;
                this.f22946z = this.f22942v.f22845c.f5941b.g(c10);
                this.A = 0;
            }
        }
    }

    @Override // k4.h
    public final void cancel() {
        n.a<?> aVar = this.B;
        if (aVar != null) {
            aVar.f27081c.cancel();
        }
    }

    @Override // i4.d.a
    public final void d(Exception exc) {
        this.f22941u.f(this.D, exc, this.B.f27081c, h4.a.RESOURCE_DISK_CACHE);
    }

    @Override // i4.d.a
    public final void f(Object obj) {
        this.f22941u.h(this.f22945y, obj, this.B.f27081c, h4.a.RESOURCE_DISK_CACHE, this.D);
    }
}
