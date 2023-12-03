package jp;

import android.content.Context;
import androidx.lifecycle.w;
import com.appsflyer.R;
import com.google.firebase.auth.FirebaseAuth;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.UtilsKt;
import g9.a;
import hs.k;
import kotlinx.coroutines.d0;
import ns.i;
import ss.p;
/* compiled from: SplashScreenViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.splash.viewModel.SplashScreenViewModel$initSplashScreen$2", f = "SplashScreenViewModel.kt", l = {R.styleable.AppCompatTheme_listPopupWindowStyle}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class f extends i implements p<d0, ls.d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f22562u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ d f22563v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, ls.d<? super f> dVar2) {
        super(2, dVar2);
        this.f22563v = dVar;
    }

    @Override // ns.a
    public final ls.d<k> create(Object obj, ls.d<?> dVar) {
        return new f(this.f22563v, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
        return ((f) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(1:(1:4)(2:23|24))(2:25|(2:27|(1:29)(4:30|(1:34)|35|(1:37)))(9:38|(1:42)|43|6|7|8|(2:10|(2:12|(1:16)))|18|19))|5|6|7|8|(0)|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x011a, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x011b, code lost:
        com.theinnerhour.b2b.utils.LogHelper.INSTANCE.e(r9.f22535b, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e4 A[Catch: Exception -> 0x011a, TryCatch #0 {Exception -> 0x011a, blocks: (B:31:0x00d9, B:33:0x00e4, B:35:0x00f2, B:40:0x0103), top: B:46:0x00d9 }] */
    @Override // ns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String j02;
        String j03;
        String str;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f22562u;
        d dVar = this.f22563v;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            ApplicationPersistence.getInstance().setBooleanValue(Constants.APP_RESTART_ACKNOWLEDGE_PURCHASE, true);
            String str2 = "";
            if (FirebasePersistence.getInstance().getUserWithoutPreference() == null) {
                if (FirebaseAuth.getInstance().f == null) {
                    dVar.A = true;
                    dVar.B = true;
                    dVar.e();
                } else {
                    fk.g gVar = new fk.g();
                    fd.f fVar = FirebaseAuth.getInstance().f;
                    if (fVar != null && (j03 = fVar.j0()) != null) {
                        str2 = j03;
                    }
                    Context applicationContext = dVar.f2382x.getApplicationContext();
                    kotlin.jvm.internal.i.f(applicationContext, "getApplication<Application>().applicationContext");
                    UtilsKt.logError$default(gVar.f15128a, null, new fk.e(applicationContext, str2), 2, null);
                    FirebasePersistence.getInstance().setFirebaseInitialiseListener(dVar);
                    SubscriptionPersistence.INSTANCE.fetchData(dVar.O);
                    this.f22562u = 1;
                    if (dVar.f22547z.d(this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                fk.g gVar2 = new fk.g();
                fd.f fVar2 = FirebaseAuth.getInstance().f;
                if (fVar2 != null && (j02 = fVar2.j0()) != null) {
                    str2 = j02;
                }
                Context applicationContext2 = dVar.f2382x.getApplicationContext();
                kotlin.jvm.internal.i.f(applicationContext2, "getApplication<Application>().applicationContext");
                UtilsKt.logError$default(gVar2.f15128a, null, new fk.e(applicationContext2, str2), 2, null);
                w<Boolean> wVar = dVar.K;
                Boolean bool = Boolean.TRUE;
                wVar.i(bool);
                dVar.A = true;
                dVar.e();
                SubscriptionPersistence.INSTANCE.fetchData(dVar.O);
                dVar.J.i(bool);
                a aVar2 = dVar.f22547z;
                aVar2.getClass();
                if (!ApplicationPersistence.getInstance().getBooleanValue(Constants.GAID_SENT_TO_MIXPANEL, false)) {
                    s9.e eVar = s9.e.f31337d;
                    MyApplication.a aVar3 = MyApplication.V;
                    if (eVar.c(aVar3.a()) == 0) {
                        a.C0248a a10 = g9.a.a(aVar3.a());
                        if (!a10.f16387b && (str = a10.f16386a) != null) {
                            ApplicationPersistence.getInstance().setBooleanValue(Constants.GAID_SENT_TO_MIXPANEL, true);
                            aVar3.a().d().f.f(str, "GAID");
                        }
                    }
                }
                return k.f19476a;
            }
        }
        w<Boolean> wVar2 = dVar.K;
        Boolean bool2 = Boolean.TRUE;
        wVar2.i(bool2);
        dVar.J.i(bool2);
        a aVar22 = dVar.f22547z;
        aVar22.getClass();
        if (!ApplicationPersistence.getInstance().getBooleanValue(Constants.GAID_SENT_TO_MIXPANEL, false)) {
        }
        return k.f19476a;
    }
}
