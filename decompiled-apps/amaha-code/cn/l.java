package cn;

import com.appsflyer.R;
/* compiled from: CollectionsPageViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.CollectionsPageViewModel$addOrUpdateCompletionStatus$1", f = "CollectionsPageViewModel.kt", l = {R.styleable.AppCompatTheme_selectableItemBackground}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class l extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {
    public final /* synthetic */ String A;
    public final /* synthetic */ String B;
    public final /* synthetic */ boolean C;

    /* renamed from: u  reason: collision with root package name */
    public int f5628u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ o f5629v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f5630w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f5631x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ String f5632y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f5633z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, String str, String str2, String str3, boolean z10, String str4, String str5, boolean z11, ls.d<? super l> dVar) {
        super(2, dVar);
        this.f5629v = oVar;
        this.f5630w = str;
        this.f5631x = str2;
        this.f5632y = str3;
        this.f5633z = z10;
        this.A = str4;
        this.B = str5;
        this.C = z11;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new l(this.f5629v, this.f5630w, this.f5631x, this.f5632y, this.f5633z, this.A, this.B, this.C, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((l) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f5628u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            e1 e1Var = this.f5629v.f5659x;
            String str = this.f5630w;
            String str2 = this.f5631x;
            String str3 = this.f5632y;
            boolean z10 = this.f5633z;
            String str4 = this.A;
            String str5 = this.B;
            boolean z11 = this.C;
            this.f5628u = 1;
            if (e1Var.l(str, str2, str3, z10, str4, str5, z11, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
