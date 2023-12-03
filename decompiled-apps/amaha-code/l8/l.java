package l8;

import android.os.Parcel;
import android.os.Parcelable;
import c9.w;
import com.google.android.exoplayer2.r;
import java.util.ArrayList;
/* compiled from: TextInformationFrame.java */
/* loaded from: classes.dex */
public final class l extends h {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* renamed from: v  reason: collision with root package name */
    public final String f24141v;

    /* renamed from: w  reason: collision with root package name */
    public final String f24142w;

    /* compiled from: TextInformationFrame.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<l> {
        @Override // android.os.Parcelable.Creator
        public final l createFromParcel(Parcel parcel) {
            return new l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final l[] newArray(int i6) {
            return new l[i6];
        }
    }

    public l(String str, String str2, String str3) {
        super(str);
        this.f24141v = str2;
        this.f24142w = str3;
    }

    public static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        if (w.a(this.f24130u, lVar.f24130u) && w.a(this.f24141v, lVar.f24141v) && w.a(this.f24142w, lVar.f24142w)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int c10 = pl.a.c(this.f24130u, 527, 31);
        int i10 = 0;
        String str = this.f24141v;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        int i11 = (c10 + i6) * 31;
        String str2 = this.f24142w;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 + i10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // l8.h, g8.a.b
    public final void r(r.a aVar) {
        char c10;
        Integer num;
        String str = this.f24130u;
        str.getClass();
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c10 = 11;
                    break;
                }
                c10 = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c10 = '\f';
                    break;
                }
                c10 = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c10 = '\r';
                    break;
                }
                c10 = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c10 = 14;
                    break;
                }
                c10 = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c10 = 15;
                    break;
                }
                c10 = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c10 = 16;
                    break;
                }
                c10 = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c10 = 17;
                    break;
                }
                c10 = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c10 = 18;
                    break;
                }
                c10 = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c10 = 19;
                    break;
                }
                c10 = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c10 = 20;
                    break;
                }
                c10 = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c10 = 21;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        String str2 = this.f24142w;
        try {
            switch (c10) {
                case 0:
                case '\n':
                    aVar.f6761c = str2;
                    return;
                case 1:
                case 11:
                    aVar.f6781y = str2;
                    return;
                case 2:
                case '\f':
                    int parseInt = Integer.parseInt(str2.substring(2, 4));
                    int parseInt2 = Integer.parseInt(str2.substring(0, 2));
                    aVar.f6775s = Integer.valueOf(parseInt);
                    aVar.f6776t = Integer.valueOf(parseInt2);
                    return;
                case 3:
                case 17:
                    aVar.f6760b = str2;
                    return;
                case 4:
                case 18:
                    aVar.f6762d = str2;
                    return;
                case 5:
                case 19:
                    aVar.f6782z = str2;
                    return;
                case 6:
                case 20:
                    int i6 = w.f5205a;
                    String[] split = str2.split("/", -1);
                    int parseInt3 = Integer.parseInt(split[0]);
                    if (split.length > 1) {
                        num = Integer.valueOf(Integer.parseInt(split[1]));
                    } else {
                        num = null;
                    }
                    aVar.f6771n = Integer.valueOf(parseInt3);
                    aVar.f6772o = num;
                    return;
                case 7:
                case 16:
                    aVar.f6759a = str2;
                    return;
                case '\b':
                case 15:
                    aVar.f6780x = str2;
                    return;
                case '\t':
                case 21:
                    aVar.r = Integer.valueOf(Integer.parseInt(str2));
                    return;
                case '\r':
                    ArrayList a10 = a(str2);
                    int size = a10.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                aVar.f6776t = (Integer) a10.get(2);
                            } else {
                                return;
                            }
                        }
                        aVar.f6775s = (Integer) a10.get(1);
                    }
                    aVar.r = (Integer) a10.get(0);
                    return;
                case 14:
                    ArrayList a11 = a(str2);
                    int size2 = a11.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                aVar.f6779w = (Integer) a11.get(2);
                            } else {
                                return;
                            }
                        }
                        aVar.f6778v = (Integer) a11.get(1);
                    }
                    aVar.f6777u = (Integer) a11.get(0);
                    return;
                default:
                    return;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    @Override // l8.h
    public final String toString() {
        String str = this.f24130u;
        int c10 = ri.e.c(str, 22);
        String str2 = this.f24141v;
        int c11 = ri.e.c(str2, c10);
        String str3 = this.f24142w;
        StringBuilder n10 = defpackage.e.n(ri.e.c(str3, c11), str, ": description=", str2, ": value=");
        n10.append(str3);
        return n10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.f24130u);
        parcel.writeString(this.f24141v);
        parcel.writeString(this.f24142w);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l(Parcel parcel) {
        super(r0);
        String readString = parcel.readString();
        int i6 = w.f5205a;
        this.f24141v = parcel.readString();
        this.f24142w = parcel.readString();
    }
}
