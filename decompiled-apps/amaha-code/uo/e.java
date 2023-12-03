package uo;

import android.app.ProgressDialog;
import android.content.Context;
import android.widget.Toast;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.o0;
import ta.v;
/* compiled from: ExperimentNotificationsFragment.kt */
@ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.fragment.ExperimentNotificationsFragment$findAndSetCustomNotification$2", f = "ExperimentNotificationsFragment.kt", l = {1206, 1213}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class e extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f34274u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ k f34275v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ boolean f34276w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Goal f34277x;

    /* compiled from: ExperimentNotificationsFragment.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.fragment.ExperimentNotificationsFragment$findAndSetCustomNotification$2$1", f = "ExperimentNotificationsFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ k f34278u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f34278u = kVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f34278u, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            sp.b.d0(obj);
            k kVar = this.f34278u;
            if (kVar.isAdded()) {
                Toast.makeText(kVar.getContext(), "Something went wrong", 0).show();
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ExperimentNotificationsFragment.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.fragment.ExperimentNotificationsFragment$findAndSetCustomNotification$2$2", f = "ExperimentNotificationsFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ k f34279u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k kVar, ls.d<? super b> dVar) {
            super(2, dVar);
            this.f34279u = kVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new b(this.f34279u, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((b) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            sp.b.d0(obj);
            k kVar = this.f34279u;
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
    public e(k kVar, Goal goal, ls.d dVar, boolean z10) {
        super(2, dVar);
        this.f34275v = kVar;
        this.f34276w = z10;
        this.f34277x = goal;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        boolean z10 = this.f34276w;
        return new e(this.f34275v, this.f34277x, dVar, z10);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((e) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        Goal goal = this.f34277x;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f34274u;
        k kVar = this.f34275v;
        try {
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(kVar.f34311u, e10);
            kotlinx.coroutines.scheduling.c cVar = o0.f23640a;
            k1 k1Var = kotlinx.coroutines.internal.k.f23608a;
            b bVar = new b(kVar, null);
            this.f34274u = 2;
            if (v.S(k1Var, bVar, this) == aVar) {
                return aVar;
            }
        }
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 == 2) {
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
            boolean z10 = this.f34276w;
            long time = goal.getScheduledDate().getTime() * 1000;
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
            if (utils.updateV3ActivityNotification(requireContext, z10, time, type, goalId, goalName, courseName, string, string2)) {
                goal.setNotificationScheduled(this.f34276w);
                FirebasePersistence.getInstance().updateGoal(goal, Boolean.TRUE);
            } else {
                kotlinx.coroutines.scheduling.c cVar2 = o0.f23640a;
                k1 k1Var2 = kotlinx.coroutines.internal.k.f23608a;
                a aVar2 = new a(kVar, null);
                this.f34274u = 1;
                if (v.S(k1Var2, aVar2, this) == aVar) {
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
