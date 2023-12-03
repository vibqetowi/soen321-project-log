package ds;

import java.io.Serializable;
import v.h;
/* compiled from: Phonenumber.java */
/* loaded from: classes2.dex */
public final class g implements Serializable {
    public boolean A;

    /* renamed from: w  reason: collision with root package name */
    public boolean f13346w;

    /* renamed from: y  reason: collision with root package name */
    public boolean f13348y;

    /* renamed from: u  reason: collision with root package name */
    public int f13344u = 0;

    /* renamed from: v  reason: collision with root package name */
    public long f13345v = 0;

    /* renamed from: x  reason: collision with root package name */
    public String f13347x = "";

    /* renamed from: z  reason: collision with root package name */
    public boolean f13349z = false;
    public int B = 1;
    public String C = "";
    public String E = "";
    public int D = 5;

    public final boolean equals(Object obj) {
        boolean z10;
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (gVar != null && (this == gVar || (this.f13344u == gVar.f13344u && this.f13345v == gVar.f13345v && this.f13347x.equals(gVar.f13347x) && this.f13349z == gVar.f13349z && this.B == gVar.B && this.C.equals(gVar.C) && this.D == gVar.D && this.E.equals(gVar.E)))) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i6;
        int hashCode = Long.valueOf(this.f13345v).hashCode();
        int c10 = pl.a.c(this.f13347x, (hashCode + ((this.f13344u + 2173) * 53)) * 53, 53);
        if (this.f13349z) {
            i6 = 1231;
        } else {
            i6 = 1237;
        }
        int c11 = pl.a.c(this.C, (((c10 + i6) * 53) + this.B) * 53, 53);
        return ((this.E.hashCode() + ((h.d(this.D) + c11) * 53)) * 53) + 1237;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Country Code: ");
        sb2.append(this.f13344u);
        sb2.append(" National Number: ");
        sb2.append(this.f13345v);
        if (this.f13348y && this.f13349z) {
            sb2.append(" Leading Zero(s): true");
        }
        if (this.A) {
            sb2.append(" Number of leading zeros: ");
            sb2.append(this.B);
        }
        if (this.f13346w) {
            sb2.append(" Extension: ");
            sb2.append(this.f13347x);
        }
        return sb2.toString();
    }
}
