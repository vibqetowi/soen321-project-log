package wn;

import com.google.firebase.auth.FirebaseAuth;
import com.theinnerhour.b2b.utils.LogHelper;
import kotlinx.coroutines.d0;
/* compiled from: MultiTrackerInsightsViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.multiTracker.utils.MultiTrackerInsightsViewModel$startFetch$1", f = "MultiTrackerInsightsViewModel.kt", l = {36, 36}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class h extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f36792u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ i f36793v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, ls.d<? super h> dVar) {
        super(2, dVar);
        this.f36793v = iVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new h(this.f36793v, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((h) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        String str;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f36792u;
        i iVar = this.f36793v;
        try {
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(iVar.f36794x, e10);
        }
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 == 2) {
                    sp.b.d0(obj);
                    return hs.k.f19476a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sp.b.d0(obj);
        } else {
            sp.b.d0(obj);
            fd.f fVar = FirebaseAuth.getInstance().f;
            if (fVar != null) {
                str = fVar.j0();
            } else {
                str = null;
            }
            kotlin.jvm.internal.i.d(str);
            this.f36792u = 1;
            iVar.getClass();
            obj = new kotlinx.coroutines.flow.r(new e(iVar, str, null));
            if (obj == aVar) {
                return aVar;
            }
        }
        this.f36792u = 2;
        Object a10 = ((kotlinx.coroutines.flow.d) obj).a(jv.k.f22675u, this);
        if (a10 != aVar) {
            a10 = hs.k.f19476a;
        }
        if (a10 == aVar) {
            return aVar;
        }
        return hs.k.f19476a;
    }
}
