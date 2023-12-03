package cn;

import com.theinnerhour.b2b.components.libraryExperiment.model.LibraryCollection;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.List;
/* compiled from: AllTopPicksViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.AllTopPicksViewModel$fetchTopPicks$1", f = "AllTopPicksViewModel.kt", l = {36}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class h extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public androidx.lifecycle.w f5553u;

    /* renamed from: v  reason: collision with root package name */
    public int f5554v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ i f5555w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, ls.d<? super h> dVar) {
        super(2, dVar);
        this.f5555w = iVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new h(this.f5555w, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((h) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.w] */
    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        androidx.lifecycle.w<LibraryCollection> wVar;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f5554v;
        i iVar = this.f5555w;
        try {
            if (i6 != 0) {
                if (i6 == 1) {
                    wVar = this.f5553u;
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                androidx.lifecycle.w<LibraryCollection> wVar2 = iVar.f5568z;
                b1 b10 = e1.b(iVar.f5566x, "top_pick", iVar.D);
                this.f5553u = wVar2;
                this.f5554v = 1;
                Object s10 = ta.v.s(b10, this);
                if (s10 == aVar) {
                    return aVar;
                }
                wVar = wVar2;
                obj = s10;
            }
            wVar.l(((List) obj).get(0));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(iVar.f5567y, e10);
        }
        return hs.k.f19476a;
    }
}
