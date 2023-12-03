package qn;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.os.Build;
import androidx.lifecycle.w;
import com.theinnerhour.b2b.components.monetization.viewModel.MonetizationViewModel;
import com.theinnerhour.b2b.utils.SessionManager;
import java.util.regex.Pattern;
import kotlinx.coroutines.d0;
import lv.c0;
import lv.v;
import org.json.JSONObject;
/* compiled from: MonetizationViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.monetization.viewModel.MonetizationViewModel$sendPaymentFailureFeedback$1", f = "MonetizationViewModel.kt", l = {361}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class p extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f29972u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ MonetizationViewModel f29973v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f29974w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(MonetizationViewModel monetizationViewModel, String str, ls.d<? super p> dVar) {
        super(2, dVar);
        this.f29973v = monetizationViewModel;
        this.f29974w = str;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new p(this.f29973v, this.f29974w, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((p) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f29972u;
        MonetizationViewModel monetizationViewModel = this.f29973v;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            monetizationViewModel.k().i(Boolean.TRUE);
            Application application = monetizationViewModel.f2382x;
            PackageInfo packageInfo = application.getApplicationContext().getPackageManager().getPackageInfo(application.getApplicationContext().getPackageName(), 0);
            kotlin.jvm.internal.i.f(packageInfo, "getApplication<Applicati…onContext.packageName, 0)");
            this.f29972u = 1;
            c cVar = monetizationViewModel.f11455z;
            cVar.getClass();
            ls.h hVar = new ls.h(ca.a.G0(this));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("purchaseToken", this.f29974w);
            jSONObject.put("userName", SessionManager.getInstance().getStringValue(SessionManager.KEY_UID));
            jSONObject.put("versionName", packageInfo.versionName);
            jSONObject.put("versionCode", String.valueOf(h0.a.a(packageInfo)));
            jSONObject.put("device", Build.DEVICE);
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("product", Build.PRODUCT);
            String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.i.f(jSONObject2, "req.toString()");
            Pattern pattern = v.f24702d;
            ((or.e) nr.b.a(or.e.class)).c("https://api.theinnerhour.com/v1/failedpayment", c0.a.a(jSONObject2, v.a.b("application/json; charset=utf-8"))).I(new f(cVar, hVar));
            obj = hVar.b();
            if (obj == aVar) {
                return aVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            monetizationViewModel.l().i("Email sent");
            ((w) monetizationViewModel.V.getValue()).i(Boolean.TRUE);
        }
        monetizationViewModel.k().i(Boolean.FALSE);
        return hs.k.f19476a;
    }
}
