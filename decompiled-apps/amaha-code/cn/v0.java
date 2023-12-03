package cn;

import com.theinnerhour.b2b.components.libraryExperiment.model.MiniCourseMetadata;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: LibraryViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.LibraryViewModel$fetchTopicalCourseList$1", f = "LibraryViewModel.kt", l = {383}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class v0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public ArrayList f5799u;

    /* renamed from: v  reason: collision with root package name */
    public k0 f5800v;

    /* renamed from: w  reason: collision with root package name */
    public int f5801w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ k0 f5802x;

    /* compiled from: LibraryViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.p<MiniCourse, MiniCourse, Integer> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ k0 f5803u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k0 k0Var) {
            super(2);
            this.f5803u = k0Var;
        }

        @Override // ss.p
        public final Integer invoke(MiniCourse miniCourse, MiniCourse miniCourse2) {
            MiniCourse miniCourse3 = miniCourse2;
            k0 k0Var = this.f5803u;
            Integer num = k0Var.o().get(miniCourse.getDomain());
            int i6 = 0;
            if (num != null) {
                int intValue = num.intValue();
                Integer num2 = k0Var.o().get(miniCourse3.getDomain());
                if (num2 != null) {
                    i6 = num2.intValue();
                }
                i6 = kotlin.jvm.internal.i.i(intValue, i6);
            }
            return Integer.valueOf(i6);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(k0 k0Var, ls.d<? super v0> dVar) {
        super(2, dVar);
        this.f5802x = k0Var;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new v0(this.f5802x, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((v0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    @Override // ns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        k0 k0Var;
        Iterator it;
        String str;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f5801w;
        k0 k0Var2 = this.f5802x;
        if (i6 != 0) {
            if (i6 == 1) {
                k0Var = this.f5800v;
                arrayList = this.f5799u;
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            arrayList = new ArrayList();
            arrayList.addAll(FirebasePersistence.getInstance().getUser().getTopicalCourseList());
            if (k0Var2.M == null) {
                a1 a10 = k0Var2.f5597z.a();
                this.f5799u = arrayList;
                this.f5800v = k0Var2;
                this.f5801w = 1;
                obj = ta.v.s(a10, this);
                if (obj == aVar) {
                    return aVar;
                }
                k0Var = k0Var2;
            }
            is.p.P1(arrayList, new dm.a(new a(k0Var2), 8));
            ArrayList arrayList2 = new ArrayList();
            it = arrayList.iterator();
            while (it.hasNext()) {
                MiniCourse miniCourse = (MiniCourse) it.next();
                kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
                List<MiniCourseMetadata> list = k0Var2.M;
                T t3 = 0;
                if (list != null) {
                    Iterator<T> it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        MiniCourseMetadata miniCourseMetadata = (MiniCourseMetadata) next;
                        if (miniCourseMetadata != null) {
                            str = miniCourseMetadata.getSlug();
                        } else {
                            str = null;
                        }
                        if (kotlin.jvm.internal.i.b(str, miniCourse.getDomain())) {
                            t3 = next;
                            break;
                        }
                    }
                    xVar.f23469u = t3;
                    if (t3 != null) {
                        arrayList2.add(t3);
                    }
                } else {
                    kotlin.jvm.internal.i.q("allMiniCourseMetadataList");
                    throw null;
                }
            }
            k0Var2.N.l(arrayList2);
            k0Var2.O.l(arrayList);
            k0Var2.H.l(Boolean.FALSE);
            return hs.k.f19476a;
        }
        List<MiniCourseMetadata> list2 = (List) obj;
        k0Var.getClass();
        kotlin.jvm.internal.i.g(list2, "<set-?>");
        k0Var.M = list2;
        is.p.P1(arrayList, new dm.a(new a(k0Var2), 8));
        ArrayList arrayList22 = new ArrayList();
        it = arrayList.iterator();
        while (it.hasNext()) {
        }
        k0Var2.N.l(arrayList22);
        k0Var2.O.l(arrayList);
        k0Var2.H.l(Boolean.FALSE);
        return hs.k.f19476a;
    }
}
