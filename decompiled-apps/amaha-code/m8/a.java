package m8;

import android.os.Parcel;
import android.os.Parcelable;
import c9.w;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.r;
import g8.a;
import java.util.Arrays;
/* compiled from: MdtaMetadataEntry.java */
/* loaded from: classes.dex */
public final class a implements a.b {
    public static final Parcelable.Creator<a> CREATOR = new C0405a();

    /* renamed from: u  reason: collision with root package name */
    public final String f24924u;

    /* renamed from: v  reason: collision with root package name */
    public final byte[] f24925v;

    /* renamed from: w  reason: collision with root package name */
    public final int f24926w;

    /* renamed from: x  reason: collision with root package name */
    public final int f24927x;

    /* compiled from: MdtaMetadataEntry.java */
    /* renamed from: m8.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0405a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i6) {
            return new a[i6];
        }
    }

    public a(int i6, int i10, String str, byte[] bArr) {
        this.f24924u = str;
        this.f24925v = bArr;
        this.f24926w = i6;
        this.f24927x = i10;
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
        if (this.f24924u.equals(aVar.f24924u) && Arrays.equals(this.f24925v, aVar.f24925v) && this.f24926w == aVar.f24926w && this.f24927x == aVar.f24927x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f24925v) + pl.a.c(this.f24924u, 527, 31)) * 31) + this.f24926w) * 31) + this.f24927x;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f24924u);
        if (valueOf.length() != 0) {
            return "mdta: key=".concat(valueOf);
        }
        return new String("mdta: key=");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.f24924u);
        parcel.writeByteArray(this.f24925v);
        parcel.writeInt(this.f24926w);
        parcel.writeInt(this.f24927x);
    }

    public a(Parcel parcel) {
        String readString = parcel.readString();
        int i6 = w.f5205a;
        this.f24924u = readString;
        this.f24925v = parcel.createByteArray();
        this.f24926w = parcel.readInt();
        this.f24927x = parcel.readInt();
    }

    @Override // g8.a.b
    public final /* synthetic */ void r(r.a aVar) {
    }
}
