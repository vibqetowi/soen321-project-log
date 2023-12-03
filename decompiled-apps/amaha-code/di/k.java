package di;

import j$.util.DesugarTimeZone;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
/* compiled from: ISO8601Utils.java */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final TimeZone f12896a = DesugarTimeZone.getTimeZone("GMT");

    public static boolean a(String str, int i6, char c10) {
        if (i6 < str.length() && str.charAt(i6) == c10) {
            return true;
        }
        return false;
    }

    public static String b(Date date) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(f12896a, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb2 = new StringBuilder(24);
        c(sb2, gregorianCalendar.get(1), 4);
        sb2.append('-');
        c(sb2, gregorianCalendar.get(2) + 1, 2);
        sb2.append('-');
        c(sb2, gregorianCalendar.get(5), 2);
        sb2.append('T');
        c(sb2, gregorianCalendar.get(11), 2);
        sb2.append(':');
        c(sb2, gregorianCalendar.get(12), 2);
        sb2.append(':');
        c(sb2, gregorianCalendar.get(13), 2);
        sb2.append('.');
        c(sb2, gregorianCalendar.get(14), 3);
        sb2.append('Z');
        return sb2.toString();
    }

    public static void c(StringBuilder sb2, int i6, int i10) {
        String num = Integer.toString(i6);
        for (int length = i10 - num.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(num);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00db A[Catch: IllegalArgumentException -> 0x01a8, IllegalArgumentException | IndexOutOfBoundsException -> 0x01aa, TRY_LEAVE, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException -> 0x01aa, blocks: (B:3:0x0003, B:6:0x0010, B:8:0x001c, B:9:0x001e, B:11:0x002c, B:13:0x0032, B:17:0x0044, B:19:0x0054, B:20:0x0056, B:22:0x0062, B:23:0x0064, B:25:0x006a, B:29:0x0074, B:34:0x0084, B:36:0x008c, B:37:0x0090, B:39:0x0096, B:44:0x00a3, B:46:0x00aa, B:51:0x00d5, B:53:0x00db, B:62:0x00f0, B:63:0x010b, B:64:0x010c, B:66:0x0118, B:69:0x0121, B:71:0x0140, B:74:0x014f, B:75:0x0171, B:76:0x0172, B:78:0x01a0, B:79:0x01a7, B:45:0x00a6), top: B:85:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a0 A[Catch: IllegalArgumentException -> 0x01a8, IllegalArgumentException | IndexOutOfBoundsException -> 0x01aa, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException -> 0x01aa, blocks: (B:3:0x0003, B:6:0x0010, B:8:0x001c, B:9:0x001e, B:11:0x002c, B:13:0x0032, B:17:0x0044, B:19:0x0054, B:20:0x0056, B:22:0x0062, B:23:0x0064, B:25:0x006a, B:29:0x0074, B:34:0x0084, B:36:0x008c, B:37:0x0090, B:39:0x0096, B:44:0x00a3, B:46:0x00aa, B:51:0x00d5, B:53:0x00db, B:62:0x00f0, B:63:0x010b, B:64:0x010c, B:66:0x0118, B:69:0x0121, B:71:0x0140, B:74:0x014f, B:75:0x0171, B:76:0x0172, B:78:0x01a0, B:79:0x01a7, B:45:0x00a6), top: B:85:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Date d(String str) {
        int i6;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        char charAt;
        int i16 = 4;
        try {
            int e10 = e(0, 4, str);
            if (a(str, 4, '-')) {
                i16 = 5;
            }
            int i17 = i16 + 2;
            int e11 = e(i16, i17, str);
            if (a(str, i17, '-')) {
                i17++;
            }
            int i18 = i17 + 2;
            int e12 = e(i17, i18, str);
            boolean a10 = a(str, i18, 'T');
            if (!a10 && str.length() <= i18) {
                return new GregorianCalendar(e10, e11 - 1, e12).getTime();
            }
            if (a10) {
                int i19 = i18 + 1;
                int i20 = i19 + 2;
                i13 = e(i19, i20, str);
                if (a(str, i20, ':')) {
                    i20++;
                }
                int i21 = i20 + 2;
                i14 = e(i20, i21, str);
                if (a(str, i21, ':')) {
                    i21++;
                }
                if (str.length() > i21 && (charAt = str.charAt(i21)) != 'Z' && charAt != '+' && charAt != '-') {
                    i12 = i21 + 2;
                    i15 = e(i21, i12, str);
                    if (i15 > 59 && i15 < 63) {
                        i15 = 59;
                    }
                    if (a(str, i12, '.')) {
                        int i22 = i12 + 1;
                        int i23 = i22 + 1;
                        while (true) {
                            if (i23 < str.length()) {
                                char charAt2 = str.charAt(i23);
                                if (charAt2 < '0' || charAt2 > '9') {
                                    break;
                                }
                                i23++;
                            } else {
                                i23 = str.length();
                                break;
                            }
                        }
                        int min = Math.min(i23, i22 + 3);
                        int e13 = e(i22, min, str);
                        double d10 = 3 - (min - i22);
                        i12 = i23;
                        i11 = (int) (Math.pow(10.0d, d10) * e13);
                    } else {
                        i11 = 0;
                    }
                    if (str.length() <= i12) {
                        char charAt3 = str.charAt(i12);
                        TimeZone timeZone = f12896a;
                        if (charAt3 != 'Z') {
                            if (charAt3 != '+' && charAt3 != '-') {
                                throw new IndexOutOfBoundsException("Invalid time zone indicator '" + charAt3 + "'");
                            }
                            String substring = str.substring(i12);
                            if (!"+0000".equals(substring) && !"+00:00".equals(substring)) {
                                String str2 = "GMT" + substring;
                                timeZone = DesugarTimeZone.getTimeZone(str2);
                                String id2 = timeZone.getID();
                                if (!id2.equals(str2) && !id2.replace(":", "").equals(str2)) {
                                    throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone.getID());
                                }
                            }
                        }
                        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
                        gregorianCalendar.setLenient(false);
                        gregorianCalendar.set(1, e10);
                        gregorianCalendar.set(2, e11 - 1);
                        gregorianCalendar.set(5, e12);
                        gregorianCalendar.set(11, i13);
                        gregorianCalendar.set(12, i14);
                        gregorianCalendar.set(13, i15);
                        gregorianCalendar.set(14, i11);
                        return gregorianCalendar.getTime();
                    }
                    throw new IllegalArgumentException("No time zone indicator");
                }
                i10 = i14;
                i11 = 0;
                i6 = i13;
                i18 = i21;
            } else {
                i6 = 0;
                i10 = 0;
                i11 = 0;
            }
            i12 = i18;
            i13 = i6;
            i14 = i10;
            i15 = 0;
            if (str.length() <= i12) {
            }
        } catch (IllegalArgumentException | IndexOutOfBoundsException e14) {
            throw new RuntimeException(defpackage.c.r("Not an RFC 3339 date: ", str), e14);
        }
    }

    public static int e(int i6, int i10, String str) {
        int i11;
        int i12;
        if (i6 >= 0 && i10 <= str.length() && i6 <= i10) {
            if (i6 < i10) {
                i12 = i6 + 1;
                int digit = Character.digit(str.charAt(i6), 10);
                if (digit >= 0) {
                    i11 = -digit;
                } else {
                    throw new NumberFormatException("Invalid number: " + str.substring(i6, i10));
                }
            } else {
                i11 = 0;
                i12 = i6;
            }
            while (i12 < i10) {
                int i13 = i12 + 1;
                int digit2 = Character.digit(str.charAt(i12), 10);
                if (digit2 >= 0) {
                    i11 = (i11 * 10) - digit2;
                    i12 = i13;
                } else {
                    throw new NumberFormatException("Invalid number: " + str.substring(i6, i10));
                }
            }
            return -i11;
        }
        throw new NumberFormatException(str);
    }
}
