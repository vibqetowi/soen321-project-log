package jl;

import com.appsflyer.R;
import com.theinnerhour.b2b.components.libraryExperiment.model.UserLibraryItemAccessModel;
import com.theinnerhour.b2b.utils.Constants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* compiled from: NewDashboardSavedItemsViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NewDashboardSavedItemsViewModel$fetchInfoForItems$1", f = "NewDashboardSavedItemsViewModel.kt", l = {R.styleable.AppCompatTheme_colorControlNormal}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class d0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f22117u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ List<UserLibraryItemAccessModel> f22118v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ k0 f22119w;

    /* compiled from: NewDashboardSavedItemsViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NewDashboardSavedItemsViewModel$fetchInfoForItems$1$1", f = "NewDashboardSavedItemsViewModel.kt", l = {R.styleable.AppCompatTheme_ratingBarStyleSmall}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f22120u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f22121v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ List<UserLibraryItemAccessModel> f22122w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ k0 f22123x;

        /* compiled from: NewDashboardSavedItemsViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NewDashboardSavedItemsViewModel$fetchInfoForItems$1$1$2", f = "NewDashboardSavedItemsViewModel.kt", l = {R.styleable.AppCompatTheme_searchViewStyle}, m = "invokeSuspend")
        /* renamed from: jl.d0$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0329a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super Boolean>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f22124u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ k0 f22125v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ArrayList<String> f22126w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0329a(k0 k0Var, ArrayList<String> arrayList, ls.d<? super C0329a> dVar) {
                super(2, dVar);
                this.f22125v = k0Var;
                this.f22126w = arrayList;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new C0329a(this.f22125v, this.f22126w, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super Boolean> dVar) {
                return ((C0329a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f22124u;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    this.f22124u = 1;
                    k0 k0Var = this.f22125v;
                    k0Var.getClass();
                    ls.h hVar = new ls.h(ca.a.G0(this));
                    ArrayList<String> arrayList = this.f22126w;
                    if (arrayList.isEmpty()) {
                        hVar.resumeWith(Boolean.TRUE);
                    } else {
                        ta.v.H(kc.f.H(k0Var), null, 0, new f0(k0Var, arrayList, hVar, null), 3);
                    }
                    obj = hVar.b();
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return obj;
            }
        }

        /* compiled from: NewDashboardSavedItemsViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NewDashboardSavedItemsViewModel$fetchInfoForItems$1$1$3", f = "NewDashboardSavedItemsViewModel.kt", l = {R.styleable.AppCompatTheme_seekBarStyle}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super Boolean>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f22127u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ k0 f22128v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ArrayList<String> f22129w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(k0 k0Var, ArrayList<String> arrayList, ls.d<? super b> dVar) {
                super(2, dVar);
                this.f22128v = k0Var;
                this.f22129w = arrayList;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new b(this.f22128v, this.f22129w, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super Boolean> dVar) {
                return ((b) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f22127u;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    this.f22127u = 1;
                    k0 k0Var = this.f22128v;
                    k0Var.getClass();
                    ls.h hVar = new ls.h(ca.a.G0(this));
                    ArrayList<String> arrayList = this.f22129w;
                    if (arrayList.isEmpty()) {
                        hVar.resumeWith(Boolean.TRUE);
                    } else {
                        ta.v.H(kc.f.H(k0Var), null, 0, new g0(k0Var, arrayList, hVar, null), 3);
                    }
                    obj = hVar.b();
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return obj;
            }
        }

        /* compiled from: NewDashboardSavedItemsViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NewDashboardSavedItemsViewModel$fetchInfoForItems$1$1$4", f = "NewDashboardSavedItemsViewModel.kt", l = {R.styleable.AppCompatTheme_selectableItemBackground}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class c extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super Boolean>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f22130u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ k0 f22131v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ArrayList<String> f22132w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(k0 k0Var, ArrayList<String> arrayList, ls.d<? super c> dVar) {
                super(2, dVar);
                this.f22131v = k0Var;
                this.f22132w = arrayList;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new c(this.f22131v, this.f22132w, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super Boolean> dVar) {
                return ((c) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f22130u;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    this.f22130u = 1;
                    k0 k0Var = this.f22131v;
                    k0Var.getClass();
                    ls.h hVar = new ls.h(ca.a.G0(this));
                    ArrayList<String> arrayList = this.f22132w;
                    if (arrayList.isEmpty()) {
                        hVar.resumeWith(Boolean.TRUE);
                    } else {
                        ta.v.H(kc.f.H(k0Var), null, 0, new c0(k0Var, arrayList, hVar, null), 3);
                    }
                    obj = hVar.b();
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return obj;
            }
        }

        /* compiled from: NewDashboardSavedItemsViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NewDashboardSavedItemsViewModel$fetchInfoForItems$1$1$5", f = "NewDashboardSavedItemsViewModel.kt", l = {R.styleable.AppCompatTheme_selectableItemBackgroundBorderless}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class d extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super Boolean>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f22133u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ k0 f22134v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ArrayList<String> f22135w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(k0 k0Var, ArrayList<String> arrayList, ls.d<? super d> dVar) {
                super(2, dVar);
                this.f22134v = k0Var;
                this.f22135w = arrayList;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new d(this.f22134v, this.f22135w, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super Boolean> dVar) {
                return ((d) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f22133u;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    this.f22133u = 1;
                    k0 k0Var = this.f22134v;
                    k0Var.getClass();
                    ls.h hVar = new ls.h(ca.a.G0(this));
                    ArrayList<String> arrayList = this.f22135w;
                    if (arrayList.isEmpty()) {
                        hVar.resumeWith(Boolean.TRUE);
                    } else {
                        ta.v.H(kc.f.H(k0Var), null, 0, new h0(k0Var, arrayList, hVar, null), 3);
                    }
                    obj = hVar.b();
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return obj;
            }
        }

        /* compiled from: NewDashboardSavedItemsViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NewDashboardSavedItemsViewModel$fetchInfoForItems$1$1$6", f = "NewDashboardSavedItemsViewModel.kt", l = {99}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class e extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super Boolean>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f22136u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ k0 f22137v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ HashSet<String>[] f22138w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(k0 k0Var, HashSet<String>[] hashSetArr, ls.d<? super e> dVar) {
                super(2, dVar);
                this.f22137v = k0Var;
                this.f22138w = hashSetArr;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new e(this.f22137v, this.f22138w, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super Boolean> dVar) {
                return ((e) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f22136u;
                boolean z10 = true;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    this.f22136u = 1;
                    k0 k0Var = this.f22137v;
                    k0Var.getClass();
                    ls.h hVar = new ls.h(ca.a.G0(this));
                    HashSet<String>[] hashSetArr = this.f22138w;
                    if (hashSetArr.length != 0) {
                        z10 = false;
                    }
                    if (z10) {
                        hVar.resumeWith(Boolean.TRUE);
                    } else {
                        ta.v.H(kc.f.H(k0Var), null, 0, new j0(hVar, hashSetArr, k0Var, null), 3);
                    }
                    obj = hVar.b();
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return obj;
            }
        }

        /* compiled from: NewDashboardSavedItemsViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NewDashboardSavedItemsViewModel$fetchInfoForItems$1$1$7", f = "NewDashboardSavedItemsViewModel.kt", l = {100}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class f extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super Boolean>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f22139u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ k0 f22140v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ArrayList<String> f22141w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(k0 k0Var, ArrayList<String> arrayList, ls.d<? super f> dVar) {
                super(2, dVar);
                this.f22140v = k0Var;
                this.f22141w = arrayList;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new f(this.f22140v, this.f22141w, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super Boolean> dVar) {
                return ((f) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f22139u;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    this.f22139u = 1;
                    k0 k0Var = this.f22140v;
                    k0Var.getClass();
                    ls.h hVar = new ls.h(ca.a.G0(this));
                    ArrayList<String> arrayList = this.f22141w;
                    if (arrayList.isEmpty()) {
                        hVar.resumeWith(Boolean.TRUE);
                    } else {
                        Iterator<String> it = arrayList.iterator();
                        while (it.hasNext()) {
                            ta.v.H(kc.f.H(k0Var), null, 0, new i0(k0Var, it.next(), arrayList, hVar, null), 3);
                        }
                    }
                    obj = hVar.b();
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<UserLibraryItemAccessModel> list, k0 k0Var, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f22122w = list;
            this.f22123x = k0Var;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            a aVar = new a(this.f22122w, this.f22123x, dVar);
            aVar.f22121v = obj;
            return aVar;
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            Object a10;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f22120u;
            k0 k0Var = this.f22123x;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                    a10 = obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                kotlinx.coroutines.d0 d0Var = (kotlinx.coroutines.d0) this.f22121v;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                HashSet[] hashSetArr = new HashSet[6];
                for (int i10 = 0; i10 < 6; i10++) {
                    hashSetArr[i10] = new HashSet();
                }
                ArrayList arrayList4 = new ArrayList();
                for (UserLibraryItemAccessModel userLibraryItemAccessModel : this.f22122w) {
                    String parentType = userLibraryItemAccessModel.getParentType();
                    if (parentType != null) {
                        switch (parentType.hashCode()) {
                            case -1617276757:
                                if (parentType.equals("suggested_activity") && userLibraryItemAccessModel.getId() != null && userLibraryItemAccessModel.getParentId() != null) {
                                    String id2 = userLibraryItemAccessModel.getId();
                                    kotlin.jvm.internal.i.d(id2);
                                    String substring = id2.substring(10);
                                    kotlin.jvm.internal.i.f(substring, "this as java.lang.String).substring(startIndex)");
                                    arrayList4.add(substring);
                                    String parentId = userLibraryItemAccessModel.getParentId();
                                    if (parentId == null) {
                                        break;
                                    } else {
                                        switch (parentId.hashCode()) {
                                            case -2114782937:
                                                if (!parentId.equals(Constants.COURSE_HAPPINESS)) {
                                                    break;
                                                } else {
                                                    HashSet hashSet = hashSetArr[5];
                                                    String id3 = userLibraryItemAccessModel.getId();
                                                    kotlin.jvm.internal.i.d(id3);
                                                    String substring2 = id3.substring(10);
                                                    kotlin.jvm.internal.i.f(substring2, "this as java.lang.String).substring(startIndex)");
                                                    hashSet.add(substring2);
                                                    continue;
                                                    continue;
                                                }
                                            case -1617042330:
                                                if (!parentId.equals(Constants.COURSE_DEPRESSION)) {
                                                    break;
                                                } else {
                                                    HashSet hashSet2 = hashSetArr[3];
                                                    String id4 = userLibraryItemAccessModel.getId();
                                                    kotlin.jvm.internal.i.d(id4);
                                                    String substring3 = id4.substring(10);
                                                    kotlin.jvm.internal.i.f(substring3, "this as java.lang.String).substring(startIndex)");
                                                    hashSet2.add(substring3);
                                                    continue;
                                                }
                                            case -891989580:
                                                if (!parentId.equals(Constants.COURSE_STRESS)) {
                                                    break;
                                                } else {
                                                    HashSet hashSet3 = hashSetArr[1];
                                                    String id5 = userLibraryItemAccessModel.getId();
                                                    kotlin.jvm.internal.i.d(id5);
                                                    String substring4 = id5.substring(10);
                                                    kotlin.jvm.internal.i.f(substring4, "this as java.lang.String).substring(startIndex)");
                                                    hashSet3.add(substring4);
                                                    continue;
                                                }
                                            case 92960775:
                                                if (!parentId.equals(Constants.COURSE_ANGER)) {
                                                    break;
                                                } else {
                                                    HashSet hashSet4 = hashSetArr[4];
                                                    String id6 = userLibraryItemAccessModel.getId();
                                                    kotlin.jvm.internal.i.d(id6);
                                                    String substring5 = id6.substring(10);
                                                    kotlin.jvm.internal.i.f(substring5, "this as java.lang.String).substring(startIndex)");
                                                    hashSet4.add(substring5);
                                                    continue;
                                                }
                                            case 109522647:
                                                if (!parentId.equals(Constants.COURSE_SLEEP)) {
                                                    break;
                                                } else {
                                                    HashSet hashSet5 = hashSetArr[0];
                                                    String id7 = userLibraryItemAccessModel.getId();
                                                    kotlin.jvm.internal.i.d(id7);
                                                    String substring6 = id7.substring(10);
                                                    kotlin.jvm.internal.i.f(substring6, "this as java.lang.String).substring(startIndex)");
                                                    hashSet5.add(substring6);
                                                    continue;
                                                }
                                            case 113319009:
                                                if (!parentId.equals(Constants.COURSE_WORRY)) {
                                                    break;
                                                } else {
                                                    HashSet hashSet6 = hashSetArr[2];
                                                    String id8 = userLibraryItemAccessModel.getId();
                                                    kotlin.jvm.internal.i.d(id8);
                                                    String substring7 = id8.substring(10);
                                                    kotlin.jvm.internal.i.f(substring7, "this as java.lang.String).substring(startIndex)");
                                                    hashSet6.add(substring7);
                                                    continue;
                                                }
                                        }
                                    }
                                }
                                break;
                            case -341064690:
                                if (!parentType.equals("resource")) {
                                    break;
                                } else if (userLibraryItemAccessModel.getId() != null) {
                                    String id9 = userLibraryItemAccessModel.getId();
                                    kotlin.jvm.internal.i.d(id9);
                                    arrayList3.add(id9);
                                    break;
                                } else {
                                    continue;
                                }
                            case 955611395:
                                if (parentType.equals("mini_course")) {
                                    if (userLibraryItemAccessModel.getParentId() != null) {
                                        String parentId2 = userLibraryItemAccessModel.getParentId();
                                        kotlin.jvm.internal.i.d(parentId2);
                                        arrayList2.add(parentId2);
                                        break;
                                    } else {
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            case 1853891989:
                                if (!parentType.equals("collections")) {
                                    break;
                                } else if (userLibraryItemAccessModel.getParentId() != null) {
                                    String parentId3 = userLibraryItemAccessModel.getParentId();
                                    kotlin.jvm.internal.i.d(parentId3);
                                    arrayList.add(parentId3);
                                    break;
                                } else {
                                    continue;
                                }
                        }
                    }
                }
                kotlinx.coroutines.h0[] h0VarArr = {ta.v.g(d0Var, null, new C0329a(k0Var, arrayList2, null), 3), ta.v.g(d0Var, null, new b(k0Var, arrayList2, null), 3), ta.v.g(d0Var, null, new c(k0Var, arrayList, null), 3), ta.v.g(d0Var, null, new d(k0Var, arrayList3, null), 3), ta.v.g(d0Var, null, new e(k0Var, hashSetArr, null), 3), ta.v.g(d0Var, null, new f(k0Var, arrayList4, null), 3)};
                this.f22120u = 1;
                a10 = new kotlinx.coroutines.c(h0VarArr).a(this);
                if (a10 == aVar) {
                    return aVar;
                }
            }
            List list = (List) a10;
            k0Var.H.i(Boolean.TRUE);
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(List<UserLibraryItemAccessModel> list, k0 k0Var, ls.d<? super d0> dVar) {
        super(2, dVar);
        this.f22118v = list;
        this.f22119w = k0Var;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new d0(this.f22118v, this.f22119w, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((d0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f22117u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.scheduling.b bVar = kotlinx.coroutines.o0.f23642c;
            a aVar2 = new a(this.f22118v, this.f22119w, null);
            this.f22117u = 1;
            if (ta.v.S(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
