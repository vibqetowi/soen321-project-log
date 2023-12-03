package cn;
/* compiled from: LibraryShortCoursesViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.LibraryShortCoursesViewModel$addOrUpdateShortCourseCompletionStatus$1", f = "LibraryShortCoursesViewModel.kt", l = {176}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class b0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {
    public final /* synthetic */ boolean A;

    /* renamed from: u  reason: collision with root package name */
    public int f5414u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ j0 f5415v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f5416w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f5417x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ boolean f5418y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f5419z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(j0 j0Var, String str, String str2, boolean z10, String str3, boolean z11, ls.d<? super b0> dVar) {
        super(2, dVar);
        this.f5415v = j0Var;
        this.f5416w = str;
        this.f5417x = str2;
        this.f5418y = z10;
        this.f5419z = str3;
        this.A = z11;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new b0(this.f5415v, this.f5416w, this.f5417x, this.f5418y, this.f5419z, this.A, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((b0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f5414u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            e1 e1Var = this.f5415v.f5581x;
            String str = this.f5416w;
            String str2 = this.f5417x;
            boolean z10 = this.f5418y;
            String str3 = this.f5419z;
            boolean z11 = this.A;
            this.f5414u = 1;
            if (e1Var.l(str, "main_activity", str2, z10, str3, "mini_course", z11, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
