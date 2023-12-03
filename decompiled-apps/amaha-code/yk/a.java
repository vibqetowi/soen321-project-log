package yk;

import android.content.Context;
import androidx.lifecycle.w;
import com.appsflyer.R;
import com.theinnerhour.b2b.MyApplication;
import gv.n;
import hs.k;
import kotlinx.coroutines.d0;
import ls.h;
import ns.i;
import ss.p;
/* compiled from: CommunitiesPwaViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.community.viewmodels.CommunitiesPwaViewModel$getCommunitiesAccessToken$1", f = "CommunitiesPwaViewModel.kt", l = {R.styleable.AppCompatTheme_alertDialogTheme}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class a extends i implements p<d0, ls.d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public w f38659u;

    /* renamed from: v  reason: collision with root package name */
    public int f38660v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ b f38661w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f38662x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, String str, ls.d<? super a> dVar) {
        super(2, dVar);
        this.f38661w = bVar;
        this.f38662x = str;
    }

    @Override // ns.a
    public final ls.d<k> create(Object obj, ls.d<?> dVar) {
        return new a(this.f38661w, this.f38662x, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
        return ((a) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.w] */
    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        MyApplication myApplication;
        String str;
        boolean z10;
        MyApplication myApplication2;
        w<String> wVar;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f38660v;
        if (i6 != 0) {
            if (i6 == 1) {
                wVar = this.f38659u;
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            b bVar = this.f38661w;
            Context applicationContext = bVar.f2382x.getApplicationContext();
            String str2 = null;
            if (applicationContext instanceof MyApplication) {
                myApplication = (MyApplication) applicationContext;
            } else {
                myApplication = null;
            }
            if (myApplication != null) {
                str = myApplication.O;
            } else {
                str = null;
            }
            if (str != null && !n.B0(str)) {
                z10 = false;
            } else {
                z10 = true;
            }
            w<String> wVar2 = bVar.f38664z;
            if (z10) {
                this.f38659u = wVar2;
                this.f38660v = 1;
                wk.b bVar2 = bVar.C;
                bVar2.getClass();
                h hVar = new h(ca.a.G0(this));
                ((or.i) nr.b.a(or.i.class)).d(this.f38662x).I(new wk.a(bVar2, hVar));
                obj = hVar.b();
                if (obj == aVar) {
                    return aVar;
                }
                wVar = wVar2;
            } else {
                Context applicationContext2 = bVar.f2382x.getApplicationContext();
                if (applicationContext2 instanceof MyApplication) {
                    myApplication2 = (MyApplication) applicationContext2;
                } else {
                    myApplication2 = null;
                }
                if (myApplication2 != null) {
                    str2 = myApplication2.O;
                }
                wVar2.i(str2);
                return k.f19476a;
            }
        }
        wVar.i(obj);
        return k.f19476a;
    }
}
