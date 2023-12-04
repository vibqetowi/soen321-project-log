package org.threeten.bp.chrono;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Comparator;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZoneOffset;
import org.threeten.bp.chrono.ChronoLocalDate;
import org.threeten.bp.format.DateTimeFormatter;
import org.threeten.bp.jdk8.DefaultInterfaceTemporal;
import org.threeten.bp.jdk8.Jdk8Methods;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.Temporal;
import org.threeten.bp.temporal.TemporalAccessor;
import org.threeten.bp.temporal.TemporalAdjuster;
import org.threeten.bp.temporal.TemporalAmount;
import org.threeten.bp.temporal.TemporalField;
import org.threeten.bp.temporal.TemporalQueries;
import org.threeten.bp.temporal.TemporalQuery;
import org.threeten.bp.temporal.TemporalUnit;
/* loaded from: classes5.dex */
public abstract class ChronoLocalDateTime<D extends ChronoLocalDate> extends DefaultInterfaceTemporal implements Temporal, TemporalAdjuster, Comparable<ChronoLocalDateTime<?>> {
    private static final Comparator<ChronoLocalDateTime<?>> DATE_TIME_COMPARATOR = new Comparator<ChronoLocalDateTime<?>>() { // from class: org.threeten.bp.chrono.ChronoLocalDateTime.1
        /* JADX WARN: Type inference failed for: r0v0, types: [org.threeten.bp.chrono.ChronoLocalDate] */
        /* JADX WARN: Type inference failed for: r2v0, types: [org.threeten.bp.chrono.ChronoLocalDate] */
        @Override // java.util.Comparator
        public int compare(ChronoLocalDateTime<?> chronoLocalDateTime, ChronoLocalDateTime<?> chronoLocalDateTime2) {
            int compareLongs = Jdk8Methods.compareLongs(chronoLocalDateTime.toLocalDate().toEpochDay(), chronoLocalDateTime2.toLocalDate().toEpochDay());
            return compareLongs == 0 ? Jdk8Methods.compareLongs(chronoLocalDateTime.toLocalTime().toNanoOfDay(), chronoLocalDateTime2.toLocalTime().toNanoOfDay()) : compareLongs;
        }
    };

    public abstract ChronoZonedDateTime<D> atZone(ZoneId zoneId);

    @Override // org.threeten.bp.temporal.Temporal
    public abstract ChronoLocalDateTime<D> plus(long j, TemporalUnit temporalUnit);

    public abstract D toLocalDate();

    public abstract LocalTime toLocalTime();

    @Override // org.threeten.bp.temporal.Temporal
    public abstract ChronoLocalDateTime<D> with(TemporalField temporalField, long j);

    public static Comparator<ChronoLocalDateTime<?>> timeLineOrder() {
        return DATE_TIME_COMPARATOR;
    }

    public static ChronoLocalDateTime<?> from(TemporalAccessor temporalAccessor) {
        Jdk8Methods.requireNonNull(temporalAccessor, "temporal");
        if (temporalAccessor instanceof ChronoLocalDateTime) {
            return (ChronoLocalDateTime) temporalAccessor;
        }
        Chronology chronology = (Chronology) temporalAccessor.query(TemporalQueries.chronology());
        if (chronology == null) {
            throw new DateTimeException("No Chronology found to create ChronoLocalDateTime: " + temporalAccessor.getClass());
        }
        return chronology.localDateTime(temporalAccessor);
    }

