package id;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: CustomThreadFactory.java */
/* loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* renamed from: y  reason: collision with root package name */
    public static final ThreadFactory f19956y = Executors.defaultThreadFactory();

    /* renamed from: u  reason: collision with root package name */
    public final AtomicLong f19957u = new AtomicLong();

    /* renamed from: v  reason: collision with root package name */
    public final String f19958v;

    /* renamed from: w  reason: collision with root package name */
    public final int f19959w;

    /* renamed from: x  reason: collision with root package name */
    public final StrictMode.ThreadPolicy f19960x;

    public a(String str, int i6, StrictMode.ThreadPolicy threadPolicy) {
        this.f19958v = str;
        this.f19959w = i6;
        this.f19960x = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = f19956y.newThread(new q7.f(this, 15, runnable));
        newThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f19958v, Long.valueOf(this.f19957u.getAndIncrement())));
        return newThread;
    }
}
