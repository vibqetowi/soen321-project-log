package com.google.android.gms.internal.p000firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.x2  reason: invalid package */
/* loaded from: classes.dex */
public abstract class x2 {
    public abstract int a(Object obj);

    public abstract int b(Object obj);

    public abstract y2 c(Object obj);

    public abstract y2 d(Object obj);

    public abstract Object e(Object obj, Object obj2);

    public abstract y2 f();

    public abstract Object g(Object obj);

    public abstract void h(int i6, int i10, Object obj);

    public abstract void i(int i6, long j10, Object obj);

    public abstract void j(Object obj, int i6, Object obj2);

    public abstract void k(Object obj, int i6, g0 g0Var);

    public abstract void l(int i6, long j10, Object obj);

    public abstract void m(Object obj);

    public abstract void n(Object obj, Object obj2);

    public abstract void o(Object obj, Object obj2);

    public final boolean p(Object obj, k0 k0Var) {
        int i6 = k0Var.f7928b;
        int i10 = i6 >>> 3;
        int i11 = i6 & 7;
        j0 j0Var = k0Var.f7927a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            return false;
                        }
                        if (i11 == 5) {
                            k0Var.q(5);
                            h(i10, ((i0) j0Var).h(), obj);
                            return true;
                        }
                        int i12 = zzadn.f8297u;
                        throw new zzadm();
                    }
                    y2 f = f();
                    int i13 = (i10 << 3) | 4;
                    while (k0Var.t() != Integer.MAX_VALUE && p(f, k0Var)) {
                    }
                    if (i13 == k0Var.f7928b) {
                        g(f);
                        j(obj, i10, f);
                        return true;
                    }
                    throw new zzadn("Protocol message end-group tag did not match expected tag.");
                }
                k(obj, i10, k0Var.u());
                return true;
            }
            k0Var.q(1);
            i(i10, ((i0) j0Var).j(), obj);
            return true;
        }
        k0Var.q(0);
        l(i10, ((i0) j0Var).k(), obj);
        return true;
    }

    public abstract void q();

    public abstract void r(Object obj, o0 o0Var);
}
