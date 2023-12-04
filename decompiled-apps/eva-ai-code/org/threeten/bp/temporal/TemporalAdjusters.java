package org.threeten.bp.temporal;

import org.threeten.bp.DayOfWeek;
import org.threeten.bp.jdk8.Jdk8Methods;
/* loaded from: classes5.dex */
public final class TemporalAdjusters {
    private TemporalAdjusters() {
    }

    public static TemporalAdjuster firstDayOfMonth() {
        return Impl.FIRST_DAY_OF_MONTH;
    }

    public static TemporalAdjuster lastDayOfMonth() {
        return Impl.LAST_DAY_OF_MONTH;
    }

    public static TemporalAdjuster firstDayOfNextMonth() {
        return Impl.FIRST_DAY_OF_NEXT_MONTH;
    }

    public static TemporalAdjuster firstDayOfYear() {
        return Impl.FIRST_DAY_OF_YEAR;
    }

    public static TemporalAdjuster lastDayOfYear() {
        return Impl.LAST_DAY_OF_YEAR;
    }

    public static TemporalAdjuster firstDayOfNextYear() {
        return Impl.FIRST_DAY_OF_NEXT_YEAR;
    }

    /* loaded from: classes5.dex */
    private static class Impl implements TemporalAdjuster {
        private final int ordinal;
        private static final Impl FIRST_DAY_OF_MONTH = new Impl(0);
        private static final Impl LAST_DAY_OF_MONTH = new Impl(1);
        private static final Impl FIRST_DAY_OF_NEXT_MONTH = new Impl(2);
        private static final Impl FIRST_DAY_OF_YEAR = new Impl(3);
        private static final Impl LAST_DAY_OF_YEAR = new Impl(4);
        private static final Impl FIRST_DAY_OF_NEXT_YEAR = new Impl(5);

        private Impl(int i) {
            this.ordinal = i;
        }

        @Override // org.threeten.bp.temporal.TemporalAdjuster
        public Temporal adjustInto(Temporal temporal) {
            int i = this.ordinal;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i == 5) {
                                    return temporal.with(ChronoField.DAY_OF_YEAR, 1L).plus(1L, ChronoUnit.YEARS);
                                }
                                throw new IllegalStateException("Unreachable");
                            }
                            return temporal.with(ChronoField.DAY_OF_YEAR, temporal.range(ChronoField.DAY_OF_YEAR).getMaximum());
                        }
                        return temporal.with(ChronoField.DAY_OF_YEAR, 1L);
                    }
                    return temporal.with(ChronoField.DAY_OF_MONTH, 1L).plus(1L, ChronoUnit.MONTHS);
                }
                return temporal.with(ChronoField.DAY_OF_MONTH, temporal.range(ChronoField.DAY_OF_MONTH).getMaximum());
            }
            return temporal.with(ChronoField.DAY_OF_MONTH, 1L);
        }
    }

    public static TemporalAdjuster firstInMonth(DayOfWeek dayOfWeek) {
        Jdk8Methods.requireNonNull(dayOfWeek, "dayOfWeek");
        return new DayOfWeekInMonth(1, dayOfWeek);
    }

    public static TemporalAdjuster lastInMonth(DayOfWeek dayOfWeek) {
        Jdk8Methods.requireNonNull(dayOfWeek, "dayOfWeek");
        return new DayOfWeekInMonth(-1, dayOfWeek);
    }

    public static TemporalAdjuster dayOfWeekInMonth(int i, DayOfWeek dayOfWeek) {
        Jdk8Methods.requireNonNull(dayOfWeek, "dayOfWeek");
        return new DayOfWeekInMonth(i, dayOfWeek);
    }

    /* loaded from: classes5.dex */
    private static final class DayOfWeekInMonth implements TemporalAdjuster {
        private final int dowValue;
        private final int ordinal;

        private DayOfWeekInMonth(int i, DayOfWeek dayOfWeek) {
            this.ordinal = i;
            this.dowValue = dayOfWeek.getValue();
        }

        @Override // org.threeten.bp.temporal.TemporalAdjuster
        public Temporal adjustInto(Temporal temporal) {
            Temporal with;
            if (this.ordinal >= 0) {
                return temporal.with(ChronoField.DAY_OF_MONTH, 1L).plus((((this.dowValue - with.get(ChronoField.DAY_OF_WEEK)) + 7) % 7) + ((this.ordinal - 1) * 7), ChronoUnit.DAYS);
            }
            Temporal with2 = temporal.with(ChronoField.DAY_OF_MONTH, temporal.range(ChronoField.DAY_OF_MONTH).getMaximum());
            long j = this.dowValue - with2.get(ChronoField.DAY_OF_WEEK);
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i == 0) {
                j = 0;
            } else if (i > 0) {
                j -= 7;
            }
            return with2.plus(j - (((-this.ordinal) - 1) * 7), ChronoUnit.DAYS);
        }
    }

    public static TemporalAdjuster next(DayOfWeek dayOfWeek) {
        return new RelativeDayOfWeek(2, dayOfWeek);
    }

    public static TemporalAdjuster nextOrSame(DayOfWeek dayOfWeek) {
        return new RelativeDayOfWeek(0, dayOfWeek);
    }

    public static TemporalAdjuster previous(DayOfWeek dayOfWeek) {
        return new RelativeDayOfWeek(3, dayOfWeek);
    }

    public static TemporalAdjuster previousOrSame(DayOfWeek dayOfWeek) {
        return new RelativeDayOfWeek(1, dayOfWeek);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class RelativeDayOfWeek implements TemporalAdjuster {
        private final int dowValue;
        private final int relative;

        private RelativeDayOfWeek(int i, DayOfWeek dayOfWeek) {
            Jdk8Methods.requireNonNull(dayOfWeek, "dayOfWeek");
            this.relative = i;
            this.dowValue = dayOfWeek.getValue();
        }

        @Override // org.threeten.bp.temporal.TemporalAdjuster
        public Temporal adjustInto(Temporal temporal) {
            int i = temporal.get(ChronoField.DAY_OF_WEEK);
            int i2 = this.relative;
            if (i2 >= 2 || i != this.dowValue) {
                if ((i2 & 1) == 0) {
                    int i3 = i - this.dowValue;
                    return temporal.plus(i3 >= 0 ? 7 - i3 : -i3, ChronoUnit.DAYS);
                }
                int i4 = this.dowValue - i;
                return temporal.minus(i4 >= 0 ? 7 - i4 : -i4, ChronoUnit.DAYS);
            }
            return temporal;
        }
    }
}
