package no;

import com.appsflyer.R;
import hs.k;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
import ns.e;
import ns.i;
import ss.p;
import ta.v;
/* compiled from: ProDashboardViewModel.kt */
@e(c = "com.theinnerhour.b2b.components.pro.dashboard.viewmodel.ProDashboardViewModel$checkMultiTrackerDone$1", f = "ProDashboardViewModel.kt", l = {R.styleable.AppCompatTheme_listPreferredItemPaddingEnd}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class b extends i implements p<d0, ls.d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f26693u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ no.a f26694v;

    /* compiled from: ProDashboardViewModel.kt */
    @e(c = "com.theinnerhour.b2b.components.pro.dashboard.viewmodel.ProDashboardViewModel$checkMultiTrackerDone$1$1", f = "ProDashboardViewModel.kt", l = {R.styleable.AppCompatTheme_listPreferredItemPaddingEnd}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements p<d0, ls.d<? super Boolean>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f26695u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ no.a f26696v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(no.a aVar, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f26696v = aVar;
        }

        @Override // ns.a
        public final ls.d<k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f26696v, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super Boolean> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f26695u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                mo.a aVar2 = this.f26696v.f26677x;
                this.f26695u = 1;
                obj = aVar2.b(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(no.a aVar, ls.d<? super b> dVar) {
        super(2, dVar);
        this.f26694v = aVar;
    }

    @Override // ns.a
    public final ls.d<k> create(Object obj, ls.d<?> dVar) {
        return new b(this.f26694v, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
        return ((b) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f26693u;
        no.a aVar2 = this.f26694v;
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
            this.f26693u = 1;
            obj = v.S(bVar, aVar3, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        aVar2.I.i(Boolean.valueOf(((Boolean) obj).booleanValue()));
        return k.f19476a;
    }
}
