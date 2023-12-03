package d3;

import java.util.ArrayList;
import java.util.List;
import s1.s;
/* compiled from: BaseKeyframeAnimation.java */
/* loaded from: classes.dex */
public abstract class a<K, A> {

    /* renamed from: c  reason: collision with root package name */
    public final c<K> f12140c;

    /* renamed from: e  reason: collision with root package name */
    public s f12142e;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f12138a = new ArrayList(1);

    /* renamed from: b  reason: collision with root package name */
    public boolean f12139b = false;

    /* renamed from: d  reason: collision with root package name */
    public float f12141d = 0.0f;
    public A f = null;

    /* renamed from: g  reason: collision with root package name */
    public float f12143g = -1.0f;

    /* renamed from: h  reason: collision with root package name */
    public float f12144h = -1.0f;

    /* compiled from: BaseKeyframeAnimation.java */
    /* renamed from: d3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0183a {
        void b();
    }

    /* compiled from: BaseKeyframeAnimation.java */
    /* loaded from: classes.dex */
    public static final class b<T> implements c<T> {
        @Override // d3.a.c
        public final boolean a(float f) {
            throw new IllegalStateException("not implemented");
        }

        @Override // d3.a.c
        public final n3.a<T> b() {
            throw new IllegalStateException("not implemented");
        }

        @Override // d3.a.c
        public final boolean c(float f) {
            return false;
        }

        @Override // d3.a.c
        public final float d() {
            return 1.0f;
        }

        @Override // d3.a.c
        public final float e() {
            return 0.0f;
        }

        @Override // d3.a.c
        public final boolean isEmpty() {
            return true;
        }
    }

    /* compiled from: BaseKeyframeAnimation.java */
    /* loaded from: classes.dex */
    public interface c<T> {
        boolean a(float f);

        n3.a<T> b();

        boolean c(float f);

        float d();

        float e();

        boolean isEmpty();
    }

    /* compiled from: BaseKeyframeAnimation.java */
    /* loaded from: classes.dex */
    public static final class d<T> implements c<T> {

        /* renamed from: a  reason: collision with root package name */
        public final List<? extends n3.a<T>> f12145a;

        /* renamed from: c  reason: collision with root package name */
        public n3.a<T> f12147c = null;

        /* renamed from: d  reason: collision with root package name */
        public float f12148d = -1.0f;

        /* renamed from: b  reason: collision with root package name */
        public n3.a<T> f12146b = f(0.0f);

        public d(List<? extends n3.a<T>> list) {
            this.f12145a = list;
        }

        @Override // d3.a.c
        public final boolean a(float f) {
            n3.a<T> aVar = this.f12147c;
            n3.a<T> aVar2 = this.f12146b;
            if (aVar == aVar2 && this.f12148d == f) {
                return true;
            }
            this.f12147c = aVar2;
            this.f12148d = f;
            return false;
        }

        @Override // d3.a.c
        public final n3.a<T> b() {
            return this.f12146b;
        }

        @Override // d3.a.c
        public final boolean c(float f) {
            boolean z10;
            n3.a<T> aVar = this.f12146b;
            if (f >= aVar.b() && f < aVar.a()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return !this.f12146b.c();
            }
            this.f12146b = f(f);
            return true;
        }

        @Override // d3.a.c
        public final float d() {
            List<? extends n3.a<T>> list = this.f12145a;
            return list.get(list.size() - 1).a();
        }

        @Override // d3.a.c
        public final float e() {
            return this.f12145a.get(0).b();
        }

        public final n3.a<T> f(float f) {
            List<? extends n3.a<T>> list = this.f12145a;
            n3.a<T> aVar = list.get(list.size() - 1);
            if (f >= aVar.b()) {
                return aVar;
            }
            int size = list.size() - 2;
            while (true) {
                boolean z10 = false;
                if (size >= 1) {
                    n3.a<T> aVar2 = list.get(size);
                    if (this.f12146b != aVar2) {
                        if (f >= aVar2.b() && f < aVar2.a()) {
                            z10 = true;
                        }
                        if (z10) {
                            return aVar2;
                        }
                    }
                    size--;
                } else {
                    return list.get(0);
                }
            }
        }

