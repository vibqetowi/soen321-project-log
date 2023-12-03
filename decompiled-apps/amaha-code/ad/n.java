package ad;

import android.app.Application;
import android.content.Context;
import bd.a;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import v9.o;
/* compiled from: TokenRefreshManager.java */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final g f522a;

    /* renamed from: b  reason: collision with root package name */
    public final bd.a f523b;

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f524c;

    /* renamed from: d  reason: collision with root package name */
    public volatile int f525d;

    /* renamed from: e  reason: collision with root package name */
    public volatile long f526e;
    public volatile boolean f;

    public n(Context context, d dVar, @yc.c Executor executor, @yc.b ScheduledExecutorService scheduledExecutorService) {
        o.h(context);
        o.h(dVar);
        g gVar = new g(dVar, executor, scheduledExecutorService);
        a.C0082a c0082a = new a.C0082a();
        this.f522a = gVar;
        this.f523b = c0082a;
        this.f526e = -1L;
        com.google.android.gms.common.api.internal.b.b((Application) context.getApplicationContext());
        com.google.android.gms.common.api.internal.b.f7338y.a(new m(this, gVar, c0082a));
    }

    public final boolean a() {
        if (this.f && !this.f524c && this.f525d > 0 && this.f526e != -1) {
            return true;
        }
        return false;
    }
}
