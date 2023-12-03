package fm;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.components.goals.model.NotificationGoal;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityModel;
import com.theinnerhour.b2b.model.GamificationModel;
import com.theinnerhour.b2b.model.GoalDateObj;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.GoalsNotificationPersistence;
import com.theinnerhour.b2b.persistence.GoalsPersistence;
import com.theinnerhour.b2b.persistence.NpsPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.GoalHelper;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import com.theinnerhour.b2b.utils.Utils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: FirestoreGoalsViewModel.kt */
/* loaded from: classes2.dex */
public final class a extends androidx.lifecycle.b {
    public final kotlinx.coroutines.a0 A;
    public final String B;
    public final hs.i C;
    public Date D;
    public final androidx.lifecycle.w<List<FirestoreGoal>> E;
    public final androidx.lifecycle.w<SingleUseEvent<List<FirestoreGoal>>> F;
    public final androidx.lifecycle.w<List<FirestoreGoal>> G;
    public final HashMap<String, List<GoalDateObj>> H;
    public final hs.i I;
    public final hs.i J;
    public final hs.i K;
    public final hs.i L;
    public final hs.i M;
    public final hs.i N;
    public final hs.i O;
    public final hs.i P;
    public int Q;
    public final androidx.lifecycle.w<List<FirestoreGoal>> R;
    public final hs.i S;
    public final hs.i T;
    public final hs.i U;
    public final hs.i V;
    public final hs.i W;
    public final androidx.lifecycle.w<ArrayList<RecommendedActivityModel>> X;
    public final androidx.lifecycle.w<SingleUseEvent<RecommendedActivityModel>> Y;
    public RecommendedActivityModel Z;

    /* renamed from: a0  reason: collision with root package name */
    public final String[] f15169a0;

    /* renamed from: b0  reason: collision with root package name */
    public final hs.i f15170b0;
    public final hs.i c0;

    /* renamed from: d0  reason: collision with root package name */
    public final hs.i f15171d0;
    public final hs.i e0;

    /* renamed from: f0  reason: collision with root package name */
    public final GoalsPersistence f15172f0;

    /* renamed from: g0  reason: collision with root package name */
    public final androidx.lifecycle.w<FirestoreGoal> f15173g0;

    /* renamed from: h0  reason: collision with root package name */
    public final androidx.lifecycle.w<Boolean> f15174h0;

    /* renamed from: i0  reason: collision with root package name */
    public final androidx.lifecycle.w<Boolean> f15175i0;

    /* renamed from: j0  reason: collision with root package name */
    public final androidx.lifecycle.w<Boolean> f15176j0;

    /* renamed from: k0  reason: collision with root package name */
    public final androidx.lifecycle.w<Boolean> f15177k0;

    /* renamed from: l0  reason: collision with root package name */
    public final androidx.lifecycle.w<hs.f<Boolean, FirestoreGoal>> f15178l0;

    /* renamed from: m0  reason: collision with root package name */
    public final androidx.lifecycle.w<List<FirestoreGoal>> f15179m0;

    /* renamed from: n0  reason: collision with root package name */
    public final androidx.lifecycle.w<List<HashMap<String, Object>>> f15180n0;

    /* renamed from: o0  reason: collision with root package name */
    public final androidx.lifecycle.w<hs.f<Boolean, HashMap<String, Object>>> f15181o0;

    /* renamed from: p0  reason: collision with root package name */
    public final androidx.lifecycle.w<Boolean> f15182p0;

    /* renamed from: y  reason: collision with root package name */
    public final j0 f15183y;

    /* renamed from: z  reason: collision with root package name */
    public final kotlinx.coroutines.a0 f15184z;

    /* compiled from: FirestoreGoalsViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.FirestoreGoalsViewModel$addGoal$1$1$1", f = "FirestoreGoalsViewModel.kt", l = {305, 306}, m = "invokeSuspend")
    /* renamed from: fm.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0232a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {
        public final /* synthetic */ FirestoreGoal B;
        public final /* synthetic */ String C;
        public final /* synthetic */ boolean D;
        public final /* synthetic */ String E;

        /* renamed from: u  reason: collision with root package name */
        public a f15185u;

        /* renamed from: v  reason: collision with root package name */
        public FirestoreGoal f15186v;

        /* renamed from: w  reason: collision with root package name */
        public String f15187w;

        /* renamed from: x  reason: collision with root package name */
        public hs.f f15188x;

        /* renamed from: y  reason: collision with root package name */
        public boolean f15189y;

