package nt;

import java.lang.annotation.Annotation;
import java.util.Collection;
/* compiled from: ReflectJavaValueParameter.kt */
/* loaded from: classes2.dex */
public final class i0 extends w implements wt.z {

    /* renamed from: a  reason: collision with root package name */
    public final g0 f26810a;

    /* renamed from: b  reason: collision with root package name */
    public final Annotation[] f26811b;

    /* renamed from: c  reason: collision with root package name */
    public final String f26812c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f26813d;

    public i0(g0 g0Var, Annotation[] reflectAnnotations, String str, boolean z10) {
        kotlin.jvm.internal.i.g(reflectAnnotations, "reflectAnnotations");
        this.f26810a = g0Var;
        this.f26811b = reflectAnnotations;
        this.f26812c = str;
        this.f26813d = z10;
    }

    @Override // wt.z
    public final wt.w a() {
        return this.f26810a;
    }

    @Override // wt.z
    public final boolean b() {
        return this.f26813d;
    }

    @Override // wt.d
    public final Collection getAnnotations() {
        return sp.b.s(this.f26811b);
    }

    @Override // wt.z
    public final fu.e getName() {
        String str = this.f26812c;
        if (str != null) {
            return fu.e.i(str);
        }
        return null;
    }

    @Override // wt.d
    public final wt.a l(fu.c fqName) {
        kotlin.jvm.internal.i.g(fqName, "fqName");
        return sp.b.q(this.f26811b, fqName);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i0.class.getName());
        sb2.append(": ");
        if (this.f26813d) {
            str = "vararg ";
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append(getName());
        sb2.append(": ");
        sb2.append(this.f26810a);
        return sb2.toString();
    }

    @Override // wt.d
    public final void o() {
    }
}
