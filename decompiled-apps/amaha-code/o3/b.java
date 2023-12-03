package o3;

import com.appsflyer.R;
import hs.k;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.h0;
import ns.i;
import ss.p;
/* compiled from: Amplitude.kt */
@ns.e(c = "com.amplitude.android.Amplitude$onEnterForeground$1", f = "Amplitude.kt", l = {R.styleable.AppCompatTheme_listPreferredItemHeightLarge}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class b extends i implements p<d0, ls.d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f27007u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ a f27008v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ long f27009w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, long j10, ls.d<? super b> dVar) {
        super(2, dVar);
        this.f27008v = aVar;
        this.f27009w = j10;
    }

    @Override // ns.a
    public final ls.d<k> create(Object obj, ls.d<?> dVar) {
        return new b(this.f27008v, this.f27009w, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
        return ((b) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f27007u;
        a aVar2 = this.f27008v;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            h0<Boolean> e10 = aVar2.e();
            this.f27007u = 1;
            if (e10.e0(this) == aVar) {
                return aVar;
            }
        }
        aVar2.k(this.f27009w);
        aVar2.f26997m = true;
        return k.f19476a;
    }
}
