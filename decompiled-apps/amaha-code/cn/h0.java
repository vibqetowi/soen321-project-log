package cn;

import com.theinnerhour.b2b.components.libraryExperiment.model.MiniCourseMetadata;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
/* compiled from: LibraryShortCoursesViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.LibraryShortCoursesViewModel$fetchTopicalCourseList$1", f = "LibraryShortCoursesViewModel.kt", l = {133}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class h0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public ArrayList f5556u;

    /* renamed from: v  reason: collision with root package name */
    public j0 f5557v;

    /* renamed from: w  reason: collision with root package name */
    public int f5558w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ j0 f5559x;

    /* compiled from: LibraryShortCoursesViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.p<MiniCourse, MiniCourse, Integer> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ j0 f5560u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j0 j0Var) {
            super(2);
            this.f5560u = j0Var;
        }

        @Override // ss.p
        public final Integer invoke(MiniCourse miniCourse, MiniCourse miniCourse2) {
            MiniCourse miniCourse3 = miniCourse2;
            j0 j0Var = this.f5560u;
            Integer num = j0Var.f().get(miniCourse.getDomain());
            int i6 = 0;
            if (num != null) {
                int intValue = num.intValue();
                Integer num2 = j0Var.f().get(miniCourse3.getDomain());
                if (num2 != null) {
                    i6 = num2.intValue();
                }
                i6 = kotlin.jvm.internal.i.i(intValue, i6);
            }
            return Integer.valueOf(i6);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(j0 j0Var, ls.d<? super h0> dVar) {
        super(2, dVar);
        this.f5559x = j0Var;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new h0(this.f5559x, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((h0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a1, code lost:
        r10.add(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    @Override // ns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        j0 j0Var;
        Iterator it;
        String str;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f5558w;
        j0 j0Var2 = this.f5559x;
        if (i6 != 0) {
            if (i6 == 1) {
                j0Var = this.f5557v;
                arrayList = this.f5556u;
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            arrayList = new ArrayList();
            arrayList.addAll(FirebasePersistence.getInstance().getUser().getTopicalCourseList());
            if (j0Var2.H == null) {
                a1 a10 = j0Var2.f5581x.a();
                this.f5556u = arrayList;
                this.f5557v = j0Var2;
                this.f5558w = 1;
                obj = ta.v.s(a10, this);
                if (obj == aVar) {
                    return aVar;
                }
                j0Var = j0Var2;
            }
            is.p.P1(arrayList, new dm.a(new a(j0Var2), 6));
            ArrayList arrayList2 = new ArrayList();
            it = arrayList.iterator();
            while (it.hasNext()) {
                MiniCourse miniCourse = (MiniCourse) it.next();
                List<MiniCourseMetadata> list = j0Var2.H;
                if (list != null) {
                    Iterator<T> it2 = list.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        MiniCourseMetadata miniCourseMetadata = (MiniCourseMetadata) next;
                        if (miniCourseMetadata != null) {
                            str = miniCourseMetadata.getSlug();
                        } else {
                            str = null;
                        }
                        if (kotlin.jvm.internal.i.b(str, miniCourse.getDomain())) {
                            break;
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                kotlin.jvm.internal.i.q("allMiniCourseMetadataList");
                throw null;
            }
            j0Var2.D.l(arrayList2);
            j0Var2.E.l(arrayList);
            j0Var2.f5583z.l(Boolean.FALSE);
            return hs.k.f19476a;
        }
        List<MiniCourseMetadata> list2 = (List) obj;
        j0Var.getClass();
        kotlin.jvm.internal.i.g(list2, "<set-?>");
        j0Var.H = list2;
        is.p.P1(arrayList, new dm.a(new a(j0Var2), 6));
        ArrayList arrayList22 = new ArrayList();
        it = arrayList.iterator();
        while (it.hasNext()) {
        }
        j0Var2.D.l(arrayList22);
        j0Var2.E.l(arrayList);
        j0Var2.f5583z.l(Boolean.FALSE);
        return hs.k.f19476a;
    }
}
