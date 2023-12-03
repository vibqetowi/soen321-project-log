package ap;

import androidx.work.r;
import com.appsflyer.R;
import com.google.firebase.firestore.FirebaseFirestore;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityModel;
import com.theinnerhour.b2b.utils.RecommendedActivityAssetsWorkManager;
import hs.k;
import is.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
import n2.a0;
import ns.i;
import ss.p;
import ya.v;
/* compiled from: RecommendedActivityViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.recommendedActivities.viewmodel.RecommendedActivityViewModel$fetchActivities$1", f = "RecommendedActivityViewModel.kt", l = {29}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class g extends i implements p<d0, ls.d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f3395u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ h f3396v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ boolean f3397w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ boolean f3398x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ String f3399y;

    /* compiled from: RecommendedActivityViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.recommendedActivities.viewmodel.RecommendedActivityViewModel$fetchActivities$1$1", f = "RecommendedActivityViewModel.kt", l = {R.styleable.AppCompatTheme_actionModeTheme}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements p<d0, ls.d<? super k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f3400u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f3401v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ h f3402w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f3403x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ boolean f3404y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f3405z;

        /* compiled from: Comparisons.kt */
        /* renamed from: ap.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0048a<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t3, T t10) {
                return sp.b.g(((RecommendedActivityModel) t3).getCourseRank(), ((RecommendedActivityModel) t10).getCourseRank());
            }
        }

        /* compiled from: Comparisons.kt */
        /* loaded from: classes2.dex */
        public static final class b<T> implements Comparator {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ h f3406u;

            public b(h hVar) {
                this.f3406u = hVar;
            }

            @Override // java.util.Comparator
            public final int compare(T t3, T t10) {
                h hVar = this.f3406u;
                return sp.b.g(Integer.valueOf(is.k.W1(((RecommendedActivityModel) t3).getDomain(), hVar.A)), Integer.valueOf(is.k.W1(((RecommendedActivityModel) t10).getDomain(), hVar.A)));
            }
        }

        /* compiled from: Comparisons.kt */
        /* loaded from: classes2.dex */
        public static final class c<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t3, T t10) {
                return sp.b.g(((RecommendedActivityModel) t3).getCourseRank(), ((RecommendedActivityModel) t10).getCourseRank());
            }
        }

        /* compiled from: Comparisons.kt */
        /* loaded from: classes2.dex */
        public static final class d<T> implements Comparator {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ h f3407u;

            public d(h hVar) {
                this.f3407u = hVar;
            }

            @Override // java.util.Comparator
            public final int compare(T t3, T t10) {
                h hVar = this.f3407u;
                return sp.b.g(Integer.valueOf(is.k.W1(((RecommendedActivityModel) t3).getDomain(), hVar.A)), Integer.valueOf(is.k.W1(((RecommendedActivityModel) t10).getDomain(), hVar.A)));
            }
        }

        /* compiled from: Comparisons.kt */
        /* loaded from: classes2.dex */
        public static final class e<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t3, T t10) {
                return sp.b.g(((RecommendedActivityModel) t3).getCourseRank(), ((RecommendedActivityModel) t10).getCourseRank());
            }
        }

        /* compiled from: Comparisons.kt */
        /* loaded from: classes2.dex */
        public static final class f<T> implements Comparator {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ h f3408u;

            public f(h hVar) {
                this.f3408u = hVar;
            }

            @Override // java.util.Comparator
            public final int compare(T t3, T t10) {
                h hVar = this.f3408u;
                return sp.b.g(Integer.valueOf(is.k.W1(((RecommendedActivityModel) t3).getDomain(), hVar.A)), Integer.valueOf(is.k.W1(((RecommendedActivityModel) t10).getDomain(), hVar.A)));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h hVar, boolean z10, boolean z11, String str, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f3402w = hVar;
            this.f3403x = z10;
            this.f3404y = z11;
            this.f3405z = str;
        }

        @Override // ns.a
        public final ls.d<k> create(Object obj, ls.d<?> dVar) {
            a aVar = new a(this.f3402w, this.f3403x, this.f3404y, this.f3405z, dVar);
            aVar.f3401v = obj;
            return aVar;
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            String[] strArr;
            k kVar;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f3400u;
            boolean z10 = this.f3403x;
            h hVar = this.f3402w;
            if (i6 != 0) {
                if (i6 == 1) {
                    d0 d0Var = (d0) this.f3401v;
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                d0 d0Var2 = (d0) this.f3401v;
                ap.f fVar = hVar.f3409y;
                if (z10) {
                    strArr = hVar.f2382x.fileList();
                } else {
                    strArr = null;
                }
                this.f3401v = d0Var2;
                this.f3400u = 1;
                fVar.getClass();
                kotlinx.coroutines.k kVar2 = new kotlinx.coroutines.k(1, ca.a.G0(this));
                kVar2.u();
                v a10 = FirebaseFirestore.d().b("recommended_activity_data").a();
                a10.addOnCompleteListener(new ap.d(kVar2, fVar, strArr));
                a10.addOnFailureListener(new ap.e(fVar, kVar2));
                obj = kVar2.s();
                if (obj == aVar) {
                    return aVar;
                }
            }
            hs.f fVar2 = (hs.f) obj;
            if (fVar2 != null) {
                A a11 = fVar2.f19464u;
                boolean z11 = this.f3404y;
                String str = this.f3405z;
                if (z11) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : (Iterable) a11) {
                        if (kotlin.jvm.internal.i.b(((RecommendedActivityModel) obj2).getDomain(), str)) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList<RecommendedActivityModel> arrayList2 = new ArrayList<>(arrayList);
                    if (arrayList2.size() > 1) {
                        is.p.P1(arrayList2, new C0048a());
                    }
                    if (arrayList2.size() > 1) {
                        is.p.P1(arrayList2, new b(hVar));
                    }
                    hVar.f3410z.i(arrayList2);
                } else {
                    Iterable iterable = (Iterable) a11;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : iterable) {
                        if (kotlin.jvm.internal.i.b(((RecommendedActivityModel) obj3).getDomain(), str)) {
                            arrayList3.add(obj3);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(arrayList3);
                    if (arrayList4.size() > 1) {
                        is.p.P1(arrayList4, new c());
                    }
                    if (arrayList4.size() > 1) {
                        is.p.P1(arrayList4, new d(hVar));
                    }
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj4 : iterable) {
                        if (!kotlin.jvm.internal.i.b(((RecommendedActivityModel) obj4).getDomain(), str)) {
                            arrayList5.add(obj4);
                        }
                    }
                    ArrayList arrayList6 = new ArrayList(arrayList5);
                    if (arrayList6.size() > 1) {
                        is.p.P1(arrayList6, new e());
                    }
                    if (arrayList6.size() > 1) {
                        is.p.P1(arrayList6, new f(hVar));
                    }
                    hVar.f3410z.i(new ArrayList<>(u.u2(arrayList6, arrayList4)));
                }
                if (z10) {
                    B b10 = fVar2.f19465v;
                    if (!((Collection) b10).isEmpty()) {
                        ArrayList arrayList7 = (ArrayList) b10;
                        hVar.getClass();
                        if (!arrayList7.isEmpty()) {
                            r.a aVar2 = new r.a(RecommendedActivityAssetsWorkManager.class);
                            HashMap hashMap = new HashMap();
                            hashMap.put("assets_array", (String[]) arrayList7.toArray(new String[0]));
                            androidx.work.d dVar = new androidx.work.d(hashMap);
                            androidx.work.d.b(dVar);
                            aVar2.f3355b.f34738e = dVar;
                            a0 f2 = a0.f();
                            if (f2 != null) {
                                f2.a("RecommendedActivityViewModel", Collections.singletonList(aVar2.a()));
                            } else {
                                throw new IllegalStateException("WorkManager is not initialized properly.  The most likely cause is that you disabled WorkManagerInitializer in your manifest but forgot to call WorkManager#initialize in your Application#onCreate or a ContentProvider.");
                            }
                        }
                    }
                }
                kVar = k.f19476a;
            } else {
                kVar = null;
            }
            if (kVar == null) {
                hVar.f3410z.i(null);
            }
            return k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, boolean z10, boolean z11, String str, ls.d<? super g> dVar) {
        super(2, dVar);
        this.f3396v = hVar;
        this.f3397w = z10;
        this.f3398x = z11;
        this.f3399y = str;
    }

    @Override // ns.a
    public final ls.d<k> create(Object obj, ls.d<?> dVar) {
        return new g(this.f3396v, this.f3397w, this.f3398x, this.f3399y, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
        return ((g) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f3395u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.scheduling.b bVar = o0.f23642c;
            a aVar2 = new a(this.f3396v, this.f3397w, this.f3398x, this.f3399y, null);
            this.f3395u = 1;
            if (ta.v.S(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return k.f19476a;
    }
}
