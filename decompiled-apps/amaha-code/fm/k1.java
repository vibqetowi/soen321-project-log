package fm;

import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityModel;
import com.theinnerhour.b2b.utils.SingleUseEvent;
/* compiled from: GoalParentViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.GoalParentViewModel$fetchIndividualActivity$1", f = "GoalParentViewModel.kt", l = {21}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class k1 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f15427u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ m1 f15428v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f15429w;

    /* compiled from: GoalParentViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.GoalParentViewModel$fetchIndividualActivity$1$1", f = "GoalParentViewModel.kt", l = {22}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f15430u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f15431v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ m1 f15432w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f15433x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m1 m1Var, String str, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f15432w = m1Var;
            this.f15433x = str;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            a aVar = new a(this.f15432w, this.f15433x, dVar);
            aVar.f15431v = obj;
            return aVar;
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            hs.k kVar;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f15430u;
            m1 m1Var = this.f15432w;
            if (i6 != 0) {
                if (i6 == 1) {
                    kotlinx.coroutines.d0 d0Var = (kotlinx.coroutines.d0) this.f15431v;
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                dm.f fVar = m1Var.f15451x;
                this.f15431v = (kotlinx.coroutines.d0) this.f15431v;
                this.f15430u = 1;
                obj = fVar.a(this.f15433x, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            RecommendedActivityModel recommendedActivityModel = (RecommendedActivityModel) obj;
            if (recommendedActivityModel != null) {
                m1Var.f15452y.add(recommendedActivityModel);
                m1Var.f15453z.i(new SingleUseEvent<>(recommendedActivityModel));
                kVar = hs.k.f19476a;
            } else {
                kVar = null;
            }
            if (kVar == null) {
                m1Var.f15453z.i(new SingleUseEvent<>(null));
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(m1 m1Var, String str, ls.d<? super k1> dVar) {
        super(2, dVar);
        this.f15428v = m1Var;
        this.f15429w = str;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new k1(this.f15428v, this.f15429w, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((k1) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f15427u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.scheduling.b bVar = kotlinx.coroutines.o0.f23642c;
            a aVar2 = new a(this.f15428v, this.f15429w, null);
            this.f15427u = 1;
            if (ta.v.S(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
