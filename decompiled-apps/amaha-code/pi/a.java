package pi;
/* compiled from: Animation.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f28441a;

    /* renamed from: b  reason: collision with root package name */
    public final int f28442b;

    public a(int i6, int i10) {
        this.f28441a = i6;
        this.f28442b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f28441a == aVar.f28441a && this.f28442b == aVar.f28442b) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Animation{entry=");
        sb2.append(this.f28441a);
        sb2.append(", exit=");
        return defpackage.c.s(sb2, this.f28442b, '}');
    }
}
