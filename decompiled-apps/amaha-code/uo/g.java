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
import kotlinx.coroutines.d0;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.o0;
import ta.v;
/* compiled from: ExperimentNotificationsFragment.kt */
@ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.fragment.ExperimentNotificationsFragment$findAndSetNotificationV3$2", f = "ExperimentNotificationsFragment.kt", l = {1185}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class g extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f34283u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Goal f34284v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ k f34285w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ boolean f34286x;

    /* compiled from: ExperimentNotificationsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.p<Boolean, TemplateModel, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ k f34287u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ boolean f34288v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Goal f34289w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar, boolean z10, Goal goal) {
            super(2);
            this.f34287u = kVar;
            this.f34288v = z10;
            this.f34289w = goal;
        }

        @Override // ss.p
        public final hs.k invoke(Boolean bool, TemplateModel templateModel) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean booleanValue = bool.booleanValue();
            TemplateModel templateModel2 = templateModel;
            boolean z13 = this.f34288v;
            k kVar = this.f34287u;
            Goal goal = this.f34289w;
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
                                boolean z14 = this.f34288v;
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
                                if (utils.updateV3ActivityNotification(requireContext, z14, time, type, goalId, goalName, courseName, reminderTitle3, reminderBody2)) {
                                    goal.setNotificationScheduled(z13);
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
                        return hs.k.f19476a;
                    }
                }
            }
            String goalId2 = goal.getGoalId();
            kotlin.jvm.internal.i.d(goalId2);
            FireStoreUtilsKt.fetchCourseContent("en", goalId2, new f(kVar, z13, goal));
            return hs.k.f19476a;
        }
    }

    /* compiled from: ExperimentNotificationsFragment.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.fragment.ExperimentNotificationsFragment$findAndSetNotificationV3$2$2", f = "ExperimentNotificationsFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ k f34290u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k kVar, ls.d<? super b> dVar) {
            super(2, dVar);
            this.f34290u = kVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new b(this.f34290u, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((b) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            sp.b.d0(obj);
            k kVar = this.f34290u;
            if (kVar.isAdded()) {
                Toast.makeText(kVar.getContext(), "Something went wrong", 0).show();
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, Goal goal, ls.d dVar, boolean z10) {
        super(2, dVar);
        this.f34284v = goal;
        this.f34285w = kVar;
        this.f34286x = z10;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new g(this.f34285w, this.f34284v, dVar, this.f34286x);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((g) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        Goal goal = this.f34284v;
        k kVar = this.f34285w;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f34283u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            try {
                String goalId = goal.getGoalId();
                kotlin.jvm.internal.i.d(goalId);
                FireStoreUtilsKt.fetchCourseContentV3("en", goalId, new a(kVar, this.f34286x, goal));
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(kVar.f34311u, e10);
                kotlinx.coroutines.scheduling.c cVar = o0.f23640a;
                k1 k1Var = kotlinx.coroutines.internal.k.f23608a;
                b bVar = new b(kVar, null);
                this.f34283u = 1;
                if (v.S(k1Var, bVar, this) == aVar) {
                    return aVar;
                }
            }
        }
        return hs.k.f19476a;
    }
}
