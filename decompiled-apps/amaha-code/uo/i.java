package uo;

import android.app.ProgressDialog;
import android.content.Context;
import android.widget.Toast;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.TemplateModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.Calendar;
import java.util.Date;
/* compiled from: ExperimentNotificationsFragment.kt */
/* loaded from: classes2.dex */
public final class i extends kotlin.jvm.internal.k implements ss.p<Boolean, TemplateModel, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ k f34299u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Goal f34300v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ long f34301w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ RobertoTextView f34302x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, Goal goal, long j10, RobertoTextView robertoTextView) {
        super(2);
        this.f34299u = kVar;
        this.f34300v = goal;
        this.f34301w = j10;
        this.f34302x = robertoTextView;
    }

    @Override // ss.p
    public final hs.k invoke(Boolean bool, TemplateModel templateModel) {
        boolean z10;
        boolean booleanValue = bool.booleanValue();
        TemplateModel templateModel2 = templateModel;
        k kVar = this.f34299u;
        if (booleanValue && templateModel2 != null) {
            if (kVar.isAdded()) {
                String reminderTitle = templateModel2.getReminderTitle();
                if (reminderTitle != null && !gv.n.B0(reminderTitle)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z10) {
                    Utils utils = Utils.INSTANCE;
                    Context requireContext = kVar.requireContext();
                    kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                    Goal goal = this.f34300v;
                    long time = goal.getScheduledDate().getTime() * 1000;
                    String type = goal.getType();
                    kotlin.jvm.internal.i.d(type);
                    String goalId = goal.getGoalId();
                    kotlin.jvm.internal.i.d(goalId);
                    String goalName = goal.getGoalName();
                    kotlin.jvm.internal.i.d(goalName);
                    String courseName = goal.getCourseName();
                    kotlin.jvm.internal.i.d(courseName);
                    String reminderTitle2 = templateModel2.getReminderTitle();
                    kotlin.jvm.internal.i.d(reminderTitle2);
                    String reminderBody = templateModel2.getReminderBody();
                    kotlin.jvm.internal.i.d(reminderBody);
                    if (utils.updateV3ActivityNotification(requireContext, false, time, type, goalId, goalName, courseName, reminderTitle2, reminderBody)) {
                        Context requireContext2 = kVar.requireContext();
                        kotlin.jvm.internal.i.f(requireContext2, "requireContext()");
                        boolean notificationScheduled = goal.getNotificationScheduled();
                        long j10 = this.f34301w;
                        String type2 = goal.getType();
                        kotlin.jvm.internal.i.d(type2);
                        String goalId2 = goal.getGoalId();
                        kotlin.jvm.internal.i.d(goalId2);
                        String goalName2 = goal.getGoalName();
                        kotlin.jvm.internal.i.d(goalName2);
                        String courseName2 = goal.getCourseName();
                        kotlin.jvm.internal.i.d(courseName2);
                        String reminderTitle3 = templateModel2.getReminderTitle();
                        kotlin.jvm.internal.i.d(reminderTitle3);
                        String reminderBody2 = templateModel2.getReminderBody();
                        kotlin.jvm.internal.i.d(reminderBody2);
                        if (utils.updateV3ActivityNotification(requireContext2, notificationScheduled, j10, type2, goalId2, goalName2, courseName2, reminderTitle3, reminderBody2)) {
                            Calendar calendar = Calendar.getInstance();
                            calendar.setTimeInMillis(this.f34301w);
                            Date time2 = calendar.getTime();
                            kotlin.jvm.internal.i.f(time2, "getInstance().apply { ti…eduledTimeInMillis }.time");
                            goal.setmScheduleDate(time2);
                            FirebasePersistence.getInstance().updateGoal(goal, Boolean.TRUE);
                            int i6 = k.E;
                            kVar.U(this.f34302x, goal);
                        } else {
                            Toast.makeText(kVar.getContext(), "Something went wrong", 0).show();
                        }
                    } else {
                        Toast.makeText(kVar.getContext(), "Something went wrong", 0).show();
                    }
                } else {
                    Toast.makeText(kVar.getContext(), "Something went wrong", 0).show();
                }
                ProgressDialog progressDialog = kVar.f34316z;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                } else {
                    kotlin.jvm.internal.i.q("progressDialog");
                    throw null;
                }
            }
        } else {
            Toast.makeText(kVar.getContext(), "Something went wrong", 0).show();
            ProgressDialog progressDialog2 = kVar.f34316z;
            if (progressDialog2 != null) {
                progressDialog2.dismiss();
            } else {
                kotlin.jvm.internal.i.q("progressDialog");
                throw null;
            }
        }
        return hs.k.f19476a;
    }
}
