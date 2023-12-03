package nt;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
/* compiled from: ReflectJavaWildcardType.kt */
/* loaded from: classes2.dex */
public final class j0 extends g0 implements wt.a0 {

    /* renamed from: a  reason: collision with root package name */
    public final WildcardType f26817a;

    /* renamed from: b  reason: collision with root package name */
    public final is.w f26818b = is.w.f20676u;

    public j0(WildcardType wildcardType) {
        this.f26817a = wildcardType;
    }

    @Override // wt.a0
    public final boolean K() {
        Type[] upperBounds = this.f26817a.getUpperBounds();
        kotlin.jvm.internal.i.f(upperBounds, "reflectType.upperBounds");
        return !kotlin.jvm.internal.i.b(is.k.T1(upperBounds), Object.class);
    }

    @Override // nt.g0
    public final Type R() {
        return this.f26817a;
    }

    @Override // wt.d
    public final Collection<wt.a> getAnnotations() {
        return this.f26818b;
    }

    @Override // wt.a0
    public final g0 v() {
        g0 jVar;
        WildcardType wildcardType = this.f26817a;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length <= 1 && lowerBounds.length <= 1) {
            if (lowerBounds.length == 1) {
                Object e22 = is.k.e2(lowerBounds);
                kotlin.jvm.internal.i.f(e22, "lowerBounds.single()");
                Type type = (Type) e22;
                boolean z10 = type instanceof Class;
                if (z10) {
                    Class cls = (Class) type;
                    if (cls.isPrimitive()) {
                        return new e0(cls);
                    }
                }
                if (!(type instanceof GenericArrayType) && (!z10 || !((Class) type).isArray())) {
                    if (type instanceof WildcardType) {
                        jVar = new j0((WildcardType) type);
                    } else {
                        jVar = new u(type);
                    }
                } else {
                    jVar = new j(type);
                }
            } else {
                if (upperBounds.length == 1) {
                    Type ub2 = (Type) is.k.e2(upperBounds);
                    if (!kotlin.jvm.internal.i.b(ub2, Object.class)) {
                        kotlin.jvm.internal.i.f(ub2, "ub");
                        boolean z11 = ub2 instanceof Class;
                        if (z11) {
                            Class cls2 = (Class) ub2;
                            if (cls2.isPrimitive()) {
                                return new e0(cls2);
                            }
                        }
                        if (!(ub2 instanceof GenericArrayType) && (!z11 || !((Class) ub2).isArray())) {
                            if (ub2 instanceof WildcardType) {
                                jVar = new j0((WildcardType) ub2);
                            } else {
                                jVar = new u(ub2);
                            }
                        } else {
                            jVar = new j(ub2);
                        }
                    }
                }
                return null;
            }
            return jVar;
        }
        throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + wildcardType);
    }

    @Override // wt.d
    public final void o() {
    }
}
