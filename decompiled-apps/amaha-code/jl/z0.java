package jl;

import android.content.Context;
import com.google.firebase.database.core.ValidationPath;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardViewModel;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.model.TemplateModel;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import com.theinnerhour.b2b.utils.FireStoreUtilsKt;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
/* compiled from: NotV4DashboardViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardViewModel$checkForTopical$1", f = "NotV4DashboardViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class z0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ NotV4DashboardViewModel f22444u;

    /* compiled from: NotV4DashboardViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a implements CustomRetrofitCallback<sf.m> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ NotV4DashboardViewModel f22445u;

        /* compiled from: NotV4DashboardViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardViewModel$checkForTopical$1$1$onResponse$1$1$1", f = "NotV4DashboardViewModel.kt", l = {1004}, m = "invokeSuspend")
        /* renamed from: jl.z0$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0335a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public Iterator f22446u;

            /* renamed from: v  reason: collision with root package name */
            public Iterator f22447v;

            /* renamed from: w  reason: collision with root package name */
            public int f22448w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ User f22449x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ kotlin.jvm.internal.u f22450y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ NotV4DashboardViewModel f22451z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0335a(User user, kotlin.jvm.internal.u uVar, NotV4DashboardViewModel notV4DashboardViewModel, ls.d<? super C0335a> dVar) {
                super(2, dVar);
                this.f22449x = user;
                this.f22450y = uVar;
                this.f22451z = notV4DashboardViewModel;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new C0335a(this.f22449x, this.f22450y, this.f22451z, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
                return ((C0335a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x002f -> B:12:0x003d). Please submit an issue!!! */
            @Override // ns.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Iterator<MiniCourse> it;
                C0335a c0335a;
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f22448w;
                if (i6 != 0) {
                    if (i6 == 1) {
                        Iterator<CourseDayModelV1> it2 = this.f22447v;
                        it = this.f22446u;
                        sp.b.d0(obj);
                        c0335a = this;
                        while (it2.hasNext()) {
                            String content_id = it2.next().getContent_id();
                            if (content_id != null) {
                                c0335a.f22450y.f23466u = true;
                                cn.t tVar = c0335a.f22451z.f10868z;
                                c0335a.f22446u = it;
                                c0335a.f22447v = it2;
                                c0335a.f22448w = 1;
                                if (tVar.c(content_id, c0335a) == aVar) {
                                    return aVar;
                                }
                            }
                        }
                        if (it.hasNext()) {
                            it2 = it.next().getPlan().iterator();
                            while (it2.hasNext()) {
                            }
                            if (it.hasNext()) {
                                if (c0335a.f22450y.f23466u) {
                                    c0335a.f22451z.f10864m0.i(Boolean.TRUE);
                                }
                                return hs.k.f19476a;
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    it = this.f22449x.getTopicalCourseList().iterator();
                    c0335a = this;
                    if (it.hasNext()) {
                    }
                }
            }
        }

        /* compiled from: NotV4DashboardViewModel.kt */
        /* loaded from: classes2.dex */
        public static final class b extends kotlin.jvm.internal.k implements ss.p<Boolean, TemplateModel, hs.k> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ Goal f22452u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Goal goal) {
                super(2);
                this.f22452u = goal;
            }

            @Override // ss.p
            public final hs.k invoke(Boolean bool, TemplateModel templateModel) {
                boolean z10;
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                boolean booleanValue = bool.booleanValue();
                TemplateModel templateModel2 = templateModel;
                Goal goal = this.f22452u;
                if (booleanValue && templateModel2 != null) {
                    String reminderTitle = templateModel2.getReminderTitle();
                    boolean z11 = false;
                    if (reminderTitle != null && !gv.n.B0(reminderTitle)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        String reminderBody = templateModel2.getReminderBody();
                        if (reminderBody != null && !gv.n.B0(reminderBody)) {
                            z11 = true;
                        }
                        if (z11) {
                            Utils utils = Utils.INSTANCE;
                            MyApplication a10 = MyApplication.V.a();
                            long time = goal.getScheduledDate().getTime() * 1000;
                            String type = goal.getType();
                            if (type == null) {
                                str = "";
                            } else {
                                str = type;
                            }
                            String goalId = goal.getGoalId();
                            if (goalId == null) {
                                str2 = "";
                            } else {
                                str2 = goalId;
                            }
                            String goalName = goal.getGoalName();
                            if (goalName == null) {
                                str3 = "";
                            } else {
                                str3 = goalName;
                            }
                            String courseName = goal.getCourseName();
                            if (courseName == null) {
                                str4 = "";
                            } else {
                                str4 = courseName;
                            }
                            String reminderTitle2 = templateModel2.getReminderTitle();
                            if (reminderTitle2 == null) {
                                str5 = "";
                            } else {
                                str5 = reminderTitle2;
                            }
                            String reminderBody2 = templateModel2.getReminderBody();
                            if (reminderBody2 == null) {
                                str6 = "";
                            } else {
                                str6 = reminderBody2;
                            }
                            utils.updateV3ActivityNotification(a10, false, time, str, str2, str3, str4, str5, str6);
                            return hs.k.f19476a;
                        }
                    }
                }
                String goalId2 = goal.getGoalId();
                kotlin.jvm.internal.i.d(goalId2);
                FireStoreUtilsKt.fetchCourseContent("en", goalId2, new a1(goal));
                return hs.k.f19476a;
            }
        }

        public a(NotV4DashboardViewModel notV4DashboardViewModel) {
            this.f22445u = notV4DashboardViewModel;
        }

        @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
        public final void onFailure(dw.b<sf.m> call, Throwable t3) {
            kotlin.jvm.internal.i.g(call, "call");
            kotlin.jvm.internal.i.g(t3, "t");
            LogHelper.INSTANCE.e(this.f22445u.A, "https://api.theinnerhour.com/v1/new_topical", t3);
        }

        @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
        public final void onResponse(dw.b<sf.m> call, dw.z<sf.m> response) {
            sf.m mVar;
            String mVar2;
            boolean z10;
            NotV4DashboardViewModel notV4DashboardViewModel = this.f22445u;
            kotlin.jvm.internal.i.g(call, "call");
            kotlin.jvm.internal.i.g(response, "response");
            try {
                CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
                if (response.a() && (mVar = response.f13696b) != null && (mVar2 = mVar.toString()) != null) {
                    JSONObject jSONObject = new JSONObject(mVar2);
                    long optLong = jSONObject.optLong("fetch_end");
                    long optLong2 = jSONObject.optLong("plan_end");
                    ApplicationPersistence.getInstance().setLongValue("2022_topical_fetch_end", optLong);
                    ApplicationPersistence.getInstance().setLongValue("2022_topical_plan_end", optLong2);
                    if (optLong2 > Calendar.getInstance().getTimeInMillis()) {
                        ApplicationPersistence.getInstance().setBooleanValue("2022_topical_card_remove", false);
                        NotV4DashboardViewModel.e(notV4DashboardViewModel, NotV4DashboardViewModel.f(notV4DashboardViewModel));
                        return;
                    }
                    long days = TimeUnit.MILLISECONDS.toDays(Calendar.getInstance().getTimeInMillis() - optLong2);
                    if (days > 5) {
                        User user = FirebasePersistence.getInstance().getUser();
                        ta.v.H(kc.f.H(notV4DashboardViewModel), null, 0, new C0335a(user, new kotlin.jvm.internal.u(), notV4DashboardViewModel, null), 3);
                        if (user.getTopicalCourseList().size() > 0) {
                            user.setTopicalCourseList(new ArrayList<>());
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (user.getTopicalCourse() != null) {
                            user.setTopicalCourse(null);
                            z10 = true;
                        }
                        if (user.getTopicalGoals().size() > 0) {
                            user.setTopicalGoals(new ArrayList<>());
                            z10 = true;
                        }
                        ArrayList<Goal> userGoals = user.getUserGoals();
                        kotlin.jvm.internal.i.f(userGoals, "user.userGoals");
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : userGoals) {
                            if (!kotlin.jvm.internal.i.b(((Goal) obj).getCourseId(), Constants.LIBRARY_GOAL_COURSE_ID)) {
                                arrayList.add(obj);
                            }
                        }
                        if (arrayList.size() != user.getUserGoals().size()) {
                            user.setUserGoals(new ArrayList<>(arrayList));
                            z10 = true;
                        }
                        if (z10) {
                            FirebasePersistence.getInstance().updateUserOnFirebase();
                            UtilsKt.fireAnalytics("topical_course_remove", UtilsKt.getAnalyticsBundle());
                        }
                    }
                    if (days > 4) {
                        Iterator<Goal> it = FirebasePersistence.getInstance().getUser().getUserGoals().iterator();
                        while (it.hasNext()) {
                            Goal next = it.next();
                            if (kotlin.jvm.internal.i.b(next.getCourseId(), Constants.LIBRARY_GOAL_COURSE_ID) && next.getScheduledDate().getTime() != 0) {
                                if (!kotlin.jvm.internal.i.b(next.getType(), "physical_activity") && !kotlin.jvm.internal.i.b(next.getType(), Constants.GOAL_TYPE_RELAXATION_ACTIVITY)) {
                                    if (kotlin.jvm.internal.i.b(next.getType(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY) || kotlin.jvm.internal.i.b(next.getType(), Constants.GOAL_TYPE_ACTIVITY_DAILY) || kotlin.jvm.internal.i.b(next.getType(), Constants.GOAL_TYPE_DAILY_ACTIVITY)) {
                                        String goalId = next.getGoalId();
                                        kotlin.jvm.internal.i.d(goalId);
                                        FireStoreUtilsKt.fetchCourseContentV3("en", goalId, new b(next));
                                    }
                                }
                                Utils utils = Utils.INSTANCE;
                                Context applicationContext = notV4DashboardViewModel.f2382x.getApplicationContext();
                                kotlin.jvm.internal.i.f(applicationContext, "getApplication<Application>().applicationContext");
                                long time = next.getmStartDate().getTime();
                                long time2 = next.getmScheduleDate().getTime();
                                String type = next.getType();
                                kotlin.jvm.internal.i.d(type);
                                String goalId2 = next.getGoalId();
                                kotlin.jvm.internal.i.d(goalId2);
                                String courseName = next.getCourseName();
                                kotlin.jvm.internal.i.d(courseName);
                                String goalName = next.getGoalName();
                                kotlin.jvm.internal.i.d(goalName);
                                Utils.updateActivityNotification$default(utils, applicationContext, false, time, time2, type, goalId2, courseName, goalName, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
                            }
                        }
                    }
                    if (!ApplicationPersistence.getInstance().getBooleanValue("2022_topical_card_remove", false)) {
                        notV4DashboardViewModel.f10863l0.i(Boolean.TRUE);
                        ApplicationPersistence.getInstance().setBooleanValue("2022_topical_card_remove", true);
                    }
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(notV4DashboardViewModel.A, e10);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(NotV4DashboardViewModel notV4DashboardViewModel, ls.d<? super z0> dVar) {
        super(2, dVar);
        this.f22444u = notV4DashboardViewModel;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new z0(this.f22444u, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((z0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        sp.b.d0(obj);
        ((or.k) nr.b.a(or.k.class)).a("https://api.theinnerhour.com/v1/new_topical").I(new a(this.f22444u));
        return hs.k.f19476a;
    }
}
