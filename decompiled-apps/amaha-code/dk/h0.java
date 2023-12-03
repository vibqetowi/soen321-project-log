package dk;

import android.content.Context;
import android.os.AsyncTask;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.TemplateModel;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
/* compiled from: TemplateActivity.kt */
/* loaded from: classes2.dex */
public final class h0 extends AsyncTask<Void, Void, Void> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TemplateActivity f12926a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f12927b;

    public h0(TemplateActivity templateActivity, long j10) {
        this.f12926a = templateActivity;
        this.f12927b = j10;
    }

    @Override // android.os.AsyncTask
    public final Void doInBackground(Void[] voidArr) {
        Void[] voids = voidArr;
        TemplateActivity templateActivity = this.f12926a;
        kotlin.jvm.internal.i.g(voids, "voids");
        try {
            Goal y02 = templateActivity.y0();
            if (y02 != null) {
                Utils utils = Utils.INSTANCE;
                Context applicationContext = templateActivity.getApplicationContext();
                kotlin.jvm.internal.i.f(applicationContext, "applicationContext");
                boolean notificationScheduled = y02.getNotificationScheduled();
                long j10 = this.f12927b;
                String type = y02.getType();
                kotlin.jvm.internal.i.d(type);
                String goalId = y02.getGoalId();
                kotlin.jvm.internal.i.d(goalId);
                String goalName = y02.getGoalName();
                kotlin.jvm.internal.i.d(goalName);
                String courseName = y02.getCourseName();
                kotlin.jvm.internal.i.d(courseName);
                TemplateModel templateModel = templateActivity.f10547y;
                kotlin.jvm.internal.i.d(templateModel);
                String reminderTitle = templateModel.getReminderTitle();
                kotlin.jvm.internal.i.d(reminderTitle);
                TemplateModel templateModel2 = templateActivity.f10547y;
                kotlin.jvm.internal.i.d(templateModel2);
                String reminderBody = templateModel2.getReminderBody();
                kotlin.jvm.internal.i.d(reminderBody);
                utils.updateV3ActivityNotification(applicationContext, notificationScheduled, j10, type, goalId, goalName, courseName, reminderTitle, reminderBody);
                return null;
            }
            return null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(templateActivity.f10545w, "Exception", e10);
            return null;
        }
    }
}
