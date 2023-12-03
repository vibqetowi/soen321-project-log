package com.google.android.gms.internal.measurement;

import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class t7 extends r7 {
    @Override // com.google.android.gms.internal.measurement.r7
    public final /* synthetic */ int a(Object obj) {
        return ((s7) obj).a();
    }

    @Override // com.google.android.gms.internal.measurement.r7
    public final int b(Object obj) {
        s7 s7Var = (s7) obj;
        int i6 = s7Var.f8598d;
        if (i6 == -1) {
            int i10 = 0;
            for (int i11 = 0; i11 < s7Var.f8595a; i11++) {
                int i12 = s7Var.f8596b[i11];
                int V = e5.V(8);
                int m10 = ((b5) s7Var.f8597c[i11]).m();
                i10 += e5.V(m10) + m10 + e5.V(24) + e5.V(i12 >>> 3) + e5.V(16) + V + V;
            }
            s7Var.f8598d = i10;
            return i10;
        }
        return i6;
    }

    @Override // com.google.android.gms.internal.measurement.r7
    public final /* bridge */ /* synthetic */ s7 c(Object obj) {
        w5 w5Var = (w5) obj;
        s7 s7Var = w5Var.zzc;
        if (s7Var == s7.f) {
            s7 b10 = s7.b();
            w5Var.zzc = b10;
            return b10;
        }
        return s7Var;
    }

    @Override // com.google.android.gms.internal.measurement.r7
    public final /* synthetic */ s7 d(Object obj) {
        return ((w5) obj).zzc;
    }

    @Override // com.google.android.gms.internal.measurement.r7
    public final Object e(Object obj, Object obj2) {
        s7 s7Var = s7.f;
        if (!s7Var.equals(obj2)) {
            if (s7Var.equals(obj)) {
                s7 s7Var2 = (s7) obj2;
                s7 s7Var3 = (s7) obj;
                int i6 = s7Var3.f8595a + s7Var2.f8595a;
                int[] copyOf = Arrays.copyOf(s7Var3.f8596b, i6);
                System.arraycopy(s7Var2.f8596b, 0, copyOf, s7Var3.f8595a, s7Var2.f8595a);
                Object[] copyOf2 = Arrays.copyOf(s7Var3.f8597c, i6);
                System.arraycopy(s7Var2.f8597c, 0, copyOf2, s7Var3.f8595a, s7Var2.f8595a);
                return new s7(i6, copyOf, copyOf2, true);
            }
            s7 s7Var4 = (s7) obj2;
            s7 s7Var5 = (s7) obj;
            s7Var5.getClass();
            if (!s7Var4.equals(s7Var)) {
                if (s7Var5.f8599e) {
                    int i10 = s7Var5.f8595a + s7Var4.f8595a;
                    s7Var5.e(i10);
                    System.arraycopy(s7Var4.f8596b, 0, s7Var5.f8596b, s7Var5.f8595a, s7Var4.f8595a);
                    System.arraycopy(s7Var4.f8597c, 0, s7Var5.f8597c, s7Var5.f8595a, s7Var4.f8595a);
                    s7Var5.f8595a = i10;
                    return obj;
                }
                throw new UnsupportedOperationException();
            }
            return obj;
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.measurement.r7
    public final /* bridge */ /* synthetic */ void f(int i6, long j10, Object obj) {
        ((s7) obj).c(i6 << 3, Long.valueOf(j10));
    }

    @Override // com.google.android.gms.internal.measurement.r7
    public final void g(Object obj) {
        ((w5) obj).zzc.f8599e = false;
    }

    @Override // com.google.android.gms.internal.measurement.r7
    public final /* synthetic */ void h(Object obj, Object obj2) {
        ((w5) obj).zzc = (s7) obj2;
    }

    @Override // com.google.android.gms.internal.measurement.r7
    public final /* synthetic */ void i(Object obj, f5 f5Var) {
        ((s7) obj).d(f5Var);
    }
}
