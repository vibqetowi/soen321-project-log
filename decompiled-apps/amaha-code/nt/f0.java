package nt;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import nt.a;
/* compiled from: ReflectJavaRecordComponent.kt */
/* loaded from: classes2.dex */
public final class f0 extends a0 implements wt.v {

    /* renamed from: a  reason: collision with root package name */
    public final Object f26806a;

    public f0(Object recordComponent) {
        kotlin.jvm.internal.i.g(recordComponent, "recordComponent");
        this.f26806a = recordComponent;
    }

    @Override // nt.a0
    public final Member R() {
        Object recordComponent = this.f26806a;
        kotlin.jvm.internal.i.g(recordComponent, "recordComponent");
        a.C0440a c0440a = a.f26782a;
        Method method = null;
        if (c0440a == null) {
            Class<?> cls = recordComponent.getClass();
            try {
                c0440a = new a.C0440a(cls.getMethod("getType", new Class[0]), cls.getMethod("getAccessor", new Class[0]));
            } catch (NoSuchMethodException unused) {
                c0440a = new a.C0440a(null, null);
            }
            a.f26782a = c0440a;
        }
        Method method2 = c0440a.f26784b;
        if (method2 != null) {
            Object invoke = method2.invoke(recordComponent, new Object[0]);
            kotlin.jvm.internal.i.e(invoke, "null cannot be cast to non-null type java.lang.reflect.Method");
            method = (Method) invoke;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    @Override // wt.v
    public final wt.w a() {
        Object recordComponent = this.f26806a;
        kotlin.jvm.internal.i.g(recordComponent, "recordComponent");
        a.C0440a c0440a = a.f26782a;
        Class cls = null;
        if (c0440a == null) {
            Class<?> cls2 = recordComponent.getClass();
            try {
                c0440a = new a.C0440a(cls2.getMethod("getType", new Class[0]), cls2.getMethod("getAccessor", new Class[0]));
            } catch (NoSuchMethodException unused) {
                c0440a = new a.C0440a(null, null);
            }
            a.f26782a = c0440a;
        }
        Method method = c0440a.f26783a;
        if (method != null) {
            Object invoke = method.invoke(recordComponent, new Object[0]);
            kotlin.jvm.internal.i.e(invoke, "null cannot be cast to non-null type java.lang.Class<*>");
            cls = (Class) invoke;
        }
        if (cls != null) {
            return new u(cls);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }

    @Override // wt.v
    public final boolean b() {
        return false;
    }
}
