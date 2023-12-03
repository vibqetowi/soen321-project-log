package fm;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.appsflyer.R;
import com.theinnerhour.b2b.utils.LogHelper;
import fm.j0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: FirestoreGoalsViewModelRepository.kt */
@ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.FirestoreGoalsViewModelRepository$paginate$1", f = "FirestoreGoalsViewModelRepository.kt", l = {543, 551, 569}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class v0 extends ns.i implements ss.p<kotlinx.coroutines.flow.e<? super List<? extends fe.g>>, ls.d<? super hs.k>, Object> {
    public final /* synthetic */ long A;
    public final /* synthetic */ j0 B;

    /* renamed from: u  reason: collision with root package name */
    public List f15574u;

    /* renamed from: v  reason: collision with root package name */
    public ArrayList f15575v;

    /* renamed from: w  reason: collision with root package name */
    public int f15576w;

    /* renamed from: x  reason: collision with root package name */
    public /* synthetic */ Object f15577x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.d<Integer> f15578y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.firestore.d f15579z;

    /* compiled from: FirestoreGoalsViewModelRepository.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<fe.r, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ ls.d<Collection<? extends fe.g>> f15580u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ls.h hVar) {
            super(1);
            this.f15580u = hVar;
        }

        @Override // ss.l
        public final hs.k invoke(fe.r rVar) {
            this.f15580u.resumeWith(rVar.e());
            return hs.k.f19476a;
        }
    }

    /* compiled from: FirestoreGoalsViewModelRepository.kt */
    /* loaded from: classes2.dex */
    public static final class b implements ya.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ j0 f15581a;

        public b(j0 j0Var) {
            this.f15581a = j0Var;
        }

        @Override // ya.e
        public final void onFailure(Exception it) {
            kotlin.jvm.internal.i.g(it, "it");
            LogHelper.INSTANCE.e(this.f15581a.f15374a, it);
        }
    }

    /* compiled from: FirestoreGoalsViewModelRepository.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.l<fe.r, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ ls.d<Collection<? extends fe.g>> f15582u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ls.h hVar) {
            super(1);
            this.f15582u = hVar;
        }

        @Override // ss.l
        public final hs.k invoke(fe.r rVar) {
            this.f15582u.resumeWith(rVar.e());
            return hs.k.f19476a;
        }
    }

    /* compiled from: FirestoreGoalsViewModelRepository.kt */
    /* loaded from: classes2.dex */
    public static final class d<T> implements kotlinx.coroutines.flow.e {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.e<List<? extends fe.g>> f15583u;

        /* JADX WARN: Multi-variable type inference failed */
        public d(kotlinx.coroutines.flow.e<? super List<? extends fe.g>> eVar) {
            this.f15583u = eVar;
        }

        @Override // kotlinx.coroutines.flow.e
        public final Object b(Object obj, ls.d dVar) {
            Object b10 = this.f15583u.b((List) obj, dVar);
            if (b10 != ms.a.COROUTINE_SUSPENDED) {
                return hs.k.f19476a;
            }
            return b10;
        }
    }

    /* compiled from: Emitters.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.FirestoreGoalsViewModelRepository$paginate$1$invokeSuspend$$inlined$transform$1", f = "FirestoreGoalsViewModelRepository.kt", l = {R.styleable.AppCompatTheme_borderlessButtonStyle}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends ns.i implements ss.p<kotlinx.coroutines.flow.e<? super List<fe.g>>, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f15584u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f15585v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.d f15586w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ List f15587x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ com.google.firebase.firestore.d f15588y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ long f15589z;

        /* compiled from: Emitters.kt */
        /* loaded from: classes2.dex */
        public static final class a<T> implements kotlinx.coroutines.flow.e {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.flow.e<List<fe.g>> f15590u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ List f15591v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ com.google.firebase.firestore.d f15592w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ long f15593x;

            /* compiled from: Emitters.kt */
            @ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.FirestoreGoalsViewModelRepository$paginate$1$invokeSuspend$$inlined$transform$1$1", f = "FirestoreGoalsViewModelRepository.kt", l = {225, 231}, m = "emit")
            /* renamed from: fm.v0$e$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0241a extends ns.c {

                /* renamed from: u  reason: collision with root package name */
                public /* synthetic */ Object f15594u;

                /* renamed from: v  reason: collision with root package name */
                public int f15595v;

                /* renamed from: x  reason: collision with root package name */
                public a f15597x;

                /* renamed from: y  reason: collision with root package name */
                public kotlinx.coroutines.flow.e f15598y;

                /* renamed from: z  reason: collision with root package name */
                public List f15599z;

                public C0241a(ls.d dVar) {
                    super(dVar);
                }

                @Override // ns.a
                public final Object invokeSuspend(Object obj) {
                    this.f15594u = obj;
                    this.f15595v |= LinearLayoutManager.INVALID_OFFSET;
                    return a.this.b(null, this);
                }
            }

            public a(kotlinx.coroutines.flow.e eVar, List list, com.google.firebase.firestore.d dVar, long j10) {
                this.f15591v = list;
                this.f15592w = dVar;
                this.f15593x = j10;
                this.f15590u = eVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x00b1 A[RETURN] */
            @Override // kotlinx.coroutines.flow.e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object b(T t3, ls.d<? super hs.k> dVar) {
                C0241a c0241a;
                int i6;
                kotlinx.coroutines.flow.e<List<fe.g>> eVar;
                a<T> aVar;
                List list;
                List<fe.g> list2;
                if (dVar instanceof C0241a) {
                    c0241a = (C0241a) dVar;
                    int i10 = c0241a.f15595v;
                    if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        c0241a.f15595v = i10 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj = c0241a.f15594u;
                        ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
                        i6 = c0241a.f15595v;
                        if (i6 == 0) {
                            if (i6 != 1) {
                                if (i6 == 2) {
                                    sp.b.d0(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                list = c0241a.f15599z;
                                eVar = c0241a.f15598y;
                                aVar = c0241a.f15597x;
                                sp.b.d0(obj);
                                list.addAll((Collection) obj);
                                list2 = aVar.f15591v;
                                c0241a.f15597x = null;
                                c0241a.f15598y = null;
                                c0241a.getClass();
                                c0241a.f15599z = null;
                                c0241a.f15595v = 2;
                                if (eVar.b(list2, c0241a) == aVar2) {
                                    return aVar2;
                                }
                            }
                        } else {
                            sp.b.d0(obj);
                            int intValue = ((Number) t3).intValue();
                            List list3 = this.f15591v;
                            if (intValue == list3.size() && list3.size() > 0) {
                                c0241a.f15597x = this;
                                eVar = this.f15590u;
                                c0241a.f15598y = eVar;
                                c0241a.getClass();
                                c0241a.f15599z = list3;
                                c0241a.f15595v = 1;
                                ls.h hVar = new ls.h(ca.a.G0(c0241a));
                                this.f15592w.g((fe.g) is.u.o2(list3)).b(this.f15593x).a().addOnSuccessListener(new j0.k(new c(hVar)));
                                Object b10 = hVar.b();
                                if (b10 == aVar2) {
                                    return aVar2;
                                }
                                aVar = this;
                                obj = b10;
                                list = list3;
                                list.addAll((Collection) obj);
                                list2 = aVar.f15591v;
                                c0241a.f15597x = null;
                                c0241a.f15598y = null;
                                c0241a.getClass();
                                c0241a.f15599z = null;
                                c0241a.f15595v = 2;
                                if (eVar.b(list2, c0241a) == aVar2) {
                                }
                            }
                        }
                        return hs.k.f19476a;
                    }
                }
                c0241a = new C0241a(dVar);
                Object obj2 = c0241a.f15594u;
                ms.a aVar22 = ms.a.COROUTINE_SUSPENDED;
                i6 = c0241a.f15595v;
                if (i6 == 0) {
                }
                return hs.k.f19476a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(kotlinx.coroutines.flow.d dVar, ls.d dVar2, List list, com.google.firebase.firestore.d dVar3, long j10) {
            super(2, dVar2);
            this.f15586w = dVar;
            this.f15587x = list;
            this.f15588y = dVar3;
            this.f15589z = j10;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            e eVar = new e(this.f15586w, dVar, this.f15587x, this.f15588y, this.f15589z);
            eVar.f15585v = obj;
            return eVar;
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.flow.e<? super List<fe.g>> eVar, ls.d<? super hs.k> dVar) {
            return ((e) create(eVar, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f15584u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                a aVar2 = new a((kotlinx.coroutines.flow.e) this.f15585v, this.f15587x, this.f15588y, this.f15589z);
                this.f15584u = 1;
                if (this.f15586w.a(aVar2, this) == aVar) {
                    return aVar;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(kotlinx.coroutines.flow.d<Integer> dVar, com.google.firebase.firestore.d dVar2, long j10, j0 j0Var, ls.d<? super v0> dVar3) {
        super(2, dVar3);
        this.f15578y = dVar;
        this.f15579z = dVar2;
        this.A = j10;
        this.B = j0Var;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        v0 v0Var = new v0(this.f15578y, this.f15579z, this.A, this.B, dVar);
        v0Var.f15577x = obj;
        return v0Var;
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.flow.e<? super List<? extends fe.g>> eVar, ls.d<? super hs.k> dVar) {
        return ((v0) create(eVar, dVar)).invokeSuspend(hs.k.f19476a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00bd A[RETURN] */
    @Override // ns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        kotlinx.coroutines.flow.e eVar;
        List list;
        List list2;
        kotlinx.coroutines.flow.e eVar2;
        kotlinx.coroutines.flow.r rVar;
        d dVar;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f15576w;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 == 3) {
                        sp.b.d0(obj);
                        return hs.k.f19476a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                List list3 = this.f15574u;
                eVar2 = (kotlinx.coroutines.flow.e) this.f15577x;
                sp.b.d0(obj);
                list2 = list3;
                rVar = new kotlinx.coroutines.flow.r(new e(this.f15578y, null, list2, this.f15579z, this.A));
                dVar = new d(eVar2);
                this.f15577x = null;
                this.f15574u = null;
                this.f15576w = 3;
                if (rVar.a(dVar, this) == aVar) {
                    return aVar;
                }
                return hs.k.f19476a;
            }
            arrayList = this.f15575v;
            list = this.f15574u;
            eVar = (kotlinx.coroutines.flow.e) this.f15577x;
            sp.b.d0(obj);
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.flow.e eVar3 = (kotlinx.coroutines.flow.e) this.f15577x;
            arrayList = new ArrayList();
            this.f15577x = eVar3;
            this.f15574u = arrayList;
            com.google.firebase.firestore.d dVar2 = this.f15579z;
            j0 j0Var = this.B;
            this.f15575v = arrayList;
            this.f15576w = 1;
            ls.h hVar = new ls.h(ca.a.G0(this));
            ya.v a10 = dVar2.b(this.A).a();
            j0.k kVar = new j0.k(new a(hVar));
            a10.getClass();
            a10.addOnSuccessListener(ya.j.f38393a, kVar);
            a10.addOnFailureListener(new b(j0Var));
            Object b10 = hVar.b();
            if (b10 == aVar) {
                return aVar;
            }
            eVar = eVar3;
            obj = b10;
            list = arrayList;
        }
        arrayList.addAll((Collection) obj);
        this.f15577x = eVar;
        this.f15574u = list;
        this.f15575v = null;
        this.f15576w = 2;
        if (eVar.b(list, this) == aVar) {
            return aVar;
        }
        list2 = list;
        eVar2 = eVar;
        rVar = new kotlinx.coroutines.flow.r(new e(this.f15578y, null, list2, this.f15579z, this.A));
        dVar = new d(eVar2);
        this.f15577x = null;
        this.f15574u = null;
        this.f15576w = 3;
        if (rVar.a(dVar, this) == aVar) {
        }
        return hs.k.f19476a;
    }
}
