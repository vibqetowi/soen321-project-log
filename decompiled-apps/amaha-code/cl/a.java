package cl;

import androidx.lifecycle.l0;
import androidx.lifecycle.w;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.appsflyer.R;
import com.google.firebase.auth.FirebaseAuth;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.GoalDateObj;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.GoalHelper;
import com.theinnerhour.b2b.utils.Utils;
import fm.j0;
import hs.f;
import hs.k;
import is.u;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.flow.r;
import ls.d;
import ns.c;
import ns.e;
import ns.i;
import sp.b;
import ss.p;
import ta.v;
/* compiled from: DailyPlanViewModel.kt */
/* loaded from: classes2.dex */
public final class a extends l0 {

    /* renamed from: x  reason: collision with root package name */
    public final j0 f5287x = new j0();

    /* renamed from: y  reason: collision with root package name */
    public final GoalHelper f5288y = new GoalHelper();

    /* renamed from: z  reason: collision with root package name */
    public final w<f<Boolean, Boolean>> f5289z = new w<>();

    /* compiled from: DailyPlanViewModel.kt */
    @e(c = "com.theinnerhour.b2b.components.dailyPlan.viewmodel.DailyPlanViewModel$getGoalsStatus$1", f = "DailyPlanViewModel.kt", l = {R.styleable.AppCompatTheme_activityChooserViewStyle}, m = "invokeSuspend")
    /* renamed from: cl.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0108a extends i implements p<d0, d<? super k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f5290u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f5291v;

        /* compiled from: DailyPlanViewModel.kt */
        /* renamed from: cl.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0109a<T> implements kotlinx.coroutines.flow.e {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ d0 f5293u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ a f5294v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ String f5295w;

            /* compiled from: DailyPlanViewModel.kt */
            @e(c = "com.theinnerhour.b2b.components.dailyPlan.viewmodel.DailyPlanViewModel$getGoalsStatus$1$1$1$1$1", f = "DailyPlanViewModel.kt", l = {36}, m = "invokeSuspend")
            /* renamed from: cl.a$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0110a extends i implements p<d0, d<? super f<? extends FirestoreGoal, ? extends GoalDateObj>>, Object> {

                /* renamed from: u  reason: collision with root package name */
                public FirestoreGoal f5296u;

                /* renamed from: v  reason: collision with root package name */
                public int f5297v;

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ FirestoreGoal f5298w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ a f5299x;

                /* renamed from: y  reason: collision with root package name */
                public final /* synthetic */ String f5300y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0110a(FirestoreGoal firestoreGoal, a aVar, String str, d<? super C0110a> dVar) {
                    super(2, dVar);
                    this.f5298w = firestoreGoal;
                    this.f5299x = aVar;
                    this.f5300y = str;
                }

                @Override // ns.a
                public final d<k> create(Object obj, d<?> dVar) {
                    return new C0110a(this.f5298w, this.f5299x, this.f5300y, dVar);
                }

                @Override // ss.p
                public final Object invoke(d0 d0Var, d<? super f<? extends FirestoreGoal, ? extends GoalDateObj>> dVar) {
                    return ((C0110a) create(d0Var, dVar)).invokeSuspend(k.f19476a);
                }

