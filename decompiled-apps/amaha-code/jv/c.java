package jv;

import com.appsflyer.R;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.y;
import ta.v;
/* compiled from: ChannelFlow.kt */
@ns.e(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", l = {R.styleable.AppCompatTheme_windowFixedWidthMinor}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f22639u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f22640v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.e<Object> f22641w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ e<Object> f22642x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ls.d dVar, kotlinx.coroutines.flow.e eVar, e eVar2) {
        super(2, dVar);
        this.f22641w = eVar;
        this.f22642x = eVar2;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        c cVar = new c(dVar, this.f22641w, this.f22642x);
        cVar.f22640v = obj;
        return cVar;
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((c) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f22639u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            d0 d0Var = (d0) this.f22640v;
            e<Object> eVar = this.f22642x;
            int i10 = eVar.f22647v;
            if (i10 == -3) {
                i10 = -2;
            }
            ss.p dVar = new d(eVar, null);
            iv.p pVar = new iv.p(y.b(d0Var, eVar.f22646u), v.c(i10, eVar.f22648w, 4));
            pVar.s0(3, pVar, dVar);
            this.f22639u = 1;
            Object t3 = kotlin.jvm.internal.h.t(this.f22641w, pVar, true, this);
            if (t3 != obj2) {
                t3 = hs.k.f19476a;
            }
            if (t3 == obj2) {
                return obj2;
            }
        }
        return hs.k.f19476a;
    }
}
