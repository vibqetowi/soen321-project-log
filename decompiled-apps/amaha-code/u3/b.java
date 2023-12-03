package u3;

import androidx.appcompat.widget.l;
import gv.n;
import hs.k;
import is.e0;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.w0;
import ns.i;
import s1.s;
import ss.p;
import ta.v;
import w3.j;
/* compiled from: Amplitude.kt */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public final e f33766a;

    /* renamed from: b  reason: collision with root package name */
    public final s f33767b;

    /* renamed from: c  reason: collision with root package name */
    public final d0 f33768c;

    /* renamed from: d  reason: collision with root package name */
    public final a0 f33769d;

    /* renamed from: e  reason: collision with root package name */
    public final a0 f33770e;
    public final a0 f;

    /* renamed from: g  reason: collision with root package name */
    public final a0 f33771g;

    /* renamed from: h  reason: collision with root package name */
    public final l f33772h;

    /* renamed from: i  reason: collision with root package name */
    public g f33773i;

    /* renamed from: j  reason: collision with root package name */
    public final r3.a f33774j;

    /* renamed from: k  reason: collision with root package name */
    public a4.e f33775k;

    /* renamed from: l  reason: collision with root package name */
    public h0<Boolean> f33776l;

    /* compiled from: Amplitude.kt */
    @ns.e(c = "com.amplitude.core.Amplitude$process$1", f = "Amplitude.kt", l = {322}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends i implements p<d0, ls.d<? super k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f33777u;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ v3.a f33779w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v3.a aVar, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f33779w = aVar;
        }

        @Override // ns.a
        public final ls.d<k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f33779w, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f33777u;
            b bVar = b.this;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                h0<Boolean> e10 = bVar.e();
                this.f33777u = 1;
                if (e10.e0(this) == aVar) {
                    return aVar;
                }
            }
            l lVar = bVar.f33772h;
            lVar.getClass();
            v3.a incomingEvent = this.f33779w;
            kotlin.jvm.internal.i.g(incomingEvent, "incomingEvent");
            lVar.h(j.a.Destination, lVar.h(j.a.Enrichment, lVar.h(j.a.Before, incomingEvent)));
            return k.f19476a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008a, code lost:
        if (r0 != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(e eVar) {
        boolean z10;
        Boolean valueOf;
        boolean booleanValue;
        s sVar = new s(5);
        kotlinx.coroutines.internal.c c10 = kotlin.jvm.internal.h.c(sp.b.a());
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        kotlin.jvm.internal.i.f(newCachedThreadPool, "newCachedThreadPool()");
        w0 w0Var = new w0(newCachedThreadPool);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        kotlin.jvm.internal.i.f(newSingleThreadExecutor, "newSingleThreadExecutor()");
        w0 w0Var2 = new w0(newSingleThreadExecutor);
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);
        kotlin.jvm.internal.i.f(newFixedThreadPool, "newFixedThreadPool(2)");
        w0 w0Var3 = new w0(newFixedThreadPool);
        ExecutorService newSingleThreadExecutor2 = Executors.newSingleThreadExecutor();
        kotlin.jvm.internal.i.f(newSingleThreadExecutor2, "newSingleThreadExecutor()");
        w0 w0Var4 = new w0(newSingleThreadExecutor2);
        this.f33766a = eVar;
        this.f33767b = sVar;
        this.f33768c = c10;
        this.f33769d = w0Var;
        this.f33770e = w0Var2;
        this.f = w0Var3;
        this.f33771g = w0Var4;
        boolean z11 = true;
        if ((!n.B0(eVar.f33786a)) && eVar.c() > 0 && eVar.b() > 0) {
            Integer g5 = eVar.g();
            if (g5 == null) {
                valueOf = null;
            } else {
                if (g5.intValue() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                valueOf = Boolean.valueOf(z10);
            }
            if (valueOf == null) {
                booleanValue = true;
            } else {
                booleanValue = valueOf.booleanValue();
            }
        }
        z11 = false;
        if (z11) {
            l lVar = new l(5);
            lVar.f1472w = this;
            k kVar = k.f19476a;
            this.f33772h = lVar;
            this.f33774j = eVar.f().g((o3.a) this);
            b();
            return;
        }
        throw new IllegalArgumentException("invalid configuration".toString());
    }

    public static void h(b bVar, String eventType, HashMap hashMap, int i6) {
        LinkedHashMap linkedHashMap = null;
        if ((i6 & 2) != 0) {
            hashMap = null;
        }
        bVar.getClass();
        kotlin.jvm.internal.i.g(eventType, "eventType");
        v3.a aVar = new v3.a();
        aVar.L = eventType;
        if (hashMap != null) {
            linkedHashMap = e0.z0(hashMap);
        }
        aVar.M = linkedHashMap;
        bVar.f(aVar);
    }

    public final void a(j jVar) {
        if (jVar instanceof w3.i) {
            s sVar = this.f33767b;
            w3.i iVar = (w3.i) jVar;
            sVar.getClass();
            synchronized (((List) sVar.f31224v)) {
                ((List) sVar.f31224v).add(iVar);
            }
            return;
        }
        this.f33772h.f(jVar);
    }

    public void b() {
        throw null;
    }

    public final a4.e c() {
        a4.e eVar = this.f33775k;
        if (eVar != null) {
            return eVar;
        }
        kotlin.jvm.internal.i.q("idContainer");
        throw null;
    }

    public final g d() {
        g gVar = this.f33773i;
        if (gVar != null) {
            return gVar;
        }
        kotlin.jvm.internal.i.q("storage");
        throw null;
    }

    public final h0<Boolean> e() {
        h0<Boolean> h0Var = this.f33776l;
        if (h0Var != null) {
            return h0Var;
        }
        kotlin.jvm.internal.i.q("isBuilt");
        throw null;
    }

    public final void f(v3.a aVar) {
        if (this.f33766a.h()) {
            this.f33774j.b();
            return;
        }
        v.H(this.f33768c, this.f33769d, 0, new a(aVar, null), 2);
    }

    public final void g(String deviceId) {
        kotlin.jvm.internal.i.g(deviceId, "deviceId");
        v.H(this.f33768c, this.f33769d, 0, new c(this, deviceId, null), 2);
    }
}
