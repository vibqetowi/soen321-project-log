package org.threeten.bp.chrono;

import com.google.common.base.Ascii;
import io.grpc.netty.shaded.io.netty.handler.codec.rtsp.RtspHeaders;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import org.threeten.bp.LocalTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.chrono.ChronoLocalDate;
import org.threeten.bp.jdk8.Jdk8Methods;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.Temporal;
import org.threeten.bp.temporal.TemporalAdjuster;
import org.threeten.bp.temporal.TemporalField;
import org.threeten.bp.temporal.TemporalUnit;
import org.threeten.bp.temporal.ValueRange;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class ChronoLocalDateTimeImpl<D extends ChronoLocalDate> extends ChronoLocalDateTime<D> implements Temporal, TemporalAdjuster, Serializable {
    private static final int HOURS_PER_DAY = 24;
    private static final long MICROS_PER_DAY = 86400000000L;
    private static final long MILLIS_PER_DAY = 86400000;
    private static final int MINUTES_PER_DAY = 1440;
    private static final int MINUTES_PER_HOUR = 60;
    private static final long NANOS_PER_DAY = 86400000000000L;
    private static final long NANOS_PER_HOUR = 3600000000000L;
    private static final long NANOS_PER_MINUTE = 60000000000L;
    private static final long NANOS_PER_SECOND = 1000000000;
    private static final int SECONDS_PER_DAY = 86400;
    private static final int SECONDS_PER_HOUR = 3600;
    private static final int SECONDS_PER_MINUTE = 60;
    private static final long serialVersionUID = 4556003607393004514L;
    private final D date;
    private final LocalTime time;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <R extends ChronoLocalDate> ChronoLocalDateTimeImpl<R> of(R r, LocalTime localTime) {
        return new ChronoLocalDateTimeImpl<>(r, localTime);
    }

    private ChronoLocalDateTimeImpl(D d, LocalTime localTime) {
        Jdk8Methods.requireNonNull(d, "date");
        Jdk8Methods.requireNonNull(localTime, RtspHeaders.Values.TIME);
        this.date = d;
        this.time = localTime;
    }

    private ChronoLocalDateTimeImpl<D> with(Temporal temporal, LocalTime localTime) {
        D d = this.date;
        return (d == temporal && this.time == localTime) ? this : new ChronoLocalDateTimeImpl<>(d.getChronology().ensureChronoLocalDate(temporal), localTime);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDateTime
    public D toLocalDate() {
        return this.date;
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDateTime
    public LocalTime toLocalTime() {
        return this.time;
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public boolean isSupported(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField.isDateBased() || temporalField.isTimeBased() : temporalField != null && temporalField.isSupportedBy(this);
    }

    @Override // org.threeten.bp.temporal.Temporal
    public boolean isSupported(TemporalUnit temporalUnit) {
        return temporalUnit instanceof ChronoUnit ? temporalUnit.isDateBased() || temporalUnit.isTimeBased() : temporalUnit != null && temporalUnit.isSupportedBy(this);
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public ValueRange range(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return temporalField.isTimeBased() ? this.time.range(temporalField) : this.date.range(temporalField);
        }
        return temporalField.rangeRefinedBy(this);
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public int get(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return temporalField.isTimeBased() ? this.time.get(temporalField) : this.date.get(temporalField);
        }
        return range(temporalField).checkValidIntValue(getLong(temporalField), temporalField);
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public long getLong(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return temporalField.isTimeBased() ? this.time.getLong(temporalField) : this.date.getLong(temporalField);
        }
        return temporalField.getFrom(this);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDateTime, org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public ChronoLocalDateTimeImpl<D> with(TemporalAdjuster temporalAdjuster) {
        if (temporalAdjuster instanceof ChronoLocalDate) {
            return with((ChronoLocalDate) temporalAdjuster, this.time);
        }
        if (temporalAdjuster instanceof LocalTime) {
            return with(this.date, (LocalTime) temporalAdjuster);
        }
        if (temporalAdjuster instanceof ChronoLocalDateTimeImpl) {
            return this.date.getChronology().ensureChronoLocalDateTime((ChronoLocalDateTimeImpl) temporalAdjuster);
        }
        return this.date.getChronology().ensureChronoLocalDateTime((ChronoLocalDateTimeImpl) temporalAdjuster.adjustInto(this));
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDateTime, org.threeten.bp.temporal.Temporal
    public ChronoLocalDateTimeImpl<D> with(TemporalField temporalField, long j) {
        if (temporalField instanceof ChronoField) {
            if (temporalField.isTimeBased()) {
                return with(this.date, this.time.with(temporalField, j));
            }
            return with(this.date.with(temporalField, j), this.time);
        }
        return this.date.getChronology().ensureChronoLocalDateTime(temporalField.adjustInto(this, j));
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDateTime, org.threeten.bp.temporal.Temporal
    public ChronoLocalDateTimeImpl<D> plus(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            switch (AnonymousClass1.$SwitchMap$org$threeten$bp$temporal$ChronoUnit[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return plusNanos(j);
                case 2:
                    return plusDays(j / MICROS_PER_DAY).plusNanos((j % MICROS_PER_DAY) * 1000);
                case 3:
                    return plusDays(j / 86400000).plusNanos((j % 86400000) * 1000000);
                case 4:
                    return plusSeconds(j);
                case 5:
                    return plusMinutes(j);
                case 6:
                    return plusHours(j);
                case 7:
                    return plusDays(j / 256).plusHours((j % 256) * 12);
                default:
                    return with(this.date.plus(j, temporalUnit), this.time);
            }
        }
        return this.date.getChronology().ensureChronoLocalDateTime(temporalUnit.addTo(this, j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.threeten.bp.chrono.ChronoLocalDateTimeImpl$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$threeten$bp$temporal$ChronoUnit;

        static {
            int[] iArr = new int[ChronoUnit.values().length];
            $SwitchMap$org$threeten$bp$temporal$ChronoUnit = iArr;
            try {
                iArr[ChronoUnit.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$threeten$bp$temporal$ChronoUnit[ChronoUnit.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$threeten$bp$temporal$ChronoUnit[ChronoUnit.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$threeten$bp$temporal$ChronoUnit[ChronoUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$threeten$bp$temporal$ChronoUnit[ChronoUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$threeten$bp$temporal$ChronoUnit[ChronoUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$threeten$bp$temporal$ChronoUnit[ChronoUnit.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private ChronoLocalDateTimeImpl<D> plusDays(long j) {
        return with(this.date.plus(j, ChronoUnit.DAYS), this.time);
    }

    private ChronoLocalDateTimeImpl<D> plusHours(long j) {
        return plusWithOverflow(this.date, j, 0L, 0L, 0L);
    }

    private ChronoLocalDateTimeImpl<D> plusMinutes(long j) {
        return plusWithOverflow(this.date, 0L, j, 0L, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ChronoLocalDateTimeImpl<D> plusSeconds(long j) {
        return plusWithOverflow(this.date, 0L, 0L, j, 0L);
    }

    private ChronoLocalDateTimeImpl<D> plusNanos(long j) {
        return plusWithOverflow(this.date, 0L, 0L, 0L, j);
    }

    private ChronoLocalDateTimeImpl<D> plusWithOverflow(D d, long j, long j2, long j3, long j4) {
        if ((j | j2 | j3 | j4) == 0) {
            return with(d, this.time);
        }
        long j5 = (j4 / NANOS_PER_DAY) + (j3 / 86400) + (j2 / 1440) + (j / 24);
        long j6 = (j4 % NANOS_PER_DAY) + ((j3 % 86400) * 1000000000) + ((j2 % 1440) * NANOS_PER_MINUTE) + ((j % 24) * NANOS_PER_HOUR);
        long nanoOfDay = this.time.toNanoOfDay();
        long j7 = j6 + nanoOfDay;
        long floorDiv = j5 + Jdk8Methods.floorDiv(j7, (long) NANOS_PER_DAY);
        long floorMod = Jdk8Methods.floorMod(j7, (long) NANOS_PER_DAY);
        return with(d.plus(floorDiv, ChronoUnit.DAYS), floorMod == nanoOfDay ? this.time : LocalTime.ofNanoOfDay(floorMod));
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDateTime
    public ChronoZonedDateTime<D> atZone(ZoneId zoneId) {
        return ChronoZonedDateTimeImpl.ofBest(this, zoneId, null);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [org.threeten.bp.chrono.ChronoLocalDate] */
    @Override // org.threeten.bp.temporal.Temporal
    public long until(Temporal temporal, TemporalUnit temporalUnit) {
        ChronoLocalDateTime<?> localDateTime = toLocalDate().getChronology().localDateTime(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
            if (chronoUnit.isTimeBased()) {
                long j = localDateTime.getLong(ChronoField.EPOCH_DAY) - this.date.getLong(ChronoField.EPOCH_DAY);
                switch (AnonymousClass1.$SwitchMap$org$threeten$bp$temporal$ChronoUnit[chronoUnit.ordinal()]) {
                    case 1:
                        j = Jdk8Methods.safeMultiply(j, (long) NANOS_PER_DAY);
                        break;
                    case 2:
                        j = Jdk8Methods.safeMultiply(j, (long) MICROS_PER_DAY);
                        break;
                    case 3:
                        j = Jdk8Methods.safeMultiply(j, 86400000L);
                        break;
                    case 4:
                        j = Jdk8Methods.safeMultiply(j, (int) SECONDS_PER_DAY);
                        break;
                    case 5:
                        j = Jdk8Methods.safeMultiply(j, (int) MINUTES_PER_DAY);
                        break;
                    case 6:
                        j = Jdk8Methods.safeMultiply(j, 24);
                        break;
                    case 7:
                        j = Jdk8Methods.safeMultiply(j, 2);
                        break;
                }
                return Jdk8Methods.safeAdd(j, this.time.until(localDateTime.toLocalTime(), temporalUnit));
            }
            ?? localDate = localDateTime.toLocalDate();
            ChronoLocalDate chronoLocalDate = localDate;
            if (localDateTime.toLocalTime().isBefore(this.time)) {
                chronoLocalDate = localDate.minus(1L, ChronoUnit.DAYS);
            }
            return this.date.until(chronoLocalDate, temporalUnit);
        }
        return temporalUnit.between(this, localDateTime);
    }

    private Object writeReplace() {
        return new Ser(Ascii.FF, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(this.date);
        objectOutput.writeObject(this.time);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ChronoLocalDateTime<?> readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        return ((ChronoLocalDate) objectInput.readObject()).atTime((LocalTime) objectInput.readObject());
    }
}
