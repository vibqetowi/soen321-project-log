package ta;

import android.os.Bundle;
import android.text.TextUtils;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class i4 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f32624u = 1;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ long f32625v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f32626w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Object f32627x;

    public /* synthetic */ i4(t4 t4Var, Bundle bundle, long j10) {
        this.f32626w = t4Var;
        this.f32627x = bundle;
        this.f32625v = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f32624u;
        long j10 = this.f32625v;
        Object obj = this.f32627x;
        Object obj2 = this.f32626w;
        switch (i6) {
            case 0:
                t4 t4Var = (t4) obj2;
                Bundle bundle = (Bundle) obj;
                if (TextUtils.isEmpty(t4Var.f32943u.p().n())) {
                    t4Var.t(bundle, 0, j10);
                    return;
                }
                w2 w2Var = t4Var.f32943u.C;
                y3.k(w2Var);
                w2Var.E.b("Using developer consent only; google app id found");
                return;
            default:
                c5 c5Var = (c5) obj;
                c5Var.m((z4) obj2, false, j10);
                c5Var.f32511y = null;
                l5 t3 = c5Var.f32943u.t();
                t3.h();
                t3.i();
                t3.t(new androidx.work.n(t3, (Object) null, 18));
                return;
        }
    }

    public i4(c5 c5Var, z4 z4Var, long j10) {
        this.f32627x = c5Var;
        this.f32626w = z4Var;
        this.f32625v = j10;
    }
}
