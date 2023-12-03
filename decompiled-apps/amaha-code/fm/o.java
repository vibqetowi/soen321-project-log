package fm;

import com.appsflyer.R;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityModel;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import java.util.ArrayList;
/* compiled from: FirestoreGoalsViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.FirestoreGoalsViewModel$fetchIndividualActivity$1", f = "FirestoreGoalsViewModel.kt", l = {R.styleable.AppCompatTheme_tooltipForegroundColor}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class o extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f15468u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ fm.a f15469v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f15470w;

    /* compiled from: FirestoreGoalsViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.FirestoreGoalsViewModel$fetchIndividualActivity$1$1", f = "FirestoreGoalsViewModel.kt", l = {R.styleable.AppCompatTheme_tooltipFrameBackground}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f15471u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f15472v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ fm.a f15473w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f15474x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fm.a aVar, String str, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f15473w = aVar;
            this.f15474x = str;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            a aVar = new a(this.f15473w, this.f15474x, dVar);
            aVar.f15472v = obj;
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
            int i6 = this.f15471u;
            fm.a aVar2 = this.f15473w;
            if (i6 != 0) {
                if (i6 == 1) {
                    kotlinx.coroutines.d0 d0Var = (kotlinx.coroutines.d0) this.f15472v;
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                this.f15472v = (kotlinx.coroutines.d0) this.f15472v;
                this.f15471u = 1;
                obj = ((dm.f) aVar2.f15171d0.getValue()).a(this.f15474x, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            RecommendedActivityModel recommendedActivityModel = (RecommendedActivityModel) obj;
            if (recommendedActivityModel != null) {
                ArrayList<RecommendedActivityModel> d10 = aVar2.X.d();
                if (d10 != null) {
                    d10.add(recommendedActivityModel);
                } else {
                    ca.a.k(recommendedActivityModel);
                }
                aVar2.Y.i(new SingleUseEvent<>(recommendedActivityModel));
                kVar = hs.k.f19476a;
            } else {
                kVar = null;
            }
            if (kVar == null) {
                aVar2.Y.i(new SingleUseEvent<>(null));
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(fm.a aVar, String str, ls.d<? super o> dVar) {
        super(2, dVar);
        this.f15469v = aVar;
        this.f15470w = str;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new o(this.f15469v, this.f15470w, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((o) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f15468u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            fm.a aVar2 = this.f15469v;
            kotlinx.coroutines.a0 a0Var = aVar2.A;
            a aVar3 = new a(aVar2, this.f15470w, null);
            this.f15468u = 1;
            if (ta.v.S(a0Var, aVar3, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
