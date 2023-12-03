package bw;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.Iterator;
/* compiled from: InvalidationHandler.java */
/* loaded from: classes2.dex */
public final class d extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<pl.droidsonroids.gif.b> f4732a;

    public d(pl.droidsonroids.gif.b bVar) {
        super(Looper.getMainLooper());
        this.f4732a = new WeakReference<>(bVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        pl.droidsonroids.gif.b bVar = this.f4732a.get();
        if (bVar == null) {
            return;
        }
        if (message.what == -1) {
            bVar.invalidateSelf();
            return;
        }
        Iterator<a> it = bVar.B.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }
}
