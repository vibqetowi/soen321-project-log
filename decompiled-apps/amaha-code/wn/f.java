package wn;

import com.google.firebase.firestore.FirebaseFirestore;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import kotlinx.coroutines.d0;
/* compiled from: MultiTrackerInsightsViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.multiTracker.utils.MultiTrackerInsightsViewModel$getTrackerStatsData$1", f = "MultiTrackerInsightsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class f extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ String f36787u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ i f36788v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, String str, ls.d dVar) {
        super(2, dVar);
        this.f36787u = str;
        this.f36788v = iVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new f(this.f36788v, this.f36787u, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((f) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        i iVar = this.f36788v;
        sp.b.d0(obj);
        try {
            FirebaseFirestore.d().b(Constants.USER_DATA_COLLECTION).q(this.f36787u).d().addOnCompleteListener(new c(iVar, 1));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(iVar.f36794x, e10);
        }
        return hs.k.f19476a;
    }
}
