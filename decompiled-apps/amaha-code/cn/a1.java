package cn;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.theinnerhour.b2b.components.libraryExperiment.model.MiniCourseMetadata;
import java.util.ArrayList;
import java.util.List;
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes2.dex */
public final class a1 implements kotlinx.coroutines.flow.d<List<? extends MiniCourseMetadata>> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.d f5406u;

    /* compiled from: Emitters.kt */
    /* loaded from: classes2.dex */
    public static final class a<T> implements kotlinx.coroutines.flow.e {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.e f5407u;

        /* compiled from: Emitters.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.LibraryViewModelRepository$fetchAllMiniCoursesMeta$$inlined$map$1$2", f = "LibraryViewModelRepository.kt", l = {223}, m = "emit")
        /* renamed from: cn.a1$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0111a extends ns.c {

            /* renamed from: u  reason: collision with root package name */
            public /* synthetic */ Object f5408u;

            /* renamed from: v  reason: collision with root package name */
            public int f5409v;

            public C0111a(ls.d dVar) {
                super(dVar);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                this.f5408u = obj;
                this.f5409v |= LinearLayoutManager.INVALID_OFFSET;
                return a.this.b(null, this);
            }
        }

        public a(kotlinx.coroutines.flow.e eVar) {
            this.f5407u = eVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
        @Override // kotlinx.coroutines.flow.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object b(Object obj, ls.d dVar) {
            C0111a c0111a;
            int i6;
            if (dVar instanceof C0111a) {
                c0111a = (C0111a) dVar;
                int i10 = c0111a.f5409v;
                if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c0111a.f5409v = i10 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj2 = c0111a.f5408u;
                    ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                    i6 = c0111a.f5409v;
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
                        c0111a.f5409v = 1;
                        if (this.f5407u.b(arrayList, c0111a) == aVar) {
                            return aVar;
                        }
                    }
                    return hs.k.f19476a;
                }
            }
            c0111a = new C0111a(dVar);
            Object obj22 = c0111a.f5408u;
            ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
            i6 = c0111a.f5409v;
            if (i6 == 0) {
            }
            return hs.k.f19476a;
        }
    }

    public a1(kotlinx.coroutines.flow.r rVar) {
        this.f5406u = rVar;
    }

    @Override // kotlinx.coroutines.flow.d
    public final Object a(kotlinx.coroutines.flow.e<? super List<? extends MiniCourseMetadata>> eVar, ls.d dVar) {
        Object a10 = this.f5406u.a(new a(eVar), dVar);
        if (a10 == ms.a.COROUTINE_SUSPENDED) {
            return a10;
        }
        return hs.k.f19476a;
    }
}
