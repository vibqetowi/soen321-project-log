package r6;

import android.os.Parcel;
import android.os.ParcelFormatException;
import android.os.Parcelable;
/* compiled from: Entry.java */
/* loaded from: classes.dex */
public class j extends g implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* renamed from: w  reason: collision with root package name */
    public final float f30521w;

    /* compiled from: Entry.java */
    /* loaded from: classes.dex */
    public static class a implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        public final j createFromParcel(Parcel parcel) {
            return new j(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final j[] newArray(int i6) {
            return new j[i6];
        }
    }

    public j() {
        this.f30521w = 0.0f;
    }

    public float b() {
        return this.f30521w;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Entry, x: " + this.f30521w + " y: " + a();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeFloat(this.f30521w);
        parcel.writeFloat(a());
        Object obj = this.f30504v;
        if (obj != null) {
            if (obj instanceof Parcelable) {
                parcel.writeInt(1);
                parcel.writeParcelable((Parcelable) this.f30504v, i6);
                return;
            }
            throw new ParcelFormatException("Cannot parcel an Entry with non-parcelable data");
        }
        parcel.writeInt(0);
    }

    public j(float f, float f2) {
        super(f2);
        this.f30521w = 0.0f;
        this.f30521w = f;
    }

    public j(Parcel parcel) {
        this.f30521w = 0.0f;
        this.f30521w = parcel.readFloat();
        this.f30503u = parcel.readFloat();
        if (parcel.readInt() == 1) {
            this.f30504v = parcel.readParcelable(Object.class.getClassLoader());
        }
    }
}
