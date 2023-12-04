package io.opencensus.common;

import com.google.android.exoplayer2.C;
import com.google.protobuf.util.TimeUtil;
import java.math.BigDecimal;
import java.math.RoundingMode;
/* loaded from: classes4.dex */
public abstract class Timestamp implements Comparable<Timestamp> {
    public abstract int getNanos();

    public abstract long getSeconds();

    public static Timestamp create(long j, int i) {
        if (j < TimeUtil.DURATION_SECONDS_MIN) {
            throw new IllegalArgumentException("'seconds' is less than minimum (-315576000000): " + j);
        } else if (j > TimeUtil.DURATION_SECONDS_MAX) {
            throw new IllegalArgumentException("'seconds' is greater than maximum (315576000000): " + j);
        } else if (i < 0) {
            throw new IllegalArgumentException("'nanos' is less than zero: " + i);
        } else if (i > 999999999) {
            throw new IllegalArgumentException("'nanos' is greater than maximum (999999999): " + i);
        } else {
            return new AutoValue_Timestamp(j, i);
        }
    }

    public static Timestamp fromMillis(long j) {
        return create(floorDiv(j, 1000L), (int) (((int) floorMod(j, 1000L)) * 1000000));
    }

    public Timestamp addNanos(long j) {
        return plus(0L, j);
    }

    public Timestamp addDuration(Duration duration) {
        return plus(duration.getSeconds(), duration.getNanos());
    }

    public Duration subtractTimestamp(Timestamp timestamp) {
        long j;
        long seconds = getSeconds() - timestamp.getSeconds();
        int nanos = getNanos() - timestamp.getNanos();
        int i = (seconds > 0L ? 1 : (seconds == 0L ? 0 : -1));
        if (i >= 0 || nanos <= 0) {
            if (i > 0 && nanos < 0) {
                seconds--;
                j = nanos + C.NANOS_PER_SECOND;
            }
            return Duration.create(seconds, nanos);
        }
        seconds++;
        j = nanos - C.NANOS_PER_SECOND;
        nanos = (int) j;
        return Duration.create(seconds, nanos);
    }

    @Override // java.lang.Comparable
    public int compareTo(Timestamp timestamp) {
        int compareLongs = TimeUtils.compareLongs(getSeconds(), timestamp.getSeconds());
        return compareLongs != 0 ? compareLongs : TimeUtils.compareLongs(getNanos(), timestamp.getNanos());
    }

    private Timestamp plus(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return ofEpochSecond(TimeUtils.checkedAdd(TimeUtils.checkedAdd(getSeconds(), j), j2 / C.NANOS_PER_SECOND), getNanos() + (j2 % C.NANOS_PER_SECOND));
    }

    private static Timestamp ofEpochSecond(long j, long j2) {
        return create(TimeUtils.checkedAdd(j, floorDiv(j2, C.NANOS_PER_SECOND)), (int) floorMod(j2, C.NANOS_PER_SECOND));
    }

    private static long floorDiv(long j, long j2) {
        return BigDecimal.valueOf(j).divide(BigDecimal.valueOf(j2), 0, RoundingMode.FLOOR).longValue();
    }

    private static long floorMod(long j, long j2) {
        return j - (floorDiv(j, j2) * j2);
    }
}
