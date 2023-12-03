package ke;

import ke.l;
/* compiled from: AutoValue_FieldIndex_Segment.java */
/* loaded from: classes.dex */
public final class d extends l.c {

    /* renamed from: u  reason: collision with root package name */
    public final m f23266u;

    /* renamed from: v  reason: collision with root package name */
    public final int f23267v;

    public d(m mVar, int i6) {
        this.f23266u = mVar;
        if (i6 != 0) {
            this.f23267v = i6;
            return;
        }
        throw new NullPointerException("Null kind");
    }

    @Override // ke.l.c
    public final m d() {
        return this.f23266u;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l.c)) {
            return false;
        }
        l.c cVar = (l.c) obj;
        if (this.f23266u.equals(cVar.d()) && v.h.b(this.f23267v, cVar.f())) {
            return true;
        }
        return false;
    }

    @Override // ke.l.c
    public final int f() {
        return this.f23267v;
    }

    public final int hashCode() {
        return ((this.f23266u.hashCode() ^ 1000003) * 1000003) ^ v.h.d(this.f23267v);
    }

    public final String toString() {
        return "Segment{fieldPath=" + this.f23266u + ", kind=" + defpackage.c.G(this.f23267v) + "}";
    }
}
