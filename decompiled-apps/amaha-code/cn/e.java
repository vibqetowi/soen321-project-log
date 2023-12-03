package cn;

import com.theinnerhour.b2b.components.libraryExperiment.model.UserLibraryItemAccessModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: AllTopPicksViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.AllTopPicksViewModel$fetchCompletionStatusForActivities$1", f = "AllTopPicksViewModel.kt", l = {127}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class e extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f5453u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ i f5454v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ List<String> f5455w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f5456x;

    /* compiled from: AllTopPicksViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.AllTopPicksViewModel$fetchCompletionStatusForActivities$1$1", f = "AllTopPicksViewModel.kt", l = {131}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f5457u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f5458v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ i f5459w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ List<String> f5460x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f5461y;

        /* compiled from: AllTopPicksViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.AllTopPicksViewModel$fetchCompletionStatusForActivities$1$1$1$1", f = "AllTopPicksViewModel.kt", l = {130}, m = "invokeSuspend")
        /* renamed from: cn.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0114a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.f<? extends String, ? extends UserLibraryItemAccessModel>>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f5462u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ i f5463v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ String f5464w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ String f5465x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0114a(i iVar, String str, String str2, ls.d<? super C0114a> dVar) {
                super(2, dVar);
                this.f5463v = iVar;
                this.f5464w = str;
                this.f5465x = str2;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new C0114a(this.f5463v, this.f5464w, this.f5465x, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.f<? extends String, ? extends UserLibraryItemAccessModel>> dVar) {
                return ((C0114a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f5462u;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    e1 e1Var = this.f5463v.f5566x;
                    this.f5462u = 1;
                    obj = e1Var.d(this.f5464w, this.f5465x, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i iVar, List<String> list, String str, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f5459w = iVar;
            this.f5460x = list;
            this.f5461y = str;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            a aVar = new a(this.f5459w, this.f5460x, this.f5461y, dVar);
            aVar.f5458v = obj;
            return aVar;
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            androidx.lifecycle.w<HashMap<String, hs.f<Boolean, Boolean>>> wVar;
            boolean z10;
            Long startDate;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f5457u;
            if (i6 != 0) {
                if (i6 == 1) {
                    wVar = (androidx.lifecycle.w) this.f5458v;
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                kotlinx.coroutines.d0 d0Var = (kotlinx.coroutines.d0) this.f5458v;
                i iVar = this.f5459w;
                androidx.lifecycle.w<HashMap<String, hs.f<Boolean, Boolean>>> wVar2 = iVar.C;
                List<String> list = this.f5460x;
                ArrayList arrayList = new ArrayList(is.i.H1(list, 10));
                for (String str : list) {
                    arrayList.add(ta.v.g(d0Var, null, new C0114a(iVar, this.f5461y, str, null), 3));
                }
                this.f5458v = wVar2;
                this.f5457u = 1;
                obj = ca.a.n(arrayList, this);
                if (obj == aVar) {
                    return aVar;
                }
                wVar = wVar2;
            }
            ArrayList arrayList2 = new ArrayList();
            for (hs.f fVar : (Iterable) obj) {
                if (fVar != null) {
                    arrayList2.add(fVar);
                }
            }
            int P = sp.b.P(is.i.H1(arrayList2, 10));
            if (P < 16) {
                P = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(P);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                hs.f fVar2 = (hs.f) it.next();
                String str2 = (String) fVar2.f19464u;
                B b10 = fVar2.f19465v;
                UserLibraryItemAccessModel userLibraryItemAccessModel = (UserLibraryItemAccessModel) b10;
                boolean z11 = false;
                if (userLibraryItemAccessModel != null && (startDate = userLibraryItemAccessModel.getStartDate()) != null && startDate.longValue() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Boolean valueOf = Boolean.valueOf(!z10);
                UserLibraryItemAccessModel userLibraryItemAccessModel2 = (UserLibraryItemAccessModel) b10;
                if (userLibraryItemAccessModel2 != null && userLibraryItemAccessModel2.isCompleted()) {
                    z11 = true;
                }
                linkedHashMap.put(str2, new hs.f(valueOf, Boolean.valueOf(z11)));
            }
            wVar.i(new HashMap<>(linkedHashMap));
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, List<String> list, String str, ls.d<? super e> dVar) {
        super(2, dVar);
        this.f5454v = iVar;
        this.f5455w = list;
        this.f5456x = str;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new e(this.f5454v, this.f5455w, this.f5456x, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((e) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f5453u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.scheduling.b bVar = kotlinx.coroutines.o0.f23642c;
            a aVar2 = new a(this.f5454v, this.f5455w, this.f5456x, null);
            this.f5453u = 1;
            if (ta.v.S(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
