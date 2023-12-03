package n8;

import android.os.Parcel;
import android.os.Parcelable;
import c9.q;
/* compiled from: TimeSignalCommand.java */
/* loaded from: classes.dex */
public final class g extends b {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* renamed from: u  reason: collision with root package name */
    public final long f25946u;

    /* renamed from: v  reason: collision with root package name */
    public final long f25947v;

    /* compiled from: TimeSignalCommand.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            return new g(parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i6) {
            return new g[i6];
        }
    }

    public g(long j10, long j11) {
        this.f25946u = j10;
        this.f25947v = j11;
    }

    public static long a(long j10, q qVar) {
        long q10 = qVar.q();
        if ((128 & q10) != 0) {
            return 8589934591L & ((((q10 & 1) << 32) | qVar.r()) + j10);
        }
        return -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeLong(this.f25946u);
        parcel.writeLong(this.f25947v);
    }
}
