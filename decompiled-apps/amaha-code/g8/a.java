package g8;

import android.os.Parcel;
import android.os.Parcelable;
import c9.w;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.r;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: Metadata.java */
/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0247a();

    /* renamed from: u  reason: collision with root package name */
    public final b[] f16378u;

    /* compiled from: Metadata.java */
    /* renamed from: g8.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0247a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i6) {
            return new a[i6];
        }
    }

    /* compiled from: Metadata.java */
    /* loaded from: classes.dex */
    public interface b extends Parcelable {
        n C();

        byte[] c0();

        void r(r.a aVar);
    }

    public a(b... bVarArr) {
        this.f16378u = bVarArr;
    }

    public final a a(b... bVarArr) {
        if (bVarArr.length == 0) {
            return this;
        }
        int i6 = w.f5205a;
        b[] bVarArr2 = this.f16378u;
        Object[] copyOf = Arrays.copyOf(bVarArr2, bVarArr2.length + bVarArr.length);
        System.arraycopy(bVarArr, 0, copyOf, bVarArr2.length, bVarArr.length);
        return new a((b[]) copyOf);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            return Arrays.equals(this.f16378u, ((a) obj).f16378u);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f16378u);
    }

    public final String toString() {
        String valueOf = String.valueOf(Arrays.toString(this.f16378u));
        if (valueOf.length() != 0) {
            return "entries=".concat(valueOf);
        }
        return new String("entries=");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        b[] bVarArr = this.f16378u;
        parcel.writeInt(bVarArr.length);
        for (b bVar : bVarArr) {
            parcel.writeParcelable(bVar, 0);
        }
    }

    public a(ArrayList arrayList) {
        this.f16378u = (b[]) arrayList.toArray(new b[0]);
    }

    public a(Parcel parcel) {
        this.f16378u = new b[parcel.readInt()];
        int i6 = 0;
        while (true) {
            b[] bVarArr = this.f16378u;
            if (i6 >= bVarArr.length) {
                return;
            }
            bVarArr[i6] = (b) parcel.readParcelable(b.class.getClassLoader());
            i6++;
        }
    }
}
