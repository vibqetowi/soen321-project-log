package t2;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.work.q;
/* compiled from: NetworkStateTracker.kt */
/* loaded from: classes.dex */
public final class j extends g<r2.b> {
    public final ConnectivityManager f;

    /* renamed from: g  reason: collision with root package name */
    public final i f32401g;

    public j(Context context, y2.b bVar) {
        super(context, bVar);
        Object systemService = this.f32395b.getSystemService("connectivity");
        kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f = (ConnectivityManager) systemService;
        this.f32401g = new i(this);
    }

    @Override // t2.g
    public final r2.b a() {
        return k.a(this.f);
    }

    @Override // t2.g
    public final void d() {
        try {
            q.d().a(k.f32402a, "Registering network callback");
            w2.k.a(this.f, this.f32401g);
        } catch (IllegalArgumentException e10) {
            q.d().c(k.f32402a, "Received exception while registering network callback", e10);
        } catch (SecurityException e11) {
            q.d().c(k.f32402a, "Received exception while registering network callback", e11);
        }
    }

    @Override // t2.g
    public final void e() {
        try {
            q.d().a(k.f32402a, "Unregistering network callback");
            w2.i.c(this.f, this.f32401g);
        } catch (IllegalArgumentException e10) {
            q.d().c(k.f32402a, "Received exception while unregistering network callback", e10);
        } catch (SecurityException e11) {
            q.d().c(k.f32402a, "Received exception while unregistering network callback", e11);
        }
    }
}
