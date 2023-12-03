package cn;

import com.appsflyer.R;
/* compiled from: LibraryResourcesViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.LibraryResourcesViewModel$addOrUpdateResourceCompletionDate$1", f = "LibraryResourcesViewModel.kt", l = {R.styleable.AppCompatTheme_editTextStyle}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class u extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f5786u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ w f5787v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f5788w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f5789x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ long f5790y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(w wVar, String str, String str2, long j10, ls.d<? super u> dVar) {
        super(2, dVar);
        this.f5787v = wVar;
        this.f5788w = str;
        this.f5789x = str2;
        this.f5790y = j10;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new u(this.f5787v, this.f5788w, this.f5789x, this.f5790y, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((u) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f5786u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            e1 e1Var = this.f5787v.f5804y;
            String str = this.f5788w;
            String str2 = this.f5789x;
            long j10 = this.f5790y;
            this.f5786u = 1;
            if (e1Var.k(str, "resource", str2, j10, true, "resource", "resource", true, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
