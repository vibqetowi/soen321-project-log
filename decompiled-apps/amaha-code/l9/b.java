package l9;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;
import java.util.Collections;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public final class b extends w9.a {
    @RecentlyNonNull
    public static final Parcelable.Creator<b> CREATOR = new y();
    public final boolean A;
    public final double B;
    public final boolean C;
    public final boolean D;
    public final boolean E;

    /* renamed from: u  reason: collision with root package name */
    public final String f24155u;

    /* renamed from: v  reason: collision with root package name */
    public final ArrayList f24156v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f24157w;

    /* renamed from: x  reason: collision with root package name */
    public final k9.g f24158x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f24159y;

    /* renamed from: z  reason: collision with root package name */
    public final m9.a f24160z;

    public b(String str, ArrayList arrayList, boolean z10, k9.g gVar, boolean z11, m9.a aVar, boolean z12, double d10, boolean z13, boolean z14, boolean z15) {
        int size;
        this.f24155u = true == TextUtils.isEmpty(str) ? "" : str;
        if (arrayList == null) {
            size = 0;
        } else {
            size = arrayList.size();
        }
        ArrayList arrayList2 = new ArrayList(size);
        this.f24156v = arrayList2;
        if (size > 0) {
            arrayList2.addAll(arrayList);
        }
        this.f24157w = z10;
        this.f24158x = gVar == null ? new k9.g() : gVar;
        this.f24159y = z11;
        this.f24160z = aVar;
        this.A = z12;
        this.B = d10;
        this.C = z13;
        this.D = z14;
        this.E = z15;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.x0(parcel, 2, this.f24155u);
        hc.d.y0(parcel, 3, Collections.unmodifiableList(this.f24156v));
        hc.d.o0(parcel, 4, this.f24157w);
        hc.d.w0(parcel, 5, this.f24158x, i6);
        hc.d.o0(parcel, 6, this.f24159y);
        hc.d.w0(parcel, 7, this.f24160z, i6);
        hc.d.o0(parcel, 8, this.A);
        hc.d.q0(parcel, 9, this.B);
        hc.d.o0(parcel, 10, this.C);
        hc.d.o0(parcel, 11, this.D);
        hc.d.o0(parcel, 12, this.E);
        hc.d.C0(parcel, B0);
    }
}
