package j8;

import android.os.Parcel;
import android.os.Parcelable;
import c9.w;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.r;
import g8.a;
import ri.e;
/* compiled from: VorbisComment.java */
/* loaded from: classes.dex */
public final class b implements a.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: u  reason: collision with root package name */
    public final String f21748u;

    /* renamed from: v  reason: collision with root package name */
    public final String f21749v;

    /* compiled from: VorbisComment.java */
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

    public b(String str, String str2) {
        this.f21748u = str;
        this.f21749v = str2;
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
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f21748u.equals(bVar.f21748u) && this.f21749v.equals(bVar.f21749v)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f21749v.hashCode() + pl.a.c(this.f21748u, 527, 31);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // g8.a.b
    public final void r(r.a aVar) {
        char c10;
        String str = this.f21748u;
        str.getClass();
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        String str2 = this.f21749v;
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 != 3) {
                        if (c10 == 4) {
                            aVar.f6760b = str2;
                            return;
                        }
                        return;
                    }
                    aVar.f6762d = str2;
                    return;
                }
                aVar.f6764g = str2;
                return;
            }
            aVar.f6759a = str2;
            return;
        }
        aVar.f6761c = str2;
    }

    public final String toString() {
        String str = this.f21748u;
        int c10 = e.c(str, 5);
        String str2 = this.f21749v;
        StringBuilder sb2 = new StringBuilder(e.c(str2, c10));
        sb2.append("VC: ");
        sb2.append(str);
        sb2.append("=");
        sb2.append(str2);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.f21748u);
        parcel.writeString(this.f21749v);
    }

    public b(Parcel parcel) {
        String readString = parcel.readString();
        int i6 = w.f5205a;
        this.f21748u = readString;
        this.f21749v = parcel.readString();
    }
}
