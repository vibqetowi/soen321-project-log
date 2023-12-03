package n8;

import android.os.Parcel;
import android.os.Parcelable;
import c9.w;
/* compiled from: PrivateCommand.java */
/* loaded from: classes.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new C0426a();

    /* renamed from: u  reason: collision with root package name */
    public final long f25918u;

    /* renamed from: v  reason: collision with root package name */
    public final long f25919v;

    /* renamed from: w  reason: collision with root package name */
    public final byte[] f25920w;

    /* compiled from: PrivateCommand.java */
    /* renamed from: n8.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0426a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i6) {
            return new a[i6];
        }
    }

    public a(long j10, byte[] bArr, long j11) {
        this.f25918u = j11;
        this.f25919v = j10;
        this.f25920w = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeLong(this.f25918u);
        parcel.writeLong(this.f25919v);
        parcel.writeByteArray(this.f25920w);
    }

    public a(Parcel parcel) {
        this.f25918u = parcel.readLong();
        this.f25919v = parcel.readLong();
        byte[] createByteArray = parcel.createByteArray();
        int i6 = w.f5205a;
        this.f25920w = createByteArray;
    }
}
