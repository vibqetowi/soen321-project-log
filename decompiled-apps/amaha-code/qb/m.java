package qb;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
/* compiled from: ParcelableSparseArray.java */
/* loaded from: classes.dex */
public final class m extends SparseArray<Parcelable> implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* compiled from: ParcelableSparseArray.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.ClassLoaderCreator<m> {
        @Override // android.os.Parcelable.ClassLoaderCreator
        public final m createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new m(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i6) {
            return new m[i6];
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return new m(parcel, null);
        }
    }

    public m() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int size = size();
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = keyAt(i10);
            parcelableArr[i10] = valueAt(i10);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i6);
    }

    public m(Parcel parcel, ClassLoader classLoader) {
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        for (int i6 = 0; i6 < readInt; i6++) {
            put(iArr[i6], readParcelableArray[i6]);
        }
    }
}
