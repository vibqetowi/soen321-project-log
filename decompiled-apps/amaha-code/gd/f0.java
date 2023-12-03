package gd;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* loaded from: classes.dex */
public final class f0 implements fd.c {
    public static final Parcelable.Creator<f0> CREATOR = new g0();

    /* renamed from: u  reason: collision with root package name */
    public final k0 f16409u;

    /* renamed from: v  reason: collision with root package name */
    public final d0 f16410v;

    /* renamed from: w  reason: collision with root package name */
    public final fd.x f16411w;

    public f0(k0 k0Var, d0 d0Var, fd.x xVar) {
        this.f16409u = k0Var;
        this.f16410v = d0Var;
        this.f16411w = xVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // fd.c
    public final k0 getUser() {
        return this.f16409u;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.w0(parcel, 1, this.f16409u, i6);
        hc.d.w0(parcel, 2, this.f16410v, i6);
        hc.d.w0(parcel, 3, this.f16411w, i6);
        hc.d.C0(parcel, B0);
    }

    public f0(k0 k0Var) {
        this.f16409u = k0Var;
        List list = k0Var.f16429y;
        this.f16410v = null;
        for (int i6 = 0; i6 < list.size(); i6++) {
            if (!TextUtils.isEmpty(((h0) list.get(i6)).B)) {
                this.f16410v = new d0(((h0) list.get(i6)).f16416v, ((h0) list.get(i6)).B, k0Var.D);
            }
        }
        if (this.f16410v == null) {
            this.f16410v = new d0(k0Var.D);
        }
        this.f16411w = k0Var.E;
    }
}
