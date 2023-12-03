package g6;

import w5.d;
/* compiled from: LoginFragment.kt */
/* loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.k implements ss.l<androidx.activity.result.a, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ r f16319u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.p f16320v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, androidx.fragment.app.p pVar) {
        super(1);
        this.f16319u = rVar;
        this.f16320v = pVar;
    }

    @Override // ss.l
    public final hs.k invoke(androidx.activity.result.a aVar) {
        androidx.activity.result.a result = aVar;
        kotlin.jvm.internal.i.g(result, "result");
        int i6 = result.f976u;
        if (i6 == -1) {
            this.f16319u.F().i(d.c.Login.d(), i6, result.f977v);
        } else {
            this.f16320v.finish();
        }
        return hs.k.f19476a;
    }
}
