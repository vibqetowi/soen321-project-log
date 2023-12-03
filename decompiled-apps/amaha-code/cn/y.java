package cn;

import com.appsflyer.R;
import jl.t1;
/* compiled from: LibraryResourcesViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.LibraryResourcesViewModel$submitRating$1", f = "LibraryResourcesViewModel.kt", l = {R.styleable.AppCompatTheme_toolbarNavigationButtonStyle}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class y extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f5828u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ w f5829v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int f5830w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f5831x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(w wVar, int i6, String str, ls.d<? super y> dVar) {
        super(2, dVar);
        this.f5829v = wVar;
        this.f5830w = i6;
        this.f5831x = str;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new y(this.f5829v, this.f5830w, this.f5831x, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((y) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f5828u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            this.f5828u = 1;
            if (((t1) this.f5829v.F.getValue()).a(this.f5830w, this.f5831x, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
