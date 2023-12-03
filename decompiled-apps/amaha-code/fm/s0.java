package fm;

import com.appsflyer.R;
import com.google.firebase.firestore.FirebaseFirestore;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.utils.Constants;
import java.util.ArrayList;
import java.util.List;
/* compiled from: FirestoreGoalsViewModelRepository.kt */
@ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.FirestoreGoalsViewModelRepository$fetchVisibleGoals$1", f = "FirestoreGoalsViewModelRepository.kt", l = {R.styleable.AppCompatTheme_dividerHorizontal}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class s0 extends ns.i implements ss.p<kotlinx.coroutines.flow.e<? super List<? extends FirestoreGoal>>, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f15546u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f15547v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ j0 f15548w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f15549x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ long f15550y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.d<Integer> f15551z;

    /* compiled from: FirestoreGoalsViewModelRepository.kt */
    /* loaded from: classes2.dex */
    public static final class a<T> implements kotlinx.coroutines.flow.e {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.e<List<FirestoreGoal>> f15552u;

        /* JADX WARN: Multi-variable type inference failed */
        public a(kotlinx.coroutines.flow.e<? super List<FirestoreGoal>> eVar) {
            this.f15552u = eVar;
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
            Object b10 = this.f15552u.b(arrayList, dVar);
            if (b10 != ms.a.COROUTINE_SUSPENDED) {
                return hs.k.f19476a;
            }
            return b10;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(j0 j0Var, String str, long j10, kotlinx.coroutines.flow.d<Integer> dVar, ls.d<? super s0> dVar2) {
        super(2, dVar2);
        this.f15548w = j0Var;
        this.f15549x = str;
        this.f15550y = j10;
        this.f15551z = dVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        s0 s0Var = new s0(this.f15548w, this.f15549x, this.f15550y, this.f15551z, dVar);
        s0Var.f15547v = obj;
        return s0Var;
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.flow.e<? super List<? extends FirestoreGoal>> eVar, ls.d<? super hs.k> dVar) {
        return ((s0) create(eVar, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f15546u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.flow.r a10 = j0.a(this.f15548w, FirebaseFirestore.d().b(Constants.USER_DATA_COLLECTION).q(this.f15549x).b(Constants.USER_GOALS_DATA).m(Boolean.TRUE, "visible").d("startDate.time").p(new Long(this.f15550y), "startDate.time").d("lastAdded.time"), this.f15551z);
            a aVar2 = new a((kotlinx.coroutines.flow.e) this.f15547v);
            this.f15546u = 1;
            if (a10.a(aVar2, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
