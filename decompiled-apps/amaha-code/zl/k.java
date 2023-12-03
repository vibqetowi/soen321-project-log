package zl;

import com.theinnerhour.b2b.network.model.TelecommunicationsHomeworkResponseModel;
import com.theinnerhour.b2b.utils.LogHelper;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
/* compiled from: ExpertCareDashboardViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.expertCare.viewmodel.ExpertCareDashboardViewModel$fetchPendingInitialAssessment$2$1", f = "ExpertCareDashboardViewModel.kt", l = {325}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class k extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f39534u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ o f39535v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.j<TelecommunicationsHomeworkResponseModel> f39536w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ boolean f39537x;

    /* compiled from: ExpertCareDashboardViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.expertCare.viewmodel.ExpertCareDashboardViewModel$fetchPendingInitialAssessment$2$1$1", f = "ExpertCareDashboardViewModel.kt", l = {326}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f39538u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ o f39539v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ boolean f39540w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.j<TelecommunicationsHomeworkResponseModel> f39541x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o oVar, ls.d dVar, kotlinx.coroutines.j jVar, boolean z10) {
            super(2, dVar);
            this.f39539v = oVar;
            this.f39540w = z10;
            this.f39541x = jVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            boolean z10 = this.f39540w;
            return new a(this.f39539v, dVar, this.f39541x, z10);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f39538u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                rp.a aVar2 = this.f39539v.f39565x;
                this.f39538u = 1;
                obj = aVar2.e(true, this.f39540w, 3, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            TelecommunicationsHomeworkResponseModel telecommunicationsHomeworkResponseModel = (TelecommunicationsHomeworkResponseModel) obj;
            if (telecommunicationsHomeworkResponseModel != null) {
                this.f39541x.resumeWith(telecommunicationsHomeworkResponseModel);
                return hs.k.f19476a;
            }
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, ls.d dVar, kotlinx.coroutines.j jVar, boolean z10) {
        super(2, dVar);
        this.f39535v = oVar;
        this.f39536w = jVar;
        this.f39537x = z10;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new k(this.f39535v, dVar, this.f39536w, this.f39537x);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((k) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f39534u;
        o oVar = this.f39535v;
        kotlinx.coroutines.j<TelecommunicationsHomeworkResponseModel> jVar = this.f39536w;
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
                a aVar2 = new a(oVar, null, jVar, this.f39537x);
                this.f39534u = 1;
                if (ta.v.S(bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(oVar.f39566y, e10);
            if (jVar.a()) {
                jVar.resumeWith(null);
            }
        }
        return hs.k.f19476a;
    }
}
