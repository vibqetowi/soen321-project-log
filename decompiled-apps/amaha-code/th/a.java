package th;

import com.google.android.gms.internal.p000firebaseauthapi.s5;
import kotlin.jvm.internal.i;
import u7.s;
/* compiled from: RemoteConfig.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f33010a;

    /* renamed from: b  reason: collision with root package name */
    public final mu.b f33011b;

    /* renamed from: c  reason: collision with root package name */
    public final ph.a f33012c;

    /* renamed from: d  reason: collision with root package name */
    public final fs.c f33013d;

    /* renamed from: e  reason: collision with root package name */
    public final ph.c f33014e;
    public final ph.b f;

    /* renamed from: g  reason: collision with root package name */
    public final s f33015g;

    /* renamed from: h  reason: collision with root package name */
    public final ih.g f33016h;

    /* renamed from: i  reason: collision with root package name */
    public final s5 f33017i;

    public a(boolean z10, mu.b bVar, ph.a aVar, fs.c cVar, ph.c cVar2, ph.b bVar2, s sVar, ih.g gVar, s5 s5Var) {
        this.f33010a = z10;
        this.f33011b = bVar;
        this.f33012c = aVar;
        this.f33013d = cVar;
        this.f33014e = cVar2;
        this.f = bVar2;
        this.f33015g = sVar;
        this.f33016h = gVar;
        this.f33017i = s5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f33010a == aVar.f33010a && i.b(this.f33011b, aVar.f33011b) && i.b(this.f33012c, aVar.f33012c) && i.b(this.f33013d, aVar.f33013d) && i.b(this.f33014e, aVar.f33014e) && i.b(this.f, aVar.f) && i.b(this.f33015g, aVar.f33015g) && i.b(this.f33016h, aVar.f33016h) && i.b(this.f33017i, aVar.f33017i)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    public final int hashCode() {
        boolean z10 = this.f33010a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int hashCode = this.f33011b.hashCode();
        int hashCode2 = this.f33012c.hashCode();
        int hashCode3 = this.f33013d.hashCode();
        int hashCode4 = this.f33014e.hashCode();
        int hashCode5 = this.f.hashCode();
        int hashCode6 = this.f33015g.hashCode();
        int hashCode7 = this.f33016h.hashCode();
        return this.f33017i.hashCode() + ((hashCode7 + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (r02 * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RemoteConfig(isAppEnabled=" + this.f33010a + ", moduleStatus=" + this.f33011b + ", dataTrackingConfig=" + this.f33012c + ", analyticsConfig=" + this.f33013d + ", pushConfig=" + this.f33014e + ", logConfig=" + this.f + ", rttConfig=" + this.f33015g + ", inAppConfig=" + this.f33016h + ", securityConfig=" + this.f33017i + ')';
    }
}
