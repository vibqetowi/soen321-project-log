package uo;

import android.app.ProgressDialog;
import android.content.Context;
import android.widget.Toast;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.Calendar;
import java.util.Date;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.o0;
import ta.v;
/* compiled from: ExperimentNotificationsFragment.kt */
@ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.fragment.ExperimentNotificationsFragment$findAndUpdateCustomNotification$2", f = "ExperimentNotificationsFragment.kt", l = {1311, 1316, 1323}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class h extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f34291u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ k f34292v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Goal f34293w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ long f34294x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ RobertoTextView f34295y;

    /* compiled from: ExperimentNotificationsFragment.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.fragment.ExperimentNotificationsFragment$findAndUpdateCustomNotification$2$2", f = "ExperimentNotificationsFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ k f34296u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f34296u = kVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f34296u, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            sp.b.d0(obj);
            k kVar = this.f34296u;
            if (kVar.isAdded()) {
                Toast.makeText(kVar.getContext(), "Something went wrong", 0).show();
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ExperimentNotificationsFragment.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.fragment.ExperimentNotificationsFragment$findAndUpdateCustomNotification$2$3", f = "ExperimentNotificationsFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ k f34297u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k kVar, ls.d<? super b> dVar) {
            super(2, dVar);
            this.f34297u = kVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new b(this.f34297u, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((b) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            sp.b.d0(obj);
            k kVar = this.f34297u;
            if (kVar.isAdded()) {
                Toast.makeText(kVar.getContext(), "Something went wrong", 0).show();
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ExperimentNotificationsFragment.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.fragment.ExperimentNotificationsFragment$findAndUpdateCustomNotification$2$4", f = "ExperimentNotificationsFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ k f34298u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(k kVar, ls.d<? super c> dVar) {
            super(2, dVar);
            this.f34298u = kVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new c(this.f34298u, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((c) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            sp.b.d0(obj);
            k kVar = this.f34298u;
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
    public h(long j10, k kVar, Goal goal, RobertoTextView robertoTextView, ls.d dVar) {
        super(2, dVar);
        this.f34292v = kVar;
        this.f34293w = goal;
        this.f34294x = j10;
        this.f34295y = robertoTextView;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new h(this.f34294x, this.f34292v, this.f34293w, this.f34295y, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((h) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        Goal goal = this.f34293w;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f34291u;
        k kVar = this.f34292v;
        try {
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(kVar.f34311u, e10);
            kotlinx.coroutines.scheduling.c cVar = o0.f23640a;
            k1 k1Var = kotlinx.coroutines.internal.k.f23608a;
            c cVar2 = new c(kVar, null);
            this.f34291u = 3;
            if (v.S(k1Var, cVar2, this) == aVar) {
                return aVar;
            }
        }
        if (i6 != 0) {
            if (i6 != 1 && i6 != 2) {
                if (i6 == 3) {
                    sp.b.d0(obj);
                    return hs.k.f19476a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sp.b.d0(obj);
        } else {
            sp.b.d0(obj);
            Utils utils = Utils.INSTANCE;
            Context requireContext = kVar.requireContext();
            kotlin.jvm.internal.i.f(requireContext, "requireContext()");
            String type = goal.getType();
            kotlin.jvm.internal.i.d(type);
            String goalId = goal.getGoalId();
            kotlin.jvm.internal.i.d(goalId);
            String goalName = goal.getGoalName();
            kotlin.jvm.internal.i.d(goalName);
            String courseName = goal.getCourseName();
            kotlin.jvm.internal.i.d(courseName);
            String string = kVar.getString(R.string.customGoalNotifiationHeader);
            kotlin.jvm.internal.i.f(string, "getString(R.string.customGoalNotifiationHeader)");
            String goalName2 = goal.getGoalName();
            kotlin.jvm.internal.i.d(goalName2);
            String string2 = kVar.getString(R.string.customGoalNotifiationBody, goalName2);
            kotlin.jvm.internal.i.f(string2, "getString(R.string.custo…ionBody, goal.goalName!!)");
            if (utils.updateV3ActivityNotification(requireContext, false, goal.getScheduledDate().getTime() * 1000, type, goalId, goalName, courseName, string, string2)) {
                Context requireContext2 = kVar.requireContext();
                kotlin.jvm.internal.i.f(requireContext2, "requireContext()");
                boolean notificationScheduled = goal.getNotificationScheduled();
                long j10 = this.f34294x;
                String type2 = goal.getType();
                kotlin.jvm.internal.i.d(type2);
                String goalId2 = goal.getGoalId();
                kotlin.jvm.internal.i.d(goalId2);
                String goalName3 = goal.getGoalName();
                kotlin.jvm.internal.i.d(goalName3);
                String courseName2 = goal.getCourseName();
                kotlin.jvm.internal.i.d(courseName2);
                String string3 = kVar.getString(R.string.customGoalNotifiationHeader);
                kotlin.jvm.internal.i.f(string3, "getString(R.string.customGoalNotifiationHeader)");
                String goalName4 = goal.getGoalName();
                kotlin.jvm.internal.i.d(goalName4);
                String string4 = kVar.getString(R.string.customGoalNotifiationBody, goalName4);
                kotlin.jvm.internal.i.f(string4, "getString(R.string.custo…ionBody, goal.goalName!!)");
                if (utils.updateV3ActivityNotification(requireContext2, notificationScheduled, j10, type2, goalId2, goalName3, courseName2, string3, string4)) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(this.f34294x);
                    Date time = calendar.getTime();
                    kotlin.jvm.internal.i.f(time, "getInstance().apply { ti…eduledTimeInMillis }.time");
                    goal.setmScheduleDate(time);
                    FirebasePersistence.getInstance().updateGoal(goal, Boolean.TRUE);
                    if (kVar.isAdded()) {
                        RobertoTextView robertoTextView = this.f34295y;
                        int i10 = k.E;
                        kVar.U(robertoTextView, goal);
                    }
                } else {
                    kotlinx.coroutines.scheduling.c cVar3 = o0.f23640a;
                    k1 k1Var2 = kotlinx.coroutines.internal.k.f23608a;
                    a aVar2 = new a(kVar, null);
                    this.f34291u = 1;
                    if (v.S(k1Var2, aVar2, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                kotlinx.coroutines.scheduling.c cVar4 = o0.f23640a;
                k1 k1Var3 = kotlinx.coroutines.internal.k.f23608a;
                b bVar = new b(kVar, null);
                this.f34291u = 2;
                if (v.S(k1Var3, bVar, this) == aVar) {
                    return aVar;
                }
            }
        }
        if (kVar.isAdded()) {
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
