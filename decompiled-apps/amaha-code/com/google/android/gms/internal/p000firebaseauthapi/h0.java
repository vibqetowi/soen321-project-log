package com.google.android.gms.internal.p000firebaseauthapi;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;
import tr.r;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.h0  reason: invalid package */
/* loaded from: classes.dex */
public abstract class h0 implements Iterable, Serializable {

    /* renamed from: v  reason: collision with root package name */
    public static final g0 f7869v = new g0(i1.f7887b);

    /* renamed from: u  reason: collision with root package name */
    public int f7870u = 0;

    static {
        int i6 = y.f8247a;
    }

    public static int C(int i6, int i10, int i11) {
        int i12 = i10 - i6;
        if ((i6 | i10 | i12 | (i11 - i10)) < 0) {
            if (i6 >= 0) {
                if (i10 < i6) {
                    throw new IndexOutOfBoundsException(b.j("Beginning index larger than ending index: ", i6, ", ", i10));
                }
                throw new IndexOutOfBoundsException(b.j("End index: ", i10, " >= ", i11));
            }
            throw new IndexOutOfBoundsException(c.q("Beginning index: ", i6, " < 0"));
        }
        return i12;
    }

    public static g0 I(byte[] bArr) {
        return J(0, bArr, bArr.length);
    }

    public static g0 J(int i6, byte[] bArr, int i10) {
        C(i6, i6 + i10, bArr.length);
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i6, bArr2, 0, i10);
        return new g0(bArr2);
    }

    public final byte[] K() {
        int m10 = m();
        if (m10 == 0) {
            return i1.f7887b;
        }
        byte[] bArr = new byte[m10];
        o(m10, bArr);
        return bArr;
    }

    public abstract byte e(int i6);

    public abstract boolean equals(Object obj);

    public abstract byte g(int i6);

    public final int hashCode() {
        int i6 = this.f7870u;
        if (i6 == 0) {
            int m10 = m();
            i6 = q(m10, m10);
            if (i6 == 0) {
                i6 = 1;
            }
            this.f7870u = i6;
        }
        return i6;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new c0(this);
    }

    public abstract int m();

    public abstract void o(int i6, byte[] bArr);

    public abstract int q(int i6, int i10);

    public abstract g0 r();

    public abstract i0 s();

    public abstract String t(Charset charset);

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(m());
        if (m() <= 50) {
            concat = r.A(this);
        } else {
            concat = r.A(r()).concat("...");
        }
        objArr[2] = concat;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract void v(n0 n0Var);

    public abstract boolean z();
}
