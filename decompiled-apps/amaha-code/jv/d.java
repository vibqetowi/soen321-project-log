package jv;

import com.appsflyer.R;
/* compiled from: ChannelFlow.kt */
@ns.e(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", l = {R.styleable.AppCompatTheme_controlBackground}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class d extends ns.i implements ss.p<iv.q<Object>, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f22643u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f22644v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ e<Object> f22645w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e<Object> eVar, ls.d<? super d> dVar) {
        super(2, dVar);
        this.f22645w = eVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        d dVar2 = new d(this.f22645w, dVar);
        dVar2.f22644v = obj;
        return dVar2;
    }

    @Override // ss.p
    public final Object invoke(iv.q<Object> qVar, ls.d<? super hs.k> dVar) {
        return ((d) create(qVar, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f22643u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            this.f22643u = 1;
            if (this.f22645w.c((iv.q) this.f22644v, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
