package p9;

import android.os.Looper;
import java.util.Locale;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class n {
    public static final b f = new b("RequestTracker");

    /* renamed from: g  reason: collision with root package name */
    public static final Object f28041g = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final long f28042a;

    /* renamed from: d  reason: collision with root package name */
    public m f28045d;

    /* renamed from: e  reason: collision with root package name */
    public c4.u f28046e;

    /* renamed from: c  reason: collision with root package name */
    public long f28044c = -1;

    /* renamed from: b  reason: collision with root package name */
    public final com.google.android.gms.internal.cast.f f28043b = new com.google.android.gms.internal.cast.f(Looper.getMainLooper());

    public n(long j10) {
        this.f28042a = j10;
    }

    public final void a(long j10, m mVar) {
        m mVar2;
        long j11;
        Object obj = f28041g;
        synchronized (obj) {
            mVar2 = this.f28045d;
            j11 = this.f28044c;
            this.f28044c = j10;
            this.f28045d = mVar;
        }
        if (mVar2 != null) {
            mVar2.d(j11);
        }
        synchronized (obj) {
            c4.u uVar = this.f28046e;
            if (uVar != null) {
                this.f28043b.removeCallbacks(uVar);
            }
            c4.u uVar2 = new c4.u(6, this);
            this.f28046e = uVar2;
            this.f28043b.postDelayed(uVar2, this.f28042a);
        }
    }

    public final boolean b() {
        boolean z10;
        synchronized (f28041g) {
            if (this.f28044c != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final boolean c(long j10) {
        boolean z10;
        synchronized (f28041g) {
            long j11 = this.f28044c;
            z10 = false;
            if (j11 != -1 && j11 == j10) {
                z10 = true;
            }
        }
        return z10;
    }

    public final void d(int i6, long j10, k kVar) {
        synchronized (f28041g) {
            long j11 = this.f28044c;
            if (j11 != -1 && j11 == j10) {
                f(i6, kVar, String.format(Locale.ROOT, "request %d completed", Long.valueOf(j10)));
            }
        }
    }

    public final boolean e(int i6) {
        synchronized (f28041g) {
            long j10 = this.f28044c;
            if (j10 == -1) {
                return false;
            }
            f(i6, null, String.format(Locale.ROOT, "clearing request %d", Long.valueOf(j10)));
            return true;
        }
    }

    public final void f(int i6, k kVar, String str) {
        f.b(str, new Object[0]);
        Object obj = f28041g;
        synchronized (obj) {
            m mVar = this.f28045d;
            if (mVar != null) {
                mVar.e(i6, this.f28044c, kVar);
            }
            this.f28044c = -1L;
            this.f28045d = null;
            synchronized (obj) {
                c4.u uVar = this.f28046e;
                if (uVar != null) {
                    this.f28043b.removeCallbacks(uVar);
                    this.f28046e = null;
                }
            }
        }
    }
}
