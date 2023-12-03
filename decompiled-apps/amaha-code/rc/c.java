package rc;

import j$.util.Objects;
import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: ThreadFactoryBuilder.java */
/* loaded from: classes.dex */
public final class c implements ThreadFactory {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ThreadFactory f30655u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f30656v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ AtomicLong f30657w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Boolean f30658x;

    public c(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool) {
        this.f30655u = threadFactory;
        this.f30656v = str;
        this.f30657w = atomicLong;
        this.f30658x = bool;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f30655u.newThread(runnable);
        String str = this.f30656v;
        if (str != null) {
            AtomicLong atomicLong = this.f30657w;
            Objects.requireNonNull(atomicLong);
            newThread.setName(String.format(Locale.ROOT, str, Long.valueOf(atomicLong.getAndIncrement())));
        }
        Boolean bool = this.f30658x;
        if (bool != null) {
            newThread.setDaemon(bool.booleanValue());
        }
        return newThread;
    }
}
