package j7;

import com.google.auto.value.AutoValue;
import java.util.Map;
import java.util.Set;
/* compiled from: SchedulerConfig.java */
@AutoValue
/* loaded from: classes.dex */
public abstract class d {

    /* compiled from: SchedulerConfig.java */
    @AutoValue
    /* loaded from: classes.dex */
    public static abstract class a {

        /* compiled from: SchedulerConfig.java */
        @AutoValue.Builder
        /* renamed from: j7.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static abstract class AbstractC0323a {
        }

        public abstract long a();

        public abstract Set<b> b();

        public abstract long c();
    }

    /* compiled from: SchedulerConfig.java */
    /* loaded from: classes.dex */
    public enum b {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    public abstract m7.a a();

    public final long b(a7.d dVar, long j10, int i6) {
        long j11;
        long a10 = j10 - a().a();
        a aVar = c().get(dVar);
        long a11 = aVar.a();
        int i10 = i6 - 1;
        if (a11 > 1) {
            j11 = a11;
        } else {
            j11 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, i10) * a11 * Math.max(1.0d, Math.log(10000.0d) / Math.log(j11 * i10))), a10), aVar.c());
    }

    public abstract Map<a7.d, a> c();
}
