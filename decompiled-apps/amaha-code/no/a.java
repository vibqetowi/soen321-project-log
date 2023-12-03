package no;

import androidx.lifecycle.l0;
import androidx.lifecycle.w;
import com.appsflyer.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;
import com.theinnerhour.b2b.components.pro.dashboard.model.ProCoachModel;
import com.theinnerhour.b2b.model.CoachModelTracker;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.VolleySingleton;
import com.theinnerhour.b2b.utils.CustomVolleyJsonObjectRequest;
import com.theinnerhour.b2b.utils.LogHelper;
import hs.f;
import hs.k;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
import mo.g;
import ns.i;
import ss.p;
import ta.v;
/* compiled from: ProDashboardViewModel.kt */
/* loaded from: classes2.dex */
public final class a extends l0 {
    public final w<Boolean> A;
    public final w<ArrayList<Goal>> B;
    public final w<Boolean> C;
    public final w<Integer> D;
    public final w<List<CoachModelTracker>> E;
    public final w<Integer> F;
    public final w<Boolean> G;
    public final w<Boolean> H;
    public final w<Boolean> I;
    public final w<f<Integer, Integer>> J;

    /* renamed from: x  reason: collision with root package name */
    public final mo.a f26677x;

    /* renamed from: y  reason: collision with root package name */
    public final w<ProCoachModel> f26678y;

    /* renamed from: z  reason: collision with root package name */
    public final w<Integer> f26679z;

    /* compiled from: ProDashboardViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.pro.dashboard.viewmodel.ProDashboardViewModel$1", f = "ProDashboardViewModel.kt", l = {R.styleable.AppCompatTheme_borderlessButtonStyle, R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle, R.styleable.AppCompatTheme_buttonStyleSmall, R.styleable.AppCompatTheme_colorButtonNormal, R.styleable.AppCompatTheme_colorPrimary, R.styleable.AppCompatTheme_dialogCornerRadius, R.styleable.AppCompatTheme_dropdownListPreferredItemHeight}, m = "invokeSuspend")
    /* renamed from: no.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0436a extends i implements p<d0, ls.d<? super k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public a f26680u;

        /* renamed from: v  reason: collision with root package name */
        public int f26681v;

        /* compiled from: ProDashboardViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.pro.dashboard.viewmodel.ProDashboardViewModel$1$1", f = "ProDashboardViewModel.kt", l = {R.styleable.AppCompatTheme_borderlessButtonStyle}, m = "invokeSuspend")
        /* renamed from: no.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0437a extends i implements p<d0, ls.d<? super ProCoachModel>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f26683u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ a f26684v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0437a(a aVar, ls.d<? super C0437a> dVar) {
                super(2, dVar);
                this.f26684v = aVar;
            }

            @Override // ns.a
            public final ls.d<k> create(Object obj, ls.d<?> dVar) {
                return new C0437a(this.f26684v, dVar);
            }

            @Override // ss.p
            public final Object invoke(d0 d0Var, ls.d<? super ProCoachModel> dVar) {
                return ((C0437a) create(d0Var, dVar)).invokeSuspend(k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f26683u;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    mo.a aVar2 = this.f26684v.f26677x;
                    this.f26683u = 1;
                    aVar2.getClass();
                    kotlinx.coroutines.k kVar = new kotlinx.coroutines.k(1, ca.a.G0(this));
                    kVar.u();
                    try {
                        VolleySingleton.getInstance().add(new CustomVolleyJsonObjectRequest(0, "https://api.theinnerhour.com/v1/mycoachv2", null, new mo.d(aVar2, kVar), new mo.e(aVar2, kVar)));
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e(aVar2.f25647a, e10);
                        if (kVar.a()) {
                            kVar.resumeWith(null);
                        }
                    }
                    obj = kVar.s();
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return obj;
            }
        }

        /* compiled from: ProDashboardViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.pro.dashboard.viewmodel.ProDashboardViewModel$1$3", f = "ProDashboardViewModel.kt", l = {R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle}, m = "invokeSuspend")
        /* renamed from: no.a$a$b */
        /* loaded from: classes2.dex */
        public static final class b extends i implements p<d0, ls.d<? super f<? extends ArrayList<Goal>, ? extends Boolean>>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f26685u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ a f26686v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(a aVar, ls.d<? super b> dVar) {
                super(2, dVar);
                this.f26686v = aVar;
            }

