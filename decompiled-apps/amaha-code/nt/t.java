package nt;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.WildcardType;
/* compiled from: ReflectJavaAnnotationArguments.kt */
/* loaded from: classes2.dex */
public final class t extends f implements wt.h {

    /* renamed from: b  reason: collision with root package name */
    public final Class<?> f26828b;

    public t(fu.e eVar, Class<?> cls) {
        super(eVar);
        this.f26828b = cls;
    }

    @Override // wt.h
    public final g0 c() {
        Class<?> type = this.f26828b;
        kotlin.jvm.internal.i.g(type, "type");
        if (type.isPrimitive()) {
            return new e0(type);
        }
        if (!(type instanceof GenericArrayType) && !type.isArray()) {
            if (type instanceof WildcardType) {
                return new j0((WildcardType) type);
            }
            return new u(type);
        }
        return new j(type);
    }
}
