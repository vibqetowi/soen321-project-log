package cn;
/* compiled from: LibraryViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.LibraryViewModel$addOrUpdateCompletionStatus$1", f = "LibraryViewModel.kt", l = {248}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class l0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {
    public final /* synthetic */ String A;
    public final /* synthetic */ String B;
    public final /* synthetic */ boolean C;

    /* renamed from: u  reason: collision with root package name */
    public int f5634u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ k0 f5635v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f5636w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f5637x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ String f5638y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f5639z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(k0 k0Var, String str, String str2, String str3, boolean z10, String str4, String str5, boolean z11, ls.d<? super l0> dVar) {
        super(2, dVar);
        this.f5635v = k0Var;
        this.f5636w = str;
        this.f5637x = str2;
        this.f5638y = str3;
        this.f5639z = z10;
        this.A = str4;
        this.B = str5;
        this.C = z11;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new l0(this.f5635v, this.f5636w, this.f5637x, this.f5638y, this.f5639z, this.A, this.B, this.C, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((l0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f5634u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            e1 e1Var = this.f5635v.f5597z;
            String str = this.f5636w;
            String str2 = this.f5637x;
            String str3 = this.f5638y;
            boolean z10 = this.f5639z;
            String str4 = this.A;
            String str5 = this.B;
            boolean z11 = this.C;
            this.f5634u = 1;
            if (e1Var.l(str, str2, str3, z10, str4, str5, z11, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
