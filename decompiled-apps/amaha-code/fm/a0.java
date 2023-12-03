package fm;

import com.google.firebase.auth.FirebaseAuth;
/* compiled from: FirestoreGoalsViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.FirestoreGoalsViewModel$replaceLogEntryForSingleLogGoal$1", f = "FirestoreGoalsViewModel.kt", l = {858}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class a0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public a f15254u;

    /* renamed from: v  reason: collision with root package name */
    public int f15255v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ a f15256w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f15257x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ Object f15258y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(a aVar, String str, Object obj, ls.d<? super a0> dVar) {
        super(2, dVar);
        this.f15256w = aVar;
        this.f15257x = str;
        this.f15258y = obj;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new a0(this.f15256w, this.f15257x, this.f15258y, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((a0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        String j02;
        a aVar;
        ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f15255v;
        if (i6 != 0) {
            if (i6 == 1) {
                aVar = this.f15254u;
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            fd.f fVar = FirebaseAuth.getInstance().f;
            if (fVar != null && (j02 = fVar.j0()) != null) {
                String str = this.f15257x;
                Object obj2 = this.f15258y;
                a aVar3 = this.f15256w;
                j0 j0Var = aVar3.f15183y;
                String o10 = defpackage.b.o(new Object[]{new Integer(0)}, 1, "%09d", "format(this, *args)");
                this.f15254u = aVar3;
                this.f15255v = 1;
                Object d10 = j0Var.d(str, obj2, j02, o10, this);
                if (d10 == aVar2) {
                    return aVar2;
                }
                aVar = aVar3;
                obj = d10;
            }
            return hs.k.f19476a;
        }
        aVar.f15176j0.i(Boolean.valueOf(((Boolean) obj).booleanValue()));
        return hs.k.f19476a;
    }
}
