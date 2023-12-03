package kotlin.jvm.internal;

import ys.i;
import ys.l;
/* compiled from: MutablePropertyReference1.java */
/* loaded from: classes2.dex */
public abstract class l extends n implements ys.i {
    public l(Object obj, Class cls, String str, String str2, int i6) {
        super(obj, cls, str, str2, i6);
    }

    @Override // kotlin.jvm.internal.a
    public final ys.c computeReflected() {
        return y.b(this);
    }

    @Override // ss.l
    public final Object invoke(Object obj) {
        return ((m) this).get(obj);
    }

    @Override // ys.l
    public final l.a n() {
        return ((ys.i) getReflected()).n();
    }

    @Override // ys.h
    public final i.a h() {
        return ((ys.i) getReflected()).h();
    }
}
