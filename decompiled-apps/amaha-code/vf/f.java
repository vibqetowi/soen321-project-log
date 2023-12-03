package vf;

import java.io.Reader;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import r1.b0;
import uf.k;
/* compiled from: JsonTreeReader.java */
/* loaded from: classes.dex */
public final class f extends yf.a {
    public static final Object N;
    public Object[] J;
    public int K;
    public String[] L;
    public int[] M;

    /* compiled from: JsonTreeReader.java */
    /* loaded from: classes.dex */
    public class a extends Reader {
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i6, int i10) {
            throw new AssertionError();
        }
    }

    static {
        new a();
        N = new Object();
    }

    private String G(boolean z10) {
        StringBuilder sb2 = new StringBuilder("$");
        int i6 = 0;
        while (true) {
            int i10 = this.K;
            if (i6 < i10) {
                Object[] objArr = this.J;
                Object obj = objArr[i6];
                if (obj instanceof sf.k) {
                    i6++;
                    if (i6 < i10 && (objArr[i6] instanceof Iterator)) {
                        int i11 = this.M[i6];
                        if (z10 && i11 > 0 && (i6 == i10 - 1 || i6 == i10 - 2)) {
                            i11--;
                        }
                        sb2.append('[');
                        sb2.append(i11);
                        sb2.append(']');
                    }
                } else if ((obj instanceof sf.o) && (i6 = i6 + 1) < i10 && (objArr[i6] instanceof Iterator)) {
                    sb2.append('.');
                    String str = this.L[i6];
                    if (str != null) {
                        sb2.append(str);
                    }
                }
                i6++;
            } else {
                return sb2.toString();
            }
        }
    }

    private String R() {
        return " at path " + G(false);
    }

    @Override // yf.a
    public final String I() {
        return G(true);
    }

    @Override // yf.a
    public final boolean J() {
        int y02 = y0();
        if (y02 != 4 && y02 != 2 && y02 != 10) {
            return true;
        }
        return false;
    }

    @Override // yf.a
    public final void N0() {
        if (y0() == 5) {
            k0();
            this.L[this.K - 2] = "null";
        } else {
            R0();
            int i6 = this.K;
            if (i6 > 0) {
                this.L[i6 - 1] = "null";
            }
        }
        int i10 = this.K;
        if (i10 > 0) {
            int[] iArr = this.M;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    public final void P0(int i6) {
        if (y0() == i6) {
            return;
        }
        throw new IllegalStateException("Expected " + b0.k(i6) + " but was " + b0.k(y0()) + R());
    }

    public final Object Q0() {
        return this.J[this.K - 1];
    }

    public final Object R0() {
        Object[] objArr = this.J;
        int i6 = this.K - 1;
        this.K = i6;
        Object obj = objArr[i6];
        objArr[i6] = null;
        return obj;
    }

    public final void S0(Object obj) {
        int i6 = this.K;
        Object[] objArr = this.J;
        if (i6 == objArr.length) {
            int i10 = i6 * 2;
            this.J = Arrays.copyOf(objArr, i10);
            this.M = Arrays.copyOf(this.M, i10);
            this.L = (String[]) Arrays.copyOf(this.L, i10);
        }
        Object[] objArr2 = this.J;
        int i11 = this.K;
        this.K = i11 + 1;
        objArr2[i11] = obj;
    }

    @Override // yf.a
    public final void a() {
        P0(1);
        S0(((sf.k) Q0()).iterator());
        this.M[this.K - 1] = 0;
    }

    @Override // yf.a
    public final boolean c0() {
        P0(8);
        boolean o10 = ((sf.p) R0()).o();
        int i6 = this.K;
        if (i6 > 0) {
            int[] iArr = this.M;
            int i10 = i6 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
        return o10;
    }

    @Override // yf.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.J = new Object[]{N};
        this.K = 1;
    }

    @Override // yf.a
    public final void e() {
        P0(3);
        S0(new k.b.a((k.b) ((sf.o) Q0()).f31511u.entrySet()));
    }

    @Override // yf.a
    public final double e0() {
        double parseDouble;
        int y02 = y0();
        if (y02 != 7 && y02 != 6) {
            throw new IllegalStateException("Expected " + b0.k(7) + " but was " + b0.k(y02) + R());
        }
        sf.p pVar = (sf.p) Q0();
        if (pVar.f31512u instanceof Number) {
            parseDouble = pVar.q().doubleValue();
        } else {
            parseDouble = Double.parseDouble(pVar.m());
        }
        if (!this.f38536v && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + parseDouble);
        }
        R0();
        int i6 = this.K;
        if (i6 > 0) {
            int[] iArr = this.M;
            int i10 = i6 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
        return parseDouble;
    }

    @Override // yf.a
    public final int f0() {
        int y02 = y0();
        if (y02 != 7 && y02 != 6) {
            throw new IllegalStateException("Expected " + b0.k(7) + " but was " + b0.k(y02) + R());
        }
        int e10 = ((sf.p) Q0()).e();
        R0();
        int i6 = this.K;
        if (i6 > 0) {
            int[] iArr = this.M;
            int i10 = i6 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
        return e10;
    }

    @Override // yf.a
    public final long h0() {
        long parseLong;
        int y02 = y0();
        if (y02 != 7 && y02 != 6) {
            throw new IllegalStateException("Expected " + b0.k(7) + " but was " + b0.k(y02) + R());
        }
        sf.p pVar = (sf.p) Q0();
        if (pVar.f31512u instanceof Number) {
            parseLong = pVar.q().longValue();
        } else {
            parseLong = Long.parseLong(pVar.m());
        }
        R0();
        int i6 = this.K;
        if (i6 > 0) {
            int[] iArr = this.M;
            int i10 = i6 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
        return parseLong;
    }

    @Override // yf.a
    public final void j() {
        P0(2);
        R0();
        R0();
        int i6 = this.K;
        if (i6 > 0) {
            int[] iArr = this.M;
            int i10 = i6 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
    }

    @Override // yf.a
    public final String k0() {
        P0(5);
        Map.Entry entry = (Map.Entry) ((Iterator) Q0()).next();
        String str = (String) entry.getKey();
        this.L[this.K - 1] = str;
        S0(entry.getValue());
        return str;
    }

    @Override // yf.a
    public final void m() {
        P0(4);
        R0();
        R0();
        int i6 = this.K;
        if (i6 > 0) {
            int[] iArr = this.M;
            int i10 = i6 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
    }

    @Override // yf.a
    public final void p0() {
        P0(9);
        R0();
        int i6 = this.K;
        if (i6 > 0) {
            int[] iArr = this.M;
            int i10 = i6 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
    }

    @Override // yf.a
    public final String s() {
        return G(false);
    }

    @Override // yf.a
    public final String toString() {
        return f.class.getSimpleName() + R();
    }

    @Override // yf.a
    public final String v0() {
        int y02 = y0();
        if (y02 != 6 && y02 != 7) {
            throw new IllegalStateException("Expected " + b0.k(6) + " but was " + b0.k(y02) + R());
        }
        String m10 = ((sf.p) R0()).m();
        int i6 = this.K;
        if (i6 > 0) {
            int[] iArr = this.M;
            int i10 = i6 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
        return m10;
    }

    @Override // yf.a
    public final int y0() {
        if (this.K == 0) {
            return 10;
        }
        Object Q0 = Q0();
        if (Q0 instanceof Iterator) {
            boolean z10 = this.J[this.K - 2] instanceof sf.o;
            Iterator it = (Iterator) Q0;
            if (it.hasNext()) {
                if (z10) {
                    return 5;
                }
                S0(it.next());
                return y0();
            } else if (z10) {
                return 4;
            } else {
                return 2;
            }
        } else if (Q0 instanceof sf.o) {
            return 3;
        } else {
            if (Q0 instanceof sf.k) {
                return 1;
            }
            if (Q0 instanceof sf.p) {
                Serializable serializable = ((sf.p) Q0).f31512u;
                if (serializable instanceof String) {
                    return 6;
                }
                if (serializable instanceof Boolean) {
                    return 8;
                }
                if (serializable instanceof Number) {
                    return 7;
                }
                throw new AssertionError();
            } else if (Q0 instanceof sf.n) {
                return 9;
            } else {
                if (Q0 == N) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }
}
