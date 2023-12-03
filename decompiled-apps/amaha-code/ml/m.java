package ml;

import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import com.theinnerhour.b2b.network.model.SuggestedBooking;
import com.theinnerhour.b2b.network.model.SuggestedSessionsResponseModel;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: DashboardTelecommunicationsViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.DashboardTelecommunicationsViewModel$fetchSuggestedSessions$2$1", f = "DashboardTelecommunicationsViewModel.kt", l = {328}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class m extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f25529u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f25530v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ p f25531w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ boolean f25532x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ ls.d<Boolean> f25533y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m(p pVar, boolean z10, ls.d<? super Boolean> dVar, ls.d<? super m> dVar2) {
        super(2, dVar2);
        this.f25531w = pVar;
        this.f25532x = z10;
        this.f25533y = dVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        m mVar = new m(this.f25531w, this.f25532x, this.f25533y, dVar);
        mVar.f25530v = obj;
        return mVar;
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((m) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        Integer num;
        TherapistPackagesModel therapistPackagesModel;
        ArrayList<SuggestedBooking> suggestedBooking;
        Integer num2;
        boolean z10;
        boolean z11;
        boolean z12;
        TherapistPackagesModel therapistPackagesModel2;
        TherapistPackagesModel therapistPackagesModel3;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f25529u;
        p pVar = this.f25531w;
        Object obj2 = null;
        boolean z13 = true;
        try {
            if (i6 != 0) {
                if (i6 == 1) {
                    kotlinx.coroutines.d0 d0Var = (kotlinx.coroutines.d0) this.f25530v;
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                kotlinx.coroutines.d0 d0Var2 = (kotlinx.coroutines.d0) this.f25530v;
                rp.a aVar2 = pVar.f25558y;
                boolean z14 = this.f25532x;
                if (z14) {
                    hs.f<TherapistPackagesModel, TherapistPackagesModel> d10 = pVar.A.d();
                    if (d10 != null && (therapistPackagesModel = d10.f19464u) != null) {
                        num = new Integer(therapistPackagesModel.getId());
                    } else {
                        num = null;
                    }
                } else {
                    TherapistPackagesModel d11 = pVar.B.d();
                    if (d11 != null) {
                        num = new Integer(d11.getId());
                    } else {
                        num = null;
                    }
                }
                kotlin.jvm.internal.i.d(num);
                int intValue = num.intValue();
                this.f25530v = d0Var2;
                this.f25529u = 1;
                obj = aVar2.g(z14, intValue, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            ls.d<Boolean> dVar = this.f25533y;
            SuggestedSessionsResponseModel suggestedSessionsResponseModel = (SuggestedSessionsResponseModel) obj;
            if (suggestedSessionsResponseModel != null && (suggestedBooking = suggestedSessionsResponseModel.getSuggestedBooking()) != null) {
                pVar.getClass();
                pVar.H = suggestedBooking;
                if (suggestedBooking.isEmpty()) {
                    ApplicationPersistence.getInstance().deleteKey("db_integrated_next_therapy");
                    ApplicationPersistence.getInstance().deleteKey("db_integrated_next_psychiatry");
                } else {
                    androidx.lifecycle.w<hs.f<TherapistPackagesModel, TherapistPackagesModel>> wVar = pVar.A;
                    hs.f<TherapistPackagesModel, TherapistPackagesModel> d12 = wVar.d();
                    if (d12 != null && (therapistPackagesModel3 = d12.f19464u) != null) {
                        num2 = new Integer(therapistPackagesModel3.getId());
                    } else {
                        num2 = null;
                    }
                    if (num2 != null) {
                        if (!suggestedBooking.isEmpty()) {
                            for (SuggestedBooking suggestedBooking2 : suggestedBooking) {
                                hs.f<TherapistPackagesModel, TherapistPackagesModel> d13 = wVar.d();
                                if (d13 != null && (therapistPackagesModel2 = d13.f19464u) != null && suggestedBooking2.getProviderId() == therapistPackagesModel2.getId()) {
                                    z11 = true;
                                    continue;
                                } else {
                                    z11 = false;
                                    continue;
                                }
                                if (z11) {
                                    z12 = false;
                                    break;
                                }
                            }
                        }
                        z12 = true;
                        if (z12) {
                            ApplicationPersistence.getInstance().deleteKey("db_integrated_next_therapy");
                        }
                    }
                    androidx.lifecycle.w<TherapistPackagesModel> wVar2 = pVar.B;
                    TherapistPackagesModel d14 = wVar2.d();
                    if (d14 != null) {
                        obj2 = new Integer(d14.getId());
                    }
                    if (obj2 != null) {
                        if (!suggestedBooking.isEmpty()) {
                            Iterator<T> it = suggestedBooking.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                SuggestedBooking suggestedBooking3 = (SuggestedBooking) it.next();
                                TherapistPackagesModel d15 = wVar2.d();
                                if (d15 != null && suggestedBooking3.getProviderId() == d15.getId()) {
                                    z10 = true;
                                    continue;
                                } else {
                                    z10 = false;
                                    continue;
                                }
                                if (z10) {
                                    z13 = false;
                                    break;
                                }
                            }
                        }
                        if (z13) {
                            ApplicationPersistence.getInstance().deleteKey("db_integrated_next_psychiatry");
                        }
                    }
                }
                obj2 = hs.k.f19476a;
            }
            if (obj2 == null) {
                pVar.H.clear();
            }
            dVar.resumeWith(Boolean.TRUE);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(pVar.f25559z, e10);
        }
        return hs.k.f19476a;
    }
}
