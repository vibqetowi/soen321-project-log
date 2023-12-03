package nt;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
/* compiled from: ReflectJavaMember.kt */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f26791a = new c();

    /* renamed from: b  reason: collision with root package name */
    public static a f26792b;

    /* compiled from: ReflectJavaMember.kt */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Method f26793a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f26794b;

        public a(Method method, Method method2) {
            this.f26793a = method;
            this.f26794b = method2;
        }
    }

    public static a a(Member member) {
        Class<?> cls = member.getClass();
        try {
            return new a(cls.getMethod("getParameters", new Class[0]), d.d(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return new a(null, null);
        }
    }
}
