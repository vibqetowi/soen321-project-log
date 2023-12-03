package cn;

import com.theinnerhour.b2b.components.libraryExperiment.model.MiniCourseMetadata;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
/* compiled from: LibraryShortCoursesViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.LibraryShortCoursesViewModel$fetchMiniCourses$1", f = "LibraryShortCoursesViewModel.kt", l = {50}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class f0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public j0 f5539u;

    /* renamed from: v  reason: collision with root package name */
    public int f5540v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ j0 f5541w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(j0 j0Var, ls.d<? super f0> dVar) {
        super(2, dVar);
        this.f5541w = j0Var;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new f0(this.f5541w, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((f0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0178, code lost:
        r12.add(r7);
     */
    @Override // ns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        j0 j0Var;
        int i6;
        ArrayList arrayList;
        String str;
        String str2;
        ArrayList<String> chips;
        boolean z10;
        Integer libraryRank;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i10 = this.f5540v;
        j0 j0Var2 = this.f5541w;
        if (i10 != 0) {
            if (i10 == 1) {
                j0Var = this.f5539u;
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            a1 a10 = j0Var2.f5581x.a();
            this.f5539u = j0Var2;
            this.f5540v = 1;
            obj = ta.v.s(a10, this);
            if (obj == aVar) {
                return aVar;
            }
            j0Var = j0Var2;
        }
        List<MiniCourseMetadata> list = (List) obj;
        j0Var.getClass();
        kotlin.jvm.internal.i.g(list, "<set-?>");
        j0Var.H = list;
        List<MiniCourseMetadata> list2 = j0Var2.H;
        if (list2 != null) {
            String str3 = j0Var2.f5582y;
            Iterator<MiniCourseMetadata> it = list2.iterator();
            while (true) {
                i6 = 0;
                if (it.hasNext()) {
                    MiniCourseMetadata next = it.next();
                    HashMap<String, Integer> f = j0Var2.f();
                    String str4 = (next == null || (str4 = next.getSlug()) == null) ? "" : "";
                    if (next != null && (libraryRank = next.getLibraryRank()) != null) {
                        i6 = libraryRank.intValue();
                    }
                    f.put(str4, new Integer(i6));
                } else {
                    try {
                        break;
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e(str3, e10);
                        arrayList = new ArrayList();
                    }
                }
            }
            ArrayList<MiniCourse> mcList = FirebasePersistence.getInstance().getUser().getMiniCourses();
            kotlin.jvm.internal.i.f(mcList, "mcList");
            arrayList = new ArrayList();
            for (Object obj2 : mcList) {
                if (((MiniCourse) obj2).getPlan().size() != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    arrayList.add(obj2);
                }
            }
            is.p.P1(arrayList, new dm.a(new g0(j0Var2), 5));
            ArrayList arrayList2 = new ArrayList();
            List<MiniCourseMetadata> list3 = j0Var2.H;
            if (list3 != null) {
                ArrayList<MiniCourseMetadata> arrayList3 = (ArrayList) list3;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                try {
                    ArrayList<MiniCourse> topicalCourseList = FirebasePersistence.getInstance().getUser().getTopicalCourseList();
                    i6 = (topicalCourseList == null || topicalCourseList.isEmpty()) ? 1 : 1;
                    if (arrayList3.size() > 1) {
                        is.p.P1(arrayList3, new d0(j0Var2));
                    }
                    for (MiniCourseMetadata miniCourseMetadata : arrayList3) {
                        if (miniCourseMetadata != null && (chips = miniCourseMetadata.getChips()) != null) {
                            Iterator<String> it2 = chips.iterator();
                            while (it2.hasNext()) {
                                linkedHashSet.add(it2.next());
                            }
                        }
                    }
                    if (i6 != 0) {
                        e0 predicate = e0.f5466u;
                        kotlin.jvm.internal.i.g(predicate, "predicate");
                        is.q.T1(linkedHashSet, predicate);
                    }
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(str3, e11);
                }
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    MiniCourse miniCourse = (MiniCourse) it3.next();
                    List<MiniCourseMetadata> list4 = j0Var2.H;
                    if (list4 != null) {
                        Iterator<T> it4 = list4.iterator();
                        while (it4.hasNext()) {
                            Object next2 = it4.next();
                            MiniCourseMetadata miniCourseMetadata2 = (MiniCourseMetadata) next2;
                            if (miniCourseMetadata2 != null) {
                                str = miniCourseMetadata2.getSlug();
                            } else {
                                str = null;
                            }
                            if (miniCourse != null) {
                                str2 = miniCourse.getDomain();
                            } else {
                                str2 = null;
                            }
                            if (kotlin.jvm.internal.i.b(str, str2)) {
                                break;
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    kotlin.jvm.internal.i.q("allMiniCourseMetadataList");
                    throw null;
                }
                j0Var2.B.l(arrayList);
                j0Var2.A.l(arrayList2);
                j0Var2.F.l(linkedHashSet);
                return hs.k.f19476a;
            }
            kotlin.jvm.internal.i.q("allMiniCourseMetadataList");
            throw null;
        }
        kotlin.jvm.internal.i.q("allMiniCourseMetadataList");
        throw null;
    }
}
