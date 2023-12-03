package ml;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.LogHelper;
import org.json.JSONObject;
/* compiled from: DashboardTelecommunicationsViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.DashboardTelecommunicationsViewModel$fetchProvidersInfoOnly$1", f = "DashboardTelecommunicationsViewModel.kt", l = {R.styleable.AppCompatTheme_textAppearanceListItemSecondary}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class l extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f25504u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ p f25505v;

    /* compiled from: DashboardTelecommunicationsViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.DashboardTelecommunicationsViewModel$fetchProvidersInfoOnly$1$1", f = "DashboardTelecommunicationsViewModel.kt", l = {R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, R.styleable.AppCompatTheme_textAppearanceSearchResultTitle}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public rp.a f25506u;

        /* renamed from: v  reason: collision with root package name */
        public p f25507v;

        /* renamed from: w  reason: collision with root package name */
        public rp.a f25508w;

        /* renamed from: x  reason: collision with root package name */
        public p f25509x;

        /* renamed from: y  reason: collision with root package name */
        public int f25510y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ p f25511z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p pVar, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f25511z = pVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f25511z, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            rp.a aVar;
            rp.a aVar2;
            p pVar;
            p pVar2;
            p pVar3;
            ms.a aVar3 = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f25510y;
            p pVar4 = this.f25511z;
            try {
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(pVar4.f25559z, e10);
            }
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 == 2) {
                        pVar3 = this.f25507v;
                        sp.b.d0(obj);
                        p.k(pVar3, (JSONObject) obj);
                        return hs.k.f19476a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pVar = this.f25509x;
                aVar = this.f25508w;
                pVar2 = this.f25507v;
                aVar2 = this.f25506u;
                sp.b.d0(obj);
            } else {
                sp.b.d0(obj);
                rp.a aVar4 = pVar4.f25558y;
                this.f25506u = aVar4;
                this.f25507v = pVar4;
                this.f25508w = aVar4;
                this.f25509x = pVar4;
                this.f25510y = 1;
                Object h10 = aVar4.h(this);
                if (h10 == aVar3) {
                    return aVar3;
                }
                aVar = aVar4;
                aVar2 = aVar;
                obj = h10;
                pVar = pVar4;
                pVar2 = pVar;
            }
            p.l(pVar, (JSONObject) obj);
            this.f25506u = aVar2;
            this.f25507v = pVar2;
            this.f25508w = null;
            this.f25509x = null;
            this.f25510y = 2;
            obj = aVar.f(this);
            if (obj == aVar3) {
                return aVar3;
            }
            pVar3 = pVar2;
            p.k(pVar3, (JSONObject) obj);
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p pVar, ls.d<? super l> dVar) {
        super(2, dVar);
        this.f25505v = pVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new l(this.f25505v, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((l) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f25504u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.scheduling.b bVar = kotlinx.coroutines.o0.f23642c;
            a aVar2 = new a(this.f25505v, null);
            this.f25504u = 1;
            if (ta.v.S(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
