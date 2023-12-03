package gk;

import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.components.analytics.otherAnalytics.model.AnalyticsAsyncModel;
import com.theinnerhour.b2b.model.FirebaseCustomEvent;
import com.theinnerhour.b2b.utils.LogHelper;
import fd.f;
import gk.a;
import hs.k;
import java.util.Calendar;
import java.util.HashMap;
import kotlinx.coroutines.d0;
import ns.i;
import ss.p;
/* compiled from: CustomAnalytics.kt */
@ns.e(c = "com.theinnerhour.b2b.components.analytics.otherAnalytics.utils.CustomAnalytics$logNotificationEvent$1", f = "CustomAnalytics.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class d extends i implements p<d0, ls.d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ String f16582u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Bundle f16583v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Bundle bundle, String str, ls.d dVar) {
        super(2, dVar);
        this.f16582u = str;
        this.f16583v = bundle;
    }

    @Override // ns.a
    public final ls.d<k> create(Object obj, ls.d<?> dVar) {
        return new d(this.f16583v, this.f16582u, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
        return ((d) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        sp.b.d0(obj);
        String str = a.f16573a;
        AnalyticsAsyncModel analyticsAsyncModel = new AnalyticsAsyncModel(this.f16582u, this.f16583v, false);
        try {
            if (!analyticsAsyncModel.getOnCustomAnalytics()) {
                a.c(analyticsAsyncModel.getBundle(), analyticsAsyncModel.getEvent());
                a.a(analyticsAsyncModel.getBundle(), analyticsAsyncModel.getEvent());
            }
            FirebaseCustomEvent firebaseCustomEvent = new FirebaseCustomEvent();
            firebaseCustomEvent.setEvent(analyticsAsyncModel.getEvent());
            firebaseCustomEvent.setTimestamp(Calendar.getInstance().getTimeInMillis() + "");
            if (analyticsAsyncModel.getBundle() != null) {
                Bundle bundle = analyticsAsyncModel.getBundle();
                kotlin.jvm.internal.i.d(bundle);
                for (String str2 : bundle.keySet()) {
                    Bundle bundle2 = analyticsAsyncModel.getBundle();
                    kotlin.jvm.internal.i.d(bundle2);
                    if (bundle2.get(str2) != null) {
                        HashMap<String, String> params = firebaseCustomEvent.getParams();
                        kotlin.jvm.internal.i.f(params, "customEvent.params");
                        Bundle bundle3 = analyticsAsyncModel.getBundle();
                        kotlin.jvm.internal.i.d(bundle3);
                        params.put(str2, String.valueOf(bundle3.get(str2)));
                    }
                }
            }
            HashMap<String, String> params2 = firebaseCustomEvent.getParams();
            kotlin.jvm.internal.i.f(params2, "customEvent.params");
            params2.put("version_release", Build.VERSION.RELEASE);
            HashMap<String, String> params3 = firebaseCustomEvent.getParams();
            kotlin.jvm.internal.i.f(params3, "customEvent.params");
            params3.put("version_incremental", Build.VERSION.INCREMENTAL);
            HashMap<String, String> params4 = firebaseCustomEvent.getParams();
            kotlin.jvm.internal.i.f(params4, "customEvent.params");
            params4.put("version_sdk_int", Build.VERSION.SDK_INT + "");
            HashMap<String, String> params5 = firebaseCustomEvent.getParams();
            kotlin.jvm.internal.i.f(params5, "customEvent.params");
            params5.put("brand", Build.BRAND);
            HashMap<String, String> params6 = firebaseCustomEvent.getParams();
            kotlin.jvm.internal.i.f(params6, "customEvent.params");
            params6.put("device", Build.DEVICE);
            HashMap<String, String> params7 = firebaseCustomEvent.getParams();
            kotlin.jvm.internal.i.f(params7, "customEvent.params");
            params7.put("manufacturer", Build.MANUFACTURER);
            HashMap<String, String> params8 = firebaseCustomEvent.getParams();
            kotlin.jvm.internal.i.f(params8, "customEvent.params");
            params8.put("model", Build.MODEL);
            HashMap<String, String> params9 = firebaseCustomEvent.getParams();
            kotlin.jvm.internal.i.f(params9, "customEvent.params");
            params9.put("android_id", Settings.Secure.getString(MyApplication.V.a().getContentResolver(), "android_id"));
            HashMap<String, String> params10 = firebaseCustomEvent.getParams();
            kotlin.jvm.internal.i.f(params10, "customEvent.params");
            params10.put("source", "android");
            HashMap<String, String> params11 = firebaseCustomEvent.getParams();
            kotlin.jvm.internal.i.f(params11, "customEvent.params");
            params11.put("app_version_name", a.f16575c);
            HashMap<String, String> params12 = firebaseCustomEvent.getParams();
            kotlin.jvm.internal.i.f(params12, "customEvent.params");
            params12.put("app_version_code", a.f16576d);
            f fVar = FirebaseAuth.getInstance().f;
            if (fVar != null) {
                HashMap<String, String> user = firebaseCustomEvent.getUser();
                kotlin.jvm.internal.i.f(user, "customEvent.user");
                user.put("firebase_uid", fVar.j0());
            }
            DatabaseReference databaseReference = a.f16574b;
            kotlin.jvm.internal.i.d(databaseReference);
            DatabaseReference databaseReference2 = a.f16574b;
            kotlin.jvm.internal.i.d(databaseReference2);
            String key = databaseReference2.push().getKey();
            kotlin.jvm.internal.i.d(key);
            databaseReference.child(key).setValue(firebaseCustomEvent);
            a.InterfaceC0251a interfaceC0251a = a.f16577e;
            kotlin.jvm.internal.i.d(interfaceC0251a);
            interfaceC0251a.dataLogged();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(a.f16573a, "exception in logEvent", e10);
        }
        return k.f19476a;
    }
}
