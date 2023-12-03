package kotlin.jvm.internal;
/* compiled from: ReflectionFactory.java */
/* loaded from: classes2.dex */
public class z {
    public ys.d b(Class cls) {
        return new c(cls);
    }

    public ys.f c(Class cls, String str) {
        return new o(cls, str);
    }

    public String g(e eVar) {
        String obj = eVar.getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            return obj.substring(21);
        }
        return obj;
    }

    public String h(k kVar) {
        return g(kVar);
    }

    public ys.g a(f fVar) {
        return fVar;
    }

    public ys.i d(l lVar) {
        return lVar;
    }

    public ys.k e(p pVar) {
        return pVar;
    }

    public ys.l f(r rVar) {
        return rVar;
    }
}
