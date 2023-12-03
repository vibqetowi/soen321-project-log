package jl;

import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: NewDashboardSavedItemsViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NewDashboardSavedItemsViewModel$fetchSuggestedPlanDescriptions$2$1", f = "NewDashboardSavedItemsViewModel.kt", l = {255}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class i0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f22226u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ k0 f22227v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f22228w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ ArrayList<String> f22229x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ ls.d<Boolean> f22230y;

    /* compiled from: NewDashboardSavedItemsViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NewDashboardSavedItemsViewModel$fetchSuggestedPlanDescriptions$2$1$1", f = "NewDashboardSavedItemsViewModel.kt", l = {256}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f22231u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f22232v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ k0 f22233w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f22234x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ ArrayList<String> f22235y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ ls.d<Boolean> f22236z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(k0 k0Var, String str, ArrayList<String> arrayList, ls.d<? super Boolean> dVar, ls.d<? super a> dVar2) {
            super(2, dVar2);
            this.f22233w = k0Var;
            this.f22234x = str;
            this.f22235y = arrayList;
            this.f22236z = dVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            a aVar = new a(this.f22233w, this.f22234x, this.f22235y, this.f22236z, dVar);
            aVar.f22232v = obj;
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
            int i6 = this.f22231u;
            String planItem = this.f22234x;
            k0 k0Var = this.f22233w;
            if (i6 != 0) {
                if (i6 == 1) {
                    kotlinx.coroutines.d0 d0Var = (kotlinx.coroutines.d0) this.f22232v;
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                cn.e1 e1Var = k0Var.f22259x;
                this.f22232v = (kotlinx.coroutines.d0) this.f22232v;
                this.f22231u = 1;
                obj = e1Var.i(planItem, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            hs.f fVar = (hs.f) obj;
            ls.d<Boolean> dVar = this.f22236z;
            ArrayList<String> arrayList = this.f22235y;
            if (fVar != null) {
                k0Var.G.put(fVar.f19464u, fVar.f19465v);
                if (k0Var.G.size() == arrayList.size()) {
                    dVar.resumeWith(Boolean.TRUE);
                }
                kVar = hs.k.f19476a;
            } else {
                kVar = null;
            }
            if (kVar == null) {
                HashMap<String, String> hashMap = k0Var.G;
                kotlin.jvm.internal.i.f(planItem, "planItem");
                hashMap.put(planItem, "");
                if (k0Var.G.size() == arrayList.size()) {
                    dVar.resumeWith(Boolean.TRUE);
                }
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i0(k0 k0Var, String str, ArrayList<String> arrayList, ls.d<? super Boolean> dVar, ls.d<? super i0> dVar2) {
        super(2, dVar2);
        this.f22227v = k0Var;
        this.f22228w = str;
        this.f22229x = arrayList;
        this.f22230y = dVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new i0(this.f22227v, this.f22228w, this.f22229x, this.f22230y, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((i0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f22226u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.scheduling.b bVar = kotlinx.coroutines.o0.f23642c;
            a aVar2 = new a(this.f22227v, this.f22228w, this.f22229x, this.f22230y, null);
            this.f22226u = 1;
            if (ta.v.S(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
