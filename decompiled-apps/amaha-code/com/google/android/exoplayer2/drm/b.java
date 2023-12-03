package com.google.android.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import c9.w;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;
/* compiled from: DrmInitData.java */
/* loaded from: classes.dex */
public final class b implements Comparator<C0134b>, Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: u  reason: collision with root package name */
    public final C0134b[] f6429u;

    /* renamed from: v  reason: collision with root package name */
    public int f6430v;

    /* renamed from: w  reason: collision with root package name */
    public final String f6431w;

    /* renamed from: x  reason: collision with root package name */
    public final int f6432x;

    /* compiled from: DrmInitData.java */
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

    public b() {
        throw null;
    }

    public b(String str, boolean z10, C0134b... c0134bArr) {
        this.f6431w = str;
        c0134bArr = z10 ? (C0134b[]) c0134bArr.clone() : c0134bArr;
        this.f6429u = c0134bArr;
        this.f6432x = c0134bArr.length;
        Arrays.sort(c0134bArr, this);
    }

    public final b a(String str) {
        if (w.a(this.f6431w, str)) {
            return this;
        }
        return new b(str, false, this.f6429u);
    }

    @Override // java.util.Comparator
    public final int compare(C0134b c0134b, C0134b c0134b2) {
        C0134b c0134b3 = c0134b;
        C0134b c0134b4 = c0134b2;
        UUID uuid = o7.b.f27180a;
        if (uuid.equals(c0134b3.f6434v)) {
            if (uuid.equals(c0134b4.f6434v)) {
                return 0;
            }
            return 1;
        }
        return c0134b3.f6434v.compareTo(c0134b4.f6434v);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (w.a(this.f6431w, bVar.f6431w) && Arrays.equals(this.f6429u, bVar.f6429u)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f6430v == 0) {
            String str = this.f6431w;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f6430v = (hashCode * 31) + Arrays.hashCode(this.f6429u);
        }
        return this.f6430v;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.f6431w);
        parcel.writeTypedArray(this.f6429u, 0);
    }

    /* compiled from: DrmInitData.java */
    /* renamed from: com.google.android.exoplayer2.drm.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0134b implements Parcelable {
        public static final Parcelable.Creator<C0134b> CREATOR = new a();

        /* renamed from: u  reason: collision with root package name */
        public int f6433u;

        /* renamed from: v  reason: collision with root package name */
        public final UUID f6434v;

        /* renamed from: w  reason: collision with root package name */
        public final String f6435w;

        /* renamed from: x  reason: collision with root package name */
        public final String f6436x;

        /* renamed from: y  reason: collision with root package name */
        public final byte[] f6437y;

        /* compiled from: DrmInitData.java */
        /* renamed from: com.google.android.exoplayer2.drm.b$b$a */
        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<C0134b> {
            @Override // android.os.Parcelable.Creator
            public final C0134b createFromParcel(Parcel parcel) {
                return new C0134b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final C0134b[] newArray(int i6) {
                return new C0134b[i6];
            }
        }

        public C0134b() {
            throw null;
        }

        public C0134b(UUID uuid, String str, String str2, byte[] bArr) {
            uuid.getClass();
            this.f6434v = uuid;
            this.f6435w = str;
            str2.getClass();
            this.f6436x = str2;
            this.f6437y = bArr;
        }

        public final boolean a(UUID uuid) {
            UUID uuid2 = o7.b.f27180a;
            UUID uuid3 = this.f6434v;
            if (!uuid2.equals(uuid3) && !uuid.equals(uuid3)) {
                return false;
            }
            return true;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C0134b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            C0134b c0134b = (C0134b) obj;
            if (!w.a(this.f6435w, c0134b.f6435w) || !w.a(this.f6436x, c0134b.f6436x) || !w.a(this.f6434v, c0134b.f6434v) || !Arrays.equals(this.f6437y, c0134b.f6437y)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int hashCode;
            if (this.f6433u == 0) {
                int hashCode2 = this.f6434v.hashCode() * 31;
                String str = this.f6435w;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                this.f6433u = Arrays.hashCode(this.f6437y) + pl.a.c(this.f6436x, (hashCode2 + hashCode) * 31, 31);
            }
            return this.f6433u;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            UUID uuid = this.f6434v;
            parcel.writeLong(uuid.getMostSignificantBits());
            parcel.writeLong(uuid.getLeastSignificantBits());
            parcel.writeString(this.f6435w);
            parcel.writeString(this.f6436x);
            parcel.writeByteArray(this.f6437y);
        }

        public C0134b(Parcel parcel) {
            this.f6434v = new UUID(parcel.readLong(), parcel.readLong());
            this.f6435w = parcel.readString();
            String readString = parcel.readString();
            int i6 = w.f5205a;
            this.f6436x = readString;
            this.f6437y = parcel.createByteArray();
        }
    }

    public b(Parcel parcel) {
        this.f6431w = parcel.readString();
        C0134b[] c0134bArr = (C0134b[]) parcel.createTypedArray(C0134b.CREATOR);
        int i6 = w.f5205a;
        this.f6429u = c0134bArr;
        this.f6432x = c0134bArr.length;
    }
}
