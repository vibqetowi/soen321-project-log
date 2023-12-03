package cn;

import com.appsflyer.R;
/* compiled from: LibraryResourcesViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.LibraryResourcesViewModel$addOrUpdateResourceFavouriteStatus$1", f = "LibraryResourcesViewModel.kt", l = {R.styleable.AppCompatTheme_listPreferredItemHeightLarge}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class v extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f5794u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ w f5795v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f5796w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f5797x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ boolean f5798y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, String str, String str2, boolean z10, ls.d<? super v> dVar) {
        super(2, dVar);
        this.f5795v = wVar;
        this.f5796w = str;
        this.f5797x = str2;
        this.f5798y = z10;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new v(this.f5795v, this.f5796w, this.f5797x, this.f5798y, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((v) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f5794u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            e1 e1Var = this.f5795v.f5804y;
            String str = this.f5796w;
            String str2 = this.f5797x;
            boolean z10 = this.f5798y;
            this.f5794u = 1;
            if (e1Var.m(str, "resource", str2, z10, "resource", "resource", true, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
