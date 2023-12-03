package si;

import kotlin.jvm.internal.i;
/* compiled from: InAppCampaign.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f31589a;

    /* renamed from: b  reason: collision with root package name */
    public final String f31590b;

    /* renamed from: c  reason: collision with root package name */
    public final long f31591c;

    /* renamed from: d  reason: collision with root package name */
    public final a f31592d;

    /* renamed from: e  reason: collision with root package name */
    public final f8.g f31593e;

    public e(String campaignType, String status, long j10, a aVar, f8.g campaignState) {
        i.g(campaignType, "campaignType");
        i.g(status, "status");
        i.g(campaignState, "campaignState");
        this.f31589a = campaignType;
        this.f31590b = status;
        this.f31591c = j10;
        this.f31592d = aVar;
        this.f31593e = campaignState;
    }

    public final String toString() {
        return "InAppCampaign(campaignType='" + this.f31589a + "', status='" + this.f31590b + "', deletionTime=" + this.f31591c + ", campaignMeta=" + this.f31592d + ", campaignState=" + this.f31593e + ')';
    }
}
