package o3;

import a4.e;
import hs.k;
import java.io.File;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.h0;
import ns.i;
import ss.p;
import ta.v;
import u3.g;
/* compiled from: Amplitude.kt */
/* loaded from: classes.dex */
public final class a extends u3.b {

    /* renamed from: m  reason: collision with root package name */
    public boolean f26997m;

    /* renamed from: n  reason: collision with root package name */
    public long f26998n;

    /* renamed from: o  reason: collision with root package name */
    public long f26999o;

    /* renamed from: p  reason: collision with root package name */
    public long f27000p;

    /* renamed from: q  reason: collision with root package name */
    public long f27001q;

    /* compiled from: Amplitude.kt */
    @ns.e(c = "com.amplitude.android.Amplitude$build$1", f = "Amplitude.kt", l = {}, m = "invokeSuspend")
    /* renamed from: o3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0444a extends i implements p<d0, ls.d<? super Boolean>, Object> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ a f27003v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0444a(a aVar, ls.d<? super C0444a> dVar) {
            super(2, dVar);
            this.f27003v = aVar;
        }

        @Override // ns.a
        public final ls.d<k> create(Object obj, ls.d<?> dVar) {
            return new C0444a(this.f27003v, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super Boolean> dVar) {
            return ((C0444a) create(d0Var, dVar)).invokeSuspend(k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            long parseLong;
            sp.b.d0(obj);
            a aVar = a.this;
            q3.b e10 = aVar.f33766a.m().e(this.f27003v);
            kotlin.jvm.internal.i.g(e10, "<set-?>");
            aVar.f33773i = e10;
            u3.e eVar = aVar.f33766a;
            File dir = ((e) eVar).f27015c.getDir(kotlin.jvm.internal.i.n(eVar.e(), "amplitude-kotlin-"), 0);
            Object obj2 = a4.e.f294b;
            aVar.f33775k = e.a.a(new a4.d(eVar.e(), eVar.f33786a, new df.b(0), dir, 4));
            y3.a aVar2 = new y3.a(aVar.f33767b);
            aVar.c().f296a.b(aVar2);
            if (aVar.c().f296a.f) {
                aVar2.c(aVar.c().f296a.c(), a4.k.Initialized);
            }
            String j10 = aVar.d().j(g.a.PREVIOUS_SESSION_ID);
            long j11 = -1;
            if (j10 == null) {
                parseLong = -1;
            } else {
                parseLong = Long.parseLong(j10);
            }
            aVar.f27001q = parseLong;
            long j12 = 0;
            if (parseLong >= 0) {
                aVar.f26998n = parseLong;
            }
            String j13 = aVar.d().j(g.a.LAST_EVENT_ID);
            if (j13 != null) {
                j12 = Long.parseLong(j13);
            }
            aVar.f26999o = j12;
            String j14 = aVar.d().j(g.a.LAST_EVENT_TIME);
            if (j14 != null) {
                j11 = Long.parseLong(j14);
            }
            aVar.f27000p = j11;
            p3.a aVar3 = new p3.a();
            aVar.getClass();
            aVar.a(aVar3);
            aVar.a(new p3.c());
            return Boolean.TRUE;
        }
    }

    /* compiled from: Amplitude.kt */
    @ns.e(c = "com.amplitude.android.Amplitude$refreshSessionTime$1", f = "Amplitude.kt", l = {163, 164}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends i implements p<d0, ls.d<? super k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f27004u;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ long f27006w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j10, ls.d<? super b> dVar) {
            super(2, dVar);
            this.f27006w = j10;
        }

        @Override // ns.a
        public final ls.d<k> create(Object obj, ls.d<?> dVar) {
            return new b(this.f27006w, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
            return ((b) create(d0Var, dVar)).invokeSuspend(k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f27004u;
            a aVar2 = a.this;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 == 2) {
                        sp.b.d0(obj);
                        return k.f19476a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sp.b.d0(obj);
            } else {
                sp.b.d0(obj);
                h0<Boolean> e10 = aVar2.e();
                this.f27004u = 1;
                if (e10.e0(this) == aVar) {
                    return aVar;
                }
            }
            g d10 = aVar2.d();
            g.a aVar3 = g.a.LAST_EVENT_TIME;
            String valueOf = String.valueOf(this.f27006w);
            this.f27004u = 2;
            if (d10.b(aVar3, valueOf) == aVar) {
                return aVar;
            }
            return k.f19476a;
        }
    }

    public a(e eVar) {
        super(eVar);
        this.f26998n = -1L;
        this.f27000p = -1L;
        this.f27001q = -1L;
    }

    @Override // u3.b
    public final void b() {
        this.f33776l = v.g(this.f33768c, this.f33769d, new C0444a(this, null), 2);
        a(new x3.a());
    }

    public final void i(long j10) {
        boolean z10;
        if (this.f26998n >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        this.f27000p = j10;
        v.H(this.f33768c, this.f33769d, 0, new b(j10, null), 2);
    }

    public final void j(long j10) {
        boolean z10;
        e eVar = (e) this.f33766a;
        boolean z11 = true;
        if (eVar.f27036z) {
            if (this.f26998n >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                u3.b.h(this, "session_end", null, 6);
            }
        }
        this.f26998n = j10;
        this.f27001q = j10;
        v.H(this.f33768c, this.f33769d, 0, new d(this, j10, null), 2);
        i(j10);
        if (eVar.f27036z) {
            if (this.f26998n < 0) {
                z11 = false;
            }
            if (z11) {
                u3.b.h(this, "session_start", null, 6);
            }
        }
    }

    public final void k(long j10) {
        boolean z10;
        boolean z11 = true;
        if (this.f26998n >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u3.e eVar = this.f33766a;
        if (z10) {
            if (j10 - this.f27000p >= ((e) eVar).f27035y) {
                z11 = false;
            }
            if (z11) {
                i(j10);
                return;
            } else {
                j(j10);
                return;
            }
        }
        if (j10 - this.f27000p >= ((e) eVar).f27035y) {
            z11 = false;
        }
        if (z11) {
            long j11 = this.f27001q;
            if (j11 == -1) {
                j(j10);
                return;
            }
            this.f26998n = j11;
            this.f27001q = j11;
            v.H(this.f33768c, this.f33769d, 0, new d(this, j11, null), 2);
            i(j10);
            return;
        }
        j(j10);
    }
}
