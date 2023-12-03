package ht;

import gt.q0;
import java.util.Map;
import wu.b0;
import wu.i0;
/* compiled from: AnnotationDescriptorImpl.java */
/* loaded from: classes2.dex */
public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    public final b0 f19480a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<fu.e, ku.g<?>> f19481b;

    /* renamed from: c  reason: collision with root package name */
    public final q0 f19482c;

    public d(i0 i0Var, Map map, q0 q0Var) {
        if (i0Var != null) {
            if (map != null) {
                if (q0Var != null) {
                    this.f19480a = i0Var;
                    this.f19481b = map;
                    this.f19482c = q0Var;
                    return;
                }
                c(2);
                throw null;
            }
            c(1);
            throw null;
        }
        c(0);
        throw null;
    }

    public static /* synthetic */ void c(int i6) {
        String str;
        int i10;
        if (i6 != 3 && i6 != 4 && i6 != 5) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i6 != 3 && i6 != 4 && i6 != 5) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        Object[] objArr = new Object[i10];
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3 && i6 != 4 && i6 != 5) {
                    objArr[0] = "annotationType";
                } else {
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
                }
            } else {
                objArr[0] = "source";
            }
        } else {
            objArr[0] = "valueArguments";
        }
        if (i6 != 3) {
            if (i6 != 4) {
                if (i6 != 5) {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
                } else {
                    objArr[1] = "getSource";
                }
            } else {
                objArr[1] = "getAllValueArguments";
            }
        } else {
            objArr[1] = "getType";
        }
        if (i6 != 3 && i6 != 4 && i6 != 5) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i6 == 3 || i6 == 4 || i6 == 5) {
            throw new IllegalStateException(format);
        }
    }

    @Override // ht.c
    public final b0 a() {
        b0 b0Var = this.f19480a;
        if (b0Var != null) {
            return b0Var;
        }
        c(3);
        throw null;
    }

    @Override // ht.c
    public final Map<fu.e, ku.g<?>> b() {
        Map<fu.e, ku.g<?>> map = this.f19481b;
        if (map != null) {
            return map;
        }
        c(4);
        throw null;
    }

    @Override // ht.c
    public final fu.c e() {
        gt.e d10 = mu.a.d(this);
        if (d10 == null) {
            return null;
        }
        if (yu.i.f(d10)) {
            d10 = null;
        }
        if (d10 == null) {
            return null;
        }
        return mu.a.c(d10);
    }

    @Override // ht.c
    public final q0 g() {
        q0 q0Var = this.f19482c;
        if (q0Var != null) {
            return q0Var;
        }
        c(5);
        throw null;
    }

    public final String toString() {
        return hu.c.f19528a.p(this, null);
    }
}
