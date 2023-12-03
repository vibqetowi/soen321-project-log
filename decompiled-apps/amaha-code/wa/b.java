package wa;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class b extends w9.a implements t9.c {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: u  reason: collision with root package name */
    public final int f36655u;

    /* renamed from: v  reason: collision with root package name */
    public final int f36656v;

    /* renamed from: w  reason: collision with root package name */
    public final Intent f36657w;

    public b() {
        this(2, 0, null);
    }

    @Override // t9.c
    public final Status X() {
        if (this.f36656v == 0) {
            return Status.f7296z;
        }
        return Status.D;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.s0(parcel, 1, this.f36655u);
        hc.d.s0(parcel, 2, this.f36656v);
        hc.d.w0(parcel, 3, this.f36657w, i6);
        hc.d.C0(parcel, B0);
    }

    public b(int i6, int i10, Intent intent) {
        this.f36655u = i6;
        this.f36656v = i10;
        this.f36657w = intent;
    }
}
