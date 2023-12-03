package r6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import q6.i;
import v6.d;
/* compiled from: ChartData.java */
/* loaded from: classes.dex */
public abstract class h<T extends v6.d<? extends j>> {

    /* renamed from: a  reason: collision with root package name */
    public float f30505a;

    /* renamed from: b  reason: collision with root package name */
    public float f30506b;

    /* renamed from: c  reason: collision with root package name */
    public float f30507c;

    /* renamed from: d  reason: collision with root package name */
    public float f30508d;

    /* renamed from: e  reason: collision with root package name */
    public float f30509e;
    public float f;

    /* renamed from: g  reason: collision with root package name */
    public float f30510g;

    /* renamed from: h  reason: collision with root package name */
    public float f30511h;

    /* renamed from: i  reason: collision with root package name */
    public final List<T> f30512i;

    public h() {
        this.f30505a = -3.4028235E38f;
        this.f30506b = Float.MAX_VALUE;
        this.f30507c = -3.4028235E38f;
        this.f30508d = Float.MAX_VALUE;
        this.f30509e = -3.4028235E38f;
        this.f = Float.MAX_VALUE;
        this.f30510g = -3.4028235E38f;
        this.f30511h = Float.MAX_VALUE;
        this.f30512i = new ArrayList();
    }

    public final void a() {
        i.a aVar;
        T t3;
        T t10;
        i.a aVar2;
        List<T> list = this.f30512i;
        if (list == null) {
            return;
        }
        this.f30505a = -3.4028235E38f;
        this.f30506b = Float.MAX_VALUE;
        this.f30507c = -3.4028235E38f;
        this.f30508d = Float.MAX_VALUE;
        Iterator<T> it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            aVar = i.a.LEFT;
            if (!hasNext) {
                break;
            }
            T next = it.next();
            if (this.f30505a < next.g()) {
                this.f30505a = next.g();
            }
            if (this.f30506b > next.r()) {
                this.f30506b = next.r();
            }
            if (this.f30507c < next.T()) {
                this.f30507c = next.T();
            }
            if (this.f30508d > next.f()) {
                this.f30508d = next.f();
            }
            if (next.a0() == aVar) {
                if (this.f30509e < next.g()) {
                    this.f30509e = next.g();
                }
                if (this.f > next.r()) {
                    this.f = next.r();
                }
            } else {
                if (this.f30510g < next.g()) {
                    this.f30510g = next.g();
                }
                if (this.f30511h > next.r()) {
                    this.f30511h = next.r();
                }
            }
        }
        this.f30509e = -3.4028235E38f;
        this.f = Float.MAX_VALUE;
        this.f30510g = -3.4028235E38f;
        this.f30511h = Float.MAX_VALUE;
        Iterator<T> it2 = list.iterator();
        while (true) {
            t3 = null;
            if (it2.hasNext()) {
                t10 = it2.next();
                if (t10.a0() == aVar) {
                    break;
                }
            } else {
                t10 = null;
                break;
            }
        }
        if (t10 != null) {
            this.f30509e = t10.g();
            this.f = t10.r();
            for (T t11 : list) {
                if (t11.a0() == aVar) {
                    if (t11.r() < this.f) {
                        this.f = t11.r();
                    }
                    if (t11.g() > this.f30509e) {
                        this.f30509e = t11.g();
                    }
                }
            }
        }
        Iterator<T> it3 = list.iterator();
        while (true) {
            boolean hasNext2 = it3.hasNext();
            aVar2 = i.a.RIGHT;
            if (!hasNext2) {
                break;
            }
            T next2 = it3.next();
            if (next2.a0() == aVar2) {
                t3 = next2;
                break;
            }
        }
        if (t3 != null) {
            this.f30510g = t3.g();
            this.f30511h = t3.r();
            for (T t12 : list) {
                if (t12.a0() == aVar2) {
                    if (t12.r() < this.f30511h) {
                        this.f30511h = t12.r();
                    }
                    if (t12.g() > this.f30510g) {
                        this.f30510g = t12.g();
                    }
                }
            }
        }
    }

    public T b(int i6) {
        List<T> list = this.f30512i;
        if (list != null && i6 >= 0 && i6 < list.size()) {
            return list.get(i6);
        }
        return null;
    }

    public final int c() {
        List<T> list = this.f30512i;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final int d() {
        int i6 = 0;
        for (T t3 : this.f30512i) {
            i6 += t3.c0();
        }
        return i6;
    }

    public j e(t6.c cVar) {
        int i6 = cVar.f;
        List<T> list = this.f30512i;
        if (i6 >= list.size()) {
            return null;
        }
        return list.get(cVar.f).h0(cVar.f32419a, cVar.f32420b);
    }

    public final T f() {
        List<T> list = this.f30512i;
        if (list != null && !list.isEmpty()) {
            T t3 = list.get(0);
            for (T t10 : list) {
                if (t10.c0() > t3.c0()) {
                    t3 = t10;
                }
            }
            return t3;
        }
        return null;
    }

    public final float g(i.a aVar) {
        if (aVar == i.a.LEFT) {
            float f = this.f30509e;
            if (f == -3.4028235E38f) {
                return this.f30510g;
            }
            return f;
        }
        float f2 = this.f30510g;
        if (f2 == -3.4028235E38f) {
            return this.f30509e;
        }
        return f2;
    }

    public final float h(i.a aVar) {
        if (aVar == i.a.LEFT) {
            float f = this.f;
            if (f == Float.MAX_VALUE) {
                return this.f30511h;
            }
            return f;
        }
        float f2 = this.f30511h;
        if (f2 == Float.MAX_VALUE) {
            return this.f;
        }
        return f2;
    }

    public h(T... tArr) {
        this.f30505a = -3.4028235E38f;
        this.f30506b = Float.MAX_VALUE;
        this.f30507c = -3.4028235E38f;
        this.f30508d = Float.MAX_VALUE;
        this.f30509e = -3.4028235E38f;
        this.f = Float.MAX_VALUE;
        this.f30510g = -3.4028235E38f;
        this.f30511h = Float.MAX_VALUE;
        ArrayList arrayList = new ArrayList();
        for (T t3 : tArr) {
            arrayList.add(t3);
        }
        this.f30512i = arrayList;
        a();
    }

    public h(ArrayList arrayList) {
        this.f30505a = -3.4028235E38f;
        this.f30506b = Float.MAX_VALUE;
        this.f30507c = -3.4028235E38f;
        this.f30508d = Float.MAX_VALUE;
        this.f30509e = -3.4028235E38f;
        this.f = Float.MAX_VALUE;
        this.f30510g = -3.4028235E38f;
        this.f30511h = Float.MAX_VALUE;
        this.f30512i = arrayList;
        a();
    }
}
