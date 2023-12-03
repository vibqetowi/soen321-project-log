package ql;

import android.content.Context;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.components.goals.model.NotificationGoal;
import com.theinnerhour.b2b.persistence.GoalsNotificationPersistence;
/* compiled from: NewDynamicActivityViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dynamicActivities.utils.NewDynamicActivityViewModel$setNotificationForFirestoreGoal$1", f = "NewDynamicActivityViewModel.kt", l = {405, 409, 412}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class z extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public t f29856u;

    /* renamed from: v  reason: collision with root package name */
    public NotificationGoal f29857v;

    /* renamed from: w  reason: collision with root package name */
    public int f29858w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ t f29859x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ FirestoreGoal f29860y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(t tVar, FirestoreGoal firestoreGoal, ls.d<? super z> dVar) {
        super(2, dVar);
        this.f29859x = tVar;
        this.f29860y = firestoreGoal;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new z(this.f29859x, this.f29860y, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((z) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00bb  */
    @Override // ns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        NotificationGoal notificationGoal;
        boolean booleanValue;
        MyApplication myApplication;
        GoalsNotificationPersistence b10;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f29858w;
        t tVar = this.f29859x;
        boolean z10 = true;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 == 3) {
                        notificationGoal = this.f29857v;
                        tVar = this.f29856u;
                        sp.b.d0(obj);
                        booleanValue = ((Boolean) obj).booleanValue();
                        if (booleanValue) {
                            Context applicationContext = tVar.f2382x.getApplicationContext();
                            if (applicationContext instanceof MyApplication) {
                                myApplication = (MyApplication) applicationContext;
                            } else {
                                myApplication = null;
                            }
                            if (myApplication != null && (b10 = myApplication.b()) != null) {
                                b10.addGoal(notificationGoal);
                            }
                        }
                        return hs.k.f19476a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                notificationGoal = this.f29857v;
                tVar = this.f29856u;
                sp.b.d0(obj);
                booleanValue = ((Boolean) obj).booleanValue();
                if (booleanValue) {
                }
                return hs.k.f19476a;
            }
            sp.b.d0(obj);
        } else {
            sp.b.d0(obj);
            if (tVar.R != null) {
                FirestoreGoal firestoreGoal = this.f29860y;
                if (firestoreGoal.getNotificationScheduled()) {
                    this.f29858w = 1;
                    obj = ((em.d) tVar.e0.getValue()).c(firestoreGoal, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
            }
            return hs.k.f19476a;
        }
        NotificationGoal notificationGoal2 = (NotificationGoal) obj;
        if (notificationGoal2 != null && (!gv.n.B0(notificationGoal2.getTitle())) && (!gv.n.B0(notificationGoal2.getBody()))) {
            String notificationType = notificationGoal2.getNotificationType();
            if (!kotlin.jvm.internal.i.b(notificationType, GoalsNotificationPersistence.GOALS_NOTIF_RA)) {
                z10 = kotlin.jvm.internal.i.b(notificationType, GoalsNotificationPersistence.GOALS_NOTIF_DYNAMIC_RA);
            }
            if (z10) {
                this.f29856u = tVar;
                this.f29857v = notificationGoal2;
                this.f29858w = 2;
                Object f = ((em.d) tVar.e0.getValue()).f(notificationGoal2, false, this);
                if (f == aVar) {
                    return aVar;
                }
                notificationGoal = notificationGoal2;
                obj = f;
                booleanValue = ((Boolean) obj).booleanValue();
                if (booleanValue) {
                }
            } else {
                this.f29856u = tVar;
                this.f29857v = notificationGoal2;
                this.f29858w = 3;
                Object e10 = ((em.d) tVar.e0.getValue()).e(notificationGoal2, false, this);
                if (e10 == aVar) {
                    return aVar;
                }
                notificationGoal = notificationGoal2;
                obj = e10;
                booleanValue = ((Boolean) obj).booleanValue();
                if (booleanValue) {
                }
            }
        }
        return hs.k.f19476a;
    }
}
