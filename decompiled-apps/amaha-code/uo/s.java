package uo;

import android.content.Context;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.Calendar;
import java.util.Date;
/* compiled from: ExperimentNotificationsFragment.kt */
/* loaded from: classes2.dex */
public final class s extends kotlin.jvm.internal.k implements ss.p<Boolean, hs.f<? extends String, ? extends String>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ k f34430u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Goal f34431v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ long f34432w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ RobertoTextView f34433x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(k kVar, Goal goal, long j10, RobertoTextView robertoTextView) {
        super(2);
        this.f34430u = kVar;
        this.f34431v = goal;
        this.f34432w = j10;
        this.f34433x = robertoTextView;
    }

    @Override // ss.p
    public final hs.k invoke(Boolean bool, hs.f<? extends String, ? extends String> fVar) {
        hs.f<? extends String, ? extends String> fVar2 = fVar;
        if (bool.booleanValue() && fVar2 != null) {
            Utils utils = Utils.INSTANCE;
            k kVar = this.f34430u;
            Context requireContext = kVar.requireContext();
            kotlin.jvm.internal.i.f(requireContext, "requireContext()");
            Goal goal = this.f34431v;
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
            String str = (String) fVar2.f19464u;
            String str2 = (String) fVar2.f19465v;
            utils.updateActivityNotification(requireContext, false, time, time2, type, goalId, courseName, goalName, str, str2);
            Context requireContext2 = kVar.requireContext();
            kotlin.jvm.internal.i.f(requireContext2, "requireContext()");
            boolean notificationScheduled = goal.getNotificationScheduled();
            long time3 = goal.getmStartDate().getTime();
            long j10 = this.f34432w;
            String type2 = goal.getType();
            kotlin.jvm.internal.i.d(type2);
            String goalId2 = goal.getGoalId();
            kotlin.jvm.internal.i.d(goalId2);
            String courseName2 = goal.getCourseName();
            kotlin.jvm.internal.i.d(courseName2);
            String goalName2 = goal.getGoalName();
            kotlin.jvm.internal.i.d(goalName2);
            utils.updateActivityNotification(requireContext2, notificationScheduled, time3, j10, type2, goalId2, courseName2, goalName2, str, str2);
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(this.f34432w);
            Date time4 = calendar.getTime();
            kotlin.jvm.internal.i.f(time4, "getInstance().apply { ti…eduledTimeInMillis }.time");
            goal.setmScheduleDate(time4);
            FirebasePersistence.getInstance().updateGoal(goal, Boolean.FALSE);
            int i6 = k.E;
            kVar.U(this.f34433x, goal);
        }
        return hs.k.f19476a;
    }
}