        @Override // d3.a.c
        public final boolean isEmpty() {
            return false;
        }
    }

    /* compiled from: BaseKeyframeAnimation.java */
    /* loaded from: classes.dex */
    public static final class e<T> implements c<T> {

        /* renamed from: a  reason: collision with root package name */
        public final n3.a<T> f12149a;

        /* renamed from: b  reason: collision with root package name */
        public float f12150b = -1.0f;

        public e(List<? extends n3.a<T>> list) {
            this.f12149a = list.get(0);
        }

        @Override // d3.a.c
        public final boolean a(float f) {
            if (this.f12150b == f) {
                return true;
            }
            this.f12150b = f;
            return false;
        }

        @Override // d3.a.c
        public final n3.a<T> b() {
            return this.f12149a;
        }

        @Override // d3.a.c
        public final boolean c(float f) {
            return !this.f12149a.c();
        }

        @Override // d3.a.c
        public final float d() {
            return this.f12149a.a();
        }

        @Override // d3.a.c
        public final float e() {
            return this.f12149a.b();
        }

        @Override // d3.a.c
        public final boolean isEmpty() {
            return false;
        }
    }

    public a(List<? extends n3.a<K>> list) {
        c dVar;
        c cVar;
        if (list.isEmpty()) {
            cVar = new b();
        } else {
            if (list.size() == 1) {
                dVar = new e(list);
            } else {
                dVar = new d(list);
            }
            cVar = dVar;
        }
        this.f12140c = cVar;
    }

    public final void a(InterfaceC0183a interfaceC0183a) {
        this.f12138a.add(interfaceC0183a);
    }

    public final n3.a<K> b() {
        n3.a<K> b10 = this.f12140c.b();
        hc.d.s();
        return b10;
    }

    public float c() {
        if (this.f12144h == -1.0f) {
            this.f12144h = this.f12140c.d();
        }
        return this.f12144h;
    }

    public final float d() {
        n3.a<K> b10 = b();
        if (b10.c()) {
            return 0.0f;
        }
        return b10.f25864d.getInterpolation(e());
    }

    public final float e() {
        if (this.f12139b) {
            return 0.0f;
        }
        n3.a<K> b10 = b();
        if (b10.c()) {
            return 0.0f;
        }
        return (this.f12141d - b10.b()) / (b10.a() - b10.b());
    }

    public A f() {
        float d10 = d();
        if (this.f12142e == null && this.f12140c.a(d10)) {
            return this.f;
        }
        A g5 = g(b(), d10);
        this.f = g5;
        return g5;
    }

    public abstract A g(n3.a<K> aVar, float f);

    public void h() {
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f12138a;
            if (i6 < arrayList.size()) {
                ((InterfaceC0183a) arrayList.get(i6)).b();
                i6++;
            } else {
                return;
            }
        }
    }

    public void i(float f) {
        c<K> cVar = this.f12140c;
        if (cVar.isEmpty()) {
            return;
        }
        if (this.f12143g == -1.0f) {
            this.f12143g = cVar.e();
        }
        float f2 = this.f12143g;
        if (f < f2) {
            if (f2 == -1.0f) {
                this.f12143g = cVar.e();
            }
            f = this.f12143g;
        } else if (f > c()) {
            f = c();
        }
        if (f == this.f12141d) {
            return;
        }
        this.f12141d = f;
        if (cVar.c(f)) {
            h();
        }
    }

    public final void j(s sVar) {
        s sVar2 = this.f12142e;
        if (sVar2 != null) {
            sVar2.f31225w = null;
        }
        this.f12142e = sVar;
        if (sVar != null) {
            sVar.f31225w = this;
        }
    }
}
