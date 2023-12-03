package cn;

import com.appsflyer.R;
/* compiled from: AllTopPicksViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.AllTopPicksViewModel$addOrUpdateCompletionStatus$1", f = "AllTopPicksViewModel.kt", l = {R.styleable.AppCompatTheme_viewInflaterClass}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class d extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {
    public final /* synthetic */ String A;
    public final /* synthetic */ String B;
    public final /* synthetic */ boolean C;

    /* renamed from: u  reason: collision with root package name */
    public int f5445u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ i f5446v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f5447w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f5448x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ String f5449y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f5450z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i iVar, String str, String str2, String str3, boolean z10, String str4, String str5, boolean z11, ls.d<? super d> dVar) {
        super(2, dVar);
        this.f5446v = iVar;
        this.f5447w = str;
        this.f5448x = str2;
        this.f5449y = str3;
        this.f5450z = z10;
        this.A = str4;
        this.B = str5;
        this.C = z11;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new d(this.f5446v, this.f5447w, this.f5448x, this.f5449y, this.f5450z, this.A, this.B, this.C, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((d) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f5445u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            e1 e1Var = this.f5446v.f5566x;
            String str = this.f5447w;
            String str2 = this.f5448x;
            String str3 = this.f5449y;
            boolean z10 = this.f5450z;
            String str4 = this.A;
            String str5 = this.B;
            boolean z11 = this.C;
            this.f5445u = 1;
            if (e1Var.l(str, str2, str3, z10, str4, str5, z11, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
