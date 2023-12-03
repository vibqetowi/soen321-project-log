package l8;

import android.os.Parcel;
import android.os.Parcelable;
import c9.w;
import java.util.Arrays;
/* compiled from: GeobFrame.java */
/* loaded from: classes.dex */
public final class f extends h {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: v  reason: collision with root package name */
    public final String f24121v;

    /* renamed from: w  reason: collision with root package name */
    public final String f24122w;

    /* renamed from: x  reason: collision with root package name */
    public final String f24123x;

    /* renamed from: y  reason: collision with root package name */
    public final byte[] f24124y;

    /* compiled from: GeobFrame.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i6) {
            return new f[i6];
        }
    }

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f24121v = str;
        this.f24122w = str2;
        this.f24123x = str3;
        this.f24124y = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (w.a(this.f24121v, fVar.f24121v) && w.a(this.f24122w, fVar.f24122w) && w.a(this.f24123x, fVar.f24123x) && Arrays.equals(this.f24124y, fVar.f24124y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int i10;
        int i11 = 0;
        String str = this.f24121v;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        int i12 = (527 + i6) * 31;
        String str2 = this.f24122w;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i12 + i10) * 31;
        String str3 = this.f24123x;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return Arrays.hashCode(this.f24124y) + ((i13 + i11) * 31);
    }

    @Override // l8.h
    public final String toString() {
        String str = this.f24130u;
        int c10 = ri.e.c(str, 36);
        String str2 = this.f24121v;
        int c11 = ri.e.c(str2, c10);
        String str3 = this.f24122w;
        int c12 = ri.e.c(str3, c11);
        String str4 = this.f24123x;
        StringBuilder n10 = defpackage.e.n(ri.e.c(str4, c12), str, ": mimeType=", str2, ", filename=");
        n10.append(str3);
        n10.append(", description=");
        n10.append(str4);
        return n10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.f24121v);
        parcel.writeString(this.f24122w);
        parcel.writeString(this.f24123x);
        parcel.writeByteArray(this.f24124y);
    }

    public f(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i6 = w.f5205a;
        this.f24121v = readString;
        this.f24122w = parcel.readString();
        this.f24123x = parcel.readString();
        this.f24124y = parcel.createByteArray();
    }
}
