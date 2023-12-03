package fm;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.theinnerhour.b2b.utils.Constants;
/* compiled from: FirestoreGoalsViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.FirestoreGoalsViewModel$deleteTrackStatsForGoal$1", f = "FirestoreGoalsViewModel.kt", l = {411, 413}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class g extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public a f15333u;

    /* renamed from: v  reason: collision with root package name */
    public String f15334v;

    /* renamed from: w  reason: collision with root package name */
    public int f15335w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ a f15336x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ String f15337y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f15338z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(a aVar, String str, String str2, ls.d<? super g> dVar) {
        super(2, dVar);
        this.f15336x = aVar;
        this.f15337y = str;
        this.f15338z = str2;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new g(this.f15336x, this.f15337y, this.f15338z, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((g) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a6 A[RETURN] */
    @Override // ns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String j02;
        a aVar;
        String str;
        Integer num;
        ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f15335w;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 == 2) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                str = this.f15334v;
                aVar = this.f15333u;
                sp.b.d0(obj);
                num = (Integer) obj;
                if (num != null && num.intValue() > 0) {
                    j0 j0Var = aVar.f15183y;
                    this.f15333u = null;
                    this.f15334v = null;
                    this.f15335w = 2;
                    j0Var.getClass();
                    if (j0.g(num, str, this) == aVar2) {
                        return aVar2;
                    }
                }
            }
        } else {
            sp.b.d0(obj);
            fd.f fVar = FirebaseAuth.getInstance().f;
            if (fVar != null && (j02 = fVar.j0()) != null) {
                a aVar3 = this.f15336x;
                j0 j0Var2 = aVar3.f15183y;
                this.f15333u = aVar3;
                String str2 = this.f15338z;
                this.f15334v = str2;
                this.f15335w = 1;
                j0Var2.getClass();
                ls.h hVar = new ls.h(ca.a.G0(this));
                FirebaseFirestore.d().b(Constants.USER_DATA_COLLECTION).q(j02).b(Constants.USER_GOALS_DATA).q(this.f15337y).b(Constants.USER_GOALS_TRACK_DATA).m(new Integer(2), "val").a().addOnCompleteListener(new u0(hVar));
                obj = hVar.b();
                if (obj == aVar2) {
                    return aVar2;
                }
                aVar = aVar3;
                str = str2;
                num = (Integer) obj;
                if (num != null) {
                    j0 j0Var3 = aVar.f15183y;
                    this.f15333u = null;
                    this.f15334v = null;
                    this.f15335w = 2;
                    j0Var3.getClass();
                    if (j0.g(num, str, this) == aVar2) {
                    }
                }
            }
        }
        return hs.k.f19476a;
    }
}
