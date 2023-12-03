package jl;

import com.theinnerhour.b2b.network.model.NpsSubmissionModel;
/* compiled from: CustomDashboardViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.CustomDashboardViewModel$updateAppNpsScoreForDay$1", f = "CustomDashboardViewModel.kt", l = {472}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class p extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f22281u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ e f22282v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int f22283w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ int f22284x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ String f22285y;

    /* compiled from: CustomDashboardViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.CustomDashboardViewModel$updateAppNpsScoreForDay$1$1", f = "CustomDashboardViewModel.kt", l = {473}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f22286u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ e f22287v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f22288w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f22289x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f22290y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, int i6, int i10, String str, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f22287v = eVar;
            this.f22288w = i6;
            this.f22289x = i10;
            this.f22290y = str;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f22287v, this.f22288w, this.f22289x, this.f22290y, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f22286u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                u uVar = this.f22287v.f22146y;
                int i10 = this.f22288w;
                int i11 = this.f22289x;
                String str = this.f22290y;
                this.f22286u = 1;
                uVar.getClass();
                ls.h hVar = new ls.h(ca.a.G0(this));
                ((or.g) nr.b.a(or.g.class)).a("https://api.theinnerhour.com/v1/save_nps", new NpsSubmissionModel(i10, i11, str, null, "app")).I(new v(hVar));
                if (hVar.b() == aVar) {
                    return aVar;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(e eVar, int i6, int i10, String str, ls.d<? super p> dVar) {
        super(2, dVar);
        this.f22282v = eVar;
        this.f22283w = i6;
        this.f22284x = i10;
        this.f22285y = str;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new p(this.f22282v, this.f22283w, this.f22284x, this.f22285y, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((p) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f22281u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.scheduling.b bVar = kotlinx.coroutines.o0.f23642c;
            a aVar2 = new a(this.f22282v, this.f22283w, this.f22284x, this.f22285y, null);
            this.f22281u = 1;
            if (ta.v.S(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
