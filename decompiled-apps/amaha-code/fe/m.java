package fe;

import java.security.SecureRandom;
/* compiled from: GeoPoint.java */
/* loaded from: classes.dex */
public final class m implements Comparable<m> {

    /* renamed from: u  reason: collision with root package name */
    public final double f15003u;

    /* renamed from: v  reason: collision with root package name */
    public final double f15004v;

    public m(double d10, double d11) {
        if (!Double.isNaN(d10) && d10 >= -90.0d && d10 <= 90.0d) {
            if (!Double.isNaN(d11) && d11 >= -180.0d && d11 <= 180.0d) {
                this.f15003u = d10;
                this.f15004v = d11;
                return;
            }
            throw new IllegalArgumentException("Longitude must be in the range of [-180, 180]");
        }
        throw new IllegalArgumentException("Latitude must be in the range of [-90, 90]");
    }

    @Override // java.lang.Comparable
    public final int compareTo(m mVar) {
        m mVar2 = mVar;
        double d10 = mVar2.f15003u;
        SecureRandom secureRandom = oe.n.f27432a;
        int w02 = f6.b.w0(this.f15003u, d10);
        if (w02 == 0) {
            return f6.b.w0(this.f15004v, mVar2.f15004v);
        }
        return w02;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f15003u != mVar.f15003u || this.f15004v != mVar.f15004v) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f15003u);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f15004v);
        return (((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public final String toString() {
        return "GeoPoint { latitude=" + this.f15003u + ", longitude=" + this.f15004v + " }";
    }
}
