package lv;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: Cookie.kt */
/* loaded from: classes2.dex */
public final class k {

    /* renamed from: j  reason: collision with root package name */
    public static final Pattern f24651j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k  reason: collision with root package name */
    public static final Pattern f24652k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l  reason: collision with root package name */
    public static final Pattern f24653l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f24654m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a  reason: collision with root package name */
    public final String f24655a;

    /* renamed from: b  reason: collision with root package name */
    public final String f24656b;

    /* renamed from: c  reason: collision with root package name */
    public final long f24657c;

    /* renamed from: d  reason: collision with root package name */
    public final String f24658d;

    /* renamed from: e  reason: collision with root package name */
    public final String f24659e;
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f24660g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f24661h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f24662i;

    /* compiled from: Cookie.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        /* JADX WARN: Code restructure failed: missing block: B:31:0x003f, code lost:
            if (r1 != ':') goto L7;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int a(int i6, int i10, String str, boolean z10) {
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            while (i6 < i10) {
                int i11 = i6 + 1;
                char charAt = str.charAt(i6);
                if ((charAt >= ' ' || charAt == '\t') && charAt < 127) {
                    z11 = false;
                    if (charAt <= '9' && '0' <= charAt) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        if (charAt <= 'z' && 'a' <= charAt) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13) {
                            if (charAt <= 'Z' && 'A' <= charAt) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (!z14) {
                            }
                        }
                    }
                }
                z11 = true;
                if (z11 == (!z10)) {
                    return i6;
                }
                i6 = i11;
            }
            return i10;
        }

        public static long b(int i6, String str) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            boolean z16;
            boolean z17;
            int a10 = a(0, i6, str, false);
            Matcher matcher = k.f24654m.matcher(str);
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            while (a10 < i6) {
                int a11 = a(a10 + 1, i6, str, true);
                matcher.region(a10, a11);
                if (i11 == -1 && matcher.usePattern(k.f24654m).matches()) {
                    String group = matcher.group(1);
                    kotlin.jvm.internal.i.f(group, "matcher.group(1)");
                    int parseInt = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    kotlin.jvm.internal.i.f(group2, "matcher.group(2)");
                    int parseInt2 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    kotlin.jvm.internal.i.f(group3, "matcher.group(3)");
                    i15 = Integer.parseInt(group3);
                    i14 = parseInt2;
                    i11 = parseInt;
                } else if (i12 == -1 && matcher.usePattern(k.f24653l).matches()) {
                    String group4 = matcher.group(1);
                    kotlin.jvm.internal.i.f(group4, "matcher.group(1)");
                    i12 = Integer.parseInt(group4);
                } else {
                    if (i13 == -1) {
                        Pattern pattern = k.f24652k;
                        if (matcher.usePattern(pattern).matches()) {
                            String group5 = matcher.group(1);
                            kotlin.jvm.internal.i.f(group5, "matcher.group(1)");
                            Locale locale = Locale.US;
                            String e10 = ri.e.e(locale, "US", group5, locale, "this as java.lang.String).toLowerCase(locale)");
                            String pattern2 = pattern.pattern();
                            kotlin.jvm.internal.i.f(pattern2, "MONTH_PATTERN.pattern()");
                            i13 = gv.r.O0(pattern2, e10, 0, false, 6) / 4;
                        }
                    }
                    if (i10 == -1 && matcher.usePattern(k.f24651j).matches()) {
                        String group6 = matcher.group(1);
                        kotlin.jvm.internal.i.f(group6, "matcher.group(1)");
                        i10 = Integer.parseInt(group6);
                    }
                }
                a10 = a(a11 + 1, i6, str, false);
            }
            if (70 <= i10 && i10 < 100) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i10 += 1900;
            }
            if (i10 >= 0 && i10 < 70) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                i10 += 2000;
            }
            if (i10 >= 1601) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                if (i13 != -1) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    if (1 <= i12 && i12 < 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (z14) {
                        if (i11 >= 0 && i11 < 24) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (z15) {
                            if (i14 >= 0 && i14 < 60) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if (z16) {
                                if (i15 >= 0 && i15 < 60) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                if (z17) {
                                    GregorianCalendar gregorianCalendar = new GregorianCalendar(mv.b.f25759e);
                                    gregorianCalendar.setLenient(false);
                                    gregorianCalendar.set(1, i10);
                                    gregorianCalendar.set(2, i13 - 1);
                                    gregorianCalendar.set(5, i12);
                                    gregorianCalendar.set(11, i11);
                                    gregorianCalendar.set(12, i14);
                                    gregorianCalendar.set(13, i15);
                                    gregorianCalendar.set(14, 0);
                                    return gregorianCalendar.getTimeInMillis();
                                }
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public k(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f24655a = str;
        this.f24656b = str2;
        this.f24657c = j10;
        this.f24658d = str3;
        this.f24659e = str4;
        this.f = z10;
        this.f24660g = z11;
        this.f24661h = z12;
        this.f24662i = z13;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (kotlin.jvm.internal.i.b(kVar.f24655a, this.f24655a) && kotlin.jvm.internal.i.b(kVar.f24656b, this.f24656b) && kVar.f24657c == this.f24657c && kotlin.jvm.internal.i.b(kVar.f24658d, this.f24658d) && kotlin.jvm.internal.i.b(kVar.f24659e, this.f24659e) && kVar.f == this.f && kVar.f24660g == this.f24660g && kVar.f24661h == this.f24661h && kVar.f24662i == this.f24662i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int i10;
        int i11;
        int c10 = pl.a.c(this.f24656b, pl.a.c(this.f24655a, 527, 31), 31);
        long j10 = this.f24657c;
        int c11 = pl.a.c(this.f24659e, pl.a.c(this.f24658d, (c10 + ((int) (j10 ^ (j10 >>> 32)))) * 31, 31), 31);
        int i12 = 1231;
        if (this.f) {
            i6 = 1231;
        } else {
            i6 = 1237;
        }
        int i13 = (c11 + i6) * 31;
        if (this.f24660g) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i14 = (i13 + i10) * 31;
        if (this.f24661h) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int i15 = (i14 + i11) * 31;
        if (!this.f24662i) {
            i12 = 1237;
        }
        return i15 + i12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f24655a);
        sb2.append('=');
        sb2.append(this.f24656b);
        if (this.f24661h) {
            long j10 = this.f24657c;
            if (j10 == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                String format = qv.c.f30143a.get().format(new Date(j10));
                kotlin.jvm.internal.i.f(format, "STANDARD_DATE_FORMAT.get().format(this)");
                sb2.append(format);
            }
        }
        if (!this.f24662i) {
            sb2.append("; domain=");
            sb2.append(this.f24658d);
        }
        sb2.append("; path=");
        sb2.append(this.f24659e);
        if (this.f) {
            sb2.append("; secure");
        }
        if (this.f24660g) {
            sb2.append("; httponly");
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.i.f(sb3, "toString()");
        return sb3;
    }
}
