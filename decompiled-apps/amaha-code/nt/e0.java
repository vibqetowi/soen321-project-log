package nt;

import java.lang.reflect.Type;
import java.util.Collection;
/* compiled from: ReflectJavaPrimitiveType.kt */
/* loaded from: classes2.dex */
public final class e0 extends g0 implements wt.u {

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f26803a;

    /* renamed from: b  reason: collision with root package name */
    public final is.w f26804b = is.w.f20676u;

    public e0(Class<?> cls) {
        this.f26803a = cls;
    }

    @Override // nt.g0
    public final Type R() {
        return this.f26803a;
    }

    @Override // wt.u
    public final dt.k a() {
        Class cls = Void.TYPE;
        Class<?> cls2 = this.f26803a;
        if (kotlin.jvm.internal.i.b(cls2, cls)) {
            return null;
        }
        return nu.c.f(cls2.getName()).i();
    }

    @Override // wt.d
    public final Collection<wt.a> getAnnotations() {
        return this.f26804b;
    }

    @Override // wt.d
    public final void o() {
    }
}
