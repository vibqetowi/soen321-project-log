package wn;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.LogHelper;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.flow.x;
/* compiled from: MultiTrackerInsightsViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.multiTracker.utils.MultiTrackerInsightsViewModel$setLastVisibleIndex$1", f = "MultiTrackerInsightsViewModel.kt", l = {R.styleable.AppCompatTheme_windowActionBar}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class g extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f36789u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ i f36790v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int f36791w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, int i6, ls.d<? super g> dVar) {
        super(2, dVar);
        this.f36790v = iVar;
        this.f36791w = i6;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new g(this.f36790v, this.f36791w, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((g) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f36789u;
        i iVar = this.f36790v;
        try {
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                int i10 = iVar.A;
                int i11 = this.f36791w;
                if (i10 == 0 || i10 < i11) {
                    iVar.A = i11;
                    x xVar = iVar.f36796z;
                    Integer num = new Integer(i11);
                    this.f36789u = 1;
                    xVar.setValue(num);
                    if (hs.k.f19476a == aVar) {
                        return aVar;
                    }
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(iVar.f36794x, e10);
        }
        return hs.k.f19476a;
    }
}
