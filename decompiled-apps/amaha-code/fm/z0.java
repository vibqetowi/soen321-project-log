package fm;

import com.google.firebase.auth.FirebaseAuth;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.model.GoalDateObj;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* compiled from: GoalMigrationViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.GoalMigrationViewModel$addItemsToTrackListFirestore$2$1", f = "GoalMigrationViewModel.kt", l = {614}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class z0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f15617u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ a1 f15618v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ FirestoreGoal f15619w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ ls.d<HashMap<Long, GoalDateObj>> f15620x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ HashMap<Long, GoalDateObj> f15621y;

    /* compiled from: GoalMigrationViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.GoalMigrationViewModel$addItemsToTrackListFirestore$2$1$1", f = "GoalMigrationViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<List<? extends GoalDateObj>, ls.d<? super Boolean>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public /* synthetic */ Object f15622u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ HashMap<Long, GoalDateObj> f15623v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ls.d<HashMap<Long, GoalDateObj>> f15624w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(HashMap<Long, GoalDateObj> hashMap, ls.d<? super HashMap<Long, GoalDateObj>> dVar, ls.d<? super a> dVar2) {
            super(2, dVar2);
            this.f15623v = hashMap;
            this.f15624w = dVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            a aVar = new a(this.f15623v, this.f15624w, dVar);
            aVar.f15622u = obj;
            return aVar;
        }

        @Override // ss.p
        public final Object invoke(List<? extends GoalDateObj> list, ls.d<? super Boolean> dVar) {
            return ((a) create(list, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            sp.b.d0(obj);
            Iterator it = ((List) this.f15622u).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                HashMap<Long, GoalDateObj> hashMap = this.f15623v;
                if (hasNext) {
                    GoalDateObj goalDateObj = (GoalDateObj) it.next();
                    if (!hashMap.containsKey(new Long(goalDateObj.getDate().getTime()))) {
                        hashMap.put(new Long(goalDateObj.getDate().getTime()), goalDateObj);
                    } else {
                        GoalDateObj goalDateObj2 = hashMap.get(new Long(goalDateObj.getDate().getTime()));
                        boolean z10 = false;
                        if (goalDateObj2 != null && goalDateObj2.getVal() == 2) {
                            z10 = true;
                        }
                        if (!z10 && goalDateObj.getVal() == 2) {
                            hashMap.put(new Long(goalDateObj.getDate().getTime()), goalDateObj);
                        }
                    }
                } else {
                    this.f15624w.resumeWith(hashMap);
                    return Boolean.TRUE;
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z0(a1 a1Var, FirestoreGoal firestoreGoal, ls.d<? super HashMap<Long, GoalDateObj>> dVar, HashMap<Long, GoalDateObj> hashMap, ls.d<? super z0> dVar2) {
        super(2, dVar2);
        this.f15618v = a1Var;
        this.f15619w = firestoreGoal;
        this.f15620x = dVar;
        this.f15621y = hashMap;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new z0(this.f15618v, this.f15619w, this.f15620x, this.f15621y, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((z0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f15617u;
        HashMap<Long, GoalDateObj> hashMap = this.f15621y;
        ls.d<HashMap<Long, GoalDateObj>> dVar = this.f15620x;
        a1 a1Var = this.f15618v;
        try {
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                j0 e10 = a1.e(a1Var);
                kotlinx.coroutines.flow.x f = tr.r.f(new Integer(0));
                String goalId = this.f15619w.getGoalId();
                kotlin.jvm.internal.i.d(goalId);
                fd.f fVar = FirebaseAuth.getInstance().f;
                kotlinx.coroutines.flow.r m10 = e10.m(f, goalId, (fVar == null || (r13 = fVar.j0()) == null) ? "" : "", null, null);
                a aVar2 = new a(hashMap, dVar, null);
                this.f15617u = 1;
                if (ta.v.t(m10, aVar2, this) == aVar) {
                    return aVar;
                }
            }
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(a1Var.f15260z, e11);
            dVar.resumeWith(hashMap);
        }
        return hs.k.f19476a;
    }
}
