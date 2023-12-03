package cn;

import androidx.recyclerview.widget.LinearLayoutManager;
import cn.e1;
import com.appsflyer.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: LibraryViewModelRepository.kt */
@ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.LibraryViewModelRepository$paginate$1", f = "LibraryViewModelRepository.kt", l = {141, 145, 163}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class p1 extends ns.i implements ss.p<kotlinx.coroutines.flow.e<? super List<? extends fe.g>>, ls.d<? super hs.k>, Object> {
    public final /* synthetic */ long A;

    /* renamed from: u  reason: collision with root package name */
    public List f5691u;

    /* renamed from: v  reason: collision with root package name */
    public ArrayList f5692v;

    /* renamed from: w  reason: collision with root package name */
    public int f5693w;

    /* renamed from: x  reason: collision with root package name */
    public /* synthetic */ Object f5694x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.d<Integer> f5695y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.firestore.d f5696z;

    /* compiled from: LibraryViewModelRepository.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<fe.r, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ ls.d<Collection<? extends fe.g>> f5697u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ls.h hVar) {
            super(1);
            this.f5697u = hVar;
        }

        @Override // ss.l
        public final hs.k invoke(fe.r rVar) {
            this.f5697u.resumeWith(rVar.e());
            return hs.k.f19476a;
        }
    }

    /* compiled from: LibraryViewModelRepository.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<fe.r, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ ls.d<Collection<? extends fe.g>> f5698u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ls.h hVar) {
            super(1);
            this.f5698u = hVar;
        }

        @Override // ss.l
        public final hs.k invoke(fe.r rVar) {
            this.f5698u.resumeWith(rVar.e());
            return hs.k.f19476a;
        }
    }

    /* compiled from: LibraryViewModelRepository.kt */
    /* loaded from: classes2.dex */
    public static final class c<T> implements kotlinx.coroutines.flow.e {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.e<List<? extends fe.g>> f5699u;

        /* JADX WARN: Multi-variable type inference failed */
        public c(kotlinx.coroutines.flow.e<? super List<? extends fe.g>> eVar) {
            this.f5699u = eVar;
        }

        @Override // kotlinx.coroutines.flow.e
        public final Object b(Object obj, ls.d dVar) {
            Object b10 = this.f5699u.b((List) obj, dVar);
            if (b10 != ms.a.COROUTINE_SUSPENDED) {
                return hs.k.f19476a;
            }
            return b10;
        }
    }

    /* compiled from: Emitters.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.LibraryViewModelRepository$paginate$1$invokeSuspend$$inlined$transform$1", f = "LibraryViewModelRepository.kt", l = {R.styleable.AppCompatTheme_borderlessButtonStyle}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends ns.i implements ss.p<kotlinx.coroutines.flow.e<? super List<fe.g>>, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f5700u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f5701v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.d f5702w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ List f5703x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ com.google.firebase.firestore.d f5704y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ long f5705z;

        /* compiled from: Emitters.kt */
        /* loaded from: classes2.dex */
        public static final class a<T> implements kotlinx.coroutines.flow.e {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.flow.e<List<fe.g>> f5706u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ List f5707v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ com.google.firebase.firestore.d f5708w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ long f5709x;

            /* compiled from: Emitters.kt */
            @ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.LibraryViewModelRepository$paginate$1$invokeSuspend$$inlined$transform$1$1", f = "LibraryViewModelRepository.kt", l = {225, 231}, m = "emit")
            /* renamed from: cn.p1$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0120a extends ns.c {

                /* renamed from: u  reason: collision with root package name */
                public /* synthetic */ Object f5710u;

                /* renamed from: v  reason: collision with root package name */
                public int f5711v;

                /* renamed from: x  reason: collision with root package name */
                public a f5713x;

                /* renamed from: y  reason: collision with root package name */
                public kotlinx.coroutines.flow.e f5714y;

                /* renamed from: z  reason: collision with root package name */
                public List f5715z;

                public C0120a(ls.d dVar) {
                    super(dVar);
                }

                @Override // ns.a
                public final Object invokeSuspend(Object obj) {
                    this.f5710u = obj;
                    this.f5711v |= LinearLayoutManager.INVALID_OFFSET;
                    return a.this.b(null, this);
                }
            }

            public a(kotlinx.coroutines.flow.e eVar, List list, com.google.firebase.firestore.d dVar, long j10) {
                this.f5707v = list;
                this.f5708w = dVar;
                this.f5709x = j10;
                this.f5706u = eVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x00b1 A[RETURN] */
            @Override // kotlinx.coroutines.flow.e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object b(T t3, ls.d<? super hs.k> dVar) {
                C0120a c0120a;
                int i6;
                kotlinx.coroutines.flow.e<List<fe.g>> eVar;
                a<T> aVar;
                List list;
                List<fe.g> list2;
                if (dVar instanceof C0120a) {
                    c0120a = (C0120a) dVar;
                    int i10 = c0120a.f5711v;
                    if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        c0120a.f5711v = i10 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj = c0120a.f5710u;
                        ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
                        i6 = c0120a.f5711v;
                        if (i6 == 0) {
                            if (i6 != 1) {
                                if (i6 == 2) {
                                    sp.b.d0(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                list = c0120a.f5715z;
                                eVar = c0120a.f5714y;
                                aVar = c0120a.f5713x;
                                sp.b.d0(obj);
                                list.addAll((Collection) obj);
                                list2 = aVar.f5707v;
                                c0120a.f5713x = null;
                                c0120a.f5714y = null;
                                c0120a.getClass();
                                c0120a.f5715z = null;
                                c0120a.f5711v = 2;
                                if (eVar.b(list2, c0120a) == aVar2) {
                                    return aVar2;
                                }
                            }
                        } else {
                            sp.b.d0(obj);
                            int intValue = ((Number) t3).intValue();
                            List list3 = this.f5707v;
                            if (intValue == list3.size() && list3.size() > 0) {
                                c0120a.f5713x = this;
                                eVar = this.f5706u;
                                c0120a.f5714y = eVar;
                                c0120a.getClass();
                                c0120a.f5715z = list3;
                                c0120a.f5711v = 1;
                                ls.h hVar = new ls.h(ca.a.G0(c0120a));
                                this.f5708w.g((fe.g) is.u.o2(list3)).b(this.f5709x).a().addOnSuccessListener(new e1.i(new b(hVar)));
                                Object b10 = hVar.b();
                                if (b10 == aVar2) {
                                    return aVar2;
                                }
                                aVar = this;
                                obj = b10;
                                list = list3;
                                list.addAll((Collection) obj);
                                list2 = aVar.f5707v;
                                c0120a.f5713x = null;
                                c0120a.f5714y = null;
                                c0120a.getClass();
                                c0120a.f5715z = null;
                                c0120a.f5711v = 2;
                                if (eVar.b(list2, c0120a) == aVar2) {
                                }
                            }
                        }
                        return hs.k.f19476a;
                    }
                }
                c0120a = new C0120a(dVar);
                Object obj2 = c0120a.f5710u;
                ms.a aVar22 = ms.a.COROUTINE_SUSPENDED;
                i6 = c0120a.f5711v;
                if (i6 == 0) {
                }
                return hs.k.f19476a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(kotlinx.coroutines.flow.d dVar, ls.d dVar2, List list, com.google.firebase.firestore.d dVar3, long j10) {
            super(2, dVar2);
            this.f5702w = dVar;
            this.f5703x = list;
            this.f5704y = dVar3;
            this.f5705z = j10;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            d dVar2 = new d(this.f5702w, dVar, this.f5703x, this.f5704y, this.f5705z);
            dVar2.f5701v = obj;
            return dVar2;
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.flow.e<? super List<fe.g>> eVar, ls.d<? super hs.k> dVar) {
            return ((d) create(eVar, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f5700u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                a aVar2 = new a((kotlinx.coroutines.flow.e) this.f5701v, this.f5703x, this.f5704y, this.f5705z);
                this.f5700u = 1;
                if (this.f5702w.a(aVar2, this) == aVar) {
                    return aVar;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(kotlinx.coroutines.flow.d<Integer> dVar, com.google.firebase.firestore.d dVar2, long j10, ls.d<? super p1> dVar3) {
        super(2, dVar3);
        this.f5695y = dVar;
        this.f5696z = dVar2;
        this.A = j10;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        p1 p1Var = new p1(this.f5695y, this.f5696z, this.A, dVar);
        p1Var.f5694x = obj;
        return p1Var;
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.flow.e<? super List<? extends fe.g>> eVar, ls.d<? super hs.k> dVar) {
        return ((p1) create(eVar, dVar)).invokeSuspend(hs.k.f19476a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ad A[RETURN] */
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
        c cVar;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f5693w;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 == 3) {
                        sp.b.d0(obj);
                        return hs.k.f19476a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                List list3 = this.f5691u;
                eVar2 = (kotlinx.coroutines.flow.e) this.f5694x;
                sp.b.d0(obj);
                list2 = list3;
                rVar = new kotlinx.coroutines.flow.r(new d(this.f5695y, null, list2, this.f5696z, this.A));
                cVar = new c(eVar2);
                this.f5694x = null;
                this.f5691u = null;
                this.f5693w = 3;
                if (rVar.a(cVar, this) == aVar) {
                    return aVar;
                }
                return hs.k.f19476a;
            }
            arrayList = this.f5692v;
            list = this.f5691u;
            eVar = (kotlinx.coroutines.flow.e) this.f5694x;
            sp.b.d0(obj);
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.flow.e eVar3 = (kotlinx.coroutines.flow.e) this.f5694x;
            arrayList = new ArrayList();
            this.f5694x = eVar3;
            this.f5691u = arrayList;
            com.google.firebase.firestore.d dVar = this.f5696z;
            this.f5692v = arrayList;
            this.f5693w = 1;
            ls.h hVar = new ls.h(ca.a.G0(this));
            dVar.b(this.A).a().addOnSuccessListener(new e1.i(new a(hVar)));
            Object b10 = hVar.b();
            if (b10 == aVar) {
                return aVar;
            }
            eVar = eVar3;
            obj = b10;
            list = arrayList;
        }
        arrayList.addAll((Collection) obj);
        this.f5694x = eVar;
        this.f5691u = list;
        this.f5692v = null;
        this.f5693w = 2;
        if (eVar.b(list, this) == aVar) {
            return aVar;
        }
        list2 = list;
        eVar2 = eVar;
        rVar = new kotlinx.coroutines.flow.r(new d(this.f5695y, null, list2, this.f5696z, this.A));
        cVar = new c(eVar2);
        this.f5694x = null;
        this.f5691u = null;
        this.f5693w = 3;
        if (rVar.a(cVar, this) == aVar) {
        }
        return hs.k.f19476a;
    }
}
