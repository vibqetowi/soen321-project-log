package kotlin.jvm.internal;

import ys.l;
/* compiled from: PropertyReference1.java */
/* loaded from: classes2.dex */
public abstract class r extends t implements ys.l {
    public r(Object obj, Class cls, String str, String str2, int i6) {
        super(obj, cls, str, str2, i6);
    }

    @Override // kotlin.jvm.internal.a
    public final ys.c computeReflected() {
        return y.c(this);
    }

    @Override // ss.l
    public final Object invoke(Object obj) {
        return ((s) this).get(obj);
    }

    @Override // ys.l
    public final l.a n() {
        return ((ys.l) getReflected()).n();
    }
}
