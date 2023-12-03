package ml;

import com.theinnerhour.b2b.components.journal.model.JournalModel;
/* compiled from: V3DashboardViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.V3DashboardViewModel$fetchLatestJournalEntry$1", f = "V3DashboardViewModel.kt", l = {918}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class g0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f25459u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ pm.a f25460v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f25461w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ c0 f25462x;

    /* compiled from: V3DashboardViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.V3DashboardViewModel$fetchLatestJournalEntry$1$1", f = "V3DashboardViewModel.kt", l = {919}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f25463u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ pm.a f25464v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f25465w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ c0 f25466x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(pm.a aVar, String str, c0 c0Var, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f25464v = aVar;
            this.f25465w = str;
            this.f25466x = c0Var;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f25464v, this.f25465w, this.f25466x, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f25463u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                this.f25463u = 1;
                obj = this.f25464v.b(this.f25465w, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            JournalModel journalModel = (JournalModel) obj;
            if (journalModel != null) {
                ((androidx.lifecycle.w) this.f25466x.M.getValue()).i(journalModel);
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(pm.a aVar, String str, c0 c0Var, ls.d<? super g0> dVar) {
        super(2, dVar);
        this.f25460v = aVar;
        this.f25461w = str;
        this.f25462x = c0Var;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new g0(this.f25460v, this.f25461w, this.f25462x, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((g0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f25459u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.scheduling.b bVar = kotlinx.coroutines.o0.f23642c;
            a aVar2 = new a(this.f25460v, this.f25461w, this.f25462x, null);
            this.f25459u = 1;
            if (ta.v.S(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
