package wf;

import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
/* compiled from: ISO8601Utils.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final TimeZone f36689a = DesugarTimeZone.getTimeZone("UTC");

    public static boolean a(String str, int i6, char c10) {
        if (i6 < str.length() && str.charAt(i6) == c10) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00e1 A[Catch: IllegalArgumentException -> 0x01ce, NumberFormatException | IllegalArgumentException | IndexOutOfBoundsException -> 0x01d0, IndexOutOfBoundsException -> 0x01d2, TRY_LEAVE, TryCatch #2 {NumberFormatException | IllegalArgumentException | IndexOutOfBoundsException -> 0x01d0, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0035, B:13:0x003b, B:17:0x0050, B:19:0x0060, B:20:0x0062, B:22:0x006e, B:23:0x0070, B:25:0x0076, B:29:0x0080, B:34:0x0090, B:36:0x0098, B:37:0x009c, B:39:0x00a2, B:44:0x00af, B:46:0x00b9, B:57:0x00db, B:59:0x00e1, B:86:0x0196, B:68:0x00f6, B:69:0x0111, B:70:0x0112, B:74:0x012e, B:76:0x013b, B:79:0x0144, B:81:0x0163, B:84:0x0173, B:85:0x0195, B:73:0x011d, B:88:0x01c6, B:89:0x01cd, B:50:0x00c9, B:51:0x00cc, B:45:0x00b4), top: B:105:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c6 A[Catch: IllegalArgumentException -> 0x01ce, NumberFormatException | IllegalArgumentException | IndexOutOfBoundsException -> 0x01d0, IndexOutOfBoundsException -> 0x01d2, TryCatch #2 {NumberFormatException | IllegalArgumentException | IndexOutOfBoundsException -> 0x01d0, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0035, B:13:0x003b, B:17:0x0050, B:19:0x0060, B:20:0x0062, B:22:0x006e, B:23:0x0070, B:25:0x0076, B:29:0x0080, B:34:0x0090, B:36:0x0098, B:37:0x009c, B:39:0x00a2, B:44:0x00af, B:46:0x00b9, B:57:0x00db, B:59:0x00e1, B:86:0x0196, B:68:0x00f6, B:69:0x0111, B:70:0x0112, B:74:0x012e, B:76:0x013b, B:79:0x0144, B:81:0x0163, B:84:0x0173, B:85:0x0195, B:73:0x011d, B:88:0x01c6, B:89:0x01cd, B:50:0x00c9, B:51:0x00cc, B:45:0x00b4), top: B:105:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Date b(String str, ParsePosition parsePosition) {
        String str2;
        int i6;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int length;
        char charAt;
        try {
            int index = parsePosition.getIndex();
            int i15 = index + 4;
            int c10 = c(index, i15, str);
            if (a(str, i15, '-')) {
                i15++;
            }
            int i16 = i15 + 2;
            int c11 = c(i15, i16, str);
            if (a(str, i16, '-')) {
                i16++;
            }
            int i17 = i16 + 2;
            int c12 = c(i16, i17, str);
            boolean a10 = a(str, i17, 'T');
            if (!a10 && str.length() <= i17) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(c10, c11 - 1, c12);
                parsePosition.setIndex(i17);
                return gregorianCalendar.getTime();
            }
            if (a10) {
                int i18 = i17 + 1;
                int i19 = i18 + 2;
                i14 = c(i18, i19, str);
                if (a(str, i19, ':')) {
                    i19++;
                }
                int i20 = i19 + 2;
                i10 = c(i19, i20, str);
                if (a(str, i20, ':')) {
                    i20++;
                }
                if (str.length() > i20 && (charAt = str.charAt(i20)) != 'Z' && charAt != '+' && charAt != '-') {
                    i11 = i20 + 2;
                    i13 = c(i20, i11, str);
                    if (i13 > 59 && i13 < 63) {
                        i13 = 59;
                    }
                    if (a(str, i11, '.')) {
                        int i21 = i11 + 1;
                        int i22 = i21 + 1;
                        while (true) {
                            if (i22 < str.length()) {
                                char charAt2 = str.charAt(i22);
                                if (charAt2 < '0' || charAt2 > '9') {
                                    break;
                                }
                                i22++;
                            } else {
                                i22 = str.length();
                                break;
                            }
                        }
                        int min = Math.min(i22, i21 + 3);
                        i12 = c(i21, min, str);
                        int i23 = min - i21;
                        if (i23 != 1) {
                            if (i23 == 2) {
                                i12 *= 10;
                            }
                        } else {
                            i12 *= 100;
                        }
                        i11 = i22;
                    } else {
                        i12 = 0;
                    }
                    if (str.length() <= i11) {
                        char charAt3 = str.charAt(i11);
                        TimeZone timeZone = f36689a;
                        if (charAt3 == 'Z') {
                            length = i11 + 1;
                        } else if (charAt3 != '+' && charAt3 != '-') {
                            throw new IndexOutOfBoundsException("Invalid time zone indicator '" + charAt3 + "'");
                        } else {
                            String substring = str.substring(i11);
                            if (substring.length() < 5) {
                                substring = substring + "00";
                            }
                            length = i11 + substring.length();
                            if (!"+0000".equals(substring) && !"+00:00".equals(substring)) {
                                String str3 = "GMT" + substring;
                                timeZone = DesugarTimeZone.getTimeZone(str3);
                                String id2 = timeZone.getID();
                                if (!id2.equals(str3) && !id2.replace(":", "").equals(str3)) {
                                    throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str3 + " given, resolves to " + timeZone.getID());
                                }
                            }
                        }
                        GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
                        gregorianCalendar2.setLenient(false);
                        gregorianCalendar2.set(1, c10);
                        gregorianCalendar2.set(2, c11 - 1);
                        gregorianCalendar2.set(5, c12);
                        gregorianCalendar2.set(11, i14);
                        gregorianCalendar2.set(12, i10);
                        gregorianCalendar2.set(13, i13);
                        gregorianCalendar2.set(14, i12);
                        parsePosition.setIndex(length);
                        return gregorianCalendar2.getTime();
                    }
                    throw new IllegalArgumentException("No time zone indicator");
                }
                i6 = i14;
                i17 = i20;
            } else {
                i6 = 0;
                i10 = 0;
            }
            i11 = i17;
            i12 = 0;
            i13 = 0;
            i14 = i6;
            if (str.length() <= i11) {
            }
        } catch (NumberFormatException | IllegalArgumentException | IndexOutOfBoundsException e10) {
            if (str == null) {
                str2 = null;
            } else {
                str2 = "\"" + str + '\"';
            }
            String message = e10.getMessage();
            if (message == null || message.isEmpty()) {
                message = "(" + e10.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException.initCause(e10);
            throw parseException;
        }
    }

    public static int c(int i6, int i10, String str) {
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
