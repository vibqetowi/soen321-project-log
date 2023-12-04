package org.threeten.bp.chrono;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.internal.AnalyticsEvents;
import io.grpc.netty.shaded.io.netty.handler.codec.rtsp.RtspHeaders;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.threeten.bp.Clock;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.DayOfWeek;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import org.threeten.bp.ZoneId;
import org.threeten.bp.format.ResolverStyle;
import org.threeten.bp.jdk8.Jdk8Methods;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.TemporalAccessor;
import org.threeten.bp.temporal.TemporalAdjusters;
import org.threeten.bp.temporal.TemporalField;
import org.threeten.bp.temporal.TemporalUnit;
import org.threeten.bp.temporal.ValueRange;
/* loaded from: classes5.dex */
public final class JapaneseChronology extends Chronology implements Serializable {
    private static final Map<String, String[]> ERA_FULL_NAMES;
    private static final Map<String, String[]> ERA_NARROW_NAMES;
    private static final Map<String, String[]> ERA_SHORT_NAMES;
    private static final String FALLBACK_LANGUAGE = "en";
    private static final long serialVersionUID = 459996390165777884L;
    private static final String TARGET_LANGUAGE = "ja";
    static final Locale LOCALE = new Locale(TARGET_LANGUAGE, "JP", "JP");
    public static final JapaneseChronology INSTANCE = new JapaneseChronology();

    @Override // org.threeten.bp.chrono.Chronology
    public String getCalendarType() {
        return "japanese";
    }

    @Override // org.threeten.bp.chrono.Chronology
    public String getId() {
        return "Japanese";
    }

    @Override // org.threeten.bp.chrono.Chronology
    public /* bridge */ /* synthetic */ ChronoLocalDate resolveDate(Map map, ResolverStyle resolverStyle) {
        return resolveDate((Map<TemporalField, Long>) map, resolverStyle);
    }

    static {
        HashMap hashMap = new HashMap();
        ERA_NARROW_NAMES = hashMap;
        HashMap hashMap2 = new HashMap();
        ERA_SHORT_NAMES = hashMap2;
        HashMap hashMap3 = new HashMap();
        ERA_FULL_NAMES = hashMap3;
        hashMap.put(FALLBACK_LANGUAGE, new String[]{AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN, "K", "M", ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.LATITUDE_SOUTH, "H"});
        hashMap.put(TARGET_LANGUAGE, new String[]{AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN, "K", "M", ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.LATITUDE_SOUTH, "H"});
        hashMap2.put(FALLBACK_LANGUAGE, new String[]{AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN, "K", "M", ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.LATITUDE_SOUTH, "H"});
        hashMap2.put(TARGET_LANGUAGE, new String[]{AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN, "慶", "明", "大", "昭", "平"});
        hashMap3.put(FALLBACK_LANGUAGE, new String[]{AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN, "Keio", "Meiji", "Taisho", "Showa", "Heisei"});
        hashMap3.put(TARGET_LANGUAGE, new String[]{AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN, "慶応", "明治", "大正", "昭和", "平成"});
    }

    private JapaneseChronology() {
    }

    private Object readResolve() {
        return INSTANCE;
    }

