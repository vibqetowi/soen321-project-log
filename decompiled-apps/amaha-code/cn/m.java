package cn;

import com.appsflyer.R;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityModel;
import com.theinnerhour.b2b.utils.SingleUseEvent;
/* compiled from: CollectionsPageViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.CollectionsPageViewModel$fetchIndividualRecommendedActivity$1", f = "CollectionsPageViewModel.kt", l = {32}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class m extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f5641u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ o f5642v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f5643w;

    /* compiled from: CollectionsPageViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.CollectionsPageViewModel$fetchIndividualRecommendedActivity$1$1", f = "CollectionsPageViewModel.kt", l = {R.styleable.AppCompatTheme_actionOverflowMenuStyle}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f5644u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f5645v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ o f5646w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f5647x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o oVar, String str, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f5646w = oVar;
            this.f5647x = str;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            a aVar = new a(this.f5646w, this.f5647x, dVar);
            aVar.f5645v = obj;
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
            int i6 = this.f5644u;
            o oVar = this.f5646w;
            if (i6 != 0) {
                if (i6 == 1) {
                    kotlinx.coroutines.d0 d0Var = (kotlinx.coroutines.d0) this.f5645v;
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                e1 e1Var = oVar.f5659x;
                this.f5645v = (kotlinx.coroutines.d0) this.f5645v;
                this.f5644u = 1;
                obj = e1Var.e(this.f5647x, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            RecommendedActivityModel recommendedActivityModel = (RecommendedActivityModel) obj;
            if (recommendedActivityModel != null) {
                oVar.f5661z.i(new SingleUseEvent<>(recommendedActivityModel));
                kVar = hs.k.f19476a;
            } else {
                kVar = null;
            }
            if (kVar == null) {
                oVar.f5661z.i(new SingleUseEvent<>(null));
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, String str, ls.d<? super m> dVar) {
        super(2, dVar);
        this.f5642v = oVar;
        this.f5643w = str;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new m(this.f5642v, this.f5643w, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((m) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f5641u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.scheduling.b bVar = kotlinx.coroutines.o0.f23642c;
            a aVar2 = new a(this.f5642v, this.f5643w, null);
            this.f5641u = 1;
            if (ta.v.S(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
