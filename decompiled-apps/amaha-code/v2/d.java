package v2;
/* compiled from: Preference.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f34711a;

    /* renamed from: b  reason: collision with root package name */
    public final Long f34712b;

    public d(String str, Long l2) {
        this.f34711a = str;
        this.f34712b = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (kotlin.jvm.internal.i.b(this.f34711a, dVar.f34711a) && kotlin.jvm.internal.i.b(this.f34712b, dVar.f34712b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f34711a.hashCode() * 31;
        Long l2 = this.f34712b;
        if (l2 == null) {
            hashCode = 0;
        } else {
            hashCode = l2.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Preference(key=" + this.f34711a + ", value=" + this.f34712b + ')';
    }
}
