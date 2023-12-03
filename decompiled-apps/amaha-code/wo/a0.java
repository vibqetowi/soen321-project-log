package wo;

import com.appsflyer.R;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.components.goals.model.NotificationGoal;
import com.theinnerhour.b2b.persistence.GoalsNotificationPersistence;
/* compiled from: ExperimentNotificationsViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.viewModel.ExperimentNotificationsViewModel$onGoalToggled$1", f = "ExperimentNotificationsViewModel.kt", l = {R.styleable.AppCompatTheme_alertDialogStyle, R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle, R.styleable.AppCompatTheme_buttonBarStyle, R.styleable.AppCompatTheme_colorPrimary}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class a0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public NotificationGoal f36865u;

    /* renamed from: v  reason: collision with root package name */
    public int f36866v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ y f36867w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ FirestoreGoal f36868x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ boolean f36869y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(y yVar, FirestoreGoal firestoreGoal, boolean z10, ls.d<? super a0> dVar) {
        super(2, dVar);
        this.f36867w = yVar;
        this.f36868x = firestoreGoal;
        this.f36869y = z10;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new a0(this.f36867w, this.f36868x, this.f36869y, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((a0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ee  */
    @Override // ns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        NotificationGoal notificationGoal;
        boolean booleanValue;
        boolean booleanValue2;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f36866v;
        FirestoreGoal firestoreGoal = this.f36868x;
        boolean z10 = this.f36869y;
        boolean z11 = true;
        y yVar = this.f36867w;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 == 4) {
                            sp.b.d0(obj);
                            booleanValue2 = ((Boolean) obj).booleanValue();
                            yVar.C.i(Boolean.FALSE);
                            if (booleanValue2) {
                                yVar.D.i(firestoreGoal);
                            }
                            return hs.k.f19476a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    notificationGoal = this.f36865u;
                    sp.b.d0(obj);
                    booleanValue = ((Boolean) obj).booleanValue();
                    if (booleanValue) {
                        if (z10) {
                            GoalsNotificationPersistence goalsNotificationPersistence = yVar.f37011y;
                            if (goalsNotificationPersistence != null) {
                                goalsNotificationPersistence.addGoal(notificationGoal);
                            }
                        } else {
                            GoalsNotificationPersistence goalsNotificationPersistence2 = yVar.f37011y;
                            if (goalsNotificationPersistence2 != null) {
                                goalsNotificationPersistence2.removeGoal(notificationGoal.getGoalId());
                            }
                        }
                    }
                    fm.j0 j0Var = yVar.A;
                    this.f36865u = null;
                    this.f36866v = 4;
                    obj = j0Var.b(firestoreGoal, yVar.B, false, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    booleanValue2 = ((Boolean) obj).booleanValue();
                    yVar.C.i(Boolean.FALSE);
                    if (booleanValue2) {
                    }
                    return hs.k.f19476a;
                }
                notificationGoal = this.f36865u;
                sp.b.d0(obj);
                booleanValue = ((Boolean) obj).booleanValue();
                if (booleanValue) {
                }
                fm.j0 j0Var2 = yVar.A;
                this.f36865u = null;
                this.f36866v = 4;
                obj = j0Var2.b(firestoreGoal, yVar.B, false, this);
                if (obj == aVar) {
                }
                booleanValue2 = ((Boolean) obj).booleanValue();
                yVar.C.i(Boolean.FALSE);
                if (booleanValue2) {
                }
                return hs.k.f19476a;
            }
            sp.b.d0(obj);
        } else {
            sp.b.d0(obj);
            if (yVar.B != null) {
                yVar.C.i(Boolean.TRUE);
                firestoreGoal.setNotificationScheduled(z10);
                this.f36866v = 1;
                obj = ((em.d) yVar.f37012z.getValue()).c(firestoreGoal, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return hs.k.f19476a;
        }
        notificationGoal = (NotificationGoal) obj;
        if (notificationGoal != null && (!gv.n.B0(notificationGoal.getTitle())) && (!gv.n.B0(notificationGoal.getBody()))) {
            String notificationType = notificationGoal.getNotificationType();
            if (!kotlin.jvm.internal.i.b(notificationType, GoalsNotificationPersistence.GOALS_NOTIF_RA)) {
                z11 = kotlin.jvm.internal.i.b(notificationType, GoalsNotificationPersistence.GOALS_NOTIF_DYNAMIC_RA);
            }
            if (z11) {
                this.f36865u = notificationGoal;
                this.f36866v = 2;
                obj = y.e(yVar).f(notificationGoal, !z10, this);
                if (obj == aVar) {
                    return aVar;
                }
                booleanValue = ((Boolean) obj).booleanValue();
                if (booleanValue) {
                }
                fm.j0 j0Var22 = yVar.A;
                this.f36865u = null;
                this.f36866v = 4;
                obj = j0Var22.b(firestoreGoal, yVar.B, false, this);
                if (obj == aVar) {
                }
                booleanValue2 = ((Boolean) obj).booleanValue();
                yVar.C.i(Boolean.FALSE);
                if (booleanValue2) {
                }
                return hs.k.f19476a;
            }
            this.f36865u = notificationGoal;
            this.f36866v = 3;
            obj = y.e(yVar).e(notificationGoal, !z10, this);
            if (obj == aVar) {
                return aVar;
            }
            booleanValue = ((Boolean) obj).booleanValue();
            if (booleanValue) {
            }
            fm.j0 j0Var222 = yVar.A;
            this.f36865u = null;
            this.f36866v = 4;
            obj = j0Var222.b(firestoreGoal, yVar.B, false, this);
            if (obj == aVar) {
            }
            booleanValue2 = ((Boolean) obj).booleanValue();
            yVar.C.i(Boolean.FALSE);
            if (booleanValue2) {
            }
            return hs.k.f19476a;
        }
        yVar.C.i(Boolean.FALSE);
        return hs.k.f19476a;
    }
}
