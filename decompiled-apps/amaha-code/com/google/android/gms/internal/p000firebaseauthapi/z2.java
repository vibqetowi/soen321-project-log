package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.z2  reason: invalid package */
/* loaded from: classes.dex */
public final class z2 extends x2 {
    @Override // com.google.android.gms.internal.p000firebaseauthapi.x2
    public final /* synthetic */ int a(Object obj) {
        return ((y2) obj).a();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.x2
    public final int b(Object obj) {
        y2 y2Var = (y2) obj;
        int i6 = y2Var.f8255d;
        if (i6 == -1) {
            int i10 = 0;
            for (int i11 = 0; i11 < y2Var.f8252a; i11++) {
                int i12 = y2Var.f8253b[i11];
                int L = n0.L(8);
                int m10 = ((h0) y2Var.f8254c[i11]).m();
                i10 += n0.L(m10) + m10 + n0.L(24) + n0.L(i12 >>> 3) + n0.L(16) + L + L;
            }
            y2Var.f8255d = i10;
            return i10;
        }
        return i6;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.x2
    public final /* bridge */ /* synthetic */ y2 c(Object obj) {
        e1 e1Var = (e1) obj;
        y2 y2Var = e1Var.zzc;
        if (y2Var == y2.f) {
            y2 b10 = y2.b();
            e1Var.zzc = b10;
            return b10;
        }
        return y2Var;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.x2
    public final /* synthetic */ y2 d(Object obj) {
        return ((e1) obj).zzc;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.x2
    public final Object e(Object obj, Object obj2) {
        y2 y2Var = y2.f;
        if (!y2Var.equals(obj2)) {
            if (y2Var.equals(obj)) {
                y2 y2Var2 = (y2) obj2;
                y2 y2Var3 = (y2) obj;
                int i6 = y2Var3.f8252a + y2Var2.f8252a;
                int[] copyOf = Arrays.copyOf(y2Var3.f8253b, i6);
                System.arraycopy(y2Var2.f8253b, 0, copyOf, y2Var3.f8252a, y2Var2.f8252a);
                Object[] copyOf2 = Arrays.copyOf(y2Var3.f8254c, i6);
                System.arraycopy(y2Var2.f8254c, 0, copyOf2, y2Var3.f8252a, y2Var2.f8252a);
                return new y2(i6, copyOf, copyOf2, true);
            }
            y2 y2Var4 = (y2) obj2;
            y2 y2Var5 = (y2) obj;
            y2Var5.getClass();
            if (!y2Var4.equals(y2Var)) {
                if (y2Var5.f8256e) {
                    int i10 = y2Var5.f8252a + y2Var4.f8252a;
                    y2Var5.e(i10);
                    System.arraycopy(y2Var4.f8253b, 0, y2Var5.f8253b, y2Var5.f8252a, y2Var4.f8252a);
                    System.arraycopy(y2Var4.f8254c, 0, y2Var5.f8254c, y2Var5.f8252a, y2Var4.f8252a);
                    y2Var5.f8252a = i10;
                    return obj;
                }
                throw new UnsupportedOperationException();
            }
            return obj;
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.x2
    public final /* synthetic */ y2 f() {
        return y2.b();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.x2
    public final Object g(Object obj) {
        ((y2) obj).f8256e = false;
        return obj;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.x2
    public final /* bridge */ /* synthetic */ void h(int i6, int i10, Object obj) {
        ((y2) obj).c((i6 << 3) | 5, Integer.valueOf(i10));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.x2
    public final /* bridge */ /* synthetic */ void i(int i6, long j10, Object obj) {
        ((y2) obj).c((i6 << 3) | 1, Long.valueOf(j10));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.x2
    public final /* bridge */ /* synthetic */ void j(Object obj, int i6, Object obj2) {
        ((y2) obj).c((i6 << 3) | 3, obj2);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.x2
    public final /* bridge */ /* synthetic */ void k(Object obj, int i6, g0 g0Var) {
        ((y2) obj).c((i6 << 3) | 2, g0Var);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.x2
    public final /* bridge */ /* synthetic */ void l(int i6, long j10, Object obj) {
        ((y2) obj).c(i6 << 3, Long.valueOf(j10));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.x2
    public final void m(Object obj) {
        ((e1) obj).zzc.f8256e = false;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.x2
    public final /* synthetic */ void n(Object obj, Object obj2) {
        ((e1) obj).zzc = (y2) obj2;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.x2
    public final /* synthetic */ void o(Object obj, Object obj2) {
        ((e1) obj).zzc = (y2) obj2;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.x2
    public final /* synthetic */ void r(Object obj, o0 o0Var) {
        ((y2) obj).d(o0Var);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.x2
    public final void q() {
    }
}
