package nt;
/* compiled from: ReflectJavaAnnotationArguments.kt */
/* loaded from: classes2.dex */
public final class x extends f implements wt.m {

    /* renamed from: b  reason: collision with root package name */
    public final Enum<?> f26832b;

    public x(fu.e eVar, Enum<?> r22) {
        super(eVar);
        this.f26832b = r22;
    }

    @Override // wt.m
    public final fu.b b() {
        Class<?> enumClass = this.f26832b.getClass();
        if (!enumClass.isEnum()) {
            enumClass = enumClass.getEnclosingClass();
        }
        kotlin.jvm.internal.i.f(enumClass, "enumClass");
        return d.a(enumClass);
    }

    @Override // wt.m
    public final fu.e d() {
        return fu.e.j(this.f26832b.name());
    }
}
