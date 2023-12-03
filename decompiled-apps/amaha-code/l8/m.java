package l8;

import android.os.Parcel;
import android.os.Parcelable;
import c9.w;
/* compiled from: UrlLinkFrame.java */
/* loaded from: classes.dex */
public final class m extends h {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: v  reason: collision with root package name */
    public final String f24143v;

    /* renamed from: w  reason: collision with root package name */
    public final String f24144w;

    /* compiled from: UrlLinkFrame.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<m> {
        @Override // android.os.Parcelable.Creator
        public final m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final m[] newArray(int i6) {
            return new m[i6];
        }
    }

    public m(String str, String str2, String str3) {
        super(str);
        this.f24143v = str2;
        this.f24144w = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f24130u.equals(mVar.f24130u) && w.a(this.f24143v, mVar.f24143v) && w.a(this.f24144w, mVar.f24144w)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int c10 = pl.a.c(this.f24130u, 527, 31);
        int i10 = 0;
        String str = this.f24143v;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        int i11 = (c10 + i6) * 31;
        String str2 = this.f24144w;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 + i10;
    }

    @Override // l8.h
    public final String toString() {
        String str = this.f24130u;
        int c10 = ri.e.c(str, 6);
        String str2 = this.f24144w;
        StringBuilder sb2 = new StringBuilder(ri.e.c(str2, c10));
        sb2.append(str);
        sb2.append(": url=");
        sb2.append(str2);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.f24130u);
        parcel.writeString(this.f24143v);
        parcel.writeString(this.f24144w);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m(Parcel parcel) {
        super(r0);
        String readString = parcel.readString();
        int i6 = w.f5205a;
        this.f24143v = parcel.readString();
        this.f24144w = parcel.readString();
    }
}
