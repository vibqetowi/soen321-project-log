package jl;

import com.google.firebase.firestore.b;
import com.theinnerhour.b2b.components.libraryExperiment.model.LibraryCollection;
import he.k;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: NewDashboardSavedItemsViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NewDashboardSavedItemsViewModel$fetchCollectionsData$2$1", f = "NewDashboardSavedItemsViewModel.kt", l = {147}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f22096u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ArrayList<String> f22097v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ k0 f22098w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ ls.d<Boolean> f22099x;

    /* compiled from: NewDashboardSavedItemsViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NewDashboardSavedItemsViewModel$fetchCollectionsData$2$1$1", f = "NewDashboardSavedItemsViewModel.kt", l = {150}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f22100u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f22101v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ArrayList<String> f22102w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ k0 f22103x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ ls.d<Boolean> f22104y;

        /* compiled from: NewDashboardSavedItemsViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NewDashboardSavedItemsViewModel$fetchCollectionsData$2$1$1$1$1", f = "NewDashboardSavedItemsViewModel.kt", l = {149}, m = "invokeSuspend")
        /* renamed from: jl.c0$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0328a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.f<? extends String, ? extends LibraryCollection>>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f22105u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ k0 f22106v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ String f22107w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0328a(k0 k0Var, String str, ls.d<? super C0328a> dVar) {
                super(2, dVar);
                this.f22106v = k0Var;
                this.f22107w = str;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new C0328a(this.f22106v, this.f22107w, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.f<? extends String, ? extends LibraryCollection>> dVar) {
                return ((C0328a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f22105u;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    cn.e1 e1Var = this.f22106v.f22259x;
                    this.f22105u = 1;
                    e1Var.getClass();
                    ls.h hVar = new ls.h(ca.a.G0(this));
                    ya.v a10 = e1Var.f5467a.b("library_collection").k(new b.a(fe.j.f14995c, k.a.EQUAL, this.f22107w)).a();
                    a10.addOnCompleteListener(new cn.c1(hVar));
                    a10.addOnFailureListener(new cn.d1(hVar));
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
            this.f22102w = arrayList;
            this.f22103x = k0Var;
            this.f22104y = dVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            a aVar = new a(this.f22103x, this.f22102w, this.f22104y, dVar);
            aVar.f22101v = obj;
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
            int i6 = this.f22100u;
            k0 k0Var = this.f22103x;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                kotlinx.coroutines.d0 d0Var = (kotlinx.coroutines.d0) this.f22101v;
                ArrayList<String> arrayList = this.f22102w;
                ArrayList arrayList2 = new ArrayList(is.i.H1(arrayList, 10));
                for (String str : arrayList) {
                    arrayList2.add(ta.v.g(d0Var, null, new C0328a(k0Var, str, null), 3));
                }
                this.f22100u = 1;
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
                k0Var.C.put(fVar2.f19464u, fVar2.f19465v);
            }
            this.f22104y.resumeWith(Boolean.TRUE);
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(k0 k0Var, ArrayList arrayList, ls.d dVar, ls.d dVar2) {
        super(2, dVar2);
        this.f22097v = arrayList;
        this.f22098w = k0Var;
        this.f22099x = dVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new c0(this.f22098w, this.f22097v, this.f22099x, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((c0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f22096u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.scheduling.b bVar = kotlinx.coroutines.o0.f23642c;
            a aVar2 = new a(this.f22098w, this.f22097v, this.f22099x, null);
            this.f22096u = 1;
            if (ta.v.S(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
