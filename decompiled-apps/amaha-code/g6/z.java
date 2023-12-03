package g6;

import java.util.Set;
/* compiled from: LoginResult.kt */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public final h5.a f16349a;

    /* renamed from: b  reason: collision with root package name */
    public final h5.h f16350b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<String> f16351c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<String> f16352d;

    public z(h5.a aVar, h5.h hVar, Set<String> set, Set<String> set2) {
        this.f16349a = aVar;
        this.f16350b = hVar;
        this.f16351c = set;
        this.f16352d = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (kotlin.jvm.internal.i.b(this.f16349a, zVar.f16349a) && kotlin.jvm.internal.i.b(this.f16350b, zVar.f16350b) && kotlin.jvm.internal.i.b(this.f16351c, zVar.f16351c) && kotlin.jvm.internal.i.b(this.f16352d, zVar.f16352d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f16349a.hashCode() * 31;
        h5.h hVar = this.f16350b;
        if (hVar == null) {
            hashCode = 0;
        } else {
            hashCode = hVar.hashCode();
        }
        int hashCode3 = this.f16351c.hashCode();
        return this.f16352d.hashCode() + ((hashCode3 + ((hashCode2 + hashCode) * 31)) * 31);
    }

    public final String toString() {
        return "LoginResult(accessToken=" + this.f16349a + ", authenticationToken=" + this.f16350b + ", recentlyGrantedPermissions=" + this.f16351c + ", recentlyDeniedPermissions=" + this.f16352d + ')';
    }
}
