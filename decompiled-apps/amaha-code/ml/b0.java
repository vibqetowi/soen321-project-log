package ml;

import com.appsflyer.R;
import java.util.ArrayList;
/* compiled from: V2DashboardViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.V2DashboardViewModel$getCommunitiesGroupData$1", f = "V2DashboardViewModel.kt", l = {R.styleable.AppCompatTheme_dividerHorizontal}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class b0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public androidx.lifecycle.w f25353u;

    /* renamed from: v  reason: collision with root package name */
    public int f25354v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ y f25355w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f25356x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(y yVar, String str, ls.d<? super b0> dVar) {
        super(2, dVar);
        this.f25355w = yVar;
        this.f25356x = str;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new b0(this.f25355w, this.f25356x, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((b0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        androidx.lifecycle.w<Integer> wVar;
        int i6;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i10 = this.f25354v;
        if (i10 != 0) {
            if (i10 == 1) {
                wVar = this.f25353u;
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            y yVar = this.f25355w;
            androidx.lifecycle.w<Integer> wVar2 = yVar.f25611z;
            this.f25353u = wVar2;
            this.f25354v = 1;
            obj = yVar.f25609x.b(this.f25356x, this);
            if (obj == aVar) {
                return aVar;
            }
            wVar = wVar2;
        }
        ArrayList arrayList = (ArrayList) obj;
        if (arrayList != null) {
            i6 = arrayList.size();
        } else {
            i6 = 0;
        }
        wVar.i(new Integer(i6));
        return hs.k.f19476a;
    }
}
