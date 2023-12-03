package wo;

import com.appsflyer.R;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.components.goals.model.NotificationGoal;
import com.theinnerhour.b2b.model.CustomDate;
import com.theinnerhour.b2b.persistence.GoalsNotificationPersistence;
/* compiled from: ExperimentNotificationsViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.viewModel.ExperimentNotificationsViewModel$onGoalTimeChanged$1", f = "ExperimentNotificationsViewModel.kt", l = {R.styleable.AppCompatTheme_listPopupWindowStyle, R.styleable.AppCompatTheme_listPreferredItemPaddingStart, R.styleable.AppCompatTheme_panelMenuListWidth, R.styleable.AppCompatTheme_textAppearanceListItemSecondary, R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, R.styleable.AppCompatTheme_windowMinWidthMinor}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class z extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public NotificationGoal f37014u;

    /* renamed from: v  reason: collision with root package name */
    public int f37015v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ y f37016w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ FirestoreGoal f37017x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ long f37018y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(y yVar, FirestoreGoal firestoreGoal, long j10, ls.d<? super z> dVar) {
        super(2, dVar);
        this.f37016w = yVar;
        this.f37017x = firestoreGoal;
        this.f37018y = j10;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new z(this.f37016w, this.f37017x, this.f37018y, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((z) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0133 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0143  */
    @Override // ns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        NotificationGoal notificationGoal;
        boolean z10;
        boolean b10;
        String notificationType;
        GoalsNotificationPersistence goalsNotificationPersistence;
        boolean booleanValue;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f37015v;
        long j10 = this.f37018y;
        FirestoreGoal firestoreGoal = this.f37017x;
        boolean z11 = true;
        y yVar = this.f37016w;
        switch (i6) {
            case 0:
                sp.b.d0(obj);
                if (yVar.B != null) {
                    yVar.C.i(Boolean.TRUE);
                    this.f37015v = 1;
                    obj = ((em.d) yVar.f37012z.getValue()).c(firestoreGoal, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    notificationGoal = (NotificationGoal) obj;
                    if (notificationGoal == null && (!gv.n.B0(notificationGoal.getTitle())) && (!gv.n.B0(notificationGoal.getBody()))) {
                        if (firestoreGoal.getNotificationScheduled()) {
                            String notificationType2 = notificationGoal.getNotificationType();
                            if (kotlin.jvm.internal.i.b(notificationType2, GoalsNotificationPersistence.GOALS_NOTIF_RA)) {
                                b10 = true;
                            } else {
                                b10 = kotlin.jvm.internal.i.b(notificationType2, GoalsNotificationPersistence.GOALS_NOTIF_DYNAMIC_RA);
                            }
                            if (b10) {
                                em.d e10 = y.e(yVar);
                                this.f37014u = notificationGoal;
                                this.f37015v = 2;
                                obj = e10.f(notificationGoal, true, this);
                                if (obj == aVar) {
                                    return aVar;
                                }
                                z10 = ((Boolean) obj).booleanValue();
                                if (z10 && firestoreGoal.getNotificationScheduled()) {
                                    notificationGoal.setGoalScheduleTime(j10);
                                    notificationType = notificationGoal.getNotificationType();
                                    if (!kotlin.jvm.internal.i.b(notificationType, GoalsNotificationPersistence.GOALS_NOTIF_RA)) {
                                        z11 = kotlin.jvm.internal.i.b(notificationType, GoalsNotificationPersistence.GOALS_NOTIF_DYNAMIC_RA);
                                    }
                                    if (!z11) {
                                        em.d e11 = y.e(yVar);
                                        this.f37014u = notificationGoal;
                                        this.f37015v = 4;
                                        obj = e11.f(notificationGoal, false, this);
                                        if (obj == aVar) {
                                            return aVar;
                                        }
                                        z11 = ((Boolean) obj).booleanValue();
                                    } else {
                                        em.d e12 = y.e(yVar);
                                        this.f37014u = notificationGoal;
                                        this.f37015v = 5;
                                        obj = e12.e(notificationGoal, false, this);
                                        if (obj == aVar) {
                                            return aVar;
                                        }
                                        z11 = ((Boolean) obj).booleanValue();
                                    }
                                }
                                if (z11 && firestoreGoal.getNotificationScheduled() && (goalsNotificationPersistence = yVar.f37011y) != null) {
                                    goalsNotificationPersistence.addGoal(notificationGoal);
                                }
                                fm.j0 j0Var = yVar.A;
                                CustomDate customDate = new CustomDate();
                                customDate.setTime(j10);
                                firestoreGoal.setScheduledDate(customDate);
                                this.f37014u = null;
                                this.f37015v = 6;
                                obj = j0Var.b(firestoreGoal, yVar.B, false, this);
                                if (obj == aVar) {
                                    return aVar;
                                }
                                booleanValue = ((Boolean) obj).booleanValue();
                                yVar.C.i(Boolean.FALSE);
                                if (booleanValue) {
                                    yVar.E.i(firestoreGoal);
                                }
                            } else {
                                em.d e13 = y.e(yVar);
                                this.f37014u = notificationGoal;
                                this.f37015v = 3;
                                obj = e13.e(notificationGoal, true, this);
                                if (obj == aVar) {
                                    return aVar;
                                }
                                z10 = ((Boolean) obj).booleanValue();
                                if (z10) {
                                    notificationGoal.setGoalScheduleTime(j10);
                                    notificationType = notificationGoal.getNotificationType();
                                    if (!kotlin.jvm.internal.i.b(notificationType, GoalsNotificationPersistence.GOALS_NOTIF_RA)) {
                                    }
                                    if (!z11) {
                                    }
                                }
                                if (z11) {
                                    goalsNotificationPersistence.addGoal(notificationGoal);
                                }
                                fm.j0 j0Var2 = yVar.A;
                                CustomDate customDate2 = new CustomDate();
                                customDate2.setTime(j10);
                                firestoreGoal.setScheduledDate(customDate2);
                                this.f37014u = null;
                                this.f37015v = 6;
                                obj = j0Var2.b(firestoreGoal, yVar.B, false, this);
                                if (obj == aVar) {
                                }
                                booleanValue = ((Boolean) obj).booleanValue();
                                yVar.C.i(Boolean.FALSE);
                                if (booleanValue) {
                                }
                            }
                        } else {
                            z10 = true;
                            if (z10) {
                            }
                            if (z11) {
                            }
                            fm.j0 j0Var22 = yVar.A;
                            CustomDate customDate22 = new CustomDate();
                            customDate22.setTime(j10);
                            firestoreGoal.setScheduledDate(customDate22);
                            this.f37014u = null;
                            this.f37015v = 6;
                            obj = j0Var22.b(firestoreGoal, yVar.B, false, this);
                            if (obj == aVar) {
                            }
                            booleanValue = ((Boolean) obj).booleanValue();
                            yVar.C.i(Boolean.FALSE);
                            if (booleanValue) {
                            }
                        }
                    } else {
                        yVar.C.i(Boolean.FALSE);
                    }
                }
                return hs.k.f19476a;
            case 1:
                sp.b.d0(obj);
                notificationGoal = (NotificationGoal) obj;
                if (notificationGoal == null) {
                    break;
                }
                yVar.C.i(Boolean.FALSE);
                return hs.k.f19476a;
            case 2:
                notificationGoal = this.f37014u;
                sp.b.d0(obj);
                z10 = ((Boolean) obj).booleanValue();
                if (z10) {
                }
                if (z11) {
                }
                fm.j0 j0Var222 = yVar.A;
                CustomDate customDate222 = new CustomDate();
                customDate222.setTime(j10);
                firestoreGoal.setScheduledDate(customDate222);
                this.f37014u = null;
                this.f37015v = 6;
                obj = j0Var222.b(firestoreGoal, yVar.B, false, this);
                if (obj == aVar) {
                }
                booleanValue = ((Boolean) obj).booleanValue();
                yVar.C.i(Boolean.FALSE);
                if (booleanValue) {
                }
                return hs.k.f19476a;
            case 3:
                notificationGoal = this.f37014u;
                sp.b.d0(obj);
                z10 = ((Boolean) obj).booleanValue();
                if (z10) {
                }
                if (z11) {
                }
                fm.j0 j0Var2222 = yVar.A;
                CustomDate customDate2222 = new CustomDate();
                customDate2222.setTime(j10);
                firestoreGoal.setScheduledDate(customDate2222);
                this.f37014u = null;
                this.f37015v = 6;
                obj = j0Var2222.b(firestoreGoal, yVar.B, false, this);
                if (obj == aVar) {
                }
                booleanValue = ((Boolean) obj).booleanValue();
                yVar.C.i(Boolean.FALSE);
                if (booleanValue) {
                }
                return hs.k.f19476a;
            case 4:
                notificationGoal = this.f37014u;
                sp.b.d0(obj);
                z11 = ((Boolean) obj).booleanValue();
                if (z11) {
                }
                fm.j0 j0Var22222 = yVar.A;
                CustomDate customDate22222 = new CustomDate();
                customDate22222.setTime(j10);
                firestoreGoal.setScheduledDate(customDate22222);
                this.f37014u = null;
                this.f37015v = 6;
                obj = j0Var22222.b(firestoreGoal, yVar.B, false, this);
                if (obj == aVar) {
                }
                booleanValue = ((Boolean) obj).booleanValue();
                yVar.C.i(Boolean.FALSE);
                if (booleanValue) {
                }
                return hs.k.f19476a;
            case 5:
                notificationGoal = this.f37014u;
                sp.b.d0(obj);
                z11 = ((Boolean) obj).booleanValue();
                if (z11) {
                }
                fm.j0 j0Var222222 = yVar.A;
                CustomDate customDate222222 = new CustomDate();
                customDate222222.setTime(j10);
                firestoreGoal.setScheduledDate(customDate222222);
                this.f37014u = null;
                this.f37015v = 6;
                obj = j0Var222222.b(firestoreGoal, yVar.B, false, this);
                if (obj == aVar) {
                }
                booleanValue = ((Boolean) obj).booleanValue();
                yVar.C.i(Boolean.FALSE);
                if (booleanValue) {
                }
                return hs.k.f19476a;
            case 6:
                sp.b.d0(obj);
                booleanValue = ((Boolean) obj).booleanValue();
                yVar.C.i(Boolean.FALSE);
                if (booleanValue) {
                }
                return hs.k.f19476a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
