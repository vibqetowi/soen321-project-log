package l8;

import android.os.Parcel;
import android.os.Parcelable;
import c9.w;
import java.util.Arrays;
/* compiled from: PrivFrame.java */
/* loaded from: classes.dex */
public final class k extends h {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* renamed from: v  reason: collision with root package name */
    public final String f24139v;

    /* renamed from: w  reason: collision with root package name */
    public final byte[] f24140w;

    /* compiled from: PrivFrame.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        public final k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final k[] newArray(int i6) {
            return new k[i6];
        }
    }

    public k(String str, byte[] bArr) {
        super("PRIV");
        this.f24139v = str;
        this.f24140w = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (w.a(this.f24139v, kVar.f24139v) && Arrays.equals(this.f24140w, kVar.f24140w)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        String str = this.f24139v;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        return Arrays.hashCode(this.f24140w) + ((527 + i6) * 31);
    }

    @Override // l8.h
    public final String toString() {
        String str = this.f24130u;
        int c10 = ri.e.c(str, 8);
        String str2 = this.f24139v;
        StringBuilder sb2 = new StringBuilder(ri.e.c(str2, c10));
        sb2.append(str);
        sb2.append(": owner=");
        sb2.append(str2);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.f24139v);
        parcel.writeByteArray(this.f24140w);
    }

    public k(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i6 = w.f5205a;
        this.f24139v = readString;
        this.f24140w = parcel.createByteArray();
    }
}
