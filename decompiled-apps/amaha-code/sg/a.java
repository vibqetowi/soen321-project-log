package sg;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.Date;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import qg.w;
import yg.b0;
/* compiled from: AnalyticsHandler.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Context f31519a;

    /* renamed from: b  reason: collision with root package name */
    public final ih.p f31520b;

    /* renamed from: c  reason: collision with root package name */
    public final String f31521c;

    /* renamed from: d  reason: collision with root package name */
    public final kotlin.jvm.internal.h f31522d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f31523e;
    public final Object f;

    /* renamed from: g  reason: collision with root package name */
    public jh.b f31524g;

    /* compiled from: AnalyticsHandler.kt */
    /* renamed from: sg.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0538a extends kotlin.jvm.internal.k implements ss.a<String> {
        public C0538a() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" batchPreviousDataAndCreateNewSession() : Will batch data and create a new session.", a.this.f31521c);
        }
    }

    /* compiled from: AnalyticsHandler.kt */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ s1.s f31527v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(s1.s sVar) {
            super(0);
            this.f31527v = sVar;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.f31521c + " onActivityStart() : Will try to process traffic information " + ((String) this.f31527v.f31225w);
        }
    }

    /* compiled from: AnalyticsHandler.kt */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<String> {
        public c() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder();
            a aVar = a.this;
            sb2.append(aVar.f31521c);
            sb2.append(" onActivityStart() : Existing session: ");
            sb2.append(aVar.f31524g);
            return sb2.toString();
        }
    }

    /* compiled from: AnalyticsHandler.kt */
    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<String> {
        public d() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" onActivityStart() : App Open already processed.", a.this.f31521c);
        }
    }

    /* compiled from: AnalyticsHandler.kt */
    /* loaded from: classes.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ jh.a f31531v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(jh.a aVar) {
            super(0);
            this.f31531v = aVar;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.f31521c + " onNotificationClicked() : Source: " + this.f31531v;
        }
    }

    /* compiled from: AnalyticsHandler.kt */
    /* loaded from: classes.dex */
    public static final class f extends kotlin.jvm.internal.k implements ss.a<String> {
        public f() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" onNotificationClicked() : ", a.this.f31521c);
        }
    }

    /* compiled from: AnalyticsHandler.kt */
    /* loaded from: classes.dex */
    public static final class g extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ jh.a f31534v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(jh.a aVar) {
            super(0);
            this.f31534v = aVar;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.f31521c + " updateSessionIfRequired() : New source: " + this.f31534v;
        }
    }

    /* compiled from: AnalyticsHandler.kt */
    /* loaded from: classes.dex */
    public static final class h extends kotlin.jvm.internal.k implements ss.a<String> {
        public h() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" updateSessionIfRequired() : No saved session, creating a new session.", a.this.f31521c);
        }
    }

    /* compiled from: AnalyticsHandler.kt */
    /* loaded from: classes.dex */
    public static final class i extends kotlin.jvm.internal.k implements ss.a<String> {
        public i() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder();
            a aVar = a.this;
            sb2.append(aVar.f31521c);
            sb2.append(" updateSessionIfRequired() : Current Session: ");
            sb2.append(aVar.f31524g);
            return sb2.toString();
        }
    }

    /* compiled from: AnalyticsHandler.kt */
    /* loaded from: classes.dex */
    public static final class j extends kotlin.jvm.internal.k implements ss.a<String> {
        public j() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" updateSessionIfRequired() : updating traffic source", a.this.f31521c);
        }
    }

    /* compiled from: AnalyticsHandler.kt */
    /* loaded from: classes.dex */
    public static final class k extends kotlin.jvm.internal.k implements ss.a<String> {
        public k() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder();
            a aVar = a.this;
            sb2.append(aVar.f31521c);
            sb2.append(" updateSessionIfRequired() : Updated Session: ");
            sb2.append(aVar.f31524g);
            return sb2.toString();
        }
    }

    /* compiled from: AnalyticsHandler.kt */
    /* loaded from: classes.dex */
    public static final class l extends kotlin.jvm.internal.k implements ss.a<String> {
        public l() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" updateSessionIfRequired() : Cannot update existing session, will create new session if required.", a.this.f31521c);
        }
    }

    /* compiled from: AnalyticsHandler.kt */
    /* loaded from: classes.dex */
    public static final class m extends kotlin.jvm.internal.k implements ss.a<String> {
        public m() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" updateSessionIfRequired() : Previous session expired, creating a new one.", a.this.f31521c);
        }
    }

    /* compiled from: AnalyticsHandler.kt */
    /* loaded from: classes.dex */
    public static final class n extends kotlin.jvm.internal.k implements ss.a<String> {
        public n() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" updateSessionIfRequired() : Source changed, will create a new session", a.this.f31521c);
        }
    }

    public a(Context context, ih.p sdkInstance) {
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        this.f31519a = context;
        this.f31520b = sdkInstance;
        this.f31521c = "Core_AnalyticsHandler";
        this.f31522d = new kotlin.jvm.internal.h();
        this.f = new Object();
        w.f29578a.getClass();
        this.f31524g = w.f(context, sdkInstance).h();
    }

    public final void a(Context context, jh.a aVar) {
        synchronized (this.f) {
            hh.g.b(this.f31520b.f20105d, 0, new C0538a(), 3);
            ScheduledExecutorService scheduledExecutorService = yg.n.f38599a;
            yg.n.c(context, this.f31520b);
            ih.p sdkInstance = this.f31520b;
            kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
            hh.g.b(sdkInstance.f20105d, 0, b0.f38555u, 3);
            w.f29578a.getClass();
            w.e(sdkInstance).d(context);
            b(context, aVar);
        }
    }

    public final void b(Context context, jh.a aVar) {
        long currentTimeMillis = System.currentTimeMillis();
        String uuid = UUID.randomUUID().toString();
        Date date = new Date();
        date.setTime(currentTimeMillis);
        String b10 = di.k.b(date);
        kotlin.jvm.internal.i.f(b10, "format(currentDate)");
        this.f31524g = new jh.b(uuid, b10, aVar, currentTimeMillis);
        ih.p pVar = this.f31520b;
        hh.g.b(pVar.f20105d, 0, new sg.b(this), 3);
        jh.b bVar = this.f31524g;
        if (bVar != null) {
            w.f29578a.getClass();
            w.f(context, pVar).c0(bVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c A[Catch: Exception -> 0x0083, TryCatch #0 {Exception -> 0x0083, blocks: (B:13:0x0033, B:15:0x004c, B:20:0x005c, B:22:0x0063, B:26:0x0072, B:27:0x0077), top: B:33:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072 A[Catch: Exception -> 0x0083, TryCatch #0 {Exception -> 0x0083, blocks: (B:13:0x0033, B:15:0x004c, B:20:0x005c, B:22:0x0063, B:26:0x0072, B:27:0x0077), top: B:33:0x0033 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(s1.s sVar) {
        Set set;
        Object obj;
        jh.a aVar;
        ih.p pVar = this.f31520b;
        hh.g.b(pVar.f20105d, 0, new b(sVar), 3);
        jh.b bVar = this.f31524g;
        hh.g gVar = pVar.f20105d;
        if (bVar != null) {
            hh.g.b(gVar, 0, new c(), 3);
        }
        Context context = this.f31519a;
        if (!di.b.u(context, pVar)) {
            return;
        }
        if (this.f31523e) {
            hh.g.b(gVar, 0, new d(), 3);
            return;
        }
        try {
            hh.g.b(gVar, 0, new p(this), 3);
            set = (Set) pVar.f20104c.f33013d.f15849b;
            obj = sVar.f31224v;
        } catch (Exception e10) {
            gVar.a(1, e10, new r(this));
        }
        if (((Uri) obj) != null) {
            aVar = v.b((Uri) obj, set);
            if (!kotlin.jvm.internal.h.H(aVar)) {
                if (aVar == null) {
                    Object obj2 = sVar.f31226x;
                    if (((Bundle) obj2) != null) {
                        jh.a a10 = v.a((Bundle) obj2, set);
                        if (!kotlin.jvm.internal.h.H(a10)) {
                            aVar = a10;
                        }
                    }
                }
                if (aVar == null) {
                    aVar = new jh.a();
                }
                hh.g.b(gVar, 0, new q(this, aVar), 3);
                e(context, aVar);
                this.f31523e = true;
            }
        }
        aVar = null;
        if (aVar == null) {
        }
        if (aVar == null) {
        }
        hh.g.b(gVar, 0, new q(this, aVar), 3);
        e(context, aVar);
        this.f31523e = true;
    }

    public final void d(jh.a aVar) {
        Context context = this.f31519a;
        ih.p pVar = this.f31520b;
        try {
            hh.g.b(pVar.f20105d, 0, new e(aVar), 3);
            if (!di.b.u(context, pVar)) {
                return;
            }
            e(context, aVar);
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new f());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0064 A[Catch: all -> 0x0117, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0015, B:9:0x0026, B:20:0x0064, B:24:0x0077, B:23:0x0075, B:27:0x0085, B:31:0x009c, B:36:0x00b5, B:39:0x00c6, B:43:0x00ce, B:45:0x00d9, B:63:0x0104, B:64:0x0113, B:48:0x00e0, B:50:0x00e6, B:53:0x00ed, B:55:0x00f3, B:58:0x00fa, B:42:0x00cc, B:30:0x009a, B:12:0x0041, B:15:0x004a), top: B:70:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085 A[Catch: all -> 0x0117, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0015, B:9:0x0026, B:20:0x0064, B:24:0x0077, B:23:0x0075, B:27:0x0085, B:31:0x009c, B:36:0x00b5, B:39:0x00c6, B:43:0x00ce, B:45:0x00d9, B:63:0x0104, B:64:0x0113, B:48:0x00e0, B:50:0x00e6, B:53:0x00ed, B:55:0x00f3, B:58:0x00fa, B:42:0x00cc, B:30:0x009a, B:12:0x0041, B:15:0x004a), top: B:70:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0104 A[Catch: all -> 0x0117, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0015, B:9:0x0026, B:20:0x0064, B:24:0x0077, B:23:0x0075, B:27:0x0085, B:31:0x009c, B:36:0x00b5, B:39:0x00c6, B:43:0x00ce, B:45:0x00d9, B:63:0x0104, B:64:0x0113, B:48:0x00e0, B:50:0x00e6, B:53:0x00ed, B:55:0x00f3, B:58:0x00fa, B:42:0x00cc, B:30:0x009a, B:12:0x0041, B:15:0x004a), top: B:70:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Context context, jh.a aVar) {
        boolean z10;
        long j10;
        boolean z11;
        jh.a aVar2;
        synchronized (this.f) {
            hh.g.b(this.f31520b.f20105d, 0, new g(aVar), 3);
            if (this.f31524g == null) {
                hh.g.b(this.f31520b.f20105d, 0, new h(), 3);
                a(context, aVar);
                return;
            }
            hh.g.b(this.f31520b.f20105d, 0, new i(), 3);
            kotlin.jvm.internal.h hVar = this.f31522d;
            jh.b bVar = this.f31524g;
            long currentTimeMillis = System.currentTimeMillis();
            hVar.getClass();
            boolean z12 = true;
            if (bVar != null && kotlin.jvm.internal.h.H(bVar.f22032c) && (currentTimeMillis - di.k.d(bVar.f22031b).getTime()) / 1000 <= 3) {
                z10 = true;
                if (!z10) {
                    hh.g.b(this.f31520b.f20105d, 0, new j(), 3);
                    jh.b bVar2 = this.f31524g;
                    if (bVar2 != null) {
                        bVar2.f22032c = aVar;
                    }
                    hh.g.b(this.f31520b.f20105d, 0, new k(), 3);
                    return;
                }
                hh.g.b(this.f31520b.f20105d, 0, new l(), 3);
                kotlin.jvm.internal.h hVar2 = this.f31522d;
                jh.b bVar3 = this.f31524g;
                if (bVar3 == null) {
                    j10 = 0;
                } else {
                    j10 = bVar3.f22033d;
                }
                long j11 = this.f31520b.f20104c.f33013d.f15848a;
                long currentTimeMillis2 = System.currentTimeMillis();
                hVar2.getClass();
                if (j10 + j11 < currentTimeMillis2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    hh.g.b(this.f31520b.f20105d, 0, new m(), 3);
                    a(context, aVar);
                    return;
                }
                jh.b bVar4 = this.f31524g;
                if (bVar4 == null) {
                    aVar2 = null;
                } else {
                    aVar2 = bVar4.f22032c;
                }
                this.f31522d.getClass();
                if (kotlin.jvm.internal.h.H(aVar2)) {
                    if (kotlin.jvm.internal.h.H(aVar)) {
                        z12 = false;
                        if (z12) {
                            hh.g.b(this.f31520b.f20105d, 0, new n(), 3);
                            a(context, aVar);
                        }
                        hs.k kVar = hs.k.f19476a;
                        return;
                    }
                }
                if (kotlin.jvm.internal.h.H(aVar2)) {
                    if (!kotlin.jvm.internal.h.H(aVar)) {
                        if (z12) {
                        }
                        hs.k kVar2 = hs.k.f19476a;
                        return;
                    }
                }
                if ((kotlin.jvm.internal.h.H(aVar2) || !kotlin.jvm.internal.h.H(aVar)) && !kotlin.jvm.internal.i.b(aVar2, aVar)) {
                    if (z12) {
                    }
                    hs.k kVar22 = hs.k.f19476a;
                    return;
                }
                z12 = false;
                if (z12) {
                }
                hs.k kVar222 = hs.k.f19476a;
                return;
            }
            z10 = false;
            if (!z10) {
            }
        }
    }
}
