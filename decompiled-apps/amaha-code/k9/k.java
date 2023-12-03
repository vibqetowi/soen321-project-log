package k9;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class k extends w9.a {
    @RecentlyNonNull
    public static final Parcelable.Creator<k> CREATOR = new m0();
    public List<l> A;
    public int B;
    public long C;

    /* renamed from: u  reason: collision with root package name */
    public String f23153u;

    /* renamed from: v  reason: collision with root package name */
    public String f23154v;

    /* renamed from: w  reason: collision with root package name */
    public int f23155w;

    /* renamed from: x  reason: collision with root package name */
    public String f23156x;

    /* renamed from: y  reason: collision with root package name */
    public j f23157y;

    /* renamed from: z  reason: collision with root package name */
    public int f23158z;

    public k() {
        f0();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (TextUtils.equals(this.f23153u, kVar.f23153u) && TextUtils.equals(this.f23154v, kVar.f23154v) && this.f23155w == kVar.f23155w && TextUtils.equals(this.f23156x, kVar.f23156x) && v9.m.a(this.f23157y, kVar.f23157y) && this.f23158z == kVar.f23158z && v9.m.a(this.A, kVar.A) && this.B == kVar.B && this.C == kVar.C) {
            return true;
        }
        return false;
    }

    public final void f0() {
        this.f23153u = null;
        this.f23154v = null;
        this.f23155w = 0;
        this.f23156x = null;
        this.f23158z = 0;
        this.A = null;
        this.B = 0;
        this.C = -1L;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f23153u, this.f23154v, Integer.valueOf(this.f23155w), this.f23156x, this.f23157y, Integer.valueOf(this.f23158z), this.A, Integer.valueOf(this.B), Long.valueOf(this.C)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i6) {
        List unmodifiableList;
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.x0(parcel, 2, this.f23153u);
        hc.d.x0(parcel, 3, this.f23154v);
        hc.d.s0(parcel, 4, this.f23155w);
        hc.d.x0(parcel, 5, this.f23156x);
        hc.d.w0(parcel, 6, this.f23157y, i6);
        hc.d.s0(parcel, 7, this.f23158z);
        List<l> list = this.A;
        if (list == null) {
            unmodifiableList = null;
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        hc.d.A0(parcel, 8, unmodifiableList);
        hc.d.s0(parcel, 9, this.B);
        hc.d.u0(parcel, 10, this.C);
        hc.d.C0(parcel, B0);
    }

    public /* synthetic */ k(int i6) {
        f0();
    }

    public /* synthetic */ k(k kVar) {
        this.f23153u = kVar.f23153u;
        this.f23154v = kVar.f23154v;
        this.f23155w = kVar.f23155w;
        this.f23156x = kVar.f23156x;
        this.f23157y = kVar.f23157y;
        this.f23158z = kVar.f23158z;
        this.A = kVar.A;
        this.B = kVar.B;
        this.C = kVar.C;
    }

    public k(String str, String str2, int i6, String str3, j jVar, int i10, ArrayList arrayList, int i11, long j10) {
        this.f23153u = str;
        this.f23154v = str2;
        this.f23155w = i6;
        this.f23156x = str3;
        this.f23157y = jVar;
        this.f23158z = i10;
        this.A = arrayList;
        this.B = i11;
        this.C = j10;
    }
}
