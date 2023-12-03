package cn;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.appsflyer.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.theinnerhour.b2b.components.libraryExperiment.model.UserLibraryItemAccessModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: LibraryViewModelRepository.kt */
@ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.LibraryViewModelRepository$paginate$2", f = "LibraryViewModelRepository.kt", l = {293, 311, 342}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class q1 extends ns.i implements ss.p<kotlinx.coroutines.flow.e<? super List<? extends UserLibraryItemAccessModel>>, ls.d<? super hs.k>, Object> {
    public final /* synthetic */ int A;

    /* renamed from: u  reason: collision with root package name */
    public List f5728u;

    /* renamed from: v  reason: collision with root package name */
    public ArrayList f5729v;

    /* renamed from: w  reason: collision with root package name */
    public int f5730w;

    /* renamed from: x  reason: collision with root package name */
    public /* synthetic */ Object f5731x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.d<Long> f5732y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Query f5733z;

    /* compiled from: LibraryViewModelRepository.kt */
    /* loaded from: classes2.dex */
    public static final class a implements ValueEventListener {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ ls.d<Collection<UserLibraryItemAccessModel>> f5734u;

        public a(ls.h hVar) {
            this.f5734u = hVar;
        }

        @Override // com.google.firebase.database.ValueEventListener
        public final void onCancelled(DatabaseError error) {
            kotlin.jvm.internal.i.g(error, "error");
            this.f5734u.resumeWith(is.w.f20676u);
        }

        @Override // com.google.firebase.database.ValueEventListener
        public final void onDataChange(DataSnapshot snapshot) {
            kotlin.jvm.internal.i.g(snapshot, "snapshot");
            boolean exists = snapshot.exists();
            ls.d<Collection<UserLibraryItemAccessModel>> dVar = this.f5734u;
            if (exists && snapshot.hasChildren()) {
                Iterable<DataSnapshot> children = snapshot.getChildren();
                kotlin.jvm.internal.i.f(children, "snapshot.children");
                ArrayList arrayList = new ArrayList();
                for (DataSnapshot dataSnapshot : children) {
                    UserLibraryItemAccessModel userLibraryItemAccessModel = (UserLibraryItemAccessModel) dataSnapshot.getValue(UserLibraryItemAccessModel.class);
                    if (userLibraryItemAccessModel != null) {
                        arrayList.add(userLibraryItemAccessModel);
                    }
                }
                dVar.resumeWith(arrayList);
                return;
            }
            dVar.resumeWith(is.w.f20676u);
        }
    }

    /* compiled from: LibraryViewModelRepository.kt */
    /* loaded from: classes2.dex */
    public static final class b<T> implements kotlinx.coroutines.flow.e {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.e<List<UserLibraryItemAccessModel>> f5735u;

        /* JADX WARN: Multi-variable type inference failed */
        public b(kotlinx.coroutines.flow.e<? super List<UserLibraryItemAccessModel>> eVar) {
            this.f5735u = eVar;
        }

        @Override // kotlinx.coroutines.flow.e
        public final Object b(Object obj, ls.d dVar) {
            Object b10 = this.f5735u.b((List) obj, dVar);
            if (b10 != ms.a.COROUTINE_SUSPENDED) {
                return hs.k.f19476a;
            }
            return b10;
        }
    }

    /* compiled from: Emitters.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.LibraryViewModelRepository$paginate$2$invokeSuspend$$inlined$transform$1", f = "LibraryViewModelRepository.kt", l = {R.styleable.AppCompatTheme_borderlessButtonStyle}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends ns.i implements ss.p<kotlinx.coroutines.flow.e<? super List<UserLibraryItemAccessModel>>, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f5736u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f5737v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.d f5738w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ List f5739x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ Query f5740y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f5741z;

        /* compiled from: Emitters.kt */
        /* loaded from: classes2.dex */
        public static final class a<T> implements kotlinx.coroutines.flow.e {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.flow.e<List<UserLibraryItemAccessModel>> f5742u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ List f5743v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ Query f5744w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ int f5745x;

            /* compiled from: Emitters.kt */
            @ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.LibraryViewModelRepository$paginate$2$invokeSuspend$$inlined$transform$1$1", f = "LibraryViewModelRepository.kt", l = {227, 236}, m = "emit")
            /* renamed from: cn.q1$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0122a extends ns.c {
                public ArrayList A;

                /* renamed from: u  reason: collision with root package name */
                public /* synthetic */ Object f5746u;

                /* renamed from: v  reason: collision with root package name */
                public int f5747v;

                /* renamed from: x  reason: collision with root package name */
                public a f5749x;

                /* renamed from: y  reason: collision with root package name */
                public kotlinx.coroutines.flow.e f5750y;

                /* renamed from: z  reason: collision with root package name */
                public ArrayList f5751z;

                public C0122a(ls.d dVar) {
                    super(dVar);
                }

                @Override // ns.a
                public final Object invokeSuspend(Object obj) {
                    this.f5746u = obj;
                    this.f5747v |= LinearLayoutManager.INVALID_OFFSET;
                    return a.this.b(null, this);
                }
            }

            public a(kotlinx.coroutines.flow.e eVar, List list, Query query, int i6) {
                this.f5743v = list;
                this.f5744w = query;
                this.f5745x = i6;
                this.f5742u = eVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x00e0 A[RETURN] */
            @Override // kotlinx.coroutines.flow.e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object b(T t3, ls.d<? super hs.k> dVar) {
                C0122a c0122a;
                int i6;
                boolean z10;
                ArrayList arrayList;
                double d10;
                a<T> aVar;
                kotlinx.coroutines.flow.e<List<UserLibraryItemAccessModel>> eVar;
                ArrayList arrayList2;
                Long lastAccessedDate;
                List<UserLibraryItemAccessModel> list;
                if (dVar instanceof C0122a) {
                    c0122a = (C0122a) dVar;
                    int i10 = c0122a.f5747v;
                    if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        c0122a.f5747v = i10 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj = c0122a.f5746u;
                        ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
                        i6 = c0122a.f5747v;
                        if (i6 == 0) {
                            if (i6 != 1) {
                                if (i6 == 2) {
                                    sp.b.d0(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                arrayList = c0122a.A;
                                arrayList2 = c0122a.f5751z;
                                eVar = c0122a.f5750y;
                                aVar = c0122a.f5749x;
                                sp.b.d0(obj);
                                arrayList.addAll((Collection) obj);
                                aVar.f5743v.clear();
                                list = aVar.f5743v;
                                list.addAll(arrayList2);
                                c0122a.f5749x = null;
                                c0122a.f5750y = null;
                                c0122a.f5751z = null;
                                c0122a.getClass();
                                c0122a.A = null;
                                c0122a.f5747v = 2;
                                if (eVar.b(list, c0122a) == aVar2) {
                                    return aVar2;
                                }
                            }
                        } else {
                            sp.b.d0(obj);
                            long longValue = ((Number) t3).longValue();
                            List list2 = this.f5743v;
                            UserLibraryItemAccessModel userLibraryItemAccessModel = (UserLibraryItemAccessModel) is.u.p2(list2);
                            if (userLibraryItemAccessModel != null && (lastAccessedDate = userLibraryItemAccessModel.getLastAccessedDate()) != null && longValue == lastAccessedDate.longValue()) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                arrayList = new ArrayList();
                                c0122a.f5749x = this;
                                kotlinx.coroutines.flow.e<List<UserLibraryItemAccessModel>> eVar2 = this.f5742u;
                                c0122a.f5750y = eVar2;
                                c0122a.f5751z = arrayList;
                                c0122a.getClass();
                                c0122a.A = arrayList;
                                c0122a.f5747v = 1;
                                ls.h hVar = new ls.h(ca.a.G0(c0122a));
                                Query orderByChild = this.f5744w.orderByChild("lastAccessedDate");
                                Long lastAccessedDate2 = ((UserLibraryItemAccessModel) is.u.o2(list2)).getLastAccessedDate();
                                if (lastAccessedDate2 != null) {
                                    d10 = lastAccessedDate2.longValue();
                                } else {
                                    d10 = 0.0d;
                                }
                                orderByChild.startAfter(d10).limitToFirst(this.f5745x).addListenerForSingleValueEvent(new a(hVar));
                                Object b10 = hVar.b();
                                if (b10 == aVar2) {
                                    return aVar2;
                                }
                                aVar = this;
                                eVar = eVar2;
                                obj = b10;
                                arrayList2 = arrayList;
                                arrayList.addAll((Collection) obj);
                                aVar.f5743v.clear();
                                list = aVar.f5743v;
                                list.addAll(arrayList2);
                                c0122a.f5749x = null;
                                c0122a.f5750y = null;
                                c0122a.f5751z = null;
                                c0122a.getClass();
                                c0122a.A = null;
                                c0122a.f5747v = 2;
                                if (eVar.b(list, c0122a) == aVar2) {
                                }
                            }
                        }
                        return hs.k.f19476a;
                    }
                }
                c0122a = new C0122a(dVar);
                Object obj2 = c0122a.f5746u;
                ms.a aVar22 = ms.a.COROUTINE_SUSPENDED;
                i6 = c0122a.f5747v;
                if (i6 == 0) {
                }
                return hs.k.f19476a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(kotlinx.coroutines.flow.d dVar, ls.d dVar2, List list, Query query, int i6) {
            super(2, dVar2);
            this.f5738w = dVar;
            this.f5739x = list;
            this.f5740y = query;
            this.f5741z = i6;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            c cVar = new c(this.f5738w, dVar, this.f5739x, this.f5740y, this.f5741z);
            cVar.f5737v = obj;
            return cVar;
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.flow.e<? super List<UserLibraryItemAccessModel>> eVar, ls.d<? super hs.k> dVar) {
            return ((c) create(eVar, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f5736u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                a aVar2 = new a((kotlinx.coroutines.flow.e) this.f5737v, this.f5739x, this.f5740y, this.f5741z);
                this.f5736u = 1;
                if (this.f5738w.a(aVar2, this) == aVar) {
                    return aVar;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: LibraryViewModelRepository.kt */
    /* loaded from: classes2.dex */
    public static final class d implements ValueEventListener {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ ls.d<Collection<UserLibraryItemAccessModel>> f5752u;

        public d(ls.h hVar) {
            this.f5752u = hVar;
        }

        @Override // com.google.firebase.database.ValueEventListener
        public final void onCancelled(DatabaseError error) {
            kotlin.jvm.internal.i.g(error, "error");
            this.f5752u.resumeWith(is.w.f20676u);
        }

        @Override // com.google.firebase.database.ValueEventListener
        public final void onDataChange(DataSnapshot snapshot) {
            kotlin.jvm.internal.i.g(snapshot, "snapshot");
            boolean exists = snapshot.exists();
            ls.d<Collection<UserLibraryItemAccessModel>> dVar = this.f5752u;
            if (exists && snapshot.hasChildren()) {
                Iterable<DataSnapshot> children = snapshot.getChildren();
                kotlin.jvm.internal.i.f(children, "snapshot.children");
                ArrayList arrayList = new ArrayList();
                for (DataSnapshot dataSnapshot : children) {
                    UserLibraryItemAccessModel userLibraryItemAccessModel = (UserLibraryItemAccessModel) dataSnapshot.getValue(UserLibraryItemAccessModel.class);
                    if (userLibraryItemAccessModel != null) {
                        arrayList.add(userLibraryItemAccessModel);
                    }
                }
                dVar.resumeWith(arrayList);
                return;
            }
            dVar.resumeWith(is.w.f20676u);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(kotlinx.coroutines.flow.d<Long> dVar, Query query, int i6, ls.d<? super q1> dVar2) {
        super(2, dVar2);
        this.f5732y = dVar;
        this.f5733z = query;
        this.A = i6;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        q1 q1Var = new q1(this.f5732y, this.f5733z, this.A, dVar);
        q1Var.f5731x = obj;
        return q1Var;
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.flow.e<? super List<? extends UserLibraryItemAccessModel>> eVar, ls.d<? super hs.k> dVar) {
        return ((q1) create(eVar, dVar)).invokeSuspend(hs.k.f19476a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa A[RETURN] */
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
        int i6 = this.f5730w;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 == 3) {
                        sp.b.d0(obj);
                        return hs.k.f19476a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                List list3 = this.f5728u;
                eVar2 = (kotlinx.coroutines.flow.e) this.f5731x;
                sp.b.d0(obj);
                list2 = list3;
                rVar = new kotlinx.coroutines.flow.r(new c(this.f5732y, null, list2, this.f5733z, this.A));
                bVar = new b(eVar2);
                this.f5731x = null;
                this.f5728u = null;
                this.f5730w = 3;
                if (rVar.a(bVar, this) == aVar) {
                    return aVar;
                }
                return hs.k.f19476a;
            }
            arrayList = this.f5729v;
            list = this.f5728u;
            eVar = (kotlinx.coroutines.flow.e) this.f5731x;
            sp.b.d0(obj);
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.flow.e eVar3 = (kotlinx.coroutines.flow.e) this.f5731x;
            arrayList = new ArrayList();
            this.f5731x = eVar3;
            this.f5728u = arrayList;
            Query query = this.f5733z;
            this.f5729v = arrayList;
            this.f5730w = 1;
            ls.h hVar = new ls.h(ca.a.G0(this));
            query.orderByChild("lastAccessedDate").limitToFirst(this.A).addListenerForSingleValueEvent(new d(hVar));
            Object b10 = hVar.b();
            if (b10 == aVar) {
                return aVar;
            }
            eVar = eVar3;
            obj = b10;
            list = arrayList;
        }
        arrayList.addAll((Collection) obj);
        this.f5731x = eVar;
        this.f5728u = list;
        this.f5729v = null;
        this.f5730w = 2;
        if (eVar.b(list, this) == aVar) {
            return aVar;
        }
        list2 = list;
        eVar2 = eVar;
        rVar = new kotlinx.coroutines.flow.r(new c(this.f5732y, null, list2, this.f5733z, this.A));
        bVar = new b(eVar2);
        this.f5731x = null;
        this.f5728u = null;
        this.f5730w = 3;
        if (rVar.a(bVar, this) == aVar) {
        }
        return hs.k.f19476a;
    }
}
