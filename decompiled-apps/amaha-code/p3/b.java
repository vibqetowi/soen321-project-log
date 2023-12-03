package p3;

import hs.k;
import kotlinx.coroutines.d0;
import ls.d;
import ns.e;
import ns.i;
import ss.p;
import u3.g;
/* compiled from: AndroidContextPlugin.kt */
@e(c = "com.amplitude.android.plugins.AndroidContextPlugin$applyContextData$7$1", f = "AndroidContextPlugin.kt", l = {90}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class b extends i implements p<d0, d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f27877u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ a f27878v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ long f27879w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, long j10, d<? super b> dVar) {
        super(2, dVar);
        this.f27878v = aVar;
        this.f27879w = j10;
    }

    @Override // ns.a
    public final d<k> create(Object obj, d<?> dVar) {
        return new b(this.f27878v, this.f27879w, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, d<? super k> dVar) {
        return ((b) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f27877u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            g d10 = this.f27878v.i().d();
            g.a aVar2 = g.a.LAST_EVENT_ID;
            String valueOf = String.valueOf(this.f27879w);
            this.f27877u = 1;
            if (d10.b(aVar2, valueOf) == aVar) {
                return aVar;
            }
        }
        return k.f19476a;
    }
}
