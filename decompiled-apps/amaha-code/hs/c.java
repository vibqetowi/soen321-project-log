package hs;
/* compiled from: KotlinVersion.kt */
/* loaded from: classes2.dex */
public final class c implements Comparable<c> {

    /* renamed from: y  reason: collision with root package name */
    public static final c f19459y = new c(7, 21);

    /* renamed from: u  reason: collision with root package name */
    public final int f19460u;

    /* renamed from: v  reason: collision with root package name */
    public final int f19461v;

    /* renamed from: w  reason: collision with root package name */
    public final int f19462w;

    /* renamed from: x  reason: collision with root package name */
    public final int f19463x;

    public c() {
        throw null;
    }

    public c(int i6, int i10) {
        boolean z10 = true;
        this.f19460u = 1;
        this.f19461v = i6;
        this.f19462w = i10;
        if ((new xs.f(0, 255).m(1) && new xs.f(0, 255).m(i6) && new xs.f(0, 255).m(i10)) ? false : false) {
            this.f19463x = 65536 + (i6 << 8) + i10;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: 1." + i6 + '.' + i10).toString());
    }

    @Override // java.lang.Comparable
    public final int compareTo(c cVar) {
        c other = cVar;
        kotlin.jvm.internal.i.g(other, "other");
        return this.f19463x - other.f19463x;
    }

    public final boolean equals(Object obj) {
        c cVar;
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            cVar = (c) obj;
        } else {
            cVar = null;
        }
        if (cVar != null && this.f19463x == cVar.f19463x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f19463x;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f19460u);
        sb2.append('.');
        sb2.append(this.f19461v);
        sb2.append('.');
        sb2.append(this.f19462w);
        return sb2.toString();
    }
}
