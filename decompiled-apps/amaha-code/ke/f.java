package ke;

import r1.b0;
/* compiled from: DatabaseId.java */
/* loaded from: classes.dex */
public final class f implements Comparable<f> {

    /* renamed from: u  reason: collision with root package name */
    public final String f23269u;

    /* renamed from: v  reason: collision with root package name */
    public final String f23270v;

    public f(String str, String str2) {
        this.f23269u = str;
        this.f23270v = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(f fVar) {
        f fVar2 = fVar;
        int compareTo = this.f23269u.compareTo(fVar2.f23269u);
        if (compareTo == 0) {
            return this.f23270v.compareTo(fVar2.f23270v);
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f23269u.equals(fVar.f23269u) && this.f23270v.equals(fVar.f23270v)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f23270v.hashCode() + (this.f23269u.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DatabaseId(");
        sb2.append(this.f23269u);
        sb2.append(", ");
        return b0.b(sb2, this.f23270v, ")");
    }
}
