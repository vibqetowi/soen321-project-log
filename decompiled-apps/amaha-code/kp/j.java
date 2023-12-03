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
/* compiled from: CancelledMessagingFragment2.kt */
@ns.e(c = "com.theinnerhour.b2b.components.subscriptionMessaging.fragments.CancelledMessagingFragment2$sendAppFeedback$2", f = "CancelledMessagingFragment2.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class j extends ns.i implements p<d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ i f23759u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f23760v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ p<Boolean, JSONObject, Object> f23761w;

    /* compiled from: CancelledMessagingFragment2.kt */
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
    public j(i iVar, String str, p<? super Boolean, ? super JSONObject, ? extends Object> pVar, ls.d<? super j> dVar) {
        super(2, dVar);
        this.f23759u = iVar;
        this.f23760v = str;
        this.f23761w = pVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new j(this.f23759u, this.f23760v, this.f23761w, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((j) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        p<Boolean, JSONObject, Object> pVar = this.f23761w;
        i iVar = this.f23759u;
        sp.b.d0(obj);
        try {
            PackageInfo packageInfo = iVar.requireActivity().getPackageManager().getPackageInfo(iVar.requireActivity().getPackageName(), 0);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("feedbackDetails", "feedback: " + this.f23760v);
            jSONObject.put("userName", SessionManager.getInstance().getStringValue(SessionManager.KEY_UID));
            jSONObject.put("versionName", packageInfo.versionName);
            jSONObject.put("versionCode", String.valueOf(h0.a.a(packageInfo)));
            jSONObject.put("device", Build.DEVICE);
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("product", Build.PRODUCT);
            a aVar = new a(jSONObject, new qk.a(pVar, 3, iVar), new dd.a(pVar, 2, iVar));
            aVar.setRetryPolicy(new e4.d(0, 1));
            VolleySingleton.getInstance().add(aVar);
        } catch (Exception e10) {
            pVar.invoke(Boolean.FALSE, null);
            LogHelper.INSTANCE.e(iVar.f23751u, "error in send", e10);
        }
        return hs.k.f19476a;
    }
}
