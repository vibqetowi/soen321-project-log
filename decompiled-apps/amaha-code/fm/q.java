package fm;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.model.GoalDateObj;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.GoalHelper;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
/* compiled from: FirestoreGoalsViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.FirestoreGoalsViewModel$fetchTrackListForWeek$1$1", f = "FirestoreGoalsViewModel.kt", l = {213, 220}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class q extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f15495u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ FirestoreGoal f15496v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ fm.a f15497w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f15498x;

    /* compiled from: FirestoreGoalsViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a<T> implements kotlinx.coroutines.flow.e {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ fm.a f15499u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ FirestoreGoal f15500v;

        /* compiled from: FirestoreGoalsViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.FirestoreGoalsViewModel$fetchTrackListForWeek$1$1$1", f = "FirestoreGoalsViewModel.kt", l = {215, 216}, m = "emit")
        /* renamed from: fm.q$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0239a extends ns.c {

            /* renamed from: u  reason: collision with root package name */
            public a f15501u;

            /* renamed from: v  reason: collision with root package name */
            public /* synthetic */ Object f15502v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ a<T> f15503w;

            /* renamed from: x  reason: collision with root package name */
            public int f15504x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0239a(a<? super T> aVar, ls.d<? super C0239a> dVar) {
                super(dVar);
                this.f15503w = aVar;
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                this.f15502v = obj;
                this.f15504x |= LinearLayoutManager.INVALID_OFFSET;
                return this.f15503w.b(null, this);
            }
        }

        public a(fm.a aVar, FirestoreGoal firestoreGoal) {
            this.f15499u = aVar;
            this.f15500v = firestoreGoal;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0072 A[RETURN] */
        @Override // kotlinx.coroutines.flow.e
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object b(List<GoalDateObj> list, ls.d<? super hs.k> dVar) {
            C0239a c0239a;
            ms.a aVar;
            int i6;
            a<T> aVar2;
            kotlinx.coroutines.flow.p<Boolean> loading;
            Boolean bool;
            if (dVar instanceof C0239a) {
                c0239a = (C0239a) dVar;
                int i10 = c0239a.f15504x;
                if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c0239a.f15504x = i10 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = c0239a.f15502v;
                    aVar = ms.a.COROUTINE_SUSPENDED;
                    i6 = c0239a.f15504x;
                    if (i6 == 0) {
                        if (i6 != 1) {
                            if (i6 == 2) {
                                sp.b.d0(obj);
                                return hs.k.f19476a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar2 = c0239a.f15501u;
                        sp.b.d0(obj);
                    } else {
                        sp.b.d0(obj);
                        HashMap<String, List<GoalDateObj>> hashMap = this.f15499u.H;
                        FirestoreGoal firestoreGoal = this.f15500v;
                        String goalId = firestoreGoal.getGoalId();
                        kotlin.jvm.internal.i.d(goalId);
                        hashMap.put(goalId, list);
                        kotlinx.coroutines.flow.p<ArrayList<Boolean>> trackListFlow = firestoreGoal.getTrackListFlow();
                        ArrayList<Boolean> u10 = fm.a.u(null, list);
                        c0239a.f15501u = this;
                        c0239a.f15504x = 1;
                        if (trackListFlow.b(u10, c0239a) == aVar) {
                            return aVar;
                        }
                        aVar2 = this;
                    }
                    loading = aVar2.f15500v.getLoading();
                    bool = Boolean.FALSE;
                    c0239a.f15501u = null;
                    c0239a.f15504x = 2;
                    if (loading.b(bool, c0239a) == aVar) {
                        return aVar;
                    }
                    return hs.k.f19476a;
                }
            }
            c0239a = new C0239a(this, dVar);
            Object obj2 = c0239a.f15502v;
            aVar = ms.a.COROUTINE_SUSPENDED;
            i6 = c0239a.f15504x;
            if (i6 == 0) {
            }
            loading = aVar2.f15500v.getLoading();
            bool = Boolean.FALSE;
            c0239a.f15501u = null;
            c0239a.f15504x = 2;
            if (loading.b(bool, c0239a) == aVar) {
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: FirestoreGoalsViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class b<T> implements kotlinx.coroutines.flow.e {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ fm.a f15505u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ FirestoreGoal f15506v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ArrayList<Calendar> f15507w;

        /* compiled from: FirestoreGoalsViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.FirestoreGoalsViewModel$fetchTrackListForWeek$1$1$2", f = "FirestoreGoalsViewModel.kt", l = {222, 223}, m = "emit")
        /* loaded from: classes2.dex */
        public static final class a extends ns.c {

            /* renamed from: u  reason: collision with root package name */
            public b f15508u;

            /* renamed from: v  reason: collision with root package name */
            public /* synthetic */ Object f15509v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ b<T> f15510w;

            /* renamed from: x  reason: collision with root package name */
            public int f15511x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(b<? super T> bVar, ls.d<? super a> dVar) {
                super(dVar);
                this.f15510w = bVar;
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                this.f15509v = obj;
                this.f15511x |= LinearLayoutManager.INVALID_OFFSET;
                return this.f15510w.b(null, this);
            }
        }

        public b(fm.a aVar, FirestoreGoal firestoreGoal, ArrayList<Calendar> arrayList) {
            this.f15505u = aVar;
            this.f15506v = firestoreGoal;
            this.f15507w = arrayList;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0074 A[RETURN] */
        @Override // kotlinx.coroutines.flow.e
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object b(List<GoalDateObj> list, ls.d<? super hs.k> dVar) {
            a aVar;
            ms.a aVar2;
            int i6;
            b<T> bVar;
            kotlinx.coroutines.flow.p<Boolean> loading;
            Boolean bool;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i10 = aVar.f15511x;
                if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    aVar.f15511x = i10 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = aVar.f15509v;
                    aVar2 = ms.a.COROUTINE_SUSPENDED;
                    i6 = aVar.f15511x;
                    if (i6 == 0) {
                        if (i6 != 1) {
                            if (i6 == 2) {
                                sp.b.d0(obj);
                                return hs.k.f19476a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = aVar.f15508u;
                        sp.b.d0(obj);
                    } else {
                        sp.b.d0(obj);
                        HashMap<String, List<GoalDateObj>> hashMap = this.f15505u.H;
                        FirestoreGoal firestoreGoal = this.f15506v;
                        String goalId = firestoreGoal.getGoalId();
                        kotlin.jvm.internal.i.d(goalId);
                        hashMap.put(goalId, list);
                        kotlinx.coroutines.flow.p<ArrayList<Boolean>> trackListFlow = firestoreGoal.getTrackListFlow();
                        ArrayList<Boolean> u10 = fm.a.u(this.f15507w, list);
                        aVar.f15508u = this;
                        aVar.f15511x = 1;
                        if (trackListFlow.b(u10, aVar) == aVar2) {
                            return aVar2;
                        }
                        bVar = this;
                    }
                    loading = bVar.f15506v.getLoading();
                    bool = Boolean.FALSE;
                    aVar.f15508u = null;
                    aVar.f15511x = 2;
                    if (loading.b(bool, aVar) == aVar2) {
                        return aVar2;
                    }
                    return hs.k.f19476a;
                }
            }
            aVar = new a(this, dVar);
            Object obj2 = aVar.f15509v;
            aVar2 = ms.a.COROUTINE_SUSPENDED;
            i6 = aVar.f15511x;
            if (i6 == 0) {
            }
            loading = bVar.f15506v.getLoading();
            bool = Boolean.FALSE;
            aVar.f15508u = null;
            aVar.f15511x = 2;
            if (loading.b(bool, aVar) == aVar2) {
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(FirestoreGoal firestoreGoal, fm.a aVar, String str, ls.d<? super q> dVar) {
        super(2, dVar);
        this.f15496v = firestoreGoal;
        this.f15497w = aVar;
        this.f15498x = str;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new q(this.f15496v, this.f15497w, this.f15498x, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((q) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00ba -> B:24:0x00c1). Please submit an issue!!! */
    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        FirestoreGoal firestoreGoal = this.f15496v;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f15495u;
        fm.a aVar2 = this.f15497w;
        try {
            if (i6 != 0) {
                if (i6 != 1 && i6 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sp.b.d0(obj);
            } else {
                sp.b.d0(obj);
                boolean b10 = kotlin.jvm.internal.i.b(firestoreGoal.getType(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
                String uid = this.f15498x;
                if (b10) {
                    j0 j0Var = aVar2.f15183y;
                    kotlinx.coroutines.flow.x f = tr.r.f(new Integer(0));
                    String goalId = firestoreGoal.getGoalId();
                    kotlin.jvm.internal.i.d(goalId);
                    kotlin.jvm.internal.i.f(uid, "uid");
                    kotlinx.coroutines.flow.r m10 = j0Var.m(f, goalId, uid, null, null);
                    a aVar3 = new a(aVar2, firestoreGoal);
                    this.f15495u = 1;
                    if (m10.a(aVar3, this) == aVar) {
                        return aVar;
                    }
                } else {
                    ArrayList<Calendar> weekOf = new GoalHelper().getWeekOf(aVar2.D.getTime());
                    j0 j0Var2 = aVar2.f15183y;
                    kotlinx.coroutines.flow.x f2 = tr.r.f(new Integer(0));
                    String goalId2 = firestoreGoal.getGoalId();
                    kotlin.jvm.internal.i.d(goalId2);
                    kotlin.jvm.internal.i.f(uid, "uid");
                    long j10 = 1000;
                    kotlinx.coroutines.flow.r m11 = j0Var2.m(f2, goalId2, uid, new Long(((Calendar) is.u.g2(weekOf)).getTimeInMillis() / j10), new Long(((Calendar) is.u.o2(weekOf)).getTimeInMillis() / j10));
                    b bVar = new b(aVar2, firestoreGoal, weekOf);
                    this.f15495u = 2;
                    if (m11.a(bVar, this) == aVar) {
                        return aVar;
                    }
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(aVar2.B, e10);
        }
        return hs.k.f19476a;
    }
}
