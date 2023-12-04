package org.apache.commons.lang3.time;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;
/* loaded from: classes5.dex */
public class DurationFormatUtils {
    public static final String ISO_EXTENDED_FORMAT_PATTERN = "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.SSS'S'";
    static final Object y = "y";
    static final Object M = "M";
    static final Object d = "d";
    static final Object H = "H";
    static final Object m = "m";
    static final Object s = "s";
    static final Object S = ExifInterface.LATITUDE_SOUTH;

    public static String formatDurationHMS(long j) {
        return formatDuration(j, "HH:mm:ss.SSS");
    }

    public static String formatDurationISO(long j) {
        return formatDuration(j, ISO_EXTENDED_FORMAT_PATTERN, false);
    }

    public static String formatDuration(long j, String str) {
        return formatDuration(j, str, true);
    }

    public static String formatDuration(long j, String str, boolean z) {
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        Validate.inclusiveBetween(0L, Long.MAX_VALUE, j, "durationMillis must not be negative");
        Token[] lexx = lexx(str);
        if (Token.containsTokenWithValue(lexx, d)) {
            long j8 = j / 86400000;
            j2 = j - (86400000 * j8);
            j3 = j8;
        } else {
            j2 = j;
            j3 = 0;
        }
        if (Token.containsTokenWithValue(lexx, H)) {
            long j9 = j2 / 3600000;
            j2 -= 3600000 * j9;
            j4 = j9;
        } else {
            j4 = 0;
        }
        if (Token.containsTokenWithValue(lexx, m)) {
            long j10 = j2 / 60000;
            j2 -= 60000 * j10;
            j5 = j10;
        } else {
            j5 = 0;
        }
        if (Token.containsTokenWithValue(lexx, s)) {
            long j11 = j2 / 1000;
            j7 = j2 - (1000 * j11);
            j6 = j11;
        } else {
            j6 = 0;
            j7 = j2;
        }
        return format(lexx, 0L, 0L, j3, j4, j5, j6, j7, z);
    }

    public static String formatDurationWords(long j, boolean z, boolean z2) {
        String formatDuration = formatDuration(j, "d' days 'H' hours 'm' minutes 's' seconds'");
        if (z) {
            formatDuration = " " + formatDuration;
            String replaceOnce = StringUtils.replaceOnce(formatDuration, " 0 days", "");
            if (replaceOnce.length() != formatDuration.length()) {
                String replaceOnce2 = StringUtils.replaceOnce(replaceOnce, " 0 hours", "");
                if (replaceOnce2.length() != replaceOnce.length()) {
                    formatDuration = StringUtils.replaceOnce(replaceOnce2, " 0 minutes", "");
                    if (formatDuration.length() != formatDuration.length()) {
                        formatDuration = StringUtils.replaceOnce(formatDuration, " 0 seconds", "");
                    }
                } else {
                    formatDuration = replaceOnce;
                }
            }
            if (!formatDuration.isEmpty()) {
                formatDuration = formatDuration.substring(1);
            }
        }
        if (z2) {
            String replaceOnce3 = StringUtils.replaceOnce(formatDuration, " 0 seconds", "");
            if (replaceOnce3.length() != formatDuration.length()) {
                formatDuration = StringUtils.replaceOnce(replaceOnce3, " 0 minutes", "");
                if (formatDuration.length() != replaceOnce3.length()) {
                    String replaceOnce4 = StringUtils.replaceOnce(formatDuration, " 0 hours", "");
                    if (replaceOnce4.length() != formatDuration.length()) {
                        formatDuration = StringUtils.replaceOnce(replaceOnce4, " 0 days", "");
                    }
                } else {
                    formatDuration = replaceOnce3;
                }
            }
        }
        return StringUtils.replaceOnce(StringUtils.replaceOnce(StringUtils.replaceOnce(StringUtils.replaceOnce(" " + formatDuration, " 1 seconds", " 1 second"), " 1 minutes", " 1 minute"), " 1 hours", " 1 hour"), " 1 days", " 1 day").trim();
    }

    public static String formatPeriodISO(long j, long j2) {
        return formatPeriod(j, j2, ISO_EXTENDED_FORMAT_PATTERN, false, TimeZone.getDefault());
    }

