package ml;

import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import com.theinnerhour.b2b.network.model.CrossProviderRecommendationNotificationModel;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
/* compiled from: DashboardTelecommunicationsViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.DashboardTelecommunicationsViewModel$fetchCrossRecommendationPromptIfAny$2$1", f = "DashboardTelecommunicationsViewModel.kt", l = {249}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class e extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f25406u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ p f25407v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ boolean f25408w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ ls.d<Boolean> f25409x;

    /* compiled from: DashboardTelecommunicationsViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.DashboardTelecommunicationsViewModel$fetchCrossRecommendationPromptIfAny$2$1$1", f = "DashboardTelecommunicationsViewModel.kt", l = {250}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f25410u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f25411v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ p f25412w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f25413x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ ls.d<Boolean> f25414y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(p pVar, boolean z10, ls.d<? super Boolean> dVar, ls.d<? super a> dVar2) {
            super(2, dVar2);
            this.f25412w = pVar;
            this.f25413x = z10;
            this.f25414y = dVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            a aVar = new a(this.f25412w, this.f25413x, this.f25414y, dVar);
            aVar.f25411v = obj;
            return aVar;
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            String str;
            boolean z10;
            TherapistPackagesModel therapistPackagesModel;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f25410u;
            p pVar = this.f25412w;
            boolean z11 = this.f25413x;
            if (i6 != 0) {
                if (i6 == 1) {
                    kotlinx.coroutines.d0 d0Var = (kotlinx.coroutines.d0) this.f25411v;
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                kotlinx.coroutines.d0 d0Var2 = (kotlinx.coroutines.d0) this.f25411v;
                rp.a aVar2 = pVar.f25558y;
                if (z11) {
                    str = "https://api.theinnerhour.com/v1/therapist/get_teleconsultation_notification";
                } else {
                    str = "https://api.theinnerhour.com/v1/psychiatrist/get_teleconsultation_notification";
                }
                this.f25411v = d0Var2;
                this.f25410u = 1;
                obj = aVar2.a(str, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            CrossProviderRecommendationNotificationModel crossProviderRecommendationNotificationModel = (CrossProviderRecommendationNotificationModel) obj;
            ls.d<Boolean> dVar = this.f25414y;
            Object obj2 = null;
            if (crossProviderRecommendationNotificationModel != null) {
                if (crossProviderRecommendationNotificationModel.getId() == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    crossProviderRecommendationNotificationModel = null;
                }
                if (crossProviderRecommendationNotificationModel != null) {
                    if (z11) {
                        hs.f<TherapistPackagesModel, TherapistPackagesModel> d10 = pVar.A.d();
                        if (d10 != null && (therapistPackagesModel = d10.f19464u) != null) {
                            obj2 = new Integer(therapistPackagesModel.getId());
                        }
                        if (obj2 != null) {
                            pVar.F = crossProviderRecommendationNotificationModel;
                            pVar.T = true;
                            dVar.resumeWith(Boolean.TRUE);
                            obj2 = hs.k.f19476a;
                        }
                    }
                    pVar.G = crossProviderRecommendationNotificationModel;
                    pVar.U = true;
                    dVar.resumeWith(Boolean.TRUE);
                    obj2 = hs.k.f19476a;
                }
            }
            if (obj2 == null) {
                if (z11) {
                    ApplicationPersistence.getInstance().deleteKey("db_integrated_cross_therapy");
                } else {
                    ApplicationPersistence.getInstance().deleteKey("db_integrated_cross_psychiatry");
                }
                dVar.resumeWith(Boolean.FALSE);
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(p pVar, boolean z10, ls.d<? super Boolean> dVar, ls.d<? super e> dVar2) {
        super(2, dVar2);
        this.f25407v = pVar;
        this.f25408w = z10;
        this.f25409x = dVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new e(this.f25407v, this.f25408w, this.f25409x, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((e) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f25406u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.scheduling.b bVar = kotlinx.coroutines.o0.f23642c;
            a aVar2 = new a(this.f25407v, this.f25408w, this.f25409x, null);
            this.f25406u = 1;
            if (ta.v.S(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
