package zl;

import com.theinnerhour.b2b.utils.LogHelper;
import java.util.List;
import kotlinx.coroutines.d0;
/* compiled from: ExpertCareDashboardViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.expertCare.viewmodel.ExpertCareDashboardViewModel$fetchAllFutureSessions$1", f = "ExpertCareDashboardViewModel.kt", l = {474}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class e extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f39479u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f39480v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ o f39481w;

    /* compiled from: ExpertCareDashboardViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.expertCare.viewmodel.ExpertCareDashboardViewModel$fetchAllFutureSessions$1$1", f = "ExpertCareDashboardViewModel.kt", l = {469}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<d0, ls.d<? super Boolean>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f39482u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ o f39483v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o oVar, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f39483v = oVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f39483v, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super Boolean> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f39482u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                this.f39482u = 1;
                obj = o.g(this.f39483v, true, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    /* compiled from: ExpertCareDashboardViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.expertCare.viewmodel.ExpertCareDashboardViewModel$fetchAllFutureSessions$1$2", f = "ExpertCareDashboardViewModel.kt", l = {470}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends ns.i implements ss.p<d0, ls.d<? super Boolean>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f39484u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ o f39485v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(o oVar, ls.d<? super b> dVar) {
            super(2, dVar);
            this.f39485v = oVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new b(this.f39485v, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super Boolean> dVar) {
            return ((b) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f39484u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                this.f39484u = 1;
                obj = o.g(this.f39485v, false, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    /* compiled from: ExpertCareDashboardViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.expertCare.viewmodel.ExpertCareDashboardViewModel$fetchAllFutureSessions$1$3", f = "ExpertCareDashboardViewModel.kt", l = {471}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends ns.i implements ss.p<d0, ls.d<? super Boolean>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f39486u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ o f39487v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(o oVar, ls.d<? super c> dVar) {
            super(2, dVar);
            this.f39487v = oVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new c(this.f39487v, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super Boolean> dVar) {
            return ((c) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f39486u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                this.f39486u = 1;
                o oVar = this.f39487v;
                oVar.getClass();
                ls.h hVar = new ls.h(ca.a.G0(this));
                try {
                    ta.v.H(kc.f.H(oVar), null, 0, new n(oVar, hVar, null), 3);
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(oVar.f39566y, e10);
                    hVar.resumeWith(Boolean.FALSE);
                }
                obj = hVar.b();
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    /* compiled from: ExpertCareDashboardViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.expertCare.viewmodel.ExpertCareDashboardViewModel$fetchAllFutureSessions$1$4", f = "ExpertCareDashboardViewModel.kt", l = {472}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends ns.i implements ss.p<d0, ls.d<? super Boolean>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f39488u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ o f39489v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(o oVar, ls.d<? super d> dVar) {
            super(2, dVar);
            this.f39489v = oVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new d(this.f39489v, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super Boolean> dVar) {
            return ((d) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f39488u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                this.f39488u = 1;
                obj = o.j(this.f39489v, true, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    /* compiled from: ExpertCareDashboardViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.expertCare.viewmodel.ExpertCareDashboardViewModel$fetchAllFutureSessions$1$5", f = "ExpertCareDashboardViewModel.kt", l = {473}, m = "invokeSuspend")
    /* renamed from: zl.e$e  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0675e extends ns.i implements ss.p<d0, ls.d<? super Boolean>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f39490u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ o f39491v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0675e(o oVar, ls.d<? super C0675e> dVar) {
            super(2, dVar);
            this.f39491v = oVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new C0675e(this.f39491v, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super Boolean> dVar) {
            return ((C0675e) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f39490u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                this.f39490u = 1;
                obj = o.j(this.f39491v, false, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(o oVar, ls.d<? super e> dVar) {
        super(2, dVar);
        this.f39481w = oVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        e eVar = new e(this.f39481w, dVar);
        eVar.f39480v = obj;
        return eVar;
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((e) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f39479u;
        o oVar = this.f39481w;
        try {
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                d0 d0Var = (d0) this.f39480v;
                List P0 = ca.a.P0(ta.v.g(d0Var, null, new a(oVar, null), 3), ta.v.g(d0Var, null, new b(oVar, null), 3), ta.v.g(d0Var, null, new c(oVar, null), 3), ta.v.g(d0Var, null, new d(oVar, null), 3), ta.v.g(d0Var, null, new C0675e(oVar, null), 3));
                this.f39479u = 1;
                obj = ca.a.n(P0, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            List list = (List) obj;
            o.f(oVar);
            o.e(oVar);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(oVar.f39566y, e10);
        }
        return hs.k.f19476a;
    }
}