            @Override // ns.a
            public final ls.d<k> create(Object obj, ls.d<?> dVar) {
                return new b(this.f26686v, dVar);
            }

            @Override // ss.p
            public final Object invoke(d0 d0Var, ls.d<? super f<? extends ArrayList<Goal>, ? extends Boolean>> dVar) {
                return ((b) create(d0Var, dVar)).invokeSuspend(k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                String str;
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f26685u;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    mo.a aVar2 = this.f26686v.f26677x;
                    this.f26685u = 1;
                    aVar2.getClass();
                    kotlinx.coroutines.k kVar = new kotlinx.coroutines.k(1, ca.a.G0(this));
                    kVar.u();
                    fd.f fVar = FirebaseAuth.getInstance().f;
                    if (fVar != null) {
                        str = fVar.j0();
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
                        StringBuilder sb2 = new StringBuilder("coachModel/");
                        fd.f fVar2 = FirebaseAuth.getInstance().f;
                        kotlin.jvm.internal.i.d(fVar2);
                        sb2.append(fVar2.j0());
                        firebaseDatabase.getReference(sb2.toString()).addValueEventListener(new g(aVar2, kVar));
                    } else if (kVar.a()) {
                        kVar.resumeWith(null);
                    }
                    obj = kVar.s();
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return obj;
            }
        }

        /* compiled from: ProDashboardViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.pro.dashboard.viewmodel.ProDashboardViewModel$1$5", f = "ProDashboardViewModel.kt", l = {R.styleable.AppCompatTheme_colorButtonNormal}, m = "invokeSuspend")
        /* renamed from: no.a$a$c */
        /* loaded from: classes2.dex */
        public static final class c extends i implements p<d0, ls.d<? super f<? extends List<? extends CoachModelTracker>, ? extends Integer>>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f26687u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ a f26688v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(a aVar, ls.d<? super c> dVar) {
                super(2, dVar);
                this.f26688v = aVar;
            }

            @Override // ns.a
            public final ls.d<k> create(Object obj, ls.d<?> dVar) {
                return new c(this.f26688v, dVar);
            }

            @Override // ss.p
            public final Object invoke(d0 d0Var, ls.d<? super f<? extends List<? extends CoachModelTracker>, ? extends Integer>> dVar) {
                return ((c) create(d0Var, dVar)).invokeSuspend(k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                String str;
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f26687u;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    mo.a aVar2 = this.f26688v.f26677x;
                    this.f26687u = 1;
                    aVar2.getClass();
                    kotlinx.coroutines.k kVar = new kotlinx.coroutines.k(1, ca.a.G0(this));
                    kVar.u();
                    fd.f fVar = FirebaseAuth.getInstance().f;
                    if (fVar != null) {
                        str = fVar.j0();
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
                        StringBuilder sb2 = new StringBuilder("coachModel/");
                        fd.f fVar2 = FirebaseAuth.getInstance().f;
                        kotlin.jvm.internal.i.d(fVar2);
                        sb2.append(fVar2.j0());
                        firebaseDatabase.getReference(sb2.toString()).addValueEventListener(new mo.f(aVar2, kVar));
                    } else if (kVar.a()) {
                        kVar.resumeWith(new f(is.w.f20676u, new Integer(0)));
                    }
                    obj = kVar.s();
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return obj;
            }
        }

        /* compiled from: ProDashboardViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.pro.dashboard.viewmodel.ProDashboardViewModel$1$7", f = "ProDashboardViewModel.kt", l = {R.styleable.AppCompatTheme_colorPrimary}, m = "invokeSuspend")
        /* renamed from: no.a$a$d */
        /* loaded from: classes2.dex */
        public static final class d extends i implements p<d0, ls.d<? super f<? extends Boolean, ? extends Boolean>>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f26689u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ a f26690v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(a aVar, ls.d<? super d> dVar) {
                super(2, dVar);
                this.f26690v = aVar;
            }

            @Override // ns.a
            public final ls.d<k> create(Object obj, ls.d<?> dVar) {
                return new d(this.f26690v, dVar);
            }

