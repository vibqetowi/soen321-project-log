package u3;

import hs.k;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.h0;
import ns.i;
import ss.p;
/* compiled from: Amplitude.kt */
@ns.e(c = "com.amplitude.core.Amplitude$setUserId$1", f = "Amplitude.kt", l = {173}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class d extends i implements p<d0, ls.d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f33783u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ b f33784v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f33785w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, String str, ls.d<? super d> dVar) {
        super(2, dVar);
        this.f33784v = bVar;
        this.f33785w = str;
    }

    @Override // ns.a
    public final ls.d<k> create(Object obj, ls.d<?> dVar) {
        return new d(this.f33784v, this.f33785w, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
        return ((d) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f33783u;
        b bVar = this.f33784v;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            h0<Boolean> e10 = bVar.e();
            this.f33783u = 1;
            obj = e10.e0(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            a4.h hVar = bVar.c().f296a;
            a4.c c10 = hVar.c();
            String str = c10.f287a;
            hVar.a(new a4.c(this.f33785w, c10.f288b), a4.k.Updated);
        }
        return k.f19476a;
    }
}
