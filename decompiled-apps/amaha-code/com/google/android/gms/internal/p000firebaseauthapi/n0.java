package com.google.android.gms.internal.p000firebaseauthapi;

import com.android.volley.toolbox.a;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.n0  reason: invalid package */
/* loaded from: classes.dex */
public abstract class n0 extends a {

    /* renamed from: w  reason: collision with root package name */
    public static final Logger f7994w = Logger.getLogger(n0.class.getName());

    /* renamed from: x  reason: collision with root package name */
    public static final boolean f7995x = f3.f7842e;

    /* renamed from: v  reason: collision with root package name */
    public o0 f7996v;

    public n0() {
    }

    public static int J(String str) {
        int length;
        try {
            length = j3.c(str);
        } catch (i3 unused) {
            length = str.getBytes(i1.f7886a).length;
        }
        return L(length) + length;
    }

    public static int K(int i6) {
        return L(i6 << 3);
    }

    public static int L(int i6) {
        if ((i6 & (-128)) == 0) {
            return 1;
        }
        if ((i6 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i6) == 0) {
            return 3;
        }
        if ((i6 & (-268435456)) == 0) {
            return 4;
        }
        return 5;
    }

    public static int M(long j10) {
        int i6;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            j10 >>>= 28;
            i6 = 6;
        } else {
            i6 = 2;
        }
        if (((-2097152) & j10) != 0) {
            i6 += 2;
            j10 >>>= 14;
        }
        if ((j10 & (-16384)) != 0) {
            return i6 + 1;
        }
        return i6;
    }

    @Deprecated
    public static int f0(int i6, b2 b2Var, m2 m2Var) {
        int L = L(i6 << 3);
        return ((w) b2Var).b(m2Var) + L + L;
    }

    public static int g0(int i6) {
        if (i6 >= 0) {
            return L(i6);
        }
        return 10;
    }

    public final void N(String str, i3 i3Var) {
        f7994w.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) i3Var);
        byte[] bytes = str.getBytes(i1.f7886a);
        try {
            int length = bytes.length;
            c0(length);
            A(bytes, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzack(e10);
        }
    }

    public abstract void P(byte b10);

    public abstract void Q(int i6, boolean z10);

    public abstract void R(int i6, h0 h0Var);

    public abstract void S(int i6, int i10);

    public abstract void T(int i6);

    public abstract void U(int i6, long j10);

    public abstract void V(long j10);

    public abstract void W(int i6, int i10);

    public abstract void X(int i6);

    public abstract void Y(int i6, b2 b2Var, m2 m2Var);

    public abstract void Z(int i6, String str);

    public abstract void a0(int i6, int i10);

    public abstract void b0(int i6, int i10);

    public abstract void c0(int i6);

    public abstract void d0(int i6, long j10);

    public abstract void e0(long j10);

    public /* synthetic */ n0(int i6) {
    }
}
