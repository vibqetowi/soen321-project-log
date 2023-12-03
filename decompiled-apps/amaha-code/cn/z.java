package cn;
/* compiled from: LibraryShortCoursesViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.LibraryShortCoursesViewModel$addOrUpdateAccessDate$1", f = "LibraryShortCoursesViewModel.kt", l = {191}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class z extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {
    public final /* synthetic */ boolean A;

    /* renamed from: u  reason: collision with root package name */
    public int f5836u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ j0 f5837v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f5838w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f5839x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ long f5840y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f5841z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(j0 j0Var, String str, String str2, long j10, String str3, boolean z10, ls.d<? super z> dVar) {
        super(2, dVar);
        this.f5837v = j0Var;
        this.f5838w = str;
        this.f5839x = str2;
        this.f5840y = j10;
        this.f5841z = str3;
        this.A = z10;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new z(this.f5837v, this.f5838w, this.f5839x, this.f5840y, this.f5841z, this.A, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((z) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f5836u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            e1 e1Var = this.f5837v.f5581x;
            String str = this.f5838w;
            String str2 = this.f5839x;
            long j10 = this.f5840y;
            String str3 = this.f5841z;
            boolean z10 = this.A;
            this.f5836u = 1;
            if (e1Var.k(str, "main_activity", str2, j10, false, str3, "mini_course", z10, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
