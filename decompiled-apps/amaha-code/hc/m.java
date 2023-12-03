package hc;
/* compiled from: com.google.android.play:app-update@@2.0.1 */
/* loaded from: classes.dex */
public final class m extends c {

    /* renamed from: a  reason: collision with root package name */
    public final int f17393a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f17394b;

    public /* synthetic */ m(int i6, boolean z10) {
        this.f17393a = i6;
        this.f17394b = z10;
    }

    @Override // hc.c
    public final boolean a() {
        return this.f17394b;
    }

    @Override // hc.c
    public final int b() {
        return this.f17393a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f17393a == cVar.b() && this.f17394b == cVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int i10 = (this.f17393a ^ 1000003) * 1000003;
        if (true != this.f17394b) {
            i6 = 1237;
        } else {
            i6 = 1231;
        }
        return i10 ^ i6;
    }

    public final String toString() {
        return "AppUpdateOptions{appUpdateType=" + this.f17393a + ", allowAssetPackDeletion=" + this.f17394b + "}";
    }
}
