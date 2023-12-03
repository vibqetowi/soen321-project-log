package l8;

import android.os.Parcel;
import android.os.Parcelable;
import c9.w;
import com.google.android.exoplayer2.r;
import java.util.Arrays;
/* compiled from: ApicFrame.java */
/* loaded from: classes.dex */
public final class a extends h {
    public static final Parcelable.Creator<a> CREATOR = new C0378a();

    /* renamed from: v  reason: collision with root package name */
    public final String f24103v;

    /* renamed from: w  reason: collision with root package name */
    public final String f24104w;

    /* renamed from: x  reason: collision with root package name */
    public final int f24105x;

    /* renamed from: y  reason: collision with root package name */
    public final byte[] f24106y;

    /* compiled from: ApicFrame.java */
    /* renamed from: l8.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0378a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i6) {
            return new a[i6];
        }
    }

    public a(String str, String str2, int i6, byte[] bArr) {
        super("APIC");
        this.f24103v = str;
        this.f24104w = str2;
        this.f24105x = i6;
        this.f24106y = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f24105x == aVar.f24105x && w.a(this.f24103v, aVar.f24103v) && w.a(this.f24104w, aVar.f24104w) && Arrays.equals(this.f24106y, aVar.f24106y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int i10 = (527 + this.f24105x) * 31;
        int i11 = 0;
        String str = this.f24103v;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        int i12 = (i10 + i6) * 31;
        String str2 = this.f24104w;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return Arrays.hashCode(this.f24106y) + ((i12 + i11) * 31);
    }

    @Override // l8.h, g8.a.b
    public final void r(r.a aVar) {
        aVar.a(this.f24106y, this.f24105x);
    }

    @Override // l8.h
    public final String toString() {
        String str = this.f24130u;
        int c10 = ri.e.c(str, 25);
        String str2 = this.f24103v;
        int c11 = ri.e.c(str2, c10);
        String str3 = this.f24104w;
        StringBuilder n10 = defpackage.e.n(ri.e.c(str3, c11), str, ": mimeType=", str2, ", description=");
        n10.append(str3);
        return n10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.f24103v);
        parcel.writeString(this.f24104w);
        parcel.writeInt(this.f24105x);
        parcel.writeByteArray(this.f24106y);
    }

    public a(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i6 = w.f5205a;
        this.f24103v = readString;
        this.f24104w = parcel.readString();
        this.f24105x = parcel.readInt();
        this.f24106y = parcel.createByteArray();
    }
}
