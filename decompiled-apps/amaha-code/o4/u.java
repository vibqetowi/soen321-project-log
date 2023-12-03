package o4;

import i4.d;
import o4.n;
/* compiled from: UnitModelLoader.java */
/* loaded from: classes.dex */
public final class u<Model> implements n<Model, Model> {

    /* renamed from: a  reason: collision with root package name */
    public static final u<?> f27109a = new u<>();

    /* compiled from: UnitModelLoader.java */
    /* loaded from: classes.dex */
    public static class a<Model> implements o<Model, Model> {

        /* renamed from: a  reason: collision with root package name */
        public static final a<?> f27110a = new a<>();

        @Override // o4.o
        public final n<Model, Model> b(r rVar) {
            return u.f27109a;
        }
    }

    @Override // o4.n
    public final boolean a(Model model) {
        return true;
    }

    @Override // o4.n
    public final n.a<Model> b(Model model, int i6, int i10, h4.g gVar) {
        return new n.a<>(new c5.d(model), new b(model));
    }

    /* compiled from: UnitModelLoader.java */
    /* loaded from: classes.dex */
    public static class b<Model> implements i4.d<Model> {

        /* renamed from: u  reason: collision with root package name */
        public final Model f27111u;

        public b(Model model) {
            this.f27111u = model;
        }

        @Override // i4.d
        public final Class<Model> a() {
            return (Class<Model>) this.f27111u.getClass();
        }

        @Override // i4.d
        public final void c(com.bumptech.glide.d dVar, d.a<? super Model> aVar) {
            aVar.f((Model) this.f27111u);
        }

        @Override // i4.d
        public final h4.a e() {
            return h4.a.LOCAL;
        }

        @Override // i4.d
        public final void b() {
        }

        @Override // i4.d
        public final void cancel() {
        }
    }
}
