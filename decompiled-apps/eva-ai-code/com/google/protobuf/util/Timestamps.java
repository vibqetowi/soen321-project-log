package com.google.protobuf.util;

import com.google.common.math.IntMath;
import com.google.common.math.LongMath;
import com.google.protobuf.Duration;
import com.google.protobuf.Timestamp;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import org.threeten.bp.Year;
/* loaded from: classes6.dex */
public final class Timestamps {
    static final long MICROS_PER_SECOND = 1000000;
    static final long MILLIS_PER_SECOND = 1000;
    static final long NANOS_PER_MICROSECOND = 1000;
    static final long NANOS_PER_MILLISECOND = 1000000;
    static final long NANOS_PER_SECOND = 1000000000;
    static final long TIMESTAMP_SECONDS_MAX = 253402300799L;
    static final long TIMESTAMP_SECONDS_MIN = -62135596800L;
    public static final Timestamp MIN_VALUE = Timestamp.newBuilder().setSeconds(-62135596800L).setNanos(0).build();
    public static final Timestamp MAX_VALUE = Timestamp.newBuilder().setSeconds(253402300799L).setNanos(Year.MAX_VALUE).build();
    public static final Timestamp EPOCH = Timestamp.newBuilder().setSeconds(0).setNanos(0).build();
    private static final ThreadLocal<SimpleDateFormat> timestampFormat = new ThreadLocal<SimpleDateFormat>() { // from class: com.google.protobuf.util.Timestamps.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public SimpleDateFormat initialValue() {
            return Timestamps.createTimestampFormat();
        }
    };

    public static boolean isValid(long j, int i) {
        return j >= -62135596800L && j <= 253402300799L && i >= 0 && ((long) i) < 1000000000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SimpleDateFormat createTimestampFormat() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        simpleDateFormat.setCalendar(gregorianCalendar);
        return simpleDateFormat;
    }

    private Timestamps() {
    }

    /* loaded from: classes6.dex */
    private enum TimestampComparator implements Comparator<Timestamp>, Serializable {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(Timestamp timestamp, Timestamp timestamp2) {
            Timestamps.checkValid(timestamp);
            Timestamps.checkValid(timestamp2);
            int compare = Long.compare(timestamp.getSeconds(), timestamp2.getSeconds());
            return compare != 0 ? compare : Integer.compare(timestamp.getNanos(), timestamp2.getNanos());
        }
    }

    public static Comparator<Timestamp> comparator() {
        return TimestampComparator.INSTANCE;
    }

    public static int compare(Timestamp timestamp, Timestamp timestamp2) {
        return TimestampComparator.INSTANCE.compare(timestamp, timestamp2);
    }

    public static boolean isValid(Timestamp timestamp) {
        return isValid(timestamp.getSeconds(), timestamp.getNanos());
    }

    public static Timestamp checkValid(Timestamp timestamp) {
        long seconds = timestamp.getSeconds();
        int nanos = timestamp.getNanos();
        if (isValid(seconds, nanos)) {
            return timestamp;
        }
        throw new IllegalArgumentException(String.format("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", Long.valueOf(seconds), Integer.valueOf(nanos)));
    }

    public static Timestamp checkValid(Timestamp.Builder builder) {
        return checkValid(builder.build());
    }

    public static String toString(Timestamp timestamp) {
        checkValid(timestamp);
        long seconds = timestamp.getSeconds();
        int nanos = timestamp.getNanos();
        StringBuilder sb = new StringBuilder();
        sb.append(timestampFormat.get().format(new Date(seconds * 1000)));
        if (nanos != 0) {
            sb.append(".");
            sb.append(formatNanos(nanos));
        }
        sb.append("Z");
        return sb.toString();
    }

    public static Timestamp parse(String str) throws ParseException {
        String str2;
        int indexOf = str.indexOf(84);
        if (indexOf == -1) {
            throw new ParseException("Failed to parse timestamp: invalid timestamp \"" + str + "\"", 0);
        }
        int indexOf2 = str.indexOf(90, indexOf);
        if (indexOf2 == -1) {
            indexOf2 = str.indexOf(43, indexOf);
        }
        if (indexOf2 == -1) {
            indexOf2 = str.indexOf(45, indexOf);
        }
        if (indexOf2 == -1) {
            throw new ParseException("Failed to parse timestamp: missing valid timezone offset.", 0);
        }
        String substring = str.substring(0, indexOf2);
        int indexOf3 = substring.indexOf(46);
        if (indexOf3 != -1) {
            String substring2 = substring.substring(0, indexOf3);
            str2 = substring.substring(indexOf3 + 1);
            substring = substring2;
        } else {
            str2 = "";
        }
        long time = timestampFormat.get().parse(substring).getTime() / 1000;
        int parseNanos = str2.isEmpty() ? 0 : parseNanos(str2);
        if (str.charAt(indexOf2) == 'Z') {
            if (str.length() != indexOf2 + 1) {
                throw new ParseException("Failed to parse timestamp: invalid trailing data \"" + str.substring(indexOf2) + "\"", 0);
            }
        } else {
            long parseTimezoneOffset = parseTimezoneOffset(str.substring(indexOf2 + 1));
            time = str.charAt(indexOf2) == '+' ? time - parseTimezoneOffset : time + parseTimezoneOffset;
        }
        try {
            return normalizedTimestamp(time, parseNanos);
        } catch (IllegalArgumentException unused) {
            throw new ParseException("Failed to parse timestamp: timestamp is out of range.", 0);
        }
    }

    public static Timestamp fromSeconds(long j) {
        return normalizedTimestamp(j, 0);
    }

    public static long toSeconds(Timestamp timestamp) {
        return checkValid(timestamp).getSeconds();
    }

    public static Timestamp fromMillis(long j) {
        return normalizedTimestamp(j / 1000, (int) ((j % 1000) * 1000000));
    }

    public static long toMillis(Timestamp timestamp) {
        checkValid(timestamp);
        return LongMath.checkedAdd(LongMath.checkedMultiply(timestamp.getSeconds(), 1000L), timestamp.getNanos() / 1000000);
    }

    public static Timestamp fromMicros(long j) {
        return normalizedTimestamp(j / 1000000, (int) ((j % 1000000) * 1000));
    }

    public static long toMicros(Timestamp timestamp) {
        checkValid(timestamp);
        return LongMath.checkedAdd(LongMath.checkedMultiply(timestamp.getSeconds(), 1000000L), timestamp.getNanos() / 1000);
    }

    public static Timestamp fromNanos(long j) {
        return normalizedTimestamp(j / 1000000000, (int) (j % 1000000000));
    }

    public static long toNanos(Timestamp timestamp) {
        checkValid(timestamp);
        return LongMath.checkedAdd(LongMath.checkedMultiply(timestamp.getSeconds(), 1000000000L), timestamp.getNanos());
    }

    public static Duration between(Timestamp timestamp, Timestamp timestamp2) {
        checkValid(timestamp);
        checkValid(timestamp2);
        return Durations.normalizedDuration(LongMath.checkedSubtract(timestamp2.getSeconds(), timestamp.getSeconds()), IntMath.checkedSubtract(timestamp2.getNanos(), timestamp.getNanos()));
    }

    public static Timestamp add(Timestamp timestamp, Duration duration) {
        checkValid(timestamp);
        Durations.checkValid(duration);
        return normalizedTimestamp(LongMath.checkedAdd(timestamp.getSeconds(), duration.getSeconds()), IntMath.checkedAdd(timestamp.getNanos(), duration.getNanos()));
    }

    public static Timestamp subtract(Timestamp timestamp, Duration duration) {
        checkValid(timestamp);
        Durations.checkValid(duration);
        return normalizedTimestamp(LongMath.checkedSubtract(timestamp.getSeconds(), duration.getSeconds()), IntMath.checkedSubtract(timestamp.getNanos(), duration.getNanos()));
    }

    static Timestamp normalizedTimestamp(long j, int i) {
        long j2 = i;
        if (j2 <= -1000000000 || j2 >= 1000000000) {
            j = LongMath.checkedAdd(j, j2 / 1000000000);
            i = (int) (j2 % 1000000000);
        }
        if (i < 0) {
            i = (int) (i + 1000000000);
            j = LongMath.checkedSubtract(j, 1L);
        }
        return checkValid(Timestamp.newBuilder().setSeconds(j).setNanos(i).build());
    }

    private static long parseTimezoneOffset(String str) throws ParseException {
        int indexOf = str.indexOf(58);
        if (indexOf == -1) {
            throw new ParseException("Invalid offset value: " + str, 0);
        }
        return ((Long.parseLong(str.substring(0, indexOf)) * 60) + Long.parseLong(str.substring(indexOf + 1))) * 60;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int parseNanos(String str) throws ParseException {
        int i = 0;
        for (int i2 = 0; i2 < 9; i2++) {
            i *= 10;
            if (i2 < str.length()) {
                if (str.charAt(i2) < '0' || str.charAt(i2) > '9') {
                    throw new ParseException("Invalid nanoseconds.", 0);
                }
                i += str.charAt(i2) - '0';
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String formatNanos(int i) {
        long j = i;
        return j % 1000000 == 0 ? String.format(Locale.ENGLISH, "%1$03d", Long.valueOf(j / 1000000)) : j % 1000 == 0 ? String.format(Locale.ENGLISH, "%1$06d", Long.valueOf(j / 1000)) : String.format(Locale.ENGLISH, "%1$09d", Integer.valueOf(i));
    }
}
