package uo;

import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
import ta.v;
/* compiled from: ExperimentNotificationsFragment.kt */
@ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.fragment.ExperimentNotificationsFragment$setSpanOnRowText$clickSpan$3$onClick$1$1", f = "ExperimentNotificationsFragment.kt", l = {422}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class n extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f34406u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ k f34407v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Goal f34408w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ long f34409x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ RobertoTextView f34410y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(long j10, k kVar, Goal goal, RobertoTextView robertoTextView, ls.d dVar) {
        super(2, dVar);
        this.f34407v = kVar;
        this.f34408w = goal;
        this.f34409x = j10;
        this.f34410y = robertoTextView;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new n(this.f34409x, this.f34407v, this.f34408w, this.f34410y, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((n) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f34406u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            Goal goal = this.f34408w;
            long j10 = this.f34409x;
            RobertoTextView robertoTextView = this.f34410y;
            this.f34406u = 1;
            int i10 = k.E;
            k kVar = this.f34407v;
            kVar.getClass();
            Object S = v.S(o0.f23642c, new h(j10, kVar, goal, robertoTextView, null), this);
            if (S != obj2) {
                S = hs.k.f19476a;
            }
            if (S == obj2) {
                return obj2;
            }
        }
        return hs.k.f19476a;
    }
}
