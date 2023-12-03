package ap;

import com.appsflyer.R;
import com.google.firebase.auth.FirebaseAuth;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import fm.j0;
import hs.k;
import kotlinx.coroutines.d0;
import ns.i;
import ss.p;
/* compiled from: RecommendedActivitiesPlaybackViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.recommendedActivities.viewmodel.RecommendedActivitiesPlaybackViewModel$fetchGoal$1", f = "RecommendedActivitiesPlaybackViewModel.kt", l = {R.styleable.AppCompatTheme_buttonBarStyle}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class b extends i implements p<d0, ls.d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f3374u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ a f3375v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f3376w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ boolean f3377x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, String str, boolean z10, ls.d<? super b> dVar) {
        super(2, dVar);
        this.f3375v = aVar;
        this.f3376w = str;
        this.f3377x = z10;
    }

    @Override // ns.a
    public final ls.d<k> create(Object obj, ls.d<?> dVar) {
        return new b(this.f3375v, this.f3376w, this.f3377x, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
        return ((b) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f3374u;
        a aVar2 = this.f3375v;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            j0 j0Var = aVar2.A;
            String a10 = FirebaseAuth.getInstance().a();
            if (a10 == null) {
                return k.f19476a;
            }
            this.f3374u = 1;
            obj = j0Var.k(this.f3376w, a10, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        FirestoreGoal firestoreGoal = (FirestoreGoal) obj;
        if (this.f3377x) {
            aVar2.B.i(new SingleUseEvent<>(Boolean.TRUE));
        }
        aVar2.C = firestoreGoal;
        return k.f19476a;
    }
}
