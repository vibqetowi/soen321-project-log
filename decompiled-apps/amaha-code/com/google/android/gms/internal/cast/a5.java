package com.google.android.gms.internal.cast;

import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class a5 extends y4<z4, z4> {
    @Override // com.google.android.gms.internal.cast.y4
    public final /* bridge */ /* synthetic */ void a(Object obj, z4 z4Var) {
        ((c3) obj).zzc = z4Var;
    }

    @Override // com.google.android.gms.internal.cast.y4
    public final /* bridge */ /* synthetic */ z4 b(Object obj) {
        return ((c3) obj).zzc;
    }

    @Override // com.google.android.gms.internal.cast.y4
    public final z4 d(z4 z4Var, z4 z4Var2) {
        z4 z4Var3 = z4Var2;
        if (z4Var3.equals(z4.f7691d)) {
            return z4Var;
        }
        z4 z4Var4 = z4Var;
        z4Var4.getClass();
        int[] copyOf = Arrays.copyOf(z4Var4.f7692a, 0);
        System.arraycopy(z4Var3.f7692a, 0, copyOf, 0, 0);
        Object[] copyOf2 = Arrays.copyOf(z4Var4.f7693b, 0);
        System.arraycopy(z4Var3.f7693b, 0, copyOf2, 0, 0);
        return new z4(copyOf, copyOf2);
    }

    @Override // com.google.android.gms.internal.cast.y4
    public final int e(z4 z4Var) {
        z4 z4Var2 = z4Var;
        int i6 = z4Var2.f7694c;
        if (i6 == -1) {
            z4Var2.f7694c = 0;
            return 0;
        }
        return i6;
    }

    @Override // com.google.android.gms.internal.cast.y4
    public final int f(z4 z4Var) {
        z4 z4Var2 = z4Var;
        int i6 = z4Var2.f7694c;
        if (i6 == -1) {
            z4Var2.f7694c = 0;
            return 0;
        }
        return i6;
    }

    @Override // com.google.android.gms.internal.cast.y4
    public final /* bridge */ /* synthetic */ void g() {
    }

    @Override // com.google.android.gms.internal.cast.y4
    public final void c(c3 c3Var) {
    }
}
