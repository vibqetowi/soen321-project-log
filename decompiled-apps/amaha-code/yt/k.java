package yt;
/* compiled from: JavaClassDataFinder.kt */
/* loaded from: classes2.dex */
public final class k implements su.i {

    /* renamed from: a  reason: collision with root package name */
    public final n f39038a;

    /* renamed from: b  reason: collision with root package name */
    public final j f39039b;

    public k(mt.d dVar, j jVar) {
        this.f39038a = dVar;
        this.f39039b = jVar;
    }

    @Override // su.i
    public final su.h a(fu.b classId) {
        kotlin.jvm.internal.i.g(classId, "classId");
        o u10 = kotlin.jvm.internal.h.u(this.f39038a, classId);
        if (u10 == null) {
            return null;
        }
        kotlin.jvm.internal.i.b(u10.g(), classId);
        return this.f39039b.f(u10);
    }
}
