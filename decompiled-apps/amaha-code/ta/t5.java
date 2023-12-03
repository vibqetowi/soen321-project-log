package ta;

import android.os.SystemClock;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class t5 extends m {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f32887e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t5(Object obj, y3 y3Var, int i6) {
        super(y3Var);
        this.f32887e = i6;
        this.f = obj;
    }

    @Override // ta.m
    public final void b() {
        int i6 = this.f32887e;
        Object obj = this.f;
        switch (i6) {
            case 0:
                mh.e eVar = (mh.e) obj;
                ((v5) eVar.f25072e).h();
                v5 v5Var = (v5) eVar.f25072e;
                v5Var.f32943u.H.getClass();
                eVar.b(SystemClock.elapsedRealtime(), false, false);
                y3 y3Var = v5Var.f32943u;
                q1 m10 = y3Var.m();
                y3Var.H.getClass();
                m10.k(SystemClock.elapsedRealtime());
                return;
            default:
                w5 w5Var = (w5) obj;
                w5Var.l();
                w2 w2Var = w5Var.f32943u.C;
                y3.k(w2Var);
                w2Var.H.b("Starting upload from DelayedRunnable");
                w5Var.f32947v.t();
                return;
        }
    }
}
