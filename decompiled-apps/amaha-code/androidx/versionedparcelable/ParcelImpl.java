package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import j2.b;
import j2.c;
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a();

    /* renamed from: u  reason: collision with root package name */
    public final c f3083u;

    /* loaded from: classes.dex */
    public static class a implements Parcelable.Creator<ParcelImpl> {
        @Override // android.os.Parcelable.Creator
        public final ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ParcelImpl[] newArray(int i6) {
            return new ParcelImpl[i6];
        }
    }

    public ParcelImpl(c cVar) {
        this.f3083u = cVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        new b(parcel).w(this.f3083u);
    }

    public ParcelImpl(Parcel parcel) {
        this.f3083u = new b(parcel).n();
    }
}
