package cn;

import com.appsflyer.R;
import com.theinnerhour.b2b.model.LearningHubModel;
import com.theinnerhour.b2b.utils.SingleUseEvent;
/* compiled from: CollectionsPageViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.CollectionsPageViewModel$fetchIndividualResourceItem$1", f = "CollectionsPageViewModel.kt", l = {R.styleable.AppCompatTheme_colorControlHighlight}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class n extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f5650u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ o f5651v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f5652w;

    /* compiled from: CollectionsPageViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.CollectionsPageViewModel$fetchIndividualResourceItem$1$1", f = "CollectionsPageViewModel.kt", l = {R.styleable.AppCompatTheme_colorControlNormal}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f5653u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f5654v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ o f5655w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f5656x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o oVar, String str, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f5655w = oVar;
            this.f5656x = str;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            a aVar = new a(this.f5655w, this.f5656x, dVar);
            aVar.f5654v = obj;
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
            int i6 = this.f5653u;
            o oVar = this.f5655w;
            if (i6 != 0) {
                if (i6 == 1) {
                    kotlinx.coroutines.d0 d0Var = (kotlinx.coroutines.d0) this.f5654v;
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                e1 e1Var = oVar.f5659x;
                this.f5654v = (kotlinx.coroutines.d0) this.f5654v;
                this.f5653u = 1;
                obj = e1Var.f(this.f5656x, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            LearningHubModel learningHubModel = (LearningHubModel) obj;
            if (learningHubModel != null) {
                oVar.A.i(new SingleUseEvent<>(learningHubModel));
                kVar = hs.k.f19476a;
            } else {
                kVar = null;
            }
            if (kVar == null) {
                oVar.A.i(new SingleUseEvent<>(null));
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, String str, ls.d<? super n> dVar) {
        super(2, dVar);
        this.f5651v = oVar;
        this.f5652w = str;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new n(this.f5651v, this.f5652w, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((n) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f5650u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.scheduling.b bVar = kotlinx.coroutines.o0.f23642c;
            a aVar2 = new a(this.f5651v, this.f5652w, null);
            this.f5650u = 1;
            if (ta.v.S(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
