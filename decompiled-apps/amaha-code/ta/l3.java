package ta;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class l3 {

    /* renamed from: a  reason: collision with root package name */
    public final y3 f32704a;

    public l3(d6 d6Var) {
        this.f32704a = d6Var.F;
    }

    public final boolean a() {
        y3 y3Var = this.f32704a;
        try {
            ca.b a10 = ca.c.a(y3Var.f32953u);
            if (a10 == null) {
                w2 w2Var = y3Var.C;
                y3.k(w2Var);
                w2Var.H.b("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                return false;
            } else if (a10.b(128, "com.android.vending").versionCode < 80837300) {
                return false;
            } else {
                return true;
            }
        } catch (Exception e10) {
            w2 w2Var2 = y3Var.C;
            y3.k(w2Var2);
            w2Var2.H.c(e10, "Failed to retrieve Play Store version for Install Referrer");
            return false;
        }
    }
}
