package uo;

import android.app.ProgressDialog;
import android.content.Context;
import android.widget.Toast;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.TemplateModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Utils;
/* compiled from: ExperimentNotificationsFragment.kt */
/* loaded from: classes2.dex */
public final class f extends kotlin.jvm.internal.k implements ss.p<Boolean, TemplateModel, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ k f34280u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ boolean f34281v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Goal f34282w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, boolean z10, Goal goal) {
        super(2);
        this.f34280u = kVar;
        this.f34281v = z10;
        this.f34282w = goal;
    }

    @Override // ss.p
    public final hs.k invoke(Boolean bool, TemplateModel templateModel) {
        boolean z10;
        boolean booleanValue = bool.booleanValue();
        TemplateModel templateModel2 = templateModel;
        k kVar = this.f34280u;
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
                    boolean z11 = this.f34281v;
                    Goal goal = this.f34282w;
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
                    if (utils.updateV3ActivityNotification(requireContext, z11, time, type, goalId, goalName, courseName, reminderTitle2, reminderBody)) {
                        goal.setNotificationScheduled(this.f34281v);
                        FirebasePersistence.getInstance().updateGoal(goal, Boolean.TRUE);
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
        } else if (kVar.isAdded()) {
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
