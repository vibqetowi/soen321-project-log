package cn;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.theinnerhour.b2b.model.LearningHubModel;
import java.util.ArrayList;
import java.util.List;
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes2.dex */
public final class i1 implements kotlinx.coroutines.flow.d<List<? extends LearningHubModel>> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.d f5570u;

    /* compiled from: Emitters.kt */
    /* loaded from: classes2.dex */
    public static final class a<T> implements kotlinx.coroutines.flow.e {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.e f5571u;

        /* compiled from: Emitters.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.LibraryViewModelRepository$fetchLearningHubResources$$inlined$map$2$2", f = "LibraryViewModelRepository.kt", l = {223}, m = "emit")
        /* renamed from: cn.i1$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0116a extends ns.c {

            /* renamed from: u  reason: collision with root package name */
            public /* synthetic */ Object f5572u;

            /* renamed from: v  reason: collision with root package name */
            public int f5573v;

            public C0116a(ls.d dVar) {
                super(dVar);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                this.f5572u = obj;
                this.f5573v |= LinearLayoutManager.INVALID_OFFSET;
                return a.this.b(null, this);
            }
        }

        public a(kotlinx.coroutines.flow.e eVar) {
            this.f5571u = eVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
        @Override // kotlinx.coroutines.flow.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object b(Object obj, ls.d dVar) {
            C0116a c0116a;
            int i6;
            if (dVar instanceof C0116a) {
                c0116a = (C0116a) dVar;
                int i10 = c0116a.f5573v;
                if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c0116a.f5573v = i10 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj2 = c0116a.f5572u;
                    ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                    i6 = c0116a.f5573v;
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
                            LearningHubModel learningHubModel = (LearningHubModel) gVar.d(LearningHubModel.class);
                            if (learningHubModel != null) {
                                learningHubModel.setId(gVar.b());
                            } else {
                                learningHubModel = null;
                            }
                            arrayList.add(learningHubModel);
                        }
                        c0116a.f5573v = 1;
                        if (this.f5571u.b(arrayList, c0116a) == aVar) {
                            return aVar;
                        }
                    }
                    return hs.k.f19476a;
                }
            }
            c0116a = new C0116a(dVar);
            Object obj22 = c0116a.f5572u;
            ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
            i6 = c0116a.f5573v;
            if (i6 == 0) {
            }
            return hs.k.f19476a;
        }
    }

    public i1(kotlinx.coroutines.flow.r rVar) {
        this.f5570u = rVar;
    }

    @Override // kotlinx.coroutines.flow.d
    public final Object a(kotlinx.coroutines.flow.e<? super List<? extends LearningHubModel>> eVar, ls.d dVar) {
        Object a10 = this.f5570u.a(new a(eVar), dVar);
        if (a10 == ms.a.COROUTINE_SUSPENDED) {
            return a10;
        }
        return hs.k.f19476a;
    }
}
