package c4;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: com.android.billingclient:billing@@5.0.0 */
/* loaded from: classes.dex */
public final class v implements ThreadFactory {

    /* renamed from: u  reason: collision with root package name */
    public final ThreadFactory f4961u = Executors.defaultThreadFactory();

    /* renamed from: v  reason: collision with root package name */
    public final AtomicInteger f4962v = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f4961u.newThread(runnable);
        int andIncrement = this.f4962v.getAndIncrement();
        newThread.setName("PlayBillingLibrary-" + andIncrement);
        return newThread;
    }
}
