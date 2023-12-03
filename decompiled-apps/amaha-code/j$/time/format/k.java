package j$.time.format;

import java.math.BigInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class k implements InterfaceC0710g {
    static final long[] f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};

    /* renamed from: a  reason: collision with root package name */
    final j$.time.temporal.p f20898a;

    /* renamed from: b  reason: collision with root package name */
    final int f20899b;

    /* renamed from: c  reason: collision with root package name */
    final int f20900c;

    /* renamed from: d  reason: collision with root package name */
    private final G f20901d;

    /* renamed from: e  reason: collision with root package name */
    final int f20902e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(j$.time.temporal.p pVar, int i6, int i10, G g5) {
        this.f20898a = pVar;
        this.f20899b = i6;
        this.f20900c = i10;
        this.f20901d = g5;
        this.f20902e = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public k(j$.time.temporal.p pVar, int i6, int i10, G g5, int i11) {
        this.f20898a = pVar;
        this.f20899b = i6;
        this.f20900c = i10;
        this.f20901d = g5;
        this.f20902e = i11;
    }

    long b(A a10, long j10) {
        return j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c(x xVar) {
        int i6 = this.f20902e;
        return i6 == -1 || (i6 > 0 && this.f20899b == this.f20900c && this.f20901d == G.NOT_NEGATIVE);
    }

    int d(x xVar, long j10, int i6, int i10) {
        return xVar.o(this.f20898a, j10, i6, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k e() {
        return this.f20902e == -1 ? this : new k(this.f20898a, this.f20899b, this.f20900c, this.f20901d, -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k f(int i6) {
        return new k(this.f20898a, this.f20899b, this.f20900c, this.f20901d, this.f20902e + i6);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009b A[LOOP:0: B:34:0x0093->B:36:0x009b, LOOP_END] */
    @Override // j$.time.format.InterfaceC0710g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean l(A a10, StringBuilder sb2) {
        char c10;
        j$.time.temporal.p pVar = this.f20898a;
        Long e10 = a10.e(pVar);
        if (e10 == null) {
            return false;
        }
        long b10 = b(a10, e10.longValue());
        D b11 = a10.b();
        String l2 = b10 == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(b10));
        int length = l2.length();
        int i6 = this.f20900c;
        if (length > i6) {
            throw new j$.time.d("Field " + pVar + " cannot be printed as the value " + b10 + " exceeds the maximum print width of " + i6);
        }
        b11.getClass();
        int i10 = this.f20899b;
        G g5 = this.f20901d;
        if (b10 >= 0) {
            int i11 = AbstractC0707d.f20891a[g5.ordinal()];
            if (i11 == 1 ? !(i10 >= 19 || b10 < f[i10]) : i11 == 2) {
                c10 = '+';
                sb2.append(c10);
            }
            for (int i12 = 0; i12 < i10 - l2.length(); i12++) {
                sb2.append('0');
            }
            sb2.append(l2);
            return true;
        }
        int i13 = AbstractC0707d.f20891a[g5.ordinal()];
        if (i13 == 1 || i13 == 2 || i13 == 3) {
            c10 = '-';
            sb2.append(c10);
            while (i12 < i10 - l2.length()) {
            }
            sb2.append(l2);
            return true;
        }
        if (i13 == 4) {
            throw new j$.time.d("Field " + pVar + " cannot be printed as the value " + b10 + " cannot be negative according to the SignStyle");
        }
        while (i12 < i10 - l2.length()) {
        }
        sb2.append(l2);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x0111, code lost:
        r5 = r13;
        r1 = r16;
        r3 = r17;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0183  */
    @Override // j$.time.format.InterfaceC0710g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int m(x xVar, CharSequence charSequence, int i6) {
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        BigInteger bigInteger;
        long j10;
        long j11;
        int i12 = i6;
        int length = charSequence.length();
        if (i12 == length) {
            return ~i12;
        }
        char charAt = charSequence.charAt(i6);
        xVar.g().getClass();
        int i13 = 0;
        int i14 = this.f20900c;
        G g5 = this.f20901d;
        int i15 = this.f20899b;
        if (charAt == '+') {
            boolean l2 = xVar.l();
            boolean z12 = i15 == i14;
            int ordinal = g5.ordinal();
            if (!(ordinal == 0 ? !l2 : ordinal == 1 || ordinal == 4 || (!l2 && !z12))) {
                return ~i12;
            }
            i10 = i12 + 1;
            z11 = true;
            z10 = false;
        } else {
            xVar.g().getClass();
            if (charAt == '-') {
                boolean l10 = xVar.l();
                boolean z13 = i15 == i14;
                int ordinal2 = g5.ordinal();
                if (!(ordinal2 == 0 || ordinal2 == 1 || ordinal2 == 4 || !(l10 || z13))) {
                    return ~i12;
                }
                i12++;
                z10 = true;
            } else if (g5 == G.ALWAYS && xVar.l()) {
                return ~i12;
            } else {
                z10 = false;
            }
            i10 = i12;
            z11 = false;
        }
        int i16 = (xVar.l() || c(xVar)) ? i15 : 1;
        int i17 = i10 + i16;
        if (i17 > length) {
            return ~i10;
        }
        if (!xVar.l() && !c(xVar)) {
            i14 = 9;
        }
        int i18 = this.f20902e;
        int max = Math.max(i18, 0) + i14;
        while (true) {
            BigInteger bigInteger2 = null;
            if (i13 >= 2) {
                i11 = i10;
                bigInteger = null;
                j10 = 0;
                break;
            }
            int min = Math.min(max + i10, length);
            int i19 = i10;
            long j12 = 0;
            while (true) {
                if (i19 >= min) {
                    break;
                }
                int i20 = i19 + 1;
                int a10 = xVar.g().a(charSequence.charAt(i19));
                if (a10 < 0) {
                    i19 = i20 - 1;
                    if (i19 < i17) {
                        return ~i10;
                    }
                } else {
                    if (i20 - i10 > 18) {
                        if (bigInteger2 == null) {
                            bigInteger2 = BigInteger.valueOf(j12);
                        }
                        bigInteger2 = bigInteger2.multiply(BigInteger.TEN).add(BigInteger.valueOf(a10));
                    } else {
                        j12 = (j12 * 10) + a10;
                    }
                    i19 = i20;
                }
            }
            if (i18 <= 0 || i13 != 0) {
                break;
            }
            max = Math.max(i16, (i19 - i10) - i18);
            i13++;
        }
        if (z10) {
            if (bigInteger == null) {
                if (j10 == 0 && xVar.l()) {
                    return ~(i10 - 1);
                }
                j11 = -j10;
                if (bigInteger == null) {
                    if (bigInteger.bitLength() > 63) {
                        bigInteger = bigInteger.divide(BigInteger.TEN);
                        i11--;
                    }
                    return d(xVar, bigInteger.longValue(), i10, i11);
                }
                return d(xVar, j11, i10, i11);
            } else if (bigInteger.equals(BigInteger.ZERO) && xVar.l()) {
                return ~(i10 - 1);
            } else {
                bigInteger = bigInteger.negate();
            }
        } else if (g5 == G.EXCEEDS_PAD && xVar.l()) {
            int i21 = i11 - i10;
            if (z11) {
                if (i21 <= i15) {
                    return ~(i10 - 1);
                }
            } else if (i21 > i15) {
                return ~i10;
            }
        }
        j11 = j10;
        if (bigInteger == null) {
        }
    }

    public String toString() {
        int i6 = this.f20900c;
        G g5 = this.f20901d;
        j$.time.temporal.p pVar = this.f20898a;
        int i10 = this.f20899b;
        if (i10 == 1 && i6 == 19 && g5 == G.NORMAL) {
            return "Value(" + pVar + ")";
        } else if (i10 == i6 && g5 == G.NOT_NEGATIVE) {
            return "Value(" + pVar + "," + i10 + ")";
        } else {
            return "Value(" + pVar + "," + i10 + "," + i6 + "," + g5 + ")";
        }
    }
}
