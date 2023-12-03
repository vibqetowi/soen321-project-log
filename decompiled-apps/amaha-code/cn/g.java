package cn;

import com.appsflyer.R;
import com.theinnerhour.b2b.model.LearningHubModel;
import com.theinnerhour.b2b.utils.SingleUseEvent;
/* compiled from: AllTopPicksViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.AllTopPicksViewModel$fetchIndividualResourceItem$1", f = "AllTopPicksViewModel.kt", l = {R.styleable.AppCompatTheme_listChoiceBackgroundIndicator}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class g extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f5543u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ i f5544v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f5545w;

    /* compiled from: AllTopPicksViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.AllTopPicksViewModel$fetchIndividualResourceItem$1$1", f = "AllTopPicksViewModel.kt", l = {R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f5546u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f5547v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ i f5548w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f5549x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i iVar, String str, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f5548w = iVar;
            this.f5549x = str;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            a aVar = new a(this.f5548w, this.f5549x, dVar);
            aVar.f5547v = obj;
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
            int i6 = this.f5546u;
            i iVar = this.f5548w;
            if (i6 != 0) {
                if (i6 == 1) {
                    kotlinx.coroutines.d0 d0Var = (kotlinx.coroutines.d0) this.f5547v;
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                e1 e1Var = iVar.f5566x;
                this.f5547v = (kotlinx.coroutines.d0) this.f5547v;
                this.f5546u = 1;
                obj = e1Var.f(this.f5549x, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            LearningHubModel learningHubModel = (LearningHubModel) obj;
            if (learningHubModel != null) {
                iVar.B.i(new SingleUseEvent<>(learningHubModel));
                kVar = hs.k.f19476a;
            } else {
                kVar = null;
            }
            if (kVar == null) {
                iVar.B.i(new SingleUseEvent<>(null));
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, String str, ls.d<? super g> dVar) {
        super(2, dVar);
        this.f5544v = iVar;
        this.f5545w = str;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new g(this.f5544v, this.f5545w, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((g) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f5543u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.scheduling.b bVar = kotlinx.coroutines.o0.f23642c;
            a aVar2 = new a(this.f5544v, this.f5545w, null);
            this.f5543u = 1;
            if (ta.v.S(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
