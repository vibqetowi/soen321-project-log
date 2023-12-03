package kj;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import f0.y;
import hh.g;
import ih.p;
import java.util.Set;
import qg.g0;
import qg.w;
/* compiled from: PermissionHandler.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final p f23351a;

    /* compiled from: PermissionHandler.kt */
    /* renamed from: kj.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0354a extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final C0354a f23352u = new C0354a();

        public C0354a() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "PushBase_6.6.0_PermissionHandler checkNotificationPermissionState(): ";
        }
    }

    /* compiled from: PermissionHandler.kt */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final b f23353u = new b();

        public b() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "PushBase_6.6.0_PermissionHandler updateNotificationPermission() : ";
        }
    }

    /* compiled from: PermissionHandler.kt */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final c f23354u = new c();

        public c() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "PushBase_6.6.0_PermissionHandler trackNotificationStatusAttribute(): Tracking device attribute";
        }
    }

    /* compiled from: PermissionHandler.kt */
    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final d f23355u = new d();

        public d() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "PushBase_6.6.0_PermissionHandler trackNotificationStatusChangeEvent(): ";
        }
    }

    /* compiled from: PermissionHandler.kt */
    /* loaded from: classes.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ String f23356u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(0);
            this.f23356u = str;
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(this.f23356u, "PushBase_6.6.0_PermissionHandler trackNotificationStatusChangeEvent() : Event to track: ");
        }
    }

    /* compiled from: PermissionHandler.kt */
    /* loaded from: classes.dex */
    public static final class f extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final f f23357u = new f();

        public f() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "PushBase_6.6.0_PermissionHandler trackNotificationStatusChangeEvent(): Tracking permission change event.";
        }
    }

    /* compiled from: PermissionHandler.kt */
    /* loaded from: classes.dex */
    public static final class g extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final g f23358u = new g();

        public g() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "PushBase_6.6.0_PermissionHandler trackNotificationStatusChangeEvent() : ";
        }
    }

    /* compiled from: PermissionHandler.kt */
    /* loaded from: classes.dex */
    public static final class h extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final h f23359u = new h();

        public h() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "PushBase_6.6.0_PermissionHandler updatePermissionStateIfRequired(): ";
        }
    }

    /* compiled from: PermissionHandler.kt */
    /* loaded from: classes.dex */
    public static final class i extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ boolean f23360u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ ih.e f23361v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(boolean z10, ih.e eVar) {
            super(0);
            this.f23360u = z10;
            this.f23361v = eVar;
        }

        @Override // ss.a
        public final String invoke() {
            return "PushBase_6.6.0_PermissionHandler updatePermissionStateIfRequired(): currentState: " + this.f23360u + ", deviceAttribute: " + this.f23361v;
        }
    }

    /* compiled from: PermissionHandler.kt */
    /* loaded from: classes.dex */
    public static final class j extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final j f23362u = new j();

        public j() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "PushBase_6.6.0_PermissionHandler updatePermissionStateIfRequired(): Updating state.";
        }
    }

    /* compiled from: PermissionHandler.kt */
    /* loaded from: classes.dex */
    public static final class k extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final k f23363u = new k();

        public k() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "PushBase_6.6.0_PermissionHandler updatePermissionStateIfRequired() : ";
        }
    }

    public a(p sdkInstance) {
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        this.f23351a = sdkInstance;
    }

    public static void b(Context context, p pVar, boolean z10) {
        hh.g.b(pVar.f20105d, 0, c.f23354u, 3);
        Boolean attributeValue = Boolean.valueOf(z10);
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(attributeValue, "attributeValue");
        w.f29578a.getClass();
        qg.g d10 = w.d(pVar);
        ih.a aVar = new ih.a("moe_push_opted", attributeValue, 4);
        ug.b bVar = d10.f29548c;
        bVar.getClass();
        bVar.f34102a.f20106e.c(new ah.e("TRACK_DEVICE_ATTRIBUTE", false, new ug.a(bVar, context, aVar, 2)));
    }

    public final void a(Context context) {
        boolean a10;
        kotlin.jvm.internal.i.g(context, "context");
        try {
            hh.g.b(this.f23351a.f20105d, 0, C0354a.f23352u, 3);
            if (Build.VERSION.SDK_INT >= 33) {
                a10 = di.b.q(context);
            } else {
                a10 = new y(context).a();
            }
            d(context, a10, "settings", null);
            if (a10) {
                if (ej.b.f14047b == null) {
                    synchronized (ej.b.class) {
                        ej.b bVar = ej.b.f14047b;
                        if (bVar == null) {
                            bVar = new ej.b();
                        }
                        ej.b.f14047b = bVar;
                    }
                }
                ej.b.d(context);
            }
        } catch (Throwable th2) {
            this.f23351a.f20105d.a(1, th2, b.f23353u);
        }
    }

    public final void c(Context context, boolean z10, String str, Bundle bundle) {
        String str2;
        Set<String> keySet;
        p pVar = this.f23351a;
        try {
            hh.g gVar = pVar.f20105d;
            hh.g gVar2 = pVar.f20105d;
            hh.g.b(gVar, 0, d.f23355u, 3);
            if (z10) {
                str2 = "MOE_PUSH_PERMISSION_STATE_ALLOWED";
            } else {
                str2 = "MOE_PUSH_PERMISSION_STATE_BLOCKED";
            }
            hh.g.b(gVar2, 0, new e(str2), 3);
            if (pVar.f20104c.f33012c.f28435k.contains(str2)) {
                hh.g.b(gVar2, 0, f.f23357u, 3);
                ng.c cVar = new ng.c();
                cVar.a(Build.VERSION.RELEASE, "os_version");
                cVar.a(str, "source");
                if (!kotlin.jvm.internal.i.b(str, "settings") && bundle != null && (keySet = bundle.keySet()) != null) {
                    for (String key : keySet) {
                        kotlin.jvm.internal.i.f(key, "key");
                        cVar.a(bundle.get(key), key);
                    }
                }
                String appId = (String) pVar.f20102a.f5133c;
                kotlin.jvm.internal.i.g(context, "context");
                kotlin.jvm.internal.i.g(appId, "appId");
                p b10 = g0.b(appId);
                if (b10 != null) {
                    w.f29578a.getClass();
                    w.d(b10).c(context, str2, cVar);
                }
            }
        } catch (Throwable th2) {
            hh.a aVar = hh.g.f17610d;
            g.a.a(1, th2, g.f23358u);
        }
    }

    public final void d(Context context, boolean z10, String str, Bundle bundle) {
        p pVar = this.f23351a;
        kotlin.jvm.internal.i.g(context, "context");
        try {
            hh.g gVar = pVar.f20105d;
            hh.g gVar2 = pVar.f20105d;
            hh.g.b(gVar, 0, h.f23359u, 3);
            w.f29578a.getClass();
            ih.e B = w.f(context, pVar).B("moe_push_opted");
            hh.g.b(gVar2, 0, new i(z10, B), 3);
            if (B == null || Boolean.parseBoolean(B.f20079c) != z10) {
                hh.g.b(gVar2, 0, j.f23362u, 3);
                b(context, pVar, z10);
                if (B != null) {
                    c(context, z10, str, bundle);
                }
            }
        } catch (Throwable th2) {
            pVar.f20105d.a(1, th2, k.f23363u);
        }
    }
}
