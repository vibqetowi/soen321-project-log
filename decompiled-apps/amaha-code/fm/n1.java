package fm;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.ArrayList;
import java.util.Date;
/* compiled from: GoalViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.GoalViewModel$fetchData$1", f = "GoalViewModel.kt", l = {R.styleable.AppCompatTheme_activityChooserViewStyle}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class n1 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f15463u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ o1 f15464v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Date f15465w;

    /* compiled from: GoalViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.GoalViewModel$fetchData$1$1", f = "GoalViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ o1 f15466u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ hs.f<ArrayList<Object>, Integer[]> f15467v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(o1 o1Var, hs.f<? extends ArrayList<Object>, Integer[]> fVar, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f15466u = o1Var;
            this.f15467v = fVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f15466u, this.f15467v, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            sp.b.d0(obj);
            o1 o1Var = this.f15466u;
            androidx.lifecycle.w<Integer> wVar = o1Var.A;
            hs.f<ArrayList<Object>, Integer[]> fVar = this.f15467v;
            wVar.l(fVar.f19465v[0]);
            o1Var.B.l(fVar.f19465v[1]);
            o1Var.C.l(fVar.f19465v[2]);
            o1Var.D.l(fVar.f19465v[3]);
            o1Var.E.l(fVar.f19465v[4]);
            o1Var.F.l(fVar.f19465v[5]);
            o1Var.G.l(fVar.f19465v[6]);
            o1Var.H.l(fVar.f19465v[7]);
            o1Var.I.l(fVar.f19465v[8]);
            o1Var.f15483z.l(fVar.f19464u);
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(o1 o1Var, Date date, ls.d<? super n1> dVar) {
        super(2, dVar);
        this.f15464v = o1Var;
        this.f15465w = date;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new n1(this.f15464v, this.f15465w, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((n1) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f15463u;
        o1 o1Var = this.f15464v;
        try {
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                hs.f<ArrayList<Object>, Integer[]> b10 = o1Var.f15481x.b(this.f15465w);
                if (b10 != null) {
                    kotlinx.coroutines.scheduling.c cVar = kotlinx.coroutines.o0.f23640a;
                    kotlinx.coroutines.k1 k1Var = kotlinx.coroutines.internal.k.f23608a;
                    a aVar2 = new a(o1Var, b10, null);
                    this.f15463u = 1;
                    if (ta.v.S(k1Var, aVar2, this) == aVar) {
                        return aVar;
                    }
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(o1Var.f15482y, e10);
        }
        return hs.k.f19476a;
    }
}
