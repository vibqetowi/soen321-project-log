package jh;
/* compiled from: UserSession.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f22030a;

    /* renamed from: b  reason: collision with root package name */
    public final String f22031b;

    /* renamed from: c  reason: collision with root package name */
    public a f22032c;

    /* renamed from: d  reason: collision with root package name */
    public long f22033d;

    public b(String str, String str2, a aVar, long j10) {
        this.f22030a = str;
        this.f22031b = str2;
        this.f22032c = aVar;
        this.f22033d = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f22033d != bVar.f22033d || !this.f22030a.equals(bVar.f22030a) || !this.f22031b.equals(bVar.f22031b)) {
            return false;
        }
        a aVar = this.f22032c;
        if (aVar != null) {
            return aVar.equals(bVar.f22032c);
        }
        if (bVar.f22032c == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "{sessionId : '" + this.f22030a + "', startTime : '" + this.f22031b + "', trafficSource : " + this.f22032c + ", lastInteractionTime : " + this.f22033d + '}';
    }
}
