package u9;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.theinnerhour.b2b.utils.Constants;
import hc.d;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import v9.m;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class a extends w9.a {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: u  reason: collision with root package name */
    public final int f33968u;

    /* renamed from: v  reason: collision with root package name */
    public final Uri f33969v;

    /* renamed from: w  reason: collision with root package name */
    public final int f33970w;

    /* renamed from: x  reason: collision with root package name */
    public final int f33971x;

    public a(int i6, Uri uri, int i10, int i11) {
        this.f33968u = i6;
        this.f33969v = uri;
        this.f33970w = i10;
        this.f33971x = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof a)) {
            a aVar = (a) obj;
            if (m.a(this.f33969v, aVar.f33969v) && this.f33970w == aVar.f33970w && this.f33971x == aVar.f33971x) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f33969v, Integer.valueOf(this.f33970w), Integer.valueOf(this.f33971x)});
    }

    public final String toString() {
        return String.format(Locale.US, "Image %dx%d %s", Integer.valueOf(this.f33970w), Integer.valueOf(this.f33971x), this.f33969v.toString());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = d.B0(parcel, 20293);
        d.s0(parcel, 1, this.f33968u);
        d.w0(parcel, 2, this.f33969v, i6);
        d.s0(parcel, 3, this.f33970w);
        d.s0(parcel, 4, this.f33971x);
        d.C0(parcel, B0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(JSONObject jSONObject) {
        this(1, r0, r1, r5);
        Uri uri = Uri.EMPTY;
        if (jSONObject.has(Constants.NOTIFICATION_URL)) {
            try {
                uri = Uri.parse(jSONObject.getString(Constants.NOTIFICATION_URL));
            } catch (JSONException unused) {
            }
        }
        int optInt = jSONObject.optInt("width", 0);
        int optInt2 = jSONObject.optInt("height", 0);
        if (uri == null) {
            throw new IllegalArgumentException("url cannot be null");
        }
        if (optInt < 0 || optInt2 < 0) {
            throw new IllegalArgumentException("width and height must not be negative");
        }
    }
}
