package fm;
/* compiled from: FirestoreGoalsViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.FirestoreGoalsViewModel$submitNpsForGoalsTracked$1", f = "FirestoreGoalsViewModel.kt", l = {156}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class h0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f15346u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ fm.a f15347v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int f15348w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ int f15349x;

    /* compiled from: FirestoreGoalsViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.FirestoreGoalsViewModel$submitNpsForGoalsTracked$1$1", f = "FirestoreGoalsViewModel.kt", l = {157}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f15350u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ fm.a f15351v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f15352w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f15353x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fm.a aVar, int i6, int i10, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f15351v = aVar;
            this.f15352w = i6;
            this.f15353x = i10;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f15351v, this.f15352w, this.f15353x, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f15350u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                this.f15350u = 1;
                ((dm.f) this.f15351v.f15171d0.getValue()).getClass();
                if (dm.f.e(this.f15352w, this.f15353x, this) == aVar) {
                    return aVar;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(fm.a aVar, int i6, int i10, ls.d<? super h0> dVar) {
        super(2, dVar);
        this.f15347v = aVar;
        this.f15348w = i6;
        this.f15349x = i10;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new h0(this.f15347v, this.f15348w, this.f15349x, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((h0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f15346u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            fm.a aVar2 = this.f15347v;
            kotlinx.coroutines.a0 a0Var = aVar2.A;
            a aVar3 = new a(aVar2, this.f15348w, this.f15349x, null);
            this.f15346u = 1;
            if (ta.v.S(a0Var, aVar3, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
