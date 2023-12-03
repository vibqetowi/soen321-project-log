package kp;

import android.content.pm.PackageInfo;
import android.os.Build;
import com.theinnerhour.b2b.model.VolleySingleton;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SessionManager;
import java.util.HashMap;
import java.util.Map;
import kotlinx.coroutines.d0;
import org.json.JSONObject;
import ss.p;
/* compiled from: AccountHoldMessagingFragment2.kt */
@ns.e(c = "com.theinnerhour.b2b.components.subscriptionMessaging.fragments.AccountHoldMessagingFragment2$sendAppFeedback$2", f = "AccountHoldMessagingFragment2.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class d extends ns.i implements p<d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ c f23734u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f23735v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ p<Boolean, JSONObject, Object> f23736w;

    /* compiled from: AccountHoldMessagingFragment2.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.android.volley.toolbox.h {
        public a(JSONObject jSONObject, qk.a aVar, dd.a aVar2) {
            super(1, "https://us-central1-gcpinnerhour.cloudfunctions.net/appFeedback", jSONObject, aVar, aVar2);
        }

        @Override // e4.j
        public final Map<String, String> getHeaders() {
            HashMap hashMap = new HashMap();
            hashMap.put("Content-Type", "application/json");
            return hashMap;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(c cVar, String str, p<? super Boolean, ? super JSONObject, ? extends Object> pVar, ls.d<? super d> dVar) {
        super(2, dVar);
        this.f23734u = cVar;
        this.f23735v = str;
        this.f23736w = pVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new d(this.f23734u, this.f23735v, this.f23736w, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((d) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        p<Boolean, JSONObject, Object> pVar = this.f23736w;
        c cVar = this.f23734u;
        sp.b.d0(obj);
        try {
            PackageInfo packageInfo = cVar.requireActivity().getPackageManager().getPackageInfo(cVar.requireActivity().getPackageName(), 0);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("feedbackDetails", "feedback: " + this.f23735v);
            jSONObject.put("userName", SessionManager.getInstance().getStringValue(SessionManager.KEY_UID));
            jSONObject.put("versionName", packageInfo.versionName);
            jSONObject.put("versionCode", String.valueOf(h0.a.a(packageInfo)));
            jSONObject.put("device", Build.DEVICE);
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("product", Build.PRODUCT);
            a aVar = new a(jSONObject, new qk.a(pVar, 2, cVar), new dd.a(pVar, 1, cVar));
            aVar.setRetryPolicy(new e4.d(0, 1));
            VolleySingleton.getInstance().add(aVar);
        } catch (Exception e10) {
            pVar.invoke(Boolean.FALSE, null);
            LogHelper.INSTANCE.e(cVar.f23726u, "error in send", e10);
        }
        return hs.k.f19476a;
    }
}
