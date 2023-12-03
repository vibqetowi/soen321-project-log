package j$.time.format;

import com.appsflyer.R;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
/* loaded from: classes3.dex */
public final class w {

    /* renamed from: h  reason: collision with root package name */
    private static final C0704a f20939h = new j$.time.temporal.r() { // from class: j$.time.format.a
        @Override // j$.time.temporal.r
        public final Object i(j$.time.temporal.l lVar) {
            int i6 = w.f20941j;
            ZoneId zoneId = (ZoneId) lVar.J(j$.time.temporal.o.l());
            if (zoneId == null || (zoneId instanceof ZoneOffset)) {
                return null;
            }
            return zoneId;
        }
    };

    /* renamed from: i  reason: collision with root package name */
    private static final HashMap f20940i;

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ int f20941j = 0;

    /* renamed from: a  reason: collision with root package name */
    private w f20942a;

    /* renamed from: b  reason: collision with root package name */
    private final w f20943b;

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList f20944c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f20945d;

    /* renamed from: e  reason: collision with root package name */
    private int f20946e;
    private char f;

    /* renamed from: g  reason: collision with root package name */
    private int f20947g;

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.format.a] */
    static {
        HashMap hashMap = new HashMap();
        f20940i = hashMap;
        hashMap.put('G', j$.time.temporal.a.ERA);
        hashMap.put('y', j$.time.temporal.a.YEAR_OF_ERA);
        hashMap.put('u', j$.time.temporal.a.YEAR);
        j$.time.temporal.p pVar = j$.time.temporal.i.f20997a;
        hashMap.put('Q', pVar);
        hashMap.put('q', pVar);
        j$.time.temporal.a aVar = j$.time.temporal.a.MONTH_OF_YEAR;
        hashMap.put('M', aVar);
        hashMap.put('L', aVar);
        hashMap.put('D', j$.time.temporal.a.DAY_OF_YEAR);
        hashMap.put('d', j$.time.temporal.a.DAY_OF_MONTH);
        hashMap.put('F', j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_WEEK;
        hashMap.put('E', aVar2);
        hashMap.put('c', aVar2);
        hashMap.put('e', aVar2);
        hashMap.put('a', j$.time.temporal.a.AMPM_OF_DAY);
        hashMap.put('H', j$.time.temporal.a.HOUR_OF_DAY);
        hashMap.put('k', j$.time.temporal.a.CLOCK_HOUR_OF_DAY);
        hashMap.put('K', j$.time.temporal.a.HOUR_OF_AMPM);
        hashMap.put('h', j$.time.temporal.a.CLOCK_HOUR_OF_AMPM);
        hashMap.put('m', j$.time.temporal.a.MINUTE_OF_HOUR);
        hashMap.put('s', j$.time.temporal.a.SECOND_OF_MINUTE);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_SECOND;
        hashMap.put('S', aVar3);
        hashMap.put('A', j$.time.temporal.a.MILLI_OF_DAY);
        hashMap.put('n', aVar3);
        hashMap.put('N', j$.time.temporal.a.NANO_OF_DAY);
        hashMap.put('g', j$.time.temporal.k.f21005a);
    }

    public w() {
        this.f20942a = this;
        this.f20944c = new ArrayList();
        this.f20947g = -1;
        this.f20943b = null;
        this.f20945d = false;
    }

    private w(w wVar) {
        this.f20942a = this;
        this.f20944c = new ArrayList();
        this.f20947g = -1;
        this.f20943b = wVar;
        this.f20945d = true;
    }

    private int d(InterfaceC0710g interfaceC0710g) {
        Objects.requireNonNull(interfaceC0710g, "pp");
        w wVar = this.f20942a;
        int i6 = wVar.f20946e;
        if (i6 > 0) {
            if (interfaceC0710g != null) {
                interfaceC0710g = new m(interfaceC0710g, i6, wVar.f);
            }
            wVar.f20946e = 0;
            wVar.f = (char) 0;
        }
        wVar.f20944c.add(interfaceC0710g);
        w wVar2 = this.f20942a;
        wVar2.f20947g = -1;
        return wVar2.f20944c.size() - 1;
    }

    private void l(k kVar) {
        k e10;
        G g5;
        w wVar = this.f20942a;
        int i6 = wVar.f20947g;
        if (i6 < 0) {
            wVar.f20947g = d(kVar);
            return;
        }
        k kVar2 = (k) wVar.f20944c.get(i6);
        int i10 = kVar.f20899b;
        int i11 = kVar.f20900c;
        if (i10 == i11) {
            g5 = kVar.f20901d;
            if (g5 == G.NOT_NEGATIVE) {
                e10 = kVar2.f(i11);
                d(kVar.e());
                this.f20942a.f20947g = i6;
                this.f20942a.f20944c.set(i6, e10);
            }
        }
        e10 = kVar2.e();
        this.f20942a.f20947g = d(kVar);
        this.f20942a.f20944c.set(i6, e10);
    }

    private DateTimeFormatter w(Locale locale, F f, j$.time.chrono.u uVar) {
        Objects.requireNonNull(locale, "locale");
        while (this.f20942a.f20943b != null) {
            o();
        }
        return new DateTimeFormatter(new C0709f(this.f20944c, false), locale, D.f20866a, f, null, uVar, null);
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        d(dateTimeFormatter.h());
    }

    public final void b(j$.time.temporal.a aVar, int i6, int i10, boolean z10) {
        if (i6 != i10 || z10) {
            d(new C0711h(aVar, i6, i10, z10));
        } else {
            l(new C0711h(aVar, i6, i10, z10));
        }
    }

    public final void c() {
        d(new C0712i());
    }

    public final void e(char c10) {
        d(new C0708e(c10));
    }

    public final void f(String str) {
        Objects.requireNonNull(str, "literal");
        if (str.isEmpty()) {
            return;
        }
        d(str.length() == 1 ? new C0708e(str.charAt(0)) : new j(str, 1));
    }

    public final void g(String str, String str2) {
        d(new l(str, str2));
    }

    public final void h() {
        d(l.f20904e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e7, code lost:
        if (r3 == 1) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0415 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(String str) {
        t tVar;
        String str2;
        String str3;
        H h10;
        H h11;
        int i6;
        G g5;
        boolean z10;
        t tVar2;
        H h12;
        int i10;
        int i11;
        Objects.requireNonNull(str, "pattern");
        int i12 = 0;
        while (i12 < str.length()) {
            char charAt = str.charAt(i12);
            if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z')) {
                int i13 = i12 + 1;
                while (i13 < str.length() && str.charAt(i13) == charAt) {
                    i13++;
                }
                int i14 = i13 - i12;
                if (charAt == 'p') {
                    if (i13 >= str.length() || (((charAt = str.charAt(i13)) < 'A' || charAt > 'Z') && (charAt < 'a' || charAt > 'z'))) {
                        i10 = i13;
                        i11 = i14;
                        i14 = 0;
                    } else {
                        i10 = i13 + 1;
                        while (i10 < str.length() && str.charAt(i10) == charAt) {
                            i10++;
                        }
                        i11 = i10 - i13;
                    }
                    if (i14 == 0) {
                        throw new IllegalArgumentException("Pad letter 'p' must be followed by valid pad pattern: ".concat(str));
                    }
                    if (i14 < 1) {
                        throw new IllegalArgumentException("The pad width must be at least one but was " + i14);
                    }
                    w wVar = this.f20942a;
                    wVar.f20946e = i14;
                    wVar.f = ' ';
                    wVar.f20947g = -1;
                    i14 = i11;
                    i13 = i10;
                }
                j$.time.temporal.p pVar = (j$.time.temporal.p) f20940i.get(Character.valueOf(charAt));
                if (pVar != null) {
                    if (charAt != 'A') {
                        if (charAt != 'Q') {
                            if (charAt != 'S') {
                                if (charAt != 'a') {
                                    if (charAt != 'k') {
                                        if (charAt != 'q') {
                                            if (charAt != 's') {
                                                if (charAt != 'u' && charAt != 'y') {
                                                    if (charAt != 'g') {
                                                        if (charAt != 'h' && charAt != 'm') {
                                                            if (charAt != 'n') {
                                                                switch (charAt) {
                                                                    case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                                                                        if (i14 != 1) {
                                                                            if (i14 != 2 && i14 != 3) {
                                                                                throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                                                                            }
                                                                            k(pVar, i14, 3, G.NOT_NEGATIVE);
                                                                            break;
                                                                        }
                                                                        Objects.requireNonNull(pVar, "field");
                                                                        l(new k(pVar, 1, 19, G.NORMAL));
                                                                        break;
                                                                    case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                                                                        break;
                                                                    case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                                                                        if (i14 != 1) {
                                                                            throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                                                                        }
                                                                        Objects.requireNonNull(pVar, "field");
                                                                        l(new k(pVar, 1, 19, G.NORMAL));
                                                                        break;
                                                                    case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
                                                                        if (i14 != 1 && i14 != 2 && i14 != 3) {
                                                                            if (i14 != 4) {
                                                                                if (i14 != 5) {
                                                                                    throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                                                                                }
                                                                                h12 = H.NARROW;
                                                                                Objects.requireNonNull(pVar, "field");
                                                                                Objects.requireNonNull(h12, "textStyle");
                                                                                d(new s(pVar, h12, C.d()));
                                                                                break;
                                                                            }
                                                                            h12 = H.FULL;
                                                                            Objects.requireNonNull(pVar, "field");
                                                                            Objects.requireNonNull(h12, "textStyle");
                                                                            d(new s(pVar, h12, C.d()));
                                                                        }
                                                                        break;
                                                                    case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                                                                        break;
                                                                    default:
                                                                        switch (charAt) {
                                                                            case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
                                                                                break;
                                                                            case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
                                                                                break;
                                                                            case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
                                                                                break;
                                                                            case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
                                                                                break;
                                                                            default:
                                                                                switch (charAt) {
                                                                                    case 'c':
                                                                                        if (i14 == 1) {
                                                                                            tVar2 = new t(charAt, i14, i14, i14);
                                                                                            l(tVar2);
                                                                                            break;
                                                                                        } else if (i14 == 2) {
                                                                                            throw new IllegalArgumentException("Invalid pattern \"cc\"");
                                                                                        }
                                                                                        break;
                                                                                }
                                                                        }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    g5 = G.NORMAL;
                                                    i6 = 19;
                                                } else if (i14 == 2) {
                                                    j$.time.j jVar = q.f20921i;
                                                    Objects.requireNonNull(pVar, "field");
                                                    Objects.requireNonNull(jVar, "baseDate");
                                                    l(new q(pVar, jVar));
                                                } else {
                                                    if (i14 >= 4) {
                                                        g5 = G.EXCEEDS_PAD;
                                                        i6 = 19;
                                                    }
                                                    g5 = G.NORMAL;
                                                    i6 = 19;
                                                }
                                                k(pVar, i14, i6, g5);
                                            }
                                        }
                                        z10 = true;
                                        if (i14 == 1 && i14 != 2) {
                                            if (i14 != 3) {
                                                if (i14 == 4) {
                                                    if (z10) {
                                                        h12 = H.FULL_STANDALONE;
                                                    }
                                                    h12 = H.FULL;
                                                } else if (i14 != 5) {
                                                    throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                                                } else {
                                                    if (z10) {
                                                        h12 = H.NARROW_STANDALONE;
                                                    }
                                                    h12 = H.NARROW;
                                                }
                                            } else if (z10) {
                                                h12 = H.SHORT_STANDALONE;
                                            }
                                            Objects.requireNonNull(pVar, "field");
                                            Objects.requireNonNull(h12, "textStyle");
                                            d(new s(pVar, h12, C.d()));
                                        } else if (charAt != 'e') {
                                            tVar2 = new t(charAt, i14, i14, i14);
                                            l(tVar2);
                                        } else if (charAt != 'E') {
                                            if (i14 != 1) {
                                                m(pVar, 2);
                                            }
                                            Objects.requireNonNull(pVar, "field");
                                            l(new k(pVar, 1, 19, G.NORMAL));
                                        }
                                    }
                                    if (i14 != 1) {
                                        if (i14 != 2) {
                                            throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                                        }
                                        m(pVar, i14);
                                    }
                                    Objects.requireNonNull(pVar, "field");
                                    l(new k(pVar, 1, 19, G.NORMAL));
                                } else if (i14 != 1) {
                                    throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                                }
                                h12 = H.SHORT;
                                Objects.requireNonNull(pVar, "field");
                                Objects.requireNonNull(h12, "textStyle");
                                d(new s(pVar, h12, C.d()));
                            } else {
                                b(j$.time.temporal.a.NANO_OF_SECOND, i14, i14, false);
                            }
                        }
                        z10 = false;
                        if (i14 == 1) {
                        }
                        if (charAt != 'e') {
                        }
                    }
                    i6 = 19;
                    g5 = G.NOT_NEGATIVE;
                    k(pVar, i14, i6, g5);
                } else if (charAt == 'z') {
                    if (i14 > 4) {
                        throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                    }
                    d(new v(i14 == 4 ? H.FULL : H.SHORT, false));
                } else if (charAt == 'V') {
                    if (i14 != 2) {
                        throw new IllegalArgumentException("Pattern letter count must be 2: " + charAt);
                    }
                    d(new u(j$.time.temporal.o.l(), "ZoneId()"));
                } else if (charAt == 'v') {
                    if (i14 == 1) {
                        h11 = H.SHORT;
                    } else if (i14 != 4) {
                        throw new IllegalArgumentException("Wrong number of  pattern letters: " + charAt);
                    } else {
                        h11 = H.FULL;
                    }
                    d(new v(h11, true));
                } else {
                    String str4 = "+0000";
                    if (charAt == 'Z') {
                        if (i14 < 4) {
                            str2 = "+HHMM";
                            g(str2, str4);
                        } else {
                            if (i14 != 4) {
                                if (i14 != 5) {
                                    throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                                }
                                str3 = "+HH:MM:ss";
                                g(str3, "Z");
                            }
                            h10 = H.FULL;
                            Objects.requireNonNull(h10, "style");
                            if (h10 == H.FULL && h10 != H.SHORT) {
                                throw new IllegalArgumentException("Style must be either full or short");
                            }
                            d(new j(h10, 0));
                        }
                    } else if (charAt == 'O') {
                        if (i14 == 1) {
                            h10 = H.SHORT;
                            Objects.requireNonNull(h10, "style");
                            if (h10 == H.FULL) {
                            }
                            d(new j(h10, 0));
                        } else {
                            if (i14 != 4) {
                                throw new IllegalArgumentException("Pattern letter count must be 1 or 4: " + charAt);
                            }
                            h10 = H.FULL;
                            Objects.requireNonNull(h10, "style");
                            if (h10 == H.FULL) {
                            }
                            d(new j(h10, 0));
                        }
                    } else if (charAt == 'X') {
                        if (i14 > 5) {
                            throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                        }
                        str3 = l.f20903d[i14 + (i14 == 1 ? 0 : 1)];
                        g(str3, "Z");
                    } else if (charAt != 'x') {
                        if (charAt == 'W') {
                            if (i14 > 1) {
                                throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                            }
                            tVar = new t(charAt, i14, i14, i14);
                        } else if (charAt == 'w') {
                            if (i14 > 2) {
                                throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                            }
                            tVar = new t(charAt, i14, i14, 2);
                        } else if (charAt != 'Y') {
                            throw new IllegalArgumentException("Unknown pattern letter: " + charAt);
                        } else {
                            tVar = i14 == 2 ? new t(charAt, i14, i14, 2) : new t(charAt, i14, i14, 19);
                        }
                        l(tVar);
                    } else if (i14 > 5) {
                        throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                    } else {
                        if (i14 == 1) {
                            str4 = "+00";
                        } else if (i14 % 2 != 0) {
                            str4 = "+00:00";
                        }
                        str2 = l.f20903d[i14 + (i14 == 1 ? 0 : 1)];
                        g(str2, str4);
                    }
                }
                i12 = (-1) + i13;
            } else if (charAt == '\'') {
                int i15 = i12 + 1;
                int i16 = i15;
                while (i16 < str.length()) {
                    if (str.charAt(i16) == '\'') {
                        int i17 = i16 + 1;
                        if (i17 < str.length() && str.charAt(i17) == '\'') {
                            i16 = i17;
                        }
                        if (i16 < str.length()) {
                            throw new IllegalArgumentException("Pattern ends with an incomplete string literal: ".concat(str));
                        }
                        String substring = str.substring(i15, i16);
                        if (substring.isEmpty()) {
                            e('\'');
                        } else {
                            f(substring.replace("''", "'"));
                        }
                        i12 = i16;
                    }
                    i16++;
                }
                if (i16 < str.length()) {
                }
            } else if (charAt == '[') {
                p();
            } else if (charAt == ']') {
                if (this.f20942a.f20943b == null) {
                    throw new IllegalArgumentException("Pattern invalid as it contains ] without previous [");
                }
                o();
            } else if (charAt == '{' || charAt == '}' || charAt == '#') {
                throw new IllegalArgumentException("Pattern includes reserved character: '" + charAt + "'");
            } else {
                e(charAt);
            }
            i12++;
        }
    }

    public final void j(j$.time.temporal.a aVar, HashMap hashMap) {
        Objects.requireNonNull(aVar, "field");
        Objects.requireNonNull(hashMap, "textLookup");
        LinkedHashMap linkedHashMap = new LinkedHashMap(hashMap);
        H h10 = H.FULL;
        d(new s(aVar, h10, new C0705b(new B(Collections.singletonMap(h10, linkedHashMap)))));
    }

    public final w k(j$.time.temporal.p pVar, int i6, int i10, G g5) {
        if (i6 == i10 && g5 == G.NOT_NEGATIVE) {
            m(pVar, i10);
            return this;
        }
        Objects.requireNonNull(pVar, "field");
        Objects.requireNonNull(g5, "signStyle");
        if (i6 < 1 || i6 > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i6);
        } else if (i10 < 1 || i10 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i10);
        } else if (i10 >= i6) {
            l(new k(pVar, i6, i10, g5));
            return this;
        } else {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i10 + " < " + i6);
        }
    }

    public final void m(j$.time.temporal.p pVar, int i6) {
        Objects.requireNonNull(pVar, "field");
        if (i6 >= 1 && i6 <= 19) {
            l(new k(pVar, i6, i6, G.NOT_NEGATIVE));
            return;
        }
        throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i6);
    }

    public final void n() {
        d(new u(f20939h, "ZoneRegionId()"));
    }

    public final void o() {
        w wVar = this.f20942a;
        if (wVar.f20943b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (wVar.f20944c.size() <= 0) {
            this.f20942a = this.f20942a.f20943b;
            return;
        }
        w wVar2 = this.f20942a;
        C0709f c0709f = new C0709f(wVar2.f20944c, wVar2.f20945d);
        this.f20942a = this.f20942a.f20943b;
        d(c0709f);
    }

    public final void p() {
        w wVar = this.f20942a;
        wVar.f20947g = -1;
        this.f20942a = new w(wVar);
    }

    public final void q() {
        d(r.INSENSITIVE);
    }

    public final void r() {
        d(r.SENSITIVE);
    }

    public final void s() {
        d(r.LENIENT);
    }

    public final void t() {
        d(r.STRICT);
    }

    public final DateTimeFormatter u() {
        return w(Locale.getDefault(), F.SMART, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final DateTimeFormatter v(F f, j$.time.chrono.u uVar) {
        return w(Locale.getDefault(), f, uVar);
    }
}
