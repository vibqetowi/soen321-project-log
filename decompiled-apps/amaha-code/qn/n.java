package qn;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.os.Build;
import com.theinnerhour.b2b.components.monetization.viewModel.MonetizationViewModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.SessionManager;
import java.util.regex.Pattern;
import kotlinx.coroutines.d0;
import lv.c0;
import lv.v;
import org.json.JSONObject;
/* compiled from: MonetizationViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.monetization.viewModel.MonetizationViewModel$sendAppFeedback$1", f = "MonetizationViewModel.kt", l = {349}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class n extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f29965u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ MonetizationViewModel f29966v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f29967w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(MonetizationViewModel monetizationViewModel, String str, ls.d<? super n> dVar) {
        super(2, dVar);
        this.f29966v = monetizationViewModel;
        this.f29967w = str;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new n(this.f29966v, this.f29967w, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((n) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f29965u;
        MonetizationViewModel monetizationViewModel = this.f29966v;
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
            this.f29965u = 1;
            c cVar = monetizationViewModel.f11455z;
            cVar.getClass();
            ls.h hVar = new ls.h(ca.a.G0(this));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("feedbackDetails", "feedback: " + this.f29967w + " \n rating: " + FirebasePersistence.getInstance().getUser().getAppFeedback().getTopMenuFeedback());
            jSONObject.put("userName", SessionManager.getInstance().getStringValue(SessionManager.KEY_UID));
            jSONObject.put("versionName", packageInfo.versionName);
            jSONObject.put("versionCode", String.valueOf(h0.a.a(packageInfo)));
            jSONObject.put("device", Build.DEVICE);
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("product", Build.PRODUCT);
            String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.i.f(jSONObject2, "req.toString()");
            Pattern pattern = v.f24702d;
            ((or.b) nr.b.a(or.b.class)).a("https://us-central1-gcpinnerhour.cloudfunctions.net/appFeedback", c0.a.a(jSONObject2, v.a.b("application/json; charset=utf-8"))).I(new d(cVar, hVar));
            obj = hVar.b();
            if (obj == aVar) {
                return aVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            monetizationViewModel.l().i("Thank you for your feedback");
        }
        monetizationViewModel.k().i(Boolean.FALSE);
        return hs.k.f19476a;
    }
}
