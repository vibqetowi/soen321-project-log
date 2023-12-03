package af;

import af.a;
import java.lang.ref.WeakReference;
/* compiled from: AppStateUpdateHandler.java */
/* loaded from: classes.dex */
public abstract class b implements a.b {
    private final WeakReference<a.b> appStateCallback;
    private final a appStateMonitor;
    private lf.d currentAppState;
    private boolean isRegisteredForAppState;

    public b() {
        this(a.a());
    }

    public lf.d getAppState() {
        return this.currentAppState;
    }

    public WeakReference<a.b> getAppStateCallback() {
        return this.appStateCallback;
    }

    public void incrementTsnsCount(int i6) {
        this.appStateMonitor.B.addAndGet(i6);
    }

    @Override // af.a.b
    public void onUpdateAppState(lf.d dVar) {
        lf.d dVar2 = this.currentAppState;
        lf.d dVar3 = lf.d.APPLICATION_PROCESS_STATE_UNKNOWN;
        if (dVar2 == dVar3) {
            this.currentAppState = dVar;
        } else if (dVar2 != dVar && dVar != dVar3) {
            this.currentAppState = lf.d.FOREGROUND_BACKGROUND;
        }
    }

    public void registerForAppState() {
        if (this.isRegisteredForAppState) {
            return;
        }
        a aVar = this.appStateMonitor;
        this.currentAppState = aVar.I;
        aVar.d(this.appStateCallback);
        this.isRegisteredForAppState = true;
    }

    public void unregisterForAppState() {
        if (!this.isRegisteredForAppState) {
            return;
        }
        a aVar = this.appStateMonitor;
        WeakReference<a.b> weakReference = this.appStateCallback;
        synchronized (aVar.f534z) {
            aVar.f534z.remove(weakReference);
        }
        this.isRegisteredForAppState = false;
    }

    public b(a aVar) {
        this.isRegisteredForAppState = false;
        this.currentAppState = lf.d.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.appStateMonitor = aVar;
        this.appStateCallback = new WeakReference<>(this);
    }
}
