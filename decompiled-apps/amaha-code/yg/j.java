package yg;

import android.content.Context;
import com.moengage.core.internal.exception.NetworkRequestDisabledException;
import java.util.List;
/* compiled from: ReportsHandler.kt */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final ih.p f38580a;

    /* renamed from: b  reason: collision with root package name */
    public final String f38581b;

    /* renamed from: c  reason: collision with root package name */
    public final yg.b f38582c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f38583d;

    /* compiled from: ReportsHandler.kt */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<String> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" batchAndSyncDataAsync() : ", j.this.f38581b);
        }
    }

    /* compiled from: ReportsHandler.kt */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<String> {
        public b() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" batchData() : Batching data", j.this.f38581b);
        }
    }

    /* compiled from: ReportsHandler.kt */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<String> {
        public c() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" batchData() : ", j.this.f38581b);
        }
    }

    /* compiled from: ReportsHandler.kt */
    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<String> {
        public d() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" syncData() : ", j.this.f38581b);
        }
    }

    /* compiled from: ReportsHandler.kt */
    /* loaded from: classes.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<String> {
        public e() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" syncData() : Nothing found to send.", j.this.f38581b);
        }
    }

    /* compiled from: ReportsHandler.kt */
    /* loaded from: classes.dex */
    public static final class f extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ mh.b f38590v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(mh.b bVar) {
            super(0);
            this.f38590v = bVar;
        }

        @Override // ss.a
        public final String invoke() {
            return j.this.f38581b + " syncData() : Syncing batch, batch-id: " + this.f38590v.f25057a;
        }
    }

    /* compiled from: ReportsHandler.kt */
    /* loaded from: classes.dex */
    public static final class g extends kotlin.jvm.internal.k implements ss.a<String> {
        public g() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" syncData() : Account or SDK Disabled.", j.this.f38581b);
        }
    }

    /* compiled from: ReportsHandler.kt */
    /* loaded from: classes.dex */
    public static final class h extends kotlin.jvm.internal.k implements ss.a<String> {
        public h() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" syncData() : ", j.this.f38581b);
        }
    }

    /* compiled from: ReportsHandler.kt */
    /* loaded from: classes.dex */
    public static final class i extends kotlin.jvm.internal.k implements ss.a<String> {
        public i() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" syncInteractionData() : ", j.this.f38581b);
        }
    }

    /* compiled from: ReportsHandler.kt */
    /* renamed from: yg.j$j  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0653j extends kotlin.jvm.internal.k implements ss.a<String> {
        public C0653j() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" syncInteractionData() : ", j.this.f38581b);
        }
    }

    public j(ih.p sdkInstance) {
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        this.f38580a = sdkInstance;
        this.f38581b = "Core_ReportsHandler";
        this.f38582c = new yg.b(sdkInstance);
        this.f38583d = new Object();
    }

    public final void a(Context context) {
        kotlin.jvm.internal.i.g(context, "context");
        ih.p pVar = this.f38580a;
        hh.g.b(pVar.f20105d, 0, new a(), 3);
        pVar.f20106e.c(new ah.e("BATCH_DATA", true, new yg.i(this, context, 0)));
    }

    public final void b(Context context) {
        ih.p pVar = this.f38580a;
        kotlin.jvm.internal.i.g(context, "context");
        try {
            hh.g.b(pVar.f20105d, 0, new b(), 3);
            yg.b bVar = this.f38582c;
            qg.w.f29578a.getClass();
            bVar.b(context, qg.w.a(context, pVar).f31524g);
        } catch (Throwable th2) {
            pVar.f20105d.a(1, th2, new c());
        }
    }

    public final boolean c(Context context) {
        synchronized (this.f38583d) {
            try {
                hh.g.b(this.f38580a.f20105d, 0, new d(), 3);
                qg.w wVar = qg.w.f29578a;
                ih.p pVar = this.f38580a;
                wVar.getClass();
                uh.b f2 = qg.w.f(context, pVar);
                yg.h hVar = new yg.h(this.f38580a);
                while (true) {
                    List<mh.b> w10 = f2.w();
                    if (w10.isEmpty()) {
                        hh.g.b(this.f38580a.f20105d, 0, new e(), 3);
                    } else {
                        for (mh.b bVar : w10) {
                            hVar.b(context, bVar);
                            String requestId = bVar.f25058b.optString("MOE-REQUEST-ID", "");
                            hh.g.b(this.f38580a.f20105d, 0, new f(bVar), 3);
                            kotlin.jvm.internal.i.f(requestId, "requestId");
                            f2.l0(bVar.f25058b, requestId);
                            f2.f34156b.x(bVar);
                            f2.M(System.currentTimeMillis());
                        }
                    }
                }
            } catch (Throwable th2) {
                if (th2 instanceof NetworkRequestDisabledException) {
                    hh.g.b(this.f38580a.f20105d, 1, new g(), 2);
                } else {
                    this.f38580a.f20105d.a(1, th2, new h());
                }
                return false;
            }
        }
        return true;
    }

    public final void d(Context context) {
        ih.p pVar = this.f38580a;
        kotlin.jvm.internal.i.g(context, "context");
        try {
            hh.g.b(pVar.f20105d, 0, new i(), 3);
            pVar.f20106e.a(new ah.e("SEND_INTERACTION_DATA", true, new yg.i(this, context, 1)));
        } catch (Throwable th2) {
            pVar.f20105d.a(1, th2, new C0653j());
        }
    }
}
