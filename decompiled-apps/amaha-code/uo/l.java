package uo;

import android.app.ProgressDialog;
import android.content.Context;
import android.widget.Toast;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Utils;
/* compiled from: ExperimentNotificationsFragment.kt */
/* loaded from: classes2.dex */
public final class l extends kotlin.jvm.internal.k implements ss.p<Boolean, hs.f<? extends String, ? extends String>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ k f34399u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ boolean f34400v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Goal f34401w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(k kVar, boolean z10, Goal goal) {
        super(2);
        this.f34399u = kVar;
        this.f34400v = z10;
        this.f34401w = goal;
    }

    @Override // ss.p
    public final hs.k invoke(Boolean bool, hs.f<? extends String, ? extends String> fVar) {
        boolean booleanValue = bool.booleanValue();
        hs.f<? extends String, ? extends String> fVar2 = fVar;
        k kVar = this.f34399u;
        if (booleanValue && fVar2 != null) {
            Utils utils = Utils.INSTANCE;
            Context requireContext = kVar.requireContext();
            kotlin.jvm.internal.i.f(requireContext, "requireContext()");
            boolean z10 = this.f34400v;
            Goal goal = this.f34401w;
            long time = goal.getmStartDate().getTime();
            long time2 = goal.getmScheduleDate().getTime();
            String type = goal.getType();
            kotlin.jvm.internal.i.d(type);
            String goalId = goal.getGoalId();
            kotlin.jvm.internal.i.d(goalId);
            String courseName = goal.getCourseName();
            kotlin.jvm.internal.i.d(courseName);
            String goalName = goal.getGoalName();
            kotlin.jvm.internal.i.d(goalName);
            utils.updateActivityNotification(requireContext, z10, time, time2, type, goalId, courseName, goalName, (String) fVar2.f19464u, (String) fVar2.f19465v);
            goal.setNotificationScheduled(this.f34400v);
            FirebasePersistence.getInstance().updateGoal(goal, Boolean.TRUE);
        } else {
            Toast.makeText(kVar.getContext(), "Something went wrong", 0).show();
        }
        ProgressDialog progressDialog = kVar.f34316z;
        if (progressDialog != null) {
            progressDialog.dismiss();
            return hs.k.f19476a;
        }
        kotlin.jvm.internal.i.q("progressDialog");
        throw null;
    }
}
