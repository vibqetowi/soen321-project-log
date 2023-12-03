package jl;

import com.theinnerhour.b2b.components.libraryExperiment.model.MiniCourseMetadata;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: NewDashboardSavedItemsViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NewDashboardSavedItemsViewModel$fetchMiniCourseMeta$2$1", f = "NewDashboardSavedItemsViewModel.kt", l = {129}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class g0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f22188u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ArrayList<String> f22189v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ k0 f22190w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ ls.d<Boolean> f22191x;

    /* compiled from: NewDashboardSavedItemsViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NewDashboardSavedItemsViewModel$fetchMiniCourseMeta$2$1$1", f = "NewDashboardSavedItemsViewModel.kt", l = {132}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f22192u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f22193v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ArrayList<String> f22194w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ k0 f22195x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ ls.d<Boolean> f22196y;

        /* compiled from: NewDashboardSavedItemsViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NewDashboardSavedItemsViewModel$fetchMiniCourseMeta$2$1$1$1$1", f = "NewDashboardSavedItemsViewModel.kt", l = {131}, m = "invokeSuspend")
        /* renamed from: jl.g0$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0331a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.f<? extends String, ? extends MiniCourseMetadata>>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f22197u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ k0 f22198v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ String f22199w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0331a(k0 k0Var, String str, ls.d<? super C0331a> dVar) {
                super(2, dVar);
                this.f22198v = k0Var;
                this.f22199w = str;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new C0331a(this.f22198v, this.f22199w, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.f<? extends String, ? extends MiniCourseMetadata>> dVar) {
                return ((C0331a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f22197u;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    cn.e1 e1Var = this.f22198v.f22259x;
                    this.f22197u = 1;
                    e1Var.getClass();
                    ls.h hVar = new ls.h(ca.a.G0(this));
                    ya.v a10 = e1Var.f5467a.b("mini_courses").m(this.f22199w, "slug").a();
                    a10.addOnCompleteListener(new cn.l1(hVar));
                    a10.addOnFailureListener(new cn.m1(hVar));
                    obj = hVar.b();
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k0 k0Var, ArrayList arrayList, ls.d dVar, ls.d dVar2) {
            super(2, dVar2);
            this.f22194w = arrayList;
            this.f22195x = k0Var;
            this.f22196y = dVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            a aVar = new a(this.f22195x, this.f22194w, this.f22196y, dVar);
            aVar.f22193v = obj;
            return aVar;
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f22192u;
            k0 k0Var = this.f22195x;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                kotlinx.coroutines.d0 d0Var = (kotlinx.coroutines.d0) this.f22193v;
                ArrayList<String> arrayList = this.f22194w;
                ArrayList arrayList2 = new ArrayList(is.i.H1(arrayList, 10));
                for (String str : arrayList) {
                    arrayList2.add(ta.v.g(d0Var, null, new C0331a(k0Var, str, null), 3));
                }
                this.f22192u = 1;
                obj = ca.a.n(arrayList2, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (hs.f fVar : (Iterable) obj) {
                if (fVar != null) {
                    arrayList3.add(fVar);
                }
            }
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                hs.f fVar2 = (hs.f) it.next();
                k0Var.E.put(fVar2.f19464u, fVar2.f19465v);
            }
            this.f22196y.resumeWith(Boolean.TRUE);
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(k0 k0Var, ArrayList arrayList, ls.d dVar, ls.d dVar2) {
        super(2, dVar2);
        this.f22189v = arrayList;
        this.f22190w = k0Var;
        this.f22191x = dVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new g0(this.f22190w, this.f22189v, this.f22191x, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((g0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f22188u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.scheduling.b bVar = kotlinx.coroutines.o0.f23642c;
            a aVar2 = new a(this.f22190w, this.f22189v, this.f22191x, null);
            this.f22188u = 1;
            if (ta.v.S(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
