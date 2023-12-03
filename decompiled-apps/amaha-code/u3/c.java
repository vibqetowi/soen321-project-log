package u3;

import hs.k;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.h0;
import ns.i;
import ss.p;
/* compiled from: Amplitude.kt */
@ns.e(c = "com.amplitude.core.Amplitude$setDeviceId$1", f = "Amplitude.kt", l = {188}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class c extends i implements p<d0, ls.d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f33780u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ b f33781v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f33782w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, String str, ls.d<? super c> dVar) {
        super(2, dVar);
        this.f33781v = bVar;
        this.f33782w = str;
    }

    @Override // ns.a
    public final ls.d<k> create(Object obj, ls.d<?> dVar) {
        return new c(this.f33781v, this.f33782w, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
        return ((c) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f33780u;
        b bVar = this.f33781v;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            h0<Boolean> e10 = bVar.e();
            this.f33780u = 1;
            if (e10.e0(this) == aVar) {
                return aVar;
            }
        }
        a4.h hVar = bVar.c().f296a;
        hVar.a(new a4.c(hVar.c().f287a, this.f33782w), a4.k.Updated);
        return k.f19476a;
    }
}
