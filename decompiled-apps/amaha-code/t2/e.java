package t2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.q;
/* compiled from: BroadcastReceiverConstraintTracker.kt */
/* loaded from: classes.dex */
public abstract class e<T> extends g<T> {
    public final d f;

    public e(Context context, y2.b bVar) {
        super(context, bVar);
        this.f = new d(this);
    }

    @Override // t2.g
    public final void d() {
        q.d().a(f.f32393a, getClass().getSimpleName().concat(": registering receiver"));
        this.f32395b.registerReceiver(this.f, f());
    }

    @Override // t2.g
    public final void e() {
        q.d().a(f.f32393a, getClass().getSimpleName().concat(": unregistering receiver"));
        this.f32395b.unregisterReceiver(this.f);
    }

    public abstract IntentFilter f();

    public abstract void g(Intent intent);
}
