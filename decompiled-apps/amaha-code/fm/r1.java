package fm;

import androidx.work.r;
import com.appsflyer.R;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityModel;
import com.theinnerhour.b2b.utils.RecommendedActivityAssetsWorkManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
/* compiled from: V3GoalViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.V3GoalViewModel$fetchActivities$1", f = "V3GoalViewModel.kt", l = {R.styleable.AppCompatTheme_listMenuViewStyle}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class r1 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f15530u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ t1 f15531v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ boolean f15532w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f15533x;

    /* compiled from: V3GoalViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.V3GoalViewModel$fetchActivities$1$1", f = "V3GoalViewModel.kt", l = {R.styleable.AppCompatTheme_listPreferredItemHeight}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f15534u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f15535v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ t1 f15536w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f15537x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f15538y;

        /* compiled from: Comparisons.kt */
        /* renamed from: fm.r1$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0240a<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t3, T t10) {
                return sp.b.g(((RecommendedActivityModel) t3).getCourseRank(), ((RecommendedActivityModel) t10).getCourseRank());
            }
        }

        /* compiled from: Comparisons.kt */
        /* loaded from: classes2.dex */
        public static final class b<T> implements Comparator {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ t1 f15539u;

            public b(t1 t1Var) {
                this.f15539u = t1Var;
            }

            @Override // java.util.Comparator
            public final int compare(T t3, T t10) {
                t1 t1Var = this.f15539u;
                return sp.b.g(Integer.valueOf(is.k.W1(((RecommendedActivityModel) t3).getDomain(), t1Var.D)), Integer.valueOf(is.k.W1(((RecommendedActivityModel) t10).getDomain(), t1Var.D)));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t1 t1Var, boolean z10, String str, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f15536w = t1Var;
            this.f15537x = z10;
            this.f15538y = str;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            a aVar = new a(this.f15536w, this.f15537x, this.f15538y, dVar);
            aVar.f15535v = obj;
            return aVar;
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            String[] strArr;
            boolean z10;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f15534u;
            hs.k kVar = null;
            boolean z11 = this.f15537x;
            t1 t1Var = this.f15536w;
            if (i6 != 0) {
                if (i6 == 1) {
                    kotlinx.coroutines.d0 d0Var = (kotlinx.coroutines.d0) this.f15535v;
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                kotlinx.coroutines.d0 d0Var2 = (kotlinx.coroutines.d0) this.f15535v;
                t1Var.C.i(Boolean.TRUE);
                if (z11) {
                    strArr = t1Var.f2382x.fileList();
                } else {
                    strArr = null;
                }
                this.f15535v = d0Var2;
                this.f15534u = 1;
                obj = t1Var.f15560y.b(strArr, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            hs.f fVar = (hs.f) obj;
            if (fVar != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (Iterable) fVar.f19464u) {
                    if (kotlin.jvm.internal.i.b(((RecommendedActivityModel) obj2).getDomain(), this.f15538y)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList<RecommendedActivityModel> arrayList2 = new ArrayList<>(arrayList);
                if (arrayList2.size() > 1) {
                    is.p.P1(arrayList2, new C0240a());
                }
                if (arrayList2.size() > 1) {
                    is.p.P1(arrayList2, new b(t1Var));
                }
                t1Var.B.i(arrayList2);
                if (z11) {
                    B b10 = fVar.f19465v;
                    Collection collection = (Collection) b10;
                    if (collection != null && !collection.isEmpty()) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (!z10) {
                        ArrayList arrayList3 = (ArrayList) b10;
                        if (!arrayList3.isEmpty()) {
                            r.a aVar2 = new r.a(RecommendedActivityAssetsWorkManager.class);
                            HashMap hashMap = new HashMap();
                            hashMap.put("assets_array", (String[]) arrayList3.toArray(new String[0]));
                            androidx.work.d dVar = new androidx.work.d(hashMap);
                            androidx.work.d.b(dVar);
                            aVar2.f3355b.f34738e = dVar;
                            n2.a0 f = n2.a0.f();
                            if (f != null) {
                                f.a("RecommendedActivityViewModel", Collections.singletonList(aVar2.a()));
                            } else {
                                throw new IllegalStateException("WorkManager is not initialized properly.  The most likely cause is that you disabled WorkManagerInitializer in your manifest but forgot to call WorkManager#initialize in your Application#onCreate or a ContentProvider.");
                            }
                        }
                    }
                }
                kVar = hs.k.f19476a;
            }
            if (kVar == null) {
                t1Var.B.i(new ArrayList<>());
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(t1 t1Var, boolean z10, String str, ls.d<? super r1> dVar) {
        super(2, dVar);
        this.f15531v = t1Var;
        this.f15532w = z10;
        this.f15533x = str;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new r1(this.f15531v, this.f15532w, this.f15533x, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((r1) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f15530u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.scheduling.b bVar = kotlinx.coroutines.o0.f23642c;
            a aVar2 = new a(this.f15531v, this.f15532w, this.f15533x, null);
            this.f15530u = 1;
            if (ta.v.S(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
