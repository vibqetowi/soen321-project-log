package am;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.theinnerhour.b2b.components.goals.activity.V3GoalsActivity;
import com.theinnerhour.b2b.model.CustomDate;
import com.theinnerhour.b2b.model.GamificationModel;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.GoalDateObj;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.NpsPersistence;
import com.theinnerhour.b2b.utils.Constants;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.o0;
/* compiled from: V3GoalsActivity.kt */
@ns.e(c = "com.theinnerhour.b2b.components.goals.activity.V3GoalsActivity$customGoalPerformUpdate$1", f = "V3GoalsActivity.kt", l = {744, 792, 846}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {
    public final /* synthetic */ V3GoalsActivity A;
    public final /* synthetic */ long B;
    public final /* synthetic */ boolean C;

    /* renamed from: u  reason: collision with root package name */
    public V3GoalsActivity f628u;

    /* renamed from: v  reason: collision with root package name */
    public Goal f629v;

    /* renamed from: w  reason: collision with root package name */
    public kotlin.jvm.internal.u f630w;

    /* renamed from: x  reason: collision with root package name */
    public long f631x;

    /* renamed from: y  reason: collision with root package name */
    public int f632y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f633z;

    /* compiled from: V3GoalsActivity.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.goals.activity.V3GoalsActivity$customGoalPerformUpdate$1$2$1", f = "V3GoalsActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ V3GoalsActivity f634u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(V3GoalsActivity v3GoalsActivity, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f634u = v3GoalsActivity;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f634u, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            sp.b.d0(obj);
            int i6 = V3GoalsActivity.X;
            this.f634u.z0();
            return hs.k.f19476a;
        }
    }

    /* compiled from: V3GoalsActivity.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.goals.activity.V3GoalsActivity$customGoalPerformUpdate$1$2$3", f = "V3GoalsActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ V3GoalsActivity f635u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(V3GoalsActivity v3GoalsActivity, ls.d<? super b> dVar) {
            super(2, dVar);
            this.f635u = v3GoalsActivity;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new b(this.f635u, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((b) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            sp.b.d0(obj);
            int i6 = V3GoalsActivity.X;
            this.f635u.z0();
            return hs.k.f19476a;
        }
    }

    /* compiled from: V3GoalsActivity.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.goals.activity.V3GoalsActivity$customGoalPerformUpdate$1$2$5", f = "V3GoalsActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ V3GoalsActivity f636u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(V3GoalsActivity v3GoalsActivity, ls.d<? super c> dVar) {
            super(2, dVar);
            this.f636u = v3GoalsActivity;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new c(this.f636u, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((c) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            sp.b.d0(obj);
            int i6 = V3GoalsActivity.X;
            this.f636u.z0();
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(String str, V3GoalsActivity v3GoalsActivity, long j10, boolean z10, ls.d<? super c0> dVar) {
        super(2, dVar);
        this.f633z = str;
        this.A = v3GoalsActivity;
        this.B = j10;
        this.C = z10;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new c0(this.f633z, this.A, this.B, this.C, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((c0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x038e  */
    @Override // ns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ArrayList<Goal> userGoals;
        Object obj2;
        Goal goal;
        kotlin.jvm.internal.u uVar;
        V3GoalsActivity v3GoalsActivity;
        long j10;
        String str;
        String str2;
        ms.a aVar;
        boolean z10;
        cm.z zVar;
        GamificationModel gamificationModel;
        kotlin.jvm.internal.u uVar2;
        long j11;
        String str3;
        String str4;
        int i6;
        int i10;
        GamificationModel gamificationModel2;
        int i11;
        kotlin.jvm.internal.u uVar3;
        V3GoalsActivity v3GoalsActivity2;
        long j12;
        GamificationModel gamificationModel3;
        kotlin.jvm.internal.u uVar4;
        V3GoalsActivity v3GoalsActivity3;
        long j13;
        V3GoalsActivity.a aVar2;
        boolean z11;
        Fragment fragment;
        cm.z zVar2;
        ms.a aVar3 = ms.a.COROUTINE_SUSPENDED;
        int i12 = this.f632y;
        String str5 = Constants.GAMIFICATION_GOAL_UPDATION_TASK;
        String str6 = "this@V3GoalsActivity.displayDate";
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        j11 = this.f631x;
                        kotlin.jvm.internal.u uVar5 = this.f630w;
                        goal = this.f629v;
                        V3GoalsActivity v3GoalsActivity4 = this.f628u;
                        sp.b.d0(obj);
                        uVar2 = uVar5;
                        v3GoalsActivity = v3GoalsActivity4;
                        zVar = null;
                        str = Constants.GAMIFICATION_GOAL_UPDATION_TASK;
                        str2 = "this@V3GoalsActivity.displayDate";
                        j10 = j11;
                        uVar = uVar2;
                        ArrayList<GoalDateObj> trackList = goal.getTrackList();
                        Date date = v3GoalsActivity.O;
                        kotlin.jvm.internal.i.f(date, str2);
                        trackList.add(new GoalDateObj(date, 2, j10));
                        gamificationModel = new GamificationModel(5, str, Constants.getCourseName(goal.getCourseId()), Constants.getGoalName(goal.getGoalId()));
                        uVar.f23466u = true;
                        NpsPersistence.INSTANCE.incrementNpsGoalTrackCount();
                        Date date2 = v3GoalsActivity.O;
                        kotlin.jvm.internal.i.f(date2, str2);
                        V3GoalsActivity.o0(v3GoalsActivity, goal, date2, gamificationModel);
                        FirebasePersistence.getInstance().updateUserOnFirebase();
                        aVar2 = v3GoalsActivity.P;
                        if (aVar2 != null) {
                            z11 = true;
                            fragment = aVar2.q(1);
                        } else {
                            z11 = true;
                            fragment = zVar;
                        }
                        if (fragment instanceof cm.z) {
                            zVar2 = (cm.z) fragment;
                        } else {
                            zVar2 = zVar;
                        }
                        if (zVar2 != null) {
                            Date date3 = v3GoalsActivity.O;
                            kotlin.jvm.internal.i.f(date3, str2);
                            zVar2.O(date3);
                        }
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("tracked", uVar.f23466u);
                        if (j10 == -1) {
                            z11 = false;
                        }
                        bundle.putBoolean("timer_attempted", z11);
                        gk.a.b(bundle, "custom_goal_tracked");
                        v3GoalsActivity.p0();
                        return hs.k.f19476a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j12 = this.f631x;
                kotlin.jvm.internal.u uVar6 = this.f630w;
                goal = this.f629v;
                v3GoalsActivity2 = this.f628u;
                sp.b.d0(obj);
                uVar3 = uVar6;
                str3 = Constants.GAMIFICATION_GOAL_UPDATION_TASK;
                str4 = "this@V3GoalsActivity.displayDate";
                i11 = 2;
                j10 = j12;
                uVar = uVar3;
                v3GoalsActivity = v3GoalsActivity2;
                ArrayList<GoalDateObj> trackList2 = goal.getTrackList();
                Date date4 = v3GoalsActivity.O;
                str2 = str4;
                kotlin.jvm.internal.i.f(date4, str2);
                trackList2.add(new GoalDateObj(date4, i11, j10));
                gamificationModel2 = new GamificationModel(5, str3, Constants.getCourseName(goal.getCourseId()), Constants.getGoalName(goal.getGoalId()));
                uVar.f23466u = true;
                NpsPersistence.INSTANCE.incrementNpsGoalTrackCount();
                Date date5 = v3GoalsActivity.O;
                kotlin.jvm.internal.i.f(date5, str2);
                V3GoalsActivity.o0(v3GoalsActivity, goal, date5, gamificationModel2);
                FirebasePersistence.getInstance().updateUserOnFirebase();
                zVar = null;
                aVar2 = v3GoalsActivity.P;
                if (aVar2 != null) {
                }
                if (fragment instanceof cm.z) {
                }
                if (zVar2 != null) {
                }
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("tracked", uVar.f23466u);
                if (j10 == -1) {
                }
                bundle2.putBoolean("timer_attempted", z11);
                gk.a.b(bundle2, "custom_goal_tracked");
                v3GoalsActivity.p0();
                return hs.k.f19476a;
            }
            j13 = this.f631x;
            uVar4 = this.f630w;
            goal = this.f629v;
            v3GoalsActivity3 = this.f628u;
            sp.b.d0(obj);
            j10 = j13;
            uVar = uVar4;
            v3GoalsActivity = v3GoalsActivity3;
            ArrayList<GoalDateObj> trackList3 = goal.getTrackList();
            Date date6 = v3GoalsActivity.O;
            kotlin.jvm.internal.i.f(date6, "this@V3GoalsActivity.displayDate");
            trackList3.add(new GoalDateObj(date6, 2, j10));
            gamificationModel3 = new GamificationModel(5, Constants.GAMIFICATION_GOAL_UPDATION_TASK, Constants.getCourseName(goal.getCourseId()), Constants.getGoalName(goal.getGoalId()));
            uVar.f23466u = true;
            NpsPersistence.INSTANCE.incrementNpsGoalTrackCount();
            Date date7 = v3GoalsActivity.O;
            kotlin.jvm.internal.i.f(date7, "this@V3GoalsActivity.displayDate");
            V3GoalsActivity.o0(v3GoalsActivity, goal, date7, gamificationModel3);
            FirebasePersistence.getInstance().updateUserOnFirebase();
            str2 = "this@V3GoalsActivity.displayDate";
            zVar = null;
            aVar2 = v3GoalsActivity.P;
            if (aVar2 != null) {
            }
            if (fragment instanceof cm.z) {
            }
            if (zVar2 != null) {
            }
            Bundle bundle22 = new Bundle();
            bundle22.putBoolean("tracked", uVar.f23466u);
            if (j10 == -1) {
            }
            bundle22.putBoolean("timer_attempted", z11);
            gk.a.b(bundle22, "custom_goal_tracked");
            v3GoalsActivity.p0();
            return hs.k.f19476a;
        }
        sp.b.d0(obj);
        User user = FirebasePersistence.getInstance().getUser();
        if (user != null && (userGoals = user.getUserGoals()) != null) {
            Iterator<T> it = userGoals.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (kotlin.jvm.internal.i.b(((Goal) obj2).getGoalId(), this.f633z)) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            goal = (Goal) obj2;
            if (goal != null) {
                uVar = new kotlin.jvm.internal.u();
                String type = goal.getType();
                boolean b10 = kotlin.jvm.internal.i.b(type, Constants.GOAL_TYPE_ACTIVITY_ONCE);
                v3GoalsActivity = this.A;
                j10 = this.B;
                boolean z12 = this.C;
                if (b10) {
                    if (goal.getTrackList().isEmpty()) {
                        long longValue = ApplicationPersistence.getInstance().getLongValue("goal_feedback_count", 0L) + 1;
                        ApplicationPersistence.getInstance().setLongValue("goal_feedback_count", longValue);
                        if (longValue >= 10) {
                            kotlinx.coroutines.scheduling.c cVar = o0.f23640a;
                            k1 k1Var = kotlinx.coroutines.internal.k.f23608a;
                            a aVar4 = new a(v3GoalsActivity, null);
                            this.f628u = v3GoalsActivity;
                            this.f629v = goal;
                            this.f630w = uVar;
                            this.f631x = j10;
                            this.f632y = 1;
                            if (ta.v.S(k1Var, aVar4, this) == aVar3) {
                                return aVar3;
                            }
                            uVar4 = uVar;
                            v3GoalsActivity3 = v3GoalsActivity;
                            j13 = j10;
                            j10 = j13;
                            uVar = uVar4;
                            v3GoalsActivity = v3GoalsActivity3;
                        }
                        ArrayList<GoalDateObj> trackList32 = goal.getTrackList();
                        Date date62 = v3GoalsActivity.O;
                        kotlin.jvm.internal.i.f(date62, "this@V3GoalsActivity.displayDate");
                        trackList32.add(new GoalDateObj(date62, 2, j10));
                        gamificationModel3 = new GamificationModel(5, Constants.GAMIFICATION_GOAL_UPDATION_TASK, Constants.getCourseName(goal.getCourseId()), Constants.getGoalName(goal.getGoalId()));
                        uVar.f23466u = true;
                        NpsPersistence.INSTANCE.incrementNpsGoalTrackCount();
                        Date date72 = v3GoalsActivity.O;
                        kotlin.jvm.internal.i.f(date72, "this@V3GoalsActivity.displayDate");
                        V3GoalsActivity.o0(v3GoalsActivity, goal, date72, gamificationModel3);
                        FirebasePersistence.getInstance().updateUserOnFirebase();
                        str2 = "this@V3GoalsActivity.displayDate";
                        zVar = null;
                        aVar2 = v3GoalsActivity.P;
                        if (aVar2 != null) {
                        }
                        if (fragment instanceof cm.z) {
                        }
                        if (zVar2 != null) {
                        }
                        Bundle bundle222 = new Bundle();
                        bundle222.putBoolean("tracked", uVar.f23466u);
                        if (j10 == -1) {
                        }
                        bundle222.putBoolean("timer_attempted", z11);
                        gk.a.b(bundle222, "custom_goal_tracked");
                        v3GoalsActivity.p0();
                        return hs.k.f19476a;
                    }
                    int i13 = 1;
                    GoalDateObj goalDateObj = goal.getTrackList().get(0);
                    if (goalDateObj.getVal() == 1 || z12) {
                        uVar.f23466u = true;
                        i13 = 2;
                    }
                    goalDateObj.setVal(i13);
                    CustomDate customDate = new CustomDate();
                    customDate.setTime(v3GoalsActivity.O.getTime());
                    goalDateObj.setDate(customDate);
                    goalDateObj.setCompletionTimeInSeconds(new Long(j10));
                    gamificationModel3 = null;
                    Date date722 = v3GoalsActivity.O;
                    kotlin.jvm.internal.i.f(date722, "this@V3GoalsActivity.displayDate");
                    V3GoalsActivity.o0(v3GoalsActivity, goal, date722, gamificationModel3);
                    FirebasePersistence.getInstance().updateUserOnFirebase();
                    str2 = "this@V3GoalsActivity.displayDate";
                    zVar = null;
                    aVar2 = v3GoalsActivity.P;
                    if (aVar2 != null) {
                    }
                    if (fragment instanceof cm.z) {
                    }
                    if (zVar2 != null) {
                    }
                    Bundle bundle2222 = new Bundle();
                    bundle2222.putBoolean("tracked", uVar.f23466u);
                    if (j10 == -1) {
                    }
                    bundle2222.putBoolean("timer_attempted", z11);
                    gk.a.b(bundle2222, "custom_goal_tracked");
                    v3GoalsActivity.p0();
                    return hs.k.f19476a;
                }
                int i14 = 1000;
                if (kotlin.jvm.internal.i.b(type, Constants.GOAL_TYPE_ACTIVITY_WEEKLY)) {
                    Calendar calendar = v3GoalsActivity.C.getWeekOf(v3GoalsActivity.O.getTime()).get(0);
                    kotlin.jvm.internal.i.f(calendar, "goalHelper.getWeekOf(thi…vity.displayDate.time)[0]");
                    Calendar calendar2 = calendar;
                    if (goal.getTrackList().size() > 0) {
                        int size = goal.getTrackList().size();
                        i10 = 0;
                        while (i10 < size) {
                            str3 = str5;
                            str4 = str6;
                            if (kotlin.jvm.internal.i.b(v3GoalsActivity.C.getWeekOf(i14 * goal.getTrackList().get(i10).getDate().getTime()).get(0), calendar2)) {
                                i6 = -1;
                                break;
                            }
                            i10++;
                            str6 = str4;
                            str5 = str3;
                            i14 = 1000;
                        }
                    }
                    str3 = str5;
                    str4 = str6;
                    i6 = -1;
                    i10 = -1;
                    if (i10 == i6) {
                        long longValue2 = ApplicationPersistence.getInstance().getLongValue("goal_feedback_count", 0L) + 1;
                        ApplicationPersistence.getInstance().setLongValue("goal_feedback_count", longValue2);
                        if (longValue2 >= 10) {
                            kotlinx.coroutines.scheduling.c cVar2 = o0.f23640a;
                            k1 k1Var2 = kotlinx.coroutines.internal.k.f23608a;
                            b bVar = new b(v3GoalsActivity, null);
                            this.f628u = v3GoalsActivity;
                            this.f629v = goal;
                            this.f630w = uVar;
                            this.f631x = j10;
                            i11 = 2;
                            this.f632y = 2;
                            if (ta.v.S(k1Var2, bVar, this) == aVar3) {
                                return aVar3;
                            }
                            uVar3 = uVar;
                            v3GoalsActivity2 = v3GoalsActivity;
                            j12 = j10;
                            j10 = j12;
                            uVar = uVar3;
                            v3GoalsActivity = v3GoalsActivity2;
                            ArrayList<GoalDateObj> trackList22 = goal.getTrackList();
                            Date date42 = v3GoalsActivity.O;
                            str2 = str4;
                            kotlin.jvm.internal.i.f(date42, str2);
                            trackList22.add(new GoalDateObj(date42, i11, j10));
                            gamificationModel2 = new GamificationModel(5, str3, Constants.getCourseName(goal.getCourseId()), Constants.getGoalName(goal.getGoalId()));
                            uVar.f23466u = true;
                            NpsPersistence.INSTANCE.incrementNpsGoalTrackCount();
                            Date date52 = v3GoalsActivity.O;
                            kotlin.jvm.internal.i.f(date52, str2);
                            V3GoalsActivity.o0(v3GoalsActivity, goal, date52, gamificationModel2);
                            FirebasePersistence.getInstance().updateUserOnFirebase();
                            zVar = null;
                            aVar2 = v3GoalsActivity.P;
                            if (aVar2 != null) {
                            }
                            if (fragment instanceof cm.z) {
                            }
                            if (zVar2 != null) {
                            }
                            Bundle bundle22222 = new Bundle();
                            bundle22222.putBoolean("tracked", uVar.f23466u);
                            if (j10 == -1) {
                            }
                            bundle22222.putBoolean("timer_attempted", z11);
                            gk.a.b(bundle22222, "custom_goal_tracked");
                            v3GoalsActivity.p0();
                            return hs.k.f19476a;
                        }
                        i11 = 2;
                        ArrayList<GoalDateObj> trackList222 = goal.getTrackList();
                        Date date422 = v3GoalsActivity.O;
                        str2 = str4;
                        kotlin.jvm.internal.i.f(date422, str2);
                        trackList222.add(new GoalDateObj(date422, i11, j10));
                        gamificationModel2 = new GamificationModel(5, str3, Constants.getCourseName(goal.getCourseId()), Constants.getGoalName(goal.getGoalId()));
                        uVar.f23466u = true;
                        NpsPersistence.INSTANCE.incrementNpsGoalTrackCount();
                        Date date522 = v3GoalsActivity.O;
                        kotlin.jvm.internal.i.f(date522, str2);
                        V3GoalsActivity.o0(v3GoalsActivity, goal, date522, gamificationModel2);
                        FirebasePersistence.getInstance().updateUserOnFirebase();
                        zVar = null;
                        aVar2 = v3GoalsActivity.P;
                        if (aVar2 != null) {
                        }
                        if (fragment instanceof cm.z) {
                        }
                        if (zVar2 != null) {
                        }
                        Bundle bundle222222 = new Bundle();
                        bundle222222.putBoolean("tracked", uVar.f23466u);
                        if (j10 == -1) {
                        }
                        bundle222222.putBoolean("timer_attempted", z11);
                        gk.a.b(bundle222222, "custom_goal_tracked");
                        v3GoalsActivity.p0();
                        return hs.k.f19476a;
                    }
                    str2 = str4;
                    int i15 = 1;
                    GoalDateObj goalDateObj2 = goal.getTrackList().get(i10);
                    if (goalDateObj2.getVal() == 1 || z12) {
                        uVar.f23466u = true;
                        i15 = 2;
                    }
                    goalDateObj2.setVal(i15);
                    CustomDate customDate2 = new CustomDate();
                    customDate2.setTime(v3GoalsActivity.O.getTime());
                    goalDateObj2.setDate(customDate2);
                    goalDateObj2.setCompletionTimeInSeconds(new Long(j10));
                    gamificationModel2 = null;
                    Date date5222 = v3GoalsActivity.O;
                    kotlin.jvm.internal.i.f(date5222, str2);
                    V3GoalsActivity.o0(v3GoalsActivity, goal, date5222, gamificationModel2);
                    FirebasePersistence.getInstance().updateUserOnFirebase();
                    zVar = null;
                    aVar2 = v3GoalsActivity.P;
                    if (aVar2 != null) {
                    }
                    if (fragment instanceof cm.z) {
                    }
                    if (zVar2 != null) {
                    }
                    Bundle bundle2222222 = new Bundle();
                    bundle2222222.putBoolean("tracked", uVar.f23466u);
                    if (j10 == -1) {
                    }
                    bundle2222222.putBoolean("timer_attempted", z11);
                    gk.a.b(bundle2222222, "custom_goal_tracked");
                    v3GoalsActivity.p0();
                    return hs.k.f19476a;
                }
                str = Constants.GAMIFICATION_GOAL_UPDATION_TASK;
                str2 = "this@V3GoalsActivity.displayDate";
                int size2 = goal.getTrackList().size();
                int i16 = 0;
                while (true) {
                    if (i16 < size2) {
                        aVar = aVar3;
                        if (goal.getTrackList().get(i16).getDate().getTime() * 1000 == v3GoalsActivity.O.getTime()) {
                            GoalDateObj goalDateObj3 = goal.getTrackList().get(i16);
                            int i17 = 1;
                            if (goal.getTrackList().get(i16).getVal() == 1 || z12) {
                                uVar.f23466u = true;
                                i17 = 2;
                            }
                            goalDateObj3.setVal(i17);
                            goal.getTrackList().get(i16).setCompletionTimeInSeconds(new Long(j10));
                            FirebasePersistence.getInstance().updateUserOnFirebase();
                            z10 = true;
                        } else {
                            i16++;
                            aVar3 = aVar;
                        }
                    } else {
                        aVar = aVar3;
                        z10 = false;
                        break;
                    }
                }
                if (!z10) {
                    long longValue3 = ApplicationPersistence.getInstance().getLongValue("goal_feedback_count", 0L) + 1;
                    ApplicationPersistence.getInstance().setLongValue("goal_feedback_count", longValue3);
                    if (longValue3 >= 10) {
                        kotlinx.coroutines.scheduling.c cVar3 = o0.f23640a;
                        k1 k1Var3 = kotlinx.coroutines.internal.k.f23608a;
                        zVar = null;
                        c cVar4 = new c(v3GoalsActivity, null);
                        this.f628u = v3GoalsActivity;
                        this.f629v = goal;
                        this.f630w = uVar;
                        this.f631x = j10;
                        this.f632y = 3;
                        Object S = ta.v.S(k1Var3, cVar4, this);
                        ms.a aVar5 = aVar;
                        if (S == aVar5) {
                            return aVar5;
                        }
                        uVar2 = uVar;
                        j11 = j10;
                        j10 = j11;
                        uVar = uVar2;
                        ArrayList<GoalDateObj> trackList4 = goal.getTrackList();
                        Date date8 = v3GoalsActivity.O;
                        kotlin.jvm.internal.i.f(date8, str2);
                        trackList4.add(new GoalDateObj(date8, 2, j10));
                        gamificationModel = new GamificationModel(5, str, Constants.getCourseName(goal.getCourseId()), Constants.getGoalName(goal.getGoalId()));
                        uVar.f23466u = true;
                        NpsPersistence.INSTANCE.incrementNpsGoalTrackCount();
                        Date date22 = v3GoalsActivity.O;
                        kotlin.jvm.internal.i.f(date22, str2);
                        V3GoalsActivity.o0(v3GoalsActivity, goal, date22, gamificationModel);
                        FirebasePersistence.getInstance().updateUserOnFirebase();
                        aVar2 = v3GoalsActivity.P;
                        if (aVar2 != null) {
                        }
                        if (fragment instanceof cm.z) {
                        }
                        if (zVar2 != null) {
                        }
                        Bundle bundle22222222 = new Bundle();
                        bundle22222222.putBoolean("tracked", uVar.f23466u);
                        if (j10 == -1) {
                        }
                        bundle22222222.putBoolean("timer_attempted", z11);
                        gk.a.b(bundle22222222, "custom_goal_tracked");
                        v3GoalsActivity.p0();
                        return hs.k.f19476a;
                    }
                    zVar = null;
                    ArrayList<GoalDateObj> trackList42 = goal.getTrackList();
                    Date date82 = v3GoalsActivity.O;
                    kotlin.jvm.internal.i.f(date82, str2);
                    trackList42.add(new GoalDateObj(date82, 2, j10));
                    gamificationModel = new GamificationModel(5, str, Constants.getCourseName(goal.getCourseId()), Constants.getGoalName(goal.getGoalId()));
                    uVar.f23466u = true;
                    NpsPersistence.INSTANCE.incrementNpsGoalTrackCount();
                    Date date222 = v3GoalsActivity.O;
                    kotlin.jvm.internal.i.f(date222, str2);
                    V3GoalsActivity.o0(v3GoalsActivity, goal, date222, gamificationModel);
                    FirebasePersistence.getInstance().updateUserOnFirebase();
                    aVar2 = v3GoalsActivity.P;
                    if (aVar2 != null) {
                    }
                    if (fragment instanceof cm.z) {
                    }
                    if (zVar2 != null) {
                    }
                    Bundle bundle222222222 = new Bundle();
                    bundle222222222.putBoolean("tracked", uVar.f23466u);
                    if (j10 == -1) {
                    }
                    bundle222222222.putBoolean("timer_attempted", z11);
                    gk.a.b(bundle222222222, "custom_goal_tracked");
                    v3GoalsActivity.p0();
                    return hs.k.f19476a;
                }
                zVar = null;
                gamificationModel = null;
                Date date2222 = v3GoalsActivity.O;
                kotlin.jvm.internal.i.f(date2222, str2);
                V3GoalsActivity.o0(v3GoalsActivity, goal, date2222, gamificationModel);
                FirebasePersistence.getInstance().updateUserOnFirebase();
                aVar2 = v3GoalsActivity.P;
                if (aVar2 != null) {
                }
                if (fragment instanceof cm.z) {
                }
                if (zVar2 != null) {
                }
                Bundle bundle2222222222 = new Bundle();
                bundle2222222222.putBoolean("tracked", uVar.f23466u);
                if (j10 == -1) {
                }
                bundle2222222222.putBoolean("timer_attempted", z11);
                gk.a.b(bundle2222222222, "custom_goal_tracked");
                v3GoalsActivity.p0();
                return hs.k.f19476a;
            }
        }
        return hs.k.f19476a;
    }
}
