package fm;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.ArrayList;
import java.util.Date;
/* compiled from: V3CustomGoalViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.V3CustomGoalViewModel$fetchData$1", f = "V3CustomGoalViewModel.kt", l = {R.styleable.AppCompatTheme_activityChooserViewStyle}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class p1 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f15489u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ q1 f15490v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Date f15491w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ boolean f15492x;

    /* compiled from: V3CustomGoalViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.V3CustomGoalViewModel$fetchData$1$1", f = "V3CustomGoalViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ q1 f15493u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ hs.f<ArrayList<hs.f<String, ?>>, Integer[]> f15494v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(q1 q1Var, hs.f<? extends ArrayList<hs.f<String, ?>>, Integer[]> fVar, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f15493u = q1Var;
            this.f15494v = fVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f15493u, this.f15494v, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            sp.b.d0(obj);
            q1 q1Var = this.f15493u;
            androidx.lifecycle.w<Integer> wVar = q1Var.A;
            hs.f<ArrayList<hs.f<String, ?>>, Integer[]> fVar = this.f15494v;
            wVar.l(fVar.f19465v[0]);
            q1Var.B.l(fVar.f19465v[1]);
            q1Var.C.l(fVar.f19465v[2]);
            q1Var.D.l(fVar.f19465v[3]);
            q1Var.E.l(fVar.f19465v[4]);
            q1Var.F.l(fVar.f19465v[5]);
            q1Var.G.l(fVar.f19465v[6]);
            q1Var.H.l(fVar.f19465v[7]);
            q1Var.I.l(fVar.f19465v[8]);
            q1Var.f15518z.l(fVar.f19464u);
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(q1 q1Var, Date date, boolean z10, ls.d<? super p1> dVar) {
        super(2, dVar);
        this.f15490v = q1Var;
        this.f15491w = date;
        this.f15492x = z10;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new p1(this.f15490v, this.f15491w, this.f15492x, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((p1) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f15489u;
        q1 q1Var = this.f15490v;
        try {
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                hs.f b10 = q1Var.f15516x.b(this.f15491w, this.f15492x);
                if (b10 != null) {
                    kotlinx.coroutines.scheduling.c cVar = kotlinx.coroutines.o0.f23640a;
                    kotlinx.coroutines.k1 k1Var = kotlinx.coroutines.internal.k.f23608a;
                    a aVar2 = new a(q1Var, b10, null);
                    this.f15489u = 1;
                    if (ta.v.S(k1Var, aVar2, this) == aVar) {
                        return aVar;
                    }
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(q1Var.f15517y, e10);
        }
        return hs.k.f19476a;
    }
}
