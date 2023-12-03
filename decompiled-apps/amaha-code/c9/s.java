package c9;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
/* compiled from: SystemClock.java */
/* loaded from: classes.dex */
public final class s implements b {
    @Override // c9.b
    public final long a() {
        return SystemClock.uptimeMillis();
    }

    @Override // c9.b
    public final t b(Looper looper, Handler.Callback callback) {
        return new t(new Handler(looper, callback));
    }

    @Override // c9.b
    public final long d() {
        return SystemClock.elapsedRealtime();
    }

    @Override // c9.b
    public final void c() {
    }
}
