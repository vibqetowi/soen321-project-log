package tr;

import java.util.Arrays;
import nc.f;
/* compiled from: InternalChannelz.java */
/* loaded from: classes2.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final String f33572a;

    /* renamed from: b  reason: collision with root package name */
    public final a f33573b;

    /* renamed from: c  reason: collision with root package name */
    public final long f33574c;

    /* renamed from: d  reason: collision with root package name */
    public final v f33575d;

    /* renamed from: e  reason: collision with root package name */
    public final v f33576e;

    /* compiled from: InternalChannelz.java */
    /* loaded from: classes2.dex */
    public enum a {
        /* JADX INFO: Fake field, exist only in values array */
        CT_UNKNOWN,
        CT_INFO,
        CT_WARNING,
        CT_ERROR
    }

    public t(String str, a aVar, long j10, v vVar) {
        this.f33572a = str;
        sc.b.w(aVar, "severity");
        this.f33573b = aVar;
        this.f33574c = j10;
        this.f33575d = null;
        this.f33576e = vVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (!f6.b.v0(this.f33572a, tVar.f33572a) || !f6.b.v0(this.f33573b, tVar.f33573b) || this.f33574c != tVar.f33574c || !f6.b.v0(this.f33575d, tVar.f33575d) || !f6.b.v0(this.f33576e, tVar.f33576e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f33572a, this.f33573b, Long.valueOf(this.f33574c), this.f33575d, this.f33576e});
    }

    public final String toString() {
        f.a c10 = nc.f.c(this);
        c10.c(this.f33572a, "description");
        c10.c(this.f33573b, "severity");
        c10.b(this.f33574c, "timestampNanos");
        c10.c(this.f33575d, "channelRef");
        c10.c(this.f33576e, "subchannelRef");
        return c10.toString();
    }
}
