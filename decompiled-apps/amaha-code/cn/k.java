package cn;

import com.appsflyer.R;
/* compiled from: CollectionsPageViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.CollectionsPageViewModel$addOrUpdateBookmarkStatus$1", f = "CollectionsPageViewModel.kt", l = {R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class k extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {
    public final /* synthetic */ String A;
    public final /* synthetic */ String B;
    public final /* synthetic */ boolean C;

    /* renamed from: u  reason: collision with root package name */
    public int f5590u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ o f5591v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f5592w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f5593x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ String f5594y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f5595z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, String str, String str2, String str3, boolean z10, String str4, String str5, boolean z11, ls.d<? super k> dVar) {
        super(2, dVar);
        this.f5591v = oVar;
        this.f5592w = str;
        this.f5593x = str2;
        this.f5594y = str3;
        this.f5595z = z10;
        this.A = str4;
        this.B = str5;
        this.C = z11;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new k(this.f5591v, this.f5592w, this.f5593x, this.f5594y, this.f5595z, this.A, this.B, this.C, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((k) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f5590u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            e1 e1Var = this.f5591v.f5659x;
            String str = this.f5592w;
            String str2 = this.f5593x;
            String str3 = this.f5594y;
            boolean z10 = this.f5595z;
            String str4 = this.A;
            String str5 = this.B;
            boolean z11 = this.C;
            this.f5590u = 1;
            if (e1Var.m(str, str2, str3, z10, str4, str5, z11, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
