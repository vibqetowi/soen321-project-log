package vg;

import android.content.Context;
import ih.p;
import ih.r;
import ne.u;
import qg.w;
/* compiled from: DeviceAddHandler.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final p f35081a;

    /* renamed from: b  reason: collision with root package name */
    public final String f35082b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f35083c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f35084d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f35085e;
    public boolean f;

    /* compiled from: DeviceAddHandler.kt */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<String> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" initiateDeviceAdd() : ", d.this.f35082b);
        }
    }

    /* compiled from: DeviceAddHandler.kt */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<String> {
        public b() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" initiateDeviceAdd() : App is disabled. Will not make device add call.", d.this.f35082b);
        }
    }

    /* compiled from: DeviceAddHandler.kt */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<String> {
        public c() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" initiateDeviceAdd() : Initiating device add call", d.this.f35082b);
        }
    }

    /* compiled from: DeviceAddHandler.kt */
    /* renamed from: vg.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0594d extends kotlin.jvm.internal.k implements ss.a<String> {
        public C0594d() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder();
            d dVar = d.this;
            sb2.append(dVar.f35082b);
            sb2.append(" initiateDeviceAdd() : Device add call initiated: ");
            sb2.append(dVar.f35083c);
            return sb2.toString();
        }
    }

    /* compiled from: DeviceAddHandler.kt */
    /* loaded from: classes.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<String> {
        public e() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" initiateDeviceAdd() : ", d.this.f35082b);
        }
    }

    /* compiled from: DeviceAddHandler.kt */
    /* loaded from: classes.dex */
    public static final class f extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ c9.d f35092v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(c9.d dVar) {
            super(0);
            this.f35092v = dVar;
        }

        @Override // ss.a
        public final String invoke() {
            return d.this.f35082b + " processPendingRequestIfRequired() : " + this.f35092v;
        }
    }

    /* compiled from: DeviceAddHandler.kt */
    /* loaded from: classes.dex */
    public static final class g extends kotlin.jvm.internal.k implements ss.a<String> {
        public g() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" processPendingRequestIfRequired() : ", d.this.f35082b);
        }
    }

    /* compiled from: DeviceAddHandler.kt */
    /* loaded from: classes.dex */
    public static final class h extends kotlin.jvm.internal.k implements ss.a<String> {
        public h() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" registerGdprOptOut() : ", d.this.f35082b);
        }
    }

    /* compiled from: DeviceAddHandler.kt */
    /* loaded from: classes.dex */
    public static final class i extends kotlin.jvm.internal.k implements ss.a<String> {
        public i() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" registerGdprOptOut() : Device Add is in progress, will send gdpr opt-out after current request completes.", d.this.f35082b);
        }
    }

    /* compiled from: DeviceAddHandler.kt */
    /* loaded from: classes.dex */
    public static final class j extends kotlin.jvm.internal.k implements ss.a<String> {
        public j() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" registerGdprOptOut() : Initiating request to send GDPR opt out.", d.this.f35082b);
        }
    }

    /* compiled from: DeviceAddHandler.kt */
    /* loaded from: classes.dex */
    public static final class k extends kotlin.jvm.internal.k implements ss.a<String> {
        public k() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" registerGdprOptOut() : ", d.this.f35082b);
        }
    }

    /* compiled from: DeviceAddHandler.kt */
    /* loaded from: classes.dex */
    public static final class l extends kotlin.jvm.internal.k implements ss.a<String> {
        public l() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" retryDeviceRegistrationIfRequired() : Device not registered yet. Will try to register device.", d.this.f35082b);
        }
    }

    /* compiled from: DeviceAddHandler.kt */
    /* loaded from: classes.dex */
    public static final class m extends kotlin.jvm.internal.k implements ss.a<String> {
        public m() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" retryDeviceRegistrationIfRequired() : ", d.this.f35082b);
        }
    }

    public d(p sdkInstance) {
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        this.f35081a = sdkInstance;
        this.f35082b = "Core_DeviceAddHandler";
    }

    public final void a(Context context) {
        try {
            hh.g.b(this.f35081a.f20105d, 0, new a(), 3);
            if (!di.b.u(context, this.f35081a)) {
                hh.g.b(this.f35081a.f20105d, 3, new b(), 2);
                return;
            }
            synchronized (d.class) {
                if (this.f35083c) {
                    return;
                }
                hh.g.b(this.f35081a.f20105d, 0, new c(), 3);
                w wVar = w.f29578a;
                p pVar = this.f35081a;
                wVar.getClass();
                w.f(context, pVar).g(false);
                this.f35083c = this.f35081a.f20106e.a(new ah.e("DEVICE_ADD", false, new u(this, 12, context)));
                hh.g.b(this.f35081a.f20105d, 0, new C0594d(), 3);
                hs.k kVar = hs.k.f19476a;
            }
        } catch (Throwable th2) {
            this.f35081a.f20105d.a(1, th2, new e());
        }
    }

    public final void b(Context context, c9.d dVar) {
        synchronized (d.class) {
            try {
                hh.g.b(this.f35081a.f20105d, 0, new f(dVar), 3);
                this.f35083c = false;
                w wVar = w.f29578a;
                p pVar = this.f35081a;
                wVar.getClass();
                w.f(context, pVar).g(dVar.f5132b);
                if (!dVar.f5132b) {
                    return;
                }
                r rVar = (r) dVar.f5133c;
                if (rVar == null) {
                    return;
                }
                if (this.f && !rVar.f20109b) {
                    this.f = false;
                    a(context);
                }
                if (this.f35085e && !rVar.f20108a) {
                    this.f35085e = false;
                    a(context);
                }
                if (this.f35084d) {
                    this.f35084d = false;
                    c(context);
                }
                hs.k kVar = hs.k.f19476a;
            }
        }
    }

    public final void c(Context context) {
        p pVar = this.f35081a;
        try {
            hh.g.b(pVar.f20105d, 0, new h(), 3);
            boolean z10 = this.f35083c;
            hh.g gVar = pVar.f20105d;
            if (z10) {
                hh.g.b(gVar, 0, new i(), 3);
                this.f35084d = true;
                return;
            }
            hh.g.b(gVar, 0, new j(), 3);
            a(context);
        } catch (Throwable th2) {
            pVar.f20105d.a(1, th2, new k());
        }
    }

    public final void d(Context context) {
        p pVar = this.f35081a;
        try {
            w.f29578a.getClass();
            if (!w.f(context, pVar).Z()) {
                hh.g.b(pVar.f20105d, 0, new l(), 3);
                a(context);
            }
        } catch (Throwable th2) {
            pVar.f20105d.a(1, th2, new m());
        }
    }
}
