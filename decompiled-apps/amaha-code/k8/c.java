package k8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.r;
import g8.a;
import java.util.Arrays;
/* compiled from: IcyInfo.java */
/* loaded from: classes.dex */
public final class c implements a.b {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: u  reason: collision with root package name */
    public final byte[] f23074u;

    /* renamed from: v  reason: collision with root package name */
    public final String f23075v;

    /* renamed from: w  reason: collision with root package name */
    public final String f23076w;

    /* compiled from: IcyInfo.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i6) {
            return new c[i6];
        }
    }

    public c(String str, String str2, byte[] bArr) {
        this.f23074u = bArr;
        this.f23075v = str;
        this.f23076w = str2;
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
        if (obj != null && c.class == obj.getClass()) {
            return Arrays.equals(this.f23074u, ((c) obj).f23074u);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f23074u);
    }

    @Override // g8.a.b
    public final void r(r.a aVar) {
        String str = this.f23075v;
        if (str != null) {
            aVar.f6759a = str;
        }
    }

    public final String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f23075v, this.f23076w, Integer.valueOf(this.f23074u.length));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeByteArray(this.f23074u);
        parcel.writeString(this.f23075v);
        parcel.writeString(this.f23076w);
    }

    public c(Parcel parcel) {
        byte[] createByteArray = parcel.createByteArray();
        createByteArray.getClass();
        this.f23074u = createByteArray;
        this.f23075v = parcel.readString();
        this.f23076w = parcel.readString();
    }
}
