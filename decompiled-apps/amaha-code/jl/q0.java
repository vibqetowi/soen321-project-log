package jl;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.appsflyer.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.theinnerhour.b2b.components.dashboard.experiment.model.NotV4RecentModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: NotV4DashboardRepository.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardRepository$paginate$1", f = "NotV4DashboardRepository.kt", l = {R.styleable.AppCompatTheme_listPreferredItemHeightLarge, R.styleable.AppCompatTheme_selectableItemBackgroundBorderless, 128}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class q0 extends ns.i implements ss.p<kotlinx.coroutines.flow.e<? super List<? extends NotV4RecentModel>>, ls.d<? super hs.k>, Object> {
    public final /* synthetic */ int A;

    /* renamed from: u  reason: collision with root package name */
    public List f22301u;

    /* renamed from: v  reason: collision with root package name */
    public ArrayList f22302v;

    /* renamed from: w  reason: collision with root package name */
    public int f22303w;

    /* renamed from: x  reason: collision with root package name */
    public /* synthetic */ Object f22304x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.d<Long> f22305y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Query f22306z;

    /* compiled from: NotV4DashboardRepository.kt */
    /* loaded from: classes2.dex */
    public static final class a implements ValueEventListener {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ ls.d<Collection<NotV4RecentModel>> f22307u;

        public a(ls.h hVar) {
            this.f22307u = hVar;
        }

        @Override // com.google.firebase.database.ValueEventListener
        public final void onCancelled(DatabaseError error) {
            kotlin.jvm.internal.i.g(error, "error");
            this.f22307u.resumeWith(is.w.f20676u);
        }

        @Override // com.google.firebase.database.ValueEventListener
        public final void onDataChange(DataSnapshot snapshot) {
            kotlin.jvm.internal.i.g(snapshot, "snapshot");
            boolean exists = snapshot.exists();
            ls.d<Collection<NotV4RecentModel>> dVar = this.f22307u;
            if (exists && snapshot.hasChildren()) {
                Iterable<DataSnapshot> children = snapshot.getChildren();
                kotlin.jvm.internal.i.f(children, "snapshot.children");
                ArrayList arrayList = new ArrayList();
                for (DataSnapshot dataSnapshot : children) {
                    NotV4RecentModel notV4RecentModel = (NotV4RecentModel) dataSnapshot.getValue(NotV4RecentModel.class);
                    if (notV4RecentModel != null) {
                        arrayList.add(notV4RecentModel);
                    }
                }
                dVar.resumeWith(arrayList);
                return;
            }
            dVar.resumeWith(is.w.f20676u);
        }
    }

    /* compiled from: NotV4DashboardRepository.kt */
    /* loaded from: classes2.dex */
    public static final class b<T> implements kotlinx.coroutines.flow.e {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.e<List<NotV4RecentModel>> f22308u;

        /* JADX WARN: Multi-variable type inference failed */
        public b(kotlinx.coroutines.flow.e<? super List<NotV4RecentModel>> eVar) {
            this.f22308u = eVar;
        }

        @Override // kotlinx.coroutines.flow.e
        public final Object b(Object obj, ls.d dVar) {
            Object b10 = this.f22308u.b((List) obj, dVar);
            if (b10 != ms.a.COROUTINE_SUSPENDED) {
                return hs.k.f19476a;
            }
            return b10;
        }
    }

    /* compiled from: Emitters.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardRepository$paginate$1$invokeSuspend$$inlined$transform$1", f = "NotV4DashboardRepository.kt", l = {R.styleable.AppCompatTheme_borderlessButtonStyle}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends ns.i implements ss.p<kotlinx.coroutines.flow.e<? super List<? extends NotV4RecentModel>>, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f22309u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f22310v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.d f22311w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ List f22312x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ Query f22313y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f22314z;

        /* compiled from: Emitters.kt */
        /* loaded from: classes2.dex */
        public static final class a<T> implements kotlinx.coroutines.flow.e {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.flow.e<List<? extends NotV4RecentModel>> f22315u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ List f22316v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ Query f22317w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ int f22318x;

            /* compiled from: Emitters.kt */
            @ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardRepository$paginate$1$invokeSuspend$$inlined$transform$1$1", f = "NotV4DashboardRepository.kt", l = {227, 235}, m = "emit")
            /* renamed from: jl.q0$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0333a extends ns.c {
                public ArrayList A;

                /* renamed from: u  reason: collision with root package name */
                public /* synthetic */ Object f22319u;

                /* renamed from: v  reason: collision with root package name */
                public int f22320v;

                /* renamed from: x  reason: collision with root package name */
                public a f22322x;

                /* renamed from: y  reason: collision with root package name */
                public kotlinx.coroutines.flow.e f22323y;

                /* renamed from: z  reason: collision with root package name */
                public ArrayList f22324z;

                public C0333a(ls.d dVar) {
                    super(dVar);
                }

                @Override // ns.a
                public final Object invokeSuspend(Object obj) {
                    this.f22319u = obj;
                    this.f22320v |= LinearLayoutManager.INVALID_OFFSET;
                    return a.this.b(null, this);
                }
            }

            public a(kotlinx.coroutines.flow.e eVar, List list, Query query, int i6) {
                this.f22316v = list;
                this.f22317w = query;
                this.f22318x = i6;
                this.f22315u = eVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x00de A[RETURN] */
            @Override // kotlinx.coroutines.flow.e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object b(T t3, ls.d<? super hs.k> dVar) {
                C0333a c0333a;
                int i6;
                ArrayList arrayList;
                double d10;
                a<T> aVar;
                kotlinx.coroutines.flow.e<List<? extends NotV4RecentModel>> eVar;
                ArrayList arrayList2;
                List<? extends NotV4RecentModel> w22;
                if (dVar instanceof C0333a) {
                    c0333a = (C0333a) dVar;
                    int i10 = c0333a.f22320v;
                    if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        c0333a.f22320v = i10 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj = c0333a.f22319u;
                        ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
                        i6 = c0333a.f22320v;
                        if (i6 == 0) {
                            if (i6 != 1) {
                                if (i6 == 2) {
                                    sp.b.d0(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                arrayList = c0333a.A;
                                arrayList2 = c0333a.f22324z;
                                eVar = c0333a.f22323y;
                                aVar = c0333a.f22322x;
                                sp.b.d0(obj);
                                arrayList.addAll((Collection) obj);
                                aVar.f22316v.clear();
                                List list = aVar.f22316v;
                                list.addAll(arrayList2);
                                w22 = is.u.w2(list);
                                c0333a.f22322x = null;
                                c0333a.f22323y = null;
                                c0333a.f22324z = null;
                                c0333a.getClass();
                                c0333a.A = null;
                                c0333a.f22320v = 2;
                                if (eVar.b(w22, c0333a) == aVar2) {
                                    return aVar2;
                                }
                            }
                        } else {
                            sp.b.d0(obj);
                            long longValue = ((Number) t3).longValue();
                            List list2 = this.f22316v;
                            Long lastAccessedDate = ((NotV4RecentModel) is.u.o2(list2)).getLastAccessedDate();
                            if (lastAccessedDate != null && longValue == lastAccessedDate.longValue()) {
                                arrayList = new ArrayList();
                                c0333a.f22322x = this;
                                kotlinx.coroutines.flow.e<List<? extends NotV4RecentModel>> eVar2 = this.f22315u;
                                c0333a.f22323y = eVar2;
                                c0333a.f22324z = arrayList;
                                c0333a.getClass();
                                c0333a.A = arrayList;
                                c0333a.f22320v = 1;
                                ls.h hVar = new ls.h(ca.a.G0(c0333a));
                                Query orderByChild = this.f22317w.orderByChild("lastAccessedDate");
                                Long lastAccessedDate2 = ((NotV4RecentModel) is.u.o2(list2)).getLastAccessedDate();
                                if (lastAccessedDate2 != null) {
                                    d10 = lastAccessedDate2.longValue();
                                } else {
                                    d10 = 0.0d;
                                }
                                orderByChild.startAfter(d10).limitToLast(this.f22318x).addListenerForSingleValueEvent(new a(hVar));
                                Object b10 = hVar.b();
                                if (b10 == aVar2) {
                                    return aVar2;
                                }
                                aVar = this;
                                eVar = eVar2;
                                obj = b10;
                                arrayList2 = arrayList;
                                arrayList.addAll((Collection) obj);
                                aVar.f22316v.clear();
                                List list3 = aVar.f22316v;
                                list3.addAll(arrayList2);
                                w22 = is.u.w2(list3);
                                c0333a.f22322x = null;
                                c0333a.f22323y = null;
                                c0333a.f22324z = null;
                                c0333a.getClass();
                                c0333a.A = null;
                                c0333a.f22320v = 2;
                                if (eVar.b(w22, c0333a) == aVar2) {
                                }
                            }
                        }
                        return hs.k.f19476a;
                    }
                }
                c0333a = new C0333a(dVar);
                Object obj2 = c0333a.f22319u;
                ms.a aVar22 = ms.a.COROUTINE_SUSPENDED;
                i6 = c0333a.f22320v;
                if (i6 == 0) {
                }
                return hs.k.f19476a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(kotlinx.coroutines.flow.d dVar, ls.d dVar2, List list, Query query, int i6) {
            super(2, dVar2);
            this.f22311w = dVar;
            this.f22312x = list;
            this.f22313y = query;
            this.f22314z = i6;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            c cVar = new c(this.f22311w, dVar, this.f22312x, this.f22313y, this.f22314z);
            cVar.f22310v = obj;
            return cVar;
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.flow.e<? super List<? extends NotV4RecentModel>> eVar, ls.d<? super hs.k> dVar) {
            return ((c) create(eVar, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f22309u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                a aVar2 = new a((kotlinx.coroutines.flow.e) this.f22310v, this.f22312x, this.f22313y, this.f22314z);
                this.f22309u = 1;
                if (this.f22311w.a(aVar2, this) == aVar) {
                    return aVar;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: NotV4DashboardRepository.kt */
    /* loaded from: classes2.dex */
    public static final class d implements ValueEventListener {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ ls.d<Collection<NotV4RecentModel>> f22325u;

        public d(ls.h hVar) {
            this.f22325u = hVar;
        }

        @Override // com.google.firebase.database.ValueEventListener
        public final void onCancelled(DatabaseError error) {
            kotlin.jvm.internal.i.g(error, "error");
            this.f22325u.resumeWith(is.w.f20676u);
        }

        @Override // com.google.firebase.database.ValueEventListener
        public final void onDataChange(DataSnapshot snapshot) {
            kotlin.jvm.internal.i.g(snapshot, "snapshot");
            boolean exists = snapshot.exists();
            ls.d<Collection<NotV4RecentModel>> dVar = this.f22325u;
            if (exists && snapshot.hasChildren()) {
                Iterable<DataSnapshot> children = snapshot.getChildren();
                kotlin.jvm.internal.i.f(children, "snapshot.children");
                ArrayList arrayList = new ArrayList();
                for (DataSnapshot dataSnapshot : children) {
                    NotV4RecentModel notV4RecentModel = (NotV4RecentModel) dataSnapshot.getValue(NotV4RecentModel.class);
                    if (notV4RecentModel != null) {
                        arrayList.add(notV4RecentModel);
                    }
                }
                dVar.resumeWith(arrayList);
                return;
            }
            dVar.resumeWith(is.w.f20676u);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(kotlinx.coroutines.flow.d<Long> dVar, Query query, int i6, ls.d<? super q0> dVar2) {
        super(2, dVar2);
        this.f22305y = dVar;
        this.f22306z = query;
        this.A = i6;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        q0 q0Var = new q0(this.f22305y, this.f22306z, this.A, dVar);
        q0Var.f22304x = obj;
        return q0Var;
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.flow.e<? super List<? extends NotV4RecentModel>> eVar, ls.d<? super hs.k> dVar) {
        return ((q0) create(eVar, dVar)).invokeSuspend(hs.k.f19476a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ae A[RETURN] */
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
        b bVar;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f22303w;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 == 3) {
                        sp.b.d0(obj);
                        return hs.k.f19476a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                List list3 = this.f22301u;
                eVar2 = (kotlinx.coroutines.flow.e) this.f22304x;
                sp.b.d0(obj);
                list2 = list3;
                rVar = new kotlinx.coroutines.flow.r(new c(this.f22305y, null, list2, this.f22306z, this.A));
                bVar = new b(eVar2);
                this.f22304x = null;
                this.f22301u = null;
                this.f22303w = 3;
                if (rVar.a(bVar, this) == aVar) {
                    return aVar;
                }
                return hs.k.f19476a;
            }
            arrayList = this.f22302v;
            list = this.f22301u;
            eVar = (kotlinx.coroutines.flow.e) this.f22304x;
            sp.b.d0(obj);
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.flow.e eVar3 = (kotlinx.coroutines.flow.e) this.f22304x;
            arrayList = new ArrayList();
            this.f22304x = eVar3;
            this.f22301u = arrayList;
            Query query = this.f22306z;
            this.f22302v = arrayList;
            this.f22303w = 1;
            ls.h hVar = new ls.h(ca.a.G0(this));
            query.orderByChild("lastAccessedDate").limitToLast(this.A).addListenerForSingleValueEvent(new d(hVar));
            Object b10 = hVar.b();
            if (b10 == aVar) {
                return aVar;
            }
            eVar = eVar3;
            obj = b10;
            list = arrayList;
        }
        arrayList.addAll((Collection) obj);
        List w22 = is.u.w2(list);
        this.f22304x = eVar;
        this.f22301u = list;
        this.f22302v = null;
        this.f22303w = 2;
        if (eVar.b(w22, this) == aVar) {
            return aVar;
        }
        list2 = list;
        eVar2 = eVar;
        rVar = new kotlinx.coroutines.flow.r(new c(this.f22305y, null, list2, this.f22306z, this.A));
        bVar = new b(eVar2);
        this.f22304x = null;
        this.f22301u = null;
        this.f22303w = 3;
        if (rVar.a(bVar, this) == aVar) {
        }
        return hs.k.f19476a;
    }
}
