package pl;
/* compiled from: N12CScreenFragment.kt */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final String f28588a;

    /* renamed from: b  reason: collision with root package name */
    public String f28589b;

    /* renamed from: c  reason: collision with root package name */
    public final String f28590c;

    /* renamed from: d  reason: collision with root package name */
    public final String f28591d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f28592e;

    public f(String str, String str2, String str3, String str4, boolean z10) {
        this.f28588a = str;
        this.f28589b = str2;
        this.f28590c = str3;
        this.f28591d = str4;
        this.f28592e = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (kotlin.jvm.internal.i.b(this.f28588a, fVar.f28588a) && kotlin.jvm.internal.i.b(this.f28589b, fVar.f28589b) && kotlin.jvm.internal.i.b(this.f28590c, fVar.f28590c) && kotlin.jvm.internal.i.b(this.f28591d, fVar.f28591d) && this.f28592e == fVar.f28592e) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i6 = 0;
        String str = this.f28588a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = hashCode * 31;
        String str2 = this.f28589b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        String str3 = this.f28590c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        String str4 = this.f28591d;
        if (str4 != null) {
            i6 = str4.hashCode();
        }
        int i13 = (i12 + i6) * 31;
        boolean z10 = this.f28592e;
        int i14 = z10;
        if (z10 != 0) {
            i14 = 1;
        }
        return i13 + i14;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("N12CData(previewImage=");
        sb2.append(this.f28588a);
        sb2.append(", cardImage=");
        sb2.append(this.f28589b);
        sb2.append(", text=");
        sb2.append(this.f28590c);
        sb2.append(", textColor=");
        sb2.append(this.f28591d);
        sb2.append(", isViewGenerationRequired=");
        return defpackage.c.t(sb2, this.f28592e, ')');
    }
}
