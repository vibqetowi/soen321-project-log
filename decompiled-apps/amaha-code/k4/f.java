package k4;

import java.security.MessageDigest;
/* compiled from: DataCacheKey.java */
/* loaded from: classes.dex */
public final class f implements h4.e {

    /* renamed from: b  reason: collision with root package name */
    public final h4.e f22838b;

    /* renamed from: c  reason: collision with root package name */
    public final h4.e f22839c;

    public f(h4.e eVar, h4.e eVar2) {
        this.f22838b = eVar;
        this.f22839c = eVar2;
    }

    @Override // h4.e
    public final void a(MessageDigest messageDigest) {
        this.f22838b.a(messageDigest);
        this.f22839c.a(messageDigest);
    }

    @Override // h4.e
    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!this.f22838b.equals(fVar.f22838b) || !this.f22839c.equals(fVar.f22839c)) {
            return false;
        }
        return true;
    }

    @Override // h4.e
    public final int hashCode() {
        return this.f22839c.hashCode() + (this.f22838b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f22838b + ", signature=" + this.f22839c + '}';
    }
}
