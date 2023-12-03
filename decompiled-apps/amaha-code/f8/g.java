package f8;
/* compiled from: C2Mp3TimestampTracker.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14906a = 0;

    /* renamed from: b  reason: collision with root package name */
    public long f14907b;

    /* renamed from: c  reason: collision with root package name */
    public long f14908c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f14909d;

    public g() {
    }

    public final String toString() {
        switch (this.f14906a) {
            case 1:
                StringBuilder sb2 = new StringBuilder("CampaignState(showCount=");
                sb2.append(this.f14907b);
                sb2.append(", lastShowTime=");
                sb2.append(this.f14908c);
                sb2.append(", isClicked=");
                return defpackage.c.t(sb2, this.f14909d, ')');
            default:
                return super.toString();
        }
    }

    public g(long j10, long j11, boolean z10) {
        this.f14907b = j10;
        this.f14908c = j11;
        this.f14909d = z10;
    }
}
