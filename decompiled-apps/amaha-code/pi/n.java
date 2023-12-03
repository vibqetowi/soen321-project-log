package pi;
/* compiled from: Padding.java */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final double f28502a;

    /* renamed from: b  reason: collision with root package name */
    public final double f28503b;

    /* renamed from: c  reason: collision with root package name */
    public final double f28504c;

    /* renamed from: d  reason: collision with root package name */
    public final double f28505d;

    public n(double d10, double d11, double d12, double d13) {
        this.f28502a = d10;
        this.f28503b = d11;
        this.f28504c = d12;
        this.f28505d = d13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        if (Double.compare(nVar.f28502a, this.f28502a) == 0 && Double.compare(nVar.f28503b, this.f28503b) == 0 && Double.compare(nVar.f28504c, this.f28504c) == 0 && Double.compare(nVar.f28505d, this.f28505d) == 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "{\"Padding\":{\"left\":" + this.f28502a + ", \"right\":" + this.f28503b + ", \"top\":" + this.f28504c + ", \"bottom\":" + this.f28505d + "}}";
    }
}
