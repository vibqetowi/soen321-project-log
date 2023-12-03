package zl;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.LogHelper;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
/* compiled from: ExpertCareViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.expertCare.viewmodel.ExpertCareViewModel$getTestimonials$1", f = "ExpertCareViewModel.kt", l = {R.styleable.AppCompatTheme_alertDialogTheme}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class u extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f39598u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ v f39599v;

    /* compiled from: ExpertCareViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.expertCare.viewmodel.ExpertCareViewModel$getTestimonials$1$1", f = "ExpertCareViewModel.kt", l = {R.styleable.AppCompatTheme_autoCompleteTextViewStyle}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f39600u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ v f39601v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v vVar, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f39601v = vVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f39601v, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f39600u;
            v vVar = this.f39601v;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                yl.b bVar = vVar.f39602x;
                this.f39600u = 1;
                bVar.getClass();
                ls.h hVar = new ls.h(ca.a.G0(this));
                ((wl.a) nr.b.a(wl.a.class)).b("https://api.theinnerhour.com/v1/providers/testimonials").I(new yl.d(hVar));
                obj = hVar.b();
                if (obj == aVar) {
                    return aVar;
                }
            }
            xl.b bVar2 = (xl.b) obj;
            if (bVar2 != null) {
                vVar.f39603y.i(bVar2);
                return hs.k.f19476a;
            }
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, ls.d<? super u> dVar) {
        super(2, dVar);
        this.f39599v = vVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new u(this.f39599v, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((u) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f39598u;
        v vVar = this.f39599v;
        try {
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                kotlinx.coroutines.scheduling.b bVar = o0.f23642c;
                a aVar2 = new a(vVar, null);
                this.f39598u = 1;
                if (ta.v.S(bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(vVar.D, e10);
        }
        return hs.k.f19476a;
    }
}
