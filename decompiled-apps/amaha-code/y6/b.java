package y6;

import y6.d;
/* compiled from: MPPointD.java */
/* loaded from: classes.dex */
public final class b extends d.a {

    /* renamed from: d  reason: collision with root package name */
    public static final d<b> f38272d;

    /* renamed from: b  reason: collision with root package name */
    public double f38273b = 0.0d;

    /* renamed from: c  reason: collision with root package name */
    public double f38274c = 0.0d;

    static {
        d<b> a10 = d.a(64, new b());
        f38272d = a10;
        a10.f = 0.5f;
    }

    public static b b(double d10, double d11) {
        b b10 = f38272d.b();
        b10.f38273b = d10;
        b10.f38274c = d11;
        return b10;
    }

    public static void c(b bVar) {
        f38272d.c(bVar);
    }

    @Override // y6.d.a
    public final d.a a() {
        return new b();
    }

    public final String toString() {
        return "MPPointD, x: " + this.f38273b + ", y: " + this.f38274c;
    }
}
