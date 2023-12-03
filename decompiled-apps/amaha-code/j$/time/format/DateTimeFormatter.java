package j$.time.format;

import com.theinnerhour.b2b.utils.Constants;
import j$.time.ZoneId;
import j$.util.Objects;
import java.io.IOException;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Locale;
import java.util.Set;
/* loaded from: classes3.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_LOCAL_DATE;

    /* renamed from: h  reason: collision with root package name */
    public static final DateTimeFormatter f20867h;

    /* renamed from: a  reason: collision with root package name */
    private final C0709f f20868a;

    /* renamed from: b  reason: collision with root package name */
    private final Locale f20869b;

    /* renamed from: c  reason: collision with root package name */
    private final D f20870c;

    /* renamed from: d  reason: collision with root package name */
    private final F f20871d;

    /* renamed from: e  reason: collision with root package name */
    private final Set f20872e;
    private final j$.time.chrono.n f;

    /* renamed from: g  reason: collision with root package name */
    private final ZoneId f20873g;

    static {
        w wVar = new w();
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        G g5 = G.EXCEEDS_PAD;
        wVar.k(aVar, 4, 10, g5);
        wVar.e('-');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        wVar.m(aVar2, 2);
        wVar.e('-');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        wVar.m(aVar3, 2);
        F f = F.STRICT;
        j$.time.chrono.u uVar = j$.time.chrono.u.f20846d;
        DateTimeFormatter v10 = wVar.v(f, uVar);
        ISO_LOCAL_DATE = v10;
        w wVar2 = new w();
        wVar2.q();
        wVar2.a(v10);
        wVar2.h();
        wVar2.v(f, uVar);
        w wVar3 = new w();
        wVar3.q();
        wVar3.a(v10);
        wVar3.p();
        wVar3.h();
        wVar3.v(f, uVar);
        w wVar4 = new w();
        j$.time.temporal.a aVar4 = j$.time.temporal.a.HOUR_OF_DAY;
        wVar4.m(aVar4, 2);
        wVar4.e(':');
        j$.time.temporal.a aVar5 = j$.time.temporal.a.MINUTE_OF_HOUR;
        wVar4.m(aVar5, 2);
        wVar4.p();
        wVar4.e(':');
        j$.time.temporal.a aVar6 = j$.time.temporal.a.SECOND_OF_MINUTE;
        wVar4.m(aVar6, 2);
        wVar4.p();
        wVar4.b(j$.time.temporal.a.NANO_OF_SECOND, 0, 9, true);
        DateTimeFormatter v11 = wVar4.v(f, null);
        w wVar5 = new w();
        wVar5.q();
        wVar5.a(v11);
        wVar5.h();
        wVar5.v(f, null);
        w wVar6 = new w();
        wVar6.q();
        wVar6.a(v11);
        wVar6.p();
        wVar6.h();
        wVar6.v(f, null);
        w wVar7 = new w();
        wVar7.q();
        wVar7.a(v10);
        wVar7.e('T');
        wVar7.a(v11);
        DateTimeFormatter v12 = wVar7.v(f, uVar);
        w wVar8 = new w();
        wVar8.q();
        wVar8.a(v12);
        wVar8.s();
        wVar8.h();
        wVar8.t();
        DateTimeFormatter v13 = wVar8.v(f, uVar);
        w wVar9 = new w();
        wVar9.a(v13);
        wVar9.p();
        wVar9.e('[');
        wVar9.r();
        wVar9.n();
        wVar9.e(']');
        wVar9.v(f, uVar);
        w wVar10 = new w();
        wVar10.a(v12);
        wVar10.p();
        wVar10.h();
        wVar10.p();
        wVar10.e('[');
        wVar10.r();
        wVar10.n();
        wVar10.e(']');
        wVar10.v(f, uVar);
        w wVar11 = new w();
        wVar11.q();
        wVar11.k(aVar, 4, 10, g5);
        wVar11.e('-');
        wVar11.m(j$.time.temporal.a.DAY_OF_YEAR, 3);
        wVar11.p();
        wVar11.h();
        wVar11.v(f, uVar);
        w wVar12 = new w();
        wVar12.q();
        wVar12.k(j$.time.temporal.i.f20999c, 4, 10, g5);
        wVar12.f("-W");
        wVar12.m(j$.time.temporal.i.f20998b, 2);
        wVar12.e('-');
        j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_WEEK;
        wVar12.m(aVar7, 1);
        wVar12.p();
        wVar12.h();
        wVar12.v(f, uVar);
        w wVar13 = new w();
        wVar13.q();
        wVar13.c();
        f20867h = wVar13.v(f, null);
        w wVar14 = new w();
        wVar14.q();
        wVar14.m(aVar, 4);
        wVar14.m(aVar2, 2);
        wVar14.m(aVar3, 2);
        wVar14.p();
        wVar14.s();
        wVar14.g("+HHMMss", "Z");
        wVar14.t();
        wVar14.v(f, uVar);
        HashMap hashMap = new HashMap();
        hashMap.put(1L, "Mon");
        hashMap.put(2L, "Tue");
        hashMap.put(3L, "Wed");
        hashMap.put(4L, "Thu");
        hashMap.put(5L, "Fri");
        hashMap.put(6L, "Sat");
        hashMap.put(7L, "Sun");
        HashMap hashMap2 = new HashMap();
        hashMap2.put(1L, "Jan");
        hashMap2.put(2L, "Feb");
        hashMap2.put(3L, "Mar");
        hashMap2.put(4L, "Apr");
        hashMap2.put(5L, "May");
        hashMap2.put(6L, "Jun");
        hashMap2.put(7L, "Jul");
        hashMap2.put(8L, "Aug");
        hashMap2.put(9L, "Sep");
        hashMap2.put(10L, "Oct");
        hashMap2.put(11L, "Nov");
        hashMap2.put(12L, "Dec");
        w wVar15 = new w();
        wVar15.q();
        wVar15.s();
        wVar15.p();
        wVar15.j(aVar7, hashMap);
        wVar15.f(", ");
        wVar15.o();
        wVar15.k(aVar3, 1, 2, G.NOT_NEGATIVE);
        wVar15.e(' ');
        wVar15.j(aVar2, hashMap2);
        wVar15.e(' ');
        wVar15.m(aVar, 4);
        wVar15.e(' ');
        wVar15.m(aVar4, 2);
        wVar15.e(':');
        wVar15.m(aVar5, 2);
        wVar15.p();
        wVar15.e(':');
        wVar15.m(aVar6, 2);
        wVar15.o();
        wVar15.e(' ');
        wVar15.g("+HHMM", "GMT");
        wVar15.v(F.SMART, uVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DateTimeFormatter(C0709f c0709f, Locale locale, D d10, F f, Set set, j$.time.chrono.n nVar, ZoneId zoneId) {
        this.f20868a = (C0709f) Objects.requireNonNull(c0709f, "printerParser");
        this.f20872e = set;
        this.f20869b = (Locale) Objects.requireNonNull(locale, "locale");
        this.f20870c = (D) Objects.requireNonNull(d10, "decimalStyle");
        this.f20871d = (F) Objects.requireNonNull(f, "resolverStyle");
        this.f = nVar;
        this.f20873g = zoneId;
    }

    private j$.time.temporal.l g(CharSequence charSequence) {
        String charSequence2;
        ParsePosition parsePosition = new ParsePosition(0);
        Objects.requireNonNull(charSequence, "text");
        Objects.requireNonNull(parsePosition, Constants.DAYMODEL_POSITION);
        x xVar = new x(this);
        int m10 = this.f20868a.m(xVar, charSequence, parsePosition.getIndex());
        if (m10 < 0) {
            parsePosition.setErrorIndex(~m10);
            xVar = null;
        } else {
            parsePosition.setIndex(m10);
        }
        if (xVar == null || parsePosition.getErrorIndex() >= 0 || parsePosition.getIndex() < charSequence.length()) {
            if (charSequence.length() > 64) {
                charSequence2 = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                charSequence2 = charSequence.toString();
            }
            if (parsePosition.getErrorIndex() >= 0) {
                String str = "Text '" + charSequence2 + "' could not be parsed at index " + parsePosition.getErrorIndex();
                parsePosition.getErrorIndex();
                throw new y(str, charSequence);
            }
            String str2 = "Text '" + charSequence2 + "' could not be parsed, unparsed text found at index " + parsePosition.getIndex();
            parsePosition.getIndex();
            throw new y(str2, charSequence);
        }
        return xVar.t(this.f20871d, this.f20872e);
    }

    public static DateTimeFormatter ofPattern(String str) {
        w wVar = new w();
        wVar.i(str);
        return wVar.u();
    }

    public final String a(j$.time.temporal.l lVar) {
        StringBuilder sb2 = new StringBuilder(32);
        Objects.requireNonNull(lVar, "temporal");
        Objects.requireNonNull(sb2, "appendable");
        try {
            this.f20868a.l(new A(lVar, this), sb2);
            return sb2.toString();
        } catch (IOException e10) {
            throw new j$.time.d(e10.getMessage(), e10);
        }
    }

    public final j$.time.chrono.n b() {
        return this.f;
    }

    public final D c() {
        return this.f20870c;
    }

    public final Locale d() {
        return this.f20869b;
    }

    public final ZoneId e() {
        return this.f20873g;
    }

    public final Object f(CharSequence charSequence, j$.time.k kVar) {
        String charSequence2;
        Objects.requireNonNull(charSequence, "text");
        Objects.requireNonNull(kVar, "query");
        try {
            return ((E) g(charSequence)).J(kVar);
        } catch (y e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (charSequence.length() > 64) {
                charSequence2 = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                charSequence2 = charSequence.toString();
            }
            throw new y("Text '" + charSequence2 + "' could not be parsed: " + e11.getMessage(), charSequence, e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final C0709f h() {
        return this.f20868a.a();
    }

    public final String toString() {
        String c0709f = this.f20868a.toString();
        return c0709f.startsWith("[") ? c0709f : c0709f.substring(1, c0709f.length() - 1);
    }

    public DateTimeFormatter withLocale(Locale locale) {
        return this.f20869b.equals(locale) ? this : new DateTimeFormatter(this.f20868a, locale, this.f20870c, this.f20871d, this.f20872e, this.f, this.f20873g);
    }
}
