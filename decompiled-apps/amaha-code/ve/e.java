package ve;

import java.util.concurrent.TimeUnit;
import se.j;
/* compiled from: RequestLimiter.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: d  reason: collision with root package name */
    public static final long f34990d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e  reason: collision with root package name */
    public static final long f34991e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a  reason: collision with root package name */
    public final j f34992a = j.a();

    /* renamed from: b  reason: collision with root package name */
    public long f34993b;

    /* renamed from: c  reason: collision with root package name */
    public int f34994c;

    public final synchronized long a(int i6) {
        boolean z10;
        if (i6 != 429 && (i6 < 500 || i6 >= 600)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return f34990d;
        }
        double pow = Math.pow(2.0d, this.f34994c);
        this.f34992a.getClass();
        return (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), f34991e);
    }

    public final synchronized boolean b() {
        boolean z10;
        if (this.f34994c != 0) {
            this.f34992a.f31490a.getClass();
            if (System.currentTimeMillis() <= this.f34993b) {
                z10 = false;
            }
        }
        z10 = true;
        return z10;
    }

    public final synchronized void c() {
        this.f34994c = 0;
    }

    public final synchronized void d(int i6) {
        boolean z10;
        if ((i6 < 200 || i6 >= 300) && i6 != 401 && i6 != 404) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            c();
            return;
        }
        this.f34994c++;
        long a10 = a(i6);
        this.f34992a.f31490a.getClass();
        this.f34993b = System.currentTimeMillis() + a10;
    }
}