                @Override // ns.a
                public final Object invokeSuspend(Object obj) {
                    FirestoreGoal firestoreGoal;
                    ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                    int i6 = this.f5297v;
                    if (i6 != 0) {
                        if (i6 == 1) {
                            firestoreGoal = this.f5296u;
                            sp.b.d0(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        sp.b.d0(obj);
                        j0 j0Var = this.f5299x.f5287x;
                        FirestoreGoal firestoreGoal2 = this.f5298w;
                        String goalId = firestoreGoal2.getGoalId();
                        kotlin.jvm.internal.i.d(goalId);
                        String uid = this.f5300y;
                        kotlin.jvm.internal.i.f(uid, "uid");
                        this.f5296u = firestoreGoal2;
                        this.f5297v = 1;
                        j0Var.getClass();
                        obj = j0.i(goalId, uid, this);
                        if (obj == aVar) {
                            return aVar;
                        }
                        firestoreGoal = firestoreGoal2;
                    }
                    return new f(firestoreGoal, obj);
                }
            }

            /* compiled from: DailyPlanViewModel.kt */
            @e(c = "com.theinnerhour.b2b.components.dailyPlan.viewmodel.DailyPlanViewModel$getGoalsStatus$1$1$1", f = "DailyPlanViewModel.kt", l = {R.styleable.AppCompatTheme_alertDialogStyle}, m = "emit")
            /* renamed from: cl.a$a$a$b */
            /* loaded from: classes2.dex */
            public static final class b extends c {

                /* renamed from: u  reason: collision with root package name */
                public C0109a f5301u;

                /* renamed from: v  reason: collision with root package name */
                public /* synthetic */ Object f5302v;

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ C0109a<T> f5303w;

                /* renamed from: x  reason: collision with root package name */
                public int f5304x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public b(C0109a<? super T> c0109a, d<? super b> dVar) {
                    super(dVar);
                    this.f5303w = c0109a;
                }

                @Override // ns.a
                public final Object invokeSuspend(Object obj) {
                    this.f5302v = obj;
                    this.f5304x |= LinearLayoutManager.INVALID_OFFSET;
                    return this.f5303w.b(null, this);
                }
            }

            public C0109a(d0 d0Var, a aVar, String str) {
                this.f5293u = d0Var;
                this.f5294v = aVar;
                this.f5295w = str;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // kotlinx.coroutines.flow.e
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object b(List<FirestoreGoal> list, d<? super k> dVar) {
                b bVar;
                int i6;
                C0109a<T> c0109a;
                if (dVar instanceof b) {
                    bVar = (b) dVar;
                    int i10 = bVar.f5304x;
                    if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        bVar.f5304x = i10 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj = bVar.f5302v;
                        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                        i6 = bVar.f5304x;
                        if (i6 == 0) {
                            if (i6 == 1) {
                                c0109a = bVar.f5301u;
                                sp.b.d0(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            sp.b.d0(obj);
                            ArrayList arrayList = new ArrayList(is.i.H1(list, 10));
                            for (FirestoreGoal firestoreGoal : list) {
                                arrayList.add(v.g(this.f5293u, null, new C0110a(firestoreGoal, this.f5294v, this.f5295w, null), 3));
                            }
                            bVar.f5301u = this;
                            bVar.f5304x = 1;
                            obj = ca.a.n(arrayList, bVar);
                            if (obj == aVar) {
                                return aVar;
                            }
                            c0109a = this;
                        }
                        a aVar2 = c0109a.f5294v;
                        aVar2.f5289z.i(aVar2.f5288y.isPendingGoals((List) obj));
                        return k.f19476a;
                    }
                }
                bVar = new b(this, dVar);
                Object obj2 = bVar.f5302v;
                ms.a aVar3 = ms.a.COROUTINE_SUSPENDED;
                i6 = bVar.f5304x;
                if (i6 == 0) {
                }
                a aVar22 = c0109a.f5294v;
                aVar22.f5289z.i(aVar22.f5288y.isPendingGoals((List) obj2));
                return k.f19476a;
            }
        }

        public C0108a(d<? super C0108a> dVar) {
            super(2, dVar);
        }

        @Override // ns.a
        public final d<k> create(Object obj, d<?> dVar) {
            C0108a c0108a = new C0108a(dVar);
            c0108a.f5291v = obj;
            return c0108a;
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, d<? super k> dVar) {
            return ((C0108a) create(d0Var, dVar)).invokeSuspend(k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            String j02;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f5290u;
            if (i6 != 0) {
                if (i6 == 1) {
                    b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                b.d0(obj);
                d0 d0Var = (d0) this.f5291v;
                fd.f fVar = FirebaseAuth.getInstance().f;
                if (fVar != null && (j02 = fVar.j0()) != null) {
                    a aVar2 = a.this;
                    r n10 = aVar2.f5287x.n(tr.r.f(new Integer(0)), j02, Utils.INSTANCE.getTodayTimeInSeconds());
                    C0109a c0109a = new C0109a(d0Var, aVar2, j02);
                    this.f5290u = 1;
                    if (n10.a(c0109a, this) == aVar) {
                        return aVar;
                    }
                }
            }
            return k.f19476a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
        if (r6 != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (b.K()) {
            v.H(kc.f.H(this), null, 0, new C0108a(null), 3);
            return;
        }
        ArrayList<Goal> userGoals = FirebasePersistence.getInstance().getUser().getUserGoals();
        GoalHelper goalHelper = new GoalHelper();
        if (userGoals.size() > 0) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = userGoals.iterator();
            while (true) {
                z10 = true;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Goal goal = (Goal) next;
                if (goal.isVisible() && !kotlin.jvm.internal.i.b(goal.getType(), "checklist")) {
                    String goalId = goal.getGoalId();
                    if (goalId != null && !gv.r.J0(goalId, "custom_")) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
                z10 = false;
                if (z10) {
                    arrayList.add(next);
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                int i6 = 0;
                while (it2.hasNext()) {
                    Goal goal2 = (Goal) it2.next();
                    if ((!goal2.getTrackList().isEmpty()) && goal2.isVisible()) {
                        long time = goal2.getStartDate().getTime();
                        Utils utils = Utils.INSTANCE;
                        if (time <= utils.getTodayTimeInSeconds()) {
                            if (kotlin.jvm.internal.i.b(goal2.getType(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY)) {
                                long j10 = 1000;
                                if (goalHelper.getWeekdayOffset(goal2.getScheduledDate().getTime() * j10, utils.getTodayTimeInSeconds() * j10) == 0) {
                                    if (((Calendar) u.o2(goalHelper.getWeekOf(utils.getTodayTimeInSeconds() * j10))).getTimeInMillis() > goal2.getScheduledDate().getTime() * j10) {
                                        if (goalHelper.getWeekOf(((GoalDateObj) u.o2(goal2.getTrackList())).getDate().getTime() * j10).get(0).getTimeInMillis() >= goalHelper.getWeekOf(utils.getTodayTimeInSeconds() * j10).get(0).getTimeInMillis()) {
                                            if (goalHelper.getWeekOf(((GoalDateObj) u.o2(goal2.getTrackList())).getDate().getTime() * j10).get(0).getTimeInMillis() == goalHelper.getWeekOf(utils.getTodayTimeInSeconds() * j10).get(0).getTimeInMillis() && ((GoalDateObj) u.o2(goal2.getTrackList())).getVal() != 2) {
                                            }
                                        }
                                        i6++;
                                    }
                                }
                            } else if (kotlin.jvm.internal.i.b(goal2.getType(), Constants.GOAL_TYPE_ACTIVITY_ONCE)) {
                                if (goal2.getTrackList().get(0).getVal() != 2) {
                                    i6++;
                                }
                            } else {
                                if (((GoalDateObj) u.o2(goal2.getTrackList())).getDate().getTime() >= utils.getTodayTimeInSeconds()) {
                                    if (((GoalDateObj) u.o2(goal2.getTrackList())).getDate().getTime() == utils.getTodayTimeInSeconds() && ((GoalDateObj) u.o2(goal2.getTrackList())).getVal() != 2) {
                                    }
                                }
                                i6++;
                            }
                        }
                    }
                    long time2 = goal2.getStartDate().getTime();
                    Utils utils2 = Utils.INSTANCE;
                    if (time2 <= utils2.getTodayTimeInSeconds() && goal2.isVisible()) {
                        if (kotlin.jvm.internal.i.b(goal2.getType(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY)) {
                            long j11 = 1000;
                            if (goalHelper.getWeekdayOffset(goal2.getScheduledDate().getTime() * j11, utils2.getTodayTimeInSeconds() * j11) == 0 && ((Calendar) u.o2(goalHelper.getWeekOf(utils2.getTodayTimeInSeconds() * j11))).getTimeInMillis() > goal2.getScheduledDate().getTime() * j11) {
                            }
                        }
                        i6++;
                    }
                }
                if (i6 <= 0) {
                    z12 = true;
                }
                this.f5289z.i(new f<>(Boolean.valueOf(z12), Boolean.valueOf(z10)));
            }
        }
        z10 = false;
        this.f5289z.i(new f<>(Boolean.valueOf(z12), Boolean.valueOf(z10)));
    }
}
