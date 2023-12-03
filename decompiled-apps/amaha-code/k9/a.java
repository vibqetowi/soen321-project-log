package k9;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class a extends w9.a {
    @RecentlyNonNull
    public static final Parcelable.Creator<a> CREATOR = new r();
    public final String A;
    public final String B;
    public final String C;
    public final long D;
    public final String E;
    public final p F;

    /* renamed from: u  reason: collision with root package name */
    public final String f23077u;

    /* renamed from: v  reason: collision with root package name */
    public final String f23078v;

    /* renamed from: w  reason: collision with root package name */
    public final long f23079w;

    /* renamed from: x  reason: collision with root package name */
    public final String f23080x;

    /* renamed from: y  reason: collision with root package name */
    public final String f23081y;

    /* renamed from: z  reason: collision with root package name */
    public final String f23082z;

    public a(String str, String str2, long j10, String str3, String str4, String str5, String str6, String str7, String str8, long j11, String str9, p pVar) {
        this.f23077u = str;
        this.f23078v = str2;
        this.f23079w = j10;
        this.f23080x = str3;
        this.f23081y = str4;
        this.f23082z = str5;
        this.A = str6;
        this.B = str7;
        this.C = str8;
        this.D = j11;
        this.E = str9;
        this.F = pVar;
        if (!TextUtils.isEmpty(str6)) {
            try {
                new JSONObject(str6);
                return;
            } catch (JSONException e10) {
                Log.w("AdBreakClipInfo", String.format(Locale.ROOT, "Error creating AdBreakClipInfo: %s", e10.getMessage()));
                this.A = null;
                new JSONObject();
                return;
            }
        }
        new JSONObject();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (p9.a.e(this.f23077u, aVar.f23077u) && p9.a.e(this.f23078v, aVar.f23078v) && this.f23079w == aVar.f23079w && p9.a.e(this.f23080x, aVar.f23080x) && p9.a.e(this.f23081y, aVar.f23081y) && p9.a.e(this.f23082z, aVar.f23082z) && p9.a.e(this.A, aVar.A) && p9.a.e(this.B, aVar.B) && p9.a.e(this.C, aVar.C) && this.D == aVar.D && p9.a.e(this.E, aVar.E) && p9.a.e(this.F, aVar.F)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f23077u, this.f23078v, Long.valueOf(this.f23079w), this.f23080x, this.f23081y, this.f23082z, this.A, this.B, this.C, Long.valueOf(this.D), this.E, this.F});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.x0(parcel, 2, this.f23077u);
        hc.d.x0(parcel, 3, this.f23078v);
        hc.d.u0(parcel, 4, this.f23079w);
        hc.d.x0(parcel, 5, this.f23080x);
        hc.d.x0(parcel, 6, this.f23081y);
        hc.d.x0(parcel, 7, this.f23082z);
        hc.d.x0(parcel, 8, this.A);
        hc.d.x0(parcel, 9, this.B);
        hc.d.x0(parcel, 10, this.C);
        hc.d.u0(parcel, 11, this.D);
        hc.d.x0(parcel, 12, this.E);
        hc.d.w0(parcel, 13, this.F, i6);
        hc.d.C0(parcel, B0);
    }
}
