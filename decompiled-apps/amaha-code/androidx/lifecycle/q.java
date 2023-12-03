package androidx.lifecycle;

import androidx.lifecycle.j;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import n.b;
/* compiled from: LifecycleRegistry.java */
/* loaded from: classes.dex */
public final class q extends j {

    /* renamed from: d  reason: collision with root package name */
    public final WeakReference<p> f2455d;

    /* renamed from: b  reason: collision with root package name */
    public n.a<o, a> f2453b = new n.a<>();

    /* renamed from: e  reason: collision with root package name */
    public int f2456e = 0;
    public boolean f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2457g = false;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList<j.c> f2458h = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public j.c f2454c = j.c.INITIALIZED;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f2459i = true;

    /* compiled from: LifecycleRegistry.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public j.c f2460a;

        /* renamed from: b  reason: collision with root package name */
        public final n f2461b;

        public a(o oVar, j.c cVar) {
            n reflectiveGenericLifecycleObserver;
            HashMap hashMap = t.f2464a;
            boolean z10 = oVar instanceof n;
            boolean z11 = oVar instanceof f;
            if (z10 && z11) {
                reflectiveGenericLifecycleObserver = new FullLifecycleObserverAdapter((f) oVar, (n) oVar);
            } else if (z11) {
                reflectiveGenericLifecycleObserver = new FullLifecycleObserverAdapter((f) oVar, null);
            } else if (z10) {
                reflectiveGenericLifecycleObserver = (n) oVar;
            } else {
                Class<?> cls = oVar.getClass();
                if (t.c(cls) == 2) {
                    List list = (List) t.f2465b.get(cls);
                    if (list.size() == 1) {
                        reflectiveGenericLifecycleObserver = new SingleGeneratedAdapterObserver(t.a((Constructor) list.get(0), oVar));
                    } else {
                        g[] gVarArr = new g[list.size()];
                        for (int i6 = 0; i6 < list.size(); i6++) {
                            gVarArr[i6] = t.a((Constructor) list.get(i6), oVar);
                        }
                        reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(gVarArr);
                    }
                } else {
                    reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(oVar);
                }
            }
            this.f2461b = reflectiveGenericLifecycleObserver;
            this.f2460a = cVar;
        }

