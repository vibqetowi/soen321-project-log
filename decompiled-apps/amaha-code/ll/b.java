package ll;

import android.app.Activity;
import android.content.Intent;
import com.theinnerhour.b2b.components.dashboard.activity.V2DashboardActivity;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.components.dashboard.experiment.activity.CustomDashboardActivity;
import com.theinnerhour.b2b.components.dashboard.experiment.activity.NotV4Activity;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import is.k;
import java.util.HashMap;
import kotlin.jvm.internal.i;
/* compiled from: DashboardRoutingUtil.kt */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f24410a = LogHelper.INSTANCE.makeLogTag("DashboardRoutingUtil");

    public final Intent a(Activity activity, boolean z10) {
        Intent intent;
        Object obj;
        i.g(activity, "activity");
        try {
            User user = FirebasePersistence.getInstance().getUser();
            if (user != null) {
                if (!i.b(user.getVersion(), Constants.USER_VERSION)) {
                    intent = new Intent(activity, V2DashboardActivity.class);
                } else {
                    HashMap<String, Object> appConfig = user.getAppConfig();
                    if (appConfig != null) {
                        obj = appConfig.get(Constants.NEW_COURSES_EXPERIMENT);
                    } else {
                        obj = null;
                    }
                    if (i.b(obj, "variant_a")) {
                        if (k.Q1(user.getCurrentCourseName(), new String[]{Constants.COURSE_ADHD, Constants.COURSE_OCD, Constants.COURSE_GENERIC})) {
                            intent = new Intent(activity, CustomDashboardActivity.class);
                        }
                    }
                    if (user.getAppConfig().containsKey(Constants.DASHBOARD_LIBRARY_EXPERIMENT) && !i.b(user.getAppConfig().get(Constants.DASHBOARD_LIBRARY_EXPERIMENT), "default")) {
                        intent = new Intent(activity, NotV4Activity.class);
                    } else {
                        intent = new Intent(activity, V3DashboardActivity.class);
                    }
                }
            } else {
                intent = new Intent(activity, V3DashboardActivity.class);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f24410a, e10);
            intent = new Intent(activity, V3DashboardActivity.class);
        }
        if (z10) {
            Intent addFlags = intent.addFlags(268468224);
            i.f(addFlags, "intent.addFlags(Intent.F…t.FLAG_ACTIVITY_NEW_TASK)");
            return addFlags;
        }
        return intent;
    }
}
