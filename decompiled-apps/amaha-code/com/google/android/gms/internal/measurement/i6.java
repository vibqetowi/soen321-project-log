package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class i6 extends k6 {
    @Override // com.google.android.gms.internal.measurement.k6
    public final void a(long j10, Object obj) {
        ((b6) y7.j(j10, obj)).b();
    }

    @Override // com.google.android.gms.internal.measurement.k6
    public final void b(long j10, Object obj, Object obj2) {
        b6 b6Var = (b6) y7.j(j10, obj);
        b6 b6Var2 = (b6) y7.j(j10, obj2);
        int size = b6Var.size();
        int size2 = b6Var2.size();
        if (size > 0 && size2 > 0) {
            if (!b6Var.c()) {
                b6Var = b6Var.k(size2 + size);
            }
            b6Var.addAll(b6Var2);
        }
        if (size > 0) {
            b6Var2 = b6Var;
        }
        y7.r(j10, obj, b6Var2);
    }
}
