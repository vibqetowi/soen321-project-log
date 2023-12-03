package fm;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.theinnerhour.b2b.utils.Constants;
/* compiled from: FirestoreGoalsViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.FirestoreGoalsViewModel$deleteLogEntryForSingleLogGoal$1", f = "FirestoreGoalsViewModel.kt", l = {839}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class f extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public a f15319u;

    /* renamed from: v  reason: collision with root package name */
    public int f15320v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ a f15321w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f15322x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a aVar, String str, ls.d<? super f> dVar) {
        super(2, dVar);
        this.f15321w = aVar;
        this.f15322x = str;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new f(this.f15321w, this.f15322x, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((f) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        String j02;
        a aVar;
        ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f15320v;
        if (i6 != 0) {
            if (i6 == 1) {
                aVar = this.f15319u;
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            fd.f fVar = FirebaseAuth.getInstance().f;
            if (fVar != null && (j02 = fVar.j0()) != null) {
                a aVar3 = this.f15321w;
                j0 j0Var = aVar3.f15183y;
                String o10 = defpackage.b.o(new Object[]{new Integer(0)}, 1, "%09d", "format(this, *args)");
                this.f15319u = aVar3;
                this.f15320v = 1;
                j0Var.getClass();
                ls.h hVar = new ls.h(ca.a.G0(this));
                FirebaseFirestore.d().b(Constants.USER_DATA_COLLECTION).q(j02).b(Constants.USER_GOALS_DATA).q(this.f15322x).b(Constants.USER_GOALS_LOGS_DATA).q(o10).c().addOnCompleteListener(new n0(hVar));
                obj = hVar.b();
                if (obj == aVar2) {
                    return aVar2;
                }
                aVar = aVar3;
            }
            return hs.k.f19476a;
        }
        aVar.f15175i0.i(Boolean.valueOf(((Boolean) obj).booleanValue()));
        return hs.k.f19476a;
    }
}
