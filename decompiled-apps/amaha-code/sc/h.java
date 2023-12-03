package sc;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
/* compiled from: Timestamp.java */
/* loaded from: classes.dex */
public final class h implements Comparable<h>, Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* renamed from: u  reason: collision with root package name */
    public final long f31450u;

    /* renamed from: v  reason: collision with root package name */
    public final int f31451v;

    /* compiled from: Timestamp.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        public final h createFromParcel(Parcel parcel) {
            return new h(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final h[] newArray(int i6) {
            return new h[i6];
        }
    }

    public h(int i6, long j10) {
        f(i6, j10);
        this.f31450u = j10;
        this.f31451v = i6;
    }

    public static void f(int i6, long j10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (i6 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ca.a.u(z10, "Timestamp nanoseconds out of range: %s", Integer.valueOf(i6));
        if (i6 < 1.0E9d) {
            z11 = true;
        } else {
            z11 = false;
        }
        ca.a.u(z11, "Timestamp nanoseconds out of range: %s", Integer.valueOf(i6));
        if (j10 >= -62135596800L) {
            z12 = true;
        } else {
            z12 = false;
        }
        ca.a.u(z12, "Timestamp seconds out of range: %s", Long.valueOf(j10));
        if (j10 < 253402300800L) {
            z13 = true;
        } else {
            z13 = false;
        }
        ca.a.u(z13, "Timestamp seconds out of range: %s", Long.valueOf(j10));
    }

    @Override // java.lang.Comparable
    /* renamed from: d */
    public final int compareTo(h hVar) {
        long j10 = hVar.f31450u;
        long j11 = this.f31450u;
        if (j11 == j10) {
            return Integer.signum(this.f31451v - hVar.f31451v);
        }
        return Long.signum(j11 - j10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof h) && compareTo((h) obj) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f31450u;
        return (((((int) j10) * 37 * 37) + ((int) (j10 >> 32))) * 37) + this.f31451v;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Timestamp(seconds=");
        sb2.append(this.f31450u);
        sb2.append(", nanoseconds=");
        return pl.a.g(sb2, this.f31451v, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeLong(this.f31450u);
        parcel.writeInt(this.f31451v);
    }

    public h(Parcel parcel) {
        this.f31450u = parcel.readLong();
        this.f31451v = parcel.readInt();
    }

    public h(Date date) {
        long time = date.getTime();
        long j10 = time / 1000;
        int i6 = ((int) (time % 1000)) * 1000000;
        if (i6 < 0) {
            j10--;
            i6 += 1000000000;
        }
        f(i6, j10);
        this.f31450u = j10;
        this.f31451v = i6;
    }
}
