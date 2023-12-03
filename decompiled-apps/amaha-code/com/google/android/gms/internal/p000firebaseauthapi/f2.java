package com.google.android.gms.internal.p000firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.f2  reason: invalid package */
/* loaded from: classes.dex */
public final class f2 implements m2 {

    /* renamed from: a  reason: collision with root package name */
    public final b2 f7834a;

    /* renamed from: b  reason: collision with root package name */
    public final x2 f7835b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f7836c;

    /* renamed from: d  reason: collision with root package name */
    public final s0 f7837d;

    public f2(x2 x2Var, s0 s0Var, b2 b2Var) {
        this.f7835b = x2Var;
        this.f7836c = s0Var.h(b2Var);
        this.f7837d = s0Var;
        this.f7834a = b2Var;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m2
    public final void a(Object obj) {
        this.f7835b.m(obj);
        this.f7837d.e(obj);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m2
    public final int b(Object obj) {
        int hashCode = this.f7835b.d(obj).hashCode();
        if (!this.f7836c) {
            return hashCode;
        }
        this.f7837d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m2
    public final boolean c(Object obj) {
        this.f7837d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m2
    public final e1 d() {
        b2 b2Var = this.f7834a;
        if (b2Var instanceof e1) {
            return ((e1) b2Var).s();
        }
        return b2Var.q().d();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m2
    public final int e(Object obj) {
        x2 x2Var = this.f7835b;
        int b10 = x2Var.b(x2Var.d(obj));
        if (!this.f7836c) {
            return b10;
        }
        this.f7837d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m2
    public final void f(Object obj, Object obj2) {
        Class cls = n2.f7998a;
        x2 x2Var = this.f7835b;
        x2Var.o(obj, x2Var.e(x2Var.d(obj), x2Var.d(obj2)));
        if (!this.f7836c) {
            return;
        }
        this.f7837d.a(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m2
    public final boolean g(Object obj, Object obj2) {
        x2 x2Var = this.f7835b;
        if (!x2Var.d(obj).equals(x2Var.d(obj2))) {
            return false;
        }
        if (!this.f7836c) {
            return true;
        }
        s0 s0Var = this.f7837d;
        s0Var.a(obj);
        s0Var.a(obj2);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0090 A[EDGE_INSN: B:83:0x0090->B:45:0x0090 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0050 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.m2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(Object obj, k0 k0Var, r0 r0Var) {
        boolean z10;
        int i6;
        boolean z11;
        int i10;
        x2 x2Var = this.f7835b;
        y2 c10 = x2Var.c(obj);
        s0 s0Var = this.f7837d;
        s0Var.b(obj);
        while (k0Var.t() != Integer.MAX_VALUE) {
            try {
                int i11 = k0Var.f7928b;
                boolean z12 = false;
                j0 j0Var = k0Var.f7927a;
                b2 b2Var = this.f7834a;
                if (i11 != 11) {
                    if ((i11 & 7) == 2) {
                        if (s0Var.c(r0Var, b2Var, i11 >>> 3) != null) {
                            s0Var.f();
                        } else {
                            z10 = x2Var.p(c10, k0Var);
                        }
                    } else {
                        if (!j0Var.c() && (i6 = k0Var.f7928b) != k0Var.f7929c) {
                            z12 = j0Var.e(i6);
                        }
                        z10 = z12;
                    }
                    if (!z10) {
                        return;
                    }
                } else {
                    d1 d1Var = null;
                    g0 g0Var = null;
                    int i12 = 0;
                    while (k0Var.t() != Integer.MAX_VALUE) {
                        int i13 = k0Var.f7928b;
                        if (i13 == 16) {
                            k0Var.q(0);
                            i12 = ((i0) j0Var).i();
                            d1Var = s0Var.c(r0Var, b2Var, i12);
                        } else if (i13 == 26) {
                            if (d1Var != null) {
                                s0Var.f();
                            } else {
                                g0Var = k0Var.u();
                            }
                        } else {
                            if (!j0Var.c() && (i10 = k0Var.f7928b) != k0Var.f7929c) {
                                z11 = j0Var.e(i10);
                                if (z11) {
                                    break;
                                }
                            }
                            z11 = false;
                            if (z11) {
                            }
                        }
                    }
                    if (k0Var.f7928b == 12) {
                        if (g0Var != null) {
                            if (d1Var != null) {
                                s0Var.g();
                            } else {
                                x2Var.k(c10, i12, g0Var);
                            }
                        }
                    } else {
                        throw new zzadn("Protocol message end-group tag did not match expected tag.");
                    }
                }
            } finally {
                x2Var.n(obj, c10);
            }
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m2
    public final void i(Object obj, byte[] bArr, int i6, int i10, z zVar) {
        e1 e1Var = (e1) obj;
        if (e1Var.zzc == y2.f) {
            e1Var.zzc = y2.b();
        }
        c1 c1Var = (c1) obj;
        throw null;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m2
    public final void j(Object obj, o0 o0Var) {
        this.f7837d.a(obj);
        throw null;
    }
}
