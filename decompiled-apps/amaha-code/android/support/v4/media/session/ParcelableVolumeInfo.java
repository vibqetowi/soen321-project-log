package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: u  reason: collision with root package name */
    public final int f910u;

    /* renamed from: v  reason: collision with root package name */
    public final int f911v;

    /* renamed from: w  reason: collision with root package name */
    public final int f912w;

    /* renamed from: x  reason: collision with root package name */
    public final int f913x;

    /* renamed from: y  reason: collision with root package name */
    public final int f914y;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        @Override // android.os.Parcelable.Creator
        public final ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ParcelableVolumeInfo[] newArray(int i6) {
            return new ParcelableVolumeInfo[i6];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f910u = parcel.readInt();
        this.f912w = parcel.readInt();
        this.f913x = parcel.readInt();
        this.f914y = parcel.readInt();
        this.f911v = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeInt(this.f910u);
        parcel.writeInt(this.f912w);
        parcel.writeInt(this.f913x);
        parcel.writeInt(this.f914y);
        parcel.writeInt(this.f911v);
    }
}
