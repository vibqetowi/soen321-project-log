package m8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.r;
import g8.a;
/* compiled from: MotionPhotoMetadata.java */
/* loaded from: classes.dex */
public final class b implements a.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: u  reason: collision with root package name */
    public final long f24928u;

    /* renamed from: v  reason: collision with root package name */
    public final long f24929v;

    /* renamed from: w  reason: collision with root package name */
    public final long f24930w;

    /* renamed from: x  reason: collision with root package name */
    public final long f24931x;

    /* renamed from: y  reason: collision with root package name */
    public final long f24932y;

    /* compiled from: MotionPhotoMetadata.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i6) {
            return new b[i6];
        }
    }

    public b(long j10, long j11, long j12, long j13, long j14) {
        this.f24928u = j10;
        this.f24929v = j11;
        this.f24930w = j12;
        this.f24931x = j13;
        this.f24932y = j14;
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
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f24928u == bVar.f24928u && this.f24929v == bVar.f24929v && this.f24930w == bVar.f24930w && this.f24931x == bVar.f24931x && this.f24932y == bVar.f24932y) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f24928u;
        long j11 = this.f24929v;
        int i6 = (int) (j11 ^ (j11 >>> 32));
        long j12 = this.f24930w;
        int i10 = (int) (j12 ^ (j12 >>> 32));
        long j13 = this.f24931x;
        int i11 = (int) (j13 ^ (j13 >>> 32));
        long j14 = this.f24932y;
        return ((int) ((j14 >>> 32) ^ j14)) + ((i11 + ((i10 + ((i6 + ((((int) (j10 ^ (j10 >>> 32))) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(218);
        sb2.append("Motion photo metadata: photoStartPosition=");
        sb2.append(this.f24928u);
        sb2.append(", photoSize=");
        sb2.append(this.f24929v);
        sb2.append(", photoPresentationTimestampUs=");
        sb2.append(this.f24930w);
        sb2.append(", videoStartPosition=");
        sb2.append(this.f24931x);
        sb2.append(", videoSize=");
        sb2.append(this.f24932y);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeLong(this.f24928u);
        parcel.writeLong(this.f24929v);
        parcel.writeLong(this.f24930w);
        parcel.writeLong(this.f24931x);
        parcel.writeLong(this.f24932y);
    }

    public b(Parcel parcel) {
        this.f24928u = parcel.readLong();
        this.f24929v = parcel.readLong();
        this.f24930w = parcel.readLong();
        this.f24931x = parcel.readLong();
        this.f24932y = parcel.readLong();
    }

    @Override // g8.a.b
    public final /* synthetic */ void r(r.a aVar) {
    }
}
