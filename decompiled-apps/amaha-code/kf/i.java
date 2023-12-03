package kf;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
/* compiled from: Timer.java */
/* loaded from: classes.dex */
public final class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* renamed from: u  reason: collision with root package name */
    public long f23322u;

    /* renamed from: v  reason: collision with root package name */
    public long f23323v;

    /* compiled from: Timer.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        public final i createFromParcel(Parcel parcel) {
            return new i(parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final i[] newArray(int i6) {
            return new i[i6];
        }
    }

    public i() {
        this(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()), TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos()));
    }

    public final long a() {
        return new i().f23323v - this.f23323v;
    }

    public final long b() {
        return this.f23322u;
    }

    public final void c() {
        this.f23322u = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        this.f23323v = TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeLong(this.f23322u);
        parcel.writeLong(this.f23323v);
    }

    public i(long j10, long j11) {
        this.f23322u = j10;
        this.f23323v = j11;
    }
}
