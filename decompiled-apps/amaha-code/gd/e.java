package gd;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* loaded from: classes.dex */
public final class e extends fd.k {
    public static final Parcelable.Creator<e> CREATOR = new f();

    /* renamed from: u  reason: collision with root package name */
    public final ArrayList f16404u = new ArrayList();

    /* renamed from: v  reason: collision with root package name */
    public final g f16405v;

    /* renamed from: w  reason: collision with root package name */
    public final String f16406w;

    /* renamed from: x  reason: collision with root package name */
    public final fd.x f16407x;

    /* renamed from: y  reason: collision with root package name */
    public final k0 f16408y;

    public e(ArrayList arrayList, g gVar, String str, fd.x xVar, k0 k0Var) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            fd.j jVar = (fd.j) it.next();
            if (jVar instanceof fd.n) {
                this.f16404u.add((fd.n) jVar);
            }
        }
        v9.o.h(gVar);
        this.f16405v = gVar;
        v9.o.e(str);
        this.f16406w = str;
        this.f16407x = xVar;
        this.f16408y = k0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.A0(parcel, 1, this.f16404u);
        hc.d.w0(parcel, 2, this.f16405v, i6);
        hc.d.x0(parcel, 3, this.f16406w);
        hc.d.w0(parcel, 4, this.f16407x, i6);
        hc.d.w0(parcel, 5, this.f16408y, i6);
        hc.d.C0(parcel, B0);
    }
}
