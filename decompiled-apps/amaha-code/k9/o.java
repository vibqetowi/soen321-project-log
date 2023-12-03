package k9;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class o extends w9.a {
    @RecentlyNonNull
    public static final Parcelable.Creator<o> CREATOR = new s0();
    public int A;
    public int B;
    public String C;
    public int D;
    public int E;
    public String F;
    public JSONObject G;

    /* renamed from: u  reason: collision with root package name */
    public float f23176u;

    /* renamed from: v  reason: collision with root package name */
    public int f23177v;

    /* renamed from: w  reason: collision with root package name */
    public int f23178w;

    /* renamed from: x  reason: collision with root package name */
    public int f23179x;

    /* renamed from: y  reason: collision with root package name */
    public int f23180y;

    /* renamed from: z  reason: collision with root package name */
    public int f23181z;

    public o() {
        this(1.0f, 0, 0, -1, 0, -1, 0, 0, null, -1, -1, null);
    }

    public static final int f0(String str) {
        if (str != null && str.length() == 9 && str.charAt(0) == '#') {
            try {
                return Color.argb(Integer.parseInt(str.substring(7, 9), 16), Integer.parseInt(str.substring(1, 3), 16), Integer.parseInt(str.substring(3, 5), 16), Integer.parseInt(str.substring(5, 7), 16));
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        JSONObject jSONObject = this.G;
        if (jSONObject != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        JSONObject jSONObject2 = oVar.G;
        if (jSONObject2 != null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z10 != z11) {
            return false;
        }
        if ((jSONObject == null || jSONObject2 == null || aa.f.a(jSONObject, jSONObject2)) && this.f23176u == oVar.f23176u && this.f23177v == oVar.f23177v && this.f23178w == oVar.f23178w && this.f23179x == oVar.f23179x && this.f23180y == oVar.f23180y && this.f23181z == oVar.f23181z && this.A == oVar.A && this.B == oVar.B && p9.a.e(this.C, oVar.C) && this.D == oVar.D && this.E == oVar.E) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f23176u), Integer.valueOf(this.f23177v), Integer.valueOf(this.f23178w), Integer.valueOf(this.f23179x), Integer.valueOf(this.f23180y), Integer.valueOf(this.f23181z), Integer.valueOf(this.A), Integer.valueOf(this.B), this.C, Integer.valueOf(this.D), Integer.valueOf(this.E), String.valueOf(this.G)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i6) {
        String jSONObject;
        JSONObject jSONObject2 = this.G;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.F = jSONObject;
        int B0 = hc.d.B0(parcel, 20293);
        float f = this.f23176u;
        parcel.writeInt(262146);
        parcel.writeFloat(f);
        hc.d.s0(parcel, 3, this.f23177v);
        hc.d.s0(parcel, 4, this.f23178w);
        hc.d.s0(parcel, 5, this.f23179x);
        hc.d.s0(parcel, 6, this.f23180y);
        hc.d.s0(parcel, 7, this.f23181z);
        hc.d.s0(parcel, 8, this.A);
        hc.d.s0(parcel, 9, this.B);
        hc.d.x0(parcel, 10, this.C);
        hc.d.s0(parcel, 11, this.D);
        hc.d.s0(parcel, 12, this.E);
        hc.d.x0(parcel, 13, this.F);
        hc.d.C0(parcel, B0);
    }

    public o(float f, int i6, int i10, int i11, int i12, int i13, int i14, int i15, String str, int i16, int i17, String str2) {
        this.f23176u = f;
        this.f23177v = i6;
        this.f23178w = i10;
        this.f23179x = i11;
        this.f23180y = i12;
        this.f23181z = i13;
        this.A = i14;
        this.B = i15;
        this.C = str;
        this.D = i16;
        this.E = i17;
        this.F = str2;
        if (str2 == null) {
            this.G = null;
            return;
        }
        try {
            this.G = new JSONObject(str2);
        } catch (JSONException unused) {
            this.G = null;
            this.F = null;
        }
    }
}
