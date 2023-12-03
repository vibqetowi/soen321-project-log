package mh;

import kotlin.jvm.internal.i;
import v.g;
/* compiled from: InboxEntity.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final long f25062a;

    /* renamed from: b  reason: collision with root package name */
    public final String f25063b;

    /* renamed from: c  reason: collision with root package name */
    public final int f25064c;

    /* renamed from: d  reason: collision with root package name */
    public final String f25065d;

    /* renamed from: e  reason: collision with root package name */
    public final long f25066e;
    public final long f;

    /* renamed from: g  reason: collision with root package name */
    public final String f25067g;

    public d(String campaignId, String tag, long j10, long j11, String str) {
        i.g(campaignId, "campaignId");
        i.g(tag, "tag");
        this.f25062a = -1L;
        this.f25063b = campaignId;
        this.f25064c = 0;
        this.f25065d = tag;
        this.f25066e = j10;
        this.f = j11;
        this.f25067g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f25062a == dVar.f25062a && i.b(this.f25063b, dVar.f25063b) && this.f25064c == dVar.f25064c && i.b(this.f25065d, dVar.f25065d) && this.f25066e == dVar.f25066e && this.f == dVar.f && i.b(this.f25067g, dVar.f25067g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f25062a;
        String str = this.f25063b;
        int c10 = pl.a.c(this.f25065d, (pl.a.c(str, ((int) (j10 ^ (j10 >>> 32))) * 31, 31) + this.f25064c) * 31, 31);
        long j11 = this.f25066e;
        long j12 = this.f;
        return this.f25067g.hashCode() + ((((c10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) ((j12 >>> 32) ^ j12))) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InboxEntity(id=");
        sb2.append(this.f25062a);
        sb2.append(", campaignId=");
        sb2.append(this.f25063b);
        sb2.append(", isClicked=");
        sb2.append(this.f25064c);
        sb2.append(", tag=");
        sb2.append(this.f25065d);
        sb2.append(", receivedTime=");
        sb2.append(this.f25066e);
        sb2.append(", expiry=");
        sb2.append(this.f);
        sb2.append(", payload=");
        return g.c(sb2, this.f25067g, ')');
    }
}
