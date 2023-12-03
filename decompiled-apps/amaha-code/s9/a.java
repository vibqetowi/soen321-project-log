package s9;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class a implements ServiceConnection {

    /* renamed from: u  reason: collision with root package name */
    public boolean f31318u = false;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedBlockingQueue f31319v = new LinkedBlockingQueue();

    public final IBinder a(TimeUnit timeUnit) {
        v9.o.g("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f31318u) {
            this.f31318u = true;
            IBinder iBinder = (IBinder) this.f31319v.poll(10000L, timeUnit);
            if (iBinder != null) {
                return iBinder;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f31319v.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
