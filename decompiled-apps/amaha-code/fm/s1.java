package fm;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.ArrayList;
import java.util.Date;
/* compiled from: V3GoalViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.V3GoalViewModel$fetchData$1", f = "V3GoalViewModel.kt", l = {R.styleable.AppCompatTheme_buttonStyleSmall}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class s1 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f15553u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ t1 f15554v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Date f15555w;

    /* compiled from: V3GoalViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.V3GoalViewModel$fetchData$1$1", f = "V3GoalViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ t1 f15556u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ hs.f<ArrayList<hs.f<String, ?>>, Integer[]> f15557v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(t1 t1Var, hs.f<? extends ArrayList<hs.f<String, ?>>, Integer[]> fVar, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f15556u = t1Var;
            this.f15557v = fVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f15556u, this.f15557v, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            sp.b.d0(obj);
            t1 t1Var = this.f15556u;
            androidx.lifecycle.w<Integer> wVar = t1Var.E;
            hs.f<ArrayList<hs.f<String, ?>>, Integer[]> fVar = this.f15557v;
            wVar.l(fVar.f19465v[0]);
            t1Var.F.l(fVar.f19465v[1]);
            t1Var.G.l(fVar.f19465v[2]);
            t1Var.H.l(fVar.f19465v[3]);
            t1Var.I.l(fVar.f19465v[4]);
            t1Var.J.l(fVar.f19465v[5]);
            t1Var.K.l(fVar.f19465v[6]);
            t1Var.L.l(fVar.f19465v[7]);
            t1Var.M.l(fVar.f19465v[8]);
            t1Var.A.l(fVar.f19464u);
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(t1 t1Var, Date date, ls.d<? super s1> dVar) {
        super(2, dVar);
        this.f15554v = t1Var;
        this.f15555w = date;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new s1(this.f15554v, this.f15555w, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((s1) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f15553u;
        t1 t1Var = this.f15554v;
        try {
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                hs.f<ArrayList<hs.f<String, ?>>, Integer[]> d10 = t1Var.f15560y.d(this.f15555w);
                if (d10 != null) {
                    kotlinx.coroutines.scheduling.c cVar = kotlinx.coroutines.o0.f23640a;
                    kotlinx.coroutines.k1 k1Var = kotlinx.coroutines.internal.k.f23608a;
                    a aVar2 = new a(t1Var, d10, null);
                    this.f15553u = 1;
                    if (ta.v.S(k1Var, aVar2, this) == aVar) {
                        return aVar;
                    }
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(t1Var.f15561z, e10);
        }
        return hs.k.f19476a;
    }
}
