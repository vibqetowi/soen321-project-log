package zl;

import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import com.theinnerhour.b2b.network.model.SuggestedBooking;
import com.theinnerhour.b2b.network.model.SuggestedSessionsResponseModel;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import java.util.ArrayList;
import kotlinx.coroutines.d0;
/* compiled from: ExpertCareDashboardViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.expertCare.viewmodel.ExpertCareDashboardViewModel$fetchSuggestedSessions$2$1", f = "ExpertCareDashboardViewModel.kt", l = {390}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class l extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f39542u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f39543v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ o f39544w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ boolean f39545x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ ls.d<Boolean> f39546y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l(o oVar, boolean z10, ls.d<? super Boolean> dVar, ls.d<? super l> dVar2) {
        super(2, dVar2);
        this.f39544w = oVar;
        this.f39545x = z10;
        this.f39546y = dVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        l lVar = new l(this.f39544w, this.f39545x, this.f39546y, dVar);
        lVar.f39543v = obj;
        return lVar;
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((l) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0079 A[RETURN] */
    @Override // ns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        TherapistPackagesModel peekContent;
        Integer num;
        hs.f<TherapistPackagesModel, TherapistPackagesModel> peekContent2;
        TherapistPackagesModel therapistPackagesModel;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f39542u;
        o oVar = this.f39544w;
        hs.k kVar = null;
        if (i6 != 0) {
            if (i6 == 1) {
                d0 d0Var = (d0) this.f39543v;
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            d0 d0Var2 = (d0) this.f39543v;
            rp.a aVar2 = oVar.f39565x;
            boolean z10 = this.f39545x;
            if (z10) {
                SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>> d10 = oVar.f39567z.d();
                if (d10 != null && (peekContent2 = d10.peekContent()) != null && (therapistPackagesModel = peekContent2.f19464u) != null) {
                    num = new Integer(therapistPackagesModel.getId());
                    kotlin.jvm.internal.i.d(num);
                    int intValue = num.intValue();
                    this.f39543v = d0Var2;
                    this.f39542u = 1;
                    obj = aVar2.g(z10, intValue, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                num = null;
                kotlin.jvm.internal.i.d(num);
                int intValue2 = num.intValue();
                this.f39543v = d0Var2;
                this.f39542u = 1;
                obj = aVar2.g(z10, intValue2, this);
                if (obj == aVar) {
                }
            } else {
                SingleUseEvent<TherapistPackagesModel> d11 = oVar.A.d();
                if (d11 != null && (peekContent = d11.peekContent()) != null) {
                    num = new Integer(peekContent.getId());
                    kotlin.jvm.internal.i.d(num);
                    int intValue22 = num.intValue();
                    this.f39543v = d0Var2;
                    this.f39542u = 1;
                    obj = aVar2.g(z10, intValue22, this);
                    if (obj == aVar) {
                    }
                }
                num = null;
                kotlin.jvm.internal.i.d(num);
                int intValue222 = num.intValue();
                this.f39543v = d0Var2;
                this.f39542u = 1;
                obj = aVar2.g(z10, intValue222, this);
                if (obj == aVar) {
                }
            }
        }
        ls.d<Boolean> dVar = this.f39546y;
        SuggestedSessionsResponseModel suggestedSessionsResponseModel = (SuggestedSessionsResponseModel) obj;
        if (suggestedSessionsResponseModel != null) {
            try {
                ArrayList<SuggestedBooking> suggestedBooking = suggestedSessionsResponseModel.getSuggestedBooking();
                if (suggestedBooking != null) {
                    oVar.E = suggestedBooking;
                    kVar = hs.k.f19476a;
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(oVar.f39566y, e10);
            }
        }
        if (kVar == null) {
            oVar.E.clear();
        }
        dVar.resumeWith(Boolean.TRUE);
        return hs.k.f19476a;
    }
}
