package pg;
/* compiled from: NotificationConfig.kt */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final int f28414a;

    /* renamed from: b  reason: collision with root package name */
    public final int f28415b;

    public j(int i6, int i10) {
        this.f28414a = i6;
        this.f28415b = i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(smallIcon=");
        sb2.append(this.f28414a);
        sb2.append(", largeIcon=");
        return pl.a.g(sb2, this.f28415b, ", notificationColor=-1,isMultipleNotificationInDrawerEnabled=false, isBuildingBackStackEnabled=true, isLargeIconDisplayEnabled=true)");
    }
}
