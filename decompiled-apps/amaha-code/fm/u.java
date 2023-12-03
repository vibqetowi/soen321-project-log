package fm;

import com.google.firebase.auth.FirebaseAuth;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.model.GamificationModel;
import com.theinnerhour.b2b.model.GoalDateObj;
import com.theinnerhour.b2b.model.UserGamificationModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
/* compiled from: FirestoreGoalsViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.FirestoreGoalsViewModel$goalGamificationCheck$1", f = "FirestoreGoalsViewModel.kt", l = {604}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class u extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f15562u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ FirestoreGoal f15563v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ fm.a f15564w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Date f15565x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ GamificationModel f15566y;

    /* compiled from: FirestoreGoalsViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.FirestoreGoalsViewModel$goalGamificationCheck$1$1$1$1", f = "FirestoreGoalsViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<List<? extends GoalDateObj>, ls.d<? super Boolean>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public /* synthetic */ Object f15567u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ fm.a f15568v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Date f15569w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ GamificationModel f15570x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ FirestoreGoal f15571y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FirestoreGoal firestoreGoal, fm.a aVar, GamificationModel gamificationModel, Date date, ls.d dVar) {
            super(2, dVar);
            this.f15568v = aVar;
            this.f15569w = date;
            this.f15570x = gamificationModel;
            this.f15571y = firestoreGoal;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            fm.a aVar = this.f15568v;
            Date date = this.f15569w;
            a aVar2 = new a(this.f15571y, aVar, this.f15570x, date, dVar);
            aVar2.f15567u = obj;
            return aVar2;
        }

        @Override // ss.p
        public final Object invoke(List<? extends GoalDateObj> list, ls.d<? super Boolean> dVar) {
            return ((a) create(list, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            boolean z10;
            GamificationModel i6;
            Date date = this.f15569w;
            sp.b.d0(obj);
            List<GoalDateObj> list = (List) this.f15567u;
            FirestoreGoal firestoreGoal = this.f15571y;
            fm.a aVar = this.f15568v;
            aVar.getClass();
            String str = aVar.B;
            boolean z11 = true;
            try {
                ArrayList arrayList = new ArrayList();
                HashMap r = fm.a.r(list);
                GoalDateObj goalDateObj = (GoalDateObj) r.get(date);
                if (goalDateObj != null && !goalDateObj.isConsecutive3DaysHP()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    Calendar todayCalendar = Utils.INSTANCE.getTodayCalendar();
                    todayCalendar.setTime(date);
                    boolean z12 = true;
                    for (int i10 = 0; i10 < 2; i10++) {
                        todayCalendar.add(5, -1);
                        if (r.containsKey(todayCalendar.getTime())) {
                            Object obj2 = r.get(todayCalendar.getTime());
                            kotlin.jvm.internal.i.d(obj2);
                            if (!((GoalDateObj) obj2).isConsecutive3DaysHP()) {
                            }
                        }
                        z12 = false;
                    }
                    if (z12 && (i6 = aVar.i(list, date, firestoreGoal)) != null) {
                        arrayList.add(i6);
                    }
                }
                GamificationModel gamificationModel = this.f15570x;
                if (gamificationModel != null) {
                    arrayList.add(gamificationModel);
                }
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    UserGamificationModel userGamificationModel = FirebasePersistence.getInstance().getUser().getUserGamificationModel();
                    userGamificationModel.setTotalGamificationPoints(userGamificationModel.getTotalGamificationPoints() + ((GamificationModel) arrayList.get(i11)).getPoints());
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(str, e10);
            }
            try {
                if (FirebasePersistence.getInstance().getUser().getUserGamificationModel().getTotalGamificationPoints() >= 100 && !FirebasePersistence.getInstance().getUser().getUserGamificationModel().getBadges().containsKey(Constants.REACHED_100_POINTS_BADGE)) {
                    HashMap<String, String> badges = FirebasePersistence.getInstance().getUser().getUserGamificationModel().getBadges();
                    kotlin.jvm.internal.i.f(badges, "getInstance().user.userGamificationModel.badges");
                    badges.put(Constants.REACHED_100_POINTS_BADGE, Constants.BADGE_ATTAINED);
                }
                if (FirebasePersistence.getInstance().getUser().getUserGamificationModel().getTotalGamificationPoints() >= 500 && !FirebasePersistence.getInstance().getUser().getUserGamificationModel().getBadges().containsKey(Constants.REACHED_500_POINTS_BADGE)) {
                    HashMap<String, String> badges2 = FirebasePersistence.getInstance().getUser().getUserGamificationModel().getBadges();
                    kotlin.jvm.internal.i.f(badges2, "getInstance().user.userGamificationModel.badges");
                    badges2.put(Constants.REACHED_500_POINTS_BADGE, Constants.BADGE_ATTAINED);
                }
                if (FirebasePersistence.getInstance().getUser().getUserGamificationModel().getTotalGamificationPoints() >= 1000 && !FirebasePersistence.getInstance().getUser().getUserGamificationModel().getBadges().containsKey(Constants.REACHED_1000_POINTS_BADGE)) {
                    HashMap<String, String> badges3 = FirebasePersistence.getInstance().getUser().getUserGamificationModel().getBadges();
                    kotlin.jvm.internal.i.f(badges3, "getInstance().user.userGamificationModel.badges");
                    badges3.put(Constants.REACHED_1000_POINTS_BADGE, Constants.BADGE_ATTAINED);
                }
                if (!FirebasePersistence.getInstance().getUser().getUserGamificationModel().getBadges().containsKey(Constants.TRACKING_GOALS_FOR_A_WEEK_BADGE)) {
                    Calendar todayCalendar2 = Utils.INSTANCE.getTodayCalendar();
                    todayCalendar2.setTime(date);
                    HashMap r10 = fm.a.r(list);
                    for (int i12 = 0; i12 < 7; i12++) {
                        if (!r10.containsKey(todayCalendar2.getTime())) {
                            z11 = false;
                        }
                        todayCalendar2.add(5, -1);
                    }
                    if (z11) {
                        HashMap<String, String> badges4 = FirebasePersistence.getInstance().getUser().getUserGamificationModel().getBadges();
                        kotlin.jvm.internal.i.f(badges4, "getInstance().user.userGamificationModel.badges");
                        badges4.put(Constants.TRACKING_GOALS_FOR_A_WEEK_BADGE, Constants.BADGE_ATTAINED);
                    }
                }
            } catch (Exception e11) {
                LogHelper.INSTANCE.e(str, e11);
            }
            FirebasePersistence.getInstance().updateUserOnFirebase();
            return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(FirestoreGoal firestoreGoal, fm.a aVar, GamificationModel gamificationModel, Date date, ls.d dVar) {
        super(2, dVar);
        this.f15563v = firestoreGoal;
        this.f15564w = aVar;
        this.f15565x = date;
        this.f15566y = gamificationModel;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new u(this.f15563v, this.f15564w, this.f15566y, this.f15565x, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((u) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        String j02;
        Object t3;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f15562u;
        try {
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
        }
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
                t3 = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            fd.f fVar = FirebaseAuth.getInstance().f;
            if (fVar != null && (j02 = fVar.j0()) != null) {
                FirestoreGoal firestoreGoal = this.f15563v;
                fm.a aVar2 = this.f15564w;
                Date date = this.f15565x;
                GamificationModel gamificationModel = this.f15566y;
                String goalId = firestoreGoal.getGoalId();
                if (goalId != null) {
                    long time = date.getTime();
                    ((il.a) aVar2.f15170b0.getValue()).getClass();
                    long c10 = il.a.c(time);
                    ((il.a) aVar2.f15170b0.getValue()).getClass();
                    long c11 = il.a.c(c10);
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(c11);
                    calendar.clear(11);
                    calendar.clear(9);
                    calendar.clear(12);
                    calendar.clear(10);
                    calendar.clear(13);
                    calendar.clear(14);
                    calendar.add(5, -7);
                    long j10 = 1000;
                    kotlinx.coroutines.flow.r m10 = aVar2.f15183y.m(tr.r.f(new Integer(0)), goalId, j02, new Long(calendar.getTimeInMillis() / j10), new Long(c10 / j10));
                    a aVar3 = new a(firestoreGoal, aVar2, gamificationModel, date, null);
                    this.f15562u = 1;
                    t3 = ta.v.t(m10, aVar3, this);
                    if (t3 == aVar) {
                        return aVar;
                    }
                }
            }
            return hs.k.f19476a;
        }
        List list = (List) t3;
        return hs.k.f19476a;
    }
}
