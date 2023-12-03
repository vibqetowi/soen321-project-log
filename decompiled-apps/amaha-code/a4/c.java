package a4;
/* compiled from: IdentityManager.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f287a;

    /* renamed from: b  reason: collision with root package name */
    public final String f288b;

    public c() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (kotlin.jvm.internal.i.b(this.f287a, cVar.f287a) && kotlin.jvm.internal.i.b(this.f288b, cVar.f288b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i6 = 0;
        String str = this.f287a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = hashCode * 31;
        String str2 = this.f288b;
        if (str2 != null) {
            i6 = str2.hashCode();
        }
        return i10 + i6;
    }

    public final String toString() {
        return "Identity(userId=" + ((Object) this.f287a) + ", deviceId=" + ((Object) this.f288b) + ')';
    }

    public c(String str, String str2) {
        this.f287a = str;
        this.f288b = str2;
    }
}
