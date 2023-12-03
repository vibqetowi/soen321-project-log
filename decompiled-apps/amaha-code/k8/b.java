package k8;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import c9.w;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.r;
import g8.a;
import java.util.List;
import java.util.Map;
import ri.e;
/* compiled from: IcyHeaders.java */
/* loaded from: classes.dex */
public final class b implements a.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: u  reason: collision with root package name */
    public final int f23068u;

    /* renamed from: v  reason: collision with root package name */
    public final String f23069v;

    /* renamed from: w  reason: collision with root package name */
    public final String f23070w;

    /* renamed from: x  reason: collision with root package name */
    public final String f23071x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f23072y;

    /* renamed from: z  reason: collision with root package name */
    public final int f23073z;

    /* compiled from: IcyHeaders.java */
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

    public b(int i6, int i10, String str, String str2, String str3, boolean z10) {
        sc.b.q(i10 == -1 || i10 > 0);
        this.f23068u = i6;
        this.f23069v = str;
        this.f23070w = str2;
        this.f23071x = str3;
        this.f23072y = z10;
        this.f23073z = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b a(Map<String, List<String>> map) {
        boolean z10;
        int i6;
        List<String> list;
        String str;
        List<String> list2;
        String str2;
        List<String> list3;
        String str3;
        List<String> list4;
        boolean z11;
        List<String> list5;
        String str4;
        String str5;
        int i10;
        String str6;
        String str7;
        List<String> list6 = map.get("icy-br");
        boolean z12 = true;
        int i11 = -1;
        if (list6 != null) {
            String str8 = list6.get(0);
            try {
                i10 = Integer.parseInt(str8) * 1000;
                if (i10 > 0) {
                    z10 = true;
                } else {
                    try {
                        String valueOf = String.valueOf(str8);
                        if (valueOf.length() != 0) {
                            str7 = "Invalid bitrate: ".concat(valueOf);
                        } else {
                            str7 = new String("Invalid bitrate: ");
                        }
                        Log.w("IcyHeaders", str7);
                        z10 = false;
                        i10 = -1;
                    } catch (NumberFormatException unused) {
                        String valueOf2 = String.valueOf(str8);
                        if (valueOf2.length() != 0) {
                            str6 = "Invalid bitrate header: ".concat(valueOf2);
                        } else {
                            str6 = new String("Invalid bitrate header: ");
                        }
                        Log.w("IcyHeaders", str6);
                        i6 = i10;
                        z10 = false;
                        list = map.get("icy-genre");
                        if (list == null) {
                        }
                        list2 = map.get("icy-name");
                        if (list2 == null) {
                        }
                        list3 = map.get("icy-url");
                        if (list3 == null) {
                        }
                        list4 = map.get("icy-pub");
                        if (list4 == null) {
                        }
                        list5 = map.get("icy-metaint");
                        if (list5 != null) {
                        }
                        if (!z10) {
                        }
                    }
                }
                i6 = i10;
            } catch (NumberFormatException unused2) {
                i10 = -1;
            }
        } else {
            z10 = false;
            i6 = -1;
        }
        list = map.get("icy-genre");
        if (list == null) {
            str = list.get(0);
            z10 = true;
        } else {
            str = null;
        }
        list2 = map.get("icy-name");
        if (list2 == null) {
            str2 = list2.get(0);
            z10 = true;
        } else {
            str2 = null;
        }
        list3 = map.get("icy-url");
        if (list3 == null) {
            str3 = list3.get(0);
            z10 = true;
        } else {
            str3 = null;
        }
        list4 = map.get("icy-pub");
        if (list4 == null) {
            z11 = list4.get(0).equals("1");
            z10 = true;
        } else {
            z11 = false;
        }
        list5 = map.get("icy-metaint");
        if (list5 != null) {
            String str9 = list5.get(0);
            try {
                int parseInt = Integer.parseInt(str9);
                if (parseInt > 0) {
                    i11 = parseInt;
                } else {
                    try {
                        String valueOf3 = String.valueOf(str9);
                        if (valueOf3.length() != 0) {
                            str5 = "Invalid metadata interval: ".concat(valueOf3);
                        } else {
                            str5 = new String("Invalid metadata interval: ");
                        }
                        Log.w("IcyHeaders", str5);
                        z12 = z10;
                    } catch (NumberFormatException unused3) {
                        i11 = parseInt;
                        String valueOf4 = String.valueOf(str9);
                        if (valueOf4.length() != 0) {
                            str4 = "Invalid metadata interval: ".concat(valueOf4);
                        } else {
                            str4 = new String("Invalid metadata interval: ");
                        }
                        Log.w("IcyHeaders", str4);
                        if (!z10) {
                        }
                    }
                }
                z10 = z12;
            } catch (NumberFormatException unused4) {
            }
        }
        if (!z10) {
            return null;
        }
        return new b(i6, i11, str, str2, str3, z11);
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
        if (this.f23068u == bVar.f23068u && w.a(this.f23069v, bVar.f23069v) && w.a(this.f23070w, bVar.f23070w) && w.a(this.f23071x, bVar.f23071x) && this.f23072y == bVar.f23072y && this.f23073z == bVar.f23073z) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int i10;
        int i11 = (527 + this.f23068u) * 31;
        int i12 = 0;
        String str = this.f23069v;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        int i13 = (i11 + i6) * 31;
        String str2 = this.f23070w;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (i13 + i10) * 31;
        String str3 = this.f23071x;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return ((((i14 + i12) * 31) + (this.f23072y ? 1 : 0)) * 31) + this.f23073z;
    }

    public final String toString() {
        String str = this.f23070w;
        int c10 = e.c(str, 80);
        String str2 = this.f23069v;
        StringBuilder n10 = e.n(e.c(str2, c10), "IcyHeaders: name=\"", str, "\", genre=\"", str2);
        n10.append("\", bitrate=");
        n10.append(this.f23068u);
        n10.append(", metadataInterval=");
        n10.append(this.f23073z);
        return n10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeInt(this.f23068u);
        parcel.writeString(this.f23069v);
        parcel.writeString(this.f23070w);
        parcel.writeString(this.f23071x);
        int i10 = w.f5205a;
        parcel.writeInt(this.f23072y ? 1 : 0);
        parcel.writeInt(this.f23073z);
    }

    public b(Parcel parcel) {
        this.f23068u = parcel.readInt();
        this.f23069v = parcel.readString();
        this.f23070w = parcel.readString();
        this.f23071x = parcel.readString();
        int i6 = w.f5205a;
        this.f23072y = parcel.readInt() != 0;
        this.f23073z = parcel.readInt();
    }

    @Override // g8.a.b
    public final /* synthetic */ void r(r.a aVar) {
    }
}
