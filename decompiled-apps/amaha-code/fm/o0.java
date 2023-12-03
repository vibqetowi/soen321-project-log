package fm;

import com.appsflyer.R;
import com.google.firebase.firestore.FirebaseFirestore;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.utils.Constants;
import java.util.ArrayList;
import java.util.List;
/* compiled from: FirestoreGoalsViewModelRepository.kt */
@ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.FirestoreGoalsViewModelRepository$fetchAllGoals$1", f = "FirestoreGoalsViewModelRepository.kt", l = {R.styleable.AppCompatTheme_listPopupWindowStyle}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class o0 extends ns.i implements ss.p<kotlinx.coroutines.flow.e<? super List<? extends FirestoreGoal>>, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f15475u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f15476v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ j0 f15477w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f15478x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.d<Integer> f15479y;

    /* compiled from: FirestoreGoalsViewModelRepository.kt */
    /* loaded from: classes2.dex */
    public static final class a<T> implements kotlinx.coroutines.flow.e {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.e<List<FirestoreGoal>> f15480u;

        /* JADX WARN: Multi-variable type inference failed */
        public a(kotlinx.coroutines.flow.e<? super List<FirestoreGoal>> eVar) {
            this.f15480u = eVar;
        }

        @Override // kotlinx.coroutines.flow.e
        public final Object b(Object obj, ls.d dVar) {
            ArrayList arrayList = new ArrayList();
            for (fe.g gVar : (List) obj) {
                FirestoreGoal firestoreGoal = (FirestoreGoal) gVar.d(FirestoreGoal.class);
                if (firestoreGoal != null) {
                    arrayList.add(firestoreGoal);
                }
            }
            Object b10 = this.f15480u.b(arrayList, dVar);
            if (b10 != ms.a.COROUTINE_SUSPENDED) {
                return hs.k.f19476a;
            }
            return b10;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(j0 j0Var, String str, kotlinx.coroutines.flow.d<Integer> dVar, ls.d<? super o0> dVar2) {
        super(2, dVar2);
        this.f15477w = j0Var;
        this.f15478x = str;
        this.f15479y = dVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        o0 o0Var = new o0(this.f15477w, this.f15478x, this.f15479y, dVar);
        o0Var.f15476v = obj;
        return o0Var;
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.flow.e<? super List<? extends FirestoreGoal>> eVar, ls.d<? super hs.k> dVar) {
        return ((o0) create(eVar, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f15475u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.flow.r a10 = j0.a(this.f15477w, FirebaseFirestore.d().b(Constants.USER_DATA_COLLECTION).q(this.f15478x).b(Constants.USER_GOALS_DATA).d("lastAdded.time"), this.f15479y);
            a aVar2 = new a((kotlinx.coroutines.flow.e) this.f15476v);
            this.f15475u = 1;
            if (a10.a(aVar2, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
