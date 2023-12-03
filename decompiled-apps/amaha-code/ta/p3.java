package ta;

import com.google.android.gms.internal.measurement.i7;
import java.util.HashMap;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class p3 implements Callable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f32806u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ r3 f32807v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f32808w;

    public /* synthetic */ p3(r3 r3Var, String str, int i6) {
        this.f32806u = i6;
        this.f32807v = r3Var;
        this.f32808w = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i6 = this.f32806u;
        String str = this.f32808w;
        r3 r3Var = this.f32807v;
        switch (i6) {
            case 0:
                k kVar = r3Var.f32947v.f32532w;
                d6.H(kVar);
                l4 B = kVar.B(str);
                HashMap hashMap = new HashMap();
                hashMap.put("platform", "android");
                hashMap.put("package_name", str);
                r3Var.f32943u.A.m();
                hashMap.put("gmp_version", 74029L);
                if (B != null) {
                    String F = B.F();
                    if (F != null) {
                        hashMap.put("app_version", F);
                    }
                    hashMap.put("app_version_int", Long.valueOf(B.z()));
                    hashMap.put("dynamite_version", Long.valueOf(B.A()));
                }
                return hashMap;
            case 1:
                return new i7(new androidx.appcompat.widget.l(r3Var, str, 24), 0);
            default:
                return new com.google.android.gms.internal.measurement.r5(new p3(r3Var, str, 0));
        }
    }
}
