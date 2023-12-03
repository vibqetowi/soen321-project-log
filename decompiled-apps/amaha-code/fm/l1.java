package fm;

import com.appsflyer.R;
/* compiled from: GoalParentViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.GoalParentViewModel$submitNpsForGoalsTracked$1", f = "GoalParentViewModel.kt", l = {R.styleable.AppCompatTheme_alertDialogButtonGroupStyle}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class l1 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f15438u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ m1 f15439v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int f15440w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ int f15441x;

    /* compiled from: GoalParentViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.GoalParentViewModel$submitNpsForGoalsTracked$1$1", f = "GoalParentViewModel.kt", l = {36}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f15442u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ m1 f15443v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f15444w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f15445x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m1 m1Var, int i6, int i10, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f15443v = m1Var;
            this.f15444w = i6;
            this.f15445x = i10;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f15443v, this.f15444w, this.f15445x, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f15442u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                dm.f fVar = this.f15443v.f15451x;
                this.f15442u = 1;
                fVar.getClass();
                if (dm.f.e(this.f15444w, this.f15445x, this) == aVar) {
                    return aVar;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(m1 m1Var, int i6, int i10, ls.d<? super l1> dVar) {
        super(2, dVar);
        this.f15439v = m1Var;
        this.f15440w = i6;
        this.f15441x = i10;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new l1(this.f15439v, this.f15440w, this.f15441x, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((l1) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f15438u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.scheduling.b bVar = kotlinx.coroutines.o0.f23642c;
            a aVar2 = new a(this.f15439v, this.f15440w, this.f15441x, null);
            this.f15438u = 1;
            if (ta.v.S(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
