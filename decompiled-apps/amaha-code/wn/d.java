package wn;

import com.google.firebase.firestore.FirebaseFirestore;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import kotlinx.coroutines.d0;
/* compiled from: MultiTrackerInsightsViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.multiTracker.utils.MultiTrackerInsightsViewModel$fetchDataForWeek$1", f = "MultiTrackerInsightsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class d extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ String f36772u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Integer f36773v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Integer f36774w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ i f36775x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, Integer num, Integer num2, i iVar, ls.d<? super d> dVar) {
        super(2, dVar);
        this.f36772u = str;
        this.f36773v = num;
        this.f36774w = num2;
        this.f36775x = iVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new d(this.f36772u, this.f36773v, this.f36774w, this.f36775x, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((d) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        i iVar = this.f36775x;
        sp.b.d0(obj);
        try {
            FirebaseFirestore.d().b(Constants.USER_DATA_COLLECTION).q(this.f36772u).b(Constants.USER_MULTITRACKER_TRACKED_DATA).d("date.time").n(this.f36773v, "date.time").p(this.f36774w, "date.time").a().addOnCompleteListener(new c(iVar, 0));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(iVar.f36794x, e10);
        }
        return hs.k.f19476a;
    }
}
