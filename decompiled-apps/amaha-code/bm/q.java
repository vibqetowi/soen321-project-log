package bm;

import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.TemplateModel;
import com.theinnerhour.b2b.utils.FireStoreUtilsKt;
import com.theinnerhour.b2b.utils.Utils;
/* compiled from: V3GoalsAdapterNew.kt */
/* loaded from: classes2.dex */
public final class q extends kotlin.jvm.internal.k implements ss.p<Boolean, TemplateModel, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Goal f4524u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Goal goal) {
        super(2);
        this.f4524u = goal;
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
        Goal goal = this.f4524u;
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
        FireStoreUtilsKt.fetchCourseContent("en", goalId2, new p(goal));
        return hs.k.f19476a;
    }
}
