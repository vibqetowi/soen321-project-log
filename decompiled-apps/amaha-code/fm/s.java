package fm;

import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.utils.LogHelper;
/* compiled from: FirestoreGoalsViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.FirestoreGoalsViewModel$getGoalForUpdating$2$1$1$1$1", f = "FirestoreGoalsViewModel.kt", l = {345, 345, 351}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class s extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {
    public final /* synthetic */ String A;
    public final /* synthetic */ String B;
    public final /* synthetic */ ls.d<hs.f<FirestoreGoal, Boolean>> C;

    /* renamed from: u  reason: collision with root package name */
    public int f15540u;

    /* renamed from: v  reason: collision with root package name */
    public FirestoreGoal f15541v;

    /* renamed from: w  reason: collision with root package name */
    public int f15542w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f15543x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ FirestoreGoal f15544y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ a f15545z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s(String str, FirestoreGoal firestoreGoal, a aVar, String str2, String str3, ls.d<? super hs.f<FirestoreGoal, Boolean>> dVar, ls.d<? super s> dVar2) {
        super(2, dVar2);
        this.f15543x = str;
        this.f15544y = firestoreGoal;
        this.f15545z = aVar;
        this.A = str2;
        this.B = str3;
        this.C = dVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new s(this.f15543x, this.f15544y, this.f15545z, this.A, this.B, this.C, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((s) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00ab A[Catch: Exception -> 0x00d8, TryCatch #0 {Exception -> 0x00d8, blocks: (B:8:0x001d, B:58:0x00cb, B:60:0x00d3, B:64:0x00da, B:66:0x00ef, B:71:0x00f9, B:72:0x0104, B:75:0x0109, B:13:0x002c, B:36:0x007d, B:38:0x0081, B:42:0x008a, B:44:0x0090, B:49:0x009a, B:51:0x00ab, B:54:0x00bc, B:16:0x0032, B:31:0x0069, B:19:0x0039, B:21:0x0041, B:27:0x0056, B:32:0x006c), top: B:80:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d3 A[Catch: Exception -> 0x00d8, TryCatch #0 {Exception -> 0x00d8, blocks: (B:8:0x001d, B:58:0x00cb, B:60:0x00d3, B:64:0x00da, B:66:0x00ef, B:71:0x00f9, B:72:0x0104, B:75:0x0109, B:13:0x002c, B:36:0x007d, B:38:0x0081, B:42:0x008a, B:44:0x0090, B:49:0x009a, B:51:0x00ab, B:54:0x00bc, B:16:0x0032, B:31:0x0069, B:19:0x0039, B:21:0x0041, B:27:0x0056, B:32:0x006c), top: B:80:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ef A[Catch: Exception -> 0x00d8, TryCatch #0 {Exception -> 0x00d8, blocks: (B:8:0x001d, B:58:0x00cb, B:60:0x00d3, B:64:0x00da, B:66:0x00ef, B:71:0x00f9, B:72:0x0104, B:75:0x0109, B:13:0x002c, B:36:0x007d, B:38:0x0081, B:42:0x008a, B:44:0x0090, B:49:0x009a, B:51:0x00ab, B:54:0x00bc, B:16:0x0032, B:31:0x0069, B:19:0x0039, B:21:0x0041, B:27:0x0056, B:32:0x006c), top: B:80:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0108  */
    @Override // ns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        int i6;
        FirestoreGoal firestoreGoal;
        boolean z11;
        FirestoreGoal firestoreGoal2;
        boolean z12;
        String str = this.f15543x;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i10 = this.f15542w;
        ls.d<hs.f<FirestoreGoal, Boolean>> dVar = this.C;
        a aVar2 = this.f15545z;
        boolean z13 = false;
        FirestoreGoal firestoreGoal3 = this.f15544y;
        try {
        } catch (Exception e10) {
            dVar.resumeWith(null);
            LogHelper.INSTANCE.e(aVar2.B, e10);
        }
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        i6 = this.f15540u;
                        firestoreGoal2 = this.f15541v;
                        sp.b.d0(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            dVar.resumeWith(null);
                        }
                        firestoreGoal = firestoreGoal2;
                        firestoreGoal.getScheduledDate().setTime(firestoreGoal3.getScheduledDate().getTime());
                        if (!firestoreGoal3.getNotificationScheduled() && !firestoreGoal.getNotificationScheduled()) {
                            z12 = false;
                            firestoreGoal.setNotificationScheduled(z12);
                            firestoreGoal.setLastAdded(firestoreGoal3.getLastAdded());
                            firestoreGoal3 = firestoreGoal;
                            if (i6 != 0) {
                                z13 = true;
                            }
                            dVar.resumeWith(new hs.f(firestoreGoal3, Boolean.valueOf(z13)));
                            return hs.k.f19476a;
                        }
                        z12 = true;
                        firestoreGoal.setNotificationScheduled(z12);
                        firestoreGoal.setLastAdded(firestoreGoal3.getLastAdded());
                        firestoreGoal3 = firestoreGoal;
                        if (i6 != 0) {
                        }
                        dVar.resumeWith(new hs.f(firestoreGoal3, Boolean.valueOf(z13)));
                        return hs.k.f19476a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i6 = this.f15540u;
                sp.b.d0(obj);
                firestoreGoal = (FirestoreGoal) obj;
            } else {
                i6 = this.f15540u;
                sp.b.d0(obj);
                firestoreGoal = (FirestoreGoal) obj;
            }
        } else {
            sp.b.d0(obj);
            if (gv.n.H0(str, "custom_") && kotlin.jvm.internal.i.b(firestoreGoal3.getCourseName(), "independent")) {
                z10 = true;
            } else {
                z10 = false;
            }
            String uid = this.B;
            if (z10) {
                j0 j0Var = aVar2.f15183y;
                String str2 = this.A;
                kotlin.jvm.internal.i.f(uid, "uid");
                this.f15540u = 1;
                this.f15542w = 1;
                obj = j0Var.j(str2, uid, this);
                if (obj == aVar) {
                    return aVar;
                }
                i6 = 1;
                firestoreGoal = (FirestoreGoal) obj;
            } else {
                j0 j0Var2 = aVar2.f15183y;
                kotlin.jvm.internal.i.f(uid, "uid");
                this.f15540u = 1;
                this.f15542w = 2;
                obj = j0Var2.k(str, uid, this);
                if (obj == aVar) {
                    return aVar;
                }
                i6 = 1;
                firestoreGoal = (FirestoreGoal) obj;
            }
        }
        if (firestoreGoal != null) {
            if (!firestoreGoal.isVisible()) {
                i6 = 1;
            } else {
                i6 = 0;
            }
            if (!firestoreGoal.isVisible() && !firestoreGoal3.isVisible()) {
                z11 = false;
                firestoreGoal.setVisible(z11);
                if (!kotlin.jvm.internal.i.b(firestoreGoal.getType(), firestoreGoal3.getType())) {
                    firestoreGoal.setType(firestoreGoal3.getType());
                    j0 j0Var3 = aVar2.f15183y;
                    String goalId = firestoreGoal.getGoalId();
                    if (goalId == null) {
                        goalId = "";
                    }
                    this.f15541v = firestoreGoal;
                    this.f15540u = i6;
                    this.f15542w = 3;
                    Object f = j0Var3.f(goalId, this);
                    if (f == aVar) {
                        return aVar;
                    }
                    firestoreGoal2 = firestoreGoal;
                    obj = f;
                    if (!((Boolean) obj).booleanValue()) {
                    }
                    firestoreGoal = firestoreGoal2;
                }
                firestoreGoal.getScheduledDate().setTime(firestoreGoal3.getScheduledDate().getTime());
                if (!firestoreGoal3.getNotificationScheduled()) {
                    z12 = false;
                    firestoreGoal.setNotificationScheduled(z12);
                    firestoreGoal.setLastAdded(firestoreGoal3.getLastAdded());
                    firestoreGoal3 = firestoreGoal;
                }
                z12 = true;
                firestoreGoal.setNotificationScheduled(z12);
                firestoreGoal.setLastAdded(firestoreGoal3.getLastAdded());
                firestoreGoal3 = firestoreGoal;
            }
            z11 = true;
            firestoreGoal.setVisible(z11);
            if (!kotlin.jvm.internal.i.b(firestoreGoal.getType(), firestoreGoal3.getType())) {
            }
            firestoreGoal.getScheduledDate().setTime(firestoreGoal3.getScheduledDate().getTime());
            if (!firestoreGoal3.getNotificationScheduled()) {
            }
            z12 = true;
            firestoreGoal.setNotificationScheduled(z12);
            firestoreGoal.setLastAdded(firestoreGoal3.getLastAdded());
            firestoreGoal3 = firestoreGoal;
        }
        if (i6 != 0) {
        }
        dVar.resumeWith(new hs.f(firestoreGoal3, Boolean.valueOf(z13)));
        return hs.k.f19476a;
    }
}
