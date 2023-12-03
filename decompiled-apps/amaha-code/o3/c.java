package o3;

import androidx.appcompat.widget.l;
import com.appsflyer.R;
import hs.k;
import java.util.Map;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.h0;
import ns.i;
import ss.p;
import u3.g;
import w3.h;
import w3.j;
/* compiled from: Amplitude.kt */
@ns.e(c = "com.amplitude.android.Amplitude$onExitForeground$1", f = "Amplitude.kt", l = {R.styleable.AppCompatTheme_panelMenuListWidth, R.styleable.AppCompatTheme_ratingBarStyleIndicator, R.styleable.AppCompatTheme_ratingBarStyleSmall}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class c extends i implements p<d0, ls.d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f27010u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ a f27011v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, ls.d<? super c> dVar) {
        super(2, dVar);
        this.f27011v = aVar;
    }

    @Override // ns.a
    public final ls.d<k> create(Object obj, ls.d<?> dVar) {
        return new c(this.f27011v, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
        return ((c) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c2 A[RETURN] */
    @Override // ns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        g d10;
        g.a aVar;
        String valueOf;
        ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f27010u;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 == 3) {
                        sp.b.d0(obj);
                        return k.f19476a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sp.b.d0(obj);
                d10 = this.f27011v.d();
                aVar = g.a.LAST_EVENT_TIME;
                valueOf = String.valueOf(this.f27011v.f27000p);
                this.f27010u = 3;
                if (d10.b(aVar, valueOf) == aVar2) {
                    return aVar2;
                }
                return k.f19476a;
            }
            sp.b.d0(obj);
        } else {
            sp.b.d0(obj);
            h0<Boolean> e10 = this.f27011v.e();
            this.f27010u = 1;
            if (e10.e0(this) == aVar2) {
                return aVar2;
            }
        }
        a aVar3 = this.f27011v;
        aVar3.f26997m = false;
        if (((e) aVar3.f33766a).f27034x) {
            l lVar = aVar3.f33772h;
            u3.a closure = u3.a.f33765u;
            lVar.getClass();
            kotlin.jvm.internal.i.g(closure, "closure");
            for (Map.Entry entry : ((Map) lVar.f1471v).entrySet()) {
                h hVar = (h) entry.getValue();
                hVar.getClass();
                synchronized (hVar.f36382a) {
                    for (j jVar : hVar.f36382a) {
                        closure.invoke(jVar);
                    }
                    k kVar = k.f19476a;
                }
            }
        }
        g d11 = this.f27011v.d();
        g.a aVar4 = g.a.PREVIOUS_SESSION_ID;
        String valueOf2 = String.valueOf(this.f27011v.f26998n);
        this.f27010u = 2;
        if (d11.b(aVar4, valueOf2) == aVar2) {
            return aVar2;
        }
        d10 = this.f27011v.d();
        aVar = g.a.LAST_EVENT_TIME;
        valueOf = String.valueOf(this.f27011v.f27000p);
        this.f27010u = 3;
        if (d10.b(aVar, valueOf) == aVar2) {
        }
        return k.f19476a;
    }
}
