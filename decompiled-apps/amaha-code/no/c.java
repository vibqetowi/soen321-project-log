package no;

import com.appsflyer.R;
import hs.f;
import hs.k;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
import ns.e;
import ns.i;
import ss.p;
import ta.v;
/* compiled from: ProDashboardViewModel.kt */
@e(c = "com.theinnerhour.b2b.components.pro.dashboard.viewmodel.ProDashboardViewModel$checkPendingAssessments$1", f = "ProDashboardViewModel.kt", l = {R.styleable.AppCompatTheme_panelMenuListWidth}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c extends i implements p<d0, ls.d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f26697u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ no.a f26698v;

    /* compiled from: ProDashboardViewModel.kt */
    @e(c = "com.theinnerhour.b2b.components.pro.dashboard.viewmodel.ProDashboardViewModel$checkPendingAssessments$1$1", f = "ProDashboardViewModel.kt", l = {R.styleable.AppCompatTheme_panelMenuListWidth}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements p<d0, ls.d<? super f<? extends Integer, ? extends Integer>>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f26699u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ no.a f26700v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(no.a aVar, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f26700v = aVar;
        }

        @Override // ns.a
        public final ls.d<k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f26700v, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super f<? extends Integer, ? extends Integer>> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f26699u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                mo.a aVar2 = this.f26700v.f26677x;
                this.f26699u = 1;
                obj = aVar2.a(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(no.a aVar, ls.d<? super c> dVar) {
        super(2, dVar);
        this.f26698v = aVar;
    }

    @Override // ns.a
    public final ls.d<k> create(Object obj, ls.d<?> dVar) {
        return new c(this.f26698v, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
        return ((c) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f26697u;
        no.a aVar2 = this.f26698v;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.scheduling.b bVar = o0.f23642c;
            a aVar3 = new a(aVar2, null);
            this.f26697u = 1;
            obj = v.S(bVar, aVar3, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        aVar2.J.i((f) obj);
        return k.f19476a;
    }
}
