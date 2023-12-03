package j$.time.format;

import j$.util.Objects;
import java.util.Calendar;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class t extends k {

    /* renamed from: g  reason: collision with root package name */
    private char f20929g;

    /* renamed from: h  reason: collision with root package name */
    private int f20930h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(char c10, int i6, int i10, int i11) {
        this(c10, i6, i10, i11, 0);
    }

    t(char c10, int i6, int i10, int i11, int i12) {
        super(null, i10, i11, G.NOT_NEGATIVE, i12);
        this.f20929g = c10;
        this.f20930h = i6;
    }

    private k g(Locale locale) {
        j$.time.temporal.p i6;
        j$.time.temporal.s sVar = j$.time.temporal.w.f21028h;
        Objects.requireNonNull(locale, "locale");
        Calendar calendar = Calendar.getInstance(new Locale(locale.getLanguage(), locale.getCountry()));
        j$.time.temporal.w g5 = j$.time.temporal.w.g(j$.time.f.SUNDAY.U(calendar.getFirstDayOfWeek() - 1), calendar.getMinimalDaysInFirstWeek());
        char c10 = this.f20929g;
        if (c10 == 'W') {
            i6 = g5.i();
        } else if (c10 == 'Y') {
            j$.time.temporal.p h10 = g5.h();
            int i10 = this.f20930h;
            if (i10 == 2) {
                return new q(h10, q.f20921i, this.f20902e);
            }
            return new k(h10, i10, 19, i10 < 4 ? G.NORMAL : G.EXCEEDS_PAD, this.f20902e);
        } else if (c10 == 'c' || c10 == 'e') {
            i6 = g5.d();
        } else if (c10 != 'w') {
            throw new IllegalStateException("unreachable");
        } else {
            i6 = g5.j();
        }
        return new k(i6, this.f20899b, this.f20900c, G.NOT_NEGATIVE, this.f20902e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.format.k
    public final k e() {
        return this.f20902e == -1 ? this : new t(this.f20929g, this.f20930h, this.f20899b, this.f20900c, -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.format.k
    public final k f(int i6) {
        return new t(this.f20929g, this.f20930h, this.f20899b, this.f20900c, this.f20902e + i6);
    }

    @Override // j$.time.format.k, j$.time.format.InterfaceC0710g
    public final boolean l(A a10, StringBuilder sb2) {
        return g(a10.c()).l(a10, sb2);
    }

    @Override // j$.time.format.k, j$.time.format.InterfaceC0710g
    public final int m(x xVar, CharSequence charSequence, int i6) {
        return g(xVar.i()).m(xVar, charSequence, i6);
    }

    @Override // j$.time.format.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append("Localized(");
        char c10 = this.f20929g;
        if (c10 == 'Y') {
            int i6 = this.f20930h;
            if (i6 == 1) {
                sb2.append("WeekBasedYear");
            } else if (i6 == 2) {
                sb2.append("ReducedValue(WeekBasedYear,2,2,2000-01-01)");
            } else {
                sb2.append("WeekBasedYear,");
                sb2.append(this.f20930h);
                sb2.append(",19,");
                sb2.append(this.f20930h < 4 ? G.NORMAL : G.EXCEEDS_PAD);
            }
        } else {
            if (c10 == 'W') {
                sb2.append("WeekOfMonth");
            } else if (c10 == 'c' || c10 == 'e') {
                sb2.append("DayOfWeek");
            } else if (c10 == 'w') {
                sb2.append("WeekOfWeekBasedYear");
            }
            sb2.append(",");
            sb2.append(this.f20930h);
        }
        sb2.append(")");
        return sb2.toString();
    }
}
