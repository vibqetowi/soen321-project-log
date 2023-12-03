package nt;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ReflectJavaAnnotation.kt */
/* loaded from: classes2.dex */
public final class e extends w implements wt.a {

    /* renamed from: a  reason: collision with root package name */
    public final Annotation f26802a;

    public e(Annotation annotation) {
        kotlin.jvm.internal.i.g(annotation, "annotation");
        this.f26802a = annotation;
    }

    @Override // wt.a
    public final s E() {
        return new s(sp.b.C(sp.b.r(this.f26802a)));
    }

    @Override // wt.a
    public final ArrayList d() {
        wt.b zVar;
        Annotation annotation = this.f26802a;
        Method[] declaredMethods = sp.b.C(sp.b.r(annotation)).getDeclaredMethods();
        kotlin.jvm.internal.i.f(declaredMethods, "annotation.annotationClass.java.declaredMethods");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            Object invoke = method.invoke(annotation, new Object[0]);
            kotlin.jvm.internal.i.f(invoke, "method.invoke(annotation)");
            fu.e j10 = fu.e.j(method.getName());
            Class<?> cls = invoke.getClass();
            List<ys.d<? extends Object>> list = d.f26795a;
            if (Enum.class.isAssignableFrom(cls)) {
                zVar = new x(j10, (Enum) invoke);
            } else if (invoke instanceof Annotation) {
                zVar = new g(j10, (Annotation) invoke);
            } else if (invoke instanceof Object[]) {
                zVar = new i(j10, (Object[]) invoke);
            } else if (invoke instanceof Class) {
                zVar = new t(j10, (Class) invoke);
            } else {
                zVar = new z(invoke, j10);
            }
            arrayList.add(zVar);
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (this.f26802a == ((e) obj).f26802a) {
                return true;
            }
        }
        return false;
    }

    @Override // wt.a
    public final fu.b g() {
        return d.a(sp.b.C(sp.b.r(this.f26802a)));
    }

    public final int hashCode() {
        return System.identityHashCode(this.f26802a);
    }

    public final String toString() {
        return e.class.getName() + ": " + this.f26802a;
    }

    @Override // wt.a
    public final void h() {
    }

    @Override // wt.a
    public final void y() {
    }
}
