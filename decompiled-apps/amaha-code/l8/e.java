package l8;

import android.os.Parcel;
import android.os.Parcelable;
import c9.w;
/* compiled from: CommentFrame.java */
/* loaded from: classes.dex */
public final class e extends h {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: v  reason: collision with root package name */
    public final String f24118v;

    /* renamed from: w  reason: collision with root package name */
    public final String f24119w;

    /* renamed from: x  reason: collision with root package name */
    public final String f24120x;

    /* compiled from: CommentFrame.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i6) {
            return new e[i6];
        }
    }

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f24118v = str;
        this.f24119w = str2;
        this.f24120x = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (w.a(this.f24119w, eVar.f24119w) && w.a(this.f24118v, eVar.f24118v) && w.a(this.f24120x, eVar.f24120x)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int i10;
        int i11 = 0;
        String str = this.f24118v;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        int i12 = (527 + i6) * 31;
        String str2 = this.f24119w;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i12 + i10) * 31;
        String str3 = this.f24120x;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return i13 + i11;
    }

    @Override // l8.h
    public final String toString() {
        String str = this.f24130u;
        int c10 = ri.e.c(str, 25);
        String str2 = this.f24118v;
        int c11 = ri.e.c(str2, c10);
        String str3 = this.f24119w;
        StringBuilder n10 = defpackage.e.n(ri.e.c(str3, c11), str, ": language=", str2, ", description=");
        n10.append(str3);
        return n10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.f24130u);
        parcel.writeString(this.f24118v);
        parcel.writeString(this.f24120x);
    }

    public e(Parcel parcel) {
        super("COMM");
        String readString = parcel.readString();
        int i6 = w.f5205a;
        this.f24118v = readString;
        this.f24119w = parcel.readString();
        this.f24120x = parcel.readString();
    }
}
