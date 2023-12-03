package l8;

import android.os.Parcel;
import android.os.Parcelable;
import c9.w;
import java.util.Arrays;
/* compiled from: ChapterFrame.java */
/* loaded from: classes.dex */
public final class c extends h {
    public static final Parcelable.Creator<c> CREATOR = new a();
    public final h[] A;

    /* renamed from: v  reason: collision with root package name */
    public final String f24108v;

    /* renamed from: w  reason: collision with root package name */
    public final int f24109w;

    /* renamed from: x  reason: collision with root package name */
    public final int f24110x;

    /* renamed from: y  reason: collision with root package name */
    public final long f24111y;

    /* renamed from: z  reason: collision with root package name */
    public final long f24112z;

    /* compiled from: ChapterFrame.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i6) {
            return new c[i6];
        }
    }

    public c(String str, int i6, int i10, long j10, long j11, h[] hVarArr) {
        super("CHAP");
        this.f24108v = str;
        this.f24109w = i6;
        this.f24110x = i10;
        this.f24111y = j10;
        this.f24112z = j11;
        this.A = hVarArr;
    }

    @Override // l8.h, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f24109w == cVar.f24109w && this.f24110x == cVar.f24110x && this.f24111y == cVar.f24111y && this.f24112z == cVar.f24112z && w.a(this.f24108v, cVar.f24108v) && Arrays.equals(this.A, cVar.A)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int i10 = (((((((527 + this.f24109w) * 31) + this.f24110x) * 31) + ((int) this.f24111y)) * 31) + ((int) this.f24112z)) * 31;
        String str = this.f24108v;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        return i10 + i6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.f24108v);
        parcel.writeInt(this.f24109w);
        parcel.writeInt(this.f24110x);
        parcel.writeLong(this.f24111y);
        parcel.writeLong(this.f24112z);
        h[] hVarArr = this.A;
        parcel.writeInt(hVarArr.length);
        for (h hVar : hVarArr) {
            parcel.writeParcelable(hVar, 0);
        }
    }

    public c(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i6 = w.f5205a;
        this.f24108v = readString;
        this.f24109w = parcel.readInt();
        this.f24110x = parcel.readInt();
        this.f24111y = parcel.readLong();
        this.f24112z = parcel.readLong();
        int readInt = parcel.readInt();
        this.A = new h[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.A[i10] = (h) parcel.readParcelable(h.class.getClassLoader());
        }
    }
}
