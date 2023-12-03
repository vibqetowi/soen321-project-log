package cn;

import com.appsflyer.R;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityModel;
import com.theinnerhour.b2b.utils.SingleUseEvent;
/* compiled from: LibraryViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.LibraryViewModel$fetchIndividualRecommendedActivity$1", f = "LibraryViewModel.kt", l = {R.styleable.AppCompatTheme_tooltipFrameBackground}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class r0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f5758u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ k0 f5759v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f5760w;

    /* compiled from: LibraryViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.LibraryViewModel$fetchIndividualRecommendedActivity$1$1", f = "LibraryViewModel.kt", l = {R.styleable.AppCompatTheme_viewInflaterClass}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f5761u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f5762v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ k0 f5763w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f5764x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k0 k0Var, String str, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f5763w = k0Var;
            this.f5764x = str;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            a aVar = new a(this.f5763w, this.f5764x, dVar);
            aVar.f5762v = obj;
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
            int i6 = this.f5761u;
            k0 k0Var = this.f5763w;
            if (i6 != 0) {
                if (i6 == 1) {
                    kotlinx.coroutines.d0 d0Var = (kotlinx.coroutines.d0) this.f5762v;
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                e1 e1Var = k0Var.f5597z;
                this.f5762v = (kotlinx.coroutines.d0) this.f5762v;
                this.f5761u = 1;
                obj = e1Var.e(this.f5764x, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            RecommendedActivityModel recommendedActivityModel = (RecommendedActivityModel) obj;
            if (recommendedActivityModel != null) {
                k0Var.B.i(new SingleUseEvent<>(recommendedActivityModel));
                kVar = hs.k.f19476a;
            } else {
                kVar = null;
            }
            if (kVar == null) {
                k0Var.B.i(new SingleUseEvent<>(null));
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(k0 k0Var, String str, ls.d<? super r0> dVar) {
        super(2, dVar);
        this.f5759v = k0Var;
        this.f5760w = str;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new r0(this.f5759v, this.f5760w, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((r0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f5758u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.scheduling.b bVar = kotlinx.coroutines.o0.f23642c;
            a aVar2 = new a(this.f5759v, this.f5760w, null);
            this.f5758u = 1;
            if (ta.v.S(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
