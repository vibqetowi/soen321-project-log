package w3;

import kotlinx.coroutines.d0;
import ss.p;
/* compiled from: EventPipeline.kt */
@ns.e(c = "com.amplitude.core.platform.EventPipeline$schedule$1", f = "EventPipeline.kt", l = {150}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class c extends ns.i implements p<d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f36360u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f36361v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ f f36362w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, ls.d<? super c> dVar) {
        super(2, dVar);
        this.f36362w = fVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        c cVar = new c(this.f36362w, dVar);
        cVar.f36361v = obj;
        return cVar;
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((c) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0046 -> B:18:0x0049). Please submit an issue!!! */
    @Override // ns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        d0 d0Var;
        c cVar;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f36360u;
        if (i6 != 0) {
            if (i6 == 1) {
                d0Var = (d0) this.f36361v;
                sp.b.d0(obj);
                cVar = this;
                f fVar = cVar.f36362w;
                fVar.getClass();
                fVar.f36376b.q(new k(2, null));
                fVar.f36380g = false;
                if (kotlin.jvm.internal.h.E(d0Var)) {
                    f fVar2 = cVar.f36362w;
                    if (fVar2.f && !fVar2.f36380g) {
                        fVar2.f36380g = true;
                        cVar.f36361v = d0Var;
                        cVar.f36360u = 1;
                        if (ca.a.P(fVar2.f36375a.f33766a.b(), cVar) == aVar) {
                            return aVar;
                        }
                        f fVar3 = cVar.f36362w;
                        fVar3.getClass();
                        fVar3.f36376b.q(new k(2, null));
                        fVar3.f36380g = false;
                        if (kotlin.jvm.internal.h.E(d0Var)) {
                        }
                    }
                }
                return hs.k.f19476a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        sp.b.d0(obj);
        d0Var = (d0) this.f36361v;
        cVar = this;
        if (kotlin.jvm.internal.h.E(d0Var)) {
        }
        return hs.k.f19476a;
    }
}
