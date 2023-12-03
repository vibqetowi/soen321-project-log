package ta;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class s extends w9.a {
    public static final Parcelable.Creator<s> CREATOR = new t();

    /* renamed from: u  reason: collision with root package name */
    public final String f32858u;

    /* renamed from: v  reason: collision with root package name */
    public final q f32859v;

    /* renamed from: w  reason: collision with root package name */
    public final String f32860w;

    /* renamed from: x  reason: collision with root package name */
    public final long f32861x;

    public s(s sVar, long j10) {
        v9.o.h(sVar);
        this.f32858u = sVar.f32858u;
        this.f32859v = sVar.f32859v;
        this.f32860w = sVar.f32860w;
        this.f32861x = j10;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f32859v);
        return "origin=" + this.f32860w + ",name=" + this.f32858u + ",params=" + valueOf;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        t.a(this, parcel, i6);
    }

    public s(String str, q qVar, String str2, long j10) {
        this.f32858u = str;
        this.f32859v = qVar;
        this.f32860w = str2;
        this.f32861x = j10;
    }
}
