package vr;

import java.text.ParseException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* compiled from: JsonUtil.java */
/* loaded from: classes2.dex */
public final class m1 {

    /* renamed from: a  reason: collision with root package name */
    public static final long f35767a = TimeUnit.SECONDS.toNanos(1);

    public static void a(List list) {
        for (int i6 = 0; i6 < list.size(); i6++) {
            if (!(list.get(i6) instanceof Map)) {
                throw new ClassCastException(String.format(Locale.US, "value %s for idx %d in %s is not object", list.get(i6), Integer.valueOf(i6), list));
            }
        }
    }

    public static List b(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof List) {
            return (List) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not List", obj, str, map));
    }

    public static List c(String str, Map map) {
        List b10 = b(str, map);
        if (b10 == null) {
            return null;
        }
        for (int i6 = 0; i6 < b10.size(); i6++) {
            if (!(b10.get(i6) instanceof String)) {
                throw new ClassCastException(String.format(Locale.US, "value '%s' for idx %d in '%s' is not string", b10.get(i6), Integer.valueOf(i6), b10));
            }
        }
        return b10;
    }

    public static Double d(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not a double", obj, str));
            }
        }
        throw new IllegalArgumentException(String.format("value '%s' for key '%s' in '%s' is not a number", obj, str, map));
    }

    public static Integer e(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Double) {
            Double d10 = (Double) obj;
            int intValue = d10.intValue();
            if (intValue == d10.doubleValue()) {
                return Integer.valueOf(intValue);
            }
            throw new ClassCastException("Number expected to be integer: " + d10);
        } else if (obj instanceof String) {
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
        } else {
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
        }
    }

    public static Map f(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Map) {
            return (Map) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not object", obj, str, map));
    }

    public static String g(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not String", obj, str, map));
    }

    public static Long h(String str, Map map) {
        String g5 = g(str, map);
        if (g5 == null) {
            return null;
        }
        try {
            return Long.valueOf(j(g5));
        } catch (ParseException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long i(int i6, long j10) {
        long j11;
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        boolean z13;
        int i11;
        long j12 = i6;
        long j13 = f35767a;
        boolean z14 = false;
        if (j12 > (-j13) && j12 < j13) {
            j11 = j10;
            i10 = i6;
        } else {
            long j14 = j12 / j13;
            j11 = j10 + j14;
            if ((j10 ^ j14) < 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((j10 ^ j11) >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 | z11) {
                i10 = (int) (j12 % j13);
            } else {
                StringBuilder sb2 = new StringBuilder(64);
                sb2.append("overflow: checkedAdd(");
                sb2.append(j10);
                sb2.append(", ");
                sb2.append(j14);
                sb2.append(")");
                throw new ArithmeticException(sb2.toString());
            }
        }
        if (j11 > 0 && i10 < 0) {
            i10 = (int) (i10 + j13);
            j11--;
        }
        if (j11 < 0 && i10 > 0) {
            i10 = (int) (i10 - j13);
            j11++;
        }
        if (j11 >= -315576000000L && j11 <= 315576000000L) {
            long j15 = i10;
            if (j15 >= -999999999 && j15 < j13 && ((j11 >= 0 && i10 >= 0) || (i11 <= 0 && i10 <= 0))) {
                z12 = true;
                if (!z12) {
                    long nanos = TimeUnit.SECONDS.toNanos(j11);
                    long j16 = i10;
                    long j17 = nanos + j16;
                    if ((j16 ^ nanos) < 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if ((nanos ^ j17) >= 0) {
                        z14 = true;
                    }
                    if (!(z13 | z14)) {
                        return ((j17 >>> 63) ^ 1) + Long.MAX_VALUE;
                    }
                    return j17;
                }
                throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", Long.valueOf(j11), Integer.valueOf(i10)));
            }
        }
        z12 = false;
        if (!z12) {
        }
    }

    public static long j(String str) {
        boolean z10;
        String str2;
        int i6;
        if (!str.isEmpty() && str.charAt(str.length() - 1) == 's') {
            if (str.charAt(0) == '-') {
                str = str.substring(1);
                z10 = true;
            } else {
                z10 = false;
            }
            String substring = str.substring(0, str.length() - 1);
            int indexOf = substring.indexOf(46);
            if (indexOf != -1) {
                str2 = substring.substring(indexOf + 1);
                substring = substring.substring(0, indexOf);
            } else {
                str2 = "";
            }
            long parseLong = Long.parseLong(substring);
            if (str2.isEmpty()) {
                i6 = 0;
            } else {
                i6 = 0;
                for (int i10 = 0; i10 < 9; i10++) {
                    i6 *= 10;
                    if (i10 < str2.length()) {
                        if (str2.charAt(i10) >= '0' && str2.charAt(i10) <= '9') {
                            i6 = (str2.charAt(i10) - '0') + i6;
                        } else {
                            throw new ParseException("Invalid nanoseconds.", 0);
                        }
                    }
                }
            }
            if (parseLong >= 0) {
                if (z10) {
                    parseLong = -parseLong;
                    i6 = -i6;
                }
                try {
                    return i(i6, parseLong);
                } catch (IllegalArgumentException unused) {
                    throw new ParseException("Duration value is out of range.", 0);
                }
            }
            throw new ParseException("Invalid duration string: ".concat(str), 0);
        }
        throw new ParseException("Invalid duration string: ".concat(str), 0);
    }
}
