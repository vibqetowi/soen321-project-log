package ta;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public abstract class s6 {

    /* renamed from: a  reason: collision with root package name */
    public final String f32868a;

    /* renamed from: b  reason: collision with root package name */
    public final int f32869b;

    /* renamed from: c  reason: collision with root package name */
    public Boolean f32870c;

    /* renamed from: d  reason: collision with root package name */
    public Boolean f32871d;

    /* renamed from: e  reason: collision with root package name */
    public Long f32872e;
    public Long f;

    public s6(String str, int i6) {
        this.f32868a = str;
        this.f32869b = i6;
    }

    public static Boolean a(BigDecimal bigDecimal, com.google.android.gms.internal.measurement.s1 s1Var, double d10) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        v9.o.h(s1Var);
        if (s1Var.A()) {
            boolean z10 = true;
            if (s1Var.F() != 1) {
                if (s1Var.F() == 5) {
                    if (!s1Var.E() || !s1Var.D()) {
                        return null;
                    }
                } else if (!s1Var.B()) {
                    return null;
                }
                int F = s1Var.F();
                if (s1Var.F() == 5) {
                    if (f6.I(s1Var.y()) && f6.I(s1Var.x())) {
                        try {
                            BigDecimal bigDecimal5 = new BigDecimal(s1Var.y());
                            bigDecimal4 = new BigDecimal(s1Var.x());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return null;
                } else if (!f6.I(s1Var.w())) {
                    return null;
                } else {
                    try {
                        bigDecimal2 = new BigDecimal(s1Var.w());
                        bigDecimal3 = null;
                        bigDecimal4 = null;
                    } catch (NumberFormatException unused2) {
                    }
                }
                if (F == 5) {
                    if (bigDecimal3 == null) {
                        return null;
                    }
                } else if (bigDecimal2 == null) {
                    return null;
                }
                int i6 = F - 1;
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            if (i6 != 4 || bigDecimal3 == null) {
                                return null;
                            }
                            return Boolean.valueOf((bigDecimal.compareTo(bigDecimal3) < 0 || bigDecimal.compareTo(bigDecimal4) > 0) ? false : false);
                        } else if (bigDecimal2 == null) {
                            return null;
                        } else {
                            if (d10 != 0.0d) {
                                return Boolean.valueOf((bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d10).multiply(new BigDecimal(2)))) <= 0 || bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d10).multiply(new BigDecimal(2)))) >= 0) ? false : false);
                            }
                            if (bigDecimal.compareTo(bigDecimal2) != 0) {
                                z10 = false;
                            }
                            return Boolean.valueOf(z10);
                        }
                    } else if (bigDecimal2 == null) {
                        return null;
                    } else {
                        if (bigDecimal.compareTo(bigDecimal2) <= 0) {
                            z10 = false;
                        }
                        return Boolean.valueOf(z10);
                    }
                } else if (bigDecimal2 == null) {
                    return null;
                } else {
                    if (bigDecimal.compareTo(bigDecimal2) >= 0) {
                        z10 = false;
                    }
                    return Boolean.valueOf(z10);
                }
            }
        }
        return null;
    }

    public static Boolean b(String str, com.google.android.gms.internal.measurement.w1 w1Var, w2 w2Var) {
        String x10;
        List<String> y10;
        String str2;
        int i6;
        v9.o.h(w1Var);
        if (str == null || !w1Var.C() || w1Var.D() == 1) {
            return null;
        }
        if (w1Var.D() == 7) {
            if (w1Var.u() == 0) {
                return null;
            }
        } else if (!w1Var.B()) {
            return null;
        }
        int D = w1Var.D();
        boolean z10 = w1Var.z();
        if (!z10 && D != 2 && D != 7) {
            x10 = w1Var.x().toUpperCase(Locale.ENGLISH);
        } else {
            x10 = w1Var.x();
        }
        if (w1Var.u() == 0) {
            y10 = null;
        } else {
            y10 = w1Var.y();
            if (!z10) {
                ArrayList arrayList = new ArrayList(y10.size());
                for (String str3 : y10) {
                    arrayList.add(str3.toUpperCase(Locale.ENGLISH));
                }
                y10 = Collections.unmodifiableList(arrayList);
            }
        }
        if (D == 2) {
            str2 = x10;
        } else {
            str2 = null;
        }
        if (D == 7) {
            if (y10 == null || y10.isEmpty()) {
                return null;
            }
        } else if (x10 == null) {
            return null;
        }
        if (!z10 && D != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (D - 1) {
            case 1:
                if (str2 == null) {
                    return null;
                }
                if (true != z10) {
                    i6 = 66;
                } else {
                    i6 = 0;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str2, i6).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    w2Var.C.c(str2, "Invalid regular expression in REGEXP audience filter. expression");
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(x10));
            case 3:
                return Boolean.valueOf(str.endsWith(x10));
            case 4:
                return Boolean.valueOf(str.contains(x10));
            case 5:
                return Boolean.valueOf(str.equals(x10));
            case 6:
                if (y10 == null) {
                    return null;
                }
                return Boolean.valueOf(y10.contains(str));
            default:
                return null;
        }
    }

    public static Boolean c(Boolean bool, boolean z10) {
        boolean z11;
        if (bool == null) {
            return null;
        }
        if (bool.booleanValue() != z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }
}