            @Override // ss.p
            public final Object invoke(d0 d0Var, ls.d<? super f<? extends Boolean, ? extends Boolean>> dVar) {
                return ((d) create(d0Var, dVar)).invokeSuspend(k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                String str;
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f26689u;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    mo.a aVar2 = this.f26690v.f26677x;
                    this.f26689u = 1;
                    aVar2.getClass();
                    kotlinx.coroutines.k kVar = new kotlinx.coroutines.k(1, ca.a.G0(this));
                    kVar.u();
                    fd.f fVar = FirebaseAuth.getInstance().f;
                    if (fVar != null) {
                        str = fVar.j0();
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
                        StringBuilder sb2 = new StringBuilder("coachModel/");
                        fd.f fVar2 = FirebaseAuth.getInstance().f;
                        kotlin.jvm.internal.i.d(fVar2);
                        sb2.append(fVar2.j0());
                        firebaseDatabase.getReference(sb2.toString()).addValueEventListener(new mo.d(aVar2, kVar));
                    } else if (kVar.a()) {
                        Boolean bool = Boolean.FALSE;
                        kVar.resumeWith(new f(bool, bool));
                    }
                    obj = kVar.s();
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return obj;
            }
        }

        /* compiled from: ProDashboardViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.pro.dashboard.viewmodel.ProDashboardViewModel$1$9", f = "ProDashboardViewModel.kt", l = {R.styleable.AppCompatTheme_dropdownListPreferredItemHeight}, m = "invokeSuspend")
        /* renamed from: no.a$a$e */
        /* loaded from: classes2.dex */
        public static final class e extends i implements p<d0, ls.d<? super f<? extends Integer, ? extends Integer>>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f26691u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ a f26692v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(a aVar, ls.d<? super e> dVar) {
                super(2, dVar);
                this.f26692v = aVar;
            }

            @Override // ns.a
            public final ls.d<k> create(Object obj, ls.d<?> dVar) {
                return new e(this.f26692v, dVar);
            }

