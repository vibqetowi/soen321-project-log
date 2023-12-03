package t;

import java.util.Map;
/* compiled from: ArrayMap.java */
/* loaded from: classes.dex */
public final class a extends g<Object, Object> {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ b f32222d;

    public a(b bVar) {
        this.f32222d = bVar;
    }

    @Override // t.g
    public final void a() {
        this.f32222d.clear();
    }

    @Override // t.g
    public final Object b(int i6, int i10) {
        return this.f32222d.f32259v[(i6 << 1) + i10];
    }

    @Override // t.g
    public final Map<Object, Object> c() {
        return this.f32222d;
    }

    @Override // t.g
    public final int d() {
        return this.f32222d.f32260w;
    }

    @Override // t.g
    public final int e(Object obj) {
        return this.f32222d.f(obj);
    }

    @Override // t.g
    public final int f(Object obj) {
        return this.f32222d.h(obj);
    }

    @Override // t.g
    public final void g(Object obj, Object obj2) {
        this.f32222d.put(obj, obj2);
    }

    @Override // t.g
    public final void h(int i6) {
        this.f32222d.k(i6);
    }

    @Override // t.g
    public final Object i(int i6, Object obj) {
        return this.f32222d.l(i6, obj);
    }
}
