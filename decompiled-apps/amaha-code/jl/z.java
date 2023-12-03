package jl;

import com.appsflyer.R;
import com.theinnerhour.b2b.components.logs.model.LogModel;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: LibraryLogViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.LibraryLogViewModel$fetchLibraryLogs$1", f = "LibraryLogViewModel.kt", l = {R.styleable.AppCompatTheme_buttonBarStyle}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class z extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {
    public final /* synthetic */ String A;

    /* renamed from: u  reason: collision with root package name */
    public ArrayList f22434u;

    /* renamed from: v  reason: collision with root package name */
    public ArrayList f22435v;

    /* renamed from: w  reason: collision with root package name */
    public ArrayList f22436w;

    /* renamed from: x  reason: collision with root package name */
    public int f22437x;

    /* renamed from: y  reason: collision with root package name */
    public /* synthetic */ Object f22438y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ a0 f22439z;

    /* compiled from: LibraryLogViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.LibraryLogViewModel$fetchLibraryLogs$1$3", f = "LibraryLogViewModel.kt", l = {R.styleable.AppCompatTheme_buttonBarStyle}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super HashMap<String, String>>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f22440u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ a0 f22441v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f22442w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.x<HashSet<String>> f22443x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a0 a0Var, String str, kotlin.jvm.internal.x<HashSet<String>> xVar, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f22441v = a0Var;
            this.f22442w = str;
            this.f22443x = xVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f22441v, this.f22442w, this.f22443x, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super HashMap<String, String>> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f22440u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                this.f22440u = 1;
                obj = this.f22441v.f22079x.c(this.f22442w, this.f22443x.f23469u, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes2.dex */
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t3, T t10) {
            return sp.b.g(Long.valueOf(((Goal) t10).getLastAdded().getTime()), Long.valueOf(((Goal) t3).getLastAdded().getTime()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a0 a0Var, String str, ls.d<? super z> dVar) {
        super(2, dVar);
        this.f22439z = a0Var;
        this.A = str;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        z zVar = new z(this.f22439z, this.A, dVar);
        zVar.f22438y = obj;
        return zVar;
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((z) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [java.util.HashSet, T] */
    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ArrayList<Goal> arrayList;
        Object S;
        ArrayList arrayList2;
        ArrayList<String> arrayList3;
        hs.k kVar;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f22437x;
        a0 a0Var = this.f22439z;
        if (i6 != 0) {
            if (i6 == 1) {
                arrayList3 = this.f22436w;
                ArrayList arrayList4 = this.f22435v;
                arrayList2 = this.f22434u;
                kotlinx.coroutines.d0 d0Var = (kotlinx.coroutines.d0) this.f22438y;
                sp.b.d0(obj);
                arrayList = arrayList4;
                S = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.d0 d0Var2 = (kotlinx.coroutines.d0) this.f22438y;
            ArrayList arrayList5 = new ArrayList();
            List<Goal> goals = FirebasePersistence.getInstance().getUserGoals();
            kotlin.jvm.internal.i.f(goals, "goals");
            ArrayList arrayList6 = new ArrayList();
            for (Object obj2 : goals) {
                if (gv.n.A0(((Goal) obj2).getSource(), "library", false)) {
                    arrayList6.add(obj2);
                }
            }
            arrayList = new ArrayList(arrayList6);
            ArrayList<String> resultLogSlugs = Constants.getResultLogSlugs();
            if (arrayList.size() > 1) {
                is.p.P1(arrayList, new b());
            }
            kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
            xVar.f23469u = new HashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String goalId = ((Goal) it.next()).getGoalId();
                if (goalId != null) {
                    ((HashSet) xVar.f23469u).add(goalId);
                }
            }
            kotlinx.coroutines.scheduling.b bVar = a0Var.f22081z;
            a aVar2 = new a(a0Var, this.A, xVar, null);
            this.f22438y = d0Var2;
            this.f22434u = arrayList5;
            this.f22435v = arrayList;
            this.f22436w = resultLogSlugs;
            this.f22437x = 1;
            S = ta.v.S(bVar, aVar2, this);
            if (S == aVar) {
                return aVar;
            }
            arrayList2 = arrayList5;
            arrayList3 = resultLogSlugs;
        }
        HashMap hashMap = (HashMap) S;
        if (hashMap != null) {
            for (Goal goal : arrayList) {
                Set<String> keySet = goal.getData().keySet();
                kotlin.jvm.internal.i.f(keySet, "goal.data.keys");
                ArrayList arrayList7 = new ArrayList();
                for (Object obj3 : keySet) {
                    if (arrayList3.contains((String) obj3)) {
                        arrayList7.add(obj3);
                    }
                }
                List I2 = is.u.I2(arrayList7);
                int i10 = 0;
                for (Object obj4 : I2) {
                    int i11 = i10 + 1;
                    if (i10 >= 0) {
                        String str = (String) obj4;
                        String goalName = goal.getGoalName();
                        String goalId2 = goal.getGoalId();
                        kotlin.jvm.internal.i.d(goalId2);
                        Object obj5 = I2.get(i10);
                        kotlin.jvm.internal.i.f(obj5, "filteredList[pos]");
                        String str2 = (String) obj5;
                        String goalId3 = goal.getGoalId();
                        kotlin.jvm.internal.i.d(goalId3);
                        String str3 = (String) hashMap.get(goalId3);
                        if (str3 == null && (str3 = goal.getGoalName()) == null) {
                            str3 = "";
                        }
                        arrayList2.add(new LogModel(goalName, goalId2, str2, str3, true));
                        i10 = i11;
                    } else {
                        ca.a.t1();
                        throw null;
                    }
                }
            }
            a0Var.A.i(arrayList2);
            kVar = hs.k.f19476a;
        } else {
            kVar = null;
        }
        if (kVar == null) {
            for (Goal goal2 : arrayList) {
                Set<String> keySet2 = goal2.getData().keySet();
                kotlin.jvm.internal.i.f(keySet2, "goal.data.keys");
                ArrayList arrayList8 = new ArrayList();
                for (Object obj6 : keySet2) {
                    if (arrayList3.contains((String) obj6)) {
                        arrayList8.add(obj6);
                    }
                }
                List I22 = is.u.I2(arrayList8);
                int i12 = 0;
                for (Object obj7 : I22) {
                    int i13 = i12 + 1;
                    if (i12 >= 0) {
                        String str4 = (String) obj7;
                        String goalName2 = goal2.getGoalName();
                        if (goalName2 != null) {
                            String goalName3 = goal2.getGoalName();
                            String goalId4 = goal2.getGoalId();
                            kotlin.jvm.internal.i.d(goalId4);
                            Object obj8 = I22.get(i12);
                            kotlin.jvm.internal.i.f(obj8, "filteredList[pos]");
                            arrayList2.add(new LogModel(goalName3, goalId4, (String) obj8, goalName2, true));
                        }
                        i12 = i13;
                    } else {
                        ca.a.t1();
                        throw null;
                    }
                }
            }
            a0Var.A.i(arrayList2);
        }
        return hs.k.f19476a;
    }
}
