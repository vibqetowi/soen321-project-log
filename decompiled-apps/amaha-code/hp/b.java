package hp;

import com.appsflyer.R;
import com.theinnerhour.b2b.components.resources.model.ResourceDetailResponse;
import gp.c;
import hs.k;
import kotlinx.coroutines.d0;
import ls.d;
import ls.h;
import ns.e;
import ns.i;
import ss.p;
/* compiled from: ResourceViewModel.kt */
@e(c = "com.theinnerhour.b2b.components.resources.viewModel.ResourceViewModel$getResourceDetails$1", f = "ResourceViewModel.kt", l = {R.styleable.AppCompatTheme_windowMinWidthMinor}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class b extends i implements p<d0, d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f18092u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ a f18093v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f18094w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, String str, d<? super b> dVar) {
        super(2, dVar);
        this.f18093v = aVar;
        this.f18094w = str;
    }

    @Override // ns.a
    public final d<k> create(Object obj, d<?> dVar) {
        return new b(this.f18093v, this.f18094w, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, d<? super k> dVar) {
        return ((b) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f18092u;
        a aVar2 = this.f18093v;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            c cVar = aVar2.C;
            this.f18092u = 1;
            cVar.getClass();
            h hVar = new h(ca.a.G0(this));
            ((fp.a) nr.b.a(fp.a.class)).a("https://api.theinnerhour.com/v1/customers/resources/article/details/" + this.f18094w).I(new gp.b(cVar, hVar));
            obj = hVar.b();
            if (obj == aVar) {
                return aVar;
            }
        }
        aVar2.E.i((ResourceDetailResponse) obj);
        return k.f19476a;
    }
}
