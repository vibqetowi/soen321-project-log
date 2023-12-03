package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import androidx.lifecycle.b0;
import androidx.lifecycle.j;
/* compiled from: ProcessLifecycleOwner.java */
/* loaded from: classes.dex */
public final class z implements p {
    public static final z C = new z();

    /* renamed from: y  reason: collision with root package name */
    public Handler f2475y;

    /* renamed from: u  reason: collision with root package name */
    public int f2471u = 0;

    /* renamed from: v  reason: collision with root package name */
    public int f2472v = 0;

    /* renamed from: w  reason: collision with root package name */
    public boolean f2473w = true;

    /* renamed from: x  reason: collision with root package name */
    public boolean f2474x = true;

    /* renamed from: z  reason: collision with root package name */
    public final q f2476z = new q(this);
    public final a A = new a();
    public final b B = new b();

    /* compiled from: ProcessLifecycleOwner.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            z zVar = z.this;
            int i6 = zVar.f2472v;
            q qVar = zVar.f2476z;
            if (i6 == 0) {
                zVar.f2473w = true;
                qVar.f(j.b.ON_PAUSE);
            }
            if (zVar.f2471u == 0 && zVar.f2473w) {
                qVar.f(j.b.ON_STOP);
                zVar.f2474x = true;
            }
        }
    }

    /* compiled from: ProcessLifecycleOwner.java */
    /* loaded from: classes.dex */
    public class b implements b0.a {
        public b() {
        }
    }

    /* compiled from: ProcessLifecycleOwner.java */
    /* loaded from: classes.dex */
    public static class c {
        public static void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    public final void a() {
        int i6 = this.f2472v + 1;
        this.f2472v = i6;
        if (i6 == 1) {
            if (this.f2473w) {
                this.f2476z.f(j.b.ON_RESUME);
                this.f2473w = false;
                return;
            }
            this.f2475y.removeCallbacks(this.A);
        }
    }

    @Override // androidx.lifecycle.p
    public final j getLifecycle() {
        return this.f2476z;
    }
}