    @Override // org.threeten.bp.chrono.Chronology
    public JapaneseDate date(Era era, int i, int i2, int i3) {
        if (!(era instanceof JapaneseEra)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        return JapaneseDate.of((JapaneseEra) era, i, i2, i3);
    }

    @Override // org.threeten.bp.chrono.Chronology
    public JapaneseDate date(int i, int i2, int i3) {
        return new JapaneseDate(LocalDate.of(i, i2, i3));
    }

    @Override // org.threeten.bp.chrono.Chronology
    public JapaneseDate dateYearDay(Era era, int i, int i2) {
        if (!(era instanceof JapaneseEra)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        return JapaneseDate.ofYearDay((JapaneseEra) era, i, i2);
    }

    @Override // org.threeten.bp.chrono.Chronology
    public JapaneseDate dateYearDay(int i, int i2) {
        LocalDate ofYearDay = LocalDate.ofYearDay(i, i2);
        return date(i, ofYearDay.getMonthValue(), ofYearDay.getDayOfMonth());
    }

    @Override // org.threeten.bp.chrono.Chronology
    public JapaneseDate dateEpochDay(long j) {
        return new JapaneseDate(LocalDate.ofEpochDay(j));
    }

    @Override // org.threeten.bp.chrono.Chronology
    public JapaneseDate date(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof JapaneseDate) {
            return (JapaneseDate) temporalAccessor;
        }
        return new JapaneseDate(LocalDate.from(temporalAccessor));
    }

    @Override // org.threeten.bp.chrono.Chronology
    public ChronoLocalDateTime<JapaneseDate> localDateTime(TemporalAccessor temporalAccessor) {
        return super.localDateTime(temporalAccessor);
    }

    @Override // org.threeten.bp.chrono.Chronology
    public ChronoZonedDateTime<JapaneseDate> zonedDateTime(TemporalAccessor temporalAccessor) {
        return super.zonedDateTime(temporalAccessor);
    }

    @Override // org.threeten.bp.chrono.Chronology
    public ChronoZonedDateTime<JapaneseDate> zonedDateTime(Instant instant, ZoneId zoneId) {
        return super.zonedDateTime(instant, zoneId);
    }

    @Override // org.threeten.bp.chrono.Chronology
    public JapaneseDate dateNow() {
        return (JapaneseDate) super.dateNow();
    }

    @Override // org.threeten.bp.chrono.Chronology
    public JapaneseDate dateNow(ZoneId zoneId) {
        return (JapaneseDate) super.dateNow(zoneId);
    }

    @Override // org.threeten.bp.chrono.Chronology
    public JapaneseDate dateNow(Clock clock) {
        Jdk8Methods.requireNonNull(clock, RtspHeaders.Values.CLOCK);
        return (JapaneseDate) super.dateNow(clock);
    }

    @Override // org.threeten.bp.chrono.Chronology
    public boolean isLeapYear(long j) {
        return IsoChronology.INSTANCE.isLeapYear(j);
    }

    @Override // org.threeten.bp.chrono.Chronology
    public int prolepticYear(Era era, int i) {
        JapaneseEra japaneseEra;
        if (!(era instanceof JapaneseEra)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        int year = (((JapaneseEra) era).startDate().getYear() + i) - 1;
        ValueRange.of(1L, (japaneseEra.endDate().getYear() - japaneseEra.startDate().getYear()) + 1).checkValidValue(i, ChronoField.YEAR_OF_ERA);
        return year;
    }

    @Override // org.threeten.bp.chrono.Chronology
    public JapaneseEra eraOf(int i) {
        return JapaneseEra.of(i);
    }

    @Override // org.threeten.bp.chrono.Chronology
    public List<Era> eras() {
        return Arrays.asList(JapaneseEra.values());
    }

    @Override // org.threeten.bp.chrono.Chronology
    public ValueRange range(ChronoField chronoField) {
        switch (AnonymousClass1.$SwitchMap$org$threeten$bp$temporal$ChronoField[chronoField.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                return chronoField.range();
            default:
                Calendar calendar = Calendar.getInstance(LOCALE);
                int i = 0;
                switch (chronoField) {
                    case ERA:
                        JapaneseEra[] values = JapaneseEra.values();
                        return ValueRange.of(values[0].getValue(), values[values.length - 1].getValue());
                    case YEAR:
                        JapaneseEra[] values2 = JapaneseEra.values();
                        return ValueRange.of(JapaneseDate.MIN_DATE.getYear(), values2[values2.length - 1].endDate().getYear());
                    case YEAR_OF_ERA:
                        JapaneseEra[] values3 = JapaneseEra.values();
                        int year = (values3[values3.length - 1].endDate().getYear() - values3[values3.length - 1].startDate().getYear()) + 1;
                        int i2 = Integer.MAX_VALUE;
                        while (i < values3.length) {
                            i2 = Math.min(i2, (values3[i].endDate().getYear() - values3[i].startDate().getYear()) + 1);
                            i++;
                        }
                        return ValueRange.of(1L, 6L, i2, year);
                    case MONTH_OF_YEAR:
                        return ValueRange.of(calendar.getMinimum(2) + 1, calendar.getGreatestMinimum(2) + 1, calendar.getLeastMaximum(2) + 1, calendar.getMaximum(2) + 1);
                    case DAY_OF_YEAR:
                        JapaneseEra[] values4 = JapaneseEra.values();
                        int i3 = 366;
                        while (i < values4.length) {
                            i3 = Math.min(i3, (values4[i].startDate().lengthOfYear() - values4[i].startDate().getDayOfYear()) + 1);
                            i++;
                        }
                        return ValueRange.of(1L, i3, 366L);
                    default:
                        throw new UnsupportedOperationException("Unimplementable field: " + chronoField);
                }
        }
    }

    /* JADX WARN: Type inference failed for: r9v17, types: [org.threeten.bp.chrono.JapaneseDate] */
    /* JADX WARN: Type inference failed for: r9v32, types: [org.threeten.bp.chrono.JapaneseDate] */
    /* JADX WARN: Type inference failed for: r9v68, types: [org.threeten.bp.chrono.JapaneseDate] */
    @Override // org.threeten.bp.chrono.Chronology
    public JapaneseDate resolveDate(Map<TemporalField, Long> map, ResolverStyle resolverStyle) {
        if (map.containsKey(ChronoField.EPOCH_DAY)) {
            return dateEpochDay(map.remove(ChronoField.EPOCH_DAY).longValue());
        }
        Long remove = map.remove(ChronoField.PROLEPTIC_MONTH);
        if (remove != null) {
            if (resolverStyle != ResolverStyle.LENIENT) {
                ChronoField.PROLEPTIC_MONTH.checkValidValue(remove.longValue());
            }
            updateResolveMap(map, ChronoField.MONTH_OF_YEAR, Jdk8Methods.floorMod(remove.longValue(), 12) + 1);
            updateResolveMap(map, ChronoField.YEAR, Jdk8Methods.floorDiv(remove.longValue(), 12L));
        }
        Long l = map.get(ChronoField.ERA);
        JapaneseEra eraOf = l != null ? eraOf(range(ChronoField.ERA).checkValidIntValue(l.longValue(), ChronoField.ERA)) : null;
        Long l2 = map.get(ChronoField.YEAR_OF_ERA);
        if (l2 != null) {
            int checkValidIntValue = range(ChronoField.YEAR_OF_ERA).checkValidIntValue(l2.longValue(), ChronoField.YEAR_OF_ERA);
            if (eraOf == null && resolverStyle != ResolverStyle.STRICT && !map.containsKey(ChronoField.YEAR)) {
                List<Era> eras = eras();
                eraOf = (JapaneseEra) eras.get(eras.size() - 1);
            }
            if (eraOf != null && map.containsKey(ChronoField.MONTH_OF_YEAR) && map.containsKey(ChronoField.DAY_OF_MONTH)) {
                map.remove(ChronoField.ERA);
                map.remove(ChronoField.YEAR_OF_ERA);
                return resolveEYMD(map, resolverStyle, eraOf, checkValidIntValue);
            } else if (eraOf != null && map.containsKey(ChronoField.DAY_OF_YEAR)) {
                map.remove(ChronoField.ERA);
                map.remove(ChronoField.YEAR_OF_ERA);
                return resolveEYD(map, resolverStyle, eraOf, checkValidIntValue);
            }
        }
        if (map.containsKey(ChronoField.YEAR)) {
            if (map.containsKey(ChronoField.MONTH_OF_YEAR)) {
                if (map.containsKey(ChronoField.DAY_OF_MONTH)) {
                    int checkValidIntValue2 = ChronoField.YEAR.checkValidIntValue(map.remove(ChronoField.YEAR).longValue());
                    if (resolverStyle == ResolverStyle.LENIENT) {
                        return date(checkValidIntValue2, 1, 1).plusMonths(Jdk8Methods.safeSubtract(map.remove(ChronoField.MONTH_OF_YEAR).longValue(), 1L)).plusDays(Jdk8Methods.safeSubtract(map.remove(ChronoField.DAY_OF_MONTH).longValue(), 1L));
                    }
                    int checkValidIntValue3 = range(ChronoField.MONTH_OF_YEAR).checkValidIntValue(map.remove(ChronoField.MONTH_OF_YEAR).longValue(), ChronoField.MONTH_OF_YEAR);
                    int checkValidIntValue4 = range(ChronoField.DAY_OF_MONTH).checkValidIntValue(map.remove(ChronoField.DAY_OF_MONTH).longValue(), ChronoField.DAY_OF_MONTH);
                    if (resolverStyle == ResolverStyle.SMART && checkValidIntValue4 > 28) {
                        checkValidIntValue4 = Math.min(checkValidIntValue4, date(checkValidIntValue2, checkValidIntValue3, 1).lengthOfMonth());
                    }
                    return date(checkValidIntValue2, checkValidIntValue3, checkValidIntValue4);
                } else if (map.containsKey(ChronoField.ALIGNED_WEEK_OF_MONTH)) {
                    if (map.containsKey(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH)) {
                        int checkValidIntValue5 = ChronoField.YEAR.checkValidIntValue(map.remove(ChronoField.YEAR).longValue());
                        if (resolverStyle == ResolverStyle.LENIENT) {
                            long safeSubtract = Jdk8Methods.safeSubtract(map.remove(ChronoField.MONTH_OF_YEAR).longValue(), 1L);
                            return date(checkValidIntValue5, 1, 1).plus(safeSubtract, (TemporalUnit) ChronoUnit.MONTHS).plus(Jdk8Methods.safeSubtract(map.remove(ChronoField.ALIGNED_WEEK_OF_MONTH).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).plus(Jdk8Methods.safeSubtract(map.remove(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
                        }
                        int checkValidIntValue6 = ChronoField.MONTH_OF_YEAR.checkValidIntValue(map.remove(ChronoField.MONTH_OF_YEAR).longValue());
                        JapaneseDate plus = date(checkValidIntValue5, checkValidIntValue6, 1).plus(((ChronoField.ALIGNED_WEEK_OF_MONTH.checkValidIntValue(map.remove(ChronoField.ALIGNED_WEEK_OF_MONTH).longValue()) - 1) * 7) + (ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH.checkValidIntValue(map.remove(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH).longValue()) - 1), (TemporalUnit) ChronoUnit.DAYS);
                        if (resolverStyle != ResolverStyle.STRICT || plus.get(ChronoField.MONTH_OF_YEAR) == checkValidIntValue6) {
                            return plus;
                        }
                        throw new DateTimeException("Strict mode rejected date parsed to a different month");
                    } else if (map.containsKey(ChronoField.DAY_OF_WEEK)) {
                        int checkValidIntValue7 = ChronoField.YEAR.checkValidIntValue(map.remove(ChronoField.YEAR).longValue());
                        if (resolverStyle == ResolverStyle.LENIENT) {
                            long safeSubtract2 = Jdk8Methods.safeSubtract(map.remove(ChronoField.MONTH_OF_YEAR).longValue(), 1L);
                            return date(checkValidIntValue7, 1, 1).plus(safeSubtract2, (TemporalUnit) ChronoUnit.MONTHS).plus(Jdk8Methods.safeSubtract(map.remove(ChronoField.ALIGNED_WEEK_OF_MONTH).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).plus(Jdk8Methods.safeSubtract(map.remove(ChronoField.DAY_OF_WEEK).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
                        }
                        int checkValidIntValue8 = ChronoField.MONTH_OF_YEAR.checkValidIntValue(map.remove(ChronoField.MONTH_OF_YEAR).longValue());
                        JapaneseDate with = date(checkValidIntValue7, checkValidIntValue8, 1).plus(ChronoField.ALIGNED_WEEK_OF_MONTH.checkValidIntValue(map.remove(ChronoField.ALIGNED_WEEK_OF_MONTH).longValue()) - 1, (TemporalUnit) ChronoUnit.WEEKS).with(TemporalAdjusters.nextOrSame(DayOfWeek.of(ChronoField.DAY_OF_WEEK.checkValidIntValue(map.remove(ChronoField.DAY_OF_WEEK).longValue()))));
                        if (resolverStyle != ResolverStyle.STRICT || with.get(ChronoField.MONTH_OF_YEAR) == checkValidIntValue8) {
                            return with;
                        }
                        throw new DateTimeException("Strict mode rejected date parsed to a different month");
                    }
                }
            }
            if (map.containsKey(ChronoField.DAY_OF_YEAR)) {
                int checkValidIntValue9 = ChronoField.YEAR.checkValidIntValue(map.remove(ChronoField.YEAR).longValue());
                if (resolverStyle == ResolverStyle.LENIENT) {
                    return dateYearDay(checkValidIntValue9, 1).plusDays(Jdk8Methods.safeSubtract(map.remove(ChronoField.DAY_OF_YEAR).longValue(), 1L));
                }
                return dateYearDay(checkValidIntValue9, ChronoField.DAY_OF_YEAR.checkValidIntValue(map.remove(ChronoField.DAY_OF_YEAR).longValue()));
            } else if (map.containsKey(ChronoField.ALIGNED_WEEK_OF_YEAR)) {
                if (map.containsKey(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR)) {
                    int checkValidIntValue10 = ChronoField.YEAR.checkValidIntValue(map.remove(ChronoField.YEAR).longValue());
                    if (resolverStyle == ResolverStyle.LENIENT) {
                        return date(checkValidIntValue10, 1, 1).plus(Jdk8Methods.safeSubtract(map.remove(ChronoField.ALIGNED_WEEK_OF_YEAR).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).plus(Jdk8Methods.safeSubtract(map.remove(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
                    }
                    ?? plusDays = date(checkValidIntValue10, 1, 1).plusDays(((ChronoField.ALIGNED_WEEK_OF_YEAR.checkValidIntValue(map.remove(ChronoField.ALIGNED_WEEK_OF_YEAR).longValue()) - 1) * 7) + (ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR.checkValidIntValue(map.remove(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR).longValue()) - 1));
                    if (resolverStyle != ResolverStyle.STRICT || plusDays.get(ChronoField.YEAR) == checkValidIntValue10) {
                        return plusDays;
                    }
                    throw new DateTimeException("Strict mode rejected date parsed to a different year");
                } else if (map.containsKey(ChronoField.DAY_OF_WEEK)) {
                    int checkValidIntValue11 = ChronoField.YEAR.checkValidIntValue(map.remove(ChronoField.YEAR).longValue());
                    if (resolverStyle == ResolverStyle.LENIENT) {
                        return date(checkValidIntValue11, 1, 1).plus(Jdk8Methods.safeSubtract(map.remove(ChronoField.ALIGNED_WEEK_OF_YEAR).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).plus(Jdk8Methods.safeSubtract(map.remove(ChronoField.DAY_OF_WEEK).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
                    }
                    JapaneseDate with2 = date(checkValidIntValue11, 1, 1).plus(ChronoField.ALIGNED_WEEK_OF_YEAR.checkValidIntValue(map.remove(ChronoField.ALIGNED_WEEK_OF_YEAR).longValue()) - 1, (TemporalUnit) ChronoUnit.WEEKS).with(TemporalAdjusters.nextOrSame(DayOfWeek.of(ChronoField.DAY_OF_WEEK.checkValidIntValue(map.remove(ChronoField.DAY_OF_WEEK).longValue()))));
                    if (resolverStyle != ResolverStyle.STRICT || with2.get(ChronoField.YEAR) == checkValidIntValue11) {
                        return with2;
                    }
                    throw new DateTimeException("Strict mode rejected date parsed to a different month");
                }
            }
        }
        return null;
    }

    private JapaneseDate resolveEYMD(Map<TemporalField, Long> map, ResolverStyle resolverStyle, JapaneseEra japaneseEra, int i) {
        if (resolverStyle == ResolverStyle.LENIENT) {
            long safeSubtract = Jdk8Methods.safeSubtract(map.remove(ChronoField.MONTH_OF_YEAR).longValue(), 1L);
            return date((japaneseEra.startDate().getYear() + i) - 1, 1, 1).plus(safeSubtract, (TemporalUnit) ChronoUnit.MONTHS).plus(Jdk8Methods.safeSubtract(map.remove(ChronoField.DAY_OF_MONTH).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
        }
        int checkValidIntValue = range(ChronoField.MONTH_OF_YEAR).checkValidIntValue(map.remove(ChronoField.MONTH_OF_YEAR).longValue(), ChronoField.MONTH_OF_YEAR);
        int checkValidIntValue2 = range(ChronoField.DAY_OF_MONTH).checkValidIntValue(map.remove(ChronoField.DAY_OF_MONTH).longValue(), ChronoField.DAY_OF_MONTH);
        if (resolverStyle == ResolverStyle.SMART) {
            if (i < 1) {
                throw new DateTimeException("Invalid YearOfEra: " + i);
            }
            int year = (japaneseEra.startDate().getYear() + i) - 1;
            if (checkValidIntValue2 > 28) {
                checkValidIntValue2 = Math.min(checkValidIntValue2, date(year, checkValidIntValue, 1).lengthOfMonth());
            }
            JapaneseDate date = date(year, checkValidIntValue, checkValidIntValue2);
            if (date.getEra() != japaneseEra) {
                if (Math.abs(date.getEra().getValue() - japaneseEra.getValue()) > 1) {
                    throw new DateTimeException("Invalid Era/YearOfEra: " + japaneseEra + " " + i);
                } else if (date.get(ChronoField.YEAR_OF_ERA) != 1 && i != 1) {
                    throw new DateTimeException("Invalid Era/YearOfEra: " + japaneseEra + " " + i);
                }
            }
            return date;
        }
        return date((Era) japaneseEra, i, checkValidIntValue, checkValidIntValue2);
    }

    private JapaneseDate resolveEYD(Map<TemporalField, Long> map, ResolverStyle resolverStyle, JapaneseEra japaneseEra, int i) {
        if (resolverStyle == ResolverStyle.LENIENT) {
            return dateYearDay((japaneseEra.startDate().getYear() + i) - 1, 1).plus(Jdk8Methods.safeSubtract(map.remove(ChronoField.DAY_OF_YEAR).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
        }
        return dateYearDay((Era) japaneseEra, i, range(ChronoField.DAY_OF_YEAR).checkValidIntValue(map.remove(ChronoField.DAY_OF_YEAR).longValue(), ChronoField.DAY_OF_YEAR));
    }
}
