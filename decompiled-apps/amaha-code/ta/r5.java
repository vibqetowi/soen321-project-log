package ta;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class r5 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f32852u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ long f32853v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ v5 f32854w;

    public /* synthetic */ r5(v5 v5Var, long j10, int i6) {
        this.f32852u = i6;
        this.f32854w = v5Var;
        this.f32853v = j10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0036, code lost:
        if (r0.K.b() != false) goto L16;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i6 = this.f32852u;
        long j10 = this.f32853v;
        v5 v5Var = this.f32854w;
        switch (i6) {
            case 0:
                v5Var.h();
                v5Var.l();
                y3 y3Var = v5Var.f32943u;
                w2 w2Var = y3Var.C;
                y3.k(w2Var);
                w2Var.H.c(Long.valueOf(j10), "Activity resumed, time");
                if (!y3Var.A.r()) {
                    j3 j3Var = y3Var.B;
                    y3.i(j3Var);
                    break;
                }
                mh.e eVar = v5Var.f32917y;
                ((v5) eVar.f25072e).h();
                ((m) eVar.f25070c).a();
                eVar.f25069b = j10;
                eVar.f25071d = j10;
                androidx.appcompat.widget.l lVar = v5Var.f32918z;
                ((v5) lVar.f1472w).h();
                s5 s5Var = (s5) lVar.f1471v;
                if (s5Var != null) {
                    ((v5) lVar.f1472w).f32915w.removeCallbacks(s5Var);
                }
                j3 j3Var2 = ((v5) lVar.f1472w).f32943u.B;
                y3.i(j3Var2);
                j3Var2.K.a(false);
                u5 u5Var = v5Var.f32916x;
                u5Var.f32899a.h();
                v5 v5Var2 = u5Var.f32899a;
                if (v5Var2.f32943u.g()) {
                    v5Var2.f32943u.H.getClass();
                    u5Var.b(false, System.currentTimeMillis());
                    return;
                }
                return;
            default:
                v5Var.h();
                v5Var.l();
                y3 y3Var2 = v5Var.f32943u;
                w2 w2Var2 = y3Var2.C;
                y3.k(w2Var2);
                w2Var2.H.c(Long.valueOf(j10), "Activity paused, time");
                v5Var.f32918z.d(j10);
                if (y3Var2.A.r()) {
                    ((m) v5Var.f32917y.f25070c).a();
                    return;
                }
                return;
        }
    }
}
