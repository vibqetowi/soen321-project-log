package kc;
/* compiled from: com.google.android.play:integrity@@1.0.1 */
/* loaded from: classes.dex */
public final class e extends c {

    /* renamed from: a  reason: collision with root package name */
    public final String f23212a;

    @Override // kc.c
    public final String a() {
        return this.f23212a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            return this.f23212a.equals(((c) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f23212a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.f23212a;
        StringBuilder sb2 = new StringBuilder(str.length() + 30);
        sb2.append("IntegrityTokenResponse{token=");
        sb2.append(str);
        sb2.append("}");
        return sb2.toString();
    }
}
