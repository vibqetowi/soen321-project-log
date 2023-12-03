package cn;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.theinnerhour.b2b.components.libraryExperiment.model.MiniCourseMetadata;
import java.util.ArrayList;
import java.util.List;
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes2.dex */
public final class p implements kotlinx.coroutines.flow.d<List<? extends MiniCourseMetadata>> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.d f5666u;

    /* compiled from: Emitters.kt */
    /* loaded from: classes2.dex */
    public static final class a<T> implements kotlinx.coroutines.flow.e {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.e f5667u;

        /* compiled from: Emitters.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.FetchLibraryOnDbViewModelRepository$fetchAllMiniCoursesMeta$$inlined$map$1$2", f = "FetchLibraryOnDbViewModelRepository.kt", l = {223}, m = "emit")
        /* renamed from: cn.p$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0118a extends ns.c {

            /* renamed from: u  reason: collision with root package name */
            public /* synthetic */ Object f5668u;

            /* renamed from: v  reason: collision with root package name */
            public int f5669v;

            public C0118a(ls.d dVar) {
                super(dVar);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                this.f5668u = obj;
                this.f5669v |= LinearLayoutManager.INVALID_OFFSET;
                return a.this.b(null, this);
            }
        }

        public a(kotlinx.coroutines.flow.e eVar) {
            this.f5667u = eVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
        @Override // kotlinx.coroutines.flow.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object b(Object obj, ls.d dVar) {
            C0118a c0118a;
            int i6;
            if (dVar instanceof C0118a) {
                c0118a = (C0118a) dVar;
                int i10 = c0118a.f5669v;
                if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c0118a.f5669v = i10 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj2 = c0118a.f5668u;
                    ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                    i6 = c0118a.f5669v;
                    if (i6 == 0) {
                        if (i6 == 1) {
                            sp.b.d0(obj2);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        sp.b.d0(obj2);
                        List<fe.g> list = (List) obj;
                        ArrayList arrayList = new ArrayList(is.i.H1(list, 10));
                        for (fe.g gVar : list) {
                            arrayList.add((MiniCourseMetadata) gVar.d(MiniCourseMetadata.class));
                        }
                        c0118a.f5669v = 1;
                        if (this.f5667u.b(arrayList, c0118a) == aVar) {
                            return aVar;
                        }
                    }
                    return hs.k.f19476a;
                }
            }
            c0118a = new C0118a(dVar);
            Object obj22 = c0118a.f5668u;
            ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
            i6 = c0118a.f5669v;
            if (i6 == 0) {
            }
            return hs.k.f19476a;
        }
    }

    public p(kotlinx.coroutines.flow.r rVar) {
        this.f5666u = rVar;
    }

    @Override // kotlinx.coroutines.flow.d
    public final Object a(kotlinx.coroutines.flow.e<? super List<? extends MiniCourseMetadata>> eVar, ls.d dVar) {
        Object a10 = this.f5666u.a(new a(eVar), dVar);
        if (a10 == ms.a.COROUTINE_SUSPENDED) {
            return a10;
        }
        return hs.k.f19476a;
    }
}
