package t2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import androidx.work.q;
/* compiled from: NetworkStateTracker.kt */
/* loaded from: classes.dex */
public final class l extends e<r2.b> {

    /* renamed from: g  reason: collision with root package name */
    public final ConnectivityManager f32403g;

    public l(Context context, y2.b bVar) {
        super(context, bVar);
        Object systemService = this.f32395b.getSystemService("connectivity");
        kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f32403g = (ConnectivityManager) systemService;
    }

    @Override // t2.g
    public final Object a() {
        return k.a(this.f32403g);
    }

    @Override // t2.e
    public final IntentFilter f() {
        return new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    }

    @Override // t2.e
    public final void g(Intent intent) {
        kotlin.jvm.internal.i.g(intent, "intent");
        if (kotlin.jvm.internal.i.b(intent.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
            q.d().a(k.f32402a, "Network broadcast received");
            c(k.a(this.f32403g));
        }
    }
}