        public final void a(p pVar, j.b bVar) {
            j.c d10 = bVar.d();
            j.c cVar = this.f2460a;
            if (d10.compareTo(cVar) < 0) {
                cVar = d10;
            }
            this.f2460a = cVar;
            this.f2461b.c(pVar, bVar);
            this.f2460a = d10;
        }
    }

    public q(p pVar) {
        this.f2455d = new WeakReference<>(pVar);
    }

    @Override // androidx.lifecycle.j
    public final void a(o oVar) {
        p pVar;
        boolean z10;
        j.b bVar;
        e("addObserver");
        j.c cVar = this.f2454c;
        j.c cVar2 = j.c.DESTROYED;
        if (cVar != cVar2) {
            cVar2 = j.c.INITIALIZED;
        }
        a aVar = new a(oVar, cVar2);
        if (this.f2453b.g(oVar, aVar) != null || (pVar = this.f2455d.get()) == null) {
            return;
        }
        if (this.f2456e == 0 && !this.f) {
            z10 = false;
        } else {
            z10 = true;
        }
        j.c d10 = d(oVar);
        this.f2456e++;
        while (aVar.f2460a.compareTo(d10) < 0 && this.f2453b.f25761y.containsKey(oVar)) {
            j.c cVar3 = aVar.f2460a;
            ArrayList<j.c> arrayList = this.f2458h;
            arrayList.add(cVar3);
            int ordinal = aVar.f2460a.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        bVar = null;
                    } else {
                        bVar = j.b.ON_RESUME;
                    }
                } else {
                    bVar = j.b.ON_START;
                }
            } else {
                bVar = j.b.ON_CREATE;
            }
            if (bVar != null) {
                aVar.a(pVar, bVar);
                arrayList.remove(arrayList.size() - 1);
                d10 = d(oVar);
            } else {
                throw new IllegalStateException("no event up from " + aVar.f2460a);
            }
        }
        if (!z10) {
            i();
        }
        this.f2456e--;
    }

    @Override // androidx.lifecycle.j
    public final j.c b() {
        return this.f2454c;
    }

    @Override // androidx.lifecycle.j
    public final void c(o oVar) {
        e("removeObserver");
        this.f2453b.m(oVar);
    }

    public final j.c d(o oVar) {
        b.c<o, a> cVar;
        j.c cVar2;
        n.a<o, a> aVar = this.f2453b;
        j.c cVar3 = null;
        if (aVar.f25761y.containsKey(oVar)) {
            cVar = aVar.f25761y.get(oVar).f25769x;
        } else {
            cVar = null;
        }
        if (cVar != null) {
            cVar2 = cVar.f25767v.f2460a;
        } else {
            cVar2 = null;
        }
        ArrayList<j.c> arrayList = this.f2458h;
        if (!arrayList.isEmpty()) {
            cVar3 = arrayList.get(arrayList.size() - 1);
        }
        j.c cVar4 = this.f2454c;
        if (cVar2 == null || cVar2.compareTo(cVar4) >= 0) {
            cVar2 = cVar4;
        }
        if (cVar3 == null || cVar3.compareTo(cVar2) >= 0) {
            return cVar2;
        }
        return cVar3;
    }

    public final void e(String str) {
        if (this.f2459i && !m.a.J().K()) {
            throw new IllegalStateException(defpackage.b.m("Method ", str, " must be called on the main thread"));
        }
    }

    public final void f(j.b bVar) {
        e("handleLifecycleEvent");
        g(bVar.d());
    }

    public final void g(j.c cVar) {
        j.c cVar2 = this.f2454c;
        if (cVar2 == cVar) {
            return;
        }
        j.c cVar3 = j.c.INITIALIZED;
        j.c cVar4 = j.c.DESTROYED;
        if (cVar2 == cVar3 && cVar == cVar4) {
            throw new IllegalStateException("no event down from " + this.f2454c);
        }
        this.f2454c = cVar;
        if (!this.f && this.f2456e == 0) {
            this.f = true;
            i();
            this.f = false;
            if (this.f2454c == cVar4) {
                this.f2453b = new n.a<>();
                return;
            }
            return;
        }
        this.f2457g = true;
    }

    public final void h(j.c cVar) {
        e("setCurrentState");
        g(cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x0057, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00f7, code lost:
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i() {
        boolean z10;
        j.b bVar;
        j.b bVar2;
        p pVar = this.f2455d.get();
        if (pVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            n.a<o, a> aVar = this.f2453b;
            if (aVar.f25765x != 0) {
                j.c cVar = aVar.f25762u.f25767v.f2460a;
                j.c cVar2 = aVar.f25763v.f25767v.f2460a;
                if (cVar != cVar2 || this.f2454c != cVar2) {
                    z10 = false;
                    if (z10) {
                        this.f2457g = false;
                        int compareTo = this.f2454c.compareTo(aVar.f25762u.f25767v.f2460a);
                        ArrayList<j.c> arrayList = this.f2458h;
                        if (compareTo < 0) {
                            n.a<o, a> aVar2 = this.f2453b;
                            b.C0419b c0419b = new b.C0419b(aVar2.f25763v, aVar2.f25762u);
                            aVar2.f25764w.put(c0419b, Boolean.FALSE);
                            while (c0419b.hasNext() && !this.f2457g) {
                                Map.Entry entry = (Map.Entry) c0419b.next();
                                a aVar3 = (a) entry.getValue();
                                while (aVar3.f2460a.compareTo(this.f2454c) > 0 && !this.f2457g) {
                                    if (this.f2453b.f25761y.containsKey((o) entry.getKey())) {
                                        int ordinal = aVar3.f2460a.ordinal();
                                        if (ordinal != 2) {
                                            if (ordinal != 3) {
                                                if (ordinal != 4) {
                                                    bVar2 = null;
                                                } else {
                                                    bVar2 = j.b.ON_PAUSE;
                                                }
                                            } else {
                                                bVar2 = j.b.ON_STOP;
                                            }
                                        } else {
                                            bVar2 = j.b.ON_DESTROY;
                                        }
                                        if (bVar2 != null) {
                                            arrayList.add(bVar2.d());
                                            aVar3.a(pVar, bVar2);
                                            arrayList.remove(arrayList.size() - 1);
                                        } else {
                                            throw new IllegalStateException("no event down from " + aVar3.f2460a);
                                        }
                                    }
                                }
                            }
                        }
                        b.c<o, a> cVar3 = this.f2453b.f25763v;
                        if (!this.f2457g && cVar3 != null && this.f2454c.compareTo(cVar3.f25767v.f2460a) > 0) {
                            n.a<o, a> aVar4 = this.f2453b;
                            aVar4.getClass();
                            b.d dVar = new b.d();
                            aVar4.f25764w.put(dVar, Boolean.FALSE);
                            while (dVar.hasNext() && !this.f2457g) {
                                Map.Entry entry2 = (Map.Entry) dVar.next();
                                a aVar5 = (a) entry2.getValue();
                                while (aVar5.f2460a.compareTo(this.f2454c) < 0 && !this.f2457g) {
                                    if (this.f2453b.f25761y.containsKey((o) entry2.getKey())) {
                                        arrayList.add(aVar5.f2460a);
                                        int ordinal2 = aVar5.f2460a.ordinal();
                                        if (ordinal2 != 1) {
                                            if (ordinal2 != 2) {
                                                if (ordinal2 != 3) {
                                                    bVar = null;
                                                } else {
                                                    bVar = j.b.ON_RESUME;
                                                }
                                            } else {
                                                bVar = j.b.ON_START;
                                            }
                                        } else {
                                            bVar = j.b.ON_CREATE;
                                        }
                                        if (bVar != null) {
                                            aVar5.a(pVar, bVar);
                                            arrayList.remove(arrayList.size() - 1);
                                        } else {
                                            throw new IllegalStateException("no event up from " + aVar5.f2460a);
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        this.f2457g = false;
                        return;
                    }
                }
            }
            z10 = true;
            if (z10) {
            }
        }
    }
}
