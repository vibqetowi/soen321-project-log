package l8;

import android.os.Parcel;
import android.os.Parcelable;
import c9.w;
/* compiled from: InternalFrame.java */
/* loaded from: classes.dex */
public final class i extends h {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* renamed from: v  reason: collision with root package name */
    public final String f24131v;

    /* renamed from: w  reason: collision with root package name */
    public final String f24132w;

    /* renamed from: x  reason: collision with root package name */
    public final String f24133x;

    /* compiled from: InternalFrame.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        public final i createFromParcel(Parcel parcel) {
            return new i(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final i[] newArray(int i6) {
            return new i[i6];
        }
    }

    public i(String str, String str2, String str3) {
        super("----");
        this.f24131v = str;
        this.f24132w = str2;
        this.f24133x = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (w.a(this.f24132w, iVar.f24132w) && w.a(this.f24131v, iVar.f24131v) && w.a(this.f24133x, iVar.f24133x)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int i10;
        int i11 = 0;
        String str = this.f24131v;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        int i12 = (527 + i6) * 31;
        String str2 = this.f24132w;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i12 + i10) * 31;
        String str3 = this.f24133x;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return i13 + i11;
    }

    @Override // l8.h
    public final String toString() {
        String str = this.f24130u;
        int c10 = ri.e.c(str, 23);
        String str2 = this.f24131v;
        int c11 = ri.e.c(str2, c10);
        String str3 = this.f24132w;
        StringBuilder n10 = defpackage.e.n(ri.e.c(str3, c11), str, ": domain=", str2, ", description=");
        n10.append(str3);
        return n10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.f24130u);
        parcel.writeString(this.f24131v);
        parcel.writeString(this.f24133x);
    }

    public i(Parcel parcel) {
        super("----");
        String readString = parcel.readString();
        int i6 = w.f5205a;
        this.f24131v = readString;
        this.f24132w = parcel.readString();
        this.f24133x = parcel.readString();
    }
}
