package nt;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: ReflectJavaClassifierType.kt */
/* loaded from: classes2.dex */
public final class u extends g0 implements wt.j {

    /* renamed from: a  reason: collision with root package name */
    public final Type f26829a;

    /* renamed from: b  reason: collision with root package name */
    public final w f26830b;

    public u(Type reflectType) {
        w sVar;
        kotlin.jvm.internal.i.g(reflectType, "reflectType");
        this.f26829a = reflectType;
        if (reflectType instanceof Class) {
            sVar = new s((Class) reflectType);
        } else if (reflectType instanceof TypeVariable) {
            sVar = new h0((TypeVariable) reflectType);
        } else if (reflectType instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) reflectType).getRawType();
            kotlin.jvm.internal.i.e(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            sVar = new s((Class) rawType);
        } else {
            throw new IllegalStateException("Not a classifier type (" + reflectType.getClass() + "): " + reflectType);
        }
        this.f26830b = sVar;
    }

    @Override // wt.j
    public final boolean A() {
        boolean z10;
        Type type = this.f26829a;
        if (!(type instanceof Class)) {
            return false;
        }
        TypeVariable[] typeParameters = ((Class) type).getTypeParameters();
        kotlin.jvm.internal.i.f(typeParameters, "getTypeParameters()");
        if (typeParameters.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!(!z10)) {
            return false;
        }
        return true;
    }

    @Override // wt.j
    public final String B() {
        throw new UnsupportedOperationException("Type not found: " + this.f26829a);
    }

    @Override // wt.j
    public final ArrayList G() {
        wt.w wVar;
        wt.w wVar2;
        List<Type> c10 = d.c(this.f26829a);
        ArrayList arrayList = new ArrayList(is.i.H1(c10, 10));
        for (Type type : c10) {
            kotlin.jvm.internal.i.g(type, "type");
            boolean z10 = type instanceof Class;
            if (z10) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    wVar2 = new e0(cls);
                    arrayList.add(wVar2);
                }
            }
            if (!(type instanceof GenericArrayType) && (!z10 || !((Class) type).isArray())) {
                if (type instanceof WildcardType) {
                    wVar = new j0((WildcardType) type);
                } else {
                    wVar = new u(type);
                }
            } else {
                wVar = new j(type);
            }
            wVar2 = wVar;
            arrayList.add(wVar2);
        }
        return arrayList;
    }

    @Override // nt.g0
    public final Type R() {
        return this.f26829a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [nt.w, wt.i] */
    @Override // wt.j
    public final wt.i f() {
        return this.f26830b;
    }

    @Override // wt.d
    public final Collection<wt.a> getAnnotations() {
        return is.w.f20676u;
    }

    @Override // nt.g0, wt.d
    public final wt.a l(fu.c fqName) {
        kotlin.jvm.internal.i.g(fqName, "fqName");
        return null;
    }

    @Override // wt.j
    public final String q() {
        return this.f26829a.toString();
    }

    @Override // wt.d
    public final void o() {
    }
}
