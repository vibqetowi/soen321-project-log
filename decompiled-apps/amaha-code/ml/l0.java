package ml;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.firebase.auth.FirebaseAuth;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.GoalDateObj;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.GoalHelper;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
/* compiled from: V3DashboardViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.V3DashboardViewModel$getGoalsStatus$2$1", f = "V3DashboardViewModel.kt", l = {709}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class l0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f25512u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f25513v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ ls.d<hs.f<Boolean, Boolean>> f25514w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ c0 f25515x;

    /* compiled from: V3DashboardViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a<T> implements kotlinx.coroutines.flow.e {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.d0 f25516u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ c0 f25517v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f25518w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ ls.d<hs.f<Boolean, Boolean>> f25519x;

        /* compiled from: V3DashboardViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.V3DashboardViewModel$getGoalsStatus$2$1$1$1$1$1", f = "V3DashboardViewModel.kt", l = {711}, m = "invokeSuspend")
        /* renamed from: ml.l0$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0415a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.f<? extends FirestoreGoal, ? extends GoalDateObj>>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public FirestoreGoal f25520u;

            /* renamed from: v  reason: collision with root package name */
            public int f25521v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ FirestoreGoal f25522w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ c0 f25523x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ String f25524y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0415a(FirestoreGoal firestoreGoal, c0 c0Var, String str, ls.d<? super C0415a> dVar) {
                super(2, dVar);
                this.f25522w = firestoreGoal;
                this.f25523x = c0Var;
                this.f25524y = str;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new C0415a(this.f25522w, this.f25523x, this.f25524y, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.f<? extends FirestoreGoal, ? extends GoalDateObj>> dVar) {
                return ((C0415a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                FirestoreGoal firestoreGoal;
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f25521v;
                if (i6 != 0) {
                    if (i6 == 1) {
                        firestoreGoal = this.f25520u;
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    FirestoreGoal firestoreGoal2 = this.f25522w;
                    String goalId = firestoreGoal2.getGoalId();
                    kotlin.jvm.internal.i.d(goalId);
                    String uid = this.f25524y;
                    kotlin.jvm.internal.i.f(uid, "uid");
                    this.f25520u = firestoreGoal2;
                    this.f25521v = 1;
                    ((fm.j0) this.f25523x.Z.getValue()).getClass();
                    obj = fm.j0.i(goalId, uid, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    firestoreGoal = firestoreGoal2;
                }
                return new hs.f(firestoreGoal, obj);
            }
        }

        /* compiled from: V3DashboardViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.V3DashboardViewModel$getGoalsStatus$2$1$1$1", f = "V3DashboardViewModel.kt", l = {712}, m = "emit")
        /* loaded from: classes2.dex */
        public static final class b extends ns.c {

            /* renamed from: u  reason: collision with root package name */
            public a f25525u;

            /* renamed from: v  reason: collision with root package name */
            public /* synthetic */ Object f25526v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ a<T> f25527w;

            /* renamed from: x  reason: collision with root package name */
            public int f25528x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(a<? super T> aVar, ls.d<? super b> dVar) {
                super(dVar);
                this.f25527w = aVar;
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                this.f25526v = obj;
                this.f25528x |= LinearLayoutManager.INVALID_OFFSET;
                return this.f25527w.b(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(kotlinx.coroutines.d0 d0Var, c0 c0Var, String str, ls.d<? super hs.f<Boolean, Boolean>> dVar) {
            this.f25516u = d0Var;
            this.f25517v = c0Var;
            this.f25518w = str;
            this.f25519x = dVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
        @Override // kotlinx.coroutines.flow.e
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object b(List<FirestoreGoal> list, ls.d<? super hs.k> dVar) {
            b bVar;
            int i6;
            a<T> aVar;
            if (dVar instanceof b) {
                bVar = (b) dVar;
                int i10 = bVar.f25528x;
                if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    bVar.f25528x = i10 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = bVar.f25526v;
                    ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
                    i6 = bVar.f25528x;
                    if (i6 == 0) {
                        if (i6 == 1) {
                            aVar = bVar.f25525u;
                            sp.b.d0(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        sp.b.d0(obj);
                        ArrayList arrayList = new ArrayList(is.i.H1(list, 10));
                        for (FirestoreGoal firestoreGoal : list) {
                            arrayList.add(ta.v.g(this.f25516u, null, new C0415a(firestoreGoal, this.f25517v, this.f25518w, null), 3));
                        }
                        bVar.f25525u = this;
                        bVar.f25528x = 1;
                        obj = ca.a.n(arrayList, bVar);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                        aVar = this;
                    }
                    aVar.f25519x.resumeWith(((GoalHelper) aVar.f25517v.f25364a0.getValue()).isPendingGoals((List) obj));
                    return hs.k.f19476a;
                }
            }
            bVar = new b(this, dVar);
            Object obj2 = bVar.f25526v;
            ms.a aVar22 = ms.a.COROUTINE_SUSPENDED;
            i6 = bVar.f25528x;
            if (i6 == 0) {
            }
            aVar.f25519x.resumeWith(((GoalHelper) aVar.f25517v.f25364a0.getValue()).isPendingGoals((List) obj2));
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l0(ls.d<? super hs.f<Boolean, Boolean>> dVar, c0 c0Var, ls.d<? super l0> dVar2) {
        super(2, dVar2);
        this.f25514w = dVar;
        this.f25515x = c0Var;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        l0 l0Var = new l0(this.f25514w, this.f25515x, dVar);
        l0Var.f25513v = obj;
        return l0Var;
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((l0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x008c A[SYNTHETIC] */
    @Override // ns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ArrayList<Goal> arrayList;
        GoalHelper goalHelper;
        boolean z10;
        hs.f fVar;
        boolean z11;
        boolean z12;
        String j02;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f25512u;
        boolean z13 = true;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.d0 d0Var = (kotlinx.coroutines.d0) this.f25513v;
            boolean K = sp.b.K();
            boolean z14 = false;
            c0 c0Var = this.f25515x;
            ls.d<hs.f<Boolean, Boolean>> dVar = this.f25514w;
            if (K) {
                fd.f fVar2 = FirebaseAuth.getInstance().f;
                if (fVar2 != null && (j02 = fVar2.j0()) != null) {
                    kotlinx.coroutines.flow.r n10 = ((fm.j0) c0Var.Z.getValue()).n(tr.r.f(new Integer(0)), j02, Utils.INSTANCE.getTodayTimeInSeconds());
                    a aVar2 = new a(d0Var, c0Var, j02, dVar);
                    this.f25512u = 1;
                    if (n10.a(aVar2, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                User user = FirebasePersistence.getInstance().getUser();
                if (user != null) {
                    arrayList = user.getUserGoals();
                } else {
                    arrayList = null;
                }
                c0Var.getClass();
                if (arrayList != null) {
                    try {
                        goalHelper = new GoalHelper();
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e(c0Var.A, e10);
                    }
                    if (arrayList.size() > 0) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : arrayList) {
                            Goal goal = (Goal) obj2;
                            if (goal.isVisible() && !kotlin.jvm.internal.i.b(goal.getType(), "checklist")) {
                                String goalId = goal.getGoalId();
                                if (goalId != null && !gv.r.J0(goalId, "custom_")) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    z11 = true;
                                    if (!z11) {
                                        arrayList2.add(obj2);
                                    }
                                }
                            }
                            z11 = false;
                            if (!z11) {
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            Iterator it = arrayList2.iterator();
                            int i10 = 0;
                            while (it.hasNext()) {
                                Goal goal2 = (Goal) it.next();
                                if ((goal2.getTrackList().isEmpty() ^ z13) && goal2.isVisible()) {
                                    long time = goal2.getStartDate().getTime();
                                    Utils utils = Utils.INSTANCE;
                                    if (time <= utils.getTodayTimeInSeconds()) {
                                        if (kotlin.jvm.internal.i.b(goal2.getType(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY)) {
                                            long j10 = 1000;
                                            if (goalHelper.getWeekdayOffset(goal2.getScheduledDate().getTime() * j10, utils.getTodayTimeInSeconds() * j10) == 0) {
                                                if (((Calendar) is.u.o2(goalHelper.getWeekOf(utils.getTodayTimeInSeconds() * j10))).getTimeInMillis() > goal2.getScheduledDate().getTime() * j10) {
                                                    if (goalHelper.getWeekOf(((GoalDateObj) is.u.o2(goal2.getTrackList())).getDate().getTime() * j10).get(0).getTimeInMillis() >= goalHelper.getWeekOf(utils.getTodayTimeInSeconds() * j10).get(0).getTimeInMillis()) {
                                                        if (goalHelper.getWeekOf(((GoalDateObj) is.u.o2(goal2.getTrackList())).getDate().getTime() * j10).get(0).getTimeInMillis() == goalHelper.getWeekOf(utils.getTodayTimeInSeconds() * j10).get(0).getTimeInMillis() && ((GoalDateObj) is.u.o2(goal2.getTrackList())).getVal() != 2) {
                                                        }
                                                    }
                                                    i10++;
                                                }
                                            }
                                        } else if (kotlin.jvm.internal.i.b(goal2.getType(), Constants.GOAL_TYPE_ACTIVITY_ONCE)) {
                                            if (goal2.getTrackList().get(0).getVal() != 2) {
                                                i10++;
                                            }
                                        } else {
                                            if (((GoalDateObj) is.u.o2(goal2.getTrackList())).getDate().getTime() >= utils.getTodayTimeInSeconds()) {
                                                if (((GoalDateObj) is.u.o2(goal2.getTrackList())).getDate().getTime() == utils.getTodayTimeInSeconds() && ((GoalDateObj) is.u.o2(goal2.getTrackList())).getVal() != 2) {
                                                }
                                            }
                                            i10++;
                                        }
                                        z13 = true;
                                    }
                                }
                                long time2 = goal2.getStartDate().getTime();
                                Utils utils2 = Utils.INSTANCE;
                                if (time2 <= utils2.getTodayTimeInSeconds() && goal2.isVisible()) {
                                    if (kotlin.jvm.internal.i.b(goal2.getType(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY)) {
                                        long j11 = 1000;
                                        if (goalHelper.getWeekdayOffset(goal2.getScheduledDate().getTime() * j11, utils2.getTodayTimeInSeconds() * j11) == 0) {
                                            if (((Calendar) is.u.o2(goalHelper.getWeekOf(utils2.getTodayTimeInSeconds() * j11))).getTimeInMillis() <= goal2.getScheduledDate().getTime() * j11) {
                                            }
                                        }
                                    }
                                    i10++;
                                }
                                z13 = true;
                            }
                            if (i10 <= 0) {
                                z14 = true;
                            }
                            z10 = true;
                            fVar = new hs.f(Boolean.valueOf(z14), Boolean.valueOf(z10));
                            dVar.resumeWith(fVar);
                        }
                    }
                    z10 = false;
                    fVar = new hs.f(Boolean.valueOf(z14), Boolean.valueOf(z10));
                    dVar.resumeWith(fVar);
                }
                fVar = null;
                dVar.resumeWith(fVar);
            }
        }
        return hs.k.f19476a;
    }
}
