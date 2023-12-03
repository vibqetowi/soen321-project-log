package fm;

import com.appsflyer.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* compiled from: GoalMigrationViewModelRepository.kt */
@ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.GoalMigrationViewModelRepository$performGoalMigration$2$2", f = "GoalMigrationViewModelRepository.kt", l = {R.styleable.AppCompatTheme_dialogPreferredPadding}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class h1 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f15354u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f15355v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ List<fe.y> f15356w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ j1 f15357x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ ls.d<Boolean> f15358y;

    /* compiled from: GoalMigrationViewModelRepository.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.GoalMigrationViewModelRepository$performGoalMigration$2$2$1$1", f = "GoalMigrationViewModelRepository.kt", l = {R.styleable.AppCompatTheme_dialogCornerRadius}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super Boolean>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f15359u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ j1 f15360v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ fe.y f15361w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j1 j1Var, fe.y yVar, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f15360v = j1Var;
            this.f15361w = yVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f15360v, this.f15361w, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super Boolean> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f15359u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                this.f15359u = 1;
                obj = j1.a(this.f15360v, this.f15361w, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h1(List<? extends fe.y> list, j1 j1Var, ls.d<? super Boolean> dVar, ls.d<? super h1> dVar2) {
        super(2, dVar2);
        this.f15356w = list;
        this.f15357x = j1Var;
        this.f15358y = dVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        h1 h1Var = new h1(this.f15356w, this.f15357x, this.f15358y, dVar);
        h1Var.f15355v = obj;
        return h1Var;
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((h1) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f15354u;
        boolean z10 = true;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.d0 d0Var = (kotlinx.coroutines.d0) this.f15355v;
            List<fe.y> list = this.f15356w;
            ArrayList arrayList = new ArrayList(is.i.H1(list, 10));
            for (fe.y yVar : list) {
                arrayList.add(ta.v.g(d0Var, null, new a(this.f15357x, yVar, null), 3));
            }
            this.f15354u = 1;
            obj = ca.a.n(arrayList, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        List list2 = (List) obj;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!((Boolean) it.next()).booleanValue()) {
                        z10 = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        this.f15358y.resumeWith(Boolean.valueOf(z10));
        return hs.k.f19476a;
    }
}
