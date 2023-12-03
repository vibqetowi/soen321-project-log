package ji;

import android.content.Context;
import qg.g0;
import qg.w;
/* compiled from: FcmController.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final ih.p f22043a;

    /* renamed from: b  reason: collision with root package name */
    public final String f22044b = "FCM_6.2.0_FcmController";

    /* renamed from: c  reason: collision with root package name */
    public final Object f22045c = new Object();

    public e(ih.p pVar) {
        this.f22043a = pVar;
    }

    public final void a(Context context, String str, String str2) {
        f fVar = f.f22046a;
        ih.p pVar = this.f22043a;
        fVar.getClass();
        if (f.b(context, pVar).a().f20107a && !gv.n.B0(str)) {
            hh.g.b(this.f22043a.f20105d, 0, new b(this, str, str2), 3);
            try {
                synchronized (this.f22045c) {
                    ki.a b10 = f.b(context, this.f22043a);
                    String d10 = b10.d();
                    boolean z10 = !kotlin.jvm.internal.i.b(str, d10);
                    if (z10) {
                        b10.f23348a.c(str);
                        kc.f.U(context, this.f22043a);
                        b(context, str2);
                    }
                    hh.g.b(this.f22043a.f20105d, 0, new c(this, d10, str, z10), 3);
                    hs.k kVar = hs.k.f19476a;
                }
            } catch (Exception e10) {
                this.f22043a.f20105d.a(1, e10, new d(this));
            }
        }
    }

    public final void b(Context context, String str) {
        ng.c cVar = new ng.c();
        cVar.a(str, "registered_by");
        cVar.b();
        String appId = (String) this.f22043a.f20102a.f5133c;
        kotlin.jvm.internal.i.g(appId, "appId");
        ih.p b10 = g0.b(appId);
        if (b10 != null) {
            w.f29578a.getClass();
            w.d(b10).c(context, "TOKEN_EVENT", cVar);
        }
    }
}