    public static String formatPeriod(long j, long j2, String str) {
        return formatPeriod(j, j2, str, true, TimeZone.getDefault());
    }

    public static String formatPeriod(long j, long j2, String str, boolean z, TimeZone timeZone) {
        int i = 0;
        Validate.isTrue(j <= j2, "startMillis must not be greater than endMillis", new Object[0]);
        Token[] lexx = lexx(str);
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTime(new Date(j));
        Calendar calendar2 = Calendar.getInstance(timeZone);
        calendar2.setTime(new Date(j2));
        int i2 = calendar2.get(14) - calendar.get(14);
        int i3 = calendar2.get(13) - calendar.get(13);
        int i4 = calendar2.get(12) - calendar.get(12);
        int i5 = calendar2.get(11) - calendar.get(11);
        int i6 = calendar2.get(5) - calendar.get(5);
        int i7 = calendar2.get(2) - calendar.get(2);
        int i8 = calendar2.get(1) - calendar.get(1);
        while (i2 < 0) {
            i2 += 1000;
            i3--;
        }
        while (i3 < 0) {
            i3 += 60;
            i4--;
        }
        while (i4 < 0) {
            i4 += 60;
            i5--;
        }
        while (i5 < 0) {
            i5 += 24;
            i6--;
        }
        if (Token.containsTokenWithValue(lexx, M)) {
            while (i6 < 0) {
                i6 += calendar.getActualMaximum(5);
                i7--;
                calendar.add(2, 1);
            }
            while (i7 < 0) {
                i7 += 12;
                i8--;
            }
            if (!Token.containsTokenWithValue(lexx, y) && i8 != 0) {
                while (i8 != 0) {
                    i7 += i8 * 12;
                    i8 = 0;
                }
            }
        } else {
            if (!Token.containsTokenWithValue(lexx, y)) {
                int i9 = calendar2.get(1);
                if (i7 < 0) {
                    i9--;
                }
                while (calendar.get(1) != i9) {
                    int actualMaximum = i6 + (calendar.getActualMaximum(6) - calendar.get(6));
                    if ((calendar instanceof GregorianCalendar) && calendar.get(2) == 1 && calendar.get(5) == 29) {
                        actualMaximum++;
                    }
                    calendar.add(1, 1);
                    i6 = actualMaximum + calendar.get(6);
                }
                i8 = 0;
            }
            while (calendar.get(2) != calendar2.get(2)) {
                i6 += calendar.getActualMaximum(5);
                calendar.add(2, 1);
            }
            i7 = 0;
            while (i6 < 0) {
                i6 += calendar.getActualMaximum(5);
                i7--;
                calendar.add(2, 1);
            }
        }
        if (!Token.containsTokenWithValue(lexx, d)) {
            i5 += i6 * 24;
            i6 = 0;
        }
        if (!Token.containsTokenWithValue(lexx, H)) {
            i4 += i5 * 60;
            i5 = 0;
        }
        if (!Token.containsTokenWithValue(lexx, m)) {
            i3 += i4 * 60;
            i4 = 0;
        }
        if (Token.containsTokenWithValue(lexx, s)) {
            i = i3;
        } else {
            i2 += i3 * 1000;
        }
        return format(lexx, i8, i7, i6, i5, i4, i, i2, z);
    }

