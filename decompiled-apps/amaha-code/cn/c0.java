package cn;

import com.theinnerhour.b2b.components.libraryExperiment.model.UserLibraryItemAccessModel;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import java.util.ArrayList;
/* compiled from: LibraryShortCoursesViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.LibraryShortCoursesViewModel$fetchBookmarkingStatusOfShortCourse$1", f = "LibraryShortCoursesViewModel.kt", l = {205}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f5431u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ArrayList<CourseDayModelV1> f5432v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ j0 f5433w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f5434x;

    /* compiled from: LibraryShortCoursesViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.LibraryShortCoursesViewModel$fetchBookmarkingStatusOfShortCourse$1$1", f = "LibraryShortCoursesViewModel.kt", l = {206}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f5435u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f5436v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ArrayList<CourseDayModelV1> f5437w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ j0 f5438x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f5439y;

        /* compiled from: LibraryShortCoursesViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.LibraryShortCoursesViewModel$fetchBookmarkingStatusOfShortCourse$1$1$1$1", f = "LibraryShortCoursesViewModel.kt", l = {206}, m = "invokeSuspend")
        /* renamed from: cn.c0$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0113a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.f<? extends String, ? extends UserLibraryItemAccessModel>>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f5440u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ CourseDayModelV1 f5441v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ j0 f5442w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ String f5443x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0113a(CourseDayModelV1 courseDayModelV1, j0 j0Var, String str, ls.d<? super C0113a> dVar) {
                super(2, dVar);
                this.f5441v = courseDayModelV1;
                this.f5442w = j0Var;
                this.f5443x = str;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new C0113a(this.f5441v, this.f5442w, this.f5443x, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.f<? extends String, ? extends UserLibraryItemAccessModel>> dVar) {
                return ((C0113a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f5440u;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    String content_id = this.f5441v.getContent_id();
                    if (content_id != null) {
                        e1 e1Var = this.f5442w.f5581x;
                        this.f5440u = 1;
                        obj = e1Var.d(this.f5443x, content_id, this);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        return null;
                    }
                }
                return (hs.f) obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ArrayList<CourseDayModelV1> arrayList, j0 j0Var, String str, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f5437w = arrayList;
            this.f5438x = j0Var;
            this.f5439y = str;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            a aVar = new a(this.f5437w, this.f5438x, this.f5439y, dVar);
            aVar.f5436v = obj;
            return aVar;
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f5435u;
            j0 j0Var = this.f5438x;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                kotlinx.coroutines.d0 d0Var = (kotlinx.coroutines.d0) this.f5436v;
                ArrayList<CourseDayModelV1> arrayList = this.f5437w;
                ArrayList arrayList2 = new ArrayList(is.i.H1(arrayList, 10));
                for (CourseDayModelV1 courseDayModelV1 : arrayList) {
                    arrayList2.add(ta.v.g(d0Var, null, new C0113a(courseDayModelV1, j0Var, this.f5439y, null), 3));
                }
                this.f5435u = 1;
                obj = ca.a.n(arrayList2, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (hs.f fVar : (Iterable) obj) {
                if (fVar != null) {
                    arrayList3.add(fVar);
                }
            }
            j0Var.C.i(arrayList3);
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(ArrayList<CourseDayModelV1> arrayList, j0 j0Var, String str, ls.d<? super c0> dVar) {
        super(2, dVar);
        this.f5432v = arrayList;
        this.f5433w = j0Var;
        this.f5434x = str;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new c0(this.f5432v, this.f5433w, this.f5434x, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((c0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f5431u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.scheduling.b bVar = kotlinx.coroutines.o0.f23642c;
            a aVar2 = new a(this.f5432v, this.f5433w, this.f5434x, null);
            this.f5431u = 1;
            if (ta.v.S(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
