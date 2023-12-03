package r9;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes.dex */
public final class a extends w9.a {
    public static final Parcelable.Creator<a> CREATOR = new d();

    /* renamed from: u  reason: collision with root package name */
    public final Intent f30605u;

    public a(Intent intent) {
        this.f30605u = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.w0(parcel, 1, this.f30605u, i6);
        hc.d.C0(parcel, B0);
    }
}
