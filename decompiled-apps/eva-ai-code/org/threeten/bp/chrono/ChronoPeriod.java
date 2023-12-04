package org.threeten.bp.chrono;

import java.util.Iterator;
import java.util.List;
import org.threeten.bp.jdk8.Jdk8Methods;
import org.threeten.bp.temporal.Temporal;
import org.threeten.bp.temporal.TemporalAmount;
import org.threeten.bp.temporal.TemporalUnit;
/* loaded from: classes5.dex */
public abstract class ChronoPeriod implements TemporalAmount {
    @Override // org.threeten.bp.temporal.TemporalAmount
    public abstract Temporal addTo(Temporal temporal);

    public abstract boolean equals(Object obj);

    @Override // org.threeten.bp.temporal.TemporalAmount
    public abstract long get(TemporalUnit temporalUnit);

    public abstract Chronology getChronology();

    @Override // org.threeten.bp.temporal.TemporalAmount
    public abstract List<TemporalUnit> getUnits();

    public abstract int hashCode();

    public abstract ChronoPeriod minus(TemporalAmount temporalAmount);

    public abstract ChronoPeriod multipliedBy(int i);

    public abstract ChronoPeriod normalized();

    public abstract ChronoPeriod plus(TemporalAmount temporalAmount);

    @Override // org.threeten.bp.temporal.TemporalAmount
    public abstract Temporal subtractFrom(Temporal temporal);

    public abstract String toString();

    public static ChronoPeriod between(ChronoLocalDate chronoLocalDate, ChronoLocalDate chronoLocalDate2) {
        Jdk8Methods.requireNonNull(chronoLocalDate, "startDateInclusive");
        Jdk8Methods.requireNonNull(chronoLocalDate2, "endDateExclusive");
        return chronoLocalDate.until(chronoLocalDate2);
    }

    public boolean isZero() {
        Iterator<TemporalUnit> it = getUnits().iterator();
        while (it.hasNext()) {
            if (get(it.next()) != 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isNegative() {
        Iterator<TemporalUnit> it = getUnits().iterator();
        while (it.hasNext()) {
            if (get(it.next()) < 0) {
                return true;
            }
        }
        return false;
    }

    public ChronoPeriod negated() {
        return multipliedBy(-1);
    }
}
