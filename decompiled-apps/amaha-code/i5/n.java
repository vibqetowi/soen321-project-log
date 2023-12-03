package i5;

import he.e0;
import java.text.DecimalFormat;
import java.util.Arrays;
/* compiled from: FlushStatistics.kt */
/* loaded from: classes.dex */
public final class n implements s6.c {

    /* renamed from: u  reason: collision with root package name */
    public int f19876u;

    /* renamed from: v  reason: collision with root package name */
    public Object f19877v;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(int i6) {
        this(32, 3);
        if (i6 == 2) {
            this.f19877v = new c9.q(8);
        } else if (i6 != 3) {
            this.f19877v = m.SUCCESS;
        }
    }

    public final void a(long j10) {
        int i6 = this.f19876u;
        Object obj = this.f19877v;
        if (i6 == ((long[]) obj).length) {
            this.f19877v = Arrays.copyOf((long[]) obj, i6 * 2);
        }
        int i10 = this.f19876u;
        this.f19876u = i10 + 1;
        ((long[]) this.f19877v)[i10] = j10;
    }

    public final long b(int i6) {
        if (i6 >= 0 && i6 < this.f19876u) {
            return ((long[]) this.f19877v)[i6];
        }
        int i10 = this.f19876u;
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append("Invalid index ");
        sb2.append(i6);
        sb2.append(", size is ");
        sb2.append(i10);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    public final long c(u7.e eVar) {
        int i6 = 0;
        eVar.d(((c9.q) this.f19877v).f5186a, 0, 1, false);
        int i10 = ((c9.q) this.f19877v).f5186a[0] & 255;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int i11 = 128;
        int i12 = 0;
        while ((i10 & i11) == 0) {
            i11 >>= 1;
            i12++;
        }
        int i13 = i10 & (~i11);
        eVar.d(((c9.q) this.f19877v).f5186a, 1, i12, false);
        while (i6 < i12) {
            i6++;
            i13 = (((c9.q) this.f19877v).f5186a[i6] & 255) + (i13 << 8);
        }
        this.f19876u = i12 + 1 + this.f19876u;
        return i13;
    }

    public final void d(int i6) {
        this.f19876u = i6;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < i6; i10++) {
            if (i10 == 0) {
                stringBuffer.append(".");
            }
            stringBuffer.append("0");
        }
        this.f19877v = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
    }

    @Override // s6.c
    public final String g(float f) {
        return ((DecimalFormat) this.f19877v).format(f);
    }

    public /* synthetic */ n(e0 e0Var, int i6) {
        this.f19877v = e0Var;
        this.f19876u = i6;
    }

    public n(int i6, int i10) {
        if (i10 == 3) {
            this.f19877v = new long[i6];
        } else if (i10 != 4) {
            d(i6);
        } else {
            this.f19877v = new byte[i6];
            this.f19876u = 0;
        }
    }
}
