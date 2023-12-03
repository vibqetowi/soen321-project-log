package uo;

import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.Calendar;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
import ta.v;
/* compiled from: ExperimentNotificationsFragment.kt */
@ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.fragment.ExperimentNotificationsFragment$showWeeklyDayPicker$1$2", f = "ExperimentNotificationsFragment.kt", l = {557}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class r extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f34425u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ k f34426v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Goal f34427w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Calendar f34428x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ RobertoTextView f34429y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(k kVar, Goal goal, Calendar calendar, RobertoTextView robertoTextView, ls.d<? super r> dVar) {
        super(2, dVar);
        this.f34426v = kVar;
        this.f34427w = goal;
        this.f34428x = calendar;
        this.f34429y = robertoTextView;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new r(this.f34426v, this.f34427w, this.f34428x, this.f34429y, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((r) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f34425u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            Goal goal = this.f34427w;
            long timeInMillis = this.f34428x.getTimeInMillis();
            RobertoTextView robertoTextView = this.f34429y;
            this.f34425u = 1;
            int i10 = k.E;
            k kVar = this.f34426v;
            kVar.getClass();
            Object S = v.S(o0.f23642c, new j(timeInMillis, kVar, goal, robertoTextView, null), this);
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
