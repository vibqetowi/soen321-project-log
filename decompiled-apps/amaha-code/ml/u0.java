package ml;

import com.theinnerhour.b2b.network.model.NpsSubmissionModel;
/* compiled from: V3DashboardViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.V3DashboardViewModel$updateAppNpsScoreForDay$1", f = "V3DashboardViewModel.kt", l = {791}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class u0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f25593u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ c0 f25594v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int f25595w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ int f25596x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ String f25597y;

    /* compiled from: V3DashboardViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.V3DashboardViewModel$updateAppNpsScoreForDay$1$1", f = "V3DashboardViewModel.kt", l = {792}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f25598u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ c0 f25599v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f25600w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f25601x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f25602y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c0 c0Var, int i6, int i10, String str, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f25599v = c0Var;
            this.f25600w = i6;
            this.f25601x = i10;
            this.f25602y = str;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f25599v, this.f25600w, this.f25601x, this.f25602y, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f25598u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                u uVar = this.f25599v.f25368y;
                int i10 = this.f25600w;
                int i11 = this.f25601x;
                String str = this.f25602y;
                this.f25598u = 1;
                uVar.getClass();
                ls.h hVar = new ls.h(ca.a.G0(this));
                ((or.g) nr.b.a(or.g.class)).a("https://api.theinnerhour.com/v1/save_nps", new NpsSubmissionModel(i10, i11, str, null, "app")).I(new x(hVar));
                if (hVar.b() == aVar) {
                    return aVar;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(c0 c0Var, int i6, int i10, String str, ls.d<? super u0> dVar) {
        super(2, dVar);
        this.f25594v = c0Var;
        this.f25595w = i6;
        this.f25596x = i10;
        this.f25597y = str;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new u0(this.f25594v, this.f25595w, this.f25596x, this.f25597y, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((u0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f25593u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.scheduling.b bVar = kotlinx.coroutines.o0.f23642c;
            a aVar2 = new a(this.f25594v, this.f25595w, this.f25596x, this.f25597y, null);
            this.f25593u = 1;
            if (ta.v.S(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
