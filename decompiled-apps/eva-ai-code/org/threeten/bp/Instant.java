package org.threeten.bp;

import com.google.android.exoplayer2.C;
import io.grpc.netty.shaded.io.netty.handler.codec.rtsp.RtspHeaders;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import org.threeten.bp.format.DateTimeFormatter;
import org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor;
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
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.ValueRange;
/* loaded from: classes5.dex */
public final class Instant extends DefaultInterfaceTemporalAccessor implements Temporal, TemporalAdjuster, Comparable<Instant>, Serializable {
    private static final long MILLIS_PER_SEC = 1000;
    private static final int NANOS_PER_MILLI = 1000000;
    private static final int NANOS_PER_SECOND = 1000000000;
    private static final long serialVersionUID = -665713676816604388L;
    private final int nanos;
    private final long seconds;
    public static final Instant EPOCH = new Instant(0, 0);
    private static final long MIN_SECOND = -31557014167219200L;
    public static final Instant MIN = ofEpochSecond(MIN_SECOND, 0);
    private static final long MAX_SECOND = 31556889864403199L;
    public static final Instant MAX = ofEpochSecond(MAX_SECOND, 999999999);
    public static final TemporalQuery<Instant> FROM = new TemporalQuery<Instant>() { // from class: org.threeten.bp.Instant.1
        @Override // org.threeten.bp.temporal.TemporalQuery
        public Instant queryFrom(TemporalAccessor temporalAccessor) {
            return Instant.from(temporalAccessor);
        }
    };

    public static Instant now() {
        return Clock.systemUTC().instant();
    }

    public static Instant now(Clock clock) {
        Jdk8Methods.requireNonNull(clock, RtspHeaders.Values.CLOCK);
        return clock.instant();
    }

    public static Instant ofEpochSecond(long j) {
        return create(j, 0);
    }

    public static Instant ofEpochSecond(long j, long j2) {
        return create(Jdk8Methods.safeAdd(j, Jdk8Methods.floorDiv(j2, (long) C.NANOS_PER_SECOND)), Jdk8Methods.floorMod(j2, 1000000000));
    }

    public static Instant ofEpochMilli(long j) {
        return create(Jdk8Methods.floorDiv(j, 1000L), Jdk8Methods.floorMod(j, 1000) * 1000000);
    }

    public static Instant from(TemporalAccessor temporalAccessor) {
        try {
            return ofEpochSecond(temporalAccessor.getLong(ChronoField.INSTANT_SECONDS), temporalAccessor.get(ChronoField.NANO_OF_SECOND));
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain Instant from TemporalAccessor: " + temporalAccessor + ", type " + temporalAccessor.getClass().getName(), e);
        }
    }

    public static Instant parse(CharSequence charSequence) {
        return (Instant) DateTimeFormatter.ISO_INSTANT.parse(charSequence, FROM);
    }

