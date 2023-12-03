package cn;

import com.theinnerhour.b2b.components.libraryExperiment.model.LibraryCollection;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.List;
/* compiled from: LibraryViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.LibraryViewModel$fetchCollections$1", f = "LibraryViewModel.kt", l = {163}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class o0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public androidx.lifecycle.w f5662u;

    /* renamed from: v  reason: collision with root package name */
    public int f5663v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ k0 f5664w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(k0 k0Var, ls.d<? super o0> dVar) {
        super(2, dVar);
        this.f5664w = k0Var;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new o0(this.f5664w, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((o0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.w] */
    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        androidx.lifecycle.w<List<LibraryCollection>> wVar;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f5663v;
        k0 k0Var = this.f5664w;
        try {
            if (i6 != 0) {
                if (i6 == 1) {
                    wVar = this.f5662u;
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                androidx.lifecycle.w<List<LibraryCollection>> wVar2 = k0Var.E;
                b1 b10 = e1.b(k0Var.f5597z, "collection", k0Var.X);
                this.f5662u = wVar2;
                this.f5663v = 1;
                Object s10 = ta.v.s(b10, this);
                if (s10 == aVar) {
                    return aVar;
                }
                wVar = wVar2;
                obj = s10;
            }
            wVar.l(obj);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(k0Var.f5596y, e10);
        }
        return hs.k.f19476a;
    }
}
