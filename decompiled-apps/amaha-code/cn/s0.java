package cn;

import com.theinnerhour.b2b.components.libraryExperiment.model.MiniCourseMetadata;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
/* compiled from: LibraryViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.LibraryViewModel$fetchMiniCourses$1", f = "LibraryViewModel.kt", l = {263}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class s0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public k0 f5774u;

    /* renamed from: v  reason: collision with root package name */
    public int f5775v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ k0 f5776w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(k0 k0Var, ls.d<? super s0> dVar) {
        super(2, dVar);
        this.f5776w = k0Var;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new s0(this.f5776w, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((s0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        k0 k0Var;
        List<MiniCourseMetadata> list;
        Object obj2;
        String str;
        String str2;
        int i6;
        Integer libraryRank;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i10 = this.f5775v;
        k0 k0Var2 = this.f5776w;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    k0Var = this.f5774u;
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                a1 a10 = k0Var2.f5597z.a();
                this.f5774u = k0Var2;
                this.f5775v = 1;
                obj = ta.v.s(a10, this);
                if (obj == aVar) {
                    return aVar;
                }
                k0Var = k0Var2;
            }
            List<MiniCourseMetadata> list2 = (List) obj;
            k0Var.getClass();
            kotlin.jvm.internal.i.g(list2, "<set-?>");
            k0Var.M = list2;
            list = k0Var2.M;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(k0Var2.f5596y, e10);
        }
        if (list != null) {
            Iterator<MiniCourseMetadata> it = list.iterator();
            while (it.hasNext()) {
                MiniCourseMetadata next = it.next();
                HashMap<String, Integer> o10 = k0Var2.o();
                String str3 = (next == null || (str3 = next.getSlug()) == null) ? "" : "";
                if (next != null && (libraryRank = next.getLibraryRank()) != null) {
                    i6 = libraryRank.intValue();
                } else {
                    i6 = 0;
                }
                o10.put(str3, new Integer(i6));
            }
            ArrayList f = k0.f(k0Var2);
            ArrayList arrayList = new ArrayList();
            List<MiniCourseMetadata> list3 = k0Var2.M;
            if (list3 != null) {
                LinkedHashSet e11 = k0.e(k0Var2, (ArrayList) list3);
                Iterator it2 = f.iterator();
                while (it2.hasNext()) {
                    MiniCourse miniCourse = (MiniCourse) it2.next();
                    List<MiniCourseMetadata> list4 = k0Var2.M;
                    if (list4 != null) {
                        Iterator<T> it3 = list4.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                obj2 = it3.next();
                                MiniCourseMetadata miniCourseMetadata = (MiniCourseMetadata) obj2;
                                if (miniCourseMetadata != null) {
                                    str = miniCourseMetadata.getSlug();
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
                            } else {
                                obj2 = null;
                                break;
                            }
                        }
                        MiniCourseMetadata miniCourseMetadata2 = (MiniCourseMetadata) obj2;
                        if (miniCourseMetadata2 != null) {
                            arrayList.add(miniCourseMetadata2);
                        }
                    } else {
                        kotlin.jvm.internal.i.q("allMiniCourseMetadataList");
                        throw null;
                    }
                }
                k0Var2.K.l(e11);
                k0Var2.J.l(f);
                k0Var2.I.l(arrayList);
                return hs.k.f19476a;
            }
            kotlin.jvm.internal.i.q("allMiniCourseMetadataList");
            throw null;
        }
        kotlin.jvm.internal.i.q("allMiniCourseMetadataList");
        throw null;
    }
}
