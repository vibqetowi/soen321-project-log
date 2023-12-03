package fm;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.theinnerhour.b2b.utils.Constants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
/* compiled from: FirestoreGoalsViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.FirestoreGoalsViewModel$replaceAllLogs$1", f = "FirestoreGoalsViewModel.kt", l = {1008}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class z extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f15613u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ a f15614v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ List<String> f15615w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f15616x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a aVar, List<String> list, String str, ls.d<? super z> dVar) {
        super(2, dVar);
        this.f15614v = aVar;
        this.f15615w = list;
        this.f15616x = str;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new z(this.f15614v, this.f15615w, this.f15616x, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((z) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f15613u;
        a aVar2 = this.f15614v;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            j0 j0Var = aVar2.f15183y;
            this.f15613u = 1;
            j0Var.getClass();
            ls.h hVar = new ls.h(ca.a.G0(this));
            fe.y a10 = FirebaseFirestore.d().a();
            int i10 = 0;
            for (String str : this.f15615w) {
                fe.c b10 = FirebaseFirestore.d().b(Constants.USER_DATA_COLLECTION);
                fd.f fVar = FirebaseAuth.getInstance().f;
                kotlin.jvm.internal.i.d(fVar);
                fe.c b11 = b10.q(fVar.j0()).b(Constants.USER_GOALS_DATA).q(this.f15616x).b(Constants.USER_GOALS_LOGS_DATA);
                String format = String.format("%09d", Arrays.copyOf(new Object[]{new Integer(i10)}, 1));
                kotlin.jvm.internal.i.f(format, "format(this, *args)");
                com.google.firebase.firestore.a q10 = b11.q(format);
                i10++;
                HashMap hashMap = new HashMap();
                hashMap.put("value", str);
                hs.k kVar = hs.k.f19476a;
                a10.b(q10, hashMap);
            }
            a10.a().addOnCompleteListener(new i0(hVar));
            obj = hVar.b();
            if (obj == aVar) {
                return aVar;
            }
        }
        aVar2.f15182p0.i(Boolean.valueOf(((Boolean) obj).booleanValue()));
        return hs.k.f19476a;
    }
}
