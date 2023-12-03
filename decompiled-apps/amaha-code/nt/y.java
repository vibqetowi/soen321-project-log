package nt;

import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
/* compiled from: ReflectJavaField.kt */
/* loaded from: classes2.dex */
public final class y extends a0 implements wt.n {

    /* renamed from: a  reason: collision with root package name */
    public final Field f26833a;

    public y(Field member) {
        kotlin.jvm.internal.i.g(member, "member");
        this.f26833a = member;
    }

    @Override // wt.n
    public final boolean H() {
        return this.f26833a.isEnumConstant();
    }

    @Override // nt.a0
    public final Member R() {
        return this.f26833a;
    }

    @Override // wt.n
    public final wt.w a() {
        wt.w jVar;
        Type genericType = this.f26833a.getGenericType();
        kotlin.jvm.internal.i.f(genericType, "member.genericType");
        boolean z10 = genericType instanceof Class;
        if (z10) {
            Class cls = (Class) genericType;
            if (cls.isPrimitive()) {
                return new e0(cls);
            }
        }
        if (!(genericType instanceof GenericArrayType) && (!z10 || !((Class) genericType).isArray())) {
            if (genericType instanceof WildcardType) {
                jVar = new j0((WildcardType) genericType);
            } else {
                jVar = new u(genericType);
            }
        } else {
            jVar = new j(genericType);
        }
        return jVar;
    }

    @Override // wt.n
    public final void O() {
    }
}
