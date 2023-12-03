package nc;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import nc.o;
/* compiled from: Stopwatch.java */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final o.a f26010a = o.f26015a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f26011b;

    /* renamed from: c  reason: collision with root package name */
    public long f26012c;

    /* compiled from: Stopwatch.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f26013a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f26013a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26013a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26013a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26013a[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26013a[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26013a[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f26013a[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public final long a(TimeUnit timeUnit) {
        long j10 = 0;
        if (this.f26011b) {
            this.f26010a.getClass();
            int i6 = g.f26000a;
            j10 = 0 + (System.nanoTime() - this.f26012c);
        }
        return timeUnit.convert(j10, TimeUnit.NANOSECONDS);
    }

    public final void b() {
        sc.b.B("This stopwatch is already running.", !this.f26011b);
        this.f26011b = true;
        this.f26010a.getClass();
        int i6 = g.f26000a;
        this.f26012c = System.nanoTime();
    }

    public final String toString() {
        long j10;
        String str;
        if (this.f26011b) {
            this.f26010a.getClass();
            int i6 = g.f26000a;
            j10 = (System.nanoTime() - this.f26012c) + 0;
        } else {
            j10 = 0;
        }
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(j10, timeUnit2) <= 0) {
            timeUnit = TimeUnit.HOURS;
            if (timeUnit.convert(j10, timeUnit2) <= 0) {
                timeUnit = TimeUnit.MINUTES;
                if (timeUnit.convert(j10, timeUnit2) <= 0) {
                    timeUnit = TimeUnit.SECONDS;
                    if (timeUnit.convert(j10, timeUnit2) <= 0) {
                        timeUnit = TimeUnit.MILLISECONDS;
                        if (timeUnit.convert(j10, timeUnit2) <= 0) {
                            timeUnit = TimeUnit.MICROSECONDS;
                            if (timeUnit.convert(j10, timeUnit2) <= 0) {
                                timeUnit = timeUnit2;
                            }
                        }
                    }
                }
            }
        }
        double convert = j10 / timeUnit2.convert(1L, timeUnit);
        int i10 = g.f26000a;
        String format = String.format(Locale.ROOT, "%.4g", Double.valueOf(convert));
        switch (a.f26013a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        StringBuilder sb2 = new StringBuilder(str.length() + ri.e.c(format, 1));
        sb2.append(format);
        sb2.append(" ");
        sb2.append(str);
        return sb2.toString();
    }
}
