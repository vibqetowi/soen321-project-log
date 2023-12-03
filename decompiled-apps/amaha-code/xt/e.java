package xt;

import gt.q0;
import java.util.Map;
import wu.b0;
/* compiled from: typeEnhancement.kt */
/* loaded from: classes2.dex */
public final class e implements ht.c {

    /* renamed from: a  reason: collision with root package name */
    public static final e f38011a = new e();

    @Override // ht.c
    public final b0 a() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters".toString());
    }

    @Override // ht.c
    public final Map<fu.e, ku.g<?>> b() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters".toString());
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
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters".toString());
    }

    public final String toString() {
        return "[EnhancedType]";
    }
}
