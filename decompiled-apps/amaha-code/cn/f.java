package cn;

import com.appsflyer.R;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityModel;
import com.theinnerhour.b2b.utils.SingleUseEvent;
/* compiled from: AllTopPicksViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.AllTopPicksViewModel$fetchIndividualRecommendedActivity$1", f = "AllTopPicksViewModel.kt", l = {R.styleable.AppCompatTheme_colorBackgroundFloating}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class f extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f5532u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ i f5533v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f5534w;

    /* compiled from: AllTopPicksViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.AllTopPicksViewModel$fetchIndividualRecommendedActivity$1$1", f = "AllTopPicksViewModel.kt", l = {R.styleable.AppCompatTheme_colorButtonNormal}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f5535u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f5536v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ i f5537w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f5538x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i iVar, String str, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f5537w = iVar;
            this.f5538x = str;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            a aVar = new a(this.f5537w, this.f5538x, dVar);
            aVar.f5536v = obj;
            return aVar;
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            hs.k kVar;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f5535u;
            i iVar = this.f5537w;
            if (i6 != 0) {
                if (i6 == 1) {
                    kotlinx.coroutines.d0 d0Var = (kotlinx.coroutines.d0) this.f5536v;
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                e1 e1Var = iVar.f5566x;
                this.f5536v = (kotlinx.coroutines.d0) this.f5536v;
                this.f5535u = 1;
                obj = e1Var.e(this.f5538x, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            RecommendedActivityModel recommendedActivityModel = (RecommendedActivityModel) obj;
            if (recommendedActivityModel != null) {
                iVar.A.i(new SingleUseEvent<>(recommendedActivityModel));
                kVar = hs.k.f19476a;
            } else {
                kVar = null;
            }
            if (kVar == null) {
                iVar.A.i(new SingleUseEvent<>(null));
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, String str, ls.d<? super f> dVar) {
        super(2, dVar);
        this.f5533v = iVar;
        this.f5534w = str;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new f(this.f5533v, this.f5534w, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((f) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f5532u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.scheduling.b bVar = kotlinx.coroutines.o0.f23642c;
            a aVar2 = new a(this.f5533v, this.f5534w, null);
            this.f5532u = 1;
            if (ta.v.S(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
