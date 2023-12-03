package pl;
/* compiled from: N18BScreenFragment.kt */
/* loaded from: classes2.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final String f28646a;

    /* renamed from: b  reason: collision with root package name */
    public final String f28647b;

    /* renamed from: c  reason: collision with root package name */
    public final String f28648c;

    public v(String str, String str2, String str3) {
        this.f28646a = str;
        this.f28647b = str2;
        this.f28648c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (kotlin.jvm.internal.i.b(this.f28646a, vVar.f28646a) && kotlin.jvm.internal.i.b(this.f28647b, vVar.f28647b) && kotlin.jvm.internal.i.b(this.f28648c, vVar.f28648c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i6 = 0;
        String str = this.f28646a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = hashCode * 31;
        String str2 = this.f28647b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        String str3 = this.f28648c;
        if (str3 != null) {
            i6 = str3.hashCode();
        }
        return i11 + i6;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("N18BData(imageUrl=");
        sb2.append(this.f28646a);
        sb2.append(", overlayText=");
        sb2.append(this.f28647b);
        sb2.append(", overlayTextColor=");
        return v.g.c(sb2, this.f28648c, ')');
    }
}
