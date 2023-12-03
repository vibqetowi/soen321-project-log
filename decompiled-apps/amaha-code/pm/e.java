package pm;

import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.appsflyer.R;
import fe.g;
import fe.r;
import hs.k;
import is.u;
import is.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.v;
import ls.h;
import ns.i;
import ss.p;
/* compiled from: JournalFirebaseRepository.kt */
@ns.e(c = "com.theinnerhour.b2b.components.journal.repository.JournalFirebaseRepository$paginate$1", f = "JournalFirebaseRepository.kt", l = {183, 194, 269}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class e extends i implements p<kotlinx.coroutines.flow.e<? super List<? extends g>>, ls.d<? super k>, Object> {
    public final /* synthetic */ long A;
    public final /* synthetic */ LiveData<List<String>> B;
    public final /* synthetic */ LiveData<String> C;

    /* renamed from: u  reason: collision with root package name */
    public List f28692u;

    /* renamed from: v  reason: collision with root package name */
    public ArrayList f28693v;

    /* renamed from: w  reason: collision with root package name */
    public int f28694w;

    /* renamed from: x  reason: collision with root package name */
    public /* synthetic */ Object f28695x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.d<Integer> f28696y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.firestore.d f28697z;

    /* compiled from: JournalFirebaseRepository.kt */
    /* loaded from: classes2.dex */
    public static final class a<TResult> implements ya.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ls.d<Collection<? extends g>> f28698a;

        public a(h hVar) {
            this.f28698a = hVar;
        }

        @Override // ya.d
        public final void a(ya.h<r> it) {
            kotlin.jvm.internal.i.g(it, "it");
            boolean isSuccessful = it.isSuccessful();
            ls.d<Collection<? extends g>> dVar = this.f28698a;
            if (isSuccessful) {
                dVar.resumeWith(it.getResult().e());
            } else {
                dVar.resumeWith(w.f20676u);
            }
        }
    }

    /* compiled from: JournalFirebaseRepository.kt */
    /* loaded from: classes2.dex */
    public static final class b<TResult> implements ya.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ls.d<Collection<? extends g>> f28699a;

        public b(h hVar) {
            this.f28699a = hVar;
        }

        @Override // ya.d
        public final void a(ya.h<r> it) {
            kotlin.jvm.internal.i.g(it, "it");
            boolean isSuccessful = it.isSuccessful();
            ls.d<Collection<? extends g>> dVar = this.f28699a;
            if (isSuccessful) {
                dVar.resumeWith(it.getResult().e());
            } else {
                dVar.resumeWith(w.f20676u);
            }
        }
    }

    /* compiled from: JournalFirebaseRepository.kt */
    /* loaded from: classes2.dex */
    public static final class c<TResult> implements ya.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ls.d<Collection<? extends g>> f28700a;

        public c(h hVar) {
            this.f28700a = hVar;
        }

        @Override // ya.d
        public final void a(ya.h<r> it) {
            kotlin.jvm.internal.i.g(it, "it");
            boolean isSuccessful = it.isSuccessful();
            ls.d<Collection<? extends g>> dVar = this.f28700a;
            if (isSuccessful) {
                dVar.resumeWith(it.getResult().e());
            } else {
                dVar.resumeWith(w.f20676u);
            }
        }
    }

    /* compiled from: JournalFirebaseRepository.kt */
    /* loaded from: classes2.dex */
    public static final class d<T> implements kotlinx.coroutines.flow.e {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.e<List<? extends g>> f28701u;

        /* JADX WARN: Multi-variable type inference failed */
        public d(kotlinx.coroutines.flow.e<? super List<? extends g>> eVar) {
            this.f28701u = eVar;
        }

        @Override // kotlinx.coroutines.flow.e
        public final Object b(Object obj, ls.d dVar) {
            Object b10 = this.f28701u.b((List) obj, dVar);
            if (b10 != ms.a.COROUTINE_SUSPENDED) {
                return k.f19476a;
            }
            return b10;
        }
    }

    /* compiled from: Emitters.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.journal.repository.JournalFirebaseRepository$paginate$1$invokeSuspend$$inlined$transform$1", f = "JournalFirebaseRepository.kt", l = {R.styleable.AppCompatTheme_borderlessButtonStyle}, m = "invokeSuspend")
    /* renamed from: pm.e$e  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0483e extends i implements p<kotlinx.coroutines.flow.e<? super List<g>>, ls.d<? super k>, Object> {
        public final /* synthetic */ long A;
        public final /* synthetic */ LiveData B;
        public final /* synthetic */ LiveData C;

        /* renamed from: u  reason: collision with root package name */
        public int f28702u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f28703v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.d f28704w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ v f28705x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ List f28706y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ com.google.firebase.firestore.d f28707z;

        /* compiled from: Emitters.kt */
        /* renamed from: pm.e$e$a */
        /* loaded from: classes2.dex */
        public static final class a<T> implements kotlinx.coroutines.flow.e {
            public final /* synthetic */ LiveData A;

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.flow.e<List<g>> f28708u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ v f28709v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ List f28710w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ com.google.firebase.firestore.d f28711x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ long f28712y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ LiveData f28713z;

            /* compiled from: Emitters.kt */
            @ns.e(c = "com.theinnerhour.b2b.components.journal.repository.JournalFirebaseRepository$paginate$1$invokeSuspend$$inlined$transform$1$1", f = "JournalFirebaseRepository.kt", l = {227, 254, 259, 286}, m = "emit")
            /* renamed from: pm.e$e$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0484a extends ns.c {
                public Object A;
                public List B;

                /* renamed from: u  reason: collision with root package name */
                public /* synthetic */ Object f28714u;

                /* renamed from: v  reason: collision with root package name */
                public int f28715v;

                /* renamed from: x  reason: collision with root package name */
                public a f28717x;

                /* renamed from: y  reason: collision with root package name */
                public kotlinx.coroutines.flow.e f28718y;

                /* renamed from: z  reason: collision with root package name */
                public Object f28719z;

                public C0484a(ls.d dVar) {
                    super(dVar);
                }

                @Override // ns.a
                public final Object invokeSuspend(Object obj) {
                    this.f28714u = obj;
                    this.f28715v |= LinearLayoutManager.INVALID_OFFSET;
                    return a.this.b(null, this);
                }
            }

            public a(kotlinx.coroutines.flow.e eVar, v vVar, List list, com.google.firebase.firestore.d dVar, long j10, LiveData liveData, LiveData liveData2) {
                this.f28709v = vVar;
                this.f28710w = list;
                this.f28711x = dVar;
                this.f28712y = j10;
                this.f28713z = liveData;
                this.A = liveData2;
                this.f28708u = eVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x016d A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:59:0x016e  */
            /* JADX WARN: Removed duplicated region for block: B:97:0x023a A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:98:0x023b  */
            @Override // kotlinx.coroutines.flow.e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object b(T t3, ls.d<? super k> dVar) {
                C0484a c0484a;
                int i6;
                List list;
                ms.a aVar;
                a<T> aVar2;
                kotlinx.coroutines.flow.e<List<g>> eVar;
                ms.a aVar3;
                a<T> aVar4;
                kotlinx.coroutines.flow.e<List<g>> eVar2;
                List<g> list2;
                a<T> aVar5;
                List<g> list3;
                a<T> aVar6;
                if (dVar instanceof C0484a) {
                    c0484a = (C0484a) dVar;
                    int i10 = c0484a.f28715v;
                    if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        c0484a.f28715v = i10 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj = c0484a.f28714u;
                        ms.a aVar7 = ms.a.COROUTINE_SUSPENDED;
                        i6 = c0484a.f28715v;
                        if (i6 == 0) {
                            if (i6 != 1) {
                                if (i6 != 2) {
                                    if (i6 != 3) {
                                        if (i6 == 4) {
                                            aVar6 = c0484a.f28717x;
                                            sp.b.d0(obj);
                                            aVar6.f28709v.f23467u = aVar6.f28710w.size();
                                        } else {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                    } else {
                                        List list4 = (List) c0484a.A;
                                        C0484a c0484a2 = (C0484a) c0484a.f28719z;
                                        eVar = c0484a.f28718y;
                                        aVar2 = c0484a.f28717x;
                                        sp.b.d0(obj);
                                        aVar = aVar7;
                                        list = list4;
                                        list.addAll((Collection) obj);
                                        list3 = aVar2.f28710w;
                                        c0484a.f28717x = aVar2;
                                        c0484a.f28718y = null;
                                        c0484a.f28719z = null;
                                        c0484a.A = null;
                                        c0484a.f28715v = 4;
                                        if (eVar.b(list3, c0484a) != aVar) {
                                            return aVar;
                                        }
                                        aVar6 = aVar2;
                                        aVar6.f28709v.f23467u = aVar6.f28710w.size();
                                    }
                                } else {
                                    aVar5 = c0484a.f28717x;
                                    sp.b.d0(obj);
                                    v vVar = aVar5.f28709v;
                                    vVar.f23467u = aVar5.f28710w.size() + vVar.f23467u;
                                }
                            } else {
                                List list5 = c0484a.B;
                                C0484a c0484a3 = (C0484a) c0484a.A;
                                g gVar = (g) c0484a.f28719z;
                                eVar2 = c0484a.f28718y;
                                aVar4 = c0484a.f28717x;
                                sp.b.d0(obj);
                                aVar3 = aVar7;
                                list = list5;
                                list.addAll((Collection) obj);
                                list2 = aVar4.f28710w;
                                c0484a.f28717x = aVar4;
                                c0484a.f28718y = null;
                                c0484a.f28719z = null;
                                c0484a.A = null;
                                c0484a.B = null;
                                c0484a.f28715v = 2;
                                if (eVar2.b(list2, c0484a) != aVar3) {
                                    return aVar3;
                                }
                                aVar5 = aVar4;
                                v vVar2 = aVar5.f28709v;
                                vVar2.f23467u = aVar5.f28710w.size() + vVar2.f23467u;
                            }
                        } else {
                            sp.b.d0(obj);
                            int intValue = ((Number) t3).intValue();
                            int i11 = this.f28709v.f23467u;
                            LiveData liveData = this.A;
                            long j10 = this.f28712y;
                            com.google.firebase.firestore.d dVar2 = this.f28711x;
                            boolean z10 = false;
                            LiveData liveData2 = this.f28713z;
                            list = this.f28710w;
                            kotlinx.coroutines.flow.e<List<g>> eVar3 = this.f28708u;
                            if (intValue == i11 && list.size() > 0) {
                                g gVar2 = (g) u.o2(list);
                                list.clear();
                                c0484a.f28717x = this;
                                c0484a.f28718y = eVar3;
                                c0484a.f28719z = gVar2;
                                c0484a.A = c0484a;
                                c0484a.B = list;
                                c0484a.f28715v = 1;
                                h hVar = new h(ca.a.G0(c0484a));
                                com.google.firebase.firestore.d b10 = dVar2.g(gVar2).b(j10);
                                List list6 = (List) liveData2.d();
                                if (list6 != null && (!list6.isEmpty())) {
                                    z10 = true;
                                }
                                if (z10) {
                                    Object d10 = liveData2.d();
                                    kotlin.jvm.internal.i.d(d10);
                                    b10 = b10.o("templateType", (List) d10);
                                }
                                String str = (String) liveData.d();
                                if (str != null) {
                                    int hashCode = str.hashCode();
                                    if (hashCode != 1071145194) {
                                        if (hashCode != 1383663147) {
                                            if (hashCode == 2024517362 && str.equals("DRAFTS")) {
                                                b10 = b10.m(Boolean.TRUE, "isDraft");
                                            }
                                        } else if (str.equals("COMPLETED")) {
                                            b10 = b10.m(Boolean.FALSE, "isDraft");
                                        }
                                    } else if (str.equals("FAVOURITES")) {
                                        b10 = b10.m(Boolean.TRUE, "isFavourite");
                                    }
                                }
                                b10.a().addOnCompleteListener(new b(hVar));
                                obj = hVar.b();
                                aVar3 = aVar7;
                                if (obj == aVar3) {
                                    return aVar3;
                                }
                                aVar4 = this;
                                eVar2 = eVar3;
                                list.addAll((Collection) obj);
                                list2 = aVar4.f28710w;
                                c0484a.f28717x = aVar4;
                                c0484a.f28718y = null;
                                c0484a.f28719z = null;
                                c0484a.A = null;
                                c0484a.B = null;
                                c0484a.f28715v = 2;
                                if (eVar2.b(list2, c0484a) != aVar3) {
                                }
                            } else if (intValue == -1) {
                                list.clear();
                                c0484a.f28717x = this;
                                c0484a.f28718y = eVar3;
                                c0484a.f28719z = c0484a;
                                c0484a.A = list;
                                c0484a.f28715v = 3;
                                h hVar2 = new h(ca.a.G0(c0484a));
                                com.google.firebase.firestore.d b11 = dVar2.b(j10);
                                List list7 = (List) liveData2.d();
                                if (list7 != null && (!list7.isEmpty())) {
                                    z10 = true;
                                }
                                if (z10) {
                                    Object d11 = liveData2.d();
                                    kotlin.jvm.internal.i.d(d11);
                                    b11 = b11.o("templateType", (List) d11);
                                }
                                String str2 = (String) liveData.d();
                                if (str2 != null) {
                                    int hashCode2 = str2.hashCode();
                                    if (hashCode2 != 1071145194) {
                                        if (hashCode2 != 1383663147) {
                                            if (hashCode2 == 2024517362 && str2.equals("DRAFTS")) {
                                                b11 = b11.m(Boolean.TRUE, "isDraft");
                                            }
                                        } else if (str2.equals("COMPLETED")) {
                                            b11 = b11.m(Boolean.FALSE, "isDraft");
                                        }
                                    } else if (str2.equals("FAVOURITES")) {
                                        b11 = b11.m(Boolean.TRUE, "isFavourite");
                                    }
                                }
                                b11.a().addOnCompleteListener(new c(hVar2));
                                Object b12 = hVar2.b();
                                aVar = aVar7;
                                if (b12 == aVar) {
                                    return aVar;
                                }
                                aVar2 = this;
                                eVar = eVar3;
                                obj = b12;
                                list.addAll((Collection) obj);
                                list3 = aVar2.f28710w;
                                c0484a.f28717x = aVar2;
                                c0484a.f28718y = null;
                                c0484a.f28719z = null;
                                c0484a.A = null;
                                c0484a.f28715v = 4;
                                if (eVar.b(list3, c0484a) != aVar) {
                                }
                            }
                        }
                        return k.f19476a;
                    }
                }
                c0484a = new C0484a(dVar);
                Object obj2 = c0484a.f28714u;
                ms.a aVar72 = ms.a.COROUTINE_SUSPENDED;
                i6 = c0484a.f28715v;
                if (i6 == 0) {
                }
                return k.f19476a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0483e(kotlinx.coroutines.flow.d dVar, ls.d dVar2, v vVar, List list, com.google.firebase.firestore.d dVar3, long j10, LiveData liveData, LiveData liveData2) {
            super(2, dVar2);
            this.f28704w = dVar;
            this.f28705x = vVar;
            this.f28706y = list;
            this.f28707z = dVar3;
            this.A = j10;
            this.B = liveData;
            this.C = liveData2;
        }

        @Override // ns.a
        public final ls.d<k> create(Object obj, ls.d<?> dVar) {
            C0483e c0483e = new C0483e(this.f28704w, dVar, this.f28705x, this.f28706y, this.f28707z, this.A, this.B, this.C);
            c0483e.f28703v = obj;
            return c0483e;
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.flow.e<? super List<g>> eVar, ls.d<? super k> dVar) {
            return ((C0483e) create(eVar, dVar)).invokeSuspend(k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f28702u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                a aVar2 = new a((kotlinx.coroutines.flow.e) this.f28703v, this.f28705x, this.f28706y, this.f28707z, this.A, this.B, this.C);
                this.f28702u = 1;
                if (this.f28704w.a(aVar2, this) == aVar) {
                    return aVar;
                }
            }
            return k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(kotlinx.coroutines.flow.d<Integer> dVar, com.google.firebase.firestore.d dVar2, long j10, LiveData<List<String>> liveData, LiveData<String> liveData2, ls.d<? super e> dVar3) {
        super(2, dVar3);
        this.f28696y = dVar;
        this.f28697z = dVar2;
        this.A = j10;
        this.B = liveData;
        this.C = liveData2;
    }

    @Override // ns.a
    public final ls.d<k> create(Object obj, ls.d<?> dVar) {
        e eVar = new e(this.f28696y, this.f28697z, this.A, this.B, this.C, dVar);
        eVar.f28695x = obj;
        return eVar;
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.flow.e<? super List<? extends g>> eVar, ls.d<? super k> dVar) {
        return ((e) create(eVar, dVar)).invokeSuspend(k.f19476a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c0 A[RETURN] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.List] */
    @Override // ns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b10;
        kotlinx.coroutines.flow.e eVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        kotlinx.coroutines.flow.e eVar2;
        kotlinx.coroutines.flow.r rVar;
        d dVar;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f28694w;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 == 3) {
                        sp.b.d0(obj);
                        return k.f19476a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ?? r22 = this.f28692u;
                eVar2 = (kotlinx.coroutines.flow.e) this.f28695x;
                sp.b.d0(obj);
                arrayList3 = r22;
                v vVar = new v();
                vVar.f23467u = arrayList3.size();
                rVar = new kotlinx.coroutines.flow.r(new C0483e(this.f28696y, null, vVar, arrayList3, this.f28697z, this.A, this.B, this.C));
                dVar = new d(eVar2);
                this.f28695x = null;
                this.f28692u = null;
                this.f28694w = 3;
                if (rVar.a(dVar, this) == aVar) {
                    return aVar;
                }
                return k.f19476a;
            }
            arrayList = this.f28693v;
            ?? r32 = this.f28692u;
            sp.b.d0(obj);
            eVar = (kotlinx.coroutines.flow.e) this.f28695x;
            b10 = obj;
            arrayList2 = r32;
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.flow.e eVar3 = (kotlinx.coroutines.flow.e) this.f28695x;
            ArrayList arrayList4 = new ArrayList();
            this.f28695x = eVar3;
            this.f28692u = arrayList4;
            com.google.firebase.firestore.d dVar2 = this.f28697z;
            this.f28693v = arrayList4;
            this.f28694w = 1;
            h hVar = new h(ca.a.G0(this));
            dVar2.b(this.A).a().addOnCompleteListener(new a(hVar));
            b10 = hVar.b();
            if (b10 == aVar) {
                return aVar;
            }
            eVar = eVar3;
            arrayList = arrayList4;
            arrayList2 = arrayList4;
        }
        arrayList.addAll((Collection) b10);
        this.f28695x = eVar;
        this.f28692u = arrayList2;
        this.f28693v = null;
        this.f28694w = 2;
        if (eVar.b(arrayList2, this) == aVar) {
            return aVar;
        }
        arrayList3 = arrayList2;
        eVar2 = eVar;
        v vVar2 = new v();
        vVar2.f23467u = arrayList3.size();
        rVar = new kotlinx.coroutines.flow.r(new C0483e(this.f28696y, null, vVar2, arrayList3, this.f28697z, this.A, this.B, this.C));
        dVar = new d(eVar2);
        this.f28695x = null;
        this.f28692u = null;
        this.f28694w = 3;
        if (rVar.a(dVar, this) == aVar) {
        }
        return k.f19476a;
    }
}
