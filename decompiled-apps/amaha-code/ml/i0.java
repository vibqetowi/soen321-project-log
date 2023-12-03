package ml;

import android.content.Context;
import com.google.firebase.database.core.ValidationPath;
import com.theinnerhour.b2b.MyApplication;
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
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import ll.a;
import org.json.JSONObject;
/* compiled from: V3DashboardViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.V3DashboardViewModel$fetchTopicalStatus$1", f = "V3DashboardViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class i0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ c0 f25475u;

    /* compiled from: V3DashboardViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a implements CustomRetrofitCallback<sf.m> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ c0 f25476u;

        /* compiled from: V3DashboardViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.V3DashboardViewModel$fetchTopicalStatus$1$1$onResponse$1$1$1", f = "V3DashboardViewModel.kt", l = {1197}, m = "invokeSuspend")
        /* renamed from: ml.i0$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0414a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public Iterator f25477u;

            /* renamed from: v  reason: collision with root package name */
            public Iterator f25478v;

            /* renamed from: w  reason: collision with root package name */
            public int f25479w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ User f25480x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ c0 f25481y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0414a(User user, c0 c0Var, ls.d<? super C0414a> dVar) {
                super(2, dVar);
                this.f25480x = user;
                this.f25481y = c0Var;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new C0414a(this.f25480x, this.f25481y, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
                return ((C0414a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x002f -> B:12:0x003d). Please submit an issue!!! */
            @Override // ns.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Iterator<MiniCourse> it;
                C0414a c0414a;
                cn.t tVar;
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f25479w;
                if (i6 != 0) {
                    if (i6 == 1) {
                        Iterator<CourseDayModelV1> it2 = this.f25478v;
                        it = this.f25477u;
                        sp.b.d0(obj);
                        c0414a = this;
                        while (it2.hasNext()) {
                            String content_id = it2.next().getContent_id();
                            if (content_id != null && (tVar = c0414a.f25481y.f25369z) != null) {
                                c0414a.f25477u = it;
                                c0414a.f25478v = it2;
                                c0414a.f25479w = 1;
                                if (tVar.c(content_id, c0414a) == aVar) {
                                    return aVar;
                                }
                            }
                        }
                        if (it.hasNext()) {
                            it2 = it.next().getPlan().iterator();
                            while (it2.hasNext()) {
                            }
                            if (it.hasNext()) {
                                return hs.k.f19476a;
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    it = this.f25480x.getTopicalCourseList().iterator();
                    c0414a = this;
                    if (it.hasNext()) {
                    }
                }
            }
        }

        /* compiled from: V3DashboardViewModel.kt */
        /* loaded from: classes2.dex */
        public static final class b extends kotlin.jvm.internal.k implements ss.p<Boolean, TemplateModel, hs.k> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ Goal f25482u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Goal goal) {
                super(2);
                this.f25482u = goal;
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
                Goal goal = this.f25482u;
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
                FireStoreUtilsKt.fetchCourseContent("en", goalId2, new j0(goal));
                return hs.k.f19476a;
            }
        }

        public a(c0 c0Var) {
            this.f25476u = c0Var;
        }

        @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
        public final void onFailure(dw.b<sf.m> call, Throwable t3) {
            kotlin.jvm.internal.i.g(call, "call");
            kotlin.jvm.internal.i.g(t3, "t");
            LogHelper logHelper = LogHelper.INSTANCE;
            c0 c0Var = this.f25476u;
            logHelper.e(c0Var.A, "https://api.theinnerhour.com/v1/new_topical", t3);
            c0Var.W.i(Boolean.TRUE);
        }

        @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
        public final void onResponse(dw.b<sf.m> call, dw.z<sf.m> response) {
            sf.m mVar;
            String mVar2;
            Object obj;
            HashMap<String, Object> appConfig;
            boolean z10;
            c0 c0Var = this.f25476u;
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
                    boolean z11 = false;
                    if (optLong2 > Calendar.getInstance().getTimeInMillis()) {
                        ApplicationPersistence.getInstance().setBooleanValue("2022_topical_card_remove", false);
                        c0Var.h(c0Var.m());
                    } else {
                        long days = TimeUnit.MILLISECONDS.toDays(Calendar.getInstance().getTimeInMillis() - optLong2);
                        String str = null;
                        if (days > 5) {
                            User user = FirebasePersistence.getInstance().getUser();
                            ta.v.H(kc.f.H(c0Var), null, 0, new C0414a(user, c0Var, null), 3);
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
                            for (Object obj2 : userGoals) {
                                if (!kotlin.jvm.internal.i.b(((Goal) obj2).getCourseId(), Constants.LIBRARY_GOAL_COURSE_ID)) {
                                    arrayList.add(obj2);
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
                                    Context applicationContext = c0Var.f2382x.getApplicationContext();
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
                        boolean z12 = !kotlin.jvm.internal.i.b(SessionManager.getInstance().getStringValue(SessionManager.KEY_USERTYPE), "patient");
                        hs.i O = sp.b.O(a.C0387a.f24409u);
                        User user2 = FirebasePersistence.getInstance().getUser();
                        if (user2 != null && (appConfig = user2.getAppConfig()) != null) {
                            obj = appConfig.get(Constants.LIBRARY_EXPERIMENT_V3);
                        } else {
                            obj = null;
                        }
                        if (obj instanceof String) {
                            str = obj;
                        }
                        if (str == null) {
                            str = "default";
                        }
                        if (z12 && !((Boolean) O.getValue()).booleanValue()) {
                            z11 = true;
                        }
                        if (!kotlin.jvm.internal.i.b(new hs.f(str, Boolean.valueOf(z11)).f19464u, "default") && !ApplicationPersistence.getInstance().getBooleanValue("2022_topical_card_remove", true)) {
                            c0Var.K.i(Boolean.TRUE);
                            ApplicationPersistence.getInstance().setBooleanValue("2022_topical_card_remove", true);
                        }
                    }
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(c0Var.A, e10);
            }
            c0Var.W.i(Boolean.TRUE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(c0 c0Var, ls.d<? super i0> dVar) {
        super(2, dVar);
        this.f25475u = c0Var;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new i0(this.f25475u, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((i0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        sp.b.d0(obj);
        ((or.k) nr.b.a(or.k.class)).a("https://api.theinnerhour.com/v1/new_topical").I(new a(this.f25475u));
        return hs.k.f19476a;
    }
}
