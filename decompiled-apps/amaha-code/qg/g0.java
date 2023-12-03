package qg;

import hh.g;
import java.util.LinkedHashMap;
/* compiled from: SdkInstanceManager.kt */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f29556a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final LinkedHashMap f29557b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    public static ih.p f29558c;

    /* compiled from: SdkInstanceManager.kt */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final a f29559u = new a();

        public a() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(Integer.valueOf(g0.f29557b.size()), "Core_SdkInstanceManager addInstanceIfPossible() Current Instance Count: ");
        }
    }

    /* compiled from: SdkInstanceManager.kt */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final b f29560u = new b();

        public b() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            boolean z10;
            if (g0.f29558c != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            return kotlin.jvm.internal.i.n(Boolean.valueOf(z10), "Core_SdkInstanceManager addInstanceIfPossible() Is default instance initialised? ");
        }
    }

    /* compiled from: SdkInstanceManager.kt */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ ih.p f29561u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ih.p pVar) {
            super(0);
            this.f29561u = pVar;
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(Boolean.valueOf(this.f29561u.f20102a.f5132b), "Core_SdkInstanceManager addInstanceIfPossible() Is incoming instance default? ");
        }
    }

    /* compiled from: SdkInstanceManager.kt */
    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final d f29562u = new d();

        public d() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Core_SdkInstanceManager addInstanceIfPossible() Ignoring instance max limit reached.";
        }
    }

    public static boolean a(ih.p pVar) {
        boolean z10;
        synchronized (f29556a) {
            hh.a aVar = hh.g.f17610d;
            g.a.b(0, a.f29559u, 3);
            g.a.b(0, b.f29560u, 3);
            g.a.b(0, new c(pVar), 3);
            LinkedHashMap linkedHashMap = f29557b;
            if (linkedHashMap.size() < 5) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                g.a.b(0, d.f29562u, 3);
                return false;
            }
            c9.d dVar = pVar.f20102a;
            if (dVar.f5132b) {
                f29558c = pVar;
            }
            linkedHashMap.put((String) dVar.f5133c, pVar);
            hs.k kVar = hs.k.f19476a;
            return true;
        }
    }

    public static ih.p b(String appId) {
        kotlin.jvm.internal.i.g(appId, "appId");
        return (ih.p) f29557b.get(appId);
    }
}
