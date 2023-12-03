package ap;

import android.os.Bundle;
import com.appsflyer.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.model.GamificationModel;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.GoalDateObj;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.model.UserGamificationModel;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.NpsPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import com.theinnerhour.b2b.utils.Utils;
import fm.j0;
import fm.t0;
import hs.k;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.d0;
import ns.i;
import ss.p;
import ta.v;
/* compiled from: RecommendedActivitiesPlaybackViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.recommendedActivities.viewmodel.RecommendedActivitiesPlaybackViewModel$trackGoal$1", f = "RecommendedActivitiesPlaybackViewModel.kt", l = {R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, R.styleable.AppCompatTheme_viewInflaterClass, R.styleable.AppCompatTheme_windowActionModeOverlay}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c extends i implements p<d0, ls.d<? super k>, Object> {
    public final /* synthetic */ String A;

    /* renamed from: u  reason: collision with root package name */
    public Object f3378u;

    /* renamed from: v  reason: collision with root package name */
    public Object f3379v;

    /* renamed from: w  reason: collision with root package name */
    public FirestoreGoal f3380w;

    /* renamed from: x  reason: collision with root package name */
    public int f3381x;

    /* renamed from: y  reason: collision with root package name */
    public /* synthetic */ Object f3382y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ap.a f3383z;

    /* compiled from: RecommendedActivitiesPlaybackViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.recommendedActivities.viewmodel.RecommendedActivitiesPlaybackViewModel$trackGoal$1$1$1", f = "RecommendedActivitiesPlaybackViewModel.kt", l = {R.styleable.AppCompatTheme_tooltipForegroundColor}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements p<d0, ls.d<? super Boolean>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f3384u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ ap.a f3385v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ FirestoreGoal f3386w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ap.a aVar, FirestoreGoal firestoreGoal, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f3385v = aVar;
            this.f3386w = firestoreGoal;
        }

        @Override // ns.a
        public final ls.d<k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f3385v, this.f3386w, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super Boolean> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f3384u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                j0 j0Var = this.f3385v.A;
                String courseName = this.f3386w.getCourseName();
                kotlin.jvm.internal.i.d(courseName);
                this.f3384u = 1;
                j0Var.getClass();
                obj = j0.c(courseName, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    /* compiled from: RecommendedActivitiesPlaybackViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.recommendedActivities.viewmodel.RecommendedActivitiesPlaybackViewModel$trackGoal$1$1$2", f = "RecommendedActivitiesPlaybackViewModel.kt", l = {R.styleable.AppCompatTheme_tooltipFrameBackground}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends i implements p<d0, ls.d<? super Boolean>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f3387u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ ap.a f3388v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ap.a aVar, ls.d<? super b> dVar) {
            super(2, dVar);
            this.f3388v = aVar;
        }

        @Override // ns.a
        public final ls.d<k> create(Object obj, ls.d<?> dVar) {
            return new b(this.f3388v, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super Boolean> dVar) {
            return ((b) create(d0Var, dVar)).invokeSuspend(k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f3387u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                this.f3387u = 1;
                this.f3388v.getClass();
                ls.h hVar = new ls.h(ca.a.G0(this));
                ApplicationPersistence.getInstance().setLongValue("goal_feedback_count", ApplicationPersistence.getInstance().getLongValue("goal_feedback_count", 0L) + 1);
                NpsPersistence.INSTANCE.incrementNpsGoalTrackCount();
                FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
                UserGamificationModel userGamificationModel = firebasePersistence.getUser().getUserGamificationModel();
                userGamificationModel.setTotalGamificationPoints(userGamificationModel.getTotalGamificationPoints() + 5);
                if (firebasePersistence.getUser().getUserGamificationModel().getTotalGamificationPoints() >= 100 && !firebasePersistence.getUser().getUserGamificationModel().getBadges().containsKey(Constants.REACHED_100_POINTS_BADGE)) {
                    HashMap<String, String> badges = firebasePersistence.getUser().getUserGamificationModel().getBadges();
                    kotlin.jvm.internal.i.f(badges, "user.userGamificationModel.badges");
                    badges.put(Constants.REACHED_100_POINTS_BADGE, Constants.BADGE_ATTAINED);
                }
                if (firebasePersistence.getUser().getUserGamificationModel().getTotalGamificationPoints() >= 500 && !firebasePersistence.getUser().getUserGamificationModel().getBadges().containsKey(Constants.REACHED_500_POINTS_BADGE)) {
                    HashMap<String, String> badges2 = firebasePersistence.getUser().getUserGamificationModel().getBadges();
                    kotlin.jvm.internal.i.f(badges2, "user.userGamificationModel.badges");
                    badges2.put(Constants.REACHED_500_POINTS_BADGE, Constants.BADGE_ATTAINED);
                }
                if (firebasePersistence.getUser().getUserGamificationModel().getTotalGamificationPoints() >= 1000 && !firebasePersistence.getUser().getUserGamificationModel().getBadges().containsKey(Constants.REACHED_1000_POINTS_BADGE)) {
                    HashMap<String, String> badges3 = firebasePersistence.getUser().getUserGamificationModel().getBadges();
                    kotlin.jvm.internal.i.f(badges3, "user.userGamificationModel.badges");
                    badges3.put(Constants.REACHED_1000_POINTS_BADGE, Constants.BADGE_ATTAINED);
                }
                firebasePersistence.updateUserOnFirebase();
                hVar.resumeWith(Boolean.TRUE);
                obj = hVar.b();
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ap.a aVar, String str, ls.d<? super c> dVar) {
        super(2, dVar);
        this.f3383z = aVar;
        this.A = str;
    }

    @Override // ns.a
    public final ls.d<k> create(Object obj, ls.d<?> dVar) {
        c cVar = new c(this.f3383z, this.A, dVar);
        cVar.f3382y = obj;
        return cVar;
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
        return ((c) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01bc  */
    @Override // ns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        d0 d0Var;
        ArrayList<Goal> userGoals;
        Object obj2;
        String str;
        boolean z10;
        boolean z11;
        boolean z12;
        GamificationModel gamificationModel;
        String str2;
        String str3;
        int i6;
        int i10;
        Object k10;
        d0 d0Var2;
        String str4;
        String str5;
        Object b10;
        FirestoreGoal firestoreGoal;
        FirestoreGoal firestoreGoal2;
        String str6;
        FirestoreGoal firestoreGoal3;
        ap.a aVar;
        j0 j0Var;
        String goalId;
        GoalDateObj goalDateObj;
        String a10;
        boolean z13;
        FirestoreGoal firestoreGoal4;
        String str7;
        ap.a aVar2;
        ms.a aVar3 = ms.a.COROUTINE_SUSPENDED;
        int i11 = this.f3381x;
        String str8 = "type";
        String str9 = this.A;
        ap.a aVar4 = this.f3383z;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            firestoreGoal4 = (FirestoreGoal) this.f3379v;
                            str7 = (String) this.f3378u;
                            aVar2 = (ap.a) this.f3382y;
                            sp.b.d0(obj);
                            str4 = "goal_track_update";
                            str5 = "version";
                            z13 = true;
                            aVar2.f3366y.i(new SingleUseEvent<>(Boolean.TRUE));
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("tracked", z13);
                            bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                            bundle.putString(Constants.GOAL_ID, str7);
                            bundle.putString(Constants.GOAL_NAME, firestoreGoal4.getGoalName());
                            bundle.putString("type", firestoreGoal4.getType());
                            bundle.putString(str5, FirebasePersistence.getInstance().getUser().getVersion());
                            gk.a.b(bundle, str4);
                            aVar2.f3367z.i(new SingleUseEvent<>(Boolean.FALSE));
                            return k.f19476a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    firestoreGoal3 = (FirestoreGoal) this.f3379v;
                    str9 = (String) this.f3378u;
                    aVar = (ap.a) this.f3382y;
                    sp.b.d0(obj);
                    str4 = "goal_track_update";
                    str5 = "version";
                    firestoreGoal2 = firestoreGoal3;
                    str6 = str9;
                    aVar4 = aVar;
                    j0Var = aVar4.A;
                    goalId = firestoreGoal2.getGoalId();
                    Date date = new Date();
                    date.setTime(Utils.INSTANCE.getTodayCalendar().getTime().getTime());
                    k kVar = k.f19476a;
                    goalDateObj = new GoalDateObj(date, 2);
                    a10 = FirebaseAuth.getInstance().a();
                    kotlin.jvm.internal.i.d(a10);
                    this.f3382y = aVar4;
                    this.f3378u = str6;
                    this.f3379v = firestoreGoal2;
                    this.f3380w = null;
                    this.f3381x = 4;
                    z13 = true;
                    if (j0Var.p(goalId, goalDateObj, a10, null, this) == aVar3) {
                        return aVar3;
                    }
                    firestoreGoal4 = firestoreGoal2;
                    str7 = str6;
                    aVar2 = aVar4;
                    aVar2.f3366y.i(new SingleUseEvent<>(Boolean.TRUE));
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("tracked", z13);
                    bundle2.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                    bundle2.putString(Constants.GOAL_ID, str7);
                    bundle2.putString(Constants.GOAL_NAME, firestoreGoal4.getGoalName());
                    bundle2.putString("type", firestoreGoal4.getType());
                    bundle2.putString(str5, FirebasePersistence.getInstance().getUser().getVersion());
                    gk.a.b(bundle2, str4);
                    aVar2.f3367z.i(new SingleUseEvent<>(Boolean.FALSE));
                    return k.f19476a;
                }
                FirestoreGoal firestoreGoal5 = this.f3380w;
                str9 = (String) this.f3379v;
                aVar4 = (ap.a) this.f3378u;
                d0Var2 = (d0) this.f3382y;
                sp.b.d0(obj);
                firestoreGoal = firestoreGoal5;
                str4 = "goal_track_update";
                str5 = "version";
                b10 = obj;
                if (((GoalDateObj) b10) != null) {
                    List P0 = ca.a.P0(v.g(d0Var2, null, new a(aVar4, firestoreGoal, null), 3), v.g(d0Var2, null, new b(aVar4, null), 3));
                    this.f3382y = aVar4;
                    this.f3378u = str9;
                    this.f3379v = firestoreGoal;
                    this.f3380w = null;
                    this.f3381x = 3;
                    if (ca.a.n(P0, this) == aVar3) {
                        return aVar3;
                    }
                    firestoreGoal3 = firestoreGoal;
                    aVar = aVar4;
                    firestoreGoal2 = firestoreGoal3;
                    str6 = str9;
                    aVar4 = aVar;
                    j0Var = aVar4.A;
                    goalId = firestoreGoal2.getGoalId();
                    Date date2 = new Date();
                    date2.setTime(Utils.INSTANCE.getTodayCalendar().getTime().getTime());
                    k kVar2 = k.f19476a;
                    goalDateObj = new GoalDateObj(date2, 2);
                    a10 = FirebaseAuth.getInstance().a();
                    kotlin.jvm.internal.i.d(a10);
                    this.f3382y = aVar4;
                    this.f3378u = str6;
                    this.f3379v = firestoreGoal2;
                    this.f3380w = null;
                    this.f3381x = 4;
                    z13 = true;
                    if (j0Var.p(goalId, goalDateObj, a10, null, this) == aVar3) {
                    }
                } else {
                    firestoreGoal2 = firestoreGoal;
                    str6 = str9;
                    j0Var = aVar4.A;
                    goalId = firestoreGoal2.getGoalId();
                    Date date22 = new Date();
                    date22.setTime(Utils.INSTANCE.getTodayCalendar().getTime().getTime());
                    k kVar22 = k.f19476a;
                    goalDateObj = new GoalDateObj(date22, 2);
                    a10 = FirebaseAuth.getInstance().a();
                    kotlin.jvm.internal.i.d(a10);
                    this.f3382y = aVar4;
                    this.f3378u = str6;
                    this.f3379v = firestoreGoal2;
                    this.f3380w = null;
                    this.f3381x = 4;
                    z13 = true;
                    if (j0Var.p(goalId, goalDateObj, a10, null, this) == aVar3) {
                    }
                }
            } else {
                d0Var = (d0) this.f3382y;
                sp.b.d0(obj);
                k10 = obj;
            }
        } else {
            sp.b.d0(obj);
            d0Var = (d0) this.f3382y;
            if (!aVar4.E) {
                String str10 = "goal_track_update";
                User user = FirebasePersistence.getInstance().getUser();
                if (user != null && (userGoals = user.getUserGoals()) != null) {
                    Iterator<T> it = userGoals.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (kotlin.jvm.internal.i.b(((Goal) obj2).getGoalId(), str9)) {
                                break;
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                    Goal goal = (Goal) obj2;
                    if (goal != null) {
                        int size = goal.getTrackList().size();
                        int i12 = 0;
                        while (true) {
                            if (i12 < size) {
                                str = str10;
                                if (goal.getTrackList().get(i12).getDate().getTime() * 1000 == Utils.INSTANCE.getTodayCalendar().getTime().getTime()) {
                                    goal.getTrackList().get(i12).setVal(2);
                                    FirebasePersistence.getInstance().updateUserOnFirebase();
                                    z10 = true;
                                    z11 = true;
                                    break;
                                }
                                i12++;
                                str10 = str;
                            } else {
                                str = str10;
                                z10 = false;
                                z11 = false;
                                break;
                            }
                        }
                        if (!z11) {
                            ArrayList<GoalDateObj> trackList = goal.getTrackList();
                            Date time = Utils.INSTANCE.getTodayCalendar().getTime();
                            kotlin.jvm.internal.i.f(time, "Utils.todayCalendar.time");
                            trackList.add(new GoalDateObj(time, 2));
                            gamificationModel = new GamificationModel(5, Constants.GAMIFICATION_GOAL_UPDATION_TASK, Constants.getCourseName(goal.getCourseId()), Constants.getGoalName(goal.getGoalId()));
                            NpsPersistence.INSTANCE.incrementNpsGoalTrackCount();
                            z12 = true;
                        } else {
                            z12 = z10;
                            gamificationModel = null;
                        }
                        Utils utils = Utils.INSTANCE;
                        Date time2 = utils.getTodayCalendar().getTime();
                        kotlin.jvm.internal.i.f(time2, "Utils.todayCalendar.time");
                        try {
                            ArrayList<GamificationModel> arrayList = new ArrayList<>();
                            HashMap<Date, GoalDateObj> goalDateObjMap = goal.getGoalDateObjMap();
                            GoalDateObj goalDateObj2 = goalDateObjMap.get(time2);
                            kotlin.jvm.internal.i.d(goalDateObj2);
                            if (goalDateObj2.isConsecutive3DaysHP()) {
                                str2 = "version";
                                str3 = "type";
                            } else {
                                Calendar todayCalendar = utils.getTodayCalendar();
                                todayCalendar.setTime(time2);
                                str2 = "version";
                                int i13 = 0;
                                boolean z14 = true;
                                for (int i14 = 2; i13 < i14; i14 = 2) {
                                    str3 = str8;
                                    try {
                                        todayCalendar.add(5, -1);
                                        if (goalDateObjMap.containsKey(todayCalendar.getTime())) {
                                            GoalDateObj goalDateObj3 = goalDateObjMap.get(todayCalendar.getTime());
                                            kotlin.jvm.internal.i.d(goalDateObj3);
                                            if (!goalDateObj3.isConsecutive3DaysHP()) {
                                                i13++;
                                                str8 = str3;
                                            }
                                        }
                                        z14 = false;
                                        i13++;
                                        str8 = str3;
                                    } catch (Exception e10) {
                                        e = e10;
                                        LogHelper.INSTANCE.e(e);
                                        FirebasePersistence.getInstance().updateUserOnFirebase();
                                        aVar4.f3366y.i(new SingleUseEvent<>(Boolean.TRUE));
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putBoolean("tracked", z12);
                                        bundle3.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                                        bundle3.putString(Constants.GOAL_ID, goal.getGoalId());
                                        bundle3.putString(Constants.GOAL_NAME, goal.getGoalName());
                                        bundle3.putString(str3, goal.getType());
                                        bundle3.putString(str2, FirebasePersistence.getInstance().getUser().getVersion());
                                        gk.a.b(bundle3, str);
                                        return k.f19476a;
                                    }
                                }
                                str3 = str8;
                                if (z14) {
                                    Calendar todayCalendar2 = Utils.INSTANCE.getTodayCalendar();
                                    todayCalendar2.setTime(time2);
                                    for (int i15 = 0; i15 < 3; i15++) {
                                        Iterator<GoalDateObj> it2 = goal.getTrackList().iterator();
                                        while (it2.hasNext()) {
                                            GoalDateObj next = it2.next();
                                            if (next.getmDate().getTime() == todayCalendar2.getTime().getTime()) {
                                                next.setConsecutive3DaysHP(true);
                                            }
                                        }
                                        todayCalendar2.add(5, -1);
                                    }
                                    GamificationModel gamificationModel2 = new GamificationModel(20, Constants.GAMIFICATION_GOAL_3DAYS_COMPLETITION_TASK, FirebasePersistence.getInstance().getUser().getCurrentCourseName(), Constants.getGoalName(goal.getGoalId()));
                                    goal.getGoalgamificationList().add(gamificationModel2);
                                    arrayList.add(gamificationModel2);
                                }
                            }
                            if (gamificationModel != null) {
                                goal.getGoalgamificationList().add(gamificationModel);
                                arrayList.add(gamificationModel);
                            }
                            FirebasePersistence.getInstance().addUserGamificationPointsToFirebase(arrayList);
                            if (!FirebasePersistence.getInstance().getUser().getUserGamificationModel().getBadges().containsKey(Constants.TRACKING_GOALS_FOR_A_WEEK_BADGE)) {
                                Calendar todayCalendar3 = Utils.INSTANCE.getTodayCalendar();
                                todayCalendar3.setTime(time2);
                                HashMap<Date, GoalDateObj> goalDateObjMap2 = goal.getGoalDateObjMap();
                                boolean z15 = true;
                                for (int i16 = 0; i16 < 7; i16++) {
                                    if (!goalDateObjMap2.containsKey(todayCalendar3.getTime())) {
                                        i6 = -1;
                                        i10 = 5;
                                        z15 = false;
                                    } else {
                                        i6 = -1;
                                        i10 = 5;
                                    }
                                    todayCalendar3.add(i10, i6);
                                }
                                if (z15) {
                                    HashMap<String, String> badges = FirebasePersistence.getInstance().getUser().getUserGamificationModel().getBadges();
                                    kotlin.jvm.internal.i.f(badges, "getInstance().user.userGamificationModel.badges");
                                    badges.put(Constants.TRACKING_GOALS_FOR_A_WEEK_BADGE, Constants.BADGE_ATTAINED);
                                }
                            }
                        } catch (Exception e11) {
                            e = e11;
                            str2 = "version";
                            str3 = "type";
                        }
                        FirebasePersistence.getInstance().updateUserOnFirebase();
                        aVar4.f3366y.i(new SingleUseEvent<>(Boolean.TRUE));
                        Bundle bundle32 = new Bundle();
                        bundle32.putBoolean("tracked", z12);
                        bundle32.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                        bundle32.putString(Constants.GOAL_ID, goal.getGoalId());
                        bundle32.putString(Constants.GOAL_NAME, goal.getGoalName());
                        bundle32.putString(str3, goal.getType());
                        bundle32.putString(str2, FirebasePersistence.getInstance().getUser().getVersion());
                        gk.a.b(bundle32, str);
                    }
                }
                return k.f19476a;
            }
            aVar4.f3367z.i(new SingleUseEvent<>(Boolean.TRUE));
            String a11 = FirebaseAuth.getInstance().a();
            if (a11 == null) {
                return k.f19476a;
            }
            this.f3382y = d0Var;
            this.f3381x = 1;
            k10 = aVar4.A.k(str9, a11, this);
            if (k10 == aVar3) {
                return aVar3;
            }
        }
        d0Var2 = d0Var;
        FirestoreGoal firestoreGoal6 = (FirestoreGoal) k10;
        if (firestoreGoal6 != null) {
            j0 j0Var2 = aVar4.A;
            String a12 = FirebaseAuth.getInstance().a();
            kotlin.jvm.internal.i.d(a12);
            str4 = "goal_track_update";
            str5 = "version";
            this.f3382y = d0Var2;
            this.f3378u = aVar4;
            this.f3379v = str9;
            this.f3380w = firestoreGoal6;
            this.f3381x = 2;
            j0Var2.getClass();
            ls.h hVar = new ls.h(ca.a.G0(this));
            FirebaseFirestore.d().b(Constants.USER_DATA_COLLECTION).q(a12).b(Constants.USER_GOALS_DATA).q(str9).b(Constants.USER_GOALS_TRACK_DATA).m(new Long(Utils.INSTANCE.getTodayCalendar().getTime().getTime() / 1000), "date.time").a().addOnCompleteListener(new t0(hVar));
            b10 = hVar.b();
            if (b10 == aVar3) {
                return aVar3;
            }
            firestoreGoal = firestoreGoal6;
            if (((GoalDateObj) b10) != null) {
            }
        }
        return k.f19476a;
    }
}
