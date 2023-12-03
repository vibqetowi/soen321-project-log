package qr;

import android.net.Uri;
import androidx.lifecycle.w;
import com.appsflyer.R;
import com.theinnerhour.b2b.network.model.DeeplinkCodeResponse;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import hs.f;
import hs.k;
import kotlinx.coroutines.d0;
import ls.d;
import ns.e;
import ns.i;
import ss.p;
/* compiled from: DeeplinkCodeActivationViewModel.kt */
@e(c = "com.theinnerhour.b2b.viewmodel.DeeplinkCodeActivationViewModel$applyDeeplinkCouponCode$1", f = "DeeplinkCodeActivationViewModel.kt", l = {29, R.styleable.AppCompatTheme_actionOverflowMenuStyle}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class a extends i implements p<d0, d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public w f30096u;

    /* renamed from: v  reason: collision with root package name */
    public int f30097v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Uri f30098w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ b f30099x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ String f30100y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Uri uri, b bVar, String str, d<? super a> dVar) {
        super(2, dVar);
        this.f30098w = uri;
        this.f30099x = bVar;
        this.f30100y = str;
    }

    @Override // ns.a
    public final d<k> create(Object obj, d<?> dVar) {
        return new a(this.f30098w, this.f30099x, this.f30100y, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, d<? super k> dVar) {
        return ((a) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        w<SingleUseEvent<f<DeeplinkCodeResponse, Uri>>> wVar;
        w<SingleUseEvent<DeeplinkCodeResponse>> wVar2;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f30097v;
        Uri uri = this.f30098w;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 == 2) {
                    wVar = this.f30096u;
                    sp.b.d0(obj);
                    wVar.i(new SingleUseEvent<>(new f(obj, uri)));
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                wVar2 = this.f30096u;
                sp.b.d0(obj);
                wVar2.i(new SingleUseEvent<>(obj));
            }
        } else {
            sp.b.d0(obj);
            String str = this.f30100y;
            b bVar = this.f30099x;
            if (uri == null) {
                w<SingleUseEvent<DeeplinkCodeResponse>> wVar3 = bVar.f30102y;
                this.f30096u = wVar3;
                this.f30097v = 1;
                obj = bVar.f30101x.a(str, this);
                if (obj == aVar) {
                    return aVar;
                }
                wVar2 = wVar3;
                wVar2.i(new SingleUseEvent<>(obj));
            } else {
                w<SingleUseEvent<f<DeeplinkCodeResponse, Uri>>> wVar4 = bVar.f30103z;
                this.f30096u = wVar4;
                this.f30097v = 2;
                obj = bVar.f30101x.a(str, this);
                if (obj == aVar) {
                    return aVar;
                }
                wVar = wVar4;
                wVar.i(new SingleUseEvent<>(new f(obj, uri)));
            }
        }
        return k.f19476a;
    }
}
