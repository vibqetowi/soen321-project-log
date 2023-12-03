package y6;

import y6.d;
/* compiled from: MPPointF.java */
/* loaded from: classes.dex */
public final class c extends d.a {

    /* renamed from: d  reason: collision with root package name */
    public static final d<c> f38275d;

    /* renamed from: b  reason: collision with root package name */
    public float f38276b;

    /* renamed from: c  reason: collision with root package name */
    public float f38277c;

    static {
        d<c> a10 = d.a(32, new c(0));
        f38275d = a10;
        a10.f = 0.5f;
    }

    public c() {
    }

    public static c b(float f, float f2) {
        c b10 = f38275d.b();
        b10.f38276b = f;
        b10.f38277c = f2;
        return b10;
    }

    public static c c(c cVar) {
        c b10 = f38275d.b();
        b10.f38276b = cVar.f38276b;
        b10.f38277c = cVar.f38277c;
        return b10;
    }

    public static void d(c cVar) {
        f38275d.c(cVar);
    }

    @Override // y6.d.a
    public final d.a a() {
        return new c(0);
    }

    public c(int i6) {
        this.f38276b = 0.0f;
        this.f38277c = 0.0f;
    }
}
