package pi;
/* compiled from: Margin.java */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final double f28489a;

    /* renamed from: b  reason: collision with root package name */
    public final double f28490b;

    /* renamed from: c  reason: collision with root package name */
    public final double f28491c;

    /* renamed from: d  reason: collision with root package name */
    public final double f28492d;

    public l(double d10, double d11, double d12, double d13) {
        this.f28489a = d10;
        this.f28490b = d11;
        this.f28491c = d12;
        this.f28492d = d13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        if (Double.compare(lVar.f28489a, this.f28489a) == 0 && Double.compare(lVar.f28490b, this.f28490b) == 0 && Double.compare(lVar.f28491c, this.f28491c) == 0 && Double.compare(lVar.f28492d, this.f28492d) == 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "{\"Margin\":{\"left\":" + this.f28489a + ", \"right\":" + this.f28490b + ", \"top\":" + this.f28491c + ", \"bottom\":" + this.f28492d + "}}";
    }
}
