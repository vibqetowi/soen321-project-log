package androidx.lifecycle;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.j;
import androidx.lifecycle.z;
/* compiled from: ProcessLifecycleOwner.java */
/* loaded from: classes.dex */
public final class a0 extends e {
    final /* synthetic */ z this$0;

    /* compiled from: ProcessLifecycleOwner.java */
    /* loaded from: classes.dex */
    public class a extends e {
        public a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            a0.this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            z zVar = a0.this.this$0;
            int i6 = zVar.f2471u + 1;
            zVar.f2471u = i6;
            if (i6 == 1 && zVar.f2474x) {
                zVar.f2476z.f(j.b.ON_START);
                zVar.f2474x = false;
            }
        }
    }

    public a0(z zVar) {
        this.this$0 = zVar;
    }

    @Override // androidx.lifecycle.e, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 29) {
            int i6 = b0.f2383v;
            ((b0) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).f2384u = this.this$0.B;
        }
    }

    @Override // androidx.lifecycle.e, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        z zVar = this.this$0;
        int i6 = zVar.f2472v - 1;
        zVar.f2472v = i6;
        if (i6 == 0) {
            zVar.f2475y.postDelayed(zVar.A, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        z.c.a(activity, new a());
    }

    @Override // androidx.lifecycle.e, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        z zVar = this.this$0;
        int i6 = zVar.f2471u - 1;
        zVar.f2471u = i6;
        if (i6 == 0 && zVar.f2473w) {
            zVar.f2476z.f(j.b.ON_STOP);
            zVar.f2474x = true;
        }
    }
}
