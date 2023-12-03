package nt;

import java.lang.reflect.Constructor;
/* compiled from: ReflectJavaClass.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class l extends kotlin.jvm.internal.f implements ss.l<Constructor<?>, v> {

    /* renamed from: u  reason: collision with root package name */
    public static final l f26820u = new l();

    public l() {
        super(1);
    }

    @Override // kotlin.jvm.internal.a, ys.c
    public final String getName() {
        return "<init>";
    }

    @Override // kotlin.jvm.internal.a
    public final ys.f getOwner() {
        return kotlin.jvm.internal.y.a(v.class);
    }

    @Override // kotlin.jvm.internal.a
    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Constructor;)V";
    }

    @Override // ss.l
    public final v invoke(Constructor<?> constructor) {
        Constructor<?> p02 = constructor;
        kotlin.jvm.internal.i.g(p02, "p0");
        return new v(p02);
    }
}
