package j$.time.format;

import j$.util.Objects;
import java.math.BigDecimal;
import java.math.RoundingMode;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.format.h  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0711h extends k {

    /* renamed from: g  reason: collision with root package name */
    private final boolean f20895g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0711h(j$.time.temporal.a aVar, int i6, int i10, boolean z10) {
        this(aVar, i6, i10, z10, 0);
        Objects.requireNonNull(aVar, "field");
        if (!aVar.n().g()) {
            throw new IllegalArgumentException("Field must have a fixed set of values: " + aVar);
        } else if (i6 < 0 || i6 > 9) {
            throw new IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was " + i6);
        } else if (i10 < 1 || i10 > 9) {
            throw new IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was " + i10);
        } else if (i10 >= i6) {
        } else {
            throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i10 + " < " + i6);
        }
    }

    C0711h(j$.time.temporal.p pVar, int i6, int i10, boolean z10, int i11) {
        super(pVar, i6, i10, G.NOT_NEGATIVE, i11);
        this.f20895g = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.format.k
    public final boolean c(x xVar) {
        return xVar.l() && this.f20899b == this.f20900c && !this.f20895g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.format.k
    public final k e() {
        return this.f20902e == -1 ? this : new C0711h(this.f20898a, this.f20899b, this.f20900c, this.f20895g, -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.format.k
    public final k f(int i6) {
        return new C0711h(this.f20898a, this.f20899b, this.f20900c, this.f20895g, this.f20902e + i6);
    }

    @Override // j$.time.format.k, j$.time.format.InterfaceC0710g
    public final boolean l(A a10, StringBuilder sb2) {
        j$.time.temporal.p pVar = this.f20898a;
        Long e10 = a10.e(pVar);
        if (e10 == null) {
            return false;
        }
        D b10 = a10.b();
        long longValue = e10.longValue();
        j$.time.temporal.u n10 = pVar.n();
        n10.b(longValue, pVar);
        BigDecimal valueOf = BigDecimal.valueOf(n10.e());
        BigDecimal divide = BigDecimal.valueOf(longValue).subtract(valueOf).divide(BigDecimal.valueOf(n10.d()).subtract(valueOf).add(BigDecimal.ONE), 9, RoundingMode.FLOOR);
        BigDecimal stripTrailingZeros = divide.compareTo(BigDecimal.ZERO) == 0 ? BigDecimal.ZERO : divide.stripTrailingZeros();
        int scale = stripTrailingZeros.scale();
        boolean z10 = this.f20895g;
        int i6 = this.f20899b;
        if (scale != 0) {
            String substring = stripTrailingZeros.setScale(Math.min(Math.max(stripTrailingZeros.scale(), i6), this.f20900c), RoundingMode.FLOOR).toPlainString().substring(2);
            b10.getClass();
            if (z10) {
                sb2.append('.');
            }
            sb2.append(substring);
            return true;
        } else if (i6 > 0) {
            if (z10) {
                b10.getClass();
                sb2.append('.');
            }
            for (int i10 = 0; i10 < i6; i10++) {
                b10.getClass();
                sb2.append('0');
            }
            return true;
        } else {
            return true;
        }
    }

    @Override // j$.time.format.k, j$.time.format.InterfaceC0710g
    public final int m(x xVar, CharSequence charSequence, int i6) {
        int i10;
        int i11 = (xVar.l() || c(xVar)) ? this.f20899b : 0;
        int i12 = (xVar.l() || c(xVar)) ? this.f20900c : 9;
        int length = charSequence.length();
        if (i6 == length) {
            return i11 > 0 ? ~i6 : i6;
        }
        if (this.f20895g) {
            char charAt = charSequence.charAt(i6);
            xVar.g().getClass();
            if (charAt != '.') {
                return i11 > 0 ? ~i6 : i6;
            }
            i6++;
        }
        int i13 = i6;
        int i14 = i11 + i13;
        if (i14 > length) {
            return ~i13;
        }
        int min = Math.min(i12 + i13, length);
        int i15 = i13;
        int i16 = 0;
        while (true) {
            if (i15 >= min) {
                i10 = i15;
                break;
            }
            int i17 = i15 + 1;
            int a10 = xVar.g().a(charSequence.charAt(i15));
            if (a10 >= 0) {
                i16 = (i16 * 10) + a10;
                i15 = i17;
            } else if (i17 < i14) {
                return ~i13;
            } else {
                i10 = i17 - 1;
            }
        }
        BigDecimal movePointLeft = new BigDecimal(i16).movePointLeft(i10 - i13);
        j$.time.temporal.u n10 = this.f20898a.n();
        BigDecimal valueOf = BigDecimal.valueOf(n10.e());
        return xVar.o(this.f20898a, movePointLeft.multiply(BigDecimal.valueOf(n10.d()).subtract(valueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(valueOf).longValueExact(), i13, i10);
    }

    @Override // j$.time.format.k
    public final String toString() {
        String str = this.f20895g ? ",DecimalPoint" : "";
        return "Fraction(" + this.f20898a + "," + this.f20899b + "," + this.f20900c + str + ")";
    }
}
