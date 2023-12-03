package l8;

import android.os.Parcel;
import android.os.Parcelable;
import c9.w;
import java.util.Arrays;
/* compiled from: MlltFrame.java */
/* loaded from: classes.dex */
public final class j extends h {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* renamed from: v  reason: collision with root package name */
    public final int f24134v;

    /* renamed from: w  reason: collision with root package name */
    public final int f24135w;

    /* renamed from: x  reason: collision with root package name */
    public final int f24136x;

    /* renamed from: y  reason: collision with root package name */
    public final int[] f24137y;

    /* renamed from: z  reason: collision with root package name */
    public final int[] f24138z;

    /* compiled from: MlltFrame.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        public final j createFromParcel(Parcel parcel) {
            return new j(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final j[] newArray(int i6) {
            return new j[i6];
        }
    }

    public j(int i6, int i10, int[] iArr, int[] iArr2, int i11) {
        super("MLLT");
        this.f24134v = i6;
        this.f24135w = i10;
        this.f24136x = i11;
        this.f24137y = iArr;
        this.f24138z = iArr2;
    }

    @Override // l8.h, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f24134v == jVar.f24134v && this.f24135w == jVar.f24135w && this.f24136x == jVar.f24136x && Arrays.equals(this.f24137y, jVar.f24137y) && Arrays.equals(this.f24138z, jVar.f24138z)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f24137y);
        return Arrays.hashCode(this.f24138z) + ((hashCode + ((((((527 + this.f24134v) * 31) + this.f24135w) * 31) + this.f24136x) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeInt(this.f24134v);
        parcel.writeInt(this.f24135w);
        parcel.writeInt(this.f24136x);
        parcel.writeIntArray(this.f24137y);
        parcel.writeIntArray(this.f24138z);
    }

    public j(Parcel parcel) {
        super("MLLT");
        this.f24134v = parcel.readInt();
        this.f24135w = parcel.readInt();
        this.f24136x = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        int i6 = w.f5205a;
        this.f24137y = createIntArray;
        this.f24138z = parcel.createIntArray();
    }
}
