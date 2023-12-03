package ql;

import android.content.Intent;
import android.os.Bundle;
import com.appsflyer.R;
import com.theinnerhour.b2b.utils.Constants;
/* compiled from: AudioViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dynamicActivities.utils.AudioViewModel$sendMusicData$1", f = "AudioViewModel.kt", l = {R.styleable.AppCompatTheme_toolbarStyle}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class k extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f29743u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ i f29744v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ o f29745w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Bundle f29746x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i iVar, o oVar, Bundle bundle, ls.d<? super k> dVar) {
        super(2, dVar);
        this.f29744v = iVar;
        this.f29745w = oVar;
        this.f29746x = bundle;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new k(this.f29744v, this.f29745w, this.f29746x, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((k) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f29743u;
        i iVar = this.f29744v;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            if (iVar.I.f29773h != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                this.f29743u = 1;
                if (ca.a.P(200L, this) == aVar) {
                    return aVar;
                }
            }
        }
        Intent intent = new Intent(Constants.MEDIA_DATA_RECEIVER);
        intent.putExtra(Constants.MEDIA_RECEIVER_EXTRA, this.f29745w);
        intent.putExtra(Constants.MEDIA_ANALYTICS_RECEIVER_EXTRA, this.f29746x);
        iVar.f29728y.sendBroadcast(intent);
        return hs.k.f19476a;
    }
}
