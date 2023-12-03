package eo;

import com.theinnerhour.b2b.components.onboarding.model.ProviderListModel;
import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import com.theinnerhour.b2b.model.EducationPackagesModel;
import com.theinnerhour.b2b.model.ExperiencePackagesModel;
import com.theinnerhour.b2b.model.LanguagePackagesModel;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import hs.k;
import is.u;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
import ls.h;
import ns.i;
import or.m;
import ss.p;
import ta.v;
/* compiled from: OnboardingFlowViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.onboarding.utils.OnboardingFlowViewModel$fetchPsychiatryProviderList$1", f = "OnboardingFlowViewModel.kt", l = {301}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class b extends i implements p<d0, ls.d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f14425u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ f f14426v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ boolean f14427w;

    /* compiled from: OnboardingFlowViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.onboarding.utils.OnboardingFlowViewModel$fetchPsychiatryProviderList$1$1", f = "OnboardingFlowViewModel.kt", l = {302}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements p<d0, ls.d<? super k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f14428u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f14429v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ f f14430w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f14431x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar, boolean z10, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f14430w = fVar;
            this.f14431x = z10;
        }

        @Override // ns.a
        public final ls.d<k> create(Object obj, ls.d<?> dVar) {
            a aVar = new a(this.f14430w, this.f14431x, dVar);
            aVar.f14429v = obj;
            return aVar;
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            k kVar;
            ArrayList arrayList;
            int i6;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i10 = this.f14428u;
            f fVar = this.f14430w;
            if (i10 != 0) {
                if (i10 == 1) {
                    d0 d0Var = (d0) this.f14429v;
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                p001do.a aVar2 = fVar.E;
                this.f14429v = (d0) this.f14429v;
                this.f14428u = 1;
                aVar2.getClass();
                h hVar = new h(ca.a.G0(this));
                try {
                    ((m) nr.b.a(m.class)).c("https://api.theinnerhour.com/v1/search/v2/psychiatrists").I(new p001do.b(aVar2, hVar));
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(aVar2.f13174a, e10);
                }
                obj = hVar.b();
                if (obj == aVar) {
                    return aVar;
                }
            }
            hs.f fVar2 = (hs.f) obj;
            if (fVar2 != null && (arrayList = (ArrayList) fVar2.f19464u) != null) {
                boolean z10 = this.f14431x;
                if (z10) {
                    fVar.F.i(new SingleUseEvent<>(arrayList));
                }
                fVar.getClass();
                try {
                    ArrayList<ProviderListModel> arrayList2 = new ArrayList<>();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        TherapistPackagesModel therapistPackagesModel = (TherapistPackagesModel) it.next();
                        String firstname = therapistPackagesModel.getFirstname();
                        String lastname = therapistPackagesModel.getLastname();
                        String uuid = therapistPackagesModel.getUuid();
                        String image = therapistPackagesModel.getImage();
                        ArrayList<LanguagePackagesModel> languages = therapistPackagesModel.getLanguages();
                        ArrayList<EducationPackagesModel> educations = therapistPackagesModel.getEducations();
                        ExperiencePackagesModel experiencePackagesModel = new ExperiencePackagesModel();
                        ExperiencePackagesModel experience = therapistPackagesModel.getExperience();
                        if (experience != null) {
                            i6 = experience.getYear();
                        } else {
                            i6 = 0;
                        }
                        experiencePackagesModel.setYear(i6);
                        kotlin.jvm.internal.i.f(uuid, "uuid");
                        arrayList2.add(new ProviderListModel(firstname, lastname, image, educations, experiencePackagesModel, languages, uuid, "psychiatrist"));
                        ApplicationPersistence.getInstance().setMatchingTherapistsSP(arrayList2);
                        if (!z10) {
                            fVar.H.i(new SingleUseEvent<>(new ArrayList(u.E2(arrayList2, 5))));
                        }
                    }
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(fVar.f14443x, e11);
                }
                kVar = k.f19476a;
            } else {
                kVar = null;
            }
            if (kVar == null) {
                fVar.G.i(new SingleUseEvent<>(Boolean.TRUE));
            }
            return k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, boolean z10, ls.d<? super b> dVar) {
        super(2, dVar);
        this.f14426v = fVar;
        this.f14427w = z10;
    }

    @Override // ns.a
    public final ls.d<k> create(Object obj, ls.d<?> dVar) {
        return new b(this.f14426v, this.f14427w, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
        return ((b) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f14425u;
        f fVar = this.f14426v;
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
                a aVar2 = new a(fVar, this.f14427w, null);
                this.f14425u = 1;
                if (v.S(bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(fVar.f14443x, e10);
        }
        return k.f19476a;
    }
}
