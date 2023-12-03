package wo;

import android.app.Application;
import com.google.firebase.auth.FirebaseAuth;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.persistence.GoalsNotificationPersistence;
/* compiled from: ExperimentNotificationsViewModel.kt */
/* loaded from: classes2.dex */
public final class y extends androidx.lifecycle.b {
    public final fm.j0 A;
    public final String B;
    public final androidx.lifecycle.w<Boolean> C;
    public final androidx.lifecycle.w<FirestoreGoal> D;
    public final androidx.lifecycle.w<FirestoreGoal> E;

    /* renamed from: y  reason: collision with root package name */
    public final GoalsNotificationPersistence f37011y;

    /* renamed from: z  reason: collision with root package name */
    public final hs.i f37012z;

    /* compiled from: ExperimentNotificationsViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<em.d> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Application f37013u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            super(0);
            this.f37013u = application;
        }

        @Override // ss.a
        public final em.d invoke() {
            return new em.d(this.f37013u);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Application application) {
        super(application);
        MyApplication myApplication;
        GoalsNotificationPersistence goalsNotificationPersistence;
        kotlin.jvm.internal.i.g(application, "application");
        if (application instanceof MyApplication) {
            myApplication = (MyApplication) application;
        } else {
            myApplication = null;
        }
        if (myApplication != null) {
            goalsNotificationPersistence = myApplication.b();
        } else {
            goalsNotificationPersistence = null;
        }
        this.f37011y = goalsNotificationPersistence;
        this.f37012z = sp.b.O(new a(application));
        this.A = new fm.j0();
        fd.f fVar = FirebaseAuth.getInstance().f;
        this.B = fVar != null ? fVar.j0() : null;
        this.C = new androidx.lifecycle.w<>(Boolean.FALSE);
        this.D = new androidx.lifecycle.w<>();
        this.E = new androidx.lifecycle.w<>();
    }

    public static final em.d e(y yVar) {
        return (em.d) yVar.f37012z.getValue();
    }

    public final void f(FirestoreGoal firestoreGoal, boolean z10) {
        kotlin.jvm.internal.i.g(firestoreGoal, "firestoreGoal");
        ta.v.H(kc.f.H(this), null, 0, new a0(this, firestoreGoal, z10, null), 3);
    }
}
