package nd;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: ExecutorUtils.java */
/* loaded from: classes.dex */
public final class e0 implements ThreadFactory {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ String f26047u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ AtomicLong f26048v;

    /* compiled from: ExecutorUtils.java */
    /* loaded from: classes.dex */
    public class a extends c {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Runnable f26049u;

        public a(Runnable runnable) {
            this.f26049u = runnable;
        }

        @Override // nd.c
        public final void a() {
            this.f26049u.run();
        }
    }

    public e0(String str, AtomicLong atomicLong) {
        this.f26047u = str;
        this.f26048v = atomicLong;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = Executors.defaultThreadFactory().newThread(new a(runnable));
        newThread.setName(this.f26047u + this.f26048v.getAndIncrement());
        return newThread;
    }
}
