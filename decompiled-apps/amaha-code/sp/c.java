package sp;

import com.theinnerhour.b2b.network.model.NpsSubmissionModel;
import hs.k;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
import ls.h;
import ns.e;
import ns.i;
import or.g;
import ss.p;
import ta.v;
/* compiled from: TemplateActivityViewModel.kt */
@e(c = "com.theinnerhour.b2b.components.templateActivity.viewModel.TemplateActivityViewModel$submitNpsForDailyPlan$1", f = "TemplateActivityViewModel.kt", l = {14}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c extends i implements p<d0, ls.d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f31859u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ d f31860v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int f31861w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f31862x;

    /* compiled from: TemplateActivityViewModel.kt */
    @e(c = "com.theinnerhour.b2b.components.templateActivity.viewModel.TemplateActivityViewModel$submitNpsForDailyPlan$1$1", f = "TemplateActivityViewModel.kt", l = {15}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements p<d0, ls.d<? super k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f31863u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ d f31864v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f31865w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f31866x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d dVar, int i6, String str, ls.d<? super a> dVar2) {
            super(2, dVar2);
            this.f31864v = dVar;
            this.f31865w = i6;
            this.f31866x = str;
        }

        @Override // ns.a
        public final ls.d<k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f31864v, this.f31865w, this.f31866x, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f31863u;
            if (i6 != 0) {
                if (i6 == 1) {
                    b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                b.d0(obj);
                b bVar = this.f31864v.f31867x;
                int i10 = this.f31865w;
                String str = this.f31866x;
                this.f31863u = 1;
                bVar.getClass();
                h hVar = new h(ca.a.G0(this));
                ((g) nr.b.a(g.class)).a("https://api.theinnerhour.com/v1/save_nps", new NpsSubmissionModel(i10, 3, null, str, "plan")).I(new sp.a(hVar));
                if (hVar.b() == aVar) {
                    return aVar;
                }
            }
            return k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, int i6, String str, ls.d<? super c> dVar2) {
        super(2, dVar2);
        this.f31860v = dVar;
        this.f31861w = i6;
        this.f31862x = str;
    }

    @Override // ns.a
    public final ls.d<k> create(Object obj, ls.d<?> dVar) {
        return new c(this.f31860v, this.f31861w, this.f31862x, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
        return ((c) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f31859u;
        if (i6 != 0) {
            if (i6 == 1) {
                b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            b.d0(obj);
            kotlinx.coroutines.scheduling.b bVar = o0.f23642c;
            a aVar2 = new a(this.f31860v, this.f31861w, this.f31862x, null);
            this.f31859u = 1;
            if (v.S(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return k.f19476a;
    }
}
