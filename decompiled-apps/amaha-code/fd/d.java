package fd;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* loaded from: classes.dex */
public final class d extends b {
    public static final Parcelable.Creator<d> CREATOR = new z();

    /* renamed from: u  reason: collision with root package name */
    public final String f14948u;

    /* renamed from: v  reason: collision with root package name */
    public final String f14949v;

    /* renamed from: w  reason: collision with root package name */
    public final String f14950w;

    /* renamed from: x  reason: collision with root package name */
    public String f14951x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f14952y;

    public d(String str, String str2, String str3, String str4, boolean z10) {
        v9.o.e(str);
        this.f14948u = str;
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
        }
        this.f14949v = str2;
        this.f14950w = str3;
        this.f14951x = str4;
        this.f14952y = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.x0(parcel, 1, this.f14948u);
        hc.d.x0(parcel, 2, this.f14949v);
        hc.d.x0(parcel, 3, this.f14950w);
        hc.d.x0(parcel, 4, this.f14951x);
        hc.d.o0(parcel, 5, this.f14952y);
        hc.d.C0(parcel, B0);
    }
}
