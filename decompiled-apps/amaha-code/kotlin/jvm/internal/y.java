package kotlin.jvm.internal;

import at.o0;
/* compiled from: Reflection.java */
/* loaded from: classes2.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static final z f23470a;

    /* renamed from: b  reason: collision with root package name */
    public static final ys.d[] f23471b;

    static {
        z zVar = null;
        try {
            zVar = (z) o0.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (zVar == null) {
            zVar = new z();
        }
        f23470a = zVar;
        f23471b = new ys.d[0];
    }

    public static ys.d a(Class cls) {
        return f23470a.b(cls);
    }

    public static ys.i b(l lVar) {
        return f23470a.d(lVar);
    }

    public static ys.l c(r rVar) {
        return f23470a.f(rVar);
    }
}
