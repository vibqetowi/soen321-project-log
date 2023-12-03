package i5;

import android.preference.PreferenceManager;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: AnalyticsUserIDStore.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f19836a = new c();

    /* renamed from: b  reason: collision with root package name */
    public static final String f19837b = c.class.getSimpleName();

    /* renamed from: c  reason: collision with root package name */
    public static final ReentrantReadWriteLock f19838c = new ReentrantReadWriteLock();

    /* renamed from: d  reason: collision with root package name */
    public static String f19839d;

    /* renamed from: e  reason: collision with root package name */
    public static volatile boolean f19840e;

    public static void a() {
        if (f19840e) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f19838c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (!f19840e) {
                f19839d = PreferenceManager.getDefaultSharedPreferences(h5.p.a()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
                f19840e = true;
            }
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th2) {
            f19838c.writeLock().unlock();
            throw th2;
        }
    }
}
