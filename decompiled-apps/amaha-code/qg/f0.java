package qg;

import android.content.Context;
import com.moengage.core.internal.push.PushManager;
import com.moengage.core.internal.push.base.PushBaseHandler;
import com.moengage.core.internal.push.fcm.FcmHandler;
import com.moengage.core.internal.push.pushamp.PushAmpHandler;
import java.io.File;
/* compiled from: LogoutHandler.kt */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    public final ih.p f29544a;

    /* renamed from: b  reason: collision with root package name */
    public final String f29545b;

    public f0(ih.p sdkInstance) {
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        this.f29544a = sdkInstance;
        this.f29545b = "Core_LogoutHandler";
    }

    public final void a(boolean z10, Context context) {
        ih.p pVar = this.f29544a;
        try {
            hh.g gVar = pVar.f20105d;
            hh.g gVar2 = pVar.f20105d;
            hh.g.b(gVar, 0, new z(this), 3);
            if (!di.b.u(context, pVar)) {
                return;
            }
            tg.a aVar = tg.c.f33009a;
            if (aVar != null) {
                aVar.b();
            }
            c(z10, context);
            yg.n.c(context, pVar);
            hh.g.b(gVar2, 0, yg.a0.f38548u, 3);
            w.f29578a.getClass();
            w.e(pVar).c(context);
            ch.a aVar2 = ch.c.f5286a;
            if (aVar2 != null) {
                aVar2.onLogout(context, pVar);
            }
            PushManager.f10185a.getClass();
            PushBaseHandler pushBaseHandler = PushManager.f10186b;
            if (pushBaseHandler != null) {
                pushBaseHandler.onLogout(context, pVar);
            }
            w.f(context, pVar).b();
            File file = new File(new ai.d(context, pVar).f577b);
            if (file.exists() && file.isDirectory()) {
                ai.d.b(file);
            }
            sg.a a10 = w.a(context, pVar);
            hh.g.b(a10.f31520b.f20105d, 0, new sg.m(a10), 3);
            a10.b(a10.f31519a, null);
            FcmHandler fcmHandler = PushManager.f10187c;
            if (fcmHandler != null) {
                fcmHandler.registerForPushToken(context);
            }
            vg.d dVar = (vg.d) w.d(pVar).f29550e.getValue();
            ih.p pVar2 = dVar.f35081a;
            if (dVar.f35083c) {
                hh.g.b(pVar2.f20105d, 0, new vg.e(dVar), 3);
            } else {
                dVar.a(context);
            }
            PushAmpHandler pushAmpHandler = sh.b.f31571a;
            if (pushAmpHandler != null) {
                pushAmpHandler.onLogout(context, pVar);
            }
            yh.a aVar3 = yh.c.f38625a;
            if (aVar3 != null) {
                aVar3.b();
            }
            b();
            hh.g.b(gVar2, 0, new a0(this), 3);
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new b0(this));
        }
    }

    public final void b() {
        ih.p pVar = this.f29544a;
        fi.a aVar = new fi.a(di.b.a(pVar), 1);
        w.f29578a.getClass();
        for (ei.c cVar : w.b(pVar).f34154b) {
            bh.b.f4298b.post(new androidx.emoji2.text.g(22, cVar, aVar, this));
        }
    }

    public final void c(boolean z10, Context context) {
        ih.p pVar = this.f29544a;
        try {
            if (!di.b.u(context, pVar)) {
                hh.g.b(pVar.f20105d, 0, new d0(this), 3);
                return;
            }
            ng.c cVar = new ng.c();
            if (z10) {
                cVar.a("forced", "type");
            }
            cVar.b();
            ih.i iVar = new ih.i(cVar.f26313a.a(), "MOE_LOGOUT");
            w.f29578a.getClass();
            uh.b f = w.f(context, pVar);
            f.f34156b.d0(new mh.c(-1L, iVar.f20090c, iVar.f20091d));
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new e0(this));
        }
    }
}
