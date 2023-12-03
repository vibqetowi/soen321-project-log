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
public final class j extends w9.a {
    @RecentlyNonNull
    public static final Parcelable.Creator<j> CREATOR = new l0();

    /* renamed from: u  reason: collision with root package name */
    public int f23148u;

    /* renamed from: v  reason: collision with root package name */
    public String f23149v;

    /* renamed from: w  reason: collision with root package name */
    public List<i> f23150w;

    /* renamed from: x  reason: collision with root package name */
    public List<u9.a> f23151x;

    /* renamed from: y  reason: collision with root package name */
    public double f23152y;

    public j() {
        f0();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f23148u == jVar.f23148u && TextUtils.equals(this.f23149v, jVar.f23149v) && v9.m.a(this.f23150w, jVar.f23150w) && v9.m.a(this.f23151x, jVar.f23151x) && this.f23152y == jVar.f23152y) {
            return true;
        }
        return false;
    }

    public final void f0() {
        this.f23148u = 0;
        this.f23149v = null;
        this.f23150w = null;
        this.f23151x = null;
        this.f23152y = 0.0d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f23148u), this.f23149v, this.f23150w, this.f23151x, Double.valueOf(this.f23152y)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i6) {
        List unmodifiableList;
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.s0(parcel, 2, this.f23148u);
        hc.d.x0(parcel, 3, this.f23149v);
        List<i> list = this.f23150w;
        List list2 = null;
        if (list == null) {
            unmodifiableList = null;
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        hc.d.A0(parcel, 4, unmodifiableList);
        List<u9.a> list3 = this.f23151x;
        if (list3 != null) {
            list2 = Collections.unmodifiableList(list3);
        }
        hc.d.A0(parcel, 5, list2);
        hc.d.q0(parcel, 6, this.f23152y);
        hc.d.C0(parcel, B0);
    }

    public j(int i6, String str, ArrayList arrayList, ArrayList arrayList2, double d10) {
        this.f23148u = i6;
        this.f23149v = str;
        this.f23150w = arrayList;
        this.f23151x = arrayList2;
        this.f23152y = d10;
    }

    public /* synthetic */ j(int i6) {
        f0();
    }

    public /* synthetic */ j(j jVar) {
        this.f23148u = jVar.f23148u;
        this.f23149v = jVar.f23149v;
        this.f23150w = jVar.f23150w;
        this.f23151x = jVar.f23151x;
        this.f23152y = jVar.f23152y;
    }
}
