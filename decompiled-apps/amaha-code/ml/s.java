package ml;

import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilsKt;
import e4.l;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
/* compiled from: DashboardViewModelRepository.kt */
/* loaded from: classes2.dex */
public final class s<T> implements l.b {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ls.d<Boolean> f25577u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ u f25578v;

    public s(u uVar, ls.h hVar) {
        this.f25577u = hVar;
        this.f25578v = uVar;
    }

    @Override // e4.l.b
    public final void a(Object obj) {
        boolean z10;
        JSONObject jSONObject = (JSONObject) obj;
        ls.d<Boolean> dVar = this.f25577u;
        u uVar = this.f25578v;
        try {
            ApplicationPersistence.getInstance().setLongValue("2022_topical_fetch_end", jSONObject.getLong("fetch_end"));
            if (jSONObject.getLong("plan_end") > Calendar.getInstance().getTimeInMillis()) {
                ApplicationPersistence.getInstance().setLongValue("2022_topical_plan_end", jSONObject.getLong("plan_end"));
            } else {
                if (TimeUnit.MILLISECONDS.toDays(Calendar.getInstance().getTimeInMillis() - jSONObject.getLong("plan_end")) > 5) {
                    User user = FirebasePersistence.getInstance().getUser();
                    Iterator<MiniCourse> it = user.getTopicalCourseList().iterator();
                    while (it.hasNext()) {
                        Iterator<CourseDayModelV1> it2 = it.next().getPlan().iterator();
                        while (it2.hasNext()) {
                            String content_id = it2.next().getContent_id();
                            if (content_id != null) {
                                u.a(uVar, content_id);
                            }
                        }
                    }
                    boolean z11 = true;
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
                    for (T t3 : userGoals) {
                        if (!kotlin.jvm.internal.i.b(((Goal) t3).getCourseId(), Constants.LIBRARY_GOAL_COURSE_ID)) {
                            arrayList.add(t3);
                        }
                    }
                    if (arrayList.size() != user.getUserGoals().size()) {
                        user.setUserGoals(new ArrayList<>(arrayList));
                    } else {
                        z11 = z10;
                    }
                    if (z11) {
                        FirebasePersistence.getInstance().updateUserOnFirebase();
                        UtilsKt.fireAnalytics("topical_course_remove", UtilsKt.getAnalyticsBundle());
                    }
                }
            }
            dVar.resumeWith(Boolean.TRUE);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(uVar.f25590a, e10);
            dVar.resumeWith(Boolean.FALSE);
        }
    }
}
