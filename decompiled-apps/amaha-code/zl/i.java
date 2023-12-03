package zl;

import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
/* compiled from: ExpertCareDashboardViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.expertCare.viewmodel.ExpertCareDashboardViewModel$fetchFeedBack$1", f = "ExpertCareDashboardViewModel.kt", l = {247}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class i extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f39516u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ o f39517v;

    /* compiled from: ExpertCareDashboardViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.expertCare.viewmodel.ExpertCareDashboardViewModel$fetchFeedBack$1$1", f = "ExpertCareDashboardViewModel.kt", l = {251}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f39518u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f39519v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ o f39520w;

        /* compiled from: ExpertCareDashboardViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.expertCare.viewmodel.ExpertCareDashboardViewModel$fetchFeedBack$1$1$1", f = "ExpertCareDashboardViewModel.kt", l = {249}, m = "invokeSuspend")
        /* renamed from: zl.i$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0676a extends ns.i implements ss.p<d0, ls.d<? super String>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f39521u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ o f39522v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0676a(o oVar, ls.d<? super C0676a> dVar) {
                super(2, dVar);
                this.f39522v = oVar;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new C0676a(this.f39522v, dVar);
            }

            @Override // ss.p
            public final Object invoke(d0 d0Var, ls.d<? super String> dVar) {
                return ((C0676a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f39521u;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    this.f39521u = 1;
                    obj = o.h(this.f39522v, true, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return obj;
            }
        }

        /* compiled from: ExpertCareDashboardViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.expertCare.viewmodel.ExpertCareDashboardViewModel$fetchFeedBack$1$1$2", f = "ExpertCareDashboardViewModel.kt", l = {250}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends ns.i implements ss.p<d0, ls.d<? super String>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f39523u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ o f39524v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(o oVar, ls.d<? super b> dVar) {
                super(2, dVar);
                this.f39524v = oVar;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new b(this.f39524v, dVar);
            }

            @Override // ss.p
            public final Object invoke(d0 d0Var, ls.d<? super String> dVar) {
                return ((b) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f39523u;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    this.f39523u = 1;
                    obj = o.h(this.f39524v, false, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o oVar, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f39520w = oVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            a aVar = new a(this.f39520w, dVar);
            aVar.f39519v = obj;
            return aVar;
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            boolean z10;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f39518u;
            o oVar = this.f39520w;
            boolean z11 = false;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                d0 d0Var = (d0) this.f39519v;
                ArrayList k10 = ca.a.k(ta.v.g(d0Var, null, new C0676a(oVar, null), 3), ta.v.g(d0Var, null, new b(oVar, null), 3));
                this.f39518u = 1;
                obj = ca.a.n(k10, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            List list = (List) obj;
            ArrayList arrayList = new ArrayList();
            String str = (String) is.u.j2(0, list);
            if (str != null) {
                if (str.length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    arrayList.add(new hs.f(Boolean.TRUE, str));
                }
            }
            String str2 = (String) is.u.j2(1, list);
            if (str2 != null) {
                if (str2.length() > 0) {
                    z11 = true;
                }
                if (z11) {
                    arrayList.add(new hs.f(Boolean.FALSE, str2));
                }
            }
            if (!list.isEmpty()) {
                oVar.Q.i(new SingleUseEvent<>(arrayList));
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(o oVar, ls.d<? super i> dVar) {
        super(2, dVar);
        this.f39517v = oVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new i(this.f39517v, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((i) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f39516u;
        o oVar = this.f39517v;
        try {
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                kotlinx.coroutines.scheduling.b bVar = o0.f23642c;
                a aVar2 = new a(oVar, null);
                this.f39516u = 1;
                if (ta.v.S(bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(oVar.f39566y, e10);
        }
        return hs.k.f19476a;
    }
}
