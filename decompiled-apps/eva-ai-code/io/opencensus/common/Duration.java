package io.opencensus.common;

import com.google.protobuf.util.TimeUtil;
import java.util.concurrent.TimeUnit;
/* loaded from: classes4.dex */
public abstract class Duration implements Comparable<Duration> {
    public abstract int getNanos();

    public abstract long getSeconds();

    public static Duration create(long j, int i) {
        if (j < TimeUtil.DURATION_SECONDS_MIN) {
            throw new IllegalArgumentException("'seconds' is less than minimum (-315576000000): " + j);
        } else if (j > TimeUtil.DURATION_SECONDS_MAX) {
            throw new IllegalArgumentException("'seconds' is greater than maximum (315576000000): " + j);
        } else if (i < -999999999) {
            throw new IllegalArgumentException("'nanos' is less than minimum (-999999999): " + i);
        } else if (i > 999999999) {
            throw new IllegalArgumentException("'nanos' is greater than maximum (999999999): " + i);
        } else {
            int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if ((i2 < 0 && i > 0) || (i2 > 0 && i < 0)) {
                throw new IllegalArgumentException("'seconds' and 'nanos' have inconsistent sign: seconds=" + j + ", nanos=" + i);
            }
            return new AutoValue_Duration(j, i);
        }
    }

    public static Duration fromMillis(long j) {
        return create(j / 1000, (int) ((j % 1000) * 1000000));
    }

    public long toMillis() {
        return TimeUnit.SECONDS.toMillis(getSeconds()) + TimeUnit.NANOSECONDS.toMillis(getNanos());
    }

    @Override // java.lang.Comparable
    public int compareTo(Duration duration) {
        int compareLongs = TimeUtils.compareLongs(getSeconds(), duration.getSeconds());
        return compareLongs != 0 ? compareLongs : TimeUtils.compareLongs(getNanos(), duration.getNanos());
    }
}
