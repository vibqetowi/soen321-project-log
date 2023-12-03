package ap;

import androidx.lifecycle.l0;
import androidx.lifecycle.w;
import com.appsflyer.R;
import com.google.firebase.auth.FirebaseAuth;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import fm.j0;
import hs.k;
import kotlinx.coroutines.d0;
import ns.i;
import ss.p;
import ta.v;
/* compiled from: RecommendedActivitiesPlaybackViewModel.kt */
/* loaded from: classes2.dex */
public final class a extends l0 {
    public FirestoreGoal C;

    /* renamed from: x  reason: collision with root package name */
    public final String f3365x = LogHelper.INSTANCE.makeLogTag("RAExperimentParentViewModel");

    /* renamed from: y  reason: collision with root package name */
    public final w<SingleUseEvent<Boolean>> f3366y = new w<>();

    /* renamed from: z  reason: collision with root package name */
    public final w<SingleUseEvent<Boolean>> f3367z = new w<>();
    public final j0 A = new j0();
    public final w<SingleUseEvent<Boolean>> B = new w<>();
    public final w<SingleUseEvent<FirestoreGoal>> D = new w<>();
    public final boolean E = sp.b.K();

    /* compiled from: RecommendedActivitiesPlaybackViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.recommendedActivities.viewmodel.RecommendedActivitiesPlaybackViewModel$addGoal$1", f = "RecommendedActivitiesPlaybackViewModel.kt", l = {R.styleable.AppCompatTheme_dialogTheme}, m = "invokeSuspend")
    /* renamed from: ap.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0047a extends i implements p<d0, ls.d<? super k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f3368u;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ FirestoreGoal f3370w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0047a(FirestoreGoal firestoreGoal, ls.d<? super C0047a> dVar) {
            super(2, dVar);
            this.f3370w = firestoreGoal;
        }

        @Override // ns.a
        public final ls.d<k> create(Object obj, ls.d<?> dVar) {
            return new C0047a(this.f3370w, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
            return ((C0047a) create(d0Var, dVar)).invokeSuspend(k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f3368u;
            FirestoreGoal firestoreGoal = this.f3370w;
            a aVar2 = a.this;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                aVar2.f3367z.i(new SingleUseEvent<>(Boolean.TRUE));
                String a10 = FirebaseAuth.getInstance().a();
                if (a10 == null) {
                    return k.f19476a;
                }
                this.f3368u = 1;
                obj = aVar2.A.b(firestoreGoal, a10, false, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            if (((Boolean) obj).booleanValue()) {
                aVar2.f3367z.i(new SingleUseEvent<>(Boolean.FALSE));
                aVar2.D.i(new SingleUseEvent<>(firestoreGoal));
                aVar2.C = firestoreGoal;
            } else {
                aVar2.D.i(new SingleUseEvent<>(null));
            }
            return k.f19476a;
        }
    }

    /* compiled from: RecommendedActivitiesPlaybackViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.recommendedActivities.viewmodel.RecommendedActivitiesPlaybackViewModel$updateGoal$1", f = "RecommendedActivitiesPlaybackViewModel.kt", l = {R.styleable.AppCompatTheme_listPreferredItemPaddingRight}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends i implements p<d0, ls.d<? super k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f3371u;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ FirestoreGoal f3373w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(FirestoreGoal firestoreGoal, ls.d<? super b> dVar) {
            super(2, dVar);
            this.f3373w = firestoreGoal;
        }

        @Override // ns.a
        public final ls.d<k> create(Object obj, ls.d<?> dVar) {
            return new b(this.f3373w, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
            return ((b) create(d0Var, dVar)).invokeSuspend(k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f3371u;
            a aVar2 = a.this;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                aVar2.f3367z.i(new SingleUseEvent<>(Boolean.TRUE));
                j0 j0Var = aVar2.A;
                String a10 = FirebaseAuth.getInstance().a();
                if (a10 == null) {
                    return k.f19476a;
                }
                this.f3371u = 1;
                obj = j0Var.b(this.f3373w, a10, true, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            ((Boolean) obj).booleanValue();
            aVar2.f3367z.i(new SingleUseEvent<>(Boolean.FALSE));
            return k.f19476a;
        }
    }

    public final void e(FirestoreGoal firestoreGoal) {
        if (firestoreGoal.getGoalId() == null) {
            return;
        }
        v.H(kc.f.H(this), null, 0, new C0047a(firestoreGoal, null), 3);
    }

    public final void f(FirestoreGoal firestoreGoal) {
        if (firestoreGoal.getGoalId() == null) {
            return;
        }
        v.H(kc.f.H(this), null, 0, new b(firestoreGoal, null), 3);
    }
}
