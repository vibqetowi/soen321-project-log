package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.j;
import androidx.lifecycle.m;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements e2.b<p> {
    @Override // e2.b
    public final List<Class<? extends e2.b<?>>> a() {
        return Collections.emptyList();
    }

    @Override // e2.b
    public final p b(Context context) {
        if (e2.a.c(context).f13727b.contains(ProcessLifecycleInitializer.class)) {
            if (!m.f2439a.getAndSet(true)) {
                ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new m.a());
            }
            z zVar = z.C;
            zVar.getClass();
            zVar.f2475y = new Handler();
            zVar.f2476z.f(j.b.ON_CREATE);
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new a0(zVar));
            return zVar;
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily. \nPlease ensure that you have: \n<meta-data\n    android:name='androidx.lifecycle.ProcessLifecycleInitializer' \n    android:value='androidx.startup' /> \nunder InitializationProvider in your AndroidManifest.xml");
    }
}
