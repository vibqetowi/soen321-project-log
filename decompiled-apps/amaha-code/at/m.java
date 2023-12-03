package at;

import java.lang.reflect.Type;
/* compiled from: KClassImpl.kt */
/* loaded from: classes2.dex */
public final class m extends kotlin.jvm.internal.k implements ss.a<Type> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ wu.b0 f3577u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ l<Object>.a f3578v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ l<Object> f3579w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(wu.b0 b0Var, l<Object>.a aVar, l<Object> lVar) {
        super(0);
        this.f3577u = b0Var;
        this.f3578v = aVar;
        this.f3579w = lVar;
    }

    @Override // ss.a
    public final Type invoke() {
        gt.g a10 = this.f3577u.O0().a();
        if (a10 instanceof gt.e) {
            Class<?> j10 = t0.j((gt.e) a10);
            l<Object>.a aVar = this.f3578v;
            if (j10 != null) {
                l<Object> lVar = this.f3579w;
                boolean b10 = kotlin.jvm.internal.i.b(lVar.f3541v.getSuperclass(), j10);
                Class<Object> cls = lVar.f3541v;
                if (b10) {
                    Type genericSuperclass = cls.getGenericSuperclass();
                    kotlin.jvm.internal.i.f(genericSuperclass, "{\n                      …ass\n                    }");
                    return genericSuperclass;
                }
                Class<?>[] interfaces = cls.getInterfaces();
                kotlin.jvm.internal.i.f(interfaces, "jClass.interfaces");
                int W1 = is.k.W1(j10, interfaces);
                if (W1 >= 0) {
                    Type type = cls.getGenericInterfaces()[W1];
                    kotlin.jvm.internal.i.f(type, "{\n                      …ex]\n                    }");
                    return type;
                }
                throw new hs.e("No superclass of " + aVar + " in Java reflection for " + a10, 2);
            }
            throw new hs.e("Unsupported superclass of " + aVar + ": " + a10, 2);
        }
        throw new hs.e("Supertype not a class: " + a10, 2);
    }
}
