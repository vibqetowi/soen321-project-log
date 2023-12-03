package k9;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class l extends w9.a {
    @RecentlyNonNull
    public static final Parcelable.Creator<l> CREATOR = new o0();
    public long[] A;
    public String B;
    public JSONObject C;

    /* renamed from: u  reason: collision with root package name */
    public MediaInfo f23159u;

    /* renamed from: v  reason: collision with root package name */
    public int f23160v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f23161w;

    /* renamed from: x  reason: collision with root package name */
    public double f23162x;

    /* renamed from: y  reason: collision with root package name */
    public double f23163y;

    /* renamed from: z  reason: collision with root package name */
    public double f23164z;

    public l(MediaInfo mediaInfo, int i6, boolean z10, double d10, double d11, double d12, long[] jArr, String str) {
        this.f23159u = mediaInfo;
        this.f23160v = i6;
        this.f23161w = z10;
        this.f23162x = d10;
        this.f23163y = d11;
        this.f23164z = d12;
        this.A = jArr;
        this.B = str;
        if (str == null) {
            this.C = null;
            return;
        }
        try {
            this.C = new JSONObject(str);
        } catch (JSONException unused) {
            this.C = null;
            this.B = null;
        }
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        JSONObject jSONObject = this.C;
        if (jSONObject != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        JSONObject jSONObject2 = lVar.C;
        if (jSONObject2 != null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z10 != z11) {
            return false;
        }
        if ((jSONObject == null || jSONObject2 == null || aa.f.a(jSONObject, jSONObject2)) && p9.a.e(this.f23159u, lVar.f23159u) && this.f23160v == lVar.f23160v && this.f23161w == lVar.f23161w && (((Double.isNaN(this.f23162x) && Double.isNaN(lVar.f23162x)) || this.f23162x == lVar.f23162x) && this.f23163y == lVar.f23163y && this.f23164z == lVar.f23164z && Arrays.equals(this.A, lVar.A))) {
            return true;
        }
        return false;
    }

    public final boolean f0(@RecentlyNonNull JSONObject jSONObject) {
        boolean z10;
        long[] jArr;
        boolean z11;
        int i6;
        boolean z12 = false;
        if (jSONObject.has("media")) {
            this.f23159u = new MediaInfo(jSONObject.getJSONObject("media"));
            z10 = true;
        } else {
            z10 = false;
        }
        if (jSONObject.has("itemId") && this.f23160v != (i6 = jSONObject.getInt("itemId"))) {
            this.f23160v = i6;
            z10 = true;
        }
        if (jSONObject.has("autoplay") && this.f23161w != (z11 = jSONObject.getBoolean("autoplay"))) {
            this.f23161w = z11;
            z10 = true;
        }
        double optDouble = jSONObject.optDouble("startTime");
        if (Double.isNaN(optDouble) != Double.isNaN(this.f23162x) || (!Double.isNaN(optDouble) && Math.abs(optDouble - this.f23162x) > 1.0E-7d)) {
            this.f23162x = optDouble;
            z10 = true;
        }
        if (jSONObject.has("playbackDuration")) {
            double d10 = jSONObject.getDouble("playbackDuration");
            if (Math.abs(d10 - this.f23163y) > 1.0E-7d) {
                this.f23163y = d10;
                z10 = true;
            }
        }
        if (jSONObject.has("preloadTime")) {
            double d11 = jSONObject.getDouble("preloadTime");
            if (Math.abs(d11 - this.f23164z) > 1.0E-7d) {
                this.f23164z = d11;
                z10 = true;
            }
        }
        if (jSONObject.has("activeTrackIds")) {
            JSONArray jSONArray = jSONObject.getJSONArray("activeTrackIds");
            int length = jSONArray.length();
            jArr = new long[length];
            for (int i10 = 0; i10 < length; i10++) {
                jArr[i10] = jSONArray.getLong(i10);
            }
            long[] jArr2 = this.A;
            if (jArr2 != null && jArr2.length == length) {
                for (int i11 = 0; i11 < length; i11++) {
                    if (this.A[i11] == jArr[i11]) {
                    }
                }
            }
            z12 = true;
            break;
        } else {
            jArr = null;
        }
        if (z12) {
            this.A = jArr;
            z10 = true;
        }
        if (jSONObject.has("customData")) {
            this.C = jSONObject.getJSONObject("customData");
            return true;
        }
        return z10;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f23159u, Integer.valueOf(this.f23160v), Boolean.valueOf(this.f23161w), Double.valueOf(this.f23162x), Double.valueOf(this.f23163y), Double.valueOf(this.f23164z), Integer.valueOf(Arrays.hashCode(this.A)), String.valueOf(this.C)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i6) {
        String jSONObject;
        JSONObject jSONObject2 = this.C;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.B = jSONObject;
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.w0(parcel, 2, this.f23159u, i6);
        hc.d.s0(parcel, 3, this.f23160v);
        hc.d.o0(parcel, 4, this.f23161w);
        hc.d.q0(parcel, 5, this.f23162x);
        hc.d.q0(parcel, 6, this.f23163y);
        hc.d.q0(parcel, 7, this.f23164z);
        long[] jArr = this.A;
        if (jArr != null) {
            int B02 = hc.d.B0(parcel, 8);
            parcel.writeLongArray(jArr);
            hc.d.C0(parcel, B02);
        }
        hc.d.x0(parcel, 9, this.B);
        hc.d.C0(parcel, B0);
    }

    /* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final l f23165a;

        public a(@RecentlyNonNull MediaInfo mediaInfo) {
            this.f23165a = new l(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        }

        @RecentlyNonNull
        public final l a() {
            l lVar = this.f23165a;
            if (lVar.f23159u != null) {
                if (!Double.isNaN(lVar.f23162x) && lVar.f23162x < 0.0d) {
                    throw new IllegalArgumentException("startTime cannot be negative or NaN.");
                }
                if (!Double.isNaN(lVar.f23163y)) {
                    if (!Double.isNaN(lVar.f23164z) && lVar.f23164z >= 0.0d) {
                        return lVar;
                    }
                    throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
                }
                throw new IllegalArgumentException("playbackDuration cannot be NaN.");
            }
            throw new IllegalArgumentException("media cannot be null.");
        }

        public a(@RecentlyNonNull JSONObject jSONObject) {
            this.f23165a = new l(jSONObject);
        }
    }

    public l(@RecentlyNonNull JSONObject jSONObject) {
        this(null, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        f0(jSONObject);
    }
}
