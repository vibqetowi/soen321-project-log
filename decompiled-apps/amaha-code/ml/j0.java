package ml;

import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.TemplateModel;
import com.theinnerhour.b2b.utils.Utils;
/* compiled from: V3DashboardViewModel.kt */
/* loaded from: classes2.dex */
public final class j0 extends kotlin.jvm.internal.k implements ss.p<Boolean, TemplateModel, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Goal f25492u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(Goal goal) {
        super(2);
        this.f25492u = goal;
    }

    @Override // ss.p
    public final hs.k invoke(Boolean bool, TemplateModel templateModel) {
        String str;
        TemplateModel templateModel2 = templateModel;
        if (bool.booleanValue() && templateModel2 != null) {
            Utils utils = Utils.INSTANCE;
            MyApplication a10 = MyApplication.V.a();
            Goal goal = this.f25492u;
            long time = goal.getScheduledDate().getTime() * 1000;
            String type = goal.getType();
            if (type == null) {
                type = "";
            }
            String goalId = goal.getGoalId();
            if (goalId == null) {
                goalId = "";
            }
            String goalName = goal.getGoalName();
            if (goalName == null) {
                goalName = "";
            }
            String courseName = goal.getCourseName();
            if (courseName == null) {
                courseName = "";
            }
            String reminderTitle = templateModel2.getReminderTitle();
            if (reminderTitle == null) {
                reminderTitle = "";
            }
            String reminderBody = templateModel2.getReminderBody();
            if (reminderBody == null) {
                str = "";
            } else {
                str = reminderBody;
            }
            utils.updateV3ActivityNotification(a10, false, time, type, goalId, goalName, courseName, reminderTitle, str);
        }
        return hs.k.f19476a;
    }
}
