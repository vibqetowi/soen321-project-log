package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public abstract class b5 implements Iterable, Serializable {

    /* renamed from: v  reason: collision with root package name */
    public static final a5 f8311v = new a5(c6.f8319b);

    /* renamed from: u  reason: collision with root package name */
    public int f8312u = 0;

    static {
        int i6 = t4.f8611a;
    }

    public static int v(int i6, int i10, int i11) {
        int i12 = i10 - i6;
        if ((i6 | i10 | i12 | (i11 - i10)) < 0) {
            if (i6 >= 0) {
                if (i10 < i6) {
                    throw new IndexOutOfBoundsException(defpackage.b.j("Beginning index larger than ending index: ", i6, ", ", i10));
                }
                throw new IndexOutOfBoundsException(defpackage.b.j("End index: ", i10, " >= ", i11));
            }
            throw new IndexOutOfBoundsException(defpackage.c.q("Beginning index: ", i6, " < 0"));
        }
        return i12;
    }

    public static a5 z(int i6, byte[] bArr, int i10) {
        v(i6, i6 + i10, bArr.length);
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i6, bArr2, 0, i10);
        return new a5(bArr2);
    }

    public abstract byte e(int i6);

    public abstract boolean equals(Object obj);

    public abstract byte g(int i6);

    public final int hashCode() {
        int i6 = this.f8312u;
        if (i6 == 0) {
            int m10 = m();
            i6 = o(m10, m10);
            if (i6 == 0) {
                i6 = 1;
            }
            this.f8312u = i6;
        }
        return i6;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new w4(this);
    }

    public abstract int m();

    public abstract int o(int i6, int i10);

    public abstract a5 q();

    public abstract String r(Charset charset);

    public abstract void s(e5 e5Var);

    public abstract boolean t();

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(m());
        if (m() <= 50) {
            concat = sp.b.n0(this);
        } else {
            concat = sp.b.n0(q()).concat("...");
        }
        objArr[2] = concat;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}
