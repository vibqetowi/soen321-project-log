package o3;

import hs.k;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.h0;
import ns.i;
import ss.p;
import u3.g;
/* compiled from: Amplitude.kt */
@ns.e(c = "com.amplitude.android.Amplitude$setSessionId$1", f = "Amplitude.kt", l = {131, 132}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class d extends i implements p<d0, ls.d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f27012u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ a f27013v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ long f27014w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, long j10, ls.d<? super d> dVar) {
        super(2, dVar);
        this.f27013v = aVar;
        this.f27014w = j10;
    }

    @Override // ns.a
    public final ls.d<k> create(Object obj, ls.d<?> dVar) {
        return new d(this.f27013v, this.f27014w, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
        return ((d) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f27012u;
        a aVar2 = this.f27013v;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 == 2) {
                    sp.b.d0(obj);
                    return k.f19476a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sp.b.d0(obj);
        } else {
            sp.b.d0(obj);
            h0<Boolean> e10 = aVar2.e();
            this.f27012u = 1;
            if (e10.e0(this) == aVar) {
                return aVar;
            }
        }
        g d10 = aVar2.d();
        g.a aVar3 = g.a.PREVIOUS_SESSION_ID;
        String valueOf = String.valueOf(this.f27014w);
        this.f27012u = 2;
        if (d10.b(aVar3, valueOf) == aVar) {
            return aVar;
        }
        return k.f19476a;
    }
}
