package ne;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: AndroidConnectivityMonitor.java */
/* loaded from: classes.dex */
public final class d implements ComponentCallbacks2 {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f26201u;

    public d(AtomicBoolean atomicBoolean) {
        this.f26201u = atomicBoolean;
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i6) {
        if (i6 == 20) {
            this.f26201u.set(true);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
