package io.grpc.netty.shaded.io.netty.handler.codec;

import io.grpc.netty.shaded.io.netty.util.AsciiString;
import io.grpc.netty.shaded.io.netty.util.concurrent.FastThreadLocal;
import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
import java.util.BitSet;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
/* loaded from: classes4.dex */
public final class DateFormatter {
    private static final String[] CALENDAR_MONTH_TO_SHORT_NAME;
    private static final String[] DAY_OF_WEEK_TO_SHORT_NAME;
    private static final BitSet DELIMITERS;
    private static final FastThreadLocal<DateFormatter> INSTANCES;
    private final GregorianCalendar cal;
    private int dayOfMonth;
    private boolean dayOfMonthFound;
    private int hours;
    private int minutes;
    private int month;
    private boolean monthFound;
    private final StringBuilder sb;
    private int seconds;
    private boolean timeFound;
    private int year;
    private boolean yearFound;

    private static int getNumericalValue(char c) {
        return c - '0';
    }

    private static boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }

    static {
        BitSet bitSet = new BitSet();
        DELIMITERS = bitSet;
        bitSet.set(9);
        for (char c = ' '; c <= '/'; c = (char) (c + 1)) {
            DELIMITERS.set(c);
        }
        for (char c2 = ';'; c2 <= '@'; c2 = (char) (c2 + 1)) {
            DELIMITERS.set(c2);
        }
        for (char c3 = AbstractJsonLexerKt.BEGIN_LIST; c3 <= '`'; c3 = (char) (c3 + 1)) {
            DELIMITERS.set(c3);
        }
        for (char c4 = AbstractJsonLexerKt.BEGIN_OBJ; c4 <= '~'; c4 = (char) (c4 + 1)) {
            DELIMITERS.set(c4);
        }
        DAY_OF_WEEK_TO_SHORT_NAME = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        CALENDAR_MONTH_TO_SHORT_NAME = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        INSTANCES = new FastThreadLocal<DateFormatter>() { // from class: io.grpc.netty.shaded.io.netty.handler.codec.DateFormatter.1
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // io.grpc.netty.shaded.io.netty.util.concurrent.FastThreadLocal
            public DateFormatter initialValue() {
                return new DateFormatter();
            }
        };
    }

    public static Date parseHttpDate(CharSequence charSequence) {
        return parseHttpDate(charSequence, 0, charSequence.length());
    }

    public static Date parseHttpDate(CharSequence charSequence, int i, int i2) {
        int i3 = i2 - i;
        if (i3 == 0) {
            return null;
        }
        if (i3 >= 0) {
            if (i3 > 64) {
                throw new IllegalArgumentException("Can't parse more than 64 chars,looks like a user error or a malformed header");
            }
            return formatter().parse0((CharSequence) ObjectUtil.checkNotNull(charSequence, "txt"), i, i2);
        }
        throw new IllegalArgumentException("Can't have end < start");
    }

    public static String format(Date date) {
        return formatter().format0((Date) ObjectUtil.checkNotNull(date, "date"));
    }

    public static StringBuilder append(Date date, StringBuilder sb) {
        return formatter().append0((Date) ObjectUtil.checkNotNull(date, "date"), (StringBuilder) ObjectUtil.checkNotNull(sb, "sb"));
    }

    private static DateFormatter formatter() {
        DateFormatter dateFormatter = INSTANCES.get();
        dateFormatter.reset();
        return dateFormatter;
    }

    private static boolean isDelim(char c) {
        return DELIMITERS.get(c);
    }

    private DateFormatter() {
        this.cal = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        this.sb = new StringBuilder(29);
        reset();
    }

    public void reset() {
        this.timeFound = false;
        this.hours = -1;
        this.minutes = -1;
        this.seconds = -1;
        this.dayOfMonthFound = false;
        this.dayOfMonth = -1;
        this.monthFound = false;
        this.month = -1;
        this.yearFound = false;
        this.year = -1;
        this.cal.clear();
        this.sb.setLength(0);
    }

    private boolean tryParseTime(CharSequence charSequence, int i, int i2) {
        int i3 = i2 - i;
        if (i3 >= 5 && i3 <= 8) {
            int i4 = -1;
            int i5 = -1;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (i < i2) {
                char charAt = charSequence.charAt(i);
                if (isDigit(charAt)) {
                    i7 = (i7 * 10) + getNumericalValue(charAt);
                    i6++;
                    if (i6 > 2) {
                        return false;
                    }
                } else if (charAt != ':' || i6 == 0) {
                    return false;
                } else {
                    if (i8 != 0) {
                        if (i8 != 1) {
                            return false;
                        }
                        i5 = i7;
                        i7 = i4;
                    }
                    i8++;
                    i6 = 0;
                    i4 = i7;
                    i7 = 0;
                }
                i++;
            }
            int i9 = i6 > 0 ? i7 : -1;
            if (i4 >= 0 && i5 >= 0 && i9 >= 0) {
                this.hours = i4;
                this.minutes = i5;
                this.seconds = i9;
                return true;
            }
        }
        return false;
    }

    private boolean tryParseDayOfMonth(CharSequence charSequence, int i, int i2) {
        int i3 = i2 - i;
        if (i3 == 1) {
            char charAt = charSequence.charAt(i);
            if (isDigit(charAt)) {
                this.dayOfMonth = getNumericalValue(charAt);
                return true;
            }
            return false;
        } else if (i3 == 2) {
            char charAt2 = charSequence.charAt(i);
            char charAt3 = charSequence.charAt(i + 1);
            if (isDigit(charAt2) && isDigit(charAt3)) {
                this.dayOfMonth = (getNumericalValue(charAt2) * 10) + getNumericalValue(charAt3);
                return true;
            }
            return false;
        } else {
            return false;
        }
    }

    private boolean tryParseMonth(CharSequence charSequence, int i, int i2) {
        if (i2 - i != 3) {
            return false;
        }
        char lowerCase = AsciiString.toLowerCase(charSequence.charAt(i));
        char lowerCase2 = AsciiString.toLowerCase(charSequence.charAt(i + 1));
        char lowerCase3 = AsciiString.toLowerCase(charSequence.charAt(i + 2));
        if (lowerCase == 'j' && lowerCase2 == 'a' && lowerCase3 == 'n') {
            this.month = 0;
        } else if (lowerCase == 'f' && lowerCase2 == 'e' && lowerCase3 == 'b') {
            this.month = 1;
        } else if (lowerCase == 'm' && lowerCase2 == 'a' && lowerCase3 == 'r') {
            this.month = 2;
        } else if (lowerCase == 'a' && lowerCase2 == 'p' && lowerCase3 == 'r') {
            this.month = 3;
        } else if (lowerCase == 'm' && lowerCase2 == 'a' && lowerCase3 == 'y') {
            this.month = 4;
        } else if (lowerCase == 'j' && lowerCase2 == 'u' && lowerCase3 == 'n') {
            this.month = 5;
        } else if (lowerCase == 'j' && lowerCase2 == 'u' && lowerCase3 == 'l') {
            this.month = 6;
        } else if (lowerCase == 'a' && lowerCase2 == 'u' && lowerCase3 == 'g') {
            this.month = 7;
        } else if (lowerCase == 's' && lowerCase2 == 'e' && lowerCase3 == 'p') {
            this.month = 8;
        } else if (lowerCase == 'o' && lowerCase2 == 'c' && lowerCase3 == 't') {
            this.month = 9;
        } else if (lowerCase == 'n' && lowerCase2 == 'o' && lowerCase3 == 'v') {
            this.month = 10;
        } else if (lowerCase != 'd' || lowerCase2 != 'e' || lowerCase3 != 'c') {
            return false;
        } else {
            this.month = 11;
        }
        return true;
    }

    private boolean tryParseYear(CharSequence charSequence, int i, int i2) {
        int i3 = i2 - i;
        if (i3 == 2) {
            char charAt = charSequence.charAt(i);
            char charAt2 = charSequence.charAt(i + 1);
            if (isDigit(charAt) && isDigit(charAt2)) {
                this.year = (getNumericalValue(charAt) * 10) + getNumericalValue(charAt2);
                return true;
            }
            return false;
        } else if (i3 == 4) {
            char charAt3 = charSequence.charAt(i);
            char charAt4 = charSequence.charAt(i + 1);
            char charAt5 = charSequence.charAt(i + 2);
            char charAt6 = charSequence.charAt(i + 3);
            if (isDigit(charAt3) && isDigit(charAt4) && isDigit(charAt5) && isDigit(charAt6)) {
                this.year = (getNumericalValue(charAt3) * 1000) + (getNumericalValue(charAt4) * 100) + (getNumericalValue(charAt5) * 10) + getNumericalValue(charAt6);
                return true;
            }
            return false;
        } else {
            return false;
        }
    }

    private boolean parseToken(CharSequence charSequence, int i, int i2) {
        if (!this.timeFound) {
            boolean tryParseTime = tryParseTime(charSequence, i, i2);
            this.timeFound = tryParseTime;
            if (tryParseTime) {
                return this.dayOfMonthFound && this.monthFound && this.yearFound;
            }
        }
        if (!this.dayOfMonthFound) {
            boolean tryParseDayOfMonth = tryParseDayOfMonth(charSequence, i, i2);
            this.dayOfMonthFound = tryParseDayOfMonth;
            if (tryParseDayOfMonth) {
                return this.timeFound && this.monthFound && this.yearFound;
            }
        }
        if (!this.monthFound) {
            boolean tryParseMonth = tryParseMonth(charSequence, i, i2);
            this.monthFound = tryParseMonth;
            if (tryParseMonth) {
                return this.timeFound && this.dayOfMonthFound && this.yearFound;
            }
        }
        if (!this.yearFound) {
            this.yearFound = tryParseYear(charSequence, i, i2);
        }
        return this.timeFound && this.dayOfMonthFound && this.monthFound && this.yearFound;
    }

    private Date parse0(CharSequence charSequence, int i, int i2) {
        if (parse1(charSequence, i, i2) && normalizeAndValidate()) {
            return computeDate();
        }
        return null;
    }

    private boolean parse1(CharSequence charSequence, int i, int i2) {
        int i3 = -1;
        while (i < i2) {
            if (isDelim(charSequence.charAt(i))) {
                if (i3 == -1) {
                    continue;
                } else if (parseToken(charSequence, i3, i)) {
                    return true;
                } else {
                    i3 = -1;
                }
            } else if (i3 == -1) {
                i3 = i;
            }
            i++;
        }
        return i3 != -1 && parseToken(charSequence, i3, charSequence.length());
    }

    private boolean normalizeAndValidate() {
        int i = this.dayOfMonth;
        if (i < 1 || i > 31 || this.hours > 23 || this.minutes > 59 || this.seconds > 59) {
            return false;
        }
        int i2 = this.year;
        if (i2 >= 70 && i2 <= 99) {
            this.year = i2 + 1900;
        } else if (i2 >= 0 && i2 < 70) {
            this.year = i2 + 2000;
        } else if (i2 < 1601) {
            return false;
        }
        return true;
    }

    private Date computeDate() {
        this.cal.set(5, this.dayOfMonth);
        this.cal.set(2, this.month);
        this.cal.set(1, this.year);
        this.cal.set(11, this.hours);
        this.cal.set(12, this.minutes);
        this.cal.set(13, this.seconds);
        return this.cal.getTime();
    }

    private String format0(Date date) {
        append0(date, this.sb);
        return this.sb.toString();
    }

    private StringBuilder append0(Date date, StringBuilder sb) {
        this.cal.setTime(date);
        sb.append(DAY_OF_WEEK_TO_SHORT_NAME[this.cal.get(7) - 1]);
        sb.append(", ");
        appendZeroLeftPadded(this.cal.get(5), sb).append(' ');
        sb.append(CALENDAR_MONTH_TO_SHORT_NAME[this.cal.get(2)]);
        sb.append(' ');
        sb.append(this.cal.get(1));
        sb.append(' ');
        appendZeroLeftPadded(this.cal.get(11), sb).append(AbstractJsonLexerKt.COLON);
        appendZeroLeftPadded(this.cal.get(12), sb).append(AbstractJsonLexerKt.COLON);
        StringBuilder appendZeroLeftPadded = appendZeroLeftPadded(this.cal.get(13), sb);
        appendZeroLeftPadded.append(" GMT");
        return appendZeroLeftPadded;
    }

    private static StringBuilder appendZeroLeftPadded(int i, StringBuilder sb) {
        if (i < 10) {
            sb.append('0');
        }
        sb.append(i);
        return sb;
    }
}
