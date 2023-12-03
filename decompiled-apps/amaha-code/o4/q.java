package o4;

import com.bumptech.glide.load.engine.GlideException;
import i4.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o4.n;
/* compiled from: MultiModelLoader.java */
/* loaded from: classes.dex */
public final class q<Model, Data> implements n<Model, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final List<n<Model, Data>> f27086a;

    /* renamed from: b  reason: collision with root package name */
    public final s0.d<List<Throwable>> f27087b;

    /* compiled from: MultiModelLoader.java */
    /* loaded from: classes.dex */
    public static class a<Data> implements i4.d<Data>, d.a<Data> {
        public boolean A;

        /* renamed from: u  reason: collision with root package name */
        public final List<i4.d<Data>> f27088u;

        /* renamed from: v  reason: collision with root package name */
        public final s0.d<List<Throwable>> f27089v;

        /* renamed from: w  reason: collision with root package name */
        public int f27090w;

        /* renamed from: x  reason: collision with root package name */
        public com.bumptech.glide.d f27091x;

        /* renamed from: y  reason: collision with root package name */
        public d.a<? super Data> f27092y;

        /* renamed from: z  reason: collision with root package name */
        public List<Throwable> f27093z;

        public a(ArrayList arrayList, s0.d dVar) {
            this.f27089v = dVar;
            if (!arrayList.isEmpty()) {
                this.f27088u = arrayList;
                this.f27090w = 0;
                return;
            }
            throw new IllegalArgumentException("Must not be empty.");
        }

        @Override // i4.d
        public final Class<Data> a() {
            return this.f27088u.get(0).a();
        }

        @Override // i4.d
        public final void b() {
            List<Throwable> list = this.f27093z;
            if (list != null) {
                this.f27089v.a(list);
            }
            this.f27093z = null;
            for (i4.d<Data> dVar : this.f27088u) {
                dVar.b();
            }
        }

        @Override // i4.d
        public final void c(com.bumptech.glide.d dVar, d.a<? super Data> aVar) {
            this.f27091x = dVar;
            this.f27092y = aVar;
            this.f27093z = this.f27089v.b();
            this.f27088u.get(this.f27090w).c(dVar, this);
            if (this.A) {
                cancel();
            }
        }

        @Override // i4.d
        public final void cancel() {
            this.A = true;
            for (i4.d<Data> dVar : this.f27088u) {
                dVar.cancel();
            }
        }

        @Override // i4.d.a
        public final void d(Exception exc) {
            List<Throwable> list = this.f27093z;
            kc.f.p(list);
            list.add(exc);
            g();
        }

        @Override // i4.d
        public final h4.a e() {
            return this.f27088u.get(0).e();
        }

        @Override // i4.d.a
        public final void f(Data data) {
            if (data != null) {
                this.f27092y.f(data);
            } else {
                g();
            }
        }

        public final void g() {
            if (this.A) {
                return;
            }
            if (this.f27090w < this.f27088u.size() - 1) {
                this.f27090w++;
                c(this.f27091x, this.f27092y);
                return;
            }
            kc.f.p(this.f27093z);
            this.f27092y.d(new GlideException("Fetch failed", new ArrayList(this.f27093z)));
        }
    }

    public q(ArrayList arrayList, s0.d dVar) {
        this.f27086a = arrayList;
        this.f27087b = dVar;
    }

    @Override // o4.n
    public final boolean a(Model model) {
        for (n<Model, Data> nVar : this.f27086a) {
            if (nVar.a(model)) {
                return true;
            }
        }
        return false;
    }

    @Override // o4.n
    public final n.a<Data> b(Model model, int i6, int i10, h4.g gVar) {
        n.a<Data> b10;
        List<n<Model, Data>> list = this.f27086a;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        h4.e eVar = null;
        for (int i11 = 0; i11 < size; i11++) {
            n<Model, Data> nVar = list.get(i11);
            if (nVar.a(model) && (b10 = nVar.b(model, i6, i10, gVar)) != null) {
                arrayList.add(b10.f27081c);
                eVar = b10.f27079a;
            }
        }
        if (arrayList.isEmpty() || eVar == null) {
            return null;
        }
        return new n.a<>(eVar, new a(arrayList, this.f27087b));
    }

    public final String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f27086a.toArray()) + '}';
    }
}
