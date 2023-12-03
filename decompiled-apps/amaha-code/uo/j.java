package uo;

import android.app.ProgressDialog;
import android.content.Context;
import android.widget.Toast;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.TemplateModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.FireStoreUtilsKt;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.Calendar;
import java.util.Date;
import kotlinx.coroutines.d0;
/* compiled from: ExperimentNotificationsFragment.kt */
@ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.fragment.ExperimentNotificationsFragment$findAndUpdateNotificationV3$2", f = "ExperimentNotificationsFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class j extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Goal f34303u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ k f34304v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ long f34305w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ RobertoTextView f34306x;

    /* compiled from: ExperimentNotificationsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.p<Boolean, TemplateModel, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ k f34307u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ Goal f34308v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ long f34309w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ RobertoTextView f34310x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar, Goal goal, long j10, RobertoTextView robertoTextView) {
            super(2);
            this.f34307u = kVar;
            this.f34308v = goal;
            this.f34309w = j10;
            this.f34310x = robertoTextView;
        }

        @Override // ss.p
        public final hs.k invoke(Boolean bool, TemplateModel templateModel) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean booleanValue = bool.booleanValue();
            TemplateModel templateModel2 = templateModel;
            k kVar = this.f34307u;
            Goal goal = this.f34308v;
            if (booleanValue && templateModel2 != null) {
                try {
                    String reminderTitle = templateModel2.getReminderTitle();
                    z10 = true;
                    if (reminderTitle != null && !gv.n.B0(reminderTitle)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(kVar.f34311u, e10);
                }
                if (z11) {
                    String reminderBody = templateModel2.getReminderBody();
                    if (reminderBody != null && !gv.n.B0(reminderBody)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        if (kVar.isAdded()) {
                            String reminderTitle2 = templateModel2.getReminderTitle();
                            if (reminderTitle2 != null && !gv.n.B0(reminderTitle2)) {
                                z10 = false;
                            }
                            if (!z10) {
                                Utils utils = Utils.INSTANCE;
                                Context requireContext = kVar.requireContext();
                                kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                                long time = goal.getScheduledDate().getTime() * 1000;
                                String type = goal.getType();
                                kotlin.jvm.internal.i.d(type);
                                String goalId = goal.getGoalId();
                                kotlin.jvm.internal.i.d(goalId);
                                String goalName = goal.getGoalName();
                                kotlin.jvm.internal.i.d(goalName);
                                String courseName = goal.getCourseName();
                                kotlin.jvm.internal.i.d(courseName);
                                String reminderTitle3 = templateModel2.getReminderTitle();
                                kotlin.jvm.internal.i.d(reminderTitle3);
                                String reminderBody2 = templateModel2.getReminderBody();
                                kotlin.jvm.internal.i.d(reminderBody2);
                                if (utils.updateV3ActivityNotification(requireContext, false, time, type, goalId, goalName, courseName, reminderTitle3, reminderBody2)) {
                                    Context requireContext2 = kVar.requireContext();
                                    kotlin.jvm.internal.i.f(requireContext2, "requireContext()");
                                    boolean notificationScheduled = goal.getNotificationScheduled();
                                    long j10 = this.f34309w;
                                    String type2 = goal.getType();
                                    kotlin.jvm.internal.i.d(type2);
                                    String goalId2 = goal.getGoalId();
                                    kotlin.jvm.internal.i.d(goalId2);
                                    String goalName2 = goal.getGoalName();
                                    kotlin.jvm.internal.i.d(goalName2);
                                    String courseName2 = goal.getCourseName();
                                    kotlin.jvm.internal.i.d(courseName2);
                                    String reminderTitle4 = templateModel2.getReminderTitle();
                                    kotlin.jvm.internal.i.d(reminderTitle4);
                                    String reminderBody3 = templateModel2.getReminderBody();
                                    kotlin.jvm.internal.i.d(reminderBody3);
                                    if (utils.updateV3ActivityNotification(requireContext2, notificationScheduled, j10, type2, goalId2, goalName2, courseName2, reminderTitle4, reminderBody3)) {
                                        Calendar calendar = Calendar.getInstance();
                                        calendar.setTimeInMillis(this.f34309w);
                                        Date time2 = calendar.getTime();
                                        kotlin.jvm.internal.i.f(time2, "getInstance().apply { ti…eduledTimeInMillis }.time");
                                        goal.setmScheduleDate(time2);
                                        FirebasePersistence.getInstance().updateGoal(goal, Boolean.TRUE);
                                        RobertoTextView robertoTextView = this.f34310x;
                                        int i6 = k.E;
                                        kVar.U(robertoTextView, goal);
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
                        return hs.k.f19476a;
                    }
                }
            }
            String goalId3 = goal.getGoalId();
            kotlin.jvm.internal.i.d(goalId3);
            FireStoreUtilsKt.fetchCourseContent("en", goalId3, new i(this.f34307u, this.f34308v, this.f34309w, this.f34310x));
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(long j10, k kVar, Goal goal, RobertoTextView robertoTextView, ls.d dVar) {
        super(2, dVar);
        this.f34303u = goal;
        this.f34304v = kVar;
        this.f34305w = j10;
        this.f34306x = robertoTextView;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        Goal goal = this.f34303u;
        return new j(this.f34305w, this.f34304v, goal, this.f34306x, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((j) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        sp.b.d0(obj);
        String goalId = this.f34303u.getGoalId();
        kotlin.jvm.internal.i.d(goalId);
        FireStoreUtilsKt.fetchCourseContentV3("en", goalId, new a(this.f34304v, this.f34303u, this.f34305w, this.f34306x));
        return hs.k.f19476a;
    }
}