        /* renamed from: z  reason: collision with root package name */
        public int f15190z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0232a(FirestoreGoal firestoreGoal, String str, boolean z10, String str2, ls.d<? super C0232a> dVar) {
            super(2, dVar);
            this.B = firestoreGoal;
            this.C = str;
            this.D = z10;
            this.E = str2;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new C0232a(this.B, this.C, this.D, this.E, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((C0232a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x009a A[Catch: Exception -> 0x00b8, TryCatch #0 {Exception -> 0x00b8, blocks: (B:7:0x001a, B:23:0x006b, B:26:0x0075, B:28:0x009a, B:33:0x00aa, B:29:0x009d, B:31:0x00a5, B:32:0x00a8, B:36:0x00ba, B:11:0x0028, B:17:0x0038, B:19:0x003d, B:14:0x002f), top: B:41:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x009d A[Catch: Exception -> 0x00b8, TryCatch #0 {Exception -> 0x00b8, blocks: (B:7:0x001a, B:23:0x006b, B:26:0x0075, B:28:0x009a, B:33:0x00aa, B:29:0x009d, B:31:0x00a5, B:32:0x00a8, B:36:0x00ba, B:11:0x0028, B:17:0x0038, B:19:0x003d, B:14:0x002f), top: B:41:0x000a }] */
        @Override // ns.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            hs.f fVar;
            String str;
            boolean z10;
            a aVar;
            String type;
            GoalsPersistence.Companion.GoalTypePrefix goalTypePrefix;
            ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f15190z;
            FirestoreGoal firestoreGoal = this.B;
            a aVar3 = a.this;
            try {
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(aVar3.B, e10);
            }
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 == 2) {
                        z10 = this.f15189y;
                        fVar = this.f15188x;
                        String str2 = this.f15187w;
                        FirestoreGoal firestoreGoal2 = this.f15186v;
                        aVar = this.f15185u;
                        sp.b.d0(obj);
                        str = str2;
                        firestoreGoal = firestoreGoal2;
                        if (((Boolean) obj).booleanValue() && z10) {
                            ((androidx.lifecycle.w) aVar.S.getValue()).i(new SingleUseEvent(Boolean.TRUE));
                            aVar.x((FirestoreGoal) fVar.f19464u);
                            type = firestoreGoal.getType();
                            if (!kotlin.jvm.internal.i.b(type, Constants.GOAL_TYPE_ACTIVITY_ONCE)) {
                                goalTypePrefix = GoalsPersistence.Companion.GoalTypePrefix.ONE_TIME;
                            } else if (kotlin.jvm.internal.i.b(type, Constants.GOAL_TYPE_ACTIVITY_WEEKLY)) {
                                goalTypePrefix = GoalsPersistence.Companion.GoalTypePrefix.WEEKLY;
                            } else {
                                goalTypePrefix = GoalsPersistence.Companion.GoalTypePrefix.DAILY;
                            }
                            aVar.f15172f0.setGoalScheduled(str, goalTypePrefix, ((FirestoreGoal) fVar.f19464u).getNotificationScheduled());
                        }
                        aVar.p();
                        return hs.k.f19476a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sp.b.d0(obj);
            } else {
                sp.b.d0(obj);
                this.f15190z = 1;
                obj = a.f(aVar3, firestoreGoal, this);
                if (obj == aVar2) {
                    return aVar2;
                }
            }
            fVar = (hs.f) obj;
            if (fVar != null) {
                String uid = this.C;
                boolean z11 = this.D;
                str = this.E;
                kotlin.jvm.internal.i.f(uid, "uid");
                boolean booleanValue = ((Boolean) fVar.f19465v).booleanValue();
                this.f15185u = aVar3;
                this.f15186v = firestoreGoal;
                this.f15187w = str;
                this.f15188x = fVar;
                this.f15189y = z11;
                this.f15190z = 2;
                obj = aVar3.f15183y.b((FirestoreGoal) fVar.f19464u, uid, booleanValue, this);
                if (obj == aVar2) {
                    return aVar2;
                }
                z10 = z11;
                aVar = aVar3;
                if (((Boolean) obj).booleanValue()) {
                    ((androidx.lifecycle.w) aVar.S.getValue()).i(new SingleUseEvent(Boolean.TRUE));
                    aVar.x((FirestoreGoal) fVar.f19464u);
                    type = firestoreGoal.getType();
                    if (!kotlin.jvm.internal.i.b(type, Constants.GOAL_TYPE_ACTIVITY_ONCE)) {
                    }
                    aVar.f15172f0.setGoalScheduled(str, goalTypePrefix, ((FirestoreGoal) fVar.f19464u).getNotificationScheduled());
                }
                aVar.p();
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: FirestoreGoalsViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.FirestoreGoalsViewModel$fetchGoals$1$1", f = "FirestoreGoalsViewModel.kt", l = {900}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f15191u;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f15193w;

        /* compiled from: FirestoreGoalsViewModel.kt */
        /* renamed from: fm.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0233a<T> implements kotlinx.coroutines.flow.e {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ a f15194u;

            public C0233a(a aVar) {
                this.f15194u = aVar;
            }

            @Override // kotlinx.coroutines.flow.e
            public final Object b(Object obj, ls.d dVar) {
                this.f15194u.R.i((List) obj);
                return hs.k.f19476a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, ls.d<? super b> dVar) {
            super(2, dVar);
            this.f15193w = str;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new b(this.f15193w, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((b) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f15191u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                a aVar2 = a.this;
                j0 j0Var = aVar2.f15183y;
                kotlinx.coroutines.flow.x f = tr.r.f(new Integer(0));
                String uid = this.f15193w;
                kotlin.jvm.internal.i.f(uid, "uid");
                j0Var.getClass();
                kotlinx.coroutines.flow.r rVar = new kotlinx.coroutines.flow.r(new o0(j0Var, uid, f, null));
                C0233a c0233a = new C0233a(aVar2);
                this.f15191u = 1;
                if (rVar.a(c0233a, this) == aVar) {
                    return aVar;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: FirestoreGoalsViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.FirestoreGoalsViewModel$fetchIndividualGoal$1", f = "FirestoreGoalsViewModel.kt", l = {943}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public a f15195u;

        /* renamed from: v  reason: collision with root package name */
        public int f15196v;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f15198x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, ls.d<? super c> dVar) {
            super(2, dVar);
            this.f15198x = str;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new c(this.f15198x, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((c) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            String j02;
            a aVar;
            ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f15196v;
            boolean z10 = true;
            if (i6 != 0) {
                if (i6 == 1) {
                    aVar = this.f15195u;
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                fd.f fVar = FirebaseAuth.getInstance().f;
                if (fVar != null && (j02 = fVar.j0()) != null) {
                    a aVar3 = a.this;
                    j0 j0Var = aVar3.f15183y;
                    this.f15195u = aVar3;
                    this.f15196v = 1;
                    obj = j0Var.k(this.f15198x, j02, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                    aVar = aVar3;
                }
                return hs.k.f19476a;
            }
            FirestoreGoal firestoreGoal = (FirestoreGoal) obj;
            androidx.lifecycle.w<hs.f<Boolean, FirestoreGoal>> wVar = aVar.f15178l0;
            if (firestoreGoal == null) {
                z10 = false;
            }
            wVar.i(new hs.f<>(Boolean.valueOf(z10), firestoreGoal));
            return hs.k.f19476a;
        }
    }

    /* compiled from: FirestoreGoalsViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.FirestoreGoalsViewModel$fetchIndividualGoalAndUpdateResultKey$1", f = "FirestoreGoalsViewModel.kt", l = {924}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f15199u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f15200v;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f15202x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f15203y;

        /* compiled from: FirestoreGoalsViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.FirestoreGoalsViewModel$fetchIndividualGoalAndUpdateResultKey$1$1$1", f = "FirestoreGoalsViewModel.kt", l = {917}, m = "invokeSuspend")
        /* renamed from: fm.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0234a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f15204u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ a f15205v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ String f15206w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ String f15207x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0234a(a aVar, String str, String str2, ls.d<? super C0234a> dVar) {
                super(2, dVar);
                this.f15205v = aVar;
                this.f15206w = str;
                this.f15207x = str2;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new C0234a(this.f15205v, this.f15206w, this.f15207x, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
                return ((C0234a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f15204u;
                a aVar2 = this.f15205v;
                boolean z10 = true;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    j0 j0Var = aVar2.f15183y;
                    String uid = this.f15207x;
                    kotlin.jvm.internal.i.f(uid, "uid");
                    this.f15204u = 1;
                    obj = j0Var.k(this.f15206w, uid, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                FirestoreGoal firestoreGoal = (FirestoreGoal) obj;
                androidx.lifecycle.w<hs.f<Boolean, FirestoreGoal>> wVar = aVar2.f15178l0;
                if (firestoreGoal == null) {
                    z10 = false;
                }
                wVar.i(new hs.f<>(Boolean.valueOf(z10), firestoreGoal));
                return hs.k.f19476a;
            }
        }

        /* compiled from: FirestoreGoalsViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.FirestoreGoalsViewModel$fetchIndividualGoalAndUpdateResultKey$1$1$2", f = "FirestoreGoalsViewModel.kt", l = {922}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super Boolean>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f15208u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ a f15209v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ String f15210w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ String f15211x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ String f15212y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(a aVar, String str, String str2, String str3, ls.d<? super b> dVar) {
                super(2, dVar);
                this.f15209v = aVar;
                this.f15210w = str;
                this.f15211x = str2;
                this.f15212y = str3;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new b(this.f15209v, this.f15210w, this.f15211x, this.f15212y, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super Boolean> dVar) {
                return ((b) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f15208u;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    j0 j0Var = this.f15209v.f15183y;
                    String uid = this.f15210w;
                    kotlin.jvm.internal.i.f(uid, "uid");
                    this.f15208u = 1;
                    j0Var.getClass();
                    kotlinx.coroutines.k kVar = new kotlinx.coroutines.k(1, ca.a.G0(this));
                    kVar.u();
                    com.google.firebase.firestore.a q10 = FirebaseFirestore.d().b(Constants.USER_DATA_COLLECTION).q(uid).b(Constants.USER_GOALS_DATA).q(this.f15211x);
                    HashMap hashMap = new HashMap();
                    hashMap.put("dataTypeKey", this.f15212y);
                    q10.f(hashMap, fe.t.f15012d).addOnCompleteListener(new x0(j0Var, kVar));
                    obj = kVar.s();
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, ls.d<? super d> dVar) {
            super(2, dVar);
            this.f15202x = str;
            this.f15203y = str2;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            d dVar2 = new d(this.f15202x, this.f15203y, dVar);
            dVar2.f15200v = obj;
            return dVar2;
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((d) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            String j02;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f15199u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                kotlinx.coroutines.d0 d0Var = (kotlinx.coroutines.d0) this.f15200v;
                fd.f fVar = FirebaseAuth.getInstance().f;
                if (fVar != null && (j02 = fVar.j0()) != null) {
                    a aVar2 = a.this;
                    String str = this.f15202x;
                    List P0 = ca.a.P0(ta.v.g(d0Var, null, new C0234a(aVar2, str, j02, null), 3), ta.v.g(d0Var, null, new b(aVar2, j02, str, this.f15203y, null), 3));
                    this.f15199u = 1;
                    if (ca.a.n(P0, this) == aVar) {
                        return aVar;
                    }
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: FirestoreGoalsViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.FirestoreGoalsViewModel$fetchIndividualGoalLogs$1", f = "FirestoreGoalsViewModel.kt", l = {973}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public a f15213u;

        /* renamed from: v  reason: collision with root package name */
        public int f15214v;

        /* renamed from: w  reason: collision with root package name */
        public /* synthetic */ Object f15215w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f15217y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, ls.d<? super e> dVar) {
            super(2, dVar);
            this.f15217y = str;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            e eVar = new e(this.f15217y, dVar);
            eVar.f15215w = obj;
            return eVar;
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((e) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
        @Override // ns.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            hs.k kVar;
            String j02;
            a aVar;
            ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f15214v;
            a aVar3 = a.this;
            if (i6 != 0) {
                if (i6 == 1) {
                    aVar = this.f15213u;
                    kotlinx.coroutines.d0 d0Var = (kotlinx.coroutines.d0) this.f15215w;
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                kotlinx.coroutines.d0 d0Var2 = (kotlinx.coroutines.d0) this.f15215w;
                fd.f fVar = FirebaseAuth.getInstance().f;
                if (fVar != null && (j02 = fVar.j0()) != null) {
                    j0 j0Var = aVar3.f15183y;
                    this.f15215w = d0Var2;
                    this.f15213u = aVar3;
                    this.f15214v = 1;
                    obj = j0Var.l(this.f15217y, j02, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                    aVar = aVar3;
                } else {
                    kVar = null;
                    if (kVar == null) {
                        aVar3.f15180n0.i(null);
                    }
                    return hs.k.f19476a;
                }
            }
            aVar.f15180n0.i((List) obj);
            kVar = hs.k.f19476a;
            if (kVar == null) {
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: FirestoreGoalsViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.FirestoreGoalsViewModel$fetchLatestGoalLogEntry$1", f = "FirestoreGoalsViewModel.kt", l = {990}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public a f15218u;

        /* renamed from: v  reason: collision with root package name */
        public int f15219v;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f15221x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ boolean f15222y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, boolean z10, ls.d<? super f> dVar) {
            super(2, dVar);
            this.f15221x = str;
            this.f15222y = z10;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new f(this.f15221x, this.f15222y, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((f) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            String j02;
            a aVar;
            Map<String, Object> map;
            ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f15219v;
            if (i6 != 0) {
                if (i6 == 1) {
                    aVar = this.f15218u;
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                fd.f fVar = FirebaseAuth.getInstance().f;
                if (fVar != null && (j02 = fVar.j0()) != null) {
                    a aVar3 = a.this;
                    j0 j0Var = aVar3.f15183y;
                    this.f15218u = aVar3;
                    this.f15219v = 1;
                    j0Var.getClass();
                    obj = j0.h(j02, this.f15221x, this, this.f15222y);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                    aVar = aVar3;
                }
                return hs.k.f19476a;
            }
            fe.q qVar = (fe.q) obj;
            if (qVar != null) {
                map = qVar.f();
            } else {
                map = null;
            }
            if (map != null) {
                aVar.f15181o0.i(new hs.f<>(Boolean.TRUE, new HashMap(qVar.f())));
            } else {
                aVar.f15181o0.i(new hs.f<>(Boolean.FALSE, null));
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: FirestoreGoalsViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.FirestoreGoalsViewModel$fetchVisibleGoals$1$1", f = "FirestoreGoalsViewModel.kt", l = {172}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f15223u;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f15225w;

        /* compiled from: FirestoreGoalsViewModel.kt */
        /* renamed from: fm.a$g$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0235a<T> implements kotlinx.coroutines.flow.e {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ a f15226u;

            public C0235a(a aVar) {
                this.f15226u = aVar;
            }

            @Override // kotlinx.coroutines.flow.e
            public final Object b(Object obj, ls.d dVar) {
                boolean z10;
                List<FirestoreGoal> list = (List) obj;
                a aVar = this.f15226u;
                aVar.E.i(list);
                ArrayList arrayList = new ArrayList();
                for (T t3 : list) {
                    if (true ^ kotlin.jvm.internal.i.b(((FirestoreGoal) t3).getCourseName(), "independent")) {
                        arrayList.add(t3);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it = list.iterator();
                while (true) {
                    boolean z11 = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    FirestoreGoal firestoreGoal = (FirestoreGoal) next;
                    if (kotlin.jvm.internal.i.b(firestoreGoal.getCourseName(), "independent")) {
                        String goalId = firestoreGoal.getGoalId();
                        if (goalId != null && gv.n.H0(goalId, "custom_")) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            z11 = true;
                        }
                    }
                    if (z11) {
                        arrayList2.add(next);
                    }
                }
                aVar.G.i(arrayList2);
                aVar.F.i(new SingleUseEvent<>(arrayList));
                for (FirestoreGoal firestoreGoal2 : list) {
                    a.e(aVar, firestoreGoal2);
                }
                aVar.t(null, arrayList2, arrayList);
                if (!list.isEmpty()) {
                    ((androidx.lifecycle.w) aVar.L.getValue()).i(new SingleUseEvent(Boolean.valueOf(!ApplicationPersistence.getInstance().getBooleanValue("clickable_goal_info", false))));
                }
                return hs.k.f19476a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, ls.d<? super g> dVar) {
            super(2, dVar);
            this.f15225w = str;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new g(this.f15225w, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((g) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f15223u;
            a aVar2 = a.this;
            try {
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    j0 j0Var = aVar2.f15183y;
                    kotlinx.coroutines.flow.x f = tr.r.f(new Integer(0));
                    String uid = this.f15225w;
                    kotlin.jvm.internal.i.f(uid, "uid");
                    kotlinx.coroutines.flow.r n10 = j0Var.n(f, uid, aVar2.D.getTime() / 1000);
                    C0235a c0235a = new C0235a(aVar2);
                    this.f15223u = 1;
                    if (n10.a(c0235a, this) == aVar) {
                        return aVar;
                    }
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(aVar2.B, e10);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: FirestoreGoalsViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.FirestoreGoalsViewModel$removeGoal$1$1$1", f = "FirestoreGoalsViewModel.kt", l = {385, 386}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f15227u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ FirestoreGoal f15228v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ a f15229w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f15230x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f15231y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(FirestoreGoal firestoreGoal, a aVar, String str, String str2, ls.d<? super h> dVar) {
            super(2, dVar);
            this.f15228v = firestoreGoal;
            this.f15229w = aVar;
            this.f15230x = str;
            this.f15231y = str2;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new h(this.f15228v, this.f15229w, this.f15230x, this.f15231y, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((h) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
        @Override // ns.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            GoalsPersistence.Companion.GoalTypePrefix goalTypePrefix;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f15227u;
            a aVar2 = this.f15229w;
            FirestoreGoal firestoreGoal = this.f15228v;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 == 2) {
                        sp.b.d0(obj);
                        if (((Boolean) obj).booleanValue()) {
                            aVar2.x(firestoreGoal);
                            String type = firestoreGoal.getType();
                            if (kotlin.jvm.internal.i.b(type, Constants.GOAL_TYPE_ACTIVITY_ONCE)) {
                                goalTypePrefix = GoalsPersistence.Companion.GoalTypePrefix.ONE_TIME;
                            } else if (kotlin.jvm.internal.i.b(type, Constants.GOAL_TYPE_ACTIVITY_WEEKLY)) {
                                goalTypePrefix = GoalsPersistence.Companion.GoalTypePrefix.WEEKLY;
                            } else {
                                goalTypePrefix = GoalsPersistence.Companion.GoalTypePrefix.DAILY;
                            }
                            GoalsPersistence goalsPersistence = aVar2.f15172f0;
                            String str = this.f15231y;
                            goalsPersistence.deleteGoalInfo(str, goalTypePrefix);
                            if (firestoreGoal.getCourseName() != null) {
                                String courseName = firestoreGoal.getCourseName();
                                kotlin.jvm.internal.i.d(courseName);
                                ta.v.H(kc.f.H(aVar2), aVar2.A, 0, new fm.g(aVar2, str, courseName, null), 2);
                            }
                        }
                        aVar2.p();
                        return hs.k.f19476a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sp.b.d0(obj);
            } else {
                sp.b.d0(obj);
                kotlinx.coroutines.flow.p<Boolean> loading = firestoreGoal.getLoading();
                Boolean bool = Boolean.TRUE;
                this.f15227u = 1;
                if (loading.b(bool, this) == aVar) {
                    return aVar;
                }
            }
            j0 j0Var = aVar2.f15183y;
            String it = this.f15230x;
            kotlin.jvm.internal.i.f(it, "it");
            this.f15227u = 2;
            obj = j0Var.b(firestoreGoal, it, false, this);
            if (obj == aVar) {
                return aVar;
            }
            if (((Boolean) obj).booleanValue()) {
            }
            aVar2.p();
            return hs.k.f19476a;
        }
    }

    /* compiled from: FirestoreGoalsViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.FirestoreGoalsViewModel$setNotificationForFirestoreGoal$1", f = "FirestoreGoalsViewModel.kt", l = {1046, 1051, 1058}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public NotificationGoal f15232u;

        /* renamed from: v  reason: collision with root package name */
        public int f15233v;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ FirestoreGoal f15235x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(FirestoreGoal firestoreGoal, ls.d<? super i> dVar) {
            super(2, dVar);
            this.f15235x = firestoreGoal;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new i(this.f15235x, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((i) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x00b3  */
        @Override // ns.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            boolean b10;
            NotificationGoal notificationGoal;
            boolean booleanValue;
            MyApplication myApplication;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f15233v;
            FirestoreGoal firestoreGoal = this.f15235x;
            a aVar2 = a.this;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 == 3) {
                            notificationGoal = this.f15232u;
                            sp.b.d0(obj);
                            booleanValue = ((Boolean) obj).booleanValue();
                            if (booleanValue) {
                                Application application = aVar2.f2382x;
                                GoalsNotificationPersistence goalsNotificationPersistence = null;
                                if (application instanceof MyApplication) {
                                    myApplication = (MyApplication) application;
                                } else {
                                    myApplication = null;
                                }
                                if (myApplication != null) {
                                    goalsNotificationPersistence = myApplication.b();
                                }
                                if (firestoreGoal.getNotificationScheduled()) {
                                    if (goalsNotificationPersistence != null) {
                                        goalsNotificationPersistence.addGoal(notificationGoal);
                                    }
                                } else if (goalsNotificationPersistence != null) {
                                    goalsNotificationPersistence.removeGoal(notificationGoal.getGoalId());
                                }
                            }
                            return hs.k.f19476a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    notificationGoal = this.f15232u;
                    sp.b.d0(obj);
                    booleanValue = ((Boolean) obj).booleanValue();
                    if (booleanValue) {
                    }
                    return hs.k.f19476a;
                }
                sp.b.d0(obj);
            } else {
                sp.b.d0(obj);
                this.f15233v = 1;
                obj = ((em.d) aVar2.e0.getValue()).c(firestoreGoal, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            NotificationGoal notificationGoal2 = (NotificationGoal) obj;
            if (notificationGoal2 != null && (!gv.n.B0(notificationGoal2.getTitle())) && (!gv.n.B0(notificationGoal2.getBody()))) {
                String notificationType = notificationGoal2.getNotificationType();
                if (kotlin.jvm.internal.i.b(notificationType, GoalsNotificationPersistence.GOALS_NOTIF_RA)) {
                    b10 = true;
                } else {
                    b10 = kotlin.jvm.internal.i.b(notificationType, GoalsNotificationPersistence.GOALS_NOTIF_DYNAMIC_RA);
                }
                if (b10) {
                    this.f15232u = notificationGoal2;
                    this.f15233v = 2;
                    Object f = ((em.d) aVar2.e0.getValue()).f(notificationGoal2, !firestoreGoal.getNotificationScheduled(), this);
                    if (f == aVar) {
                        return aVar;
                    }
                    notificationGoal = notificationGoal2;
                    obj = f;
                    booleanValue = ((Boolean) obj).booleanValue();
                    if (booleanValue) {
                    }
                } else {
                    this.f15232u = notificationGoal2;
                    this.f15233v = 3;
                    Object e10 = ((em.d) aVar2.e0.getValue()).e(notificationGoal2, !firestoreGoal.getNotificationScheduled(), this);
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

    /* compiled from: FirestoreGoalsViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.FirestoreGoalsViewModel$toggleGoalTrack$1$1", f = "FirestoreGoalsViewModel.kt", l = {460, 464, 466, 471, 472}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {
        public final /* synthetic */ kotlin.jvm.internal.x<List<GoalDateObj>> A;
        public final /* synthetic */ kotlin.jvm.internal.u B;

        /* renamed from: u  reason: collision with root package name */
        public int f15236u;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f15238w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ GoalDateObj f15239x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.w f15240y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ FirestoreGoal f15241z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, GoalDateObj goalDateObj, kotlin.jvm.internal.w wVar, FirestoreGoal firestoreGoal, kotlin.jvm.internal.x<List<GoalDateObj>> xVar, kotlin.jvm.internal.u uVar, ls.d<? super j> dVar) {
            super(2, dVar);
            this.f15238w = str;
            this.f15239x = goalDateObj;
            this.f15240y = wVar;
            this.f15241z = firestoreGoal;
            this.A = xVar;
            this.B = uVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new j(this.f15238w, this.f15239x, this.f15240y, this.f15241z, this.A, this.B, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((j) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x00f0 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0100 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0107  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0125  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x013b  */
        @Override // ns.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String str;
            a aVar;
            int i6;
            Object p10;
            Object g5;
            Object c10;
            kotlinx.coroutines.flow.p<ArrayList<Boolean>> trackListFlow;
            ArrayList<Boolean> u10;
            kotlinx.coroutines.flow.p<Boolean> loading;
            Boolean bool;
            ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
            int i10 = this.f15236u;
            GoalDateObj goalDateObj = this.f15239x;
            FirestoreGoal firestoreGoal = this.f15241z;
            String str2 = this.f15238w;
            kotlin.jvm.internal.w wVar = this.f15240y;
            a aVar3 = a.this;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                if (i10 == 5) {
                                    sp.b.d0(obj);
                                    aVar = aVar3;
                                    i6 = 2;
                                    if (!this.B.f23466u) {
                                        ((androidx.lifecycle.w) aVar.W.getValue()).i(new SingleUseEvent(Boolean.TRUE));
                                    }
                                    if (kotlin.jvm.internal.i.b(firestoreGoal.getType(), Constants.GOAL_TYPE_ACTIVITY_ONCE)) {
                                        if (goalDateObj.getVal() == i6) {
                                            aVar.f15172f0.setOneTimeGoalTrackDate(str2, wVar.f23468u);
                                        } else {
                                            aVar.f15172f0.revertOneTimeGoalTrackDate(str2, wVar.f23468u);
                                        }
                                    } else if (goalDateObj.getVal() == i6) {
                                        aVar.f15172f0.setWeeklyGoalTrackDate(str2, wVar.f23468u);
                                    } else {
                                        aVar.f15172f0.revertWeeklyGoalTrackDate(str2, wVar.f23468u);
                                    }
                                    return hs.k.f19476a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sp.b.d0(obj);
                            aVar = aVar3;
                            i6 = 2;
                            loading = firestoreGoal.getLoading();
                            bool = Boolean.FALSE;
                            this.f15236u = 5;
                            if (loading.b(bool, this) == aVar2) {
                                return aVar2;
                            }
                            if (!this.B.f23466u) {
                            }
                            if (kotlin.jvm.internal.i.b(firestoreGoal.getType(), Constants.GOAL_TYPE_ACTIVITY_ONCE)) {
                            }
                            return hs.k.f19476a;
                        }
                        sp.b.d0(obj);
                        g5 = obj;
                        aVar = aVar3;
                        i6 = 2;
                        ((Boolean) g5).booleanValue();
                        HashMap<String, List<GoalDateObj>> hashMap = aVar.H;
                        kotlin.jvm.internal.x<List<GoalDateObj>> xVar = this.A;
                        List<GoalDateObj> list = xVar.f23469u;
                        kotlin.jvm.internal.i.d(list);
                        hashMap.put(str2, list);
                        ArrayList<Calendar> weekOf = new GoalHelper().getWeekOf(aVar.D.getTime());
                        trackListFlow = firestoreGoal.getTrackListFlow();
                        List<GoalDateObj> list2 = xVar.f23469u;
                        kotlin.jvm.internal.i.d(list2);
                        u10 = a.u(weekOf, list2);
                        this.f15236u = 4;
                        if (trackListFlow.b(u10, this) == aVar2) {
                            return aVar2;
                        }
                        loading = firestoreGoal.getLoading();
                        bool = Boolean.FALSE;
                        this.f15236u = 5;
                        if (loading.b(bool, this) == aVar2) {
                        }
                        if (!this.B.f23466u) {
                        }
                        if (kotlin.jvm.internal.i.b(firestoreGoal.getType(), Constants.GOAL_TYPE_ACTIVITY_ONCE)) {
                        }
                        return hs.k.f19476a;
                    }
                    sp.b.d0(obj);
                    c10 = obj;
                    aVar = aVar3;
                    i6 = 2;
                    ((Boolean) c10).booleanValue();
                    HashMap<String, List<GoalDateObj>> hashMap2 = aVar.H;
                    kotlin.jvm.internal.x<List<GoalDateObj>> xVar2 = this.A;
                    List<GoalDateObj> list3 = xVar2.f23469u;
                    kotlin.jvm.internal.i.d(list3);
                    hashMap2.put(str2, list3);
                    ArrayList<Calendar> weekOf2 = new GoalHelper().getWeekOf(aVar.D.getTime());
                    trackListFlow = firestoreGoal.getTrackListFlow();
                    List<GoalDateObj> list22 = xVar2.f23469u;
                    kotlin.jvm.internal.i.d(list22);
                    u10 = a.u(weekOf2, list22);
                    this.f15236u = 4;
                    if (trackListFlow.b(u10, this) == aVar2) {
                    }
                    loading = firestoreGoal.getLoading();
                    bool = Boolean.FALSE;
                    this.f15236u = 5;
                    if (loading.b(bool, this) == aVar2) {
                    }
                    if (!this.B.f23466u) {
                    }
                    if (kotlin.jvm.internal.i.b(firestoreGoal.getType(), Constants.GOAL_TYPE_ACTIVITY_ONCE)) {
                    }
                    return hs.k.f19476a;
                }
                sp.b.d0(obj);
                p10 = obj;
                aVar = aVar3;
                i6 = 2;
            } else {
                sp.b.d0(obj);
                j0 j0Var = aVar3.f15183y;
                String str3 = this.f15238w;
                GoalDateObj goalDateObj2 = this.f15239x;
                fd.f fVar = FirebaseAuth.getInstance().f;
                if (fVar != null) {
                    str = fVar.j0();
                } else {
                    str = null;
                }
                kotlin.jvm.internal.i.d(str);
                String valueOf = String.valueOf(wVar.f23468u);
                this.f15236u = 1;
                aVar = aVar3;
                i6 = 2;
                p10 = j0Var.p(str3, goalDateObj2, str, valueOf, this);
                if (p10 == aVar2) {
                    return aVar2;
                }
            }
            if (((Boolean) p10).booleanValue()) {
                String courseName = firestoreGoal.getCourseName();
                if (courseName != null) {
                    if (goalDateObj.getVal() == i6) {
                        j0 j0Var2 = aVar.f15183y;
                        this.f15236u = i6;
                        j0Var2.getClass();
                        c10 = j0.c(courseName, this);
                        if (c10 == aVar2) {
                            return aVar2;
                        }
                        ((Boolean) c10).booleanValue();
                    } else {
                        j0 j0Var3 = aVar.f15183y;
                        this.f15236u = 3;
                        j0Var3.getClass();
                        g5 = j0.g(null, courseName, this);
                        if (g5 == aVar2) {
                            return aVar2;
                        }
                        ((Boolean) g5).booleanValue();
                    }
                }
                HashMap<String, List<GoalDateObj>> hashMap22 = aVar.H;
                kotlin.jvm.internal.x<List<GoalDateObj>> xVar22 = this.A;
                List<GoalDateObj> list32 = xVar22.f23469u;
                kotlin.jvm.internal.i.d(list32);
                hashMap22.put(str2, list32);
                ArrayList<Calendar> weekOf22 = new GoalHelper().getWeekOf(aVar.D.getTime());
                trackListFlow = firestoreGoal.getTrackListFlow();
                List<GoalDateObj> list222 = xVar22.f23469u;
                kotlin.jvm.internal.i.d(list222);
                u10 = a.u(weekOf22, list222);
                this.f15236u = 4;
                if (trackListFlow.b(u10, this) == aVar2) {
                }
                loading = firestoreGoal.getLoading();
                bool = Boolean.FALSE;
                this.f15236u = 5;
                if (loading.b(bool, this) == aVar2) {
                }
                if (!this.B.f23466u) {
                }
                if (kotlin.jvm.internal.i.b(firestoreGoal.getType(), Constants.GOAL_TYPE_ACTIVITY_ONCE)) {
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: FirestoreGoalsViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.FirestoreGoalsViewModel$toggleGoalTrack$1$2", f = "FirestoreGoalsViewModel.kt", l = {514, 518, 520, 540, 541}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class k extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {
        public final /* synthetic */ String A;

        /* renamed from: u  reason: collision with root package name */
        public int f15242u;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ FirestoreGoal f15244w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ GoalDateObj f15245x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ List<GoalDateObj> f15246y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.u f15247z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(FirestoreGoal firestoreGoal, GoalDateObj goalDateObj, List<GoalDateObj> list, kotlin.jvm.internal.u uVar, String str, ls.d<? super k> dVar) {
            super(2, dVar);
            this.f15244w = firestoreGoal;
            this.f15245x = goalDateObj;
            this.f15246y = list;
            this.f15247z = uVar;
            this.A = str;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new k(this.f15244w, this.f15245x, this.f15246y, this.f15247z, this.A, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((k) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x00cb  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00d4  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x012f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x013f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0144  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x015c  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x016a  */
        @Override // ns.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String str;
            a aVar;
            GoalDateObj goalDateObj;
            Object p10;
            Object g5;
            Object c10;
            GoalDateObj goalDateObj2;
            kotlinx.coroutines.flow.p<ArrayList<Boolean>> trackListFlow;
            ArrayList<Boolean> u10;
            kotlinx.coroutines.flow.p<Boolean> loading;
            Boolean bool;
            ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f15242u;
            kotlin.jvm.internal.u uVar = this.f15247z;
            String str2 = this.A;
            FirestoreGoal firestoreGoal = this.f15244w;
            GoalDateObj goalDateObj3 = this.f15245x;
            a aVar3 = a.this;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            if (i6 != 4) {
                                if (i6 == 5) {
                                    sp.b.d0(obj);
                                    aVar = aVar3;
                                    goalDateObj2 = goalDateObj3;
                                    if (!uVar.f23466u) {
                                        ((androidx.lifecycle.w) aVar.W.getValue()).i(new SingleUseEvent(Boolean.TRUE));
                                    }
                                    if (goalDateObj2.getVal() == 2) {
                                        aVar.f15172f0.setDailyGoalTrackDate(str2, goalDateObj2.getDate().getTime());
                                    } else {
                                        aVar.f15172f0.revertDailyGoalTrackDate(str2, goalDateObj2.getDate().getTime());
                                    }
                                    return hs.k.f19476a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sp.b.d0(obj);
                            aVar = aVar3;
                            goalDateObj2 = goalDateObj3;
                            loading = firestoreGoal.getLoading();
                            bool = Boolean.FALSE;
                            this.f15242u = 5;
                            if (loading.b(bool, this) == aVar2) {
                                return aVar2;
                            }
                            if (!uVar.f23466u) {
                            }
                            if (goalDateObj2.getVal() == 2) {
                            }
                            return hs.k.f19476a;
                        }
                        sp.b.d0(obj);
                        g5 = obj;
                        aVar = aVar3;
                        goalDateObj = goalDateObj3;
                        ((Boolean) g5).booleanValue();
                        ArrayList arrayList = new ArrayList(this.f15246y);
                        if (!uVar.f23466u) {
                            aVar.C(firestoreGoal);
                            goalDateObj2 = goalDateObj;
                            arrayList.add(goalDateObj2);
                        } else {
                            goalDateObj2 = goalDateObj;
                            Iterator it = arrayList.iterator();
                            GoalDateObj goalDateObj4 = goalDateObj2;
                            while (it.hasNext()) {
                                GoalDateObj goalDateObj5 = (GoalDateObj) it.next();
                                if (goalDateObj5.getDate().getTime() == goalDateObj2.getDate().getTime()) {
                                    goalDateObj4 = goalDateObj5;
                                }
                            }
                            arrayList.remove(goalDateObj4);
                            arrayList.add(goalDateObj2);
                        }
                        aVar.H.put(str2, is.u.I2(arrayList));
                        ArrayList<Calendar> weekOf = new GoalHelper().getWeekOf(aVar.D.getTime());
                        trackListFlow = firestoreGoal.getTrackListFlow();
                        u10 = a.u(weekOf, is.u.I2(arrayList));
                        this.f15242u = 4;
                        if (trackListFlow.b(u10, this) == aVar2) {
                            return aVar2;
                        }
                        loading = firestoreGoal.getLoading();
                        bool = Boolean.FALSE;
                        this.f15242u = 5;
                        if (loading.b(bool, this) == aVar2) {
                        }
                        if (!uVar.f23466u) {
                        }
                        if (goalDateObj2.getVal() == 2) {
                        }
                        return hs.k.f19476a;
                    }
                    sp.b.d0(obj);
                    c10 = obj;
                    aVar = aVar3;
                    goalDateObj = goalDateObj3;
                    ((Boolean) c10).booleanValue();
                    ArrayList arrayList2 = new ArrayList(this.f15246y);
                    if (!uVar.f23466u) {
                    }
                    aVar.H.put(str2, is.u.I2(arrayList2));
                    ArrayList<Calendar> weekOf2 = new GoalHelper().getWeekOf(aVar.D.getTime());
                    trackListFlow = firestoreGoal.getTrackListFlow();
                    u10 = a.u(weekOf2, is.u.I2(arrayList2));
                    this.f15242u = 4;
                    if (trackListFlow.b(u10, this) == aVar2) {
                    }
                    loading = firestoreGoal.getLoading();
                    bool = Boolean.FALSE;
                    this.f15242u = 5;
                    if (loading.b(bool, this) == aVar2) {
                    }
                    if (!uVar.f23466u) {
                    }
                    if (goalDateObj2.getVal() == 2) {
                    }
                    return hs.k.f19476a;
                }
                sp.b.d0(obj);
                p10 = obj;
                aVar = aVar3;
                goalDateObj = goalDateObj3;
            } else {
                sp.b.d0(obj);
                j0 j0Var = aVar3.f15183y;
                String goalId = firestoreGoal.getGoalId();
                GoalDateObj goalDateObj6 = this.f15245x;
                fd.f fVar = FirebaseAuth.getInstance().f;
                if (fVar != null) {
                    str = fVar.j0();
                } else {
                    str = null;
                }
                kotlin.jvm.internal.i.d(str);
                this.f15242u = 1;
                String str3 = str;
                aVar = aVar3;
                goalDateObj = goalDateObj3;
                p10 = j0Var.p(goalId, goalDateObj6, str3, null, this);
                if (p10 == aVar2) {
                    return aVar2;
                }
            }
            if (((Boolean) p10).booleanValue()) {
                String courseName = firestoreGoal.getCourseName();
                if (courseName != null) {
                    if (goalDateObj.getVal() == 2) {
                        j0 j0Var2 = aVar.f15183y;
                        this.f15242u = 2;
                        j0Var2.getClass();
                        c10 = j0.c(courseName, this);
                        if (c10 == aVar2) {
                            return aVar2;
                        }
                        ((Boolean) c10).booleanValue();
                    } else {
                        j0 j0Var3 = aVar.f15183y;
                        this.f15242u = 3;
                        j0Var3.getClass();
                        g5 = j0.g(null, courseName, this);
                        if (g5 == aVar2) {
                            return aVar2;
                        }
                        ((Boolean) g5).booleanValue();
                    }
                }
                ArrayList arrayList22 = new ArrayList(this.f15246y);
                if (!uVar.f23466u) {
                }
                aVar.H.put(str2, is.u.I2(arrayList22));
                ArrayList<Calendar> weekOf22 = new GoalHelper().getWeekOf(aVar.D.getTime());
                trackListFlow = firestoreGoal.getTrackListFlow();
                u10 = a.u(weekOf22, is.u.I2(arrayList22));
                this.f15242u = 4;
                if (trackListFlow.b(u10, this) == aVar2) {
                }
                loading = firestoreGoal.getLoading();
                bool = Boolean.FALSE;
                this.f15242u = 5;
                if (loading.b(bool, this) == aVar2) {
                }
                if (!uVar.f23466u) {
                }
                if (goalDateObj2.getVal() == 2) {
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: FirestoreGoalsViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.FirestoreGoalsViewModel$updateGoalOnActivityCompletion$1", f = "FirestoreGoalsViewModel.kt", l = {761, 771}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class l extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {
        public final /* synthetic */ Long A;
        public final /* synthetic */ Boolean B;

        /* renamed from: u  reason: collision with root package name */
        public FirestoreGoal f15248u;

        /* renamed from: v  reason: collision with root package name */
        public int f15249v;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f15251x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f15252y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ boolean f15253z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, String str2, boolean z10, Long l2, Boolean bool, ls.d<? super l> dVar) {
            super(2, dVar);
            this.f15251x = str;
            this.f15252y = str2;
            this.f15253z = z10;
            this.A = l2;
            this.B = bool;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new l(this.f15251x, this.f15252y, this.f15253z, this.A, this.B, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((l) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
        @Override // ns.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FirestoreGoal firestoreGoal;
            String type;
            GoalsPersistence.Companion.GoalTypePrefix goalTypePrefix;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f15249v;
            String str = this.f15252y;
            String str2 = this.f15251x;
            a aVar2 = a.this;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 == 2) {
                        firestoreGoal = this.f15248u;
                        sp.b.d0(obj);
                        ((Boolean) obj).booleanValue();
                        aVar2.f15173g0.i(firestoreGoal);
                        type = firestoreGoal.getType();
                        if (!kotlin.jvm.internal.i.b(type, Constants.GOAL_TYPE_ACTIVITY_ONCE)) {
                            goalTypePrefix = GoalsPersistence.Companion.GoalTypePrefix.ONE_TIME;
                        } else if (kotlin.jvm.internal.i.b(type, Constants.GOAL_TYPE_ACTIVITY_WEEKLY)) {
                            goalTypePrefix = GoalsPersistence.Companion.GoalTypePrefix.WEEKLY;
                        } else {
                            goalTypePrefix = GoalsPersistence.Companion.GoalTypePrefix.DAILY;
                        }
                        aVar2.f15172f0.setGoalScheduled(str2, goalTypePrefix, firestoreGoal.getNotificationScheduled());
                        return hs.k.f19476a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sp.b.d0(obj);
            } else {
                sp.b.d0(obj);
                j0 j0Var = aVar2.f15183y;
                this.f15249v = 1;
                obj = j0Var.k(str2, str, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            FirestoreGoal firestoreGoal2 = (FirestoreGoal) obj;
            if (firestoreGoal2 != null) {
                boolean z10 = !firestoreGoal2.isVisible();
                firestoreGoal2.setVisible(this.f15253z);
                Long l2 = this.A;
                if (l2 != null) {
                    firestoreGoal2.getScheduledDate().setTime(l2.longValue());
                }
                Boolean bool = this.B;
                if (bool != null) {
                    firestoreGoal2.setNotificationScheduled(bool.booleanValue());
                }
                j0 j0Var2 = aVar2.f15183y;
                this.f15248u = firestoreGoal2;
                this.f15249v = 2;
                Object b10 = j0Var2.b(firestoreGoal2, str, z10, this);
                if (b10 == aVar) {
                    return aVar;
                }
                firestoreGoal = firestoreGoal2;
                obj = b10;
                ((Boolean) obj).booleanValue();
                aVar2.f15173g0.i(firestoreGoal);
                type = firestoreGoal.getType();
                if (!kotlin.jvm.internal.i.b(type, Constants.GOAL_TYPE_ACTIVITY_ONCE)) {
                }
                aVar2.f15172f0.setGoalScheduled(str2, goalTypePrefix, firestoreGoal.getNotificationScheduled());
                return hs.k.f19476a;
            }
            aVar2.f15173g0.i(null);
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Application application, j0 repository) {
        super(application);
        kotlinx.coroutines.scheduling.c defaultDispatcher = kotlinx.coroutines.o0.f23640a;
        kotlinx.coroutines.scheduling.b ioDispatcher = kotlinx.coroutines.o0.f23642c;
        kotlin.jvm.internal.i.g(application, "application");
        kotlin.jvm.internal.i.g(repository, "repository");
        kotlin.jvm.internal.i.g(defaultDispatcher, "defaultDispatcher");
        kotlin.jvm.internal.i.g(ioDispatcher, "ioDispatcher");
        this.f15183y = repository;
        this.f15184z = defaultDispatcher;
        this.A = ioDispatcher;
        this.B = LogHelper.INSTANCE.makeLogTag("FirestoreGoalsViewModel");
        this.C = sp.b.O(fm.h.f15345u);
        Date time = Calendar.getInstance().getTime();
        kotlin.jvm.internal.i.f(time, "getInstance().time");
        this.D = time;
        this.E = new androidx.lifecycle.w<>();
        this.F = new androidx.lifecycle.w<>();
        this.G = new androidx.lifecycle.w<>();
        this.H = new HashMap<>();
        this.I = sp.b.O(e0.f15317u);
        this.J = sp.b.O(f0.f15323u);
        this.K = sp.b.O(c0.f15292u);
        this.L = sp.b.O(v.f15573u);
        this.M = sp.b.O(y.f15607u);
        this.N = sp.b.O(fm.i.f15362u);
        this.O = sp.b.O(fm.k.f15424u);
        this.P = sp.b.O(fm.j.f15373u);
        this.R = new androidx.lifecycle.w<>();
        this.S = sp.b.O(t.f15558u);
        this.T = sp.b.O(d0.f15300u);
        this.U = sp.b.O(m.f15446u);
        this.V = sp.b.O(b0.f15290u);
        this.W = sp.b.O(fm.d.f15299u);
        this.X = new androidx.lifecycle.w<>();
        this.Y = new androidx.lifecycle.w<>();
        this.f15169a0 = new String[]{Constants.COURSE_DEPRESSION, Constants.COURSE_WORRY, Constants.COURSE_STRESS, Constants.COURSE_SLEEP, Constants.COURSE_HAPPINESS, Constants.COURSE_ANGER};
        this.f15170b0 = sp.b.O(fm.c.f15291u);
        this.c0 = sp.b.O(fm.l.f15434u);
        this.f15171d0 = sp.b.O(x.f15602u);
        this.e0 = sp.b.O(new w(this));
        Context applicationContext = this.f2382x.getApplicationContext();
        kotlin.jvm.internal.i.e(applicationContext, "null cannot be cast to non-null type com.theinnerhour.b2b.MyApplication");
        this.f15172f0 = ((MyApplication) applicationContext).c();
        this.f15173g0 = new androidx.lifecycle.w<>();
        this.f15174h0 = new androidx.lifecycle.w<>();
        this.f15175i0 = new androidx.lifecycle.w<>();
        this.f15176j0 = new androidx.lifecycle.w<>();
        this.f15177k0 = new androidx.lifecycle.w<>();
        this.f15178l0 = new androidx.lifecycle.w<>();
        this.f15179m0 = new androidx.lifecycle.w<>();
        this.f15180n0 = new androidx.lifecycle.w<>();
        this.f15181o0 = new androidx.lifecycle.w<>();
        this.f15182p0 = new androidx.lifecycle.w<>();
    }

    public static final void e(a aVar, FirestoreGoal firestoreGoal) {
        String j02;
        aVar.getClass();
        fd.f fVar = FirebaseAuth.getInstance().f;
        if (fVar != null && (j02 = fVar.j0()) != null) {
            ta.v.H(kc.f.H(aVar), aVar.A, 0, new q(firestoreGoal, aVar, j02, null), 2);
        }
    }

    public static final Object f(a aVar, FirestoreGoal firestoreGoal, ls.d dVar) {
        String j02;
        String goalId;
        String goalName;
        aVar.getClass();
        ls.h hVar = new ls.h(ca.a.G0(dVar));
        fd.f fVar = FirebaseAuth.getInstance().f;
        if (fVar != null && (j02 = fVar.j0()) != null && (goalId = firestoreGoal.getGoalId()) != null && (goalName = firestoreGoal.getGoalName()) != null) {
            ta.v.H(kc.f.H(aVar), aVar.A, 0, new s(goalId, firestoreGoal, aVar, goalName, j02, hVar, null), 2);
        }
        return hVar.b();
    }

    public static HashMap r(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GoalDateObj goalDateObj = (GoalDateObj) it.next();
            hashMap.put(goalDateObj.getmDate(), goalDateObj);
        }
        return hashMap;
    }

    public static ArrayList u(ArrayList arrayList, List list) {
        boolean z10;
        Integer num;
        ArrayList arrayList2 = new ArrayList(7);
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GoalDateObj goalDateObj = (GoalDateObj) it.next();
            hashMap.put(goalDateObj.getmDate(), Integer.valueOf(goalDateObj.getVal()));
        }
        boolean z11 = false;
        if (arrayList != null) {
            Iterator it2 = is.u.N2(arrayList).iterator();
            while (true) {
                is.b0 b0Var = (is.b0) it2;
                if (!b0Var.hasNext()) {
                    break;
                }
                is.z zVar = (is.z) b0Var.next();
                if (hashMap.containsKey(((Calendar) zVar.f20680b).getTime()) && (num = (Integer) hashMap.get(((Calendar) zVar.f20680b).getTime())) != null && num.intValue() == 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList2.add(Boolean.valueOf(z10));
            }
        } else {
            if ((!list.isEmpty()) && ((GoalDateObj) list.get(0)).getVal() == 2) {
                z11 = true;
            }
            arrayList2.add(Boolean.valueOf(z11));
        }
        return arrayList2;
    }

    public final void A(boolean z10) {
        hs.i iVar = this.P;
        Application application = this.f2382x;
        if (z10) {
            ((androidx.lifecycle.w) iVar.getValue()).i(new SingleUseEvent(application.getApplicationContext().getString(R.string.done_label)));
        } else {
            ((androidx.lifecycle.w) iVar.getValue()).i(new SingleUseEvent(application.getApplicationContext().getString(R.string.editGoals)));
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.util.List, T] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.util.List, T] */
    public final void B(FirestoreGoal firestoreGoal, boolean z10, Long l2) {
        boolean b10;
        boolean z11;
        boolean z12;
        String goalId = firestoreGoal.getGoalId();
        if (goalId != null) {
            GoalDateObj goalDateObj = new GoalDateObj(this.D, 2);
            if (l2 != null) {
                goalDateObj.setCompletionTimeInSeconds(l2);
            }
            kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
            String type = firestoreGoal.getType();
            if (kotlin.jvm.internal.i.b(type, Constants.GOAL_TYPE_ACTIVITY_ONCE)) {
                b10 = true;
            } else {
                b10 = kotlin.jvm.internal.i.b(type, Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
            }
            HashMap<String, List<GoalDateObj>> hashMap = this.H;
            kotlinx.coroutines.a0 a0Var = this.A;
            if (b10) {
                kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
                xVar.f23469u = hashMap.get(goalId);
                kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
                wVar.f23468u = goalDateObj.getDate().getTime();
                Collection collection = (Collection) xVar.f23469u;
                if (collection != null && !collection.isEmpty()) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z12) {
                    xVar.f23469u = ca.a.O0(goalDateObj);
                    C(firestoreGoal);
                } else {
                    for (GoalDateObj goalDateObj2 : (List) xVar.f23469u) {
                        wVar.f23468u = goalDateObj2.getDate().getTime();
                        goalDateObj.setDate(goalDateObj2.getDate());
                        uVar.f23466u = true;
                        if (goalDateObj2.getVal() == 2) {
                            if (z10) {
                                return;
                            }
                            goalDateObj.setVal(1);
                        } else {
                            goalDateObj.setVal(2);
                        }
                    }
                    xVar.f23469u = ca.a.O0(goalDateObj);
                }
                ta.v.H(kc.f.H(this), a0Var, 0, new j(goalId, goalDateObj, wVar, firestoreGoal, xVar, uVar, null), 2);
                return;
            }
            List<GoalDateObj> list = hashMap.get(goalId);
            if (list != null && !list.isEmpty()) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11) {
                uVar.f23466u = false;
            } else {
                for (GoalDateObj goalDateObj3 : list) {
                    kotlinx.coroutines.a0 a0Var2 = a0Var;
                    if (goalDateObj3.getDate().getTime() * 1000 == this.D.getTime()) {
                        uVar.f23466u = true;
                        if (goalDateObj3.getVal() == 2) {
                            if (z10) {
                                return;
                            }
                            goalDateObj.setVal(1);
                        } else {
                            goalDateObj.setVal(2);
                        }
                    }
                    a0Var = a0Var2;
                }
            }
            ta.v.H(kc.f.H(this), a0Var, 0, new k(firestoreGoal, goalDateObj, list, uVar, goalId, null), 2);
        }
    }

    public final void C(FirestoreGoal firestoreGoal) {
        try {
            long longValue = ApplicationPersistence.getInstance().getLongValue("goal_feedback_count", 0L) + 1;
            ApplicationPersistence.getInstance().setLongValue("goal_feedback_count", longValue);
            if (longValue >= 10) {
                ((androidx.lifecycle.w) this.V.getValue()).i(new SingleUseEvent(Boolean.TRUE));
            }
            GamificationModel gamificationModel = new GamificationModel(5, Constants.GAMIFICATION_GOAL_UPDATION_TASK, Constants.getCourseName(firestoreGoal.getCourseId()), Constants.getGoalName(firestoreGoal.getGoalName()));
            NpsPersistence.INSTANCE.incrementNpsGoalTrackCount();
            ta.v.H(kc.f.H(this), null, 0, new u(firestoreGoal, this, gamificationModel, this.D, null), 3);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.B, e10);
        }
    }

    public final void D(String str, String str2, boolean z10, Boolean bool, Long l2) {
        ta.v.H(kc.f.H(this), this.A, 0, new l(str2, str, z10, l2, bool, null), 2);
    }

    public final void g(FirestoreGoal firestoreGoal, boolean z10) {
        String j02;
        String goalId;
        fd.f fVar = FirebaseAuth.getInstance().f;
        if (fVar != null && (j02 = fVar.j0()) != null && (goalId = firestoreGoal.getGoalId()) != null) {
            ta.v.H(kc.f.H(this), this.A, 0, new C0232a(firestoreGoal, j02, z10, goalId, null), 2);
        }
    }

    public final void h(Object log, String goalId) {
        kotlin.jvm.internal.i.g(goalId, "goalId");
        kotlin.jvm.internal.i.g(log, "log");
        ta.v.H(kc.f.H(this), null, 0, new fm.b(this, goalId, log, null), 3);
    }

    public final GamificationModel i(List<GoalDateObj> list, Date date, FirestoreGoal firestoreGoal) {
        try {
            Calendar todayCalendar = Utils.INSTANCE.getTodayCalendar();
            todayCalendar.setTime(date);
            for (int i6 = 0; i6 < 3; i6++) {
                for (GoalDateObj goalDateObj : list) {
                    if (goalDateObj.getmDate().getTime() == todayCalendar.getTime().getTime()) {
                        goalDateObj.setConsecutive3DaysHP(true);
                    }
                }
                todayCalendar.add(5, -1);
            }
            return new GamificationModel(20, Constants.GAMIFICATION_GOAL_3DAYS_COMPLETITION_TASK, FirebasePersistence.getInstance().getUser().getCurrentCourseName(), Constants.getGoalName(firestoreGoal.getGoalId()));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.B, e10);
            return null;
        }
    }

    public final void j(Object log, String goalId) {
        kotlin.jvm.internal.i.g(goalId, "goalId");
        kotlin.jvm.internal.i.g(log, "log");
        ta.v.H(kc.f.H(this), null, 0, new fm.e(this, goalId, log, null), 3);
    }

    public final void k() {
        String j02;
        fd.f fVar = FirebaseAuth.getInstance().f;
        if (fVar != null && (j02 = fVar.j0()) != null) {
            ta.v.H(kc.f.H(this), null, 0, new b(j02, null), 3);
        }
    }

    public final void l(String str) {
        ta.v.H(kc.f.H(this), null, 0, new c(str, null), 3);
    }

    public final void m(String str, String resultKey) {
        kotlin.jvm.internal.i.g(resultKey, "resultKey");
        ta.v.H(kc.f.H(this), null, 0, new d(str, resultKey, null), 3);
    }

    public final void n(String goalId) {
        kotlin.jvm.internal.i.g(goalId, "goalId");
        ta.v.H(kc.f.H(this), null, 0, new e(goalId, null), 3);
    }

    public final void o(String goalId, boolean z10) {
        kotlin.jvm.internal.i.g(goalId, "goalId");
        ta.v.H(kc.f.H(this), null, 0, new f(goalId, z10, null), 3);
    }

    public final void p() {
        String j02;
        fd.f fVar = FirebaseAuth.getInstance().f;
        if (fVar != null && (j02 = fVar.j0()) != null) {
            ta.v.H(kc.f.H(this), null, 0, new g(j02, null), 3);
        }
    }

    public final androidx.lifecycle.w<hs.f<Boolean, FirestoreGoal>> q() {
        return this.f15178l0;
    }

    public final androidx.lifecycle.w<SingleUseEvent<Boolean>> s() {
        return (androidx.lifecycle.w) this.M.getValue();
    }

    public final void t(Boolean bool, List<FirestoreGoal> list, List<FirestoreGoal> list2) {
        boolean z10;
        if (bool == null) {
            boolean z11 = false;
            if (this.Q == 0) {
                if (list2 != null && list2.isEmpty()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    s().i(new SingleUseEvent<>(Boolean.TRUE));
                    return;
                }
            }
            if (this.Q == 1) {
                if (list != null && list.isEmpty()) {
                    z11 = true;
                }
                if (z11) {
                    s().i(new SingleUseEvent<>(Boolean.TRUE));
                    return;
                }
            }
            s().i(new SingleUseEvent<>(Boolean.FALSE));
            return;
        }
        s().i(new SingleUseEvent<>(bool));
    }

    public final void v(FirestoreGoal firestoreGoal) {
        String j02;
        String goalId;
        fd.f fVar = FirebaseAuth.getInstance().f;
        if (fVar != null && (j02 = fVar.j0()) != null && (goalId = firestoreGoal.getGoalId()) != null) {
            firestoreGoal.setNotificationScheduled(false);
            firestoreGoal.setVisible(false);
            ta.v.H(kc.f.H(this), this.A, 0, new h(firestoreGoal, this, j02, goalId, null), 2);
        }
    }

    public final void w() {
        this.f15174h0.i(null);
        this.f15177k0.i(null);
        this.f15178l0.i(null);
        this.f15180n0.i(null);
        this.f15181o0.i(null);
        this.f15182p0.i(null);
    }

    public final void x(FirestoreGoal firestoreGoal) {
        kotlin.jvm.internal.i.g(firestoreGoal, "firestoreGoal");
        ta.v.H(kc.f.H(this), this.A, 0, new i(firestoreGoal, null), 2);
    }

    public final void y(boolean z10) {
        ((androidx.lifecycle.w) this.K.getValue()).i(new SingleUseEvent(Boolean.valueOf(z10)));
    }

    public final void z(Intent intent) {
        ((androidx.lifecycle.w) this.I.getValue()).i(new SingleUseEvent(intent));
    }
}
