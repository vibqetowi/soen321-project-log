package fm;

import com.google.firebase.firestore.FirebaseFirestore;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.components.goals.model.NotificationGoal;
import com.theinnerhour.b2b.model.GoalDateObj;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.ArrayList;
import java.util.List;
/* compiled from: GoalMigrationViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.GoalMigrationViewModel$queueFirestoreGoalsForUpdate$2$1$1", f = "GoalMigrationViewModel.kt", l = {652, 655, 657, 661, 663}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class d1 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ ArrayList<String> C;
    public final /* synthetic */ FirestoreGoal D;
    public final /* synthetic */ kotlinx.coroutines.j<Boolean> E;
    public final /* synthetic */ a1 F;
    public final /* synthetic */ String G;
    public final /* synthetic */ ArrayList<GoalDateObj> H;

    /* renamed from: u  reason: collision with root package name */
    public a1 f15301u;

    /* renamed from: v  reason: collision with root package name */
    public FirestoreGoal f15302v;

    /* renamed from: w  reason: collision with root package name */
    public String f15303w;

    /* renamed from: x  reason: collision with root package name */
    public ArrayList f15304x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f15305y;

    /* renamed from: z  reason: collision with root package name */
    public int f15306z;

    /* compiled from: GoalMigrationViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.GoalMigrationViewModel$queueFirestoreGoalsForUpdate$2$1$1$deletionSuccess$1$1", f = "GoalMigrationViewModel.kt", l = {651}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super Boolean>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f15307u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ a1 f15308v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f15309w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f15310x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a1 a1Var, String str, String str2, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f15308v = a1Var;
            this.f15309w = str;
            this.f15310x = str2;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f15308v, this.f15309w, this.f15310x, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super Boolean> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f15307u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                j0 e10 = a1.e(this.f15308v);
                String uid = this.f15310x;
                kotlin.jvm.internal.i.f(uid, "uid");
                this.f15307u = 1;
                e10.getClass();
                kotlinx.coroutines.k kVar = new kotlinx.coroutines.k(1, ca.a.G0(this));
                kVar.u();
                FirebaseFirestore.d().b(Constants.USER_DATA_COLLECTION).q(uid).b(Constants.USER_GOALS_DATA).q(this.f15309w).c().addOnCompleteListener(new m0(e10, kVar));
                obj = kVar.s();
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d1(ArrayList<String> arrayList, FirestoreGoal firestoreGoal, kotlinx.coroutines.j<? super Boolean> jVar, a1 a1Var, String str, ArrayList<GoalDateObj> arrayList2, ls.d<? super d1> dVar) {
        super(2, dVar);
        this.C = arrayList;
        this.D = firestoreGoal;
        this.E = jVar;
        this.F = a1Var;
        this.G = str;
        this.H = arrayList2;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        d1 d1Var = new d1(this.C, this.D, this.E, this.F, this.G, this.H, dVar);
        d1Var.B = obj;
        return d1Var;
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((d1) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e3 A[Catch: Exception -> 0x00a9, TryCatch #0 {Exception -> 0x00a9, blocks: (B:10:0x0029, B:74:0x0180, B:76:0x0186, B:81:0x0193, B:15:0x0042, B:52:0x012f, B:54:0x0133, B:56:0x013e, B:58:0x0149, B:60:0x0153, B:64:0x015c, B:18:0x0054, B:46:0x0105, B:48:0x0112, B:21:0x0068, B:40:0x00db, B:42:0x00e3, B:22:0x0071, B:34:0x00b5, B:36:0x00bb, B:25:0x007e, B:26:0x008f, B:28:0x0095, B:31:0x00ac), top: B:89:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0133 A[Catch: Exception -> 0x00a9, TryCatch #0 {Exception -> 0x00a9, blocks: (B:10:0x0029, B:74:0x0180, B:76:0x0186, B:81:0x0193, B:15:0x0042, B:52:0x012f, B:54:0x0133, B:56:0x013e, B:58:0x0149, B:60:0x0153, B:64:0x015c, B:18:0x0054, B:46:0x0105, B:48:0x0112, B:21:0x0068, B:40:0x00db, B:42:0x00e3, B:22:0x0071, B:34:0x00b5, B:36:0x00bb, B:25:0x007e, B:26:0x008f, B:28:0x0095, B:31:0x00ac), top: B:89:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0178 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0186 A[Catch: Exception -> 0x00a9, TryCatch #0 {Exception -> 0x00a9, blocks: (B:10:0x0029, B:74:0x0180, B:76:0x0186, B:81:0x0193, B:15:0x0042, B:52:0x012f, B:54:0x0133, B:56:0x013e, B:58:0x0149, B:60:0x0153, B:64:0x015c, B:18:0x0054, B:46:0x0105, B:48:0x0112, B:21:0x0068, B:40:0x00db, B:42:0x00e3, B:22:0x0071, B:34:0x00b5, B:36:0x00bb, B:25:0x007e, B:26:0x008f, B:28:0x0095, B:31:0x00ac), top: B:89:0x0015 }] */
    @Override // ns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object n10;
        List list;
        FirestoreGoal firestoreGoal;
        Object b10;
        List list2;
        ArrayList<GoalDateObj> arrayList;
        String uid;
        a1 a1Var;
        boolean booleanValue;
        a1 a1Var2;
        FirestoreGoal firestoreGoal2;
        int i6;
        Object e10;
        FirestoreGoal firestoreGoal3;
        List list3;
        Object c10;
        boolean z10;
        int i10;
        NotificationGoal notificationGoal;
        boolean z11;
        int i11;
        boolean z12;
        List list4;
        boolean z13;
        boolean z14;
        int i12;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i13 = this.A;
        String uid2 = this.G;
        a1 a1Var3 = this.F;
        kotlinx.coroutines.j<Boolean> jVar = this.E;
        try {
        } catch (Exception e11) {
            if (jVar.a()) {
                jVar.resumeWith(Boolean.FALSE);
            }
            LogHelper.INSTANCE.e(a1Var3.f15260z, e11);
        }
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 3) {
                        if (i13 != 4) {
                            if (i13 == 5) {
                                i11 = this.f15306z;
                                z12 = this.f15305y;
                                list4 = (List) this.B;
                                sp.b.d0(obj);
                                list2 = list4;
                                z10 = z12;
                                i12 = i11;
                                if (!z10 && i12 != 0) {
                                    list = list2;
                                    list2 = list;
                                    z13 = true;
                                    if (jVar.a()) {
                                    }
                                    return hs.k.f19476a;
                                }
                                z13 = false;
                                if (jVar.a()) {
                                    if (!list2.contains(Boolean.FALSE) && z13) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    jVar.resumeWith(Boolean.valueOf(z14));
                                }
                                return hs.k.f19476a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i14 = this.f15306z;
                        z10 = this.f15305y;
                        firestoreGoal2 = this.f15302v;
                        a1Var2 = this.f15301u;
                        List list5 = (List) this.B;
                        sp.b.d0(obj);
                        c10 = obj;
                        list2 = list5;
                        i10 = i14;
                        notificationGoal = (NotificationGoal) c10;
                        i12 = i10;
                        if (notificationGoal != null) {
                            i12 = i10;
                            if (!gv.n.B0(notificationGoal.getTitle())) {
                                i12 = i10;
                                if (!gv.n.B0(notificationGoal.getBody())) {
                                    em.d f = a1.f(a1Var2);
                                    if (firestoreGoal2.isVisible() && firestoreGoal2.getNotificationScheduled()) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    this.B = list2;
                                    this.f15301u = null;
                                    this.f15302v = null;
                                    this.f15305y = z10;
                                    this.f15306z = i10 == 1 ? 1 : 0;
                                    this.A = 5;
                                    if (f.f(notificationGoal, z11, this) == aVar) {
                                        return aVar;
                                    }
                                    i11 = i10 == 1 ? 1 : 0;
                                    z12 = z10;
                                    list4 = list2;
                                    list2 = list4;
                                    z10 = z12;
                                    i12 = i11;
                                }
                            }
                        }
                        if (!z10) {
                        }
                        z13 = false;
                        if (jVar.a()) {
                        }
                        return hs.k.f19476a;
                    }
                    boolean z15 = this.f15305y;
                    firestoreGoal3 = this.f15302v;
                    a1Var = this.f15301u;
                    list3 = (List) this.B;
                    sp.b.d0(obj);
                    booleanValue = z15;
                    e10 = obj;
                    a1Var2 = a1Var;
                    list2 = list3;
                    firestoreGoal2 = firestoreGoal3;
                    i6 = ((Boolean) e10).booleanValue();
                    em.d f2 = a1.f(a1Var2);
                    this.B = list2;
                    this.f15301u = a1Var2;
                    this.f15302v = firestoreGoal2;
                    this.f15303w = null;
                    this.f15304x = null;
                    this.f15305y = booleanValue;
                    this.f15306z = i6;
                    this.A = 4;
                    c10 = f2.c(firestoreGoal2, this);
                    if (c10 == aVar) {
                        return aVar;
                    }
                    z10 = booleanValue;
                    i10 = i6;
                    notificationGoal = (NotificationGoal) c10;
                    i12 = i10;
                    if (notificationGoal != null) {
                    }
                    if (!z10) {
                    }
                    z13 = false;
                    if (jVar.a()) {
                    }
                    return hs.k.f19476a;
                }
                arrayList = this.f15304x;
                String str = this.f15303w;
                FirestoreGoal firestoreGoal4 = this.f15302v;
                a1 a1Var4 = this.f15301u;
                list2 = (List) this.B;
                sp.b.d0(obj);
                uid = str;
                firestoreGoal = firestoreGoal4;
                a1Var = a1Var4;
                b10 = obj;
                booleanValue = ((Boolean) b10).booleanValue();
                if (arrayList == null) {
                    j0 e12 = a1.e(a1Var);
                    String goalId = firestoreGoal.getGoalId();
                    kotlin.jvm.internal.i.f(uid, "uid");
                    this.B = list2;
                    this.f15301u = a1Var;
                    this.f15302v = firestoreGoal;
                    this.f15303w = null;
                    this.f15304x = null;
                    this.f15305y = booleanValue;
                    this.A = 3;
                    e10 = e12.e(goalId, arrayList, uid, this);
                    if (e10 == aVar) {
                        return aVar;
                    }
                    firestoreGoal3 = firestoreGoal;
                    list3 = list2;
                    a1Var2 = a1Var;
                    list2 = list3;
                    firestoreGoal2 = firestoreGoal3;
                    i6 = ((Boolean) e10).booleanValue();
                    em.d f22 = a1.f(a1Var2);
                    this.B = list2;
                    this.f15301u = a1Var2;
                    this.f15302v = firestoreGoal2;
                    this.f15303w = null;
                    this.f15304x = null;
                    this.f15305y = booleanValue;
                    this.f15306z = i6;
                    this.A = 4;
                    c10 = f22.c(firestoreGoal2, this);
                    if (c10 == aVar) {
                    }
                } else {
                    a1Var2 = a1Var;
                    firestoreGoal2 = firestoreGoal;
                    i6 = 1;
                    em.d f222 = a1.f(a1Var2);
                    this.B = list2;
                    this.f15301u = a1Var2;
                    this.f15302v = firestoreGoal2;
                    this.f15303w = null;
                    this.f15304x = null;
                    this.f15305y = booleanValue;
                    this.f15306z = i6;
                    this.A = 4;
                    c10 = f222.c(firestoreGoal2, this);
                    if (c10 == aVar) {
                    }
                }
            } else {
                sp.b.d0(obj);
                n10 = obj;
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.d0 d0Var = (kotlinx.coroutines.d0) this.B;
            ArrayList<String> arrayList2 = this.C;
            ArrayList arrayList3 = new ArrayList(is.i.H1(arrayList2, 10));
            for (String str2 : arrayList2) {
                arrayList3.add(ta.v.g(d0Var, null, new a(a1Var3, str2, uid2, null), 3));
            }
            this.A = 1;
            n10 = ca.a.n(arrayList3, this);
            if (n10 == aVar) {
                return aVar;
            }
        }
        list = (List) n10;
        firestoreGoal = this.D;
        if (firestoreGoal != null) {
            ArrayList<GoalDateObj> arrayList4 = this.H;
            j0 e13 = a1.e(a1Var3);
            kotlin.jvm.internal.i.f(uid2, "uid");
            this.B = list;
            this.f15301u = a1Var3;
            this.f15302v = firestoreGoal;
            this.f15303w = uid2;
            this.f15304x = arrayList4;
            this.A = 2;
            b10 = e13.b(firestoreGoal, uid2, false, this);
            if (b10 == aVar) {
                return aVar;
            }
            list2 = list;
            arrayList = arrayList4;
            uid = uid2;
            a1Var = a1Var3;
            booleanValue = ((Boolean) b10).booleanValue();
            if (arrayList == null) {
            }
        }
        list2 = list;
        z13 = true;
        if (jVar.a()) {
        }
        return hs.k.f19476a;
    }
}
