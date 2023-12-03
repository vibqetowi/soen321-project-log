package com.google.android.gms.internal.cast;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public abstract class n2 implements Iterable<Byte>, Serializable {

    /* renamed from: v  reason: collision with root package name */
    public static final m2 f7604v = new m2(k3.f7571b);

    /* renamed from: u  reason: collision with root package name */
    public int f7605u = 0;

    static {
        int i6 = i2.f7554a;
    }

    public static void v(int i6) {
        if (((i6 - 47) | 47) >= 0) {
            return;
        }
        throw new IndexOutOfBoundsException(defpackage.b.h(37, "End index: 47 >= ", i6));
    }

    public abstract byte e(int i6);

    public abstract boolean equals(Object obj);

    public abstract byte g(int i6);

    public final int hashCode() {
        int i6 = this.f7605u;
        if (i6 == 0) {
            int m10 = m();
            i6 = t(m10, m10);
            if (i6 == 0) {
                i6 = 1;
            }
            this.f7605u = i6;
        }
        return i6;
    }

    @Override // java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
        return new j2(this);
    }

    public abstract int m();

    public abstract m2 o();

    public abstract void q(q2 q2Var);

    public abstract String r(Charset charset);

    public abstract boolean s();

    public abstract int t(int i6, int i10);

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(m());
        if (m() <= 50) {
            concat = g.a(this);
        } else {
            concat = String.valueOf(g.a(o())).concat("...");
        }
        objArr[2] = concat;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}
