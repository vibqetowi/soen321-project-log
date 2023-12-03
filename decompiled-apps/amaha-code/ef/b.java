package ef;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: Counter.java */
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: u  reason: collision with root package name */
    public final String f13945u;

    /* renamed from: v  reason: collision with root package name */
    public final AtomicLong f13946v;

    /* compiled from: Counter.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i6) {
            return new b[i6];
        }
    }

    public b(String str) {
        this.f13945u = str;
        this.f13946v = new AtomicLong(0L);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.f13945u);
        parcel.writeLong(this.f13946v.get());
    }

    public b(Parcel parcel) {
        this.f13945u = parcel.readString();
        this.f13946v = new AtomicLong(parcel.readLong());
    }
}
