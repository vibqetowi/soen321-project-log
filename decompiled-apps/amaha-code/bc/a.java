package bc;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import t.h;
/* compiled from: ExtendableSavedState.java */
/* loaded from: classes.dex */
public final class a extends z0.a {
    public static final Parcelable.Creator<a> CREATOR = new C0081a();

    /* renamed from: w  reason: collision with root package name */
    public final h<String, Bundle> f4249w;

    /* compiled from: ExtendableSavedState.java */
    /* renamed from: bc.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0081a implements Parcelable.ClassLoaderCreator<a> {
        @Override // android.os.Parcelable.ClassLoaderCreator
        public final a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new a(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i6) {
            return new a[i6];
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return new a(parcel, null);
        }
    }

    public a(Parcelable parcelable) {
        super(parcelable);
        this.f4249w = new h<>();
    }

    public final String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f4249w + "}";
    }

    @Override // z0.a, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeParcelable(this.f39113u, i6);
        h<String, Bundle> hVar = this.f4249w;
        int i10 = hVar.f32260w;
        parcel.writeInt(i10);
        String[] strArr = new String[i10];
        Bundle[] bundleArr = new Bundle[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            strArr[i11] = hVar.i(i11);
            bundleArr[i11] = hVar.m(i11);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f4249w = new h<>(readInt);
        for (int i6 = 0; i6 < readInt; i6++) {
            this.f4249w.put(strArr[i6], bundleArr[i6]);
        }
    }
}
