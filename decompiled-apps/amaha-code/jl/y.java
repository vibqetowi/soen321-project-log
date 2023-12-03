package jl;

import com.appsflyer.R;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.components.logs.model.LogModel;
import com.theinnerhour.b2b.model.CustomDate;
import com.theinnerhour.b2b.utils.Constants;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* compiled from: LibraryLogViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.LibraryLogViewModel$fetchFireStoreGoalLibraryLogs$1", f = "LibraryLogViewModel.kt", l = {R.styleable.AppCompatTheme_ratingBarStyle}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class y extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {
    public final /* synthetic */ a0 A;
    public final /* synthetic */ String B;

    /* renamed from: u  reason: collision with root package name */
    public ArrayList f22408u;

    /* renamed from: v  reason: collision with root package name */
    public ArrayList f22409v;

    /* renamed from: w  reason: collision with root package name */
    public ArrayList f22410w;

    /* renamed from: x  reason: collision with root package name */
    public int f22411x;

    /* renamed from: y  reason: collision with root package name */
    public /* synthetic */ Object f22412y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ List<FirestoreGoal> f22413z;

    /* compiled from: LibraryLogViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.LibraryLogViewModel$fetchFireStoreGoalLibraryLogs$1$3", f = "LibraryLogViewModel.kt", l = {R.styleable.AppCompatTheme_ratingBarStyle}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super HashMap<String, String>>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f22414u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ a0 f22415v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f22416w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.x<HashSet<String>> f22417x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a0 a0Var, String str, kotlin.jvm.internal.x<HashSet<String>> xVar, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f22415v = a0Var;
            this.f22416w = str;
            this.f22417x = xVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f22415v, this.f22416w, this.f22417x, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super HashMap<String, String>> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f22414u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                this.f22414u = 1;
                obj = this.f22415v.f22079x.c(this.f22416w, this.f22417x.f23469u, this);
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
            Long l2;
            CustomDate lastAdded;
            CustomDate lastAdded2;
            FirestoreGoal firestoreGoal = (FirestoreGoal) t10;
            Long l10 = null;
            if (firestoreGoal != null && (lastAdded2 = firestoreGoal.getLastAdded()) != null) {
                l2 = Long.valueOf(lastAdded2.getTime());
            } else {
                l2 = null;
            }
            FirestoreGoal firestoreGoal2 = (FirestoreGoal) t3;
            if (firestoreGoal2 != null && (lastAdded = firestoreGoal2.getLastAdded()) != null) {
                l10 = Long.valueOf(lastAdded.getTime());
            }
            return sp.b.g(l2, l10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(List<FirestoreGoal> list, a0 a0Var, String str, ls.d<? super y> dVar) {
        super(2, dVar);
        this.f22413z = list;
        this.A = a0Var;
        this.B = str;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        y yVar = new y(this.f22413z, this.A, this.B, dVar);
        yVar.f22412y = obj;
        return yVar;
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((y) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.HashSet, T] */
    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        ArrayList<String> arrayList2;
        ArrayList arrayList3;
        String goalId;
        String str;
        hs.k kVar;
        LogModel logModel;
        String goalId2;
        String dataTypeKey;
        String goalName;
        String str2;
        LogModel logModel2;
        String dataTypeKey2;
        String str3;
        String str4;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f22411x;
        a0 a0Var = this.A;
        if (i6 != 0) {
            if (i6 == 1) {
                arrayList2 = this.f22410w;
                arrayList3 = this.f22409v;
                arrayList = this.f22408u;
                kotlinx.coroutines.d0 d0Var = (kotlinx.coroutines.d0) this.f22412y;
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.d0 d0Var2 = (kotlinx.coroutines.d0) this.f22412y;
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            for (Object obj2 : this.f22413z) {
                FirestoreGoal firestoreGoal = (FirestoreGoal) obj2;
                if (firestoreGoal != null) {
                    str = firestoreGoal.getSource();
                } else {
                    str = null;
                }
                if (gv.n.A0(str, "library", false)) {
                    arrayList5.add(obj2);
                }
            }
            ArrayList arrayList6 = new ArrayList(arrayList5);
            ArrayList<String> resultLogSlugs = Constants.getResultLogSlugs();
            if (arrayList6.size() > 1) {
                is.p.P1(arrayList6, new b());
            }
            kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
            xVar.f23469u = new HashSet();
            Iterator it = arrayList6.iterator();
            while (it.hasNext()) {
                FirestoreGoal firestoreGoal2 = (FirestoreGoal) it.next();
                if (firestoreGoal2 != null && (goalId = firestoreGoal2.getGoalId()) != null) {
                    ((HashSet) xVar.f23469u).add(goalId);
                }
            }
            kotlinx.coroutines.scheduling.b bVar = a0Var.f22081z;
            a aVar2 = new a(a0Var, this.B, xVar, null);
            this.f22412y = d0Var2;
            this.f22408u = arrayList4;
            this.f22409v = arrayList6;
            this.f22410w = resultLogSlugs;
            this.f22411x = 1;
            obj = ta.v.S(bVar, aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
            arrayList = arrayList4;
            arrayList2 = resultLogSlugs;
            arrayList3 = arrayList6;
        }
        HashMap hashMap = (HashMap) obj;
        if (hashMap != null) {
            ArrayList arrayList7 = new ArrayList();
            for (Object obj3 : arrayList3) {
                FirestoreGoal firestoreGoal3 = (FirestoreGoal) obj3;
                if (firestoreGoal3 != null) {
                    str4 = firestoreGoal3.getDataTypeKey();
                } else {
                    str4 = null;
                }
                if (arrayList2.contains(str4)) {
                    arrayList7.add(obj3);
                }
            }
            Iterator it2 = arrayList7.iterator();
            while (it2.hasNext()) {
                FirestoreGoal firestoreGoal4 = (FirestoreGoal) it2.next();
                if (firestoreGoal4 != null) {
                    String goalId3 = firestoreGoal4.getGoalId();
                    if (goalId3 != null && (dataTypeKey2 = firestoreGoal4.getDataTypeKey()) != null) {
                        String goalName2 = firestoreGoal4.getGoalName();
                        String str5 = (String) hashMap.get(firestoreGoal4.getGoalId());
                        if (str5 == null) {
                            String goalName3 = firestoreGoal4.getGoalName();
                            if (goalName3 == null) {
                                goalName3 = "";
                            }
                            str3 = goalName3;
                        } else {
                            str3 = str5;
                        }
                        logModel2 = new LogModel(goalName2, goalId3, dataTypeKey2, str3, true);
                    } else {
                        logModel2 = null;
                    }
                    arrayList.add(logModel2);
                }
            }
            a0Var.A.i(arrayList);
            kVar = hs.k.f19476a;
        } else {
            kVar = null;
        }
        if (kVar == null) {
            ArrayList arrayList8 = new ArrayList();
            for (Object obj4 : arrayList3) {
                FirestoreGoal firestoreGoal5 = (FirestoreGoal) obj4;
                if (firestoreGoal5 != null) {
                    str2 = firestoreGoal5.getDataTypeKey();
                } else {
                    str2 = null;
                }
                if (arrayList2.contains(str2)) {
                    arrayList8.add(obj4);
                }
            }
            Iterator it3 = arrayList8.iterator();
            while (it3.hasNext()) {
                FirestoreGoal firestoreGoal6 = (FirestoreGoal) it3.next();
                if (firestoreGoal6 != null && (goalId2 = firestoreGoal6.getGoalId()) != null && (dataTypeKey = firestoreGoal6.getDataTypeKey()) != null && (goalName = firestoreGoal6.getGoalName()) != null) {
                    logModel = new LogModel(firestoreGoal6.getGoalName(), goalId2, dataTypeKey, goalName, true);
                } else {
                    logModel = null;
                }
                arrayList.add(logModel);
            }
            a0Var.A.i(arrayList);
        }
        return hs.k.f19476a;
    }
}
