package nt;

import gt.c1;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import nt.c;
import nt.c0;
import nt.h;
/* compiled from: ReflectJavaMember.kt */
/* loaded from: classes2.dex */
public abstract class a0 extends w implements h, c0, wt.p {
    public abstract Member R();

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList S(Type[] typeArr, Annotation[][] annotationArr, boolean z10) {
        ArrayList arrayList;
        int i6;
        g0 jVar;
        g0 g0Var;
        String str;
        boolean z11;
        Method method;
        ArrayList arrayList2 = new ArrayList(typeArr.length);
        c cVar = c.f26791a;
        Member member = R();
        kotlin.jvm.internal.i.g(member, "member");
        c.a aVar = c.f26792b;
        if (aVar == null) {
            synchronized (cVar) {
                aVar = c.f26792b;
                if (aVar == null) {
                    aVar = c.a(member);
                    c.f26792b = aVar;
                }
            }
        }
        Method method2 = aVar.f26793a;
        if (method2 == null || (method = aVar.f26794b) == null) {
            arrayList = null;
        } else {
            Object invoke = method2.invoke(member, new Object[0]);
            kotlin.jvm.internal.i.e(invoke, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr = (Object[]) invoke;
            arrayList = new ArrayList(objArr.length);
            for (Object obj : objArr) {
                Object invoke2 = method.invoke(obj, new Object[0]);
                kotlin.jvm.internal.i.e(invoke2, "null cannot be cast to non-null type kotlin.String");
                arrayList.add((String) invoke2);
            }
        }
        if (arrayList != null) {
            i6 = arrayList.size() - typeArr.length;
        } else {
            i6 = 0;
        }
        int length = typeArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            Type type = typeArr[i10];
            kotlin.jvm.internal.i.g(type, "type");
            boolean z12 = type instanceof Class;
            if (z12) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    g0Var = new e0(cls);
                    if (arrayList == null) {
                        str = (String) is.u.j2(i10 + i6, arrayList);
                        if (str == null) {
                            throw new IllegalStateException(("No parameter with index " + i10 + '+' + i6 + " (name=" + getName() + " type=" + g0Var + ") in " + this).toString());
                        }
                    } else {
                        str = null;
                    }
                    if (!z10 && i10 == typeArr.length - 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    arrayList2.add(new i0(g0Var, annotationArr[i10], str, z11));
                }
            }
            if (!(type instanceof GenericArrayType) && (!z12 || !((Class) type).isArray())) {
                if (type instanceof WildcardType) {
                    jVar = new j0((WildcardType) type);
                } else {
                    jVar = new u(type);
                }
            } else {
                jVar = new j(type);
            }
            g0Var = jVar;
            if (arrayList == null) {
            }
            if (!z10) {
            }
            z11 = false;
            arrayList2.add(new i0(g0Var, annotationArr[i10], str, z11));
        }
        return arrayList2;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof a0) && kotlin.jvm.internal.i.b(R(), ((a0) obj).R())) {
            return true;
        }
        return false;
    }

    @Override // wt.d
    public final Collection getAnnotations() {
        return h.a.b(this);
    }

    @Override // nt.c0
    public final int getModifiers() {
        return R().getModifiers();
    }

    @Override // wt.s
    public final fu.e getName() {
        fu.e eVar;
        String name = R().getName();
        if (name != null) {
            eVar = fu.e.j(name);
        } else {
            eVar = null;
        }
        if (eVar == null) {
            return fu.g.f15933a;
        }
        return eVar;
    }

    @Override // wt.r
    public final c1 getVisibility() {
        return c0.a.a(this);
    }

    public final int hashCode() {
        return R().hashCode();
    }

    @Override // wt.r
    public final boolean isAbstract() {
        return Modifier.isAbstract(getModifiers());
    }

    @Override // wt.r
    public final boolean isFinal() {
        return Modifier.isFinal(getModifiers());
    }

    @Override // wt.r
    public final boolean j() {
        return Modifier.isStatic(getModifiers());
    }

    @Override // wt.d
    public final wt.a l(fu.c cVar) {
        return h.a.a(this, cVar);
    }

    @Override // wt.p
    public final s p() {
        Class<?> declaringClass = R().getDeclaringClass();
        kotlin.jvm.internal.i.f(declaringClass, "member.declaringClass");
        return new s(declaringClass);
    }

    public final String toString() {
        return getClass().getName() + ": " + R();
    }

    @Override // nt.h
    public final AnnotatedElement z() {
        Member R = R();
        kotlin.jvm.internal.i.e(R, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        return (AnnotatedElement) R;
    }

    @Override // wt.d
    public final void o() {
    }
}
