package t;

import java.util.Map;
/* compiled from: ArraySet.java */
/* loaded from: classes.dex */
public final class c extends g<Object, Object> {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d f32223d;

    public c(d dVar) {
        this.f32223d = dVar;
    }

    @Override // t.g
    public final void a() {
        this.f32223d.clear();
    }

    @Override // t.g
    public final Object b(int i6, int i10) {
        return this.f32223d.f32227v[i6];
    }

    @Override // t.g
    public final Map<Object, Object> c() {
        throw new UnsupportedOperationException("not a map");
    }

    @Override // t.g
    public final int d() {
        return this.f32223d.f32228w;
    }

    @Override // t.g
    public final int e(Object obj) {
        return this.f32223d.indexOf(obj);
    }

    @Override // t.g
    public final int f(Object obj) {
        return this.f32223d.indexOf(obj);
    }

    @Override // t.g
    public final void g(Object obj, Object obj2) {
        this.f32223d.add(obj);
    }

    @Override // t.g
    public final void h(int i6) {
        this.f32223d.q(i6);
    }

    @Override // t.g
    public final Object i(int i6, Object obj) {
        throw new UnsupportedOperationException("not a map");
    }
}
