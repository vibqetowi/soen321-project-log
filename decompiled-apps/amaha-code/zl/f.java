package zl;

import com.theinnerhour.b2b.network.model.UpcomingSessionsModel;
import com.theinnerhour.b2b.utils.LogHelper;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
/* compiled from: ExpertCareDashboardViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.expertCare.viewmodel.ExpertCareDashboardViewModel$fetchCompletedSessions$2$1", f = "ExpertCareDashboardViewModel.kt", l = {341}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class f extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f39492u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ o f39493v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ ls.d<Boolean> f39494w;

    /* compiled from: ExpertCareDashboardViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.expertCare.viewmodel.ExpertCareDashboardViewModel$fetchCompletedSessions$2$1$1", f = "ExpertCareDashboardViewModel.kt", l = {342}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f39495u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f39496v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ o f39497w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ ls.d<Boolean> f39498x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(o oVar, ls.d<? super Boolean> dVar, ls.d<? super a> dVar2) {
            super(2, dVar2);
            this.f39497w = oVar;
            this.f39498x = dVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            a aVar = new a(this.f39497w, this.f39498x, dVar);
            aVar.f39496v = obj;
            return aVar;
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            hs.k kVar;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f39495u;
            o oVar = this.f39497w;
            if (i6 != 0) {
                if (i6 == 1) {
                    d0 d0Var = (d0) this.f39496v;
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                rp.a aVar2 = oVar.f39565x;
                this.f39496v = (d0) this.f39496v;
                this.f39495u = 1;
                obj = aVar2.d(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            UpcomingSessionsModel upcomingSessionsModel = (UpcomingSessionsModel) obj;
            ls.d<Boolean> dVar = this.f39498x;
            if (upcomingSessionsModel != null) {
                oVar.K = upcomingSessionsModel.getBookings();
                dVar.resumeWith(Boolean.TRUE);
                kVar = hs.k.f19476a;
            } else {
                kVar = null;
            }
            if (kVar == null) {
                dVar.resumeWith(Boolean.FALSE);
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(o oVar, ls.d<? super Boolean> dVar, ls.d<? super f> dVar2) {
        super(2, dVar2);
        this.f39493v = oVar;
        this.f39494w = dVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new f(this.f39493v, this.f39494w, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((f) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f39492u;
        o oVar = this.f39493v;
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
                a aVar2 = new a(oVar, this.f39494w, null);
                this.f39492u = 1;
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
