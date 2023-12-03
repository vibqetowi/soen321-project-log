package g6;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.locks.ReentrantLock;
import q.e;
/* compiled from: CustomTabPrefetchHelper.kt */
/* loaded from: classes.dex */
public final class c extends q.e {

    /* renamed from: v  reason: collision with root package name */
    public static q.c f16235v;

    /* renamed from: w  reason: collision with root package name */
    public static q.f f16236w;

    /* renamed from: x  reason: collision with root package name */
    public static final ReentrantLock f16237x = new ReentrantLock();

    /* compiled from: CustomTabPrefetchHelper.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static void a(Uri uri) {
            b();
            c.f16237x.lock();
            q.f fVar = c.f16236w;
            if (fVar != null) {
                Bundle bundle = new Bundle();
                PendingIntent pendingIntent = (PendingIntent) fVar.f29108z;
                if (pendingIntent != null) {
                    bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                }
                try {
                    ((a.b) fVar.f29105w).F0((a.a) fVar.f29106x, uri, bundle);
                } catch (RemoteException unused) {
                }
            }
            c.f16237x.unlock();
        }

        public static void b() {
            q.c cVar;
            q.f fVar;
            c.f16237x.lock();
            if (c.f16236w == null && (cVar = c.f16235v) != null) {
                q.b bVar = new q.b();
                a.b bVar2 = cVar.f29095a;
                if (bVar2.o0(bVar)) {
                    fVar = new q.f(bVar2, bVar, cVar.f29096b);
                    c.f16236w = fVar;
                }
                fVar = null;
                c.f16236w = fVar;
            }
            c.f16237x.unlock();
        }
    }

    @Override // q.e
    public final void a(ComponentName name, e.a aVar) {
        kotlin.jvm.internal.i.g(name, "name");
        try {
            aVar.f29095a.K1();
        } catch (RemoteException unused) {
        }
        f16235v = aVar;
        a.b();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        kotlin.jvm.internal.i.g(componentName, "componentName");
    }
}
