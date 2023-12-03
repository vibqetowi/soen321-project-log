package kc;
/* compiled from: com.google.android.play:integrity@@1.0.1 */
/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: a  reason: collision with root package name */
    public final String f23210a;

    /* renamed from: b  reason: collision with root package name */
    public final Long f23211b;

    public /* synthetic */ d(String str, Long l2) {
        this.f23210a = str;
        this.f23211b = l2;
    }

    @Override // kc.b
    public final Long a() {
        return this.f23211b;
    }

    @Override // kc.b
    public final String b() {
        return this.f23210a;
    }

    public final boolean equals(Object obj) {
        Long l2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f23210a.equals(bVar.b()) && ((l2 = this.f23211b) != null ? l2.equals(bVar.a()) : bVar.a() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f23210a.hashCode() ^ 1000003) * 1000003;
        Long l2 = this.f23211b;
        if (l2 == null) {
            hashCode = 0;
        } else {
            hashCode = l2.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f23211b);
        int length = valueOf.length();
        String str = this.f23210a;
        StringBuilder sb2 = new StringBuilder(str.length() + 50 + length);
        sb2.append("IntegrityTokenRequest{nonce=");
        sb2.append(str);
        sb2.append(", cloudProjectNumber=");
        sb2.append(valueOf);
        sb2.append("}");
        return sb2.toString();
    }
}
