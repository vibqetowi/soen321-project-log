package cn;

import com.appsflyer.R;
/* compiled from: AllTopPicksViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.AllTopPicksViewModel$addOrUpdateAccessDate$1", f = "AllTopPicksViewModel.kt", l = {R.styleable.AppCompatTheme_selectableItemBackgroundBorderless}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ String B;
    public final /* synthetic */ String C;
    public final /* synthetic */ boolean D;

    /* renamed from: u  reason: collision with root package name */
    public int f5425u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ i f5426v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f5427w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f5428x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ String f5429y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long f5430z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i iVar, String str, String str2, String str3, long j10, boolean z10, String str4, String str5, boolean z11, ls.d<? super c> dVar) {
        super(2, dVar);
        this.f5426v = iVar;
        this.f5427w = str;
        this.f5428x = str2;
        this.f5429y = str3;
        this.f5430z = j10;
        this.A = z10;
        this.B = str4;
        this.C = str5;
        this.D = z11;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new c(this.f5426v, this.f5427w, this.f5428x, this.f5429y, this.f5430z, this.A, this.B, this.C, this.D, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((c) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f5425u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            e1 e1Var = this.f5426v.f5566x;
            String str = this.f5427w;
            String str2 = this.f5428x;
            String str3 = this.f5429y;
            long j10 = this.f5430z;
            boolean z10 = this.A;
            String str4 = this.B;
            String str5 = this.C;
            boolean z11 = this.D;
            this.f5425u = 1;
            if (e1Var.k(str, str2, str3, j10, z10, str4, str5, z11, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
