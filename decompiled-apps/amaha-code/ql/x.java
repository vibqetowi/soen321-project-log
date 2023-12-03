package ql;

import com.google.firebase.auth.FirebaseAuth;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import fm.j0;
import java.util.List;
/* compiled from: NewDynamicActivityViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dynamicActivities.utils.NewDynamicActivityViewModel$getPastLogsListForFirestoreGoals$1", f = "NewDynamicActivityViewModel.kt", l = {177}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class x extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f29843u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ t f29844v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(t tVar, ls.d<? super x> dVar) {
        super(2, dVar);
        this.f29844v = tVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new x(this.f29844v, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((x) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        String str;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f29843u;
        t tVar = this.f29844v;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            hs.j<String, String, String> jVar = tVar.O;
            String str2 = null;
            if (jVar != null) {
                str = jVar.f19473u;
            } else {
                str = null;
            }
            fd.f fVar = FirebaseAuth.getInstance().f;
            if (fVar != null) {
                str2 = fVar.j0();
            }
            if (str != null && str2 != null) {
                j0 f = t.f(tVar);
                this.f29843u = 1;
                obj = f.l(str, str2, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return hs.k.f19476a;
        }
        tVar.f29782f0.i(new SingleUseEvent<>((List) obj));
        return hs.k.f19476a;
    }
}
