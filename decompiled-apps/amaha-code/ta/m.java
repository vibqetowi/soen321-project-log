package ta;

import android.os.Handler;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: d  reason: collision with root package name */
    public static volatile com.google.android.gms.internal.measurement.f0 f32735d;

    /* renamed from: a  reason: collision with root package name */
    public final f4 f32736a;

    /* renamed from: b  reason: collision with root package name */
    public final androidx.work.n f32737b;

    /* renamed from: c  reason: collision with root package name */
    public volatile long f32738c;

    public m(f4 f4Var) {
        v9.o.h(f4Var);
        this.f32736a = f4Var;
        this.f32737b = new androidx.work.n(this, f4Var, 12);
    }

    public final void a() {
        this.f32738c = 0L;
        d().removeCallbacks(this.f32737b);
    }

    public abstract void b();

    public final void c(long j10) {
        a();
        if (j10 >= 0) {
            ((kotlin.jvm.internal.b0) this.f32736a.c()).getClass();
            this.f32738c = System.currentTimeMillis();
            if (!d().postDelayed(this.f32737b, j10)) {
                this.f32736a.b().f32925z.c(Long.valueOf(j10), "Failed to schedule delayed post. time");
            }
        }
    }

    public final Handler d() {
        com.google.android.gms.internal.measurement.f0 f0Var;
        if (f32735d != null) {
            return f32735d;
        }
        synchronized (m.class) {
            if (f32735d == null) {
                f32735d = new com.google.android.gms.internal.measurement.f0(this.f32736a.f().getMainLooper());
            }
            f0Var = f32735d;
        }
        return f0Var;
    }
}
