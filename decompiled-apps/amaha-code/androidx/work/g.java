package androidx.work;

import android.app.Notification;
/* compiled from: ForegroundInfo.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final int f3245a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3246b;

    /* renamed from: c  reason: collision with root package name */
    public final Notification f3247c;

    public g(int i6, int i10, Notification notification) {
        this.f3245a = i6;
        this.f3247c = notification;
        this.f3246b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f3245a != gVar.f3245a || this.f3246b != gVar.f3246b) {
            return false;
        }
        return this.f3247c.equals(gVar.f3247c);
    }

    public final int hashCode() {
        return this.f3247c.hashCode() + (((this.f3245a * 31) + this.f3246b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f3245a + ", mForegroundServiceType=" + this.f3246b + ", mNotification=" + this.f3247c + '}';
    }
}
