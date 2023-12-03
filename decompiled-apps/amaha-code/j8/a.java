package j8;

import android.os.Parcel;
import android.os.Parcelable;
import c9.w;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.r;
import g8.a;
import java.util.Arrays;
import ri.e;
/* compiled from: PictureFrame.java */
/* loaded from: classes.dex */
public final class a implements a.b {
    public static final Parcelable.Creator<a> CREATOR = new C0324a();
    public final int A;
    public final byte[] B;

    /* renamed from: u  reason: collision with root package name */
    public final int f21742u;

    /* renamed from: v  reason: collision with root package name */
    public final String f21743v;

    /* renamed from: w  reason: collision with root package name */
    public final String f21744w;

    /* renamed from: x  reason: collision with root package name */
    public final int f21745x;

    /* renamed from: y  reason: collision with root package name */
    public final int f21746y;

    /* renamed from: z  reason: collision with root package name */
    public final int f21747z;

    /* compiled from: PictureFrame.java */
    /* renamed from: j8.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0324a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i6) {
            return new a[i6];
        }
    }

    public a(int i6, String str, String str2, int i10, int i11, int i12, int i13, byte[] bArr) {
        this.f21742u = i6;
        this.f21743v = str;
        this.f21744w = str2;
        this.f21745x = i10;
        this.f21746y = i11;
        this.f21747z = i12;
        this.A = i13;
        this.B = bArr;
    }

    @Override // g8.a.b
    public final /* synthetic */ n C() {
        return null;
    }

    @Override // g8.a.b
    public final /* synthetic */ byte[] c0() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f21742u == aVar.f21742u && this.f21743v.equals(aVar.f21743v) && this.f21744w.equals(aVar.f21744w) && this.f21745x == aVar.f21745x && this.f21746y == aVar.f21746y && this.f21747z == aVar.f21747z && this.A == aVar.A && Arrays.equals(this.B, aVar.B)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int c10 = pl.a.c(this.f21743v, (this.f21742u + 527) * 31, 31);
        return Arrays.hashCode(this.B) + ((((((((pl.a.c(this.f21744w, c10, 31) + this.f21745x) * 31) + this.f21746y) * 31) + this.f21747z) * 31) + this.A) * 31);
    }

    @Override // g8.a.b
    public final void r(r.a aVar) {
        aVar.a(this.B, this.f21742u);
    }

    public final String toString() {
        String str = this.f21743v;
        int c10 = e.c(str, 32);
        String str2 = this.f21744w;
        StringBuilder sb2 = new StringBuilder(e.c(str2, c10));
        sb2.append("Picture: mimeType=");
        sb2.append(str);
        sb2.append(", description=");
        sb2.append(str2);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeInt(this.f21742u);
        parcel.writeString(this.f21743v);
        parcel.writeString(this.f21744w);
        parcel.writeInt(this.f21745x);
        parcel.writeInt(this.f21746y);
        parcel.writeInt(this.f21747z);
        parcel.writeInt(this.A);
        parcel.writeByteArray(this.B);
    }

    public a(Parcel parcel) {
        this.f21742u = parcel.readInt();
        String readString = parcel.readString();
        int i6 = w.f5205a;
        this.f21743v = readString;
        this.f21744w = parcel.readString();
        this.f21745x = parcel.readInt();
        this.f21746y = parcel.readInt();
        this.f21747z = parcel.readInt();
        this.A = parcel.readInt();
        this.B = parcel.createByteArray();
    }
}
