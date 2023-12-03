package nt;

import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ReflectJavaMethod.kt */
/* loaded from: classes2.dex */
public final class b0 extends a0 implements wt.q {

    /* renamed from: a  reason: collision with root package name */
    public final Method f26790a;

    public b0(Method member) {
        kotlin.jvm.internal.i.g(member, "member");
        this.f26790a = member;
    }

    @Override // wt.q
    public final boolean M() {
        if (T() != null) {
            return true;
        }
        return false;
    }

    @Override // nt.a0
    public final Member R() {
        return this.f26790a;
    }

    public final f T() {
        f zVar;
        Object defaultValue = this.f26790a.getDefaultValue();
        if (defaultValue == null) {
            return null;
        }
        Class<?> cls = defaultValue.getClass();
        List<ys.d<? extends Object>> list = d.f26795a;
        if (Enum.class.isAssignableFrom(cls)) {
            zVar = new x(null, (Enum) defaultValue);
        } else if (defaultValue instanceof Annotation) {
            zVar = new g(null, (Annotation) defaultValue);
        } else if (defaultValue instanceof Object[]) {
            zVar = new i(null, (Object[]) defaultValue);
        } else if (defaultValue instanceof Class) {
            zVar = new t(null, (Class) defaultValue);
        } else {
            zVar = new z(defaultValue, null);
        }
        return zVar;
    }

    @Override // wt.y
    public final ArrayList getTypeParameters() {
        TypeVariable<Method>[] typeParameters = this.f26790a.getTypeParameters();
        kotlin.jvm.internal.i.f(typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new h0(typeVariable));
        }
        return arrayList;
    }

    @Override // wt.q
    public final List<wt.z> i() {
        Method method = this.f26790a;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        kotlin.jvm.internal.i.f(genericParameterTypes, "member.genericParameterTypes");
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        kotlin.jvm.internal.i.f(parameterAnnotations, "member.parameterAnnotations");
        return S(genericParameterTypes, parameterAnnotations, method.isVarArgs());
    }

    @Override // wt.q
    public final g0 m() {
        g0 jVar;
        Type genericReturnType = this.f26790a.getGenericReturnType();
        kotlin.jvm.internal.i.f(genericReturnType, "member.genericReturnType");
        boolean z10 = genericReturnType instanceof Class;
        if (z10) {
            Class cls = (Class) genericReturnType;
            if (cls.isPrimitive()) {
                return new e0(cls);
            }
        }
        if (!(genericReturnType instanceof GenericArrayType) && (!z10 || !((Class) genericReturnType).isArray())) {
            if (genericReturnType instanceof WildcardType) {
                jVar = new j0((WildcardType) genericReturnType);
            } else {
                jVar = new u(genericReturnType);
            }
        } else {
            jVar = new j(genericReturnType);
        }
        return jVar;
    }
}
