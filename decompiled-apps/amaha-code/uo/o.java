package uo;

import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
import ta.v;
/* compiled from: ExperimentNotificationsFragment.kt */
@ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.fragment.ExperimentNotificationsFragment$setSpanOnRowText$clickSpan$3$onClick$1$2", f = "ExperimentNotificationsFragment.kt", l = {441}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class o extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f34411u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ k f34412v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Goal f34413w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ long f34414x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ RobertoTextView f34415y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(long j10, k kVar, Goal goal, RobertoTextView robertoTextView, ls.d dVar) {
        super(2, dVar);
        this.f34412v = kVar;
        this.f34413w = goal;
        this.f34414x = j10;
        this.f34415y = robertoTextView;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new o(this.f34414x, this.f34412v, this.f34413w, this.f34415y, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((o) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f34411u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            Goal goal = this.f34413w;
            long j10 = this.f34414x;
            RobertoTextView robertoTextView = this.f34415y;
            this.f34411u = 1;
            int i10 = k.E;
            k kVar = this.f34412v;
            kVar.getClass();
            Object S = v.S(o0.f23642c, new j(j10, kVar, goal, robertoTextView, null), this);
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
