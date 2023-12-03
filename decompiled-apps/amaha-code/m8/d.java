package m8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.r;
import g8.a;
/* compiled from: SmtaMetadataEntry.java */
/* loaded from: classes.dex */
public final class d implements a.b {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: u  reason: collision with root package name */
    public final float f24937u;

    /* renamed from: v  reason: collision with root package name */
    public final int f24938v;

    /* compiled from: SmtaMetadataEntry.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i6) {
            return new d[i6];
        }
    }

    public d(float f, int i6) {
        this.f24937u = f;
        this.f24938v = i6;
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
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f24937u == dVar.f24937u && this.f24938v == dVar.f24938v) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f24937u).hashCode() + 527) * 31) + this.f24938v;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(73);
        sb2.append("smta: captureFrameRate=");
        sb2.append(this.f24937u);
        sb2.append(", svcTemporalLayerCount=");
        sb2.append(this.f24938v);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeFloat(this.f24937u);
        parcel.writeInt(this.f24938v);
    }

    public d(Parcel parcel) {
        this.f24937u = parcel.readFloat();
        this.f24938v = parcel.readInt();
    }

    @Override // g8.a.b
    public final /* synthetic */ void r(r.a aVar) {
    }
}