    static String format(Token[] tokenArr, long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z) {
        int i;
        int i2;
        long j8;
        Token[] tokenArr2 = tokenArr;
        long j9 = j7;
        StringBuilder sb = new StringBuilder();
        int length = tokenArr2.length;
        int i3 = 0;
        boolean z2 = false;
        while (i3 < length) {
            Token token = tokenArr2[i3];
            Object value = token.getValue();
            int count = token.getCount();
            if (value instanceof StringBuilder) {
                sb.append(value.toString());
                j8 = j9;
                i2 = length;
                i = i3;
            } else {
                if (value.equals(y)) {
                    sb.append(paddedValue(j, z, count));
                } else if (value.equals(M)) {
                    sb.append(paddedValue(j2, z, count));
                } else if (value.equals(d)) {
                    i = i3;
                    sb.append(paddedValue(j3, z, count));
                    j8 = j9;
                    i2 = length;
                    z2 = false;
                } else {
                    i = i3;
                    if (value.equals(H)) {
                        i2 = length;
                        sb.append(paddedValue(j4, z, count));
                    } else {
                        i2 = length;
                        if (value.equals(m)) {
                            sb.append(paddedValue(j5, z, count));
                        } else {
                            if (value.equals(s)) {
                                sb.append(paddedValue(j6, z, count));
                                j8 = j7;
                                z2 = true;
                            } else if (value.equals(S)) {
                                if (z2) {
                                    j8 = j7;
                                    sb.append(paddedValue(j8, true, z ? Math.max(3, count) : 3));
                                } else {
                                    j8 = j7;
                                    sb.append(paddedValue(j8, z, count));
                                }
                                z2 = false;
                            } else {
                                j8 = j7;
                            }
                            i3 = i + 1;
                            j9 = j8;
                            length = i2;
                            tokenArr2 = tokenArr;
                        }
                    }
                    j8 = j9;
                    z2 = false;
                    i3 = i + 1;
                    j9 = j8;
                    length = i2;
                    tokenArr2 = tokenArr;
                }
                j8 = j9;
                i2 = length;
                i = i3;
                z2 = false;
            }
            i3 = i + 1;
            j9 = j8;
            length = i2;
            tokenArr2 = tokenArr;
        }
        return sb.toString();
    }

    private static String paddedValue(long j, boolean z, int i) {
        String l = Long.toString(j);
        return z ? StringUtils.leftPad(l, i, '0') : l;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static Token[] lexx(String str) {
        Object obj;
        ArrayList arrayList = new ArrayList(str.length());
        boolean z = false;
        StringBuilder sb = null;
        Token token = null;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (z && charAt != '\'') {
                sb.append(charAt);
            } else if (charAt != '\'') {
                if (charAt == 'H') {
                    obj = H;
                } else if (charAt == 'M') {
                    obj = M;
                } else if (charAt == 'S') {
                    obj = S;
                } else if (charAt == 'd') {
                    obj = d;
                } else if (charAt == 'm') {
                    obj = m;
                } else if (charAt == 's') {
                    obj = s;
                } else if (charAt == 'y') {
                    obj = y;
                } else {
                    if (sb == null) {
                        sb = new StringBuilder();
                        arrayList.add(new Token(sb));
                    }
                    sb.append(charAt);
                    obj = null;
                }
                if (obj != null) {
                    if (token != null && token.getValue().equals(obj)) {
                        token.increment();
                    } else {
                        Token token2 = new Token(obj);
                        arrayList.add(token2);
                        token = token2;
                    }
                    sb = null;
                }
            } else if (z) {
                z = false;
                sb = null;
                obj = null;
                if (obj != null) {
                }
            } else {
                sb = new StringBuilder();
                arrayList.add(new Token(sb));
                z = true;
                obj = null;
                if (obj != null) {
                }
            }
        }
        if (z) {
            throw new IllegalArgumentException("Unmatched quote in format: " + str);
        }
        return (Token[]) arrayList.toArray(new Token[0]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class Token {
        private int count;
        private final Object value;

        static boolean containsTokenWithValue(Token[] tokenArr, Object obj) {
            for (Token token : tokenArr) {
                if (token.getValue() == obj) {
                    return true;
                }
            }
            return false;
        }

        Token(Object obj) {
            this.value = obj;
            this.count = 1;
        }

        Token(Object obj, int i) {
            this.value = obj;
            this.count = i;
        }

        void increment() {
            this.count++;
        }

        int getCount() {
            return this.count;
        }

        Object getValue() {
            return this.value;
        }

        public boolean equals(Object obj) {
            if (obj instanceof Token) {
                Token token = (Token) obj;
                if (this.value.getClass() == token.value.getClass() && this.count == token.count) {
                    Object obj2 = this.value;
                    if (obj2 instanceof StringBuilder) {
                        return obj2.toString().equals(token.value.toString());
                    }
                    if (obj2 instanceof Number) {
                        return obj2.equals(token.value);
                    }
                    return obj2 == token.value;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return StringUtils.repeat(this.value.toString(), this.count);
        }
    }
}
