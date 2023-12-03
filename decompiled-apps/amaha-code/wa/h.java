package wa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class h extends w9.a implements t9.c {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* renamed from: u  reason: collision with root package name */
    public final List<String> f36658u;

    /* renamed from: v  reason: collision with root package name */
    public final String f36659v;

    public h(String str, ArrayList arrayList) {
        this.f36658u = arrayList;
        this.f36659v = str;
    }

    @Override // t9.c
    public final Status X() {
        if (this.f36659v != null) {
            return Status.f7296z;
        }
        return Status.D;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.y0(parcel, 1, this.f36658u);
        hc.d.x0(parcel, 2, this.f36659v);
        hc.d.C0(parcel, B0);
    }
}
