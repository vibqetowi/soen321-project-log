package org.threeten.bp;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import org.apache.commons.lang3.time.TimeZones;
/* loaded from: classes5.dex */
public final class DateTimeUtils {
    private DateTimeUtils() {
    }

    public static Instant toInstant(Date date) {
        return Instant.ofEpochMilli(date.getTime());
    }

    public static Date toDate(Instant instant) {
        try {
            return new Date(instant.toEpochMilli());
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static Instant toInstant(Calendar calendar) {
        return Instant.ofEpochMilli(calendar.getTimeInMillis());
    }

    public static ZonedDateTime toZonedDateTime(Calendar calendar) {
        return ZonedDateTime.ofInstant(Instant.ofEpochMilli(calendar.getTimeInMillis()), toZoneId(calendar.getTimeZone()));
    }

    public static GregorianCalendar toGregorianCalendar(ZonedDateTime zonedDateTime) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(toTimeZone(zonedDateTime.getZone()));
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        gregorianCalendar.setFirstDayOfWeek(2);
        gregorianCalendar.setMinimalDaysInFirstWeek(4);
        try {
            gregorianCalendar.setTimeInMillis(zonedDateTime.toInstant().toEpochMilli());
            return gregorianCalendar;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static ZoneId toZoneId(TimeZone timeZone) {
        return ZoneId.of(timeZone.getID(), ZoneId.SHORT_IDS);
    }

    public static TimeZone toTimeZone(ZoneId zoneId) {
        String id = zoneId.getId();
        if (id.startsWith("+") || id.startsWith("-")) {
            id = TimeZones.GMT_ID + id;
        } else if (id.equals("Z")) {
            id = "UTC";
        }
        return TimeZone.getTimeZone(id);
    }

    public static LocalDate toLocalDate(java.sql.Date date) {
        return LocalDate.of(date.getYear() + 1900, date.getMonth() + 1, date.getDate());
    }

    public static java.sql.Date toSqlDate(LocalDate localDate) {
        return new java.sql.Date(localDate.getYear() - 1900, localDate.getMonthValue() - 1, localDate.getDayOfMonth());
    }

    public static LocalTime toLocalTime(Time time) {
        return LocalTime.of(time.getHours(), time.getMinutes(), time.getSeconds());
    }

    public static Time toSqlTime(LocalTime localTime) {
        return new Time(localTime.getHour(), localTime.getMinute(), localTime.getSecond());
    }

    public static Timestamp toSqlTimestamp(LocalDateTime localDateTime) {
        return new Timestamp(localDateTime.getYear() - 1900, localDateTime.getMonthValue() - 1, localDateTime.getDayOfMonth(), localDateTime.getHour(), localDateTime.getMinute(), localDateTime.getSecond(), localDateTime.getNano());
    }

    public static LocalDateTime toLocalDateTime(Timestamp timestamp) {
        return LocalDateTime.of(timestamp.getYear() + 1900, timestamp.getMonth() + 1, timestamp.getDate(), timestamp.getHours(), timestamp.getMinutes(), timestamp.getSeconds(), timestamp.getNanos());
    }

    public static Timestamp toSqlTimestamp(Instant instant) {
        try {
            Timestamp timestamp = new Timestamp(instant.getEpochSecond() * 1000);
            timestamp.setNanos(instant.getNano());
            return timestamp;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static Instant toInstant(Timestamp timestamp) {
        return Instant.ofEpochSecond(timestamp.getTime() / 1000, timestamp.getNanos());
    }
}
