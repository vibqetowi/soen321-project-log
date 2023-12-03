package ad;

import bd.a;
/* compiled from: RetryManager.java */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: b  reason: collision with root package name */
    public long f512b = 0;

    /* renamed from: c  reason: collision with root package name */
    public long f513c = -1;

    /* renamed from: a  reason: collision with root package name */
    public final a.C0082a f511a = new a.C0082a();

    public final void a(int i6) {
        boolean z10;
        this.f512b++;
        if (i6 != 400 && i6 != 403 && i6 != 404) {
            z10 = false;
        } else {
            z10 = true;
        }
        a.C0082a c0082a = this.f511a;
        if (z10) {
            c0082a.getClass();
            this.f513c = System.currentTimeMillis() + 86400000;
            return;
        }
        double d10 = this.f512b;
        c0082a.getClass();
        this.f513c = Math.min((long) (Math.pow(2.0d, d10 * ((Math.random() * 0.5d) + 1.0d)) * 1000.0d), 14400000L) + System.currentTimeMillis();
    }
}
