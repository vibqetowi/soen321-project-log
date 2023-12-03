package cn;

import android.app.Application;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.theinnerhour.b2b.components.libraryExperiment.model.LibraryCollection;
import com.theinnerhour.b2b.components.libraryExperiment.model.LibraryCollectionItemAccessModel;
import com.theinnerhour.b2b.components.libraryExperiment.model.MiniCourseMetadata;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityModel;
import com.theinnerhour.b2b.model.LearningHubModel;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import jl.t1;
/* compiled from: LibraryViewModel.kt */
/* loaded from: classes2.dex */
public final class k0 extends androidx.lifecycle.b {
    public final androidx.lifecycle.w<LibraryCollection> A;
    public final androidx.lifecycle.w<SingleUseEvent<RecommendedActivityModel>> B;
    public final androidx.lifecycle.w<SingleUseEvent<LearningHubModel>> C;
    public final androidx.lifecycle.w<SingleUseEvent<hs.f<MiniCourseMetadata, MiniCourse>>> D;
    public final androidx.lifecycle.w<List<LibraryCollection>> E;
    public final androidx.lifecycle.w<Boolean> F;
    public final androidx.lifecycle.w<List<LearningHubModel>> G;
    public final androidx.lifecycle.w<Boolean> H;
    public final androidx.lifecycle.w<List<MiniCourseMetadata>> I;
    public final androidx.lifecycle.w<List<MiniCourse>> J;
    public final androidx.lifecycle.w<HashSet<String>> K;
    public final hs.i L;
    public List<MiniCourseMetadata> M;
    public final androidx.lifecycle.w<List<MiniCourseMetadata>> N;
    public final androidx.lifecycle.w<List<MiniCourse>> O;
    public final hs.i P;
    public LibraryCollection Q;
    public final hs.i R;
    public final hs.i S;
    public final hs.i T;
    public final androidx.lifecycle.w<HashMap<String, LibraryCollectionItemAccessModel>> U;
    public HashMap<String, hs.f<Boolean, Boolean>> V;
    public final androidx.lifecycle.w<Boolean> W;
    public final String X;

    /* renamed from: y  reason: collision with root package name */
    public final String f5596y;

    /* renamed from: z  reason: collision with root package name */
    public final e1 f5597z;

    /* compiled from: LibraryViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.LibraryViewModel$addOrUpdateAccessDate$1", f = "LibraryViewModel.kt", l = {230}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {
        public final /* synthetic */ boolean A;
        public final /* synthetic */ String B;
        public final /* synthetic */ String C;
        public final /* synthetic */ boolean D;

