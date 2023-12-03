package ke;

import ke.l;
/* compiled from: AutoValue_FieldIndex_IndexOffset.java */
/* loaded from: classes.dex */
public final class b extends l.a {

    /* renamed from: w  reason: collision with root package name */
    public final r f23261w;

    /* renamed from: x  reason: collision with root package name */
    public final i f23262x;

    /* renamed from: y  reason: collision with root package name */
    public final int f23263y;

    public b(r rVar, i iVar, int i6) {
        if (rVar != null) {
            this.f23261w = rVar;
            if (iVar != null) {
                this.f23262x = iVar;
                this.f23263y = i6;
                return;
            }
            throw new NullPointerException("Null documentKey");
        }
        throw new NullPointerException("Null readTime");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l.a)) {
            return false;
        }
        l.a aVar = (l.a) obj;
        if (this.f23261w.equals(aVar.j()) && this.f23262x.equals(aVar.h()) && this.f23263y == aVar.i()) {
            return true;
        }
        return false;
    }

    @Override // ke.l.a
    public final i h() {
        return this.f23262x;
    }

    public final int hashCode() {
        return ((((this.f23261w.hashCode() ^ 1000003) * 1000003) ^ this.f23262x.hashCode()) * 1000003) ^ this.f23263y;
    }

    @Override // ke.l.a
    public final int i() {
        return this.f23263y;
    }

    @Override // ke.l.a
    public final r j() {
        return this.f23261w;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IndexOffset{readTime=");
        sb2.append(this.f23261w);
        sb2.append(", documentKey=");
        sb2.append(this.f23262x);
        sb2.append(", largestBatchId=");
        return pl.a.g(sb2, this.f23263y, "}");
    }
}
