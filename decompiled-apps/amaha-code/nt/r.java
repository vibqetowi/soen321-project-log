package nt;

import java.lang.reflect.Method;
/* compiled from: ReflectJavaClass.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class r extends kotlin.jvm.internal.f implements ss.l<Method, b0> {

    /* renamed from: u  reason: collision with root package name */
    public static final r f26826u = new r();

    public r() {
        super(1);
    }

    @Override // kotlin.jvm.internal.a, ys.c
    public final String getName() {
        return "<init>";
    }

    @Override // kotlin.jvm.internal.a
    public final ys.f getOwner() {
        return kotlin.jvm.internal.y.a(b0.class);
    }

    @Override // kotlin.jvm.internal.a
    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Method;)V";
    }

    @Override // ss.l
    public final b0 invoke(Method method) {
        Method p02 = method;
        kotlin.jvm.internal.i.g(p02, "p0");
        return new b0(p02);
    }
}
