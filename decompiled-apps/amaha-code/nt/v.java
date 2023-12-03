package nt;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ReflectJavaConstructor.kt */
/* loaded from: classes2.dex */
public final class v extends a0 implements wt.k {

    /* renamed from: a  reason: collision with root package name */
    public final Constructor<?> f26831a;

    public v(Constructor<?> member) {
        kotlin.jvm.internal.i.g(member, "member");
        this.f26831a = member;
    }

    @Override // nt.a0
    public final Member R() {
        return this.f26831a;
    }

    @Override // wt.y
    public final ArrayList getTypeParameters() {
        TypeVariable<Constructor<?>>[] typeParameters = this.f26831a.getTypeParameters();
        kotlin.jvm.internal.i.f(typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Constructor<?>> typeVariable : typeParameters) {
            arrayList.add(new h0(typeVariable));
        }
        return arrayList;
    }

    @Override // wt.k
    public final List<wt.z> i() {
        boolean z10;
        Constructor<?> constructor = this.f26831a;
        Type[] types = constructor.getGenericParameterTypes();
        kotlin.jvm.internal.i.f(types, "types");
        if (types.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return is.w.f20676u;
        }
        Class<?> declaringClass = constructor.getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            types = (Type[]) is.i.L1(1, types.length, types);
        }
        Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
        if (parameterAnnotations.length >= types.length) {
            if (parameterAnnotations.length > types.length) {
                parameterAnnotations = (Annotation[][]) is.i.L1(parameterAnnotations.length - types.length, parameterAnnotations.length, parameterAnnotations);
            }
            return S(types, parameterAnnotations, constructor.isVarArgs());
        }
        throw new IllegalStateException("Illegal generic signature: " + constructor);
    }
}
