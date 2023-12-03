package jl;

import com.google.firebase.firestore.b;
import com.theinnerhour.b2b.model.LearningHubModel;
import he.k;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: NewDashboardSavedItemsViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NewDashboardSavedItemsViewModel$fetchResourcesData$2$1", f = "NewDashboardSavedItemsViewModel.kt", l = {165}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class h0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f22207u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ArrayList<String> f22208v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ k0 f22209w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ ls.d<Boolean> f22210x;

    /* compiled from: NewDashboardSavedItemsViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NewDashboardSavedItemsViewModel$fetchResourcesData$2$1$1", f = "NewDashboardSavedItemsViewModel.kt", l = {168}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f22211u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f22212v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ArrayList<String> f22213w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ k0 f22214x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ ls.d<Boolean> f22215y;

        /* compiled from: NewDashboardSavedItemsViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NewDashboardSavedItemsViewModel$fetchResourcesData$2$1$1$1$1", f = "NewDashboardSavedItemsViewModel.kt", l = {167}, m = "invokeSuspend")
        /* renamed from: jl.h0$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0332a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.f<? extends String, ? extends LearningHubModel>>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f22216u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ k0 f22217v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ String f22218w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0332a(k0 k0Var, String str, ls.d<? super C0332a> dVar) {
                super(2, dVar);
                this.f22217v = k0Var;
                this.f22218w = str;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new C0332a(this.f22217v, this.f22218w, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.f<? extends String, ? extends LearningHubModel>> dVar) {
                return ((C0332a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f22216u;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    cn.e1 e1Var = this.f22217v.f22259x;
                    this.f22216u = 1;
                    e1Var.getClass();
                    ls.h hVar = new ls.h(ca.a.G0(this));
                    ya.v a10 = e1Var.f5467a.b("content_posts_new").k(new b.a(fe.j.f14995c, k.a.EQUAL, this.f22218w)).a();
                    a10.addOnCompleteListener(new cn.n1(hVar));
                    a10.addOnFailureListener(new cn.o1(hVar));
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
            this.f22213w = arrayList;
            this.f22214x = k0Var;
            this.f22215y = dVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            a aVar = new a(this.f22214x, this.f22213w, this.f22215y, dVar);
            aVar.f22212v = obj;
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
            int i6 = this.f22211u;
            k0 k0Var = this.f22214x;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                kotlinx.coroutines.d0 d0Var = (kotlinx.coroutines.d0) this.f22212v;
                ArrayList<String> arrayList = this.f22213w;
                ArrayList arrayList2 = new ArrayList(is.i.H1(arrayList, 10));
                for (String str : arrayList) {
                    arrayList2.add(ta.v.g(d0Var, null, new C0332a(k0Var, str, null), 3));
                }
                this.f22211u = 1;
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
                k0Var.B.put(fVar2.f19464u, fVar2.f19465v);
            }
            this.f22215y.resumeWith(Boolean.TRUE);
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(k0 k0Var, ArrayList arrayList, ls.d dVar, ls.d dVar2) {
        super(2, dVar2);
        this.f22208v = arrayList;
        this.f22209w = k0Var;
        this.f22210x = dVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new h0(this.f22209w, this.f22208v, this.f22210x, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((h0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f22207u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.scheduling.b bVar = kotlinx.coroutines.o0.f23642c;
            a aVar2 = new a(this.f22209w, this.f22208v, this.f22210x, null);
            this.f22207u = 1;
            if (ta.v.S(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
