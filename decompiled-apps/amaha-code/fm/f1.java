package fm;

import com.theinnerhour.b2b.model.Goal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: GoalMigrationViewModelRepository.kt */
@ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.GoalMigrationViewModelRepository$performDataMigration$2$1$1$1", f = "GoalMigrationViewModelRepository.kt", l = {192}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class f1 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {
    public final /* synthetic */ kotlinx.coroutines.j<Boolean> A;

    /* renamed from: u  reason: collision with root package name */
    public int f15324u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f15325v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ List<fe.y> f15326w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ j1 f15327x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.v f15328y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ArrayList<Goal> f15329z;

    /* compiled from: GoalMigrationViewModelRepository.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.GoalMigrationViewModelRepository$performDataMigration$2$1$1$1$1$1", f = "GoalMigrationViewModelRepository.kt", l = {191}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super Boolean>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f15330u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ j1 f15331v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ fe.y f15332w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j1 j1Var, fe.y yVar, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f15331v = j1Var;
            this.f15332w = yVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f15331v, this.f15332w, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super Boolean> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f15330u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                this.f15330u = 1;
                obj = j1.a(this.f15331v, this.f15332w, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f1(List<? extends fe.y> list, j1 j1Var, kotlin.jvm.internal.v vVar, ArrayList<Goal> arrayList, kotlinx.coroutines.j<? super Boolean> jVar, ls.d<? super f1> dVar) {
        super(2, dVar);
        this.f15326w = list;
        this.f15327x = j1Var;
        this.f15328y = vVar;
        this.f15329z = arrayList;
        this.A = jVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        f1 f1Var = new f1(this.f15326w, this.f15327x, this.f15328y, this.f15329z, this.A, dVar);
        f1Var.f15325v = obj;
        return f1Var;
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((f1) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f15324u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.d0 d0Var = (kotlinx.coroutines.d0) this.f15325v;
            List<fe.y> list = this.f15326w;
            ArrayList arrayList = new ArrayList(is.i.H1(list, 10));
            for (fe.y yVar : list) {
                arrayList.add(ta.v.g(d0Var, null, new a(this.f15327x, yVar, null), 3));
            }
            this.f15324u = 1;
            obj = ca.a.n(arrayList, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        List<Boolean> list2 = (List) obj;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (Boolean bool : list2) {
                if (!bool.booleanValue()) {
                    z10 = false;
                    break;
                }
            }
        }
        z10 = true;
        kotlinx.coroutines.j<Boolean> jVar = this.A;
        if (z10) {
            kotlin.jvm.internal.v vVar = this.f15328y;
            int i10 = vVar.f23467u + 1;
            vVar.f23467u = i10;
            if (i10 >= this.f15329z.size()) {
                jVar.resumeWith(Boolean.TRUE);
            }
        } else {
            jVar.resumeWith(Boolean.FALSE);
        }
        return hs.k.f19476a;
    }
}
