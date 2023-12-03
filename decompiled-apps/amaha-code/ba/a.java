package ba;

import c4.u;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* renamed from: u  reason: collision with root package name */
    public final String f4216u;

    /* renamed from: v  reason: collision with root package name */
    public final ThreadFactory f4217v = Executors.defaultThreadFactory();

    public a(String str) {
        this.f4216u = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f4217v.newThread(new u(runnable));
        newThread.setName(this.f4216u);
        return newThread;
    }
}
