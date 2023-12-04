package org.threeten.bp.temporal;

import java.util.Locale;
import java.util.Map;
import org.threeten.bp.DayOfWeek;
import org.threeten.bp.Duration;
import org.threeten.bp.LocalDate;
import org.threeten.bp.chrono.Chronology;
import org.threeten.bp.chrono.IsoChronology;
import org.threeten.bp.format.ResolverStyle;
import org.threeten.bp.jdk8.Jdk8Methods;
/* loaded from: classes5.dex */
public final class IsoFields {
    public static final TemporalField DAY_OF_QUARTER = Field.DAY_OF_QUARTER;
    public static final TemporalField QUARTER_OF_YEAR = Field.QUARTER_OF_YEAR;
    public static final TemporalField WEEK_OF_WEEK_BASED_YEAR = Field.WEEK_OF_WEEK_BASED_YEAR;
    public static final TemporalField WEEK_BASED_YEAR = Field.WEEK_BASED_YEAR;
    public static final TemporalUnit WEEK_BASED_YEARS = Unit.WEEK_BASED_YEARS;
    public static final TemporalUnit QUARTER_YEARS = Unit.QUARTER_YEARS;

    private IsoFields() {
        throw new AssertionError("Not instantiable");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public enum Field implements TemporalField {
        DAY_OF_QUARTER { // from class: org.threeten.bp.temporal.IsoFields.Field.1
            @Override // java.lang.Enum
            public String toString() {
                return "DayOfQuarter";
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public TemporalUnit getBaseUnit() {
                return ChronoUnit.DAYS;
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public TemporalUnit getRangeUnit() {
                return IsoFields.QUARTER_YEARS;
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public ValueRange range() {
                return ValueRange.of(1L, 90L, 92L);
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public boolean isSupportedBy(TemporalAccessor temporalAccessor) {
                return temporalAccessor.isSupported(ChronoField.DAY_OF_YEAR) && temporalAccessor.isSupported(ChronoField.MONTH_OF_YEAR) && temporalAccessor.isSupported(ChronoField.YEAR) && Field.isIso(temporalAccessor);
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public ValueRange rangeRefinedBy(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.isSupported(this)) {
                    throw new UnsupportedTemporalTypeException("Unsupported field: DayOfQuarter");
                }
                long j = temporalAccessor.getLong(QUARTER_OF_YEAR);
                if (j == 1) {
                    return IsoChronology.INSTANCE.isLeapYear(temporalAccessor.getLong(ChronoField.YEAR)) ? ValueRange.of(1L, 91L) : ValueRange.of(1L, 90L);
                } else if (j == 2) {
                    return ValueRange.of(1L, 91L);
                } else {
                    if (j == 3 || j == 4) {
                        return ValueRange.of(1L, 92L);
                    }
                    return range();
                }
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public long getFrom(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.isSupported(this)) {
                    throw new UnsupportedTemporalTypeException("Unsupported field: DayOfQuarter");
                }
                return temporalAccessor.get(ChronoField.DAY_OF_YEAR) - Field.QUARTER_DAYS[((temporalAccessor.get(ChronoField.MONTH_OF_YEAR) - 1) / 3) + (IsoChronology.INSTANCE.isLeapYear(temporalAccessor.getLong(ChronoField.YEAR)) ? 4 : 0)];
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public <R extends Temporal> R adjustInto(R r, long j) {
                long from = getFrom(r);
                range().checkValidValue(j, this);
                return (R) r.with(ChronoField.DAY_OF_YEAR, r.getLong(ChronoField.DAY_OF_YEAR) + (j - from));
            }

            @Override // org.threeten.bp.temporal.IsoFields.Field, org.threeten.bp.temporal.TemporalField
            public TemporalAccessor resolve(Map<TemporalField, Long> map, TemporalAccessor temporalAccessor, ResolverStyle resolverStyle) {
                LocalDate plusDays;
                Long l = map.get(ChronoField.YEAR);
                Long l2 = map.get(QUARTER_OF_YEAR);
                if (l == null || l2 == null) {
                    return null;
                }
                int checkValidIntValue = ChronoField.YEAR.checkValidIntValue(l.longValue());
                long longValue = map.get(DAY_OF_QUARTER).longValue();
                if (resolverStyle == ResolverStyle.LENIENT) {
                    plusDays = LocalDate.of(checkValidIntValue, 1, 1).plusMonths(Jdk8Methods.safeMultiply(Jdk8Methods.safeSubtract(l2.longValue(), 1L), 3)).plusDays(Jdk8Methods.safeSubtract(longValue, 1L));
                } else {
                    int checkValidIntValue2 = QUARTER_OF_YEAR.range().checkValidIntValue(l2.longValue(), QUARTER_OF_YEAR);
                    if (resolverStyle == ResolverStyle.STRICT) {
                        int i = 91;
                        if (checkValidIntValue2 == 1) {
                            if (!IsoChronology.INSTANCE.isLeapYear(checkValidIntValue)) {
                                i = 90;
                            }
                        } else if (checkValidIntValue2 != 2) {
                            i = 92;
                        }
                        ValueRange.of(1L, i).checkValidValue(longValue, this);
                    } else {
                        range().checkValidValue(longValue, this);
                    }
                    plusDays = LocalDate.of(checkValidIntValue, ((checkValidIntValue2 - 1) * 3) + 1, 1).plusDays(longValue - 1);
                }
                map.remove(this);
                map.remove(ChronoField.YEAR);
                map.remove(QUARTER_OF_YEAR);
                return plusDays;
            }
        },
        QUARTER_OF_YEAR { // from class: org.threeten.bp.temporal.IsoFields.Field.2
            @Override // java.lang.Enum
            public String toString() {
                return "QuarterOfYear";
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public TemporalUnit getBaseUnit() {
                return IsoFields.QUARTER_YEARS;
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public TemporalUnit getRangeUnit() {
                return ChronoUnit.YEARS;
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public ValueRange range() {
                return ValueRange.of(1L, 4L);
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public boolean isSupportedBy(TemporalAccessor temporalAccessor) {
                return temporalAccessor.isSupported(ChronoField.MONTH_OF_YEAR) && Field.isIso(temporalAccessor);
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public ValueRange rangeRefinedBy(TemporalAccessor temporalAccessor) {
                return range();
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public long getFrom(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.isSupported(this)) {
                    throw new UnsupportedTemporalTypeException("Unsupported field: QuarterOfYear");
                }
                return (temporalAccessor.getLong(ChronoField.MONTH_OF_YEAR) + 2) / 3;
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public <R extends Temporal> R adjustInto(R r, long j) {
                long from = getFrom(r);
                range().checkValidValue(j, this);
                return (R) r.with(ChronoField.MONTH_OF_YEAR, r.getLong(ChronoField.MONTH_OF_YEAR) + ((j - from) * 3));
            }
        },
        WEEK_OF_WEEK_BASED_YEAR { // from class: org.threeten.bp.temporal.IsoFields.Field.3
            @Override // java.lang.Enum
            public String toString() {
                return "WeekOfWeekBasedYear";
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public TemporalUnit getBaseUnit() {
                return ChronoUnit.WEEKS;
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public TemporalUnit getRangeUnit() {
                return IsoFields.WEEK_BASED_YEARS;
            }

            @Override // org.threeten.bp.temporal.IsoFields.Field, org.threeten.bp.temporal.TemporalField
            public String getDisplayName(Locale locale) {
                Jdk8Methods.requireNonNull(locale, "locale");
                return "Week";
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public ValueRange range() {
                return ValueRange.of(1L, 52L, 53L);
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public boolean isSupportedBy(TemporalAccessor temporalAccessor) {
                return temporalAccessor.isSupported(ChronoField.EPOCH_DAY) && Field.isIso(temporalAccessor);
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public ValueRange rangeRefinedBy(TemporalAccessor temporalAccessor) {
                if (temporalAccessor.isSupported(this)) {
                    return Field.getWeekRange(LocalDate.from(temporalAccessor));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public long getFrom(TemporalAccessor temporalAccessor) {
                if (temporalAccessor.isSupported(this)) {
                    return Field.getWeek(LocalDate.from(temporalAccessor));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public <R extends Temporal> R adjustInto(R r, long j) {
                range().checkValidValue(j, this);
                return (R) r.plus(Jdk8Methods.safeSubtract(j, getFrom(r)), ChronoUnit.WEEKS);
            }

            @Override // org.threeten.bp.temporal.IsoFields.Field, org.threeten.bp.temporal.TemporalField
            public TemporalAccessor resolve(Map<TemporalField, Long> map, TemporalAccessor temporalAccessor, ResolverStyle resolverStyle) {
                LocalDate with;
                long j;
                Long l = map.get(WEEK_BASED_YEAR);
                Long l2 = map.get(ChronoField.DAY_OF_WEEK);
                if (l == null || l2 == null) {
                    return null;
                }
                int checkValidIntValue = WEEK_BASED_YEAR.range().checkValidIntValue(l.longValue(), WEEK_BASED_YEAR);
                long longValue = map.get(WEEK_OF_WEEK_BASED_YEAR).longValue();
                if (resolverStyle == ResolverStyle.LENIENT) {
                    long longValue2 = l2.longValue();
                    if (longValue2 > 7) {
                        long j2 = longValue2 - 1;
                        j = j2 / 7;
                        longValue2 = (j2 % 7) + 1;
                    } else if (longValue2 < 1) {
                        j = (longValue2 / 7) - 1;
                        longValue2 = (longValue2 % 7) + 7;
                    } else {
                        j = 0;
                    }
                    with = LocalDate.of(checkValidIntValue, 1, 4).plusWeeks(longValue - 1).plusWeeks(j).with((TemporalField) ChronoField.DAY_OF_WEEK, longValue2);
                } else {
                    int checkValidIntValue2 = ChronoField.DAY_OF_WEEK.checkValidIntValue(l2.longValue());
                    if (resolverStyle == ResolverStyle.STRICT) {
                        Field.getWeekRange(LocalDate.of(checkValidIntValue, 1, 4)).checkValidValue(longValue, this);
                    } else {
                        range().checkValidValue(longValue, this);
                    }
                    with = LocalDate.of(checkValidIntValue, 1, 4).plusWeeks(longValue - 1).with((TemporalField) ChronoField.DAY_OF_WEEK, checkValidIntValue2);
                }
                map.remove(this);
                map.remove(WEEK_BASED_YEAR);
                map.remove(ChronoField.DAY_OF_WEEK);
                return with;
            }
        },
        WEEK_BASED_YEAR { // from class: org.threeten.bp.temporal.IsoFields.Field.4
            @Override // java.lang.Enum
            public String toString() {
                return "WeekBasedYear";
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public TemporalUnit getBaseUnit() {
                return IsoFields.WEEK_BASED_YEARS;
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public TemporalUnit getRangeUnit() {
                return ChronoUnit.FOREVER;
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public ValueRange range() {
                return ChronoField.YEAR.range();
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public boolean isSupportedBy(TemporalAccessor temporalAccessor) {
                return temporalAccessor.isSupported(ChronoField.EPOCH_DAY) && Field.isIso(temporalAccessor);
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public ValueRange rangeRefinedBy(TemporalAccessor temporalAccessor) {
                return ChronoField.YEAR.range();
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public long getFrom(TemporalAccessor temporalAccessor) {
                if (temporalAccessor.isSupported(this)) {
                    return Field.getWeekBasedYear(LocalDate.from(temporalAccessor));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekBasedYear");
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public <R extends Temporal> R adjustInto(R r, long j) {
                LocalDate of;
                if (!isSupportedBy(r)) {
                    throw new UnsupportedTemporalTypeException("Unsupported field: WeekBasedYear");
                }
                int checkValidIntValue = range().checkValidIntValue(j, WEEK_BASED_YEAR);
                LocalDate from = LocalDate.from((TemporalAccessor) r);
                int i = from.get(ChronoField.DAY_OF_WEEK);
                int week = Field.getWeek(from);
                if (week == 53 && Field.getWeekRange(checkValidIntValue) == 52) {
                    week = 52;
                }
                return (R) r.with(LocalDate.of(checkValidIntValue, 1, 4).plusDays((i - of.get(ChronoField.DAY_OF_WEEK)) + ((week - 1) * 7)));
            }
        };
        
        private static final int[] QUARTER_DAYS = {0, 90, 181, 273, 0, 91, 182, 274};

        @Override // org.threeten.bp.temporal.TemporalField
        public boolean isDateBased() {
            return true;
        }

        @Override // org.threeten.bp.temporal.TemporalField
        public boolean isTimeBased() {
            return false;
        }

        @Override // org.threeten.bp.temporal.TemporalField
        public TemporalAccessor resolve(Map<TemporalField, Long> map, TemporalAccessor temporalAccessor, ResolverStyle resolverStyle) {
            return null;
        }

        /* synthetic */ Field(AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // org.threeten.bp.temporal.TemporalField
        public String getDisplayName(Locale locale) {
            Jdk8Methods.requireNonNull(locale, "locale");
            return toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isIso(TemporalAccessor temporalAccessor) {
            return Chronology.from(temporalAccessor).equals(IsoChronology.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static ValueRange getWeekRange(LocalDate localDate) {
            return ValueRange.of(1L, getWeekRange(getWeekBasedYear(localDate)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int getWeekRange(int i) {
            LocalDate of = LocalDate.of(i, 1, 1);
            if (of.getDayOfWeek() != DayOfWeek.THURSDAY) {
                return (of.getDayOfWeek() == DayOfWeek.WEDNESDAY && of.isLeapYear()) ? 53 : 52;
            }
            return 53;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int getWeek(LocalDate localDate) {
            int ordinal = localDate.getDayOfWeek().ordinal();
            int dayOfYear = localDate.getDayOfYear() - 1;
            int i = (3 - ordinal) + dayOfYear;
            int i2 = (i - ((i / 7) * 7)) - 3;
            if (i2 < -3) {
                i2 += 7;
            }
            if (dayOfYear < i2) {
                return (int) getWeekRange(localDate.withDayOfYear(180).minusYears(1L)).getMaximum();
            }
            int i3 = ((dayOfYear - i2) / 7) + 1;
            if (i3 == 53) {
                if (!(i2 == -3 || (i2 == -2 && localDate.isLeapYear()))) {
                    return 1;
                }
            }
            return i3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int getWeekBasedYear(LocalDate localDate) {
            int year = localDate.getYear();
            int dayOfYear = localDate.getDayOfYear();
            if (dayOfYear <= 3) {
                return dayOfYear - localDate.getDayOfWeek().ordinal() < -2 ? year - 1 : year;
            } else if (dayOfYear >= 363) {
                return ((dayOfYear - 363) - (localDate.isLeapYear() ? 1 : 0)) - localDate.getDayOfWeek().ordinal() >= 0 ? year + 1 : year;
            } else {
                return year;
            }
        }
    }

    /* loaded from: classes5.dex */
    private enum Unit implements TemporalUnit {
        WEEK_BASED_YEARS("WeekBasedYears", Duration.ofSeconds(31556952)),
        QUARTER_YEARS("QuarterYears", Duration.ofSeconds(7889238));
        
        private final Duration duration;
        private final String name;

        @Override // org.threeten.bp.temporal.TemporalUnit
        public boolean isDateBased() {
            return true;
        }

        @Override // org.threeten.bp.temporal.TemporalUnit
        public boolean isDurationEstimated() {
            return true;
        }

        @Override // org.threeten.bp.temporal.TemporalUnit
        public boolean isTimeBased() {
            return false;
        }

        Unit(String str, Duration duration) {
            this.name = str;
            this.duration = duration;
        }

        @Override // org.threeten.bp.temporal.TemporalUnit
        public Duration getDuration() {
            return this.duration;
        }

        @Override // org.threeten.bp.temporal.TemporalUnit
        public boolean isSupportedBy(Temporal temporal) {
            return temporal.isSupported(ChronoField.EPOCH_DAY);
        }

        @Override // org.threeten.bp.temporal.TemporalUnit
        public <R extends Temporal> R addTo(R r, long j) {
            int i = AnonymousClass1.$SwitchMap$org$threeten$bp$temporal$IsoFields$Unit[ordinal()];
            if (i == 1) {
                return (R) r.with(IsoFields.WEEK_BASED_YEAR, Jdk8Methods.safeAdd(r.get(IsoFields.WEEK_BASED_YEAR), j));
            } else if (i == 2) {
                return (R) r.plus(j / 256, ChronoUnit.YEARS).plus((j % 256) * 3, ChronoUnit.MONTHS);
            } else {
                throw new IllegalStateException("Unreachable");
            }
        }

        @Override // org.threeten.bp.temporal.TemporalUnit
        public long between(Temporal temporal, Temporal temporal2) {
            int i = AnonymousClass1.$SwitchMap$org$threeten$bp$temporal$IsoFields$Unit[ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return temporal.until(temporal2, ChronoUnit.MONTHS) / 3;
                }
                throw new IllegalStateException("Unreachable");
            }
            return Jdk8Methods.safeSubtract(temporal2.getLong(IsoFields.WEEK_BASED_YEAR), temporal.getLong(IsoFields.WEEK_BASED_YEAR));
        }

        @Override // java.lang.Enum, org.threeten.bp.temporal.TemporalUnit
        public String toString() {
            return this.name;
        }
    }

    /* renamed from: org.threeten.bp.temporal.IsoFields$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$threeten$bp$temporal$IsoFields$Unit;

        static {
            int[] iArr = new int[Unit.values().length];
            $SwitchMap$org$threeten$bp$temporal$IsoFields$Unit = iArr;
            try {
                iArr[Unit.WEEK_BASED_YEARS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$threeten$bp$temporal$IsoFields$Unit[Unit.QUARTER_YEARS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }
}
