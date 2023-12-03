package ta;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class q extends w9.a implements Iterable<String> {
    public static final Parcelable.Creator<q> CREATOR = new r();

    /* renamed from: u  reason: collision with root package name */
    public final Bundle f32819u;

    public q(Bundle bundle) {
        this.f32819u = bundle;
    }

    public final Bundle f0() {
        return new Bundle(this.f32819u);
    }

    public final Double g0() {
        return Double.valueOf(this.f32819u.getDouble("value"));
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new com.google.android.gms.internal.cast.d5(this);
    }

    public final String toString() {
        return this.f32819u.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.p0(parcel, 2, f0());
        hc.d.C0(parcel, B0);
    }
}
