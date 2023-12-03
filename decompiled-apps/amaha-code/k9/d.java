package k9;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.appsflyer.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class d extends w9.a {
    @RecentlyNonNull
    public static final Parcelable.Creator<d> CREATOR = new r0();
    public final String A;

    /* renamed from: u  reason: collision with root package name */
    public final String f23098u;

    /* renamed from: v  reason: collision with root package name */
    public final String f23099v;

    /* renamed from: w  reason: collision with root package name */
    public final List<String> f23100w;

    /* renamed from: x  reason: collision with root package name */
    public final String f23101x;

    /* renamed from: y  reason: collision with root package name */
    public final Uri f23102y;

    /* renamed from: z  reason: collision with root package name */
    public final String f23103z;

    public d() {
        this.f23100w = new ArrayList();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (p9.a.e(this.f23098u, dVar.f23098u) && p9.a.e(this.f23099v, dVar.f23099v) && p9.a.e(this.f23100w, dVar.f23100w) && p9.a.e(this.f23101x, dVar.f23101x) && p9.a.e(this.f23102y, dVar.f23102y) && p9.a.e(this.f23103z, dVar.f23103z) && p9.a.e(this.A, dVar.A)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f23098u, this.f23099v, this.f23100w, this.f23101x, this.f23102y, this.f23103z});
    }

    @RecentlyNonNull
    public final String toString() {
        int size;
        List<String> list = this.f23100w;
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        String valueOf = String.valueOf(this.f23102y);
        String str = this.f23098u;
        int length = String.valueOf(str).length();
        String str2 = this.f23099v;
        int length2 = String.valueOf(str2).length();
        String str3 = this.f23101x;
        int length3 = String.valueOf(str3).length();
        int length4 = valueOf.length();
        String str4 = this.f23103z;
        int length5 = String.valueOf(str4).length();
        String str5 = this.A;
        StringBuilder sb2 = new StringBuilder(length + R.styleable.AppCompatTheme_windowActionBarOverlay + length2 + length3 + length4 + length5 + String.valueOf(str5).length());
        sb2.append("applicationId: ");
        sb2.append(str);
        sb2.append(", name: ");
        sb2.append(str2);
        sb2.append(", namespaces.count: ");
        sb2.append(size);
        sb2.append(", senderAppIdentifier: ");
        sb2.append(str3);
        sb2.append(", senderAppLaunchUrl: ");
        sb2.append(valueOf);
        sb2.append(", iconUrl: ");
        sb2.append(str4);
        return r1.b0.b(sb2, ", type: ", str5);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.x0(parcel, 2, this.f23098u);
        hc.d.x0(parcel, 3, this.f23099v);
        hc.d.y0(parcel, 5, Collections.unmodifiableList(this.f23100w));
        hc.d.x0(parcel, 6, this.f23101x);
        hc.d.w0(parcel, 7, this.f23102y, i6);
        hc.d.x0(parcel, 8, this.f23103z);
        hc.d.x0(parcel, 9, this.A);
        hc.d.C0(parcel, B0);
    }

    public d(String str, String str2, ArrayList arrayList, String str3, Uri uri, String str4, String str5) {
        this.f23098u = str;
        this.f23099v = str2;
        this.f23100w = arrayList;
        this.f23101x = str3;
        this.f23102y = uri;
        this.f23103z = str4;
        this.A = str5;
    }
}