    public Chronology getChronology() {
        return toLocalDate().getChronology();
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public ChronoLocalDateTime<D> with(TemporalAdjuster temporalAdjuster) {
        return toLocalDate().getChronology().ensureChronoLocalDateTime(super.with(temporalAdjuster));
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public ChronoLocalDateTime<D> plus(TemporalAmount temporalAmount) {
        return toLocalDate().getChronology().ensureChronoLocalDateTime(super.plus(temporalAmount));
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public ChronoLocalDateTime<D> minus(TemporalAmount temporalAmount) {
        return toLocalDate().getChronology().ensureChronoLocalDateTime(super.minus(temporalAmount));
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public ChronoLocalDateTime<D> minus(long j, TemporalUnit temporalUnit) {
        return toLocalDate().getChronology().ensureChronoLocalDateTime(super.minus(j, temporalUnit));
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public <R> R query(TemporalQuery<R> temporalQuery) {
        if (temporalQuery == TemporalQueries.chronology()) {
            return (R) getChronology();
        }
        if (temporalQuery == TemporalQueries.precision()) {
            return (R) ChronoUnit.NANOS;
        }
        if (temporalQuery == TemporalQueries.localDate()) {
            return (R) LocalDate.ofEpochDay(toLocalDate().toEpochDay());
        }
        if (temporalQuery == TemporalQueries.localTime()) {
            return (R) toLocalTime();
        }
        if (temporalQuery == TemporalQueries.zone() || temporalQuery == TemporalQueries.zoneId() || temporalQuery == TemporalQueries.offset()) {
            return null;
        }
        return (R) super.query(temporalQuery);
    }

    public Temporal adjustInto(Temporal temporal) {
        return temporal.with(ChronoField.EPOCH_DAY, toLocalDate().toEpochDay()).with(ChronoField.NANO_OF_DAY, toLocalTime().toNanoOfDay());
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Jdk8Methods.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    public Instant toInstant(ZoneOffset zoneOffset) {
        return Instant.ofEpochSecond(toEpochSecond(zoneOffset), toLocalTime().getNano());
    }

    public long toEpochSecond(ZoneOffset zoneOffset) {
        Jdk8Methods.requireNonNull(zoneOffset, TypedValues.CycleType.S_WAVE_OFFSET);
        return ((toLocalDate().toEpochDay() * 86400) + toLocalTime().toSecondOfDay()) - zoneOffset.getTotalSeconds();
    }

    @Override // java.lang.Comparable
    public int compareTo(ChronoLocalDateTime<?> chronoLocalDateTime) {
        int compareTo = toLocalDate().compareTo(chronoLocalDateTime.toLocalDate());
        if (compareTo == 0) {
            int compareTo2 = toLocalTime().compareTo(chronoLocalDateTime.toLocalTime());
            return compareTo2 == 0 ? getChronology().compareTo(chronoLocalDateTime.getChronology()) : compareTo2;
        }
        return compareTo;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [org.threeten.bp.chrono.ChronoLocalDate] */
    public boolean isAfter(ChronoLocalDateTime<?> chronoLocalDateTime) {
        int i = (toLocalDate().toEpochDay() > chronoLocalDateTime.toLocalDate().toEpochDay() ? 1 : (toLocalDate().toEpochDay() == chronoLocalDateTime.toLocalDate().toEpochDay() ? 0 : -1));
        return i > 0 || (i == 0 && toLocalTime().toNanoOfDay() > chronoLocalDateTime.toLocalTime().toNanoOfDay());
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [org.threeten.bp.chrono.ChronoLocalDate] */
    public boolean isBefore(ChronoLocalDateTime<?> chronoLocalDateTime) {
        int i = (toLocalDate().toEpochDay() > chronoLocalDateTime.toLocalDate().toEpochDay() ? 1 : (toLocalDate().toEpochDay() == chronoLocalDateTime.toLocalDate().toEpochDay() ? 0 : -1));
        return i < 0 || (i == 0 && toLocalTime().toNanoOfDay() < chronoLocalDateTime.toLocalTime().toNanoOfDay());
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [org.threeten.bp.chrono.ChronoLocalDate] */
    public boolean isEqual(ChronoLocalDateTime<?> chronoLocalDateTime) {
        return toLocalTime().toNanoOfDay() == chronoLocalDateTime.toLocalTime().toNanoOfDay() && toLocalDate().toEpochDay() == chronoLocalDateTime.toLocalDate().toEpochDay();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoLocalDateTime) && compareTo((ChronoLocalDateTime) obj) == 0;
    }

    public int hashCode() {
        return toLocalDate().hashCode() ^ toLocalTime().hashCode();
    }

    public String toString() {
        return toLocalDate().toString() + 'T' + toLocalTime().toString();
    }
}
