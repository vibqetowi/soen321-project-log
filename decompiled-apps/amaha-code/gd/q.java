package gd;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* loaded from: classes.dex */
public final class q extends w9.a {
    public static final Parcelable.Creator<q> CREATOR = new r();

    /* renamed from: u  reason: collision with root package name */
    public final List f16441u;

    public q(ArrayList arrayList) {
        this.f16441u = arrayList == null ? new ArrayList() : arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.A0(parcel, 1, this.f16441u);
        hc.d.C0(parcel, B0);
    }
}
