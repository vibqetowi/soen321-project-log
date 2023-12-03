package h8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.r;
import g8.a;
import ri.e;
/* compiled from: AppInfoTable.java */
/* loaded from: classes.dex */
public final class a implements a.b {
    public static final Parcelable.Creator<a> CREATOR = new C0274a();

    /* renamed from: u  reason: collision with root package name */
    public final int f17343u;

    /* renamed from: v  reason: collision with root package name */
    public final String f17344v;

    /* compiled from: AppInfoTable.java */
    /* renamed from: h8.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0274a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            readString.getClass();
            return new a(parcel.readInt(), readString);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i6) {
            return new a[i6];
        }
    }

    public a(int i6, String str) {
        this.f17343u = i6;
        this.f17344v = str;
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

    public final String toString() {
        String str = this.f17344v;
        StringBuilder sb2 = new StringBuilder(e.c(str, 33));
        sb2.append("Ait(controlCode=");
        sb2.append(this.f17343u);
        sb2.append(",url=");
        sb2.append(str);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.f17344v);
        parcel.writeInt(this.f17343u);
    }

    @Override // g8.a.b
    public final /* synthetic */ void r(r.a aVar) {
    }
}
