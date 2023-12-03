package fm;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.theinnerhour.b2b.utils.Constants;
import java.util.List;
/* compiled from: FirestoreGoalsViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.FirestoreGoalsViewModel$fetchMultipleGoals$1", f = "FirestoreGoalsViewModel.kt", l = {958}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class p extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public a f15484u;

    /* renamed from: v  reason: collision with root package name */
    public int f15485v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ a f15486w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ List<String> f15487x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(a aVar, List<String> list, ls.d<? super p> dVar) {
        super(2, dVar);
        this.f15486w = aVar;
        this.f15487x = list;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new p(this.f15486w, this.f15487x, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((p) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        String j02;
        a aVar;
        ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f15485v;
        if (i6 != 0) {
            if (i6 == 1) {
                aVar = this.f15484u;
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            fd.f fVar = FirebaseAuth.getInstance().f;
            if (fVar != null && (j02 = fVar.j0()) != null) {
                a aVar3 = this.f15486w;
                j0 j0Var = aVar3.f15183y;
                this.f15484u = aVar3;
                this.f15485v = 1;
                j0Var.getClass();
                ls.h hVar = new ls.h(ca.a.G0(this));
                FirebaseFirestore.d().b(Constants.USER_DATA_COLLECTION).q(j02).b(Constants.USER_GOALS_DATA).o("goalId", this.f15487x).m(Boolean.TRUE, "visible").a().addOnCompleteListener(new q0(j0Var, hVar));
                obj = hVar.b();
                if (obj == aVar2) {
                    return aVar2;
                }
                aVar = aVar3;
            }
            return hs.k.f19476a;
        }
        aVar.f15179m0.i((List) obj);
        return hs.k.f19476a;
    }
}
