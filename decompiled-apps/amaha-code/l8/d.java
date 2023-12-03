package l8;

import android.os.Parcel;
import android.os.Parcelable;
import c9.w;
import java.util.Arrays;
/* compiled from: ChapterTocFrame.java */
/* loaded from: classes.dex */
public final class d extends h {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: v  reason: collision with root package name */
    public final String f24113v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f24114w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f24115x;

    /* renamed from: y  reason: collision with root package name */
    public final String[] f24116y;

    /* renamed from: z  reason: collision with root package name */
    public final h[] f24117z;

    /* compiled from: ChapterTocFrame.java */
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

    public d(String str, boolean z10, boolean z11, String[] strArr, h[] hVarArr) {
        super("CTOC");
        this.f24113v = str;
        this.f24114w = z10;
        this.f24115x = z11;
        this.f24116y = strArr;
        this.f24117z = hVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f24114w == dVar.f24114w && this.f24115x == dVar.f24115x && w.a(this.f24113v, dVar.f24113v) && Arrays.equals(this.f24116y, dVar.f24116y) && Arrays.equals(this.f24117z, dVar.f24117z)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int i10 = (((527 + (this.f24114w ? 1 : 0)) * 31) + (this.f24115x ? 1 : 0)) * 31;
        String str = this.f24113v;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        return i10 + i6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.f24113v);
        parcel.writeByte(this.f24114w ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f24115x ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f24116y);
        h[] hVarArr = this.f24117z;
        parcel.writeInt(hVarArr.length);
        for (h hVar : hVarArr) {
            parcel.writeParcelable(hVar, 0);
        }
    }

    public d(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i6 = w.f5205a;
        this.f24113v = readString;
        this.f24114w = parcel.readByte() != 0;
        this.f24115x = parcel.readByte() != 0;
        this.f24116y = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f24117z = new h[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f24117z[i10] = (h) parcel.readParcelable(h.class.getClassLoader());
        }
    }
}
