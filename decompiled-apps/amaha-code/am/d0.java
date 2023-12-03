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
@ns.e(c = "com.theinnerhour.b2b.components.goals.activity.V3GoalsActivity$goalPerformUpdate$1", f = "V3GoalsActivity.kt", l = {536, 583, 635}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class d0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {
    public final /* synthetic */ boolean A;

    /* renamed from: u  reason: collision with root package name */
    public V3GoalsActivity f638u;

    /* renamed from: v  reason: collision with root package name */
    public Goal f639v;

    /* renamed from: w  reason: collision with root package name */
    public kotlin.jvm.internal.u f640w;

    /* renamed from: x  reason: collision with root package name */
    public int f641x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ String f642y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ V3GoalsActivity f643z;

    /* compiled from: V3GoalsActivity.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.goals.activity.V3GoalsActivity$goalPerformUpdate$1$2$1", f = "V3GoalsActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ V3GoalsActivity f644u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(V3GoalsActivity v3GoalsActivity, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f644u = v3GoalsActivity;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f644u, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            sp.b.d0(obj);
            int i6 = V3GoalsActivity.X;
            this.f644u.z0();
            return hs.k.f19476a;
        }
    }

    /* compiled from: V3GoalsActivity.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.goals.activity.V3GoalsActivity$goalPerformUpdate$1$2$3", f = "V3GoalsActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ V3GoalsActivity f645u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(V3GoalsActivity v3GoalsActivity, ls.d<? super b> dVar) {
            super(2, dVar);
            this.f645u = v3GoalsActivity;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new b(this.f645u, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((b) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            sp.b.d0(obj);
            int i6 = V3GoalsActivity.X;
            this.f645u.z0();
            return hs.k.f19476a;
        }
    }

    /* compiled from: V3GoalsActivity.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.goals.activity.V3GoalsActivity$goalPerformUpdate$1$2$5", f = "V3GoalsActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ V3GoalsActivity f646u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(V3GoalsActivity v3GoalsActivity, ls.d<? super c> dVar) {
            super(2, dVar);
            this.f646u = v3GoalsActivity;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new c(this.f646u, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((c) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            sp.b.d0(obj);
            int i6 = V3GoalsActivity.X;
            this.f646u.z0();
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(String str, V3GoalsActivity v3GoalsActivity, boolean z10, ls.d<? super d0> dVar) {
        super(2, dVar);
        this.f642y = str;
        this.f643z = v3GoalsActivity;
        this.A = z10;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new d0(this.f642y, this.f643z, this.A, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((d0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ArrayList<Goal> userGoals;
        Object obj2;
        Goal goal;
        kotlin.jvm.internal.u uVar;
        V3GoalsActivity v3GoalsActivity;
        boolean z10;
        GamificationModel gamificationModel;
        V3GoalsActivity v3GoalsActivity2;
        kotlin.jvm.internal.u uVar2;
        kotlin.jvm.internal.u uVar3;
        int i6;
        GamificationModel gamificationModel2;
        int i10;
        V3GoalsActivity v3GoalsActivity3;
        kotlin.jvm.internal.u uVar4;
        GamificationModel gamificationModel3;
        V3GoalsActivity v3GoalsActivity4;
        kotlin.jvm.internal.u uVar5;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i11 = this.f641x;
        Fragment fragment = null;
        int i12 = 2;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        uVar2 = this.f640w;
                        goal = this.f639v;
                        v3GoalsActivity2 = this.f638u;
                        sp.b.d0(obj);
                        uVar = uVar2;
                        v3GoalsActivity = v3GoalsActivity2;
                        ArrayList<GoalDateObj> trackList = goal.getTrackList();
                        Date date = v3GoalsActivity.O;
                        kotlin.jvm.internal.i.f(date, "this@V3GoalsActivity.displayDate");
                        trackList.add(new GoalDateObj(date, 2));
                        gamificationModel = new GamificationModel(5, Constants.GAMIFICATION_GOAL_UPDATION_TASK, Constants.getCourseName(goal.getCourseId()), Constants.getGoalName(goal.getGoalId()));
                        uVar.f23466u = true;
                        NpsPersistence.INSTANCE.incrementNpsGoalTrackCount();
                        Date date2 = v3GoalsActivity.O;
                        kotlin.jvm.internal.i.f(date2, "this@V3GoalsActivity.displayDate");
                        V3GoalsActivity.o0(v3GoalsActivity, goal, date2, gamificationModel);
                        FirebasePersistence.getInstance().updateUserOnFirebase();
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    uVar4 = this.f640w;
                    goal = this.f639v;
                    v3GoalsActivity3 = this.f638u;
                    sp.b.d0(obj);
                    i10 = 2;
                    uVar = uVar4;
                    v3GoalsActivity = v3GoalsActivity3;
                    ArrayList<GoalDateObj> trackList2 = goal.getTrackList();
                    Date date3 = v3GoalsActivity.O;
                    kotlin.jvm.internal.i.f(date3, "this@V3GoalsActivity.displayDate");
                    trackList2.add(new GoalDateObj(date3, i10));
                    gamificationModel2 = new GamificationModel(5, Constants.GAMIFICATION_GOAL_UPDATION_TASK, Constants.getCourseName(goal.getCourseId()), Constants.getGoalName(goal.getGoalId()));
                    uVar.f23466u = true;
                    NpsPersistence.INSTANCE.incrementNpsGoalTrackCount();
                    Date date4 = v3GoalsActivity.O;
                    kotlin.jvm.internal.i.f(date4, "this@V3GoalsActivity.displayDate");
                    V3GoalsActivity.o0(v3GoalsActivity, goal, date4, gamificationModel2);
                    FirebasePersistence.getInstance().updateUserOnFirebase();
                    fragment = null;
                }
            } else {
                uVar5 = this.f640w;
                goal = this.f639v;
                v3GoalsActivity4 = this.f638u;
                sp.b.d0(obj);
                uVar = uVar5;
                v3GoalsActivity = v3GoalsActivity4;
                ArrayList<GoalDateObj> trackList3 = goal.getTrackList();
                Date date5 = v3GoalsActivity.O;
                kotlin.jvm.internal.i.f(date5, "this@V3GoalsActivity.displayDate");
                trackList3.add(new GoalDateObj(date5, 2));
                gamificationModel3 = new GamificationModel(5, Constants.GAMIFICATION_GOAL_UPDATION_TASK, Constants.getCourseName(goal.getCourseId()), Constants.getGoalName(goal.getGoalId()));
                uVar.f23466u = true;
                NpsPersistence.INSTANCE.incrementNpsGoalTrackCount();
                Date date6 = v3GoalsActivity.O;
                kotlin.jvm.internal.i.f(date6, "this@V3GoalsActivity.displayDate");
                V3GoalsActivity.o0(v3GoalsActivity, goal, date6, gamificationModel3);
                FirebasePersistence.getInstance().updateUserOnFirebase();
            }
        } else {
            sp.b.d0(obj);
            User user = FirebasePersistence.getInstance().getUser();
            if (user != null && (userGoals = user.getUserGoals()) != null) {
                Iterator<T> it = userGoals.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (kotlin.jvm.internal.i.b(((Goal) obj2).getGoalId(), this.f642y)) {
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
                    v3GoalsActivity = this.f643z;
                    boolean z11 = this.A;
                    if (b10) {
                        if (goal.getTrackList().isEmpty()) {
                            long longValue = ApplicationPersistence.getInstance().getLongValue("goal_feedback_count", 0L) + 1;
                            ApplicationPersistence.getInstance().setLongValue("goal_feedback_count", longValue);
                            if (longValue >= 10) {
                                kotlinx.coroutines.scheduling.c cVar = o0.f23640a;
                                k1 k1Var = kotlinx.coroutines.internal.k.f23608a;
                                a aVar2 = new a(v3GoalsActivity, null);
                                this.f638u = v3GoalsActivity;
                                this.f639v = goal;
                                this.f640w = uVar;
                                this.f641x = 1;
                                if (ta.v.S(k1Var, aVar2, this) == aVar) {
                                    return aVar;
                                }
                                v3GoalsActivity4 = v3GoalsActivity;
                                uVar5 = uVar;
                                uVar = uVar5;
                                v3GoalsActivity = v3GoalsActivity4;
                            }
                            ArrayList<GoalDateObj> trackList32 = goal.getTrackList();
                            Date date52 = v3GoalsActivity.O;
                            kotlin.jvm.internal.i.f(date52, "this@V3GoalsActivity.displayDate");
                            trackList32.add(new GoalDateObj(date52, 2));
                            gamificationModel3 = new GamificationModel(5, Constants.GAMIFICATION_GOAL_UPDATION_TASK, Constants.getCourseName(goal.getCourseId()), Constants.getGoalName(goal.getGoalId()));
                            uVar.f23466u = true;
                            NpsPersistence.INSTANCE.incrementNpsGoalTrackCount();
                            Date date62 = v3GoalsActivity.O;
                            kotlin.jvm.internal.i.f(date62, "this@V3GoalsActivity.displayDate");
                            V3GoalsActivity.o0(v3GoalsActivity, goal, date62, gamificationModel3);
                            FirebasePersistence.getInstance().updateUserOnFirebase();
                        } else {
                            GoalDateObj goalDateObj = goal.getTrackList().get(0);
                            if (goalDateObj.getVal() != 1 && !z11) {
                                i12 = 1;
                            } else {
                                uVar.f23466u = true;
                            }
                            goalDateObj.setVal(i12);
                            CustomDate customDate = new CustomDate();
                            customDate.setTime(v3GoalsActivity.O.getTime());
                            goalDateObj.setDate(customDate);
                            gamificationModel3 = null;
                            Date date622 = v3GoalsActivity.O;
                            kotlin.jvm.internal.i.f(date622, "this@V3GoalsActivity.displayDate");
                            V3GoalsActivity.o0(v3GoalsActivity, goal, date622, gamificationModel3);
                            FirebasePersistence.getInstance().updateUserOnFirebase();
                        }
                    } else if (kotlin.jvm.internal.i.b(type, Constants.GOAL_TYPE_ACTIVITY_WEEKLY)) {
                        Calendar calendar = v3GoalsActivity.C.getWeekOf(v3GoalsActivity.O.getTime()).get(0);
                        kotlin.jvm.internal.i.f(calendar, "goalHelper.getWeekOf(thi…vity.displayDate.time)[0]");
                        Calendar calendar2 = calendar;
                        if (goal.getTrackList().size() > 0) {
                            int size = goal.getTrackList().size();
                            i6 = 0;
                            while (i6 < size) {
                                int i13 = size;
                                uVar3 = uVar;
                                if (kotlin.jvm.internal.i.b(v3GoalsActivity.C.getWeekOf(goal.getTrackList().get(i6).getDate().getTime() * 1000).get(0), calendar2)) {
                                    break;
                                }
                                i6++;
                                uVar = uVar3;
                                size = i13;
                            }
                        }
                        uVar3 = uVar;
                        i6 = -1;
                        if (i6 == -1) {
                            long longValue2 = ApplicationPersistence.getInstance().getLongValue("goal_feedback_count", 0L) + 1;
                            ApplicationPersistence.getInstance().setLongValue("goal_feedback_count", longValue2);
                            if (longValue2 >= 10) {
                                kotlinx.coroutines.scheduling.c cVar2 = o0.f23640a;
                                k1 k1Var2 = kotlinx.coroutines.internal.k.f23608a;
                                b bVar = new b(v3GoalsActivity, null);
                                this.f638u = v3GoalsActivity;
                                this.f639v = goal;
                                kotlin.jvm.internal.u uVar6 = uVar3;
                                this.f640w = uVar6;
                                i10 = 2;
                                this.f641x = 2;
                                if (ta.v.S(k1Var2, bVar, this) == aVar) {
                                    return aVar;
                                }
                                v3GoalsActivity3 = v3GoalsActivity;
                                uVar4 = uVar6;
                                uVar = uVar4;
                                v3GoalsActivity = v3GoalsActivity3;
                                ArrayList<GoalDateObj> trackList22 = goal.getTrackList();
                                Date date32 = v3GoalsActivity.O;
                                kotlin.jvm.internal.i.f(date32, "this@V3GoalsActivity.displayDate");
                                trackList22.add(new GoalDateObj(date32, i10));
                                gamificationModel2 = new GamificationModel(5, Constants.GAMIFICATION_GOAL_UPDATION_TASK, Constants.getCourseName(goal.getCourseId()), Constants.getGoalName(goal.getGoalId()));
                                uVar.f23466u = true;
                                NpsPersistence.INSTANCE.incrementNpsGoalTrackCount();
                                Date date42 = v3GoalsActivity.O;
                                kotlin.jvm.internal.i.f(date42, "this@V3GoalsActivity.displayDate");
                                V3GoalsActivity.o0(v3GoalsActivity, goal, date42, gamificationModel2);
                                FirebasePersistence.getInstance().updateUserOnFirebase();
                                fragment = null;
                            } else {
                                i10 = 2;
                                uVar = uVar3;
                                ArrayList<GoalDateObj> trackList222 = goal.getTrackList();
                                Date date322 = v3GoalsActivity.O;
                                kotlin.jvm.internal.i.f(date322, "this@V3GoalsActivity.displayDate");
                                trackList222.add(new GoalDateObj(date322, i10));
                                gamificationModel2 = new GamificationModel(5, Constants.GAMIFICATION_GOAL_UPDATION_TASK, Constants.getCourseName(goal.getCourseId()), Constants.getGoalName(goal.getGoalId()));
                                uVar.f23466u = true;
                                NpsPersistence.INSTANCE.incrementNpsGoalTrackCount();
                                Date date422 = v3GoalsActivity.O;
                                kotlin.jvm.internal.i.f(date422, "this@V3GoalsActivity.displayDate");
                                V3GoalsActivity.o0(v3GoalsActivity, goal, date422, gamificationModel2);
                                FirebasePersistence.getInstance().updateUserOnFirebase();
                                fragment = null;
                            }
                        } else {
                            kotlin.jvm.internal.u uVar7 = uVar3;
                            int i14 = 1;
                            GoalDateObj goalDateObj2 = goal.getTrackList().get(i6);
                            if (goalDateObj2.getVal() == 1 || z11) {
                                uVar7.f23466u = true;
                                i14 = 2;
                            }
                            goalDateObj2.setVal(i14);
                            CustomDate customDate2 = new CustomDate();
                            customDate2.setTime(v3GoalsActivity.O.getTime());
                            goalDateObj2.setDate(customDate2);
                            uVar = uVar7;
                            gamificationModel2 = null;
                            Date date4222 = v3GoalsActivity.O;
                            kotlin.jvm.internal.i.f(date4222, "this@V3GoalsActivity.displayDate");
                            V3GoalsActivity.o0(v3GoalsActivity, goal, date4222, gamificationModel2);
                            FirebasePersistence.getInstance().updateUserOnFirebase();
                            fragment = null;
                        }
                    } else {
                        int size2 = goal.getTrackList().size();
                        int i15 = 0;
                        while (true) {
                            if (i15 < size2) {
                                if (goal.getTrackList().get(i15).getDate().getTime() * 1000 == v3GoalsActivity.O.getTime()) {
                                    GoalDateObj goalDateObj3 = goal.getTrackList().get(i15);
                                    int i16 = 1;
                                    if (goal.getTrackList().get(i15).getVal() == 1 || z11) {
                                        uVar.f23466u = true;
                                        i16 = 2;
                                    }
                                    goalDateObj3.setVal(i16);
                                    FirebasePersistence.getInstance().updateUserOnFirebase();
                                    z10 = true;
                                } else {
                                    i15++;
                                }
                            } else {
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
                                fragment = null;
                                c cVar4 = new c(v3GoalsActivity, null);
                                this.f638u = v3GoalsActivity;
                                this.f639v = goal;
                                this.f640w = uVar;
                                this.f641x = 3;
                                if (ta.v.S(k1Var3, cVar4, this) == aVar) {
                                    return aVar;
                                }
                                v3GoalsActivity2 = v3GoalsActivity;
                                uVar2 = uVar;
                                uVar = uVar2;
                                v3GoalsActivity = v3GoalsActivity2;
                                ArrayList<GoalDateObj> trackList4 = goal.getTrackList();
                                Date date7 = v3GoalsActivity.O;
                                kotlin.jvm.internal.i.f(date7, "this@V3GoalsActivity.displayDate");
                                trackList4.add(new GoalDateObj(date7, 2));
                                gamificationModel = new GamificationModel(5, Constants.GAMIFICATION_GOAL_UPDATION_TASK, Constants.getCourseName(goal.getCourseId()), Constants.getGoalName(goal.getGoalId()));
                                uVar.f23466u = true;
                                NpsPersistence.INSTANCE.incrementNpsGoalTrackCount();
                                Date date22 = v3GoalsActivity.O;
                                kotlin.jvm.internal.i.f(date22, "this@V3GoalsActivity.displayDate");
                                V3GoalsActivity.o0(v3GoalsActivity, goal, date22, gamificationModel);
                                FirebasePersistence.getInstance().updateUserOnFirebase();
                            } else {
                                fragment = null;
                                uVar = uVar;
                                ArrayList<GoalDateObj> trackList42 = goal.getTrackList();
                                Date date72 = v3GoalsActivity.O;
                                kotlin.jvm.internal.i.f(date72, "this@V3GoalsActivity.displayDate");
                                trackList42.add(new GoalDateObj(date72, 2));
                                gamificationModel = new GamificationModel(5, Constants.GAMIFICATION_GOAL_UPDATION_TASK, Constants.getCourseName(goal.getCourseId()), Constants.getGoalName(goal.getGoalId()));
                                uVar.f23466u = true;
                                NpsPersistence.INSTANCE.incrementNpsGoalTrackCount();
                                Date date222 = v3GoalsActivity.O;
                                kotlin.jvm.internal.i.f(date222, "this@V3GoalsActivity.displayDate");
                                V3GoalsActivity.o0(v3GoalsActivity, goal, date222, gamificationModel);
                                FirebasePersistence.getInstance().updateUserOnFirebase();
                            }
                        } else {
                            fragment = null;
                            gamificationModel = null;
                            uVar = uVar;
                            Date date2222 = v3GoalsActivity.O;
                            kotlin.jvm.internal.i.f(date2222, "this@V3GoalsActivity.displayDate");
                            V3GoalsActivity.o0(v3GoalsActivity, goal, date2222, gamificationModel);
                            FirebasePersistence.getInstance().updateUserOnFirebase();
                        }
                    }
                }
            }
            return hs.k.f19476a;
        }
        V3GoalsActivity.a aVar3 = v3GoalsActivity.P;
        if (aVar3 != null) {
            fragment = aVar3.q(0);
        }
        kotlin.jvm.internal.i.e(fragment, "null cannot be cast to non-null type com.theinnerhour.b2b.components.goals.fragment.V3GoalsRegularFragment");
        Date displayDate = v3GoalsActivity.O;
        kotlin.jvm.internal.i.f(displayDate, "displayDate");
        ((cm.c0) fragment).S(displayDate);
        Bundle bundle = new Bundle();
        bundle.putBoolean("tracked", uVar.f23466u);
        bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
        bundle.putString(Constants.GOAL_ID, goal.getGoalId());
        bundle.putString(Constants.GOAL_NAME, goal.getGoalName());
        bundle.putString("type", goal.getType());
        bundle.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
        gk.a.b(bundle, "goal_track_update");
        v3GoalsActivity.p0();
        return hs.k.f19476a;
    }
}
