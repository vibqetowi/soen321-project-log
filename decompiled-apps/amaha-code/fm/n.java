package fm;

import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityModel;
import java.util.ArrayList;
import java.util.Comparator;
/* compiled from: FirestoreGoalsViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.FirestoreGoalsViewModel$fetchActivities$1", f = "FirestoreGoalsViewModel.kt", l = {134}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class n extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f15454u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ fm.a f15455v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f15456w;

    /* compiled from: FirestoreGoalsViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.FirestoreGoalsViewModel$fetchActivities$1$1", f = "FirestoreGoalsViewModel.kt", l = {135}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f15457u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f15458v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ fm.a f15459w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f15460x;

        /* compiled from: Comparisons.kt */
        /* renamed from: fm.n$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0238a<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t3, T t10) {
                return sp.b.g(((RecommendedActivityModel) t3).getCourseRank(), ((RecommendedActivityModel) t10).getCourseRank());
            }
        }

        /* compiled from: Comparisons.kt */
        /* loaded from: classes2.dex */
        public static final class b<T> implements Comparator {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ fm.a f15461u;

            public b(fm.a aVar) {
                this.f15461u = aVar;
            }

            @Override // java.util.Comparator
            public final int compare(T t3, T t10) {
                fm.a aVar = this.f15461u;
                return sp.b.g(Integer.valueOf(is.k.W1(((RecommendedActivityModel) t3).getDomain(), aVar.f15169a0)), Integer.valueOf(is.k.W1(((RecommendedActivityModel) t10).getDomain(), aVar.f15169a0)));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fm.a aVar, String str, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f15459w = aVar;
            this.f15460x = str;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            a aVar = new a(this.f15459w, this.f15460x, dVar);
            aVar.f15458v = obj;
            return aVar;
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f15457u;
            hs.k kVar = null;
            fm.a aVar2 = this.f15459w;
            if (i6 != 0) {
                if (i6 == 1) {
                    kotlinx.coroutines.d0 d0Var = (kotlinx.coroutines.d0) this.f15458v;
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                this.f15458v = (kotlinx.coroutines.d0) this.f15458v;
                this.f15457u = 1;
                obj = ((dm.f) aVar2.f15171d0.getValue()).b(null, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            hs.f fVar = (hs.f) obj;
            if (fVar != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (Iterable) fVar.f19464u) {
                    if (kotlin.jvm.internal.i.b(((RecommendedActivityModel) obj2).getDomain(), this.f15460x)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList<RecommendedActivityModel> arrayList2 = new ArrayList<>(arrayList);
                if (arrayList2.size() > 1) {
                    is.p.P1(arrayList2, new C0238a());
                }
                if (arrayList2.size() > 1) {
                    is.p.P1(arrayList2, new b(aVar2));
                }
                aVar2.X.i(arrayList2);
                kVar = hs.k.f19476a;
            }
            if (kVar == null) {
                aVar2.X.i(new ArrayList<>());
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(fm.a aVar, String str, ls.d<? super n> dVar) {
        super(2, dVar);
        this.f15455v = aVar;
        this.f15456w = str;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new n(this.f15455v, this.f15456w, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((n) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f15454u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            fm.a aVar2 = this.f15455v;
            kotlinx.coroutines.a0 a0Var = aVar2.A;
            a aVar3 = new a(aVar2, this.f15456w, null);
            this.f15454u = 1;
            if (ta.v.S(a0Var, aVar3, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
