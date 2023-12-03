package gd;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* loaded from: classes.dex */
public final class g extends fd.b {
    public static final Parcelable.Creator<g> CREATOR = new h();

    /* renamed from: u  reason: collision with root package name */
    public final String f16412u;

    /* renamed from: v  reason: collision with root package name */
    public String f16413v;

    /* renamed from: w  reason: collision with root package name */
    public List f16414w;

    public g() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.x0(parcel, 1, this.f16412u);
        hc.d.x0(parcel, 2, this.f16413v);
        hc.d.A0(parcel, 3, this.f16414w);
        hc.d.C0(parcel, B0);
    }

    public g(String str, String str2, ArrayList arrayList) {
        this.f16412u = str;
        this.f16413v = str2;
        this.f16414w = arrayList;
    }
}
