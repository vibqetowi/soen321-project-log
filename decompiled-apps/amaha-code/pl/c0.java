package pl;
/* compiled from: N24ScreenFragment.kt */
/* loaded from: classes2.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f28554a;

    /* renamed from: b  reason: collision with root package name */
    public final String f28555b;

    /* renamed from: c  reason: collision with root package name */
    public final String f28556c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f28557d;

    public c0(String str, String str2, String str3, boolean z10) {
        this.f28554a = str;
        this.f28555b = str2;
        this.f28556c = str3;
        this.f28557d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        if (kotlin.jvm.internal.i.b(this.f28554a, c0Var.f28554a) && kotlin.jvm.internal.i.b(this.f28555b, c0Var.f28555b) && kotlin.jvm.internal.i.b(this.f28556c, c0Var.f28556c) && this.f28557d == c0Var.f28557d) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i6 = 0;
        String str = this.f28554a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = hashCode * 31;
        String str2 = this.f28555b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        String str3 = this.f28556c;
        if (str3 != null) {
            i6 = str3.hashCode();
        }
        int i12 = (i11 + i6) * 31;
        boolean z10 = this.f28557d;
        int i13 = z10;
        if (z10 != 0) {
            i13 = 1;
        }
        return i12 + i13;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("N24ScreenData(imageUrl=");
        sb2.append(this.f28554a);
        sb2.append(", text=");
        sb2.append(this.f28555b);
        sb2.append(", textColor=");
        sb2.append(this.f28556c);
        sb2.append(", isViewGenerationRequired=");
        return defpackage.c.t(sb2, this.f28557d, ')');
    }
}