            @Override // ss.p
            public final Object invoke(d0 d0Var, ls.d<? super f<? extends Integer, ? extends Integer>> dVar) {
                return ((e) create(d0Var, dVar)).invokeSuspend(k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f26691u;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    mo.a aVar2 = this.f26692v.f26677x;
                    this.f26691u = 1;
                    obj = aVar2.a(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return obj;
            }
        }

        public C0436a(ls.d<? super C0436a> dVar) {
            super(2, dVar);
        }

        @Override // ns.a
        public final ls.d<k> create(Object obj, ls.d<?> dVar) {
            return new C0436a(dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
            return ((C0436a) create(d0Var, dVar)).invokeSuspend(k.f19476a);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0062 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00a8 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00cc A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00ed A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0108  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0138 A[RETURN] */
        @Override // ns.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            f fVar;
            ArrayList<Goal> arrayList;
            ArrayList arrayList2;
            a aVar;
            f fVar2;
            a aVar2;
            ms.a aVar3 = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f26681v;
            boolean z10 = true;
            a aVar4 = a.this;
            switch (i6) {
                case 0:
                    sp.b.d0(obj);
                    kotlinx.coroutines.scheduling.b bVar = o0.f23642c;
                    C0437a c0437a = new C0437a(aVar4, null);
                    this.f26681v = 1;
                    obj = v.S(bVar, c0437a, this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                    aVar4.f26678y.i((ProCoachModel) obj);
                    kotlinx.coroutines.scheduling.b bVar2 = o0.f23642c;
                    b bVar3 = new b(aVar4, null);
                    this.f26681v = 2;
                    obj = v.S(bVar2, bVar3, this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                    fVar = (f) obj;
                    w<ArrayList<Goal>> wVar = aVar4.B;
                    if (fVar != null) {
                        arrayList = (ArrayList) fVar.f19464u;
                    } else {
                        arrayList = null;
                    }
                    wVar.i(arrayList);
                    aVar4.C.i(Boolean.valueOf((fVar == null && ((Boolean) fVar.f19465v).booleanValue()) ? false : false));
                    if (fVar != null) {
                        arrayList2 = (ArrayList) fVar.f19464u;
                    } else {
                        arrayList2 = null;
                    }
                    this.f26680u = aVar4;
                    this.f26681v = 3;
                    aVar4.f26677x.getClass();
                    obj = v.S(o0.f23640a, new mo.c(arrayList2, null), this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                    aVar = aVar4;
                    aVar.D.i(new Integer(((Number) obj).intValue()));
                    kotlinx.coroutines.scheduling.b bVar4 = o0.f23642c;
                    c cVar = new c(aVar4, null);
                    this.f26680u = null;
                    this.f26681v = 4;
                    obj = v.S(bVar4, cVar, this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                    f fVar3 = (f) obj;
                    aVar4.E.i(fVar3.f19464u);
                    aVar4.F.i(fVar3.f19465v);
                    kotlinx.coroutines.scheduling.b bVar5 = o0.f23642c;
                    d dVar = new d(aVar4, null);
                    this.f26681v = 5;
                    obj = v.S(bVar5, dVar, this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                    fVar2 = (f) obj;
                    aVar4.G.i(fVar2.f19464u);
                    aVar4.H.i(fVar2.f19465v);
                    if (((Boolean) fVar2.f19464u).booleanValue()) {
                        this.f26680u = aVar4;
                        this.f26681v = 6;
                        obj = aVar4.f26677x.b(this);
                        if (obj == aVar3) {
                            return aVar3;
                        }
                        aVar2 = aVar4;
                        aVar2.I.i(Boolean.valueOf(((Boolean) obj).booleanValue()));
                    }
                    kotlinx.coroutines.scheduling.b bVar6 = o0.f23642c;
                    e eVar = new e(aVar4, null);
                    this.f26680u = null;
                    this.f26681v = 7;
                    obj = v.S(bVar6, eVar, this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                    aVar4.J.i((f) obj);
                    aVar4.A.l(Boolean.FALSE);
                    return k.f19476a;
                case 1:
                    sp.b.d0(obj);
                    aVar4.f26678y.i((ProCoachModel) obj);
                    kotlinx.coroutines.scheduling.b bVar22 = o0.f23642c;
                    b bVar32 = new b(aVar4, null);
                    this.f26681v = 2;
                    obj = v.S(bVar22, bVar32, this);
                    if (obj == aVar3) {
                    }
                    fVar = (f) obj;
                    w<ArrayList<Goal>> wVar2 = aVar4.B;
                    if (fVar != null) {
                    }
                    wVar2.i(arrayList);
                    if (fVar == null) {
                        break;
                    }
                    aVar4.C.i(Boolean.valueOf((fVar == null && ((Boolean) fVar.f19465v).booleanValue()) ? false : false));
                    if (fVar != null) {
                    }
                    this.f26680u = aVar4;
                    this.f26681v = 3;
                    aVar4.f26677x.getClass();
                    obj = v.S(o0.f23640a, new mo.c(arrayList2, null), this);
                    if (obj == aVar3) {
                    }
                    break;
                case 2:
                    sp.b.d0(obj);
                    fVar = (f) obj;
                    w<ArrayList<Goal>> wVar22 = aVar4.B;
                    if (fVar != null) {
                    }
                    wVar22.i(arrayList);
                    aVar4.C.i(Boolean.valueOf((fVar == null && ((Boolean) fVar.f19465v).booleanValue()) ? false : false));
                    if (fVar != null) {
                    }
                    this.f26680u = aVar4;
                    this.f26681v = 3;
                    aVar4.f26677x.getClass();
                    obj = v.S(o0.f23640a, new mo.c(arrayList2, null), this);
                    if (obj == aVar3) {
                    }
                    break;
                case 3:
                    aVar = this.f26680u;
                    sp.b.d0(obj);
                    aVar.D.i(new Integer(((Number) obj).intValue()));
                    kotlinx.coroutines.scheduling.b bVar42 = o0.f23642c;
                    c cVar2 = new c(aVar4, null);
                    this.f26680u = null;
                    this.f26681v = 4;
                    obj = v.S(bVar42, cVar2, this);
                    if (obj == aVar3) {
                    }
                    f fVar32 = (f) obj;
                    aVar4.E.i(fVar32.f19464u);
                    aVar4.F.i(fVar32.f19465v);
                    kotlinx.coroutines.scheduling.b bVar52 = o0.f23642c;
                    d dVar2 = new d(aVar4, null);
                    this.f26681v = 5;
                    obj = v.S(bVar52, dVar2, this);
                    if (obj == aVar3) {
                    }
                    fVar2 = (f) obj;
                    aVar4.G.i(fVar2.f19464u);
                    aVar4.H.i(fVar2.f19465v);
                    if (((Boolean) fVar2.f19464u).booleanValue()) {
                    }
                    kotlinx.coroutines.scheduling.b bVar62 = o0.f23642c;
                    e eVar2 = new e(aVar4, null);
                    this.f26680u = null;
                    this.f26681v = 7;
                    obj = v.S(bVar62, eVar2, this);
                    if (obj == aVar3) {
                    }
                    aVar4.J.i((f) obj);
                    aVar4.A.l(Boolean.FALSE);
                    return k.f19476a;
                case 4:
                    sp.b.d0(obj);
                    f fVar322 = (f) obj;
                    aVar4.E.i(fVar322.f19464u);
                    aVar4.F.i(fVar322.f19465v);
                    kotlinx.coroutines.scheduling.b bVar522 = o0.f23642c;
                    d dVar22 = new d(aVar4, null);
                    this.f26681v = 5;
                    obj = v.S(bVar522, dVar22, this);
                    if (obj == aVar3) {
                    }
                    fVar2 = (f) obj;
                    aVar4.G.i(fVar2.f19464u);
                    aVar4.H.i(fVar2.f19465v);
                    if (((Boolean) fVar2.f19464u).booleanValue()) {
                    }
                    kotlinx.coroutines.scheduling.b bVar622 = o0.f23642c;
                    e eVar22 = new e(aVar4, null);
                    this.f26680u = null;
                    this.f26681v = 7;
                    obj = v.S(bVar622, eVar22, this);
                    if (obj == aVar3) {
                    }
                    aVar4.J.i((f) obj);
                    aVar4.A.l(Boolean.FALSE);
                    return k.f19476a;
                case 5:
                    sp.b.d0(obj);
                    fVar2 = (f) obj;
                    aVar4.G.i(fVar2.f19464u);
                    aVar4.H.i(fVar2.f19465v);
                    if (((Boolean) fVar2.f19464u).booleanValue()) {
                    }
                    kotlinx.coroutines.scheduling.b bVar6222 = o0.f23642c;
                    e eVar222 = new e(aVar4, null);
                    this.f26680u = null;
                    this.f26681v = 7;
                    obj = v.S(bVar6222, eVar222, this);
                    if (obj == aVar3) {
                    }
                    aVar4.J.i((f) obj);
                    aVar4.A.l(Boolean.FALSE);
                    return k.f19476a;
                case 6:
                    aVar2 = this.f26680u;
                    sp.b.d0(obj);
                    aVar2.I.i(Boolean.valueOf(((Boolean) obj).booleanValue()));
                    kotlinx.coroutines.scheduling.b bVar62222 = o0.f23642c;
                    e eVar2222 = new e(aVar4, null);
                    this.f26680u = null;
                    this.f26681v = 7;
                    obj = v.S(bVar62222, eVar2222, this);
                    if (obj == aVar3) {
                    }
                    aVar4.J.i((f) obj);
                    aVar4.A.l(Boolean.FALSE);
                    return k.f19476a;
                case 7:
                    sp.b.d0(obj);
                    aVar4.J.i((f) obj);
                    aVar4.A.l(Boolean.FALSE);
                    return k.f19476a;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public a(mo.a dashboardRepository) {
        kotlin.jvm.internal.i.g(dashboardRepository, "dashboardRepository");
        this.f26677x = dashboardRepository;
        this.f26678y = new w<>();
        this.f26679z = new w<>();
        this.A = new w<>(Boolean.TRUE);
        this.B = new w<>();
        this.C = new w<>();
        this.D = new w<>();
        this.E = new w<>();
        this.F = new w<>();
        Boolean bool = Boolean.FALSE;
        this.G = new w<>(bool);
        this.H = new w<>(bool);
        this.I = new w<>(bool);
        this.J = new w<>();
        v.H(kc.f.H(this), null, 0, new C0436a(null), 3);
    }
}
