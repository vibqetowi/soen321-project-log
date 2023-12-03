package zl;

import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import com.theinnerhour.b2b.network.model.CrossProviderRecommendationNotificationModel;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
/* compiled from: ExpertCareDashboardViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.expertCare.viewmodel.ExpertCareDashboardViewModel$fetchCrossRecommendationPromptIfAny$2$1", f = "ExpertCareDashboardViewModel.kt", l = {359}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class g extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f39499u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ o f39500v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ boolean f39501w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ ls.d<Boolean> f39502x;

    /* compiled from: ExpertCareDashboardViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.expertCare.viewmodel.ExpertCareDashboardViewModel$fetchCrossRecommendationPromptIfAny$2$1$1", f = "ExpertCareDashboardViewModel.kt", l = {360}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f39503u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f39504v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ o f39505w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f39506x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ ls.d<Boolean> f39507y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(o oVar, boolean z10, ls.d<? super Boolean> dVar, ls.d<? super a> dVar2) {
            super(2, dVar2);
            this.f39505w = oVar;
            this.f39506x = z10;
            this.f39507y = dVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            a aVar = new a(this.f39505w, this.f39506x, this.f39507y, dVar);
            aVar.f39504v = obj;
            return aVar;
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            String str;
            Integer num;
            hs.f<TherapistPackagesModel, TherapistPackagesModel> peekContent;
            TherapistPackagesModel therapistPackagesModel;
            TherapistPackagesModel peekContent2;
            Integer num2;
            Integer num3;
            TherapistPackagesModel peekContent3;
            hs.f<TherapistPackagesModel, TherapistPackagesModel> peekContent4;
            TherapistPackagesModel therapistPackagesModel2;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f39503u;
            boolean z10 = this.f39506x;
            o oVar = this.f39505w;
            boolean z11 = true;
            if (i6 != 0) {
                if (i6 == 1) {
                    d0 d0Var = (d0) this.f39504v;
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                d0 d0Var2 = (d0) this.f39504v;
                rp.a aVar2 = oVar.f39565x;
                if (z10) {
                    str = "https://api.theinnerhour.com/v1/therapist/get_teleconsultation_notification";
                } else {
                    str = "https://api.theinnerhour.com/v1/psychiatrist/get_teleconsultation_notification";
                }
                this.f39504v = d0Var2;
                this.f39503u = 1;
                obj = aVar2.a(str, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            CrossProviderRecommendationNotificationModel crossProviderRecommendationNotificationModel = (CrossProviderRecommendationNotificationModel) obj;
            ls.d<Boolean> dVar = this.f39507y;
            Object obj2 = null;
            if (crossProviderRecommendationNotificationModel != null) {
                if (crossProviderRecommendationNotificationModel.getId() != null) {
                    z11 = false;
                }
                if (z11) {
                    crossProviderRecommendationNotificationModel = null;
                }
                if (crossProviderRecommendationNotificationModel != null) {
                    if (z10) {
                        SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>> d10 = oVar.f39567z.d();
                        if (d10 != null && (peekContent4 = d10.peekContent()) != null && (therapistPackagesModel2 = peekContent4.f19464u) != null) {
                            num2 = new Integer(therapistPackagesModel2.getId());
                        } else {
                            num2 = null;
                        }
                        if (num2 != null) {
                            SingleUseEvent<TherapistPackagesModel> d11 = oVar.A.d();
                            if (d11 != null && (peekContent3 = d11.peekContent()) != null) {
                                num3 = new Integer(peekContent3.getId());
                            } else {
                                num3 = null;
                            }
                            if (num3 == null && !kotlin.jvm.internal.i.b(ApplicationPersistence.getInstance().getStringValue("db_integrated_cross_psychiatry"), crossProviderRecommendationNotificationModel.getId())) {
                                oVar.C = crossProviderRecommendationNotificationModel;
                                dVar.resumeWith(Boolean.TRUE);
                                obj2 = hs.k.f19476a;
                            }
                        }
                    }
                    if (!z10) {
                        SingleUseEvent<TherapistPackagesModel> d12 = oVar.A.d();
                        if (d12 != null && (peekContent2 = d12.peekContent()) != null) {
                            num = new Integer(peekContent2.getId());
                        } else {
                            num = null;
                        }
                        if (num != null) {
                            SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>> d13 = oVar.f39567z.d();
                            if (d13 != null && (peekContent = d13.peekContent()) != null && (therapistPackagesModel = peekContent.f19464u) != null) {
                                obj2 = new Integer(therapistPackagesModel.getId());
                            }
                            if (obj2 == null && !kotlin.jvm.internal.i.b(ApplicationPersistence.getInstance().getStringValue("db_integrated_cross_therapy"), crossProviderRecommendationNotificationModel.getId())) {
                                oVar.D = crossProviderRecommendationNotificationModel;
                            }
                        }
                    }
                    dVar.resumeWith(Boolean.TRUE);
                    obj2 = hs.k.f19476a;
                }
            }
            if (obj2 == null) {
                dVar.resumeWith(Boolean.FALSE);
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(o oVar, boolean z10, ls.d<? super Boolean> dVar, ls.d<? super g> dVar2) {
        super(2, dVar2);
        this.f39500v = oVar;
        this.f39501w = z10;
        this.f39502x = dVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new g(this.f39500v, this.f39501w, this.f39502x, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((g) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f39499u;
        o oVar = this.f39500v;
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
                a aVar2 = new a(oVar, this.f39501w, this.f39502x, null);
                this.f39499u = 1;
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
