package com.google.android.gms.internal.cast;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class q3 extends r3 {
    @Override // com.google.android.gms.internal.cast.r3
    public final void a(long j10, c3 c3Var) {
        ((j3) i5.l(j10, c3Var)).b();
    }

    @Override // com.google.android.gms.internal.cast.r3
    public final void b(long j10, Object obj, Object obj2) {
        j3 j3Var = (j3) i5.l(j10, obj);
        j3 j3Var2 = (j3) i5.l(j10, obj2);
        int size = j3Var.size();
        int size2 = j3Var2.size();
        if (size > 0 && size2 > 0) {
            if (!j3Var.a()) {
                j3Var = j3Var.D(size2 + size);
            }
            j3Var.addAll(j3Var2);
        }
        if (size > 0) {
            j3Var2 = j3Var;
        }
        i5.m(j10, obj, j3Var2);
    }
}
