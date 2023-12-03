package i8;

import android.os.Parcel;
import android.os.Parcelable;
import c9.w;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.r;
import g8.a;
import java.util.Arrays;
import ri.e;
/* compiled from: EventMessage.java */
/* loaded from: classes.dex */
public final class a implements a.b {
    public static final n A;
    public static final n B;
    public static final Parcelable.Creator<a> CREATOR;

    /* renamed from: u  reason: collision with root package name */
    public final String f19910u;

    /* renamed from: v  reason: collision with root package name */
    public final String f19911v;

    /* renamed from: w  reason: collision with root package name */
    public final long f19912w;

    /* renamed from: x  reason: collision with root package name */
    public final long f19913x;

    /* renamed from: y  reason: collision with root package name */
    public final byte[] f19914y;

    /* renamed from: z  reason: collision with root package name */
    public int f19915z;

    /* compiled from: EventMessage.java */
    /* renamed from: i8.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0301a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i6) {
            return new a[i6];
        }
    }

    static {
        n.a aVar = new n.a();
        aVar.f6665k = "application/id3";
        A = aVar.a();
        n.a aVar2 = new n.a();
        aVar2.f6665k = "application/x-scte35";
        B = aVar2.a();
        CREATOR = new C0301a();
    }

    public a(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f19910u = str;
        this.f19911v = str2;
        this.f19912w = j10;
        this.f19913x = j11;
        this.f19914y = bArr;
    }

    @Override // g8.a.b
    public final n C() {
        String str = this.f19910u;
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c10 = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return B;
            case 1:
            case 2:
                return A;
            default:
                return null;
        }
    }

    @Override // g8.a.b
    public final byte[] c0() {
        if (C() != null) {
            return this.f19914y;
        }
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
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f19912w == aVar.f19912w && this.f19913x == aVar.f19913x && w.a(this.f19910u, aVar.f19910u) && w.a(this.f19911v, aVar.f19911v) && Arrays.equals(this.f19914y, aVar.f19914y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        if (this.f19915z == 0) {
            int i10 = 0;
            String str = this.f19910u;
            if (str != null) {
                i6 = str.hashCode();
            } else {
                i6 = 0;
            }
            int i11 = (527 + i6) * 31;
            String str2 = this.f19911v;
            if (str2 != null) {
                i10 = str2.hashCode();
            }
            long j10 = this.f19912w;
            long j11 = this.f19913x;
            this.f19915z = Arrays.hashCode(this.f19914y) + ((((((i11 + i10) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31);
        }
        return this.f19915z;
    }

    public final String toString() {
        String str = this.f19910u;
        int c10 = e.c(str, 79);
        String str2 = this.f19911v;
        StringBuilder sb2 = new StringBuilder(e.c(str2, c10));
        sb2.append("EMSG: scheme=");
        sb2.append(str);
        sb2.append(", id=");
        sb2.append(this.f19913x);
        sb2.append(", durationMs=");
        sb2.append(this.f19912w);
        sb2.append(", value=");
        sb2.append(str2);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.f19910u);
        parcel.writeString(this.f19911v);
        parcel.writeLong(this.f19912w);
        parcel.writeLong(this.f19913x);
        parcel.writeByteArray(this.f19914y);
    }

    public a(Parcel parcel) {
        String readString = parcel.readString();
        int i6 = w.f5205a;
        this.f19910u = readString;
        this.f19911v = parcel.readString();
        this.f19912w = parcel.readLong();
        this.f19913x = parcel.readLong();
        this.f19914y = parcel.createByteArray();
    }

    @Override // g8.a.b
    public final /* synthetic */ void r(r.a aVar) {
    }
}
