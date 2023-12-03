package com.theinnerhour.b2b.utils;

import am.w;
import android.content.Context;
import com.android.volley.VolleyError;
import com.google.firebase.auth.FirebaseAuth;
import com.google.gson.reflect.TypeToken;
import com.theinnerhour.b2b.model.AngerCourse;
import com.theinnerhour.b2b.model.Article;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.CourseDayModel;
import com.theinnerhour.b2b.model.DepressionCourse;
import com.theinnerhour.b2b.model.GoalType;
import com.theinnerhour.b2b.model.HappinessCourse;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.model.MiniCourseInfoMeta;
import com.theinnerhour.b2b.model.NotificationModel;
import com.theinnerhour.b2b.model.SleepCourse;
import com.theinnerhour.b2b.model.StressCourse;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.model.VolleySingleton;
import com.theinnerhour.b2b.model.WorryCourse;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.CourseApiUtil;
import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import dw.z;
import gv.r;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import kotlin.Metadata;
import org.json.JSONObject;
/* compiled from: CourseApiUtil.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0004ABCDB\u0007¢\u0006\u0004\b?\u0010@J,\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u0005J,\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u0005J&\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00022\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0004j\b\u0012\u0004\u0012\u00020\u000b`\u0005J\u0016\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010J6\u0010\u0014\u001a\u00020\u00072\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0004j\b\u0012\u0004\u0012\u00020\u0002`\u00052\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0004j\b\u0012\u0004\u0012\u00020\u000b`\u0005J\u0006\u0010\u0015\u001a\u00020\u0007J\u0006\u0010\u0016\u001a\u00020\u0007J\u0006\u0010\u0017\u001a\u00020\u0007J\u000e\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001b\u001a\u00020\u0007J\u000e\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001cJ\u000e\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001eJ\u000e\u0010!\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020 J\b\u0010\"\u001a\u00020\u0007H\u0002J\b\u0010#\u001a\u00020\u0007H\u0002J\b\u0010$\u001a\u00020\u0007H\u0002R\u0014\u0010%\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010'\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010)\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010+\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010-\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010/\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010&R\u0018\u00100\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010&R\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u001e\u00106\u001a\n\u0018\u000104j\u0004\u0018\u0001`58\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00103R\"\u00109\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006E"}, d2 = {"Lcom/theinnerhour/b2b/utils/CourseApiUtil;", "", "", "condition", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", Constants.GOAL_TYPE_CAUSES, "Lhs/k;", "sendCourseApiRequest", "addAssessment", "slug", "Lcom/theinnerhour/b2b/model/MiniCourseInfoMeta;", "mcMetaList", "sendMiniCourseRequest", "", "attempt", "Landroid/content/Context;", "context", "checkMcSlugUpdate", "slugList", "addAllMiniCourses", "getAssets", "fetchNotificationData", "updateNotifications", "Lcom/theinnerhour/b2b/utils/CourseApiUtil$CourseApiUtilInterface;", "listener", "setCourseApiListener", "removeCourseApiListener", "Lcom/theinnerhour/b2b/utils/CourseApiUtil$MiniCourseApiUtilInterface;", "setMiniCourseApiListener", "Lcom/theinnerhour/b2b/utils/CourseApiUtil$MiniCourseApiInitUtilInterface;", "setMiniCourseInitApiListener", "Lcom/theinnerhour/b2b/utils/CourseApiUtil$MiniCourseFetchUtilInterface;", "setMiniCourseFetchListener", "setPreviouscourse", "fetchActivitiesNotificationData", "requestComplete", "TAG", "Ljava/lang/String;", "apiUtilInterface", "Lcom/theinnerhour/b2b/utils/CourseApiUtil$CourseApiUtilInterface;", "miniUtilInterface", "Lcom/theinnerhour/b2b/utils/CourseApiUtil$MiniCourseApiUtilInterface;", "miniInitUtilInterface", "Lcom/theinnerhour/b2b/utils/CourseApiUtil$MiniCourseApiInitUtilInterface;", "miniFetchUtilInterface", "Lcom/theinnerhour/b2b/utils/CourseApiUtil$MiniCourseFetchUtilInterface;", "courseId", "courseName", "", "newCourse", "Z", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "Ljava/lang/Exception;", "networkCallFailure", "counter", "I", "getCounter", "()I", "setCounter", "(I)V", "<init>", "()V", "CourseApiUtilInterface", "MiniCourseApiInitUtilInterface", "MiniCourseApiUtilInterface", "MiniCourseFetchUtilInterface", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class CourseApiUtil {
    private final String TAG = LogHelper.INSTANCE.makeLogTag(CourseApiUtil.class);
    private CourseApiUtilInterface apiUtilInterface;
    private int counter;
    private String courseId;
    private String courseName;
    private Exception exception;
    private MiniCourseFetchUtilInterface miniFetchUtilInterface;
    private MiniCourseApiInitUtilInterface miniInitUtilInterface;
    private MiniCourseApiUtilInterface miniUtilInterface;
    private boolean networkCallFailure;
    private boolean newCourse;

    /* compiled from: CourseApiUtil.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0014\u0010\t\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H&J\b\u0010\n\u001a\u00020\u0004H&J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0002H&¨\u0006\r"}, d2 = {"Lcom/theinnerhour/b2b/utils/CourseApiUtil$CourseApiUtilInterface;", "", "", "newCourse", "Lhs/k;", "courseApiComplete", "Ljava/lang/Exception;", "Lkotlin/Exception;", "error", "errorLoadingData", "audioDownloadComplete", "success", "notificationFetchComplete", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes2.dex */
    public interface CourseApiUtilInterface {
        void audioDownloadComplete();

        void courseApiComplete(boolean z10);

        void errorLoadingData(Exception exc);

        void notificationFetchComplete(boolean z10);
    }

    /* compiled from: CourseApiUtil.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/theinnerhour/b2b/utils/CourseApiUtil$MiniCourseApiInitUtilInterface;", "", "", "newCourse", "Lhs/k;", "miniCourseApiInitComplete", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes2.dex */
    public interface MiniCourseApiInitUtilInterface {
        void miniCourseApiInitComplete(boolean z10);
    }

    /* compiled from: CourseApiUtil.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H&¨\u0006\n"}, d2 = {"Lcom/theinnerhour/b2b/utils/CourseApiUtil$MiniCourseApiUtilInterface;", "", "", "newCourse", "", "slug", "Lhs/k;", "miniCourseApiComplete", "success", "miniNotificationFetchComplete", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes2.dex */
    public interface MiniCourseApiUtilInterface {
        void miniCourseApiComplete(boolean z10, String str);

        void miniNotificationFetchComplete(boolean z10);
    }

    /* compiled from: CourseApiUtil.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/theinnerhour/b2b/utils/CourseApiUtil$MiniCourseFetchUtilInterface;", "", "", "success", "Lhs/k;", "miniCourseFetchComplete", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes2.dex */
    public interface MiniCourseFetchUtilInterface {
        void miniCourseFetchComplete(boolean z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void addAssessment$default(CourseApiUtil courseApiUtil, String str, ArrayList arrayList, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            arrayList = null;
        }
        courseApiUtil.addAssessment(str, arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0023 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:24:0x0000, B:27:0x000b, B:29:0x0017, B:35:0x0023, B:36:0x003a), top: B:41:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003a A[Catch: Exception -> 0x003e, TRY_LEAVE, TryCatch #0 {Exception -> 0x003e, blocks: (B:24:0x0000, B:27:0x000b, B:29:0x0017, B:35:0x0023, B:36:0x003a), top: B:41:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void fetchActivitiesNotificationData() {
        boolean z10;
        try {
            String a10 = FirebaseAuth.getInstance().a();
            if (a10 == null) {
                return;
            }
            String stringValue = ApplicationPersistence.getInstance().getStringValue("an_json");
            if (stringValue != null && stringValue.length() != 0) {
                z10 = false;
                if (!z10) {
                    ((or.f) nr.b.a(or.f.class)).a("https://notify.theinnerhour.com/recommendedactivities", a10).I(new CustomRetrofitCallback<sf.m>() { // from class: com.theinnerhour.b2b.utils.CourseApiUtil$fetchActivitiesNotificationData$1
                        @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
                        public void onFailure(dw.b<sf.m> call, Throwable t3) {
                            kotlin.jvm.internal.i.g(call, "call");
                            kotlin.jvm.internal.i.g(t3, "t");
                            CourseApiUtil.this.networkCallFailure = true;
                            CourseApiUtil.this.requestComplete();
                        }

                        @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
                        public void onResponse(dw.b<sf.m> call, z<sf.m> response) {
                            kotlin.jvm.internal.i.g(call, "call");
                            kotlin.jvm.internal.i.g(response, "response");
                            CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
                            if (!response.a()) {
                                CourseApiUtil.this.networkCallFailure = true;
                                CourseApiUtil.this.requestComplete();
                                return;
                            }
                            ApplicationPersistence.getInstance().setStringValue("an_json", String.valueOf(response.f13696b));
                            CourseApiUtil.this.requestComplete();
                        }
                    });
                    return;
                } else {
                    requestComplete();
                    return;
                }
            }
            z10 = true;
            if (!z10) {
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.TAG, "exception", e10);
        }
    }

    public static final void getAssets$lambda$6(CourseApiUtil this$0, JSONObject jSONObject) {
        kotlin.jvm.internal.i.g(this$0, "this$0");
        try {
            sf.i iVar = new sf.i();
            Type type = new TypeToken<ArrayList<GoalType>>() { // from class: com.theinnerhour.b2b.utils.CourseApiUtil$getAssets$jsonObjectRequest$1$typeGoals$1
            }.getType();
            ApplicationPersistence.getInstance().addAllGoalType((ArrayList) iVar.c(jSONObject.getJSONObject("program").getJSONArray("goals").toString(), type));
            Type type2 = new TypeToken<ArrayList<NotificationModel>>() { // from class: com.theinnerhour.b2b.utils.CourseApiUtil$getAssets$jsonObjectRequest$1$typeNotifcation$1
            }.getType();
            ApplicationPersistence.getInstance().addCourseNotification(jSONObject.getJSONObject("program").getString("_id"), (ArrayList) iVar.c(jSONObject.getJSONObject("program").getJSONArray("notifications").toString(), type2));
            Type type3 = new TypeToken<ArrayList<Article>>() { // from class: com.theinnerhour.b2b.utils.CourseApiUtil$getAssets$jsonObjectRequest$1$typeArticle$1
            }.getType();
            ApplicationPersistence.getInstance().addArticles(jSONObject.getJSONObject("program").getString("_id"), (ArrayList) iVar.c(jSONObject.getJSONObject("program").getJSONArray("articles").toString(), type3));
            CourseApiUtilInterface courseApiUtilInterface = this$0.apiUtilInterface;
            kotlin.jvm.internal.i.d(courseApiUtilInterface);
            courseApiUtilInterface.courseApiComplete(false);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
            CourseApiUtilInterface courseApiUtilInterface2 = this$0.apiUtilInterface;
            if (courseApiUtilInterface2 != null) {
                courseApiUtilInterface2.errorLoadingData(e10);
            }
        }
    }

    public final void requestComplete() {
        try {
            int i6 = this.counter - 1;
            this.counter = i6;
            if (i6 == 0 && this.apiUtilInterface != null) {
                updateNotifications();
                if (this.exception == null && !this.networkCallFailure) {
                    ApplicationPersistence.getInstance().setBooleanValue("fetch_notifications", false);
                    CourseApiUtilInterface courseApiUtilInterface = this.apiUtilInterface;
                    if (courseApiUtilInterface != null) {
                        courseApiUtilInterface.notificationFetchComplete(true);
                    }
                }
                CourseApiUtilInterface courseApiUtilInterface2 = this.apiUtilInterface;
                if (courseApiUtilInterface2 != null) {
                    courseApiUtilInterface2.notificationFetchComplete(false);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.TAG, "Exception", e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void sendCourseApiRequest$default(CourseApiUtil courseApiUtil, String str, ArrayList arrayList, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            arrayList = null;
        }
        courseApiUtil.sendCourseApiRequest(str, arrayList);
    }

    public static final void sendCourseApiRequest$lambda$0(String condition, ArrayList arrayList, CourseApiUtil this$0, JSONObject jSONObject) {
        kotlin.jvm.internal.i.g(condition, "$condition");
        kotlin.jvm.internal.i.g(this$0, "this$0");
        try {
            Utils.INSTANCE.cancelNotifications();
            sf.i iVar = new sf.i();
            switch (condition.hashCode()) {
                case -2114782937:
                    if (!condition.equals(Constants.COURSE_HAPPINESS)) {
                        break;
                    } else {
                        HappinessCourse happinessCourse = (HappinessCourse) iVar.c(jSONObject.getJSONObject("program").toString(), new TypeToken<HappinessCourse>() { // from class: com.theinnerhour.b2b.utils.CourseApiUtil$sendCourseApiRequest$jsonObjectRequest$1$type$4
                        }.getType());
                        if (arrayList != null) {
                            happinessCourse.setCauses(arrayList);
                        }
                        FirebasePersistence.getInstance().getUser().setCurrentCourse(happinessCourse.get_id());
                        FirebasePersistence.getInstance().getUser().setCurrentCourseName(happinessCourse.getCourseName());
                        if (FirebasePersistence.getInstance().getUser().getHappiness() == null) {
                            this$0.newCourse = true;
                            Date time = Calendar.getInstance().getTime();
                            kotlin.jvm.internal.i.f(time, "getInstance().time");
                            happinessCourse.setmStartDate(time);
                            FirebasePersistence.getInstance().getUser().setHappiness(happinessCourse);
                            break;
                        }
                    }
                    break;
                case -1617042330:
                    if (!condition.equals(Constants.COURSE_DEPRESSION)) {
                        break;
                    } else {
                        DepressionCourse depressionCourse = (DepressionCourse) iVar.c(jSONObject.getJSONObject("program").toString(), new TypeToken<DepressionCourse>() { // from class: com.theinnerhour.b2b.utils.CourseApiUtil$sendCourseApiRequest$jsonObjectRequest$1$type$3
                        }.getType());
                        if (arrayList != null) {
                            depressionCourse.setCauses(arrayList);
                        }
                        FirebasePersistence.getInstance().getUser().setCurrentCourse(depressionCourse.get_id());
                        FirebasePersistence.getInstance().getUser().setCurrentCourseName(depressionCourse.getCourseName());
                        if (FirebasePersistence.getInstance().getUser().getDepression() == null) {
                            this$0.newCourse = true;
                            Date time2 = Calendar.getInstance().getTime();
                            kotlin.jvm.internal.i.f(time2, "getInstance().time");
                            depressionCourse.setmStartDate(time2);
                            FirebasePersistence.getInstance().getUser().setDepression(depressionCourse);
                            break;
                        }
                    }
                    break;
                case -891989580:
                    if (!condition.equals(Constants.COURSE_STRESS)) {
                        break;
                    } else {
                        StressCourse stressCourse = (StressCourse) iVar.c(jSONObject.getJSONObject("program").toString(), new TypeToken<StressCourse>() { // from class: com.theinnerhour.b2b.utils.CourseApiUtil$sendCourseApiRequest$jsonObjectRequest$1$type$1
                        }.getType());
                        if (arrayList != null) {
                            stressCourse.setCauses(arrayList);
                        }
                        FirebasePersistence.getInstance().getUser().setCurrentCourse(stressCourse.get_id());
                        FirebasePersistence.getInstance().getUser().setCurrentCourseName(stressCourse.getCourseName());
                        if (FirebasePersistence.getInstance().getUser().getStress() == null) {
                            this$0.newCourse = true;
                            Date time3 = Calendar.getInstance().getTime();
                            kotlin.jvm.internal.i.f(time3, "getInstance().time");
                            stressCourse.setmStartDate(time3);
                            FirebasePersistence.getInstance().getUser().setStress(stressCourse);
                            break;
                        }
                    }
                    break;
                case 92960775:
                    if (!condition.equals(Constants.COURSE_ANGER)) {
                        break;
                    } else {
                        AngerCourse angerCourse = (AngerCourse) iVar.c(jSONObject.getJSONObject("program").toString(), new TypeToken<AngerCourse>() { // from class: com.theinnerhour.b2b.utils.CourseApiUtil$sendCourseApiRequest$jsonObjectRequest$1$type$6
                        }.getType());
                        if (arrayList != null) {
                            angerCourse.setCauses(arrayList);
                        }
                        FirebasePersistence.getInstance().getUser().setCurrentCourse(angerCourse.get_id());
                        FirebasePersistence.getInstance().getUser().setCurrentCourseName(angerCourse.getCourseName());
                        if (FirebasePersistence.getInstance().getUser().getAnger() == null) {
                            this$0.newCourse = true;
                            Date time4 = Calendar.getInstance().getTime();
                            kotlin.jvm.internal.i.f(time4, "getInstance().time");
                            angerCourse.setmStartDate(time4);
                            FirebasePersistence.getInstance().getUser().setAnger(angerCourse);
                            break;
                        }
                    }
                    break;
                case 109522647:
                    if (!condition.equals(Constants.COURSE_SLEEP)) {
                        break;
                    } else {
                        SleepCourse sleepCourse = (SleepCourse) iVar.c(jSONObject.getJSONObject("program").toString(), new TypeToken<SleepCourse>() { // from class: com.theinnerhour.b2b.utils.CourseApiUtil$sendCourseApiRequest$jsonObjectRequest$1$type$2
                        }.getType());
                        if (arrayList != null) {
                            sleepCourse.setCauses(arrayList);
                        }
                        FirebasePersistence.getInstance().getUser().setCurrentCourse(sleepCourse.get_id());
                        FirebasePersistence.getInstance().getUser().setCurrentCourseName(sleepCourse.getCourseName());
                        if (FirebasePersistence.getInstance().getUser().getSleep() == null) {
                            this$0.newCourse = true;
                            Date time5 = Calendar.getInstance().getTime();
                            kotlin.jvm.internal.i.f(time5, "getInstance().time");
                            sleepCourse.setmStartDate(time5);
                            FirebasePersistence.getInstance().getUser().setSleep(sleepCourse);
                            break;
                        }
                    }
                    break;
                case 113319009:
                    if (!condition.equals(Constants.COURSE_WORRY)) {
                        break;
                    } else {
                        WorryCourse worryCourse = (WorryCourse) iVar.c(jSONObject.getJSONObject("program").toString(), new TypeToken<WorryCourse>() { // from class: com.theinnerhour.b2b.utils.CourseApiUtil$sendCourseApiRequest$jsonObjectRequest$1$type$5
                        }.getType());
                        if (arrayList != null) {
                            worryCourse.setCauses(arrayList);
                        }
                        FirebasePersistence.getInstance().getUser().setCurrentCourse(worryCourse.get_id());
                        FirebasePersistence.getInstance().getUser().setCurrentCourseName(worryCourse.getCourseName());
                        if (FirebasePersistence.getInstance().getUser().getWorry() == null) {
                            this$0.newCourse = true;
                            Date time6 = Calendar.getInstance().getTime();
                            kotlin.jvm.internal.i.f(time6, "getInstance().time");
                            worryCourse.setmStartDate(time6);
                            FirebasePersistence.getInstance().getUser().setWorry(worryCourse);
                            break;
                        }
                    }
                    break;
            }
            Course courseById = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
            kotlin.jvm.internal.i.d(courseById);
            Iterator<CourseDayModel> it = courseById.getPlan().iterator();
            while (it.hasNext()) {
                it.next().setShow_goals(true);
            }
            FirebasePersistence.getInstance().updateUserOnFirebase();
            Type type = new TypeToken<ArrayList<GoalType>>() { // from class: com.theinnerhour.b2b.utils.CourseApiUtil$sendCourseApiRequest$jsonObjectRequest$1$typeGoals$1
            }.getType();
            ApplicationPersistence.getInstance().addAllGoalType((ArrayList) iVar.c(jSONObject.getJSONObject("program").getJSONArray("goals").toString(), type));
            Type type2 = new TypeToken<ArrayList<NotificationModel>>() { // from class: com.theinnerhour.b2b.utils.CourseApiUtil$sendCourseApiRequest$jsonObjectRequest$1$typeNotifcation$1
            }.getType();
            ApplicationPersistence.getInstance().addCourseNotification(jSONObject.getJSONObject("program").getString("_id"), (ArrayList) iVar.c(jSONObject.getJSONObject("program").getJSONArray("notifications").toString(), type2));
            Type type3 = new TypeToken<ArrayList<Article>>() { // from class: com.theinnerhour.b2b.utils.CourseApiUtil$sendCourseApiRequest$jsonObjectRequest$1$typeArticle$1
            }.getType();
            ApplicationPersistence.getInstance().addArticles(jSONObject.getJSONObject("program").getString("_id"), (ArrayList) iVar.c(jSONObject.getJSONObject("program").getJSONArray("articles").toString(), type3));
            ApplicationPersistence.getInstance().setBooleanValue("fetch_notifications", true);
            CourseApiUtilInterface courseApiUtilInterface = this$0.apiUtilInterface;
            if (courseApiUtilInterface != null) {
                courseApiUtilInterface.courseApiComplete(this$0.newCourse);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
            this$0.setPreviouscourse();
            CourseApiUtilInterface courseApiUtilInterface2 = this$0.apiUtilInterface;
            if (courseApiUtilInterface2 != null) {
                courseApiUtilInterface2.errorLoadingData(e10);
            }
        }
    }

    public final void setPreviouscourse() {
        if (FirebasePersistence.getInstance().getUser() != null) {
            FirebasePersistence.getInstance().getUser().setCurrentCourse(this.courseId);
            FirebasePersistence.getInstance().getUser().setCurrentCourseName(this.courseName);
            FirebasePersistence.getInstance().updateUserOnFirebase();
        }
    }

    public final void addAllMiniCourses(ArrayList<String> slugList, ArrayList<MiniCourseInfoMeta> mcMetaList) {
        kotlin.jvm.internal.i.g(slugList, "slugList");
        kotlin.jvm.internal.i.g(mcMetaList, "mcMetaList");
        try {
            ArrayList arrayList = new ArrayList();
            if (is.k.Q1(FirebasePersistence.getInstance().getUser().getVersion(), new String[]{"v2.3", Constants.USER_VERSION})) {
                CourseApiUtil$addAllMiniCourses$onLoaded$1 courseApiUtil$addAllMiniCourses$onLoaded$1 = new CourseApiUtil$addAllMiniCourses$onLoaded$1(mcMetaList, arrayList, this);
                Iterator<String> it = slugList.iterator();
                while (it.hasNext()) {
                    String slug = it.next();
                    kotlin.jvm.internal.i.f(slug, "slug");
                    FireStoreUtilsKt.fetchMiniCourseMeta(slug, courseApiUtil$addAllMiniCourses$onLoaded$1);
                }
            } else if (ca.a.k("v2.2", "v2.21").contains(FirebasePersistence.getInstance().getUser().getVersion())) {
                CourseApiUtil$addAllMiniCourses$onLoaded$2 courseApiUtil$addAllMiniCourses$onLoaded$2 = new CourseApiUtil$addAllMiniCourses$onLoaded$2(mcMetaList, arrayList, this);
                Iterator<String> it2 = slugList.iterator();
                while (it2.hasNext()) {
                    String slug2 = it2.next();
                    kotlin.jvm.internal.i.f(slug2, "slug");
                    FireStoreUtilsKt.fetchMiniCourseMeta(slug2, courseApiUtil$addAllMiniCourses$onLoaded$2);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.TAG, e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:189:0x0158, code lost:
        if (r0.getPlanV3().get(14).getStart_date() != 0) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void addAssessment(String condition, ArrayList<String> arrayList) {
        String str;
        kotlin.jvm.internal.i.g(condition, "condition");
        try {
            User user = FirebasePersistence.getInstance().getUser();
            if (user != null) {
                user.setCurrentCourseName(condition);
            }
            User user2 = FirebasePersistence.getInstance().getUser();
            if (user2 != null) {
                switch (condition.hashCode()) {
                    case -2114782937:
                        if (condition.equals(Constants.COURSE_HAPPINESS)) {
                            str = "07cd8acb-c988-49fe-9bad-9b3683ff26f0";
                            break;
                        } else {
                            str = "";
                            break;
                        }
                    case -1617042330:
                        if (condition.equals(Constants.COURSE_DEPRESSION)) {
                            str = "33b80e0a-267a-49b4-9a80-2d87dce7f99a";
                            break;
                        } else {
                            str = "";
                            break;
                        }
                    case -891989580:
                        if (condition.equals(Constants.COURSE_STRESS)) {
                            str = "99577353-fd79-4470-943d-1bd65e2a1a2f";
                            break;
                        } else {
                            str = "";
                            break;
                        }
                    case 92960775:
                        if (condition.equals(Constants.COURSE_ANGER)) {
                            str = "782730c9-04c0-4fb5-81e8-6f2739e1d8d9";
                            break;
                        } else {
                            str = "";
                            break;
                        }
                    case 109522647:
                        if (condition.equals(Constants.COURSE_SLEEP)) {
                            str = "84982153-2f9c-4982-9bd1-f5a614d96456";
                            break;
                        } else {
                            str = "";
                            break;
                        }
                    case 113319009:
                        if (condition.equals(Constants.COURSE_WORRY)) {
                            str = "db992ff7-a994-499c-a05b-3c3cb44fdfb5";
                            break;
                        } else {
                            str = "";
                            break;
                        }
                    default:
                        str = "";
                        break;
                }
                user2.setCurrentCourse(str);
            }
            boolean z10 = true;
            if (!FirebasePersistence.getInstance().getUserCourseNameMap().containsKey(condition)) {
                User user3 = FirebasePersistence.getInstance().getUser();
                switch (condition.hashCode()) {
                    case -2114782937:
                        if (!condition.equals(Constants.COURSE_HAPPINESS)) {
                            break;
                        } else {
                            user3.setHappiness(new HappinessCourse());
                            break;
                        }
                    case -1617042330:
                        if (!condition.equals(Constants.COURSE_DEPRESSION)) {
                            break;
                        } else {
                            user3.setDepression(new DepressionCourse());
                            break;
                        }
                    case -891989580:
                        if (!condition.equals(Constants.COURSE_STRESS)) {
                            break;
                        } else {
                            user3.setStress(new StressCourse());
                            break;
                        }
                    case 92960775:
                        if (!condition.equals(Constants.COURSE_ANGER)) {
                            break;
                        } else {
                            user3.setAnger(new AngerCourse());
                            break;
                        }
                    case 109522647:
                        if (!condition.equals(Constants.COURSE_SLEEP)) {
                            break;
                        } else {
                            user3.setSleep(new SleepCourse());
                            break;
                        }
                    case 113319009:
                        if (!condition.equals(Constants.COURSE_WORRY)) {
                            break;
                        } else {
                            user3.setWorry(new WorryCourse());
                            break;
                        }
                }
                Course courseByName = FirebasePersistence.getInstance().getCourseByName(condition);
                if (courseByName != null) {
                    courseByName.setCourseName(condition);
                    Date time = Calendar.getInstance().getTime();
                    kotlin.jvm.internal.i.f(time, "getInstance().time");
                    courseByName.setmStartDate(time);
                }
                this.newCourse = true;
            }
            Course courseByName2 = FirebasePersistence.getInstance().getCourseByName(condition);
            if (courseByName2 != null) {
                int size = courseByName2.getPlanV3().size();
                if (size != 0) {
                    if (size != 15) {
                        if (size == 30 && courseByName2.getPlanV3().get(29).getStart_date() != 0) {
                        }
                        z10 = false;
                    }
                }
                if (z10) {
                    courseByName2.getPlanV3().add(UtilsKt.readAssessmentFromRaw(courseByName2.getPlanV3().size(), condition));
                    if (arrayList != null) {
                        courseByName2.setCauses(arrayList);
                    }
                    fetchNotificationData();
                }
            }
            FirebasePersistence.getInstance().updateUserOnFirebase();
            CourseApiUtilInterface courseApiUtilInterface = this.apiUtilInterface;
            if (courseApiUtilInterface != null) {
                courseApiUtilInterface.courseApiComplete(this.newCourse);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.TAG, e10);
        }
    }

    public final void checkMcSlugUpdate(int i6, Context context) {
        kotlin.jvm.internal.i.g(context, "context");
        try {
            if (i6 == 3) {
                MiniCourseFetchUtilInterface miniCourseFetchUtilInterface = this.miniFetchUtilInterface;
                if (miniCourseFetchUtilInterface != null && miniCourseFetchUtilInterface != null) {
                    miniCourseFetchUtilInterface.miniCourseFetchComplete(false);
                    return;
                }
                return;
            }
            FireStoreUtilsKt.fetchMiniCourseSlugList(new CourseApiUtil$checkMcSlugUpdate$1(this, i6, context));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.TAG, e10);
        }
    }

    public final void fetchNotificationData() {
        int i6;
        if (defpackage.d.q(Constants.USER_VERSION)) {
            i6 = 3;
        } else {
            i6 = 2;
        }
        this.counter = i6;
        this.exception = null;
        fetchActivitiesNotificationData();
    }

    public final void getAssets() {
        try {
            VolleySingleton.getInstance().add(new CustomVolleyJsonObjectRequest(0, "https://api.theinnerhour.com/v1/program_manifest/" + FirebasePersistence.getInstance().getUser().getCurrentCourseName(), null, new w(4, this), new CustomVolleyErrorListener() { // from class: com.theinnerhour.b2b.utils.CourseApiUtil$getAssets$jsonObjectRequest$2
                @Override // com.theinnerhour.b2b.utils.CustomVolleyErrorListener, e4.l.a
                public void onErrorResponse(VolleyError error) {
                    String str;
                    CourseApiUtil.CourseApiUtilInterface courseApiUtilInterface;
                    String str2;
                    kotlin.jvm.internal.i.g(error, "error");
                    try {
                        courseApiUtilInterface = CourseApiUtil.this.apiUtilInterface;
                        if (courseApiUtilInterface != null) {
                            courseApiUtilInterface.errorLoadingData(error);
                        }
                        LogHelper logHelper = LogHelper.INSTANCE;
                        str2 = CourseApiUtil.this.TAG;
                        logHelper.e(str2, "https://api.theinnerhour.com/v1/program_manifest/", error);
                        super.onErrorResponse(error);
                    } catch (Exception e10) {
                        LogHelper logHelper2 = LogHelper.INSTANCE;
                        str = CourseApiUtil.this.TAG;
                        logHelper2.e(str, "https://api.theinnerhour.com/v1/program_manifest/", e10);
                    }
                }
            }));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e("courseapi", "exception", e10);
        }
    }

    public final int getCounter() {
        return this.counter;
    }

    public final void removeCourseApiListener() {
        this.apiUtilInterface = null;
    }

    public final void sendCourseApiRequest(final String condition, ArrayList<String> arrayList) {
        final String str;
        kotlin.jvm.internal.i.g(condition, "condition");
        try {
            if (FirebasePersistence.getInstance().getUser() == null) {
                CourseApiUtilInterface courseApiUtilInterface = this.apiUtilInterface;
                if (courseApiUtilInterface != null) {
                    kotlin.jvm.internal.i.d(courseApiUtilInterface);
                    courseApiUtilInterface.errorLoadingData(new Exception("User object is null"));
                    return;
                }
                return;
            }
            User user = FirebasePersistence.getInstance().getUser();
            if (kotlin.jvm.internal.i.b(user.getVersion(), Constants.USER_VERSION)) {
                addAssessment(condition, arrayList);
                return;
            }
            this.courseId = user.getCurrentCourse();
            this.courseName = user.getCurrentCourseName();
            if (kotlin.jvm.internal.i.b(user.getVersion(), "v2.3")) {
                str = "https://api.theinnerhour.com/v1/program_manifest_v2/";
            } else if (kotlin.jvm.internal.i.b(user.getVersion(), "v2.21")) {
                str = "https://api.theinnerhour.com/v1/program_manifest_v3/";
            } else {
                str = "https://api.theinnerhour.com/v1/program_manifest_v1/";
            }
            VolleySingleton.getInstance().add(new CustomVolleyJsonObjectRequest(0, str.concat(condition), null, new o(condition, arrayList, this, 1), new CustomVolleyErrorListener() { // from class: com.theinnerhour.b2b.utils.CourseApiUtil$sendCourseApiRequest$jsonObjectRequest$2
                @Override // com.theinnerhour.b2b.utils.CustomVolleyErrorListener, e4.l.a
                public void onErrorResponse(VolleyError error) {
                    String str2;
                    CourseApiUtil.CourseApiUtilInterface courseApiUtilInterface2;
                    String str3;
                    kotlin.jvm.internal.i.g(error, "error");
                    try {
                        CourseApiUtil.this.setPreviouscourse();
                        courseApiUtilInterface2 = CourseApiUtil.this.apiUtilInterface;
                        if (courseApiUtilInterface2 != null) {
                            courseApiUtilInterface2.errorLoadingData(error);
                        }
                        LogHelper logHelper = LogHelper.INSTANCE;
                        str3 = CourseApiUtil.this.TAG;
                        logHelper.e(str3, str + condition, error);
                        super.onErrorResponse(error);
                    } catch (Exception e10) {
                        LogHelper logHelper2 = LogHelper.INSTANCE;
                        str2 = CourseApiUtil.this.TAG;
                        logHelper2.e(str2, str + condition, e10);
                    }
                }
            }));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.TAG, e10);
        }
    }

    public final void sendMiniCourseRequest(String slug, ArrayList<MiniCourseInfoMeta> mcMetaList) {
        kotlin.jvm.internal.i.g(slug, "slug");
        kotlin.jvm.internal.i.g(mcMetaList, "mcMetaList");
        try {
            if (ca.a.k("v2.3", Constants.USER_VERSION).contains(FirebasePersistence.getInstance().getUser().getVersion())) {
                if (r.J0(slug, "basic")) {
                    FirebasePersistence.getInstance().getUser().setCurrentMiniCourse(slug);
                }
                FirebasePersistence.getInstance().updateUserOnFirebase();
                ArrayList<MiniCourse> miniCourses = FirebasePersistence.getInstance().getUser().getMiniCourses();
                kotlin.jvm.internal.i.f(miniCourses, "getInstance().user.miniCourses");
                ArrayList arrayList = new ArrayList();
                for (Object obj : miniCourses) {
                    if (kotlin.jvm.internal.i.b(((MiniCourse) obj).getDomain(), slug)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty() || ((MiniCourse) arrayList.get(0)).getPlan().size() == 0) {
                    FireStoreUtilsKt.fetchMiniCourseMeta(slug, new CourseApiUtil$sendMiniCourseRequest$onLoaded$1(slug, mcMetaList, arrayList, this));
                }
            } else if (ca.a.k("v2.2", "v2.21").contains(FirebasePersistence.getInstance().getUser().getVersion())) {
                ArrayList<MiniCourse> miniCourses2 = FirebasePersistence.getInstance().getUser().getMiniCourses();
                kotlin.jvm.internal.i.f(miniCourses2, "getInstance().user.miniCourses");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : miniCourses2) {
                    if (kotlin.jvm.internal.i.b(((MiniCourse) obj2).getDomain(), slug)) {
                        arrayList2.add(obj2);
                    }
                }
                if (arrayList2.isEmpty() || ((MiniCourse) arrayList2.get(0)).getPlan().size() == 0) {
                    FireStoreUtilsKt.fetchMiniCourseMeta(slug, new CourseApiUtil$sendMiniCourseRequest$onLoaded$2(slug, mcMetaList, arrayList2, this));
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.TAG, e10);
        }
    }

    public final void setCounter(int i6) {
        this.counter = i6;
    }

    public final void setCourseApiListener(CourseApiUtilInterface listener) {
        kotlin.jvm.internal.i.g(listener, "listener");
        this.apiUtilInterface = listener;
    }

    public final void setMiniCourseApiListener(MiniCourseApiUtilInterface listener) {
        kotlin.jvm.internal.i.g(listener, "listener");
        this.miniUtilInterface = listener;
    }

    public final void setMiniCourseFetchListener(MiniCourseFetchUtilInterface listener) {
        kotlin.jvm.internal.i.g(listener, "listener");
        this.miniFetchUtilInterface = listener;
    }

    public final void setMiniCourseInitApiListener(MiniCourseApiInitUtilInterface listener) {
        kotlin.jvm.internal.i.g(listener, "listener");
        this.miniInitUtilInterface = listener;
    }

    public final void updateNotifications() {
        try {
            Utils utils = Utils.INSTANCE;
            utils.cancelNotifications();
            utils.setActivityNotification(true);
        } catch (Exception e10) {
            this.exception = e10;
            requestComplete();
        }
    }
}
