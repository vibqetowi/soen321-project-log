package m8;

import android.os.Parcel;
import android.os.Parcelable;
import c9.w;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.r;
import g8.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: SlowMotionData.java */
/* loaded from: classes.dex */
public final class c implements a.b {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: u  reason: collision with root package name */
    public final List<b> f24933u;

    /* compiled from: SlowMotionData.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, b.class.getClassLoader());
            return new c(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i6) {
            return new c[i6];
        }
    }

    /* compiled from: SlowMotionData.java */
    /* loaded from: classes.dex */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: u  reason: collision with root package name */
        public final long f24934u;

        /* renamed from: v  reason: collision with root package name */
        public final long f24935v;

        /* renamed from: w  reason: collision with root package name */
        public final int f24936w;

        /* compiled from: SlowMotionData.java */
        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i6) {
                return new b[i6];
            }
        }

        public b(int i6, long j10, long j11) {
            boolean z10;
            if (j10 < j11) {
                z10 = true;
            } else {
                z10 = false;
            }
            sc.b.q(z10);
            this.f24934u = j10;
            this.f24935v = j11;
            this.f24936w = i6;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f24934u == bVar.f24934u && this.f24935v == bVar.f24935v && this.f24936w == bVar.f24936w) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.f24934u), Long.valueOf(this.f24935v), Integer.valueOf(this.f24936w)});
        }

        public final String toString() {
            return w.k("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f24934u), Long.valueOf(this.f24935v), Integer.valueOf(this.f24936w));
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            parcel.writeLong(this.f24934u);
            parcel.writeLong(this.f24935v);
            parcel.writeInt(this.f24936w);
        }
    }

    public c(ArrayList arrayList) {
        this.f24933u = arrayList;
        boolean z10 = false;
        if (!arrayList.isEmpty()) {
            long j10 = ((b) arrayList.get(0)).f24935v;
            int i6 = 1;
            while (true) {
                if (i6 >= arrayList.size()) {
                    break;
                } else if (((b) arrayList.get(i6)).f24934u < j10) {
                    z10 = true;
                    break;
                } else {
                    j10 = ((b) arrayList.get(i6)).f24935v;
                    i6++;
                }
            }
        }
        sc.b.q(!z10);
    }

    @Override // g8.a.b
    public final /* synthetic */ n C() {
        return null;
    }

    @Override // g8.a.b
    public final /* synthetic */ byte[] c0() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            return this.f24933u.equals(((c) obj).f24933u);
        }
        return false;
    }

    public final int hashCode() {
        return this.f24933u.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f24933u);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 21);
        sb2.append("SlowMotion: segments=");
        sb2.append(valueOf);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeList(this.f24933u);
    }

    @Override // g8.a.b
    public final /* synthetic */ void r(r.a aVar) {
    }
}