    private static Instant create(long j, int i) {
        if ((i | j) == 0) {
            return EPOCH;
        }
        if (j < MIN_SECOND || j > MAX_SECOND) {
            throw new DateTimeException("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j, i);
    }

    private Instant(long j, int i) {
        this.seconds = j;
        this.nanos = i;
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public boolean isSupported(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.INSTANT_SECONDS || temporalField == ChronoField.NANO_OF_SECOND || temporalField == ChronoField.MICRO_OF_SECOND || temporalField == ChronoField.MILLI_OF_SECOND : temporalField != null && temporalField.isSupportedBy(this);
    }

    @Override // org.threeten.bp.temporal.Temporal
    public boolean isSupported(TemporalUnit temporalUnit) {
        return temporalUnit instanceof ChronoUnit ? temporalUnit.isTimeBased() || temporalUnit == ChronoUnit.DAYS : temporalUnit != null && temporalUnit.isSupportedBy(this);
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public ValueRange range(TemporalField temporalField) {
        return super.range(temporalField);
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public int get(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i = AnonymousClass2.$SwitchMap$org$threeten$bp$temporal$ChronoField[((ChronoField) temporalField).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return this.nanos / 1000000;
                    }
                    throw new UnsupportedTemporalTypeException("Unsupported field: " + temporalField);
                }
                return this.nanos / 1000;
            }
            return this.nanos;
        }
        return range(temporalField).checkValidIntValue(temporalField.getFrom(this), temporalField);
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public long getLong(TemporalField temporalField) {
        int i;
        if (temporalField instanceof ChronoField) {
            int i2 = AnonymousClass2.$SwitchMap$org$threeten$bp$temporal$ChronoField[((ChronoField) temporalField).ordinal()];
            if (i2 == 1) {
                i = this.nanos;
            } else if (i2 == 2) {
                i = this.nanos / 1000;
            } else if (i2 != 3) {
                if (i2 == 4) {
                    return this.seconds;
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: " + temporalField);
            } else {
                i = this.nanos / 1000000;
            }
            return i;
        }
        return temporalField.getFrom(this);
    }

    public long getEpochSecond() {
        return this.seconds;
    }

    public int getNano() {
        return this.nanos;
    }

    @Override // org.threeten.bp.temporal.Temporal
    public Instant with(TemporalAdjuster temporalAdjuster) {
        return (Instant) temporalAdjuster.adjustInto(this);
    }

    @Override // org.threeten.bp.temporal.Temporal
    public Instant with(TemporalField temporalField, long j) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            chronoField.checkValidValue(j);
            int i = AnonymousClass2.$SwitchMap$org$threeten$bp$temporal$ChronoField[chronoField.ordinal()];
            if (i == 1) {
                return j != ((long) this.nanos) ? create(this.seconds, (int) j) : this;
            } else if (i == 2) {
                int i2 = ((int) j) * 1000;
                return i2 != this.nanos ? create(this.seconds, i2) : this;
            } else if (i == 3) {
                int i3 = ((int) j) * 1000000;
                return i3 != this.nanos ? create(this.seconds, i3) : this;
            } else if (i == 4) {
                return j != this.seconds ? create(j, this.nanos) : this;
            } else {
                throw new UnsupportedTemporalTypeException("Unsupported field: " + temporalField);
            }
        }
        return (Instant) temporalField.adjustInto(this, j);
    }

    public Instant truncatedTo(TemporalUnit temporalUnit) {
        if (temporalUnit == ChronoUnit.NANOS) {
            return this;
        }
        Duration duration = temporalUnit.getDuration();
        if (duration.getSeconds() > 86400) {
            throw new DateTimeException("Unit is too large to be used for truncation");
        }
        long nanos = duration.toNanos();
        if (86400000000000L % nanos != 0) {
            throw new DateTimeException("Unit must divide into a standard day without remainder");
        }
        long j = ((this.seconds % 86400) * C.NANOS_PER_SECOND) + this.nanos;
        return plusNanos((Jdk8Methods.floorDiv(j, nanos) * nanos) - j);
    }

    @Override // org.threeten.bp.temporal.Temporal
    public Instant plus(TemporalAmount temporalAmount) {
        return (Instant) temporalAmount.addTo(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.threeten.bp.Instant$2  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$org$threeten$bp$temporal$ChronoField;
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
            try {
                $SwitchMap$org$threeten$bp$temporal$ChronoUnit[ChronoUnit.DAYS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[ChronoField.values().length];
            $SwitchMap$org$threeten$bp$temporal$ChronoField = iArr2;
            try {
                iArr2[ChronoField.NANO_OF_SECOND.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$org$threeten$bp$temporal$ChronoField[ChronoField.MICRO_OF_SECOND.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$org$threeten$bp$temporal$ChronoField[ChronoField.MILLI_OF_SECOND.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$org$threeten$bp$temporal$ChronoField[ChronoField.INSTANT_SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    @Override // org.threeten.bp.temporal.Temporal
    public Instant plus(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            switch (AnonymousClass2.$SwitchMap$org$threeten$bp$temporal$ChronoUnit[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return plusNanos(j);
                case 2:
                    return plus(j / 1000000, (j % 1000000) * 1000);
                case 3:
                    return plusMillis(j);
                case 4:
                    return plusSeconds(j);
                case 5:
                    return plusSeconds(Jdk8Methods.safeMultiply(j, 60));
                case 6:
                    return plusSeconds(Jdk8Methods.safeMultiply(j, 3600));
                case 7:
                    return plusSeconds(Jdk8Methods.safeMultiply(j, 43200));
                case 8:
                    return plusSeconds(Jdk8Methods.safeMultiply(j, 86400));
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported unit: " + temporalUnit);
            }
        }
        return (Instant) temporalUnit.addTo(this, j);
    }

    public Instant plusSeconds(long j) {
        return plus(j, 0L);
    }

    public Instant plusMillis(long j) {
        return plus(j / 1000, (j % 1000) * 1000000);
    }

    public Instant plusNanos(long j) {
        return plus(0L, j);
    }

    private Instant plus(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return ofEpochSecond(Jdk8Methods.safeAdd(Jdk8Methods.safeAdd(this.seconds, j), j2 / C.NANOS_PER_SECOND), this.nanos + (j2 % C.NANOS_PER_SECOND));
    }

    @Override // org.threeten.bp.temporal.Temporal
    public Instant minus(TemporalAmount temporalAmount) {
        return (Instant) temporalAmount.subtractFrom(this);
    }

    @Override // org.threeten.bp.temporal.Temporal
    public Instant minus(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, temporalUnit).plus(1L, temporalUnit) : plus(-j, temporalUnit);
    }

    public Instant minusSeconds(long j) {
        if (j == Long.MIN_VALUE) {
            return plusSeconds(Long.MAX_VALUE).plusSeconds(1L);
        }
        return plusSeconds(-j);
    }

    public Instant minusMillis(long j) {
        if (j == Long.MIN_VALUE) {
            return plusMillis(Long.MAX_VALUE).plusMillis(1L);
        }
        return plusMillis(-j);
    }

    public Instant minusNanos(long j) {
        if (j == Long.MIN_VALUE) {
            return plusNanos(Long.MAX_VALUE).plusNanos(1L);
        }
        return plusNanos(-j);
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public <R> R query(TemporalQuery<R> temporalQuery) {
        if (temporalQuery == TemporalQueries.precision()) {
            return (R) ChronoUnit.NANOS;
        }
        if (temporalQuery == TemporalQueries.localDate() || temporalQuery == TemporalQueries.localTime() || temporalQuery == TemporalQueries.chronology() || temporalQuery == TemporalQueries.zoneId() || temporalQuery == TemporalQueries.zone() || temporalQuery == TemporalQueries.offset()) {
            return null;
        }
        return temporalQuery.queryFrom(this);
    }

    @Override // org.threeten.bp.temporal.TemporalAdjuster
    public Temporal adjustInto(Temporal temporal) {
        return temporal.with(ChronoField.INSTANT_SECONDS, this.seconds).with(ChronoField.NANO_OF_SECOND, this.nanos);
    }

    @Override // org.threeten.bp.temporal.Temporal
    public long until(Temporal temporal, TemporalUnit temporalUnit) {
        Instant from = from(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            switch (AnonymousClass2.$SwitchMap$org$threeten$bp$temporal$ChronoUnit[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return nanosUntil(from);
                case 2:
                    return nanosUntil(from) / 1000;
                case 3:
                    return Jdk8Methods.safeSubtract(from.toEpochMilli(), toEpochMilli());
                case 4:
                    return secondsUntil(from);
                case 5:
                    return secondsUntil(from) / 60;
                case 6:
                    return secondsUntil(from) / 3600;
                case 7:
                    return secondsUntil(from) / 43200;
                case 8:
                    return secondsUntil(from) / 86400;
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported unit: " + temporalUnit);
            }
        }
        return temporalUnit.between(this, from);
    }

    private long nanosUntil(Instant instant) {
        return Jdk8Methods.safeAdd(Jdk8Methods.safeMultiply(Jdk8Methods.safeSubtract(instant.seconds, this.seconds), 1000000000), instant.nanos - this.nanos);
    }

    private long secondsUntil(Instant instant) {
        long safeSubtract = Jdk8Methods.safeSubtract(instant.seconds, this.seconds);
        long j = instant.nanos - this.nanos;
        int i = (safeSubtract > 0L ? 1 : (safeSubtract == 0L ? 0 : -1));
        return (i <= 0 || j >= 0) ? (i >= 0 || j <= 0) ? safeSubtract : safeSubtract + 1 : safeSubtract - 1;
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.ofInstant(this, zoneOffset);
    }

    public ZonedDateTime atZone(ZoneId zoneId) {
        return ZonedDateTime.ofInstant(this, zoneId);
    }

    public long toEpochMilli() {
        long j = this.seconds;
        if (j >= 0) {
            return Jdk8Methods.safeAdd(Jdk8Methods.safeMultiply(j, 1000L), this.nanos / 1000000);
        }
        return Jdk8Methods.safeSubtract(Jdk8Methods.safeMultiply(j + 1, 1000L), 1000 - (this.nanos / 1000000));
    }

    @Override // java.lang.Comparable
    public int compareTo(Instant instant) {
        int compareLongs = Jdk8Methods.compareLongs(this.seconds, instant.seconds);
        return compareLongs != 0 ? compareLongs : this.nanos - instant.nanos;
    }

    public boolean isAfter(Instant instant) {
        return compareTo(instant) > 0;
    }

    public boolean isBefore(Instant instant) {
        return compareTo(instant) < 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            return this.seconds == instant.seconds && this.nanos == instant.nanos;
        }
        return false;
    }

    public int hashCode() {
        long j = this.seconds;
        return ((int) (j ^ (j >>> 32))) + (this.nanos * 51);
    }

    public String toString() {
        return DateTimeFormatter.ISO_INSTANT.format(this);
    }

    private Object writeReplace() {
        return new Ser((byte) 2, this);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeExternal(DataOutput dataOutput) throws IOException {
        dataOutput.writeLong(this.seconds);
        dataOutput.writeInt(this.nanos);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Instant readExternal(DataInput dataInput) throws IOException {
        return ofEpochSecond(dataInput.readLong(), dataInput.readInt());
    }
}
