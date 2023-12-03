package cn;

import com.appsflyer.R;
import com.theinnerhour.b2b.components.libraryExperiment.model.LibraryCollection;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import java.util.List;
/* compiled from: AllCollectionsViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.AllCollectionsViewModel$fetchCollections$1", f = "AllCollectionsViewModel.kt", l = {R.styleable.AppCompatTheme_actionModeTheme}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public androidx.lifecycle.w f5397u;

    /* renamed from: v  reason: collision with root package name */
    public int f5398v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ b f5399w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, ls.d<? super a> dVar) {
        super(2, dVar);
        this.f5399w = bVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new a(this.f5399w, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        androidx.lifecycle.w<SingleUseEvent<List<LibraryCollection>>> wVar;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f5398v;
        b bVar = this.f5399w;
        try {
            if (i6 != 0) {
                if (i6 == 1) {
                    wVar = this.f5397u;
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                androidx.lifecycle.w<SingleUseEvent<List<LibraryCollection>>> wVar2 = bVar.f5413z;
                b1 b10 = e1.b(bVar.f5411x, "collection", bVar.A);
                this.f5397u = wVar2;
                this.f5398v = 1;
                Object s10 = ta.v.s(b10, this);
                if (s10 == aVar) {
                    return aVar;
                }
                wVar = wVar2;
                obj = s10;
            }
            wVar.l(new SingleUseEvent<>(obj));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(bVar.f5412y, e10);
        }
        return hs.k.f19476a;
    }
}