        /* renamed from: u  reason: collision with root package name */
        public int f5598u;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f5600w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f5601x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f5602y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ long f5603z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3, long j10, boolean z10, String str4, String str5, boolean z11, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f5600w = str;
            this.f5601x = str2;
            this.f5602y = str3;
            this.f5603z = j10;
            this.A = z10;
            this.B = str4;
            this.C = str5;
            this.D = z11;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f5600w, this.f5601x, this.f5602y, this.f5603z, this.A, this.B, this.C, this.D, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f5598u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                e1 e1Var = k0.this.f5597z;
                String str = this.f5600w;
                String str2 = this.f5601x;
                String str3 = this.f5602y;
                long j10 = this.f5603z;
                boolean z10 = this.A;
                String str4 = this.B;
                String str5 = this.C;
                boolean z11 = this.D;
                this.f5598u = 1;
                if (e1Var.k(str, str2, str3, j10, z10, str4, str5, z11, this) == aVar) {
                    return aVar;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: LibraryViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<t1> {

        /* renamed from: u  reason: collision with root package name */
        public static final b f5604u = new b();

        public b() {
            super(0);
        }

        @Override // ss.a
        public final t1 invoke() {
            return new t1();
        }
    }

    /* compiled from: LibraryViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.LibraryViewModel$fetchIndividualResourceItem$1", f = "LibraryViewModel.kt", l = {138}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f5605u;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f5607w;

        /* compiled from: LibraryViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.LibraryViewModel$fetchIndividualResourceItem$1$1", f = "LibraryViewModel.kt", l = {140}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f5608u;

            /* renamed from: v  reason: collision with root package name */
            public /* synthetic */ Object f5609v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ k0 f5610w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ String f5611x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k0 k0Var, String str, ls.d<? super a> dVar) {
                super(2, dVar);
                this.f5610w = k0Var;
                this.f5611x = str;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                a aVar = new a(this.f5610w, this.f5611x, dVar);
                aVar.f5609v = obj;
                return aVar;
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
                return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                hs.k kVar;
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f5608u;
                k0 k0Var = this.f5610w;
                if (i6 != 0) {
                    if (i6 == 1) {
                        kotlinx.coroutines.d0 d0Var = (kotlinx.coroutines.d0) this.f5609v;
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    k0Var.p().i(Boolean.TRUE);
                    e1 e1Var = k0Var.f5597z;
                    this.f5609v = (kotlinx.coroutines.d0) this.f5609v;
                    this.f5608u = 1;
                    obj = e1Var.f(this.f5611x, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                LearningHubModel learningHubModel = (LearningHubModel) obj;
                if (learningHubModel != null) {
                    k0Var.C.i(new SingleUseEvent<>(learningHubModel));
                    k0Var.p().i(Boolean.FALSE);
                    kVar = hs.k.f19476a;
                } else {
                    kVar = null;
                }
                if (kVar == null) {
                    k0Var.C.i(new SingleUseEvent<>(null));
                    k0Var.p().i(Boolean.FALSE);
                }
                return hs.k.f19476a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, ls.d<? super c> dVar) {
            super(2, dVar);
            this.f5607w = str;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new c(this.f5607w, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((c) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f5605u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                kotlinx.coroutines.scheduling.b bVar = kotlinx.coroutines.o0.f23642c;
                a aVar2 = new a(k0.this, this.f5607w, null);
                this.f5605u = 1;
                if (ta.v.S(bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: LibraryViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.LibraryViewModel$fetchLearningHubResourcesForLibraryDb$1", f = "LibraryViewModel.kt", l = {301}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f5612u;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f5614w;

        /* compiled from: LibraryViewModel.kt */
        /* loaded from: classes2.dex */
        public static final class a<T> implements kotlinx.coroutines.flow.e {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ k0 f5615u;

            public a(k0 k0Var) {
                this.f5615u = k0Var;
            }

            @Override // kotlinx.coroutines.flow.e
            public final Object b(Object obj, ls.d dVar) {
                k0 k0Var = this.f5615u;
                k0Var.G.l((List) obj);
                k0Var.F.l(Boolean.FALSE);
                return hs.k.f19476a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, ls.d<? super d> dVar) {
            super(2, dVar);
            this.f5614w = str;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new d(this.f5614w, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((d) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f5612u;
            k0 k0Var = k0.this;
            try {
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    j1 h10 = k0Var.f5597z.h(this.f5614w);
                    a aVar2 = new a(k0Var);
                    this.f5612u = 1;
                    if (h10.a(aVar2, this) == aVar) {
                        return aVar;
                    }
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(k0Var.f5596y, e10);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: LibraryViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<HashMap<String, Integer>> {

        /* renamed from: u  reason: collision with root package name */
        public static final e f5616u = new e();

        public e() {
            super(0);
        }

        @Override // ss.a
        public final HashMap<String, Integer> invoke() {
            return new HashMap<>();
        }
    }

    /* compiled from: LibraryViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class f extends kotlin.jvm.internal.k implements ss.a<androidx.lifecycle.w<SingleUseEvent<? extends String>>> {

        /* renamed from: u  reason: collision with root package name */
        public static final f f5617u = new f();

        public f() {
            super(0);
        }

        @Override // ss.a
        public final androidx.lifecycle.w<SingleUseEvent<? extends String>> invoke() {
            return new androidx.lifecycle.w<>();
        }
    }

    /* compiled from: LibraryViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class g extends kotlin.jvm.internal.k implements ss.a<androidx.lifecycle.w<Boolean>> {

        /* renamed from: u  reason: collision with root package name */
        public static final g f5618u = new g();

        public g() {
            super(0);
        }

        @Override // ss.a
        public final androidx.lifecycle.w<Boolean> invoke() {
            return new androidx.lifecycle.w<>();
        }
    }

    /* compiled from: LibraryViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class h extends kotlin.jvm.internal.k implements ss.a<androidx.lifecycle.w<SingleUseEvent<? extends String>>> {

        /* renamed from: u  reason: collision with root package name */
        public static final h f5619u = new h();

        public h() {
            super(0);
        }

        @Override // ss.a
        public final androidx.lifecycle.w<SingleUseEvent<? extends String>> invoke() {
            return new androidx.lifecycle.w<>();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(Application application) {
        super(application);
        kotlin.jvm.internal.i.g(application, "application");
        this.f5596y = "LibraryViewModel";
        this.f5597z = new e1();
        this.A = new androidx.lifecycle.w<>();
        this.B = new androidx.lifecycle.w<>();
        this.C = new androidx.lifecycle.w<>();
        this.D = new androidx.lifecycle.w<>();
        this.E = new androidx.lifecycle.w<>();
        this.F = new androidx.lifecycle.w<>();
        this.G = new androidx.lifecycle.w<>();
        this.H = new androidx.lifecycle.w<>();
        this.I = new androidx.lifecycle.w<>();
        this.J = new androidx.lifecycle.w<>();
        this.K = new androidx.lifecycle.w<>();
        this.L = sp.b.O(e.f5616u);
        this.N = new androidx.lifecycle.w<>();
        this.O = new androidx.lifecycle.w<>();
        this.P = sp.b.O(g.f5618u);
        this.R = sp.b.O(f.f5617u);
        this.S = sp.b.O(b.f5604u);
        this.T = sp.b.O(h.f5619u);
        ca.a.k(Constants.TOPICAL_2022_HEALTH_ANXIETY, Constants.TOPICAL_2022_TIME_MANAGEMENT, Constants.TOPICAL_2022_MOTIVATION, Constants.TOPICAL_2022_NURTURING_RELATIONSHIP, Constants.TOPICAL_2022_CONFLICT_RESOLUTION_AND_EMPATHY, Constants.TOPICAL_2022_COVID);
        this.U = new androidx.lifecycle.w<>();
        this.V = new HashMap<>();
        this.W = new androidx.lifecycle.w<>();
        String d10 = ri.e.d(Constants.LIBRARY_EXPERIMENT_V3);
        d10 = kotlin.jvm.internal.i.b(d10, "default") ? null : d10;
        this.X = (String) (d10 == null ? "variant_a" : d10);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027 A[Catch: Exception -> 0x0068, TryCatch #0 {Exception -> 0x0068, blocks: (B:3:0x0008, B:5:0x0017, B:10:0x0021, B:12:0x0027, B:13:0x002f, B:14:0x0033, B:16:0x0039, B:18:0x0041, B:20:0x0047, B:21:0x004b, B:23:0x0051, B:25:0x005d), top: B:30:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039 A[Catch: Exception -> 0x0068, TryCatch #0 {Exception -> 0x0068, blocks: (B:3:0x0008, B:5:0x0017, B:10:0x0021, B:12:0x0027, B:13:0x002f, B:14:0x0033, B:16:0x0039, B:18:0x0041, B:20:0x0047, B:21:0x004b, B:23:0x0051, B:25:0x005d), top: B:30:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d A[Catch: Exception -> 0x0068, TRY_LEAVE, TryCatch #0 {Exception -> 0x0068, blocks: (B:3:0x0008, B:5:0x0017, B:10:0x0021, B:12:0x0027, B:13:0x002f, B:14:0x0033, B:16:0x0039, B:18:0x0041, B:20:0x0047, B:21:0x004b, B:23:0x0051, B:25:0x005d), top: B:30:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final LinkedHashSet e(k0 k0Var, ArrayList arrayList) {
        ArrayList<MiniCourse> topicalCourseList;
        boolean z10;
        Iterator it;
        ArrayList<String> chips;
        k0Var.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            topicalCourseList = FirebasePersistence.getInstance().getUser().getTopicalCourseList();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(k0Var.f5596y, e10);
        }
        if (topicalCourseList != null && !topicalCourseList.isEmpty()) {
            z10 = false;
            if (arrayList.size() > 1) {
                is.p.P1(arrayList, new m0(k0Var));
            }
            it = arrayList.iterator();
            while (it.hasNext()) {
                MiniCourseMetadata miniCourseMetadata = (MiniCourseMetadata) it.next();
                if (miniCourseMetadata != null && (chips = miniCourseMetadata.getChips()) != null) {
                    Iterator<String> it2 = chips.iterator();
                    while (it2.hasNext()) {
                        linkedHashSet.add(it2.next());
                    }
                }
            }
            if (z10) {
                n0 predicate = n0.f5657u;
                kotlin.jvm.internal.i.g(predicate, "predicate");
                is.q.T1(linkedHashSet, predicate);
            }
            return linkedHashSet;
        }
        z10 = true;
        if (arrayList.size() > 1) {
        }
        it = arrayList.iterator();
        while (it.hasNext()) {
        }
        if (z10) {
        }
        return linkedHashSet;
    }

    public static final ArrayList f(k0 k0Var) {
        boolean z10;
        k0Var.getClass();
        try {
            ArrayList<MiniCourse> mcList = FirebasePersistence.getInstance().getUser().getMiniCourses();
            kotlin.jvm.internal.i.f(mcList, "mcList");
            ArrayList arrayList = new ArrayList();
            for (Object obj : mcList) {
                if (((MiniCourse) obj).getPlan().size() != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    arrayList.add(obj);
                }
            }
            is.p.P1(arrayList, new dm.a(new t0(k0Var), 7));
            return arrayList;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(k0Var.f5596y, e10);
            return new ArrayList();
        }
    }

    public static final int g(k0 k0Var, String str) {
        k0Var.getClass();
        switch (str.hashCode()) {
            case -2114782937:
                if (str.equals(Constants.COURSE_HAPPINESS)) {
                    return 5;
                }
                break;
            case -1617042330:
                if (str.equals(Constants.COURSE_DEPRESSION)) {
                    return 1;
                }
                break;
            case -891989580:
                if (str.equals(Constants.COURSE_STRESS)) {
                    return 3;
                }
                break;
            case 92960775:
                if (str.equals(Constants.COURSE_ANGER)) {
                    return 6;
                }
                break;
            case 109522647:
                if (str.equals(Constants.COURSE_SLEEP)) {
                    return 4;
                }
                break;
            case 113319009:
                if (str.equals(Constants.COURSE_WORRY)) {
                    return 2;
                }
                break;
        }
        return 7;
    }

    public final void h(String str, String itemType, String str2, long j10, boolean z10, String parentId, String str3, boolean z11) {
        kotlin.jvm.internal.i.g(itemType, "itemType");
        kotlin.jvm.internal.i.g(parentId, "parentId");
        if (str == null) {
            return;
        }
        try {
            ta.v.H(kc.f.H(this), null, 0, new a(str, itemType, str2, j10, z10, parentId, str3, z11, null), 3);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f5596y, e10);
        }
    }

    public final void i(String id2, String itemType, String label, String parentId, boolean z10) {
        boolean z11;
        kotlin.jvm.internal.i.g(id2, "id");
        kotlin.jvm.internal.i.g(itemType, "itemType");
        kotlin.jvm.internal.i.g(label, "label");
        kotlin.jvm.internal.i.g(parentId, "parentId");
        try {
            if (id2.length() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                return;
            }
            ta.v.H(kc.f.H(this), null, 0, new l0(this, id2, itemType, label, true, parentId, "top_picks", z10, null), 3);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f5596y, e10);
        }
    }

    public final void j() {
        String j02;
        e1 e1Var = this.f5597z;
        e1Var.getClass();
        try {
            fd.f fVar = FirebaseAuth.getInstance().f;
            if (fVar != null && (j02 = fVar.j0()) != null) {
                DatabaseReference reference = FirebaseDatabase.getInstance().getReference("userLibraryProgress/".concat(j02));
                kotlin.jvm.internal.i.f(reference, "getInstance().getReferen…serLibraryProgress/$uid\")");
                reference.keepSynced(true);
                reference.addListenerForSingleValueEvent(new r1(reference));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e1Var.f5468b, e10);
        }
    }

    public final void k(ArrayList arrayList, boolean z10, boolean z11) {
        String j02;
        try {
            fd.f fVar = FirebaseAuth.getInstance().f;
            if (fVar != null && (j02 = fVar.j0()) != null) {
                ta.v.H(kc.f.H(this), null, 0, new p0(z10, this, arrayList, j02, z11, null), 3);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f5596y, e10);
        }
    }

    public final void l(String str, ArrayList<MiniCourseMetadata> arrayList, ArrayList<MiniCourse> arrayList2) {
        MiniCourseMetadata miniCourseMetadata;
        String str2;
        String str3;
        try {
            MiniCourseMetadata miniCourseMetadata2 = new MiniCourseMetadata(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
            MiniCourse miniCourse = new MiniCourse();
            Iterator<MiniCourseMetadata> it = arrayList.iterator();
            loop0: while (true) {
                miniCourseMetadata = miniCourseMetadata2;
                do {
                    str2 = null;
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    miniCourseMetadata2 = it.next();
                    if (miniCourseMetadata2 != null) {
                        str2 = miniCourseMetadata2.getSlug();
                    }
                } while (!kotlin.jvm.internal.i.b(str2, str));
                kotlin.jvm.internal.i.d(miniCourseMetadata2);
            }
            Iterator<MiniCourse> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                MiniCourse next = it2.next();
                if (next != null) {
                    str3 = next.getDomain();
                } else {
                    str3 = null;
                }
                if (kotlin.jvm.internal.i.b(str3, str)) {
                    kotlin.jvm.internal.i.d(next);
                    miniCourse = next;
                }
            }
            this.D.i(new SingleUseEvent<>(new hs.f(miniCourseMetadata, miniCourse)));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f5596y, e10);
        }
    }

    public final void m(String str) {
        if (str != null) {
            try {
                ta.v.H(kc.f.H(this), null, 0, new c(str, null), 3);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f5596y, e10);
            }
        }
    }

    public final void n(String str) {
        this.F.l(Boolean.TRUE);
        ta.v.H(kc.f.H(this), null, 0, new d(str, null), 3);
    }

    public final HashMap<String, Integer> o() {
        return (HashMap) this.L.getValue();
    }

    public final androidx.lifecycle.w<Boolean> p() {
        return (androidx.lifecycle.w) this.P.getValue();
    }
}
