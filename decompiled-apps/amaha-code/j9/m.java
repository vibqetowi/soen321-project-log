package j9;

import android.content.Context;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: com.google.android.gms:play-services-auth@@20.4.1 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: b  reason: collision with root package name */
    public static m f21765b;

    /* renamed from: a  reason: collision with root package name */
    public final b f21766a;

    public m(Context context) {
        b a10 = b.a(context);
        this.f21766a = a10;
        a10.b();
        a10.c();
    }

    public static synchronized m a(Context context) {
        m c10;
        synchronized (m.class) {
            c10 = c(context.getApplicationContext());
        }
        return c10;
    }

    public static synchronized m c(Context context) {
        synchronized (m.class) {
            m mVar = f21765b;
            if (mVar != null) {
                return mVar;
            }
            m mVar2 = new m(context);
            f21765b = mVar2;
            return mVar2;
        }
    }

    public final synchronized void b() {
        b bVar = this.f21766a;
        ReentrantLock reentrantLock = bVar.f21755a;
        reentrantLock.lock();
        bVar.f21756b.edit().clear().apply();
        reentrantLock.unlock();
    }
}
