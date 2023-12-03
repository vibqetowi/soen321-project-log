package androidx.work;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: Configuration.java */
/* loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* renamed from: u  reason: collision with root package name */
    public final AtomicInteger f3212u = new AtomicInteger(0);

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ boolean f3213v;

    public a(boolean z10) {
        this.f3213v = z10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str;
        if (this.f3213v) {
            str = "WM.task-";
        } else {
            str = "androidx.work-";
        }
        StringBuilder c10 = v.h.c(str);
        c10.append(this.f3212u.incrementAndGet());
        return new Thread(runnable, c10.toString());
    }
}
