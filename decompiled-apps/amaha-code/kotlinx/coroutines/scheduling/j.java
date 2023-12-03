package kotlinx.coroutines.scheduling;

import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.s;
/* compiled from: Tasks.kt */
/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final long f23674a = sp.b.a0("kotlinx.coroutines.scheduler.resolution.ns", 100000, 1, Long.MAX_VALUE);

    /* renamed from: b  reason: collision with root package name */
    public static final int f23675b;

    /* renamed from: c  reason: collision with root package name */
    public static final int f23676c;

    /* renamed from: d  reason: collision with root package name */
    public static final long f23677d;

    /* renamed from: e  reason: collision with root package name */
    public static final e f23678e;
    public static final df.b f;

    /* renamed from: g  reason: collision with root package name */
    public static final df.b f23679g;

    static {
        int i6 = s.f23616a;
        if (i6 < 2) {
            i6 = 2;
        }
        f23675b = sp.b.b0("kotlinx.coroutines.scheduler.core.pool.size", i6, 1, 0, 8);
        f23676c = sp.b.b0("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        f23677d = TimeUnit.SECONDS.toNanos(sp.b.a0("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f23678e = e.f23669b;
        f = new df.b(0);
        f23679g = new df.b(1);
    }
}
