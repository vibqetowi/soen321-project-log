package w;
/* compiled from: Schlick.java */
/* loaded from: classes.dex */
public final class j extends c {

    /* renamed from: d  reason: collision with root package name */
    public final double f36238d;

    /* renamed from: e  reason: collision with root package name */
    public final double f36239e;

    public j(String str) {
        this.f36204a = str;
        int indexOf = str.indexOf(40);
        int indexOf2 = str.indexOf(44, indexOf);
        this.f36238d = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
        int i6 = indexOf2 + 1;
        this.f36239e = Double.parseDouble(str.substring(i6, str.indexOf(44, i6)).trim());
    }

    @Override // w.c
    public final double a(double d10) {
        double d11 = this.f36238d;
        double d12 = this.f36239e;
        if (d10 < d12) {
            return (d12 * d10) / (((d12 - d10) * d11) + d10);
        }
        return ((d10 - 1.0d) * (1.0d - d12)) / ((1.0d - d10) - ((d12 - d10) * d11));
    }

    @Override // w.c
    public final double b(double d10) {
        double d11 = this.f36238d;
        double d12 = this.f36239e;
        if (d10 < d12) {
            double d13 = d11 * d12 * d12;
            double d14 = ((d12 - d10) * d11) + d10;
            return d13 / (d14 * d14);
        }
        double d15 = d12 - 1.0d;
        double d16 = (((d12 - d10) * (-d11)) - d10) + 1.0d;
        return ((d15 * d11) * d15) / (d16 * d16);
    }
}
