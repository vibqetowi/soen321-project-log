package ji;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.c0;
import com.google.firebase.messaging.j0;
import hh.g;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import qg.g0;
/* compiled from: TokenRegistrationHandler.kt */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static ScheduledExecutorService f22057a;

    /* compiled from: TokenRegistrationHandler.kt */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final a f22058u = new a();

        public a() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "FCM_6.2.0_TokenRegistrationHandler registerForPush() : Will try to register for push";
        }
    }

    /* compiled from: TokenRegistrationHandler.kt */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final b f22059u = new b();

        public b() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "FCM_6.2.0_TokenRegistrationHandler registerForPush() : ";
        }
    }

    /* compiled from: TokenRegistrationHandler.kt */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final c f22060u = new c();

        public c() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "FCM_6.2.0_TokenRegistrationHandler scheduleTokenRegistrationRetry() : ";
        }
    }

    public static void a(Context context, ya.h hVar) {
        boolean z10;
        if (!hVar.isSuccessful()) {
            hh.a aVar = hh.g.f17610d;
            g.a.a(1, hVar.getException(), n.f22056u);
            c(context);
            return;
        }
        String token = (String) hVar.getResult();
        if (token != null && !gv.n.B0(token)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            c(context);
            return;
        }
        kotlin.jvm.internal.i.f(token, "token");
        hh.a aVar2 = hh.g.f17610d;
        g.a.b(0, new m(token), 3);
        if ((!gv.n.B0(token)) && gv.n.H0(token, "|ID|")) {
            token = token.substring(7);
            kotlin.jvm.internal.i.f(token, "this as java.lang.String).substring(startIndex)");
        }
        pj.c cVar = pj.c.FCM;
        LinkedHashSet listeners = ji.a.f22034a;
        kotlin.jvm.internal.i.g(listeners, "listeners");
        bh.b.f4298b.post(new ni.c(2, listeners, token, cVar));
        for (ih.p pVar : g0.f29557b.values()) {
            if (pVar.f20103b.f12858d.f28419d.f28406a) {
                f.f22046a.getClass();
                f.a(pVar).a(context, token, "MoE");
            }
        }
    }

    public static void b(Context context) {
        FirebaseMessaging firebaseMessaging;
        ya.h<String> hVar;
        kotlin.jvm.internal.i.g(context, "context");
        try {
            hh.a aVar = hh.g.f17610d;
            boolean z10 = false;
            g.a.b(0, a.f22058u, 3);
            Iterator it = g0.f29557b.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((ih.p) it.next()).f20103b.f12858d.f28419d.f28406a) {
                    z10 = true;
                    break;
                }
            }
            if (!z10) {
                return;
            }
            c0 c0Var = FirebaseMessaging.f9641m;
            synchronized (FirebaseMessaging.class) {
                firebaseMessaging = FirebaseMessaging.getInstance(sc.e.e());
            }
            qe.a aVar2 = firebaseMessaging.f9645b;
            if (aVar2 != null) {
                hVar = aVar2.c();
            } else {
                ya.i iVar = new ya.i();
                firebaseMessaging.f9650h.execute(new com.google.firebase.messaging.o(firebaseMessaging, iVar, 2));
                hVar = iVar.f38392a;
            }
            hVar.addOnCompleteListener(new j0(3, context));
        } catch (Exception e10) {
            hh.a aVar3 = hh.g.f17610d;
            g.a.a(1, e10, b.f22059u);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (r2 != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(Context context) {
        long j10;
        if (!hc.d.A) {
            return;
        }
        hh.a aVar = hh.g.f17610d;
        boolean z10 = false;
        g.a.b(0, c.f22060u, 3);
        ScheduledExecutorService scheduledExecutorService = f22057a;
        if (scheduledExecutorService != null) {
            if (scheduledExecutorService.isShutdown()) {
                z10 = true;
            }
        }
        f22057a = Executors.newScheduledThreadPool(1);
        yg.m mVar = new yg.m(context, 2);
        ScheduledExecutorService scheduledExecutorService2 = f22057a;
        if (scheduledExecutorService2 != null) {
            LinkedHashMap sdkInstances = g0.f29557b;
            kotlin.jvm.internal.i.g(sdkInstances, "sdkInstances");
            long j11 = 0;
            for (ih.p pVar : sdkInstances.values()) {
                pg.k kVar = pVar.f20103b.f12858d;
                if (kVar.f28419d.f28406a) {
                    j10 = kVar.f28416a;
                } else {
                    j10 = 20;
                }
                j11 = Math.max(j11, j10);
            }
            scheduledExecutorService2.schedule(mVar, j11, TimeUnit.SECONDS);
        }
    }
}
