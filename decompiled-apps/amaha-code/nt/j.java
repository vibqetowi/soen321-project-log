package nt;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
/* compiled from: ReflectJavaArrayType.kt */
/* loaded from: classes2.dex */
public final class j extends g0 implements wt.f {

    /* renamed from: a  reason: collision with root package name */
    public final Type f26814a;

    /* renamed from: b  reason: collision with root package name */
    public final g0 f26815b;

    /* renamed from: c  reason: collision with root package name */
    public final is.w f26816c;

    public j(Type type) {
        g0 jVar;
        g0 g0Var;
        this.f26814a = type;
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            kotlin.jvm.internal.i.f(genericComponentType, "genericComponentType");
            boolean z10 = genericComponentType instanceof Class;
            if (z10) {
                Class cls = (Class) genericComponentType;
                if (cls.isPrimitive()) {
                    g0Var = new e0(cls);
                    this.f26815b = g0Var;
                    this.f26816c = is.w.f20676u;
                }
            }
            if (!(genericComponentType instanceof GenericArrayType) && (!z10 || !((Class) genericComponentType).isArray())) {
                if (genericComponentType instanceof WildcardType) {
                    jVar = new j0((WildcardType) genericComponentType);
                } else {
                    jVar = new u(genericComponentType);
                }
            } else {
                jVar = new j(genericComponentType);
            }
        } else {
            if (type instanceof Class) {
                Class cls2 = (Class) type;
                if (cls2.isArray()) {
                    Class<?> componentType = cls2.getComponentType();
                    kotlin.jvm.internal.i.f(componentType, "getComponentType()");
                    if (componentType.isPrimitive()) {
                        jVar = new e0(componentType);
                    } else if (!(componentType instanceof GenericArrayType) && !componentType.isArray()) {
                        if (componentType instanceof WildcardType) {
                            jVar = new j0((WildcardType) componentType);
                        } else {
                            jVar = new u(componentType);
                        }
                    } else {
                        jVar = new j(componentType);
                    }
                }
            }
            throw new IllegalArgumentException("Not an array type (" + type.getClass() + "): " + type);
        }
        g0Var = jVar;
        this.f26815b = g0Var;
        this.f26816c = is.w.f20676u;
    }

    @Override // wt.f
    public final g0 L() {
        return this.f26815b;
    }

    @Override // nt.g0
    public final Type R() {
        return this.f26814a;
    }

    @Override // wt.d
    public final Collection<wt.a> getAnnotations() {
        return this.f26816c;
    }

    @Override // wt.d
    public final void o() {
    }
}
