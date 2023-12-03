package ed;

import ad.i;
import ad.j;
import android.content.Context;
import com.google.android.gms.internal.measurement.z3;
import com.google.android.gms.internal.p000firebaseauthapi.s5;
import d9.p;
import java.util.concurrent.Executor;
import kc.d;
import q.f;
import sc.e;
import tr.r;
import w5.u;
import ya.g;
import ya.h;
import ya.k;
import ya.v;
/* compiled from: PlayIntegrityAppCheckProvider.java */
/* loaded from: classes.dex */
public final class c implements zc.a {

    /* renamed from: a  reason: collision with root package name */
    public final String f13938a;

    /* renamed from: b  reason: collision with root package name */
    public final kc.a f13939b;

    /* renamed from: c  reason: collision with root package name */
    public final i f13940c;

    /* renamed from: d  reason: collision with root package name */
    public final Executor f13941d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f13942e;
    public final j f;

    public c(e eVar, @yc.c Executor executor, @yc.b Executor executor2) {
        f fVar;
        eVar.b();
        String str = eVar.f31434c.f31448e;
        eVar.b();
        Context context = eVar.f31432a;
        synchronized (kc.f.class) {
            if (kc.f.f23231u == null) {
                z3 z3Var = new z3();
                Context applicationContext = context.getApplicationContext();
                context = applicationContext != null ? applicationContext : context;
                z3Var.f8726u = context;
                kc.f.f23231u = new f(context);
            }
            fVar = kc.f.f23231u;
        }
        i iVar = new i(eVar);
        j jVar = new j();
        this.f13938a = str;
        this.f13939b = (kc.a) ((mc.a) fVar.f29108z).a();
        this.f13940c = iVar;
        this.f13941d = executor;
        this.f13942e = executor2;
        this.f = jVar;
    }

    @Override // zc.a
    public final h<zc.b> a() {
        v c10 = k.c(this.f13942e, new u(this, 1, new r()));
        g gVar = new g(this) { // from class: ed.b

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ c f13937v;

            {
                this.f13937v = this;
            }

            @Override // ya.g
            public final h h(Object obj) {
                int i6 = r2;
                c cVar = this.f13937v;
                switch (i6) {
                    case 0:
                        cVar.getClass();
                        return k.c(cVar.f13942e, new u(cVar, 2, new s5(((kc.c) obj).a(), 4, 0)));
                    default:
                        Long valueOf = Long.valueOf(Long.parseLong(cVar.f13938a));
                        String str = ((a) obj).f13935a;
                        if (str != null) {
                            return cVar.f13939b.a(new d(str, valueOf));
                        }
                        throw new NullPointerException("Null nonce");
                }
            }
        };
        Executor executor = this.f13941d;
        return c10.onSuccessTask(executor, gVar).onSuccessTask(executor, new g(this) { // from class: ed.b

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ c f13937v;

            {
                this.f13937v = this;
            }

            @Override // ya.g
            public final h h(Object obj) {
                int i6 = r2;
                c cVar = this.f13937v;
                switch (i6) {
                    case 0:
                        cVar.getClass();
                        return k.c(cVar.f13942e, new u(cVar, 2, new s5(((kc.c) obj).a(), 4, 0)));
                    default:
                        Long valueOf = Long.valueOf(Long.parseLong(cVar.f13938a));
                        String str = ((a) obj).f13935a;
                        if (str != null) {
                            return cVar.f13939b.a(new d(str, valueOf));
                        }
                        throw new NullPointerException("Null nonce");
                }
            }
        }).onSuccessTask(executor, new p(7));
    }
}
