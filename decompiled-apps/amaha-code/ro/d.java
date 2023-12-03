package ro;

import com.appsflyer.R;
import com.theinnerhour.b2b.components.multiTracker.model.MultiTrackerModel;
import com.theinnerhour.b2b.components.pro.tracker.activity.ProMultiTrackerActivity;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.widgets.RobertoButton;
import hs.k;
import is.f0;
import is.q;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.o0;
import ns.e;
import ns.i;
import ss.p;
import ta.v;
/* compiled from: ProMultiTrackerActivity.kt */
@e(c = "com.theinnerhour.b2b.components.pro.tracker.activity.ProMultiTrackerActivity$updateCTA$1", f = "ProMultiTrackerActivity.kt", l = {R.styleable.AppCompatTheme_tooltipFrameBackground}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class d extends i implements p<d0, ls.d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f30842u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ProMultiTrackerActivity f30843v;

    /* compiled from: ProMultiTrackerActivity.kt */
    @e(c = "com.theinnerhour.b2b.components.pro.tracker.activity.ProMultiTrackerActivity$updateCTA$1$1$1", f = "ProMultiTrackerActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements p<d0, ls.d<? super k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ boolean f30844u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ ProMultiTrackerActivity f30845v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, ProMultiTrackerActivity proMultiTrackerActivity, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f30844u = z10;
            this.f30845v = proMultiTrackerActivity;
        }

        @Override // ns.a
        public final ls.d<k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f30844u, this.f30845v, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            sp.b.d0(obj);
            boolean z10 = this.f30844u;
            ProMultiTrackerActivity proMultiTrackerActivity = this.f30845v;
            if (z10) {
                ((RobertoButton) proMultiTrackerActivity.u0(com.theinnerhour.b2b.R.id.proMultiTrackerCTA)).setEnabled(true);
                ((RobertoButton) proMultiTrackerActivity.u0(com.theinnerhour.b2b.R.id.proMultiTrackerCTA)).setAlpha(1.0f);
            } else {
                ((RobertoButton) proMultiTrackerActivity.u0(com.theinnerhour.b2b.R.id.proMultiTrackerCTA)).setEnabled(false);
                ((RobertoButton) proMultiTrackerActivity.u0(com.theinnerhour.b2b.R.id.proMultiTrackerCTA)).setAlpha(0.34f);
            }
            return k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ProMultiTrackerActivity proMultiTrackerActivity, ls.d<? super d> dVar) {
        super(2, dVar);
        this.f30843v = proMultiTrackerActivity;
    }

    @Override // ns.a
    public final ls.d<k> create(Object obj, ls.d<?> dVar) {
        return new d(this.f30843v, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
        return ((d) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f30842u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            User user = FirebasePersistence.getInstance().getUser();
            if (user != null) {
                long timeInMillis = Calendar.getInstance().getTimeInMillis();
                ArrayList<MultiTrackerModel> userMoodListV3 = user.getUserMoodListV3();
                kotlin.jvm.internal.i.f(userMoodListV3, "userMoodListV3");
                f0 S1 = q.S1(userMoodListV3);
                boolean isEmpty = S1.isEmpty();
                ProMultiTrackerActivity proMultiTrackerActivity = this.f30843v;
                if (!isEmpty) {
                    Iterator<T> it = S1.iterator();
                    while (it.hasNext()) {
                        if (kotlin.jvm.internal.i.b(proMultiTrackerActivity.f11559y.format(new Long(((MultiTrackerModel) it.next()).getDate().getTime() * 1000)), proMultiTrackerActivity.f11559y.format(new Long(timeInMillis)))) {
                            z10 = true;
                            break;
                        }
                    }
                }
                z10 = false;
                kotlinx.coroutines.scheduling.c cVar = o0.f23640a;
                k1 k1Var = kotlinx.coroutines.internal.k.f23608a;
                a aVar2 = new a(z10, proMultiTrackerActivity, null);
                this.f30842u = 1;
                if (v.S(k1Var, aVar2, this) == aVar) {
                    return aVar;
                }
            }
        }
        return k.f19476a;
    }
}
