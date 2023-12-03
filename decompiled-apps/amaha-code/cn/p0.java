package cn;

import com.theinnerhour.b2b.components.libraryExperiment.model.LibraryCollectionItemAccessModel;
import com.theinnerhour.b2b.components.libraryExperiment.model.UserLibraryItemAccessModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: LibraryViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.LibraryViewModel$fetchCompletionStatusForActivities$1", f = "LibraryViewModel.kt", l = {410}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class p0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f5671u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ boolean f5672v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ k0 f5673w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ List<String> f5674x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ String f5675y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f5676z;

    /* compiled from: LibraryViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.LibraryViewModel$fetchCompletionStatusForActivities$1$1", f = "LibraryViewModel.kt", l = {415, 425}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {
        public final /* synthetic */ boolean A;

        /* renamed from: u  reason: collision with root package name */
        public int f5677u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f5678v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ boolean f5679w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ k0 f5680x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ List<String> f5681y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f5682z;

        /* compiled from: LibraryViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.LibraryViewModel$fetchCompletionStatusForActivities$1$1$1$1", f = "LibraryViewModel.kt", l = {414}, m = "invokeSuspend")
        /* renamed from: cn.p0$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0119a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.f<? extends String, ? extends UserLibraryItemAccessModel>>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f5683u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ k0 f5684v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ String f5685w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ String f5686x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0119a(k0 k0Var, String str, String str2, ls.d<? super C0119a> dVar) {
                super(2, dVar);
                this.f5684v = k0Var;
                this.f5685w = str;
                this.f5686x = str2;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new C0119a(this.f5684v, this.f5685w, this.f5686x, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.f<? extends String, ? extends UserLibraryItemAccessModel>> dVar) {
                return ((C0119a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f5683u;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    e1 e1Var = this.f5684v.f5597z;
                    this.f5683u = 1;
                    obj = e1Var.d(this.f5685w, this.f5686x, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return obj;
            }
        }

        /* compiled from: LibraryViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.LibraryViewModel$fetchCompletionStatusForActivities$1$1$6$1", f = "LibraryViewModel.kt", l = {424}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.f<? extends String, ? extends UserLibraryItemAccessModel>>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f5687u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ k0 f5688v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ String f5689w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ String f5690x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(k0 k0Var, String str, String str2, ls.d<? super b> dVar) {
                super(2, dVar);
                this.f5688v = k0Var;
                this.f5689w = str;
                this.f5690x = str2;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new b(this.f5688v, this.f5689w, this.f5690x, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.f<? extends String, ? extends UserLibraryItemAccessModel>> dVar) {
                return ((b) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f5687u;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    e1 e1Var = this.f5688v.f5597z;
                    this.f5687u = 1;
                    obj = e1Var.d(this.f5689w, this.f5690x, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, k0 k0Var, List<String> list, String str, boolean z11, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f5679w = z10;
            this.f5680x = k0Var;
            this.f5681y = list;
            this.f5682z = str;
            this.A = z11;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            a aVar = new a(this.f5679w, this.f5680x, this.f5681y, this.f5682z, this.A, dVar);
            aVar.f5678v = obj;
            return aVar;
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00aa A[LOOP:3: B:31:0x00a4->B:33:0x00aa, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00c3  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0119  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0130  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0140  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0185  */
        @Override // ns.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            k0 k0Var;
            androidx.lifecycle.w<HashMap<String, LibraryCollectionItemAccessModel>> wVar;
            int P;
            Iterator it;
            int P2;
            Iterator it2;
            boolean z10;
            Long startDate;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f5677u;
            boolean z11 = this.A;
            int i10 = 16;
            k0 k0Var2 = this.f5680x;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 == 2) {
                        k0Var = (k0) this.f5678v;
                        sp.b.d0(obj);
                        ArrayList arrayList = new ArrayList();
                        for (hs.f fVar : (Iterable) obj) {
                            if (fVar != null) {
                                arrayList.add(fVar);
                            }
                        }
                        P2 = sp.b.P(is.i.H1(arrayList, 10));
                        if (P2 >= 16) {
                            i10 = P2;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(i10);
                        it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            hs.f fVar2 = (hs.f) it2.next();
                            String str = (String) fVar2.f19464u;
                            B b10 = fVar2.f19465v;
                            UserLibraryItemAccessModel userLibraryItemAccessModel = (UserLibraryItemAccessModel) b10;
                            boolean z12 = false;
                            if (userLibraryItemAccessModel != null && (startDate = userLibraryItemAccessModel.getStartDate()) != null && startDate.longValue() == 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            Boolean valueOf = Boolean.valueOf(!z10);
                            UserLibraryItemAccessModel userLibraryItemAccessModel2 = (UserLibraryItemAccessModel) b10;
                            if (userLibraryItemAccessModel2 != null && userLibraryItemAccessModel2.isCompleted()) {
                                z12 = true;
                            }
                            linkedHashMap.put(str, new hs.f(valueOf, Boolean.valueOf(z12)));
                        }
                        if (z11) {
                            k0Var2.p().i(Boolean.FALSE);
                        }
                        HashMap<String, hs.f<Boolean, Boolean>> hashMap = new HashMap<>(linkedHashMap);
                        k0Var.getClass();
                        k0Var.V = hashMap;
                        k0Var2.W.i(Boolean.TRUE);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    wVar = (androidx.lifecycle.w) this.f5678v;
                    sp.b.d0(obj);
                    ArrayList arrayList2 = new ArrayList();
                    for (hs.f fVar3 : (Iterable) obj) {
                        if (fVar3 != null) {
                            arrayList2.add(fVar3);
                        }
                    }
                    P = sp.b.P(is.i.H1(arrayList2, 10));
                    if (P >= 16) {
                        i10 = P;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(i10);
                    it = arrayList2.iterator();
                    while (it.hasNext()) {
                        hs.f fVar4 = (hs.f) it.next();
                        linkedHashMap2.put((String) fVar4.f19464u, new LibraryCollectionItemAccessModel((UserLibraryItemAccessModel) fVar4.f19465v));
                    }
                    if (z11) {
                        k0Var2.p().i(Boolean.FALSE);
                    }
                    wVar.i(new HashMap<>(linkedHashMap2));
                }
            } else {
                sp.b.d0(obj);
                kotlinx.coroutines.d0 d0Var = (kotlinx.coroutines.d0) this.f5678v;
                boolean z13 = this.f5679w;
                String str2 = this.f5682z;
                List<String> list = this.f5681y;
                if (z13) {
                    androidx.lifecycle.w<HashMap<String, LibraryCollectionItemAccessModel>> wVar2 = k0Var2.U;
                    ArrayList arrayList3 = new ArrayList(is.i.H1(list, 10));
                    for (String str3 : list) {
                        arrayList3.add(ta.v.g(d0Var, null, new C0119a(k0Var2, str2, str3, null), 3));
                    }
                    this.f5678v = wVar2;
                    this.f5677u = 1;
                    obj = ca.a.n(arrayList3, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    wVar = wVar2;
                    ArrayList arrayList22 = new ArrayList();
                    while (r15.hasNext()) {
                    }
                    P = sp.b.P(is.i.H1(arrayList22, 10));
                    if (P >= 16) {
                    }
                    LinkedHashMap linkedHashMap22 = new LinkedHashMap(i10);
                    it = arrayList22.iterator();
                    while (it.hasNext()) {
                    }
                    if (z11) {
                    }
                    wVar.i(new HashMap<>(linkedHashMap22));
                } else {
                    ArrayList arrayList4 = new ArrayList(is.i.H1(list, 10));
                    for (String str4 : list) {
                        arrayList4.add(ta.v.g(d0Var, null, new b(k0Var2, str2, str4, null), 3));
                    }
                    this.f5678v = k0Var2;
                    this.f5677u = 2;
                    obj = ca.a.n(arrayList4, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    k0Var = k0Var2;
                    ArrayList arrayList5 = new ArrayList();
                    while (r15.hasNext()) {
                    }
                    P2 = sp.b.P(is.i.H1(arrayList5, 10));
                    if (P2 >= 16) {
                    }
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(i10);
                    it2 = arrayList5.iterator();
                    while (it2.hasNext()) {
                    }
                    if (z11) {
                    }
                    HashMap<String, hs.f<Boolean, Boolean>> hashMap2 = new HashMap<>(linkedHashMap3);
                    k0Var.getClass();
                    k0Var.V = hashMap2;
                    k0Var2.W.i(Boolean.TRUE);
                }
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(boolean z10, k0 k0Var, List<String> list, String str, boolean z11, ls.d<? super p0> dVar) {
        super(2, dVar);
        this.f5672v = z10;
        this.f5673w = k0Var;
        this.f5674x = list;
        this.f5675y = str;
        this.f5676z = z11;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new p0(this.f5672v, this.f5673w, this.f5674x, this.f5675y, this.f5676z, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((p0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f5671u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.scheduling.b bVar = kotlinx.coroutines.o0.f23642c;
            a aVar2 = new a(this.f5672v, this.f5673w, this.f5674x, this.f5675y, this.f5676z, null);
            this.f5671u = 1;
            if (ta.v.S(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
